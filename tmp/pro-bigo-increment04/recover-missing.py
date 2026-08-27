from __future__ import annotations
import json, pathlib, urllib.parse, requests

OUT=pathlib.Path('pro-bigo-increment04-missing-assets')
OUT.mkdir(exist_ok=True)
headers={'User-Agent':'Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 Mobile/15E148 BIGO/6.34.0','Referer':'https://activity.bigo.tv/','Origin':'https://activity.bigo.tv'}
api='https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid=80414&actId=80414'
j=requests.get(api,headers=headers,timeout=30).json()
urls=[]
def walk(v):
    if isinstance(v,dict):
        for x in v.values(): walk(x)
    elif isinstance(v,list):
        for x in v: walk(x)
    elif isinstance(v,str) and '1u9fvU3299635a6e0a4a739c41d077cd04d530ph.png' in v:
        urls.append(v)
walk(j)
report={'api':api,'signedCandidates':urls,'downloads':[]}
if not urls:
    raise SystemExit('No signed candidate found')
signed=urls[0]
query=urllib.parse.urlsplit(signed).query
candidates={
 '1u9fvU3299635a6e0a4a739c41d077cd04d530ph.png': signed,
 '1u9g6I643366e1217b45c7beb40e493c7fd4abph.webp': 'https://esx.bigo.sg/live/4hp/1u9g6I643366e1217b45c7beb40e493c7fd4abph.webp?'+query,
}
for name,url in candidates.items():
    r=requests.get(url,headers=headers,timeout=30,allow_redirects=True)
    ok=r.status_code==200 and len(r.content)>20 and (r.headers.get('content-type','').startswith('image/') or r.content[:4] in [b'RIFF',b'\x89PNG'])
    if ok: (OUT/name).write_bytes(r.content)
    report['downloads'].append({'name':name,'url':url,'status':r.status_code,'contentType':r.headers.get('content-type'),'bytes':len(r.content),'ok':ok})
(OUT/'report.json').write_text(json.dumps(report,ensure_ascii=False,indent=2),'utf-8')
print(json.dumps(report,ensure_ascii=False,indent=2))
