import json,re,hashlib,time,concurrent.futures,urllib.parse,gzip
from pathlib import Path
import requests
from bs4 import BeautifulSoup
O=Path('output');O.mkdir(exist_ok=True)
H={'User-Agent':'Mozilla/5.0','Referer':'https://activity.bigo.tv/'}
records=[]
def save(u,name=None,timeout=55):
 try:
  r=requests.get(u,headers=H,timeout=timeout);typ=r.headers.get('content-type','');b=r.content
  n=name or 'responses/'+hashlib.sha256(u.encode()).hexdigest()[:20]+('.json' if 'json' in typ else '.html' if 'html' in typ else '.txt')
  (O/n).parent.mkdir(parents=True,exist_ok=True);(O/n).write_bytes(b)
  records.append({'url':u,'finalUrl':r.url,'status':r.status_code,'file':n,'bytes':len(b),'type':typ})
  return r.text if r.ok else ''
 except Exception as e:
  records.append({'url':u,'error':str(e)});return ''
queries=[]
for host,prefix in [('static-fed.bigolive.tv','/live/pages/bigolive/act-'),('activity.bigo.tv','/live/act/act_')]:
 for digit in ['4','5','6','7','8','9','1']:
  args={'url':host+prefix+digit+'*','output':'json','fl':'original','filter':['statuscode:200','original:.*index\\.html$'],'collapse':'urlkey','limit':'2000'}
  queries.append('https://web.archive.org/cdx/search/cdx?'+urllib.parse.urlencode(args,doseq=True))
roots=set()
with concurrent.futures.ThreadPoolExecutor(max_workers=4) as ex:
 for idx,text in enumerate(ex.map(save,queries)):
  try:
   for row in json.loads(text)[1:]:
    u=row[0]
    if 'index.html' in u: roots.add(u.split('?')[0])
  except: pass
(O/'archive-roots.json').write_text(json.dumps(sorted(roots),indent=2))
print('Archived roots',len(roots),flush=True)
# Read root shells in bounded batches, using only actual archived URLs.
infos=[];jsjobs=[]
def inspect(u):
 t=save(u,timeout=30)
 if not t:return None
 soup=BeautifulSoup(t,'html.parser')
 title=soup.title.get_text() if soup.title else ''
 scripts=[urllib.parse.urljoin(u,x['src']) for x in soup.select('script[src]')]
 return {'url':u,'title':title,'scripts':scripts,'keywords':bool(re.search('hallow|spooky|pumpkin|万圣|萬聖',t,re.I))}
with concurrent.futures.ThreadPoolExecutor(max_workers=8) as ex:
 for row in ex.map(inspect,sorted(roots)):
  if row: infos.append(row)
(O/'root-infos.json').write_text(json.dumps(infos,ensure_ascii=False,indent=2))
# Custom project index bundles expose translation strings and API namespaces.
for row in infos:
 for u in row['scripts']:
  path=urllib.parse.urlsplit(u).path
  if re.search(r'/(index|app)([.-]|/)',path) and not any(v in path for v in ['/common/','/bigo-main-','/common-config/']):jsjobs.append(u)
jsjobs=list(dict.fromkeys(jsjobs))[:400]
with concurrent.futures.ThreadPoolExecutor(max_workers=7) as ex:list(ex.map(lambda u:save(u,timeout=30),jsjobs))
# Fetch full current configs for the linked Halloween campaign graph, retain exact signed URLs.
ids=[53259,55125,73185,73195,73262,73382,73387,73388,73389,75019,73847,74695,74698,74717,75059,75121,75188,75272,74155]
with concurrent.futures.ThreadPoolExecutor(max_workers=5) as ex:
 list(ex.map(lambda i:save(f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={i}&actId={i}',f'configs/{i}.json',30),ids))
# Known form routes really linked by 2024 Halloween (not invented custom gameplay).
for u in ['https://static-fed.bigolive.tv/live/pages/bigolive/act-49334/index.html#/apply49334/1180','https://static-fed.bigolive.tv/live/pages/bigolive/act-49334/index.html#/apply49334/1192']:
 inspect(u)
hits=[]
for f in O.rglob('*'):
 if not f.is_file() or f.suffix not in ['.txt','.json','.html','.js']:continue
 text=f.read_text(errors='replace')
 if f.name in ['archive-roots.json','root-infos.json']:continue
 for m in re.finditer('hallow|spook|pumpkin|万圣|萬聖|惊魂|驚魂|ghost|haunted',text,re.I):
  hits.append({'file':str(f.relative_to(O)),'pos':m.start(),'context':text[max(0,m.start()-110):m.end()+210]})
(O/'hits.json').write_text(json.dumps(hits,ensure_ascii=False,indent=2))
(O/'records.json').write_text(json.dumps(records,ensure_ascii=False,indent=2))
print(json.dumps({'records':len(records),'roots':len(roots),'scripts':len(jsjobs),'hits':len(hits)},ensure_ascii=False))
