#!/usr/bin/env python3
from pathlib import Path

src_path = Path('tools/pro-falla-batch9-wave3/make_archiver.py')
src = src_path.read_text(encoding='utf-8')

old1 = """    'campaigns = ' + repr(campaign_block),
    base,
"""
new1 = """    lambda _m: 'campaigns = ' + repr(campaign_block),
    base,
"""
old2 = """    'custom = ' + repr(custom_block) + '\\nif needle not in src:',
    base,
"""
new2 = """    lambda _m: 'custom = ' + repr(custom_block) + '\\nif needle not in src:',
    base,
"""

if old1 not in src:
    raise SystemExit('campaign replacement block not found')
if old2 not in src:
    raise SystemExit('fixture replacement block not found')

src = src.replace(old1, new1, 1).replace(old2, new2, 1)
out = Path('tools/pro-falla-batch9-wave3/make_archiver_fixed.py')
out.write_text(src, encoding='utf-8')
print(f'wrote {out}')
