import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { chromium } from 'playwright';

const OUT = path.resolve(process.env.YALLA_EXACT_OUT || 'pro-yalla-rich-spa-increment-round5-exact');
fs.rmSync(OUT, { recursive: true, force: true });
for (const dir of ['activities', 'data', 'assets', 'fixtures', 'screenshots', 'registry', 'replay', 'logs']) {
  fs.mkdirSync(path.join(OUT, dir), { recursive: true });
}

const UA = 'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127 Mobile Safari/537.36 Yalla/3.6.2';
const GENERIC_MARKERS = ['the activity has ended', 'activity has ended', 'more coming soon', '404 not found', 'page not found'];
const STATIC_EXT = /\.(?:js|mjs|css|png|jpe?g|webp|gif|svg|ico|json|woff2?|ttf|otf|eot|mp3|wav|ogg|m4a|mp4|webm|map|wasm)(?:[?#]|$)/i;
const TEXT_EXT = /\.(?:html?|js|mjs|css|json|map|svg|txt|xml)(?:[?#]|$)/i;
const SAFE_CLICK = /rule|reward|rank|ranking|list|history|record|shop|store|task|card|illustrat|album|collection|honor|palace|map|island|memory|secret|treasure|medal|planet|cruise|national|season|discount|wallet|invite|feed|barn|game|about|more|info|previous|daily|total/i;
const BLOCK_CLICK = /buy|purchase|recharge|top.?up|pay|withdraw|delete|logout|submit|confirm|send|claim|draw|spin|ride|start|open|attack|feed now|upgrade now/i;
const MAX_BODY = 80 * 1024 * 1024;

const targets = [
  {
    id: 'yalla-8th-anniversary-2024', name: '8th Anniversary · Explore the Yalla World', year: 2024,
    campaign: 'Yalla 8th Anniversary 2024', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2024dist/8thAnniversary/', fixed: '2024-05-25T12:00:00+02:00',
    projectSlug: '8thAnniversary',
    routes: ['/', '/secretTreasure', '/exploreMedals', '/riskIsland', '/memoryGate', '/privacy'],
    keywords: ['anniversary', 'yalla world', 'secret treasure', 'explore medals', 'risk island', 'memory gate'],
    mechanism: 'World-map exploration with challenge islands, treasure, medals, memory content and staged rewards.'
  },
  {
    id: 'yalla-9th-anniversary-2025', name: '9th Anniversary · Starlight Gala', year: 2025,
    campaign: 'Yalla 9th Anniversary 2025', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2025dist/9thAnniversary/', fixed: '2025-05-25T12:00:00+02:00',
    projectSlug: '9thAnniversary',
    routes: ['/', '/main', '/mysteryPlanet', '/honor', '/rewards', '/rank', '/rules'],
    keywords: ['9th anniversary', 'starlight gala', 'mystery planet', 'planet', 'honor', 'anniversary'],
    mechanism: 'Starlight journey campaign with planets, missions, honors and reward layers.'
  },
  {
    id: 'yalla-season-2026', name: 'Yalla Season · Four Surprises', year: 2026,
    campaign: 'Yalla Season 2026', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2025dist/yallaSeason/', fixed: '2026-07-25T12:00:00+03:00',
    projectSlug: 'yallaSeason',
    routes: ['/', '/signIn', '/signInRewards', '/discountStore', '/cruiseParty', '/rechargeBenefits', '/nationalDay'],
    keywords: ['yalla season', 'sign-in', 'discount store', 'cruise party', 'recharge benefits', 'national day'],
    mechanism: 'Seasonal campaign combining sign-in retention, discount commerce, cruise-party interaction, recharge benefits and a national-day branch.'
  },
  {
    id: 'yalla-10th-anniversary-2026', name: '10th Anniversary · Crowned with Honor', year: 2026,
    campaign: 'Yalla 10th Anniversary 2026', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2026dist/10thAnniversary/', fixed: '2026-05-25T12:00:00+03:00',
    projectSlug: '10thAnniversary',
    routes: ['/', '/main', '/mission', '/collection', '/honor', '/rewards', '/rank', '/rules'],
    keywords: ['10th anniversary', 'crowned with honor', 'crown', 'honor', 'collection', 'anniversary'],
    mechanism: 'Flagship anniversary SPA with missions, collection, honor, reward and competitive layers.'
  },
  {
    id: 'yalla-ramadan-kareem-2026', name: 'Ramadan Kareem 2026', year: 2026,
    campaign: 'Yalla Ramadan 2026', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2026dist/Ramadan/', fixed: '2026-03-01T12:00:00+03:00',
    projectSlug: 'Ramadan',
    routes: ['/', '/main', '/cards', '/store', '/rank', '/rewards', '/rules', '/records'],
    keywords: ['ramadan', 'kareem', 'lantern', 'blessing', 'discount', 'store', 'card', 'ranking'],
    mechanism: 'Gift-driven four-item unlock loop with milestone rewards, discount commerce, cards and dual rankings.'
  },
  {
    id: 'yalla-sheep-farm-2026', name: 'Sheep Farm · Eid al-Adha', year: 2026,
    campaign: 'Yalla Sheep Farm 2026', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2024dist/adha/', fixed: '2026-05-25T12:00:00+03:00',
    projectSlug: 'adha',
    routes: ['/', '/rewards', '/games', '/wallet', '/invite', '/feed', '/store', '/tasks', '/barn'],
    keywords: ['sheep farm', 'eid', 'adha', 'rewards', 'games', 'wallet', 'invite', 'feed', 'store', 'tasks', 'barn'],
    mechanism: 'Farm-growth activity with feeding, tasks, wallet, invitation, games, store, barn and rewards.'
  },
  {
    id: 'yalla-super-roller-coaster-2024', name: 'Super Roller Coaster', year: 2024,
    campaign: 'Yalla WonderLand / New Year 2025', parentCampaign: 'Yalla WonderLand / New Year 2025',
    root: 'https://activity2.yalla.live/activity/2024dist/rollerCoaster/', fixed: '2024-11-30T12:00:00+02:00',
    projectSlug: 'rollerCoaster',
    routes: ['/', '/main', '/rewards', '/records', '/rank', '/rules'],
    keywords: ['roller coaster', 'ride', 'ticket', 'upgrade', 'reward', 'record', 'wonderland'],
    mechanism: 'Ticket-driven ride progression with visual track advancement, upgrades, records and rewards.'
  },
  {
    id: 'yalla-wonderland-new-year-2025', name: 'WonderLand · New Year Carnival', year: 2025,
    campaign: 'Yalla WonderLand / New Year 2025', parentCampaign: null,
    root: 'https://activity2.yalla.live/activity/2024dist/2025NewYear/', fixed: '2024-12-20T12:00:00+02:00',
    projectSlug: '2025NewYear',
    routes: ['/', '/main', '/treasure', '/cards', '/roomRank', '/rules'],
    keywords: ['wonderland', 'sea dominator', 'roller coaster', 'ferris wheel', 'illustrated cards', 'treasure chest', 'room ranking'],
    mechanism: 'Parent campaign map connecting independent child SPAs, a shared card system, treasure chest and room ranking.'
  }
];

function sha256(value) { return crypto.createHash('sha256').update(value).digest('hex'); }
function safe(value, limit = 170) { return String(value || '').replace(/^https?:\/\//, '').replace(/[^A-Za-z0-9._-]+/g, '_').replace(/^_+|_+$/g, '').slice(0, limit) || 'item'; }
function normalize(urlString, stripCache = false) {
  const url = new URL(urlString);
  url.hash = '';
  if (stripCache) for (const key of ['_', 't', 'ts', 'timestamp', 'v', 'version', 'cb', 'cache']) url.searchParams.delete(key);
  const entries = [...url.searchParams.entries()].sort(([a, av], [b, bv]) => a.localeCompare(b) || av.localeCompare(bv));
  url.search = '';
  for (const [key, value] of entries) url.searchParams.append(key, value);
  return url.toString();
}
function pathKey(urlString) { const url = new URL(urlString); return url.hostname.toLowerCase() + url.pathname.replace(/\/{2,}/g, '/'); }
function allowedHost(host) { return /(?:^|\.)yalla|yallalive|peakxyz|cloudfront|amazonaws|aliyuncs|oss-/i.test(host); }
function contentExt(contentType, urlString) {
  const url = new URL(urlString); const existing = path.extname(url.pathname);
  if (existing && existing.length <= 8) return existing;
  const type = String(contentType || '').toLowerCase();
  if (type.includes('html')) return '.html'; if (type.includes('javascript')) return '.js'; if (type.includes('css')) return '.css';
  if (type.includes('json')) return '.json'; if (type.includes('png')) return '.png'; if (type.includes('jpeg')) return '.jpg';
  if (type.includes('webp')) return '.webp'; if (type.includes('gif')) return '.gif'; if (type.includes('svg')) return '.svg';
  if (type.includes('woff2')) return '.woff2'; if (type.includes('woff')) return '.woff'; if (type.includes('font')) return '.ttf';
  if (type.includes('audio')) return '.mp3'; if (type.includes('video')) return '.mp4'; if (type.includes('wasm')) return '.wasm';
  return '.bin';
}
function query(fixed) {
  return new URLSearchParams({ region: '0', showTopBar: 'false', archive: '1', fromH5: '1', userId: '10000001', token: 'archive-replay', v: '999', s: '3', p: '2', t: String(new Date(fixed).getTime()), lang: 'en', language: 'en' }).toString();
}
function stateUrl(target, route = '/') {
  const hash = route === '/' ? '' : `#${route.startsWith('/') ? route : '/' + route}`;
  return `${target.root}?${query(target.fixed)}${hash}`;
}
function isText(urlString, contentType, body) {
  const type = String(contentType || '').toLowerCase();
  return /text|javascript|json|xml|svg/.test(type) || TEXT_EXT.test(urlString) || body?.slice(0, 30).toString('utf8').trim().match(/^[<{[]/);
}
function categoryFor(target, urlString, contentType) {
  const url = new URL(urlString); const root = new URL(target.root);
  if (url.hostname === root.hostname && url.pathname.startsWith(root.pathname)) return 'spa';
  if (/json/i.test(contentType || '') || /(?:\/api\/|\/gateway\/|\/interface\/|rank|record|reward|task)/i.test(url.pathname)) return 'fixtures';
  return 'assets';
}
function localPath(activityDir, target, urlString, contentType) {
  const url = new URL(urlString); let pathname = decodeURIComponent(url.pathname || '/');
  if (pathname.endsWith('/')) pathname += 'index';
  let ext = path.extname(pathname); if (!ext) { ext = contentExt(contentType, urlString); pathname += ext; }
  const parsed = path.parse(pathname); const q = url.search ? `__q_${sha256(url.search).slice(0, 12)}` : '';
  const cat = categoryFor(target, urlString, contentType);
  const dir = path.join(activityDir, cat, 'origins', safe(url.hostname), parsed.dir.replace(/^\/+/, ''));
  fs.mkdirSync(dir, { recursive: true });
  return path.join(dir, `${safe(parsed.name)}${q}${safe(parsed.ext || ext)}`);
}
async function autoScroll(page) {
  await page.evaluate(async () => {
    const wait = ms => new Promise(r => setTimeout(r, ms));
    const candidates = [document.scrollingElement, document.documentElement, document.body, ...document.querySelectorAll('*')]
      .filter(Boolean).filter(el => el.scrollHeight > el.clientHeight + 140).sort((a, b) => b.scrollHeight - a.scrollHeight);
    const scroller = candidates[0] || document.scrollingElement; const max = Math.min(scroller?.scrollHeight || 0, 50000);
    for (let y = 0; y <= max; y += 620) {
      if (scroller === document.scrollingElement || scroller === document.documentElement || scroller === document.body) window.scrollTo(0, y); else scroller.scrollTop = y;
      await wait(80);
    }
    if (scroller === document.scrollingElement || scroller === document.documentElement || scroller === document.body) window.scrollTo(0, 0); else scroller.scrollTop = 0;
  }).catch(() => {});
}
async function revealApp(page) {
  await page.evaluate(() => {
    for (const id of ['finishToast', 'activityFinish', 'activityOver', 'overPage']) {
      const node = document.getElementById(id); if (node) node.style.setProperty('display', 'none', 'important');
    }
    for (const selector of ['[class*="finish" i]', '[class*="ended" i]', '[class*="activity-over" i]']) {
      document.querySelectorAll(selector).forEach(node => {
        const text = (node.innerText || '').toLowerCase();
        if (text.includes('activity') && (text.includes('ended') || text.includes('over'))) node.style.setProperty('display', 'none', 'important');
      });
    }
    const app = document.getElementById('app'); if (app) app.style.setProperty('display', 'block', 'important');
    const loading = document.getElementById('loadingGif'); if (loading) loading.style.setProperty('display', 'none', 'important');
    document.documentElement.style.overflow = 'auto'; document.body.style.overflow = 'auto';
  }).catch(() => {});
}
function extractRoutes(text) {
  const routes = new Set(['/']);
  for (const pattern of [/\bpath\s*:\s*['"]([^'"]{1,160})['"]/g, /['"](#\/[A-Za-z0-9_./?=&%-]{1,160})['"]/g]) {
    for (const match of text.matchAll(pattern)) {
      let value = match[1].replace(/^#/, ''); if (!value.startsWith('/')) value = '/' + value;
      if (!STATIC_EXT.test(value) && !/\/api\/|\/assets\/|\/static\//i.test(value)) routes.add(value);
    }
  }
  return routes;
}
function writeJSON(file, value) { fs.mkdirSync(path.dirname(file), { recursive: true }); fs.writeFileSync(file, JSON.stringify(value, null, 2)); }

const browser = await chromium.launch({ headless: true, args: ['--disable-dev-shm-usage', '--no-sandbox'] });
const registry = [];
const graph = { generatedAt: new Date().toISOString(), nodes: [], edges: [] };
const allShots = [];

for (const target of targets) {
  const activityDir = path.join(OUT, 'activities', target.id);
  for (const dir of ['spa', 'assets', 'fixtures', 'evidence', 'replay', 'screenshots']) fs.mkdirSync(path.join(activityDir, dir), { recursive: true });
  const fixedMs = new Date(target.fixed).getTime();
  const context = await browser.newContext({ viewport: { width: 390, height: 844 }, deviceScaleFactor: 1, isMobile: true, hasTouch: true, locale: 'en-US', timezoneId: 'Africa/Cairo', userAgent: UA, ignoreHTTPSErrors: true });
  await context.addInitScript(({ fixedMs }) => {
    const RealDate = Date; class ArchiveDate extends RealDate { constructor(...args) { super(...(args.length ? args : [fixedMs])); } static now() { return fixedMs; } }
    Object.setPrototypeOf(ArchiveDate, RealDate); window.Date = ArchiveDate;
    const noop = () => {}; const empty = () => '';
    window.__PRO_YALLA_ARCHIVE__ = true;
    window.YallaBridge = window.YallaBridge || { getToken: empty, getUserInfo: () => null, close: noop, share: noop, openRoom: noop };
    window.Android = window.Android || { getToken: empty, getUserInfo: empty, closeWebView: noop, share: noop };
    window.webkit = window.webkit || { messageHandlers: new Proxy({}, { get: () => ({ postMessage: noop }) }) };
  }, { fixedMs });
  await context.setExtraHTTPHeaders({ 'accept-language': 'en-US,en;q=0.9,ar;q=0.6', referer: target.root });
  const page = await context.newPage();
  const records = new Map(); const pathIndex = new Map(); const network = []; const consoleRows = []; const failures = []; const pending = new Set();
  page.on('console', message => consoleRows.push({ type: message.type(), text: message.text().slice(0, 3000) }));
  page.on('pageerror', error => consoleRows.push({ type: 'pageerror', text: String(error).slice(0, 3000) }));
  page.on('requestfailed', request => failures.push({ url: request.url(), method: request.method(), error: request.failure()?.errorText || 'unknown' }));
  page.on('response', response => {
    const task = (async () => {
      const url = response.url(); const headers = await response.allHeaders().catch(() => ({})); const contentType = headers['content-type'] || '';
      let body = null; let error = null;
      try { if (allowedHost(new URL(url).hostname) && response.status() < 400) body = await response.body(); } catch (caught) { error = String(caught); }
      let file = null;
      if (body?.length && body.length <= MAX_BODY) {
        const absolute = localPath(activityDir, target, url, contentType); fs.writeFileSync(absolute, body); file = path.relative(activityDir, absolute).split(path.sep).join('/');
        const normalized = normalize(url); const record = { url: normalized, status: response.status(), contentType, bytes: body.length, sha256: sha256(body), file, method: response.request().method(), source: 'official-browser-response' };
        records.set(normalized, record); records.set(normalize(url, true), record);
        const key = pathKey(url); if (!pathIndex.has(key)) pathIndex.set(key, []); if (!pathIndex.get(key).includes(normalized)) pathIndex.get(key).push(normalized);
      }
      network.push({ url, status: response.status(), method: response.request().method(), resourceType: response.request().resourceType(), contentType, bytes: body?.length || 0, file, error });
    })().catch(() => {});
    pending.add(task); task.finally(() => pending.delete(task));
  });

  const stateRows = []; const stateHashes = new Set(); const routeQueue = [...target.routes]; const routeSeen = new Set();
  async function captureState(routeName, url, source) {
    let navigationError = null;
    try { await page.goto(url, { waitUntil: 'domcontentloaded', timeout: 90000 }); await page.waitForTimeout(10000); } catch (error) { navigationError = String(error); }
    await revealApp(page); await page.waitForTimeout(1800); await autoScroll(page); await page.waitForTimeout(800);
    const info = await page.evaluate(() => ({
      title: document.title, url: location.href, bodyText: (document.body?.innerText || '').replace(/\s+/g, ' ').trim().slice(0, 25000),
      width: Math.max(document.documentElement.scrollWidth, document.body?.scrollWidth || 0), height: Math.max(document.documentElement.scrollHeight, document.body?.scrollHeight || 0),
      appHTMLLength: document.getElementById('app')?.innerHTML.length || 0,
      images: [...document.images].map(image => ({ src: image.currentSrc || image.src, complete: image.complete, width: image.naturalWidth, height: image.naturalHeight })),
      iframes: [...document.querySelectorAll('iframe')].map(frame => frame.src),
      clickables: [...document.querySelectorAll('button,a,[role="button"],[class*="tab" i],[class*="btn" i],[class*="menu" i]')]
        .filter(element => { const rect = element.getBoundingClientRect(); return rect.width > 22 && rect.height > 16; })
        .map((element, index) => ({ index, text: (element.innerText || element.getAttribute('aria-label') || '').replace(/\s+/g, ' ').trim().slice(0, 120), href: element.href || '' }))
        .filter(item => item.text || item.href).slice(0, 180)
    })).catch(error => ({ error: String(error), bodyText: '', width: 0, height: 0, appHTMLLength: 0, images: [], iframes: [], clickables: [] }));
    const image = await page.screenshot({ fullPage: true, animations: 'disabled', caret: 'hide' }).catch(() => null);
    if (!image) return null;
    const imageHash = sha256(image); if (stateHashes.has(imageHash)) return { duplicate: true, clickables: info.clickables };
    stateHashes.add(imageHash);
    const index = stateRows.length + 1; const slug = `${String(index).padStart(2, '0')}-${safe(routeName, 60)}`;
    const screenshot = path.join(activityDir, 'screenshots', `${slug}-online.png`); fs.writeFileSync(screenshot, image);
    const shared = path.join(OUT, 'screenshots', target.id, `${slug}-online.png`); fs.mkdirSync(path.dirname(shared), { recursive: true }); fs.writeFileSync(shared, image); allShots.push({ target, resultPath: shared });
    const html = await page.content().catch(() => ''); fs.writeFileSync(path.join(activityDir, 'replay', `${slug}.html`), html);
    const generic = GENERIC_MARKERS.some(marker => (info.bodyText || '').toLowerCase().includes(marker));
    const row = { label: routeName, source, requestedUrl: url, finalUrl: page.url(), navigationError, screenshot: path.relative(OUT, shared).split(path.sep).join('/'), localScreenshot: path.relative(activityDir, screenshot).split(path.sep).join('/'), html: `replay/${slug}.html`, sha256: imageHash, generic, ...info };
    stateRows.push(row); return row;
  }

  for (const route of [...routeQueue]) {
    if (routeSeen.has(route) || stateRows.length >= 12) continue; routeSeen.add(route);
    await captureState(route === '/' ? 'home' : route.replace(/^\//, ''), stateUrl(target, route), 'configured-route');
  }
  await Promise.allSettled([...pending]);

  for (const record of new Set(records.values())) {
    if (!record.file || !TEXT_EXT.test(record.url)) continue;
    try {
      const text = fs.readFileSync(path.join(activityDir, record.file), 'utf8');
      for (const route of extractRoutes(text)) if (!routeSeen.has(route) && routeQueue.length < 80) routeQueue.push(route);
    } catch {}
  }
  for (const route of routeQueue) {
    if (routeSeen.has(route) || stateRows.length >= 12) continue; routeSeen.add(route);
    await captureState(route.replace(/^\//, '') || 'home', stateUrl(target, route), 'bundle-route');
  }

  const initialClickables = stateRows[0]?.clickables || [];
  const clicked = new Set();
  for (const item of initialClickables) {
    if (stateRows.length >= 12) break;
    const text = String(item.text || '').trim(); if (!text || text.length > 80 || clicked.has(text.toLowerCase())) continue;
    if (!SAFE_CLICK.test(text) || BLOCK_CLICK.test(text)) continue; clicked.add(text.toLowerCase());
    await page.goto(stateUrl(target, '/'), { waitUntil: 'domcontentloaded', timeout: 90000 }).catch(() => {}); await page.waitForTimeout(6500); await revealApp(page);
    try {
      const locator = page.locator('button,a,[role="button"],[class*="tab" i],[class*="btn" i],[class*="menu" i]').filter({ hasText: text }).first();
      if (!(await locator.count())) continue;
      const href = await locator.getAttribute('href').catch(() => null); if (href && /^https?:/i.test(href) && new URL(href).hostname !== new URL(target.root).hostname) continue;
      await locator.click({ force: true, timeout: 6000 }); await page.waitForTimeout(2200); await revealApp(page);
      await captureState(text, page.url(), 'safe-ui-click');
    } catch {}
  }
  await Promise.allSettled([...pending]);

  const uniqueRecords = [...new Map([...records.values()].map(record => [record.url, record])).values()];
  writeJSON(path.join(activityDir, 'evidence', 'network.json'), network);
  writeJSON(path.join(activityDir, 'evidence', 'console.json'), consoleRows);
  writeJSON(path.join(activityDir, 'evidence', 'request-failures.json'), failures);
  writeJSON(path.join(activityDir, 'replay', 'url-map.json'), { rootUrl: target.root, fixedMs, records: Object.fromEntries(records), pathIndex: Object.fromEntries(pathIndex) });

  const replayRunner = `import fs from 'node:fs';\nimport path from 'node:path';\nimport { chromium } from 'playwright';\nconst base=path.resolve(path.dirname(new URL(import.meta.url).pathname));const root=path.resolve(base,'..');const map=JSON.parse(fs.readFileSync(path.join(base,'url-map.json')));\nfunction norm(s,strip=false){const u=new URL(s);u.hash='';if(strip)for(const k of ['_','t','ts','timestamp','v','version','cb','cache'])u.searchParams.delete(k);const e=[...u.searchParams.entries()].sort(([a,av],[b,bv])=>a.localeCompare(b)||av.localeCompare(bv));u.search='';for(const [k,v]of e)u.searchParams.append(k,v);return u.toString()}function key(s){const u=new URL(s);return u.hostname.toLowerCase()+u.pathname.replace(/\\/{2,}/g,'/')}function lookup(s){for(const k of [norm(s),norm(s,true)])if(map.records[k])return map.records[k];const a=map.pathIndex[key(s)]||[];return a.length===1?map.records[a[0]]:null}\nconst route=process.argv[2]||'/';const b=await chromium.launch({headless:false});const c=await b.newContext({viewport:{width:390,height:844},isMobile:true,hasTouch:true,locale:'en-US'});await c.route('**/*',async(r,q)=>{const x=lookup(q.url());if(x)return r.fulfill({status:x.status||200,headers:{'content-type':x.contentType||'application/octet-stream','access-control-allow-origin':'*'},body:fs.readFileSync(path.join(root,x.file))});if(q.method()==='OPTIONS')return r.fulfill({status:204,body:''});return r.fulfill({status:404,headers:{'content-type':'application/json'},body:'{"code":404,"message":"offline fixture unavailable"}'})});const p=await c.newPage();await p.goto(map.rootUrl+'?region=0&archive=1&fromH5=1&userId=10000001&token=archive-replay&lang=en#'+route,{waitUntil:'domcontentloaded'});console.log('Offline replay:',p.url());`;
  fs.writeFileSync(path.join(activityDir, 'replay', 'run_replay.mjs'), replayRunner);
  fs.writeFileSync(path.join(activityDir, 'replay', 'package.json'), JSON.stringify({ type: 'module', dependencies: { playwright: '1.55.0' } }, null, 2));

  await context.close();

  const offlineContext = await browser.newContext({ viewport: { width: 390, height: 844 }, deviceScaleFactor: 1, isMobile: true, hasTouch: true, locale: 'en-US', timezoneId: 'Africa/Cairo', userAgent: UA });
  await offlineContext.addInitScript(({ fixedMs }) => { const RealDate=Date; class ArchiveDate extends RealDate{constructor(...args){super(...(args.length?args:[fixedMs]));}static now(){return fixedMs;}}Object.setPrototypeOf(ArchiveDate,RealDate);window.Date=ArchiveDate;const n=()=>{},e=()=>'';window.YallaBridge=window.YallaBridge||{getToken:e,getUserInfo:()=>null,close:n,share:n,openRoom:n};window.Android=window.Android||{getToken:e,getUserInfo:e,closeWebView:n,share:n}; }, { fixedMs });
  const offlinePage = await offlineContext.newPage(); const qa = { brokenImages: 0, consoleFatalErrors: 0, missingChunks: 0, unmappedRequests: 0, remoteIframes: 0, remoteRuntimeFallback: 0, missingStaticAssets: 0, states: [], unmapped: [] }; let currentUnmapped = []; let currentConsole = [];
  offlinePage.on('console', message => { if (message.type() === 'error') currentConsole.push({ type: 'console', text: message.text().slice(0, 2000) }); });
  offlinePage.on('pageerror', error => currentConsole.push({ type: 'pageerror', text: String(error).slice(0, 2000) }));
  await offlineContext.route('**/*', async (route, request) => {
    let record = records.get(normalize(request.url())) || records.get(normalize(request.url(), true));
    if (!record) { const candidates = pathIndex.get(pathKey(request.url())) || []; if (candidates.length === 1) record = records.get(candidates[0]); }
    if (record) return route.fulfill({ status: record.status || 200, headers: { 'content-type': record.contentType || 'application/octet-stream', 'access-control-allow-origin': '*', 'cache-control': 'no-store' }, body: fs.readFileSync(path.join(activityDir, record.file)) });
    if (request.method() === 'OPTIONS') return route.fulfill({ status: 204, headers: { 'access-control-allow-origin': '*', 'access-control-allow-methods': 'GET,POST,OPTIONS', 'access-control-allow-headers': '*' }, body: '' });
    const category = /\.(?:js|mjs)(?:[?#]|$)/i.test(request.url()) ? 'chunk' : STATIC_EXT.test(request.url()) ? 'static' : 'api';
    currentUnmapped.push({ url: request.url(), method: request.method(), resourceType: request.resourceType(), category });
    return route.fulfill({ status: 404, headers: { 'content-type': category === 'api' ? 'application/json' : 'text/plain', 'access-control-allow-origin': '*' }, body: category === 'api' ? '{"code":404,"message":"offline fixture unavailable"}' : '' });
  });
  for (let index = 0; index < Math.min(stateRows.length, 10); index += 1) {
    const state = stateRows[index]; currentUnmapped = []; currentConsole = [];
    await offlinePage.goto(state.requestedUrl, { waitUntil: 'domcontentloaded', timeout: 90000 }).catch(error => currentConsole.push({ type: 'navigation', text: String(error) }));
    await offlinePage.waitForTimeout(6500); await revealApp(offlinePage); await autoScroll(offlinePage); await offlinePage.waitForTimeout(500);
    const metrics = await offlinePage.evaluate(() => ({ images: [...document.images].map(image => ({ complete: image.complete, width: image.naturalWidth, height: image.naturalHeight })), iframes: [...document.querySelectorAll('iframe')].map(frame => frame.src), height: Math.max(document.documentElement.scrollHeight, document.body?.scrollHeight || 0), text: (document.body?.innerText || '').replace(/\s+/g, ' ').trim().slice(0, 10000) })).catch(() => ({ images: [], iframes: [], height: 0, text: '' }));
    const offlineShot = path.join(OUT, 'screenshots', target.id, `${String(index + 1).padStart(2, '0')}-${safe(state.label, 60)}-offline.png`); fs.mkdirSync(path.dirname(offlineShot), { recursive: true }); await offlinePage.screenshot({ path: offlineShot, fullPage: true, animations: 'disabled' }).catch(() => {});
    const broken = metrics.images.filter(image => !image.complete || !image.width).length; const frames = metrics.iframes.filter(src => src && !src.startsWith('about:') && !src.startsWith('data:')).length;
    const chunks = currentUnmapped.filter(item => item.category === 'chunk').length; const staticMissing = currentUnmapped.filter(item => item.category === 'static').length; const fatals = currentConsole.filter(item => item.type === 'pageerror').length;
    qa.brokenImages += broken; qa.consoleFatalErrors += fatals; qa.missingChunks += chunks; qa.unmappedRequests += currentUnmapped.length; qa.remoteIframes += frames; qa.missingStaticAssets += staticMissing;
    qa.unmapped.push(...currentUnmapped); qa.states.push({ label: state.label, screenshot: path.relative(OUT, offlineShot).split(path.sep).join('/'), brokenImages: broken, remoteIframes: frames, unmappedRequests: currentUnmapped.length, console: currentConsole, height: metrics.height, bodyText: metrics.text });
  }
  await offlineContext.close();
  qa.unmapped = [...new Map(qa.unmapped.map(item => [`${item.method}:${item.url}`, item])).values()]; qa.unmappedRequests = qa.unmapped.length; qa.missingChunks = qa.unmapped.filter(item => item.category === 'chunk').length; qa.missingStaticAssets = qa.unmapped.filter(item => item.category === 'static').length;

  const jsCount = uniqueRecords.filter(record => /javascript/i.test(record.contentType || '') || /\.(?:js|mjs)(?:[?#]|$)/i.test(record.url)).length;
  const cssCount = uniqueRecords.filter(record => /css/i.test(record.contentType || '') || /\.css(?:[?#]|$)/i.test(record.url)).length;
  const imageCount = uniqueRecords.filter(record => /image/i.test(record.contentType || '') || /\.(?:png|jpe?g|webp|gif|svg)(?:[?#]|$)/i.test(record.url)).length;
  const fontCount = uniqueRecords.filter(record => /font/i.test(record.contentType || '') || /\.(?:woff2?|ttf|otf|eot)(?:[?#]|$)/i.test(record.url)).length;
  const fixtureCount = uniqueRecords.filter(record => record.file?.startsWith('fixtures/')).length;
  const keywordHits = [...new Set(stateRows.flatMap(state => target.keywords.filter(keyword => `${state.bodyText || ''}`.toLowerCase().includes(keyword))))];
  const richStates = stateRows.filter(state => state.height > 844 || state.images?.length >= 5 || target.keywords.some(keyword => `${state.bodyText || ''}`.toLowerCase().includes(keyword))).length;
  const officialSpa = jsCount >= 1 && cssCount >= 1 && imageCount >= 3 && uniqueRecords.length >= 12 && stateRows.length >= 1;
  const depthOk = stateRows.length >= 3 && richStates >= 2;
  const qaPassed = qa.brokenImages === 0 && qa.consoleFatalErrors === 0 && qa.missingChunks === 0 && qa.unmappedRequests === 0 && qa.remoteIframes === 0 && qa.remoteRuntimeFallback === 0 && qa.missingStaticAssets === 0;
  const status = officialSpa && depthOk && qaPassed ? 'VERIFIED_OFFICIAL_SPA' : officialSpa ? 'VERIFIED_PARTIAL_SPA' : 'OFFICIAL_URL_EXPIRED';
  const result = { id: target.id, name: target.name, year: target.year, campaign: target.campaign, parentCampaign: target.parentCampaign, officialUrl: target.root, spaRoot: new URL(target.root).pathname, projectSlug: target.projectSlug, routes: [...routeSeen], routeCount: routeSeen.size, stateCount: stateRows.length, fileCount: uniqueRecords.length, assetCount: uniqueRecords.filter(record => STATIC_EXT.test(record.url)).length, apiCount: fixtureCount, fixtureCount, sourceType: 'OFFICIAL_PRODUCTION_FIXED_TIME_BROWSER_CLOSURE', status, quality: status === 'VERIFIED_OFFICIAL_SPA' ? 'A' : officialSpa ? 'B+' : 'C', localReplay: stateRows.length > 0, screenshot: stateRows.length > 0, currentReleaseVerified: status === 'VERIFIED_OFFICIAL_SPA', screenshots: stateRows.map(state => state.screenshot), metrics: { totalBytes: uniqueRecords.reduce((sum, record) => sum + (record.bytes || 0), 0), jsCount, cssCount, imageCount, fontCount, richStateCount: richStates, keywordHits, placeholderContext: 'Static archival shell only; no fabricated users, rankings, rewards or outcomes.' }, qa: { brokenImages: qa.brokenImages, consoleFatalErrors: qa.consoleFatalErrors, missingChunks: qa.missingChunks, unmappedRequests: qa.unmappedRequests, remoteIframes: qa.remoteIframes, remoteRuntimeFallback: qa.remoteRuntimeFallback, missingStaticAssets: qa.missingStaticAssets }, mechanism: target.mechanism, notes: ['Original responses from Yalla production/CDN hosts were preserved.', 'The historical clock and inert archive query reveal the original static SPA beneath the ended overlay.', 'No fabricated user, ranking, reward or gameplay result is included.'] };
  writeJSON(path.join(activityDir, 'activity.json'), result); writeJSON(path.join(activityDir, 'manifest.json'), { activity: result, records: uniqueRecords, states: stateRows, qa, generatedAt: new Date().toISOString() }); registry.push(result);
  graph.nodes.push({ id: target.id, type: 'activity', name: target.name, url: target.root }); for (const record of uniqueRecords) { graph.nodes.push({ id: record.url, type: record.file?.split('/')[0] || 'resource', contentType: record.contentType }); graph.edges.push({ from: target.id, to: record.url, type: 'requests' }); }
}
await browser.close();

function contactSheet() {
  const entries = [];
  for (const result of registry) for (const shot of result.screenshots.slice(0, 3)) { const file = path.join(OUT, shot); if (fs.existsSync(file)) entries.push([result, file]); }
  if (!entries.length) return null;
  return entries;
}

writeJSON(path.join(OUT, 'registry', 'yalla-activity-registry-round5-exact.json'), { schemaVersion: '5.1', generatedAt: new Date().toISOString(), release: 'pro-yalla-rich-spa-increment-round5-exact', minimumDepth: 'Falla Rocket Takeoff 2026 or deeper; no simple ranking-only activities.', summary: Object.fromEntries([...new Set(registry.map(item => item.status))].map(status => [status, registry.filter(item => item.status === status).length])), activities: registry });
const fields = ['id','name','year','campaign','parentCampaign','officialUrl','spaRoot','projectSlug','routeCount','stateCount','fileCount','assetCount','apiCount','fixtureCount','status','quality','localReplay','screenshot','currentReleaseVerified'];
const csv = [fields.join(','), ...registry.map(item => fields.map(field => JSON.stringify(item[field] ?? '')).join(','))].join('\n'); fs.writeFileSync(path.join(OUT, 'registry', 'yalla-activity-registry-round5-exact.csv'), csv);
writeJSON(path.join(OUT, 'data', 'yalla-url-graph-round5-exact.json'), graph);
writeJSON(path.join(OUT, 'data', 'campaign-hierarchy-round5.json'), { campaigns: [{ id: 'yalla-wonderland-new-year-2025', name: 'Yalla WonderLand / New Year 2025', childrenInThisRelease: ['yalla-super-roller-coaster-2024'], knownChildrenInRound4: ['yalla-sea-dominator-2024','yalla-happy-ferris-wheel-2025'] }] });
writeJSON(path.join(OUT, 'assets', 'index.json'), Object.fromEntries(registry.map(item => [item.id, `activities/${item.id}/assets`]))); writeJSON(path.join(OUT, 'fixtures', 'index.json'), Object.fromEntries(registry.map(item => [item.id, `activities/${item.id}/fixtures`]))); writeJSON(path.join(OUT, 'replay', 'index.json'), Object.fromEntries(registry.map(item => [item.id, `activities/${item.id}/replay/run_replay.mjs`])));
const rows = ['| Activity | Year | Routes | States | Files | Assets | Fixtures | QA B/C/M/U | Status |','|---|---:|---:|---:|---:|---:|---:|---|---|',...registry.map(item => `| ${item.name} | ${item.year} | ${item.routeCount} | ${item.stateCount} | ${item.fileCount} | ${item.assetCount} | ${item.fixtureCount} | ${item.qa.brokenImages}/${item.qa.consoleFatalErrors}/${item.qa.missingChunks}/${item.qa.unmappedRequests} | ${item.status} |`)];
fs.writeFileSync(path.join(OUT, 'RESULT-BOARD.md'), ['# Pro-Yalla Rich SPA Increment · Round 5 Exact Capture','',...rows,'','Simple ranking-only pages are excluded. Promotional media and mock UI are not counted as SPA.'].join('\n'));
fs.writeFileSync(path.join(OUT, 'QA.md'), ['# QA','',...registry.flatMap(item => [`## ${item.name}`,'','```json',JSON.stringify(item.qa,null,2),'```',''])].join('\n'));
fs.writeFileSync(path.join(OUT, 'LEARNING-BOARD.md'), ['# Activity Learning Board','',...registry.flatMap((item,index)=>[`## ${index+1}. ${item.name}`,'',`- Mechanism: ${item.mechanism}`,`- Status: \`${item.status}\``,`- States: ${item.stateCount}`,`- Files: ${item.fileCount}`,''])].join('\n'));
fs.writeFileSync(path.join(OUT, 'README.md'), '# Pro-Yalla Rich SPA Increment Round 5 Exact Capture\n\nEight non-ranking-only official Yalla campaign roots were captured with a historical clock and inert archive context. Original HTML, JavaScript, CSS, chunks, images, fonts, JSON, media, API responses, route states, offline request-interception replay, screenshots, Registry and QA are included.\n\nNo promotional image, hand-written mock page, iframe fallback, fabricated user, ranking, reward or gameplay outcome is accepted.\n');
console.log(JSON.stringify({ activities: registry.length, verified: registry.filter(item => item.status === 'VERIFIED_OFFICIAL_SPA').length, partial: registry.filter(item => item.status === 'VERIFIED_PARTIAL_SPA').length, expired: registry.filter(item => item.status === 'OFFICIAL_URL_EXPIRED').length, files: registry.reduce((sum,item)=>sum+item.fileCount,0) }, null, 2));
