#!/usr/bin/env python3
from pathlib import Path
import re

p = Path('tools/pro-falla-sep24/archive_sep24.mjs')
src = p.read_text(encoding='utf-8')

old = "const records=new Map(),byUrl=new Map(),byPath=new Map(),captureErrors=[];"
new = "const records=new Map(),byUrl=new Map(),byPath=new Map(),activityConfigById=new Map(),captureErrors=[];"
if old not in src:
    raise SystemExit('records map declaration not found')
src = src.replace(old, new, 1)

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

old_urls = "const urls=['https://web.fallaweb.com/falla-web/act-country-elect/prod/0.1.0/assets/8048095648185daae6b5.png'];"
new_urls = "const urls=['https://web.fallaweb.com/falla-web/act-country-elect/prod/0.1.0/assets/8048095648185daae6b5.png','https://falla-res1.resygg.com/awss3_866790_1696676056020402174_1692087209.png'];"
if old_urls not in src:
    raise SystemExit('known static URL list not found')
src = src.replace(old_urls, new_urls, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_sep24.mjs v2')
