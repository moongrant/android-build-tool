"""GET-only download of explicitly published renderer assets. No account access."""
import json,re,hashlib,concurrent.futures
from pathlib import Path
from urllib.parse import urlsplit,urljoin
import requests
O=Path('output');(O/'raw').mkdir(parents=True,exist_ok=True)
BASE='https://static-act.bigolive.tv/live/assets/act-tpl/'
H={'User-Agent':'Mozilla/5.0','Referer':'https://activity.bigo.tv/'}
records={}
def get(u):
 try:
  r=requests.get(u,headers=H,timeout=25);b=r.content
  f='raw/'+hashlib.sha256(u.encode()).hexdigest()+'.bin';(O/f).write_bytes(b)
  records[u]={'url':u,'status':r.status_code,'type':r.headers.get('content-type',''),'file':f,'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()}
  return b.decode('utf-8',errors='replace') if r.ok else ''
 except Exception as e:records[u]={'url':u,'error':str(e)};return ''
def batch(us):
 with concurrent.futures.ThreadPoolExecutor(max_workers=5) as e:return list(e.map(get,sorted(set(us))))
js=get(BASE+'js/index.164d18.js');urls=set()
for u in re.findall(r'"(//image-act\.bigolive\.tv/[^"\s]+)"',js):urls.add('https:'+u)
for u in re.findall(r'n\.p\+"([^"\s]+\.(?:css|png|jpg|webp|gif|svg))"',js):urls.add(urljoin(BASE,u))
for l in ['en','cn','tw']:
 get('https://static-web.bigolive.tv/as/common-static/pear/prod/10000001493-'+l+'.json')
batch(urls)
more=set()
for u,row in list(records.items()):
 if row.get('status')==200 and u.endswith('.css'):
  text=(O/row['file']).read_text(errors='replace')
  for v in re.findall(r'url\([\"\x27]?([^\)\"\x27]+)',text):
   if not v.startswith(('data:','blob:')):more.add(urljoin(u,v))
batch(more)
# These candidate IDs were linked in the previously saved official Halloween configurations.
for i in [75199,75121,73195,74863,55125]:
 t=get(f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={i}&actId={i}')
 if t:(O/f'config-{i}.json').write_text(t)
(O/'records.json').write_text(json.dumps(list(records.values()),ensure_ascii=False,indent=2))
print(json.dumps({'records':len(records),'ok':sum(x.get('status')==200 for x in records.values())}))
