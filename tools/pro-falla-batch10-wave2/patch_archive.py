#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch10-wave2/archive_wave2.mjs')
src = p.read_text(encoding='utf-8')

needle = "else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"
extra = """else if(p.includes('/act/2025/v2/sixyeargamechallenge/sendguinnesspopup')){res={success:true,shown:false,record:false};kind='zero-guinness-popup';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, extra, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchBatch10Wave2Resources(){
  const targets=[
    {url:'https://web.fallaweb.com/falla-web/act-old-friend-gift/prod/0.3.0/assets/9b06f742ee68bed2502b.png',alts:['https://web.falla.live/falla-web/act-old-friend-gift/pre/0.3.0/assets/9b06f742ee68bed2502b.png','https://web-test.falla.live/falla-web/act-old-friend-gift/hk/0.3.0/assets/9b06f742ee68bed2502b.png']},
    {url:'https://web.fallaweb.com/falla-web/act-old-friend-gift/prod/0.3.0/assets/dbc7ad1be0983dd62e55.png',alts:['https://web.falla.live/falla-web/act-old-friend-gift/pre/0.3.0/assets/dbc7ad1be0983dd62e55.png','https://web-test.falla.live/falla-web/act-old-friend-gift/hk/0.3.0/assets/dbc7ad1be0983dd62e55.png']}
  ];
  const jsonTargets=[
    {url:'https://web.fallalive.com/activity_gift_config_v2/h5_200_ALL.json',alts:['https://web.fallaweb.com/activity_gift_config_v2/h5_200_ALL.json','https://web.falla.live/activity_gift_config_v2/pre/h5_200_ALL.json','https://web.falla.live/activity_gift_config_v2/prod/h5_200_ALL.json'],compat:{code:0,msg:'success',res:[]}}
  ];
  let added=0,compat=0,failed=[];
  async function get(candidates,accept){
    for(const candidate of candidates){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':accept,'referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        const body=Buffer.from(await r.arrayBuffer());if(!body.length)continue;
        return {body,sourceUrl:String(r.url),status:r.status,headers:Object.fromEntries(r.headers.entries())};
      }catch{}
    }
    return null;
  }
  for(const item of targets){
    const got=await get([item.url,...item.alts],'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8');
    if(!got){failed.push(item.url);continue;}
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch10-wave2-static-closure'});added++;
  }
  for(const item of jsonTargets){
    const got=await get([item.url,...item.alts],'application/json,text/plain,*/*');
    if(got){await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch10-wave2-json-closure'});added++;continue;}
    const body=Buffer.from(JSON.stringify(item.compat));
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:'historical-compat-empty',body,status:200,headers:{'content-type':'application/json; charset=utf-8','x-pro-falla-local':'historical-compat-fixture'},pageId:'batch10-wave2-historical-compat'});added++;compat++;
  }
  return {added,compat,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const batch10Wave2Resources=await prefetchBatch10Wave2Resources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,batch10Wave2Resources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched Batch 10 wave 2 replay gaps')
