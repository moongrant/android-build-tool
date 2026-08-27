from pathlib import Path
import json, re, requests

OUT=Path('pro-bigo-onelink-probe')
OUT.mkdir(exist_ok=True)
url='https://bigo.onelink.me/IC9P/7525373c'
uas={
'android':'Mozilla/5.0 (Linux; Android 15; Pixel 9 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0 Mobile Safari/537.36',
'ios':'Mozilla/5.0 (iPhone; CPU iPhone OS 18_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.4 Mobile/15E148 Safari/604.1',
'desktop':'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 Chrome/136.0 Safari/537.36'
}
rows=[]
for name,ua in uas.items():
    s=requests.Session()
    r=s.get(url,headers={'User-Agent':ua,'Accept-Language':'en-US,en;q=0.9'},allow_redirects=True,timeout=40)
    html=r.text
    (OUT/f'{name}.html').write_text(html,'utf-8')
    history=[{'status':x.status_code,'url':x.url,'headers':dict(x.headers)} for x in r.history]
    history.append({'status':r.status_code,'url':r.url,'headers':dict(r.headers)})
    found=sorted(set(re.findall(r'(?:bigolive|bigo|https?)[:%][^\"\'<>\s]{5,500}',html,re.I)))
    rows.append({'name':name,'history':history,'cookies':s.cookies.get_dict(),'found':found[:200],'bytes':len(r.content)})
(OUT/'result.json').write_text(json.dumps(rows,ensure_ascii=False,indent=2),'utf-8')
print(json.dumps(rows,ensure_ascii=False,indent=2))
