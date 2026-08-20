import { chromium } from 'playwright';
import fs from 'node:fs/promises';
import path from 'node:path';
import crypto from 'node:crypto';

const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-batch3-original-spa');
const VIEWPORT = { width: 390, height: 844 };
const ONLINE_WAIT = Number(process.env.ONLINE_WAIT_MS || 5200);
const OFFLINE_WAIT = Number(process.env.OFFLINE_WAIT_MS || 3600);
const ROUTE_LIMIT = Number(process.env.ROUTE_LIMIT || 9);
const PAGE_CONCURRENCY = Number(process.env.PAGE_CONCURRENCY || 3);
const SHELL = 'https://web.fallaweb.com/main/index.html';
const TEST_SHELL = 'https://web-test.falla.live/falla-web/micro-main/index.html';
const UA = 'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36 ProFallaArchive/3.0';

const ALLOWED_ARCHIVE_HOSTS = new Set([
  'web.fallaweb.com', 'web-test.falla.live', 'web.falla.live', 'static.fallaweb.com',
  'webf.fallalive.com', 'res-g.resygg.com', 'falla-res1.resygg.com',
  'activity.falla.live', 'api.apifalla.com'
]);
const OPTIONAL = /(?:google-analytics\.com|googletagmanager\.com|firebase(?:installations)?\.googleapis\.com|rumt-us\.com|doubleclick\.net)/i;

const campaigns = [
  {
    id: 'ramadan-2025', title: 'Falla Ramadan 2025 · 五阶段 Campaign', level: 'L5',
    units: [
      { label:'Regal Party / Rich PK', project:'act-25-ramadan-rich-pk', seed:`${SHELL}#/act-25-ramadan-rich-pk/main/task?activityId=915&translateId=849`, fallbacks:['/main/task','/main/rank','/rule-reward/rule-desc','/rule-reward/reward'] },
      { label:'Ramadan 总会场', project:'act-25-ramadan-main', seed:`${SHELL}#/act-25-ramadan-main?activityId=917&translateId=850`, fallbacks:['/','/main','/rule-reward'] },
      { label:'Food Carnival', project:'act-25-ramadan-food-carnival', seed:`${SHELL}#/act-25-ramadan-food-carnival/main/lottery?activityId=919&translateId=851`, fallbacks:['/main/lottery','/main/rank','/main/task','/rule-reward/rule-desc','/rule-reward/reward'] },
      { label:'Happy Holi', project:'act-25-ramadan-happy-holi', seed:`${SHELL}#/act-25-ramadan-happy-holi/main/blind-box?activityId=927&translateId=853`, fallbacks:['/main/blind-box','/main/rank','/main/task','/rule-reward/rule-desc','/rule-reward/reward'] },
      { label:'Light of Ramadan', project:'act-25-ramadan-light', seed:`${SHELL}#/act-25-ramadan-light/main/blind-box?activityId=931&translateId=856`, fallbacks:['/main/blind-box','/main/rank','/main/task','/rule-reward/rule-desc','/rule-reward/reward'] },
      { label:'Treasure Hunting', project:'act-25-ramadan-treasure-hunting', seed:`${SHELL}#/act-25-ramadan-treasure-hunting/main/pk?activityId=943&translateId=861`, fallbacks:['/main/pk','/main/rank','/main/task','/rule-reward/rule-desc','/rule-reward/reward'] },
      { label:'Ramadan Gift', project:'act-25-ramadan-gift', seed:`${SHELL}#/act-25-ramadan-gift?activityId=948&translateId=864`, fallbacks:['/','/main','/rule-reward'] },
      { label:'Eid al-Fitr', project:'act-25-ramadan-eid-al-fitr', seed:`${SHELL}#/act-25-ramadan-Eid-Al-Fitr/main/task?activityId=968&translateId=870`, fallbacks:['/main/task','/main/rank','/rule-reward'], optional:true },
    ]
  },
  {
    id:'winter-festival-2023-24', title:'Falla Winter Festival 2023–2024 · 四月赛季 Campaign', level:'L5',
    units:[
      { label:'November · King Champion', project:'act-winter-festival', seed:`${TEST_SHELL}#/act-winter-festival/main/rank?activityId=350&translateId=486`, fallbacks:['/main/rank','/main/task','/main/rank/individual','/main/rank/king','/rule-reward'] },
      { label:'December · Fantasy CP', project:'act-winter-cp', seed:`${TEST_SHELL}#/act-winter-cp/main/daily?activityId=379&translateId=516`, fallbacks:['/main/daily','/main/task','/main/rank/cp','/main/rank','/rule-reward'] },
      { label:'January · Room Champion', project:'act-winter-room', seed:`${TEST_SHELL}#/act-winter-room/main/rank/room?activityId=411&translateId=542`, fallbacks:['/main/rank/room','/main/rank/user','/main/task','/rule-reward'] },
      { label:'February · Family Honor PK', project:'act-winter-family', seed:`${TEST_SHELL}#/act-winter-family/main/rank/family?activityId=432&translateId=554`, fallbacks:['/main/rank/family','/main/rank/user','/main/task','/rule-reward'] },
    ]
  },
  {
    id:'bengali-new-year-2024', title:'Falla Bengali New Year 2024 · Mango Leaf Festival', level:'L4',
    units:[
      { label:'新年庆典', project:'act-bengali-new-year-24', seed:`${TEST_SHELL}#/act-bengali-new-year-24/task?activityId=478&translateId=586`, fallbacks:['/task','/rank','/main/task','/main/rank','/rule-reward','/rule'] }
    ]
  },
  {
    id:'blind-box-rave-2024', title:'Falla Blind Box Rave 2024 · Map & Shared Pool', level:'L4',
    units:[
      { label:'盲盒狂欢', project:'act-blind-box-rave', seed:`${TEST_SHELL}#/act-blind-box-rave/main/task?activityId=517&translateId=612`, fallbacks:['/main/task','/main/rank','/main/map','/main/record','/rule-reward'] }
    ]
  },
  {
    id:'hatching-chicks-2023', title:'Falla Happy Hatching Chicks 2023 · 七日成长', level:'L4',
    units:[
      { label:'孵化成长', project:'act-hatching-chicks', seed:`${TEST_SHELL}#/act-hatching-chicks/main/task?activityId=198&translateId=317`, fallbacks:['/main/task','/main/rank','/main/record','/rule-reward'] }
    ]
  },
  {
    id:'diwali-festival-2025', title:'Falla Diwali Festival 2025 · 点灯收集', level:'L4',
    units:[
      { label:'Diwali 点灯', project:'act-diwali-festival-25', seed:`${SHELL}#/act-diwali-festival-25/main/lottery?activityId=1342&translateId=1031`, fallbacks:['/main/lottery','/main/rank','/main/task','/rule-reward/rule-desc','/rule-reward/reward'] }
    ]
  },
  {
    id:'blind-box-challenge-2025', title:'Falla Surprise Box Challenge 2025', level:'L4',
    units:[
      { label:'Surprise Box', project:'act-blind-box-challenge-25', seed:`${SHELL}#/act-blind-box-challenge-25/main/blind-box?activityId=1181&translateId=954`, fallbacks:['/main/blind-box','/main/task','/main/rank','/main/record','/rule-reward/rule-desc','/rule-reward/reward'] }
    ]
  },
  {
    id:'black-diamond-2024', title:'Falla Black Diamond 2024 · 新货币与奖池', level:'L4', conditional:true,
    units:[
      { label:'Gem System', project:'act-black-diamond', seed:`${TEST_SHELL}#/act-black-diamond?activityId=391&translateId=526`, fallbacks:['/','/main','/main/store','/store','/rule-reward'] },
      { label:'Gem Lottery', project:'act-black-diamond-lottery', seed:`${TEST_SHELL}#/act-black-diamond-lottery?activityId=427&translateId=551`, fallbacks:['/','/main','/main/lottery','/main/record','/rule-reward'] },
    ]
  }
];

const sha = data => crypto.createHash('sha256').update(data).digest('hex');
const short = data => sha(data).slice(0,12);
const sleep = ms => new Promise(r=>setTimeout(r,ms));
async function ensure(p){ await fs.mkdir(p,{recursive:true}); }
async function writeJson(p,v){ await ensure(path.dirname(p)); await fs.writeFile(p,JSON.stringify(v,null,2)); }
function extFrom(url,ctype=''){
  let ext=''; try{ext=path.extname(new URL(url).pathname).toLowerCase();}catch{}
  if(ext && ext.length<=9)return ext;
  if(/json/i.test(ctype))return '.json'; if(/javascript/i.test(ctype))return '.js'; if(/css/i.test(ctype))return '.css';
  if(/html/i.test(ctype))return '.html'; if(/svg/i.test(ctype))return '.svg'; if(/png/i.test(ctype))return '.png';
  if(/jpe?g/i.test(ctype))return '.jpg'; if(/webp/i.test(ctype))return '.webp'; if(/gif/i.test(ctype))return '.gif';
  if(/font|woff/i.test(ctype))return '.woff2'; if(/video|mp4/i.test(ctype))return '.mp4'; if(/audio/i.test(ctype))return '.mp3';
  return '.bin';
}
function requestKey(method,url,post=''){return `${method.toUpperCase()}|${url}|${sha(post||'')}`;}
function urlMethodKey(method,url){return `${method.toUpperCase()}|${url}`;}
function pathMethodKey(method,url){try{const u=new URL(url);return `${method.toUpperCase()}|${u.origin}${u.pathname}`;}catch{return `${method.toUpperCase()}|${url}`;}}
function buildUrl(seed,routePath){
  const u=new URL(seed); const m=u.hash.match(/^#\/(act-[^/?#]+)(?:\/[^?]*)?(\?.*)?$/i); if(!m)return seed;
  let p=routePath||'/'; if(!p.startsWith('/'))p='/'+p; return `${u.origin}${u.pathname}#/${m[1]}${p==='/'?'':p}${m[2]||''}`;
}
function cleanRoute(v){
  if(!v)return null; let s=String(v).trim().replace(/\\\//g,'/'); if(/^(?:https?:|data:|blob:|#)/i.test(s))return null;
  if(!s.startsWith('/'))s='/'+s; s=s.split('?')[0].replace(/\/+/g,'/'); if(s.length>120)return null;
  if(/\.(?:png|jpe?g|webp|gif|svg|js|css|json|woff2?|ttf|mp3|mp4|svga)$/i.test(s))return null;
  if(!/(?:main|rule|reward|rank|task|daily|map|record|lottery|blind|pk|store|shop|challenge|gift|achievement|travel)/i.test(s))return null;
  return s;
}
function extractRoutes(text){
  const out=new Set(); const pats=[/path\s*:\s*["'`]([^"'`]{1,120})["'`]/g,/["'`](\/(?:main|rule-reward|rule|reward|task|rank|store)[A-Za-z0-9_\-/:]*)["'`]/g];
  for(const re of pats)for(const m of text.matchAll(re)){const p=cleanRoute(m[1]);if(p)out.add(p);} return out;
}
async function smoothScroll(page){
  await page.evaluate(async()=>{const wait=ms=>new Promise(r=>setTimeout(r,ms));let y=0;for(let i=0;i<120;i++){const h=Math.max(document.body?.scrollHeight||0,document.documentElement?.scrollHeight||0);scrollTo(0,y);await wait(150);if(y+innerHeight>=h-8)break;y+=Math.max(340,Math.floor(innerHeight*.68));}scrollTo(0,0);await wait(450);}).catch(()=>{});
}
async function pageMetrics(page){
  return page.evaluate(()=>({title:document.title,href:location.href,bodyText:(document.body?.innerText||'').slice(0,40000),htmlLength:document.documentElement?.outerHTML?.length||0,scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement?.scrollHeight||0),imageCount:document.images.length,loadedImages:[...document.images].filter(i=>i.complete&&i.naturalWidth>0).length,brokenImages:[...document.images].filter(i=>i.complete&&(i.currentSrc||i.src)&&i.naturalWidth===0).map(i=>i.currentSrc||i.src).slice(0,100),hrefs:[...document.querySelectorAll('a[href]')].map(a=>a.href).slice(0,300)}));
}
async function mapLimit(items,limit,fn){const out=new Array(items.length);let cursor=0;async function worker(){while(true){const i=cursor++;if(i>=items.length)return;out[i]=await fn(items[i],i);}}await Promise.all(Array.from({length:limit},worker));return out;}

await fs.rm(OUT,{recursive:true,force:true}); await ensure(path.join(OUT,'objects')); await ensure(path.join(OUT,'pages'));
const records=new Map(), byUrl=new Map(), byPath=new Map(), captureErrors=[];
async function storeResponse(response,pageId){
  const req=response.request(), method=req.method(), url=response.url(); if(OPTIONAL.test(url))return;
  let body; try{body=await response.body();}catch(e){captureErrors.push({pageId,url,error:String(e)});return;}
  const headers=await response.allHeaders().catch(()=>({})), post=req.postData()||'', key=requestKey(method,url,post), bodyHash=sha(body), objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;
  try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
  const rec={key,method,url,postDataHash:sha(post),status:response.status(),statusText:response.statusText(),headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:[pageId]};
  if(records.has(key))records.get(key).pageIds.push(pageId);else records.set(key,rec);
  if(!byUrl.has(urlMethodKey(method,url)))byUrl.set(urlMethodKey(method,url),rec); if(!byPath.has(pathMethodKey(method,url)))byPath.set(pathMethodKey(method,url),rec);
}
async function captureOnline(browser,def,ordinal){
  const pageId=`${String(ordinal).padStart(3,'0')}-${short(def.url)}`, dir=path.join(OUT,'pages',def.campaignId,pageId); await ensure(dir);
  const context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  const page=await context.newPage(), pending=[], errors=[], consoleLog=[];
  page.on('response',r=>pending.push(storeResponse(r,`${def.campaignId}/${pageId}`)));
  page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});
  page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)})); page.on('console',m=>{if(['error','warning'].includes(m.type()))consoleLog.push({type:m.type(),text:m.text()});});
  let navError=null; try{await page.goto(def.url,{waitUntil:'domcontentloaded',timeout:70000});await sleep(ONLINE_WAIT);await smoothScroll(page);await sleep(650);}catch(e){navError=String(e);}
  await Promise.allSettled(pending); const metrics=await pageMetrics(page).catch(()=>({}));
  await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});
  await fs.writeFile(path.join(dir,'online-dom.html'),await page.content().catch(()=>'')); await page.screenshot({path:path.join(dir,'online-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{});
  await writeJson(path.join(dir,'online-errors.json'),errors); await writeJson(path.join(dir,'console.json'),consoleLog); await context.close();
  return {...def,pageId,onlineMetrics:metrics,onlineNavError:navError,onlineErrors:errors,onlineScreenshot:`pages/${def.campaignId}/${pageId}/online-full.png`};
}
function recordFor(method,url,post=''){
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlMethodKey(method,url))||byPath.get(pathMethodKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlMethodKey(method,noQuery))||byPath.get(pathMethodKey(method,noQuery));}catch{}}
  return rec;
}
async function captureOffline(browser,online){
  const dir=path.join(OUT,'pages',online.campaignId,online.pageId), context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  let served=0,missing=0,ignored=0; const errors=[],missingUrls=[];
  await context.route('**/*',async route=>{const req=route.request(),method=req.method(),url=req.url(); if(OPTIONAL.test(url)){ignored++;return route.fulfill({status:204,body:''});} const rec=recordFor(method,url,req.postData()||''); if(!rec){missing++;missingUrls.push({method,url});return route.abort('failed');} try{const body=await fs.readFile(path.join(OUT,rec.objectPath)),headers={...rec.headers};for(const k of ['content-encoding','content-length','transfer-encoding'])delete headers[k];headers['x-pro-falla-local']='original-byte';await route.fulfill({status:rec.status||200,headers,body});served++;}catch(e){missing++;errors.push({type:'serve',url,text:String(e)});await route.abort('failed');}});
  const page=await context.newPage(); page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)})); page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});
  let navError=null; try{await page.goto(online.url,{waitUntil:'domcontentloaded',timeout:70000});await sleep(OFFLINE_WAIT);await smoothScroll(page);await sleep(500);}catch(e){navError=String(e);}
  const metrics=await pageMetrics(page).catch(()=>({})); await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});
  await fs.writeFile(path.join(dir,'offline-dom.html'),await page.content().catch(()=>'')); await page.screenshot({path:path.join(dir,'offline-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{}); await writeJson(path.join(dir,'offline-errors.json'),errors); await writeJson(path.join(dir,'offline-missing.json'),missingUrls); await context.close();
  return {...online,offlineMetrics:metrics,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};
}
async function discoverDefs(unit,seedCapture){
  const routes=new Set(unit.fallbacks||[]); const hrefs=seedCapture.onlineMetrics?.hrefs||[];
  for(const href of hrefs){try{const u=new URL(href),m=u.hash.match(new RegExp(`^#/${unit.project}([^?]*)`,'i'));if(m){const p=cleanRoute(m[1]);if(p)routes.add(p);}}catch{}}
  for(const rec of records.values()){
    if(!rec.url.toLowerCase().includes(`/falla-web/${unit.project.toLowerCase()}/`)&&!rec.url.toLowerCase().includes(`/${unit.project.toLowerCase()}/`))continue;
    if(!/(?:javascript|json|css|html|text)/i.test(rec.contentType||'')&&!/\.(?:js|json|css|html)$/i.test(rec.url))continue;
    try{const text=(await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8');for(const p of extractRoutes(text))routes.add(p);}catch{}
  }
  const priority=p=>/task|daily|lottery|blind|map|pk|challenge|store|shop/i.test(p)?0:/rank|record/i.test(p)?1:/rule|reward/i.test(p)?2:3;
  const ordered=[...routes].filter(Boolean).sort((a,b)=>priority(a)-priority(b)||a.localeCompare(b)).slice(0,ROUTE_LIMIT);
  const defs=[]; for(const p of ordered){const url=buildUrl(unit.seed,p);if(url!==unit.seed)defs.push({campaignId:unit.campaignId,unitId:unit.unitId,unitLabel:unit.label,project:unit.project,label:p.replace(/^\/+/,'').replaceAll('/',' · ')||unit.label,url,optional:unit.optional||false});}
  return defs;
}
async function staticClosure(){
  const abs=/https?:\/\/[^\s"'<>\\)]+/g,rel=/(?:["'`](\.\.?\/|\/)?[^"'`<>\s]+\.(?:png|jpe?g|webp|gif|svg|js|mjs|css|json|woff2?|ttf|otf|eot|mp3|ogg|wav|mp4|mov|webm|svga)(?:\?[^"'`]*)?["'`])/gi;let added=0;
  for(let pass=0;pass<3;pass++){const candidates=new Set();for(const rec of [...records.values()]){if(!/(?:text|javascript|json|css|html|svg)/i.test(rec.contentType||'')&&!/\.(?:js|css|json|html|svg)$/i.test(rec.url))continue;let text='';try{text=(await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8');}catch{continue;}for(const m of text.matchAll(abs)){try{const u=new URL(m[0]);if(ALLOWED_ARCHIVE_HOSTS.has(u.hostname))candidates.add(u.href);}catch{}}for(const m of text.matchAll(rel)){let raw=m[0].slice(1,-1);try{const u=new URL(raw,rec.url);if(ALLOWED_ARCHIVE_HOSTS.has(u.hostname))candidates.add(u.href);}catch{}}}
    const todo=[...candidates].filter(url=>!byUrl.has(urlMethodKey('GET',url))&&!byPath.has(pathMethodKey('GET',url)));let cursor=0,passAdded=0;async function worker(){while(true){const i=cursor++;if(i>=todo.length)return;const url=todo[i];try{const r=await fetch(url,{headers:{'user-agent':UA,'accept':'*/*'},redirect:'follow',signal:AbortSignal.timeout(15000)});if(!r.ok)continue;const body=Buffer.from(await r.arrayBuffer()),headers=Object.fromEntries(r.headers.entries()),bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}const rec={key:requestKey('GET',url,''),method:'GET',url,postDataHash:sha(''),status:r.status,statusText:r.statusText,headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:['static-closure']};records.set(rec.key,rec);byUrl.set(urlMethodKey('GET',url),rec);if(!byPath.has(pathMethodKey('GET',url)))byPath.set(pathMethodKey('GET',url),rec);added++;passAdded++;}catch{}}}
    await Promise.all(Array.from({length:12},worker));console.log(`CLOSURE pass=${pass+1} candidates=${todo.length} added=${passAdded}`);if(!passAdded)break;
  }return added;
}

const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});
const units=[];for(const campaign of campaigns)for(const [i,u] of campaign.units.entries())units.push({...u,campaignId:campaign.id,unitId:`${campaign.id}--${String(i+1).padStart(2,'0')}--${u.project}`});
const seedDefs=units.map(u=>({campaignId:u.campaignId,unitId:u.unitId,unitLabel:u.label,project:u.project,label:u.label,url:u.seed,optional:u.optional||false,seed:true}));
console.log(`SEEDS ${seedDefs.length}`);const seedCaptures=await mapLimit(seedDefs,PAGE_CONCURRENCY,(d,i)=>captureOnline(browser,d,i+1));
const extraDefs=[];for(let i=0;i<units.length;i++)extraDefs.push(...await discoverDefs(units[i],seedCaptures[i]));
const uniqueDefs=[];const seenUrls=new Set(seedDefs.map(x=>x.url));for(const d of extraDefs){if(seenUrls.has(d.url))continue;seenUrls.add(d.url);uniqueDefs.push(d);}console.log(`EXTRA_ROUTES ${uniqueDefs.length}`);
const extraCaptures=await mapLimit(uniqueDefs,PAGE_CONCURRENCY,(d,i)=>captureOnline(browser,d,seedDefs.length+i+1));const onlinePages=[...seedCaptures,...extraCaptures];
const closureAdded=await staticClosure();console.log(`OFFLINE ${onlinePages.length}`);const offlinePages=await mapLimit(onlinePages,PAGE_CONCURRENCY,p=>captureOffline(browser,p));await browser.close();

const campaignResults=[];
for(const campaign of campaigns){
  const campaignPages=offlinePages.filter(p=>p.campaignId===campaign.id);const unitResults=[];
  for(const unit of campaign.units){const unitId=units.find(x=>x.campaignId===campaign.id&&x.project===unit.project)?.unitId;let pages=campaignPages.filter(p=>p.unitId===unitId);const seen=new Set(),unique=[];for(const p of pages){const text=(p.offlineMetrics?.bodyText||'').replace(/\s+/g,' ').slice(0,1800),fp=sha(`${p.offlineMetrics?.scrollHeight||0}|${text}`);if(seen.has(fp))continue;seen.add(fp);unique.push(p);}pages=unique;unitResults.push({id:unitId,label:unit.label,project:unit.project,optional:unit.optional||false,pageCount:pages.length,attemptedPageCount:campaignPages.filter(p=>p.unitId===unitId).length,pages,offlineMissing:pages.reduce((a,p)=>a+p.offlineMissingCount,0),brokenImages:pages.reduce((a,p)=>a+(p.offlineMetrics?.brokenImages?.length||0),0),navErrors:pages.filter(p=>p.offlineNavError).length,originalBundleReplay:pages.length>0&&pages.every(p=>!p.offlineNavError&&p.offlineMissingCount===0)});}
  campaignResults.push({id:campaign.id,title:campaign.title,level:campaign.level,conditional:campaign.conditional||false,unitCount:unitResults.length,pageCount:unitResults.reduce((a,u)=>a+u.pageCount,0),attemptedPageCount:unitResults.reduce((a,u)=>a+u.attemptedPageCount,0),units:unitResults,offlineMissing:unitResults.reduce((a,u)=>a+u.offlineMissing,0),brokenImages:unitResults.reduce((a,u)=>a+u.brokenImages,0),navErrors:unitResults.reduce((a,u)=>a+u.navErrors,0),originalBundleReplay:unitResults.filter(u=>!u.optional).every(u=>u.originalBundleReplay)});
}
const recordList=[...records.values()].sort((a,b)=>a.url.localeCompare(b.url)),uniqueBytes=new Map();for(const r of recordList)uniqueBytes.set(r.sha256,r.bytes);
const manifest={generatedAt:new Date().toISOString(),methodology:'Original Falla production responses captured byte-for-byte. Offline QA aborts every unmapped request; no iframe and no handwritten activity UI.',viewport:VIEWPORT,campaignCount:campaignResults.length,unitCount:campaignResults.reduce((a,c)=>a+c.unitCount,0),pageCount:campaignResults.reduce((a,c)=>a+c.pageCount,0),attemptedPageCount:offlinePages.length,originalFileCount:uniqueBytes.size,originalBytes:[...uniqueBytes.values()].reduce((a,b)=>a+b,0),staticClosureAdded:closureAdded,captureErrors:captureErrors.length,campaigns:campaignResults,rawByteComplete:campaignResults.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.brokenImages===0&&c.navErrors===0&&c.originalBundleReplay)};
await writeJson(path.join(OUT,'manifest.json'),manifest);await writeJson(path.join(OUT,'records.json'),recordList);await writeJson(path.join(OUT,'capture-errors.json'),captureErrors);await fs.writeFile(path.join(OUT,'SHA256SUMS.txt'),recordList.map(r=>`${r.sha256}  ${r.objectPath}  ${r.url}`).join('\n'));await fs.writeFile(path.join(OUT,'README.md'),`# Pro Falla Batch 3 Original SPA Archive\n\n${manifest.campaignCount} campaigns / ${manifest.unitCount} SPA units / ${manifest.pageCount} unique views / ${manifest.originalFileCount} original files.\n\nEvery offline screenshot is rendered by the original Falla bundle from locally archived bytes.\n`);
console.log(JSON.stringify({campaigns:manifest.campaignCount,units:manifest.unitCount,pages:manifest.pageCount,files:manifest.originalFileCount,bytes:manifest.originalBytes,closureAdded,rawByteComplete:manifest.rawByteComplete,results:campaignResults.map(c=>({id:c.id,units:c.unitCount,pages:c.pageCount,missing:c.offlineMissing,broken:c.brokenImages,nav:c.navErrors,replay:c.originalBundleReplay}))},null,2));
