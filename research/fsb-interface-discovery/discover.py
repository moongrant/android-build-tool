#!/usr/bin/env python3
"""Read-only discovery for Fansibote Shahe and Palm Springs interfaces."""
from __future__ import annotations

import json
import os
import re
import sys
import time
from pathlib import Path
from typing import Any

import requests

OUT = Path(os.environ.get("FSB_DISCOVERY_OUT", "research/fsb-interface-discovery/results"))
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/144.0.0.0 Safari/537.36",
    "Accept": "*/*",
})

BLOCKED_HEADERS = {"set-cookie", "cookie", "authorization", "x-api-key"}


def dump(name: str, data: Any) -> None:
    (OUT / name).write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")


def call(label: str, method: str, url: str, **kwargs: Any) -> dict[str, Any]:
    started = time.time()
    rec: dict[str, Any] = {"label": label, "method": method, "url": url}
    try:
        r = S.request(method, url, timeout=30, allow_redirects=True, **kwargs)
        text = r.text
        rec.update({
            "status": r.status_code,
            "finalUrl": r.url,
            "elapsedMs": round((time.time() - started) * 1000),
            "responseHeaders": {k: v for k, v in r.headers.items() if k.lower() not in BLOCKED_HEADERS},
            "bodyText": text[:300000],
        })
        try:
            rec["bodyJson"] = r.json()
        except Exception:
            pass
    except Exception as exc:
        rec.update({"error": f"{type(exc).__name__}: {exc}", "elapsedMs": round((time.time() - started) * 1000)})
    dump(f"{label}.json", rec)
    return rec


def appids_from(value: Any) -> set[str]:
    blob = value if isinstance(value, str) else json.dumps(value, ensure_ascii=False)
    return set(re.findall(r"wx[a-zA-Z0-9]{16}", blob))


def main() -> int:
    names = ["泛思博特网球订场", "泛思博特", "泛思博特沙河网球中心", "泛思博特棕榈泉网球中心"]
    appids: set[str] = set()
    records: list[dict[str, Any]] = []

    for i, name in enumerate(names, 1):
        for label, method, url, kwargs in [
            (f"kainy-suggest-{i}", "GET", "https://open.kainy.cn/api/weapp-suggest", {"params": {"appid": name}}),
            (f"kainy-appid-query-{i}", "POST", "https://open.kainy.cn/api/AppidQuery", {"json": {"appid": name}}),
            (f"kainy-mp-query-{i}", "GET", "https://open.kainy.cn/api/mpAppidQuery", {"params": {"appid": name}}),
        ]:
            rec = call(label, method, url, **kwargs)
            records.append(rec)
            appids |= appids_from(rec.get("bodyJson", rec.get("bodyText", "")))

    queries = [
        '"泛思博特网球订场"',
        '"泛思博特网球订场" appid',
        '"泛思博特沙河网球中心" STOREID projectUid pospal',
        '"泛思博特棕榈泉网球中心" STOREID projectUid pospal',
    ]
    for i, q in enumerate(queries, 1):
        for engine, url, key in [("bing", "https://www.bing.com/search", "q"), ("baidu", "https://www.baidu.com/s", "wd")]:
            rec = call(f"search-{engine}-{i}", "GET", url, params={key: q})
            records.append(rec)
            appids |= appids_from(rec.get("bodyText", ""))

    # Connectivity/schema baseline only. These identifiers are explicitly 福中福,
    # never Shahe or Palm Springs.
    baseline = call(
        "pospal-fuzhongfu-readonly-baseline",
        "POST",
        "https://wxservice-stg48.pospal.cn/wxapi/AppointmentVenue/LoadValidClassRoomApptSettingV2",
        headers={"STOREID": "6038652", "Content-Type": "application/json"},
        json={"dateTime": time.strftime("%Y-%m-%d"), "projectUid": "1775556129325750199"},
    )
    records.append(baseline)

    for appid in sorted(appids):
        for i, q in enumerate([appid, f'"{appid}" pospal', f'"{appid}" STOREID', f'"{appid}" projectUid'], 1):
            records.append(call(f"appid-search-{appid}-{i}", "GET", "https://www.bing.com/search", params={"q": q}))

    summary = {
        "targetVenues": ["泛思博特沙河网球中心", "泛思博特棕榈泉网球中心"],
        "excludedVenue": "泛思博特福中福",
        "foundAppids": sorted(appids),
        "recordCount": len(records),
        "readOnlyOnly": True,
        "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    dump("summary.json", summary)
    print(json.dumps(summary, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    sys.exit(main())
