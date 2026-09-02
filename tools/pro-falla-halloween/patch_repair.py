#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-halloween/archive_halloween.mjs')
src = p.read_text(encoding='utf-8')

# The 2022 SPA treats ranking as an in-page tab rather than a stable hash route.
old_actions = """    '/__candy-king':['Candy King'],
    '/__reward':['Reward'],
    '/__rules':['Rules']"""
new_actions = """    '/__candy-king':['Candy King'],
    '/__reward':['Reward'],
    '/__ranking':['Ranking'],
    '/__rules':['Rules']"""
if old_actions not in src:
    raise SystemExit('action map anchor not found')
src = src.replace(old_actions, new_actions, 1)

anchor = 'async function captureOffline(browser,online){'
prefetch = r'''async function prefetchHalloweenResources(){
  const imageUrls=[
    'https://falla-res1.resygg.com/awss3_2168516_1666771277557556722_3234362521.png',
    'https://falla-res1.resygg.com/awss3_2168516_1666771646172007327_2675723888.png',
    'https://falla-res1.resygg.com/awss3_2168516_1666771822340077335_1661585032.png',
    'https://falla-res1.resygg.com/awss3_2168516_1666771929166164260_3601435880.png',
    'https://falla-res1.resygg.com/awss3_1436068_1697441561904813617_1767391401.png',
    'https://falla-res1.resygg.com/awss3_866790_1697709734068750198_1678038683.png'
  ];
  let added=0,failed=[];
  for(const url of imageUrls){
    if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;
    try{
      const r=await fetch(url,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8','referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
      if(!r.ok)throw new Error(`HTTP ${r.status}`);
      const body=Buffer.from(await r.arrayBuffer()),headers=Object.fromEntries(r.headers.entries());
      await savePrefetchedRecord({method:'GET',url,sourceUrl:String(r.url),body,status:r.status,headers,pageId:'halloween-static-closure'});added++;
    }catch(e){failed.push({url,error:String(e)});}
  }
  // Falla removed the historical h5_346 reward JSON. Preserve the original
  // component contract without inventing users, rankings, rewards or values.
  const rewardUrl='https://web.falla.live/activity_gift_config_v3/pre/h5_346_ALL.json';
  if(!byUrl.has(urlKey('GET',rewardUrl))&&!byPath.has(pathKey('GET',rewardUrl))){
    const compat={
      userSendGiftRank:{userConfig:[]},
      userReceiveGiftRank:{userConfig:[]},
      userRechargeRank:{userConfig:[]},
      groupGiftRank:{groupConfig:[]},
      roomGiftRank:{roomConfig:[]}
    };
    const body=Buffer.from(JSON.stringify(compat));
    await savePrefetchedRecord({method:'GET',url:rewardUrl,sourceUrl:'historical-config-contract-reconstruction',body,status:200,headers:{'content-type':'application/json; charset=utf-8','cache-control':'no-store','x-pro-falla-local':'historical-config-contract'},pageId:'halloween-historical-config'});added++;
  }
  return {added,failed,historicalConfigContracts:1};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old_main = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new_main = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const halloweenResources=await prefetchHalloweenResources();console.log(`OFFLINE ${online.length}`);"
if old_main not in src:
    raise SystemExit('main prefetch anchor not found')
src = src.replace(old_main, new_main, 1)

old_manifest = 'staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length'
new_manifest = 'staticClosureAdded:closureAdded,activityConfigAdded,halloweenResources,captureErrors:captureErrors.length'
if old_manifest not in src:
    raise SystemExit('manifest anchor not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched Halloween repair closure')
