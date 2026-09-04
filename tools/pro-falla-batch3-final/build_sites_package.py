#!/usr/bin/env python3
from __future__ import annotations
import argparse, base64, hashlib, json, os, re, shutil, stat, sys, textwrap, zipfile
from pathlib import Path
from urllib.parse import urlparse
from PIL import Image, ImageStat

EXPECTED = {
    'ramadan-2025': 8,
    'winter-festival-2023-24': 4,
    'bengali-new-year-2024': 1,
    'blind-box-rave-2024': 1,
    'hatching-chicks-2023': 1,
    'diwali-festival-2025': 1,
    'blind-box-challenge-2025': 1,
    'black-diamond-2024': 2,
}
TITLES = {
    'ramadan-2025':'Falla Ramadan 2025 · 五阶段大型 Campaign',
    'winter-festival-2023-24':'Falla Winter Festival 2023–2024',
    'bengali-new-year-2024':'Falla Bengali New Year 2024',
    'blind-box-rave-2024':'Falla Blind Box Rave 2024',
    'hatching-chicks-2023':'Falla Happy Hatching Chicks 2023',
    'diwali-festival-2025':'Falla Diwali Festival 2025',
    'blind-box-challenge-2025':'Falla Surprise Box Challenge 2025',
    'black-diamond-2024':'Falla Black Diamond 2024',
}
DESCRIPTIONS = {
    'ramadan-2025':'总会场串联 Regal Party、Food Carnival、Holi、点灯、寻宝、礼包与 Eid 收官。',
    'winter-festival-2023-24':'跨四个月的个人、CP、房间与 Family 赛季系列。',
    'bengali-new-year-2024':'芒果叶主题的区域文化节任务、收集、进度与贡献玩法。',
    'blind-box-rave-2024':'任务获得盲盒资源，推进地图节点并参与共享奖池。',
    'hatching-chicks-2023':'每日任务驱动七日孵化成长、里程碑、记录与奖励。',
    'diwali-festival-2025':'排灯节点灯、收集、阶段宝箱及个人/房间竞争。',
    'blind-box-challenge-2025':'每日任务、惊喜盒、稀有记录、阶段挑战及排行。',
    'black-diamond-2024':'黑钻货币系统与独立 Lottery 两个 SPA 档案单元。',
}
ERROR_RE = re.compile(r'error request|please try again later|request failed|network error|加载失败|请求失败', re.I)
OPTIONAL_RE = re.compile(r'google-analytics|googletagmanager|firebase|rumt-us|doubleclick', re.I)


def sha256_file(path: Path) -> str:
    h=hashlib.sha256()
    with path.open('rb') as f:
        for chunk in iter(lambda:f.read(1024*1024),b''): h.update(chunk)
    return h.hexdigest()


def insert_head(html: str, fragment: str) -> str:
    if '<head' in html.lower():
        m=re.search(r'<head[^>]*>',html,re.I)
        if m:return html[:m.end()]+fragment+html[m.end():]
    return fragment+html


def top_visual_score(path: Path) -> dict:
    with Image.open(path).convert('RGB') as im:
        crop=im.crop((0,0,im.width,min(im.height,520))).resize((195,260))
        stat=ImageStat.Stat(crop)
        variance=sum(stat.var)/3
        hist=crop.quantize(colors=64).getcolors() or []
        occupied=sum(1 for n,_ in hist if n>8)
        return {'width':im.width,'height':im.height,'topVariance':round(variance,2),'topColorBins':occupied}


def choose_shell_record(records, host_kind):
    candidates=[]
    for r in records:
        u=r.get('url','')
        p=urlparse(u)
        if host_kind=='prod' and p.netloc=='web.fallaweb.com' and p.path.endswith('/main/index.html'):
            candidates.append(r)
        if host_kind=='test' and p.netloc=='web-test.falla.live' and p.path.endswith('/micro-main/index.html'):
            candidates.append(r)
    return max(candidates,key=lambda x:x.get('bytes',0),default=None)


def main():
    ap=argparse.ArgumentParser()
    ap.add_argument('--archive',required=True)
    ap.add_argument('--out',required=True)
    ap.add_argument('--zip',required=True)
    args=ap.parse_args()
    archive=Path(args.archive).resolve(); out=Path(args.out).resolve(); zip_path=Path(args.zip).resolve()
    if out.exists():shutil.rmtree(out)
    out.mkdir(parents=True)
    manifest=json.loads((archive/'manifest.json').read_text())
    records=json.loads((archive/'records.json').read_text())
    campaigns={c['id']:c for c in manifest['campaigns']}
    errors=[]; warnings=[]; campaign_qa=[]

    if set(campaigns)!=set(EXPECTED):errors.append(f"Campaign set mismatch: {sorted(campaigns)}")
    if manifest.get('campaignCount')!=8:errors.append(f"campaignCount={manifest.get('campaignCount')} expected 8")
    if manifest.get('unitCount')!=19:errors.append(f"unitCount={manifest.get('unitCount')} expected 19")

    selected_pages=[]
    for cid,expected_units in EXPECTED.items():
        c=campaigns.get(cid,{})
        units=c.get('units',[])
        if len(units)!=expected_units:errors.append(f'{cid}: unitCount={len(units)} expected={expected_units}')
        cq={'id':cid,'title':c.get('title'),'level':c.get('level'),'unitCount':len(units),'pageCount':c.get('pageCount',0),'offlineMissing':c.get('offlineMissing',0),'brokenImages':c.get('brokenImages',0),'navErrors':c.get('navErrors',0),'historicalApiFixtures':c.get('historicalApiFixtures',0),'visibleErrorPhrases':c.get('visibleErrorPhrases',[]),'originalBundleReplay':c.get('originalBundleReplay',False),'units':[]}
        if c.get('offlineMissing',0):errors.append(f'{cid}: offlineMissing={c["offlineMissing"]}')
        if c.get('brokenImages',0):errors.append(f'{cid}: brokenImages={c["brokenImages"]}')
        if c.get('navErrors',0):errors.append(f'{cid}: navErrors={c["navErrors"]}')
        if not c.get('originalBundleReplay'):errors.append(f'{cid}: originalBundleReplay=false')
        if c.get('visibleErrorPhrases'):errors.append(f'{cid}: visible errors {c["visibleErrorPhrases"]}')
        for u in units:
            uq={'id':u.get('id'),'label':u.get('label'),'project':u.get('project'),'pageCount':u.get('pageCount',0),'attemptedPageCount':u.get('attemptedPageCount',0),'offlineMissing':u.get('offlineMissing',0),'brokenImages':u.get('brokenImages',0),'navErrors':u.get('navErrors',0),'historicalApiFixtures':u.get('historicalApiFixtures',0),'visibleErrorPhrases':u.get('visibleErrorPhrases',[]),'originalBundleReplay':u.get('originalBundleReplay',False),'pages':[]}
            if not u.get('pageCount'):errors.append(f'{cid}/{u.get("project")}: no valid page')
            if u.get('offlineMissing',0):errors.append(f'{cid}/{u.get("project")}: missing={u["offlineMissing"]}')
            if u.get('brokenImages',0):errors.append(f'{cid}/{u.get("project")}: broken={u["brokenImages"]}')
            if u.get('visibleErrorPhrases'):errors.append(f'{cid}/{u.get("project")}: visible errors {u["visibleErrorPhrases"]}')
            for p in u.get('pages',[]):
                text=(p.get('offlineMetrics') or {}).get('bodyText','')
                if ERROR_RE.search(text):errors.append(f'{cid}/{u.get("project")}/{p.get("pageId")}: error phrase remains')
                shot=archive/p.get('offlineScreenshot','')
                if not shot.exists():errors.append(f'missing screenshot {shot}')
                else:
                    vs=top_visual_score(shot)
                    if vs['width']<360 or vs['height']<700:errors.append(f'{cid}/{u.get("project")}: screenshot too small {vs}')
                    uq['pages'].append({'pageId':p.get('pageId'),'label':p.get('label'),'url':p.get('url'),'screenshot':p.get('offlineScreenshot'),'visual':vs,'served':p.get('offlineServedCount'),'fixtures':p.get('offlineFixtureCount',0)})
                    selected_pages.append((cid,u,p,shot))
            cq['units'].append(uq)
        campaign_qa.append(cq)

    # Explicit user-reported problem pages must have real-looking top sections and substantial height.
    for cid in ['blind-box-rave-2024','hatching-chicks-2023']:
        q=next((x for x in campaign_qa if x['id']==cid),None)
        visuals=[p['visual'] for u in q['units'] for p in u['pages']] if q else []
        if not visuals:errors.append(f'{cid}: no visual QA')
        else:
            best=max(visuals,key=lambda v:(v['topVariance'],v['topColorBins'],v['height']))
            if best['topVariance']<250 or best['topColorBins']<12:errors.append(f'{cid}: header/top visual still appears incomplete {best}')
            if max(v['height'] for v in visuals)<1000:errors.append(f'{cid}: full page height still too short')

    if manifest.get('captureErrors',0):warnings.append(f"captureErrors={manifest.get('captureErrors')}; inspect source-proof/capture-errors.json")
    fixture_count=manifest.get('historicalApiFixtureCount',0)
    if fixture_count:warnings.append(f'{fixture_count} expired historical API calls use explicitly marked anonymous local fixtures; no historical users/ranks were fabricated.')

    # Construct public archive.
    root=out/'public/falla-original-spa/batch3-20260819'
    (root/'objects').mkdir(parents=True)
    shutil.copytree(archive/'objects',root/'objects',dirs_exist_ok=True)
    (root/'data').mkdir()
    for name in ['manifest.json','records.json','SHA256SUMS.txt','capture-errors.json']:
        if (archive/name).exists():shutil.copy2(archive/name,root/'data'/name)

    # Copy only offline screenshots and contact sheets used for review/cover art.
    (root/'screenshots/pages').mkdir(parents=True)
    for cid,u,p,shot in selected_pages:
        dst=root/'screenshots/pages'/cid/u['project']/f"{p.get('pageId')}.png"
        dst.parent.mkdir(parents=True,exist_ok=True);shutil.copy2(shot,dst)
    if (archive/'contact-sheets').exists():shutil.copytree(archive/'contact-sheets',root/'screenshots/contact-sheets',dirs_exist_ok=True)
    if (archive/'contact-sheets-preview').exists():shutil.copytree(archive/'contact-sheets-preview',root/'screenshots/previews',dirs_exist_ok=True)

    # URL and pathname maps consumed by a same-origin service worker.
    url_map={}; path_map={}
    for r in records:
        obj=r.get('objectPath');url=r.get('url');method=(r.get('method') or 'GET').upper()
        if not obj or not url:continue
        local=f"./{obj}"
        url_map[f'{method}|{url}']=local
        try:
            p=urlparse(url); path_map.setdefault(f'{method}|{p.scheme}://{p.netloc}{p.path}',local)
        except:pass
    replay=root/'replay';replay.mkdir()
    (replay/'maps.json').write_text(json.dumps({'urlMap':url_map,'pathMap':path_map},separators=(',',':')))

    sw=r'''let mapsPromise=fetch('./replay/maps.json',{cache:'no-store'}).then(r=>r.json());
const OPTIONAL=/(?:google-analytics\.com|googletagmanager\.com|firebase|rumt-us\.com|doubleclick\.net)/i;
function neutral(){const task={id:1,taskId:1,status:0,taskStatus:0,progress:0,current:0,target:1,total:1,rewardList:[],rewards:[]};const box={id:1,boxId:1,status:0,state:0,progress:0,target:1,rewardList:[],prizeList:[]};const res={list:[],records:[],recordList:[],rank:[],rankList:[],top3:[],carousel:[],taskList:[task],tasks:[task],dailyTaskList:[task],rewardList:[],rewards:[],awardList:[],awards:[],prizeList:[],giftInfoList:[],giftList:[],mapList:[],maps:[],nodeList:[],nodes:[],boxList:[box],blindBoxList:[box],process:0,progress:0,current:0,target:1,total:1,stage:1,level:1,status:0,state:0,coin:0,balance:0,drawCount:0,chance:0,times:0,score:0,userInfo:{uid:0,userId:0,nickName:'',avatar:'',countryCode:'',isLogin:false},config:{},extConfig:{},serverConfig:{}};res.data=res;return JSON.stringify({code:0,status:0,msg:'success',message:'success',res,data:res,result:res});}
self.addEventListener('install',e=>e.waitUntil(self.skipWaiting()));self.addEventListener('activate',e=>e.waitUntil(self.clients.claim()));
self.addEventListener('fetch',event=>{event.respondWith((async()=>{const req=event.request,url=req.url,method=req.method.toUpperCase();if(OPTIONAL.test(url))return new Response('',{status:204});const maps=await mapsPromise;let key=method+'|'+url,local=maps.urlMap[key];if(!local){const u=new URL(url);local=maps.pathMap[method+'|'+u.origin+u.pathname];}if(local){const r=await fetch(new URL(local,self.registration.scope));const h=new Headers(r.headers);h.set('x-pro-falla-local','original-byte');return new Response(await r.arrayBuffer(),{status:r.status,headers:h});}if(/(?:apihk\.falla\.live|api\.apifalla\.com)/i.test(url)){return new Response(neutral(),{status:200,headers:{'content-type':'application/json; charset=utf-8','cache-control':'no-store','x-pro-falla-local':'historical-api-fixture'}});}return new Response('Unmapped archived request: '+url,{status:404,headers:{'content-type':'text/plain'}});})());});'''
    (root/'sw.js').write_text(sw)

    # Rehydrate the two original shell HTML documents and add a base URL only; bundles remain untouched.
    for kind,base in [('prod','https://web.fallaweb.com/main/'),('test','https://web-test.falla.live/falla-web/micro-main/')]:
        rec=choose_shell_record(records,kind)
        if not rec:errors.append(f'missing {kind} shell record');continue
        html=(archive/rec['objectPath']).read_text(errors='replace')
        html=insert_head(html,f'<base href="{base}"><meta name="pro-falla-archive" content="original-spa-local-replay">')
        (replay/f'shell-{kind}.html').write_text(html)

    # Campaign viewers. Their iframe is same-origin and runs the local original SPA shell, never a remote URL.
    activity_root=root/'activities';activity_root.mkdir()
    cards=[];hierarchy=[]
    for order,cid in enumerate(EXPECTED,1):
        c=campaigns[cid]
        unit_entries=[]
        for u in c['units']:
            pages=[]
            for p in u.get('pages',[]):
                raw=p['url'];kind='test' if 'web-test.falla.live' in raw else 'prod';hashpart=raw.split('#',1)[1] if '#' in raw else ''
                pages.append({'label':p.get('label'),'url':raw,'localShell':f'../../replay/shell-{kind}.html#{hashpart}','screenshot':f"../../screenshots/pages/{cid}/{u['project']}/{p.get('pageId')}.png"})
            unit_entries.append({'id':u['id'],'label':u['label'],'project':u['project'],'pages':pages,'pageCount':u['pageCount'],'entryRole':'subcampaign' if len(c['units'])>1 else 'primary-spa'})
        data={'id':cid,'title':TITLES[cid],'description':DESCRIPTIONS[cid],'level':c['level'],'units':unit_entries,'historicalApiFixtures':c.get('historicalApiFixtures',0),'evidenceStatus':'complete-static-local-replay'}
        d=activity_root/cid;d.mkdir();(d/'campaign.json').write_text(json.dumps(data,ensure_ascii=False,indent=2))
        viewer='''<!doctype html><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title></title><style>html,body{margin:0;background:#07090f;color:#fff;font:14px system-ui;height:100%}.bar{height:52px;display:flex;align-items:center;gap:8px;padding:0 10px;background:#111521;overflow:auto;white-space:nowrap}.bar button{border:1px solid #343a4d;background:#1b2030;color:#fff;border-radius:999px;padding:8px 12px}.bar button.active{background:#fff;color:#111}.frame{width:100%;height:calc(100% - 52px);border:0;background:#080a10}.note{font-size:11px;opacity:.65;margin-left:auto}</style><div class="bar" id="bar"><span class="note">本地原始 SPA</span></div><iframe class="frame" id="frame" title="Falla original SPA local replay"></iframe><script>navigator.serviceWorker.register('../../sw.js',{scope:'../../'}).then(()=>navigator.serviceWorker.ready).then(async()=>{const c=await fetch('./campaign.json').then(r=>r.json());document.title=c.title;const bar=document.getElementById('bar'),f=document.getElementById('frame');const entries=[];for(const u of c.units)for(const p of u.pages)entries.push({label:u.label+(u.pages.length>1?' · '+p.label:''),src:p.localShell});function open(i){[...bar.querySelectorAll('button')].forEach((b,n)=>b.classList.toggle('active',n===i));f.src=entries[i].src;}entries.forEach((e,i)=>{const b=document.createElement('button');b.textContent=e.label;b.onclick=()=>open(i);bar.insertBefore(b,bar.lastElementChild);});open(0);});</script>'''
        (d/'index.html').write_text(viewer)
        card_id=f'card-falla-{cid}'
        cards.append({'id':card_id,'app':'Falla','title':TITLES[cid],'year':re.search(r'20\d{2}',TITLES[cid]).group(0) if re.search(r'20\d{2}',TITLES[cid]) else '', 'level':c['level'],'recordType':'campaign','entryRole':'campaign','countAsCampaign':True,'countAsArchiveUnit':False,'archiveUnitCount':len(unit_entries),'routeCount':sum(u['pageCount'] for u in c['units']),'description':DESCRIPTIONS[cid],'localReplay':f'/falla-original-spa/batch3-20260819/activities/{cid}/index.html','cover':f'/falla-original-spa/batch3-20260819/screenshots/previews/{cid}.jpg','evidenceStatus':'complete-static-local-replay','historicalApiFixtureCount':c.get('historicalApiFixtures',0),'seriesId':'falla-ramadan' if cid=='ramadan-2025' else ('falla-winter-festival' if cid=='winter-festival-2023-24' else None)})
        hierarchy.append({'campaignId':cid,'cardId':card_id,'units':[{'archiveUnitId':u['id'],'project':u['project'],'title':u['label'],'entryRole':'subcampaign' if len(c['units'])>1 else 'primary-spa','countAsCampaign':False,'countAsArchiveUnit':True,'routeCount':u['pageCount']} for u in c['units']]})

    patch=out/'site-patch';patch.mkdir()
    (patch/'cards.part-05.json').write_text(json.dumps(cards,ensure_ascii=False,indent=2))
    (patch/'falla-hierarchy.part-05.json').write_text(json.dumps(hierarchy,ensure_ascii=False,indent=2))
    (patch/'patch-manifest.json').write_text(json.dumps({'packageId':'pro-falla-sites-increment-05-batch3-eight-campaigns','insertAfter':'card-falla-peak-room-pk-2025','fallbackInsertAfter':'card-yalla-happy-ferris-wheel-castle-2025','campaignCount':8,'archiveUnitCount':19,'routeCount':sum(c.get('pageCount',0) for c in campaigns.values()),'preserveExistingCards':True,'noRemoteIframe':True,'sourceArchive':manifest.get('generatedAt'),'historicalApiFixtureCount':fixture_count},ensure_ascii=False,indent=2))
    prompt=f'''使用附件中的整个增量包，修改现有 Site：\nhttps://campaigns-collected.jekae.chatgpt.site/\n\n不要创建新站点，不要改域名，不要删除任何现有卡片、锚点、原始 SPA、素材、截图或路由。\n\n执行要求：\n1. 将 public/ 原样合并进现有 Site 根目录。\n2. 读取 site-patch/cards.part-05.json 与 falla-hierarchy.part-05.json，新增 8 个父 Campaign、19 个 SPA 档案单元；不要把 19 个单元计成 19 场 Campaign。\n3. 优先插在 #card-falla-peak-room-pk-2025 后；不存在时回退到 #card-yalla-happy-ferris-wheel-castle-2025。\n4. 卡片左侧只加载包内 localReplay。禁止改成 Falla 远端 iframe；包内 viewer 使用同源 iframe 运行本地 shell，全部 Falla 资源由 Service Worker 从本包 objects 提供。\n5. Ramadan 2025 显示为 1 个父 Campaign，内部 8 个 SPA 单元。Winter Festival 显示为 1 个 series-campaign，内部 4 个阶段单元。Black Diamond 显示为 1 个父 Campaign，内部 Gem System 与 Gem Lottery 两个 SPA 单元。\n6. 保留 Campaign / 子活动 / 全部 SPA 档案三种视图，并分别统计 Campaign、Archive Unit、Route。\n7. 历史用户、排行榜与任务接口过期时，包内只使用明确标记的匿名零状态 fixture，不得伪造用户、房间、排行或中奖记录。\n8. 完成桌面、移动端、详情返回、旧锚点、Service Worker、破图、404、远端请求和控制台 QA。全部通过后 checkpoint 并部署到原 Site。\n\n验收基线：8 Campaign / 19 SPA Archive Units；未映射请求 0；破图 0；可见 Error request 0；远端 Falla 请求 0。\n'''
    (patch/'WORK_UPLOAD_PROMPT.txt').write_text(prompt)

    proof=out/'source-proof';proof.mkdir()
    for name in ['manifest.json','records.json','capture-errors.json','SHA256SUMS.txt','QA-FINAL.md']:
        if (archive/name).exists():shutil.copy2(archive/name,proof/name)
    qa={'passed':not errors,'errors':errors,'warnings':warnings,'campaignCount':8,'archiveUnitCount':19,'routeCount':sum(c.get('pageCount',0) for c in campaigns.values()),'originalFileCount':manifest.get('originalFileCount'),'originalBytes':manifest.get('originalBytes'),'staticClosureAdded':manifest.get('staticClosureAdded'),'knownStaticAdded':manifest.get('knownStaticAdded'),'repairProbeSummary':manifest.get('repairProbeSummary'),'historicalApiFixtureCount':fixture_count,'originalStaticByteComplete':manifest.get('originalStaticByteComplete'),'offlineReplayComplete':manifest.get('offlineReplayComplete'),'rawHistoricalApiComplete':fixture_count==0,'campaigns':campaign_qa}
    (out/'QA_REPORT.json').write_text(json.dumps(qa,ensure_ascii=False,indent=2))
    md=['# Pro Falla Batch 3 最终增量包 QA','',f'- Passed: **{qa["passed"]}**',f'- Campaign: {qa["campaignCount"]}',f'- SPA Archive Unit: {qa["archiveUnitCount"]}',f'- Route: {qa["routeCount"]}',f'- Original files: {qa["originalFileCount"]}',f'- Original bytes: {qa["originalBytes"]}',f'- Historical anonymous fixtures: {fixture_count}',f'- Original static byte complete: {qa["originalStaticByteComplete"]}',f'- Offline replay complete: {qa["offlineReplayComplete"]}','','## Errors','']+[f'- {e}' for e in errors or ['None']]+['','## Warnings','']+[f'- {w}' for w in warnings or ['None']]
    (out/'QA_REPORT.md').write_text('\n'.join(md))
    if errors:
        print('\n'.join(md));raise SystemExit('strict QA failed')

    # File checksums before zipping.
    sums=[]
    for p in sorted(out.rglob('*')):
        if p.is_file() and p.name!='SHA256SUMS.txt':sums.append(f'{sha256_file(p)}  {p.relative_to(out)}')
    (out/'SHA256SUMS.txt').write_text('\n'.join(sums)+'\n')
    if zip_path.exists():zip_path.unlink()
    with zipfile.ZipFile(zip_path,'w',compression=zipfile.ZIP_DEFLATED,compresslevel=6,allowZip64=True) as z:
        for p in sorted(out.rglob('*')):
            if p.is_file():z.write(p,p.relative_to(out.parent))
    print(json.dumps({'passed':True,'zip':str(zip_path),'zipBytes':zip_path.stat().st_size,'zipSha256':sha256_file(zip_path),'campaigns':8,'units':19,'routes':qa['routeCount'],'fixtures':fixture_count},ensure_ascii=False,indent=2))

if __name__=='__main__':main()
