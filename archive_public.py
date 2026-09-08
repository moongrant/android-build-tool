"""GET-only archive of public campaign configurations and their explicitly referenced media.
No accounts, credentials, scanning, participant data or participation endpoints.
"""
import concurrent.futures,hashlib,json,re,threading
from pathlib import Path
from urllib.parse import urlsplit
import requests
OUT=Path('output');(OUT/'raw').mkdir(parents=True,exist_ok=True)
ALLOWED={'ta.bigolive.tv','esx.bigo.sg','giftesx.bigo.sg','static-web.bigolive.tv','static-web.likeevideo.com','static-comm.bigolive.tv','static-act.bigolive.tv','image-act.bigolive.tv','campaigns-collected.jekae.chatgpt.site'}
H={'User-Agent':'Mozilla/5.0','Referer':'https://activity.bigo.tv/'}
records={};lock=threading.Lock()
def get(url):
 if urlsplit(url).hostname not in ALLOWED:return None
 try:
  r=requests.get(url,headers=H,timeout=25);b=r.content
  ext=Path(urlsplit(url).path).suffix
  if not ext or len(ext)>8:ext='.bin'
  f='raw/'+hashlib.sha256(url.encode()).hexdigest()+ext;(OUT/f).write_bytes(b)
  with lock:records[url]={'url':url,'status':r.status_code,'type':r.headers.get('content-type',''),'file':f,'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()}
  return b if r.ok else None
 except Exception as e:
  with lock:records[url]={'url':url,'error':str(e)}
  return None
def media(v,urls):
 if isinstance(v,dict):
  for x in v.values():media(x,urls)
 elif isinstance(v,list):
  for x in v:media(x,urls)
 elif isinstance(v,str) and v.startswith(('http://','https://')) and re.search(r'\.(png|jpe?g|gif|webp|svg|svga|mp4)(\?|$)',v,re.I):urls.add(v)
urls=set()
# IDs are explicit links from the already archived public Halloween pages.
for i in [54821,55125,55939,53259,73081,75199,75121,75188,75059,74863,73195,73262,73799,73856]:
 u=f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={i}&actId={i}'
 b=get(u)
 if not b:continue
 (OUT/f'config-{i}.json').write_bytes(b)
 try:media(json.loads(b),urls)
 except ValueError:pass
with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:list(pool.map(get,sorted(urls)))
# Fixed published renderer dependencies needed by the original sharing and tab components.
extra=['https://static-act.bigolive.tv/live/assets/act-tpl/js/8.288ede.js','https://static-web.bigolive.tv/as/bigo-static/act-16907/copy_link.png','https://static-web.likeevideo.com/as/common-static/act-assets/avatar-default.png']
for name in ['friends','facebook','twitter','vk','messenger','whatsapp','line','bar']:
 extra.append('https://static-web.likeevideo.com/as/bigo-static/bigo-ui/share/'+name+'.png')
extra.append('https://campaigns-collected.jekae.chatgpt.site/data/activities.js')
with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:list(pool.map(get,extra))
(OUT/'records.json').write_text(json.dumps(list(records.values()),ensure_ascii=False,indent=2))
print(json.dumps({'responses':len(records),'ok':sum(x.get('status')==200 for x in records.values())}))
