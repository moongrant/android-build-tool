#!/usr/bin/env python3
from pathlib import Path

src_path = Path('tools/pro-falla-batch3/archive_selected.mjs')
src = src_path.read_text(encoding='utf-8')

old = "brokenImages:[...document.images].filter(i=>i.complete&&(i.currentSrc||i.src)&&i.naturalWidth===0).map(i=>i.currentSrc||i.src).slice(0,100)"
new = "brokenImages:[...document.images].filter(i=>{const raw=(i.getAttribute('src')||i.getAttribute('srcset')||'').trim();return i.complete&&raw&&i.naturalWidth===0;}).map(i=>i.currentSrc||i.src).slice(0,100)"
if old not in src:
    raise SystemExit('brokenImages expression not found')
src = src.replace(old, new, 1)

anchor = """function recordFor(method,url,post=''){
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlMethodKey(method,url))||byPath.get(pathMethodKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlMethodKey(method,noQuery))||byPath.get(pathMethodKey(method,noQuery));}catch{}}
  return rec;
}
"""
insert = anchor + r"""function historicalApiFixture(method,url){
  let u; try{u=new URL(url);}catch{return null;}
  if(u.hostname!=='apihk.falla.live')return null;
  const p=u.pathname.toLowerCase();
  const now=Math.floor(Date.now()/1000);
  let res={};
  let kind='empty-object';
  if(p.endsWith('/servertimear')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}
  else if(p.includes('/rank')||p.includes('/carousel')){res=[];kind='empty-list';}
  else if(p.endsWith('/user/coin')){res={coin:0,balance:0};kind='zero-balance';}
  else if(p.includes('/user/pack/type/info/list')){res=[];kind='empty-list';}
  else if(p.includes('/activities_config/act')){res={id:0,actStatus:3,startTime:0,endTime:0,extConfig:'{}',serverConfig:'{}',giftInfoList:[],regionList:[]};kind='ended-activity-shell';}
  else if(p.includes('/activities_config/user')){res={};kind='anonymous-user';}
  else if(p.includes('/user/info')){res={uid:0,nickName:'',avatar:'',countryCode:'',isLogin:false};kind='anonymous-user';}
  else if(p.includes('/prizepackage/')||p.includes('/probability/')){res={list:[],records:[],awards:[]};kind='empty-prize-state';}
  else if(p.includes('/process')){res={process:0,progress:0,list:[]};kind='zero-progress';}
  else if(p.includes('/info')||p.includes('/state')||p.includes('/year')){res={list:[],records:[],rank:[],progress:0};kind='empty-state';}
  const body=Buffer.from(JSON.stringify({code:0,msg:'success',res}));
  return {body,kind,headers:{'content-type':'application/json; charset=utf-8','cache-control':'no-store','x-pro-falla-local':'historical-api-fixture'}};
}
"""
if anchor not in src:
    raise SystemExit('recordFor anchor not found')
src = src.replace(anchor, insert, 1)

old_capture = r"""async function captureOffline(browser,online){
  const dir=path.join(OUT,'pages',online.campaignId,online.pageId), context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  let served=0,missing=0,ignored=0; const errors=[],missingUrls=[];
  await context.route('**/*',async route=>{const req=route.request(),method=req.method(),url=req.url(); if(OPTIONAL.test(url)){ignored++;return route.fulfill({status:204,body:''});} const rec=recordFor(method,url,req.postData()||''); if(!rec){missing++;missingUrls.push({method,url});return route.abort('failed');} try{const body=await fs.readFile(path.join(OUT,rec.objectPath)),headers={...rec.headers};for(const k of ['content-encoding','content-length','transfer-encoding'])delete headers[k];headers['x-pro-falla-local']='original-byte';await route.fulfill({status:rec.status||200,headers,body});served++;}catch(e){missing++;errors.push({type:'serve',url,text:String(e)});await route.abort('failed');}});
  const page=await context.newPage(); page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)})); page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});
  let navError=null; try{await page.goto(online.url,{waitUntil:'domcontentloaded',timeout:70000});await sleep(OFFLINE_WAIT);await smoothScroll(page);await sleep(500);}catch(e){navError=String(e);}
  const metrics=await pageMetrics(page).catch(()=>({})); await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});
  await fs.writeFile(path.join(dir,'offline-dom.html'),await page.content().catch(()=>'')); await page.screenshot({path:path.join(dir,'offline-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{}); await writeJson(path.join(dir,'offline-errors.json'),errors); await writeJson(path.join(dir,'offline-missing.json'),missingUrls); await context.close();
  return {...online,offlineMetrics:metrics,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};
}
"""
new_capture = r"""async function captureOffline(browser,online){
  const dir=path.join(OUT,'pages',online.campaignId,online.pageId), context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  let served=0,missing=0,ignored=0,fixtures=0; const errors=[],missingUrls=[],fixtureUrls=[];
  await context.route('**/*',async route=>{const req=route.request(),method=req.method(),url=req.url(); if(OPTIONAL.test(url)){ignored++;return route.fulfill({status:204,body:''});} const rec=recordFor(method,url,req.postData()||''); if(!rec){const fixture=historicalApiFixture(method,url);if(fixture){fixtures++;fixtureUrls.push({method,url,kind:fixture.kind});return route.fulfill({status:200,headers:fixture.headers,body:fixture.body});}missing++;missingUrls.push({method,url});return route.abort('failed');} try{const body=await fs.readFile(path.join(OUT,rec.objectPath)),headers={...rec.headers};for(const k of ['content-encoding','content-length','transfer-encoding'])delete headers[k];headers['x-pro-falla-local']='original-byte';await route.fulfill({status:rec.status||200,headers,body});served++;}catch(e){missing++;errors.push({type:'serve',url,text:String(e)});await route.abort('failed');}});
  const page=await context.newPage(); page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)})); page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});
  let navError=null; try{await page.goto(online.url,{waitUntil:'domcontentloaded',timeout:70000});await sleep(OFFLINE_WAIT);await smoothScroll(page);await sleep(500);}catch(e){navError=String(e);}
  const metrics=await pageMetrics(page).catch(()=>({})); await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});
  await fs.writeFile(path.join(dir,'offline-dom.html'),await page.content().catch(()=>'')); await page.screenshot({path:path.join(dir,'offline-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{}); await writeJson(path.join(dir,'offline-errors.json'),errors); await writeJson(path.join(dir,'offline-missing.json'),missingUrls); await writeJson(path.join(dir,'offline-fixtures.json'),fixtureUrls); await context.close();
  return {...online,offlineMetrics:metrics,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineFixtureCount:fixtures,offlineFixtureUrls:fixtureUrls,offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};
}
"""
if old_capture not in src:
    raise SystemExit('captureOffline block not found')
src = src.replace(old_capture, new_capture, 1)

static_anchor = """async function staticClosure(){
"""
if static_anchor not in src:
    raise SystemExit('staticClosure anchor not found')

end_static = """  }return added;
}

const browser="""
replacement = r"""  }return added;
}
async function prefetchKnownStatic(){
  const urls=['https://web.falla.live/activity_gift_config_v3/pre/h5_413_ALL.json'];
  let added=0;
  for(const url of urls){
    if(byPath.has(pathMethodKey('GET',url)))continue;
    try{
      const r=await fetch(url,{headers:{'user-agent':UA,'accept':'application/json,*/*'},redirect:'follow',signal:AbortSignal.timeout(30000)});
      if(!r.ok)continue;
      const body=Buffer.from(await r.arrayBuffer()),headers=Object.fromEntries(r.headers.entries()),bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;
      try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
      const rec={key:requestKey('GET',url,''),method:'GET',url,postDataHash:sha(''),status:r.status,statusText:r.statusText,headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:['known-static-closure']};
      records.set(rec.key,rec);byUrl.set(urlMethodKey('GET',url),rec);byPath.set(pathMethodKey('GET',url),rec);added++;
    }catch(e){captureErrors.push({pageId:'known-static-closure',url,error:String(e)});}
  }
  return added;
}

const browser="""
if end_static not in src:
    raise SystemExit('end static closure anchor not found')
src = src.replace(end_static, replacement, 1)

old_call = "const closureAdded=await staticClosure();console.log(`OFFLINE ${onlinePages.length}`);"
new_call = "const closureAdded=await staticClosure();const knownStaticAdded=await prefetchKnownStatic();console.log(`OFFLINE ${onlinePages.length}`);"
if old_call not in src:
    raise SystemExit('closure call not found')
src = src.replace(old_call, new_call, 1)

old_unit = "offlineMissing:pages.reduce((a,p)=>a+p.offlineMissingCount,0),brokenImages:pages.reduce((a,p)=>a+(p.offlineMetrics?.brokenImages?.length||0),0),navErrors:pages.filter(p=>p.offlineNavError).length,originalBundleReplay:pages.length>0&&pages.every(p=>!p.offlineNavError&&p.offlineMissingCount===0)"
new_unit = "offlineMissing:pages.reduce((a,p)=>a+p.offlineMissingCount,0),historicalApiFixtures:pages.reduce((a,p)=>a+(p.offlineFixtureCount||0),0),brokenImages:pages.reduce((a,p)=>a+(p.offlineMetrics?.brokenImages?.length||0),0),navErrors:pages.filter(p=>p.offlineNavError).length,originalBundleReplay:pages.length>0&&pages.every(p=>!p.offlineNavError&&p.offlineMissingCount===0)"
if old_unit not in src:
    raise SystemExit('unit aggregation not found')
src = src.replace(old_unit, new_unit, 1)

old_campaign = "offlineMissing:unitResults.reduce((a,u)=>a+u.offlineMissing,0),brokenImages:unitResults.reduce((a,u)=>a+u.brokenImages,0),navErrors:unitResults.reduce((a,u)=>a+u.navErrors,0),originalBundleReplay:unitResults.filter(u=>!u.optional).every(u=>u.originalBundleReplay)"
new_campaign = "offlineMissing:unitResults.reduce((a,u)=>a+u.offlineMissing,0),historicalApiFixtures:unitResults.reduce((a,u)=>a+(u.historicalApiFixtures||0),0),brokenImages:unitResults.reduce((a,u)=>a+u.brokenImages,0),navErrors:unitResults.reduce((a,u)=>a+u.navErrors,0),originalBundleReplay:unitResults.filter(u=>!u.optional).every(u=>u.originalBundleReplay)"
if old_campaign not in src:
    raise SystemExit('campaign aggregation not found')
src = src.replace(old_campaign, new_campaign, 1)

old_manifest = "staticClosureAdded:closureAdded,captureErrors:captureErrors.length,campaigns:campaignResults,rawByteComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.brokenImages===0&&c.navErrors===0&&c.originalBundleReplay)"
new_manifest = "staticClosureAdded:closureAdded,knownStaticAdded,captureErrors:captureErrors.length,historicalApiFixtureCount:campaignResults.reduce((a,c)=>a+(c.historicalApiFixtures||0),0),campaigns:campaignResults,originalStaticByteComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.brokenImages===0&&c.navErrors===0&&c.originalBundleReplay),offlineReplayComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.navErrors===0&&c.originalBundleReplay),rawByteComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.brokenImages===0&&c.navErrors===0&&c.originalBundleReplay)&&campaignResults.reduce((a,c)=>a+(c.historicalApiFixtures||0),0)===0"
if old_manifest not in src:
    raise SystemExit('manifest aggregation not found')
src = src.replace(old_manifest, new_manifest, 1)

src = src.replace("closureAdded,rawByteComplete:manifest.rawByteComplete", "closureAdded,knownStaticAdded,historicalApiFixtures:manifest.historicalApiFixtureCount,originalStaticByteComplete:manifest.originalStaticByteComplete,offlineReplayComplete:manifest.offlineReplayComplete,rawByteComplete:manifest.rawByteComplete", 1)

Path('tools/pro-falla-batch3/archive_selected_repaired.mjs').write_text(src, encoding='utf-8')
print('wrote archive_selected_repaired.mjs')
