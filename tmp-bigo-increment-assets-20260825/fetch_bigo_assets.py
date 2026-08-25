#!/usr/bin/env python3
from __future__ import annotations

import concurrent.futures
import datetime as dt
import hashlib
import json
import mimetypes
import os
import pathlib
import re
import shutil
import sys
import time
import urllib.error
import urllib.parse
import urllib.request

ROOT = pathlib.Path("bigo-increment-source")
IDS = [72340, 77022, 77430, 77620, 77621, 77624]
API = "https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={id}&actId={id}"
PAGE = "https://activity.bigo.tv/live/act/act_16907/index.html?id={id}&from_source=3&from_id={id}&lang=cn&langSource=pear"
UA = "Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 Mobile/15E148 BIGO/6.34.0"
URL_RE = re.compile(r"https?://[^\\s\\\"'<>\\\\]+")
ASSET_EXTS = {
    ".png", ".jpg", ".jpeg", ".gif", ".webp", ".svg", ".avif",
    ".mp4", ".webm", ".mp3", ".m4a", ".ogg", ".wav",
    ".woff", ".woff2", ".ttf", ".otf", ".eot",
}
STATIC_HOST_HINTS = (
    "static-comm.", "static-web.", "static-act.", "giftesx.", "esx.",
    "image-act.", "f2ecdn.", "likeevideo.",
)


def request(url: str, *, referer: str | None = None, timeout: int = 40) -> tuple[bytes, dict[str, str], str]:
    headers = {
        "User-Agent": UA,
        "Accept": "*/*",
        "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
    }
    if referer:
        headers["Referer"] = referer
        headers["Origin"] = "https://activity.bigo.tv"
    last: Exception | None = None
    candidates = [url]
    parts = urllib.parse.urlsplit(url)
    if parts.query:
        candidates.append(urllib.parse.urlunsplit((parts.scheme, parts.netloc, parts.path, "", "")))
    for candidate in dict.fromkeys(candidates):
        for attempt in range(3):
            try:
                req = urllib.request.Request(candidate, headers=headers)
                with urllib.request.urlopen(req, timeout=timeout) as res:
                    return res.read(), {k.lower(): v for k, v in res.headers.items()}, res.geturl()
            except Exception as exc:
                last = exc
                time.sleep(0.7 * (attempt + 1))
    raise RuntimeError(f"fetch failed: {url}: {last}")


def safe_component(value: str) -> str:
    value = urllib.parse.unquote(value)
    value = re.sub(r"[^A-Za-z0-9._@+-]+", "_", value)
    return value[:180] or "index"


def local_path_for(url: str, content_type: str = "") -> pathlib.Path:
    p = urllib.parse.urlsplit(url)
    path = pathlib.PurePosixPath(p.path)
    parts = [safe_component(x) for x in path.parts if x not in ("", "/")]
    if not parts:
        parts = ["index"]
    name = parts[-1]
    if "." not in name and content_type:
        ext = mimetypes.guess_extension(content_type.split(";", 1)[0].strip()) or ""
        if ext:
            parts[-1] += ext
    return ROOT / "raw" / safe_component(p.netloc) / pathlib.Path(*parts)


def walk_urls(value, trail="$", out=None):
    if out is None:
        out = []
    if isinstance(value, dict):
        for key, child in value.items():
            walk_urls(child, f"{trail}.{key}", out)
    elif isinstance(value, list):
        for index, child in enumerate(value):
            walk_urls(child, f"{trail}[{index}]", out)
    elif isinstance(value, str):
        for match in URL_RE.finditer(value.replace("\\/", "/")):
            url = match.group(0).rstrip("),.;]}")
            out.append({"trail": trail, "url": url})
    return out


def is_asset(url: str) -> bool:
    p = urllib.parse.urlsplit(url)
    ext = pathlib.PurePosixPath(p.path).suffix.lower()
    host = p.netloc.lower()
    return ext in ASSET_EXTS or any(h in host for h in STATIC_HOST_HINTS)


def normalized_key(url: str) -> str:
    p = urllib.parse.urlsplit(url)
    return urllib.parse.urlunsplit((p.scheme.lower(), p.netloc.lower(), p.path, "", ""))


def main() -> int:
    if ROOT.exists():
        shutil.rmtree(ROOT)
    (ROOT / "source" / "official-config").mkdir(parents=True, exist_ok=True)
    (ROOT / "source" / "official-shell").mkdir(parents=True, exist_ok=True)
    (ROOT / "reports").mkdir(parents=True, exist_ok=True)

    fetched_at = dt.datetime.now(dt.timezone.utc).isoformat()
    configs: dict[str, dict] = {}
    occurrences: list[dict] = []
    config_report: list[dict] = []

    for act_id in IDS:
        referer = PAGE.format(id=act_id)
        api_url = API.format(id=act_id)
        body, headers, final_url = request(api_url, referer=referer)
        config_path = ROOT / "source" / "official-config" / f"{act_id}.json"
        config_path.write_bytes(body)
        try:
            obj = json.loads(body)
        except Exception as exc:
            raise RuntimeError(f"invalid JSON for {act_id}: {exc}")
        configs[str(act_id)] = obj
        data = obj.get("data", obj.get("result", obj)) if isinstance(obj, dict) else {}
        info = data.get("act_info", {}) if isinstance(data, dict) else {}
        occurrences.extend({"actId": act_id, **item} for item in walk_urls(obj))
        config_report.append({
            "actId": act_id,
            "name": info.get("act_name", ""),
            "start": info.get("start_time", ""),
            "end": info.get("end_time", ""),
            "theme": info.get("theme", ""),
            "bytes": len(body),
            "sha256": hashlib.sha256(body).hexdigest(),
            "apiUrl": api_url,
            "finalUrl": final_url,
            "contentType": headers.get("content-type", ""),
        })
        try:
            shell, shell_headers, shell_final = request(referer, referer="https://activity.bigo.tv/")
            (ROOT / "source" / "official-shell" / f"{act_id}.html").write_bytes(shell)
            text = shell.decode("utf-8", "ignore")
            for raw in re.findall(r"(?:src|href)=[\"']([^\"']+)[\"']", text, flags=re.I):
                absolute = urllib.parse.urljoin(shell_final, raw)
                if absolute.startswith("http"):
                    occurrences.append({"actId": act_id, "trail": "$officialShell", "url": absolute})
        except Exception as exc:
            config_report[-1]["shellError"] = str(exc)

    # De-duplicate by host/path so rotating auth-token query strings do not create fake duplicates.
    groups: dict[str, dict] = {}
    for item in occurrences:
        url = item["url"]
        if not is_asset(url):
            continue
        key = normalized_key(url)
        entry = groups.setdefault(key, {"key": key, "urls": [], "actIds": set(), "trails": []})
        if url not in entry["urls"]:
            entry["urls"].append(url)
        entry["actIds"].add(item["actId"])
        entry["trails"].append({"actId": item["actId"], "trail": item["trail"]})

    def download(entry: dict) -> dict:
        result = {
            "key": entry["key"],
            "sourceUrls": entry["urls"],
            "actIds": sorted(entry["actIds"]),
            "trails": entry["trails"],
            "status": "failed",
        }
        errors = []
        referer = PAGE.format(id=result["actIds"][0])
        for url in entry["urls"]:
            try:
                body, headers, final_url = request(url, referer=referer, timeout=55)
                ctype = headers.get("content-type", "")
                target = local_path_for(entry["key"], ctype)
                target.parent.mkdir(parents=True, exist_ok=True)
                target.write_bytes(body)
                result.update({
                    "status": "downloaded",
                    "downloadUrl": url,
                    "finalUrl": final_url,
                    "localPath": target.relative_to(ROOT).as_posix(),
                    "contentType": ctype,
                    "bytes": len(body),
                    "sha256": hashlib.sha256(body).hexdigest(),
                })
                return result
            except Exception as exc:
                errors.append(f"{url}: {exc}")
        result["errors"] = errors
        return result

    asset_results: list[dict] = []
    entries = list(groups.values())
    with concurrent.futures.ThreadPoolExecutor(max_workers=10) as pool:
        futures = {pool.submit(download, entry): entry for entry in entries}
        for index, future in enumerate(concurrent.futures.as_completed(futures), 1):
            result = future.result()
            asset_results.append(result)
            print(f"[{index}/{len(entries)}] {result['status']} {result['key']}", flush=True)

    asset_results.sort(key=lambda x: x["key"])
    downloaded = [x for x in asset_results if x["status"] == "downloaded"]
    failed = [x for x in asset_results if x["status"] != "downloaded"]

    report = {
        "fetchedAt": fetched_at,
        "actIds": IDS,
        "configCount": len(config_report),
        "urlOccurrences": len(occurrences),
        "assetKeyCount": len(asset_results),
        "downloadedAssetCount": len(downloaded),
        "failedAssetCount": len(failed),
        "downloadedBytes": sum(x.get("bytes", 0) for x in downloaded),
        "configs": config_report,
        "assets": asset_results,
    }
    (ROOT / "reports" / "source-download-report.json").write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding="utf-8")
    (ROOT / "reports" / "asset-url-inventory.json").write_text(json.dumps(occurrences, ensure_ascii=False, indent=2), encoding="utf-8")
    (ROOT / "reports" / "failed-assets.txt").write_text("\n".join(x["key"] for x in failed) + ("\n" if failed else ""), encoding="utf-8")
    (ROOT / "SOURCE_README.md").write_text(
        "# BIGO Increment source capture\n\n"
        f"Fetched at: `{fetched_at}`\n\n"
        f"Official configs: **{len(config_report)} / {len(IDS)}**\n\n"
        f"Asset objects downloaded: **{len(downloaded)} / {len(asset_results)}**\n\n"
        f"Downloaded bytes: **{report['downloadedBytes']}**\n\n"
        "This directory contains official API responses, official activity shells, and downloaded bytes referenced by those responses.\n",
        encoding="utf-8",
    )
    print(json.dumps({k: report[k] for k in ("configCount", "assetKeyCount", "downloadedAssetCount", "failedAssetCount", "downloadedBytes")}, ensure_ascii=False, indent=2))
    return 0 if len(config_report) == len(IDS) else 2


if __name__ == "__main__":
    raise SystemExit(main())
