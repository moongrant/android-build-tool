from __future__ import annotations

import hashlib
import json
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from typing import Any
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path("research-results/pro-yalla-three-rich-discovery")
OUT.mkdir(parents=True, exist_ok=True)

UA = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36"
SESSION = requests.Session()
SESSION.headers.update({"User-Agent": UA, "Accept": "*/*", "Accept-Language": "en-US,en;q=0.9"})

ACTIVITIES = {
    "sweet-love-2024": {
        "from": "20240201",
        "to": "20240229",
        "terms": ["sweet love", "sweet moment", "love points", "valentine", "cp task", "cp list", "team up"],
        "path_terms": ["sweetlove", "sweetmoment", "valentine", "lovechallenge", "couple", "sweet"],
    },
    "lucky-carnival-2024": {
        "from": "20241010",
        "to": "20241110",
        "terms": ["lucky carnival", "prize pool", "upgrade the prize pool", "carnival", "lottery"],
        "path_terms": ["luckycarnival", "luckymoment", "carnival", "prizepool", "lottery"],
    },
    "treasure-tycoon-2026": {
        "from": "20260701",
        "to": "20260821",
        "terms": ["treasure tycoon", "wealth path", "lucky treasure hunt", "treasure hunt ticket", "treasure"],
        "path_terms": ["treasuretycoon", "wealthpath", "treasurehunt", "luckytreasure", "tycoon", "treasure"],
    },
}

HOSTS = [
    "activity2.yalla.live",
    "activity.yalla.live",
    "activity2.windgh.com",
    "activity.windgh.com",
]

GENERIC_MARKERS = [
    "the activity has ended",
    "activity has ended",
    "more coming soon",
    "404 not found",
    "page not found",
    "service unavailable",
    "temporarily offline",
    "cloudflare",
    "sorry, you have been blocked",
]


def get(url: str, *, params: dict[str, str] | None = None, timeout: tuple[int, int] = (20, 120), attempts: int = 4) -> requests.Response | None:
    for attempt in range(attempts):
        try:
            return SESSION.get(url, params=params, timeout=timeout, allow_redirects=True)
        except Exception:
            time.sleep(3 + attempt * 4)
    return None


def cdx_prefix(host: str, start: str, end: str) -> dict[str, Any]:
    params = {
        "url": f"{host}/activity/",
        "matchType": "prefix",
        "from": start,
        "to": end,
        "output": "json",
        "fl": "timestamp,original,mimetype,statuscode,digest,length",
        "filter": "statuscode:200",
        "collapse": "urlkey",
        "limit": "50000",
    }
    result: dict[str, Any] = {"host": host, "from": start, "to": end, "params": params, "records": []}
    response = get("https://web.archive.org/cdx/search/cdx", params=params, timeout=(30, 180), attempts=5)
    if response is None:
        result["error"] = "request failed"
        return result
    result.update(status=response.status_code, bytes=len(response.content), content_type=response.headers.get("content-type"))
    result["sample"] = response.text[:1500]
    if response.status_code == 200:
        try:
            data = response.json()
            if isinstance(data, list) and data:
                header = data[0]
                result["records"] = [dict(zip(header, row)) for row in data[1:] if len(row) == len(header)]
        except Exception as exc:
            result["parse_error"] = repr(exc)
    return result


def root_of(url: str) -> tuple[str, str, str] | None:
    parsed = urlparse(url)
    match = re.search(r"/activity/([^/?#]+dist)/([^/?#]+)/", parsed.path, re.I)
    if not match:
        return None
    return parsed.netloc, match.group(1), match.group(2)


def compact(value: str) -> str:
    return re.sub(r"[^a-z0-9]", "", value.lower())


def path_score(name: str, terms: list[str]) -> int:
    candidate = compact(name)
    return sum(25 for term in terms if compact(term) and compact(term) in candidate)


def text_score(text: str, terms: list[str]) -> int:
    low = text.lower()
    return sum(18 if " " in term else 8 for term in terms if term.lower() in low)


def html_like(record: dict[str, str]) -> bool:
    original = record.get("original", "").lower().split("?", 1)[0]
    mime = record.get("mimetype", "").lower()
    return "html" in mime or original.endswith(("/", ".html", ".htm"))


def replay(timestamp: str, original: str) -> str:
    return f"https://web.archive.org/web/{timestamp}id_/{original}"


query_summaries: list[dict[str, Any]] = []
records_by_activity: dict[str, list[dict[str, str]]] = defaultdict(list)

for slug, config in ACTIVITIES.items():
    for host in HOSTS:
        batch = cdx_prefix(host, config["from"], config["to"])
        records = batch.pop("records")
        query_summaries.append(batch | {"activity": slug, "record_count": len(records)})
        for record in records:
            record["activity"] = slug
            records_by_activity[slug].append(record)

(OUT / "cdx-query-summary.json").write_text(json.dumps(query_summaries, ensure_ascii=False, indent=2))
(OUT / "cdx-records.json").write_text(json.dumps(records_by_activity, ensure_ascii=False, indent=2))

root_maps: dict[str, dict[str, dict[str, Any]]] = defaultdict(dict)
for slug, records in records_by_activity.items():
    for record in records:
        parsed = root_of(record.get("original", ""))
        if not parsed:
            continue
        host, year, name = parsed
        key = f"{host}|{year}|{name}"
        row = root_maps[slug].setdefault(
            key,
            {
                "activity": slug,
                "host": host,
                "year": year,
                "name": name,
                "root_url": f"https://{host}/activity/{year}/{name}/",
                "counts": Counter(),
                "records": [],
                "timestamps": [],
            },
        )
        row["counts"]["all"] += 1
        original = record.get("original", "").lower().split("?", 1)[0]
        mime = record.get("mimetype", "").lower()
        if html_like(record):
            row["counts"]["html"] += 1
        if "javascript" in mime or original.endswith((".js", ".mjs")):
            row["counts"]["js"] += 1
        if "css" in mime or original.endswith(".css"):
            row["counts"]["css"] += 1
        if "image" in mime or re.search(r"\.(png|jpe?g|gif|webp|svg|avif)$", original):
            row["counts"]["images"] += 1
        row["timestamps"].append(record.get("timestamp", ""))
        if len(row["records"]) < 150:
            row["records"].append(record)

root_rows: list[dict[str, Any]] = []
for slug, roots in root_maps.items():
    config = ACTIVITIES[slug]
    for row in roots.values():
        counts = row["counts"]
        row["counts"] = dict(counts)
        row["first_capture"] = min(row["timestamps"]) if row["timestamps"] else None
        row["last_capture"] = max(row["timestamps"]) if row["timestamps"] else None
        row["archive_score"] = (
            path_score(row["name"], config["path_terms"])
            + min(counts["all"], 30)
            + min(counts["js"] * 3, 30)
            + min(counts["css"] * 2, 10)
            + min(counts["images"], 20)
            + min(counts["html"] * 5, 20)
        )
        root_rows.append(row)

root_rows.sort(key=lambda row: (-row["archive_score"], row["activity"], row["root_url"]))
(OUT / "archive-root-inventory.json").write_text(json.dumps(root_rows, ensure_ascii=False, indent=2))


def inspect_candidate(row: dict[str, Any]) -> dict[str, Any]:
    result = {key: value for key, value in row.items() if key != "records"}
    config = ACTIVITIES[row["activity"]]

    live_response = get(row["root_url"], timeout=(15, 60), attempts=3)
    if live_response is not None:
        text = live_response.text[:600000]
        soup = BeautifulSoup(text, "html.parser")
        visible = re.sub(r"\s+", " ", soup.get_text(" ", strip=True))
        refs: list[str] = []
        for tag, attr in (("script", "src"), ("link", "href"), ("img", "src"), ("source", "src")):
            for element in soup.find_all(tag):
                value = element.get(attr)
                if value:
                    refs.append(urljoin(live_response.url, value))
        result["live"] = {
            "status": live_response.status_code,
            "final_url": live_response.url,
            "bytes": len(live_response.content),
            "title": soup.title.get_text(strip=True) if soup.title else "",
            "visible_text": visible[:2500],
            "asset_refs": refs[:300],
            "asset_count": len(refs),
            "generic": any(marker in text.lower() for marker in GENERIC_MARKERS),
            "keyword_score": text_score(text + " " + visible, config["terms"]),
            "sha256": hashlib.sha256(live_response.content).hexdigest(),
        }

    archived: list[dict[str, Any]] = []
    html_records = [record for record in row.get("records", []) if html_like(record)]
    for record in html_records[:3]:
        response = get(replay(record["timestamp"], record["original"]), timeout=(20, 100), attempts=3)
        item: dict[str, Any] = {"timestamp": record["timestamp"], "original": record["original"]}
        if response is None:
            item["error"] = "request failed"
            archived.append(item)
            continue
        text = response.text[:800000]
        soup = BeautifulSoup(text, "html.parser")
        visible = re.sub(r"\s+", " ", soup.get_text(" ", strip=True))
        refs: list[str] = []
        for tag, attr in (("script", "src"), ("link", "href"), ("img", "src")):
            for element in soup.find_all(tag):
                value = element.get(attr)
                if value:
                    refs.append(urljoin(record["original"], value))
        item.update(
            status=response.status_code,
            bytes=len(response.content),
            title=soup.title.get_text(strip=True) if soup.title else "",
            visible_text=visible[:2500],
            asset_refs=refs[:300],
            asset_count=len(refs),
            keyword_score=text_score(text + " " + visible, config["terms"]),
            generic=any(marker in text.lower() for marker in GENERIC_MARKERS),
            sha256=hashlib.sha256(response.content).hexdigest(),
        )
        archived.append(item)
    result["archived"] = archived

    live_score = result.get("live", {}).get("keyword_score", 0)
    archive_score = max([item.get("keyword_score", 0) for item in archived] or [0])
    result["final_score"] = row["archive_score"] + live_score * 5 + archive_score * 6
    result["candidate_evidence"] = bool(
        live_score > 0 or archive_score > 0 or path_score(row["name"], config["path_terms"]) > 0
    )
    return result


queue: list[dict[str, Any]] = []
selected_generic = Counter()
for row in root_rows:
    direct = path_score(row["name"], ACTIVITIES[row["activity"]]["path_terms"]) > 0
    if direct or selected_generic[row["activity"]] < 80:
        queue.append(row)
        if not direct:
            selected_generic[row["activity"]] += 1

inspected: list[dict[str, Any]] = []
for index, row in enumerate(queue):
    inspected.append(inspect_candidate(row))
    if index and index % 20 == 0:
        (OUT / "candidate-inspection-partial.json").write_text(json.dumps(inspected, ensure_ascii=False, indent=2))

inspected.sort(key=lambda row: (-row["final_score"], row["activity"], row["root_url"]))
(OUT / "candidate-inspection.json").write_text(json.dumps(inspected, ensure_ascii=False, indent=2))

promising: list[dict[str, Any]] = []
for row in inspected:
    live = row.get("live", {})
    archived = row.get("archived", [])
    live_real = (
        live.get("status") == 200
        and live.get("bytes", 0) > 800
        and not live.get("generic")
        and live.get("asset_count", 0) >= 2
    )
    archived_real = any(
        item.get("status") == 200
        and item.get("bytes", 0) > 800
        and not item.get("generic")
        and item.get("asset_count", 0) >= 2
        for item in archived
    )
    if row.get("candidate_evidence") and (live_real or archived_real):
        promising.append(row)

(OUT / "promising-candidates.json").write_text(json.dumps(promising, ensure_ascii=False, indent=2))

report = ["# Pro-Yalla three rich activity discovery", ""]
report += [
    f"CDX query batches: {len(query_summaries)}",
    f"Archive roots: {len(root_rows)}",
    f"Inspected roots: {len(inspected)}",
    f"Promising candidates: {len(promising)}",
    "",
]
for slug in ACTIVITIES:
    candidates = [row for row in promising if row["activity"] == slug]
    report += [f"## {slug}", ""]
    if candidates:
        report += ["|Score|Root|Live title|Live bytes|Archive captures|", "|---:|---|---|---:|---:|"]
        for row in candidates[:20]:
            report.append(
                f"|{row['final_score']}|`{row['root_url']}`|{row.get('live', {}).get('title', '')}|"
                f"{row.get('live', {}).get('bytes', 0)}|{row.get('counts', {}).get('all', 0)}|"
            )
    else:
        report.append("No root passed the real-SPA threshold in this pass.")
        strongest = [row for row in inspected if row["activity"] == slug][:15]
        if strongest:
            report += ["", "Strongest inspected roots:"]
            for row in strongest:
                report.append(
                    f"- `{row['root_url']}` score={row['final_score']} "
                    f"captures={row.get('counts', {}).get('all', 0)} live={row.get('live', {}).get('status')}"
                )
    report.append("")
report.append("A promotional page, ended shell, 404, or single-page leaderboard is not accepted as a reconstructed H5 activity.")
(OUT / "REPORT.md").write_text("\n".join(report), encoding="utf-8")
