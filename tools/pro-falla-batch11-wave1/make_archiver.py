#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch11-wave1-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/11.1')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch11-wave1/archive_wave1.mjs')

campaign_block = """const campaigns = [
  {
    id:'slots-pack-2024', title:'Falla Slots Pack 2024', level:'L4',
    units:[{label:'Slots Pack',project:'act-slots-pack',activityId:612,translateId:702,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/task-score','/main/task-recharge','/main/rank','/main/rank-user-recharge','/main/rank-user-send','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'football-game-tr-2025', title:'Falla Turkish Football Game 2025', level:'L4+',
    units:[{label:'Turkish Football Game',project:'act-football-game-tr',activityId:1089,translateId:921,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'family-honor-pk-2025', title:'Falla Family Honor PK 2025', level:'L4+',
    units:[{label:'Family Honor PK',project:'act-family-pk-2502',activityId:874,translateId:836,shell:'https://web.fallaweb.com/main/index.html',routes:['/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'labour-day-2023', title:'Falla Labour Day 2023', level:'L4',
    units:[{label:'Labour Day',project:'act-labour-day',activityId:229,translateId:350,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'elves-journey-2025', title:'Falla Elves Journey 2025', level:'L4',
    units:[{label:'Elves Journey',project:'act-elves-journey-25',activityId:1211,translateId:967,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'ramadan-lucky-challenge-2026', title:'Falla Ramadan Lucky Challenge 2026', level:'L4+',
    units:[{label:'Ramadan Lucky Challenge',project:'act-ramadan-lucky',activityId:1498,translateId:1138,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'christmas-new-year-rank-2023', title:'Falla Christmas & New Year Rank 2023', level:'L4',
    units:[{label:'Christmas & New Year Rank',project:'act-23-christmas-new-year-rank',activityId:173,translateId:295,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main','/task','/rank','/rule-reward']}]
  },
  {
    id:'thanksgiving-day-2022', title:'Falla Thanksgiving Day 2022', level:'L4',
    units:[{label:'Thanksgiving Day',project:'act-thanksgiving-day',activityId:154,translateId:279,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task','/rank','/reward']}]
  },
  {
    id:'world-task-template-2023', title:'Falla World Task Campaign 2023', level:'L4', conditional:true,
    units:[{label:'World Task Campaign',project:'act-task-template-interim',activityId:221,translateId:344,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/world','/main/task','/main/rank','/user','/room','/rule-reward']}]
  },
  {
    id:'afc-cup-2024', title:'Falla AFC Cup 2024', level:'L3+', conditional:true,
    units:[{label:'AFC Cup',project:'act-afc-cup',activityId:447,translateId:560,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/rank','/reward']}]
  }
];"""
base, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", lambda _m: 'campaigns = ' + repr(campaign_block), base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/newslotsv2/infos')){res={currentLevel:0,process:0,slotList:[],packList:[],taskList:[],rankList:[],records:[],score:0,coin:0};kind='empty-slots-pack';}\n  else if(p.includes('/act/newslotsv2/ranklist')){res=[];kind='empty-slots-pack-rank';}\n  else if(p.includes('/act/2025/tsl/v1/acinfo')){res={matchList:[],teamList:[],betList:[],taskList:[],rankList:[],rewardList:[],records:[],score:0,ticketCount:0};kind='empty-football-game';}\n  else if(p.includes('/act/2025/tsl/v1/bet/rank')||p.includes('/act/2025/tsl/v1/bet/record')||p.includes('/act/2025/tsl/v1/bet/win/record')){res=[];kind='empty-football-list';}\n  else if(p.includes('/act/winterfestival/familypk/v4/rank/')||p.includes('/act/winterfestival/familypk/v4/records')){res=[];kind='empty-family-pk-list';}\n  else if(p.includes('/act/winterfestival/familypk/v4/userinfo')){res={familyId:0,familyName:'',avatar:'',score:0,rank:0,records:[]};kind='empty-family-pk-user';}\n  else if(p.includes('/act/2024/drawpattern/genieact2025/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],exchangeList:[]};kind='empty-elves-journey';}\n  else if(p.includes('/act/ramadan/luckyact/v7/userprocess')){res={process:0,current:0,stage:0,drawCount:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],packList:[]};kind='empty-ramadan-lucky';}\n  else if(p.includes('/act/ramadan/luckyact/v7/dayrank')){res=[];kind='empty-ramadan-lucky-rank';}\n  else if(p.includes('/act/ramadan/luckyact/v7/receive')){res={success:true,received:false};kind='zero-ramadan-lucky-receive';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
base, n = re.subn(r'custom = """.*?"""\nif needle not in src:', lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:', base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch11-wave1/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
