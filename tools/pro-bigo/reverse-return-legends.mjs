import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { chromium } from 'playwright';

const OUT = path.resolve('pro-bigo-return-legends-reverse');
fs.rmSync(OUT, { recursive: true, force: true });
fs.mkdirSync(path.join(OUT, 'assets'), { recursive: true });
const sha = (value) => crypto.createHash('sha256').update(value).digest('hex');
const safe = (value) => String(value).replace(/[^a-zA-Z0-9._-]+/g, '_').slice(0, 180) || 'item';
const base = 'https://static-fed.bigolive.tv/live/pages/bigolive/main-venue-2025-N0x29P/index.html';
const variants = [
  ['plain', base],
  ['ar-sa', `${base}?lang=ar&country=SA&area=AR&nDevice=mobile`],
  ['en-sa', `${base}?lang=en&country=SA&area=AR&nDevice=mobile`],
  ['app-source', `${base}?lang=ar&country=SA&area=AR&nDevice=mobile&from_source=3&from_id=77327&id=77327`],
  ['debug', `${base}?lang=ar&country=SA&area=AR&nDevice=mobile&eruda=true`]
];

function collectPatterns(text) {
  const urls = [...new Set([...text.matchAll(/https?:\/\/[^\s"'`<>\\]+/g)].map((m) => m[0].replace(/[),.;]+$/, '')))].sort();
  const apiPaths = [...new Set([...text.matchAll(/(?:\/|\\u002F)(?:[a-zA-Z0-9_.-]+\/){1,8}[a-zA-Z0-9_.?=&${}:\/-]+/g)].map((m) => m[0].replaceAll('\\u002F', '/')).filter((s) => /api|rank|task|shop|game|lottery|reward|main|family|anchor|user|venue|activity/i.test(s)))].sort();
  const routes = [...new Set([...text.matchAll(/(?:path|name|route|hash)["']?\s*[:=]\s*["']([^"']{1,120})["']/gi)].map((m) => m[1]).filter((s) => /home|main|rank|task|shop|game|rule|detail|reward|history|family|anchor|user|venue/i.test(s)))].sort();
  const bridgeTerms = [...new Set([...text.matchAll(/[A-Za-z0-9_$.-]{0,50}(?:bridge|nativeapi|nativeApi|callNative|jsBridge|BigoJS)[A-Za-z0-9_$.-]{0,80}/gi)].map((m) => m[0]).filter(Boolean))].sort();
  const featureTerms = [...new Set([...text.matchAll(/.{0,70}(?:task|mission|shop|store|exchange|inventory|backpack|lottery|blind|wish|game|battle|level|upgrade|collect|card|family|team|rank|reward).{0,100}/gi)].map((m) => m[0].replace(/\s+/g, ' ').slice(0, 240)))].slice(0, 1000);
  return { urls, apiPaths, routes, bridgeTerms, featureTerms };
}

async function fetchAsset(url, referer) {
  const response = await fetch(url, { redirect: 'follow', headers: { 'user-agent': 'Mozilla/5.0', referer } });
  const body = Buffer.from(await response.arrayBuffer());
  const contentType = response.headers.get('content-type') || '';
  const pathname = new URL(url).pathname;
  let ext = path.extname(pathname);
  if (!ext) ext = contentType.includes('javascript') ? '.js' : contentType.includes('css') ? '.css' : contentType.includes('html') ? '.html' : '.bin';
  const file = path.join(OUT, 'assets', `${safe(path.basename(pathname, path.extname(pathname)))}_${sha(url).slice(0,10)}${ext}`);
  fs.writeFileSync(file, body);
  return { url, status: response.status, contentType, bytes: body.length, file: path.relative(OUT, file), text: /javascript|css|json|html|text/.test(contentType) ? body.toString('utf8') : '' };
}

const browser = await chromium.launch({ headless: true, args: ['--disable-dev-shm-usage', '--autoplay-policy=no-user-gesture-required'] });
const variantResults = [];
const allAssetUrls = new Set();
for (const [slug, url] of variants) {
  const context = await browser.newContext({
    viewport: { width: 390, height: 844 },
    deviceScaleFactor: 1,
    isMobile: true,
    hasTouch: true,
    locale: slug.includes('ar') ? 'ar-SA' : 'en-US',
    timezoneId: 'Asia/Riyadh',
    userAgent: 'Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 Mobile/15E148 Safari/604.1 BIGO/6.34.0'
  });
  await context.addInitScript(() => {
    const noop = () => undefined;
    window.BIGO = window.BIGO || {};
    window.BigoJSBridge = window.BigoJSBridge || { call: noop, invoke: noop, postMessage: noop };
    window.jsBridge = window.jsBridge || { call: noop, invoke: noop, postMessage: noop };
    window.webkit = window.webkit || { messageHandlers: new Proxy({}, { get: () => ({ postMessage: noop }) }) };
    window.native = window.native || {};
  });
  const page = await context.newPage();
  const consoleMessages = [];
  const failures = [];
  const responses = [];
  page.on('console', (message) => consoleMessages.push({ type: message.type(), text: message.text().slice(0, 5000) }));
  page.on('pageerror', (error) => consoleMessages.push({ type: 'pageerror', text: String(error).slice(0, 5000) }));
  page.on('requestfailed', (request) => failures.push({ url: request.url(), error: request.failure()?.errorText || 'unknown' }));
  page.on('response', (response) => {
    const headers = response.headers();
    responses.push({ url: response.url(), status: response.status(), contentType: headers['content-type'] || '' });
    if (/javascript|css|json|html|text/.test(headers['content-type'] || '')) allAssetUrls.add(response.url());
  });
  let navigationError = null;
  try {
    await page.goto(url, { waitUntil: 'domcontentloaded', timeout: 120000 });
    await page.waitForTimeout(12000);
  } catch (error) { navigationError = String(error); }
  const info = await page.evaluate(() => ({
    title: document.title,
    url: location.href,
    text: (document.body?.innerText || '').replace(/\s+/g, ' ').trim().slice(0, 50000),
    html: document.documentElement.outerHTML,
    bodyHTML: document.body?.innerHTML || '',
    width: Math.max(document.documentElement.scrollWidth, document.body?.scrollWidth || 0),
    height: Math.max(document.documentElement.scrollHeight, document.body?.scrollHeight || 0),
    scripts: [...document.scripts].map((s) => s.src).filter(Boolean),
    styles: [...document.querySelectorAll('link[rel="stylesheet"]')].map((s) => s.href).filter(Boolean),
    storage: { local: { ...localStorage }, session: { ...sessionStorage } },
    globals: Object.keys(window).filter((key) => /bigo|bridge|native|activity|venue|rank|task|shop|game/i.test(key)).sort().slice(0, 500)
  })).catch((error) => ({ error: String(error) }));
  fs.writeFileSync(path.join(OUT, `${slug}.html`), info.html || '');
  await page.screenshot({ path: path.join(OUT, `${slug}.png`), fullPage: true, animations: 'disabled', caret: 'hide' }).catch(() => {});
  variantResults.push({ slug, url, navigationError, info: { ...info, html: undefined, bodyHTML: info.bodyHTML?.slice(0,20000) }, consoleMessages, failures, responses });
  await context.close();
}
await browser.close();

const assets = [];
for (const url of [...allAssetUrls]) {
  try {
    const item = await fetchAsset(url, base);
    assets.push(item);
    const match = item.text.match(/sourceMappingURL=([^\s*]+)/);
    if (match) {
      try {
        const mapUrl = new URL(match[1], url).toString();
        if (!allAssetUrls.has(mapUrl)) assets.push(await fetchAsset(mapUrl, url));
      } catch {}
    }
  } catch (error) {
    assets.push({ url, error: String(error) });
  }
}
const combinedText = assets.map((item) => item.text || '').join('\n');
const discovery = collectPatterns(combinedText);
fs.writeFileSync(path.join(OUT, 'variants.json'), JSON.stringify(variantResults, null, 2));
fs.writeFileSync(path.join(OUT, 'assets.json'), JSON.stringify(assets.map(({ text, ...rest }) => rest), null, 2));
fs.writeFileSync(path.join(OUT, 'discovery.json'), JSON.stringify(discovery, null, 2));
fs.writeFileSync(path.join(OUT, 'discovery.txt'), [
  'URLS', ...discovery.urls, '', 'API PATHS', ...discovery.apiPaths, '', 'ROUTES', ...discovery.routes, '', 'BRIDGE TERMS', ...discovery.bridgeTerms, '', 'FEATURE SNIPPETS', ...discovery.featureTerms
].join('\n'));
console.log(JSON.stringify({ variants: variantResults.map((v) => ({ slug:v.slug,title:v.info?.title,text:v.info?.text,height:v.info?.height,errors:v.consoleMessages.filter((m)=>m.type==='pageerror').slice(0,5) })), assets: assets.length, urls: discovery.urls.length, apiPaths: discovery.apiPaths.length, routes: discovery.routes.length }, null, 2));
