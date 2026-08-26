from __future__ import annotations

import concurrent.futures
import hashlib
import json
import mimetypes
import os
import re
import shutil
import sys
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
COMMON_HEADERS = {
    "User-Agent": UA,
    "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.7,id;q=0.6,ms;q=0.5",
    "Referer": "https://activity.bigo.tv/",
    "Origin": "https://activity.bigo.tv",
}

IMAGE_MAGIC = (
    b"\x89PNG\r\n\x1a\n", b"\xff\xd8\xff", b"GIF87a", b"GIF89a", b"RIFF", b"<svg", b"<?xml"
)


def canonical(url: str) -> str:
    p = urllib.parse.urlsplit(url.replace("http://", "https://", 1))
    return urllib.parse.urlunsplit(("https", p.netloc.lower(), p.path, "", ""))


def relpath_for(url: str) -> Path:
    p = urllib.parse.urlsplit(canonical(url))
    clean = urllib.parse.unquote(p.path).lstrip("/") or "index.bin"
    return Path(p.netloc) / clean


def candidate_urls(url: str) -> list[str]:
    base = canonical(url)
    p = urllib.parse.urlsplit(base)
    out = [base]
    if p.netloc == "giftesx.bigo.sg":
        out.append(urllib.parse.urlunsplit(("https", "esx.bigo.sg", p.path, "", "")))
    elif p.netloc == "esx.bigo.sg":
        out.append(urllib.parse.urlunsplit(("https", "giftesx.bigo.sg", p.path, "", "")))
    if p.netloc == "static-comm.bigolive.tv":
        out.append(urllib.parse.urlunsplit(("https", "static-web.bigolive.tv", p.path, "", "")))
    # Some Qiniu-style endpoints behave differently with an inert image transform.
    out.extend([u + "?imageView2/0" for u in list(out)])
    return list(dict.fromkeys(out))


def looks_like_image(data: bytes, content_type: str) -> bool:
    ct = (content_type or "").lower()
    head = data[:256].lstrip()
    if ct.startswith("image/"):
        return True
    if any(head.startswith(m) for m in IMAGE_MAGIC):
        return True
    if head.startswith(b"RIFF") and b"WEBP" in head[:16]:
        return True
    return False


def request(url: str, *, accept_image: bool = True, timeout: int = 35) -> requests.Response:
    headers = dict(COMMON_HEADERS)
    if not accept_image:
        headers["Accept"] = "text/html,application/xhtml+xml,application/json,text/plain,*/*;q=0.8"
    last = None
    for attempt in range(4):
        try:
            r = requests.get(url, headers=headers, timeout=timeout, allow_redirects=True)
            last = r
            if r.status_code in (429, 500, 502, 503, 504):
                time.sleep(1.0 + attempt * 1.4)
                continue
            return r
        except requests.RequestException:
            if attempt == 3:
                raise
            time.sleep(0.8 + attempt * 1.2)
    assert last is not None
    return last


def download_asset(entry: tuple[str, str]) -> dict:
    campaign, original = entry
    target = ASSETS / relpath_for(original)
    target.parent.mkdir(parents=True, exist_ok=True)
    errors = []
    for u in candidate_urls(original):
        try:
            r = request(u, accept_image=True)
            data = r.content
            if r.status_code == 200 and len(data) > 24 and looks_like_image(data, r.headers.get("content-type", "")):
                target.write_bytes(data)
                return {
                    "campaign": campaign,
                    "url": canonical(original),
                    "resolvedUrl": r.url,
                    "localPath": str(target.relative_to(OUT)).replace(os.sep, "/"),
                    "status": r.status_code,
                    "contentType": r.headers.get("content-type", ""),
                    "bytes": len(data),
                    "sha256": hashlib.sha256(data).hexdigest(),
                    "ok": True,
                }
            errors.append({"url": u, "status": r.status_code, "contentType": r.headers.get("content-type", ""), "bytes": len(data)})
        except Exception as exc:
            errors.append({"url": u, "error": repr(exc)})
    return {
        "campaign": campaign,
        "url": canonical(original),
        "localPath": str(target.relative_to(OUT)).replace(os.sep, "/"),
        "ok": False,
        "attempts": errors,
    }


def save_response(url: str, target: Path, *, accept_image: bool = False) -> dict:
    target.parent.mkdir(parents=True, exist_ok=True)
    try:
        r = request(url, accept_image=accept_image, timeout=50)
        data = r.content
        if r.status_code == 200 and data:
            target.write_bytes(data)
        return {
            "url": url,
            "finalUrl": r.url,
            "status": r.status_code,
            "contentType": r.headers.get("content-type", ""),
            "bytes": len(data),
            "localPath": str(target.relative_to(OUT)).replace(os.sep, "/") if target.exists() else None,
            "sha256": hashlib.sha256(data).hexdigest() if target.exists() else None,
            "ok": target.exists(),
        }
    except Exception as exc:
        return {"url": url, "ok": False, "error": repr(exc)}


def discover_html_assets(html: str, base_url: str) -> list[str]:
    found = []
    patterns = [
        r'''(?:src|href)=["']([^"']+)["']''',
        r'''url\(\s*["']?([^"')]+)''',
    ]
    for pattern in patterns:
        for raw in re.findall(pattern, html, flags=re.I):
            if raw.startswith(("data:", "javascript:", "#")):
                continue
            try:
                found.append(urllib.parse.urljoin(base_url, raw))
            except Exception:
                pass
    return list(dict.fromkeys(found))


# 1. Download every unique image asset, preserving campaign attribution.
entries = []
for campaign, urls in MANIFEST["campaigns"].items():
    for url in urls:
        entries.append((campaign, url))
# The same URL may occur in multiple campaign configs; one byte copy is enough.
first_by_url = {}
for campaign, url in entries:
    first_by_url.setdefault(canonical(url), campaign)
unique_entries = [(campaign, url) for url, campaign in first_by_url.items()]
with concurrent.futures.ThreadPoolExecutor(max_workers=20) as pool:
    asset_results = list(pool.map(download_asset, unique_entries))
asset_results.sort(key=lambda x: x["url"])
(REPORTS / "asset-download-report.json").write_text(json.dumps(asset_results, ensure_ascii=False, indent=2), "utf-8")

# 2. Save official activity-template API payloads for the main and linked act IDs.
main_ids = sorted(int(x) for x in MANIFEST["campaigns"].keys())
child_ids = sorted({int(x) for xs in MANIFEST.get("childActIds", {}).values() for x in xs})
config_results = []
for act_id in main_ids + child_ids:
    api_url = f"https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={act_id}&actId={act_id}"
    config_results.append(save_response(api_url, SOURCES / "official-config" / f"{act_id}.json"))
    shell_url = f"https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}&from_source=3&from_id={act_id}&lang=cn&langSource=pear"
    config_results.append(save_response(shell_url, SOURCES / "official-shell" / f"{act_id}.html"))
(REPORTS / "source-download-report.json").write_text(json.dumps(config_results, ensure_ascii=False, indent=2), "utf-8")

# 3. Capture linked competition pages and their first-level static resources.
competition_results = []
for index, page_url in enumerate(MANIFEST.get("competitionUrls", []), 1):
    page_target = SOURCES / "competition-pages" / f"competition-{index}.html"
    page_result = save_response(page_url, page_target)
    competition_results.append(page_result)
    if not page_result.get("ok"):
        continue
    html = page_target.read_text("utf-8", errors="replace")
    resources = discover_html_assets(html, page_url)
    for resource_url in resources:
        p = urllib.parse.urlsplit(resource_url)
        ext = Path(p.path).suffix.lower()
        if ext not in {".js", ".css", ".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg", ".woff", ".woff2", ".ttf", ".json"}:
            continue
        target = SOURCES / "competition-resources" / p.netloc / p.path.lstrip("/")
        competition_results.append(save_response(resource_url, target, accept_image=ext in {".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg"}))
(REPORTS / "competition-download-report.json").write_text(json.dumps(competition_results, ensure_ascii=False, indent=2), "utf-8")

# 4. Compact summary and inventory.
all_files = sorted(p for p in OUT.rglob("*") if p.is_file())
inventory = []
for p in all_files:
    data = p.read_bytes()
    inventory.append({
        "path": str(p.relative_to(OUT)).replace(os.sep, "/"),
        "bytes": len(data),
        "sha256": hashlib.sha256(data).hexdigest(),
    })
summary = {
    "requestedUniqueAssets": len(unique_entries),
    "downloadedAssets": sum(1 for x in asset_results if x.get("ok")),
    "missingAssets": sum(1 for x in asset_results if not x.get("ok")),
    "downloadedBytes": sum(x.get("bytes", 0) for x in asset_results if x.get("ok")),
    "mainActIds": main_ids,
    "childActIds": child_ids,
    "sourceResponses": len(config_results),
    "sourceResponsesOk": sum(1 for x in config_results if x.get("ok")),
    "competitionResponses": len(competition_results),
    "competitionResponsesOk": sum(1 for x in competition_results if x.get("ok")),
    "files": len(inventory),
}
(REPORTS / "summary.json").write_text(json.dumps(summary, ensure_ascii=False, indent=2), "utf-8")
(REPORTS / "inventory.json").write_text(json.dumps(inventory, ensure_ascii=False, indent=2), "utf-8")
(OUT / "README.md").write_text(
    "# Pro-BIGO Rocket-standard source recovery\n\n"
    + json.dumps(summary, ensure_ascii=False, indent=2)
    + "\n",
    "utf-8",
)

archive = OUT.parent / "pro-bigo-rocket-assets-output.zip"
if archive.exists():
    archive.unlink()
with zipfile.ZipFile(archive, "w", compression=zipfile.ZIP_DEFLATED, compresslevel=6) as zf:
    for p in sorted(OUT.rglob("*")):
        if p.is_file():
            zf.write(p, p.relative_to(OUT.parent))
print(json.dumps(summary, ensure_ascii=False, indent=2))
print(f"ARCHIVE={archive}")
