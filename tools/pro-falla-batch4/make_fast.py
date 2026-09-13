#!/usr/bin/env python3
from pathlib import Path
import re

src=Path('tools/pro-falla-batch4/discover.py').read_text(encoding='utf-8')
replacement=r'''        async def fetch_activity(aid: int):
            async with sem:
                status,payload,raw = await request_json(session,"POST",API_HOSTS[0],json={"activitiesId":aid})
            if status!=200 or not isinstance(payload,dict) or payload.get("code")!=0 or not isinstance(payload.get("res"),dict) or not payload["res"].get("id"):
                return None
            res=payload["res"]; ext=parse_obj(res.get("extConfig")); server=parse_obj(res.get("serverConfig")); project,url,tid=project_from(ext)
            if not project: return None
            (OUT/"raw"/"activity"/f"{aid}.json").write_bytes(raw)
            return dict(activity_id=int(res["id"]),project=project,url=url,tid=tid,start=res.get("startTime"),end=res.get("endTime"),status=res.get("actStatus"),regions=list(res.get("regionList") or []),gift_count=len(res.get("giftInfoList") or []),ext=ext,server=server)

        rows=[x for x in await asyncio.gather(*(fetch_activity(i) for i in range(START_ID,END_ID+1))) if x]'''
pat=r'        async def fetch_activity\(aid: int\):\n.*?\n        rows=\[x for x in await asyncio\.gather\(\*\(fetch_activity\(i\) for i in range\(START_ID,END_ID\+1\)\)\) if x\]'
out,n=re.subn(pat,replacement,src,flags=re.S)
if n!=1: raise SystemExit(f'fetch_activity block replacements={n}')
Path('tools/pro-falla-batch4/discover_fast.py').write_text(out,encoding='utf-8')
print('wrote discover_fast.py')
