#!/usr/bin/env python3
from __future__ import annotations

import json, math, os
from pathlib import Path
from PIL import Image, ImageDraw, ImageFont

ROOT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch3-original-spa')).resolve()
MANIFEST=ROOT/'manifest.json'
SHEETS=ROOT/'contact-sheets'; PREVIEWS=ROOT/'contact-sheets-preview'


def font(size,bold=False):
    paths=['/usr/share/fonts/opentype/noto/NotoSansCJK-Bold.ttc' if bold else '/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc','/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf' if bold else '/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf']
    for p in paths:
        if Path(p).exists(): return ImageFont.truetype(p,size)
    return ImageFont.load_default()

def wrap(draw,text,fnt,width):
    words=str(text).split(); lines=[]; cur=''
    for w in words:
        test=(cur+' '+w).strip()
        if draw.textbbox((0,0),test,font=fnt)[2]<=width:cur=test
        else:
            if cur:lines.append(cur)
            cur=w
    if cur:lines.append(cur)
    return lines

def build_campaign(campaign):
    items=[]
    for unit in campaign['units']:
        for page in unit['pages']:
            p=ROOT/page['offlineScreenshot']
            if not p.exists(): continue
            items.append({'unit':unit,'page':page,'path':p})
    cols=4 if len(items)>=4 else max(1,len(items)); gap=18; cardw=340; inner=cardw-20; header=150
    prepared=[]
    for item in items:
        im=Image.open(item['path']).convert('RGB'); ratio=inner/im.width; h=max(1,int(im.height*ratio)); im=im.resize((inner,h)); label_h=74
        prepared.append((item,im,h+label_h+20))
    heights=[header+gap]*cols; positions=[]
    for item,im,total in prepared:
        col=min(range(cols),key=lambda i:heights[i]); x=gap+col*(cardw+gap); y=heights[col]; positions.append((x,y,item,im,total)); heights[col]+=total+gap
    canvas=Image.new('RGB',(gap+cols*(cardw+gap),max(heights)+gap),(7,10,17)); d=ImageDraw.Draw(canvas)
    d.text((gap,18),campaign['title'],font=font(32,True),fill=(246,248,255)); d.text((gap,66),f"{campaign['level']} · {campaign['unitCount']} SPA units · {campaign['pageCount']} unique offline views · original Falla bundles",font=font(18),fill=(165,178,205)); d.text((gap,101),f"missing {campaign['offlineMissing']} · broken {campaign['brokenImages']} · nav {campaign['navErrors']} · replay {'PASS' if campaign['originalBundleReplay'] else 'REVIEW'}",font=font(17),fill=(126,231,184) if campaign['originalBundleReplay'] else (241,177,92))
    for x,y,item,im,total in positions:
        d.rounded_rectangle((x,y,x+cardw,y+total),16,fill=(22,27,40),outline=(56,67,91),width=2); d.text((x+12,y+11),item['unit']['label'],font=font(16,True),fill=(249,250,255)); d.text((x+12,y+37),item['page']['label'],font=font(14),fill=(157,174,207)); d.text((x+cardw-88,y+12),f"{item['page']['offlineMetrics'].get('scrollHeight',0)}px",font=font(12),fill=(126,231,184)); canvas.paste(im,(x+10,y+70))
    SHEETS.mkdir(parents=True,exist_ok=True); PREVIEWS.mkdir(parents=True,exist_ok=True); out=SHEETS/f"{campaign['id']}.png"; canvas.save(out,optimize=True)
    maxw=1800
    if canvas.width>maxw: prev=canvas.resize((maxw,int(canvas.height*maxw/canvas.width)))
    else: prev=canvas
    prev.save(PREVIEWS/f"{campaign['id']}.jpg",quality=87,optimize=True)
    return out

def build_overview(manifest):
    cards=[]; w=620
    for c in manifest['campaigns']:
        p=PREVIEWS/f"{c['id']}.jpg"
        if not p.exists():continue
        im=Image.open(p).convert('RGB'); ratio=w/im.width; h=min(880,int(im.height*ratio)); im=im.resize((w,int(im.height*ratio))).crop((0,0,w,h)); cards.append((c,im,h))
    cols=2; gap=22; header=165; heights=[header+gap]*cols; pos=[]
    for c,im,h in cards:
        total=h+126; col=min(range(cols),key=lambda i:heights[i]); x=gap+col*(w+gap); y=heights[col]; pos.append((x,y,c,im,total)); heights[col]+=total+gap
    canvas=Image.new('RGB',(gap+cols*(w+gap),max(heights)+gap),(7,10,17)); d=ImageDraw.Draw(canvas); d.text((gap,20),'PRO FALLA · Batch 3 Original SPA Archive',font=font(34,True),fill=(246,248,255)); d.text((gap,72),f"{manifest['campaignCount']} Campaigns · {manifest['unitCount']} SPA units · {manifest['pageCount']} unique views",font=font(21),fill=(165,178,205)); d.text((gap,111),f"{manifest['originalFileCount']} original files · {manifest['originalBytes']/1024/1024:.1f} MB · raw closure {'PASS' if manifest['rawByteComplete'] else 'REVIEW'}",font=font(18),fill=(126,231,184) if manifest['rawByteComplete'] else (241,177,92))
    for x,y,c,im,total in pos:
        d.rounded_rectangle((x,y,x+w,y+total),18,fill=(22,27,40),outline=(58,68,93),width=2); canvas.paste(im,(x,y)); ty=y+im.height+15; d.text((x+16,ty),c['title'],font=font(20,True),fill=(249,250,255)); d.text((x+16,ty+34),f"{c['level']} · {c['unitCount']} units · {c['pageCount']} views",font=font(15),fill=(157,174,207)); d.text((x+16,ty+62),f"missing {c['offlineMissing']} · broken {c['brokenImages']} · replay {'PASS' if c['originalBundleReplay'] else 'REVIEW'}",font=font(14),fill=(126,231,184) if c['originalBundleReplay'] else (241,177,92))
    out=SHEETS/'overview.png'; canvas.save(out,optimize=True); maxw=1600; prev=canvas.resize((maxw,int(canvas.height*maxw/canvas.width))) if canvas.width>maxw else canvas; prev.save(PREVIEWS/'overview.jpg',quality=87,optimize=True)

def main():
    m=json.loads(MANIFEST.read_text())
    for c in m['campaigns']: build_campaign(c)
    build_overview(m)
    lines=['# Pro Falla Batch 3 QA','',f"- Campaigns: {m['campaignCount']}",f"- SPA units: {m['unitCount']}",f"- Unique views: {m['pageCount']}",f"- Original files: {m['originalFileCount']}",f"- Original bytes: {m['originalBytes']}",f"- Static closure added: {m['staticClosureAdded']}",f"- Capture body errors: {m['captureErrors']}",f"- rawByteComplete: `{str(m['rawByteComplete']).lower()}`",'', '| Campaign | Units | Views | Missing | Broken | Nav | Replay |','|---|---:|---:|---:|---:|---:|---|']
    for c in m['campaigns']: lines.append(f"| {c['title']} | {c['unitCount']} | {c['pageCount']} | {c['offlineMissing']} | {c['brokenImages']} | {c['navErrors']} | {'PASS' if c['originalBundleReplay'] else 'REVIEW'} |")
    (ROOT/'QA-FINAL.md').write_text('\n'.join(lines),encoding='utf-8')

if __name__=='__main__': main()
