#!/usr/bin/env python3
"""Discover genuinely new medium/large Falla H5 campaigns.

Read-only workflow:
- fetches the current campaigns-collected registry and excludes every existing Falla project/card;
- enumerates Falla public activity configurations across a wide ID range;
- resolves language configs, release manifests and production bundles;
- scores coupled loops and rejects rank-only / recharge-only pages;
- captures full production H5 pages for high-value unknown candidates.
"""
from __future__ import annotations

import asyncio
import hashlib
import json
import os
import re
import time
from dataclasses import asdict, dataclass
from pathlib import Path
from typing import Any

import aiohttp
from playwright.async_api import async_playwright

OUT = Path(os.environ.get("OUT_DIR", "artifacts/pro-falla-batch4-discovery")).resolve()
START_ID = int(os.environ.get("START_ID", "1"))
END_ID = int(os.environ.get("END_ID", "2600"))
HTTP_CONCURRENCY = int(os.environ.get("HTTP_CONCURRENCY", "30"))
CAPTURE_LIMIT = int(os.environ.get("CAPTURE_LIMIT", "72"))
CAPTURE_CONCURRENCY = int(os.environ.get("CAPTURE_CONCURRENCY", "4"))
CAPTURE_WAIT_MS = int(os.environ.get("CAPTURE_WAIT_MS", "6500"))

SITE_REGISTRY = "https://campaigns-collected.jekae.chatgpt.site/data/activities.js"
API_HOSTS = [
    "https://api.apifalla.com/api/web/activities_config/act",
    "https://apihk.falla.live/api/web/activities_config/act",
]
CONF_URLS = [
    "https://web.fallaweb.com/lang_conf/h5_{tid}.json",
    "https://web.falla.live/lang_conf/pre/h5_{tid}.json",
]
UPLOAD_URLS = [
    "https://web.fallaweb.com/falla-web/{project}/prod/upload.json",
    "https://web-test.falla.live/falla-web/{project}/hk/upload.json",
    "https://web.falla.live/falla-web/{project}/pre/upload.json",
]
SHELL_PROD = "https://web.fallaweb.com/main/index.html"
SHELL_TEST = "https://web-test.falla.live/falla-web/micro-main/index.html"
UA = "Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36 ProFallaResearch/4.0"
HEADERS = {
    "User-Agent": UA,
    "Accept": "application/json,text/plain,*/*",
    "Content-Type": "application/json;charset=UTF-8",
    "Origin": "https://web.fallaweb.com",
    "Referer": "https://web.fallaweb.com/",
    "X-Language": "EN",
}
PROJECT_RE = re.compile(r"act-[a-z0-9][a-z0-9-]{2,}", re.I)

# Safety fallback. Live Site registry remains the primary exclusion source.
KNOWN_PROJECTS = {
    "act-valentine-day-26", "act-carnival-2026", "act-makar-sankranti-26",
    "act-ramadan-main", "act-26-ramadan-eid-al-fitr", "act-rocket-fly-v3",
    "act-family-pk-2602", "act-football-carnival", "act-godfather-controversy",
    "act-christmas-25", "act-king-of-magic-25", "act-king-of-jungle-25",
    "act-miss-falla", "act-qurban-25", "act-travel", "act-father-day-23",
    "act-peak-room-pk-25", "act-peak-room-pk-2025", "act-daily-recharge-pk",
    "act-bengali-new-year-24", "act-blind-box-rave", "act-hatching-chicks",
    "act-diwali-festival-25", "act-blind-box-challenge-25", "act-black-diamond",
    "act-black-diamond-lottery", "act-winter-festival", "act-winter-cp",
    "act-winter-room", "act-winter-family",
    "act-25-ramadan-rich-pk", "act-25-ramadan-main", "act-25-ramadan-food-carnival",
    "act-25-ramadan-happy-holi", "act-25-ramadan-light", "act-25-ramadan-treasure-hunting",
    "act-25-ramadan-gift", "act-25-ramadan-eid-al-fitr",
}
KNOWN_PREFIXES = ("act-4th-", "act-5th-", "act-6th-", "act-anniversary-2022-")

GROUPS = {
    "task": ("task", "mission", "daily", "checkin", "check-in", "sign in", "challenge"),
    "random": ("lottery", "draw", "spin", "scratch", "roulette", "blind", "random", "lucky"),
    "growth": ("level", "upgrade", "progress", "stage", "weapon", "boss", "grow", "hatch", "record"),
    "collection": ("collect", "collection", "fragment", "piece", "album", "stamp", "illustrated", "card"),
    "relation": (" cp ", "partner", "lover", "couple", "sweet", "intimacy", "together", "friend", "invite"),
    "team": ("team", "family", "guild", "group", "camp", "country", "room", "pk", "battle", "war"),
    "rank": ("rank", "ranking", "leaderboard", "top ", "champion", "honor"),
    "economy": ("shop", "store", "exchange", "redeem", "bank", "treasure", "chest", "box", "pool"),
    "schedule": ("round", "promotion", "final", "qualif", "season", "phase", "match", "stage"),
    "map": ("map", "travel", "journey", "adventure", "route", "world", "island", "city"),
    "content": ("signup", "register", "candidate", "vote", "election", "upload", "audition", "talent", "singer"),
    "commercial": ("recharge", "svip", "vip", "coin", "gift", "package", "benefit"),
}
CORE = {"task", "random", "growth", "collection", "relation", "team", "economy", "schedule", "map", "content"}

@dataclass
class Candidate:
    activity_id: int
    project: str
    activity_url: str
    translate_id: int | None
    start_time: int | None
    end_time: int | None
    status: int | None
    regions: list[str]
    gift_count: int
    title: str
    groups: list[str]
    core_groups: list[str]
    route_hints: list[str]
    api_hints: list[str]
    upload_mode: str | None
    version: str | None
    score: float
    known: bool
    exclusion_reason: str | None
    capture: dict[str, Any] | None = None


def ensure(p: Path) -> None:
    p.mkdir(parents=True, exist_ok=True)


def dump(p: Path, value: Any) -> None:
    ensure(p.parent)
    p.write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def parse_obj(v: Any) -> dict[str, Any]:
    if isinstance(v, dict): return v
    if isinstance(v, str) and v.strip():
        try:
            x = json.loads(v)
            return x if isinstance(x, dict) else {}
        except Exception: pass
    return {}


def flatten(v: Any, prefix: str = "") -> list[tuple[str, str]]:
    out: list[tuple[str, str]] = []
    if isinstance(v, dict):
        for k, child in v.items(): out += flatten(child, f"{prefix}.{k}" if prefix else str(k))
    elif isinstance(v, list):
        for i, child in enumerate(v): out += flatten(child, f"{prefix}[{i}]")
    elif v is not None:
        out.append((prefix, str(v)))
    return out


def project_from(ext: dict[str, Any]) -> tuple[str, str, int | None]:
    web = ext.get("web") if isinstance(ext.get("web"), dict) else {}
    page = web.get("pageConfig") if isinstance(web.get("pageConfig"), dict) else {}
    url = str(web.get("activityUrl") or "")
    m = PROJECT_RE.search(url) or PROJECT_RE.search(json.dumps(ext, ensure_ascii=False))
    project = m.group(0).lower() if m else ""
    tid = page.get("translateId")
    try: tid = int(tid) if tid is not None else None
    except Exception: tid = None
    return project, url, tid


def corpus(*values: Any) -> str:
    return " " + " ".join(f"{k} {v}" for value in values for k, v in flatten(value)).lower() + " "


def feature_groups(text: str) -> list[str]:
    return [name for name, words in GROUPS.items() if any(w in text for w in words)]


def title_from(conf: dict[str, Any], project: str) -> str:
    rows: list[tuple[int, str]] = []
    roots = [conf.get(k) for k in ("en", "zh", "ar", "tr", "es", "pt", "id", "bn")]
    roots = [x for x in roots if isinstance(x, dict)] + [conf]
    for root in roots:
        for key, value in flatten(root):
            text = re.sub(r"<[^>]+>", " ", value)
            text = re.sub(r"\s+", " ", text).strip()
            if not 3 <= len(text) <= 90 or text.lower().startswith("http"): continue
            lk = key.lower(); priority = 0
            if any(x in lk for x in ("activitytitle", "eventtitle", "activityname", "eventname")): priority = 120
            elif lk.endswith("title") or lk.endswith("name"): priority = 75
            elif any(x in lk for x in ("notifytitle", "introduction", "sharetitle")): priority = 35
            if priority: rows.append((priority + max(0, 40-len(text)//2), text))
    return sorted(rows, reverse=True)[0][1] if rows else project.removeprefix("act-").replace("-", " ").title()


def routes_from_bundle(text: str) -> list[str]:
    routes: set[str] = set()
    patterns = [
        r"path\s*:\s*[\"'`]([^\"'`]{1,120})[\"'`]",
        r"[\"'`](\/(?:main|rule-reward|rule|reward|task|rank|map|record|store|shop|challenge|lottery|pk)[A-Za-z0-9_\-/:]*)[\"'`]",
    ]
    for pat in patterns:
        for m in re.finditer(pat, text):
            p = m.group(1).split("?")[0]
            if not p.startswith("/"): p = "/" + p
            if len(p) <= 120 and not re.search(r"\.(?:png|jpg|js|css|json|svg)$", p, re.I): routes.add(p)
    return sorted(routes)


def apis_from_bundle(text: str) -> list[str]:
    out = set()
    for m in re.finditer(r"[\"'`](/(?:api/)?(?:web/)?(?:act|activities_config|probability|user)/[A-Za-z0-9_\-/:]{2,160})[\"'`]", text):
        out.add(m.group(1))
    return sorted(out)


def known(project: str, site_projects: set[str]) -> bool:
    return project in site_projects or project in KNOWN_PROJECTS or project.startswith(KNOWN_PREFIXES)


def score_candidate(project: str, groups: list[str], routes: list[str], apis: list[str], server: dict[str, Any], conf: dict[str, Any], upload: dict[str, Any] | None, gift_count: int, start: int | None, end: int | None) -> tuple[float, str | None]:
    core = set(groups) & CORE
    score = len(core)*15 + len(groups)*3 + min(18, len(routes)*2.2) + min(10, len(apis)*1.2)
    if len(core) >= 3: score += 18
    if len(core) >= 5: score += 18
    if "task" in core: score += 7
    if "economy" in core: score += 7
    if core & {"map","relation","content","schedule"}: score += 8
    if upload: score += 10
    if isinstance(server.get("taskConfig"), (dict,list)) and server.get("taskConfig"): score += 10
    score += min(10, gift_count*1.2)
    duration = (end or 0)-(start or 0)
    if duration >= 3*86400: score += 4
    if duration >= 7*86400: score += 4
    if any(x in project for x in ("main","festival","season","journey","adventure","competition","championship","battle","challenge","world","travel","pk")): score += 9
    score += min(10, len(flatten(conf))/110)

    reason = None
    if len(core) < 2: reason = "fewer-than-two-coupled-loops"
    if set(groups) <= {"rank","team","commercial"}: reason = "rank-or-commercial-wrapper"
    if any(x in project for x in ("weekly-support","daily-recharge","recharge-only","simple-rank")): reason = "support-or-recharge-only"
    if len(routes) <= 1 and core <= {"team","rank","commercial"}: reason = "single-page-rank"
    if reason: score -= 45
    return round(score,2), reason


async def request_json(session: aiohttp.ClientSession, method: str, url: str, **kwargs: Any) -> tuple[int, Any, bytes]:
    last = None
    for attempt in range(3):
        try:
            async with session.request(method, url, timeout=aiohttp.ClientTimeout(total=28), **kwargs) as r:
                raw = await r.read()
                try: payload = json.loads(raw.decode("utf-8-sig", "replace"))
                except Exception: payload = None
                return r.status, payload, raw
        except Exception as e:
            last = e; await asyncio.sleep(.25*(attempt+1))
    return 0, {"error":repr(last)}, b""


async def fetch_site_registry(session: aiohttp.ClientSession) -> tuple[set[str], str]:
    try:
        async with session.get(SITE_REGISTRY, timeout=aiohttp.ClientTimeout(total=40), headers={"User-Agent":UA}) as r:
            text = await r.text(errors="replace")
            (OUT/"site-activities.js").write_text(text, encoding="utf-8")
            return {m.group(0).lower() for m in PROJECT_RE.finditer(text)}, text
    except Exception as e:
        return set(), f"ERROR: {e!r}"


async def main() -> None:
    ensure(OUT); ensure(OUT/"raw"/"activity"); ensure(OUT/"raw"/"conf"); ensure(OUT/"raw"/"upload"); ensure(OUT/"raw"/"bundle"); ensure(OUT/"captures")
    connector = aiohttp.TCPConnector(limit=HTTP_CONCURRENCY, ssl=False)
    async with aiohttp.ClientSession(headers=HEADERS, connector=connector) as session:
        site_projects, site_text = await fetch_site_registry(session)
        print(f"SITE_PROJECTS={len(site_projects)}", flush=True)
        sem = asyncio.Semaphore(HTTP_CONCURRENCY)

        async def fetch_activity(aid: int):
            payloads = [{"activitiesId":aid},{"activityId":aid},{"id":aid}]
            for host in API_HOSTS:
                for body in payloads:
                    async with sem:
                        status,payload,raw = await request_json(session,"POST",host,json=body)
                    if status==200 and isinstance(payload,dict) and payload.get("code")==0 and isinstance(payload.get("res"),dict) and payload["res"].get("id"):
                        res=payload["res"]; ext=parse_obj(res.get("extConfig")); server=parse_obj(res.get("serverConfig")); project,url,tid=project_from(ext)
                        if not project: continue
                        (OUT/"raw"/"activity"/f"{aid}.json").write_bytes(raw)
                        return dict(activity_id=int(res["id"]),project=project,url=url,tid=tid,start=res.get("startTime"),end=res.get("endTime"),status=res.get("actStatus"),regions=list(res.get("regionList") or []),gift_count=len(res.get("giftInfoList") or []),ext=ext,server=server)
            return None

        rows=[x for x in await asyncio.gather(*(fetch_activity(i) for i in range(START_ID,END_ID+1))) if x]
        print(f"VALID_ACTIVITY_CONFIGS={len(rows)}", flush=True)
        # Keep richest/latest row per project.
        by_project: dict[str,dict[str,Any]]={}
        for x in rows:
            old=by_project.get(x["project"])
            if old is None or x["activity_id"]>old["activity_id"]: by_project[x["project"]]=x
        rows=list(by_project.values())

        confs: dict[int,dict[str,Any]]={}; uploads: dict[str,tuple[dict[str,Any]|None,str|None]]={}; bundles: dict[str,str]={}
        async def fetch_conf(tid:int):
            for tpl in CONF_URLS:
                status,payload,raw=await request_json(session,"GET",tpl.format(tid=tid))
                if status==200 and isinstance(payload,dict):
                    (OUT/"raw"/"conf"/f"h5_{tid}.json").write_bytes(raw); confs[tid]=payload; return
            confs[tid]={}
        async def fetch_upload(project:str):
            for tpl in UPLOAD_URLS:
                url=tpl.format(project=project); status,payload,raw=await request_json(session,"GET",url)
                if status==200 and isinstance(payload,dict) and payload.get("version"):
                    mode="prod" if "/prod/" in url else "hk" if "/hk/" in url else "pre"
                    (OUT/"raw"/"upload"/f"{project}-{mode}.json").write_bytes(raw); uploads[project]=(payload,mode); return
            uploads[project]=(None,None)
        await asyncio.gather(*(fetch_conf(t) for t in sorted({x["tid"] for x in rows if x["tid"]})))
        await asyncio.gather(*(fetch_upload(p) for p in sorted({x["project"] for x in rows})))

        async def fetch_bundle(project:str):
            upload,mode=uploads.get(project,(None,None));
            if not upload or not mode: bundles[project]=""; return
            ver=str(upload.get("version")); hosts=[]
            if mode=="prod": hosts=["https://web.fallaweb.com"]
            elif mode=="hk": hosts=["https://web-test.falla.live"]
            else: hosts=["https://web.falla.live"]
            for host in hosts:
                for name in ("js/index.js","index.js","assets/index.js"):
                    url=f"{host}/falla-web/{project}/{mode}/{ver}/{name}"
                    try:
                        async with session.get(url,headers={"User-Agent":UA},timeout=aiohttp.ClientTimeout(total=35)) as r:
                            raw=await r.read()
                            if r.status==200 and len(raw)>1000:
                                text=raw.decode("utf-8","replace"); bundles[project]=text; (OUT/"raw"/"bundle"/f"{project}.js").write_bytes(raw); return
                    except Exception: pass
            bundles[project]=""
        await asyncio.gather(*(fetch_bundle(p) for p in sorted({x["project"] for x in rows})))

    candidates: list[Candidate]=[]
    raw_meta=[]
    for x in rows:
        conf=confs.get(x["tid"] or -1,{}); upload,mode=uploads.get(x["project"],(None,None)); bundle=bundles.get(x["project"],"")
        text=corpus(x["project"],x["ext"],x["server"],conf,bundle[:300000])
        groups=feature_groups(text); core=sorted(set(groups)&CORE); routes=routes_from_bundle(bundle); apis=apis_from_bundle(bundle)
        score,reason=score_candidate(x["project"],groups,routes,apis,x["server"],conf,upload,x["gift_count"],x["start"],x["end"])
        k=known(x["project"],site_projects)
        c=Candidate(activity_id=x["activity_id"],project=x["project"],activity_url=x["url"],translate_id=x["tid"],start_time=x["start"],end_time=x["end"],status=x["status"],regions=x["regions"],gift_count=x["gift_count"],title=title_from(conf,x["project"]),groups=groups,core_groups=core,route_hints=routes[:40],api_hints=apis[:40],upload_mode=mode,version=str(upload.get("version")) if upload else None,score=score,known=k,exclusion_reason=reason)
        candidates.append(c)
        raw_meta.append({**asdict(c),"ext":x["ext"],"server":x["server"],"confKeyCount":len(flatten(conf))})
    candidates.sort(key=lambda c:(c.known,c.exclusion_reason is not None,-c.score,-c.activity_id))
    dump(OUT/"all-candidates.json",raw_meta)

    # Capture only genuinely unknown high-value projects.
    capture_targets=[c for c in candidates if not c.known and c.exclusion_reason is None and len(c.core_groups)>=2][:CAPTURE_LIMIT]
    print(f"CAPTURE_TARGETS={len(capture_targets)}", flush=True)
    async with async_playwright() as pw:
        browser=await pw.chromium.launch(headless=True,args=["--no-sandbox","--disable-dev-shm-usage"])
        sem=asyncio.Semaphore(CAPTURE_CONCURRENCY)
        async def capture(c:Candidate):
            async with sem:
                context=await browser.new_context(viewport={"width":390,"height":844},device_scale_factor=1,is_mobile=True,has_touch=True,locale="en-US",ignore_https_errors=True,service_workers="block",user_agent=UA)
                page=await context.new_page(); errors=[]; responses=[]
                page.on("pageerror",lambda e: errors.append({"type":"pageerror","text":str(e)}))
                page.on("requestfailed",lambda r: errors.append({"type":"requestfailed","url":r.url,"reason":(r.failure or "")}))
                page.on("response",lambda r: responses.append({"url":r.url,"status":r.status,"type":r.request.resource_type}))
                url=c.activity_url.strip()
                if not url or c.project not in url.lower():
                    shell=SHELL_TEST if c.upload_mode=="hk" else SHELL_PROD
                    url=f"{shell}#/{c.project}?activityId={c.activity_id}"+(f"&translateId={c.translate_id}" if c.translate_id else "")
                nav=None
                try:
                    await page.goto(url,wait_until="domcontentloaded",timeout=80000); await page.wait_for_timeout(CAPTURE_WAIT_MS)
                    await page.evaluate("""async()=>{const w=ms=>new Promise(r=>setTimeout(r,ms));let y=0;for(let i=0;i<100;i++){const h=Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);scrollTo(0,y);await w(140);if(y+innerHeight>=h-8)break;y+=Math.max(330,innerHeight*.68)}scrollTo(0,0);await w(500)}""")
                except Exception as e: nav=repr(e)
                metrics=await page.evaluate("""()=>({title:document.title,href:location.href,text:(document.body?.innerText||'').slice(0,30000),htmlLength:document.documentElement?.outerHTML?.length||0,scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement?.scrollHeight||0),imageCount:document.images.length,loadedImages:[...document.images].filter(i=>i.complete&&i.naturalWidth>0).length,brokenImages:[...document.images].filter(i=>{const raw=(i.getAttribute('src')||i.getAttribute('srcset')||'').trim();return i.complete&&raw&&i.naturalWidth===0}).map(i=>i.currentSrc||i.src).slice(0,100)})""")
                d=OUT/"captures"/f"{c.activity_id}-{c.project}"; ensure(d)
                await page.screenshot(path=str(d/"full.png"),full_page=True,animations="disabled")
                (d/"dom.html").write_text(await page.content(),encoding="utf-8")
                dump(d/"errors.json",errors); dump(d/"responses.json",responses)
                visible_error=bool(re.search(r"error request|try again later|page.*doesn.t exist|404|activity ended",metrics.get("text","") or "",re.I))
                c.capture={"url":url,"navError":nav,"metrics":metrics,"visibleError":visible_error,"responseCount":len(responses),"errorCount":len(errors),"screenshot":str((d/"full.png").relative_to(OUT))}
                await context.close()
        await asyncio.gather(*(capture(c) for c in capture_targets))
        await browser.close()

    # Re-rank with real page evidence; blank/error pages are not promoted.
    for c in capture_targets:
        cap=c.capture or {}; m=cap.get("metrics") or {}
        if cap.get("navError"): c.score-=35
        if cap.get("visibleError"): c.score-=10
        if m.get("scrollHeight",0)>=1400: c.score+=7
        if m.get("scrollHeight",0)>=2600: c.score+=7
        if m.get("loadedImages",0)>=8: c.score+=6
        if m.get("loadedImages",0)>=18: c.score+=5
        if m.get("htmlLength",0)<5000 or m.get("scrollHeight",0)<900: c.score-=35
        if m.get("brokenImages"): c.score-=min(20,len(m["brokenImages"])*3)
        c.score=round(c.score,2)
    capture_targets.sort(key=lambda c:-c.score)
    dump(OUT/"ranked-new-candidates.json",[asdict(c) for c in capture_targets])

    # Compact report.
    lines=["# Pro Falla Batch 4 Discovery","",f"- Activity ID range: {START_ID}–{END_ID}",f"- Valid unique projects: {len(candidates)}",f"- Live Site project exclusions: {len(site_projects)}",f"- Captured unknown candidates: {len(capture_targets)}","", "## Ranked unknown medium/large candidates",""]
    for i,c in enumerate(capture_targets[:40],1):
        m=(c.capture or {}).get("metrics") or {}
        lines += [f"### {i}. {c.title}","",f"- Project: `{c.project}`",f"- Activity ID / Translate ID: `{c.activity_id}` / `{c.translate_id}`",f"- Score: **{c.score}**",f"- Core loops: {', '.join(c.core_groups)}",f"- Route hints: {len(c.route_hints)}",f"- Page: {m.get('scrollHeight',0)}px / {m.get('loadedImages',0)} loaded images / visibleError={bool((c.capture or {}).get('visibleError'))}",f"- Screenshot: `{(c.capture or {}).get('screenshot','')}`",""]
    (OUT/"REPORT.md").write_text("\n".join(lines),encoding="utf-8")
    print(json.dumps({"validProjects":len(candidates),"siteExclusions":len(site_projects),"captured":len(capture_targets),"top":[{"project":c.project,"title":c.title,"score":c.score,"loops":c.core_groups,"scroll":((c.capture or {}).get("metrics") or {}).get("scrollHeight")} for c in capture_targets[:15]]},ensure_ascii=False,indent=2),flush=True)

if __name__=="__main__":
    asyncio.run(main())
