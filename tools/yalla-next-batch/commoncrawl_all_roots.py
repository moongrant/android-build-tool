from __future__ import annotations

import concurrent.futures
import io
import json
import math
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from urllib.parse import quote, urlparse

import requests
from bs4 import BeautifulSoup
from warcio.archiveiterator import ArchiveIterator

OUT=Path('pro-yalla-commoncrawl-all-roots');OUT.mkdir(parents=True,exist_ok=True)
RAW=OUT/'raw';RAW.mkdir(exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'*/*'})
KNOWN={x.lower() for x in ['8thAnniversary','9thAnniversary','yallaSeason','ferrisWheel','fw_newyear','rollerCoaster','activityMap','adha','10thAnniversary','2025NewYear','RoyalVictory','Ramadan','recallAndRecruit','seaDominator','footballCarnival','carKing']}
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found']
DEPTH=['task','mission','lottery','draw','treasure','collect','collection','card','album','map','island','planet','level','upgrade','shop','store','exchange','reward','record','history','game','challenge','stage','milestone','progress','ticket','coin','invite','team','room','farm','feed','barn','ocean','sea','ship','castle','ride','car','medal','honor','palace','memory','festival','carnival','ramadan','eid','anniversary','new year','national day','season','football','boss','monster','attack','path','wealth']
STATIC={'.js','.mjs','.css','.png','.jpg','.jpeg','.webp','.gif','.svg','.json','.woff','.woff2','.ttf','.otf','.eot','.mp3','.wav','.ogg','.mp4','.webm','.map','.wasm'}
HOST_PREFIXES=['activity2.yalla.live/activity/','activity2.qrsshine.com/activity/','activity2.windgh.com/activity/','h5client.peakxyz.com/activity/','event.yalla.live/activity/']

def get(url,timeout=(20,120),tries=3,headers=None):
 for i in range(tries):
  try:
   r=S.get(url,timeout=timeout,headers=headers,allow_redirects=True)
   if r.status_code in {429,500,502,503,504} and i+1<tries:time.sleep(1.5*(i+1));continue
   return r
  except Exception:
   if i+1<tries:time.sleep(1.5*(i+1))
 return None

def parse_root(url):
 try:
  p=urlparse(url);parts=[x for x in p.path.split('/') if x]
  if len(parts)<3 or parts[0].lower()!='activity':return None
  if not (re.fullmatch(r'20\d{2}dist',parts[1],re.I) or re.fullmatch(r'YallaActivity20\d{2}',parts[1],re.I)):return None
  return {'host':p.hostname,'bucket':parts[1],'project':parts[2],'root':f'{p.scheme or "https"}://{p.netloc}/activity/{parts[1]}/{parts[2]}/'}
 except Exception:return None

def ext(url):
 m=re.search(r'(\.[A-Za-z0-9]{1,6})$',urlparse(url).path);return m.group(1).lower() if m else ''

def index_records(index,host_prefix):
 api=index['cdx-api'];base=api+'?url='+quote(host_prefix,safe='')+'&matchType=prefix&output=json&filter=status:200&collapse=urlkey'
 records=[]
 # Query page count, then pages. Some indexes return JSONL directly even with showNumPages.
 count=get(base+'&showNumPages=true',timeout=(20,100),tries=2)
 pages=1
 if count and count.status_code==200:
  try:
   data=count.json()
   if isinstance(data,dict):pages=max(1,min(30,int(data.get('pages') or data.get('pageSize') or 1)))
  except Exception:pass
 for page in range(pages):
  url=base+(f'&page={page}' if pages>1 else '')
  r=get(url,timeout=(25,150),tries=2)
  if not r or r.status_code!=200:continue
  for line in r.text.splitlines():
   try:row=json.loads(line)
   except Exception:continue
   if isinstance(row,dict):
    row['_index']=index.get('id');records.append(row)
 return records

def warc_body(row,max_bytes=15_000_000):
 try:
  length=int(row.get('length') or 0);offset=int(row.get('offset') or 0);filename=row.get('filename')
  if not filename or length<=0 or length>max_bytes:return None
  r=get('https://data.commoncrawl.org/'+filename,timeout=(30,120),tries=2,headers={'Range':f'bytes={offset}-{offset+length-1}'})
  if not r or r.status_code not in {200,206}:return None
  for record in ArchiveIterator(io.BytesIO(r.content)):
   if record.rec_type=='response':
    body=record.content_stream().read(max_bytes+1)
    if len(body)>max_bytes:return None
    ctype=record.http_headers.get_header('Content-Type') if record.http_headers else ''
    return body,ctype or '',r.url
 except Exception:return None
 return None

def inspect(group):
 rows=group.pop('_rows');html=[x for x in rows if str(x.get('mime','')).startswith('text/html') or not ext(str(x.get('url','')))]
 html=sorted(html,key=lambda x:str(x.get('timestamp','')),reverse=True)
 chosen=None;texts=[];snapshots=[]
 for row in html[:12]:
  fetched=warc_body(row)
  if not fetched:continue
  body,ctype,replay=fetched;text=body.decode('utf-8','ignore');soup=BeautifulSoup(text,'html.parser');visible=soup.get_text(' ',strip=True).lower();low=text.lower();generic=any(x in low+' '+visible for x in GENERIC)
  refs=[]
  for tag,attr in [('script','src'),('link','href'),('img','src'),('source','src')]:refs += [e.get(attr) for e in soup.find_all(tag) if e.get(attr)]
  info={'url':row.get('url'),'timestamp':row.get('timestamp'),'bytes':len(body),'title':soup.title.get_text(strip=True) if soup.title else '', 'generic':generic,'refs':refs[:100],'warc':{'index':row.get('_index'),'filename':row.get('filename'),'offset':row.get('offset'),'length':row.get('length')}};snapshots.append(info)
  if not generic and len(body)>=400 and refs:
   chosen=info;texts.append(text);break
 jsrows=sorted([x for x in rows if ext(str(x.get('url',''))) in {'.js','.mjs'}],key=lambda x:int(x.get('length') or 0),reverse=True)[:8]
 samples=[]
 for row in jsrows:
  fetched=warc_body(row)
  if fetched:
   body,ctype,replay=fetched;texts.append(body.decode('utf-8','ignore')[:8_000_000]);samples.append({'url':row.get('url'),'timestamp':row.get('timestamp'),'bytes':len(body),'warc':{'index':row.get('_index'),'filename':row.get('filename'),'offset':row.get('offset'),'length':row.get('length')}})
 joined='\n'.join(texts);lower=joined.lower();routes=set()
 for pattern in [r"\bpath\s*:\s*['\"]([^'\"]{1,160})['\"]",r"['\"](#/[A-Za-z0-9_./?=&%-]{1,160})['\"]"]:
  for v in re.findall(pattern,joined):
   v=v.lstrip('#');v=v if v.startswith('/') else '/'+v
   if not re.search(r'\.(?:js|css|png|jpe?g|webp|svg|json|woff2?|ttf)(?:\?|$)',v,re.I):routes.add(v)
 hits=sorted(x for x in DEPTH if x in lower);rank_only=bool(re.search(r'\brank(?:ing)?\b|leaderboard',lower)) and len([x for x in hits if x not in {'record'}])<=2 and len(routes)<=2
 group.update({'selectedRoot':chosen,'rootSnapshots':snapshots,'sampleBundles':samples,'routeHints':sorted(routes)[:100],'depthKeywords':hits,'simpleRankingRisk':rank_only})
 group['score']=round(math.log2(group['fileCount']+1)*8+math.log2(group['totalBytes']+1)*1.5+group['imageCount']*.8+group['jsCount']*4+group['cssCount']*6+len(routes)*10+len(hits)*3+(40 if chosen else 0)-(100 if rank_only else 0),2)
 return group

coll=get('https://index.commoncrawl.org/collinfo.json',timeout=(20,60))
indexes=[]
if coll and coll.status_code==200:
 for x in coll.json():
  m=re.search(r'CC-MAIN-(20\d{2})-',str(x.get('id','')))
  if m and 2020<=int(m.group(1))<=2026:indexes.append(x)
# Prefer every third index plus latest in each year to limit load while covering time.
byyear=defaultdict(list)
for x in indexes:
 year=int(re.search(r'CC-MAIN-(20\d{2})-',x['id']).group(1));byyear[year].append(x)
selected=[]
for year,items in sorted(byyear.items()):
 items=sorted(items,key=lambda x:x['id'],reverse=True);selected.extend(items[::3]);
 if items and items[0] not in selected:selected.append(items[0])
(OUT/'indexes.json').write_text(json.dumps([x['id'] for x in selected],indent=2))
allrows=[]
with concurrent.futures.ThreadPoolExecutor(max_workers=14) as ex:
 futures=[ex.submit(index_records,index,host) for index in selected for host in HOST_PREFIXES]
 for f in concurrent.futures.as_completed(futures):
  try:allrows.extend(f.result())
  except Exception:pass
# dedupe exact index/url/timestamp
seen={}
for row in allrows:seen[(row.get('_index'),row.get('url'),row.get('timestamp'))]=row
allrows=list(seen.values())
(OUT/'record-count.txt').write_text(str(len(allrows)))
groups=defaultdict(list)
for row in allrows:
 parsed=parse_root(str(row.get('url','')))
 if parsed and parsed['project'].lower() not in KNOWN:groups[(parsed['host'],parsed['bucket'],parsed['project'],parsed['root'])].append(row)
candidates=[]
for (host,bucket,project,root),rows in groups.items():
 exts=Counter(ext(str(x.get('url',''))) for x in rows);urls={str(x.get('url','')) for x in rows}
 item={'host':host,'bucket':bucket,'project':project,'root':root,'fileCount':len(urls),'recordCount':len(rows),'totalBytes':sum(int(x.get('length') or 0) for x in rows),'jsCount':exts['.js']+exts['.mjs'],'cssCount':exts['.css'],'imageCount':sum(exts[x] for x in ['.png','.jpg','.jpeg','.webp','.gif','.svg']),'jsonCount':exts['.json'],'fontCount':sum(exts[x] for x in ['.woff','.woff2','.ttf','.otf','.eot']),'mediaCount':sum(exts[x] for x in ['.mp3','.wav','.ogg','.mp4','.webm']),'extensions':dict(exts),'_rows':rows}
 if item['fileCount']>=4:candidates.append(item)
(OUT/'root-candidates.json').write_text(json.dumps([{k:v for k,v in x.items() if k!='_rows'} for x in candidates],ensure_ascii=False,indent=2))
inspected=[]
with concurrent.futures.ThreadPoolExecutor(max_workers=8) as ex:
 futures=[ex.submit(inspect,x) for x in sorted(candidates,key=lambda x:(x['fileCount'],x['totalBytes']),reverse=True)[:100]]
 for f in concurrent.futures.as_completed(futures):
  try:inspected.append(f.result())
  except Exception as e:inspected.append({'error':repr(e)})
inspected=[x for x in inspected if x.get('project')];inspected.sort(key=lambda x:x.get('score',0),reverse=True)
eligible=[x for x in inspected if x.get('selectedRoot') and not x.get('simpleRankingRisk') and x.get('fileCount',0)>=12 and x.get('jsCount',0)>=1 and x.get('imageCount',0)>=3]
(OUT/'inspected.json').write_text(json.dumps(inspected,ensure_ascii=False,indent=2));(OUT/'eligible.json').write_text(json.dumps(eligible,ensure_ascii=False,indent=2))
lines=['# Common Crawl Yalla Root Inventory','',f'- Indexes queried: {len(selected)}',f'- Records: {len(allrows)}',f'- Non-site roots: {len(candidates)}',f'- Rich eligible roots: {len(eligible)}','', '| # | Root | Files | JS/CSS/Images | Routes | Depth | Title | Score |','|---:|---|---:|---|---:|---|---|---:|']
for i,x in enumerate(eligible[:80],1):lines.append(f"| {i} | `{x['host']}/{x['bucket']}/{x['project']}` | {x['fileCount']} | {x['jsCount']}/{x['cssCount']}/{x['imageCount']} | {len(x.get('routeHints',[]))} | {', '.join(x.get('depthKeywords',[])[:12])} | {str((x.get('selectedRoot') or {}).get('title','')).replace('|','/')} | {x['score']} |")
(OUT/'REPORT.md').write_text('\n'.join(lines))
print(json.dumps({'indexes':len(selected),'records':len(allrows),'roots':len(candidates),'eligible':len(eligible),'top':[x['project'] for x in eligible[:30]]},ensure_ascii=False,indent=2))
