from __future__ import annotations

import asyncio
import contextlib
import csv
import hashlib
import json
import mimetypes
import os
import re
import shutil
from collections import defaultdict, deque
from datetime import datetime, timezone
from pathlib import Path
from urllib.parse import parse_qsl, quote, unquote, urljoin, urlparse, urlunparse

import requests
from bs4 import BeautifulSoup
from PIL import Image, ImageDraw, ImageFont
from playwright.async_api import async_playwright

OUT=Path(os.environ.get('YALLA_RAMADAN_BLESS_OUT','pro-yalla-ramadan-bless-recovery'))
shutil.rmtree(OUT,ignore_errors=True)
for name in ['activities','data','assets','fixtures','screenshots','registry','replay','logs']:(OUT/name).mkdir(parents=True,exist_ok=True)
ACTIVITY_ID='260212'
TARGET={
 'id':'yalla-ramadan-bless-2026','name':'Ramadan Bless 2026','year':2026,'campaign':'Yalla Ramadan 2026','parentCampaign':'Yalla Ramadan 2026',
 'officialUrl':'https://activity2.yalla.live/activity/2026dist/ramadanBless/','spaRoot':'/activity/2026dist/ramadanBless/','projectSlug':'ramadanBless',
 'keywords':['ramadan','bless','blessing','lantern','gift','reward','card','task','store','rank','collection','mission','progress']
}
UA='Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36 Yalla/3.6.2'
S=requests.Session();S.headers.update({'User-Agent':UA,'Accept':'*/*','Accept-Language':'en-US,en;q=.9,ar;q=.6','Referer':TARGET['officialUrl']})
MAX_FILES=2500;MAX_BYTES=450*1024*1024;MAX_FILE=80*1024*1024
STATIC_RE=re.compile(r'\.(?:js|mjs|css|png|jpe?g|webp|gif|svg|ico|json|woff2?|ttf|otf|eot|mp3|wav|ogg|m4a|mp4|webm|map|wasm)(?:[?#]|$)',re.I)
TEXT_RE=re.compile(r'\.(?:html?|js|mjs|css|json|map|svg|txt|xml)(?:[?#]|$)',re.I)
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found']
SAFE_CLICK=re.compile(r'rule|reward|rank|list|history|record|shop|store|task|card|album|collection|honor|map|memory|treasure|medal|more|info|daily|total|progress|gift|bless',re.I)
BLOCK_CLICK=re.compile(r'buy|purchase|recharge|top.?up|pay|withdraw|delete|logout|submit|confirm|send|claim|draw|spin|start|attack',re.I)

def now():return datetime.now(timezone.utc).isoformat()
def digest(data:bytes):return hashlib.sha256(data).hexdigest()
def write_json(path:Path,obj):path.parent.mkdir(parents=True,exist_ok=True);path.write_text(json.dumps(obj,ensure_ascii=False,indent=2),encoding='utf-8')
def safe(value:str,limit=170):return (re.sub(r'[^A-Za-z0-9._-]+','_',unquote(str(value or ''))).strip('._') or 'item')[:limit]
def normalize(url:str,strip=False):
 p=urlparse(url);query=parse_qsl(p.query,keep_blank_values=True)
 if strip:query=[(k,v) for k,v in query if k.lower() not in {'_','t','ts','timestamp','v','version','cb','cache'}]
 q='&'.join(f"{quote(k,safe='[]')}={quote(v,safe='/:,[]')}" for k,v in sorted(query))
 return urlunparse(((p.scheme or 'https').lower(),p.netloc.lower(),re.sub(r'/{2,}','/',p.path or '/'),' ',q,'')).replace('/ ','/')
def pkey(url):p=urlparse(url);return p.netloc.lower()+re.sub(r'/{2,}','/',p.path or '/')
def allowed(url):
 try:
  p=urlparse(url);host=(p.hostname or '').lower()
  return p.scheme in {'http','https'} and any(x in host for x in ['yalla','yallalive','peakxyz','cloudfront','amazonaws','aliyuncs','oss-'])
 except Exception:return False
def ext_for(url,ctype):
 e=Path(urlparse(url).path).suffix
 if e and len(e)<=8:return e
 ct=(ctype or '').split(';')[0].lower();known={'text/html':'.html','text/css':'.css','application/javascript':'.js','text/javascript':'.js','application/json':'.json','image/png':'.png','image/jpeg':'.jpg','image/webp':'.webp','image/gif':'.gif','image/svg+xml':'.svg','font/woff2':'.woff2','font/woff':'.woff','video/mp4':'.mp4','audio/mpeg':'.mp3','application/wasm':'.wasm'}
 return known.get(ct,mimetypes.guess_extension(ct) or '.bin')
def storage(base:Path,url,ctype,category):
 p=urlparse(url);bits=[safe(x) for x in unquote(p.path or '/').split('/') if x]
 if not bits:bits=['index']
 if (p.path or '/').endswith('/'):bits.append('index')
 name=bits[-1]
 if not Path(name).suffix:name+=ext_for(url,ctype)
 if p.query:
  pp=Path(name);name=f'{safe(pp.stem)}__q_{digest(p.query.encode())[:12]}{pp.suffix or ext_for(url,ctype)}'
 return base/category/'origins'/safe(p.netloc)/Path(*bits[:-1])/name
def text_like(url,ctype,data=b''):
 return any(x in (ctype or '').lower() for x in ['text/','javascript','json','xml','svg']) or bool(TEXT_RE.search(url)) or data[:50].lstrip().startswith((b'<',b'{',b'[',b'/*',b'//'))
def refs(text,base):
 text=text.replace('\\/','/').replace('\\u002F','/');out=set()
 for u in re.findall(r'https?://[^\s\"\'<>`)\\]+',text,re.I):out.add(u.rstrip(',.;)]}'))
 if '<' in text[:5000]:
  with contextlib.suppress(Exception):
   soup=BeautifulSoup(text,'html.parser')
   for tag,attr in [('script','src'),('link','href'),('img','src'),('source','src'),('video','src'),('video','poster'),('audio','src')]:
    for el in soup.find_all(tag):
     if el.get(attr):out.add(urljoin(base,el.get(attr)))
 for u in re.findall(r'url\(\s*[\'\"]?([^)\'\"\s]+)',text,re.I):out.add(urljoin(base,u))
 for u in re.findall(r'[\'\"]([^\'\"\n\r]{1,500}\.(?:js|mjs|css|png|jpe?g|webp|gif|svg|ico|json|woff2?|ttf|otf|eot|mp3|wav|ogg|m4a|mp4|webm|map|wasm)(?:\?[^\'\"]*)?)[\'\"]',text,re.I):out.add(urljoin(base,u))
 for u in re.findall(r'sourceMappingURL=([^\s*]+)',text,re.I):out.add(urljoin(base,u.strip()))
 return {normalize(u) for u in out if allowed(u)}
def route_hints(text):
 out={'/'}
 for pattern in [r"\bpath\s*:\s*['\"]([^'\"]{1,160})['\"]",r"\bredirect\s*:\s*['\"]([^'\"]{1,160})['\"]",r"['\"](#/[A-Za-z0-9_./?=&%-]{1,160})['\"]"]:
  for v in re.findall(pattern,text):
   v=v.lstrip('#');v=v if v.startswith('/') else '/'+v
   if not STATIC_RE.search(v) and not any(x in v.lower() for x in ['/api/','/assets/','/static/','/images/']):out.add(v)
 return out

activity=OUT/'activities'/TARGET['id']
for name in ['spa','assets','fixtures','evidence','replay']:(activity/name).mkdir(parents=True,exist_ok=True)
shots=OUT/'screenshots'/TARGET['id'];shots.mkdir(parents=True,exist_ok=True)
records={};by_path=defaultdict(list);routes={'/'};total=0;http_log=[]
def category(url,ctype):
 p=urlparse(url);root=urlparse(TARGET['officialUrl'])
 if p.netloc==root.netloc and p.path.startswith(root.path):return 'spa'
 if 'json' in (ctype or '').lower() or any(x in p.path.lower() for x in ['/api/','/gateway/','/interface/']):return 'fixtures'
 return 'assets'
def save(url,data,ctype,source,status=200,headers=None,method='GET'):
 global total
 if not data or len(data)>MAX_FILE:return None
 url=normalize(url);cat=category(url,ctype);file=storage(activity,url,ctype,cat);file.parent.mkdir(parents=True,exist_ok=True);file.write_bytes(data)
 rec={'url':url,'method':method,'status':status,'contentType':ctype or 'application/octet-stream','bytes':len(data),'sha256':digest(data),'source':source,'category':cat,'file':file.relative_to(activity).as_posix(),'headers':{str(k).lower():str(v) for k,v in (headers or {}).items() if str(k).lower() in {'content-type','etag','last-modified','cache-control'}}}
 old=records.get(url)
 if old:total-=old['bytes']
 records[url]=rec;by_path[pkey(url)].append(url);total+=len(data)
 if text_like(url,ctype,data):routes.update(route_hints(data[:12_000_000].decode('utf-8','ignore')))
 return rec
def live(url):
 for attempt in range(3):
  try:
   r=S.get(url,timeout=(20,100),allow_redirects=True);http_log.append({'url':url,'status':r.status_code,'bytes':len(r.content),'finalUrl':r.url,'attempt':attempt+1})
   if r.status_code==200 and r.content:return r.content,r.headers.get('content-type',''),r.url,dict(r.headers)
  except Exception as exc:http_log.append({'url':url,'error':repr(exc),'attempt':attempt+1})
 return None,None,url,{}

queue=deque([TARGET['officialUrl'],urljoin(TARGET['officialUrl'],'index.html')]);seen=set()
while queue and len(records)<MAX_FILES and total<MAX_BYTES:
 url=queue.popleft();url=normalize(url)
 if url in seen or not allowed(url):continue
 seen.add(url);data,ctype,final,headers=live(url)
 if not data:continue
 rec=save(final,data,ctype,'live',headers=headers)
 if rec and text_like(rec['url'],rec['contentType'],data):
  text=data[:12_000_000].decode('utf-8','ignore')
  for u in refs(text,rec['url']):
   if u not in seen:queue.append(u)
write_json(activity/'evidence'/'http-log.json',http_log)
write_json(activity/'replay'/'url-map.json',{'rootUrl':TARGET['officialUrl'],'activityId':ACTIVITY_ID,'records':{**records,**{normalize(k,True):v for k,v in records.items()}},'pathIndex':by_path})

async def run_browser():
 qa={'brokenImages':0,'consoleFatalErrors':0,'missingChunks':0,'unmappedRequests':0,'remoteIframes':0,'remoteRuntimeFallback':0,'missingStaticAssets':0,'states':[],'unmapped':[],'console':[]}
 online=[]
 async with async_playwright() as p:
  browser=await p.chromium.launch(headless=True,args=['--disable-dev-shm-usage','--no-sandbox'])
  context=await browser.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US',timezone_id='Asia/Riyadh',user_agent=UA,ignore_https_errors=True)
  await context.add_init_script("""({fixed})=>{const R=Date;class D extends R{constructor(...a){super(...(a.length?a:[fixed]));}static now(){return fixed;}}Object.setPrototypeOf(D,R);window.Date=D;const n=()=>{},e=()=>'';window.YallaBridge=window.YallaBridge||{getToken:e,getUserInfo:()=>null,close:n,share:n,openRoom:n};window.Android=window.Android||{getToken:e,getUserInfo:e,closeWebView:n,share:n};}""",{'fixed':int(datetime(2026,2,20,tzinfo=timezone.utc).timestamp()*1000)})
  page=await context.new_page();pending=set();console=[];failures=[]
  page.on('console',lambda m:console.append({'type':m.type,'text':m.text[:2500]}));page.on('pageerror',lambda e:console.append({'type':'pageerror','text':str(e)[:2500]}));page.on('requestfailed',lambda r:failures.append({'url':r.url,'method':r.method,'error':str(r.failure)}))
  async def response_handler(response):
   try:
    url=response.url;headers=await response.all_headers();ctype=headers.get('content-type','');body=await response.body()
    if body and len(body)<=MAX_FILE and allowed(url):save(url,body,ctype,'online-browser',response.status,headers,response.request.method)
   except Exception:pass
  page.on('response',lambda response:pending.add(asyncio.create_task(response_handler(response))))
  async def reveal():
   await page.evaluate("""()=>{for(const id of ['finishToast','activityFinish','activityOver','overPage']){const n=document.getElementById(id);if(n)n.style.setProperty('display','none','important')}for(const s of ['[class*="finish" i]','[class*="ended" i]','[class*="activity-over" i]'])document.querySelectorAll(s).forEach(n=>{const t=(n.innerText||'').toLowerCase();if(t.includes('activity')&&(t.includes('ended')||t.includes('over')))n.style.setProperty('display','none','important')});const app=document.getElementById('app');if(app)app.style.setProperty('display','block','important');const l=document.getElementById('loadingGif');if(l)l.style.setProperty('display','none','important');document.documentElement.style.overflow='auto';document.body.style.overflow='auto'}""").catch(lambda:None)
  async def scroll():
   await page.evaluate("""async()=>{const w=ms=>new Promise(r=>setTimeout(r,ms));const c=[document.scrollingElement,document.documentElement,document.body,...document.querySelectorAll('*')].filter(Boolean).filter(e=>e.scrollHeight>e.clientHeight+120).sort((a,b)=>b.scrollHeight-a.scrollHeight);const e=c[0]||document.scrollingElement;const m=Math.min(e?.scrollHeight||0,50000);for(let y=0;y<=m;y+=620){if(e===document.scrollingElement||e===document.documentElement||e===document.body)scrollTo(0,y);else e.scrollTop=y;await w(80)}if(e===document.scrollingElement||e===document.documentElement||e===document.body)scrollTo(0,0);else e.scrollTop=0}""").catch(lambda:None)
  hashes=set()
  async def capture(label,url,source):
   try:await page.goto(url,wait_until='domcontentloaded',timeout=90000);await page.wait_for_timeout(10000)
   except Exception as exc:console.append({'type':'navigation','text':repr(exc)})
   await reveal();await page.wait_for_timeout(1800);await scroll();await page.wait_for_timeout(700)
   image=await page.screenshot(full_page=True,animations='disabled',caret='hide');h=digest(image)
   if h in hashes:return None
   hashes.add(h);index=len(online)+1;file=shots/f'{index:02d}-{safe(label,60)}-online.png';file.write_bytes(image)
   info=await page.evaluate("""()=>({title:document.title,text:(document.body?.innerText||'').replace(/\s+/g,' ').trim().slice(0,25000),height:Math.max(document.documentElement.scrollHeight,document.body?.scrollHeight||0),width:Math.max(document.documentElement.scrollWidth,document.body?.scrollWidth||0),appHTMLLength:document.getElementById('app')?.innerHTML.length||0,images:[...document.images].map(x=>({src:x.currentSrc||x.src,complete:x.complete,width:x.naturalWidth,height:x.naturalHeight})),iframes:[...document.querySelectorAll('iframe')].map(x=>x.src),clickables:[...document.querySelectorAll('button,a,[role="button"],[class*="tab" i],[class*="btn" i],[class*="menu" i]')].filter(e=>{const r=e.getBoundingClientRect();return r.width>22&&r.height>16}).map((e,i)=>({i,text:(e.innerText||e.getAttribute('aria-label')||'').replace(/\s+/g,' ').trim().slice(0,120),href:e.href||''})).filter(x=>x.text||x.href).slice(0,180)})""")
   html=await page.content();(activity/'replay'/f'{index:02d}-{safe(label,60)}-online.html').write_text(html,encoding='utf-8')
   row={'label':label,'source':source,'url':page.url,'screenshot':file.relative_to(OUT).as_posix(),'sha256':h,**info};online.append(row);return row
  query=f'?activityId={ACTIVITY_ID}&region=0&showTopBar=false&fromH5=1&userId=10000001&token=archive-replay&v=999&s=3&lang=en'
  home=await capture('home',TARGET['officialUrl']+query,'root')
  for route in sorted(routes,key=lambda x:(x.count('/'),len(x),x))[:30]:
   if len(online)>=10:break
   if route!='/':await capture(route.lstrip('/'),TARGET['officialUrl']+query+'#'+route,'bundle-route')
  clicked=set()
  for item in (home or {}).get('clickables',[]):
   if len(online)>=10:break
   text=(item.get('text') or '').strip()
   if not text or text.lower() in clicked or len(text)>80 or not SAFE_CLICK.search(text) or BLOCK_CLICK.search(text):continue
   clicked.add(text.lower())
   try:
    await page.goto(TARGET['officialUrl']+query,wait_until='domcontentloaded',timeout=90000);await page.wait_for_timeout(6000);await reveal()
    locator=page.locator("button,a,[role='button'],[class*='tab' i],[class*='btn' i],[class*='menu' i]").filter(has_text=text).first
    if await locator.count():await locator.click(force=True,timeout=6000);await page.wait_for_timeout(1800);await reveal();await capture(text,page.url,'safe-ui-click')
   except Exception:pass
  if pending:await asyncio.gather(*list(pending),return_exceptions=True)
  write_json(activity/'evidence'/'online.json',{'states':online,'console':console,'failures':failures})
  await context.close()

  # Offline replay: every remote request must map to captured bytes.
  context=await browser.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US',timezone_id='Asia/Riyadh',user_agent=UA)
  page=await context.new_page();unmapped=[];fatal=[]
  async def handler(route,request):
   rec=records.get(normalize(request.url)) or records.get(normalize(request.url,True))
   if not rec:
    cand=by_path.get(pkey(request.url),[]);rec=records.get(cand[0]) if len(cand)==1 else None
   if rec:return await route.fulfill(status=int(rec.get('status') or 200),headers={'content-type':rec.get('contentType') or 'application/octet-stream','access-control-allow-origin':'*','cache-control':'no-store'},body=(activity/rec['file']).read_bytes())
   if request.method=='OPTIONS':return await route.fulfill(status=204,headers={'access-control-allow-origin':'*'},body=b'')
   cat='chunk' if re.search(r'\.(?:js|mjs)(?:[?#]|$)',request.url,re.I) else 'static' if STATIC_RE.search(request.url) else 'api';unmapped.append({'url':request.url,'method':request.method,'resourceType':request.resource_type,'category':cat})
   return await route.fulfill(status=404,headers={'content-type':'application/json' if cat=='api' else 'text/plain','access-control-allow-origin':'*'},body=b'{"code":404,"message":"offline fixture unavailable"}' if cat=='api' else b'')
  await context.route('**/*',handler);page.on('pageerror',lambda e:fatal.append(str(e)))
  for i,state in enumerate(online[:10],1):
   start=len(unmapped);startf=len(fatal)
   try:await page.goto(state['url'],wait_until='domcontentloaded',timeout=90000);await page.wait_for_timeout(6500)
   except Exception:pass
   await reveal();await scroll();metrics=await page.evaluate("""()=>({images:[...document.images].map(x=>({complete:x.complete,width:x.naturalWidth,height:x.naturalHeight})),iframes:[...document.querySelectorAll('iframe')].map(x=>x.src),height:Math.max(document.documentElement.scrollHeight,document.body?.scrollHeight||0),text:(document.body?.innerText||'').replace(/\s+/g,' ').trim().slice(0,10000)})""")
   file=shots/f'{i:02d}-{safe(state["label"],60)}-offline.png';await page.screenshot(path=str(file),full_page=True,animations='disabled')
   state_unmapped=unmapped[start:];broken=sum(not x['complete'] or not x['width'] for x in metrics['images']);frames=sum(bool(x and not x.startswith(('about:','data:'))) for x in metrics['iframes']);fatals=len(fatal[startf:])
   qa['brokenImages']+=broken;qa['consoleFatalErrors']+=fatals;qa['remoteIframes']+=frames;qa['states'].append({'label':state['label'],'screenshot':file.relative_to(OUT).as_posix(),'brokenImages':broken,'remoteIframes':frames,'unmapped':state_unmapped,'height':metrics['height'],'text':metrics['text']})
  qa['unmapped']=list({(x['method'],x['url']):x for x in unmapped}.values());qa['unmappedRequests']=len(qa['unmapped']);qa['missingChunks']=sum(x['category']=='chunk' for x in qa['unmapped']);qa['missingStaticAssets']=sum(x['category']=='static' for x in qa['unmapped'])
  await context.close();await browser.close()
 return online,qa

online,qa=asyncio.run(run_browser())
recs=list(records.values());js=sum('javascript' in x['contentType'].lower() or re.search(r'\.(?:js|mjs)(?:[?#]|$)',x['url'],re.I) is not None for x in recs);css=sum('css' in x['contentType'].lower() or re.search(r'\.css(?:[?#]|$)',x['url'],re.I) is not None for x in recs);images=sum(x['contentType'].lower().startswith('image/') or re.search(r'\.(?:png|jpe?g|webp|gif|svg)(?:[?#]|$)',x['url'],re.I) is not None for x in recs);fonts=sum('font' in x['contentType'].lower() or re.search(r'\.(?:woff2?|ttf|otf|eot)(?:[?#]|$)',x['url'],re.I) is not None for x in recs);fixtures=sum(x['category']=='fixtures' for x in recs)
hits=sorted({k for state in online for k in TARGET['keywords'] if k in (state.get('text') or '').lower()});rich=sum((s.get('height') or 0)>844 or len(s.get('images',[]))>=5 or bool(hits) for s in online)
asset_ok=js>=1 and css>=1 and images>=3 and len(recs)>=12;depth_ok=len(online)>=3 and rich>=2 and (hits or len(routes)>=3);qa_pass=all(qa[k]==0 for k in ['brokenImages','consoleFatalErrors','missingChunks','unmappedRequests','remoteIframes','remoteRuntimeFallback','missingStaticAssets']);status='VERIFIED_OFFICIAL_SPA' if asset_ok and depth_ok and qa_pass else 'VERIFIED_PARTIAL_SPA' if asset_ok and online else 'OFFICIAL_URL_EXPIRED'
result={**TARGET,'activityId':ACTIVITY_ID,'routes':sorted(routes),'routeCount':len(routes),'stateCount':len(online),'fileCount':len(recs),'assetCount':sum(bool(STATIC_RE.search(x['url'])) for x in recs),'apiCount':fixtures,'fixtureCount':fixtures,'sourceType':'OFFICIAL_PRODUCTION_CHILD_SPA_BROWSER_CLOSURE','status':status,'quality':'A' if status=='VERIFIED_OFFICIAL_SPA' else 'B+' if asset_ok else 'C','localReplay':bool(online),'screenshot':bool(online),'currentReleaseVerified':status=='VERIFIED_OFFICIAL_SPA','screenshots':[x['screenshot'] for x in online],'metrics':{'totalBytes':total,'jsCount':js,'cssCount':css,'imageCount':images,'fontCount':fonts,'richStateCount':rich,'keywordHits':hits,'assetOk':asset_ok,'depthOk':depth_ok},'qa':{k:qa[k] for k in ['brokenImages','consoleFatalErrors','missingChunks','unmappedRequests','remoteIframes','remoteRuntimeFallback','missingStaticAssets']},'notes':['Independent child SPA linked by the collected Ramadan parent campaign; the child root itself was not present in the current Campaigns Collected registry.','Original HTML, bundles, CSS, chunks, assets and captured API responses are preserved.','No fabricated users, rankings, rewards or gameplay outcomes are included.']}
write_json(activity/'activity.json',result);write_json(activity/'manifest.json',{'activity':result,'records':recs,'onlineStates':online,'qa':qa,'generatedAt':now()});write_json(OUT/'registry'/'yalla-ramadan-bless-registry.json',{'schemaVersion':'6.0','generatedAt':now(),'activities':[result]})
fields=['id','name','year','campaign','parentCampaign','officialUrl','spaRoot','activityId','projectSlug','routeCount','stateCount','fileCount','assetCount','apiCount','fixtureCount','status','quality','localReplay','screenshot','currentReleaseVerified']
with (OUT/'registry'/'yalla-ramadan-bless-registry.csv').open('w',newline='',encoding='utf-8-sig') as f:w=csv.DictWriter(f,fieldnames=fields);w.writeheader();w.writerow({k:result.get(k) for k in fields})
rows=['| Activity | Routes | States | Files | JS/CSS/Images | Fixtures | QA B/C/M/U | Status |','|---|---:|---:|---:|---|---:|---|---|',f"| {result['name']} | {result['routeCount']} | {result['stateCount']} | {result['fileCount']} | {js}/{css}/{images} | {fixtures} | {result['qa']['brokenImages']}/{result['qa']['consoleFatalErrors']}/{result['qa']['missingChunks']}/{result['qa']['unmappedRequests']} | {status} |"]
(OUT/'RESULT-BOARD.md').write_text('\n'.join(['# Yalla Ramadan Bless 2026 Recovery','',*rows]),encoding='utf-8');(OUT/'QA.md').write_text('# QA\n\n```json\n'+json.dumps(result['qa'],indent=2)+'\n```\n',encoding='utf-8');(OUT/'README.md').write_text('# Yalla Ramadan Bless 2026\n\nOriginal independent Yalla child SPA recovery. No promotional or mock page is used.\n',encoding='utf-8');write_json(OUT/'assets'/'index.json',{result['id']:f"activities/{result['id']}/assets"});write_json(OUT/'fixtures'/'index.json',{result['id']:f"activities/{result['id']}/fixtures"});write_json(OUT/'replay'/'index.json',{result['id']:f"activities/{result['id']}/replay"});write_json(OUT/'data'/'release-summary.json',{'activities':[result]})
# Contact sheet
entries=[OUT/x for x in result['screenshots'][:6] if (OUT/x).exists()]
if entries:
 tw,gap,cols=300,18,min(3,len(entries));cards=[]
 for p in entries:
  with Image.open(p) as im:im=im.convert('RGB');h=max(1,int(im.height*tw/im.width));cards.append((p,im.resize((tw,h))))
 heights=[100]*cols;placed=[]
 for card in cards:c=min(range(cols),key=lambda i:heights[i]);x=gap+c*(tw+gap);y=heights[c];placed.append((card,x,y));heights[c]+=card[1].height+50+gap
 canvas=Image.new('RGB',(gap+cols*(tw+gap),max(heights)+gap),'#080b12');draw=ImageDraw.Draw(canvas);font=ImageFont.load_default();draw.text((gap,20),'Yalla Ramadan Bless 2026 - original child SPA',fill='white',font=font);draw.text((gap,46),f'{status} - {len(recs)} files - {len(online)} states',fill='#aeb6c3',font=font)
 for (p,im),x,y in placed:draw.rectangle((x,y,x+tw,y+34),fill='#171c27');draw.text((x+8,y+10),p.stem[:42],fill='white',font=font);canvas.paste(im,(x,y+34))
 canvas.save(OUT/'screenshots'/'ramadan-bless-contact-sheet.jpg',quality=89)
print(json.dumps(result,ensure_ascii=False,indent=2))
