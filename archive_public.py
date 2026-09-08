"""Read-only preservation of public BIGO campaign pages and referenced assets.
No accounts, credentials, participation actions, POST requests or ID scanning.
"""
import concurrent.futures, hashlib, json, re, threading
from pathlib import Path
from urllib.parse import urljoin,urlsplit
import requests
from bs4 import BeautifulSoup
OUT=Path('output'); (OUT/'raw').mkdir(parents=True,exist_ok=True)
ALLOWED={'activity.bigo.tv','static-act.bigolive.tv','static-fed.bigolive.tv','static-comm.bigolive.tv','static-web.bigolive.tv','static-web.likeevideo.com','static.f2ecdn.com','esx.bigo.sg','giftesx.bigo.sg','ta.bigolive.tv','www.bigo.tv','campaigns-collected.jekae.chatgpt.site'}
HEADERS={'User-Agent':'Mozilla/5.0','Referer':'https://activity.bigo.tv/'}
records={}; lock=threading.Lock()
def get(url):
 if urlsplit(url).hostname not in ALLOWED:return None
 with lock:
  old=records.get(url)
 if old and old.get('status')==200:return (OUT/old['file']).read_bytes()
 try:
  r=requests.get(url,headers=HEADERS,timeout=25)
  b=r.content;ct=r.headers.get('content-type','');ext=Path(urlsplit(url).path).suffix
  if not ext or len(ext)>7:ext='.bin'
  f='raw/'+hashlib.sha256(url.encode()).hexdigest()+ext
  (OUT/f).write_bytes(b)
  row={'url':url,'status':r.status_code,'type':ct,'bytes':len(b),'file':f,'sha256':hashlib.sha256(b).hexdigest()}
  with lock:records[url]=row
  return b if r.ok else None
 except Exception as e:
  with lock:records[url]={'url':url,'error':str(e)}
  return None
def batch(urls):
 with concurrent.futures.ThreadPoolExecutor(max_workers=5) as pool:return list(pool.map(get,sorted(set(urls))))
def urls_in_config(x,out):
 if isinstance(x,dict):
  for v in x.values():urls_in_config(v,out)
 elif isinstance(x,list):
  for v in x:urls_in_config(v,out)
 elif isinstance(x,str) and x.startswith(('https://','http://')) and re.search(r'\.(png|jpe?g|gif|webp|svg|svga|mp4|json)(\?|$)',x,re.I):out.add(x)
roots={};assets=set()
for i in [54821,73081,55939,54508,73856,55125]:
 u=f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={i}&actId={i}'
 b=get(u)
 if b:
  try:
   j=json.loads(b);(OUT/f'config-{i}.json').write_bytes(b);urls_in_config(j,assets)
  except:pass
 roots[f'https://activity.bigo.tv/live/act/act_16907/index.html?id={i}&lang=cn&langSource=pear']=str(i)
batch(assets)
# The catalog is a published list of web app entry points.
c=get('https://static-act.bigolive.tv/live/assets/assets-list.json.html')
if c:
 try:
  for k,v in json.loads(c).get('appletsInfoTable',{}).items():
   if k.startswith('act'):
    for u in v.get('url',[]):
     if urlsplit(u).path.endswith('/index.html'):roots.setdefault(u,k)
 except:pass
get('https://campaigns-collected.jekae.chatgpt.site/data/activities.js')
shells=batch(roots)
infos=[];scripts=set();css=set()
for (u,label),b in zip(sorted(roots.items()),shells):
 if not b:continue
 s=BeautifulSoup(b,'html.parser');js=[urljoin(u,e['src']) for e in s.select('script[src]')];cs=[urljoin(u,e['href']) for e in s.select('link[rel=stylesheet][href]')]
 infos.append({'url':u,'label':label,'title':s.title.get_text() if s.title else '', 'scripts':js,'styles':cs})
 scripts.update(js);css.update(cs)
batch(scripts|css)
# Preserve direct dependencies referred to by downloaded CSS and JavaScript.
for depth in range(3):
 todo=set()
 for u in list(scripts|css):
  r=records.get(u,{})
  if r.get('status')!=200:continue
  t=(OUT/r['file']).read_text(errors='replace')
  for v in re.findall(r'url\([\"\x27]?([^\)\"\x27]+)',t):
   if not v.startswith(('data:','blob:')):todo.add(urljoin(u,v))
  for v in re.findall(r'[\"\x27]([^\"\x27\s]+\.(?:js|css|png|jpe?g|gif|webp|svg|woff2?)(?:\?[^\"\x27\s]*)?)[\"\x27]',t):
   if v.startswith(('https://','//','./','../')):todo.add(urljoin(u,v))
 todo={u for u in todo if u not in records and urlsplit(u).hostname in ALLOWED}
 if not todo:break
 batch(todo)
 for u in todo:
  if urlsplit(u).path.endswith('.js'):scripts.add(u)
  if urlsplit(u).path.endswith('.css'):css.add(u)
# Record Halloween string locations; metadata only, no guessed campaign names.
hits=[]
for u,r in records.items():
 if r.get('status')!=200 or not any(x in r.get('type','') for x in ['text','javascript','json']):continue
 t=(OUT/r['file']).read_text(errors='replace')
 for m in re.finditer('halloween|万圣|萬聖|pumpkin|spooky|haunted',t,re.I):
  hits.append({'url':u,'file':r['file'],'context':t[max(0,m.start()-110):m.end()+210]})
(OUT/'entrypoints.json').write_text(json.dumps(infos,ensure_ascii=False,indent=2))
(OUT/'records.json').write_text(json.dumps(list(records.values()),ensure_ascii=False,indent=2))
(OUT/'halloween-hits.json').write_text(json.dumps(hits,ensure_ascii=False,indent=2))
print(json.dumps({'responses':len(records),'ok':sum(r.get('status')==200 for r in records.values()),'entries':len(infos),'halloweenHits':len(hits)}))
