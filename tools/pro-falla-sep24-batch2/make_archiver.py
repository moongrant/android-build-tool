#!/usr/bin/env python3
from pathlib import Path
import re

src_path = Path('tools/pro-falla-batch4/archive_selected.mjs')
src = src_path.read_text(encoding='utf-8')

src = re.sub(
    r"const OUT = path\.resolve\(process\.env\.OUT_DIR \|\| '[^']+'\);",
    "const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-sep24-batch2-original-spa');",
    src,
    count=1,
)
src = src.replace('ProFallaArchive/4.0', 'ProFallaSep24LowChange/1.0', 1)

campaigns = r'''const campaigns = [
  {
    id:'bring-back-friends-2025', title:'Falla Bring Back Friends 2025', level:'L4',
    units:[{
      label:'Bring Back Friends', project:'act-recall-friend', activityId:1202, translateId:966,
      shell:'https://web.fallaweb.com/main/index.html',
      routes:['/main/task/recall','/main/task/team','/main/rank','/rank-reward','/rule-desc','/rule-reward']
    }]
  },
  {
    id:'age-of-navigation-2022', title:'Falla Age of Navigation 2022', level:'L4',
    units:[{
      label:'Age of Navigation', project:'act-age-of-navigation', activityId:131, translateId:255,
      shell:'https://web-test.falla.live/falla-web/micro-main/index.html',
      routes:['/task','/map','/reward','/rule']
    }]
  },
  {
    id:'onam-boat-race-2022', title:'Falla Onam Boat Race 2022', level:'L4',
    units:[{
      label:'Onam Boat Race', project:'act-onam-day', activityId:112, translateId:232,
      shell:'https://web-test.falla.live/falla-web/micro-main/index.html',
      routes:['/task','/rank','/reward','/1','/2']
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
custom = """  if(p.includes('/act/2025/olduserrecall/actinfo')){res={userInfo:{uid:0,nickName:'',avatar:'',isLogin:false},recommendList:[],recalledList:[],taskList:[],rewardList:[],score:0,rank:0,hasBound:false,inviterId:0};kind='empty-recall-overview';}\n  else if(p.includes('/act/2025/olduserrecall/myrecall/list')||p.includes('/act/2025/olduserrecall/recall/list')){res=[];kind='empty-recall-list';}\n  else if(p.includes('/act/2025/olduserrecall/recall/rank')){res=[];kind='empty-recall-rank';}\n  else if(p.includes('/act/2025/olduserrecall/recall/bindfriend')){res={success:true,bound:false};kind='recall-bind-state';}\n  else if(p.includes('/act/2025/olduserrecall/recall/recieveprize')){res={success:true,received:false};kind='recall-prize-state';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
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

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old_call = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);"
new_call = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
if old_call not in src:
    raise SystemExit('main execution block not found')
src = src.replace(old_call, new_call, 1)

old_manifest = "staticClosureAdded:closureAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest field insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

out = Path('tools/pro-falla-sep24-batch2/archive_sep24_batch2.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
