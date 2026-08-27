from __future__ import annotations

import html
import json
import re
import time
from collections import deque
from pathlib import Path
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT=Path('pro-yalla-appstore-events');OUT.mkdir(parents=True,exist_ok=True)
RAW=OUT/'raw';RAW.mkdir(exist_ok=True)
S=requests.Session();S.headers.update({'User-Agent':'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 Chrome/127 Safari/537.36','Accept-Language':'en-US,en;q=.9','Accept':'text/html,application/xhtml+xml,application/json;q=.9,*/*;q=.8'})
APP_ID='1091902866';APPSHUNTER_APP=f'https://appshunter.io/ios/app/yalla-play-game-and-voice-chat/id{APP_ID}'

def get(url,tries=3):
 for i in range(tries):
  try:
   r=S.get(url,timeout=(20,90),allow_redirects=True)
   if r.status_code in {429,500,502,503,504} and i+1<tries:time.sleep(1.5*(i+1));continue
   return r
  except Exception:
   if i+1<tries:time.sleep(1.5*(i+1))
 return None

def urls_from(value,out=None,path='$'):
 if out is None:out=[]
 if isinstance(value,dict):
  for k,v in value.items():
   lp=path+'.'+str(k);lower=str(k).lower()
   if isinstance(v,str) and (v.startswith('http') or any(x in lower for x in ['url','link','deep','target','action','destination'])):out.append({'path':lp,'value':v})
   urls_from(v,out,lp)
 elif isinstance(value,list):
  for i,v in enumerate(value):urls_from(v,out,f'{path}[{i}]')
 elif isinstance(value,str):
  for u in re.findall(r'https?://[^\s"\'<>\\)]+',value):out.append({'path':path,'value':u.rstrip(',.;')})
 return out

def parse_json_blocks(text):
 soup=BeautifulSoup(text,'html.parser');blocks=[]
 for script in soup.find_all('script'):
  typ=(script.get('type') or '').lower();sid=script.get('id') or '';raw=script.string or script.get_text() or ''
  if not raw.strip():continue
  if 'json' in typ or sid in {'__NEXT_DATA__','__NUXT_DATA__'}:
   try:blocks.append({'id':sid,'type':typ,'json':json.loads(raw)})
   except Exception:pass
 return blocks

r=get(APPSHUNTER_APP);app_text=r.text if r else '';(RAW/'app-page.html').write_text(app_text,encoding='utf-8')
queue=deque();seen=set();event_ids=set()
# Links on app page and Next data.
for m in re.findall(r'/events/(\d+)',app_text):event_ids.add(m)
for block in parse_json_blocks(app_text):
 for item in urls_from(block['json']):
  for m in re.findall(r'/events/(\d+)',str(item['value'])):event_ids.add(m)
# Search AppsHunter sitemaps and API-ish pages.
for url in ['https://appshunter.io/sitemap.xml','https://appshunter.io/sitemap_index.xml','https://appshunter.io/robots.txt']:
 rr=get(url)
 if not rr:continue
 (RAW/safe_name(url)).write_bytes(rr.content)
 for m in re.findall(r'https?://appshunter\.io/events/(\d+)',rr.text):event_ids.add(m)
 for loc in re.findall(r'<loc>([^<]+)</loc>',rr.text):
  if 'sitemap' in loc and loc not in seen:
   seen.add(loc);sm=get(loc)
   if sm:
    (RAW/('sitemap-'+str(len(seen))+'.xml')).write_bytes(sm.content)
    for m in re.findall(r'https?://appshunter\.io/events/(\d+)',sm.text):event_ids.add(m)
# Known IDs from search/index evidence.
event_ids.update({'6475700625','6475700703','6478959140','6503232558','6737220863','6740687875','6744103968','6758604742','6760640722','6761397197'})

def safe_name(url):return re.sub(r'[^A-Za-z0-9._-]+','_',url)[:180]

events=[]
for event_id in sorted(event_ids):
 event_url=f'https://appshunter.io/events/{event_id}';er=get(event_url)
 if not er:continue
 text=er.text;(RAW/f'appshunter-{event_id}.html').write_text(text,encoding='utf-8')
 soup=BeautifulSoup(text,'html.parser');visible=' '.join(soup.get_text(' ',strip=True).split())
 title=soup.find('h1').get_text(' ',strip=True) if soup.find('h1') else (soup.title.get_text(strip=True) if soup.title else '')
 app_name='';
 for candidate in ['Yalla - Play Game & Voice Chat','Yalla - Group Voice Chat Rooms']:
  if candidate.lower() in visible.lower():app_name=candidate
 if 'Yalla' not in visible or ('Yalla Ludo' in visible or 'Yalla Baloot' in visible or '101 Okey Yalla' in visible):continue
 blocks=parse_json_blocks(text);embedded=[]
 for block in blocks:embedded.extend(urls_from(block['json']))
 embedded.extend({'path':'html','value':u.rstrip(',.;')} for u in re.findall(r'https?://[^\s"\'<>\\)]+',html.unescape(text)))
 apple_urls=[f'https://apps.apple.com/us/app/id{APP_ID}?eventid={event_id}',f'https://apps.apple.com/us/app/yalla-play-game-and-voice-chat/id{APP_ID}?eventid={event_id}']
 apple=[]
 for apple_url in apple_urls:
  ar=get(apple_url)
  if not ar:continue
  (RAW/f'apple-{event_id}-{len(apple)}.html').write_text(ar.text,encoding='utf-8')
  ablocks=parse_json_blocks(ar.text);aembedded=[]
  for block in ablocks:aembedded.extend(urls_from(block['json']))
  aembedded.extend({'path':'html','value':u.rstrip(',.;')} for u in re.findall(r'https?://[^\s"\'<>\\)]+',html.unescape(ar.text)))
  # Preserve all key/value contexts around deep links and event IDs.
  contexts=[]
  for match in re.finditer(r'(?i)(deep.?link|event.?url|target.?url|action.?url|destination|eventid)',ar.text):contexts.append(ar.text[max(0,match.start()-500):min(len(ar.text),match.end()+1000)])
  apple.append({'url':apple_url,'status':ar.status_code,'finalUrl':ar.url,'bytes':len(ar.content),'embedded':aembedded,'contexts':contexts[:100]})
 events.append({'eventId':event_id,'title':title,'appName':app_name,'url':event_url,'visibleText':visible[:12000],'embedded':embedded,'jsonBlocks':blocks,'apple':apple})
 time.sleep(.5)

# Dedup URLs, extract possible activity URLs/IDs/deep links.
for event in events:
 vals=[]
 for item in event['embedded']:
  vals.append(item)
 for apple in event['apple']:
  vals.extend(apple['embedded'])
 unique={json.dumps(x,sort_keys=True,ensure_ascii=False):x for x in vals}
 event['allEmbedded']=list(unique.values())
 event['activityClues']=[x for x in event['allEmbedded'] if re.search(r'activity2|/activity/|activityId|campaignId|eventId|deep.?link|yalla://|peakxyz',str(x.get('value','')),re.I)]
 event.pop('embedded',None);event.pop('jsonBlocks',None)

(OUT/'yalla-events.json').write_text(json.dumps(events,ensure_ascii=False,indent=2),encoding='utf-8')
lines=['# Yalla App Store / AppsHunter Event Inventory','',f'- Yalla events: {len(events)}','', '| # | Event ID | Title | Activity/deep-link clues |','|---:|---|---|---:|']
for i,e in enumerate(events,1):lines.append(f"| {i} | `{e['eventId']}` | {e['title'].replace('|','/')} | {len(e['activityClues'])} |")
(OUT/'REPORT.md').write_text('\n'.join(lines),encoding='utf-8')
print(json.dumps({'events':len(events),'ids':[x['eventId'] for x in events],'clues':sum(len(x['activityClues']) for x in events)},ensure_ascii=False,indent=2))
