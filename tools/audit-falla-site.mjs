import { chromium } from 'playwright';
import fs from 'node:fs/promises';
import path from 'node:path';

const SITE = 'https://campaigns-collected.jekae.chatgpt.site/';
const OUT = path.resolve(process.env.OUT_DIR || 'audit-output');
const TARGETS = [
  'card-falla-4th-anniversary-hub-2023',
  'card-falla-5th-anniversary-hub-2024',
  'card-falla-game-level-weekly-support-2024',
  'card-falla-3rd-anniversary-campaign-2022',
  'card-falla-6th-anniversary-campaign-2025',
  'card-falla-king-of-magic-2025',
  'card-falla-king-of-jungle-2025'
];

const sleep = ms => new Promise(r => setTimeout(r, ms));
const ensure = p => fs.mkdir(p, { recursive: true });
const writeJSON = async (p, v) => { await ensure(path.dirname(p)); await fs.writeFile(p, JSON.stringify(v, null, 2)); };
const clean = s => String(s || '').replace(/\s+/g, ' ').trim();

async function clickAny(page, labels) {
  for (const label of labels) {
    const candidates = [
      page.getByRole('button', { name: label, exact: true }),
      page.getByText(label, { exact: true }),
      page.locator(`[aria-label="${label}"]`)
    ];
    for (const locator of candidates) {
      try {
        if (await locator.count() && await locator.first().isVisible()) {
          await locator.first().click({ timeout: 5000 });
          await sleep(1200);
          return { ok: true, label };
        }
      } catch {}
    }
  }
  return { ok: false, labels };
}

async function state(page, label) {
  return page.evaluate(label => {
    const visible = el => {
      if (!el) return false;
      const st = getComputedStyle(el), r = el.getBoundingClientRect();
      return st.display !== 'none' && st.visibility !== 'hidden' && Number(st.opacity || 1) > 0 && r.width > 0 && r.height > 0;
    };
    const cards = [...document.querySelectorAll('[id^="card-"]')].map(el => ({
      id: el.id,
      visible: visible(el),
      text: (el.innerText || el.textContent || '').replace(/\s+/g, ' ').trim().slice(0, 1500),
      className: typeof el.className === 'string' ? el.className : '',
      dataset: { ...el.dataset },
      parentId: el.parentElement?.id || '',
      parentClass: typeof el.parentElement?.className === 'string' ? el.parentElement.className : ''
    }));
    const controls = [...document.querySelectorAll('button,a,[role="button"],label,summary')].map(el => ({
      text: (el.innerText || el.getAttribute('aria-label') || el.getAttribute('title') || '').replace(/\s+/g, ' ').trim().slice(0, 400),
      id: el.id || '',
      className: typeof el.className === 'string' ? el.className : '',
      dataset: { ...el.dataset },
      href: el.href || '',
      visible: visible(el)
    })).filter(x => x.text || x.href);
    const falla = cards.filter(c => c.id.startsWith('card-falla-'));
    return {
      label,
      url: location.href,
      hash: location.hash,
      title: document.title,
      bodyText: (document.body?.innerText || '').slice(0, 70000),
      cards,
      fallaCards: falla,
      visibleFallaCards: falla.filter(c => c.visible),
      controls,
      scripts: [...document.scripts].map(s => ({ src: s.src, type: s.type, inlineLength: (s.textContent || '').length })),
      resources: performance.getEntriesByType('resource').map(r => ({ name:r.name, type:r.initiatorType, transferSize:r.transferSize })),
      dimensions: { width:innerWidth, height:innerHeight, scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement.scrollHeight||0) }
    };
  }, label);
}

async function runContext(browser, name, options) {
  const dir = path.join(OUT, name);
  await ensure(dir);
  const context = await browser.newContext({ ...options, ignoreHTTPSErrors: true, locale:'zh-CN' });
  const page = await context.newPage();
  const errors = [], network = [];
  page.on('pageerror', e => errors.push({ type:'pageerror', text:String(e?.stack || e) }));
  page.on('requestfailed', r => errors.push({ type:'requestfailed', url:r.url(), reason:r.failure()?.errorText || '' }));
  page.on('response', async r => {
    network.push({ url:r.url(), status:r.status(), type:r.request().resourceType(), fromServiceWorker:r.fromServiceWorker() });
  });

  await page.goto(SITE, { waitUntil:'domcontentloaded', timeout:90000 });
  await page.waitForTimeout(12000);
  const result = { initial: await state(page, `${name}-initial`) };
  await page.screenshot({ path:path.join(dir,'overview.png'), fullPage:true, animations:'disabled' });

  result.fallaFilterClick = await clickAny(page, ['Falla','FALLA']);
  result.fallaFilter = await state(page, `${name}-falla-filter`);
  await page.screenshot({ path:path.join(dir,'falla-filter.png'), fullPage:true, animations:'disabled' });

  const views = [
    ['campaign',['Campaign','活动 Campaign','活动']],
    ['children',['子活动','子活动 / 支线','Subcampaign']],
    ['archives',['全部 SPA 档案','SPA 档案','全部档案','Archive']]
  ];
  for (const [key, labels] of views) {
    result[`${key}Click`] = await clickAny(page, labels);
    result[key] = await state(page, `${name}-${key}`);
    await page.screenshot({ path:path.join(dir,`${key}.png`), fullPage:true, animations:'disabled' });
  }

  const probes = [];
  for (const p of ['/data/activities.js','/FALLA_HIERARCHY_AUDIT.md','/FALLA_HIERARCHY_MAP.json','/FALLA_REGISTRY_BACKUP.json','/data/falla-hierarchy.json','/data/falla-hierarchy.js']) {
    const row = await page.evaluate(async p => {
      try { const r = await fetch(p,{cache:'no-store'}); const text = await r.text(); return { p, status:r.status, contentType:r.headers.get('content-type') || '', text }; }
      catch(e) { return { p, status:0, error:String(e), text:'' }; }
    }, p);
    probes.push({ p:row.p, status:row.status, contentType:row.contentType, error:row.error, bytes:new TextEncoder().encode(row.text||'').length });
    if (row.status >= 200 && row.status < 400 && row.text) {
      const filename = p.replace(/^\//,'').replace(/\//g,'__');
      await ensure(path.join(dir,'probes'));
      await fs.writeFile(path.join(dir,'probes',filename),row.text);
    }
  }

  const details = {};
  for (const id of TARGETS) {
    try {
      await page.goto(`${SITE}#${id}`, { waitUntil:'domcontentloaded', timeout:90000 });
      await page.waitForTimeout(5000);
      details[id] = await state(page, `${name}-${id}`);
      await page.screenshot({ path:path.join(dir,`detail-${id}.png`), fullPage:true, animations:'disabled' });
    } catch(e) { details[id] = { error:String(e) }; }
  }

  await writeJSON(path.join(dir,'states.json'),result);
  await writeJSON(path.join(dir,'details.json'),details);
  await writeJSON(path.join(dir,'probes.json'),probes);
  await writeJSON(path.join(dir,'network.json'),network);
  await writeJSON(path.join(dir,'errors.json'),errors);
  await fs.writeFile(path.join(dir,'last-dom.html'),await page.content());
  await context.close();
  return { result, details, probes, network, errors };
}

await fs.rm(OUT,{recursive:true,force:true});
await ensure(OUT);
const browser = await chromium.launch({ headless:true, args:['--no-sandbox','--disable-dev-shm-usage'] });
const desktop = await runContext(browser,'desktop',{viewport:{width:1440,height:1100}});
const mobile = await runContext(browser,'mobile',{viewport:{width:390,height:844},isMobile:true,hasTouch:true,userAgent:'Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 Version/18.0 Mobile/15E148 Safari/604.1'});
await browser.close();

const summarize = ctx => {
  const views = {};
  for (const key of ['initial','fallaFilter','campaign','children','archives']) {
    const s = ctx.result[key]; if (!s) continue;
    views[key] = {
      url:s.url,
      totalCards:s.cards.length,
      fallaCards:s.fallaCards.length,
      visibleFallaCards:s.visibleFallaCards.length,
      visibleFallaIds:s.visibleFallaCards.map(x=>x.id),
      visibleFallaTexts:s.visibleFallaCards.map(x=>x.text.slice(0,250)),
      hierarchyControls:s.controls.filter(x=>/Campaign|子活动|SPA|档案/i.test(x.text)).slice(0,100)
    };
  }
  const details = {};
  for (const [id,s] of Object.entries(ctx.details)) details[id] = s.error ? {error:s.error} : {url:s.url,hash:s.hash,bodyText:s.bodyText.slice(0,6000),controls:s.controls.filter(x=>/Falla|周年|Campaign|父级|子活动|SPA|档案|返回/i.test(x.text)).slice(0,100)};
  return { views, details, probes:ctx.probes, errors:ctx.errors, networkCount:ctx.network.length };
};
const audit = { site:SITE, capturedAt:new Date().toISOString(), desktop:summarize(desktop), mobile:summarize(mobile) };
await writeJSON(path.join(OUT,'audit.json'),audit);

const cv = audit.desktop.views.campaign || {}, ch = audit.desktop.views.children || {}, av = audit.desktop.views.archives || {};
const md = [
  '# Live Falla Hierarchy Audit', '',
  `- Site: ${SITE}`,
  `- Captured: ${audit.capturedAt}`,
  `- Campaign view visible Falla: ${cv.visibleFallaCards ?? 'n/a'}`,
  `- Child view visible Falla: ${ch.visibleFallaCards ?? 'n/a'}`,
  `- Archive view visible Falla: ${av.visibleFallaCards ?? 'n/a'}`,
  `- Desktop errors: ${audit.desktop.errors.length}`,
  `- Mobile errors: ${audit.mobile.errors.length}`,
  '', '## Campaign IDs', '', ...(cv.visibleFallaIds||[]).map(x=>`- ${x}`),
  '', '## Child IDs', '', ...(ch.visibleFallaIds||[]).map(x=>`- ${x}`),
  '', '## Archive IDs', '', ...(av.visibleFallaIds||[]).map(x=>`- ${x}`),
  '', '## Probes', '', ...audit.desktop.probes.map(x=>`- ${x.p}: ${x.status} (${x.bytes} bytes)`),
  '', '## Detail excerpts', ''
];
for (const [id,d] of Object.entries(audit.desktop.details)) md.push(`### ${id}`,'',d.error?`ERROR: ${d.error}`:'```text\n'+d.bodyText.slice(0,2500)+'\n```','');
await fs.writeFile(path.join(OUT,'AUDIT.md'),md.join('\n'));
console.log(JSON.stringify({campaign:cv.visibleFallaCards,children:ch.visibleFallaCards,archives:av.visibleFallaCards,desktopErrors:audit.desktop.errors.length,mobileErrors:audit.mobile.errors.length},null,2));
