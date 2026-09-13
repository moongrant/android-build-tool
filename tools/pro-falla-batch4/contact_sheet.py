#!/usr/bin/env python3
from pathlib import Path
import json, os, textwrap
from PIL import Image, ImageDraw, ImageFont

OUT=Path(os.environ.get('OUT_DIR','artifacts/pro-falla-batch4-discovery')).resolve()
rows=json.loads((OUT/'ranked-new-candidates.json').read_text(encoding='utf-8'))
rows=[r for r in rows if r.get('capture') and (OUT/r['capture']['screenshot']).exists()]
font_paths=['/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc','/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf']
font_path=next((p for p in font_paths if Path(p).exists()),None)
def font(size): return ImageFont.truetype(font_path,size) if font_path else ImageFont.load_default()
F_TITLE,F_META,F_SMALL=font(28),font(17),font(14)
BG=(7,11,18); CARD=(20,27,39); TEXT=(241,245,249); SUB=(155,168,185); GREEN=(65,211,151); ORANGE=(245,158,11)

thumbs=[]
for r in rows[:32]:
    img=Image.open(OUT/r['capture']['screenshot']).convert('RGB')
    w=330; h=max(620,min(1450,round(img.height*w/img.width)))
    img.thumbnail((w,h),Image.Resampling.LANCZOS)
    canvas=Image.new('RGB',(354,img.height+132),CARD); d=ImageDraw.Draw(canvas)
    title=r.get('title') or r['project']
    wrapped=textwrap.wrap(title,width=27)[:2]
    y=12
    for line in wrapped: d.text((12,y),line,font=F_META,fill=TEXT); y+=25
    loops=', '.join(r.get('core_groups') or [])
    d.text((12,66),f"{r['project']} · score {r.get('score')}",font=F_SMALL,fill=SUB)
    d.text((12,88),loops[:44],font=F_SMALL,fill=GREEN if not r['capture'].get('visibleError') else ORANGE)
    canvas.paste(img,(12,120))
    thumbs.append(canvas)

if not thumbs:
    raise SystemExit('No screenshots')
cols=4; gap=16; header=110
rows_n=(len(thumbs)+cols-1)//cols
colw=max(x.width for x in thumbs); row_heights=[]
for ri in range(rows_n): row_heights.append(max(thumbs[i].height for i in range(ri*cols,min((ri+1)*cols,len(thumbs)))))
out=Image.new('RGB',(gap+cols*(colw+gap),header+gap+sum(h+gap for h in row_heights)),BG); d=ImageDraw.Draw(out)
d.text((20,18),'PRO FALLA · BATCH 4 DISCOVERY',font=F_TITLE,fill=TEXT)
d.text((20,58),f'{len(thumbs)} unknown medium/large H5 candidates · production captures · not yet localized',font=F_META,fill=SUB)
y=header
for ri,rh in enumerate(row_heights):
    for ci in range(cols):
        idx=ri*cols+ci
        if idx>=len(thumbs): break
        out.paste(thumbs[idx],(gap+ci*(colw+gap),y))
    y+=rh+gap
out.save(OUT/'CONTACT_SHEET.jpg',quality=91,optimize=True)
print(f'wrote {OUT/"CONTACT_SHEET.jpg"}')
