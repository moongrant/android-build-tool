import fs from 'node:fs';
import path from 'node:path';

const label = process.argv[2] || 'scan';
const start = Number(process.argv[3]);
const end = Number(process.argv[4]);
if (!Number.isInteger(start) || !Number.isInteger(end) || start > end) {
  throw new Error('Usage: node scan.mjs <label> <start> <end>');
}

const OUT = path.resolve(`pro-bigo-scan-${label}`);
fs.rmSync(OUT, { recursive: true, force: true });
fs.mkdirSync(path.join(OUT, 'configs'), { recursive: true });

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
const ua = 'Mozilla/5.0 (Linux; Android 15; Pixel 9 Pro) AppleWebKit/537.36 Chrome/132 Mobile Safari/537.36 BIGO/6.34.0';
const activityApi = (id) => `https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid=${id}&actId=${id}`;

function collectStrings(value, output = []) {
  if (value == null) return output;
  if (typeof value === 'string') output.push(value);
  else if (Array.isArray(value)) value.forEach((item) => collectStrings(item, output));
  else if (typeof value === 'object') Object.values(value).forEach((item) => collectStrings(item, output));
  return output;
}

function featureKinds(text, moduleTypes) {
  const s = `${text} ${moduleTypes.join(' ')}`.toLowerCase();
  const tests = {
    task: /task|mission|check.?in|daily|quest|sign.?in|任务|签到/,
    lottery: /lottery|blind|wish|draw|spin|wheel|raffle|抽奖|盲盒|许愿|转盘/,
    shop: /shop|store|exchange|redeem|mall|商店|商城|兑换/,
    growth: /level|grow|growth|upgrade|tree|firework|cake|battle pass|progress|等级|成长|升级|圣诞树|烟花/,
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

function extractUrls(strings) {
  const out = new Set();
  for (const value of strings) {
    for (const match of value.matchAll(/https?:\/\/[^\s"'<>\\]+/g)) out.add(match[0].replace(/[),.;]+$/, ''));
  }
  return [...out].sort();
}

function summarize(json, id) {
  const data = json?.data || {};
  const info = data.act_info || {};
  const modules = Array.isArray(data.act_modular) ? data.act_modular : [];
  const moduleTypes = [...new Set(modules.map((item) => String(item?.type || '')).filter(Boolean))];
  const strings = collectStrings(data);
  const text = strings.join(' ');
  const urls = extractUrls(strings);
  const features = featureKinds(`${info.act_name || ''} ${text}`, moduleTypes);
  const dedicatedUrls = urls.filter((url) => /static-fed\.bigolive\.tv\/live\/pages|static-nova\.bigolive\.tv\/app|bigo\.beego\.qzz\.io|activity\.bigo\.tv\/live\/act\/(?!act_16907)/i.test(url));
  const name = String(info.act_name || '').trim();
  const keywordHits = [...new Set((`${name} ${text}`.toLowerCase().match(/christmas|new year|wishing|wish pool|blind box|tree|firework|red packet|icon|crown|pageant|talent|festival|gala|summer|adventure|treasure|card collection|battle pass/g) || []))];
  const score = features.length + Math.min(5, dedicatedUrls.length * 2) + Math.min(4, keywordHits.length);
  return {
    id: Number(info.id || id),
    name,
    startTime: info.start_time || null,
    endTime: info.end_time || null,
    state: info.state,
    languages: info.lang || [],
    moduleCount: modules.length,
    moduleTypes,
    features,
    featureCount: features.length,
    keywordHits,
    urls,
    dedicatedUrls,
    score
  };
}

async function requestOne(id) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), 15000);
  try {
    const response = await fetch(activityApi(id), {
      redirect: 'follow',
      signal: controller.signal,
      headers: {
        'user-agent': ua,
        accept: 'application/json,text/plain,*/*',
        'accept-language': 'en-US,en;q=0.9',
        referer: `https://activity.bigo.tv/live/act/act_16907/index.html?id=${id}`,
        origin: 'https://activity.bigo.tv'
      }
    });
    if (!response.ok) return null;
    const text = await response.text();
    let json;
    try { json = JSON.parse(text); } catch { return null; }
    if (json?.code !== 0 || !json?.data?.act_info?.id) return null;
    const summary = summarize(json, id);
    return { summary, json };
  } catch {
    return null;
  } finally {
    clearTimeout(timer);
  }
}

async function mapLimit(ids, limit) {
  const output = [];
  let cursor = 0;
  const workers = Array.from({ length: limit }, async () => {
    while (true) {
      const index = cursor++;
      if (index >= ids.length) return;
      const id = ids[index];
      const result = await requestOne(id);
      if (result) output.push(result);
      if ((index + 1) % 250 === 0) console.log(`${label}: ${index + 1}/${ids.length}, valid ${output.length}`);
      await sleep(5);
    }
  });
  await Promise.all(workers);
  return output;
}

const ids = Array.from({ length: end - start + 1 }, (_, index) => start + index);
console.log(`Scanning ${label}: ${start}-${end} (${ids.length} ids)`);
const results = await mapLimit(ids, 24);
results.sort((a, b) => a.summary.id - b.summary.id);

for (const { summary, json } of results) {
  const relevant = summary.score >= 7 || summary.dedicatedUrls.length || summary.keywordHits.length;
  if (relevant) fs.writeFileSync(path.join(OUT, 'configs', `${summary.id}.json`), JSON.stringify(json, null, 2));
}

const valid = results.map((item) => item.summary);
const candidates = valid.filter((item) => item.score >= 7 || item.dedicatedUrls.length || item.keywordHits.length)
  .sort((a, b) => b.score - a.score || a.id - b.id);
const dedicatedUrls = [...new Set(valid.flatMap((item) => item.dedicatedUrls))].sort();
const keywordMatches = valid.filter((item) => item.keywordHits.length).sort((a, b) => a.id - b.id);

fs.writeFileSync(path.join(OUT, 'valid-activities.json'), JSON.stringify(valid, null, 2));
fs.writeFileSync(path.join(OUT, 'rich-candidates.json'), JSON.stringify(candidates, null, 2));
fs.writeFileSync(path.join(OUT, 'keyword-matches.json'), JSON.stringify(keywordMatches, null, 2));
fs.writeFileSync(path.join(OUT, 'dedicated-urls.json'), JSON.stringify(dedicatedUrls, null, 2));
fs.writeFileSync(path.join(OUT, 'summary.json'), JSON.stringify({
  label,
  start,
  end,
  scanned: ids.length,
  validCount: valid.length,
  candidateCount: candidates.length,
  keywordMatchCount: keywordMatches.length,
  dedicatedUrlCount: dedicatedUrls.length,
  generatedAt: new Date().toISOString()
}, null, 2));
console.log(JSON.stringify({ valid: valid.length, candidates: candidates.length, dedicatedUrls: dedicatedUrls.length }, null, 2));
