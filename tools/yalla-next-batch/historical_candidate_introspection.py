from __future__ import annotations

import hashlib
import json
import re
import time
from collections import deque
from pathlib import Path
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path("pro-yalla-historical-candidate-introspection-v2")
OUT.mkdir(exist_ok=True)
S = requests.Session()
S.headers.update({"User-Agent": "Mozilla/5.0 Chrome/127 Safari/537.36", "Accept": "*/*"})

TARGETS = [
    {"id": "magic-lamp", "name": "Magic Lamp 2021", "root": "https://activity2.yalla.live/activity/2021dist/MagicLamp/", "target": "20210805"},
    {"id": "beat-pinata", "name": "Beat Piñata 2021", "root": "https://activity2.yalla.live/activity/2021dist/beatPinata/", "target": "20210822"},
    {"id": "lucky-card", "name": "Lucky Card 2021", "root": "https://activity2.yalla.live/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/", "target": "20210201"},
]

FEATURES = {
    "task": ["task", "mission", "daily", "sign", "checkin", "check-in"],
    "lottery": ["lottery", "draw", "spin", "lucky", "random", "prize", "jackpot"],
    "growth": ["level", "progress", "stage", "upgrade", "unlock", "milestone"],
    "collect": ["collect", "collection", "album", "card", "fragment", "piece"],
    "shop": ["shop", "store", "exchange", "redeem", "mall"],
    "rank": ["rank", "ranking", "leaderboard", "toplist"],
    "game": ["hit", "beat", "hammer", "lamp", "genie", "wish", "pinata", "piñata", "candy"],
    "record": ["record", "history", "log"],
    "reward": ["reward", "gift", "prize", "benefit"],
}


def get(url: str, params=None, timeout=(20, 100), tries=4):
    for attempt in range(tries):
        try:
            response = S.get(url, params=params, timeout=timeout, allow_redirects=True)
            if response.status_code in {429, 500, 502, 503, 504} and attempt + 1 < tries:
                time.sleep(1.5 * (attempt + 1))
                continue
            return response
        except Exception:
            if attempt + 1 < tries:
                time.sleep(1.5 * (attempt + 1))
    return None


def cdx(url: str, match: str | None = None) -> list[dict]:
    params = {
        "url": url,
        "output": "json",
        "fl": "timestamp,original,statuscode,mimetype,digest,length",
        "filter": "statuscode:200",
        "collapse": "urlkey",
        "limit": "5000",
    }
    if match:
        params["matchType"] = match
    response = get("https://web.archive.org/cdx/search/cdx", params=params, timeout=(30, 180), tries=3)
    if not response or response.status_code != 200:
        return []
    try:
        data = response.json()
    except Exception:
        return []
    if not isinstance(data, list) or not data:
        return []
    header = data[0]
    return [dict(zip(header, row)) for row in data[1:] if isinstance(row, list) and len(row) == len(header)]


def choose(rows: list[dict], target: str):
    if not rows:
        return None
    target14 = int((target + "0" * 14)[:14])
    return min(rows, key=lambda row: abs(int((row.get("timestamp", "0") + "0" * 14)[:14]) - target14))


def fetch_archived(url: str, target: str, preferred_row: dict | None = None):
    row = preferred_row or choose(cdx(url), target)
    if not row:
        return None
    replay = f"https://web.archive.org/web/{row['timestamp']}id_/{row['original']}"
    response = get(replay, timeout=(30, 180), tries=3)
    if not response or response.status_code != 200:
        return None
    return {
        "url": url,
        "row": row,
        "replay": replay,
        "content": response.content,
        "contentType": response.headers.get("content-type", ""),
    }


def references(text: str, base: str) -> set[str]:
    output = set()
    text = text.replace("\\/", "/").replace("\\u002F", "/")
    if "<" in text[:5000]:
        try:
            soup = BeautifulSoup(text, "html.parser")
            for tag, attr in [("script", "src"), ("link", "href"), ("img", "src"), ("source", "src"), ("video", "src"), ("audio", "src")]:
                for element in soup.find_all(tag):
                    if element.get(attr):
                        output.add(urljoin(base, element.get(attr)))
        except Exception:
            pass
    for value in re.findall(r"https?://[^\s\"'<>`)\\]+", text):
        output.add(value.rstrip(",.;)]}"))
    for value in re.findall(r"url\(\s*[\"']?([^\"')\s]+)", text, re.I):
        output.add(urljoin(base, value))
    for value in re.findall(r"[\"']([^\"'\n\r]{1,500}\.(?:js|mjs|css|json|png|jpe?g|webp|gif|svg|woff2?|ttf|otf|mp3|wav|ogg|mp4|webm|map)(?:\?[^\"']*)?)[\"']", text, re.I):
        output.add(urljoin(base, value))
    return {value for value in output if urlparse(value).scheme in {"http", "https"}}


def safe_path(url: str) -> Path:
    parsed = urlparse(url)
    path = parsed.path.strip("/") or "index.html"
    path = re.sub(r"[^A-Za-z0-9._/-]+", "_", path)
    if path.endswith("/"):
        path += "index.html"
    if parsed.query:
        path += "__q_" + hashlib.sha1(parsed.query.encode()).hexdigest()[:10]
    return Path(re.sub(r"[^A-Za-z0-9._-]+", "_", parsed.netloc)) / path


reports = []
for target in TARGETS:
    base = OUT / target["id"]
    base.mkdir(parents=True, exist_ok=True)
    prefix_rows = cdx(target["root"], "prefix")
    (base / "cdx-prefix.json").write_text(json.dumps(prefix_rows, ensure_ascii=False, indent=2))
    rows_by_url = {}
    for row in prefix_rows:
        rows_by_url.setdefault(row.get("original", ""), []).append(row)
    initial = fetch_archived(target["root"], target["target"])
    if not initial:
        initial = fetch_archived(target["root"] + "index.html", target["target"])
    queue = deque()
    records = []
    text_blobs = []
    if initial:
        queue.append(initial)
    seen = set()
    while queue and len(records) < 500:
        item = queue.popleft()
        url = item["url"]
        if url in seen:
            continue
        seen.add(url)
        data = item["content"]
        content_type = item["contentType"]
        file = base / "files" / safe_path(url)
        file.parent.mkdir(parents=True, exist_ok=True)
        file.write_bytes(data)
        record = {
            "url": url,
            "replay": item["replay"],
            "timestamp": item["row"].get("timestamp"),
            "bytes": len(data),
            "sha256": hashlib.sha256(data).hexdigest(),
            "contentType": content_type,
            "file": file.relative_to(base).as_posix(),
        }
        records.append(record)
        textual = any(value in content_type.lower() for value in ["text", "javascript", "json", "xml"]) or file.suffix.lower() in {".html", ".js", ".mjs", ".css", ".json", ".map", ".svg", ".txt", ".xml"}
        if textual and len(data) < 30_000_000:
            text = data.decode("utf-8", "ignore")
            text_blobs.append((url, text))
            for ref in references(text, url):
                if ref in seen:
                    continue
                if not any(value in (urlparse(ref).hostname or "").lower() for value in ["yalla", "windgh", "qrsshine", "ylapi"]):
                    continue
                preferred = choose(rows_by_url.get(ref, []), target["target"])
                captured = fetch_archived(ref, target["target"], preferred)
                if captured:
                    queue.append(captured)
    joined = "\n".join(value for _, value in text_blobs)
    lower = joined.lower()
    feature_hits = {key: sorted({word for word in words if word in lower}) for key, words in FEATURES.items()}
    routes = {"/"}
    for pattern in [r"\bpath\s*:\s*['\"]([^'\"]{1,160})['\"]", r"['\"](#/[A-Za-z0-9_./?=&%-]{1,160})['\"]"]:
        for route in re.findall(pattern, joined):
            routes.add(route.lstrip("#") or "/")
    api_paths = sorted(set(re.findall(r"/(?:api|Api)/[A-Za-z0-9_./?=&%-]{2,240}", joined)))
    visible = ""
    if initial:
        try:
            visible = " ".join(BeautifulSoup(initial["content"].decode("utf-8", "ignore"), "html.parser").get_text(" ", strip=True).split())
        except Exception:
            pass
    simple_ranking = bool(feature_hits["rank"]) and not any(feature_hits[key] for key in ["task", "lottery", "growth", "collect", "shop", "game"])
    report = {
        "id": target["id"],
        "name": target["name"],
        "root": target["root"],
        "rootRows": len(prefix_rows),
        "files": len(records),
        "bytes": sum(item["bytes"] for item in records),
        "routes": sorted(routes),
        "apiPaths": api_paths[:300],
        "features": feature_hits,
        "visibleText": visible[:10000],
        "simpleRankingRisk": simple_ranking,
        "records": records,
    }
    (base / "report.json").write_text(json.dumps(report, ensure_ascii=False, indent=2))
    reports.append(report)

(OUT / "inventory.json").write_text(json.dumps(reports, ensure_ascii=False, indent=2))
lines = [
    "# Historical Yalla Candidate Introspection v2",
    "",
    "| Activity | Files | Routes | Feature groups | Simple rank risk |",
    "|---|---:|---:|---|---|",
]
for report in reports:
    lines.append(
        f"| {report['name']} | {report['files']} | {len(report['routes'])} | "
        f"{', '.join(key for key, value in report['features'].items() if value)} | {report['simpleRankingRisk']} |"
    )
lines += ["", "## Details", ""]
for report in reports:
    lines += [
        f"### {report['name']}",
        f"- Root: `{report['root']}`",
        f"- APIs: {len(report['apiPaths'])}",
        f"- Routes: `{report['routes']}`",
        f"- Features: `{report['features']}`",
        f"- Visible: {report['visibleText'][:1000]}",
        "",
    ]
(OUT / "REPORT.md").write_text("\n".join(lines))
print(json.dumps([{key: report[key] for key in ["id", "files", "routes", "features", "simpleRankingRisk"]} for report in reports], ensure_ascii=False, indent=2))
