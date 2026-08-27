from __future__ import annotations

import concurrent.futures
import hashlib
import json
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from urllib.parse import quote, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path('pro-yalla-fast-cdx-roots')
OUT.mkdir(parents=True, exist_ok=True)
RAW = OUT / 'raw'
RAW.mkdir(exist_ok=True)
S = requests.Session()
S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'*/*','Accept-Language':'en-US,en;q=.9'})
KNOWN={x.lower() for x in ['8thAnniversary','9thAnniversary','yallaSeason','ferrisWheel','fw_newyear','rollerCoaster','activityMap','adha','10thAnniversary','2025NewYear','RoyalVictory','Ramadan','recallAndRecruit','seaDominator','footballCarnival','carKing']}
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found']
STATIC={'.js','.mjs','.css','.png','.jpg','.jpeg','.webp','.gif','.svg','.json','.woff','.woff2','.ttf','.otf','.eot','.mp3','.wav','.ogg','.mp4','.webm','.map','.wasm'}
DEPTH=['task','mission','lottery','draw','treasure','collect','collection','card','album','map','island','planet','level','upgrade','shop','store','exchange','reward','record','history','game','challenge','stage','milestone','progress','ticket','coin','invite','team','room','farm','feed','barn','ocean','sea','ship','castle','ride','car','medal','honor','palace','memory','festival','carnival','ramadan','eid','anniversary','new year','national day','season','football','boss','monster','attack','path','wealth']


def request(url:str, timeout=(20,100), tries=3):
    for i in range(tries):
        try:
            r=S.get(url,timeout=timeout,allow_redirects=True)
            if r.status_code in {429,500,502,503,504} and i+1<tries:
                time.sleep(1+i);continue
            return r
        except Exception:
            if i+1<tries:time.sleep(1+i)
    return None


def cdx(pattern:str, *, html_only=False, limit=10000):
    parts=['https://web.archive.org/cdx/search/cdx?url='+quote(pattern,safe=''),'output=json','fl=timestamp,original,statuscode,mimetype,digest,length','filter=statuscode:200','collapse=urlkey',f'limit={limit}']
    if html_only:parts.append('filter=mimetype:text/html')
    r=request('&'.join(parts),timeout=(25,140),tries=4)
    if not r or r.status_code!=200:return []
    try:d=r.json()
    except Exception:return []
    if not isinstance(d,list) or len(d)<2:return []
    head=d[0];return [dict(zip(head,row)) for row in d[1:] if isinstance(row,list)]


def parse_root(url:str):
    try:
        p=urlparse(url);parts=[x for x in p.path.split('/') if x]
        if p.hostname!='activity2.yalla.live' or len(parts)<3 or parts[0].lower()!='activity':return None
        if not (re.fullmatch(r'20\d{2}dist',parts[1],re.I) or re.fullmatch(r'YallaActivity20\d{2}',parts[1],re.I)):return None
        return parts[1],parts[2],f'https://activity2.yalla.live/activity/{parts[1]}/{parts[2]}/'
    except Exception:return None


def ext(url:str):
    m=re.search(r'(\.[A-Za-z0-9]{1,6})$',urlparse(url).path);return m.group(1).lower() if m else ''


def replay(row):
    ts=str(row.get('timestamp') or '');orig=str(row.get('original') or '')
    if not ts or not orig:return None
    for modifier in ['id_','if_']:
        r=request(f'https://web.archive.org/web/{ts}{modifier}/{orig}',timeout=(20,100),tries=2)
        if r and r.status_code==200 and r.content:return r
    return None


def inspect(item):
    rows=cdx(item['root']+'*',limit=5000)
    item['archiveRows']=len(rows)
    exts=Counter(ext(str(x.get('original',''))) for x in rows)
    item['jsCount']=exts['.js']+exts['.mjs'];item['cssCount']=exts['.css'];item['imageCount']=sum(exts[x] for x in ['.png','.jpg','.jpeg','.webp','.gif','.svg']);item['jsonCount']=exts['.json'];item['fontCount']=sum(exts[x] for x in ['.woff','.woff2','.ttf','.otf','.eot']);item['mediaCount']=sum(exts[x] for x in ['.mp3','.wav','.ogg','.mp4','.webm']);item['extensions']=dict(exts);item['totalBytes']=sum(int(x.get('length') or 0) for x in rows)
    html=[x for x in rows if str(x.get('mimetype','')).startswith('text/html') or urlparse(str(x.get('original',''))).path.rstrip('/') in {urlparse(item['root']).path.rstrip('/'),(urlparse(item['root']).path+'index.html').rstrip('/')}]
    html=sorted(html,key=lambda x:str(x.get('timestamp','')),reverse=True)
    chosen=None;texts=[]
    for row in html[:12]:
        r=replay(row)
        if not r:continue
        text=r.content.decode('utf-8','ignore');low=text.lower();soup=BeautifulSoup(text,'html.parser');visible=soup.get_text(' ',strip=True).lower();generic=any(x in low+' '+visible for x in GENERIC)
        refs=[]
        for tag,attr in [('script','src'),('link','href'),('img','src')]:
            refs += [e.get(attr) for e in soup.find_all(tag) if e.get(attr)]
        info={'timestamp':row.get('timestamp'),'url':row.get('original'),'bytes':len(r.content),'sha256':hashlib.sha256(r.content).hexdigest(),'title':soup.title.get_text(strip=True) if soup.title else '', 'generic':generic,'refs':refs[:100]}
        item.setdefault('rootSnapshots',[]).append(info)
        if not generic and len(r.content)>=400 and refs:
            chosen=info;texts.append(text);break
    jsrows=sorted([x for x in rows if ext(str(x.get('original',''))) in {'.js','.mjs'}],key=lambda x:int(x.get('length') or 0),reverse=True)[:6]
    for row in jsrows:
        r=replay(row)
        if r and len(r.content)<12_000_000:
            texts.append(r.content.decode('utf-8','ignore')[:8_000_000])
    joined='\n'.join(texts);lower=joined.lower();routes=set()
    for pattern in [r"\bpath\s*:\s*['\"]([^'\"]{1,160})['\"]",r"['\"](#/[A-Za-z0-9_./?=&%-]{1,160})['\"]"]:
        for v in re.findall(pattern,joined):
            v=v.lstrip('#');v=v if v.startswith('/') else '/'+v
            if not re.search(r'\.(?:js|css|png|jpe?g|webp|svg|json|woff2?|ttf)(?:\?|$)',v,re.I):routes.add(v)
    hits=sorted(x for x in DEPTH if x in lower)
    item['selectedRoot']=chosen;item['routeHints']=sorted(routes)[:100];item['depthKeywords']=hits
    item['simpleRankingRisk']=bool(re.search(r'\brank(?:ing)?\b|leaderboard',lower)) and len([x for x in hits if x not in {'rank','record'}])<=2 and len(routes)<=2
    item['richScore']=item['archiveRows']+item['imageCount']*2+item['jsCount']*5+item['cssCount']*7+len(routes)*12+len(hits)*3+(40 if chosen else 0)-(100 if item['simpleRankingRisk'] else 0)
    return item


roots={}
for year in range(2020,2027):
    rows=cdx(f'activity2.yalla.live/activity/{year}dist/*',html_only=True,limit=10000)
    (RAW/f'{year}dist-count.txt').write_text(str(len(rows)))
    for row in rows:
        p=parse_root(str(row.get('original','')))
        if p and p[1].lower() not in KNOWN:roots[p[2]]={'bucket':p[0],'project':p[1],'root':p[2]}
rows=cdx('activity2.yalla.live/activity/YallaActivity20*/*',html_only=True,limit=10000)
for row in rows:
    p=parse_root(str(row.get('original','')))
    if p and p[1].lower() not in KNOWN:roots[p[2]]={'bucket':p[0],'project':p[1],'root':p[2]}
base=list(roots.values())
(OUT/'root-list.json').write_text(json.dumps(base,ensure_ascii=False,indent=2))
inspected=[]
with concurrent.futures.ThreadPoolExecutor(max_workers=12) as ex:
    futures=[ex.submit(inspect,x) for x in base]
    for f in concurrent.futures.as_completed(futures):
        try:inspected.append(f.result())
        except Exception as e:inspected.append({'error':repr(e)})
inspected=[x for x in inspected if x.get('project')];inspected.sort(key=lambda x:x.get('richScore',0),reverse=True)
(OUT/'inspected.json').write_text(json.dumps(inspected,ensure_ascii=False,indent=2))
eligible=[x for x in inspected if x.get('selectedRoot') and not x.get('simpleRankingRisk') and x.get('archiveRows',0)>=12 and x.get('jsCount',0)>=1 and x.get('imageCount',0)>=3]
(OUT/'eligible.json').write_text(json.dumps(eligible,ensure_ascii=False,indent=2))
lines=['# Fast CDX Yalla Root Discovery','',f'- HTML-discovered non-site roots: {len(base)}',f'- Rich eligible roots: {len(eligible)}','', '| # | Root | Files | JS/CSS/Images | Routes | Depth | Title | Score |','|---:|---|---:|---|---:|---|---|---:|']
for i,x in enumerate(eligible[:60],1):lines.append(f"| {i} | `{x['bucket']}/{x['project']}` | {x['archiveRows']} | {x['jsCount']}/{x['cssCount']}/{x['imageCount']} | {len(x.get('routeHints',[]))} | {', '.join(x.get('depthKeywords',[])[:12])} | {str((x.get('selectedRoot') or {}).get('title','')).replace('|','/')} | {x['richScore']} |")
(OUT/'REPORT.md').write_text('\n'.join(lines))
print(json.dumps({'roots':len(base),'eligible':len(eligible),'top':[x['project'] for x in eligible[:30]]},ensure_ascii=False,indent=2))
