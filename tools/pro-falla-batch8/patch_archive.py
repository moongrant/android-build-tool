#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch8/archive_batch8.mjs')
src = p.read_text(encoding='utf-8')

needle = "else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"
extra = """else if(p.includes('/wordcup/schedule')){res={list:[],scheduleList:[],matchList:[],records:[],betList:[],totalPool:0};kind='empty-world-cup-schedule';}
  else if(p.includes('/lucklottery/actinfo')){res={taskList:[],records:[],prizeList:[],rewardList:[],drawCount:0,sendCount:0,receiveCount:0};kind='empty-world-cup-lucky-draw';}
  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, extra, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchBatch8KnownResources(){
  const targets=[
    {url:'https://falla-res1.resygg.com/awss3_2168516_1666232119682858599_766385147.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1666232193964920313_2113435659.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1666232318643668872_26759699.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1666232504933036135_3089205260.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/512088cf073f1beb9a43.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/8065c70f9511dc46586e.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/e0eee28214a61fc6ed63.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/4284469d25c20893f0ba.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/142965f955c51b3c4484.png'},
    {url:'https://web.fallaweb.com/falla-web/act-medal-collect/prod/0.5.0/assets/390f6a3714b5c44d9397.png'},
    {url:'https://web.falla.live/activity_gift_config_v2/pre/h5_165_EN.json',compatJson:true}
  ];
  let added=0,compat=0;
  for(const target of targets){
    if(byUrl.has(urlKey('GET',target.url))||byPath.has(pathKey('GET',target.url)))continue;
    const candidates=[target.url];
    if(target.url.includes('activity_gift_config_v2')){
      candidates.push('https://web.falla.live/activity_gift_config_v2/prod/h5_165_EN.json');
      candidates.push('https://web.fallaweb.com/activity_gift_config_v2/h5_165_EN.json');
    }
    let body=null,sourceUrl=null,headers=null,status=200;
    for(const candidate of candidates){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':'application/json,image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8','referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        body=Buffer.from(await r.arrayBuffer());sourceUrl=String(r.url);headers=Object.fromEntries(r.headers.entries());status=r.status;break;
      }catch{}
    }
    if(!body&&target.compatJson){
      body=Buffer.from(JSON.stringify({code:0,msg:'success',res:[]}));sourceUrl='historical-compat-empty';headers={'content-type':'application/json; charset=utf-8','x-pro-falla-local':'historical-compat-fixture'};status=200;compat++;
    }
    if(!body)continue;
    await savePrefetchedRecord({method:'GET',url:target.url,sourceUrl,body,status,headers:headers||{},pageId:target.compatJson?'batch8-historical-compat':'batch8-static-closure'});added++;
  }
  return {added,compat};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const batch8KnownResources=await prefetchBatch8KnownResources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,batch8KnownResources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_batch8.mjs')
