from __future__ import annotations

import asyncio
import hashlib
import json
import re
from pathlib import Path
from urllib.parse import urlencode

import requests
from bs4 import BeautifulSoup
from playwright.async_api import async_playwright

OUT=Path('pro-yalla-evidence-backed-probe');OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36','Accept-Language':'en-US,en;q=.9,ar;q=.6','Accept':'*/*'})
GENERIC_SHA='578c0eda0ee2021421fe0e5d38c6d23bdf7b4e29fc6fa17101a5371780428be5'
GENERIC=['the activity has ended','activity has ended','more coming soon','404 not found','page not found','access denied']
# Only evidence-backed names: links found inside official bundles, registry roots, official promo titles, and direct anniversary sequence continuation.
HYPOTHESES=[
 ('ramadan-bless-2026','2026dist',['ramadanBless'],{'activityId':'260212'}),
 ('magic-lamp-2021','2021dist',['MagicLamp'],{}),
 ('beat-pinata-2021','2021dist',['beatPinata'],{}),
 ('sixth-anniversary-2022','2022dist',['6thAnniversary','sixthAnniversary'],{}),
 ('seventh-anniversary-2023','2023dist',['7thAnniversary','seventhAnniversary'],{}),
 ('sweet-love-2024','2024dist',['sweetLove','SweetLove'],{'activityId':'240207'}),
 ('lucky-carnival-2024','2024dist',['luckyCarnival','LuckyCarnival'],{'activityId':'241022'}),
 ('watermelon-2026','2026dist',['watermelon','Watermelon'],{}),
 ('coin-boom-2026','2026dist',['coinBoom','CoinBoom'],{}),
 ('treasure-tycoon-2026','2026dist',['treasureTycoon','TreasureTycoon','wealthPath'],{}),
 ('desert-monster-2026','2026dist',['desertMonster','DesertMonster'],{}),
 ('invitation-officer-2026','2026dist',['invitationOfficer','InvitationOfficer'],{}),
]

def fetch(url):
 try:
  r=S.get(url,timeout=(15,60),allow_redirects=True);data=r.content;text=data[:500000].decode('utf-8','ignore');soup=BeautifulSoup(text,'html.parser');visible=' '.join(soup.get_text(' ',strip=True).split())[:3000];low=(text+' '+visible).lower();refs=[]
  for tag,attr in [('script','src'),('link','href'),('img','src'),('source','src')]:
   for el in soup.find_all(tag):
    if el.get(attr):refs.append(el.get(attr))
  sha=hashlib.sha256(data).hexdigest();generic=sha==GENERIC_SHA or any(x in low for x in GENERIC)
  return {'url':url,'status':r.status_code,'finalUrl':r.url,'bytes':len(data),'contentType':r.headers.get('content-type'),'sha256':sha,'title':soup.title.get_text(strip=True) if soup.title else '','visibleText':visible,'refs':refs[:300],'generic':generic,'spaSignals':sum(x in low for x in ['chunk-vendors','js/app.','css/app.','webpack','__webpack','vue','react','manifest.json'])}
 except Exception as exc:return {'url':url,'error':repr(exc),'generic':True,'spaSignals':0,'refs':[]}

rows=[]
for activity,bucket,names,params in HYPOTHESES:
 for name in names:
  base=f'https://activity2.yalla.live/activity/{bucket}/{name}/'
  urls=[base,base+'index.html']
  if params:
   q=urlencode({**params,'region':'0','showTopBar':'false','fromH5':'1','userId':'10000001','token':'archive-replay','v':'999','s':'3','lang':'en'})
   urls += [base+'?'+q,base+'index.html?'+q]
  for url in urls:
   row=fetch(url);row.update({'activity':activity,'bucket':bucket,'project':name,'kind':'dedicated-root'});rows.append(row)
 # exact template only for known event IDs
 aid=params.get('activityId') if params else None
 if aid:
  for year in ['2024dist','2025dist','2026dist']:
   url=f'https://activity2.yalla.live/activity/{year}/templateActivity/?activityId={aid}&region=0&lang=en&fromH5=1'
   row=fetch(url);row.update({'activity':activity,'bucket':year,'project':'templateActivity','kind':'template-id','activityId':aid});rows.append(row)

credible=[x for x in rows if x.get('status')==200 and not x.get('generic') and x.get('bytes',0)>=500 and (x.get('spaSignals',0)>=1 or len(x.get('refs',[]))>=2)]
# dedupe exact bytes, but preserve first alias
unique={}
for row in credible:unique.setdefault((row.get('sha256'),row['activity']),row)
credible=list(unique.values())

async def render():
 rendered=[]
 if not credible:return rendered
 async with async_playwright() as p:
  browser=await p.chromium.launch(headless=True,args=['--disable-dev-shm-usage','--no-sandbox'])
  for index,row in enumerate(credible):
   context=await browser.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US')
   page=await context.new_page();net=[];errors=[]
   page.on('response',lambda response,net=net:net.append({'url':response.url,'status':response.status,'type':response.request.resource_type}))
   page.on('pageerror',lambda error,errors=errors:errors.append(str(error)))
   slug=f"{index:02d}-{row['activity']}-{row['project']}"
   item=dict(row)
   try:
    await page.goto(row['url'],wait_until='domcontentloaded',timeout=90000);await page.wait_for_timeout(10000)
    await page.evaluate("""async()=>{const w=ms=>new Promise(r=>setTimeout(r,ms));for(let y=0;y<Math.min(document.documentElement.scrollHeight,30000);y+=600){scrollTo(0,y);await w(80)}scrollTo(0,0)}""").catch(lambda:None)
    body=await page.locator('body').inner_text();dom=await page.content();height=await page.evaluate('document.documentElement.scrollHeight')
    await page.screenshot(path=str(OUT/f'{slug}.png'),full_page=True,animations='disabled')
    item['render']={'finalUrl':page.url,'title':await page.title(),'height':height,'bodyText':body[:20000],'domLength':len(dom),'network':net,'pageErrors':errors,'screenshot':f'{slug}.png'}
    low=(body+' '+dom).lower();item['targetHits']=[x for x in row['activity'].split('-') if len(x)>3 and x in low]
   except Exception as exc:item['render']={'error':repr(exc),'network':net,'pageErrors':errors}
   rendered.append(item);await context.close()
  await browser.close()
 return rendered

rendered=asyncio.run(render())
confirmed=[]
for item in rendered:
 r=item.get('render') or {};body=(r.get('bodyText') or '').lower();generic=any(x in body for x in GENERIC)
 if r.get('height',0)>=844 and not generic and (item.get('targetHits') or item.get('project')=='ramadanBless'):
  confirmed.append(item)
(OUT/'probe-results.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2))
(OUT/'credible.json').write_text(json.dumps(credible,ensure_ascii=False,indent=2))
(OUT/'rendered.json').write_text(json.dumps(rendered,ensure_ascii=False,indent=2))
(OUT/'confirmed.json').write_text(json.dumps(confirmed,ensure_ascii=False,indent=2))
lines=['# Yalla Evidence-Backed Root Probe','',f'- Hypotheses: {len(HYPOTHESES)}',f'- HTTP attempts: {len(rows)}',f'- Credible non-generic SPA shells: {len(credible)}',f'- Target-confirmed renders: {len(confirmed)}','']
for item in confirmed:lines += [f"## {item['activity']}",'',f"- URL: `{item['url']}`",f"- Project: `{item['project']}`",f"- Bytes: {item.get('bytes')}",f"- Height: {(item.get('render') or {}).get('height')}",f"- Screenshot: `{(item.get('render') or {}).get('screenshot')}`",'']
(OUT/'REPORT.md').write_text('\n'.join(lines))
print(json.dumps({'attempts':len(rows),'credible':len(credible),'confirmed':[x['activity'] for x in confirmed]},ensure_ascii=False,indent=2))
