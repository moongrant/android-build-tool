#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')

base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch9-wave3-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/9.3')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch9-wave3/archive_wave3.mjs')

campaign_block = """const campaigns = [
  {
    id:'lucky-seven-2024', title:'Falla Lucky Seven 2024', level:'L4',
    units:[{label:'Lucky Seven',project:'act-lucky-seven',activityId:549,translateId:636,shell:'https://web-test.falla.live/main/index.html',routes:['/']}]
  },
  {
    id:'happy-exchange-mall-2024', title:'Falla Happy Exchange Mall 2024', level:'L3+', conditional:true,
    units:[{label:'Happy Exchange Mall',project:'act-happy-exchange-mall',activityId:551,translateId:639,shell:'https://web-test.falla.live/main/index.html',routes:['/']}]
  },
  {
    id:'jungle-hunting-2024', title:'Falla Jungle Hunting 2024', level:'L4',
    units:[{label:'Jungle Hunting',project:'act-jungle-hunting',activityId:568,translateId:664,shell:'https://web-test.falla.live/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'volcano-exploring-2024', title:'Falla Volcano Exploring 2024', level:'L4',
    units:[{label:'Volcano Exploring',project:'act-volcano-exploring',activityId:614,translateId:705,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'desert-treasure-2024', title:'Falla Desert Treasure 2024', level:'L4',
    units:[{label:'Desert Treasure',project:'act-desert-treasure',activityId:516,translateId:611,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'true-love-ring-2023', title:'Falla True Love Ring 2023', level:'L4',
    units:[{label:'True Love Ring',project:'act-ring',activityId:360,translateId:502,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'happy-new-year-2025', title:'Falla Happy New Year 2025', level:'L4',
    units:[{label:'Happy New Year',project:'act-happy-newyear-25',activityId:1434,translateId:1086,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'ramadan-food-market-2026', title:'Falla Ramadan Food Market 2026', level:'L4', conditional:true,
    units:[{label:'Ramadan Food Market',project:'act-ramadan-food',activityId:1471,translateId:1111,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  }
];"""

base, n = re.subn(
    r"campaigns = r'''const campaigns = \[.*?\n\];'''",
    'campaigns = ' + repr(campaign_block),
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/lucky777/task')){res={taskList:[],medalList:[],progress:0,score:0,ticketCount:0};kind='empty-lucky-seven-task';}\n  else if(p.includes('/act/lucky777/rank')||p.includes('/act/lucky777/records')){res=[];kind='empty-lucky-seven-list';}\n  else if(p.includes('/act/exchangemall/infos')){res={list:[],goodsList:[],records:[],balance:0,coin:0};kind='empty-exchange-mall';}\n  else if(p.includes('/act/exchangemall/records')){res=[];kind='empty-exchange-records';}\n  else if(p.includes('/act/exchangemall/exchange')){res={success:true,received:false,balance:0};kind='zero-exchange-action';}\n  else if(p.includes('/act/2024/drawpattern/')&&p.includes('/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],exchangeList:[]};kind='empty-draw-pattern-process';}\n  else if(p.includes('/act/2025/newyear/carouselinfo')){res={list:[],carouselList:[],records:[],progress:0,score:0};kind='empty-new-year-carousel';}\n  else if(p.includes('/act/2024/drawpattern/foodmarket/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],foodList:[],exchangeList:[]};kind='empty-food-market-process';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""

base, n = re.subn(
    r'custom = """.*?"""\nif needle not in src:',
    'custom = ' + repr(custom_block) + '\nif needle not in src:',
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch9-wave3/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
