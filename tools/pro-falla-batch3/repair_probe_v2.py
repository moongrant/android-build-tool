#!/usr/bin/env python3
import asyncio, aiohttp, hashlib, json, os, re, time
from pathlib import Path
from urllib.parse import urlparse

OUT = Path(os.environ.get('OUT_DIR', 'artifacts/pro-falla-batch3-repair-probe'))
OUT.mkdir(parents=True, exist_ok=True)

PROJECTS = [
    dict(project='act-winter-festival', mode='hk', version='0.1.1', commit='8fc2f087', activityId=350, translateId=486),
    dict(project='act-winter-cp', mode='hk', version='0.0.2', commit='f9774d43', activityId=379, translateId=516),
    dict(project='act-winter-room', mode='hk', version='0.0.2', commit='02cd9701', activityId=411, translateId=542),
    dict(project='act-winter-family', mode='hk', version='0.0.4', commit='36732fab', activityId=432, translateId=554),
    dict(project='act-bengali-new-year-24', mode='hk', version='0.0.5', commit='8672ecf6', activityId=478, translateId=586),
    dict(project='act-blind-box-rave', mode='hk', version='0.0.10', commit='5dffc7e2', activityId=517, translateId=612),
    dict(project='act-hatching-chicks', mode='hk', version='0.0.7', commit='1674c7ec', activityId=198, translateId=317),
    dict(project='act-black-diamond', mode='hk', version='0.0.8', commit='39f1c811', activityId=391, translateId=526),
    dict(project='act-black-diamond-lottery', mode='hk', version='0.2.1', commit='3e804c8b', activityId=427, translateId=551),
]

API_ENDPOINTS = {
    350: ['/activities_config/act','/user/info','/ServerTimeAr','/act/task/v2/info','/act/winterFestival/kingPk/groupCompetition','/act/winterFestival/kingPk/rank','/activities_config/rank'],
    379: ['/activities_config/act','/user/info','/ServerTimeAr','/act/winterFestival/fantasyCp/top3','/activities_config/rank'],
    411: ['/activities_config/act','/user/info','/ServerTimeAr','/act/task/v2/info','/act/winterFestival/groupPK/dayRank','/act/winterFestival/groupPK/records/award','/act/winterFestival/groupPK/records/gift','/activities_config/rank','/act/prizePackage/carousel'],
    432: ['/activities_config/act','/user/info','/ServerTimeAr','/act/task/v2/info','/act/winterFestival/familyPK/rank/family','/act/winterFestival/familyPK/rank/supporter','/act/winterFestival/familyPK/records','/act/winterFestival/familyPK/userInfo','/activities_config/rank','/act/prizePackage/carousel','/probability/prizeInfo','/user/pack/type/info/list'],
    478: ['/activities_config/act','/user/info','/ServerTimeAr','/activities_config/user','/activities_config/rank','/activities_config/group','/active/2024/bengali/year','/active/2024/bengali/year/carousel'],
    517: ['/activities_config/act','/user/info','/ServerTimeAr','/act/newBlindAct/infos','/act/newBlindAct/process','/act/newBlindAct/rank','/act/newBlindAct/blindRank','/act/prizePackage/info'],
    198: ['/activities_config/act','/user/info','/ServerTimeAr','/activities_config/user','/activities_config/group','/act/hatchChicks/info'],
    391: ['/activities_config/act','/user/info','/ServerTimeAr','/act/diamondDebut/state'],
    427: ['/activities_config/act','/user/info','/ServerTimeAr','/act/blackDiamond/cycleAct/draw/info','/act/blackDiamond/cycleAct/awardInfo','/act/prizePackage/carousel','/probability/prizeInfo','/user/coin'],
}

HEADERS = {
    'user-agent': 'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36',
    'accept': 'application/json, text/plain, */*',
    'origin': 'https://web-test.falla.live',
    'referer': 'https://web-test.falla.live/',
    'content-type': 'application/json;charset=UTF-8',
    'x-requested-with': 'XMLHttpRequest',
}

async def save_bytes(rel, data):
    p = OUT / rel
    p.parent.mkdir(parents=True, exist_ok=True)
    p.write_bytes(data)
    return {'path': str(rel), 'bytes': len(data), 'sha256': hashlib.sha256(data).hexdigest()}

async def fetch_one(session, url, rel, method='GET', payload=None, headers=None, timeout=40):
    row = {'url': url, 'method': method, 'payload': payload}
    try:
        kwargs = {'headers': headers or HEADERS, 'allow_redirects': True, 'timeout': aiohttp.ClientTimeout(total=timeout)}
        if method == 'POST': kwargs['json'] = payload
        async with session.request(method, url, **kwargs) as r:
            data = await r.read()
            row.update(status=r.status, finalUrl=str(r.url), contentType=r.headers.get('content-type',''), responseHeaders=dict(r.headers))
            row.update(await save_bytes(rel, data))
            try: row['json'] = json.loads(data.decode('utf-8-sig'))
            except Exception: row['preview'] = data[:500].decode('utf-8','replace')
    except Exception as e:
        row['error'] = repr(e)
    return row

async def main():
    connector = aiohttp.TCPConnector(limit=12, ssl=False)
    async with aiohttp.ClientSession(connector=connector) as session:
        rows=[]
        # Source maps, HTML shells, known manifests, translations and gift configs.
        for p in PROJECTS:
            base=f"https://web-test.falla.live/falla-web/{p['project']}/{p['mode']}/{p['version']}"
            urls=[
                (f"{base}/js/index.js.map", f"source-maps/{p['project']}/index.js.map"),
                (f"{base}/css/index.css.map", f"source-maps/{p['project']}/index.css.map"),
                (f"{base}/", f"release/{p['project']}/index.html"),
                (f"https://web-test.falla.live/falla-web/{p['project']}/{p['mode']}/upload.json", f"release/{p['project']}/upload.json"),
                (f"https://web.fallaweb.com/lang_conf/h5_{p['translateId']}.json", f"translations/h5_{p['translateId']}.json"),
                (f"https://web.falla.live/activity_gift_config_v3/pre/h5_{p['activityId']}_ALL.json", f"gift-config/h5_{p['activityId']}_ALL.json"),
                (f"https://web.falla.live/activity_gift_config_v3/prod/h5_{p['activityId']}_ALL.json", f"gift-config-prod/h5_{p['activityId']}_ALL.json"),
            ]
            for url, rel in urls:
                rows.append(await fetch_one(session,url,rel,headers=HEADERS))

        # Search common static naming patterns for missing banner/title art.
        for p in PROJECTS:
            base=f"https://web-test.falla.live/falla-web/{p['project']}/{p['mode']}/{p['version']}"
            for name in ['banner.png','title.png','head.png','header.png','top.png','top-bg.png','banner.webp','title.webp','assets/banner.png','assets/title.png','assets/head.png']:
                rows.append(await fetch_one(session,f"{base}/{name}",f"named-static/{p['project']}/{name.replace('/','__')}",headers=HEADERS,timeout=15))

        # API probes: two hosts, multiple body shapes, GET query and POST JSON.
        hosts=['https://apihk.falla.live/api/web','https://api.apifalla.com/api/web']
        for p in PROJECTS:
            aid=p['activityId']; tid=p['translateId']; project=p['project']
            payloads=[
                {'activityId': aid},
                {'activityId': aid, 'translateId': tid},
                {'id': aid, 'activityId': aid, 'translateId': tid, 'isPartition': False},
                {'activityId': aid, 'rankType': 1, 'page': 1, 'pageNum': 1, 'pageSize': 20, 'type': 1, 'day': 1, 'groupId': 1},
            ]
            for ep in API_ENDPOINTS[aid]:
                for host in hosts:
                    safe=(host.split('//',1)[1] + ep).replace('/','__')
                    for i,payload in enumerate(payloads):
                        rel=f"api/{project}/{safe}__post{i}.json"
                        rows.append(await fetch_one(session,host+ep,rel,method='POST',payload=payload,headers=HEADERS,timeout=25))
                    q='&'.join(f"{k}={v}" for k,v in payloads[1].items())
                    rows.append(await fetch_one(session,host+ep+'?'+q,f"api/{project}/{safe}__get.json",method='GET',headers=HEADERS,timeout=25))

    # Compact successful/probably useful response summary.
    useful=[]
    for r in rows:
        if r.get('status') == 200:
            obj=r.get('json')
            useful.append({
                'url':r['url'],'method':r['method'],'payload':r.get('payload'),'path':r.get('path'),'bytes':r.get('bytes'),
                'contentType':r.get('contentType'),'json':obj if obj is not None and r.get('bytes',0)<50000 else None,
                'preview':r.get('preview','')[:300]
            })
    (OUT/'probe-results.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2),encoding='utf-8')
    (OUT/'useful-responses.json').write_text(json.dumps(useful,ensure_ascii=False,indent=2),encoding='utf-8')
    report=['# Batch 3 Repair Probe','',f'- Total requests: {len(rows)}',f'- HTTP 200: {sum(r.get("status")==200 for r in rows)}',f'- Source maps 200: {sum(r.get("status")==200 and "source-maps/" in r.get("path","") for r in rows)}',f'- API 200: {sum(r.get("status")==200 and "/api/" in r.get("url","") for r in rows)}','']
    for p in PROJECTS:
        pr=p['project']; subset=[r for r in rows if pr in (r.get('path','')+r.get('url',''))]
        report += [f'## {pr}','',f'- successful: {sum(r.get("status")==200 for r in subset)} / {len(subset)}']
        for r in subset:
            if r.get('status')==200 and (r.get('bytes',0)>0): report.append(f"- 200 {r['method']} {r['url']} ({r.get('bytes')} B) -> {r.get('path')}")
        report.append('')
    (OUT/'REPORT.md').write_text('\n'.join(report),encoding='utf-8')
    print('\n'.join(report[:80]))

asyncio.run(main())
