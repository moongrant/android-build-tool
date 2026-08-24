#!/usr/bin/env python3
"""Search Sourcegraph public index for Pospal API routes and target venue strings."""
from __future__ import annotations

import json
import os
import time
from pathlib import Path
from typing import Any

import requests

OUT = Path(os.environ.get("FSB_SOURCEGRAPH_OUT", "research/fsb-interface-discovery/sourcegraph-results"))
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (compatible; FSBReadOnlyResearch/1.0)",
    "Accept": "text/event-stream",
})

QUERIES = [
    'context:global patternType:literal "PSPLVISITORID"',
    'context:global patternType:literal "PSPLVISITORAUTO"',
    'context:global patternType:literal "POSPALSTOREMODE"',
    'context:global patternType:literal "LoadValidClassRoomApptSettingV2"',
    'context:global patternType:literal "AppointmentVenue/LoadClassRooms"',
    'context:global patternType:literal "wxservice-stg48.pospal.cn"',
    'context:global patternType:literal "customeraccount/Auth"',
    'context:global patternType:literal "FindLoginInfo" "pospal"',
    'context:global patternType:literal "reloginToken" "wxapi"',
    'context:global patternType:literal "LoadStoreList" "wxapi"',
    'context:global patternType:literal "FindStoreList" "wxapi"',
    'context:global patternType:literal "SwitchStore" "wxapi"',
    'context:global patternType:literal "NearStore" "wxapi"',
    'context:global patternType:literal "门店" "PSPLVISITORID"',
    'context:global patternType:literal "切换门店" "wxapi"',
    'context:global patternType:literal "泛思博特沙河网球中心"',
    'context:global patternType:literal "泛思博特棕榈泉网球中心"',
    'context:global patternType:literal "泛思博特网球订场"',
]


def dump(name: str, value: Any) -> None:
    (OUT / name).write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def parse_sse(text: str) -> list[dict[str, Any]]:
    events: list[dict[str, Any]] = []
    current_event = "message"
    data_lines: list[str] = []
    for raw_line in text.splitlines() + [""]:
        line = raw_line.rstrip("\r")
        if not line:
            if data_lines:
                payload_text = "\n".join(data_lines)
                try:
                    payload: Any = json.loads(payload_text)
                except Exception:
                    payload = payload_text
                events.append({"event": current_event, "data": payload})
            current_event = "message"
            data_lines = []
            continue
        if line.startswith("event:"):
            current_event = line[6:].strip()
        elif line.startswith("data:"):
            data_lines.append(line[5:].lstrip())
    return events


def compact(events: list[dict[str, Any]]) -> dict[str, Any]:
    result: dict[str, Any] = {"matches": [], "progress": [], "alerts": []}
    for event in events:
        kind = event.get("event")
        data = event.get("data")
        if kind == "matches" and isinstance(data, list):
            for item in data:
                if not isinstance(item, dict):
                    continue
                compact_item = {
                    "type": item.get("type"),
                    "repository": item.get("repository"),
                    "path": item.get("path"),
                    "commit": item.get("commit"),
                    "url": item.get("url"),
                }
                if "lineMatches" in item:
                    compact_item["lineMatches"] = item.get("lineMatches")
                if "chunkMatches" in item:
                    compact_item["chunkMatches"] = item.get("chunkMatches")
                result["matches"].append(compact_item)
        elif kind == "progress":
            result["progress"].append(data)
        elif kind in {"alert", "error"}:
            result["alerts"].append({"event": kind, "data": data})
    result["matchCount"] = len(result["matches"])
    return result


def main() -> int:
    report: dict[str, Any] = {"queries": {}, "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())}
    for index, query in enumerate(QUERIES, 1):
        started = time.time()
        rec: dict[str, Any] = {"query": query}
        try:
            response = S.get(
                "https://sourcegraph.com/.api/search/stream",
                params={"q": query, "v": "V3", "display": "short"},
                timeout=60,
                allow_redirects=True,
            )
            text = response.text
            events = parse_sse(text)
            rec.update({
                "statusCode": response.status_code,
                "elapsedMs": round((time.time() - started) * 1000),
                "finalUrl": response.url,
                "result": compact(events),
                "rawPreview": text[:3000],
            })
        except Exception as exc:
            rec.update({"error": f"{type(exc).__name__}: {exc}", "elapsedMs": round((time.time() - started) * 1000)})
        dump(f"query-{index:02d}.json", rec)
        report["queries"][query] = rec
        time.sleep(0.4)
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
