#!/usr/bin/env python3
"""Search public code indexes for Pospal mini-program store discovery routes."""
from __future__ import annotations

import json
import os
import time
from pathlib import Path
from typing import Any
from urllib.parse import quote

import requests

OUT = Path(os.environ.get("FSB_CODE_SEARCH_OUT", "research/fsb-interface-discovery/code-search-results"))
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (compatible; FSBReadOnlyResearch/1.0)",
    "Accept": "application/json,text/event-stream,*/*",
})

QUERIES = [
    "PSPLVISITORID",
    "PSPLVISITORAUTO",
    "POSPALSTOREMODE",
    "wxservice-stg48.pospal.cn",
    "LoadValidClassRoomApptSettingV2",
    "AppointmentVenue/LoadClassRooms",
    "customeraccount/Auth",
    "FindLoginInfo",
    "reloginToken",
    "storeList PSPLVISITORID",
    "storeId POSPALSTOREMODE",
    "LoadStoreList wxapi",
    "FindStoreList wxapi",
    "SwitchStore wxapi",
    "NearStore wxapi",
    "FindNearStore wxapi",
    "LoadStores wxapi",
    "merchantStores pospal",
    "门店 PSPLVISITORID",
    "门店 POSPALSTOREMODE",
    "切换门店 wxapi",
]


def dump(name: str, value: Any) -> None:
    (OUT / name).write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def fetch_json(label: str, url: str) -> dict[str, Any]:
    started = time.time()
    rec: dict[str, Any] = {"label": label, "url": url}
    try:
        response = S.get(url, timeout=30, allow_redirects=True)
        rec.update({
            "statusCode": response.status_code,
            "finalUrl": response.url,
            "elapsedMs": round((time.time() - started) * 1000),
            "bodyText": response.text[:1_000_000],
        })
        try:
            rec["bodyJson"] = response.json()
        except Exception:
            pass
    except Exception as exc:
        rec["error"] = f"{type(exc).__name__}: {exc}"
    dump(f"{label}.json", rec)
    return rec


def compact_grep(rec: dict[str, Any]) -> dict[str, Any]:
    data = rec.get("bodyJson")
    result: dict[str, Any] = {"statusCode": rec.get("statusCode"), "error": rec.get("error")}
    if not isinstance(data, dict):
        result["preview"] = rec.get("bodyText", "")[:1000]
        return result
    result["time"] = data.get("time")
    result["facets"] = data.get("facets")
    hits = data.get("hits")
    if isinstance(hits, dict):
        result["total"] = hits.get("total")
        raw_hits = hits.get("hits") or []
    elif isinstance(hits, list):
        raw_hits = hits
        result["total"] = len(hits)
    else:
        raw_hits = []
    result["hits"] = []
    for hit in raw_hits[:100]:
        if not isinstance(hit, dict):
            continue
        result["hits"].append({
            "repo": hit.get("repo") or hit.get("repository"),
            "branch": hit.get("branch"),
            "path": hit.get("path"),
            "content": hit.get("content"),
            "owner_id": hit.get("owner_id"),
        })
    return result


def main() -> int:
    report: dict[str, Any] = {"queries": {}, "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())}
    for index, query in enumerate(QUERIES, 1):
        rec = fetch_json(f"grep-{index:02d}", f"https://api.grep.app/v1/search?q={quote(query)}")
        report["queries"][query] = compact_grep(rec)
        time.sleep(0.3)
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
