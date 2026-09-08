import json,re,hashlib,time,concurrent.futures,urllib.parse
from pathlib import Path
import requests
from bs4 import BeautifulSoup
O=Path('output');O.mkdir(exist_ok=True)
H={'User-Agent':'Mozilla/5.0','Referer':'https://activity.bigo.tv/'}
records=[]
def save(u,name=None):
 try:
  r=requests.get(u,headers=H,timeout=25);typ=r.headers.get('content-type','');b=r.content
  n=name or hashlib.sha256(u.encode()).hexdigest()[:16]+('.json' if 'json' in typ else '.html' if 'html' in typ else '.txt')
  (O/n).parent.mkdir(parents=True,exist_ok=True);(O/n).write_bytes(b)
  records.append({'url':u,'status':r.status_code,'file':n,'bytes':len(b),'type':typ})
  return r.text if r.ok else ''
 except Exception as e:
  records.append({'url':u,'error':str(e)});return ''
seeds={
 'board.js':'https://campaigns-collected.jekae.chatgpt.site/data/activities.js',
 'board.html':'https://campaigns-collected.jekae.chatgpt.site/',
 'catalog.json':'https://static-act.bigolive.tv/live/assets/assets-list.json.html',
 'news.html':'https://www.bigo.tv/news-events/bigo-news',
 'sitemap.xml':'https://www.bigo.tv/sitemap.xml',
 'carousel.html':'https://activity.bigo.tv/live/act/carousel_entrance/index.html',
 'collect-engine.html':'https://activity.bigo.tv/live/act/act_26588/index.html',
 'resolver.json':'https://ta.bigolive.tv/bigo_act_39108_api/getList',
 'cdx-halloween.json':'https://web.archive.org/cdx/search/cdx?url=activity.bigo.tv/*hallow*&output=json&fl=original&filter=statuscode:200&collapse=urlkey&limit=1000',
 'cdx-fed.json':'https://web.archive.org/cdx/search/cdx?url=static-fed.bigolive.tv/live/pages/bigolive/*&output=json&fl=original&filter=statuscode:200&collapse=urlkey&limit=1000'
}
with concurrent.futures.ThreadPoolExecutor(max_workers=6) as ex:
 results=dict(zip(seeds,ex.map(lambda kv:save(kv[1],kv[0]),seeds.items())))
# Discover scripts and news article links from actual HTML, not guessed endpoints.
assets=set();news=set();sitemaps=set()
for name,text in results.items():
 base=seeds[name]
 if name.endswith('.html'):
  soup=BeautifulSoup(text,'html.parser')
  for el in soup.select('script[src],link[rel=stylesheet][href]'):
   assets.add(urllib.parse.urljoin(base,el.get('src') or el.get('href')))
  for a in soup.select('a[href]'):
   u=urllib.parse.urljoin(base,a['href'])
   if re.search('hallow|spook|pumpkin|万圣|萬聖',u+' '+a.get_text(),re.I):news.add(u)
 if name=='sitemap.xml':
  for u in re.findall('<loc>(.*?)</loc>',text):
   if 'sitemap' in u:sitemaps.add(u)
   elif re.search('hallow|spook|pumpkin',u,re.I):news.add(u)
with concurrent.futures.ThreadPoolExecutor(max_workers=6) as ex:
 list(ex.map(save,sorted(assets)))
for i,u in enumerate(sorted(sitemaps)[:25]):
 t=save(u,f'sitemap-{i}.xml')
 for v in re.findall('<loc>(.*?)</loc>',t):
  if re.search('hallow|spook|pumpkin',v,re.I):news.add(v)
with concurrent.futures.ThreadPoolExecutor(max_workers=5) as ex:list(ex.map(save,sorted(news)))
ids=[54508,54821,54898,55939,73177,73182,73189,73286,73381,73799,73856,74780,74863,75199]
with concurrent.futures.ThreadPoolExecutor(max_workers=5) as ex:
 list(ex.map(lambda i:save(f'https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={i}&actId={i}',f'configs/{i}.json'),ids))
hits=[]
for f in O.rglob('*'):
 if not f.is_file() or f.suffix not in ['.txt','.json','.html','.js']:continue
 text=f.read_text(errors='replace')
 for m in re.finditer('hallow|spook|pumpkin|万圣|萬聖|appletsInfoTable|assets-list|bigo-ssr-fed-render',text,re.I):
  hits.append({'file':str(f.relative_to(O)),'pos':m.start(),'context':text[max(0,m.start()-150):m.end()+350]})
(O/'hits.json').write_text(json.dumps(hits,ensure_ascii=False,indent=2))
(O/'records.json').write_text(json.dumps(records,ensure_ascii=False,indent=2))
print(json.dumps({'records':len(records),'hits':len(hits),'news':list(news)},ensure_ascii=False))
