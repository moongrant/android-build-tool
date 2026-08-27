from __future__ import annotations

import asyncio, hashlib, json, re
from pathlib import Path
from urllib.parse import urlencode

import requests
from bs4 import BeautifulSoup
from playwright.async_api import async_playwright

OUT=Path('pro-yalla-beautiful-world-probe');OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36','Accept-Language':'en-US,en;q=.9','Accept':'*/*'})
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found']
NAMES=['beautifulWorld','BeautifulWorld','beautifulworld','beautiful_world','beautiful-world','blessingWorld','BlessingWorld','worldBless','WorldBless','blessWorld','BlessWorld','beautifulLife','BeautifulLife','bless','Bless','worldActivity','WorldActivity']
IDS=['240530','20240530','240531','20240531','240601','20240601','6503232558']
rows=[]
def request(url):
 try:
  r=S.get(url,timeout=(15,60),allow_redirects=True);data=r.content;text=data[:500000].decode('utf-8','ignore');soup=BeautifulSoup(text,'html.parser');visible=' '.join(soup.get_text(' ',strip=True).split())[:3000];low=(text+' '+visible).lower();refs=[]
  for tag,attr in [('script','src'),('link','href'),('img','src'),('source','src')]:
   for el in soup.find_all(tag):
    if el.get(attr):refs.append(el.get(attr))
  return {'url':url,'status':r.status_code,'finalUrl':r.url,'bytes':len(data),'contentType':r.headers.get('content-type'),'sha256':hashlib.sha256(data).hexdigest(),'title':soup.title.get_text(strip=True) if soup.title else '','visibleText':visible,'refs':refs[:300],'generic':any(x in low for x in GENERIC),'spaSignals':sum(x in low for x in ['chunk-vendors','js/app.','css/app.','webpack','__webpack','vue','react','manifest.json'])}
 except Exception as e:return {'url':url,'error':repr(e),'generic':True,'refs':[],'spaSignals':0}
for year in ['2023dist','2024dist','2025dist']:
 for name in NAMES:
  for suffix in ['/','/index.html']:
   row=request(f'https://activity2.yalla.live/activity/{year}/{name}{suffix}');row.update(kind='root',year=year,name=name);rows.append(row)
for year in ['2024dist','2025dist','2026dist']:
 for aid in IDS:
  q=urlencode({'activityId':aid,'region':'0','lang':'en','fromH5':'1','userId':'10000001','token':'archive-replay','v':'999','s':'3'})
  row=request(f'https://activity2.yalla.live/activity/{year}/templateActivity/?{q}');row.update(kind='template',year=year,activityId=aid);rows.append(row)
credible=[x for x in rows if x.get('status')==200 and not x.get('generic') and x.get('bytes',0)>=500 and (x.get('spaSignals',0) or len(x.get('refs',[]))>=2)]
# dedupe exact aliases
unique={}
for x in credible:unique.setdefault((x.get('sha256'),x.get('kind'),x.get('activityId'),x.get('name')),x)
credible=list(unique.values())
async def render():
 out=[]
 async with async_playwright() as p:
  b=await p.chromium.launch(headless=True,args=['--disable-dev-shm-usage','--no-sandbox'])
  for i,row in enumerate(credible):
   c=await b.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US');page=await c.new_page();net=[];errors=[]
   async def response(res):
    item={'url':res.url,'status':res.status,'type':res.request.resource_type,'contentType':(await res.all_headers()).get('content-type','')}
    if item['type'] in {'xhr','fetch','document'}:
     try:
      body=await res.body();item['bytes']=len(body);item['sha256']=hashlib.sha256(body).hexdigest();item['sample']=body[:5000].decode('utf-8','ignore')
     except Exception:pass
    net.append(item)
   page.on('response',lambda r:asyncio.create_task(response(r)));page.on('pageerror',lambda e:errors.append(str(e)))
   item=dict(row)
   try:
    await page.goto(row['url'],wait_until='domcontentloaded',timeout=90000);await page.wait_for_timeout(12000)
    body=await page.locator('body').inner_text();dom=await page.content();height=await page.evaluate('document.documentElement.scrollHeight')
    shot=f'{i:03d}-{row.get("kind")}-{row.get("activityId") or row.get("name")}.png';await page.screenshot(path=str(OUT/shot),full_page=True,animations='disabled')
    low=(body+' '+dom+' '+json.dumps(net)).lower();hits=[x for x in ['beautiful world','bless','benefit','reward','gift','mascot','city'] if x in low]
    item['render']={'finalUrl':page.url,'title':await page.title(),'height':height,'bodyText':body[:20000],'domLength':len(dom),'network':net,'pageErrors':errors,'screenshot':shot,'hits':hits}
   except Exception as e:item['render']={'error':repr(e),'network':net,'pageErrors':errors}
   out.append(item);await c.close()
  await b.close()
 return out
rendered=asyncio.run(render())
confirmed=[]
for x in rendered:
 r=x.get('render') or {};low=((r.get('bodyText') or '')+' '+json.dumps(r.get('network') or [])).lower();generic=any(g in low for g in GENERIC)
 if not generic and r.get('height',0)>=844 and any(h in low for h in ['beautiful world','bless to get benefits','protect a beautiful world']):confirmed.append(x)
(OUT/'http-results.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2));(OUT/'credible.json').write_text(json.dumps(credible,ensure_ascii=False,indent=2));(OUT/'rendered.json').write_text(json.dumps(rendered,ensure_ascii=False,indent=2));(OUT/'confirmed.json').write_text(json.dumps(confirmed,ensure_ascii=False,indent=2))
lines=['# Beautiful World SPA Probe','',f'- HTTP attempts: {len(rows)}',f'- Credible shells: {len(credible)}',f'- Target-confirmed: {len(confirmed)}','']
for x in confirmed:lines += [f"- `{x['url']}` · {(x.get('render') or {}).get('height')}px · `{(x.get('render') or {}).get('screenshot')}`"]
(OUT/'REPORT.md').write_text('\n'.join(lines));print(json.dumps({'attempts':len(rows),'credible':len(credible),'confirmed':[x['url'] for x in confirmed]},ensure_ascii=False,indent=2))
