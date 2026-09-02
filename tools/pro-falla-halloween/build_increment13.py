#!/usr/bin/env python3
from pathlib import Path
import json, shutil, hashlib, os

SRC = Path(os.environ.get('ORIGINAL_DIR', 'work/original')).resolve()
OUT = Path(os.environ.get('PACKAGE_DIR', 'dist/pro-falla-sites-increment-13-halloween-campaigns-complete')).resolve()

if not (SRC / 'manifest.json').exists():
    raise SystemExit(f'manifest not found: {SRC / "manifest.json"}')
manifest = json.loads((SRC / 'manifest.json').read_text(encoding='utf-8'))

if OUT.exists():
    shutil.rmtree(OUT)
(OUT / 'source' / 'original-spa').mkdir(parents=True, exist_ok=True)
(OUT / 'site-patch').mkdir(parents=True, exist_ok=True)
(OUT / 'screenshots').mkdir(parents=True, exist_ok=True)
(OUT / 'qa').mkdir(parents=True, exist_ok=True)

# Keep the exact original-SPA archival tree intact. This is the authoritative source layer.
for p in SRC.iterdir():
    dst = OUT / 'source' / 'original-spa' / p.name
    if p.is_dir():
        shutil.copytree(p, dst)
    else:
        shutil.copy2(p, dst)

# Promote campaign contact sheets to a stable top-level screenshots folder.
cs = SRC / 'contact-sheets'
if cs.exists():
    for p in cs.glob('*.png'):
        if p.name == 'overview.png':
            shutil.copy2(p, OUT / 'screenshots' / p.name)
        else:
            shutil.copy2(p, OUT / 'screenshots' / p.name)

cards = [
    {
        'cardId':'card-falla-halloween-candy-bag-2021',
        'campaignId':'halloween-candy-bag-2021',
        'title':'Falla Halloween Candy Bag 2021',
        'year':2021,'complexity':'L4+','theme':'Halloween',
        'archiveProject':'21-10-halloween',
        'summary':'Candy collection, Candy Bag, friend claiming, random point increase, Candy King ranking and rewards.',
        'screenshot':'screenshots/halloween-candy-bag-2021.png'
    },
    {
        'cardId':'card-falla-halloween-celebrations-2022',
        'campaignId':'halloween-celebrations-2022',
        'title':'Falla Halloween Celebrations 2022',
        'year':2022,'complexity':'L4','theme':'Halloween',
        'archiveProject':'act-hallowmas',
        'activityId':147,'translateId':267,
        'summary':'Pumpkin-lantern lighting progression, medal growth, ranking and stage rewards.',
        'screenshot':'screenshots/halloween-celebrations-2022.png'
    },
    {
        'cardId':'card-falla-halloween-event-2023',
        'campaignId':'halloween-event-2023',
        'title':'Falla Halloween Event 2023',
        'year':2023,'complexity':'L4','theme':'Halloween',
        'archiveProject':'act-halloween-23',
        'activityId':346,'translateId':480,
        'summary':'Designated-gift tasks, pumpkin-lantern progression, individual/room ranking and rewards.',
        'screenshot':'screenshots/halloween-event-2023.png'
    },
    {
        'cardId':'card-falla-happy-halloween-2025',
        'campaignId':'happy-halloween-2025',
        'title':'Falla Happy Halloween 2025',
        'year':2025,'complexity':'L3+','theme':'Halloween',
        'archiveProject':'act-template',
        'activityId':1391,'translateId':1054,
        'conditional':True,
        'summary':'Halloween-themed gift/task/ranking/reward template. Keep as a lighter reference card.',
        'screenshot':'screenshots/happy-halloween-2025.png'
    }
]

manifest_by_id = {c['id']: c for c in manifest.get('campaigns', [])}
hierarchy = []
for card in cards:
    cid = card['campaignId']
    c = manifest_by_id.get(cid, {})
    pages = []
    for p in c.get('pages', []):
        pages.append({
            'label': p.get('label'),
            'route': p.get('route'),
            'project': p.get('project'),
            'unitId': p.get('unitId'),
            'offlineScreenshot': f"source/original-spa/{p.get('offlineScreenshot')}" if p.get('offlineScreenshot') else None,
            'offlineMissingCount': p.get('offlineMissingCount', 0),
            'offlineFixtureCount': p.get('offlineFixtureCount', 0),
        })
    hierarchy.append({
        'campaignId': cid,
        'cardId': card['cardId'],
        'title': card['title'],
        'archiveUnits': [{
            'project': card['archiveProject'],
            'type': 'SPA Archive Unit',
            'states': pages,
        }]
    })

patch_manifest = {
    'incrementId':'pro-falla-increment-13-halloween',
    'mode':'merge-only',
    'targetSite':'https://campaigns-collected.jekae.chatgpt.site/',
    'sourceArtifact':{
        'runId':33614629420,
        'artifactId':9840507972,
        'artifactDigest':'sha256:b35174e1c5d0e0e16db3134e9c98e80c780145ac294e9d9bbb7245d350edb176'
    },
    'campaignCount':len(cards),
    'campaignIds':[c['campaignId'] for c in cards],
    'qa':{
        'offlineReplayComplete':manifest.get('offlineReplayComplete'),
        'visualAcceptance':manifest.get('visualAcceptance'),
        'originalFileCount':manifest.get('originalFileCount'),
        'originalBytes':manifest.get('originalBytes'),
        'historicalApiFixtureCount':manifest.get('historicalApiFixtureCount'),
    },
    'integration':{
        'doNotOverwriteExistingCards':True,
        'dedupeKeys':['cardId','campaignId','archiveProject','activityId','translateId'],
        'hierarchy':'Campaign > SPA Archive Unit > Route/State',
        'preferredInsertAfter':'card-falla-ramadan-campaign-2024',
        'fallbackInsertAfter':'card-falla-slots-pack-2024'
    }
}

(OUT / 'site-patch' / 'cards.part-13.json').write_text(json.dumps(cards, ensure_ascii=False, indent=2), encoding='utf-8')
(OUT / 'site-patch' / 'falla-hierarchy.part-13.json').write_text(json.dumps(hierarchy, ensure_ascii=False, indent=2), encoding='utf-8')
(OUT / 'site-patch' / 'patch-manifest.json').write_text(json.dumps(patch_manifest, ensure_ascii=False, indent=2), encoding='utf-8')

qa = {
    'sourceWorkflowRun':33614629420,
    'sourceArtifactId':9840507972,
    'campaignCount':manifest.get('campaignCount'),
    'pageCount':manifest.get('pageCount'),
    'originalFileCount':manifest.get('originalFileCount'),
    'originalBytes':manifest.get('originalBytes'),
    'offlineReplayComplete':manifest.get('offlineReplayComplete'),
    'visualAcceptance':manifest.get('visualAcceptance'),
    'campaigns':[
        {
            'id':c.get('id'),'title':c.get('title'),'pageCount':c.get('pageCount'),
            'offlineMissing':c.get('offlineMissing'),'brokenImages':c.get('brokenImages'),
            'visibleErrors':c.get('visibleErrors'),'navErrors':c.get('navErrors'),
            'originalBundleReplay':c.get('originalBundleReplay'),
            'historicalApiFixtures':c.get('historicalApiFixtures')
        }
        for c in manifest.get('campaigns', [])
    ]
}
(OUT / 'qa' / 'QA_REPORT.json').write_text(json.dumps(qa, ensure_ascii=False, indent=2), encoding='utf-8')

lines = [
    '# Pro Falla Increment 13 · Halloween', '',
    'This package is a merge-only increment for the existing Campaigns Collected site.', '',
    '## Contents', '',
    '- Full original Falla SPA archival tree with HTML/JS/CSS/chunks/assets/config/records',
    '- Offline-replay evidence and screenshots',
    '- Four Halloween campaign cards',
    '- Campaign > SPA Archive Unit > Route/State hierarchy metadata',
    '- QA and SHA-256 manifests', '',
    '## QA', '',
    f"- Campaigns: {manifest.get('campaignCount')}",
    f"- Unique SPA views: {manifest.get('pageCount')}",
    f"- Original files: {manifest.get('originalFileCount')}",
    f"- Offline replay complete: {manifest.get('offlineReplayComplete')}",
    f"- Visual acceptance: {manifest.get('visualAcceptance')}", '',
    'Do not flatten routes into separate campaigns. Do not overwrite existing Falla cards.'
]
(OUT / 'README.md').write_text('\n'.join(lines), encoding='utf-8')

prompt = '''Merge this Increment 13 package into the existing Campaigns Collected site.\n\nSTRICT RULES:\n1. Merge only. Do not replace the current site and do not delete existing cards.\n2. Dedupe by cardId + campaignId + archiveProject + activityId + translateId.\n3. Add exactly these four Falla Halloween campaigns if they are not already present:\n   - Falla Halloween Candy Bag 2021\n   - Falla Halloween Celebrations 2022\n   - Falla Halloween Event 2023\n   - Falla Happy Halloween 2025\n4. Preserve hierarchy: Campaign > SPA Archive Unit > Route / interaction state. Do not turn tabs/routes into separate campaign cards.\n5. Use source/original-spa as the authoritative original-byte source. Preserve all original assets and original Falla bundles. Historical expired user/rank state may only use the already-labelled anonymous zero-state fixtures present in the archive.\n6. Before deploy, browser-QA every accepted route/state. Required: missing requests 0, broken images 0, visible Error request 0, nav errors 0.\n7. Prefer inserting after #card-falla-ramadan-campaign-2024; fallback after #card-falla-slots-pack-2024; otherwise append to the Falla section.\n8. Keep the existing site URL unchanged.\n'''
(OUT / 'WORK_UPLOAD_PROMPT.txt').write_text(prompt, encoding='utf-8')

# Package-level file hashes.
hashes=[]
for p in sorted(OUT.rglob('*')):
    if p.is_file() and p.name != 'SHA256SUMS.txt':
        h=hashlib.sha256(p.read_bytes()).hexdigest()
        hashes.append(f'{h}  {p.relative_to(OUT).as_posix()}')
(OUT / 'SHA256SUMS.txt').write_text('\n'.join(hashes)+'\n', encoding='utf-8')

print(json.dumps({
    'package':str(OUT),
    'campaigns':len(cards),
    'pages':manifest.get('pageCount'),
    'files':sum(1 for p in OUT.rglob('*') if p.is_file()),
    'offlineReplayComplete':manifest.get('offlineReplayComplete'),
    'visualAcceptance':manifest.get('visualAcceptance')
}, indent=2))
