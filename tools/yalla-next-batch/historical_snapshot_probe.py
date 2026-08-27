from __future__ import annotations

import concurrent.futures
import hashlib
import json
import re
import time
from pathlib import Path
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path('pro-yalla-historical-snapshot-probe')
OUT.mkdir(parents=True, exist_ok=True)
RAW = OUT / 'raw'
RAW.mkdir(exist_ok=True)
S = requests.Session()
S.headers.update({'User-Agent': 'Mozilla/5.0 Chrome/127 Safari/537.36', 'Accept': '*/*'})

TARGETS = [
    {'id':'magic-lamp-2021','name':'Magic Lamp 2021','timestamp':'20210802033317','url':'https://activity2.yalla.live/activity/2021dist/MagicLamp/'},
    {'id':'beat-pinata-2021','name':'Beat Piñata 2021','timestamp':'20210818043342','url':'https://activity2.yalla.live/activity/2021dist/beatPinata/?region=5&s=3&t=1629253468109&p=2&v=222'},
    {'id':'lucky-card-2021','name':'Lucky Card 2021','timestamp':'20210201142221','url':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla01/LuckyCard/Dist/?region=2&s=3&t=1612189249699&v=200&userid=111644012'},
    {'id':'national-day-replacement-2020','name':'National Day Replacement 2020','timestamp':'20201117200612','url':'https://activity2.yalla.live/activity/YallaActivity2020/NationalDayReplacement/dist/'},
    {'id':'turkey-fathers-day-2020','name':"Turkey Father's Day 2020",'timestamp':'20201104222027','url':'https://activity2.yalla.live/activity/YallaActivity2020/TurkeyFatherDay/build/'},
    {'id':'national-day-2021','name':'National Day 2021','timestamp':'20210225214038','url':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla02/NationalDay/dist/'},
    {'id':'morocco-national-day-2020','name':'Morocco National Day 2020','timestamp':'20201118044049','url':'https://activity2.yalla.live/activity/YallaActivity2020/NationalDayMorocco/dist/?region=1&s=2&t=1605674397723&v=193&userid=23537621'},
    {'id':'national-day-template-2021','name':'National Day Template 2021','timestamp':'20210725055818','url':'https://activity2.yalla.live/activity/YallaActivity2021/Yalla03/NationalDayTemplate/dist/'},
]
GENERIC = ['the activity has ended','activity has ended','more coming soon','404 not found','page not found','access denied']
FEATURES = {
    'task':['task','mission','daily','checkin','sign in'],
    'lottery':['lottery','draw','spin','random','wish','card'],
    'growth':['level','upgrade','progress','stage','process','milestone'],
    'collect':['collect','collection','album','fragment','piece','card'],
    'shop':['shop','store','exchange','redeem','mall'],
    'rank':['rank','ranking','leaderboard','top'],
    'game':['game','hit','beat','hammer','lamp','genie','pinata','treasure'],
    'record':['record','history','log'],
    'reward':['reward','prize','gift','bonus'],
}
STATIC = re.compile(r'\.(?:js|mjs|css|json|png|jpe?g|webp|gif|svg|ico|woff2?|ttf|otf|eot|mp3|wav|ogg|mp4|webm|map|wasm)(?:[?#]|$)',re.I)


def get(url, timeout=(15,60), tries=3):
    last = None
    for i in range(tries):
        try:
            r = S.get(url, timeout=timeout, allow_redirects=True)
            last = r
            if r.status_code == 200 and r.content:
                return r
            if r.status_code not in {429,500,502,503,504}:
                return r
        except Exception as e:
            last = e
        time.sleep(1.2*(i+1))
    return last


def replay_url(ts,url):
    return f'https://web.archive.org/web/{ts}id_/{url}'


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
    return sorted(u for u in out if u.startswith(('http://','https://')))


def route_api(text):
    routes=set(['/']);apis=set();
    for p in [r'\bpath\s*:\s*["\']([^"\']+)["\']',r'["\'](#[/][A-Za-z0-9_./?=&%-]+)["\']']:
        for v in re.findall(p,text):
            v=v.lstrip('#');v=v if v.startswith('/') else '/'+v
            if not STATIC.search(v):routes.add(v)
    for v in re.findall(r'["\']((?:https?://[^"\']+)?/(?:api|Api|Webservers)/[^"\'\s]+)["\']',text):apis.add(v)
    return sorted(routes),sorted(apis)


def inspect(target):
    ts,url=target['timestamp'],target['url'];replay=replay_url(ts,url)
    root=get(replay,timeout=(20,90),tries=4)
    item={**target,'replay':replay}
    if not hasattr(root,'status_code'):
        item['error']=repr(root);return item
    data=root.content;text=data.decode('utf-8','ignore');low=text.lower();soup=BeautifulSoup(text,'html.parser')
    item.update(status=root.status_code,bytes=len(data),finalUrl=root.url,sha256=hashlib.sha256(data).hexdigest(),title=soup.title.get_text(' ',strip=True) if soup.title else '',visible=' '.join(soup.get_text(' ',strip=True).split())[:8000],generic=any(x in low for x in GENERIC))
    rootfile=RAW/f"{target['id']}-root.html";rootfile.write_bytes(data);item['rootFile']=rootfile.relative_to(OUT).as_posix()
    first_refs=refs(text,url);item['firstRefs']=first_refs
    assets=[];alltext=[text]
    def fetch_ref(ref):
        live=get(ref,timeout=(12,40),tries=2)
        source='live';resp=live
        if not hasattr(resp,'status_code') or resp.status_code!=200 or not resp.content:
            source='wayback';resp=get(replay_url(ts,ref),timeout=(15,60),tries=2)
        if not hasattr(resp,'status_code'):
            return {'url':ref,'error':repr(resp)}
        body=resp.content;ctype=resp.headers.get('content-type','');out={'url':ref,'source':source,'status':resp.status_code,'bytes':len(body),'contentType':ctype,'sha256':hashlib.sha256(body).hexdigest()}
        if resp.status_code==200 and body:
            suffix=Path(urlparse(ref).path).suffix or '.bin';path=RAW/f"{target['id']}-{hashlib.sha1(ref.encode()).hexdigest()[:12]}{suffix}";path.write_bytes(body);out['file']=path.relative_to(OUT).as_posix()
            if any(x in ctype.lower() for x in ['text/','javascript','json','xml']) or suffix.lower() in {'.html','.js','.mjs','.css','.json','.map','.svg'}:
                t=body[:8_000_000].decode('utf-8','ignore');out['text']=t;out['refs']=refs(t,ref)
        return out
    with concurrent.futures.ThreadPoolExecutor(max_workers=10) as ex:
        futures=[ex.submit(fetch_ref,r) for r in first_refs[:220]]
        for f in concurrent.futures.as_completed(futures):
            assets.append(f.result())
    # second-level static refs from JS/CSS
    second=[]
    seen=set(first_refs)
    for a in assets:
        if a.get('text'):alltext.append(a['text'])
        for r in a.get('refs',[]):
            if r not in seen and STATIC.search(r):seen.add(r);second.append(r)
    with concurrent.futures.ThreadPoolExecutor(max_workers=10) as ex:
        futures=[ex.submit(fetch_ref,r) for r in second[:350]]
        for f in concurrent.futures.as_completed(futures):assets.append(f.result())
    joined='\n'.join(alltext+[a.get('text','') for a in assets if a.get('text')]);routes,apis=route_api(joined);features={k:[w for w in words if w in joined.lower()] for k,words in FEATURES.items()};features={k:v for k,v in features.items() if v}
    item['assets']=[{k:v for k,v in a.items() if k!='text'} for a in assets];item['routes']=routes;item['apis']=apis;item['features']=features
    item['metrics']={'files':1+sum(1 for a in assets if a.get('status')==200 and a.get('bytes',0)>0),'js':sum('.js' in urlparse(a.get('url','')).path for a in assets),'css':sum('.css' in urlparse(a.get('url','')).path for a in assets),'images':sum(re.search(r'\.(?:png|jpe?g|webp|gif|svg)(?:$|\?)',a.get('url',''),re.I) is not None for a in assets),'routes':len(routes),'apis':len(apis),'featureGroups':len(features)}
    item['score']=item['metrics']['files']+item['metrics']['js']*5+item['metrics']['css']*5+item['metrics']['images']*2+len(routes)*8+len(features)*10-(100 if item['generic'] else 0)
    return item

with concurrent.futures.ThreadPoolExecutor(max_workers=4) as ex:
    results=list(ex.map(inspect,TARGETS))
results.sort(key=lambda x:x.get('score',-999),reverse=True)
(OUT/'results.json').write_text(json.dumps(results,ensure_ascii=False,indent=2))
lines=['# Yalla Historical Snapshot Probe','', '| Activity | Root | Files | JS/CSS/Images | Routes | APIs | Feature groups | Generic | Score |','|---|---:|---:|---|---:|---:|---:|---|---:|']
for x in results:
    m=x.get('metrics',{});lines.append(f"| {x['name']} | {x.get('bytes',0)} | {m.get('files',0)} | {m.get('js',0)}/{m.get('css',0)}/{m.get('images',0)} | {m.get('routes',0)} | {m.get('apis',0)} | {m.get('featureGroups',0)} | {x.get('generic')} | {x.get('score')} |")
    lines += [f"\n### {x['name']}",f"- URL: `{x['url']}`",f"- Title: `{x.get('title','')}`",f"- Visible: {x.get('visible','')[:1000]}",f"- Routes: `{x.get('routes',[])}`",f"- APIs: `{x.get('apis',[])[:30]}`",f"- Features: `{x.get('features',{})}`"]
(OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8')
print(json.dumps([{'id':x['id'],'score':x.get('score'),'metrics':x.get('metrics'),'features':list((x.get('features') or {}).keys())} for x in results],ensure_ascii=False,indent=2))
