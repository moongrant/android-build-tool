#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')

base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch10-wave2-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/10.2')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch10-wave2/archive_wave2.mjs')

campaign_block = """const campaigns = [
  {
    id:'newcomer-package-2024', title:'Falla Newcomer Package 2024', level:'L4+',
    units:[{label:'Newcomer Package',project:'act-newcomer-package',activityId:514,translateId:608,shell:'https://web.fallaweb.com/main/index.html',routes:['/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'endless-gift-2025', title:'Falla Endless Surprise Package 2025', level:'L4',
    units:[{label:'Endless Surprise Package',project:'act-endless-gift',activityId:1151,translateId:944,shell:'https://web.fallaweb.com/main/index.html',routes:['/']}]
  },
  {
    id:'accumulated-achievements-2025', title:'Falla Accumulated Achievements 2025', level:'L4',
    units:[{label:'Accumulated Achievements',project:'act-accumulated-achievements',activityId:1094,translateId:924,shell:'https://web.fallaweb.com/main/index.html',routes:['/']}]
  },
  {
    id:'diamond-exchange-2023', title:'Falla Diamond Exchange 2023', level:'L3+', conditional:true,
    units:[{label:'Diamond Exchange',project:'act-diamond-exchange',activityId:200,translateId:321,shell:'https://web.fallaweb.com/main/index.html',routes:['/main','/rule-reward']}]
  },
  {
    id:'old-friend-gift-2024', title:'Falla Old Friend Gift 2024', level:'L3+', conditional:true,
    units:[{label:'Old Friend Gift',project:'act-old-friend-gift',activityId:791,translateId:801,shell:'https://web.fallaweb.com/main/index.html',routes:['/']}]
  },
  {
    id:'game-competition-2025', title:'Falla Game Competition 2025', level:'L4+',
    units:[{label:'Game Competition',project:'act-game-competition-2509',activityId:1369,translateId:1039,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/challenge','/main/dailyTask','/main/rank','/main/task','/rule-reward']}]
  },
  {
    id:'national-day-2026', title:'Falla National Day Campaign 2026', level:'L4',
    units:[{label:'National Day Campaign',project:'act-national-day-v3',activityId:1557,translateId:1170,shell:'https://web.fallaweb.com/main/index.html',routes:['/main','/task','/rank','/user','/room','/rule-reward']}]
  },
  {
    id:'cinderella-and-prince-2022', title:'Falla Cinderella and Prince 2022', level:'L3+', conditional:true,
    units:[{label:'Cinderella and Prince',project:'act-cinderella-and-prince',activityId:134,translateId:202,shell:'https://web.fallaweb.com/main/index.html',routes:['/','/reward']}]
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

custom_block = """  if(p.includes('/act/popularking/state')){res={state:0,progress:0,taskList:[],rankList:[],rewardList:[],records:[],ticketCount:0};kind='empty-newcomer-package';}\n  else if(p.includes('/act/popularking/receive')){res={success:true,received:false};kind='zero-newcomer-receive';}\n  else if(p.includes('/act/2025/endlesssuprisepackage/actinfo')){res={giftList:[],starPrizeList:[],receivedList:[],availableList:[],starCount:0,progress:0};kind='empty-endless-package';}\n  else if(p.includes('/act/2025/endlesssuprisepackage/receive')){res={success:true,received:false,starCount:0};kind='zero-endless-receive';}\n  else if(p.includes('/act/2025/grandrecharge/actinfo')){res={levelList:[],receivedList:[],currentScore:0,currentLevel:0,progress:0};kind='empty-accumulated-achievements';}\n  else if(p.includes('/act/2025/grandrecharge/award')){res={success:true,received:false};kind='zero-achievement-award';}\n  else if(p.includes('/act/feed/back/v3/info')){res={eligible:false,currentScore:0,levelList:[],receivedList:[],rewardList:[]};kind='empty-old-friend-gift';}\n  else if(p.includes('/act/feed/back/v3/receive')){res={success:true,received:false};kind='zero-old-friend-receive';}\n  else if(p.includes('/act/2025/v2/sixyeargamechallenge/actinfo')){res={challengeList:[],dailyTaskList:[],rankList:[],rewardList:[],records:[],score:0,progress:0};kind='empty-game-competition';}\n  else if(p.includes('/act/2025/v2/sixyeargamechallenge/tasklist')||p.includes('/act/2025/v2/sixyeargamechallenge/ranklist')||p.includes('/act/2025/v2/sixyeargamechallenge/guinnessrecords')){res=[];kind='empty-game-competition-list';}\n  else if(p.includes('/act/2025/v2/sixyeargamechallenge/receivetask')||p.includes('/act/2025/v2/sixyeargamechallenge/drawtask')){res={success:true,received:false};kind='zero-game-competition-action';}\n  else if(p.includes('/act/diamondexchange/exchange')){res={success:true,received:false,balance:0};kind='zero-diamond-exchange';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""

base, n = re.subn(
    r'custom = """.*?"""\nif needle not in src:',
    lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:',
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch10-wave2/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
