#!/usr/bin/env python3
import asyncio, aiohttp, hashlib, json, os, re
from pathlib import Path
from urllib.parse import urlparse

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch3-config-assets'));OUT.mkdir(parents=True,exist_ok=True)
ACTIVITIES=[
('act-25-ramadan-rich-pk',915,849),('act-25-ramadan-main',917,850),('act-25-ramadan-food-carnival',919,851),('act-25-ramadan-happy-holi',927,853),('act-25-ramadan-light',931,856),('act-25-ramadan-treasure-hunting',943,861),('act-25-ramadan-gift',948,864),('act-25-ramadan-eid-al-fitr',968,870),
('act-winter-festival',350,486),('act-winter-cp',379,516),('act-winter-room',411,542),('act-winter-family',432,554),('act-bengali-new-year-24',478,586),('act-blind-box-rave',517,612),('act-hatching-chicks',198,317),('act-diwali-festival-25',1342,1031),('act-blind-box-challenge-25',1181,954),('act-black-diamond',391,526),('act-black-diamond-lottery',427,551)]
HEAD={'user-agent':'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36','accept':'application/json,text/plain,*/*','content-type':'application/json;charset=UTF-8','origin':'https://web-test.falla.live','referer':'https://web-test.falla.live/'}
sem=asyncio.Semaphore(24)

def safe_path(url):
 u=urlparse(url); p=u.path.strip('/') or 'index'; name=(u.netloc+'/'+p).replace('..','_');
 if u.query:name += '__q_'+hashlib.sha256(u.query.encode()).hexdigest()[:12]
 return Path('downloads')/name

def find_urls(obj):
 text=json.dumps(obj,ensure_ascii=False) if not isinstance(obj,str) else obj
 return set(re.findall(r'https?://[^"\'<>\\\s)]+',text))

async def fetch(session,url,method='GET',payload=None,rel=None):
 row={'url':url,'method':method,'payload':payload}
 try:
  async with sem:
   kw={'headers':HEAD,'timeout':aiohttp.ClientTimeout(total=60),'allow_redirects':True}
   if method=='POST':kw['json']=payload
   async with session.request(method,url,**kw) as r:
    b=await r.read(); row.update(status=r.status,finalUrl=str(r.url),contentType=r.headers.get('content-type',''),bytes=len(b),sha256=hashlib.sha256(b).hexdigest())
    if rel is None:rel=safe_path(str(r.url))
    p=OUT/rel;p.parent.mkdir(parents=True,exist_ok=True);p.write_bytes(b);row['path']=str(rel)
    try:row['json']=json.loads(b.decode('utf-8-sig'))
    except:row['preview']=b[:300].decode('utf-8','replace')
 except Exception as e:row['error']=repr(e)
 return row

async def main():
 rows=[]; configs={}; urls=set()
 async with aiohttp.ClientSession(connector=aiohttp.TCPConnector(limit=32,ssl=False)) as s:
  # Configs first.
  jobs=[]
  for project,aid,tid in ACTIVITIES:
   jobs.append(fetch(s,'https://api.apifalla.com/api/web/activities_config/act','POST',{'activitiesId':aid},Path('configs')/f'{aid}-{project}.json'))
   jobs.append(fetch(s,f'https://web.fallaweb.com/lang_conf/h5_{tid}.json',rel=Path('translations')/f'h5_{tid}-prod.json'))
   jobs.append(fetch(s,f'https://web.falla.live/lang_conf/pre/h5_{tid}.json',rel=Path('translations')/f'h5_{tid}-pre.json'))
   jobs.append(fetch(s,f'https://web.falla.live/activity_gift_config_v3/pre/h5_{aid}_ALL.json',rel=Path('gift-config')/f'h5_{aid}_ALL-pre.json'))
   jobs.append(fetch(s,f'https://web.falla.live/activity_gift_config_v3/prod/h5_{aid}_ALL.json',rel=Path('gift-config')/f'h5_{aid}_ALL-prod.json'))
  first=await asyncio.gather(*jobs);rows.extend(first)
  for r in first:
   if r.get('status')==200 and isinstance(r.get('json'),(dict,list)):
    urls |= find_urls(r['json'])
    if r['path'].startswith('configs/'):
     try:
      aid=int(Path(r['path']).name.split('-',1)[0]);configs[str(aid)]=r['json']
     except:pass
  # Iterative URL closure from JSON and text assets.
  seen=set(); pass_num=0
  while pass_num<3:
   todo=sorted(u for u in urls if u not in seen);seen.update(todo)
   if not todo:break
   out=await asyncio.gather(*(fetch(s,u) for u in todo));rows.extend(out)
   added=set()
   for r in out:
    if r.get('status')==200:
     if isinstance(r.get('json'),(dict,list)):added |= find_urls(r['json'])
     elif any(x in r.get('contentType','') for x in ['text','javascript','css']):added |= find_urls(r.get('preview',''))
   urls |= added;pass_num+=1
  (OUT/'activity-configs.json').write_text(json.dumps(configs,ensure_ascii=False,indent=2),encoding='utf-8')
  (OUT/'records.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2),encoding='utf-8')
  mapping={r['url']:{'path':r.get('path'),'status':r.get('status'),'bytes':r.get('bytes'),'sha256':r.get('sha256'),'contentType':r.get('contentType')} for r in rows if r.get('status')==200 and r.get('path')}
  (OUT/'url-map.json').write_text(json.dumps(mapping,ensure_ascii=False,indent=2),encoding='utf-8')
  sums=[]
  for r in rows:
   if r.get('status')==200 and r.get('path') and r.get('sha256'):sums.append(f"{r['sha256']}  {r['path']}  {r['url']}")
  (OUT/'SHA256SUMS.txt').write_text('\n'.join(sums),encoding='utf-8')
  lines=['# Batch 3 Config Asset Closure','',f'- activities: {len(ACTIVITIES)}',f'- requests: {len(rows)}',f'- HTTP 200: {sum(r.get("status")==200 for r in rows)}',f'- referenced URLs: {len(seen)}',f'- downloaded bytes: {sum(r.get("bytes",0) for r in rows if r.get("status")==200)}','']
  for project,aid,tid in ACTIVITIES:
   cfg=configs.get(str(aid),{});res=cfg.get('res',{}) if isinstance(cfg,dict) else {};lines.append(f"- {project}: config={'yes' if res else 'no'} / gift={len(res.get('giftInfoList') or [])}")
  (OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8');print('\n'.join(lines))
asyncio.run(main())
