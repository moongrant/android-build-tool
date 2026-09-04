#!/usr/bin/env python3
import asyncio, aiohttp, hashlib, json, os
from pathlib import Path
from urllib.parse import urlencode

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch3-repair-probe-fast')); OUT.mkdir(parents=True,exist_ok=True)
PROJECTS=[
('act-winter-festival','0.1.1','8fc2f087',350,486),('act-winter-cp','0.0.2','f9774d43',379,516),('act-winter-room','0.0.2','02cd9701',411,542),('act-winter-family','0.0.4','36732fab',432,554),('act-bengali-new-year-24','0.0.5','8672ecf6',478,586),('act-blind-box-rave','0.0.10','5dffc7e2',517,612),('act-hatching-chicks','0.0.7','1674c7ec',198,317),('act-black-diamond','0.0.8','39f1c811',391,526),('act-black-diamond-lottery','0.2.1','3e804c8b',427,551)]
ENDPOINTS={
350:['activities_config/act','act/task/v2/info','act/winterFestival/kingPk/groupCompetition','act/winterFestival/kingPk/rank','activities_config/rank'],
379:['activities_config/act','act/winterFestival/fantasyCp/top3','activities_config/rank'],
411:['activities_config/act','act/task/v2/info','act/winterFestival/groupPK/dayRank','act/winterFestival/groupPK/records/award','act/winterFestival/groupPK/records/gift','activities_config/rank','act/prizePackage/carousel'],
432:['activities_config/act','act/task/v2/info','act/winterFestival/familyPK/rank/family','act/winterFestival/familyPK/rank/supporter','act/winterFestival/familyPK/records','act/winterFestival/familyPK/userInfo','activities_config/rank','act/prizePackage/carousel','probability/prizeInfo','user/pack/type/info/list'],
478:['activities_config/act','activities_config/user','activities_config/rank','activities_config/group','active/2024/bengali/year','active/2024/bengali/year/carousel'],
517:['activities_config/act','act/newBlindAct/infos','act/newBlindAct/process','act/newBlindAct/rank','act/newBlindAct/blindRank','act/prizePackage/info'],
198:['activities_config/act','activities_config/user','activities_config/group','act/hatchChicks/info'],
391:['activities_config/act','act/diamondDebut/state'],
427:['activities_config/act','act/blackDiamond/cycleAct/draw/info','act/blackDiamond/cycleAct/awardInfo','act/prizePackage/carousel','probability/prizeInfo','user/coin']}
HEAD={'user-agent':'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36','accept':'application/json,text/plain,*/*','content-type':'application/json;charset=UTF-8','origin':'https://web-test.falla.live','referer':'https://web-test.falla.live/'}
sem=asyncio.Semaphore(24)
async def get(session,method,url,rel,payload=None):
 row={'method':method,'url':url,'payload':payload,'path':rel}
 try:
  async with sem:
   kw={'headers':HEAD,'allow_redirects':True,'timeout':aiohttp.ClientTimeout(total=18)}
   if method=='POST':kw['json']=payload
   async with session.request(method,url,**kw) as r:
    b=await r.read(); row.update(status=r.status,finalUrl=str(r.url),contentType=r.headers.get('content-type',''),bytes=len(b),sha256=hashlib.sha256(b).hexdigest())
    p=OUT/rel;p.parent.mkdir(parents=True,exist_ok=True);p.write_bytes(b)
    try:row['json']=json.loads(b.decode('utf-8-sig'))
    except:row['preview']=b[:500].decode('utf-8','replace')
 except Exception as e:row['error']=repr(e)
 return row
async def main():
 async with aiohttp.ClientSession(connector=aiohttp.TCPConnector(limit=32,ssl=False)) as s:
  jobs=[]
  for pr,ver,commit,aid,tid in PROJECTS:
   base=f'https://web-test.falla.live/falla-web/{pr}/hk/{ver}'
   jobs += [get(s,'GET',f'{base}/js/index.js.map',f'source-maps/{pr}/index.js.map'),get(s,'GET',f'{base}/css/index.css.map',f'source-maps/{pr}/index.css.map'),get(s,'GET',f'https://web.fallaweb.com/lang_conf/h5_{tid}.json',f'translations/h5_{tid}.json'),get(s,'GET',f'https://web.falla.live/lang_conf/pre/h5_{tid}.json',f'translations-pre/h5_{tid}.json'),get(s,'GET',f'https://web.falla.live/activity_gift_config_v3/pre/h5_{aid}_ALL.json',f'gift-config/h5_{aid}_ALL.json')]
   payloads=[{'activityId':aid},{'activityId':aid,'translateId':tid},{'id':aid,'activityId':aid,'translateId':tid,'page':1,'pageNum':1,'pageSize':20,'rankType':1,'type':1,'day':1,'groupId':1}]
   for ep in ENDPOINTS[aid]:
    for host in ['https://api.apifalla.com/api/web','https://apihk.falla.live/api/web']:
     safe=(host.split('//',1)[1]+'__'+ep).replace('/','__')
     for i,p in enumerate(payloads):jobs.append(get(s,'POST',f'{host}/{ep}',f'api/{pr}/{safe}__p{i}.json',p))
  rows=await asyncio.gather(*jobs)
 (OUT/'results.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2),encoding='utf-8')
 useful=[r for r in rows if r.get('status')==200 and r.get('bytes',0)>0]
 (OUT/'useful.json').write_text(json.dumps(useful,ensure_ascii=False,indent=2),encoding='utf-8')
 lines=['# Fast Batch 3 Repair Probe','',f'- Requests: {len(rows)}',f'- HTTP 200: {len(useful)}',f'- source maps: {sum(r.get("status")==200 and "source-maps/" in r.get("path","") for r in rows)}',f'- API successes: {sum(r.get("status")==200 and "/api/" in r.get("url","") for r in rows)}','']
 for pr,_,_,_,_ in PROJECTS:
  x=[r for r in rows if pr in r.get('path','')];lines += [f'## {pr}',f'- 200: {sum(r.get("status")==200 for r in x)} / {len(x)}']
  for r in x:
   if r.get('status')==200: lines.append(f"- {r['method']} {r['url']} ({r.get('bytes')} B) -> {r['path']}")
  lines.append('')
 (OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8');print('\n'.join(lines))
asyncio.run(main())
