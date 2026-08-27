from __future__ import annotations

import hashlib
import json
import re
from collections import defaultdict, deque
from pathlib import Path
from urllib.parse import urljoin, urlparse, unquote

import requests
from bs4 import BeautifulSoup

SITE='https://campaigns-collected.jekae.chatgpt.site/'
OUT=Path('pro-yalla-existing-bundle-graph')
OUT.mkdir(parents=True,exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 Chrome/127 Safari/537.36','Accept':'*/*'})
FOLDERS=[
'yalla-8th-anniversary','yalla-9th-anniversary','yalla-season-2025','yalla-happy-ferris-wheel-castle-2025','yalla-super-roller-coaster','yalla-activity-illustrated-cards','yalla-sheep-farm','yalla-10th-anniversary','yalla-wonderland-2025','yalla-royal-victory','yalla-ramadan-2026','yalla-recall-recruit','yalla-sea-dominator','yalla-football-carnival-2024','yalla-monthly-driving-king-2026'
]
KNOWN={x.lower() for x in ['8thAnniversary','9thAnniversary','yallaSeason','ferrisWheel','fw_newyear','rollerCoaster','activityMap','adha','10thAnniversary','2025NewYear','RoyalVictory','Ramadan','recallAndRecruit','seaDominator','footballCarnival','carKing']}
TAG_ATTRS=[('script','src'),('link','href'),('img','src'),('source','src'),('video','src'),('video','poster'),('audio','src')]
CSS_URL=re.compile(r'url\(\s*["\']?([^"\')]+)',re.I)
JS_STR=re.compile(r'''["'`]([^"'`\s<>]+(?:\.(?:js|mjs|css|json|png|jpe?g|gif|webp|svg|woff2?|ttf|otf|mp3|wav|ogg|mp4|webm|wasm)(?:\?[^"'`\s]*)?|/(?:assets?|static|images?|fonts?|data|fixtures?)/[^"'`\s]+))["'`]''',re.I)

def safe_path(url,base):
 p=urlparse(url);rel=unquote(p.path).lstrip('/') or 'index.html'
 if rel.endswith('/'):rel+='index.html'
 rel=re.sub(r'[^A-Za-z0-9._/\-]+','_',rel)
 if p.query:rel+='__q_'+hashlib.sha1(p.query.encode()).hexdigest()[:10]
 out=base/rel;out.parent.mkdir(parents=True,exist_ok=True);return out

def discover(text,current):
 found=set();low=text[:3000].lower()
 if '<html' in low or '<!doctype' in low:
  soup=BeautifulSoup(text,'html.parser')
  for tag,attr in TAG_ATTRS:
   for el in soup.find_all(tag):
    v=el.get(attr)
    if v:found.add(urljoin(current,v))
  for el in soup.find_all(style=True):
   for x in CSS_URL.findall(el.get('style','')):found.add(urljoin(current,x))
 for x in CSS_URL.findall(text):found.add(urljoin(current,x))
 for x in JS_STR.findall(text):
  x=x.replace('\\/','/')
  if x.startswith('//'):x='https:'+x
  found.add(urljoin(current,x))
 return found

summary=[];text_files=[]
for folder in FOLDERS:
 root=urljoin(SITE,'activities/'+folder+'/');prefix=urlparse(root).path;out=OUT/'mirrors'/folder
 q=deque([root,urljoin(root,'index.html')]);seen=set();manifest=[];errors=[];total=0
 while q and len(seen)<7000 and total<1_000_000_000:
  url=q.popleft()
  if url in seen:continue
  seen.add(url);p=urlparse(url)
  if p.netloc!=urlparse(SITE).netloc or not p.path.startswith(prefix):continue
  try:
   r=S.get(url,timeout=(15,45),allow_redirects=True)
   if r.status_code!=200:errors.append({'url':url,'status':r.status_code});continue
   data=r.content;ctype=r.headers.get('content-type','');fp=safe_path(r.url,out/'site');fp.write_bytes(data);total+=len(data)
   manifest.append({'url':r.url,'file':fp.relative_to(out).as_posix(),'bytes':len(data),'sha256':hashlib.sha256(data).hexdigest(),'type':ctype})
   textual=('text/' in ctype or 'javascript' in ctype or 'json' in ctype or fp.suffix.lower() in {'.html','.js','.mjs','.css','.json','.map','.svg','.txt','.xml'})
   if textual and len(data)<40_000_000:
    text=data.decode('utf-8','ignore');text_files.append((folder,r.url,text,fp))
    for nxt in discover(text,r.url):
     np=urlparse(nxt)
     if np.netloc==urlparse(SITE).netloc and np.path.startswith(prefix) and nxt not in seen:q.append(nxt)
  except Exception as exc:errors.append({'url':url,'error':repr(exc)})
 (out/'manifest.json').write_text(json.dumps({'root':root,'files':manifest,'errors':errors},ensure_ascii=False,indent=2))
 summary.append({'folder':folder,'files':len(manifest),'bytes':total,'errors':len(errors)})

roots=defaultdict(list);template_ids=defaultdict(list);external_urls=defaultdict(list);api_modules=defaultdict(list)
for folder,url,text,fp in text_files:
 normalized=text.replace('\\/','/').replace('\\u002F','/')
 for m in re.finditer(r'(?:https?://[^\s"\'<>`\\)]*)?/activity/(20\d{2}dist|YallaActivity20\d{2})/([A-Za-z0-9_.-]+)',normalized,re.I):
  bucket,project=m.group(1),m.group(2);ctx=normalized[max(0,m.start()-240):min(len(normalized),m.end()+360)].replace('\n',' ')
  roots[(bucket,project)].append({'sourceFolder':folder,'sourceUrl':url,'file':fp.as_posix(),'context':ctx})
 for m in re.finditer(r'templateActivity/[^"\'<>\s`]{0,500}?activityId=(\d{5,14})',normalized,re.I):
  aid=m.group(1);ctx=normalized[max(0,m.start()-240):min(len(normalized),m.end()+360)].replace('\n',' ')
  template_ids[aid].append({'sourceFolder':folder,'sourceUrl':url,'file':fp.as_posix(),'context':ctx})
 for m in re.finditer(r'/[Aa]pi/([A-Za-z0-9_.-]+)/([A-Za-z0-9_.-]+)',normalized):
  api_modules[m.group(1)].append({'action':m.group(2),'sourceFolder':folder,'file':fp.as_posix()})
 for m in re.finditer(r'https?://[^\s"\'<>`\\)]+',normalized):
  ext=m.group(0).rstrip(',.;]})')
  if any(x in ext.lower() for x in ['activity2.','event.yalla','h5client.','file.yalla']):external_urls[ext].append({'sourceFolder':folder,'file':fp.as_posix()})

hidden=[]
for (bucket,project),hits in roots.items():
 if project.lower() not in KNOWN:hidden.append({'bucket':bucket,'project':project,'root':f'https://activity2.yalla.live/activity/{bucket}/{project}/','hitCount':len(hits),'hits':hits[:20]})
hidden.sort(key=lambda x:(-x['hitCount'],x['bucket'],x['project']))
payload={'generatedAt':__import__('datetime').datetime.now(__import__('datetime').timezone.utc).isoformat(),'summary':summary,'knownProjects':sorted(KNOWN),'hiddenRoots':hidden,'allRoots':[{'bucket':b,'project':p,'hitCount':len(h),'hits':h[:10]} for (b,p),h in sorted(roots.items())],'templateActivityIds':[{'activityId':aid,'hitCount':len(h),'hits':h[:20]} for aid,h in sorted(template_ids.items())],'apiModules':[{'module':m,'actions':sorted({x['action'] for x in h}),'hitCount':len(h),'sources':sorted({x['sourceFolder'] for x in h})} for m,h in sorted(api_modules.items())],'externalUrls':[{'url':u,'hitCount':len(h),'sources':sorted({x['sourceFolder'] for x in h})} for u,h in sorted(external_urls.items())]}
(OUT/'existing-bundle-graph.json').write_text(json.dumps(payload,ensure_ascii=False,indent=2))
(OUT/'mirror-summary.json').write_text(json.dumps(summary,ensure_ascii=False,indent=2))
lines=['# Existing Yalla Bundle Graph','',f'- Mirrored existing activities: {len(summary)}',f'- Hidden non-site activity roots: {len(hidden)}',f'- Template activity IDs: {len(template_ids)}',f'- API modules: {len(api_modules)}','', '## Hidden roots','']+[f"- `{x['bucket']}/{x['project']}` — {x['hitCount']} references" for x in hidden]+['','## Template activity IDs','']+[f"- `{x['activityId']}` — {x['hitCount']} references" for x in payload['templateActivityIds']]
(OUT/'REPORT.md').write_text('\n'.join(lines))
print(json.dumps({'mirrored':len(summary),'files':sum(x['files'] for x in summary),'hiddenRoots':[x['project'] for x in hidden],'templateIds':[x['activityId'] for x in payload['templateActivityIds']],'apiModules':len(api_modules)},ensure_ascii=False,indent=2))
