#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch10/archive_batch10.mjs')
src = p.read_text(encoding='utf-8')

# The online capture stores historical 404s before the explicit closure pass.
# The closure pass must replace those records rather than skip them.
skip = "    if(byUrl.has(urlKey('GET',item.url))||byPath.has(pathKey('GET',item.url)))continue;\n"
count = src.count(skip)
if count != 2:
    raise SystemExit(f'expected two prefetch skip guards, found {count}')
src = src.replace(skip, '', 2)

# Two Arabian Nights layout assets remain available under production/pre paths,
# while the original HK paths now return 404. Preserve the requested HK URL in
# the replay map and use the surviving official byte source.
anchor = "    {url:'https://falla-res1.resygg.com/awss3_2168516_1673599322010305663_231746732.png'}\n"
replacement = """    {url:'https://falla-res1.resygg.com/awss3_2168516_1673599322010305663_231746732.png'},
    {url:'https://web-test.falla.live/falla-web/act-arabian-nights/hk/0.0.7/assets/66d5113007f1efaadafa.png',candidates:['https://web.fallaweb.com/falla-web/act-arabian-nights/prod/0.1.0/assets/66d5113007f1efaadafa.png','https://web.falla.live/falla-web/act-arabian-nights/pre/0.1.0/assets/66d5113007f1efaadafa.png']},
    {url:'https://web-test.falla.live/falla-web/act-arabian-nights/hk/0.0.7/assets/03f645e90b0da75b89b1.png',candidates:['https://web.fallaweb.com/falla-web/act-arabian-nights/prod/0.1.0/assets/03f645e90b0da75b89b1.png','https://web.falla.live/falla-web/act-arabian-nights/pre/0.1.0/assets/03f645e90b0da75b89b1.png']}
"""
if anchor not in src:
    raise SystemExit('Arabian Nights target insertion anchor not found')
src = src.replace(anchor, replacement, 1)

p.write_text(src, encoding='utf-8')
print('patched stale 404 overwrite and Arabian Nights assets')
