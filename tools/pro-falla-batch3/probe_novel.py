#!/usr/bin/env python3
from __future__ import annotations

import asyncio, json, math, os, re, shutil
from pathlib import Path
from typing import Any

import aiohttp
from PIL import Image, ImageDraw, ImageFont
from playwright.async_api import async_playwright

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch3-novel-probe')).resolve()
API='https://api.apifalla.com/api/web/activities_config/act'
UA='Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36 ProFallaNovelProbe/1.0'
HEADERS={'User-Agent':UA,'Accept':'application/json,text/plain,*/*','Content-Type':'application/json','Origin':'https://web.fallaweb.com','Referer':'https://web.fallaweb.com/','X-Language':'EN'}
TARGET_IDS=[112,180,198,207,219,257,288,346,350,354,360,390,391,392,426,427,428,454,478,514,515,516,517,548,551,564,568,584,585,614,670,694,706,714,772,845,884,993,1075,1133,1159,1190,1202,1211,1248,1388,1445,1523,1577]
PROJECT_RE=re.compile(r'act-[a-z0-9][a-z0-9-]{2,}',re.I)


def ensure(p:Path): p.mkdir(parents=True,exist_ok=True)
def dump(p:Path,v:Any): ensure(p.parent); p.write_text(json.dumps(v,ensure_ascii=False,indent=2),encoding='utf-8')
def obj(v):
    if isinstance(v,dict): return v
    try:
        x=json.loads(v or '{}'); return x if isinstance(x,dict) else {}
    except: return {}
def flatten(v,p=''):
    out=[]
    if isinstance(v,dict):
        for k,x in v.items(): out+=flatten(x,f'{p}.{k}' if p else str(k))
    elif isinstance(v,list):
        for i,x in enumerate(v): out+=flatten(x,f'{p}[{i}]')
    elif v is not None: out.append((p,str(v)))
    return out

def title_from(conf,project):
    c=[]
    roots=[conf.get(k) for k in ('en','zh','tr','ar','es','pt','id','bn') if isinstance(conf.get(k),dict)]+[conf]
    for root in roots:
        for k,v in flatten(root):
            t=re.sub(r'<[^>]+>',' ',v); t=re.sub(r'\s+',' ',t).strip(); kl=k.lower()
            if 3<=len(t)<=80 and not t.lower().startswith('http'):
                q=100 if any(x in kl for x in ('activitytitle','eventtitle','activityname','eventname')) else 70 if kl.endswith('title') or kl.endswith('name') else 0
                if q: c.append((q+max(0,30-len(t)//2),t))
    return sorted(c,reverse=True)[0][1] if c else project.removeprefix('act-').replace('-',' ').title()

def font(size,bold=False):
    paths=['/usr/share/fonts/opentype/noto/NotoSansCJK-Bold.ttc' if bold else '/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc','/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf' if bold else '/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf']
    for p in paths:
        if Path(p).exists(): return ImageFont.truetype(p,size)
    return ImageFont.load_default()

async def fetch_json(session,method,url,**kwargs):
    try:
        async with session.request(method,url,timeout=aiohttp.ClientTimeout(total=30),**kwargs) as r:
            raw=await r.read()
            try: data=json.loads(raw.decode('utf-8','replace'))
            except: data=None
            return r.status,data
    except Exception as e: return 0,{'error':repr(e)}

async def main():
    if OUT.exists(): shutil.rmtree(OUT)
    ensure(OUT/'captures')
    connector=aiohttp.TCPConnector(limit=12,ssl=False)
    async with aiohttp.ClientSession(headers=HEADERS,connector=connector) as session:
        sem=asyncio.Semaphore(12)
        async def meta(aid):
            async with sem: status,p=await fetch_json(session,'POST',API,json={'activitiesId':aid})
            if status!=200 or not isinstance(p,dict) or p.get('code')!=0 or not isinstance(p.get('res'),dict): return None
            r=p['res']; ext=obj(r.get('extConfig')); web=ext.get('web') if isinstance(ext.get('web'),dict) else {}; pc=web.get('pageConfig') if isinstance(web.get('pageConfig'),dict) else {}; url=str(web.get('activityUrl') or ''); m=PROJECT_RE.search(url) or PROJECT_RE.search(json.dumps(ext,ensure_ascii=False)); project=m.group(0).lower() if m else ''
            if not project:return None
            try: tid=int(pc.get('translateId'))
            except: tid=None
            conf={}
            if tid:
                _,c=await fetch_json(session,'GET',f'https://web.fallaweb.com/lang_conf/h5_{tid}.json'); conf=c if isinstance(c,dict) else {}
            return {'activityId':aid,'project':project,'translateId':tid,'url':url,'title':title_from(conf,project),'startTime':r.get('startTime'),'endTime':r.get('endTime'),'giftCount':len(r.get('giftInfoList') or []),'conf':conf}
        metas=[x for x in await asyncio.gather(*(meta(i) for i in TARGET_IDS)) if x]

    async with async_playwright() as pw:
        browser=await pw.chromium.launch(headless=True,args=['--no-sandbox','--disable-dev-shm-usage'])
        sem=asyncio.Semaphore(4)
        async def capture(row):
            async with sem:
                d=OUT/'captures'/f"{row['activityId']}-{row['project']}"; ensure(d)
                ctx=await browser.new_context(viewport={'width':390,'height':844},is_mobile=True,has_touch=True,locale='en-US',user_agent=UA,ignore_https_errors=True)
                page=await ctx.new_page(); errors=[]; responses=[]
                page.on('pageerror',lambda e:errors.append({'type':'pageerror','text':str(e)}))
                page.on('requestfailed',lambda r:errors.append({'type':'requestfailed','url':r.url,'text':str(r.failure or '')}))
                page.on('response',lambda r:responses.append({'url':r.url,'status':r.status,'type':r.request.resource_type}))
                u=row['url']; sep='&' if '?' in u else '?'; u=u+sep+f"activityId={row['activityId']}"+(f"&translateId={row['translateId']}" if row['translateId'] else '')
                nav=None
                try:
                    await page.goto(u,wait_until='domcontentloaded',timeout=70000); await page.wait_for_timeout(7500)
                    await page.evaluate("""async()=>{const s=ms=>new Promise(r=>setTimeout(r,ms));let y=0;for(let i=0;i<100;i++){let h=Math.max(document.body?.scrollHeight||0,document.documentElement.scrollHeight||0);scrollTo(0,y);await s(150);if(y+innerHeight>=h-8)break;y+=Math.max(320,innerHeight*.62)}scrollTo(0,0);await s(500)}""")
                except Exception as e: nav=repr(e)
                try:
                    m=await page.evaluate("""()=>({bodyText:(document.body?.innerText||'').slice(0,50000),scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement.scrollHeight||0),images:document.images.length,loadedImages:[...document.images].filter(x=>x.complete&&x.naturalWidth>0).length,brokenImages:[...document.images].filter(x=>x.complete&&x.src&&x.naturalWidth===0).map(x=>x.src),controls:[...document.querySelectorAll('button,[role=button],.van-tab,.tab')].map(x=>(x.innerText||x.getAttribute('aria-label')||'').trim()).filter(Boolean).slice(0,200)})""")
                    await page.screenshot(path=str(d/'full.png'),full_page=True,animations='disabled'); (d/'dom.html').write_text(await page.content(),encoding='utf-8')
                except Exception as e: m={'captureError':repr(e)}
                await ctx.close(); row['capture']={**m,'url':u,'navError':nav,'errors':errors,'responses':responses,'dir':str(d.relative_to(OUT)),'meaningful':not nav and int(m.get('scrollHeight') or 0)>=1000 and int(m.get('loadedImages') or 0)>=3}
                dump(d/'result.json',row); print(json.dumps({'id':row['activityId'],'project':row['project'],'height':m.get('scrollHeight'),'images':m.get('loadedImages'),'meaningful':row['capture']['meaningful']},ensure_ascii=False),flush=True)
        await asyncio.gather(*(capture(x) for x in metas)); await browser.close()

    rows=sorted(metas,key=lambda x:(not bool((x.get('capture') or {}).get('meaningful')),-int((x.get('capture') or {}).get('scrollHeight') or 0)))
    dump(OUT/'novel-candidates.json',rows)
    cols,cardw,cardh,gap,head=5,300,680,14,135; nr=max(1,math.ceil(len(rows)/cols)); canvas=Image.new('RGB',(gap+cols*(cardw+gap),head+gap+nr*(cardh+gap)),(8,11,18)); dr=ImageDraw.Draw(canvas)
    dr.text((gap,18),'PRO FALLA · 新机制补充探测',font=font(30,True),fill=(246,248,255)); dr.text((gap,64),f'{len(rows)} 个历史 / 非主流项目 · 用于寻找排行榜模板之外的富活动',font=font(18),fill=(165,178,205)); dr.text((gap,99),'仅为生产页取证，后续仍需原始 SPA 本地化和 Campaign 去重。',font=font(16),fill=(239,181,94))
    for i,r in enumerate(rows):
        x=gap+(i%cols)*(cardw+gap); y=head+gap+(i//cols)*(cardh+gap); dr.rounded_rectangle((x,y,x+cardw,y+cardh),16,fill=(22,27,40),outline=(58,68,92),width=2); m=r.get('capture') or {}; p=OUT/str(m.get('dir') or '')/'full.png'
        if p.exists():
            try:
                im=Image.open(p).convert('RGB'); tw,th=cardw-18,500; ratio=max(tw/im.width,th/im.height); rs=im.resize((max(1,int(im.width*ratio)),max(1,int(im.height*ratio)))); left=max(0,(rs.width-tw)//2); thumb=rs.crop((left,0,left+tw,min(rs.height,th))).resize((tw,th)); canvas.paste(thumb,(x+9,y+9))
            except: pass
        ty=y+526; dr.text((x+11,ty),f"{i+1:02d} · {r['title'][:32]}",font=font(16,True),fill=(248,250,255)); dr.text((x+11,ty+28),f"{r['project']} · A{r['activityId']} · T{r['translateId'] or '-'}",font=font(12),fill=(151,168,202)); dr.text((x+11,ty+51),f"{m.get('scrollHeight',0)}px · {m.get('loadedImages',0)} images",font=font(12),fill=(121,231,190)); dr.text((x+11,ty+77),'可继续深挖' if m.get('meaningful') else '页面证据不足',font=font(13,True),fill=(134,232,176) if m.get('meaningful') else (243,170,92))
    canvas.save(OUT/'NOVEL_CONTACT_SHEET.jpg',quality=90,optimize=True)

if __name__=='__main__': asyncio.run(main())
