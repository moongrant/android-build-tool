#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch9-wave4-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/9.4')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch9-wave4/archive_wave4.mjs')

campaign_block = """const campaigns = [
  {
    id:'food-tour-2024', title:'Falla Food Tour 2024', level:'L4',
    units:[{label:'Food Tour',project:'act-food-tour',activityId:584,translateId:682,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'oil-tycoon-2024', title:'Falla Oil Tycoon 2024', level:'L4',
    units:[{label:'Oil Tycoon',project:'act-oil-tycoon',activityId:548,translateId:635,shell:'https://web-test.falla.live/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'space-ship-adventure-2024', title:'Falla Space Ship Adventure 2024', level:'L4',
    units:[{label:'Space Ship Adventure',project:'act-space-ship',activityId:704,translateId:766,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'spaceship-adventure-2025', title:'Falla Spaceship Adventure 2025', level:'L4', conditional:true,
    units:[{label:'Spaceship Adventure',project:'act-spaceship',activityId:1400,translateId:1069,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'masked-party-2026', title:'Falla Masked Party 2026', level:'L4',
    units:[{label:'Masked Party',project:'act-masked-party',activityId:1577,translateId:1152,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'carnival-2025', title:'Falla Carnival 2025', level:'L4',
    units:[{label:'Carnival',project:'act-carnival-2025',activityId:866,translateId:835,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/rank','/rule-reward']}]
  },
  {
    id:'winter-battle-2023', title:'Falla Winter Battle 2023', level:'L4',
    units:[{label:'Winter Battle',project:'act-winter-battle',activityId:186,translateId:304,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task','/rank','/room','/user','/rule-reward']}]
  },
  {
    id:'halloween-2023', title:'Falla Halloween 2023', level:'L4',
    units:[{label:'Halloween',project:'act-halloween-23',activityId:346,translateId:480,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task-send','/pk','/rank','/reward']}]
  }
];"""

base, n = re.subn(
    r"campaigns = r'''const campaigns = \[.*?\n\];'''",
    lambda _m: 'campaigns = ' + repr(campaign_block),
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/julymonth/userprocess')){res={process:0,current:0,foodList:[],taskList:[],rankList:[],rewardList:[],records:[],score:0};kind='empty-food-tour-process';}\n  else if(p.includes('/act/2024/airshipact/carouselinfo')){res={list:[],carouselList:[],shipList:[],records:[],progress:0,score:0};kind='empty-space-ship-carousel';}\n  else if(p.includes('/act/2025/spaceshipadventure/carouselinfo')){res={list:[],carouselList:[],shipList:[],records:[],progress:0,score:0};kind='empty-spaceship-carousel';}\n  else if(p.includes('/act/exchangemall/infos')){res={list:[],goodsList:[],records:[],balance:0,coin:0};kind='empty-exchange-mall';}\n  else if(p.includes('/act/exchangemall/records')){res=[];kind='empty-exchange-records';}\n  else if(p.includes('/act/exchangemall/exchange')){res={success:true,received:false,balance:0};kind='zero-exchange-action';}\n  else if(p.includes('/act/carnival/v2/grouprankandsupport')){res={groupList:[],rankList:[],supportList:[],records:[],score:0};kind='empty-carnival-groups';}\n  else if(p.includes('/act/carnival/v2/taskinfo')){res={taskList:[],rewardList:[],progress:0,score:0};kind='empty-carnival-task';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""

base, n = re.subn(
    r'custom = """.*?"""\nif needle not in src:',
    lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:',
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch9-wave4/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
