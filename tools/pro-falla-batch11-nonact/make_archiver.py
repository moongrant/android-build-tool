#!/usr/bin/env python3
from pathlib import Path
import re

src = Path('tools/pro-falla-batch4/archive_selected.mjs').read_text(encoding='utf-8')
src = re.sub(
    r"const OUT = path\.resolve\(process\.env\.OUT_DIR \|\| '[^']+'\);",
    "const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-batch11-nonact-original-spa');",
    src,
    count=1,
)
src = src.replace('ProFallaArchive/4.0', 'ProFallaArchive/11.NonAct', 1)

campaigns = r'''const campaigns = [
  {
    id:'star-pass-2024', title:'Falla Star Pass 2024', level:'L4+',
    units:[{
      label:'Star Pass', project:'star-pass', activityId:520, translateId:115,
      seedBase:'https://web-test.falla.live/activity-web/app-task-center/index.html',
      routes:['/star-pass']
    }]
  },
  {
    id:'activity-center-2023', title:'Falla Activity Center 2023', level:'L3+', conditional:true,
    units:[{
      label:'Activity Center', project:'app-activity-center', activityId:384, translateId:513,
      seedBase:'https://web-test.falla.live/falla-web/micro-main/index.html',
      routes:['/app-activity-center']
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
    raise SystemExit(f'campaign replacement failed: {n}')

src, n = re.subn(
    r"function buildUrl\(unit,route\)\{.*?\n\}",
    """function buildUrl(unit,route){
  let p=route||'/'; if(!p.startsWith('/'))p='/'+p;
  const base=unit.seedBase||SHELL;
  return `${base}#${p}?activityId=${unit.activityId}&translateId=${unit.translateId}`;
}""",
    src,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'buildUrl replacement failed: {n}')

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
custom = """  if(p.includes('starpass')||p.includes('star-pass')){res={season:0,level:0,score:0,progress:0,taskList:[],levelList:[],rewardList:[],receivedList:[],records:[],isLogin:false};kind='empty-star-pass';}\n  else if(p.includes('taskcenter')||p.includes('task-center')){res={dailyTaskList:[],weeklyTaskList:[],taskList:[],rewardList:[],progress:0,score:0,isLogin:false};kind='empty-task-center';}\n  else if(p.includes('activitycenter')||p.includes('activity-center')){res={bannerList:[],activityList:[],records:[],isLogin:false};kind='empty-activity-center';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
if needle not in src:
    raise SystemExit('fixture insertion point not found')
src = src.replace(needle, custom, 1)
src = src.replace("const fx=fixtureFor(method,url);", "const fx=fixtureFor(method,url,online.campaignId);", 1)

out = Path('tools/pro-falla-batch11-nonact/archive_nonact.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
