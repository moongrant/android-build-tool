#!/usr/bin/env python3
from pathlib import Path
import re

src_path = Path('tools/pro-falla-batch4/archive_selected.mjs')
src = src_path.read_text(encoding='utf-8')

src = re.sub(
    r"const OUT = path\.resolve\(process\.env\.OUT_DIR \|\| '[^']+'\);",
    "const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-batch8-original-spa');",
    src,
    count=1,
)
src = src.replace('ProFallaArchive/4.0', 'ProFallaArchive/8.0', 1)

campaigns = r'''const campaigns = [
  {
    id:'qatar-world-cup-2022', title:'Falla Qatar World Cup Campaign 2022', level:'L5',
    units:[
      {label:'World Cup Warm-up',project:'act-qatar-world-cup',activityId:144,translateId:264,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task','/rank']},
      {label:'World Cup Group Stage',project:'act-world-cup-group-stage',activityId:160,translateId:276,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/quiz','/rank','/reward']},
      {label:'World Cup Semifinal',project:'act-world-cup-semifinal',activityId:157,translateId:282,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/1','/2']},
      {label:'World Cup Finals',project:'act-world-cup-finals',activityId:161,translateId:287,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/rank','/reward']}
    ]
  },
  {
    id:'magic-awake-2025', title:'Falla Magic Awake 2025', level:'L4+',
    units:[{label:'Magic Awake',project:'act-magic-awake-25',activityId:1075,translateId:916,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'undersea-treasure-2025', title:'Falla Undersea Treasure 2025', level:'L4',
    units:[{label:'Undersea Treasure',project:'act-undersea-treasure',activityId:845,translateId:820,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'new-king-competition-2025', title:'Falla New King Competition 2025', level:'L4',
    units:[{label:'New King Competition',project:'act-new-king-competition',activityId:1388,translateId:1052,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/rule-reward']}]
  },
  {
    id:'welcome-spring-festival-2023', title:'Falla Welcome Spring Festival 2023', level:'L4',
    units:[{label:'Welcome Spring Festival',project:'act-welcome-spring-festival',activityId:207,translateId:326,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/rule-reward']}]
  },
  {
    id:'aladdin-magic-lamp-2023', title:'Falla Aladdin Magic Lamp 2023', level:'L4',
    units:[{label:'Aladdin Magic Lamp',project:'act-aladdin-magic-lamp',activityId:180,translateId:301,shell:'https://web.fallaweb.com/main/index.html',routes:['/main','/task','/rank','/rule-reward']}]
  },
  {
    id:'hot-air-balloon-2023', title:'Falla Hot Air Balloon 2023', level:'L4',
    units:[{label:'Hot Air Balloon',project:'act-hot-air-balloon',activityId:191,translateId:309,shell:'https://web.fallaweb.com/main/index.html',routes:['/main','/task','/rank','/rule-reward']}]
  },
  {
    id:'medal-collection-2025', title:'Falla Medal Collection 2025', level:'L4',
    units:[{label:'Medal Collection',project:'act-medal-collect',activityId:1190,translateId:959,shell:'https://web.fallaweb.com/main/index.html',routes:['/main','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'christmas-new-year-2024', title:'Falla Christmas & New Year 2024', level:'L4+', conditional:true,
    units:[{label:'Christmas & New Year',project:'act-christmas-new-year-24',activityId:815,translateId:810,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/lottery','/main/pk','/main/rank','/main/reward','/rule-reward']}]
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

old_maps = "const records=new Map(),byUrl=new Map(),byPath=new Map(),captureErrors=[];"
new_maps = "const records=new Map(),byUrl=new Map(),byPath=new Map(),activityConfigById=new Map(),captureErrors=[];"
if old_maps not in src:
    raise SystemExit('records map declaration not found')
src = src.replace(old_maps, new_maps, 1)

pattern = r"function recordFor\(method,url,post=''\)\{.*?\n\}"
replacement = """function recordFor(method,url,post=''){
  if(method==='POST'&&/\/activities_config\/act$/i.test(url)){
    try{const body=JSON.parse(post||'{}');const id=Number(body.activitiesId??body.activityId??body.id??0);const cfg=activityConfigById.get(id);if(cfg)return cfg;}catch{}
  }
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlKey(method,url))||byPath.get(pathKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlKey(method,noQuery))||byPath.get(pathKey(method,noQuery));}catch{}}
  return rec;
}"""
src, n = re.subn(pattern, replacement, src, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'recordFor replacement failed: {n}')

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

src = src.replace("function fixtureFor(method,url){", "function fixtureFor(method,url,campaignId=''){", 1)

needle = """  if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
custom = """  if(p.includes('/act/2024/drawpattern/magicv2/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],exchangeList:[]};kind='zero-magic-awake-process';}\n  else if(p.includes('/act/exchangemall/infos')){res={list:[],goodsList:[],records:[],balance:0,coin:0};kind='empty-exchange-mall';}\n  else if(p.includes('/act/exchangemall/records')){res=[];kind='empty-exchange-records';}\n  else if(p.includes('/act/exchangemall/exchange')){res={success:true,received:false,balance:0};kind='zero-exchange-action';}\n  else if(p.includes('/act/2025/kingcompetition/ranklist')){res=[];kind='empty-king-competition-rank';}\n  else if(p.includes('/act/springfestival/poolbalance')){res={poolBalance:0,balance:0,groupList:[],rankList:[],records:[]};kind='zero-spring-pool';}\n  else if(p.includes('/act/2025/medalcollect/actinfo')){res={medalList:[],taskList:[],rewardList:[],records:[],collectedCount:0,progress:0,score:0};kind='empty-medal-collection';}\n  else if(p.includes('/act/newyear/v2/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[]};kind='zero-new-year-process';}\n  else if(p.includes('/act/newyear/v2/rank')){res=[];kind='empty-new-year-rank';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, custom, 1)

old_call = "const fx=fixtureFor(method,url);"
new_call = "const fx=fixtureFor(method,url,online.campaignId);"
if old_call not in src:
    raise SystemExit('fixtureFor call not found')
src = src.replace(old_call, new_call, 1)

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
    let preferredRec=null;
    for(const endpoint of endpoints){
      for(const payload of payloads){const rec=await savePrefetchedRecord({method:'POST',url:endpoint,sourceUrl,body:original,status:status||200,headers:headers||{'content-type':'application/json; charset=utf-8'},postData:JSON.stringify(payload),pageId:`activity-config-${unit.activityId}`});if(!preferredRec)preferredRec=rec;added++;}
    }
    if(preferredRec)activityConfigById.set(Number(unit.activityId),preferredRec);
  }
  return added;
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old_call_main = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);"
new_call_main = "const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
if old_call_main not in src:
    raise SystemExit('main execution block not found')
src = src.replace(old_call_main, new_call_main, 1)

old_manifest = "staticClosureAdded:closureAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest field insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

out = Path('tools/pro-falla-batch8/archive_batch8.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
