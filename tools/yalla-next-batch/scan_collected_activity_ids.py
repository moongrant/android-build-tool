from __future__ import annotations

import hashlib
import json
import re
from collections import defaultdict, deque
from pathlib import Path
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

SITE='https://campaigns-collected.jekae.chatgpt.site/'
OUT=Path('pro-yalla-collected-activity-id-scan')
OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'*/*'})
FOLDERS=[
'yalla-8th-anniversary','yalla-9th-anniversary','yalla-season-2025','yalla-happy-ferris-wheel-castle-2025','yalla-super-roller-coaster','yalla-activity-illustrated-cards','yalla-sheep-farm','yalla-10th-anniversary','yalla-wonderland-2025','yalla-royal-victory','yalla-ramadan-2026','yalla-recall-recruit','yalla-sea-dominator','yalla-football-carnival-2024','yalla-monthly-driving-king-2026'
]
TAG_ATTRS=[('script','src'),('link','href'),('img','src'),('source','src')]
CSS_URL=re.compile(r'url\(\s*["\']?([^"\')]+)',re.I)
JS_STR=re.compile(r'''["'`]([^"'`\s<>]+(?:\.(?:js|mjs|css|json|png|jpe?g|gif|webp|svg|woff2?|ttf|otf|mp3|wav|ogg|mp4|webm|wasm)(?:\?[^"'`\s]*)?|/(?:assets?|static|images?|fonts?|data|fixtures?)/[^"'`\s]+))["'`]''',re.I)

def discover(text,current):
 found=set();low=text[:3000].lower()
 if '<html' in low or '<!doctype' in low:
  soup=BeautifulSoup(text,'html.parser')
  for tag,attr in TAG_ATTRS:
   for el in soup.find_all(tag):
    v=el.get(attr)
    if v:found.add(urljoin(current,v))
 for x in CSS_URL.findall(text):found.add(urljoin(current,x))
 for x in JS_STR.findall(text):
  x=x.replace('\\/','/')
  if x.startswith('//'):x='https:'+x
  found.add(urljoin(current,x))
 return found

all_occurrences=defaultdict(list);summary=[]
for folder in FOLDERS:
 root=urljoin(SITE,'activities/'+folder+'/');prefix=urlparse(root).path;q=deque([root,urljoin(root,'index.html')]);seen=set();files=0
 while q and len(seen)<7000:
  url=q.popleft()
  if url in seen:continue
  seen.add(url);p=urlparse(url)
  if p.netloc!=urlparse(SITE).netloc or not p.path.startswith(prefix):continue
  try:r=S.get(url,timeout=(15,45),allow_redirects=True)
  except Exception:continue
  if r.status_code!=200:continue
  files+=1;ctype=r.headers.get('content-type','');data=r.content
  textual=('text/' in ctype or 'javascript' in ctype or 'json' in ctype or Path(p.path).suffix.lower() in {'.html','.js','.mjs','.css','.json','.map','.svg','.txt','.xml'})
  if not textual or len(data)>40_000_000:continue
  text=data.decode('utf-8','ignore');norm=text.replace('\\/','/').replace('\\u002F','/')
  patterns=[
    ('query',r'activityId(?:=|%3D)(\d{5,14})'),
    ('object',r'activityId["\']?\s*[:=]\s*["\']?(\d{5,14})'),
    ('api-path',r'/api/([A-Za-z0-9_.-]+)/[^?"\']{1,120}\?[^"\']*activityId=(\d{5,14})'),
    ('template',r'templateActivity[^"\'<>\n\r]{0,1000}?activityId=(\d{5,14})'),
  ]
  for kind,pattern in patterns:
   for m in re.finditer(pattern,norm,re.I):
    if kind=='api-path':module=m.group(1);aid=m.group(2)
    else:module=None;aid=m.group(1)
    ctx=norm[max(0,m.start()-500):min(len(norm),m.end()+900)].replace('\n',' ')
    all_occurrences[aid].append({'sourceFolder':folder,'sourceUrl':r.url,'kind':kind,'module':module,'context':ctx})
  for nxt in discover(text,r.url):
   np=urlparse(nxt)
   if np.netloc==urlparse(SITE).netloc and np.path.startswith(prefix) and nxt not in seen:q.append(nxt)
 summary.append({'folder':folder,'files':files})

items=[]
for aid,hits in all_occurrences.items():
 # dedupe identical contexts
 unique={hashlib.sha1((x['sourceFolder']+x['sourceUrl']+x['kind']+x['context']).encode()).hexdigest():x for x in hits}
 hits=list(unique.values())
 item={'activityId':aid,'hitCount':len(hits),'sources':sorted({x['sourceFolder'] for x in hits}),'kinds':sorted({x['kind'] for x in hits}),'modules':sorted({x['module'] for x in hits if x.get('module')}),'hits':hits[:80]}
 items.append(item)
items.sort(key=lambda x:(-x['hitCount'],int(x['activityId'])))
(OUT/'activity-ids.json').write_text(json.dumps({'summary':summary,'activityIds':items},ensure_ascii=False,indent=2))
lines=['# Activity IDs Embedded in Currently Collected Yalla Bundles','',f'- Bundles: {len(summary)}',f'- Distinct activity IDs: {len(items)}','', '| Activity ID | Hits | Sources | Modules | Kinds |','|---|---:|---|---|---|']
for item in items:lines.append(f"| `{item['activityId']}` | {item['hitCount']} | {', '.join(item['sources'])} | {', '.join(item['modules'])} | {', '.join(item['kinds'])} |")
lines+=['','## Full contexts','']
for item in items:
 lines += [f"### {item['activityId']}",'']
 for hit in item['hits'][:20]:lines += [f"- `{hit['sourceFolder']}` · `{hit['kind']}` · `{hit.get('module') or ''}`",'```',hit['context'][:3000],'```']
(OUT/'REPORT.md').write_text('\n'.join(lines))
print(json.dumps({'bundles':len(summary),'activityIds':[x['activityId'] for x in items]},ensure_ascii=False,indent=2))
