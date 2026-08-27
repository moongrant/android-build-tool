#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch12-wave3-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/12.3')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch12-wave3/archive_wave3.mjs')

campaign_block = """const campaigns = [
  {
    id:'ramadan-campaign-2023', title:'Falla Ramadan Campaign 2023', level:'L5',
    units:[
      {label:'Ramadan Opening',project:'act-ramadan-23',activityId:211,translateId:331,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan Competition',project:'act-ramadan-competition-23',activityId:214,translateId:334,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/pk','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan Happy',project:'act-ramadan-happy-23',activityId:224,translateId:346,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}
    ]
  },
  {
    id:'ramadan-campaign-2024', title:'Falla Ramadan Campaign 2024', level:'L5',
    units:[
      {label:'Ramadan Main',project:'act-ramadan-main',activityId:464,translateId:567,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/']},
      {label:'Ramadan Rich PK',project:'act-ramadan-rich-pk',activityId:468,translateId:577,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan Ring',project:'act-ramadan-ring',activityId:476,translateId:584,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan Blind Box',project:'act-ramadan-blind-box',activityId:477,translateId:585,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/blind-box','/main/task','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan Lucky Hunt',project:'act-ramadan-lucky-hunt',activityId:489,translateId:590,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']},
      {label:'Ramadan CP',project:'act-ramadan-cp',activityId:496,translateId:596,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/daily','/main/task','/main/rank','/main/reward','/rule-reward']},
      {label:'Eid al-Fitr Finale',project:'act-ramadan-eid-al-fitr',activityId:508,translateId:599,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}
    ]
  }
];"""
base, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", lambda _m: 'campaigns = ' + repr(campaign_block), base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/ramadan/23')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],drawCount:0,itemList:[]};kind='empty-ramadan-2023';}\n  else if(p.includes('/act/ramadan/competition')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],teamList:[],score:0};kind='empty-ramadan-competition';}\n  else if(p.includes('/act/ramadan/happy')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],drawCount:0,itemList:[]};kind='empty-ramadan-happy';}\n  else if(p.includes('/act/ramadan/main')){res={stageList:[],activityList:[],records:[],currentStage:0,isLogin:false};kind='empty-ramadan-main';}\n  else if(p.includes('/act/ramadan/rich')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],drawCount:0};kind='empty-ramadan-rich-pk';}\n  else if(p.includes('/act/ramadan/ring')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],ringList:[],drawCount:0};kind='empty-ramadan-ring';}\n  else if(p.includes('/ramadan/blindbox/actinfo')){res={boxList:[],taskList:[],rankList:[],rewardList:[],records:[],couponCount:0,drawCount:0,progress:0,score:0};kind='empty-ramadan-blind-box';}\n  else if(p.includes('/act/ramadan/luckyhunt')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],chestList:[],drawCount:0};kind='empty-ramadan-lucky-hunt';}\n  else if(p.includes('/act/lover/')||p.includes('/act/ramadan/cp')){res={cpInfo:null,process:0,taskList:[],rankList:[],rewardList:[],records:[],isLogin:false};kind='empty-ramadan-cp';}\n  else if(p.includes('/act/ramadan/eid')||p.includes('/act/eid/fitr')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[]};kind='empty-eid-finale';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
base, n = re.subn(r'custom = """.*?"""\nif needle not in src:', lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:', base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch12-wave3/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
