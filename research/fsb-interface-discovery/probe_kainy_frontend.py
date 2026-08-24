#!/usr/bin/env python3
"""Inspect public Kainy lookup frontend assets and anonymous session behavior.

No account creation or authentication is attempted. The script only fetches
public HTML/JS and retries the documented public lookup endpoints with the
same browser-like session/cookies that the frontend receives.
"""
from __future__ import annotations

import json
import os
import re
import time
from pathlib import Path
from typing import Any
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path(os.environ.get("FSB_KAINY_OUT", "research/fsb-interface-discovery/kainy-results"))
OUT.mkdir(parents=True, exist_ok=True)
BASE = "https://open.kainy.cn"
PAGE = BASE + "/AppidQuery/"
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
})


def dump(name: str, obj: Any) -> None:
    (OUT / name).write_text(json.dumps(obj, ensure_ascii=False, indent=2), encoding="utf-8")


def public_headers(response: requests.Response) -> dict[str, str]:
    return {k: v for k, v in response.headers.items() if k.lower() not in {"set-cookie", "cookie", "authorization"}}


def request_record(label: str, method: str, url: str, **kwargs: Any) -> dict[str, Any]:
    started = time.time()
    rec: dict[str, Any] = {"label": label, "method": method, "url": url}
    try:
        r = S.request(method, url, timeout=25, allow_redirects=True, **kwargs)
        rec.update({
            "statusCode": r.status_code,
            "finalUrl": r.url,
            "elapsedMs": round((time.time() - started) * 1000),
            "headers": public_headers(r),
            "bodyText": r.text[:500_000],
        })
        try:
            rec["bodyJson"] = r.json()
        except Exception:
            pass
    except Exception as exc:
        rec.update({"error": f"{type(exc).__name__}: {exc}"})
    dump(f"{label}.json", rec)
    return rec


def main() -> int:
    page = request_record("page", "GET", PAGE, headers={"Accept": "text/html,application/xhtml+xml"})
    html = page.get("bodyText", "")
    soup = BeautifulSoup(html, "html.parser")
    asset_urls: list[str] = []
    for tag in soup.find_all(["script", "link"]):
        raw = tag.get("src") or tag.get("href")
        if not raw:
            continue
        url = urljoin(PAGE, raw)
        if urlparse(url).netloc == urlparse(BASE).netloc and url not in asset_urls:
            asset_urls.append(url)

    patterns = [
        re.compile(r"weapp-suggest", re.I),
        re.compile(r"AppidQuery", re.I),
        re.compile(r"x-api-key", re.I),
        re.compile(r"api[-_]?key", re.I),
        re.compile(r"/api/[A-Za-z0-9_?&=./-]+"),
        re.compile(r"wx[0-9a-f]{16}", re.I),
    ]
    asset_reports: list[dict[str, Any]] = []
    for index, url in enumerate(asset_urls[:30], 1):
        rec = request_record(f"asset-{index:02d}", "GET", url, headers={"Referer": PAGE, "Accept": "*/*"})
        text = rec.get("bodyText", "")
        snippets: list[str] = []
        for pattern in patterns:
            for match in pattern.finditer(text):
                start = max(0, match.start() - 180)
                end = min(len(text), match.end() + 260)
                snippet = re.sub(r"\s+", " ", text[start:end])
                if snippet not in snippets:
                    snippets.append(snippet)
                if len(snippets) >= 30:
                    break
            if len(snippets) >= 30:
                break
        asset_reports.append({
            "url": url,
            "statusCode": rec.get("statusCode"),
            "contentType": rec.get("headers", {}).get("Content-Type"),
            "length": len(text),
            "snippets": snippets,
        })

    browser_headers = {
        "Accept": "application/json, text/plain, */*",
        "Origin": BASE,
        "Referer": PAGE,
        "Sec-Fetch-Dest": "empty",
        "Sec-Fetch-Mode": "cors",
        "Sec-Fetch-Site": "same-origin",
        "X-Requested-With": "XMLHttpRequest",
    }
    names = ["泛思博特网球订场", "泛思博特", "泛思博特沙河网球中心", "泛思博特棕榈泉网球中心"]
    endpoint_results: list[dict[str, Any]] = []
    for index, name in enumerate(names, 1):
        endpoint_results.append(request_record(
            f"session-suggest-{index}", "GET", BASE + "/api/weapp-suggest",
            params={"appid": name}, headers=browser_headers,
        ))
        endpoint_results.append(request_record(
            f"session-query-{index}", "POST", BASE + "/api/AppidQuery",
            json={"appid": name}, headers={**browser_headers, "Content-Type": "application/json"},
        ))

    report = {
        "pageStatus": page.get("statusCode"),
        "pageFinalUrl": page.get("finalUrl"),
        "anonymousCookieNames": sorted(cookie.name for cookie in S.cookies),
        "assetCount": len(asset_urls),
        "assetReports": asset_reports,
        "endpointResults": [
            {
                "label": item.get("label"),
                "statusCode": item.get("statusCode"),
                "bodyJson": item.get("bodyJson"),
                "bodyText": item.get("bodyText", "")[:1000],
            }
            for item in endpoint_results
        ],
        "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
