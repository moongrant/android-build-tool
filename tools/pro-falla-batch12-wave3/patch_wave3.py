#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch12-wave3/archive_wave3.mjs')
src = p.read_text(encoding='utf-8')

# The historical Eid project path is case-sensitive on Falla's storage.
src = src.replace("project:'act-ramadan-eid-al-fitr'", "project:'act-ramadan-Eid-Al-Fitr'")

# Add precise anonymous zero-state responses for historical endpoints that no
# longer return data. These shapes are derived from the official bundles and
# preserve only the component contract; no users, rankings, gifts, progress or
# awards are invented.
fixture_anchor = "  if(p.includes('/act/ramadan/23/actinfo')){res={taskList:[],rankList:[],rewardList:[],records:[],score:0,progress:0};kind='empty-ramadan-2023';}"
fixture_insert = """  if(p.includes('/act/ramadan/actinfo')){res={myScore:0,score:0,progress:0,ptypeNum:0,userInfo:{uid:0,nickName:'',avatar:'',isLogin:false},taskList:[{myScore:0,actTaskInfo:[{needScore:1,taskPrizeTitle:'',taskPrizeList:[]},{needScore:2,taskPrizeTitle:'',taskPrizeList:[]},{needScore:3,taskPrizeTitle:'',taskPrizeList:[]},{needScore:4,taskPrizeTitle:'',taskPrizeList:[]}]}],rankList:[],rewardList:[],records:[],prizeBoxList:[]};kind='empty-ramadan-opening';}
  else if(p.includes('/act/ramadan/daily/list/user')){res={list:[],rankList:[],userList:[],scroll:'',hasMore:false};kind='empty-ramadan-daily-user-list';}
  else if(p.includes('/happy/eid/myinfo')){res={uid:0,nickName:'',avatar:'',isLogin:false,myGiftWorth:0,balanceGiftWorth:0,grandGiftWorth:0,fastingMealNum:0,giftBasketNum:0,taskList:[],giftList:[],rewardList:[],records:[]};kind='empty-happy-eid-user';}
  else if(p.includes('/happy/eid/grandgiftworth/top3')){res={list:[],rankList:[],top3:[]};kind='empty-happy-eid-top3';}
  else if(p.includes('/act/ramadan/fantasycp/cpprocess')){res={cpInfo:null,process:0,namingCount:0,taskList:[],rewardList:[],records:[],castleList:[],rankList:[],giftList:[]};kind='empty-ramadan-cp-process';}
  else if(p.includes('/act/ramadan/fantasycp/dayrank')){res={rankList:[],list:[],myRank:null,records:[]};kind='empty-ramadan-cp-day-rank';}
  else if(p.includes('/act/ramadan/fantasycp/allrank')){res={rankList:[],list:[],myRank:null,records:[]};kind='empty-ramadan-cp-all-rank';}
  else if(p.includes('/act/ramadan/23/actinfo')){res={taskList:[],rankList:[],rewardList:[],records:[],score:0,progress:0};kind='empty-ramadan-2023';}"""
if fixture_anchor not in src:
    raise SystemExit('fixture anchor not found')
src = src.replace(fixture_anchor, fixture_insert, 1)

capture_anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchWave3Resources(){
  const targets=[
    'https://falla-res1.resygg.com/awss3_103192_1710143658662848304_122516325.png',
    'https://falla-res1.resygg.com/awss3_103192_1710143681795339873_2548255140.png',
    'https://falla-res1.resygg.com/awss3_103192_1710143700933086087_3026611231.png',
    'https://falla-res1.resygg.com/awss3_103192_1710143725356057497_876332084.png',
    'https://falla-res1.resygg.com/awss3_2168516_1678862221868332116_1302265235.png',
    'https://falla-res1.resygg.com/awss3_2168516_1678862583808378990_3864379782.png',
    'https://falla-res1.resygg.com/awss3_2168516_1678862655956093626_66971608.png',
    'https://falla-res1.resygg.com/awss3_2168516_1679911612885429749_4219046317.png',
    'https://falla-res1.resygg.com/awss3_2168516_1679911778279145040_3662752869.png',
    'https://falla-res1.resygg.com/awss3_2168516_1679911948777193466_2859852832.png',
    'https://falla-res1.resygg.com/awss3_2168516_1682578775328280432_896373190.png',
    'https://falla-res1.resygg.com/awss3_3553038_1700129052698104617_43810876.png',
    'https://falla-res1.resygg.com/awss3_866790_1709778809077644290_2804055288.png',
    'https://falla-res1.resygg.com/awss3_866790_1709778882051890609_1390779471.png',
    'https://falla-res1.resygg.com/awss3_866790_1709778891585588506_2597354728.png',
    'https://falla-res1.resygg.com/awss3_866790_1710226475296752581_3493951418.png',
    'https://falla-res1.resygg.com/awss3_866790_1710226477091465566_3204116953.png',
    'https://falla-res1.resygg.com/awss3_866790_1710226480929107486_1846622097.png',
    'https://falla-res1.resygg.com/awss3_866790_1710997176962683587_3214729990.png',
    'https://falla-res1.resygg.com/awss3_866790_1710997178697925938_787441588.png',
    'https://falla-res1.resygg.com/awss3_866790_1710997180324636207_2724818243.png',
    'https://res-g.resygg.com/awss3_3194919_1710838945729850999_3801693514.png',
    'https://res-g.resygg.com/awss3_3194919_1710839135149715649_2376944643.png',
    'https://res-g.resygg.com/awss3_3194919_1710839185430034021_3215990926.png',
    'https://res-g.resygg.com/awss3_866790_1710932858718141306_3193960459.png',
    'https://res-g.resygg.com/awss3_866790_1710932865588906264_22084026.png',
    'https://res-g.resygg.com/awss3_866790_1710947155263784308_3316257670.png?x-oss-process=image/resize,m_fill,w_126,h_126',
    'https://res-g.resygg.com/awss3_866790_1710947161592879963_2261168789.png?x-oss-process=image/resize,m_fill,w_126,h_126',
    'https://web-test.falla.live/falla-web/act-ramadan-23/hk/0.0.7/assets/fd5dfa11ef963ceda4ff.png',
    'https://web-test.falla.live/falla-web/act-ramadan-happy-23/hk/0.0.2/assets/38a5cb175e61d417d4a0.png',
    'https://web-test.falla.live/falla-web/act-ramadan-happy-23/hk/0.0.2/assets/3f3c7acdab9b724208f6.png',
    'https://web-test.falla.live/falla-web/act-ramadan-happy-23/hk/0.0.2/assets/78b280004f9fcbb5a271.png',
    'https://web-test.falla.live/falla-web/act-ramadan-main/hk/0.0.11/assets/0e78aeb4124690d52968.png',
    'https://web-test.falla.live/falla-web/act-ramadan-ring/hk/0.0.7/assets/e3b37ceaa7cd6f86f459.png',
    'https://web-test.falla.live/falla-web/act-ramadan-cp/hk/0.0.5/assets/e0bf7274c80cfdf032c4.png'
  ];
  const malformed=[
    {url:'https://web-test.falla.live/falla-web/act-ramadan-eid-al-fitr/hk//upload.json',candidates:['https://web-test.falla.live/falla-web/act-ramadan-Eid-Al-Fitr/hk/upload.json','https://web.falla.live/falla-web/act-ramadan-Eid-Al-Fitr/pre/upload.json','https://web.fallaweb.com/falla-web/act-ramadan-Eid-Al-Fitr/prod/upload.json']},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-eid-al-fitr/hk//css/common.9e6caf67.css',candidates:[]},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-eid-al-fitr/hk//css/main.a0545cee.css',candidates:[]},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-eid-al-fitr/hk//js/25.d72052c1.js',candidates:[]},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-eid-al-fitr/hk//js/main.3a2ed4f0.js',candidates:[]}
  ];
  let added=0,failed=[];
  function candidatesFor(url){
    const out=[url];
    try{
      const u=new URL(url), suffix=u.pathname+u.search, plain=u.origin+u.pathname;
      if(u.search)out.push(plain);
      if(u.hostname==='falla-res1.resygg.com')out.push('https://falla-res1.falla.live'+suffix,'https://res-g.resygg.com'+suffix);
      if(u.hostname==='res-g.resygg.com')out.push('https://falla-res1.resygg.com'+suffix,'https://falla-res1.falla.live'+suffix);
      if(u.hostname==='web-test.falla.live'&&u.pathname.includes('/falla-web/')){
        out.push('https://web.falla.live'+u.pathname.replace('/hk/','/pre/')+u.search);
        out.push('https://web.fallaweb.com'+u.pathname.replace('/hk/','/prod/')+u.search);
        if(u.pathname.includes('/act-ramadan-ring/hk/0.0.7/')){
          out.push('https://web-test.falla.live'+u.pathname.replace('/0.0.7/','/0.0.6/')+u.search);
          out.push('https://web.falla.live'+u.pathname.replace('/hk/0.0.7/','/pre/0.0.6/')+u.search);
          out.push('https://web.fallaweb.com'+u.pathname.replace('/hk/0.0.7/','/prod/0.0.6/')+u.search);
        }
      }
    }catch{}
    return [...new Set(out)];
  }
  async function get(cands,accept){
    for(const candidate of cands){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':accept,'referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        const body=Buffer.from(await r.arrayBuffer());if(!body.length)continue;
        return {body,sourceUrl:String(r.url),status:r.status,headers:Object.fromEntries(r.headers.entries())};
      }catch{}
    }
    return null;
  }
  for(const url of targets){
    if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;
    const accept=/\.(?:png|jpe?g|webp|gif|svg)(?:\?|$)/i.test(url)?'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8':'*/*';
    const got=await get(candidatesFor(url),accept);
    if(!got){failed.push(url);continue;}
    await savePrefetchedRecord({method:'GET',url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch12-wave3-static-closure'});added++;
  }
  for(const item of malformed){
    if(byUrl.has(urlKey('GET',item.url))||byPath.has(pathKey('GET',item.url)))continue;
    const got=await get([...item.candidates,...candidatesFor(item.url)],'*/*');
    if(!got){failed.push(item.url);continue;}
    await savePrefetchedRecord({method:'GET',url:item.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'batch12-wave3-case-compat'});added++;
  }
  return {added,failed};
}

'''
if capture_anchor not in src:
    raise SystemExit('capture anchor not found')
src = src.replace(capture_anchor, prefetch + capture_anchor, 1)

main_old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
main_new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const wave3Resources=await prefetchWave3Resources();console.log(`OFFLINE ${online.length}`);"
if main_old not in src:
    raise SystemExit('main prefetch anchor not found')
src = src.replace(main_old, main_new, 1)

manifest_old = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
manifest_new = "staticClosureAdded:closureAdded,activityConfigAdded,wave3Resources,captureErrors:captureErrors.length"
if manifest_old not in src:
    raise SystemExit('manifest anchor not found')
src = src.replace(manifest_old, manifest_new, 1)

p.write_text(src, encoding='utf-8')
print('patched wave3 archiver')
