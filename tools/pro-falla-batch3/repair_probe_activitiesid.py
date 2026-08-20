#!/usr/bin/env python3
import asyncio, aiohttp, hashlib, json, os
from pathlib import Path

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch3-probe-activitiesid'));OUT.mkdir(parents=True,exist_ok=True)
P=[('act-winter-festival',350,486),('act-winter-cp',379,516),('act-winter-room',411,542),('act-winter-family',432,554),('act-bengali-new-year-24',478,586),('act-blind-box-rave',517,612),('act-hatching-chicks',198,317),('act-black-diamond',391,526),('act-black-diamond-lottery',427,551)]
E={350:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/task/v2/info','act/winterFestival/kingPk/groupCompetition','act/winterFestival/kingPk/rank'],379:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/winterFestival/fantasyCp/top3'],411:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/task/v2/info','act/winterFestival/groupPK/dayRank','act/winterFestival/groupPK/records/award','act/winterFestival/groupPK/records/gift','act/prizePackage/carousel'],432:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/task/v2/info','act/winterFestival/familyPK/rank/family','act/winterFestival/familyPK/rank/supporter','act/winterFestival/familyPK/records','act/winterFestival/familyPK/userInfo','act/prizePackage/carousel','probability/prizeInfo','user/pack/type/info/list'],478:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','active/2024/bengali/year','active/2024/bengali/year/carousel'],517:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/newBlindAct/infos','act/newBlindAct/process','act/newBlindAct/rank','act/newBlindAct/blindRank','act/prizePackage/info'],198:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/hatchChicks/info'],391:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/diamondDebut/state'],427:['activities_config/act','activities_config/user','activities_config/group','activities_config/rank','act/blackDiamond/cycleAct/draw/info','act/blackDiamond/cycleAct/awardInfo','act/prizePackage/carousel','probability/prizeInfo','user/coin']}
H={'user-agent':'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36','accept':'application/json,text/plain,*/*','content-type':'application/json;charset=UTF-8','origin':'https://web-test.falla.live','referer':'https://web-test.falla.live/'}
sem=asyncio.Semaphore(30)
async def req(s,host,pr,ep,payload,i):
 url=f'{host}/api/web/{ep}';row={'project':pr,'endpoint':ep,'host':host,'payload':payload,'url':url}
 try:
  async with sem:
   async with s.post(url,json=payload,headers=H,timeout=aiohttp.ClientTimeout(total=15),allow_redirects=True) as r:
    b=await r.read();row.update(status=r.status,bytes=len(b),contentType=r.headers.get('content-type',''),sha256=hashlib.sha256(b).hexdigest())
    try:row['json']=json.loads(b.decode('utf-8-sig'))
    except:row['preview']=b[:500].decode('utf-8','replace')
    p=OUT/'responses'/pr/(host.split('//',1)[1]+'__'+ep.replace('/','__')+f'__{i}.json');p.parent.mkdir(parents=True,exist_ok=True);p.write_bytes(b);row['path']=str(p.relative_to(OUT))
 except Exception as e:row['error']=repr(e)
 return row
async def main():
 async with aiohttp.ClientSession(connector=aiohttp.TCPConnector(limit=40,ssl=False)) as s:
  jobs=[]
  for pr,aid,tid in P:
   payloads=[{'activitiesId':aid},{'activitiesId':aid,'translateId':tid},{'activitiesId':aid,'activityId':aid,'translateId':tid,'isPartition':False},{'activitiesId':aid,'activityId':aid,'translateId':tid,'isPartition':True,'region':'ALL','lang':'en','page':1,'pageNum':1,'pageSize':20,'rankType':1,'type':1,'day':1,'groupId':1,'id':1}]
   for ep in E[aid]:
    for host in ['https://api.apifalla.com','https://apihk.falla.live']:
     for i,p in enumerate(payloads):jobs.append(req(s,host,pr,ep,p,i))
  rows=await asyncio.gather(*jobs)
 (OUT/'results.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2),encoding='utf-8')
 useful=[]
 for r in rows:
  j=r.get('json');code=j.get('code') if isinstance(j,dict) else None;msg=j.get('msg') if isinstance(j,dict) else None
  if r.get('status')==200 and code not in (1,4):useful.append(r)
 (OUT/'useful.json').write_text(json.dumps(useful,ensure_ascii=False,indent=2),encoding='utf-8')
 lines=['# activitiesId Probe','',f'- total: {len(rows)}',f'- HTTP200: {sum(r.get("status")==200 for r in rows)}',f'- useful code != 1/4: {len(useful)}','']
 for pr,_,_ in P:
  x=[r for r in rows if r['project']==pr];u=[r for r in useful if r['project']==pr];lines += [f'## {pr}',f'- useful: {len(u)} / {len(x)}']
  for r in u: lines.append(f"- {r['endpoint']} @ {r['host']} payload={r['payload']} => {r.get('json')}")
  lines.append('')
 (OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8');print('\n'.join(lines))
asyncio.run(main())
