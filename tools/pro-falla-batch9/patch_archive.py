#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch9/archive_batch9.mjs')
src = p.read_text(encoding='utf-8')

# Explicit zero-state responses for historical account APIs that have expired.
needle = "else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"
extra = """else if(p.includes('/sweet/lover/get')){res={uid:0,nickName:'',avatar:'',isLogin:false,hasLover:false,loverInfo:null,cpInfo:null,intimacy:0,process:0,taskList:[],rankList:[],rewardList:[],records:[]};kind='empty-pumpkin-cp-lover';}\n  else if(p.includes('/ramadan/blindbox/v3/actinfo')){res={blindBoxList:[],boxList:[],taskList:[],rankList:[],rewardList:[],records:[],currentLevel:0,openCount:0,progress:0,score:0,drawCount:0};kind='empty-super-lucky-bag';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, extra, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchBatch9Resources(){
  const targets=[
    // Ball Party
    'https://falla-res1.resygg.com/awss3_866790_1701396467103582410_4069181174.png',
    'https://falla-res1.resygg.com/awss3_3553038_1701242143578829513_1540513237.png',
    'https://falla-res1.resygg.com/awss3_3553038_1701242220032389188_1138892967.png',
    'https://falla-res1.resygg.com/awss3_3553038_1701242291327204523_1256818533.png',
    // Special Gift · Pop Star
    'https://falla-res1.resygg.com/awss3_2861604_1691132546145354427_2689989275.png',
    'https://falla-res1.resygg.com/awss3_2861604_1691132535323533073_4165655633.png',
    'https://falla-res1.resygg.com/awss3_3184236_1691119138213449202_763235583.png',
    // Super Lucky Bag
    'https://res-g.resygg.com/awss3_4081076_1717559765489081284_74300241.png',
    'https://res-g.resygg.com/awss3_4081076_1717559776228194046_692288516.png',
    'https://res-g.resygg.com/awss3_4081076_1717137944321175596_4085882167.png',
    'https://res-g.resygg.com/awss3_4081076_1717138043877765221_1434023052.png',
    'https://res-g.resygg.com/awss3_4081076_1717138146760454762_1198718282.png',
    'https://web-test.falla.live/falla-web/act-super-lucky-bag/hk/0.2.1/assets/0408705ff63ac5e6a09d.png',
    // Pumpkin Lantern CP
    'https://falla-res1.resygg.com/awss3_2168516_1667892854854489288_416229212.png',
    'https://falla-res1.resygg.com/awss3_2168516_1667892946523700454_1560956524.png',
    'https://falla-res1.resygg.com/awss3_2168516_1667893035016338013_2744390334.png',
    // Harvest engine comparison
    'https://falla-res1.resygg.com/awss3_2168516_1672392034381986523_1260994586.png',
    'https://res-g.resygg.com/awss3_3553038_1704424074540809373_2429711946.png',
    'https://res-g.resygg.com/awss3_3553038_1704424148927765479_3499166294.png',
    'https://res-g.resygg.com/awss3_866790_1703672632313398256_3719278637.png',
    'https://res-g.resygg.com/awss3_866790_1703672640161423806_2613303512.png',
    // Skiing engine comparison
    'https://res-g.resygg.com/awss3_105315_1707201155071803061_2054725262.png',
    'https://res-g.resygg.com/awss3_3553038_1707213071587639223_2360558458.png',
    'https://falla-res1.resygg.com/awss3_2168516_1672905749201967832_3566847932.png',
    'https://res-g.resygg.com/awss3_3553038_1706064797342532430_2028528311.png',
    'https://res-g.resygg.com/awss3_3553038_1706064888338478448_2015784455.png',
    // PUBG engine comparison
    'https://res-g.resygg.com/awss3_3048846_1717053514351209204_2105948722.png',
    'https://res-g.resygg.com/awss3_3048846_1717053518795233632_2172831640.png',
    'https://res-g.resygg.com/awss3_2181270_1715423050642858461_1236011826.png',
    'https://res-g.resygg.com/awss3_2181270_1715423290661212233_2862319621.png',
    'https://res-g.resygg.com/awss3_2181270_1715423445979392927_3730327460.png'
  ];
  const jsonTargets=[
    {url:'https://web.falla.live/activity_gift_config_v2/pre/h5_151_EN.json',alts:['https://web.falla.live/activity_gift_config_v2/prod/h5_151_EN.json','https://web.fallaweb.com/activity_gift_config_v2/h5_151_EN.json'],compat:{code:0,msg:'success',res:[]}}
  ];
  let added=0,compat=0,failed=[];
  function mirrors(url){
    const out=[url];
    try{
      const u=new URL(url), pathname=u.pathname+u.search;
      if(u.hostname==='falla-res1.resygg.com'){
        out.push('https://falla-res1.falla.live'+pathname,'https://res-g.resygg.com'+pathname);
      }else if(u.hostname==='res-g.resygg.com'){
        out.push('https://falla-res1.resygg.com'+pathname,'https://falla-res1.falla.live'+pathname);
      }
    }catch{}
    return [...new Set(out)];
  }
  async function fetchCandidates(candidates,accept){
    for(const candidate of candidates){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':accept,'referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        const body=Buffer.from(await r.arrayBuffer());
        if(!body.length)continue;
        return {body,sourceUrl:String(r.url),status:r.status,headers:Object.fromEntries(r.headers.entries())};
      }catch{}
    }
    return null;
  }
  for(const url of targets){
    if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;
    const got=await fetchCandidates(mirrors(url),'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8');
    if(!got){failed.push(url);continue;}
    await savePrefetchedRecord({method:'GET',url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch9-static-closure'});added++;
  }
  for(const item of jsonTargets){
    if(byUrl.has(urlKey('GET',item.url))||byPath.has(pathKey('GET',item.url)))continue;
    const got=await fetchCandidates([item.url,...item.alts],'application/json,text/plain,*/*');
    if(got){await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch9-json-closure'});added++;continue;}
    const body=Buffer.from(JSON.stringify(item.compat));
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:'historical-compat-empty',body,status:200,headers:{'content-type':'application/json; charset=utf-8','x-pro-falla-local':'historical-compat-fixture'},pageId:'batch9-historical-compat'});added++;compat++;
  }
  return {added,compat,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const batch9Resources=await prefetchBatch9Resources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,batch9Resources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_batch9.mjs')
