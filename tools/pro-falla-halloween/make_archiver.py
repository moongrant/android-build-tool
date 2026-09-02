#!/usr/bin/env python3
from pathlib import Path
import re

base = Path('tools/pro-falla-batch9/make_archiver.py').read_text(encoding='utf-8')
base = base.replace('artifacts/pro-falla-batch9-original-spa', 'artifacts/pro-falla-halloween-original-spa')
base = base.replace('ProFallaArchive/9.0', 'ProFallaHalloween/1.1')
base = base.replace('tools/pro-falla-batch9/archive_batch9.mjs', 'tools/pro-falla-halloween/archive_halloween.mjs')

campaign_block = """const campaigns = [
  {
    id:'halloween-candy-bag-2021', title:'Falla Halloween Candy Bag 2021', level:'L4+',
    units:[{label:'Halloween Candy Bag',project:'21-10-halloween',activityId:0,translateId:0,legacyUrl:'https://web.falla.live/#/activity/21-10-halloween',defaultRoute:'/',routes:['/__home','/__candy-king','/__reward','/__rules']}]
  },
  {
    id:'halloween-celebrations-2022', title:'Falla Halloween Celebrations 2022', level:'L4',
    units:[{label:'Halloween Celebrations',project:'act-hallowmas',activityId:147,translateId:267,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',defaultRoute:'/task',routes:['/task','/__ranking','/__rules']}]
  },
  {
    id:'halloween-event-2023', title:'Falla Halloween Event 2023', level:'L4',
    units:[{label:'Halloween Event',project:'act-halloween-23',activityId:346,translateId:480,shell:'https://web-test.falla.live/falla-web/micro-main/index.html',defaultRoute:'/task-send',routes:['/task-send','/task-charm','/task-recharge','/rank/user','/rank/room','/reward','/__rules']}]
  },
  {
    id:'happy-halloween-2025', title:'Falla Happy Halloween 2025', level:'L3+', conditional:true,
    units:[{label:'Happy Halloween',project:'act-template',activityId:1391,translateId:1054,shell:'https://web.fallaweb.com/main/index.html',defaultRoute:'/main/task',routes:['/main/task','/main/task/send','/main/task/score','/main/rank/user-send','/main/rank/room','/main/reward','/rule-reward']}]
  }
];"""
base, n = re.subn(r"campaigns = r'''const campaigns = \[.*?\n\];'''", lambda _m: 'campaigns = ' + repr(campaign_block), base, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'campaign block replacement failed: {n}')

custom_block = """  if(p.includes('/myaccount')){res={uid:0,nickName:'',avatar:'',isLogin:false,coin:0,balance:0};kind='anonymous-my-account';}\n  else if(p.includes('/halloween/candy')||p.includes('/candy/bag')||p.includes('/candybag')){res={uid:0,nickName:'',avatar:'',isLogin:false,candyCount:0,bagCount:0,score:0,rank:0,progress:0,taskList:[],rankList:[],rewardList:[],records:[],friendList:[],receiveList:[],giftList:[]};kind='empty-candy-bag';}\n  else if(p.includes('/hallowmas')||p.includes('/halloween/23')||p.includes('/halloween23')){res={uid:0,nickName:'',avatar:'',isLogin:false,score:0,rank:0,progress:0,lanternCount:0,taskList:[],rankList:[],rewardList:[],records:[],giftList:[],lanternList:[]};kind='empty-halloween-state';}\n  else if(campaignId==='happy-halloween-2025'&&(p.includes('/act/template')||p.includes('/template/'))){res={uid:0,nickName:'',avatar:'',isLogin:false,score:0,rank:0,progress:0,taskList:[],rankList:[],rewardList:[],records:[],giftList:[]};kind='empty-halloween-template';}\n  else if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}\n"""
base, n = re.subn(r'custom = """.*?"""\nif needle not in src:', lambda _m: 'custom = ' + repr(custom_block) + '\nif needle not in src:', base, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'fixture block replacement failed: {n}')

out = Path('tools/pro-falla-halloween/_builder_generated.py')
out.parent.mkdir(parents=True, exist_ok=True)
out.write_text(base, encoding='utf-8')
print(f'wrote {out}')
