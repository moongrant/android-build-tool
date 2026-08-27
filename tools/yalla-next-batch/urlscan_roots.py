from __future__ import annotations

import json
import re
import time
from collections import defaultdict
from pathlib import Path
from urllib.parse import quote, urlparse

import requests

OUT = Path('pro-yalla-next-batch-urlscan')
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'application/json'})
KNOWN = {x.lower() for x in [
'8thAnniversary','9thAnniversary','yallaSeason','ferrisWheel','fw_newyear','rollerCoaster','activityMap','adha','10thAnniversary','2025NewYear','RoyalVictory','Ramadan','recallAndRecruit','seaDominator','footballCarnival','carKing'
]}

def root(url: str):
    try:
        p=urlparse(url); parts=[x for x in p.path.split('/') if x]
        if p.hostname!='activity2.yalla.live' or len(parts)<3 or parts[0].lower()!='activity': return None
        if not (re.fullmatch(r'20\d{2}dist',parts[1],re.I) or re.fullmatch(r'YallaActivity20\d{2}',parts[1],re.I)): return None
        return {'bucket':parts[1],'project':parts[2],'root':f'{p.scheme or "https"}://{p.netloc}/activity/{parts[1]}/{parts[2]}/'}
    except Exception:return None

rows=[]; search_after=None
for page in range(12):
    params={'q':'domain:activity2.yalla.live','size':'100'}
    if search_after: params['search_after']=search_after
    url='https://urlscan.io/api/v1/search/?'+ '&'.join(f'{k}={quote(v,safe=":")}' for k,v in params.items())
    try:
        r=S.get(url,timeout=(20,90));
        (OUT/f'page-{page:02d}.json').write_text(r.text,encoding='utf-8')
        if r.status_code!=200: break
        data=r.json(); current=data.get('results') or []
        if not current: break
        rows.extend(current)
        search_after=str(current[-1].get('sort') or '')
        if not data.get('has_more') or not search_after: break
        time.sleep(2)
    except Exception as exc:
        (OUT/f'page-{page:02d}.error.txt').write_text(repr(exc)); break

roots=defaultdict(lambda:{'urls':set(),'titles':set(),'scans':[]})
for row in rows:
    urls=set()
    for objkey in ['page','task']:
        obj=row.get(objkey) or {}
        for key in ['url','domain']:
            v=obj.get(key)
            if isinstance(v,str) and v.startswith('http'): urls.add(v)
    for key in ['url']:
        v=row.get(key)
        if isinstance(v,str) and v.startswith('http'): urls.add(v)
    title=str((row.get('page') or {}).get('title') or '')
    for url in urls:
        parsed=root(url)
        if not parsed or parsed['project'].lower() in KNOWN: continue
        key=(parsed['bucket'],parsed['project'],parsed['root'])
        roots[key]['urls'].add(url)
        if title: roots[key]['titles'].add(title)
        roots[key]['scans'].append({'result':row.get('_id') or row.get('result'),'task':row.get('task'),'page':row.get('page'),'sort':row.get('sort')})

output=[]
for (bucket,project,root_url),value in roots.items():
    output.append({'bucket':bucket,'project':project,'root':root_url,'urls':sorted(value['urls']),'titles':sorted(value['titles']),'scanCount':len(value['scans']),'scans':value['scans'][:30]})
output.sort(key=lambda x:(-x['scanCount'],x['bucket'],x['project']))
(OUT/'urlscan-roots.json').write_text(json.dumps({'totalResults':len(rows),'roots':output},ensure_ascii=False,indent=2))
lines=['# Yalla URLScan Root Inventory','',f'- Search results: {len(rows)}',f'- New non-site roots: {len(output)}','', '| # | Root | Scans | Titles |','|---:|---|---:|---|']
for i,x in enumerate(output,1): lines.append(f"| {i} | `{x['bucket']}/{x['project']}` | {x['scanCount']} | {'<br>'.join(x['titles'][:4]).replace('|','/')} |")
(OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8')
print(json.dumps({'results':len(rows),'roots':len(output),'projects':[x['project'] for x in output[:40]]},ensure_ascii=False,indent=2))
