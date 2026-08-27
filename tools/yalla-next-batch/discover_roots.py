from __future__ import annotations

import concurrent.futures
import hashlib
import json
import math
import re
import time
from collections import Counter, defaultdict
from pathlib import Path
from urllib.parse import quote, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path('pro-yalla-next-batch-root-discovery')
OUT.mkdir(parents=True, exist_ok=True)
RAW = OUT / 'raw'
RAW.mkdir(exist_ok=True)

UA = 'Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/127 Mobile Safari/537.36'
S = requests.Session()
S.headers.update({'User-Agent': UA, 'Accept': '*/*', 'Accept-Language': 'en-US,en;q=.9,ar;q=.6'})

SITE = 'https://campaigns-collected.jekae.chatgpt.site/'
KNOWN_SITE_SLUGS = {
    '8thanniversary','9thanniversary','yallaseason','ferriswheel','fw_newyear','rollercoaster','activitymap','adha',
    '10thanniversary','2025newyear','royalvictory','ramadan','recallandrecruit','seadominator','footballcarnival','carking',
}
KNOWN_SITE_IDS = {
    'yalla-8th-anniversary','yalla-9th-anniversary','yalla-season-2025','yalla-happy-ferris-wheel-castle-2025',
    'yalla-super-roller-coaster','yalla-activity-illustrated-cards','yalla-sheep-farm','yalla-10th-anniversary',
    'yalla-wonderland-2025','yalla-royal-victory','yalla-ramadan-2026','yalla-recall-recruit','yalla-sea-dominator',
    'yalla-football-carnival-2024','yalla-monthly-driving-king-2026',
}
RESERVED = {
    'templateactivity','template','assets','asset','static','common','commons','public','index','activityover','error','errors',
    'h5','home','main','dist','js','css','images','image','fonts','font','api','test','demo','share','download','upload',
}
GENERIC_MARKERS = ['the activity has ended','activity has ended','more coming soon','404 not found','page not found','access denied','attention required']
DEPTH_WORDS = {
    'task','tasks','mission','missions','lottery','draw','lucky','wheel','treasure','collect','collection','card','cards','album',
    'map','island','planet','level','upgrade','shop','store','exchange','reward','rewards','record','records','history','game',
    'challenge','stage','milestone','progress','energy','ticket','tickets','coin','coins','point','points','invite','team','room',
    'farm','feed','barn','ocean','sea','ship','castle','ride','car','king','medal','honor','palace','memory','festival','carnival',
    'ramadan','eid','anniversary','new year','national day','season','football','world cup','boss','monster','attack','path','wealth',
}
NEGATIVE_WORDS = {'ranking only','leaderboard only','single ranking','rank list'}
STATIC_EXT = {'.js','.mjs','.css','.png','.jpg','.jpeg','.webp','.gif','.svg','.ico','.json','.map','.woff','.woff2','.ttf','.otf','.eot','.mp3','.wav','.ogg','.mp4','.webm','.wasm'}


def get(url: str, *, timeout=(20, 120), tries=3) -> requests.Response | None:
    for attempt in range(tries):
        try:
            response = S.get(url, timeout=timeout, allow_redirects=True)
            if response.status_code in {429, 500, 502, 503, 504} and attempt + 1 < tries:
                time.sleep(1.5 * (attempt + 1))
                continue
            return response
        except Exception:
            if attempt + 1 < tries:
                time.sleep(1.5 * (attempt + 1))
    return None


def current_site_inventory() -> dict:
    result = {'ids': sorted(KNOWN_SITE_IDS), 'projectSlugs': sorted(KNOWN_SITE_SLUGS), 'rawBytes': 0}
    try:
        response = get(SITE + 'data/activities.js', timeout=(20, 70))
        if response and response.status_code == 200:
            text = response.text
            (RAW / 'site-activities.js').write_text(text, encoding='utf-8')
            result['rawBytes'] = len(response.content)
            ids = {x.lower() for x in re.findall(r'''(?:id|slug)\s*:\s*['\"](yalla-[A-Za-z0-9._-]+)['\"]''', text)}
            ids.update(x.lower() for x in re.findall(r'''['\"](?:id|slug)['\"]\s*:\s*['\"](yalla-[A-Za-z0-9._-]+)['\"]''', text))
            result['ids'] = sorted(set(result['ids']) | ids)
    except Exception as exc:
        result['error'] = repr(exc)
    return result


def parse_root(original: str) -> tuple[str, str, str] | None:
    try:
        parsed = urlparse(original)
        if parsed.hostname != 'activity2.yalla.live':
            return None
        parts = [x for x in parsed.path.split('/') if x]
        if not parts or parts[0].lower() != 'activity':
            return None
        if len(parts) >= 3 and re.fullmatch(r'20\d{2}dist', parts[1], re.I):
            bucket = parts[1]
            project = parts[2]
            root = f'https://activity2.yalla.live/activity/{bucket}/{project}/'
            return bucket, project, root
        if len(parts) >= 3 and re.fullmatch(r'YallaActivity20\d{2}', parts[1], re.I):
            bucket = parts[1]
            project = parts[2]
            root = f'https://activity2.yalla.live/activity/{bucket}/{project}/'
            return bucket, project, root
        return None
    except Exception:
        return None


def ext(url: str) -> str:
    path = urlparse(url).path.lower()
    match = re.search(r'(\.[a-z0-9]{1,6})$', path)
    return match.group(1) if match else ''


def query_cdx(pattern: str, label: str) -> list[dict]:
    url = (
        'https://web.archive.org/cdx/search/cdx?url=' + quote(pattern, safe='') +
        '&output=json&fl=timestamp,original,statuscode,mimetype,digest,length&filter=statuscode:200&collapse=urlkey&limit=50000'
    )
    response = get(url, timeout=(25, 180), tries=4)
    raw = response.text if response is not None else ''
    (RAW / f'{label}.txt').write_text(raw, encoding='utf-8')
    if not response or response.status_code != 200:
        return []
    try:
        data = response.json()
    except Exception:
        return []
    if not isinstance(data, list) or len(data) < 2:
        return []
    header = data[0]
    return [dict(zip(header, row)) for row in data[1:] if isinstance(row, list)]


def commoncrawl_rows() -> list[dict]:
    all_rows: list[dict] = []
    coll = get('https://index.commoncrawl.org/collinfo.json', timeout=(20, 60))
    if not coll or coll.status_code != 200:
        return all_rows
    try:
        indexes = coll.json()[:4]
    except Exception:
        return all_rows
    for index in indexes:
        api = index.get('cdx-api')
        if not api:
            continue
        url = api + '?url=' + quote('activity2.yalla.live/activity/*', safe='') + '&output=json&filter=status:200&collapse=urlkey'
        response = get(url, timeout=(25, 160), tries=2)
        text = response.text if response else ''
        (RAW / f"commoncrawl-{index.get('id','index')}.jsonl").write_text(text[:20_000_000], encoding='utf-8')
        if not response or response.status_code != 200:
            continue
        for line in text.splitlines():
            try:
                row = json.loads(line)
            except Exception:
                continue
            all_rows.append({
                'timestamp': row.get('timestamp',''), 'original': row.get('url',''), 'statuscode': row.get('status',''),
                'mimetype': row.get('mime',''), 'digest': row.get('digest',''), 'length': row.get('length',''),
                'source': index.get('id')
            })
    return all_rows


def fetch_archive(row: dict, max_bytes=8_000_000) -> tuple[bytes, str, str] | None:
    timestamp = str(row.get('timestamp') or '')
    original = str(row.get('original') or '')
    if not timestamp or not original:
        return None
    replay = f'https://web.archive.org/web/{timestamp}id_/{original}'
    response = get(replay, timeout=(20, 100), tries=2)
    if not response or response.status_code != 200 or not response.content or len(response.content) > max_bytes:
        return None
    return response.content, response.headers.get('content-type',''), response.url


def root_snapshot_rows(root: str) -> list[dict]:
    url = (
        'https://web.archive.org/cdx/search/cdx?url=' + quote(root, safe='') +
        '&output=json&fl=timestamp,original,statuscode,mimetype,digest,length&filter=statuscode:200&limit=50'
    )
    response = get(url, timeout=(20, 90), tries=2)
    if not response or response.status_code != 200:
        return []
    try:
        data = response.json()
    except Exception:
        return []
    if not isinstance(data, list) or len(data) < 2:
        return []
    header = data[0]
    return [dict(zip(header, row)) for row in data[1:]]


def inspect_candidate(candidate: dict) -> dict:
    root = candidate['root']
    rows = root_snapshot_rows(root) + root_snapshot_rows(root + 'index.html')
    rows = sorted(rows, key=lambda row: str(row.get('timestamp','')), reverse=True)
    seen = set()
    html_infos = []
    selected_text = ''
    selected_html = None
    for row in rows[:20]:
        key = (row.get('timestamp'), row.get('original'))
        if key in seen:
            continue
        seen.add(key)
        fetched = fetch_archive(row)
        if not fetched:
            continue
        body, content_type, replay = fetched
        text = body.decode('utf-8', 'ignore')
        lower = text.lower()
        soup = BeautifulSoup(text, 'html.parser')
        refs = []
        for tag, attr in [('script','src'),('link','href'),('img','src'),('source','src')]:
            for element in soup.find_all(tag):
                value = element.get(attr)
                if value:
                    refs.append(value)
        generic = any(marker in (lower + ' ' + soup.get_text(' ', strip=True).lower()) for marker in GENERIC_MARKERS)
        title = soup.title.get_text(strip=True) if soup.title else ''
        info = {'timestamp': row.get('timestamp'), 'original': row.get('original'), 'replay': replay, 'bytes': len(body), 'contentType': content_type, 'sha256': hashlib.sha256(body).hexdigest(), 'title': title, 'generic': generic, 'refs': refs[:100]}
        html_infos.append(info)
        if not generic and len(body) >= 400 and (refs or '<script' in lower):
            selected_text = text
            selected_html = info
            break
    candidate['rootSnapshots'] = html_infos
    candidate['selectedRoot'] = selected_html
    sample_texts = [selected_text]
    sample_urls = []
    project_rows = candidate.pop('_rows', [])
    js_rows = [row for row in project_rows if ext(str(row.get('original',''))) in {'.js','.mjs'}]
    js_rows = sorted(js_rows, key=lambda row: int(row.get('length') or 0), reverse=True)[:8]
    for row in js_rows:
        fetched = fetch_archive(row, max_bytes=12_000_000)
        if not fetched:
            continue
        body, _, replay = fetched
        text = body.decode('utf-8','ignore')
        sample_texts.append(text[:8_000_000])
        sample_urls.append({'url': row.get('original'), 'timestamp': row.get('timestamp'), 'bytes': len(body), 'replay': replay, 'sha256': hashlib.sha256(body).hexdigest()})
    candidate['sampleBundles'] = sample_urls
    joined = '\n'.join(sample_texts)
    lower = joined.lower()
    routes = set()
    for pattern in [r"\bpath\s*:\s*['\"]([^'\"]{1,160})['\"]", r"['\"](#/[A-Za-z0-9_./?=&%-]{1,160})['\"]"]:
        for value in re.findall(pattern, joined):
            value = value.lstrip('#')
            if not value.startswith('/'):
                value = '/' + value
            if not re.search(r'\.(?:js|css|png|jpe?g|webp|svg|json|woff2?|ttf)(?:\?|$)', value, re.I):
                routes.add(value)
    hits = sorted(word for word in DEPTH_WORDS if word in lower)
    title_candidates = []
    if selected_html and selected_html.get('title'):
        title_candidates.append(selected_html['title'])
    for pattern in [r'activityName\s*[:=]\s*["\']([^"\']{3,100})', r'title\s*[:=]\s*["\']([^"\']{3,100})', r'name\s*[:=]\s*["\']([^"\']{3,100})']:
        for value in re.findall(pattern, joined, re.I)[:10]:
            if not re.search(r'webpack|chunk|component|router|app|main', value, re.I):
                title_candidates.append(value)
    candidate['routeHints'] = sorted(routes)[:100]
    candidate['depthKeywords'] = hits
    candidate['titleCandidates'] = list(dict.fromkeys(title_candidates))[:20]
    rank_only = bool(re.search(r'\brank(?:ing)?\b|leaderboard', lower)) and len(hits - {'rank'} if isinstance(hits, set) else [x for x in hits if x not in {'rank'}]) <= 2 and len(routes) <= 2
    candidate['simpleRankingRisk'] = rank_only
    candidate['inspectScore'] = len(routes) * 6 + len(hits) * 2 + (20 if selected_html else 0) - (35 if rank_only else 0)
    return candidate


def main() -> None:
    site = current_site_inventory()
    rows: list[dict] = []
    for year in range(2020, 2027):
        rows.extend(query_cdx(f'activity2.yalla.live/activity/{year}dist/*', f'wayback-{year}dist'))
    rows.extend(query_cdx('activity2.yalla.live/activity/YallaActivity20*/*', 'wayback-yallaactivity'))
    cc = commoncrawl_rows()
    rows.extend(cc)
    (OUT / 'row-count.txt').write_text(f'wayback+commoncrawl rows: {len(rows)}\n', encoding='utf-8')

    grouped: dict[tuple[str,str,str], list[dict]] = defaultdict(list)
    for row in rows:
        parsed = parse_root(str(row.get('original','')))
        if not parsed:
            continue
        bucket, project, root = parsed
        project_key = project.lower()
        if project_key in RESERVED or project_key in site.get('projectSlugs', []) or project_key in KNOWN_SITE_SLUGS:
            continue
        grouped[(bucket, project, root)].append(row)

    candidates = []
    for (bucket, project, root), project_rows in grouped.items():
        extensions = Counter(ext(str(row.get('original',''))) for row in project_rows)
        file_count = len({str(row.get('original','')) for row in project_rows})
        total_bytes = sum(int(row.get('length') or 0) for row in project_rows)
        js = extensions['.js'] + extensions['.mjs']
        css = extensions['.css']
        images = sum(extensions[x] for x in ['.png','.jpg','.jpeg','.webp','.gif','.svg'])
        json_count = extensions['.json']
        fonts = sum(extensions[x] for x in ['.woff','.woff2','.ttf','.otf','.eot'])
        media = sum(extensions[x] for x in ['.mp3','.wav','.ogg','.mp4','.webm'])
        base_score = math.log2(file_count + 1) * 8 + math.log2(total_bytes + 1) * 1.5 + min(images, 50) * 0.7 + min(js, 10) * 3 + min(css, 5) * 4 + min(json_count, 10) * 1.5 + min(fonts + media, 8)
        candidate = {
            'bucket': bucket, 'project': project, 'projectKey': project.lower(), 'root': root,
            'fileCount': file_count, 'totalBytes': total_bytes, 'jsCount': js, 'cssCount': css,
            'imageCount': images, 'jsonCount': json_count, 'fontCount': fonts, 'mediaCount': media,
            'extensions': dict(extensions), 'baseScore': round(base_score, 2), '_rows': project_rows,
        }
        if file_count >= 8 and js >= 1 and (css >= 1 or images >= 3):
            candidates.append(candidate)
    candidates.sort(key=lambda item: item['baseScore'], reverse=True)
    write_candidates = [{k:v for k,v in item.items() if k != '_rows'} for item in candidates]
    (OUT / 'all-root-candidates.json').write_text(json.dumps(write_candidates, ensure_ascii=False, indent=2), encoding='utf-8')

    inspect_targets = candidates[:80]
    inspected = []
    with concurrent.futures.ThreadPoolExecutor(max_workers=8) as executor:
        futures = [executor.submit(inspect_candidate, item) for item in inspect_targets]
        for future in concurrent.futures.as_completed(futures):
            try:
                inspected.append(future.result())
            except Exception as exc:
                inspected.append({'error': repr(exc)})
    inspected = [item for item in inspected if item.get('project')]
    for item in inspected:
        item['finalScore'] = round(item.get('baseScore',0) + item.get('inspectScore',0), 2)
    inspected.sort(key=lambda item: item['finalScore'], reverse=True)
    (OUT / 'inspected-root-candidates.json').write_text(json.dumps(inspected, ensure_ascii=False, indent=2), encoding='utf-8')

    eligible = [item for item in inspected if item.get('selectedRoot') and not item.get('simpleRankingRisk') and item.get('fileCount',0) >= 20 and item.get('imageCount',0) >= 5 and item.get('jsCount',0) >= 1]
    (OUT / 'eligible-rich-candidates.json').write_text(json.dumps(eligible, ensure_ascii=False, indent=2), encoding='utf-8')
    rows_md = ['| # | Bucket / Project | Files | JS/CSS/Images | Routes | Depth signals | Title evidence | Score |', '|---:|---|---:|---|---:|---|---|---:|']
    for index, item in enumerate(eligible[:50], 1):
        title = '<br>'.join(item.get('titleCandidates',[])[:3]).replace('|','/')
        hits = ', '.join(item.get('depthKeywords',[])[:12])
        rows_md.append(f"| {index} | `{item['bucket']}/{item['project']}` | {item['fileCount']} | {item['jsCount']}/{item['cssCount']}/{item['imageCount']} | {len(item.get('routeHints',[]))} | {hits} | {title} | {item['finalScore']} |")
    report = [
        '# Yalla Official SPA Root Discovery', '',
        f"- Current site Yalla IDs: {len(site.get('ids',[]))}",
        f"- Current site project slugs excluded: {len(site.get('projectSlugs',[]))}",
        f"- Archive rows inspected: {len(rows)}",
        f"- Distinct non-site roots: {len(candidates)}",
        f"- Rich eligible candidates: {len(eligible)}", '',
        *rows_md,
        '',
        'No candidate is accepted merely for returning HTTP 200. Simple ranking-only roots and generic ended shells are excluded from the rich-candidate list.'
    ]
    (OUT / 'REPORT.md').write_text('\n'.join(report), encoding='utf-8')
    (OUT / 'site-dedupe.json').write_text(json.dumps(site, ensure_ascii=False, indent=2), encoding='utf-8')
    print(json.dumps({'archiveRows': len(rows), 'distinctRoots': len(candidates), 'eligible': len(eligible), 'top': [f"{x['bucket']}/{x['project']}" for x in eligible[:15]]}, ensure_ascii=False, indent=2))


if __name__ == '__main__':
    main()
