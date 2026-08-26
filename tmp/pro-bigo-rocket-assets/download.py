from __future__ import annotations

import concurrent.futures
import hashlib
import json
import os
import re
import time
import urllib.parse
import zipfile
from pathlib import Path

import requests

ROOT = Path(__file__).resolve().parent
MANIFEST = json.loads((ROOT / "manifest.json").read_text("utf-8"))
OUT = Path(os.environ.get("OUTPUT_DIR", "pro-bigo-rocket-assets-output")).resolve()
ASSETS = OUT / "assets"
SOURCES = OUT / "sources"
REPORTS = OUT / "reports"
for p in (ASSETS, SOURCES, REPORTS):
    p.mkdir(parents=True, exist_ok=True)

UA = "Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 Mobile/15E148 Safari/604.1 BIGO/6.34.0"
HEADERS = {
    "User-Agent": UA,
    "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.7,id;q=0.6,ms;q=0.5",
    "Referer": "https://activity.bigo.tv/",
    "Origin": "https://activity.bigo.tv",
}
IMAGE_EXTS = {".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg", ".avif"}
MAGIC = (b"\x89PNG\r\n\x1a\n", b"\xff\xd8\xff", b"GIF87a", b"GIF89a", b"RIFF", b"<svg", b"<?xml")


def canonical(url: str) -> str:
    p = urllib.parse.urlsplit(url.replace("http://", "https://", 1))
    return urllib.parse.urlunsplit(("https", p.netloc.lower(), p.path, "", ""))


def relpath_for(url: str) -> Path:
    p = urllib.parse.urlsplit(canonical(url))
    return Path(p.netloc) / (urllib.parse.unquote(p.path).lstrip("/") or "index.bin")


def request(url: str, *, image: bool = False, timeout: int = 45) -> requests.Response:
    headers = dict(HEADERS)
    if not image:
        headers["Accept"] = "application/json,text/html,application/xhtml+xml,text/plain,*/*;q=0.8"
    last = None
    for attempt in range(4):
        try:
            r = requests.get(url, headers=headers, timeout=timeout, allow_redirects=True)
            last = r
            if r.status_code in (429, 500, 502, 503, 504):
                time.sleep(1 + attempt * 1.3)
                continue
            return r
        except requests.RequestException:
            if attempt == 3:
                raise
            time.sleep(0.8 + attempt * 1.1)
    assert last is not None
    return last


def looks_image(data: bytes, content_type: str) -> bool:
    head = data[:256].lstrip()
    return (content_type or "").lower().startswith("image/") or any(head.startswith(x) for x in MAGIC) or (head.startswith(b"RIFF") and b"WEBP" in head[:16])


def save_source(url: str, target: Path) -> dict:
    target.parent.mkdir(parents=True, exist_ok=True)
    try:
        r = request(url, image=False)
        data = r.content
        ok = r.status_code == 200 and bool(data)
        if ok:
            target.write_bytes(data)
        return {
            "url": url, "finalUrl": r.url, "status": r.status_code,
            "contentType": r.headers.get("content-type", ""), "bytes": len(data),
            "localPath": str(target.relative_to(OUT)).replace(os.sep, "/") if ok else None,
            "sha256": hashlib.sha256(data).hexdigest() if ok else None, "ok": ok,
        }
    except Exception as exc:
        return {"url": url, "ok": False, "error": repr(exc)}


def collect_urls(value) -> list[str]:
    out = []
    def walk(v):
        if isinstance(v, dict):
            for x in v.values(): walk(x)
        elif isinstance(v, list):
            for x in v: walk(x)
        elif isinstance(v, str) and re.match(r"^https?://", v):
            try:
                p = urllib.parse.urlsplit(v)
                if Path(p.path).suffix.lower() in IMAGE_EXTS:
                    out.append(v)
            except Exception:
                pass
    walk(value)
    return out


def image_candidates(exact: str) -> list[str]:
    clean = canonical(exact)
    p = urllib.parse.urlsplit(clean)
    out = [exact.replace("http://", "https://", 1), clean]
    if p.netloc == "giftesx.bigo.sg":
        out.append(urllib.parse.urlunsplit(("https", "esx.bigo.sg", p.path, "", "")))
    elif p.netloc == "esx.bigo.sg":
        out.append(urllib.parse.urlunsplit(("https", "giftesx.bigo.sg", p.path, "", "")))
    out += [u + ("&" if "?" in u else "?") + "imageView2/0" for u in list(out)]
    return list(dict.fromkeys(out))


def download_asset(item: tuple[str, str]) -> dict:
    campaign, exact = item
    target = ASSETS / relpath_for(exact)
    target.parent.mkdir(parents=True, exist_ok=True)
    attempts = []
    for u in image_candidates(exact):
        try:
            r = request(u, image=True)
            data = r.content
            if r.status_code == 200 and len(data) > 24 and looks_image(data, r.headers.get("content-type", "")):
                target.write_bytes(data)
                return {
                    "campaign": campaign, "url": canonical(exact), "sourceUrl": exact,
                    "resolvedUrl": r.url, "localPath": str(target.relative_to(OUT)).replace(os.sep, "/"),
                    "status": r.status_code, "contentType": r.headers.get("content-type", ""),
                    "bytes": len(data), "sha256": hashlib.sha256(data).hexdigest(), "ok": True,
                }
            attempts.append({"url": u, "status": r.status_code, "contentType": r.headers.get("content-type", ""), "bytes": len(data)})
        except Exception as exc:
            attempts.append({"url": u, "error": repr(exc)})
    return {"campaign": campaign, "url": canonical(exact), "sourceUrl": exact, "localPath": str(target.relative_to(OUT)).replace(os.sep, "/"), "ok": False, "attempts": attempts}


main_ids = sorted(int(x) for x in MANIFEST["campaigns"].keys())
child_ids = sorted({int(x) for xs in MANIFEST.get("childActIds", {}).values() for x in xs})
parent_for_child = {int(child): parent for parent, children in MANIFEST.get("childActIds", {}).items() for child in children}

# Fetch current API payloads first. Their CDN URLs contain fresh short-lived signatures.
source_results = []
configs = {}
for act_id in main_ids + child_ids:
    api_url = f"https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={act_id}&actId={act_id}"
    target = SOURCES / "official-config" / f"{act_id}.json"
    result = save_source(api_url, target)
    source_results.append(result)
    if result.get("ok"):
        try:
            configs[act_id] = json.loads(target.read_text("utf-8"))
        except Exception:
            pass
    shell_url = f"https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}&from_source=3&from_id={act_id}&lang=cn&langSource=pear"
    source_results.append(save_source(shell_url, SOURCES / "official-shell" / f"{act_id}.html"))

# Merge fresh signed URLs with the queryless discovery manifest.
items_by_canonical: dict[str, tuple[str, str]] = {}
for act_id, config in configs.items():
    campaign = str(parent_for_child.get(act_id, act_id))
    for exact in collect_urls(config):
        items_by_canonical[canonical(exact)] = (campaign, exact)
for campaign, urls in MANIFEST["campaigns"].items():
    for url in urls:
        items_by_canonical.setdefault(canonical(url), (campaign, url))

with concurrent.futures.ThreadPoolExecutor(max_workers=24) as pool:
    asset_results = list(pool.map(download_asset, items_by_canonical.values()))
asset_results.sort(key=lambda x: x["url"])
(REPORTS / "asset-download-report.json").write_text(json.dumps(asset_results, ensure_ascii=False, indent=2), "utf-8")
(REPORTS / "source-download-report.json").write_text(json.dumps(source_results, ensure_ascii=False, indent=2), "utf-8")

# Save the linked competition pages and their first-level resources.
def discover_html_assets(html: str, base_url: str) -> list[str]:
    found = []
    for pattern in (r'''(?:src|href)=["']([^"']+)["']''', r'''url\(\s*["']?([^"')]+)'''):
        for raw in re.findall(pattern, html, flags=re.I):
            if raw.startswith(("data:", "javascript:", "#")): continue
            found.append(urllib.parse.urljoin(base_url, raw))
    return list(dict.fromkeys(found))

competition_results = []
for index, page_url in enumerate(MANIFEST.get("competitionUrls", []), 1):
    page_target = SOURCES / "competition-pages" / f"competition-{index}.html"
    page_result = save_source(page_url, page_target)
    competition_results.append(page_result)
    if not page_result.get("ok"): continue
    html = page_target.read_text("utf-8", errors="replace")
    for resource_url in discover_html_assets(html, page_url):
        p = urllib.parse.urlsplit(resource_url)
        ext = Path(p.path).suffix.lower()
        if ext not in {".js", ".css", ".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg", ".woff", ".woff2", ".ttf", ".json"}: continue
        competition_results.append(save_source(resource_url, SOURCES / "competition-resources" / p.netloc / p.path.lstrip("/")))
(REPORTS / "competition-download-report.json").write_text(json.dumps(competition_results, ensure_ascii=False, indent=2), "utf-8")

# Inventory and archive.
inventory = []
for p in sorted(x for x in OUT.rglob("*") if x.is_file()):
    data = p.read_bytes()
    inventory.append({"path": str(p.relative_to(OUT)).replace(os.sep, "/"), "bytes": len(data), "sha256": hashlib.sha256(data).hexdigest()})
summary = {
    "requestedUniqueAssets": len(items_by_canonical),
    "downloadedAssets": sum(1 for x in asset_results if x.get("ok")),
    "missingAssets": sum(1 for x in asset_results if not x.get("ok")),
    "downloadedBytes": sum(x.get("bytes", 0) for x in asset_results if x.get("ok")),
    "mainActIds": main_ids, "childActIds": child_ids,
    "sourceResponses": len(source_results), "sourceResponsesOk": sum(1 for x in source_results if x.get("ok")),
    "competitionResponses": len(competition_results), "competitionResponsesOk": sum(1 for x in competition_results if x.get("ok")),
    "files": len(inventory),
}
(REPORTS / "summary.json").write_text(json.dumps(summary, ensure_ascii=False, indent=2), "utf-8")
(REPORTS / "inventory.json").write_text(json.dumps(inventory, ensure_ascii=False, indent=2), "utf-8")
(OUT / "README.md").write_text("# Pro-BIGO Rocket-standard source recovery\n\n" + json.dumps(summary, ensure_ascii=False, indent=2) + "\n", "utf-8")
archive = OUT.parent / "pro-bigo-rocket-assets-output.zip"
if archive.exists(): archive.unlink()
with zipfile.ZipFile(archive, "w", compression=zipfile.ZIP_DEFLATED, compresslevel=6) as zf:
    for p in sorted(OUT.rglob("*")):
        if p.is_file(): zf.write(p, p.relative_to(OUT.parent))
print(json.dumps(summary, ensure_ascii=False, indent=2))
print(f"ARCHIVE={archive}")
