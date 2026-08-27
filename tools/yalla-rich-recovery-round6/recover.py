from __future__ import annotations

import asyncio
import importlib.util
import json
import os
import shutil
import sys
from pathlib import Path

BASE_SCRIPT = Path(__file__).resolve().parents[1] / "yalla-rich-recovery" / "recover.py"
spec = importlib.util.spec_from_file_location("yalla_recovery_base_round6", BASE_SCRIPT)
if spec is None or spec.loader is None:
    raise RuntimeError(f"Unable to import base recovery engine: {BASE_SCRIPT}")
base = importlib.util.module_from_spec(spec)
sys.modules[spec.name] = base
spec.loader.exec_module(base)

OUT = Path(os.environ.get("YALLA_OUT", "pro-yalla-rich-spa-increment-round6"))
shutil.rmtree(OUT, ignore_errors=True)
for name in ["activities", "data", "assets", "fixtures", "screenshots", "registry", "replay", "logs"]:
    (OUT / name).mkdir(parents=True, exist_ok=True)

base.OUT = OUT
base.MAX_FILES = 3200
base.MAX_BYTES = 700 * 1024 * 1024
base.MAX_FILE = 100 * 1024 * 1024

TARGETS = [
    {
        "id": "yalla-magic-lamp-2021",
        "name": "Magic Lamp 2021",
        "year": 2021,
        "campaign": "Yalla Magic Lamp 2021",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2021dist/MagicLamp/",
        "spaRoot": "/activity/2021dist/MagicLamp/",
        "projectSlug": "MagicLamp",
        "expected": ["Magic Lamp", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["magic lamp", "lamp", "genie", "wish", "reward", "record", "rule", "rank"],
    },
    {
        "id": "yalla-beat-pinata-2021",
        "name": "Beat Piñata 2021",
        "year": 2021,
        "campaign": "Yalla Beat Piñata 2021",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/2021dist/beatPinata/",
        "spaRoot": "/activity/2021dist/beatPinata/",
        "projectSlug": "beatPinata",
        "expected": ["Beat Piñata", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["pinata", "piñata", "beat", "hit", "hammer", "candy", "reward", "record", "rule"],
    },
    {
        "id": "yalla-lucky-card-2021",
        "name": "Lucky Card 2021",
        "year": 2021,
        "campaign": "Yalla Lucky Card 2021",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/",
        "spaRoot": "/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/",
        "projectSlug": "Yalla01/LuckyCard/Dist",
        "expected": ["Lucky Card", "Rules", "Rewards", "Records", "Collection"],
        "keywords": ["lucky card", "card", "lucky", "draw", "reward", "record", "rule", "collect"],
    },
    {
        "id": "yalla-national-day-replacement-2020",
        "name": "National Day Replacement 2020",
        "year": 2020,
        "campaign": "Yalla National Day 2020",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2020/NationalDayReplacement/dist/",
        "spaRoot": "/activity/YallaActivity2020/NationalDayReplacement/dist/",
        "projectSlug": "NationalDayReplacement/dist",
        "expected": ["National Day", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["national day", "replacement", "reward", "record", "rule", "rank", "gift"],
    },
    {
        "id": "yalla-turkey-fathers-day-2020",
        "name": "Turkey Father's Day 2020",
        "year": 2020,
        "campaign": "Yalla Turkey Father's Day 2020",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2020/TurkeyFatherDay/build/",
        "spaRoot": "/activity/YallaActivity2020/TurkeyFatherDay/build/",
        "projectSlug": "TurkeyFatherDay/build",
        "expected": ["Father's Day", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["father", "turkey", "reward", "record", "rule", "rank", "gift"],
    },
    {
        "id": "yalla-national-day-2021",
        "name": "National Day 2021",
        "year": 2021,
        "campaign": "Yalla National Day 2021",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2021/Yalla02/NationalDay/dist/",
        "spaRoot": "/activity/YallaActivity2021/Yalla02/NationalDay/dist/",
        "projectSlug": "Yalla02/NationalDay/dist",
        "expected": ["National Day", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["national day", "reward", "record", "rule", "rank", "gift"],
    },
    {
        "id": "yalla-morocco-national-day-2020",
        "name": "Morocco National Day 2020",
        "year": 2020,
        "campaign": "Yalla Morocco National Day 2020",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2020/NationalDayMorocco/dist/",
        "spaRoot": "/activity/YallaActivity2020/NationalDayMorocco/dist/",
        "projectSlug": "NationalDayMorocco/dist",
        "expected": ["Morocco National Day", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["morocco", "national day", "reward", "record", "rule", "rank", "gift"],
    },
    {
        "id": "yalla-national-day-template-2021",
        "name": "National Day Template 2021",
        "year": 2021,
        "campaign": "Yalla National Day Template 2021",
        "parentCampaign": None,
        "officialUrl": "https://activity2.yalla.live/activity/YallaActivity2021/Yalla03/NationalDayTemplate/dist/",
        "spaRoot": "/activity/YallaActivity2021/Yalla03/NationalDayTemplate/dist/",
        "projectSlug": "Yalla03/NationalDayTemplate/dist",
        "expected": ["National Day", "Rules", "Rewards", "Records", "Ranking"],
        "keywords": ["national day", "template", "reward", "record", "rule", "rank", "gift"],
    },
]

base.TARGETS = TARGETS

asyncio.run(base.main())

legacy_registry = OUT / "registry" / "yalla-activity-registry-round4.json"
legacy_csv = OUT / "registry" / "yalla-activity-registry-round4.csv"
registry_path = OUT / "registry" / "yalla-activity-registry-round6.json"
csv_path = OUT / "registry" / "yalla-activity-registry-round6.csv"
if legacy_registry.exists():
    payload = json.loads(legacy_registry.read_text(encoding="utf-8"))
    payload["schemaVersion"] = "6.0"
    payload["release"] = "pro-yalla-rich-spa-increment-round6"
    payload["minimumDepth"] = "Multi-state original SPA only. Single-page ranking, generic ended shells and promotional landings are excluded from acceptedActivities."
    activities = payload.get("activities", [])
    accepted = []
    rejected = []
    for activity in activities:
        metrics = activity.get("metrics") or {}
        qa = activity.get("qa") or {}
        deep = (
            activity.get("fileCount", 0) >= 12
            and metrics.get("jsCount", 0) >= 1
            and metrics.get("cssCount", 0) >= 1
            and metrics.get("imageCount", 0) >= 3
            and activity.get("stateCount", 0) >= 3
            and metrics.get("richStateCount", 0) >= 2
            and not (
                activity.get("routeCount", 0) <= 2
                and set(metrics.get("keywordHits") or []).issubset({"rank", "ranking", "rule", "reward", "record"})
            )
        )
        complete = deep and all(qa.get(key, 0) == 0 for key in [
            "brokenImages", "consoleFatalErrors", "missingChunks",
            "unmappedRequests", "remoteIframes", "remoteRuntimeFallback", "missingStaticAssets"
        ])
        activity["round6DepthAccepted"] = deep
        activity["round6CompleteAccepted"] = complete
        if complete:
            accepted.append(activity)
        else:
            rejected.append(activity)
    payload["acceptedActivities"] = accepted
    payload["rejectedActivities"] = rejected
    payload["acceptedCount"] = len(accepted)
    payload["rejectedCount"] = len(rejected)
    registry_path.write_text(json.dumps(payload, ensure_ascii=False, indent=2), encoding="utf-8")
    legacy_registry.unlink()
if legacy_csv.exists():
    legacy_csv.rename(csv_path)
legacy_sheet = OUT / "screenshots" / "round4-contact-sheet.jpg"
if legacy_sheet.exists():
    legacy_sheet.rename(OUT / "screenshots" / "round6-contact-sheet.jpg")

if registry_path.exists():
    payload = json.loads(registry_path.read_text(encoding="utf-8"))
    lines = [
        "# Pro-Yalla Rich SPA Increment · Round 6",
        "",
        f"- Attempted: {len(payload.get('activities', []))}",
        f"- Accepted complete rich SPAs: {payload.get('acceptedCount', 0)}",
        f"- Rejected / partial: {payload.get('rejectedCount', 0)}",
        "",
        "| Activity | Files | States | Routes | JS/CSS/Images | QA U/B/C/M | Accepted |",
        "|---|---:|---:|---:|---|---|---|",
    ]
    for activity in payload.get("activities", []):
        metrics = activity.get("metrics") or {}
        qa = activity.get("qa") or {}
        lines.append(
            f"| {activity.get('name')} | {activity.get('fileCount', 0)} | {activity.get('stateCount', 0)} | {activity.get('routeCount', 0)} | "
            f"{metrics.get('jsCount', 0)}/{metrics.get('cssCount', 0)}/{metrics.get('imageCount', 0)} | "
            f"{qa.get('unmappedRequests', 0)}/{qa.get('brokenImages', 0)}/{qa.get('consoleFatalErrors', 0)}/{qa.get('missingChunks', 0)} | "
            f"{'YES' if activity.get('round6CompleteAccepted') else 'NO'} |"
        )
    (OUT / "RESULT-BOARD.md").write_text("\n".join(lines), encoding="utf-8")
    (OUT / "README.md").write_text(
        "# Pro-Yalla Rich SPA Increment Round 6\n\n"
        "Historical public Yalla SPA recovery. All accepted entries must pass original-resource closure, multi-state depth and zero-network-fallback QA.\n",
        encoding="utf-8",
    )
    (OUT / "QA.md").write_text(
        "# QA\n\nSee `registry/yalla-activity-registry-round6.json` and each activity manifest.\n",
        encoding="utf-8",
    )

print(json.dumps({
    "output": str(OUT),
    "registry": str(registry_path),
    "accepted": json.loads(registry_path.read_text()).get("acceptedCount", 0) if registry_path.exists() else 0,
}, ensure_ascii=False, indent=2))
