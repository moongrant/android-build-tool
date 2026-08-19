from __future__ import annotations

import asyncio
import hashlib
import json
import re
import time
from collections import defaultdict
from pathlib import Path
from urllib.parse import parse_qs, quote, urljoin, urlparse

import aiohttp
import requests
from bs4 import BeautifulSoup
from playwright.async_api import async_playwright

OUT = Path("artifacts/pro-yalla-three-rich/root-probe")
OUT.mkdir(parents=True, exist_ok=True)
UA = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36"

ACTIVITIES = {
    "sweet-love-2024": {
        "years": [2023, 2024, 2025],
        "tokens": [
            "sweetLove", "SweetLove", "sweetlove", "sweet_love", "Sweet_Love", "sweet-love", "Sweet-Love",
            "sweetLove2024", "SweetLove2024", "sweetLoveV2", "SweetLoveV2", "sweetMoment", "SweetMoment",
            "loveMoment", "LoveMoment", "loveChallenge", "LoveChallenge", "sweetValentine", "SweetValentine",
            "valentineLove", "ValentineLove", "valentine", "Valentine", "love2024", "Love2024", "cpLove",
            "CPLove", "coupleLove", "CoupleLove", "sweetCP", "SweetCP", "romanticMoment", "RomanticMoment",
        ],
        "event_ids": ["6475700703", "240207", "20240207", "202402", "2402", "2024020718", "20240218"],
        "keywords": ["sweet love", "sweet moment", "love point", "romance", "couple", "team up"],
    },
    "lucky-carnival-2024": {
        "years": [2023, 2024, 2025],
        "tokens": [
            "luckyCarnival", "LuckyCarnival", "luckycarnival", "lucky_carnival", "Lucky_Carnival",
            "lucky-carnival", "Lucky-Carnival", "luckyCarnival2024", "LuckyCarnival2024",
            "luckyCarnivalV2", "LuckyCarnivalV2", "luckyMoment", "LuckyMoment", "luckyFestival",
            "LuckyFestival", "prizePool", "PrizePool", "poolUpgrade", "PoolUpgrade", "luckyPool", "LuckyPool",
            "carnivalLucky", "CarnivalLucky", "carnival", "Carnival", "luckyParty", "LuckyParty",
            "luckyDraw", "LuckyDraw", "fortuneCarnival", "FortuneCarnival",
        ],
        "event_ids": ["6737220863", "241022", "20241022", "202410", "2410", "2024102228", "20241028"],
        "keywords": ["lucky carnival", "prize pool", "upgrade the prize", "lucky moment", "abundant rewards"],
    },
    "treasure-tycoon-2026": {
        "years": [2025, 2026],
        "tokens": [
            "treasureTycoon", "TreasureTycoon", "treasuretycoon", "treasure_tycoon", "Treasure_Tycoon",
            "treasure-tycoon", "Treasure-Tycoon", "treasureTycoon2026", "TreasureTycoon2026", "wealthPath",
            "WealthPath", "treasureHunt", "TreasureHunt", "luckyTreasure", "LuckyTreasure", "wealthTycoon",
            "WealthTycoon", "treasureKing", "TreasureKing", "tycoonTreasure", "TycoonTreasure", "treasure",
            "Treasure", "tycoon", "Tycoon", "wealthRoad", "WealthRoad", "fortunePath", "FortunePath",
        ],
        "event_ids": ["1021917730722093", "260811", "20260811", "202608", "2608", "2026081117", "20260817"],
        "keywords": ["treasure tycoon", "wealth path", "treasure hunt ticket", "random treasure", "tycoon"],
    },
}

HOSTS = [
    "https://activity2.yalla.live",
    "http://activity2.yalla.live",
    "https://activitytest2.yallalive.cn",
    "http://activitytest2.yallalive.cn",
]

GENERIC_MARKERS = [
    "the activity has ended", "more coming soon", "activityover", "attention required",
    "sorry, you have been blocked", "404 not found", "temporarily offline", "rate limit reached",
    "access denied", "page not found", "requested url was not found",
]


def build_hypotheses() -> list[dict]:
    rows: list[dict] = []
    for activity, cfg in ACTIVITIES.items():
        for year in cfg["years"]:
            for token in cfg["tokens"]:
                paths = [
                    f"/activity/{year}dist/{token}/",
                    f"/activity/{year}dist/{token}/index.html",
                    f"/activity/YallaActivity{year}/{token}/",
                    f"/activity/YallaActivity{year}/{token}/index.html",
                    f"/activity/{year}/{token}/",
                    f"/activity/{token}/",
                    f"/activity/dist/{year}/{token}/",
                ]
                for host in HOSTS:
                    for path in paths:
                        rows.append({
                            "activity": activity,
                            "kind": "dedicated-root",
                            "url": host + path,
                            "token": token,
                            "year": year,
                        })
    template_names = [
        "templateActivity", "TemplateActivity", "generalTemplate", "GeneralTemplate",
        "template", "Template", "activityTemplate", "ActivityTemplate",
    ]
    for activity, cfg in ACTIVITIES.items():
        for activity_id in cfg["event_ids"]:
            for year in [2023, 2024, 2025, 2026]:
                for host in HOSTS:
                    for template_name in template_names:
                        base = f"{host}/activity/{year}dist/{template_name}/"
                        for param in ["activityId", "activityid", "id", "activity_id"]:
                            rows.append({
                                "activity": activity,
                                "kind": "template-id",
                                "url": f"{base}?{param}={activity_id}",
                                "activity_id": activity_id,
                            })
    return rows


async def fetch_one(session: aiohttp.ClientSession, row: dict, semaphore: asyncio.Semaphore) -> dict:
    async with semaphore:
        rec = dict(row)
        try:
            timeout = aiohttp.ClientTimeout(total=35)
            async with session.get(row["url"], allow_redirects=True, timeout=timeout, ssl=False) as response:
                body = await response.read()
                text = body[:250000].decode("utf-8", "ignore")
                soup = BeautifulSoup(text, "html.parser")
                refs: list[str] = []
                for tag, attr in [("script", "src"), ("link", "href"), ("img", "src"), ("source", "src")]:
                    for element in soup.find_all(tag):
                        value = element.get(attr)
                        if value:
                            refs.append(urljoin(str(response.url), value))
                lower = text.lower()
                title = soup.title.get_text(strip=True) if soup.title else ""
                visible = re.sub(r"\s+", " ", soup.get_text(" ", strip=True))[:2000]
                rec.update(
                    status=response.status,
                    final_url=str(response.url),
                    bytes=len(body),
                    ctype=response.headers.get("content-type"),
                    sha256=hashlib.sha256(body).hexdigest(),
                    title=title,
                    visible_text=visible,
                    refs=refs[:300],
                    generic=any(marker in lower or marker in visible.lower() for marker in GENERIC_MARKERS),
                )
                rec["spa_signals"] = sum(
                    1 for signal in [
                        "chunk-vendors", "js/app.", "css/app.", "webpack", "__webpack", "vue", "react",
                        "manifest.json", "axios.min.js", "vue.runtime.global", "jsencrypt.min.js",
                    ] if signal in lower or any(signal in ref.lower() for ref in refs)
                )
                keywords = ACTIVITIES[row["activity"]]["keywords"]
                rec["keyword_hits"] = [keyword for keyword in keywords if keyword in (lower + " " + visible.lower())]
                rec["promising"] = bool(
                    response.status == 200
                    and len(body) > 700
                    and not rec["generic"]
                    and (rec["spa_signals"] >= 1 or len(refs) >= 3)
                )
        except Exception as exc:
            rec["error"] = repr(exc)
            rec["promising"] = False
        return rec


async def probe_http(rows: list[dict]) -> list[dict]:
    connector = aiohttp.TCPConnector(limit=100, ssl=False)
    semaphore = asyncio.Semaphore(70)
    headers = {
        "User-Agent": UA,
        "Accept-Language": "en-US,en;q=.9",
        "Accept": "text/html,application/xhtml+xml,application/json;q=.9,*/*;q=.8",
    }
    async with aiohttp.ClientSession(connector=connector, headers=headers) as session:
        return await asyncio.gather(*(fetch_one(session, row, semaphore) for row in rows))


def request_json_or_text(session: requests.Session, url: str, timeout=(15, 75)) -> dict:
    row = {"url": url}
    try:
        response = session.get(url, timeout=timeout, allow_redirects=True)
        row.update(
            status=response.status_code,
            final_url=response.url,
            bytes=len(response.content),
            ctype=response.headers.get("content-type"),
            body=response.text[:2_000_000],
        )
    except Exception as exc:
        row["error"] = repr(exc)
    return row


def query_public_indexes() -> list[dict]:
    session = requests.Session()
    session.headers.update({"User-Agent": "curl/8.0", "Accept": "*/*"})
    queries: list[dict] = []

    # Broad yearly CDX inventories can reveal root names that no keyword guess catches.
    for year in [2023, 2024, 2025, 2026]:
        wildcard = f"https://activity2.yalla.live/activity/{year}dist/*"
        queries.append({
            "activity": "all",
            "source": "wayback-year-cdx",
            "year": year,
            "url": "https://web.archive.org/cdx/search/cdx?"
            + f"url={quote(wildcard, safe='')}&output=json&"
            + "fl=timestamp,original,statuscode,mimetype,digest,length&"
            + "filter=statuscode:200&collapse=urlkey&limit=50000",
        })
        queries.append({
            "activity": "all",
            "source": "arquivo-year-cdx",
            "year": year,
            "url": "https://arquivo.pt/wayback/cdx?"
            + f"url={quote(wildcard, safe='')}&output=json&"
            + "fl=timestamp,original,statuscode,mimetype,digest,length&"
            + "filter=statuscode:200&collapse=urlkey&limit=50000",
        })

    for activity, cfg in ACTIVITIES.items():
        for token in cfg["tokens"][:18]:
            for year in cfg["years"]:
                prefix = f"https://activity2.yalla.live/activity/{year}dist/{token}/"
                queries.extend([
                    {
                        "activity": activity,
                        "source": "wayback-timemap",
                        "token": token,
                        "year": year,
                        "url": f"https://web.archive.org/web/timemap/json?url={quote(prefix, safe='')}",
                    },
                    {
                        "activity": activity,
                        "source": "wayback-prefix-cdx",
                        "token": token,
                        "year": year,
                        "url": "https://web.archive.org/cdx/search/cdx?"
                        + f"url={quote(prefix + '*', safe='')}&output=json&"
                        + "fl=timestamp,original,statuscode,mimetype,digest,length&"
                        + "filter=statuscode:200&collapse=urlkey&limit=5000",
                    },
                    {
                        "activity": activity,
                        "source": "arquivo-textsearch-version",
                        "token": token,
                        "year": year,
                        "url": f"https://arquivo.pt/textsearch?versionHistory={quote(prefix, safe='')}&maxItems=500",
                    },
                ])
        for phrase in [activity, activity.replace("-", " "), activity.replace("-", "")]:
            queries.extend([
                {
                    "activity": activity,
                    "source": "urlscan-search",
                    "url": f"https://urlscan.io/api/v1/search/?q={quote('domain:activity2.yalla.live AND ' + phrase)}&size=10000",
                },
                {
                    "activity": activity,
                    "source": "arquivo-textsearch",
                    "url": f"https://arquivo.pt/textsearch?q={quote(phrase + ' yalla')}&maxItems=500",
                },
            ])

    queries.append({
        "activity": "all",
        "source": "urlscan-domain",
        "url": "https://urlscan.io/api/v1/search/?q=domain:activity2.yalla.live&size=10000",
    })

    results: list[dict] = []
    seen: set[str] = set()
    for index, query in enumerate(queries):
        if query["url"] in seen:
            continue
        seen.add(query["url"])
        rec = dict(query)
        rec.update(request_json_or_text(session, query["url"]))
        results.append(rec)
        if index and index % 25 == 0:
            time.sleep(2)
    return results


def parse_index_evidence(rows: list[dict]) -> tuple[set[str], set[str], list[dict]]:
    discovered_urls: set[str] = set()
    discovered_ids: set[str] = set()
    root_evidence: list[dict] = []
    for row in rows:
        body = row.get("body", "")
        for match in re.finditer(r"https?://[^\"\s<>\\]+", body):
            url = match.group(0).rstrip("),.;\\]")
            if "yalla" in url.lower():
                discovered_urls.add(url)
            query = parse_qs(urlparse(url).query)
            for key in ["activityId", "activityid", "activity_id", "id"]:
                for value in query.get(key, []):
                    if value:
                        discovered_ids.add(value)
        for match in re.finditer(r"activity(?:Id|id|_id)(?:%3D|=|\\u003d|%253D)([A-Za-z0-9_-]{2,40})", body, re.I):
            discovered_ids.add(match.group(1))
        # Extract any direct activity paths even when JSON escaped slashes.
        normalized = body.replace("\\/", "/").replace("\\u002F", "/")
        for match in re.finditer(r"https?://activity2\.yalla\.live/activity/[^\"\s<>]+", normalized, re.I):
            discovered_urls.add(match.group(0).rstrip("),.;\\]"))
        if row.get("source", "").endswith("year-cdx") and body:
            root_evidence.append({
                "source": row.get("source"),
                "year": row.get("year"),
                "status": row.get("status"),
                "bytes": row.get("bytes"),
            })
    return discovered_urls, discovered_ids, root_evidence


async def render_promising(rows: list[dict]) -> None:
    if not rows:
        return
    async with async_playwright() as playwright:
        browser = await playwright.chromium.launch()
        for index, row in enumerate(rows[:100]):
            slug = f"{index:03d}-{row.get('activity', 'unknown')}-{hashlib.sha1(row['url'].encode()).hexdigest()[:10]}"
            folder = OUT / "renders" / slug
            folder.mkdir(parents=True, exist_ok=True)
            context = await browser.new_context(
                viewport={"width": 390, "height": 844},
                device_scale_factor=1,
                locale="en-US",
                user_agent=UA,
                record_har_path=str(folder / "page.har"),
                record_har_content="embed",
                record_har_mode="full",
            )
            page = await context.new_page()
            console: list[dict] = []
            errors: list[str] = []
            failed: list[dict] = []
            bad: list[dict] = []
            page.on(
                "console",
                lambda message, console=console: console.append({"type": message.type, "text": message.text})
                if message.type in ("error", "warning") else None,
            )
            page.on("pageerror", lambda error, errors=errors: errors.append(str(error)))
            page.on("requestfailed", lambda request, failed=failed: failed.append({"url": request.url, "failure": request.failure}))
            page.on("response", lambda response, bad=bad: bad.append({"url": response.url, "status": response.status}) if response.status >= 400 else None)
            qa: dict = {"input_url": row["url"], "source_row": row}
            try:
                await page.goto(row["url"], wait_until="domcontentloaded", timeout=90_000)
                await page.wait_for_timeout(10_000)
                height = await page.evaluate("document.documentElement.scrollHeight")
                for y in range(0, max(height, 844) + 844, 560):
                    await page.evaluate("(value) => window.scrollTo(0, value)", y)
                    await page.wait_for_timeout(120)
                await page.evaluate("window.scrollTo(0, 0)")
                await page.wait_for_timeout(300)
                await page.screenshot(path=str(folder / "full.png"), full_page=True)
                (folder / "dom.html").write_text(await page.content(), errors="ignore")
                body_text = await page.locator("body").inner_text()
                (folder / "text.txt").write_text(body_text, errors="ignore")
                qa.update(
                    final_url=page.url,
                    title=await page.title(),
                    height=await page.evaluate("document.documentElement.scrollHeight"),
                    width=await page.evaluate("document.documentElement.scrollWidth"),
                    body_text=body_text[:10_000],
                )
            except Exception as exc:
                qa["error"] = repr(exc)
            qa.update(console=console, page_errors=errors, failed_requests=failed, bad_responses=bad)
            (folder / "qa.json").write_text(json.dumps(qa, ensure_ascii=False, indent=2))
            await context.close()
        await browser.close()


def main() -> None:
    hypotheses = build_hypotheses()
    print(f"HTTP hypotheses: {len(hypotheses)}", flush=True)
    direct_results = asyncio.run(probe_http(hypotheses))
    (OUT / "direct-probe.json").write_text(json.dumps(direct_results, ensure_ascii=False, indent=2))

    index_results = query_public_indexes()
    (OUT / "public-index-results.json").write_text(json.dumps(index_results, ensure_ascii=False, indent=2))
    discovered_urls, discovered_ids, root_evidence = parse_index_evidence(index_results)
    (OUT / "discovered-urls.txt").write_text("\n".join(sorted(discovered_urls)))
    (OUT / "discovered-activity-ids.txt").write_text("\n".join(sorted(discovered_ids)))
    (OUT / "root-evidence.json").write_text(json.dumps(root_evidence, ensure_ascii=False, indent=2))

    extra: list[dict] = []
    for url in sorted(discovered_urls):
        if "activity2.yalla.live/activity/" in url and len(url) < 600:
            extra.append({"activity": "unknown", "kind": "index-discovered-url", "url": url})
    for activity_id in sorted(discovered_ids):
        for year in [2023, 2024, 2025, 2026]:
            for template_name in ["templateActivity", "generalTemplate"]:
                extra.append({
                    "activity": "unknown",
                    "kind": "index-discovered-id",
                    "activity_id": activity_id,
                    "url": f"https://activity2.yalla.live/activity/{year}dist/{template_name}/?activityId={activity_id}",
                })
    extra_results = asyncio.run(probe_http(extra[:8000])) if extra else []
    (OUT / "index-discovered-probe.json").write_text(json.dumps(extra_results, ensure_ascii=False, indent=2))

    promising = [row for row in direct_results + extra_results if row.get("promising")]
    unique: list[dict] = []
    seen: set[tuple] = set()
    for row in promising:
        key = (row.get("final_url"), row.get("sha256"))
        if key in seen:
            continue
        seen.add(key)
        unique.append(row)
    promising = unique
    (OUT / "promising-shells.json").write_text(json.dumps(promising, ensure_ascii=False, indent=2))
    asyncio.run(render_promising(promising))

    status_counts: dict[str, dict] = defaultdict(lambda: defaultdict(int))
    for row in direct_results:
        status_counts[row.get("activity", "unknown")][str(row.get("status", row.get("error", "error")))] += 1

    report = [
        "# Pro-Yalla root and archive probe",
        "",
        f"Direct HTTP hypotheses: {len(hypotheses)}",
        f"Public index queries: {len(index_results)}",
        f"Discovered Yalla URLs: {len(discovered_urls)}",
        f"Discovered activity IDs: {len(discovered_ids)}",
        f"Unique promising SPA shells: {len(promising)}",
        "",
        "## Acceptance boundary",
        "",
        "A 200 response is not enough. Generic ended pages, 404 shells, Cloudflare pages, and template shells with unverified IDs are rejected. A candidate is not accepted as one of the three campaigns until its rendered artwork, strings, date range, and modules match the campaign.",
        "",
    ]
    if promising:
        report.extend(["|#|Campaign hint|Kind|HTTP|Bytes|Title|Keyword hits|URL|", "|---:|---|---|---:|---:|---|---|---|"])
        for index, row in enumerate(promising):
            report.append(
                f"|{index}|{row.get('activity')}|{row.get('kind')}|{row.get('status')}|{row.get('bytes')}|{row.get('title')}|{', '.join(row.get('keyword_hits', []))}|`{row.get('url')}`|"
            )
    else:
        report.append("No candidate passed the SPA-shell threshold in this pass.")
    report.extend(["", "## Direct probe status counts", "", "```json", json.dumps(status_counts, indent=2), "```"])
    (OUT / "REPORT.md").write_text("\n".join(report), encoding="utf-8")


if __name__ == "__main__":
    main()
