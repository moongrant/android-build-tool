#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')

base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch10-wave3-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/10.3')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch10-wave3/archive_wave3.mjs')

campaign_block = """const campaigns = [
  {
    id:'peak-benefits-2025', title:'Falla Peak Benefits 2025', level:'L4',
    units:[{label:'Peak Benefits',project:'act-peak-benefits',activityId:1412,translateId:1072,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/rule-reward']}]
  },
  {
    id:'king-of-castle-2025', title:'Falla King of Castle 2025', level:'L4+',
    units:[{label:'King of Castle',project:'act-king-of-castle',activityId:1125,translateId:936,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/mecha','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'weekly-family-star-2025', title:'Falla Weekly Family Star 2025', level:'L3+', conditional:true,
    units:[{label:'Weekly Family Star',project:'act-weekly-family-star',activityId:1200,translateId:963,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/this-week-rank','/main/last-week-rank','/main/reward']}]
  },
  {
    id:'limited-time-benefits-2024', title:'Falla Limited-Time Return Benefits 2024', level:'L3+', conditional:true,
    units:[{label:'Limited-Time Return Benefits',project:'act-limited-time-benefits',activityId:563,translateId:656,shell:'https://web.fallaweb.com/main/index.html',routes:['/']}]
  },
  {
    id:'activity-config-template-2023', title:'Falla Activity Config Template 2023', level:'L3', conditional:true,
    units:[{label:'Activity Config Template',project:'act-activity-config',activityId:212,translateId:202,shell:'https://web.fallaweb.com/main/index.html',routes:['/']}]
  },
  {
    id:'football-carnival-ar-2025', title:'Falla Football Carnival AR 2025', level:'L4',
    units:[{label:'Football Carnival AR',project:'act-football-carnival-ar',activityId:1432,translateId:1084,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/rank','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'fruit-machine-2024', title:'Falla Fruit Machine 2024', level:'L3+', conditional:true,
    units:[{label:'Fruit Machine',project:'act-fruit-machine',activityId:401,translateId:532,shell:'https://web.fallaweb.com/main/index.html',routes:['/','/rank','/reward']}]
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

custom_block = """  if(p.includes('/act/2025/act/peakact/actinfo')){res={drawCount:0,score:0,taskList:[],rankList:[],rewardList:[],records:[],freeDrawAvailable:false};kind='empty-peak-benefits';}\n  else if(p.includes('/act/2025/act/peakact/freedraw')){res={success:true,prize:null,drawCount:0};kind='zero-peak-free-draw';}\n  else if(p.includes('/act/2025/act/peakact/rank')){res=[];kind='empty-peak-rank';}\n  else if(p.includes('/act/2024/mecha/v11/userprocess')){res={process:0,bossHp:0,weaponList:[],taskList:[],rankList:[],rewardList:[],records:[],attackCount:0};kind='empty-castle-mecha';}\n  else if(p.includes('/act/2024/mecha/v11/taskinfo')){res={taskList:[],weaponList:[],process:0};kind='empty-castle-task';}\n  else if(p.includes('/act/2024/mecha/v11/records')){res=[];kind='empty-castle-records';}\n  else if(p.includes('/act/2024/mecha/v11/attack')){res={success:true,damage:0,prize:null};kind='zero-castle-attack';}\n  else if(p.includes('/act/2025/family/week/star/rank')){res=[];kind='empty-weekly-family-star';}\n  else if(p.includes('/act/userrecall/userinfo')){res={eligible:false,uid:0,nickName:'',avatar:'',rewardList:[],received:false};kind='empty-return-benefit';}\n  else if(p.includes('/act/userrecall/receive')){res={success:true,received:false};kind='zero-return-benefit';}\n  else if(p.includes('/act/2025/act/ar/footballchallengeact/actinfo')){res={teamList:[],taskList:[],rankList:[],rewardList:[],records:[],selectedTeamId:0,boxCount:0};kind='empty-football-carnival';}\n  else if(p.includes('/act/2025/act/ar/footballchallengeact/giftrank')||p.includes('/act/2025/act/ar/footballchallengeact/finishblindboxrank')){res=[];kind='empty-football-rank';}\n  else if(p.includes('/act/2025/act/ar/footballchallengeact/openbox')){res={success:true,prize:null,boxCount:0};kind='zero-football-box';}\n  else if(p.includes('/act/actfruitrace/infos')){res={level:0,score:0,gameList:[],rankList:[],rewardList:[],records:[]};kind='empty-fruit-machine';}\n  else if(p.includes('/act/actfruitrace/ranklist')){res=[];kind='empty-fruit-machine-rank';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""

base, n = re.subn(
    r'custom = """.*?"""\nif needle not in src:',
    lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:',
    base,
    count=1,
    flags=re.S,
)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch10-wave3/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
