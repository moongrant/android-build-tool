from __future__ import annotations

import concurrent.futures
import json
import math
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from urllib.parse import quote, urlparse

import requests

OUT = Path("pro-yalla-file-cdn-inventory")
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 Chrome/127 Safari/537.36",
    "Accept": "application/json,text/plain,*/*",
})

PREFIXES = [
    "file.yalla.live/Activity/",
    "file.yalla.live/activity/",
    "file.windgh.com/Activity/",
    "file.windgh.com/activity/",
]
KNOWN = {x.lower() for x in [
    "activityover", "8th", "8thanniversary", "9thanniversary", "10thanniversary",
    "activitymap", "adha", "car", "car2", "football", "footballcarnival",
    "nationalfence", "ramadan", "ramadanbless", "recall", "recallandrecuit",
    "recallandrecruit", "royalvictory", "sea", "sea2", "sheepfarm",
    "yallaseason", "wonderland", "ferriswheel", "ferriswheel5", "rollercoaster",
    "2023", "7th", "common", "public", "static", "images", "image", "img",
    "js", "css", "lang", "fonts", "font", "audio", "video", "icon", "icons",
]}
GENERIC = ["the activity has ended", "activity has ended", "more coming soon", "404 not found", "page not found"]
DEPTH = [
    "task", "mission", "sign", "lottery", "draw", "treasure", "collect", "collection",
    "card", "album", "map", "island", "planet", "level", "upgrade", "shop", "store",
    "exchange", "reward", "record", "history", "game", "challenge", "stage", "progress",
    "ticket", "coin", "invite", "team", "room", "farm", "feed", "ocean", "ship", "castle",
    "ride", "car", "medal", "honor", "palace", "memory", "festival", "carnival", "ramadan",
    "eid", "anniversary", "newyear", "national", "season", "football", "boss", "monster",
    "attack", "wealth", "path", "journey", "adventure", "wheel", "cruise", "garden",
]


def get(url: str, *, params=None, timeout=(20, 120), tries=4):
    last = None
    for attempt in range(tries):
        try:
            r = S.get(url, params=params, timeout=timeout, allow_redirects=True)
            last = r
            if r.status_code == 200:
                return r
            if r.status_code not in {429, 500, 502, 503, 504}:
                return r
        except Exception as exc:
            last = exc
        time.sleep(1.5 * (attempt + 1))
    return last


def parse_jsonl(text: str):
    rows = []
    for line in text.splitlines():
        line = line.strip()
        if not line:
            continue
        try:
            obj = json.loads(line)
        except Exception:
            continue
        if isinstance(obj, dict):
            rows.append(obj)
    return rows


def query_index(index: dict, prefix: str):
    api = index["cdx-api"]
    params = {
        "url": prefix,
        "matchType": "prefix",
        "output": "json",
        "filter": "status:200",
        "collapse": "urlkey",
    }
    results = []
    count = get(api, params={**params, "showNumPages": "true"}, timeout=(20, 90), tries=2)
    pages = 1
    if hasattr(count, "status_code") and count.status_code == 200:
        try:
            data = count.json()
            if isinstance(data, dict):
                pages = max(1, min(30, int(data.get("pages") or 1)))
            else:
                results.extend(parse_jsonl(count.text))
        except Exception:
            results.extend(parse_jsonl(count.text))
    if not results:
        for page in range(pages):
            r = get(api, params={**params, **({"page": page} if pages > 1 else {})}, timeout=(25, 150), tries=3)
            if not hasattr(r, "status_code") or r.status_code != 200:
                continue
            results.extend(parse_jsonl(r.text))
    for row in results:
        row["_index"] = index["id"]
        row["_prefix"] = prefix
    return results


def first_folder(url: str, prefix: str):
    try:
        path = urlparse(url if "://" in url else "https://" + url).path
    except Exception:
        return None
    marker = "/" + prefix.split("/", 1)[1]
    pos = path.lower().find(marker.lower())
    if pos < 0:
        return None
    rest = path[pos + len(marker):].lstrip("/")
    return rest.split("/", 1)[0] if rest else None


def extension(url: str):
    path = urlparse(url if "://" in url else "https://" + url).path
    m = re.search(r"(\.[A-Za-z0-9]{1,8})$", path)
    return m.group(1).lower() if m else ""


def slug_variants(folder: str):
    raw = folder.strip()
    variants = {raw}
    variants.add(raw.replace("-", ""))
    variants.add(raw.replace("_", ""))
    variants.add(re.sub(r"[^A-Za-z0-9]", "", raw))
    if raw:
        variants.add(raw[0].lower() + raw[1:])
        variants.add(raw[0].upper() + raw[1:])
    return [x for x in variants if x]


def probe_live(url: str):
    result = {"url": url}
    r = get(url, timeout=(15, 50), tries=2)
    if not hasattr(r, "status_code"):
        result["error"] = repr(r)
        return result
    data = r.content
    text = data[:1_000_000].decode("utf-8", "ignore")
    low = text.lower()
    refs = re.findall(r"(?:src|href)=[\"']([^\"']+)", text, re.I)
    result.update({
        "status": r.status_code,
        "finalUrl": r.url,
        "bytes": len(data),
        "contentType": r.headers.get("content-type", ""),
        "title": (re.search(r"<title[^>]*>(.*?)</title>", text, re.I | re.S).group(1).strip() if re.search(r"<title[^>]*>(.*?)</title>", text, re.I | re.S) else ""),
        "generic": any(x in low for x in GENERIC),
        "refs": refs[:100],
        "spaSignals": sum(x in low for x in ["chunk-vendors", "js/app.", "css/app.", "webpack", "__webpack", "vue", "react", "manifest.json"]),
    })
    return result


coll = get("https://index.commoncrawl.org/collinfo.json", timeout=(20, 60), tries=3)
if not hasattr(coll, "status_code") or coll.status_code != 200:
    raise SystemExit("Unable to load Common Crawl index list")
all_indexes = []
for item in coll.json():
    m = re.search(r"CC-MAIN-(20\d{2})-", item.get("id", ""))
    if m and 2020 <= int(m.group(1)) <= 2026:
        all_indexes.append(item)
by_year = defaultdict(list)
for item in all_indexes:
    year = int(re.search(r"CC-MAIN-(20\d{2})-", item["id"]).group(1))
    by_year[year].append(item)
selected = []
for year, items in sorted(by_year.items()):
    items = sorted(items, key=lambda x: x["id"], reverse=True)
    if items:
        selected.append(items[0])
    if len(items) > 3:
        selected.append(items[len(items) // 2])
selected = list({x["id"]: x for x in selected}.values())
(OUT / "indexes.json").write_text(json.dumps([x["id"] for x in selected], indent=2))

rows = []
with concurrent.futures.ThreadPoolExecutor(max_workers=8) as pool:
    futures = [pool.submit(query_index, index, prefix) for index in selected for prefix in PREFIXES]
    for future in concurrent.futures.as_completed(futures):
        try:
            rows.extend(future.result())
        except Exception as exc:
            print("query-error", repr(exc), flush=True)

# Deduplicate exact captures.
dedup = {}
for row in rows:
    dedup[(row.get("_index"), row.get("url"), row.get("timestamp"))] = row
rows = list(dedup.values())
(OUT / "record-count.txt").write_text(str(len(rows)))

groups = defaultdict(list)
for row in rows:
    folder = first_folder(str(row.get("url", "")), str(row.get("_prefix", "")))
    if folder:
        groups[folder].append(row)

items = []
for folder, hits in groups.items():
    urls = sorted({str(x.get("url", "")) for x in hits if x.get("url")})
    ext = Counter(extension(u) for u in urls)
    years = sorted({str(x.get("timestamp", ""))[:4] for x in hits if str(x.get("timestamp", ""))[:4].isdigit()})
    words = " ".join(urls).lower()
    depth = sorted({x for x in DEPTH if x in words})
    total = sum(int(x.get("length") or 0) for x in hits)
    item = {
        "folder": folder,
        "folderKey": re.sub(r"[^a-z0-9]", "", folder.lower()),
        "known": folder.lower() in KNOWN,
        "recordCount": len(hits),
        "uniqueUrls": len(urls),
        "totalBytes": total,
        "years": years,
        "extensions": dict(ext),
        "imageCount": sum(ext[x] for x in [".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg", ".avif"]),
        "jsonCount": ext[".json"],
        "mediaCount": sum(ext[x] for x in [".mp3", ".wav", ".ogg", ".mp4", ".webm"]),
        "depthKeywords": depth,
        "samples": urls[:80],
    }
    item["score"] = round(math.log2(item["uniqueUrls"] + 1) * 12 + math.log2(total + 1) * 1.3 + item["imageCount"] * 0.8 + item["jsonCount"] * 2 + item["mediaCount"] * 3 + len(depth) * 4 - (80 if item["known"] else 0), 2)
    items.append(item)
items.sort(key=lambda x: x["score"], reverse=True)
(OUT / "folders.json").write_text(json.dumps(items, ensure_ascii=False, indent=2))

candidates = [x for x in items if not x["known"] and x["uniqueUrls"] >= 4]
probe_jobs = []
for item in candidates[:80]:
    likely_years = [int(y) for y in item["years"] if y.isdigit() and 2020 <= int(y) <= 2026]
    if not likely_years:
        likely_years = [2024, 2025, 2026]
    expanded = sorted({max(2020, min(2026, y + delta)) for y in likely_years for delta in [-1, 0, 1]})
    for year in expanded:
        for slug in slug_variants(item["folder"]):
            probe_jobs.append((item["folder"], f"https://activity2.yalla.live/activity/{year}dist/{slug}/"))

probes = []
with concurrent.futures.ThreadPoolExecutor(max_workers=12) as pool:
    future_map = {pool.submit(probe_live, url): (folder, url) for folder, url in probe_jobs[:3500]}
    for future in concurrent.futures.as_completed(future_map):
        folder, url = future_map[future]
        try:
            result = future.result()
        except Exception as exc:
            result = {"url": url, "error": repr(exc)}
        result["folder"] = folder
        probes.append(result)

credible = [x for x in probes if x.get("status") == 200 and not x.get("generic") and x.get("bytes", 0) >= 500 and (x.get("spaSignals", 0) >= 1 or len(x.get("refs", [])) >= 2)]
# Deduplicate alias URLs by final URL and body dimensions.
credible_unique = {}
for item in credible:
    key = (item.get("folder"), item.get("finalUrl"), item.get("bytes"), item.get("title"))
    credible_unique.setdefault(key, item)
credible = sorted(credible_unique.values(), key=lambda x: (x.get("folder", ""), x.get("url", "")))
(OUT / "live-probes.json").write_text(json.dumps(probes, ensure_ascii=False, indent=2))
(OUT / "credible-live-roots.json").write_text(json.dumps(credible, ensure_ascii=False, indent=2))

lines = [
    "# Yalla File CDN Campaign Inventory",
    "",
    f"- Common Crawl indexes: {len(selected)}",
    f"- Captured CDN rows: {len(rows)}",
    f"- First-level asset folders: {len(items)}",
    f"- Uncollected candidate folders: {len(candidates)}",
    f"- Credible live SPA roots: {len(credible)}",
    "",
    "## Top uncollected asset folders",
    "",
    "| # | Folder | URLs | Images | JSON | Years | Depth signals | Score |",
    "|---:|---|---:|---:|---:|---|---|---:|",
]
for index, item in enumerate(candidates[:120], 1):
    lines.append(f"| {index} | `{item['folder']}` | {item['uniqueUrls']} | {item['imageCount']} | {item['jsonCount']} | {', '.join(item['years'])} | {', '.join(item['depthKeywords'][:12])} | {item['score']} |")
lines += ["", "## Credible live SPA roots", ""]
for item in credible:
    lines += [f"- `{item['url']}` · {item.get('bytes')} bytes · title `{item.get('title')}` · folder `{item.get('folder')}`"]
(OUT / "REPORT.md").write_text("\n".join(lines), encoding="utf-8")
print(json.dumps({
    "indexes": len(selected),
    "rows": len(rows),
    "folders": len(items),
    "candidates": [x["folder"] for x in candidates[:40]],
    "credible": [x["url"] for x in credible],
}, ensure_ascii=False, indent=2))
