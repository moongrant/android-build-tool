#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-halloween/archive_halloween.mjs')
src = p.read_text(encoding='utf-8')

old_build = """function buildUrl(unit,route){
  let p=route||'/'; if(!p.startsWith('/'))p='/'+p;
  const shell=unit.shell||SHELL;
  return `${shell}#/${unit.project}${p==='/'?'':p}?activityId=${unit.activityId}&translateId=${unit.translateId}`;
}"""
new_build = """function buildUrl(unit,route){
  let p=route||'/';
  if(unit.legacyUrl)return unit.legacyUrl;
  if(p.startsWith('/__'))p=unit.defaultRoute||'/';
  if(!p.startsWith('/'))p='/'+p;
  const shell=unit.shell||SHELL;
  return `${shell}#/${unit.project}${p==='/'?'':p}?activityId=${unit.activityId}&translateId=${unit.translateId}`;
}"""
if old_build not in src:
    raise SystemExit('buildUrl block not found')
src = src.replace(old_build, new_build, 1)

# The legacy Candy Bag exposes internal tabs rather than independent hash routes.
action_code = r'''async function applyVariantAction(page,def){
  const actions={
    '/__candy-king':['Candy King'],
    '/__reward':['Reward'],
    '/__rules':['Rules']
  };
  const labels=actions[def.route]||[];
  for(const label of labels){
    let clicked=false;
    for(const exact of [true,false]){
      try{
        const loc=page.getByText(label,{exact}).first();
        if(await loc.count()){await loc.click({force:true,timeout:6000});clicked=true;break;}
      }catch{}
    }
    if(!clicked){
      try{clicked=await page.evaluate(text=>{const els=[...document.querySelectorAll('a,button,[role=button],div,span')];const el=els.find(x=>(x.textContent||'').trim()===text);if(!el)return false;el.click();return true;},label);}catch{}
    }
    await sleep(1500);
  }
}

'''
anchor = 'async function captureOnline(browser,def,ordinal){'
if anchor not in src:
    raise SystemExit('captureOnline anchor not found')
src = src.replace(anchor, action_code + anchor, 1)

old_pageid = "const pageId=`${String(ordinal+1).padStart(3,'0')}-${short(def.url)}`,dir=path.join(OUT,'pages',def.campaignId,pageId);"
new_pageid = "const pageId=`${String(ordinal+1).padStart(3,'0')}-${short(def.url+'|'+(def.route||''))}`,dir=path.join(OUT,'pages',def.campaignId,pageId);"
if old_pageid not in src:
    raise SystemExit('pageId declaration not found')
src = src.replace(old_pageid, new_pageid, 1)

old_online = 'await sleep(ONLINE_WAIT);await smoothScroll(page);'
new_online = 'await sleep(ONLINE_WAIT);await applyVariantAction(page,def);await smoothScroll(page);'
if old_online not in src:
    raise SystemExit('online action point not found')
src = src.replace(old_online, new_online, 1)

old_offline = 'await sleep(OFFLINE_WAIT);await smoothScroll(page);'
new_offline = 'await sleep(OFFLINE_WAIT);await applyVariantAction(page,online);await smoothScroll(page);'
if old_offline not in src:
    raise SystemExit('offline action point not found')
src = src.replace(old_offline, new_offline, 1)

old_defs = "project:unit.project,label:route.replace(/^\\/+/, '').replaceAll('/',' · ')||unit.label,url:buildUrl(unit,route)"
new_defs = "project:unit.project,route,label:route.replace(/^\\/+/, '').replaceAll('/',' · ')||unit.label,url:buildUrl(unit,route)"
if old_defs not in src:
    raise SystemExit('route definition block not found')
src = src.replace(old_defs, new_defs, 1)

# Legacy route has no modern activities_config row.
old_prefetch = "for(const unit of units){\n    let original=null,sourceUrl=null,headers=null,status=0;"
new_prefetch = "for(const unit of units){\n    if(!unit.activityId)continue;\n    let original=null,sourceUrl=null,headers=null,status=0;"
if old_prefetch not in src:
    raise SystemExit('activity config prefetch loop not found')
src = src.replace(old_prefetch, new_prefetch, 1)

# Keep fixture use restricted to actual API hosts. Add the older public API aliases.
old_host = "if(!/(?:api\\.apifalla\\.com|apihk\\.falla\\.live)$/i.test(u.hostname))return null;"
new_host = "if(!/(?:api\\.apifalla\\.com|apihk\\.falla\\.live|api\\.falla\\.live|api\\.fallalive\\.com)$/i.test(u.hostname))return null;"
if old_host in src:
    src = src.replace(old_host, new_host, 1)

p.write_text(src, encoding='utf-8')
print('patched Halloween archiver')
