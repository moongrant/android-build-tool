#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch12-wave2-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/12.2')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch12-wave2/archive_wave2.mjs')

campaign_block = """const campaigns = [
  {id:'kite-festival-2023',title:'Falla Kite Festival 2023',level:'L4',units:[{label:'Kite Festival',project:'act-kite-festival',activityId:185,translateId:303,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'ramadan-happy-2023',title:'Falla Ramadan Happy 2023',level:'L4',units:[{label:'Ramadan Happy',project:'act-ramadan-happy-23',activityId:224,translateId:346,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'bengali-new-year-2023',title:'Falla Bengali New Year 2023',level:'L4',units:[{label:'Bengali New Year',project:'act-bengali-new-year-23',activityId:219,translateId:341,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task','/lottery','/rank','/reward','/rule-reward']}]},
  {id:'islamic-new-year-2022',title:'Falla Islamic New Year 2022',level:'L4',units:[{label:'Islamic New Year',project:'act-islamic-new-year',activityId:104,translateId:219,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/task','/lottery','/rank','/reward','/rule-reward']}]},
  {id:'winter-battle-2023',title:'Falla Winter Battle 2023',level:'L4+',units:[{label:'Winter Battle',project:'act-winter-battle',activityId:186,translateId:304,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/pk','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'glacier-adventure-2025',title:'Falla Glacier Adventure 2025',level:'L4',units:[{label:'Glacier Adventure',project:'act-glacier-adventure',activityId:862,translateId:832,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'dune-adventure-2025',title:'Falla Dune Adventure 2025',level:'L4',units:[{label:'Dune Adventure',project:'act-dune-adventure',activityId:855,translateId:827,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'ancient-adventure-2024',title:'Falla Ancient Adventure 2024',level:'L4',units:[{label:'Ancient Adventure',project:'act-ancient-adventure',activityId:608,translateId:699,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'island-adventure-2024',title:'Falla Island Adventure 2024',level:'L4',units:[{label:'Island Adventure',project:'act-island-adventure',activityId:744,translateId:781,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'carnival-2024',title:'Falla Carnival 2024',level:'L4',units:[{label:'Carnival',project:'act-carnival-2024',activityId:453,translateId:558,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]}
];"""
base, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", lambda _m: 'campaigns = ' + repr(campaign_block), base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/kite')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],kiteList:[],drawCount:0};kind='empty-kite-festival';}\n  else if(p.includes('/act/ramadan/happy')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],drawCount:0};kind='empty-ramadan-happy';}\n  else if(p.includes('/act/bengali')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],itemList:[]};kind='empty-bengali-new-year';}\n  else if(p.includes('/act/islamicnewyear')||p.includes('/act/islamic/newyear')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],itemList:[]};kind='empty-islamic-new-year';}\n  else if(p.includes('/act/winterbattle')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],teamList:[],drawCount:0};kind='empty-winter-battle';}\n  else if(p.includes('/act/2024/drawpattern/')&&p.includes('/userprocess')){res={process:0,current:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],exchangeList:[]};kind='empty-adventure-process';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
base, n = re.subn(r'custom = """.*?"""\nif needle not in src:', lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:', base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch12-wave2/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
