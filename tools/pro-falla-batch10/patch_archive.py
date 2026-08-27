#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch10/archive_batch10.mjs')
src = p.read_text(encoding='utf-8')

needle = "else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"
extra = """else if(p.includes('/act/ramadan/luckyact/v8/userprocess')){res={process:0,current:0,stage:0,drawCount:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],packList:[]};kind='empty-qurban-stage-process';}\n  else if(p.includes('/act/ramadan/luckyact/v8/dayrank')){res=[];kind='empty-qurban-day-rank';}\n  else if(p.includes('/ramadan/blindbox/actinfo')){res={boxList:[],taskList:[],rankList:[],rewardList:[],records:[],couponCount:0,drawCount:0,progress:0,score:0};kind='empty-ramadan-blind-box';}\n  else if(p.includes('/ramadan/blindbox/v7/actinfo')){res={boxList:[],taskList:[],rankList:[],rewardList:[],records:[],couponCount:0,drawCount:0,progress:0,score:0,exchangeList:[]};kind='empty-scratch-off';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, extra, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchBatch10Resources(){
  const targets=[
    {url:'https://res-g.resygg.com/awss3_3048846_1716532190084644381_3125754166.png'},
    {url:'https://res-g.resygg.com/awss3_4081076_1718089124352985959_2390570123.png'},
    {url:'https://res-g.resygg.com/awss3_4081076_1716173478954650806_3454218762.png'},
    {url:'https://res-g.resygg.com/awss3_4081076_1716173573877083920_3520129964.png'},
    {url:'https://res-g.resygg.com/awss3_4081076_1716173670259086397_1481429634.png'},
    {url:'https://web-test.falla.live/falla-web/act-eid-al-adha/hk/0.2.9/assets/dc54e2e98b91ecb830f2.png',candidates:['https://web.fallaweb.com/falla-web/act-eid-al-adha/prod/0.4.0/assets/dc54e2e98b91ecb830f2.png','https://web.falla.live/falla-web/act-eid-al-adha/pre/0.4.0/assets/dc54e2e98b91ecb830f2.png']},
    {url:'https://res-g.resygg.com/awss3_866790_1709115350929070397_1317807480.png'},
    {url:'https://res-g.resygg.com/awss3_866790_1709115353033313799_1661640578.png'},
    {url:'https://res-g.resygg.com/awss3_1436068_1709269309327054808_332097678.png'},
    {url:'https://res-g.resygg.com/awss3_1436068_1709269389667942077_3258985212.png'},
    {url:'https://res-g.resygg.com/awss3_1436068_1709269462975177600_1114094107.png'},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-blind-box/hk/0.0.5/assets/984b8c1ed817992de62e.png',candidates:['https://web.fallaweb.com/falla-web/act-ramadan-blind-box/prod/0.1.0/assets/984b8c1ed817992de62e.png']},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-blind-box/hk/0.0.5/assets/b3f8a15057ff9e5bca08.png',candidates:['https://web.fallaweb.com/falla-web/act-ramadan-blind-box/prod/0.1.0/assets/b3f8a15057ff9e5bca08.png']},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-blind-box/hk/0.0.5/assets/120621d850434f2bc653.png',candidates:['https://web.fallaweb.com/falla-web/act-ramadan-blind-box/prod/0.1.0/assets/120621d850434f2bc653.png']},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-blind-box/hk/0.0.5/assets/bbfc71623e98c1bcaec0.png',candidates:['https://web.fallaweb.com/falla-web/act-ramadan-blind-box/prod/0.1.0/assets/bbfc71623e98c1bcaec0.png']},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-blind-box/hk/0.0.5/assets/c0aa252db9ba6d240100.png',candidates:['https://web.fallaweb.com/falla-web/act-ramadan-blind-box/prod/0.1.0/assets/c0aa252db9ba6d240100.png']},
    {url:'https://web-test.falla.live/falla-web/act-fruit-party/hk/0.0.4/assets/7428a7868b34ab934bba.png',candidates:['https://web.fallaweb.com/falla-web/act-fruit-party/prod/0.1.0/assets/7428a7868b34ab934bba.png']},
    {url:'https://web-test.falla.live/falla-web/act-game-tournament/hk/0.0.3/assets/e732b9883a3550793852.png',candidates:['https://web.fallaweb.com/falla-web/act-game-tournament/prod/0.1.0/assets/e732b9883a3550793852.png']},
    {url:'https://falla-res1.resygg.com/awss3_866790_1688554732307588820_1526896285.png'},
    {url:'https://falla-res1.resygg.com/awss3_2840280_1687744856805158899_3314962440.png'},
    {url:'https://falla-res1.resygg.com/awss3_2840280_1687746952404611572_3833822128.png'},
    {url:'https://falla-res1.resygg.com/awss3_2840280_1687752442031713462_3935301157.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1673599094617473515_711146105.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1673599322010305663_231746732.png'}
  ];
  const jsonTargets=[
    {url:'https://web.fallaweb.com/activity_gift_config_v3/h5_1548_ALL.json',alts:['https://web.falla.live/activity_gift_config_v3/pre/h5_1548_ALL.json','https://web.falla.live/activity_gift_config_v3/prod/h5_1548_ALL.json'],compat:{code:0,msg:'success',res:[]}},
    {url:'https://web.falla.live/activity_gift_config_v3/pre/h5_424_ALL.json',alts:['https://web.falla.live/activity_gift_config_v3/prod/h5_424_ALL.json','https://web.fallaweb.com/activity_gift_config_v3/h5_424_ALL.json'],compat:{code:0,msg:'success',res:[]}},
    {url:'https://web.falla.live/activity_gift_config_v2/pre/h5_190_ALL.json',alts:['https://web.falla.live/activity_gift_config_v2/prod/h5_190_ALL.json','https://web.fallaweb.com/activity_gift_config_v2/h5_190_ALL.json'],compat:{code:0,msg:'success',res:[]}}
  ];
  let added=0,compat=0,failed=[];
  function mirrors(url){
    const out=[url];
    try{
      const u=new URL(url), suffix=u.pathname+u.search;
      if(u.hostname==='res-g.resygg.com')out.push('https://falla-res1.resygg.com'+suffix,'https://falla-res1.falla.live'+suffix);
      if(u.hostname==='falla-res1.resygg.com')out.push('https://res-g.resygg.com'+suffix,'https://falla-res1.falla.live'+suffix);
    }catch{}
    return [...new Set(out)];
  }
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
    if(byUrl.has(urlKey('GET',item.url))||byPath.has(pathKey('GET',item.url)))continue;
    const got=await get([...mirrors(item.url),...(item.candidates||[])],'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8');
    if(!got){failed.push(item.url);continue;}
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch10-static-closure'});added++;
  }
  for(const item of jsonTargets){
    if(byUrl.has(urlKey('GET',item.url))||byPath.has(pathKey('GET',item.url)))continue;
    const got=await get([item.url,...item.alts],'application/json,text/plain,*/*');
    if(got){await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch10-json-closure'});added++;continue;}
    const body=Buffer.from(JSON.stringify(item.compat));
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:'historical-compat-empty',body,status:200,headers:{'content-type':'application/json; charset=utf-8','x-pro-falla-local':'historical-compat-fixture'},pageId:'batch10-historical-compat'});added++;compat++;
  }
  return {added,compat,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const batch10Resources=await prefetchBatch10Resources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,batch10Resources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_batch10.mjs')
