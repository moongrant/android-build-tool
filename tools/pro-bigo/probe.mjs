import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { chromium } from 'playwright';

const OUT = path.resolve('pro-bigo-rich-probe-output');
fs.rmSync(OUT, { recursive: true, force: true });
fs.mkdirSync(OUT, { recursive: true });
const hash = (buf) => crypto.createHash('sha256').update(buf).digest('hex');
const safe = (value) => String(value).replace(/[^a-zA-Z0-9._-]+/g, '_').slice(0, 160) || 'item';

const targets = [
  {
    slug: 'annual-festival-award-2025',
    label: 'Annual Festival Award 2025',
    url: 'https://static-fed.bigolive.tv/live/pages/bigolive/annual-festival-award-2025/index.html'
  },
  {
    slug: 'bigo-summer-2026-apply',
    label: 'BIGO Summer 2026 application branch',
    url: 'https://static-fed.bigolive.tv/live/pages/bigolive/act-49334/index.html#/apply49334/2238'
  }
];

function classify(text) {
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
    reward: /reward|prize|gift|beans|coupon|奖励|奖品|礼物/
  };
  return Object.entries(tests).filter(([, re]) => re.test(s)).map(([key]) => key);
}

async function autoScroll(page) {
  await page.evaluate(async () => {
    const wait = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
    const candidates = [document.scrollingElement, document.documentElement, document.body, ...document.querySelectorAll('*')]
      .filter(Boolean)
      .filter((el) => el.scrollHeight > el.clientHeight + 80)
      .sort((a, b) => b.scrollHeight - a.scrollHeight);
    const scroller = candidates[0] || document.scrollingElement;
    const max = Math.min(scroller?.scrollHeight || 0, 50000);
    for (let y = 0; y <= max; y += 650) {
      if ([document.scrollingElement, document.documentElement, document.body].includes(scroller)) window.scrollTo(0, y);
      else scroller.scrollTop = y;
      await wait(70);
    }
    if ([document.scrollingElement, document.documentElement, document.body].includes(scroller)) window.scrollTo(0, 0);
    else scroller.scrollTop = 0;
  }).catch(() => {});
}

function assetPath(root, urlString, contentType = '') {
  const url = new URL(urlString);
  let pathname = decodeURIComponent(url.pathname || '/');
  if (pathname.endsWith('/')) pathname += 'index.html';
  let ext = path.extname(pathname);
  if (!ext) {
    if (contentType.includes('javascript')) ext = '.js';
    else if (contentType.includes('css')) ext = '.css';
    else if (contentType.includes('json')) ext = '.json';
    else if (contentType.includes('html')) ext = '.html';
    else if (contentType.includes('png')) ext = '.png';
    else if (contentType.includes('jpeg')) ext = '.jpg';
    else if (contentType.includes('webp')) ext = '.webp';
    else if (contentType.includes('woff')) ext = '.woff2';
    else if (contentType.includes('video')) ext = '.mp4';
    else ext = '.bin';
    pathname += ext;
  }
  const query = url.search ? `__q_${hash(Buffer.from(url.search)).slice(0, 12)}` : '';
  const parsed = path.parse(pathname);
  const dir = path.join(root, 'raw', safe(url.hostname), parsed.dir.replace(/^\/+/, ''));
  fs.mkdirSync(dir, { recursive: true });
  return path.join(dir, `${safe(parsed.name)}${query}${safe(parsed.ext)}`);
}

const browser = await chromium.launch({ headless: true, args: ['--disable-dev-shm-usage', '--autoplay-policy=no-user-gesture-required'] });
const summary = [];
for (const target of targets) {
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
  const pending = new Set();
  page.on('response', (response) => {
    const task = (async () => {
      const headers = await response.allHeaders().catch(() => ({}));
      const contentType = headers['content-type'] || '';
      let body = null;
      let error = null;
      try { body = await response.body(); } catch (e) { error = String(e); }
      let file = null;
      if (body?.length && body.length <= 30 * 1024 * 1024) {
        const absolute = assetPath(dir, response.url(), contentType);
        fs.writeFileSync(absolute, body);
        file = path.relative(dir, absolute);
      }
      responses.push({ url: response.url(), status: response.status(), contentType, size: body?.length || 0, file, error });
    })();
    pending.add(task);
    task.finally(() => pending.delete(task));
  });
  let navigationError = null;
  try {
    await page.goto(target.url, { waitUntil: 'domcontentloaded', timeout: 120000 });
    await page.waitForTimeout(9000);
    await autoScroll(page);
    await page.waitForTimeout(1000);
  } catch (error) {
    navigationError = String(error);
  }
  const info = await page.evaluate(() => ({
    title: document.title,
    url: location.href,
    text: (document.body?.innerText || '').replace(/\s+/g, ' ').trim().slice(0, 50000),
    width: Math.max(document.documentElement.scrollWidth, document.body?.scrollWidth || 0),
    height: Math.max(document.documentElement.scrollHeight, document.body?.scrollHeight || 0),
    links: [...document.querySelectorAll('a[href],iframe[src]')].map((el) => el.href || el.src).filter(Boolean),
    scripts: [...document.scripts].map((el) => el.src).filter(Boolean),
    styles: [...document.querySelectorAll('link[rel="stylesheet"]')].map((el) => el.href).filter(Boolean),
    controls: [...document.querySelectorAll('button,a,[role="button"],[class*="tab" i],[class*="btn" i]')]
      .map((el) => ({ text: (el.innerText || el.getAttribute('aria-label') || '').replace(/\s+/g, ' ').trim().slice(0, 180), href: el.href || '', cls: typeof el.className === 'string' ? el.className.slice(0, 240) : '' }))
      .filter((item) => item.text || item.href)
      .slice(0, 300)
  })).catch((error) => ({ error: String(error) }));
  await page.screenshot({ path: path.join(dir, 'full.png'), fullPage: true, animations: 'disabled', caret: 'hide' }).catch(() => {});
  fs.writeFileSync(path.join(dir, 'page.html'), await page.content().catch(() => ''));
  await Promise.allSettled([...pending]);
  const allText = `${info.title || ''} ${info.text || ''} ${JSON.stringify(info.controls || [])} ${JSON.stringify(info.links || [])}`;
  const result = {
    target,
    navigationError,
    info,
    features: classify(allText),
    responseCount: responses.length,
    responseBytes: responses.reduce((sum, item) => sum + (item.size || 0), 0),
    responseHosts: [...new Set(responses.map((item) => { try { return new URL(item.url).hostname; } catch { return ''; } }).filter(Boolean))].sort(),
    responses
  };
  fs.writeFileSync(path.join(dir, 'manifest.json'), JSON.stringify(result, null, 2));
  summary.push({ slug: target.slug, label: target.label, url: target.url, finalUrl: info.url, title: info.title, text: info.text, height: info.height, features: result.features, responseCount: result.responseCount, responseBytes: result.responseBytes });
  await context.close();
}
await browser.close();
fs.writeFileSync(path.join(OUT, 'summary.json'), JSON.stringify(summary, null, 2));
console.log(JSON.stringify(summary, null, 2));
