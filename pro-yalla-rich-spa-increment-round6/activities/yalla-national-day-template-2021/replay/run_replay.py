#!/usr/bin/env python3
import argparse,asyncio,json
from pathlib import Path
from urllib.parse import parse_qsl,quote,urlparse,urlunparse
from playwright.async_api import async_playwright
BASE=Path(__file__).resolve().parent; ROOT=BASE.parent; M=json.loads((BASE/'url-map.json').read_text())
def norm(u,strip=False):
 p=urlparse(u); q=parse_qsl(p.query,keep_blank_values=True)
 if strip:q=[(k,v) for k,v in q if k.lower() not in {'_','t','ts','timestamp','v','version','cb','cache'}]
 return urlunparse(((p.scheme or 'https').lower(),p.netloc.lower(),p.path or '/','', '&'.join(f"{quote(k,safe='[]')}={quote(v,safe='/:,[]')}" for k,v in sorted(q)),''))
def key(u):p=urlparse(u);return p.netloc.lower()+(p.path or '/')
def lookup(u):
 for x in [norm(u),norm(u,True)]:
  if x in M['records']:return M['records'][x]
 c=M.get('pathIndex',{}).get(key(u),[])
 return M['records'][c[0]] if len(c)==1 else M.get('rootRecord') if key(u).rstrip('/')==key(M['rootUrl']).rstrip('/') else None
async def main():
 ap=argparse.ArgumentParser();ap.add_argument('--route',default='/');ap.add_argument('--headless',action='store_true');a=ap.parse_args()
 async with async_playwright() as p:
  b=await p.chromium.launch(headless=a.headless);c=await b.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US')
  async def h(route,request):
   r=lookup(request.url)
   if r:await route.fulfill(status=int(r.get('status') or 200),headers={'content-type':r.get('contentType') or 'application/octet-stream','access-control-allow-origin':'*'},body=(ROOT/r['file']).read_bytes())
   elif request.method=='OPTIONS':await route.fulfill(status=204,body=b'')
   else:await route.fulfill(status=404,headers={'content-type':'application/json'},body=b'{"code":404,"message":"offline fixture unavailable"}')
  await c.route('**/*',h);page=await c.new_page();await page.goto(M['rootUrl']+'?lang=en&language=en&region=SA#'+a.route,wait_until='domcontentloaded');await page.wait_for_timeout(10000)
  print('Offline replay loaded:',page.url)
  if a.headless:await page.screenshot(path=str(BASE/'manual-replay.png'),full_page=True);await b.close();return
  try:
   while True:await asyncio.sleep(1)
  except KeyboardInterrupt:pass
  await b.close()
if __name__=='__main__':asyncio.run(main())
