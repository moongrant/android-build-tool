#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-sep24-batch2/archive_sep24_batch2.mjs')
src = p.read_text(encoding='utf-8')

src = src.replace(
    "function fixtureFor(method,url){",
    "function fixtureFor(method,url,campaignId=''){",
    1,
)

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
