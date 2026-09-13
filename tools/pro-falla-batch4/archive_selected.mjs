import { chromium } from 'playwright';
import fs from 'node:fs/promises';
import path from 'node:path';
import crypto from 'node:crypto';

const OUT = path.resolve(process.env.OUT_DIR || 'artifacts/pro-falla-batch4-original-spa');
const VIEWPORT = { width: 390, height: 844 };
const ONLINE_WAIT = Number(process.env.ONLINE_WAIT_MS || 5600);
const OFFLINE_WAIT = Number(process.env.OFFLINE_WAIT_MS || 4200);
const CONCURRENCY = Number(process.env.PAGE_CONCURRENCY || 3);
const UA = 'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36 ProFallaArchive/4.0';
const SHELL = 'https://web.fallaweb.com/main/index.html';

const OPTIONAL = /(?:google-analytics\.com|googletagmanager\.com|doubleclick\.net|firebase|rumt-us\.com)/i;
const ARCHIVE_HOSTS = new Set([
  'web.fallaweb.com','web.falla.live','web-test.falla.live','webf.fallalive.com','static.fallaweb.com',
  'res-g.resygg.com','falla-res1.resygg.com','activity.falla.live','api.apifalla.com','apihk.falla.live'
]);

const campaigns = [
  {
    id:'game-championship-2025', title:'Falla Game Championship 2025', level:'L4+',
    units:[{
      label:'Game Championship', project:'act-game-championship', activityId:1133, translateId:938,
      seed:`${SHELL}#/act-game-championship/main/rank?activityId=1133&translateId=938`,
      routes:['/main/rank','/main/task','/main/reward','/rank-reward','/rule-desc','/rule-reward']
    }]
  },
  {
    id:'national-honor-tournament-2025', title:'Falla National Honor Tournament 2025', level:'L4+',
    units:[{
      label:'National Honor Tournament', project:'act-country-pk-2507', activityId:1222, translateId:973,
      seed:`${SHELL}#/act-country-pk-2507/main/rank/country?activityId=1222&translateId=973`,
      routes:['/main/rank/country','/main/rank/user','/main/task','/lottery','/main/reward','/rule-reward']
    }]
  },
  {
    id:'room-tournament-2025', title:'Falla Room Tournament 2025', level:'L4+',
    units:[{
      label:'Room Tournament', project:'act-room-tournament', activityId:833, translateId:817,
      seed:`${SHELL}#/act-room-tournament/main/rank/room?activityId=833&translateId=817`,
      routes:['/main/pk','/main/task','/main/rank/room','/main/rank/owner','/main/reward','/rule-reward']
    }]
  },
  {
    id:'snow-adventure-2026', title:'Falla Snow Adventure 2026', level:'L4',
    units:[{
      label:'Snow Adventure', project:'act-team-treasure-2512', activityId:1445, translateId:1096,
      seed:`${SHELL}#/act-team-treasure-2512/main/task/team?activityId=1445&translateId=1096`,
      routes:['/main/task/team','/main/task/individual','/main/rank','/rank-reward','/rule-desc','/rule-reward']
    }]
  },
  {
    id:'world-travel-2025', title:'Falla World Travel 2025', level:'L4',
    units:[{
      label:'World Travel', project:'act-world-travel-25', activityId:1386, translateId:1051,
      seed:`${SHELL}#/act-world-travel-25/main/lottery?activityId=1386&translateId=1051`,
      routes:['/main/lottery','/main/task','/main/rank','/main/reward','/rule-reward']
    }]
  },
  {
    id:'treasure-hunt-2024', title:'Falla Treasure Hunt 2024', level:'L4+',
    units:[{
      label:'Treasure Hunt', project:'act-treasure-hunt', activityId:694, translateId:759,
      seed:`${SHELL}#/act-treasure-hunt/main/pk?activityId=694&translateId=759`,
      routes:['/main/pk','/main/lottery','/main/task','/main/rank','/main/reward','/rank-reward','/rule-desc','/rule-reward']
    }]
  },
  {
    id:'masked-party-2025', title:'Falla Masked Party 2025', level:'L4', conditional:true,
    units:[{
      label:'Masked Party', project:'act-masked-party-v2', activityId:1523, translateId:1150,
      seed:`${SHELL}#/act-masked-party-v2/main/task?activityId=1523&translateId=1150`,
      routes:['/main/task','/main/rank','/main/reward','/rule-reward']
    }]
  }
];

const sha = data => crypto.createHash('sha256').update(data).digest('hex');
const short = value => sha(value).slice(0,12);
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
function urlKey(method,url){return `${method.toUpperCase()}|${url}`;}
function pathKey(method,url){try{const u=new URL(url);return `${method.toUpperCase()}|${u.origin}${u.pathname}`;}catch{return `${method.toUpperCase()}|${url}`;}}
function buildUrl(unit,route){
  let p=route||'/'; if(!p.startsWith('/'))p='/'+p;
  return `${SHELL}#/${unit.project}${p==='/'?'':p}?activityId=${unit.activityId}&translateId=${unit.translateId}`;
}
async function smoothScroll(page){
  await page.evaluate(async()=>{const w=ms=>new Promise(r=>setTimeout(r,ms));let y=0;for(let i=0;i<140;i++){const h=Math.max(document.body?.scrollHeight||0,document.documentElement?.scrollHeight||0);scrollTo(0,y);await w(160);if(y+innerHeight>=h-8)break;y+=Math.max(340,Math.floor(innerHeight*.68));}scrollTo(0,0);await w(500);}).catch(()=>{});
}
async function metrics(page){
  return page.evaluate(()=>({
    title:document.title,href:location.href,text:(document.body?.innerText||'').slice(0,50000),htmlLength:document.documentElement?.outerHTML?.length||0,
    scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement?.scrollHeight||0),imageCount:document.images.length,
    loadedImages:[...document.images].filter(i=>i.complete&&i.naturalWidth>0).length,
    brokenImages:[...document.images].filter(i=>{const raw=(i.getAttribute('src')||i.getAttribute('srcset')||'').trim();return i.complete&&raw&&i.naturalWidth===0;}).map(i=>i.currentSrc||i.src).slice(0,100),
    visibleError:/error request|please try again later|page.*doesn.t exist|activity not found|404/i.test(document.body?.innerText||'')
  }));
}
async function mapLimit(items,limit,fn){const out=new Array(items.length);let cursor=0;async function worker(){while(true){const i=cursor++;if(i>=items.length)return;out[i]=await fn(items[i],i);}}await Promise.all(Array.from({length:limit},worker));return out;}

await fs.rm(OUT,{recursive:true,force:true}); await ensure(path.join(OUT,'objects')); await ensure(path.join(OUT,'pages'));
const records=new Map(),byUrl=new Map(),byPath=new Map(),captureErrors=[];
async function storeResponse(response,pageId){
  const req=response.request(),method=req.method(),url=response.url(); if(OPTIONAL.test(url))return;
  let body; try{body=await response.body();}catch(e){captureErrors.push({pageId,url,error:String(e)});return;}
  const headers=await response.allHeaders().catch(()=>({})),post=req.postData()||'',key=requestKey(method,url,post),bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;
  try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}
  const rec={key,method,url,postDataHash:sha(post),status:response.status(),statusText:response.statusText(),headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:[pageId]};
  if(records.has(key))records.get(key).pageIds.push(pageId);else records.set(key,rec);
  if(!byUrl.has(urlKey(method,url)))byUrl.set(urlKey(method,url),rec);if(!byPath.has(pathKey(method,url)))byPath.set(pathKey(method,url),rec);
}
function recordFor(method,url,post=''){
  let rec=records.get(requestKey(method,url,post))||byUrl.get(urlKey(method,url))||byPath.get(pathKey(method,url));
  if(!rec&&method==='GET'){try{const u=new URL(url);const noQuery=`${u.origin}${u.pathname}`;rec=byUrl.get(urlKey(method,noQuery))||byPath.get(pathKey(method,noQuery));}catch{}}
  return rec;
}
function fixtureFor(method,url){
  let u;try{u=new URL(url);}catch{return null;}
  if(!/(?:api\.apifalla\.com|apihk\.falla\.live)$/i.test(u.hostname))return null;
  const p=u.pathname.toLowerCase(); const now=Math.floor(Date.now()/1000); let res={}; let kind='empty-object';
  if(p.includes('servertime')){res={serverTime:now,timestamp:now,time:now};kind='server-time';}
  else if(p.includes('/rank')||p.includes('ranklist')||p.includes('carousel')||p.includes('/records')){res=[];kind='empty-list';}
  else if(p.includes('activities_config/group')){res=[];kind='empty-group';}
  else if(p.includes('activities_config/user')||p.includes('/user/info')||p.includes('/user/simple/info')){res={uid:0,nickName:'',avatar:'',isLogin:false};kind='anonymous-user';}
  else if(p.includes('/user/coin')){res={coin:0,balance:0};kind='zero-balance';}
  else if(p.includes('/task/v2/info')){res={dailyTaskList:[],staircaseTaskList:[],taskList:[],score:0};kind='empty-task-state';}
  else if(p.includes('/prizepackage/')||p.includes('/probability/')){res={list:[],records:[],awards:[],prizeList:[]};kind='empty-prize-state';}
  else if(p.includes('countryact/userprocess')){res={countryId:0,process:0,score:0,list:[]};kind='zero-country-process';}
  else if(p.includes('teamrecharge')&&p.includes('teaminfo')){res={hasTeam:false,teamId:0,members:[],score:0};kind='empty-team-state';}
  else if(p.includes('drawpattern')&&p.includes('userprocess')){res={process:0,current:0,records:[],list:[]};kind='zero-draw-process';}
  else if(p.includes('actgamerace')){res={gameList:[],awardList:[],rankList:[],userScore:0,progress:0};kind='empty-game-race';}
  else if(p.includes('winterfestival/grouppk')){res={list:[],records:[],rank:[],progress:0};kind='empty-room-tournament';}
  else if(p.includes('/infos')||p.includes('/info')||p.includes('/state')||p.includes('/process')){res={list:[],records:[],rank:[],progress:0,score:0};kind='empty-state';}
  else return null;
  return {kind,body:Buffer.from(JSON.stringify({code:0,msg:'success',res})),headers:{'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'}};
}
async function badJsonRecord(rec){
  if(!rec||!/json/i.test(rec.contentType||''))return false;
  try{const obj=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));return obj&&typeof obj==='object'&&'code'in obj&&Number(obj.code)!==0;}catch{return false;}
}
async function captureOnline(browser,def,ordinal){
  const pageId=`${String(ordinal+1).padStart(3,'0')}-${short(def.url)}`,dir=path.join(OUT,'pages',def.campaignId,pageId);await ensure(dir);
  const context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  const page=await context.newPage(),pending=[],errors=[];page.on('response',r=>pending.push(storeResponse(r,`${def.campaignId}/${pageId}`)));page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)}));page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});
  let navError=null;try{await page.goto(def.url,{waitUntil:'domcontentloaded',timeout:80000});await sleep(ONLINE_WAIT);await smoothScroll(page);await sleep(600);}catch(e){navError=String(e);}await Promise.allSettled(pending);
  await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});const m=await metrics(page).catch(()=>({}));
  await fs.writeFile(path.join(dir,'online-dom.html'),await page.content().catch(()=>''));await page.screenshot({path:path.join(dir,'online-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{});await writeJson(path.join(dir,'online-errors.json'),errors);await context.close();
  return {...def,pageId,onlineMetrics:m,onlineNavError:navError,onlineErrors:errors,onlineScreenshot:`pages/${def.campaignId}/${pageId}/online-full.png`};
}
async function staticClosure(){
  const abs=/https?:\/\/[^\s"'<>\\)]+/g,quoted=/(?:["'`](\.\.?\/|\/)?[^"'`<>\s]+\.(?:png|jpe?g|webp|gif|svg|js|mjs|css|json|woff2?|ttf|otf|eot|mp3|ogg|wav|mp4|mov|webm|svga)(?:\?[^"'`]*)?["'`])/gi,css=/url\(([^)]+)\)/gi;let added=0;
  for(let pass=0;pass<4;pass++){const candidates=new Set();for(const rec of [...records.values()]){if(!/(?:text|javascript|json|css|html|svg)/i.test(rec.contentType||'')&&!/\.(?:js|css|json|html|svg)$/i.test(rec.url))continue;let text='';try{text=(await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8');}catch{continue;}for(const m of text.matchAll(abs)){try{const u=new URL(m[0]);if(ARCHIVE_HOSTS.has(u.hostname))candidates.add(u.href);}catch{}}for(const re of [quoted,css])for(const m of text.matchAll(re)){let raw=(m[1]||'').trim().replace(/^['"]|['"]$/g,'');if(!raw||raw.startsWith('data:'))continue;try{const u=new URL(raw,rec.url);if(ARCHIVE_HOSTS.has(u.hostname))candidates.add(u.href);}catch{}}}
    const todo=[...candidates].filter(url=>!byUrl.has(urlKey('GET',url))&&!byPath.has(pathKey('GET',url)));let cursor=0,passAdded=0;async function worker(){while(true){const i=cursor++;if(i>=todo.length)return;const url=todo[i];try{const r=await fetch(url,{headers:{'user-agent':UA,'accept':'*/*'},redirect:'follow',signal:AbortSignal.timeout(20000)});if(!r.ok)continue;const body=Buffer.from(await r.arrayBuffer()),headers=Object.fromEntries(r.headers.entries()),bodyHash=sha(body),objectPath=`objects/${bodyHash}${extFrom(url,headers['content-type']||'')}`;try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),body);}const rec={key:requestKey('GET',url,''),method:'GET',url,postDataHash:sha(''),status:r.status,statusText:r.statusText,headers,objectPath,bytes:body.length,sha256:bodyHash,contentType:headers['content-type']||'',pageIds:['static-closure']};records.set(rec.key,rec);byUrl.set(urlKey('GET',url),rec);if(!byPath.has(pathKey('GET',url)))byPath.set(pathKey('GET',url),rec);added++;passAdded++;}catch{}}}await Promise.all(Array.from({length:14},worker));if(!passAdded)break;}
  return added;
}
async function captureOffline(browser,online){
  const dir=path.join(OUT,'pages',online.campaignId,online.pageId),context=await browser.newContext({viewport:VIEWPORT,deviceScaleFactor:1,isMobile:true,hasTouch:true,locale:'en-US',ignoreHTTPSErrors:true,serviceWorkers:'block',userAgent:UA});
  let served=0,missing=0,ignored=0,fixtures=0;const errors=[],missingUrls=[],fixtureUrls=[];
  await context.route('**/*',async route=>{const req=route.request(),method=req.method(),url=req.url();if(OPTIONAL.test(url)){ignored++;return route.fulfill({status:204,body:''});}let rec=recordFor(method,url,req.postData()||'');if(rec&&await badJsonRecord(rec))rec=null;if(!rec){const fx=fixtureFor(method,url);if(fx){fixtures++;fixtureUrls.push({method,url,kind:fx.kind});return route.fulfill({status:200,headers:fx.headers,body:fx.body});}missing++;missingUrls.push({method,url});return route.abort('failed');}try{const body=await fs.readFile(path.join(OUT,rec.objectPath)),headers={...rec.headers};for(const k of ['content-encoding','content-length','transfer-encoding'])delete headers[k];headers['x-pro-falla-local']='original-byte';headers['access-control-allow-origin']='*';await route.fulfill({status:rec.status||200,headers,body});served++;}catch(e){missing++;errors.push({type:'serve',url,text:String(e)});await route.abort('failed');}});
  const page=await context.newPage();page.on('pageerror',e=>errors.push({type:'pageerror',text:String(e?.stack||e)}));page.on('requestfailed',r=>{if(!OPTIONAL.test(r.url()))errors.push({type:'requestfailed',url:r.url(),reason:r.failure()?.errorText||''});});let navError=null;try{await page.goto(online.url,{waitUntil:'domcontentloaded',timeout:80000});await sleep(OFFLINE_WAIT);await smoothScroll(page);await sleep(600);}catch(e){navError=String(e);}await page.addStyleTag({content:'#__vconsole,.vc-switch,.vc-mask{display:none!important}'}).catch(()=>{});const m=await metrics(page).catch(()=>({}));
  await fs.writeFile(path.join(dir,'offline-dom.html'),await page.content().catch(()=>''));await page.screenshot({path:path.join(dir,'offline-full.png'),fullPage:true,animations:'disabled'}).catch(()=>{});await writeJson(path.join(dir,'offline-errors.json'),errors);await writeJson(path.join(dir,'offline-missing.json'),missingUrls);await writeJson(path.join(dir,'offline-fixtures.json'),fixtureUrls);await context.close();
  return {...online,offlineMetrics:m,offlineNavError:navError,offlineServedCount:served,offlineMissingCount:missing,offlineIgnoredCount:ignored,offlineFixtureCount:fixtures,offlineFixtureUrls:fixtureUrls,offlineErrors:errors,offlineScreenshot:`pages/${online.campaignId}/${online.pageId}/offline-full.png`};
}

const defs=[];for(const campaign of campaigns)for(const unit of campaign.units){const routes=[...new Set(unit.routes||[])];for(const route of routes){defs.push({campaignId:campaign.id,campaignTitle:campaign.title,campaignLevel:campaign.level,conditional:campaign.conditional||false,unitId:`${campaign.id}--${unit.project}`,unitLabel:unit.label,project:unit.project,label:route.replace(/^\/+/, '').replaceAll('/',' · ')||unit.label,url:buildUrl(unit,route)});}}
const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);const offline=await mapLimit(online,CONCURRENCY,p=>captureOffline(browser,p));await browser.close();

const results=[];for(const campaign of campaigns){let pages=offline.filter(p=>p.campaignId===campaign.id);const seen=new Set(),unique=[];for(const p of pages){const text=(p.offlineMetrics?.text||'').replace(/\s+/g,' ').slice(0,2200),fp=sha(`${p.offlineMetrics?.scrollHeight||0}|${text}`);if(seen.has(fp))continue;seen.add(fp);unique.push(p);}pages=unique.filter(p=>(p.offlineMetrics?.scrollHeight||0)>=900&&(p.offlineMetrics?.htmlLength||0)>=5000);results.push({id:campaign.id,title:campaign.title,level:campaign.level,conditional:campaign.conditional||false,unitCount:campaign.units.length,pageCount:pages.length,attemptedPageCount:offline.filter(p=>p.campaignId===campaign.id).length,pages,offlineMissing:pages.reduce((a,p)=>a+p.offlineMissingCount,0),historicalApiFixtures:pages.reduce((a,p)=>a+(p.offlineFixtureCount||0),0),brokenImages:pages.reduce((a,p)=>a+(p.offlineMetrics?.brokenImages?.length||0),0),visibleErrors:pages.filter(p=>p.offlineMetrics?.visibleError).length,navErrors:pages.filter(p=>p.offlineNavError).length,originalBundleReplay:pages.length>0&&pages.every(p=>!p.offlineNavError&&p.offlineMissingCount===0)});}
const recordList=[...records.values()].sort((a,b)=>a.url.localeCompare(b.url)),uniqueBytes=new Map();for(const r of recordList)uniqueBytes.set(r.sha256,r.bytes);
const manifest={generatedAt:new Date().toISOString(),methodology:'Original Falla production responses captured byte-for-byte. Offline replay aborts every unmapped non-historical request. Expired user/rank APIs use explicitly labelled anonymous zero-state fixtures; no iframe and no handwritten activity UI.',viewport:VIEWPORT,campaignCount:results.length,pageCount:results.reduce((a,c)=>a+c.pageCount,0),attemptedPageCount:offline.length,originalFileCount:uniqueBytes.size,originalBytes:[...uniqueBytes.values()].reduce((a,b)=>a+b,0),staticClosureAdded:closureAdded,captureErrors:captureErrors.length,historicalApiFixtureCount:results.reduce((a,c)=>a+c.historicalApiFixtures,0),campaigns:results,offlineReplayComplete:results.filter(c=>!c.conditional).every(c=>c.offlineMissing===0&&c.navErrors===0&&c.originalBundleReplay),visualAcceptance:results.filter(c=>!c.conditional).every(c=>c.brokenImages===0&&c.visibleErrors===0&&c.pageCount>=2)};
await writeJson(path.join(OUT,'manifest.json'),manifest);await writeJson(path.join(OUT,'records.json'),recordList);await writeJson(path.join(OUT,'capture-errors.json'),captureErrors);await fs.writeFile(path.join(OUT,'SHA256SUMS.txt'),recordList.map(r=>`${r.sha256}  ${r.objectPath}  ${r.url}`).join('\n'));
const lines=['# Pro Falla Batch 4 Original SPA QA','',`- Campaigns: ${manifest.campaignCount}`,`- Unique offline pages: ${manifest.pageCount}`,`- Original files: ${manifest.originalFileCount}`,`- Original bytes: ${manifest.originalBytes}`,`- Static closure additions: ${manifest.staticClosureAdded}`,`- Historical anonymous fixtures: ${manifest.historicalApiFixtureCount}`,`- Offline replay complete: ${manifest.offlineReplayComplete}`,`- Visual acceptance: ${manifest.visualAcceptance}`,''];for(const c of results){lines.push(`## ${c.title}`,'',`- pages: ${c.pageCount}/${c.attemptedPageCount}`,`- missing: ${c.offlineMissing}`,`- broken: ${c.brokenImages}`,`- visible errors: ${c.visibleErrors}`,`- fixtures: ${c.historicalApiFixtures}`,`- replay: ${c.originalBundleReplay}`,'');}await fs.writeFile(path.join(OUT,'QA-FINAL.md'),lines.join('\n'));console.log(JSON.stringify({campaigns:results.map(c=>({id:c.id,pages:c.pageCount,missing:c.offlineMissing,broken:c.brokenImages,visibleErrors:c.visibleErrors,fixtures:c.historicalApiFixtures,replay:c.originalBundleReplay})),files:manifest.originalFileCount,bytes:manifest.originalBytes,offlineReplayComplete:manifest.offlineReplayComplete,visualAcceptance:manifest.visualAcceptance},null,2));