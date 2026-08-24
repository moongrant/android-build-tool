#!/usr/bin/env python3
from pathlib import Path
import re

src_path = Path('tools/pro-falla-batch4/archive_selected.mjs')
src = src_path.read_text(encoding='utf-8')

src = re.sub(
    r"const OUT = path\.resolve\(process\.env\.OUT_DIR \|\| '[^']+'\);",
    "const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-sep24-original-spa');",
    src,
    count=1,
)
src = src.replace('ProFallaArchive/4.0', 'ProFallaSep24Archive/1.1', 1)

campaigns = r'''const campaigns = [
  {
    id:'country-election-2024', title:'Falla Saudi Arabia Super Admin Election 2024', level:'L4+',
    units:[{
      label:'Country Election', project:'act-country-elect', activityId:670, translateId:750,
      shell:'https://web.fallaweb.com/main/index.html',
      routes:['/main/sign-up','/main/task','/main/rank','/main/record','/main/vote-record','/rule-reward']
    }]
  },
  {
    id:'election-template-sep-2025', title:'Falla Election Template · September 2025', level:'L4+',
    units:[{
      label:'Election Template', project:'act-elect-template', activityId:1273, translateId:996,
      shell:'https://web.fallaweb.com/main/index.html',
      routes:['/main/sign-up','/main/task','/main/rank','/main/record','/main/vote-record','/rule-reward']
    }]
  },
  {
    id:'travel-with-you-2023', title:'Falla Travel with You 2023', level:'L4+',
    units:[{
      label:'Travel with You', project:'act-travel-2310', activityId:331, translateId:469,
      shell:'https://web-test.falla.live/falla-web/micro-main/index.html',
      routes:['/main/task','/main/rank','/main/reward','/main/task-score','/main/task-send','/main/task-recharge','/main/task-charm','/main/rank-room','/main/rank-user-send','/main/rank-user-recharge','/main/rank-user-charm','/rule-reward']
    }]
  },
  {
    id:'family-honor-pk-2024', title:'Falla Family Honor PK 2024', level:'L4+',
    units:[{
      label:'Family Honor PK', project:'act-family-pk-2409', activityId:637, translateId:718,
      shell:'https://web.fallaweb.com/main/index.html',
      routes:['/main/rank/family','/main/rank/supporter','/main/task','/lottery','/main/reward','/main/rank','/rule-reward']
    }]
  },
  {
    id:'ocean-adventure-2025', title:'Falla Ocean Adventure 2025', level:'L4+',
    units:[{
      label:'Ocean Adventure', project:'act-sea-adventures-25', activityId:1137, translateId:939,
      shell:'https://web.fallaweb.com/main/index.html',
      routes:['/main/lottery','/main/task','/main/rank','/main/reward','/main/task-score','/main/task-send','/main/task-recharge','/main/task-charm','/main/rank-room','/main/rank-user-send','/main/rank-user-recharge','/main/rank-user-charm','/rule-reward']
    }]
  }
];'''

src, n = re.subn(
    r"const campaigns = \[.*?\n\];\n\nconst sha",
    campaigns + "\n\nconst sha",
    src,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'campaign block replacement failed: {n}')

src, n = re.subn(
    r"function buildUrl\(unit,route\)\{.*?\n\}",
    """function buildUrl(unit,route){\n  let p=route||'/'; if(!p.startsWith('/'))p='/'+p;\n  const shell=unit.shell||SHELL;\n  return `${shell}#/${unit.project}${p==='/'?'':p}?activityId=${unit.activityId}&translateId=${unit.translateId}`;\n}""",
    src,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'buildUrl replacement failed: {n}')

needle = """  if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
custom = """  if(p.includes('/act/manager/vote/init')){res={isRegister:false,hasRegister:false,registerStatus:0,voteCount:0,taskScore:0,candidateList:[],rankList:[],records:[],userInfo:{uid:0,nickName:'',avatar:'',isLogin:false},config:{}};kind='election-init';}\n  else if(p.includes('/act/manager/vote/rank')||p.includes('/act/manager/vote/search')||p.includes('/act/manager/vote/record')){res=[];kind='empty-election-list';}\n  else if(p.includes('/act/manager/vote/register')||p.endsWith('/act/manager/vote')){res={success:true,voteCount:0,score:0};kind='zero-election-action';}\n  else if(p.includes('/act/cp/travel/user/info')){res={hasCp:false,cpInfo:null,userInfo:{uid:0,nickName:'',avatar:'',isLogin:false},clockList:[],attractionList:[],rewardList:[],score:0,progress:0};kind='empty-cp-travel-user';}\n  else if(p.includes('/act/cp/travel/clockinfo')){res={clockList:[],attractionList:[],countryList:[],rewardList:[],progress:0,total:0};kind='empty-cp-travel-clock';}\n  else if(p.includes('/act/cp/travel/rank')){res=[];kind='empty-cp-travel-rank';}\n  else if(p.includes('/act/winterfestival/familypk/v3/userinfo')){res={familyId:0,familyName:'',familyAvatar:'',score:0,rank:0,records:[],members:[]};kind='empty-family-pk-user';}\n  else if(p.includes('/act/winterfestival/familypk/v3/rank')||p.includes('/act/winterfestival/familypk/v3/records')){res=[];kind='empty-family-pk-list';}\n  else if(p.includes('/act/2024/drawpattern/seaadventure2025/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[]};kind='zero-ocean-adventure-process';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, custom, 1)

old_bad = """async function badJsonRecord(rec){
  if(!rec||!/json/i.test(rec.contentType||''))return false;
  try{const obj=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));return obj&&typeof obj==='object'&&'code'in obj&&Number(obj.code)!==0;}catch{return false;}
}
"""
new_bad = """async function badJsonRecord(rec){
  if(!rec)return false;
  if(Number(rec.status||200)>=400)return true;
  if(!/json/i.test(rec.contentType||''))return false;
  try{const obj=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));return obj&&typeof obj==='object'&&'code'in obj&&Number(obj.code)!==0;}catch{return false;}
}
"""
if old_bad not in src:
    raise SystemExit('badJsonRecord block not found')
src = src.replace(old_bad, new_bad, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function savePrefetchedRecord({method='GET',url,sourceUrl=url,body,status=200,statusText='OK',headers={},postData='',pageId='prefetch'}){
  const bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;
  try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
  const rec={key:requestKey(method,url,postData),method,url,sourceUrl,postDataHash:sha(postData),status,statusText,headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:[pageId]};
  records.set(rec.key,rec);byUrl.set(urlKey(method,url),rec);byPath.set(pathKey(method,url),rec);return rec;
}
async function prefetchActivityConfigs(){
  const endpoints=['https://api.apifalla.com/api/web/activities_config/act','https://apihk.falla.live/api/web/activities_config/act'];
  const units=campaigns.flatMap(c=>c.units);let added=0;
  for(const unit of units){
    let original=null,sourceUrl=null,headers=null,status=0;
    const payloads=[{activitiesId:unit.activityId},{activityId:unit.activityId},{id:unit.activityId}];
    for(const endpoint of endpoints){
      for(const payload of payloads){
        try{const r=await fetch(endpoint,{method:'POST',headers:{'user-agent':UA,'accept':'application/json,text/plain,*/*','content-type':'application/json;charset=UTF-8','origin':'https://web.fallaweb.com','referer':'https://web.fallaweb.com/'},body:JSON.stringify(payload),redirect:'follow',signal:AbortSignal.timeout(25000)});const b=Buffer.from(await r.arrayBuffer());let ok=false;try{const o=JSON.parse(b.toString('utf8'));ok=r.ok&&Number(o?.code)===0&&o?.res;}catch{}if(ok){original=b;sourceUrl=endpoint;headers=Object.fromEntries(r.headers.entries());status=r.status;break;}}catch{}
      }
      if(original)break;
    }
    if(!original)continue;
    for(const endpoint of endpoints){
      for(const payload of payloads){await savePrefetchedRecord({method:'POST',url:endpoint,sourceUrl,body:original,status:status||200,headers:headers||{'content-type':'application/json; charset=utf-8'},postData:JSON.stringify(payload),pageId:`activity-config-${unit.activityId}`});added++;}
    }
  }
  return added;
}
async function prefetchSep24Static(){
  const urls=['https://web.fallaweb.com/falla-web/act-country-elect/prod/0.1.0/assets/8048095648185daae6b5.png'];let added=0;
  for(const url of urls){if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;try{const r=await fetch(url,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8'},redirect:'follow',signal:AbortSignal.timeout(25000)});if(!r.ok)continue;const body=Buffer.from(await r.arrayBuffer());await savePrefetchedRecord({url,sourceUrl:String(r.url),body,status:r.status,statusText:r.statusText,headers:Object.fromEntries(r.headers.entries()),pageId:'sep24-static-closure'});added++;}catch{}}
  return added;
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old_call = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);"
new_call = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const knownStaticAdded=await prefetchSep24Static();console.log(`OFFLINE ${online.length}`);"
if old_call not in src:
    raise SystemExit('main execution block not found')
src = src.replace(old_call, new_call, 1)

old_manifest = "staticClosureAdded:closureAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,knownStaticAdded,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest field insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

out = Path('tools/pro-falla-sep24/archive_sep24.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
