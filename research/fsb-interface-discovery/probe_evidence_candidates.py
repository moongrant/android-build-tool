#!/usr/bin/env python3
"""Probe only evidence-derived public FSB store candidates.

Candidate 6003753 appears in the public Fuzhongfu availability response as the
customer-photo account owner. It may be a shared/main FSB Pospal user. This is
not a numeric range scan. Requests are read-only and bounded.
"""
from __future__ import annotations

import json
import os
import time
from pathlib import Path
from typing import Any

import requests

OUT = Path(os.environ.get("FSB_CANDIDATE_OUT", "research/fsb-interface-discovery/candidate-results"))
OUT.mkdir(parents=True, exist_ok=True)
BASE = "https://wxservice-stg48.pospal.cn"
DATE = os.environ.get("FSB_PROBE_DATE", time.strftime("%Y-%m-%d"))
CANDIDATES = [
    {
        "storeId": "6003753",
        "evidence": "Public Fuzhongfu response uses customerphoto/6003753/... for FSB members",
    }
]
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/144.0.0.0 Safari/537.36",
    "Accept": "*/*",
    "Content-Type": "application/json",
})


def dump(name: str, obj: Any) -> None:
    (OUT / name).write_text(json.dumps(obj, ensure_ascii=False, indent=2), encoding="utf-8")


def post(store_id: str, path: str, body: dict[str, Any]) -> dict[str, Any]:
    started = time.time()
    rec: dict[str, Any] = {"storeId": store_id, "path": path, "requestBody": body}
    try:
        response = S.post(BASE + path, headers={"STOREID": store_id}, json=body, timeout=25)
        rec.update({
            "statusCode": response.status_code,
            "elapsedMs": round((time.time() - started) * 1000),
            "bodyText": response.text[:500_000],
        })
        try:
            rec["bodyJson"] = response.json()
        except Exception:
            pass
    except Exception as exc:
        rec["error"] = f"{type(exc).__name__}: {exc}"
    return rec


def summarize(rec: dict[str, Any]) -> dict[str, Any]:
    payload = rec.get("bodyJson")
    result: dict[str, Any] = {
        "storeId": rec.get("storeId"),
        "path": rec.get("path"),
        "statusCode": rec.get("statusCode"),
        "elapsedMs": rec.get("elapsedMs"),
        "error": rec.get("error"),
    }
    if not isinstance(payload, dict):
        result["bodyPreview"] = rec.get("bodyText", "")[:1000]
        return result
    result.update({
        "successed": payload.get("successed"),
        "status": payload.get("status"),
        "errorCode": payload.get("errorCode"),
        "messages": payload.get("messages") or payload.get("message"),
    })
    body = payload.get("result")
    if isinstance(body, dict):
        result["resultKeys"] = sorted(body.keys())
        for key in ("projects", "validClassRooms", "slots", "classrooms", "enrollSlots"):
            value = body.get(key)
            if isinstance(value, list):
                result[f"{key}Count"] = len(value)
                result[f"{key}Preview"] = value[:30]
    return result


def main() -> int:
    records: list[dict[str, Any]] = []
    for candidate in CANDIDATES:
        store_id = candidate["storeId"]
        availability = post(
            store_id,
            "/wxapi/AppointmentVenue/LoadValidClassRoomApptSettingV2",
            {"dateTime": DATE},
        )
        availability["evidence"] = candidate["evidence"]
        records.append(availability)
        time.sleep(0.8)
        rooms = post(
            store_id,
            "/wxapi/AppointmentVenue/LoadClassRooms",
            {"userId": int(store_id)},
        )
        rooms["evidence"] = candidate["evidence"]
        records.append(rooms)

    report = {
        "bounded": True,
        "numericRangeScan": False,
        "targetNames": ["泛思博特沙河网球中心", "泛思博特棕榈泉网球中心"],
        "records": records,
        "summaries": [summarize(record) for record in records],
        "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
