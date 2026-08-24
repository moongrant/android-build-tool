#!/usr/bin/env python3
"""Scrape public pages that mention the two FSB venues and inspect assets.

Only publicly available HTML, scripts, JSON-LD and images are fetched. No login,
anti-bot bypass, or private account data is used.
"""
from __future__ import annotations

import hashlib
import json
import os
import re
import time
from pathlib import Path
from typing import Any
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path(os.environ.get("FSB_PAGE_OUT", "fsb-page-scrape-output"))
OUT.mkdir(parents=True, exist_ok=True)
ASSETS = OUT / "assets"
ASSETS.mkdir(exist_ok=True)

S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
})

PAGES = [
    "https://post.smzdm.com/p/avvonl79/",
    "https://www.sz.gov.cn/cn/xxgk/zfxxgj/gqdt/content/post_12903840.html",
    "https://m.dutenews.com/n/article/60037914",
    "https://www.10100.com/article/91986080",
]

KEYWORDS = [
    "泛思博特", "沙河", "棕榈泉", "网球订场", "STOREID", "storeId",
    "projectUid", "servicewechat", "appid", "wxservice", "pospal",
]


def dump(name: str, obj: Any) -> None:
    (OUT / name).write_text(json.dumps(obj, ensure_ascii=False, indent=2), encoding="utf-8")


def snippets(text: str, keyword: str, radius: int = 300) -> list[str]:
    out: list[str] = []
    for match in re.finditer(re.escape(keyword), text, re.I):
        value = re.sub(r"\s+", " ", text[max(0, match.start()-radius):min(len(text), match.end()+radius)])
        if value not in out:
            out.append(value)
        if len(out) >= 20:
            break
    return out


def asset_name(url: str, content_type: str | None) -> str:
    path = urlparse(url).path
    suffix = Path(path).suffix.lower()
    if not suffix:
        mapping = {
            "image/jpeg": ".jpg", "image/png": ".png", "image/webp": ".webp",
            "image/gif": ".gif", "application/javascript": ".js", "text/javascript": ".js",
            "application/json": ".json", "text/css": ".css",
        }
        suffix = mapping.get((content_type or "").split(";")[0].lower(), ".bin")
    return hashlib.sha256(url.encode()).hexdigest()[:20] + suffix


def main() -> int:
    report: dict[str, Any] = {"pages": [], "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())}
    all_urls: set[str] = set()
    for index, page_url in enumerate(PAGES, 1):
        rec: dict[str, Any] = {"url": page_url}
        try:
            response = S.get(page_url, timeout=35, allow_redirects=True)
            html = response.text
            (OUT / f"page-{index}.html").write_text(html, encoding="utf-8", errors="replace")
            rec.update({
                "statusCode": response.status_code,
                "finalUrl": response.url,
                "contentType": response.headers.get("Content-Type"),
                "length": len(html),
                "keywordSnippets": {kw: snippets(html, kw) for kw in KEYWORDS if re.search(re.escape(kw), html, re.I)},
            })
            soup = BeautifulSoup(html, "html.parser")
            rec["title"] = soup.title.get_text(" ", strip=True) if soup.title else None
            rec["meta"] = {m.get("property") or m.get("name"): m.get("content") for m in soup.find_all("meta") if (m.get("property") or m.get("name")) and m.get("content")}
            page_assets: list[str] = []
            for tag in soup.find_all(["img", "script", "link", "source", "video"]):
                values = [tag.get("src"), tag.get("href"), tag.get("data-src"), tag.get("data-original"), tag.get("poster")]
                srcset = tag.get("srcset")
                if srcset:
                    values.extend(part.strip().split(" ")[0] for part in srcset.split(","))
                for raw in values:
                    if not raw or raw.startswith(("data:", "javascript:")):
                        continue
                    url = urljoin(response.url, raw)
                    if url not in page_assets:
                        page_assets.append(url)
                        all_urls.add(url)
            # Extract URL-like strings from inline state and scripts.
            for match in re.finditer(r"https?:\\?/\\?/[^\"'<>\\s]+", html):
                raw = match.group(0).replace("\\/", "/").rstrip("\\,})]")
                if raw not in page_assets:
                    page_assets.append(raw)
                    all_urls.add(raw)
            rec["assetUrls"] = page_assets[:1000]
        except Exception as exc:
            rec["error"] = f"{type(exc).__name__}: {exc}"
        report["pages"].append(rec)

    downloaded: list[dict[str, Any]] = []
    for index, url in enumerate(sorted(all_urls), 1):
        if index > 500:
            break
        try:
            response = S.get(url, timeout=25, allow_redirects=True, headers={"Referer": PAGES[0]})
            content_type = response.headers.get("Content-Type")
            name = asset_name(url, content_type)
            path = ASSETS / name
            body = response.content
            if len(body) <= 15_000_000:
                path.write_bytes(body)
            text_preview = ""
            if any(x in (content_type or "").lower() for x in ("text", "json", "javascript", "xml")):
                text = response.text
                text_preview = "\n".join(snippets(text, kw, 500)[0] for kw in KEYWORDS if snippets(text, kw, 500))[:12000]
            downloaded.append({
                "url": url,
                "statusCode": response.status_code,
                "finalUrl": response.url,
                "contentType": content_type,
                "bytes": len(body),
                "savedAs": str(path.relative_to(OUT)) if path.exists() else None,
                "keywordPreview": text_preview,
            })
        except Exception as exc:
            downloaded.append({"url": url, "error": f"{type(exc).__name__}: {exc}"})
        time.sleep(0.08)
    report["downloadedAssets"] = downloaded
    dump("report.json", report)
    print(json.dumps({"pageCount": len(report["pages"]), "assetCount": len(downloaded)}, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
