#!/usr/bin/env python3
from pathlib import Path

src_path = Path('work/archive_selected_repaired.mjs')
src = src_path.read_text(encoding='utf-8')

# Broaden API fixture host coverage and return a deliberately broad neutral state.
src = src.replace("if(u.hostname!=='apihk.falla.live')return null;", "if(!/(?:apihk\\.falla\\.live|api\\.apifalla\\.com)$/i.test(u.hostname))return null;")
old = """  let res={};
  let kind='empty-object';
"""
new = r"""  const neutralTask={id:1,taskId:1,name:'',title:'',status:0,taskStatus:0,progress:0,current:0,target:1,total:1,rewardList:[],rewards:[]};
  const neutralRank={uid:0,userId:0,nickName:'',nickname:'',avatar:'',score:0,rank:0,countryCode:''};
  const neutralBox={id:1,boxId:1,status:0,state:0,progress:0,target:1,rewardList:[],prizeList:[]};
  let res={
    list:[],records:[],recordList:[],rank:[],rankList:[],userRank:null,top3:[],carousel:[],
    taskList:[neutralTask],tasks:[neutralTask],dailyTaskList:[neutralTask],
    rewardList:[],rewards:[],awardList:[],awards:[],prizeList:[],giftInfoList:[],giftList:[],
    mapList:[],maps:[],nodeList:[],nodes:[],boxList:[neutralBox],blindBoxList:[neutralBox],
    process:0,progress:0,current:0,target:1,total:1,stage:1,level:1,status:0,state:0,
    coin:0,balance:0,drawCount:0,chance:0,times:0,score:0,
    userInfo:{uid:0,userId:0,nickName:'',nickname:'',avatar:'',countryCode:'',isLogin:false},
    self:neutralRank,config:{},extConfig:{},serverConfig:{},
  };
  res.data=res;
  let kind='neutral-archive-state';
"""
if old not in src:
    raise SystemExit('neutral fixture anchor not found')
src = src.replace(old, new, 1)

# Return both data and res wrappers so legacy projects using either convention stay out of error state.
src = src.replace("const body=Buffer.from(JSON.stringify({code:0,msg:'success',res}));", "const body=Buffer.from(JSON.stringify({code:0,status:0,msg:'success',message:'success',res,data:res,result:res}));")

# Insert probe loader before browser startup.
anchor = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});"
loader = r"""async function loadRepairProbe(){
  const dir=process.env.PROBE_DIR; if(!dir)return {loaded:0,goodApi:0,sourceMaps:0};
  let rows=[]; try{rows=JSON.parse(await fs.readFile(path.join(dir,'results.json'),'utf8'));}catch(e){captureErrors.push({pageId:'repair-probe',error:String(e)});return {loaded:0,goodApi:0,sourceMaps:0};}
  const scored=[];
  function richness(row,body){
    let score=0; if(row.status===200)score+=20; score+=Math.min(body.length/2048,20);
    try{const j=JSON.parse(body.toString('utf8')); const code=j?.code ?? j?.status; if(code===0||code===200)score+=50; const x=j?.res ?? j?.data ?? j?.result; if(Array.isArray(x)&&x.length)score+=30; else if(x&&typeof x==='object'&&Object.keys(x).length)score+=30;}catch{}
    if(/source-maps\//.test(row.path||''))score+=80; if(/gift-config|translations/.test(row.path||''))score+=40; return score;
  }
  for(const row of rows){
    if(row.status!==200||!row.path)continue; let body; try{body=await fs.readFile(path.join(dir,row.path));}catch{continue;}
    scored.push({row,body,score:richness(row,body)});
  }
  scored.sort((a,b)=>b.score-a.score);
  let loaded=0,goodApi=0,sourceMaps=0;
  for(const item of scored){
    const {row,body,score}=item; const method=(row.method||'GET').toUpperCase(),url=row.url;
    if(!url)continue;
    let contentType=row.contentType||''; if(!contentType){contentType=/\.map(?:\?|$)/.test(url)?'application/json':'application/octet-stream';}
    const bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,contentType)}`;
    try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
    const post=row.payload?JSON.stringify(row.payload):'';
    const rec={key:requestKey(method,url,post),method,url,postDataHash:sha(post),status:200,statusText:'OK',headers:{'content-type':contentType,'cache-control':'no-store','x-pro-falla-source':'repair-probe'},objectPath,bytes:body.length,sha256:bodyHash,contentType,pageIds:['repair-probe'],probeScore:score};
    records.set(rec.key,rec); const uk=urlMethodKey(method,url); if(!byUrl.has(uk)||(byUrl.get(uk).probeScore||0)<score)byUrl.set(uk,rec); const pk=pathMethodKey(method,url); if(!byPath.has(pk)||(byPath.get(pk).probeScore||0)<score)byPath.set(pk,rec);
    loaded++; if(/\/api\//.test(url))goodApi++; if(/\.map(?:\?|$)/.test(url)){sourceMaps++;}
  }
  return {loaded,goodApi,sourceMaps};
}

const repairProbeSummary=await loadRepairProbe();
const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});"""
if anchor not in src:
    raise SystemExit('browser anchor not found')
src = src.replace(anchor, loader, 1)

# Prefer enriched probe records by path for API calls before exact online error responses.
old_record = """function recordFor(method,url,post=''){
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlMethodKey(method,url))||byPath.get(pathMethodKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlMethodKey(method,noQuery))||byPath.get(pathMethodKey(method,noQuery));}catch{}}
  return rec;
}
"""
new_record = """function recordFor(method,url,post=''){
  const isApi=/(?:apihk\\.falla\\.live|api\\.apifalla\\.com)/i.test(url);
  let rec=isApi?(byPath.get(pathMethodKey(method,url))||byUrl.get(urlMethodKey(method,url))||records.get(requestKey(method,url,post))):(records.get(requestKey(method,url,post))||byUrl.get(urlMethodKey(method,url))||byPath.get(pathMethodKey(method,url)));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlMethodKey(method,noQuery))||byPath.get(pathMethodKey(method,noQuery));}catch{}}
  return rec;
}
"""
if old_record not in src:
    raise SystemExit('recordFor block not found')
src = src.replace(old_record,new_record,1)

# Record visible error text instead of silently passing screenshots with broken historical states.
old_return = "return {...online,offlineMetrics:metrics,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineFixtureCount:fixtures,offlineFixtureUrls:fixtureUrls,offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};"
new_return = "const visibleErrorPhrases=(metrics?.bodyText||'').match(/(?:Error request,? please try again later|request failed|network error|加载失败|请求失败)/ig)||[]; return {...online,offlineMetrics:metrics,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineFixtureCount:fixtures,offlineFixtureUrls:fixtureUrls,visibleErrorPhrases:[...new Set(visibleErrorPhrases)],offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};"
if old_return not in src:
    raise SystemExit('offline return anchor not found')
src = src.replace(old_return,new_return,1)

# Add error-phrase aggregation and probe proof to unit/campaign/manifest.
src = src.replace("historicalApiFixtures:pages.reduce((a,p)=>a+(p.offlineFixtureCount||0),0),brokenImages:", "historicalApiFixtures:pages.reduce((a,p)=>a+(p.offlineFixtureCount||0),0),visibleErrorPhrases:[...new Set(pages.flatMap(p=>p.visibleErrorPhrases||[]))],brokenImages:")
src = src.replace("historicalApiFixtures:unitResults.reduce((a,u)=>a+(u.historicalApiFixtures||0),0),brokenImages:", "historicalApiFixtures:unitResults.reduce((a,u)=>a+(u.historicalApiFixtures||0),0),visibleErrorPhrases:[...new Set(unitResults.flatMap(u=>u.visibleErrorPhrases||[]))],brokenImages:")
src = src.replace("captureErrors:captureErrors.length,historicalApiFixtureCount:", "captureErrors:captureErrors.length,repairProbeSummary,historicalApiFixtureCount:")
src = src.replace("offlineReplayComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.navErrors===0&&c.originalBundleReplay)", "offlineReplayComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.navErrors===0&&c.originalBundleReplay&&!(c.visibleErrorPhrases||[]).length)")

Path('work/archive_selected_final.mjs').write_text(src,encoding='utf-8')
print('wrote work/archive_selected_final.mjs')
