#!/usr/bin/env python3
from pathlib import Path
import re

src_path = Path('tools/pro-falla-batch4/archive_selected.mjs')
src = src_path.read_text(encoding='utf-8')
src = re.sub(
    r"const OUT = path\.resolve\(process\.env\.OUT_DIR \|\| '[^']+'\);",
    "const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-batch11-nonact-original-spa');",
    src,
    count=1,
)
src = src.replace('ProFallaArchive/4.0', 'ProFallaArchive/11.nonact', 1)

campaigns = r'''const campaigns = [
  {
    id:'star-pass-2024', title:'Falla Star Pass 2024', level:'L4+',
    units:[{
      label:'Star Pass', project:'star-pass', activityId:520, translateId:115,
      shell:'https://web-test.falla.live/activity-web/app-task-center/index.html', queryBeforeHash:true,
      routes:['/star-pass']
    }]
  },
  {
    id:'app-activity-center-2023', title:'Falla App Activity Center 2023', level:'L3', conditional:true,
    units:[{
      label:'App Activity Center', project:'app-activity-center', activityId:384, translateId:513,
      shell:'https://web-test.falla.live/falla-web/micro-main/index.html', queryBeforeHash:true,
      routes:['/app-activity-center']
    }]
  }
];'''
src, n = re.subn(r"const campaigns = \[.*?\n\];\n\nconst sha", campaigns + "\n\nconst sha", src, count=1, flags=re.S)
if n != 1: raise SystemExit(f'campaign block replacement failed: {n}')

src, n = re.subn(
    r"function buildUrl\(unit,route\)\{.*?\n\}",
    """function buildUrl(unit,route){
  let p=route||'/'; if(!p.startsWith('/'))p='/'+p;
  const shell=unit.shell||SHELL;
  const query=`activityId=${unit.activityId}&translateId=${unit.translateId}`;
  if(unit.queryBeforeHash)return `${shell}?${query}#${p}`;
  return `${shell}#/${unit.project}${p==='/'?'':p}?${query}`;
}""",
    src,
    count=1,
    flags=re.S,
)
if n != 1: raise SystemExit(f'buildUrl replacement failed: {n}')

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
if old_bad not in src: raise SystemExit('badJsonRecord block not found')
src = src.replace(old_bad, new_bad, 1)

needle = """  if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
custom = """  if(p.includes('/act/2024/passport/state')){res={state:0,isUnlock:false,unlocked:false,currentLevel:0,level:0};kind='empty-star-pass-state';}\n  else if(p.includes('/act/2024/passport/userprocess')){res={currentLevel:0,level:0,currentExp:0,exp:0,totalExp:0,receiveList:[],receivedList:[],rewardList:[],records:[]};kind='empty-star-pass-process';}\n  else if(p.includes('/act/2024/passpart/taskinfo')){res={taskList:[],dailyTaskList:[],growthTaskList:[],score:0,exp:0};kind='empty-star-pass-task';}\n  else if(p.includes('/act/2024/passport/upgrageinfo')){res={price:9.9,currentLevel:0,level:0,rewardList:[],normalRewardList:[],seniorRewardList:[]};kind='empty-star-pass-upgrade';}\n  else if(p.includes('/act/2024/passport/records')){res=[];kind='empty-star-pass-records';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
if needle not in src: raise SystemExit('fixture insertion point not found')
src = src.replace(needle, custom, 1)

anchor = "async function captureOffline(browser,online){"
patcher = r'''async function patchStarPassWhitelist(){
  const url='https://web.falla.live/api/config/2/203-prod.json';
  const rec=recordFor('GET',url,'');
  if(!rec)return {patched:false,reason:'config-not-captured'};
  try{
    const original=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));
    const obj={...original,uids:[0,...(Array.isArray(original.uids)?original.uids:[])]};
    const body=Buffer.from(JSON.stringify(obj));const bodyHash=sha(body),objectPath=`objects/${bodyHash}.json`;
    try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
    const patched={...rec,key:requestKey('GET',url,''),url,sourceUrl:url,status:200,statusText:'OK',headers:{...rec.headers,'content-type':'application/json; charset=utf-8','x-pro-falla-local':'star-pass-anonymous-whitelist'},objectPath,bytes:body.length,sha256:bodyHash,contentType:'application/json; charset=utf-8',pageIds:[...(rec.pageIds||[]),'star-pass-whitelist-patch']};
    records.set(patched.key,patched);byUrl.set(urlKey('GET',url),patched);byPath.set(pathKey('GET',url),patched);
    return {patched:true,objectPath};
  }catch(e){return {patched:false,reason:String(e)};}
}

'''
if anchor not in src: raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, patcher + anchor, 1)

old_main = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);"
new_main = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();const starPassWhitelist=await patchStarPassWhitelist();console.log(`OFFLINE ${online.length}`);"
if old_main not in src: raise SystemExit('main execution block not found')
src = src.replace(old_main, new_main, 1)

src = src.replace("pages=unique.filter(p=>(p.offlineMetrics?.scrollHeight||0)>=900&&(p.offlineMetrics?.htmlLength||0)>=5000);", "pages=unique.filter(p=>(p.offlineMetrics?.scrollHeight||0)>=(campaign.id==='star-pass-2024'?800:900)&&(p.offlineMetrics?.htmlLength||0)>=5000);", 1)
src = src.replace("staticClosureAdded:closureAdded,captureErrors:captureErrors.length", "staticClosureAdded:closureAdded,starPassWhitelist,captureErrors:captureErrors.length", 1)

out = Path('tools/pro-falla-batch11-nonact/archive_nonact.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
