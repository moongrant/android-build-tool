#!/usr/bin/env python3
from pathlib import Path
import re

p = Path('tools/pro-falla-batch12-wave3/archive_wave3.mjs')
src = p.read_text(encoding='utf-8')

# Route /1 in the 2023 opening SPA is not an official navigable state. It is a
# guessed historical hash that renders a translation-array exception. Keep the
# valid original root view and remove only that invalid probe route.
src, route_n = re.subn(
    r"(project:'act-ramadan-23'.{0,600}?routes:)\[[^\]]*\]",
    lambda m: m.group(1) + "['/']",
    src,
    count=1,
    flags=re.S,
)
if route_n != 1:
    raise SystemExit(f'ramadan-23 route repair failed: {route_n}')

# Early-return API fixtures are inserted before the generic fixture chain so
# later generic /info and /rank branches cannot overwrite the exact shape.
marker = "  const p=u.pathname.toLowerCase(); const now=Math.floor(Date.now()/1000); let res={}; let kind='empty-object';\n"
transparent_b64 = 'iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVQIHWP4z8DwHwAFgAI/ScLxWQAAAABJRU5ErkJggg=='
compat = f"""  const compatImagePaths=['/happy/eid/myinfo','/happy/eid/grandgiftworth/top3','/act/ramadan/fantasycp/cpprocess','/act/ramadan/fantasycp/dayrank','/act/ramadan/fantasycp/allrank','/act/ramadan/24/dayrank','/act/ramadan/24/userinfo','/act/ramadan/happyeid/dayrank','/act/ramadan/lucky/actinfo','/act/ramadan/lucky/dayrank','/act/ramadan/dreamring/userdata','/act/ramadan/dreamring/dayrank'];
  if(method==='GET'&&compatImagePaths.some(x=>p.includes(x)))return{{kind:'anonymous-api-image',body:Buffer.from('{transparent_b64}','base64'),headers:{{'content-type':'image/png','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'anonymous-image-fixture'}}}};
  if(p.includes('/happy/eid/myinfo'))return{{kind:'empty-happy-eid-user',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{uid:0,nickName:'',avatar:'',isLogin:false,myGiftWorth:0,balanceGiftWorth:0,grandGiftWorth:0,fastingMealNum:0,giftBasketNum:0,taskList:[],giftList:[],rewardList:[],records:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/happy/eid/grandgiftworth/top3'))return{{kind:'empty-happy-eid-top3',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{list:[],rankList:[],top3:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/act/ramadan/fantasycp/cpprocess'))return{{kind:'empty-ramadan-cp-process',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{cpInfo:null,process:0,namingCount:0,taskList:[],rewardList:[],records:[],castleList:[],rankList:[],giftList:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/act/ramadan/fantasycp/dayrank')||p.includes('/act/ramadan/fantasycp/allrank')||p.includes('/act/ramadan/24/dayrank')||p.includes('/act/ramadan/happyeid/dayrank')||p.includes('/act/ramadan/lucky/dayrank')||p.includes('/act/ramadan/dreamring/dayrank'))return{{kind:'empty-ramadan-rank',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{list:[],rankList:[],myRank:null,records:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/act/ramadan/24/userinfo'))return{{kind:'empty-ramadan-2024-user',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{uid:0,nickName:'',avatar:'',isLogin:false,score:0,rank:0,taskList:[],rewardList:[],records:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/act/ramadan/lucky/actinfo'))return{{kind:'empty-ramadan-lucky',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{drawCount:0,lotteryCount:0,progress:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],lotteryList:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
  if(p.includes('/act/ramadan/dreamring/userdata'))return{{kind:'empty-ramadan-ring-user',body:Buffer.from(JSON.stringify({{code:0,msg:'success',res:{{uid:0,nickName:'',avatar:'',isLogin:false,ringLevel:0,score:0,progress:0,taskList:[],rewardList:[],records:[],ringList:[]}}}})),headers:{{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}}}};
"""
if marker not in src:
    raise SystemExit('fixture marker not found')
src = src.replace(marker, marker + compat, 1)

capture_anchor = "async function captureOffline(browser,online){"
compat_prefetch = r'''async function prefetchWave3Compatibility(){
  const apiRows=[
    ['https://api.apifalla.com/api/web/happy/eid/myInfo',{uid:0,nickName:'',avatar:'',isLogin:false,myGiftWorth:0,balanceGiftWorth:0,grandGiftWorth:0,fastingMealNum:0,giftBasketNum:0,taskList:[],giftList:[],rewardList:[],records:[]}],
    ['https://api.apifalla.com/api/web/happy/eid/grandGiftWorth/top3',{list:[],rankList:[],top3:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/fantasyCp/cpProcess',{cpInfo:null,process:0,namingCount:0,taskList:[],rewardList:[],records:[],castleList:[],rankList:[],giftList:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/fantasyCp/dayRank',{list:[],rankList:[],myRank:null,records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/fantasyCp/allRank',{list:[],rankList:[],myRank:null,records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/24/dayRank',{list:[],rankList:[],myRank:null,records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/24/userInfo',{uid:0,nickName:'',avatar:'',isLogin:false,score:0,rank:0,taskList:[],rewardList:[],records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/happyEid/dayRank',{list:[],rankList:[],myRank:null,records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/lucky/actInfo',{drawCount:0,lotteryCount:0,progress:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],lotteryList:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/lucky/dayRank',{list:[],rankList:[],myRank:null,records:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/dreamRing/userData',{uid:0,nickName:'',avatar:'',isLogin:false,ringLevel:0,score:0,progress:0,taskList:[],rewardList:[],records:[],ringList:[]}],
    ['https://api.apifalla.com/api/web/act/ramadan/dreamRing/dayRank',{list:[],rankList:[],myRank:null,records:[]}]
  ];
  const transparent=Buffer.from('iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVQIHWP4z8DwHwAFgAI/ScLxWQAAAABJRU5ErkJggg==','base64');
  let apiAdded=0,imageAdded=0,assetFallbacks=[];
  for(const [url,res] of apiRows){
    const json=Buffer.from(JSON.stringify({code:0,msg:'success',res}));
    await savePrefetchedRecord({method:'POST',url,sourceUrl:'historical-anonymous-api-fixture',body:json,status:200,headers:{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'},pageId:'batch12-wave3-api-compat'});apiAdded++;
    await savePrefetchedRecord({method:'GET',url,sourceUrl:'historical-anonymous-image-fixture',body:transparent,status:200,headers:{'content-type':'image/png','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'anonymous-image-fixture'},pageId:'batch12-wave3-api-image-compat'});imageAdded++;
  }
  const staticRows=[
    ['https://falla-res1.resygg.com/awss3_103192_1710143681795339873_2548255140.png','https://falla-res1.resygg.com/awss3_103192_1710143658662848304_122516325.png','adjacent-official-stage-art'],
    ['https://falla-res1.resygg.com/awss3_2168516_1678862655956093626_66971608.png','https://falla-res1.resygg.com/awss3_2168516_1678862583808378990_3864379782.png','adjacent-official-reward-art'],
    ['https://web-test.falla.live/falla-web/act-ramadan-23/hk/0.0.7/assets/fd5dfa11ef963ceda4ff.png',null,'transparent-removed-historical-asset'],
    ['https://web-test.falla.live/falla-web/act-ramadan-ring/hk/0.0.7/assets/e3b37ceaa7cd6f86f459.png',null,'transparent-removed-historical-asset']
  ];
  for(const [url,fallback,kind] of staticRows){
    let body=transparent,sourceUrl='historical-transparent-placeholder',headers={'content-type':'image/png','cache-control':'public,max-age=31536000','x-pro-falla-local':kind};
    if(fallback){
      const rec=byUrl.get(urlKey('GET',fallback))||byPath.get(pathKey('GET',fallback));
      if(rec){body=await fs.readFile(path.join(OUT,rec.objectPath));sourceUrl=fallback;headers={...rec.headers,'x-pro-falla-local':kind};}
    }
    await savePrefetchedRecord({method:'GET',url,sourceUrl,body,status:200,headers,pageId:'batch12-wave3-static-compat'});assetFallbacks.push({url,sourceUrl,kind});
  }
  return {apiAdded,imageAdded,assetFallbacks};
}

'''
if capture_anchor not in src:
    raise SystemExit('capture anchor not found')
src = src.replace(capture_anchor, compat_prefetch + capture_anchor, 1)

old = "const wave3Resources=await prefetchWave3Resources();console.log(`OFFLINE ${online.length}`);"
new = "const wave3Resources=await prefetchWave3Resources();const wave3Compatibility=await prefetchWave3Compatibility();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('wave3 prefetch call anchor not found')
src = src.replace(old, new, 1)

old = "activityConfigAdded,wave3Resources,captureErrors:captureErrors.length"
new = "activityConfigAdded,wave3Resources,wave3Compatibility,captureErrors:captureErrors.length"
if old not in src:
    raise SystemExit('wave3 manifest anchor not found')
src = src.replace(old, new, 1)

p.write_text(src, encoding='utf-8')
print('patched wave3 archiver v3')
