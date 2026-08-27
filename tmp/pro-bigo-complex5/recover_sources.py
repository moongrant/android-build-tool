from __future__ import annotations

import concurrent.futures
import hashlib
import json
import mimetypes
import os
import re
import time
import urllib.parse
import zipfile
from collections import deque
from pathlib import Path

import requests
from bs4 import BeautifulSoup

ROOT = Path(__file__).resolve().parent
MANIFEST = json.loads((ROOT / 'recovery-manifest.json').read_text('utf-8'))
OUT = Path('pro-bigo-complex5-source-output').resolve()
OUT.mkdir(parents=True, exist_ok=True)
REPORTS = OUT / 'reports'; REPORTS.mkdir(exist_ok=True)
UA = 'Mozilla/5.0 (iPhone; CPU iPhone OS 18_4 like Mac OS X) AppleWebKit/605.1.15 Mobile/15E148 Safari/604.1 BIGO/6.34.0'
HEADERS = {'User-Agent': UA, 'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8,id;q=0.7,ms;q=0.6', 'Referer': 'https://activity.bigo.tv/', 'Origin': 'https://activity.bigo.tv'}
MEDIA_EXTS = {'.png','.jpg','.jpeg','.webp','.gif','.svg','.avif','.mp4','.webm','.mov','.woff','.woff2','.ttf','.otf','.json','.lottie'}
STATIC_EXTS = MEDIA_EXTS | {'.js','.css','.html','.htm','.map','.wasm'}
MAGIC = (b'\x89PNG\r\n\x1a\n', b'\xff\xd8\xff', b'GIF87a', b'GIF89a', b'RIFF', b'<svg', b'<?xml')


def clean_url(url: str) -> str:
    return url.replace('http://', 'https://', 1).replace('\\/', '/')


def safe_path(url: str) -> Path:
    p = urllib.parse.urlsplit(clean_url(url))
    path = urllib.parse.unquote(p.path or '/').lstrip('/')
    if not path or path.endswith('/'):
        path += 'index.html'
    if p.query:
        stem, ext = os.path.splitext(path)
        path = f'{stem}__q_{hashlib.sha256(p.query.encode()).hexdigest()[:10]}{ext or ".bin"}'
    return Path(p.netloc or 'unknown-host') / path


def fetch(url: str, *, timeout=45, accept='*/*') -> requests.Response:
    h = dict(HEADERS); h['Accept'] = accept
    last = None
    for attempt in range(4):
        try:
            r = requests.get(clean_url(url), headers=h, timeout=timeout, allow_redirects=True)
            last = r
            if r.status_code in {429,500,502,503,504}:
                time.sleep(.8 + attempt * 1.4); continue
            return r
        except requests.RequestException:
            if attempt == 3: raise
            time.sleep(.6 + attempt)
    return last


def save(url: str, base: Path, *, accept='*/*') -> dict:
    target = base / safe_path(url)
    target.parent.mkdir(parents=True, exist_ok=True)
    try:
        r = fetch(url, accept=accept)
        data = r.content
        ok = r.status_code == 200 and bool(data)
        if ok: target.write_bytes(data)
        return {'url': clean_url(url), 'finalUrl': r.url, 'status': r.status_code, 'contentType': r.headers.get('content-type',''), 'bytes': len(data), 'path': str(target.relative_to(OUT)).replace(os.sep,'/') if ok else None, 'sha256': hashlib.sha256(data).hexdigest() if ok else None, 'ok': ok}
    except Exception as e:
        return {'url': clean_url(url), 'ok': False, 'error': repr(e)}


def all_strings(obj):
    if isinstance(obj, dict):
        for v in obj.values(): yield from all_strings(v)
    elif isinstance(obj, list):
        for v in obj: yield from all_strings(v)
    elif isinstance(obj, str): yield obj


def urls_from_obj(obj):
    out=[]
    for s in all_strings(obj):
        if re.match(r'^https?://', s): out.append(s)
        for u in re.findall(r'https?:\\?/\\?/[^\s"\'<>\\]+', s): out.append(u.replace('\\/','/').rstrip('),.;'))
    return list(dict.fromkeys(out))


def refs_from_text(text: str, base_url: str):
    refs=[]
    for raw in re.findall(r'''(?:src|href)\s*=\s*["']([^"']+)["']''', text, re.I): refs.append(raw)
    for raw in re.findall(r'''url\(\s*["']?([^"')]+)''', text, re.I): refs.append(raw)
    for raw in re.findall(r'''["']([^"']+\.(?:js|css|png|jpe?g|webp|gif|svg|avif|mp4|webm|woff2?|ttf|otf|json|wasm)(?:\?[^"']*)?)["']''', text, re.I): refs.append(raw)
    out=[]
    for raw in refs:
        if raw.startswith(('data:','blob:','javascript:','#')): continue
        try: out.append(urllib.parse.urljoin(base_url, raw))
        except Exception: pass
    return list(dict.fromkeys(out))


def download_candidates(urls, base, campaign):
    seen={}
    for u in urls:
        c=clean_url(u); p=urllib.parse.urlsplit(c)
        if Path(p.path).suffix.lower() not in STATIC_EXTS: continue
        key=urllib.parse.urlunsplit((p.scheme,p.netloc,p.path,'',''))
        seen.setdefault(key,c)
    def one(item):
        key,u=item
        result=save(u,base,accept='image/*,*/*;q=.8')
        result['campaign']=campaign; result['canonical']=key
        if not result.get('ok') and 'giftesx.bigo.sg' in u:
            alt=u.replace('giftesx.bigo.sg','esx.bigo.sg')
            result2=save(alt,base,accept='image/*,*/*;q=.8')
            if result2.get('ok'):
                result2.update({'campaign':campaign,'canonical':key,'alternateFor':u}); return result2
        return result
    with concurrent.futures.ThreadPoolExecutor(max_workers=24) as pool:
        return list(pool.map(one,seen.items()))


def crawl_spa(start_url, campaign_dir, max_files=800):
    raw=campaign_dir/'custom-spa'; raw.mkdir(parents=True,exist_ok=True)
    queue=deque([start_url]); seen=set(); results=[]
    allowed_hosts={urllib.parse.urlsplit(start_url).netloc,'static-fed.bigolive.tv','static-comm.bigolive.tv','static-web.bigolive.tv','esx.bigo.sg','giftesx.bigo.sg'}
    while queue and len(seen)<max_files:
        url=queue.popleft(); key=clean_url(url)
        if key in seen: continue
        seen.add(key)
        result=save(key,raw)
        results.append(result)
        if not result.get('ok'): continue
        p=OUT/result['path']; ct=result.get('contentType','').lower(); ext=p.suffix.lower()
        if not any(x in ct for x in ('html','javascript','css','json','text')) and ext not in {'.html','.htm','.js','.css','.json','.map'}: continue
        text=p.read_text('utf-8',errors='ignore')
        for ref in refs_from_text(text,result.get('finalUrl') or key):
            q=urllib.parse.urlsplit(ref)
            if q.netloc not in allowed_hosts: continue
            if Path(q.path).suffix.lower() in STATIC_EXTS or not Path(q.path).suffix:
                queue.append(ref)
    return results


all_reports=[]
for campaign in MANIFEST['campaigns']:
    slug=campaign['slug']; cdir=OUT/'campaigns'/slug; cdir.mkdir(parents=True,exist_ok=True)
    config_objects=[]; campaign_reports=[]
    for act_id in campaign['ids']:
        api=f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={act_id}&actId={act_id}'
        res=save(api,cdir/'official-config')
        campaign_reports.append(res)
        if res.get('ok'):
            p=OUT/res['path']
            try: config_objects.append(json.loads(p.read_text('utf-8')))
            except Exception: pass
        shell=f'https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}&from_source=3&from_id={act_id}&lang=cn&langSource=pear'
        campaign_reports.append(save(shell,cdir/'official-shell',accept='text/html,*/*'))
    article_urls=[]
    for index,article in enumerate(campaign.get('articles',[]),1):
        res=save(article,cdir/'official-articles',accept='text/html,*/*')
        campaign_reports.append(res)
        if res.get('ok'):
            p=OUT/res['path']; text=p.read_text('utf-8',errors='ignore')
            article_urls += refs_from_text(text,res.get('finalUrl') or article)
            soup=BeautifulSoup(text,'html.parser')
            metadata={'title': soup.title.get_text(' ',strip=True) if soup.title else '', 'headings':[x.get_text(' ',strip=True) for x in soup.select('h1,h2,h3')], 'paragraphs':[x.get_text(' ',strip=True) for x in soup.select('p,li')]}
            (cdir/'official-articles'/f'article-{index}-text.json').write_text(json.dumps(metadata,ensure_ascii=False,indent=2),'utf-8')
    asset_urls=[]
    for obj in config_objects: asset_urls += urls_from_obj(obj)
    asset_urls += article_urls
    asset_reports=download_candidates(asset_urls,cdir/'assets',slug)
    campaign_reports += asset_reports
    spa_reports=[]
    for spa in campaign.get('customSpas',[]): spa_reports += crawl_spa(spa,cdir)
    campaign_reports += spa_reports
    # Make local URL map for the offline assembler.
    url_map={}
    for row in campaign_reports:
        if row.get('ok') and row.get('path'):
            url_map[row.get('canonical') or row['url']]=row['path']
            url_map[row['url']]=row['path']
            if row.get('finalUrl'): url_map[row['finalUrl']]=row['path']
    (cdir/'url-map.json').write_text(json.dumps(url_map,ensure_ascii=False,indent=2),'utf-8')
    summary={'slug':slug,'title':campaign['title'],'ids':campaign['ids'],'requested':len(campaign_reports),'ok':sum(1 for x in campaign_reports if x.get('ok')),'missing':sum(1 for x in campaign_reports if not x.get('ok')),'bytes':sum(x.get('bytes',0) for x in campaign_reports if x.get('ok')),'customSpaFiles':sum(1 for x in spa_reports if x.get('ok'))}
    (cdir/'source-summary.json').write_text(json.dumps(summary,ensure_ascii=False,indent=2),'utf-8')
    (cdir/'download-report.json').write_text(json.dumps(campaign_reports,ensure_ascii=False,indent=2),'utf-8')
    all_reports.append(summary)

# Global inventory and ZIP.
inventory=[]
for p in sorted(x for x in OUT.rglob('*') if x.is_file()):
    data=p.read_bytes(); inventory.append({'path':str(p.relative_to(OUT)).replace(os.sep,'/'),'bytes':len(data),'sha256':hashlib.sha256(data).hexdigest()})
(REPORTS/'campaign-summary.json').write_text(json.dumps(all_reports,ensure_ascii=False,indent=2),'utf-8')
(REPORTS/'inventory.json').write_text(json.dumps(inventory,ensure_ascii=False,indent=2),'utf-8')
summary={'campaigns':len(all_reports),'files':len(inventory),'bytes':sum(x['bytes'] for x in inventory),'details':all_reports}
(REPORTS/'summary.json').write_text(json.dumps(summary,ensure_ascii=False,indent=2),'utf-8')
archive=OUT.parent/'pro-bigo-complex5-source-output.zip'
if archive.exists(): archive.unlink()
with zipfile.ZipFile(archive,'w',zipfile.ZIP_DEFLATED,compresslevel=5) as z:
    for p in sorted(x for x in OUT.rglob('*') if x.is_file()): z.write(p,p.relative_to(OUT.parent))
print(json.dumps(summary,ensure_ascii=False,indent=2))
print('ARCHIVE',archive)
