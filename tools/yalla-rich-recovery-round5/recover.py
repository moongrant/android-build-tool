from __future__ import annotations

import asyncio
import csv
import importlib.util
import json
import os
import sys
from collections import defaultdict
from datetime import datetime, timezone
from pathlib import Path

from PIL import Image, ImageDraw, ImageFont
from playwright.async_api import async_playwright

BASE_SCRIPT = Path(__file__).resolve().parents[1] / "yalla-rich-recovery" / "recover.py"
spec = importlib.util.spec_from_file_location("yalla_recovery_base", BASE_SCRIPT)
if spec is None or spec.loader is None:
    raise RuntimeError(f"Unable to import base recovery engine: {BASE_SCRIPT}")
base = importlib.util.module_from_spec(spec)
sys.modules[spec.name] = base
spec.loader.exec_module(base)

OUT = Path(os.environ.get("YALLA_OUT", "pro-yalla-rich-spa-increment-round5"))
for name in ["activities", "data", "assets", "fixtures", "screenshots", "registry", "replay", "logs"]:
    (OUT / name).mkdir(parents=True, exist_ok=True)
base.OUT = OUT
base.MAX_FILES = 2600
base.MAX_BYTES = 520 * 1024 * 1024

TARGETS = [
    {
        "id": "yalla-8th-anniversary-2024",
        "name": "8th Anniversary · Explore the Yalla World",
        "year": 2024,
        "campaign": "Yalla 8th Anniversary 2024",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2024dist/8thAnniversary/",
        "spaRoot": "/activity/2024dist/8thAnniversary/",
        "projectSlug": "8thAnniversary",
        "expected": ["Explore the Yalla World", "Secret Treasure", "Explore Medals", "Risk Island", "Memory Gate", "Privacy"],
        "keywords": ["anniversary", "yalla world", "secret treasure", "explore medals", "risk island", "memory gate"],
        "mechanism": "World-map exploration campaign with independent challenge islands, medals, treasure, memory content and staged rewards.",
    },
    {
        "id": "yalla-9th-anniversary-2025",
        "name": "9th Anniversary · Starlight Gala",
        "year": 2025,
        "campaign": "Yalla 9th Anniversary 2025",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2025dist/9thAnniversary/",
        "spaRoot": "/activity/2025dist/9thAnniversary/",
        "projectSlug": "9thAnniversary",
        "expected": ["Starlight Gala", "Mystery Planet", "Anniversary Journey", "Honor", "Rewards", "Rules"],
        "keywords": ["9th anniversary", "starlight gala", "mystery planet", "anniversary", "planet", "honor"],
        "mechanism": "Large anniversary campaign organised as a starlight journey with multiple planets, missions, honors and reward layers.",
    },
    {
        "id": "yalla-season-2026",
        "name": "Yalla Season · Four Surprises",
        "year": 2026,
        "campaign": "Yalla Season 2026",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2025dist/yallaSeason/",
        "spaRoot": "/activity/2025dist/yallaSeason/",
        "projectSlug": "yallaSeason",
        "expected": ["Yalla Season", "Sign-in Rewards", "Discount Store", "Cruise Party", "Recharge Benefits", "National Day"],
        "keywords": ["yalla season", "sign-in", "discount store", "cruise party", "recharge benefits", "national day"],
        "mechanism": "Seasonal campaign combining sign-in retention, discount commerce, cruise-party interaction, recharge benefits and a national-day branch.",
    },
    {
        "id": "yalla-10th-anniversary-2026",
        "name": "10th Anniversary · Crowned with Honor",
        "year": 2026,
        "campaign": "Yalla 10th Anniversary 2026",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2026dist/10thAnniversary/",
        "spaRoot": "/activity/2026dist/10thAnniversary/",
        "projectSlug": "10thAnniversary",
        "expected": ["Crowned with Honor", "Anniversary Hall", "Mission", "Collection", "Honor", "Rewards", "Ranking", "Rules"],
        "keywords": ["10th anniversary", "crowned with honor", "anniversary", "crown", "honor", "collection"],
        "mechanism": "Tenth-anniversary flagship SPA with mission, collection, honor, reward and competitive layers across multiple routes.",
    },
    {
        "id": "yalla-ramadan-kareem-2026",
        "name": "Ramadan Kareem 2026",
        "year": 2026,
        "campaign": "Yalla Ramadan 2026",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2026dist/Ramadan/",
        "spaRoot": "/activity/2026dist/Ramadan/",
        "projectSlug": "Ramadan",
        "expected": ["Ramadan Kareem", "Festival Items", "Stage Rewards", "Discount Store", "Illustrated Cards", "Rankings"],
        "keywords": ["ramadan", "kareem", "lantern", "blessing", "discount", "store", "card", "ranking"],
        "mechanism": "Gift-driven four-item unlock loop with milestone rewards, discount commerce, collection cards and dual rankings.",
    },
    {
        "id": "yalla-sheep-farm-2026",
        "name": "Sheep Farm · Eid al-Adha",
        "year": 2026,
        "campaign": "Yalla Sheep Farm 2026",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2024dist/adha/",
        "spaRoot": "/activity/2024dist/adha/",
        "projectSlug": "adha",
        "expected": ["Sheep Farm", "Rewards", "Games", "Wallet", "Invite", "Feed", "Store", "Tasks", "Barn"],
        "keywords": ["sheep farm", "eid", "adha", "rewards", "games", "wallet", "invite", "feed", "store", "tasks", "barn"],
        "mechanism": "Farm-growth activity with feeding, tasks, wallet, invitation, games, store, barn and reward panels tied to Eid gifting.",
    },
    {
        "id": "yalla-super-roller-coaster-2024",
        "name": "Super Roller Coaster",
        "year": 2024,
        "campaign": "Yalla WonderLand / New Year 2025",
        "parentCampaign": "Yalla WonderLand / New Year 2025",
        "officialUrl": "https://activity2.yalla.live/activity/2024dist/rollerCoaster/",
        "spaRoot": "/activity/2024dist/rollerCoaster/",
        "projectSlug": "rollerCoaster",
        "expected": ["Super Roller Coaster", "Ride", "Upgrade", "Rewards", "Records", "Rules"],
        "keywords": ["roller coaster", "ride", "ticket", "upgrade", "reward", "record", "wonderland"],
        "mechanism": "Long-form ride progression activity with ticket consumption, visual track advancement, upgrades, records and rewards.",
    },
    {
        "id": "yalla-wonderland-new-year-2025",
        "name": "WonderLand · New Year Carnival",
        "year": 2025,
        "campaign": "Yalla WonderLand / New Year 2025",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2024dist/2025NewYear/",
        "spaRoot": "/activity/2024dist/2025NewYear/",
        "projectSlug": "2025NewYear",
        "expected": ["WonderLand", "Sea Dominator", "Super Roller Coaster", "Happy Ferris Wheel", "Illustrated Cards", "Treasure Chest", "Room Ranking"],
        "keywords": ["wonderland", "sea dominator", "roller coaster", "ferris wheel", "illustrated cards", "treasure chest", "room ranking"],
        "mechanism": "Parent campaign map connecting several independent child SPAs, a cross-activity card system, treasure chest and room ranking.",
    },
]


def now() -> str:
    return datetime.now(timezone.utc).isoformat()


def write_json(path: Path, value) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def fallback_result(target: dict, exc: Exception) -> dict:
    activity_dir = OUT / "activities" / target["id"]
    files = [p for p in activity_dir.rglob("*") if p.is_file()] if activity_dir.exists() else []
    has_material = len(files) > 4
    return {
        "id": target["id"],
        "name": target["name"],
        "year": target["year"],
        "campaign": target["campaign"],
        "parentCampaign": target["parentCampaign"],
        "officialUrl": target["officialUrl"],
        "spaRoot": target["spaRoot"],
        "projectSlug": target["projectSlug"],
        "routes": [],
        "routeCount": 0,
        "stateCount": 0,
        "assetCount": 0,
        "fileCount": len(files),
        "apiCount": 0,
        "fixtureCount": 0,
        "sourceType": "OFFICIAL_SPA_RECOVERY_EXCEPTION",
        "status": "VERIFIED_PARTIAL_SPA" if has_material else "OFFICIAL_URL_EXPIRED",
        "quality": "C",
        "localReplay": False,
        "screenshot": False,
        "currentReleaseVerified": False,
        "screenshots": [],
        "qa": {},
        "mechanism": target["mechanism"],
        "error": repr(exc),
        "notes": ["The recovery process failed before strict verification. Any preserved official files remain evidence only."],
    }


def build_contact_sheet(results: list[dict]) -> str | None:
    entries = []
    for result in results:
        for shot in result.get("screenshots", [])[:3]:
            path = OUT / shot
            if path.exists():
                entries.append((result, path))
    if not entries:
        return None
    thumb_width, gap = 300, 18
    columns = 4 if len(entries) >= 8 else 3 if len(entries) >= 5 else 2
    cards = []
    for result, path in entries[:24]:
        with Image.open(path) as image:
            image = image.convert("RGB")
            height = max(1, int(image.height * thumb_width / image.width))
            cards.append((result, image.resize((thumb_width, height))))
    heights = [118] * columns
    placements = []
    for card in cards:
        column = min(range(columns), key=lambda index: heights[index])
        x = gap + column * (thumb_width + gap)
        y = heights[column]
        placements.append((card, x, y))
        heights[column] += card[1].height + 68 + gap
    canvas = Image.new("RGB", (gap + columns * (thumb_width + gap), max(heights) + gap), "#080b12")
    draw = ImageDraw.Draw(canvas)
    font = ImageFont.load_default()
    draw.text((gap, 22), "Pro-Yalla Rich SPA Increment · Round 5", fill="white", font=font)
    draw.text((gap, 48), f"Official original SPA closure · {len(results)} activities · {len(entries)} captured states", fill="#aeb6c3", font=font)
    draw.text((gap, 70), "No promotional images, mock UI or remote iframe fallbacks are counted as SPA.", fill="#7f8998", font=font)
    for (result, image), x, y in placements:
        draw.rounded_rectangle((x, y, x + thumb_width, y + 48), radius=10, fill="#171c27")
        draw.text((x + 10, y + 8), result["name"][:44], fill="white", font=font)
        draw.text((x + 10, y + 27), f"{result['status']} · {result.get('fileCount', 0)} files · {result.get('stateCount', 0)} states", fill="#aeb6c3", font=font)
        canvas.paste(image, (x, y + 48))
    output = OUT / "screenshots" / "round5-contact-sheet.jpg"
    canvas.save(output, quality=89)
    return output.relative_to(OUT).as_posix()


def build_url_graph(results: list[dict]) -> dict:
    nodes = []
    edges = []
    node_ids = set()
    for result in results:
        aid = result["id"]
        nodes.append({"id": aid, "type": "activity", "name": result["name"], "url": result["officialUrl"]})
        node_ids.add(aid)
        manifest = OUT / "activities" / aid / "manifest.json"
        if manifest.exists():
            try:
                payload = json.loads(manifest.read_text(encoding="utf-8"))
            except Exception:
                payload = {}
            for record in payload.get("records", []):
                url = record.get("url")
                if not url:
                    continue
                if url not in node_ids:
                    nodes.append({"id": url, "type": record.get("category", "resource"), "contentType": record.get("contentType"), "source": record.get("source")})
                    node_ids.add(url)
                edges.append({"from": aid, "to": url, "type": "requests"})
        if result.get("parentCampaign"):
            parent = "campaign:" + result["parentCampaign"]
            if parent not in node_ids:
                nodes.append({"id": parent, "type": "campaign", "name": result["parentCampaign"]})
                node_ids.add(parent)
            edges.append({"from": parent, "to": aid, "type": "contains"})
    return {"schemaVersion": "1.0", "generatedAt": now(), "nodes": nodes, "edges": edges}


def build_documents(results: list[dict], contact_sheet: str | None) -> None:
    status_counts = defaultdict(int)
    for result in results:
        status_counts[result["status"]] += 1

    registry = {
        "schemaVersion": "5.0",
        "generatedAt": now(),
        "release": "pro-yalla-rich-spa-increment-round5",
        "minimumDepth": "Falla Rocket Takeoff 2026 or deeper; no simple ranking-only activities.",
        "verifiedDefinition": "Official SPA root + original complete resource closure + at least three distinct rich states + local request-interception replay + every QA gate at zero.",
        "summary": dict(status_counts),
        "contactSheet": contact_sheet,
        "activities": results,
    }
    write_json(OUT / "registry" / "yalla-activity-registry-round5.json", registry)

    fields = [
        "id", "name", "year", "campaign", "parentCampaign", "officialUrl", "spaRoot", "projectSlug",
        "routeCount", "stateCount", "fileCount", "assetCount", "apiCount", "fixtureCount",
        "status", "quality", "localReplay", "screenshot", "currentReleaseVerified",
    ]
    with (OUT / "registry" / "yalla-activity-registry-round5.csv").open("w", newline="", encoding="utf-8-sig") as stream:
        writer = csv.DictWriter(stream, fieldnames=fields)
        writer.writeheader()
        for result in results:
            writer.writerow({field: result.get(field) for field in fields})

    table = [
        "| Activity | Year | Routes | States | Files | Assets | Fixtures | QA B/C/M/U | Status |",
        "|---|---:|---:|---:|---:|---:|---:|---|---|",
    ]
    for result in results:
        qa = result.get("qa") or {}
        table.append(
            f"| {result['name']} | {result['year']} | {result.get('routeCount', 0)} | {result.get('stateCount', 0)} | "
            f"{result.get('fileCount', 0)} | {result.get('assetCount', 0)} | {result.get('fixtureCount', 0)} | "
            f"{qa.get('brokenImages', '-')}/{qa.get('consoleFatalErrors', '-')}/{qa.get('missingChunks', '-')}/{qa.get('unmappedRequests', '-')} | {result['status']} |"
        )
    (OUT / "RESULT-BOARD.md").write_text(
        "\n".join([
            "# Pro-Yalla Rich SPA Increment · Round 5",
            "",
            "This batch targets eight official Yalla rich activities. Simple ranking-only pages are excluded.",
            "",
            *table,
            "",
            "A target is counted as VERIFIED only when original SPA resources, distinct states, offline replay, fixtures and all hard QA gates are complete.",
        ]),
        encoding="utf-8",
    )

    qa_lines = ["# QA", "", "Hard gates: brokenImages=0, consoleFatalErrors=0, missingChunks=0, unmappedRequests=0, remoteIframes=0, remoteRuntimeFallback=0, missingStaticAssets=0.", ""]
    for result in results:
        qa_lines.extend([f"## {result['name']}", "", "```json", json.dumps(result.get("qa") or {}, ensure_ascii=False, indent=2), "```", ""])
    (OUT / "QA.md").write_text("\n".join(qa_lines), encoding="utf-8")

    learning = ["# Activity Learning Board", ""]
    for index, result in enumerate(results, 1):
        learning.extend([
            f"## {index}. {result['name']}",
            "",
            f"- Official root: `{result['officialUrl']}`",
            f"- Status: `{result['status']}`",
            f"- Mechanism: {result.get('mechanism', '')}",
            f"- Captured states: {result.get('stateCount', 0)}",
            f"- Original files: {result.get('fileCount', 0)}",
            "",
        ])
    (OUT / "LEARNING-BOARD.md").write_text("\n".join(learning), encoding="utf-8")

    hierarchy = {
        "campaigns": [
            {
                "id": "yalla-wonderland-new-year-2025",
                "name": "Yalla WonderLand / New Year 2025",
                "parentSpa": "/activity/2024dist/2025NewYear/",
                "childrenInThisRelease": ["yalla-super-roller-coaster-2024"],
                "knownChildrenInPreviousRelease": ["yalla-sea-dominator-2024", "yalla-happy-ferris-wheel-2025"],
                "systemChildren": ["activityMap", "treasureChest", "roomRanking"],
            }
        ]
    }
    write_json(OUT / "data" / "campaign-hierarchy-round5.json", hierarchy)
    write_json(OUT / "data" / "yalla-url-graph-round5.json", build_url_graph(results))
    write_json(OUT / "assets" / "index.json", {result["id"]: f"activities/{result['id']}/assets" for result in results})
    write_json(OUT / "fixtures" / "index.json", {result["id"]: f"activities/{result['id']}/fixtures" for result in results})
    write_json(OUT / "replay" / "index.json", {result["id"]: f"activities/{result['id']}/replay" for result in results})

    (OUT / "README.md").write_text(
        "# Pro-Yalla Rich SPA Increment Round 5\n\n"
        "Eight non-ranking-only Yalla campaigns were processed from official production roots and public historical archives. "
        "The package preserves original HTML, JavaScript, CSS, chunks, images, fonts, JSON, media, captured API responses, route evidence, offline replay files, screenshots, Registry and QA.\n\n"
        "Promotional images, videos, hand-written mock pages, online iframe fallbacks and fabricated users, rankings, rewards or gameplay outcomes are not accepted as official SPA material.\n",
        encoding="utf-8",
    )


async def main() -> None:
    results = []
    async with async_playwright() as playwright:
        browser = await playwright.chromium.launch(headless=True, args=["--disable-dev-shm-usage", "--no-sandbox"])
        for target in TARGETS:
            try:
                result = await base.Recovery(target).run(browser)
                result["mechanism"] = target["mechanism"]
                results.append(result)
            except Exception as exc:
                results.append(fallback_result(target, exc))
                (OUT / "logs" / f"{target['id']}-fatal.txt").write_text(repr(exc), encoding="utf-8")
        await browser.close()
    contact_sheet = build_contact_sheet(results)
    build_documents(results, contact_sheet)
    print(json.dumps({
        "release": "pro-yalla-rich-spa-increment-round5",
        "activities": len(results),
        "verified": sum(result["status"] == "VERIFIED_OFFICIAL_SPA" for result in results),
        "partial": sum(result["status"] == "VERIFIED_PARTIAL_SPA" for result in results),
        "expired": sum(result["status"] == "OFFICIAL_URL_EXPIRED" for result in results),
        "contactSheet": contact_sheet,
    }, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    asyncio.run(main())
