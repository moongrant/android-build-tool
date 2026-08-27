from __future__ import annotations

import concurrent.futures
import json
import math
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from urllib.parse import urlparse

import requests

OUT=Path('pro-yalla-file-cdn-fast');OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'application/json,text/plain,*/*'})
PREFIXES=['file.yalla.live/Activity/','file.yalla.live/activity/','file.windgh.com/Activity/','file.windgh.com/activity/']
KNOWN={re.sub(r'[^a-z0-9]','',x.lower()) for x in ['ActivityOver','8th','8thAnniversary','9thAnniversary','10thAnniversary','activityMap','adha','car','car2','football','footballCarnival','nationalFence','Ramadan','ramadanBless','recall','recallAndRecruit','RoyalVictory','sea','sea2','sheepFarm','yallaSeason','Wonderland','ferrisWheel','ferrisWheel5','rollerCoaster','2023','7th','common','public','static','images','image','img','js','css','lang','fonts','font','audio','video','icon','icons']}
DEPTH=['task','mission','sign','lottery','draw','treasure','collect','collection','card','album','map','island','planet','level','upgrade','shop','store','exchange','reward','record','history','game','challenge','stage','progress','ticket','coin','invite','team','room','farm','feed','ocean','ship','castle','ride','car','medal','honor','palace','memory','festival','carnival','ramadan','eid','anniversary','newyear','national','season','football','boss','monster','attack','wealth','path','journey','adventure','wheel','cruise','garden']

def get(url,params=None,timeout=(20,120),tries=3):
 last=None
 for i in range(tries):
  try:
   r=S.get(url,params=params,timeout=timeout,allow_redirects=True);last=r
   if r.status_code==200:return r
   if r.status_code not in {429,500,502,503,504}:return r
  except Exception as e:last=e
  time.sleep(1.5*(i+1))
 return last

def parse(text):
 out=[]
 for line in text.splitlines():
  try:o=json.loads(line)
  except Exception:continue
  if isinstance(o,dict):out.append(o)
 return out

def query(index,prefix):
 api=index['cdx-api'];base={'url':prefix,'matchType':'prefix','output':'json','filter':'status:200','collapse':'urlkey'};rows=[]
 r=get(api,{**base,'showNumPages':'true'},timeout=(20,80),tries=2);pages=1
 if hasattr(r,'status_code') and r.status_code==200:
  try:
   d=r.json()
   if isinstance(d,dict):pages=max(1,min(12,int(d.get('pages') or 1)))
   else:rows.extend(parse(r.text))
  except Exception:rows.extend(parse(r.text))
 if not rows:
  for page in range(pages):
   rr=get(api,{**base,**({'page':page} if pages>1 else {})},timeout=(25,120),tries=2)
   if hasattr(rr,'status_code') and rr.status_code==200:rows.extend(parse(rr.text))
 for x in rows:x['_index']=index['id'];x['_prefix']=prefix
 return rows

def folder(row):
 u=str(row.get('url',''));prefix=str(row.get('_prefix',''))
 try:p=urlparse(u if '://' in u else 'https://'+u).path
 except Exception:return None
 marker='/'+prefix.split('/',1)[1];i=p.lower().find(marker.lower())
 if i<0:return None
 rest=p[i+len(marker):].lstrip('/');return rest.split('/',1)[0] if rest else None

def ext(u):
 try:path=urlparse(u if '://' in u else 'https://'+u).path
 except Exception:return ''
 m=re.search(r'(\.[A-Za-z0-9]{1,8})$',path);return m.group(1).lower() if m else ''

coll=get('https://index.commoncrawl.org/collinfo.json',timeout=(20,60));indexes=[]
for x in coll.json() if hasattr(coll,'json') else []:
 m=re.search(r'CC-MAIN-(20\d{2})-',x.get('id',''))
 if m and 2021<=int(m.group(1))<=2026:indexes.append(x)
by=defaultdict(list)
for x in indexes:by[int(re.search(r'CC-MAIN-(20\d{2})-',x['id']).group(1))].append(x)
selected=[sorted(v,key=lambda x:x['id'],reverse=True)[0] for y,v in sorted(by.items()) if v]
rows=[]
with concurrent.futures.ThreadPoolExecutor(max_workers=12) as ex:
 fs=[ex.submit(query,i,p) for i in selected for p in PREFIXES]
 for f in concurrent.futures.as_completed(fs):
  try:rows.extend(f.result())
  except Exception as e:print('query-error',repr(e),flush=True)
d={}
for r in rows:d[(r.get('_index'),r.get('url'),r.get('timestamp'))]=r
rows=list(d.values());groups=defaultdict(list)
for r in rows:
 f=folder(r)
 if f:groups[f].append(r)
items=[]
for name,hits in groups.items():
 urls=sorted({str(x.get('url','')) for x in hits if x.get('url')});c=Counter(ext(u) for u in urls);text=' '.join(urls).lower();key=re.sub(r'[^a-z0-9]','',name.lower());depth=sorted({x for x in DEPTH if x in text});years=sorted({str(x.get('timestamp',''))[:4] for x in hits if str(x.get('timestamp',''))[:4].isdigit()});total=sum(int(x.get('length') or 0) for x in hits)
 it={'folder':name,'key':key,'known':key in KNOWN,'uniqueUrls':len(urls),'recordCount':len(hits),'years':years,'totalBytes':total,'extensions':dict(c),'imageCount':sum(c[x] for x in ['.png','.jpg','.jpeg','.webp','.gif','.svg','.avif']),'jsonCount':c['.json'],'mediaCount':sum(c[x] for x in ['.mp3','.wav','.ogg','.mp4','.webm']),'depthKeywords':depth,'samples':urls[:80]}
 it['score']=round(math.log2(len(urls)+1)*12+math.log2(total+1)*1.3+it['imageCount']*.8+it['jsonCount']*2+it['mediaCount']*3+len(depth)*4-(80 if it['known'] else 0),2);items.append(it)
items.sort(key=lambda x:x['score'],reverse=True);cands=[x for x in items if not x['known'] and x['uniqueUrls']>=2]
(OUT/'folders.json').write_text(json.dumps(items,ensure_ascii=False,indent=2));(OUT/'candidates.json').write_text(json.dumps(cands,ensure_ascii=False,indent=2));(OUT/'indexes.json').write_text(json.dumps([x['id'] for x in selected],indent=2));(OUT/'record-count.txt').write_text(str(len(rows)))
lines=['# Yalla File CDN Fast Inventory','',f'- Indexes: {len(selected)}',f'- Rows: {len(rows)}',f'- Folders: {len(items)}',f'- New candidates: {len(cands)}','', '| # | Folder | URLs | Images | JSON | Years | Depth | Score |','|---:|---|---:|---:|---:|---|---|---:|']
for i,x in enumerate(cands[:150],1):lines.append(f"| {i} | `{x['folder']}` | {x['uniqueUrls']} | {x['imageCount']} | {x['jsonCount']} | {', '.join(x['years'])} | {', '.join(x['depthKeywords'][:15])} | {x['score']} |")
(OUT/'REPORT.md').write_text('\n'.join(lines));print(json.dumps({'rows':len(rows),'folders':len(items),'candidates':[x['folder'] for x in cands[:80]]},ensure_ascii=False,indent=2))
