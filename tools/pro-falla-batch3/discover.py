#!/usr/bin/env python3
"""Read-only discovery of public Falla H5 campaigns.

Enumerates public activity configs, resolves translation/release manifests, excludes
projects already archived on campaigns-collected, captures production pages, and
ranks candidates by multi-loop complexity. No production state is mutated.
"""
from __future__ import annotations

import asyncio
import hashlib
import json
import math
import os
import re
import shutil
from dataclasses import asdict, dataclass
from datetime import datetime, timezone
from pathlib import Path
from typing import Any

import aiohttp
from PIL import Image, ImageDraw, ImageFont
from playwright.async_api import async_playwright

OUT = Path(os.environ.get("OUT_DIR", "artifacts/pro-falla-batch3-discovery")).resolve()
START_ID = int(os.environ.get("START_ID", "1"))
END_ID = int(os.environ.get("END_ID", "1800"))
HTTP_CONCURRENCY = int(os.environ.get("HTTP_CONCURRENCY", "18"))
CAPTURE_LIMIT = int(os.environ.get("CAPTURE_LIMIT", "72"))
CAPTURE_CONCURRENCY = int(os.environ.get("CAPTURE_CONCURRENCY", "4"))

API = "https://api.apifalla.com/api/web/activities_config/act"
CONF = "https://web.fallaweb.com/lang_conf/h5_{tid}.json"
UPLOAD = "https://web.fallaweb.com/falla-web/{project}/prod/upload.json"
SHELL = "https://web.fallaweb.com/main/index.html"
UA = "Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 Chrome/126 Mobile Safari/537.36 ProFallaResearch/3.1"
HEADERS = {
    "User-Agent": UA,
    "Accept": "application/json,text/plain,*/*",
    "Content-Type": "application/json",
    "Origin": "https://web.fallaweb.com",
    "Referer": "https://web.fallaweb.com/",
    "X-Language": "EN",
}

# Current Site v55 plus packs 01-04. Anniversary prefixes are excluded as a whole,
# so support pages cannot masquerade as new top-level campaigns.
KNOWN_EXACT = {
    "act-valentine-day-26", "act-carnival-2026", "act-makar-sankranti-26",
    "act-ramadan-main", "act-26-ramadan-eid-al-fitr", "act-rocket-fly-v3",
    "act-family-pk-2602", "act-football-carnival", "act-godfather-controversy",
    "act-christmas-25", "act-king-of-magic-25", "act-king-of-jungle-25",
    "act-miss-falla", "act-qurban-25", "act-travel", "act-father-day-23",
    "act-peak-room-pk-25", "act-peak-room-pk-2025", "act-daily-recharge-pk",
}
KNOWN_PREFIXES = (
    "act-4th-", "act-5th-", "act-6th-", "act-anniversary-2022-",
)

PROJECT_RE = re.compile(r"act-[a-z0-9][a-z0-9-]{2,}", re.I)

GROUPS = {
    "task": ("task", "mission", "daily", "check in", "checkin", "sign-in", "challenge"),
    "random": ("lottery", "draw", "spin", "scratch", "roulette", "lucky", "random"),
    "growth": ("level", "upgrade", "progress", "stage", "weapon", "boss", "record", "grow"),
    "collection": ("collect", "collection", "fragment", "piece", "album", "stamp", "illustrated"),
    "relation": (" cp ", "partner", "lover", "couple", "invite", "together", "friend"),
    "team": ("team", "family", "group", "camp", "country", "room", "pk", "battle"),
    "rank": ("rank", "ranking", "leaderboard", "top ", "champion", "honor"),
    "economy": ("shop", "store", "exchange", "redeem", "bank", "treasure", "chest", "box"),
    "schedule": ("round", "promotion", "final", "qualif", "season", "phase", "match"),
    "map": ("map", "travel", "journey", "adventure", "route", "world", "island"),
    "content": ("signup", "register", "candidate", "vote", "election", "upload", "work"),
    "commercial": ("recharge", "svip", "vip", "coin", "gift", "package", "benefit"),
}

@dataclass
class Row:
    activity_id: int
    project: str
    activity_url: str
    translate_id: int | None
    start_time: int | None
    end_time: int | None
    status: int | None
    regions: list[str]
    gift_count: int
    ext: dict[str, Any]
    server: dict[str, Any]
    conf: dict[str, Any]
    upload: dict[str, Any] | None
    title: str
    groups: list[str]
    score: float
    known: bool
    capture: dict[str, Any] | None = None


def ensure(p: Path) -> None:
    p.mkdir(parents=True, exist_ok=True)


def dump(p: Path, value: Any) -> None:
    ensure(p.parent)
    p.write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def parse_obj(v: Any) -> dict[str, Any]:
    if isinstance(v, dict):
        return v
    if not isinstance(v, str) or not v.strip():
        return {}
    try:
        x = json.loads(v)
        return x if isinstance(x, dict) else {}
    except Exception:
        return {}


def flatten(v: Any, prefix: str = "") -> list[tuple[str, str]]:
    out: list[tuple[str, str]] = []
    if isinstance(v, dict):
        for k, child in v.items():
            out += flatten(child, f"{prefix}.{k}" if prefix else str(k))
    elif isinstance(v, list):
        for i, child in enumerate(v):
            out += flatten(child, f"{prefix}[{i}]")
    elif v is not None:
        out.append((prefix, str(v)))
    return out


def project_from(ext: dict[str, Any]) -> tuple[str, str, int | None]:
    web = ext.get("web") if isinstance(ext.get("web"), dict) else {}
    page_cfg = web.get("pageConfig") if isinstance(web.get("pageConfig"), dict) else {}
    url = str(web.get("activityUrl") or "")
    m = PROJECT_RE.search(url)
    if not m:
        m = PROJECT_RE.search(json.dumps(ext, ensure_ascii=False))
    project = m.group(0).lower() if m else ""
    tid = page_cfg.get("translateId")
    try:
        tid = int(tid) if tid is not None else None
    except Exception:
        tid = None
    return project, url, tid


def feature_groups(*values: Any) -> list[str]:
    corpus = " ".join(f"{k} {v}" for value in values for k, v in flatten(value)).lower()
    corpus = " " + corpus + " "
    return [name for name, words in GROUPS.items() if any(w in corpus for w in words)]


def title_from(conf: dict[str, Any], project: str) -> str:
    candidates: list[tuple[int, str]] = []
    roots = [conf.get(x) for x in ("en", "zh", "tr", "ar", "es", "pt", "id", "bn")]
    roots = [x for x in roots if isinstance(x, dict)] + [conf]
    for root in roots:
        for key, val in flatten(root):
            text = re.sub(r"<[^>]+>", " ", val)
            text = re.sub(r"\s+", " ", text).strip()
            if not 3 <= len(text) <= 84 or text.lower().startswith("http"):
                continue
            kl = key.lower()
            prio = 0
            if any(x in kl for x in ("activitytitle", "eventtitle", "activityname", "eventname")):
                prio = 100
            elif kl.endswith("title") or kl.endswith("name"):
                prio = 70
            elif "notifytitle" in kl or "introduction" in kl:
                prio = 30
            if prio:
                candidates.append((prio + max(0, 35 - len(text) // 2), text))
    if candidates:
        return sorted(candidates, reverse=True)[0][1]
    return project.removeprefix("act-").replace("-", " ").title()


def is_known(project: str) -> bool:
    return project in KNOWN_EXACT or project.startswith(KNOWN_PREFIXES)


def complexity_score(project: str, ext: dict[str, Any], server: dict[str, Any], conf: dict[str, Any], groups: list[str], gift_count: int, upload: dict[str, Any] | None, start: int | None, end: int | None) -> float:
    score = len(groups) * 10.0
    if len(groups) >= 4: score += 18
    if len(groups) >= 6: score += 15
    if "task" in groups: score += 8
    if "economy" in groups: score += 8
    if "schedule" in groups or "map" in groups or "relation" in groups: score += 7
    if "content" in groups: score += 6
    if isinstance(server.get("taskConfig"), (dict, list)) and server.get("taskConfig"): score += 12
    if isinstance(server.get("rankLimit"), (dict, list)) and server.get("rankLimit"): score += 5
    if upload: score += 10
    score += min(10, gift_count * 1.2)
    duration = (end or 0) - (start or 0)
    if duration >= 3 * 86400: score += 4
    if duration >= 7 * 86400: score += 4
    if any(x in project for x in ("main", "festival", "carnival", "adventure", "competition", "challenge", "battle", "travel", "world", "season", "pk")): score += 8
    key_count = len({k for k, _ in flatten(conf)})
    score += min(10, key_count / 100)
    # Penalize predictable support/rank wrappers. These can still be captured if unusually rich.
    if any(x in project for x in ("weekly-support", "daily-recharge", "recharge-only", "simple-rank")): score -= 28
    if set(groups) <= {"rank", "commercial", "team"}: score -= 24
    return round(score, 2)


async def get_json(session: aiohttp.ClientSession, method: str, url: str, **kwargs: Any) -> tuple[int, Any, bytes]:
    last: Exception | None = None
    for attempt in range(3):
        try:
            async with session.request(method, url, timeout=aiohttp.ClientTimeout(total=25), **kwargs) as r:
                raw = await r.read()
                try: payload = json.loads(raw.decode("utf-8", "replace"))
                except Exception: payload = None
                return r.status, payload, raw
        except Exception as exc:
            last = exc
            await asyncio.sleep(.35 * (attempt + 1))
    return 0, {"error": repr(last)}, b""


async def enumerate_rows() -> list[Row]:
    ensure(OUT / "raw" / "activity")
    connector = aiohttp.TCPConnector(limit=HTTP_CONCURRENCY, ssl=False)
    async with aiohttp.ClientSession(headers=HEADERS, connector=connector) as session:
        sem = asyncio.Semaphore(HTTP_CONCURRENCY)

        async def fetch_activity(aid: int):
            async with sem:
                status, payload, raw = await get_json(session, "POST", API, json={"activitiesId": aid})
            if status != 200 or not isinstance(payload, dict) or payload.get("code") != 0:
                return None
            res = payload.get("res")
            if not isinstance(res, dict) or not res.get("id"):
                return None
            ext, server = parse_obj(res.get("extConfig")), parse_obj(res.get("serverConfig"))
            project, url, tid = project_from(ext)
            if not project:
                return None
            (OUT / "raw" / "activity" / f"{aid}.json").write_bytes(raw)
            return {
                "activity_id": int(res["id"]), "project": project, "url": url, "tid": tid,
                "start": res.get("startTime"), "end": res.get("endTime"), "status": res.get("actStatus"),
                "regions": list(res.get("regionList") or []), "gift_count": len(res.get("giftInfoList") or []),
                "ext": ext, "server": server,
            }

        base = [x for x in await asyncio.gather(*(fetch_activity(i) for i in range(START_ID, END_ID + 1))) if x]
        print(f"VALID_CONFIGS={len(base)}", flush=True)

        confs: dict[int, dict[str, Any]] = {}
        uploads: dict[str, dict[str, Any] | None] = {}
        conf_sem = asyncio.Semaphore(HTTP_CONCURRENCY)

        async def fetch_conf(tid: int):
            async with conf_sem:
                status, payload, raw = await get_json(session, "GET", CONF.format(tid=tid))
            if status == 200 and isinstance(payload, dict):
                ensure(OUT / "raw" / "conf")
                (OUT / "raw" / "conf" / f"h5_{tid}.json").write_bytes(raw)
                confs[tid] = payload
            else:
                confs[tid] = {}

        async def fetch_upload(project: str):
            async with conf_sem:
                status, payload, raw = await get_json(session, "GET", UPLOAD.format(project=project))
            if status == 200 and isinstance(payload, dict) and payload.get("version"):
                ensure(OUT / "raw" / "upload")
                (OUT / "raw" / "upload" / f"{project}.json").write_bytes(raw)
                uploads[project] = payload
            else:
                uploads[project] = None

        await asyncio.gather(*(fetch_conf(t) for t in sorted({x["tid"] for x in base if x["tid"]})))
        await asyncio.gather(*(fetch_upload(p) for p in sorted({x["project"] for x in base})))

    rows: list[Row] = []
    for x in base:
        conf = confs.get(x["tid"] or -1, {})
        upload = uploads.get(x["project"])
        groups = feature_groups(x["project"], x["ext"], x["server"], conf)
        rows.append(Row(
            activity_id=x["activity_id"], project=x["project"], activity_url=x["url"],
            translate_id=x["tid"], start_time=x["start"], end_time=x["end"], status=x["status"],
            regions=x["regions"], gift_count=x["gift_count"], ext=x["ext"], server=x["server"], conf=conf,
            upload=upload, title=title_from(conf, x["project"]), groups=groups,
            score=complexity_score(x["project"], x["ext"], x["server"], conf, groups, x["gift_count"], upload, x["start"], x["end"]),
            known=is_known(x["project"]),
        ))
    # Some IDs may alias the same project. Preserve the richest ID per project for discovery.
    by_project: dict[str, Row] = {}
    for row in rows:
        old = by_project.get(row.project)
        if old is None or row.score > old.score or (row.score == old.score and row.activity_id > old.activity_id):
            by_project[row.project] = row
    return sorted(by_project.values(), key=lambda r: (r.known, -r.score, -r.activity_id))


def page_url(row: Row) -> str:
    url = row.activity_url or f"{SHELL}#/{row.project}"
    sep = "&" if "?" in url else "?"
    bits = [f"activityId={row.activity_id}"]
    if row.translate_id: bits.append(f"translateId={row.translate_id}")
    return url + sep + "&".join(bits)


async def capture(rows: list[Row]) -> None:
    candidates = [r for r in rows if not r.known and r.upload and len(r.groups) >= 3]
    candidates.sort(key=lambda r: (-r.score, -r.activity_id))
    candidates = candidates[:CAPTURE_LIMIT]
    ensure(OUT / "captures")
    async with async_playwright() as pw:
        browser = await pw.chromium.launch(headless=True, args=["--no-sandbox", "--disable-dev-shm-usage"])
        sem = asyncio.Semaphore(CAPTURE_CONCURRENCY)

        async def one(row: Row):
            async with sem:
                d = OUT / "captures" / f"{row.activity_id}-{row.project}"
                ensure(d)
                context = await browser.new_context(viewport={"width":390,"height":844}, is_mobile=True, has_touch=True, locale="en-US", user_agent=UA, ignore_https_errors=True)
                page = await context.new_page()
                errors: list[dict[str, str]] = []
                responses: list[dict[str, Any]] = []
                page.on("pageerror", lambda e: errors.append({"type":"pageerror","text":str(e)}))
                page.on("requestfailed", lambda r: errors.append({"type":"requestfailed","url":r.url,"text":str(r.failure or "")}))
                page.on("response", lambda r: responses.append({"url":r.url,"status":r.status,"type":r.request.resource_type}))
                nav_error = None
                url = page_url(row)
                try:
                    await page.goto(url, wait_until="domcontentloaded", timeout=70000)
                    await page.wait_for_timeout(8000)
                    await page.evaluate("""async()=>{const s=ms=>new Promise(r=>setTimeout(r,ms));let y=0;for(let i=0;i<100;i++){const h=Math.max(document.body?.scrollHeight||0,document.documentElement.scrollHeight||0);scrollTo(0,y);await s(160);if(y+innerHeight>=h-8)break;y+=Math.max(320,Math.floor(innerHeight*.62));}scrollTo(0,0);await s(600)}""")
                except Exception as exc:
                    nav_error = repr(exc)
                try:
                    metrics = await page.evaluate("""()=>({title:document.title,bodyText:(document.body?.innerText||'').slice(0,50000),htmlLength:document.documentElement.outerHTML.length,scrollHeight:Math.max(document.body?.scrollHeight||0,document.documentElement.scrollHeight||0),imageCount:document.images.length,loadedImages:[...document.images].filter(x=>x.complete&&x.naturalWidth>0).length,brokenImages:[...document.images].filter(x=>x.complete&&x.src&&x.naturalWidth===0).map(x=>x.src),controls:[...document.querySelectorAll('button,[role=button],.van-tab,.tab')].map(x=>(x.innerText||x.getAttribute('aria-label')||'').trim()).filter(Boolean).slice(0,300),links:[...document.querySelectorAll('a[href]')].map(x=>({text:(x.innerText||'').trim(),href:x.href})).slice(0,300)})""")
                    await page.screenshot(path=str(d / "full.png"), full_page=True, animations="disabled")
                    await page.screenshot(path=str(d / "viewport.png"), full_page=False, animations="disabled")
                    (d / "dom.html").write_text(await page.content(), encoding="utf-8")
                except Exception as exc:
                    metrics = {"captureError": repr(exc)}
                await context.close()
                corpus = " " + str(metrics.get("bodyText") or "").lower() + " "
                page_groups = [name for name, words in GROUPS.items() if any(w in corpus for w in words)]
                all_groups = sorted(set(row.groups + page_groups))
                ended_only = any(x in corpus for x in ("activity has ended", "event has ended")) and int(metrics.get("scrollHeight") or 0) < 1100
                meaningful = not nav_error and not ended_only and int(metrics.get("scrollHeight") or 0) >= 1000 and int(metrics.get("loadedImages") or 0) >= 3 and len(all_groups) >= 3
                row.capture = {**metrics, "url":url, "navError":nav_error, "errors":errors, "responseCount":len(responses), "pageGroups":page_groups, "allGroups":all_groups, "meaningful":meaningful, "dir":str(d.relative_to(OUT))}
                dump(d / "result.json", {**asdict(row), "responses":responses})
                print(json.dumps({"id":row.activity_id,"project":row.project,"score":row.score,"height":metrics.get("scrollHeight"),"images":metrics.get("loadedImages"),"meaningful":meaningful}, ensure_ascii=False), flush=True)

        await asyncio.gather(*(one(r) for r in candidates))
        await browser.close()


def get_font(size: int, bold: bool=False):
    candidates = [
        "/usr/share/fonts/opentype/noto/NotoSansCJK-Bold.ttc" if bold else "/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc",
        "/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf" if bold else "/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf",
    ]
    for p in candidates:
        if Path(p).exists(): return ImageFont.truetype(p, size)
    return ImageFont.load_default()


def make_sheet(ranked: list[Row]) -> None:
    rows = [r for r in ranked if (r.capture or {}).get("meaningful")][:24]
    if not rows: rows = ranked[:24]
    cols, card_w, card_h, gap, header = 4, 340, 730, 16, 142
    nrows = max(1, math.ceil(len(rows)/cols))
    canvas = Image.new("RGB", (gap+cols*(card_w+gap), header+gap+nrows*(card_h+gap)), (8,11,18))
    draw = ImageDraw.Draw(canvas)
    draw.text((gap,20), "PRO FALLA · 下一批候选 H5", font=get_font(32,True), fill=(245,247,255))
    draw.text((gap,68), f"{len(rows)} 个新候选 · 已排除当前 Site 既有 Falla 项目", font=get_font(19), fill=(163,177,205))
    draw.text((gap,103), "发现阶段生产页证据；入库前仍需原始 SPA 全量本地化与零远端回放验收。", font=get_font(17), fill=(239,181,94))
    for i,row in enumerate(rows):
        x=gap+(i%cols)*(card_w+gap); y=header+gap+(i//cols)*(card_h+gap)
        draw.rounded_rectangle((x,y,x+card_w,y+card_h),18,fill=(22,27,40),outline=(58,68,93),width=2)
        m=row.capture or {}; p=OUT/str(m.get("dir") or "")/"full.png"
        if p.exists():
            try:
                img=Image.open(p).convert("RGB")
                target_w, target_h=card_w-20, 535
                ratio=max(target_w/img.width,target_h/img.height)
                rs=img.resize((max(1,int(img.width*ratio)),max(1,int(img.height*ratio))))
                left=max(0,(rs.width-target_w)//2)
                thumb=rs.crop((left,0,left+target_w,min(rs.height,target_h))).resize((target_w,target_h))
                canvas.paste(thumb,(x+10,y+10))
            except Exception: pass
        ty=y+560
        title=(row.title or row.project)[:36]
        draw.text((x+13,ty),f"{i+1:02d} · {title}",font=get_font(18,True),fill=(249,250,255))
        draw.text((x+13,ty+29),f"{row.project} · A{row.activity_id} · T{row.translate_id or '-'}",font=get_font(13),fill=(151,168,201))
        draw.text((x+13,ty+53),f"Score {row.score:.1f} · {'/'.join(row.groups[:6])}",font=get_font(13),fill=(121,231,190))
        draw.text((x+13,ty+77),f"{m.get('scrollHeight',0)}px · {m.get('loadedImages',0)} images · v{(row.upload or {}).get('version','-')}",font=get_font(13),fill=(209,215,230))
        draw.text((x+13,ty+105),"可进入原 SPA 深挖" if m.get("meaningful") else "仅候选，需复核",font=get_font(14,True),fill=(134,232,176) if m.get("meaningful") else (243,170,92))
    canvas.save(OUT/"CONTACT_SHEET.jpg", quality=90, optimize=True)


def report(rows: list[Row]) -> None:
    dump(OUT/"all-projects.json", [asdict(r) for r in rows])
    unknown=[r for r in rows if not r.known]
    ranked=[r for r in unknown if r.capture]
    ranked.sort(key=lambda r:(not bool((r.capture or {}).get("meaningful")),-r.score,-int((r.capture or {}).get("scrollHeight") or 0)))
    dump(OUT/"candidate-ranking.json",[asdict(r) for r in ranked])
    make_sheet(ranked)
    lines=["# Pro Falla Batch 3 Discovery","",f"- Generated: {datetime.now(timezone.utc).isoformat()}",f"- Activity range: {START_ID}–{END_ID}",f"- Unique valid projects: {len(rows)}",f"- Unknown projects: {len(unknown)}",f"- Captured: {len(ranked)}",f"- Meaningful: {sum(bool((r.capture or {}).get('meaningful')) for r in ranked)}","","| # | AID | Project | Title | Score | Groups | Height | Images | Meaningful | Release |","|---:|---:|---|---|---:|---|---:|---:|---:|---|"]
    for i,r in enumerate(ranked,1):
        m=r.capture or {}; up=r.upload or {}; title=r.title.replace("|","/")[:72]
        lines.append(f"| {i} | {r.activity_id} | `{r.project}` | {title} | {r.score:.1f} | {', '.join(r.groups)} | {m.get('scrollHeight',0)} | {m.get('loadedImages',0)} | {'yes' if m.get('meaningful') else 'no'} | {up.get('version','')} / {up.get('buildTime','')} |")
    (OUT/"REPORT.md").write_text("\n".join(lines),encoding="utf-8")


async def main():
    if OUT.exists(): shutil.rmtree(OUT)
    ensure(OUT)
    rows=await enumerate_rows()
    await capture(rows)
    report(rows)

if __name__=="__main__": asyncio.run(main())
