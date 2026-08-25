#!/usr/bin/env python3
from pathlib import Path
import re

src = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')

src = src.replace("artifacts/pro-falla-batch9-original-spa", "artifacts/pro-falla-batch9-wave2-original-spa")
src = src.replace("ProFallaArchive/9.0", "ProFallaArchive/9.2")
src = src.replace("tools/pro-falla-batch9/archive_batch9.mjs", "tools/pro-falla-batch9-wave2/archive_wave2.mjs")

campaigns = r'''campaigns = r\'\'\'const campaigns = [
  {
    id:'slots-party-2024', title:'Falla Slots Party 2024', level:'L4+',
    units:[{label:'Slots Party',project:'act-slots-party',activityId:495,translateId:592,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']}]
  },
  {
    id:'corban-festival-2023', title:'Falla Corban Festival 2023', level:'L4+',
    units:[{label:'Corban Festival',project:'act-corban-festival-23',activityId:256,translateId:386,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task/lottery','/main/task','/lottery','/pk','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'super-car-club-2025', title:'Falla Super Car Club 2025', level:'L4+',
    units:[{label:'Super Car Club',project:'act-super-car-club-2',activityId:1161,translateId:947,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  },
  {
    id:'ramadan-competition-2023', title:'Falla Ramadan Competition 2023', level:'L4',
    units:[{label:'Ramadan Competition',project:'act-ramadan-competition-23',activityId:214,translateId:334,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/rank','/rule-reward']}]
  },
  {
    id:'navigation-puzzle-2024', title:'Falla Navigation Puzzle 2024', level:'L4', conditional:true,
    units:[{label:'Navigation Puzzle',project:'act-lottery-navigation',activityId:428,translateId:552,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]
  }
];\'\'\''''

src, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", campaigns, src, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'campaign block replacement failed: {n}')

custom = r'''custom = """  if(p.includes('/act/newslots/infos')){res={currentLevel:0,process:0,slotList:[],packList:[],taskList:[],rankList:[],records:[],score:0,coin:0};kind='empty-slots-party';}\\n  else if(p.includes('/act/newslots/packinfo')){res={packList:[],currentLevel:0,received:[]};kind='empty-slots-pack';}\\n  else if(p.includes('/act/newslots/ranklist')){res=[];kind='empty-slots-rank';}\\n  else if(p.includes('/act/newslots/pack/receive')){res={success:true,received:false};kind='slots-pack-receive';}\\n  else if(p.includes('/act/sacrifice/actinfo')){res={drawCount:0,sacrificeCount:0,taskList:[],rankList:[],rewardList:[],records:[],giftList:[]};kind='empty-corban-info';}\\n  else if(p.includes('/act/sacrifice/carousel/info')){res=[];kind='empty-corban-carousel';}\\n  else if(p.includes('/act/sacrifice/draw')){res={success:true,prize:null,drawCount:0};kind='zero-corban-draw';}\\n  else if(p.includes('/act/2025/supercaract/carouselinfo')){res={carList:[],carouselList:[],records:[],progress:0,score:0};kind='empty-super-car-carousel';}\\n  else if(p.includes('/act/ramadan/actinfo')){res={day:0,stage:0,drawCount:0,taskList:[],rankList:[],rewardList:[],records:[]};kind='empty-ramadan-competition';}\\n  else if(p.includes('/act/ramadan/carousel/info')||p.includes('/act/ramadan/daily/list/user')){res=[];kind='empty-ramadan-list';}\\n  else if(p.includes('/act/ramadan/draw')){res={success:true,prize:null,drawCount:0};kind='zero-ramadan-draw';}\\n  else if(p.includes('/act/seapuzzle/userprocess')){res={process:0,current:0,puzzleList:[],taskList:[],rankList:[],rewardList:[],records:[]};kind='empty-navigation-puzzle';}\\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\\n"""'''

src, n = re.subn(r'custom = """.*?"""\nif needle not in src:', custom + "\nif needle not in src:", src, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch9-wave2/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(src, encoding='utf-8')
exec(compile(src, str(out), 'exec'), {'__name__':'__main__','__file__':str(out)})
