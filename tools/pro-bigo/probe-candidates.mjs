import fs from 'node:fs';
import path from 'node:path';
import { chromium } from 'playwright';

const OUT = path.resolve('pro-bigo-candidate-probe-output');
fs.rmSync(OUT, { recursive: true, force: true });
fs.mkdirSync(OUT, { recursive: true });

const targets = [
  ['return-of-legends-main-2025', 'Return of Legends main venue 2025', 'https://static-fed.bigolive.tv/live/pages/bigolive/main-venue-2025-N0x29P/index.html'],
  ['international-carnival-2025', 'Internationale Karneval 2025', 'https://static-fed.bigolive.tv/live/pages/bigolive/act-40236/index.html'],
  ['annual-family-2025', 'Annual Festival Family 2025', 'https://static-fed.bigolive.tv/live/pages/bigolive/annual-festival-family-2025/index.html'],
  ['annual-individual-2025', 'Annual Individual 2025', 'https://static-fed.bigolive.tv/live/pages/bigolive/annual-individual-2025-dDarQ6/index.html'],
  ['family-room-promote', 'Family Room Promote / L aventure BIGO', 'https://static-fed.bigolive.tv/live/pages/bigolive/family-room-promote/index.html'],
  ['sunshine-surprise-party', 'Sunshine Surprise Party', 'https://static-fed.bigolive.tv/live/pages/bigolive/act-86820-pnKQMT/index.html'],
  ['act-84747', 'Unknown campaign act-84747', 'https://static-fed.bigolive.tv/live/pages/bigolive/act-84747-OLaroV/index.html'],
  ['act-85008', 'Unknown campaign act-85008', 'https://static-fed.bigolive.tv/live/pages/bigolive/act-85008-TgX2wL/index.html'],
  ['act-86079', 'Unknown campaign act-86079', 'https://static-fed.bigolive.tv/live/pages/bigolive/act-86079-tGySet/index.html'],
  ['page-33300', 'Page 33300 BIGO', 'https://static-fed.bigolive.tv/live/pages/bigolive/page_33300/index.html?app=bigo']
].map(([slug, label, url]) => ({ slug, label, url }));

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

function features(text) {
  const s = String(text || '').toLowerCase();
  const tests = {
    task: /task|mission|check.?in|daily|quest|sign.?in|任务|签到/,
    lottery: /lottery|blind|wish|draw|spin|wheel|raffle|抽奖|盲盒|许愿|转盘/,
    shop: /shop|store|exchange|redeem|mall|商店|商城|兑换/,
    growth: /level|grow|growth|upgrade|tree|firework|cake|battle pass|progress|等级|成长|升级/,
    game: /game|football|shoot|adventure|map|side.?event|pk|battle|小游戏|足球|地图|冒险/,
    collection: /card|collect|album|dino|collection|图鉴|集卡|收集/,
    stage: /round|stage|revival|semi.?final|final|qualif|promotion|淘汰|复活|半决赛|决赛|晋级/,
    group: /family|clan|team|couple|group|guild|家族|战队|组队|情侣/,
    rank: /rank|leaderboard|ranking|榜单|排行/,
    recharge: /recharge|top.?up|diamond purchase|充值/,
    reward: /reward|prize|gift|beans|coupon|奖励|奖品|礼物/,
    inventory: /inventory|backpack|bag|warehouse|背包|库存/,
    route: /home|main venue|activity center|rules|history|record|details|shop|task|rank/
  };
  return Object.entries(tests).filter(([, re]) => re.test(s)).map(([key]) => key);
}

async function scroll(page) {
  await page.evaluate(async () => {
    const wait = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
    const all = [document.scrollingElement, document.documentElement, document.body, ...document.querySelectorAll('*')]
      .filter(Boolean)
      .filter((el) => el.scrollHeight > el.clientHeight + 100)
      .sort((a, b) => b.scrollHeight - a.scrollHeight);
    const scroller = all[0] || document.scrollingElement;
    const max = Math.min(scroller?.scrollHeight || 0, 60000);
    for (let y = 0; y <= max; y += 650) {
      if ([document.scrollingElement, document.documentElement, document.body].includes(scroller)) window.scrollTo(0, y);
      else scroller.scrollTop = y;
      await wait(65);
    }
    if ([document.scrollingElement, document.documentElement, document.body].includes(scroller)) window.scrollTo(0, 0);
    else scroller.scrollTop = 0;
  }).catch(() => {});
}

const browser = await chromium.launch({ headless: true, args: ['--disable-dev-shm-usage', '--autoplay-policy=no-user-gesture-required'] });
const summary = [];
for (const target of targets) {
  console.log(`Probe ${target.label}`);
  const dir = path.join(OUT, target.slug);
  fs.mkdirSync(dir, { recursive: true });
  const context = await browser.newContext({
    viewport: { width: 390, height: 844 },
    deviceScaleFactor: 1,
    isMobile: true,
    hasTouch: true,
    locale: 'en-US',
    timezoneId: 'Asia/Shanghai',
    userAgent: 'Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 Mobile/15E148 Safari/604.1 BIGO/6.34.0'
  });
  const page = await context.newPage();
  const responses = [];
  const failures = [];
  page.on('response', (response) => responses.push({ url: response.url(), status: response.status(), contentType: response.headers()['content-type'] || '' }));
  page.on('requestfailed', (request) => failures.push({ url: request.url(), error: request.failure()?.errorText || 'unknown' }));
  let navigationError = null;
  try {
    await page.goto(target.url, { waitUntil: 'domcontentloaded', timeout: 120000 });
    await page.waitForTimeout(8000);
    await scroll(page);
    await sleep(800);
  } catch (error) {
    navigationError = String(error);
  }
  const info = await page.evaluate(() => ({
    title: document.title,
    url: location.href,
    hash: location.hash,
    text: (document.body?.innerText || '').replace(/\s+/g, ' ').trim().slice(0, 60000),
    htmlLength: document.documentElement.outerHTML.length,
    width: Math.max(document.documentElement.scrollWidth, document.body?.scrollWidth || 0),
    height: Math.max(document.documentElement.scrollHeight, document.body?.scrollHeight || 0),
    images: [...document.images].map((img) => ({ src: img.currentSrc || img.src, width: img.naturalWidth, height: img.naturalHeight, complete: img.complete })).slice(0, 500),
    links: [...document.querySelectorAll('a[href],iframe[src]')].map((el) => el.href || el.src).filter(Boolean).slice(0, 500),
    scripts: [...document.scripts].map((el) => el.src).filter(Boolean).slice(0, 300),
    controls: [...document.querySelectorAll('button,a,[role="button"],[onclick],[class*="tab" i],[class*="btn" i]')]
      .map((el) => ({ text: (el.innerText || el.getAttribute('aria-label') || '').replace(/\s+/g, ' ').trim().slice(0, 180), href: el.href || '', cls: typeof el.className === 'string' ? el.className.slice(0, 240) : '' }))
      .filter((item) => item.text || item.href)
      .slice(0, 400)
  })).catch((error) => ({ error: String(error) }));
  await page.screenshot({ path: path.join(dir, 'full.png'), fullPage: true, animations: 'disabled', caret: 'hide' }).catch(() => {});
  fs.writeFileSync(path.join(dir, 'page.html'), await page.content().catch(() => ''));
  const responseHosts = [...new Set(responses.map((item) => { try { return new URL(item.url).hostname; } catch { return ''; } }).filter(Boolean))].sort();
  const allText = `${info.title || ''} ${info.text || ''} ${JSON.stringify(info.controls || [])} ${JSON.stringify(info.links || [])}`;
  const manifest = { target, navigationError, info, features: features(allText), responseCount: responses.length, responseHosts, responses, failures };
  fs.writeFileSync(path.join(dir, 'manifest.json'), JSON.stringify(manifest, null, 2));
  summary.push({
    slug: target.slug,
    label: target.label,
    sourceUrl: target.url,
    finalUrl: info.url,
    title: info.title,
    text: info.text,
    height: info.height,
    htmlLength: info.htmlLength,
    imageCount: info.images?.length || 0,
    controlCount: info.controls?.length || 0,
    linkCount: info.links?.length || 0,
    features: manifest.features,
    responseCount: responses.length,
    responseHosts
  });
  await context.close();
}
await browser.close();
fs.writeFileSync(path.join(OUT, 'summary.json'), JSON.stringify(summary, null, 2));
fs.writeFileSync(path.join(OUT, 'summary.tsv'), ['slug\ttitle\theight\tcontrols\tlinks\tfeatures\ttext', ...summary.map((row) => [row.slug,row.title,row.height,row.controlCount,row.linkCount,row.features.join(','),String(row.text||'').slice(0,600)].map((v)=>String(v??'').replace(/\t|\n/g,' ')).join('\t'))].join('\n'));
console.log(JSON.stringify(summary.map(({ slug, title, height, controlCount, linkCount, features }) => ({ slug, title, height, controlCount, linkCount, features })), null, 2));
