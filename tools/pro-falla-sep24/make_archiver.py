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
src = src.replace('ProFallaArchive/4.0', 'ProFallaSep24Archive/1.0', 1)

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

# Avoid carrying a previous batch's manually enumerated static URLs into this batch.
start = src.find('async function prefetchKnownStatic(){')
if start != -1:
    end = src.find('\nasync function captureOffline', start)
    if end == -1:
        raise SystemExit('prefetchKnownStatic end not found')
    src = src[:start] + src[end+1:]
    src = src.replace('const closureAdded=await staticClosure();const knownStaticAdded=await prefetchKnownStatic();', 'const closureAdded=await staticClosure();const knownStaticAdded=0;', 1)

out = Path('tools/pro-falla-sep24/archive_sep24.mjs')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
