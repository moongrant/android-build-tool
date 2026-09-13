#!/usr/bin/env python3
from pathlib import Path
import re

p = Path('tools/pro-falla-sep24-batch2/archive_sep24_batch2.mjs')
src = p.read_text(encoding='utf-8')

old_maps = "const records=new Map(),byUrl=new Map(),byPath=new Map(),captureErrors=[];"
new_maps = "const records=new Map(),byUrl=new Map(),byPath=new Map(),activityConfigById=new Map(),captureErrors=[];"
if old_maps not in src:
    raise SystemExit('records map declaration not found')
src = src.replace(old_maps, new_maps, 1)

pattern = r"function recordFor\(method,url,post=''\)\{.*?\n\}"
replacement = """function recordFor(method,url,post=''){
  if(method==='POST'&&/\/activities_config\/act$/i.test(url)){
    try{const body=JSON.parse(post||'{}');const id=Number(body.activitiesId??body.activityId??body.id??0);const cfg=activityConfigById.get(id);if(cfg)return cfg;}catch{}
  }
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlKey(method,url))||byPath.get(pathKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlKey(method,noQuery))||byPath.get(pathKey(method,noQuery));}catch{}}
  return rec;
}"""
src, n = re.subn(pattern, replacement, src, count=1, flags=re.S)
if n != 1:
    raise SystemExit(f'recordFor replacement failed: {n}')

old_loop = """    for(const endpoint of endpoints){
      for(const payload of payloads){await savePrefetchedRecord({method:'POST',url:endpoint,sourceUrl,body:original,status:status||200,headers:headers||{'content-type':'application/json; charset=utf-8'},postData:JSON.stringify(payload),pageId:`activity-config-${unit.activityId}`});added++;}
    }
"""
new_loop = """    let preferredRec=null;
    for(const endpoint of endpoints){
      for(const payload of payloads){const rec=await savePrefetchedRecord({method:'POST',url:endpoint,sourceUrl,body:original,status:status||200,headers:headers||{'content-type':'application/json; charset=utf-8'},postData:JSON.stringify(payload),pageId:`activity-config-${unit.activityId}`});if(!preferredRec)preferredRec=rec;added++;}
    }
    if(preferredRec)activityConfigById.set(Number(unit.activityId),preferredRec);
"""
if old_loop not in src:
    raise SystemExit('activity config storage loop not found')
src = src.replace(old_loop, new_loop, 1)

src = src.replace(
    "function fixtureFor(method,url){",
    "function fixtureFor(method,url,campaignId=''){",
    1,
)

# Age of Navigation's map component requires taskList[0].actTaskInfo rather than a flat list.
# This zero-state fixture restores only the expected response shape. It does not invent progress or rewards.
rank_branch = "if(p.includes('/rank')||p.includes('ranklist')||p.includes('carousel')||p.includes('/records')){res=[];kind='empty-list';}"
age_map = "if(campaignId==='age-of-navigation-2022'&&p.includes('/activities/rank/prize/info')){res={taskList:[{myScore:0,actTaskInfo:[{needScore:1,taskPrizeTitle:'',taskPrizeList:[]},{needScore:2,taskPrizeTitle:'',taskPrizeList:[]},{needScore:3,taskPrizeTitle:'',taskPrizeList:[]},{needScore:4,taskPrizeTitle:'',taskPrizeList:[]},{needScore:5,taskPrizeTitle:'',taskPrizeList:[]},{needScore:6,taskPrizeTitle:'',taskPrizeList:[]}]}]};kind='age-navigation-map-progress';}\n  else " + rank_branch
if rank_branch not in src:
    raise SystemExit('generic rank fixture branch not found')
src = src.replace(rank_branch, age_map, 1)

old_user = "else if(p.includes('activities_config/user')||p.includes('/user/info')||p.includes('/user/simple/info')){res={uid:0,nickName:'',avatar:'',isLogin:false};kind='anonymous-user';}"
new_user = "else if(p.includes('activities_config/user')||p.includes('/user/info')||p.includes('/user/simple/info')){const region=campaignId==='age-of-navigation-2022'?'ES':campaignId==='onam-boat-race-2022'?'EN':'';res={uid:0,nickName:'',avatar:'',isLogin:false,region};kind='anonymous-user';}"
if old_user not in src:
    raise SystemExit('generic anonymous user fixture not found')
src = src.replace(old_user, new_user, 1)

needle = "else if(p.includes('/infos')||p.includes('/info')||p.includes('/state')||p.includes('/process')){res={list:[],records:[],rank:[],progress:0,score:0};kind='empty-state';}"
onam = "else if(p.includes('/active/outram/festival/year')){res={mileage:0,process:0,taskList:[],rankList:[],rewardList:[],records:[],userInfo:{uid:0,nickName:'',avatar:'',isLogin:false,region:'EN'}};kind='empty-onam-progress';}\n  " + needle
if needle not in src:
    raise SystemExit('generic empty-state fixture insertion point not found')
src = src.replace(needle, onam, 1)

old_call = "const fx=fixtureFor(method,url);"
new_call = "const fx=fixtureFor(method,url,online.campaignId);"
if old_call not in src:
    raise SystemExit('fixtureFor call not found')
src = src.replace(old_call, new_call, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_sep24_batch2.mjs')
