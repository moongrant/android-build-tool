import fs from 'node:fs';
import path from 'node:path';
import vm from 'node:vm';
import { chromium } from 'playwright';

const SITE = 'https://campaigns-collected.jekae.chatgpt.site/';
const OUT = path.resolve('pro-yalla-next-batch-inventory');
fs.rmSync(OUT, { recursive: true, force: true });
fs.mkdirSync(OUT, { recursive: true });

async function fetchText(url) {
  const response = await fetch(url, { headers: { 'user-agent': 'Mozilla/5.0 Chrome/127 Safari/537.36', 'accept-language': 'zh-CN,zh;q=.9,en;q=.7' } });
  return { status: response.status, url: response.url, text: await response.text(), headers: Object.fromEntries(response.headers.entries()) };
}

const raw = await fetchText(new URL('data/activities.js', SITE));
fs.writeFileSync(path.join(OUT, 'activities.js'), raw.text);

let registry = null;
for (const sandbox of [{ window: {} }, { self: {} }, { globalThis: {} }]) {
  try {
    vm.runInNewContext(raw.text, sandbox, { timeout: 5000 });
    registry = sandbox.window?.REPLICA_REGISTRY || sandbox.self?.REPLICA_REGISTRY || sandbox.globalThis?.REPLICA_REGISTRY || sandbox.REPLICA_REGISTRY;
    if (registry) break;
  } catch {}
}

const browser = await chromium.launch({ headless: true, args: ['--disable-dev-shm-usage', '--no-sandbox'] });
const page = await browser.newPage({ viewport: { width: 1440, height: 1100 } });
let browserRegistry = null;
let navigationError = null;
try {
  await page.goto(SITE, { waitUntil: 'domcontentloaded', timeout: 90000 });
  await page.waitForTimeout(5000);
  browserRegistry = await page.evaluate(() => window.REPLICA_REGISTRY || null);
  await page.screenshot({ path: path.join(OUT, 'site-overview.png'), fullPage: true, animations: 'disabled' });
  fs.writeFileSync(path.join(OUT, 'site-dom.html'), await page.content());
} catch (error) {
  navigationError = String(error);
}
await browser.close();
registry = browserRegistry || registry || {};

const activities = Array.isArray(registry.activities) ? registry.activities : [];
const yalla = activities.filter(item => {
  const haystack = JSON.stringify(item).toLowerCase();
  return String(item.company || '').toLowerCase() === 'yalla' || /\byalla\b/.test(haystack);
});

function urls(value, out = new Set()) {
  if (typeof value === 'string') {
    for (const match of value.matchAll(/https?:\/\/[^\s"'<>]+/g)) out.add(match[0].replace(/[),.;]+$/, ''));
    for (const match of value.matchAll(/(?:^|["'])((?:activities|data|assets|fixtures|screenshots)\/[^"'\s<>]+)/g)) out.add(new URL(match[1], SITE).toString());
  } else if (Array.isArray(value)) {
    for (const item of value) urls(item, out);
  } else if (value && typeof value === 'object') {
    for (const item of Object.values(value)) urls(item, out);
  }
  return out;
}

const normalized = yalla.map(item => {
  const allUrls = [...urls(item)].sort();
  const officialUrls = allUrls.filter(url => /activity2\.yalla\.live|yalla\.live|file\.yalla\.live|peakxyz|yallalive/i.test(url));
  const localUrls = allUrls.filter(url => url.startsWith(SITE));
  const folders = [...new Set(localUrls.map(url => {
    const match = new URL(url).pathname.match(/\/activities\/([^/]+)\//);
    return match?.[1] || null;
  }).filter(Boolean))];
  const projectSlugs = [...new Set(officialUrls.map(url => {
    try {
      const parts = new URL(url).pathname.split('/').filter(Boolean);
      const index = parts.findIndex(x => /\d{4}dist/i.test(x));
      return index >= 0 ? parts[index + 1] || null : null;
    } catch { return null; }
  }).filter(Boolean))];
  return {
    id: item.id || item.slug || item.key || null,
    title: item.title || item.name || null,
    company: item.company || null,
    category: item.category || item.type || null,
    campaign: item.campaign || item.parentCampaign || null,
    favorite: item.favorite ?? item.starred ?? item.collected ?? null,
    localFolders: folders,
    officialUrls,
    projectSlugs,
    allUrls,
    raw: item
  };
});

const ids = new Set();
const folders = new Set();
const slugs = new Set();
const officialRoots = new Set();
for (const item of normalized) {
  if (item.id) ids.add(String(item.id).toLowerCase());
  for (const x of item.localFolders) folders.add(x.toLowerCase());
  for (const x of item.projectSlugs) slugs.add(x.toLowerCase());
  for (const url of item.officialUrls) {
    try { const u = new URL(url); u.hash = ''; officialRoots.add((u.origin + u.pathname).replace(/\/?$/, '/').toLowerCase()); } catch {}
  }
}

const output = {
  generatedAt: new Date().toISOString(),
  site: SITE,
  activitiesJsStatus: raw.status,
  navigationError,
  totalActivities: activities.length,
  yallaActivities: normalized.length,
  dedupe: { ids: [...ids].sort(), localFolders: [...folders].sort(), projectSlugs: [...slugs].sort(), officialRoots: [...officialRoots].sort() },
  activities: normalized
};
fs.writeFileSync(path.join(OUT, 'yalla-site-inventory.json'), JSON.stringify(output, null, 2));

const rows = ['| # | ID | Title | Project Slug | Local Folder | Official URL |','|---:|---|---|---|---|---|'];
normalized.forEach((item, index) => rows.push(`| ${index + 1} | ${item.id || ''} | ${String(item.title || '').replace(/\|/g,'/')} | ${item.projectSlugs.join('<br>')} | ${item.localFolders.join('<br>')} | ${item.officialUrls.join('<br>')} |`));
fs.writeFileSync(path.join(OUT, 'YALLA-SITE-INVENTORY.md'), ['# Current Campaigns Collected Yalla Inventory','',`- Total cards: ${activities.length}`,`- Yalla cards: ${normalized.length}`,'',...rows].join('\n'));
console.log(JSON.stringify({ totalActivities: activities.length, yallaActivities: normalized.length, ids: ids.size, folders: folders.size, slugs: slugs.size, officialRoots: officialRoots.size }, null, 2));
