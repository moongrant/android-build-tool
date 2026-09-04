#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch4/discover.py')
src = p.read_text(encoding='utf-8')

anchor = '''    "act-25-ramadan-gift", "act-25-ramadan-eid-al-fitr",
}'''
extra = '''    "act-25-ramadan-gift", "act-25-ramadan-eid-al-fitr",

    # Increment 06 — already uploaded
    "act-treasure-hunt", "act-country-pk-2507", "act-room-tournament",
    "act-team-treasure-2512", "act-game-championship", "act-world-travel-25",

    # Increment 07 — already uploaded
    "act-country-elect", "act-elect-template", "act-travel-2310",
    "act-family-pk-2409", "act-recall-friend", "act-age-of-navigation", "act-onam-day",

    # Increment 08 — 9 uploaded Campaigns / 12 SPA projects
    "act-qatar-world-cup", "act-world-cup-group-stage", "act-world-cup-semifinal",
    "act-world-cup-finals", "act-magic-awake-25", "act-undersea-treasure",
    "act-medal-collect", "act-christmas-new-year-24", "act-welcome-spring-festival",
    "act-aladdin-magic-lamp", "act-hot-air-balloon", "act-new-king-competition",
}'''
if anchor not in src:
    raise SystemExit('KNOWN_PROJECTS anchor not found')
src = src.replace(anchor, extra, 1)

needle = 'async def main() -> None:\n'
insert = '''BATCH9_MANUAL_EXCLUSIONS = sorted({
    "act-treasure-hunt", "act-country-pk-2507", "act-room-tournament",
    "act-team-treasure-2512", "act-game-championship", "act-world-travel-25",
    "act-country-elect", "act-elect-template", "act-travel-2310",
    "act-family-pk-2409", "act-recall-friend", "act-age-of-navigation", "act-onam-day",
    "act-qatar-world-cup", "act-world-cup-group-stage", "act-world-cup-semifinal",
    "act-world-cup-finals", "act-magic-awake-25", "act-undersea-treasure",
    "act-medal-collect", "act-christmas-new-year-24", "act-welcome-spring-festival",
    "act-aladdin-magic-lamp", "act-hot-air-balloon", "act-new-king-competition",
})

'''+needle
if needle not in src:
    raise SystemExit('main anchor not found')
src = src.replace(needle, insert, 1)

needle2 = '    ensure(OUT); ensure(OUT/"raw"/"activity"); ensure(OUT/"raw"/"conf"); ensure(OUT/"raw"/"upload"); ensure(OUT/"raw"/"bundle"); ensure(OUT/"captures")\n'
replacement2 = needle2 + '    dump(OUT/"batch9-manual-exclusions.json", {"count": len(BATCH9_MANUAL_EXCLUSIONS), "projects": BATCH9_MANUAL_EXCLUSIONS})\n'
if needle2 not in src:
    raise SystemExit('output init anchor not found')
src = src.replace(needle2, replacement2, 1)

p.write_text(src, encoding='utf-8')
print('patched Batch 9 manual exclusions')
