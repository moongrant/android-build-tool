#!/usr/bin/env python3
"""Bounded, read-only Pospal endpoint probe.

The probe uses one already-public Fansibote Fuzhongfu store identifier only to
understand how the read API behaves when projectUid is omitted and whether the
same merchant exposes a project/store catalog. It never authenticates, creates,
updates, reserves, pays, or cancels anything.
"""
from __future__ import annotations

import json
import os
import time
from pathlib import Path
from typing import Any

import requests

OUT = Path(os.environ.get("FSB_POSPAL_OUT", "research/fsb-interface-discovery/pospal-results"))
OUT.mkdir(parents=True, exist_ok=True)
BASE = "https://wxservice-stg48.pospal.cn"
STORE_ID = "6038652"  # Public Fuzhongfu seed only, not relabelled as either target.
DATE = os.environ.get("FSB_PROBE_DATE", time.strftime("%Y-%m-%d"))
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/144.0.0.0 Safari/537.36",
    "Accept": "*/*",
    "Content-Type": "application/json",
})

SENSITIVE_HEADERS = {"set-cookie", "cookie", "authorization", "x-api-key"}


def write_json(name: str, value: Any) -> None:
    (OUT / name).write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def safe_headers(headers: requests.structures.CaseInsensitiveDict[str]) -> dict[str, str]:
    return {k: v for k, v in headers.items() if k.lower() not in SENSITIVE_HEADERS}


def request(label: str, method: str, path: str, *, body: Any = None, store_header: str | None = STORE_ID) -> dict[str, Any]:
    headers: dict[str, str] = {}
    if store_header is not None:
        headers["STOREID"] = str(store_header)
    started = time.time()
    rec: dict[str, Any] = {"label": label, "method": method, "path": path, "requestBody": body, "storeHeader": store_header}
    try:
        response = S.request(method, BASE + path, headers=headers, json=body, timeout=20, allow_redirects=True)
        text = response.text
        rec.update({
            "statusCode": response.status_code,
            "elapsedMs": round((time.time() - started) * 1000),
            "responseHeaders": safe_headers(response.headers),
            "bodyText": text[:200_000],
        })
        try:
            rec["bodyJson"] = response.json()
        except Exception:
            pass
    except Exception as exc:
        rec.update({"error": f"{type(exc).__name__}: {exc}", "elapsedMs": round((time.time() - started) * 1000)})
    write_json(f"{label}.json", rec)
    return rec


def summarize(rec: dict[str, Any]) -> dict[str, Any]:
    payload = rec.get("bodyJson")
    summary: dict[str, Any] = {
        "label": rec.get("label"),
        "statusCode": rec.get("statusCode"),
        "elapsedMs": rec.get("elapsedMs"),
        "error": rec.get("error"),
    }
    if isinstance(payload, dict):
        summary.update({
            "successed": payload.get("successed"),
            "status": payload.get("status"),
            "errorCode": payload.get("errorCode"),
            "messages": payload.get("messages") or payload.get("message"),
        })
        result = payload.get("result")
        if isinstance(result, dict):
            summary["resultKeys"] = sorted(result.keys())
            for key in ("projects", "validClassRooms", "slots", "stores", "storeList", "items", "data"):
                value = result.get(key)
                if isinstance(value, list):
                    summary[f"{key}Count"] = len(value)
                    summary[f"{key}Preview"] = value[:10]
                elif value is not None and key in {"stores", "storeList", "data"}:
                    summary[f"{key}Preview"] = value
        elif isinstance(result, list):
            summary["resultCount"] = len(result)
            summary["resultPreview"] = result[:10]
    return summary


def main() -> int:
    records: list[dict[str, Any]] = []
    target_path = "/wxapi/AppointmentVenue/LoadValidClassRoomApptSettingV2"

    # Highest-value request variants: determine whether projectUid is optional
    # and whether the response contains every project for this merchant/store.
    variants = [
        ("availability-date-only", {"dateTime": DATE}),
        ("availability-userid-date-only", {"dateTime": DATE, "userId": int(STORE_ID)}),
        ("availability-project-null", {"dateTime": DATE, "projectUid": None}),
        ("availability-project-empty", {"dateTime": DATE, "projectUid": ""}),
        ("availability-project-zero", {"dateTime": DATE, "projectUid": "0"}),
        ("availability-no-store-header", {"dateTime": DATE}, None),
    ]
    for item in variants:
        label, body, *maybe_header = item
        store_header = maybe_header[0] if maybe_header else STORE_ID
        records.append(request(label, "POST", target_path, body=body, store_header=store_header))
        time.sleep(0.35)

    # Bounded read-only catalog candidates inferred from the existing
    # AppointmentVenue naming convention. Unknown routes generally return 404;
    # no mutating verbs or Save/Create/Update/Delete/Cancel paths are included.
    candidates = [
        "/wxapi/AppointmentVenue/LoadProjects",
        "/wxapi/AppointmentVenue/LoadValidProjects",
        "/wxapi/AppointmentVenue/LoadAppointmentProjects",
        "/wxapi/AppointmentVenue/LoadVenueProjects",
        "/wxapi/AppointmentVenue/LoadProjectSettings",
        "/wxapi/AppointmentVenue/LoadAppointmentVenueSetting",
        "/wxapi/AppointmentVenue/LoadValidClassRooms",
        "/wxapi/AppointmentVenue/LoadClassRooms",
        "/wxapi/AppointmentVenue/LoadAppointmentVenueInfo",
        "/wxapi/Store/FindStoreInfo",
        "/wxapi/Store/LoadStoreInfo",
        "/wxapi/Store/GetStoreInfo",
        "/wxapi/Store/LoadStores",
        "/wxapi/Store/LoadStoreList",
        "/wxapi/CustomerAccount/FindStoreInfo",
    ]
    body_options = [
        {"storeId": int(STORE_ID)},
        {"userId": int(STORE_ID)},
        {},
    ]
    for index, path in enumerate(candidates, 1):
        body = body_options[(index - 1) % len(body_options)]
        records.append(request(f"candidate-{index:02d}", "POST", path, body=body))
        time.sleep(0.35)

    # Passive documentation/route exposure checks.
    for index, path in enumerate([
        "/swagger/index.html",
        "/swagger/v1/swagger.json",
        "/swagger.json",
        "/openapi.json",
        "/wxapi/swagger/index.html",
    ], 1):
        records.append(request(f"docs-{index:02d}", "GET", path, body=None, store_header=None))
        time.sleep(0.25)

    summaries = [summarize(record) for record in records]
    hits: list[dict[str, Any]] = []
    for record in records:
        text = json.dumps(record.get("bodyJson", record.get("bodyText", "")), ensure_ascii=False)
        if any(term in text for term in ("沙河", "棕榈泉", "泛思博特")):
            hits.append({"label": record.get("label"), "path": record.get("path"), "terms": [term for term in ("沙河", "棕榈泉", "泛思博特") if term in text]})

    report = {
        "targetVenues": ["泛思博特沙河网球中心", "泛思博特棕榈泉网球中心"],
        "seedStoreId": STORE_ID,
        "seedStoreMeaning": "泛思博特福中福公开只读基线；不得作为目标店参数",
        "requestCount": len(records),
        "readOnlyOnly": True,
        "summaries": summaries,
        "targetNameHits": hits,
        "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    write_json("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
