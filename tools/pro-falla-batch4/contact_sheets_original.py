#!/usr/bin/env python3
from pathlib import Path
import json, math, os, textwrap
from PIL import Image, ImageDraw, ImageFont

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch4-original-spa')).resolve()
manifest=json.loads((OUT/'manifest.json').read_text(encoding='utf-8'))
preview_dir=OUT/'contact-sheets-preview'; full_dir=OUT/'contact-sheets'; preview_dir.mkdir(parents=True,exist_ok=True); full_dir.mkdir(parents=True,exist_ok=True)
font_paths=['/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc','/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf']
font_path=next((p for p in font_paths if Path(p).exists()),None)
def font(n): return ImageFont.truetype(font_path,n) if font_path else ImageFont.load_default()
FT,FM,FS=font(30),font(17),font(14)
BG=(6,10,17); CARD=(21,27,39); TEXT=(244,247,251); SUB=(156,169,187); GREEN=(45,212,151); ORANGE=(245,158,11); RED=(248,113,113)

def card(page,width=360):
    img=Image.open(OUT/page['offlineScreenshot']).convert('RGB')
    h=round(img.height*width/img.width); img=img.resize((width,h),Image.Resampling.LANCZOS)
    meta=116; out=Image.new('RGB',(width+24,h+meta+12),CARD); d=ImageDraw.Draw(out)
    title=page.get('label') or page.get('unitLabel') or page.get('project')
    y=10
    for line in textwrap.wrap(title,width=30)[:2]: d.text((12,y),line,font=FM,fill=TEXT);y+=24
    m=page.get('offlineMetrics') or {}
    qa=f"{m.get('scrollHeight',0)}px · missing {page.get('offlineMissingCount',0)} · fixture {page.get('offlineFixtureCount',0)}"
    d.text((12,62),qa,font=FS,fill=GREEN if page.get('offlineMissingCount',0)==0 and not m.get('visibleError') else ORANGE)
    d.text((12,84),page.get('project',''),font=FS,fill=SUB)
    out.paste(img,(12,meta))
    return out

def sheet(campaign):
    pages=campaign.get('pages') or []
    cards=[card(p) for p in pages]
    if not cards:return None
    cols=min(4,max(1,len(cards))); gap=16; header=128; cw=max(x.width for x in cards); rows=math.ceil(len(cards)/cols)
    rhs=[]
    for r in range(rows):rhs.append(max(cards[i].height for i in range(r*cols,min((r+1)*cols,len(cards)))))
    W=gap+cols*(cw+gap);H=header+gap+sum(h+gap for h in rhs)
    out=Image.new('RGB',(W,H),BG);d=ImageDraw.Draw(out)
    d.text((20,16),campaign['title'],font=FT,fill=TEXT)
    status='PASS' if campaign.get('originalBundleReplay') and campaign.get('offlineMissing')==0 and campaign.get('brokenImages')==0 and campaign.get('visibleErrors')==0 else 'REVIEW'
    color=GREEN if status=='PASS' else ORANGE
    d.text((20,60),f"{campaign['level']} · {campaign['pageCount']} unique SPA views · original Falla bundles · {status}",font=FM,fill=color)
    d.text((20,88),f"missing {campaign.get('offlineMissing')} · broken {campaign.get('brokenImages')} · visible errors {campaign.get('visibleErrors')} · fixtures {campaign.get('historicalApiFixtures')}",font=FS,fill=SUB)
    y=header
    for r,rh in enumerate(rhs):
        for c in range(cols):
            i=r*cols+c
            if i>=len(cards):break
            out.paste(cards[i],(gap+c*(cw+gap),y))
        y+=rh+gap
    return out

campaign_imgs=[]
for c in manifest['campaigns']:
    img=sheet(c)
    if img is None: continue
    full=full_dir/f"{c['id']}.png"; img.save(full,optimize=True)
    prev=img.copy(); prev.thumbnail((1500,12000),Image.Resampling.LANCZOS); prev.save(preview_dir/f"{c['id']}.jpg",quality=90,optimize=True)
    campaign_imgs.append((c,img))

# Overview: use downscaled campaign sheets in a single vertical review board.
if campaign_imgs:
    blocks=[]
    for c,img in campaign_imgs:
        x=img.copy();x.thumbnail((1450,4800),Image.Resampling.LANCZOS);blocks.append((c,x))
    W=max(x.width for _,x in blocks)+40; H=110+sum(x.height+28 for _,x in blocks)
    ov=Image.new('RGB',(W,H),BG);d=ImageDraw.Draw(ov);d.text((20,16),'PRO FALLA · BATCH 4 · ORIGINAL SPA',font=FT,fill=TEXT);d.text((20,58),f"{manifest['campaignCount']} Campaigns · {manifest['pageCount']} localized SPA views · original bundles",font=FM,fill=SUB)
    y=100
    for c,x in blocks:ov.paste(x,(20,y));y+=x.height+28
    ov.save(full_dir/'overview.png',optimize=True);pv=ov.copy();pv.thumbnail((1500,16000),Image.Resampling.LANCZOS);pv.save(preview_dir/'overview.jpg',quality=89,optimize=True)
print(f"wrote {len(campaign_imgs)} campaign sheets")
