#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')

base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch10-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/10.0')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch10/archive_batch10.mjs')

campaign_block = """const campaigns = [
  {
    id:'eid-al-adha-2024', title:'Falla Eid al-Adha Challenge 2024', level:'L4+',
    units:[{label:'Eid al-Adha Challenge',project:'act-eid-al-adha',activityId:557,translateId:654,shell:'https://web-test.falla.live/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'qurban-2026', title:'Falla Qurban Campaign 2026', level:'L4+',
    units:[{label:'Qurban Campaign',project:'act-qurban-26',activityId:1547,translateId:1165,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'ramadan-blind-box-match-2023', title:'Falla Ramadan Blind Box Match 2023', level:'L4',
    units:[{label:'Ramadan Blind Box Match',project:'act-ramadan-blind-box',activityId:477,translateId:585,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/blind-box','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'scratch-off-challenge-2025', title:'Falla Scratch-Off Challenge 2025', level:'L4+',
    units:[{label:'Scratch-Off Challenge',project:'act-scratch-off-25',activityId:1340,translateId:1030,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/blind-box','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'fruit-party-2024', title:'Falla Fruit Party 2024', level:'L4',
    units:[{label:'Fruit Party',project:'act-fruit-party',activityId:594,translateId:692,shell:'https://web-test.falla.live/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'game-tournament-2024', title:'Falla Game Tournament 2024', level:'L4',
    units:[{label:'Game Tournament',project:'act-game-tournament',activityId:426,translateId:547,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/','/rank','/reward']}]
  },
  {
    id:'arabian-nights-2023', title:'Falla Arabian Nights 2023', level:'L4', conditional:true,
    units:[{label:'Arabian Nights',project:'act-arabian-nights',activityId:257,translateId:391,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'sahara-journey-2022', title:'Falla Sahara Journey 2022', level:'L4', conditional:true,
    units:[{label:'Sahara Journey',project:'act-sahara',activityId:113,translateId:234,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/','/1','/2','/reward']}]
  },
  {
    id:'gulf-nations-cup-2022', title:'Falla Gulf Nations Cup 2022', level:'L4',
    units:[{label:'Gulf Nations Cup',project:'act-gulf-nations-cup',activityId:190,translateId:308,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main','/task','/rank','/rule-reward']}]
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

custom_block = """  if(p.includes('/act/ramadan/luckyact/v2/userprocess')){res={process:0,current:0,stage:0,drawCount:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],packList:[]};kind='empty-eid-stage-process';}\n  else if(p.includes('/act/ramadan/luckyact/v2/dayrank')){res=[];kind='empty-eid-day-rank';}\n  else if(p.includes('/act/ramadan/luckyact/v2/receive')){res={success:true,received:false};kind='zero-eid-receive';}\n  else if(p.includes('/act/actgamerace/v2/infos')){res={gameList:[],awardList:[],rankList:[],taskList:[],userScore:0,progress:0,records:[]};kind='empty-fruit-party-race';}\n  else if(p.includes('/act/actgamerace/v2/ranklist')){res=[];kind='empty-fruit-party-rank';}\n  else if(p.includes('/act/actgamerace/infos')){res={gameList:[],awardList:[],rankList:[],taskList:[],userScore:0,progress:0,records:[]};kind='empty-game-tournament';}\n  else if(p.includes('/act/actgamerace/ranklist')){res=[];kind='empty-game-tournament-rank';}\n  else if(p.includes('/act/baywordcup/rank')){res=[];kind='empty-gulf-cup-rank';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""

base, n = re.subn(
    r'custom = """.*?"""\nif needle not in src:',
    'custom = ' + repr(custom_block) + '\nif needle not in src:',
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch10/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
