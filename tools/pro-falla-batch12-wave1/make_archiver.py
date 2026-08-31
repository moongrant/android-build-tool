#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-batch12-wave1-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaArchive/12.1')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-batch12-wave1/archive_wave1.mjs')

campaign_block = """const campaigns = [
  {id:'corpus-christi-2026',title:'Falla Corpus Christi 2026',level:'L4+',units:[{label:'Corpus Christi',project:'act-corpus-christi-26',activityId:1565,translateId:1177,shell:'https://web.fallaweb.com/main/index.html',routes:['/','/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'summer-day-2026',title:'Falla Summer Day 2026',level:'L4+',units:[{label:'Summer Day',project:'act-summer-day-26',activityId:1564,translateId:1175,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'mother-day-2026',title:'Falla Mother Day 2026',level:'L4',units:[{label:'Mother Day',project:'act-mother-day-26',activityId:1536,translateId:1159,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'masked-party-2026',title:'Falla Masked Party 2026',level:'L4',units:[{label:'Masked Party',project:'act-masked-party',activityId:1577,translateId:1152,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'national-day-v4-2026',title:'Falla National Day World Campaign 2026',level:'L4+',units:[{label:'National Day World',project:'act-national-day-v4',activityId:1550,translateId:979,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/world','/main/task','/main/rank','/user','/room','/rule-reward']}]},
  {id:'summer-beach-2025',title:'Falla Summer Beach 2025',level:'L4',units:[{label:'Summer Beach',project:'act-summer-beach',activityId:1234,translateId:976,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'dance-party-2025',title:'Falla Dance Party 2025',level:'L4',units:[{label:'Dance Party',project:'act-dance-party',activityId:993,translateId:879,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/task','/main/lottery','/main/rank','/main/reward','/rule-reward']}]},
  {id:'frozen-world-2024',title:'Falla Frozen World 2024',level:'L4',units:[{label:'Frozen World',project:'act-frozen-world',activityId:788,translateId:800,shell:'https://web.fallaweb.com/main/index.html',routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']}]},
  {id:'agent-star-2024',title:'Falla Agent Star 2024',level:'L4',conditional:true,units:[{label:'Agent Star',project:'act-agent-star',activityId:611,translateId:701,shell:'https://web.fallaweb.com/main/index.html',routes:['/','/task','/rank','/reward','/rule-reward']}]},
  {id:'salad-fruit-2024',title:'Falla Salad Fruit 2024',level:'L4',conditional:true,units:[{label:'Salad Fruit',project:'act-salad-fruit',activityId:661,translateId:743,shell:'https://web.fallaweb.com/main/index.html',routes:['/','/task','/rank','/reward','/rule-reward']}]},
  {id:'summer-family-2024',title:'Falla Summer Family 2024',level:'L4+',units:[{label:'Summer Family',project:'act-summer-family',activityId:546,translateId:630,shell:'https://web-test.falla.live/main/index.html',routes:['/main/rank/family','/main/rank/user','/main/task','/main/reward','/rule-reward']}]}
];"""
base, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", lambda _m: 'campaigns = ' + repr(campaign_block), base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/act/2026/corpuschristi')){res={process:0,drawCount:0,taskList:[],rankList:[],rewardList:[],records:[],collectionList:[],exchangeList:[]};kind='empty-corpus-christi';}\n  else if(p.includes('/act/2026/summerday')){res={process:0,drawCount:0,taskList:[],rankList:[],rewardList:[],records:[],itemList:[]};kind='empty-summer-day';}\n  else if(p.includes('/act/2026/motherday')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[]};kind='empty-mother-day';}\n  else if(p.includes('/act/2026/maskedparty')){res={process:0,taskList:[],rankList:[],rewardList:[],records:[],maskList:[]};kind='empty-masked-party';}\n  else if(p.includes('/act/actdance/userprocess')){res={process:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],danceList:[],exchangeList:[]};kind='empty-dance-party';}\n  else if(p.includes('/act/frozenworld/userprocess')){res={process:0,drawCount:0,records:[],rewardList:[],taskList:[],rankList:[],itemList:[]};kind='empty-frozen-world';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
base, n = re.subn(r'custom = """.*?"""\nif needle not in src:', lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:', base, count=1, flags=re.S)
if n != 1: raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-batch12-wave1/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
