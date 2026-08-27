from __future__ import annotations

import concurrent.futures
import json
import os
import re
import time
from pathlib import Path

import requests

START = int(os.environ.get('START_ID', '90000'))
END = int(os.environ.get('END_ID', '106000'))
WORKERS = int(os.environ.get('WORKERS', '56'))
OUT = Path('pro-bigo-complex5-scan-output')
FULL = OUT / 'full'
FULL.mkdir(parents=True, exist_ok=True)

UA = 'Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 Mobile/15E148 BIGO/6.34.0'
HEADERS = {
    'User-Agent': UA,
    'Accept': 'application/json,text/plain,*/*',
    'Accept-Language': 'en-US,en;q=0.9,zh-CN;q=0.8,id;q=0.7,ms;q=0.6,vi;q=0.5',
    'Origin': 'https://activity.bigo.tv',
}

TARGET_TERMS = [
    'summer', 'bigo summer', 'riuh', 'aidilfitri', 'ramadan', 'nuzul',
    'miss bigo', 'bigo icon', 'icon finale', 'christmas', 'xmas', 'new year',
    'wishing pool', 'wish pool', 'fireworks', 'christmas tree', 'blind box',
    'red packet', 'lunar new year', 'fire horse', 'horse year', 'spring festival',
    'world cup', 'esports', 'ewc', 'haus of slay', 'pride', 'anniversary',
    'treasure hunt', 'adventure', 'carnival', 'journey', 'magic', 'kingdom',
    'collection', 'collect card', 'card collection', 'growth', 'battle pass',
    'shop', 'exchange', 'task', 'mission', 'lottery', 'lucky draw', 'wheel',
    'vote', 'audition', 'redemption', 'revival', 'stage', 'track',
    '夏日', '盛夏', '暑期', '开斋', '斋月', '圣诞', '新年', '春节', '马年',
    '盲盒', '许愿', '烟花', '红包', '收集', '成长', '任务', '商店', '抽奖',
    '投票', '复活', '海选', '晋级', '冒险', '周年', '世界杯', '电竞'
]
RICH_TERMS = {
    'task': ['task','mission','quest','daily task','check in','签到','任务','misi','tugas','nhiệm vụ'],
    'game': ['game','spin','wheel','lottery','lucky draw','blind box','gacha','抽奖','转盘','盲盒','小游戏'],
    'collection': ['collect','collection','card','piece','fragment','album','图鉴','收集','卡片','碎片'],
    'growth': ['level','growth','upgrade','progress','tree','fireworks','journey','stage','成长','等级','进度','升级'],
    'shop': ['shop','store','exchange','redeem','inventory','backpack','商店','兑换','背包'],
    'rank': ['rank','ranking','leaderboard','top 10','排行','榜单','排名'],
    'vote': ['vote','voting','audition','judge','redemption','revival','投票','海选','评委','复活'],
    'gift': ['gift','gifting','beans','diamond','send gift','receive gift','礼物','送礼','收礼','钻石','金豆'],
    'reward': ['reward','prize','rebate','bonus','coupon','frame','entrance effect','奖励','奖品','返利','头像框','进场特效'],
    'multi_role': ['host','user','family','clan','supporter','creator','broadcaster','主播','用户','家族','支持者'],
}


def normalize(v):
    return re.sub(r'\s+', ' ', str(v or '')).strip()


def title_of(data):
    ai = data.get('act_info') or {}
    return normalize(
        (ai.get('act_link_info') or {}).get('title')
        or ai.get('share_title') or ai.get('page_title') or ai.get('act_name')
        or data.get('activityName') or ''
    )


def valid(payload, text):
    if not isinstance(payload, dict) or len(text) < 100:
        return False
    code = payload.get('code', payload.get('ret', payload.get('errCode')))
    if code not in (None, 0, 200, '0', '200'):
        return False
    data = payload.get('data', payload.get('result', payload))
    return isinstance(data, (dict, list)) and bool(data)


def fetch_one(act_id):
    url = f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={act_id}&actId={act_id}'
    headers = dict(HEADERS)
    headers['Referer'] = f'https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}'
    for attempt in range(3):
        try:
            r = requests.get(url, headers=headers, timeout=15)
            if r.status_code != 200:
                if r.status_code in (429, 500, 502, 503, 504):
                    time.sleep(0.3 + attempt * 0.7)
                    continue
                return None
            text = r.text
            try:
                payload = r.json()
            except Exception:
                return None
            if not valid(payload, text):
                return None
            data = payload.get('data', payload.get('result', payload))
            title = title_of(data if isinstance(data, dict) else {})
            low = text.lower()
            term_hits = sorted({t for t in TARGET_TERMS if t.lower() in low})
            systems = {k: sorted({t for t in terms if t.lower() in low}) for k, terms in RICH_TERMS.items()}
            system_count = sum(bool(v) for v in systems.values())
            module_count = len(data.get('act_modular') or []) if isinstance(data, dict) else 0
            start = normalize((data.get('act_info') or {}).get('start_time') if isinstance(data, dict) else '')
            end = normalize((data.get('act_info') or {}).get('end_time') if isinstance(data, dict) else '')
            is_2025_26 = '2025' in start + end + title or '2026' in start + end + title
            # Keep target-term matches and rich multi-system pages. The rich fallback catches localized names.
            keep = bool(term_hits) or (is_2025_26 and system_count >= 6 and module_count >= 4)
            if not keep:
                return {'id': act_id, 'valid': True, 'keep': False}
            (FULL / f'{act_id}.json').write_text(json.dumps(payload, ensure_ascii=False, indent=2), 'utf-8')
            return {
                'id': act_id, 'valid': True, 'keep': True, 'title': title,
                'start': start, 'end': end, 'moduleCount': module_count,
                'termHits': term_hits, 'systems': systems, 'systemCount': system_count,
                'bytes': len(text),
            }
        except Exception as exc:
            if attempt == 2:
                return {'id': act_id, 'valid': False, 'error': repr(exc)}
            time.sleep(0.2 + attempt * 0.5)


ids = list(range(START, END + 1))
kept = []
valid_count = 0
errors = []
completed = 0
with concurrent.futures.ThreadPoolExecutor(max_workers=WORKERS) as pool:
    for result in pool.map(fetch_one, ids, chunksize=1):
        completed += 1
        if result:
            if result.get('valid'):
                valid_count += 1
            if result.get('keep'):
                kept.append(result)
            if result.get('error'):
                errors.append(result)
        if completed % 1000 == 0:
            print(f'progress {completed}/{len(ids)} valid={valid_count} kept={len(kept)}', flush=True)

kept.sort(key=lambda x: (-x.get('systemCount', 0), -x.get('moduleCount', 0), x['id']))
summary = {
    'range': [START, END],
    'requested': len(ids),
    'valid': valid_count,
    'kept': len(kept),
    'errors': len(errors),
    'results': kept,
}
(OUT / 'summary.json').write_text(json.dumps(summary, ensure_ascii=False, indent=2), 'utf-8')
(OUT / 'errors.json').write_text(json.dumps(errors, ensure_ascii=False, indent=2), 'utf-8')
print(json.dumps({k:v for k,v in summary.items() if k != 'results'}, ensure_ascii=False, indent=2))
for row in kept[:100]:
    print(row['id'], row['systemCount'], row['moduleCount'], row['title'], row['start'], row['end'], row['termHits'][:8])
