from __future__ import annotations

import concurrent.futures
import hashlib
import io
import json
import re
import time
from collections import defaultdict
from pathlib import Path
from urllib.parse import quote, urljoin, urlparse

import requests
from bs4 import BeautifulSoup
from warcio.archiveiterator import ArchiveIterator

OUT=Path('pro-yalla-historical-cdn-closure');OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'*/*'})
TARGETS=[
 {'id':'magic-lamp-2021','name':'Magic Lamp 2021','root':'https://activity2.yalla.live/activity/2021dist/MagicLamp/','rootTs':'20210802033525','prefix':'https://file.yalla.live/activity/MagicLamp/','rootReplay':'https://web.archive.org/web/20210802033525id_/https://activity2.yalla.live/activity/2021dist/MagicLamp/'},
 {'id':'beat-pinata-2021','name':'Beat Piñata 2021','root':'https://activity2.yalla.live/activity/2021dist/beatPinata/','rootTs':'20210818043342','prefix':'https://file.yalla.live/activity/beatPinata/','rootReplay':'https://web.archive.org/web/20210818043342id_/https://activity2.yalla.live/activity/2021dist/beatPinata/?region=5&s=3&t=1629253468109&p=2&v=222'},
 {'id':'lucky-card-2021','name':'Lucky Card 2021','root':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/','rootTs':'20210201142221','prefix':'https://file.yalla.live/activity/LuckyCard/','rootReplay':'https://web.archive.org/web/20210201142221id_/https://activity2.yalla.live/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/?region=2&s=3&t=1612189249699&v=200&userid=111644012'},
 {'id':'national-day-template-2021','name':'National Day Template 2021','root':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla03/NationalDayTemplate/dist/','rootTs':'20210725055818','prefix':'https://file.yalla.live/activity/NationalDayTemplate/','rootReplay':'https://web.archive.org/web/20210725055818id_/https://activity2.yalla.live/activity/YallaActivity2021/Yalla03/NationalDayTemplate/dist/'},
 {'id':'national-day-2021','name':'National Day 2021','root':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla02/NationalDay/dist/','rootTs':'20210225214038','prefix':'https://file.yalla.live/activity/NationalDay/','rootReplay':'https://web.archive.org/web/20210225214038id_/https://activity2.yalla.live/activity/YallaActivity2021/Yalla02/NationalDay/dist/'},
 {'id':'turkey-fathers-day-2020','name':"Turkey Father's Day 2020",'root':'https://activity2.yalla.live/activity/YallaActivity2020/TurkeyFatherDay/build/','rootTs':'20201104222027','prefix':'https://file.yalla.live/activity/TurkeyFatherDay/','rootReplay':'https://web.archive.org/web/20201104222027id_/https://activity2.yalla.live/activity/YallaActivity2020/TurkeyFatherDay/build/'},
]
TEXT_EXT={'.html','.htm','.js','.mjs','.css','.json','.map','.svg','.txt','.xml'}
STATIC_RE=re.compile(r'\.(?:js|mjs|css|json|png|jpe?g|webp|gif|svg|ico|woff2?|ttf|otf|eot|mp3|wav|ogg|mp4|webm|map|wasm)(?:[?#]|$)',re.I)
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found']

def get(url,params=None,headers=None,timeout=(20,120),tries=3):
 last=None
 for i in range(tries):
  try:
   r=S.get(url,params=params,headers=headers,timeout=timeout,allow_redirects=True);last=r
   if r.status_code in {200,206}:return r
   if r.status_code not in {429,500,502,503,504}:return r
  except Exception as e:last=e
  time.sleep(1.5*(i+1))
 return last

def safe_path(base,url):
 p=urlparse(url);parts=[re.sub(r'[^A-Za-z0-9._-]+','_',x) or 'item' for x in p.path.split('/') if x]
 if not parts:parts=['index.html']
 if p.path.endswith('/'):parts.append('index.html')
 path=base.joinpath(*parts);path.parent.mkdir(parents=True,exist_ok=True);return path

def wayback_rows(prefix):
 params={'url':prefix+'*','output':'json','fl':'timestamp,original,statuscode,mimetype,digest,length','filter':'statuscode:200','collapse':'urlkey','limit':'100000','from':'2020','to':'2022'}
 r=get('https://web.archive.org/cdx/search/cdx',params=params,timeout=(20,180),tries=4)
 rows=[]
 if hasattr(r,'status_code') and r.status_code==200:
  try:
   d=r.json();head=d[0] if d and isinstance(d[0],list) else []
   rows=[dict(zip(head,x)) for x in d[1:] if isinstance(x,list) and len(x)==len(head)]
  except Exception:pass
 for x in rows:x['_source']='wayback'
 return rows

def cc_indexes():
 r=get('https://index.commoncrawl.org/collinfo.json',timeout=(20,60));out=[]
 for x in r.json() if hasattr(r,'json') else []:
  m=re.search(r'CC-MAIN-(20\d{2})-',x.get('id',''))
  if m and 2020<=int(m.group(1))<=2022:out.append(x)
 return out

def parse_jsonl(text):
 out=[]
 for line in text.splitlines():
  try:x=json.loads(line)
  except Exception:continue
  if isinstance(x,dict):out.append(x)
 return out

def cc_rows(index,prefix):
 params={'url':prefix,'matchType':'prefix','output':'json','filter':'status:200','collapse':'urlkey'};api=index['cdx-api'];rows=[]
 r=get(api,params={**params,'showNumPages':'true'},timeout=(20,90),tries=2);pages=1
 if hasattr(r,'status_code') and r.status_code==200:
  try:
   d=r.json()
   if isinstance(d,dict):pages=max(1,min(15,int(d.get('pages') or 1)))
   else:rows.extend(parse_jsonl(r.text))
  except Exception:rows.extend(parse_jsonl(r.text))
 if not rows:
  for page in range(pages):
   rr=get(api,params={**params,**({'page':page} if pages>1 else {})},timeout=(25,150),tries=2)
   if hasattr(rr,'status_code') and rr.status_code==200:rows.extend(parse_jsonl(rr.text))
 for x in rows:x['_source']='commoncrawl';x['_index']=index['id']
 return rows

def warc_body(row,max_bytes=100_000_000):
 try:
  length=int(row.get('length') or 0);offset=int(row.get('offset') or 0);filename=row.get('filename')
  if not filename or length<=0 or length>max_bytes:return None
  r=get('https://data.commoncrawl.org/'+filename,headers={'Range':f'bytes={offset}-{offset+length-1}'},timeout=(30,150),tries=3)
  if not hasattr(r,'status_code') or r.status_code not in {200,206}:return None
  for rec in ArchiveIterator(io.BytesIO(r.content)):
   if rec.rec_type=='response':
    body=rec.content_stream().read(max_bytes+1)
    if len(body)>max_bytes:return None
    ctype=rec.http_headers.get_header('Content-Type') if rec.http_headers else ''
    return body,ctype or ''
 except Exception:return None
 return None

def wayback_body(row):
 url=f"https://web.archive.org/web/{row.get('timestamp')}id_/{row.get('original')}";r=get(url,timeout=(20,100),tries=3)
 if hasattr(r,'status_code') and r.status_code==200 and r.content:return r.content,r.headers.get('content-type','')
 return None

def textlike(url,ctype,body):
 return any(x in (ctype or '').lower() for x in ['text/','javascript','json','xml','svg']) or Path(urlparse(url).path).suffix.lower() in TEXT_EXT or body[:30].lstrip().startswith((b'<',b'{',b'[',b'/*',b'//'))
def refs(text,base):
 out=set();text=text.replace('\\/','/').replace('\\u002F','/')
 if '<' in text[:10000]:
  try:
   soup=BeautifulSoup(text,'html.parser')
   for tag,attr in [('script','src'),('link','href'),('img','src'),('source','src'),('video','src'),('video','poster'),('audio','src')]:
    for el in soup.find_all(tag):
     if el.get(attr):out.add(urljoin(base,el.get(attr)))
  except Exception:pass
 for u in re.findall(r'url\(\s*["\']?([^"\')\s]+)',text,re.I):out.add(urljoin(base,u))
 for u in re.findall(r'["\']([^"\'\n\r]{1,500}\.(?:js|mjs|css|json|png|jpe?g|webp|gif|svg|ico|woff2?|ttf|otf|eot|mp3|wav|ogg|mp4|webm|map|wasm)(?:\?[^"\']*)?)["\']',text,re.I):out.add(urljoin(base,u))
 return sorted(x for x in out if x.startswith(('http://','https://')))

def routes_apis(text):
 routes={'/'};apis=set()
 for p in [r'\bpath\s*:\s*["\']([^"\']+)["\']',r'["\'](#[/][A-Za-z0-9_./?=&%-]+)["\']']:
  for v in re.findall(p,text):
   v=v.lstrip('#');v=v if v.startswith('/') else '/'+v
   if not STATIC_RE.search(v):routes.add(v)
 for v in re.findall(r'["\']((?:https?://[^"\']+)?/(?:api|Api|Webservers)/[^"\'\s]+)["\']',text):apis.add(v)
 return sorted(routes),sorted(apis)

indexes=cc_indexes();results=[]
for target in TARGETS:
 base=OUT/target['id'];base.mkdir(parents=True,exist_ok=True);rootr=get(target['rootReplay'],timeout=(20,90),tries=4);rootbody=rootr.content if hasattr(rootr,'status_code') and rootr.status_code==200 else b''
 (base/'index.html').write_bytes(rootbody)
 wrows=[]
 try:wrows=wayback_rows(target['prefix'])
 except Exception as e:print('wayback-query',target['id'],repr(e),flush=True)
 crows=[]
 with concurrent.futures.ThreadPoolExecutor(max_workers=10) as ex:
  fs=[ex.submit(cc_rows,i,target['prefix'].replace('https://','')) for i in indexes]
  for f in concurrent.futures.as_completed(fs):
   try:crows.extend(f.result())
   except Exception:pass
 allrows=wrows+crows;byurl=defaultdict(list)
 for row in allrows:
  url=str(row.get('original') or row.get('url') or '')
  if url:byurl[url].append(row)
 # Add initial refs even when not in inventory; live fallback may still work.
 initial=refs(rootbody.decode('utf-8','ignore'),target['root']) if rootbody else []
 records=[];texts=[rootbody.decode('utf-8','ignore')]
 def recover_one(url,rows):
  rows=sorted(rows,key=lambda x:abs(int(str(x.get('timestamp') or '0')[:14] or 0)-int(target['rootTs'])),reverse=False)
  for row in rows[:5]:
   got=wayback_body(row) if row.get('_source')=='wayback' else warc_body(row)
   if got:
    body,ctype=got
    if body and not (('html' in ctype.lower() or body.lstrip().startswith(b'<')) and any(x in body[:100000].decode('utf-8','ignore').lower() for x in GENERIC)):
     return body,ctype,row
  r=get(url,timeout=(15,50),tries=2)
  if hasattr(r,'status_code') and r.status_code==200 and r.content:return r.content,r.headers.get('content-type',''),{'_source':'live','url':url}
  return None
 work=list(byurl.items())
 for url in initial:
  if url not in byurl:work.append((url,[]))
 with concurrent.futures.ThreadPoolExecutor(max_workers=12) as ex:
  fmap={ex.submit(recover_one,u,rs):u for u,rs in work[:1800]}
  for f in concurrent.futures.as_completed(fmap):
   u=fmap[f]
   try:got=f.result()
   except Exception:got=None
   if not got:continue
   body,ctype,row=got;path=safe_path(base/'origins',u);path.write_bytes(body);rec={'url':u,'file':path.relative_to(base).as_posix(),'bytes':len(body),'sha256':hashlib.sha256(body).hexdigest(),'contentType':ctype,'source':row.get('_source'),'timestamp':row.get('timestamp'),'index':row.get('_index')};records.append(rec)
   if textlike(u,ctype,body):texts.append(body[:12_000_000].decode('utf-8','ignore'))
 joined='\n'.join(texts);routes,apis=routes_apis(joined);exts=defaultdict(int)
 for r in records:exts[Path(urlparse(r['url']).path).suffix.lower()]+=1
 metrics={'files':1+len(records),'bytes':len(rootbody)+sum(x['bytes'] for x in records),'js':exts['.js']+exts['.mjs'],'css':exts['.css'],'images':sum(exts[x] for x in ['.png','.jpg','.jpeg','.webp','.gif','.svg','.avif']),'json':exts['.json'],'fonts':sum(exts[x] for x in ['.woff','.woff2','.ttf','.otf','.eot']),'media':sum(exts[x] for x in ['.mp3','.wav','.ogg','.mp4','.webm']),'routes':len(routes),'apis':len(apis),'waybackRows':len(wrows),'commonCrawlRows':len(crows)}
 item={**target,'metrics':metrics,'routes':routes,'apis':apis,'records':records,'initialRefs':initial};results.append(item);(base/'manifest.json').write_text(json.dumps(item,ensure_ascii=False,indent=2));print(target['id'],metrics,flush=True)
(OUT/'results.json').write_text(json.dumps(results,ensure_ascii=False,indent=2));lines=['# Yalla Historical CDN Closure','', '| Activity | Files | Bytes | JS/CSS/Images | JSON/Fonts/Media | Routes | APIs | WB/CC rows |','|---|---:|---:|---|---|---:|---:|---|']
for x in results:
 m=x['metrics'];lines.append(f"| {x['name']} | {m['files']} | {m['bytes']} | {m['js']}/{m['css']}/{m['images']} | {m['json']}/{m['fonts']}/{m['media']} | {m['routes']} | {m['apis']} | {m['waybackRows']}/{m['commonCrawlRows']} |")
 lines += [f"\n### {x['name']}",f"- Routes: `{x['routes']}`",f"- APIs: `{x['apis'][:50]}`"]
(OUT/'REPORT.md').write_text('\n'.join(lines));print(json.dumps([{x['id']:x['metrics']} for x in results],ensure_ascii=False,indent=2))
