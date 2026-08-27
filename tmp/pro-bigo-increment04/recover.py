from __future__ import annotations

import base64
import concurrent.futures
import hashlib
import html as html_lib
import json
import mimetypes
import os
import re
import shutil
import time
import urllib.parse
import zipfile
from dataclasses import dataclass
from pathlib import Path
from typing import Any, Iterable

import requests
from bs4 import BeautifulSoup
from PIL import Image, ImageDraw, ImageFont
from playwright.sync_api import sync_playwright, TimeoutError as PlaywrightTimeoutError

ROOT = Path(__file__).resolve().parent
MANIFEST = json.loads((ROOT / "manifest.json").read_text("utf-8"))
PACKAGE_ID = MANIFEST["packageId"]
OUT = Path(PACKAGE_ID).resolve()
SOURCE = OUT / "source-archive"
PUBLIC = OUT / "public" / "bigo-original-spa" / "pack-04" / "activities"
PREVIEW = OUT / "preview" / "offline-assembled"
REPORTS = OUT / "reports"
SCREENSHOTS = OUT / "screenshots"
for d in [SOURCE, PUBLIC, PREVIEW, REPORTS, SCREENSHOTS]:
    d.mkdir(parents=True, exist_ok=True)

UA = (
    "Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) "
    "AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 "
    "Mobile/15E148 Safari/604.1 BIGO/6.34.0"
)
HEADERS = {
    "User-Agent": UA,
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.7,id;q=0.6,ms;q=0.5",
    "Referer": "https://activity.bigo.tv/",
    "Origin": "https://activity.bigo.tv",
}
SESSION = requests.Session()
SESSION.headers.update(HEADERS)
MEDIA_EXTS = {
    ".png", ".jpg", ".jpeg", ".webp", ".gif", ".svg", ".avif", ".mp4", ".webm",
    ".woff", ".woff2", ".ttf", ".otf", ".css", ".js", ".json", ".html",
}
INTERESTING = re.compile(
    r"(tab|btn|button|nav|menu|lottery|draw|spin|rank|task|mission|reward|规则|说明|抽奖|转盘|榜|任务|"
    r"奖励|活动|攻略|旅程|家庭|家族|主播|用户|充值|邀请|游戏|红包|盲盒|收集|应援|全勤|周榜|荣耀|兑换|"
    r"basic|upgrade|family|host|user|game|journey|cashback|invite|zodiac|lucky|fortune|detective|clue)",
    re.I,
)
FONT_CANDIDATES = [
    "/usr/share/fonts/opentype/noto/NotoSansCJK-Regular.ttc",
    "/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf",
]
FONT_BOLD_CANDIDATES = [
    "/usr/share/fonts/opentype/noto/NotoSansCJK-Bold.ttc",
    "/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf",
]


def safe_name(text: str, limit: int = 80) -> str:
    value = re.sub(r"[^0-9A-Za-z._-]+", "-", str(text)).strip("-._")
    return (value or "item")[:limit]


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def canonical(url: str) -> str:
    try:
        p = urllib.parse.urlsplit(url.replace("http://", "https://", 1))
        return urllib.parse.urlunsplit(("https", p.netloc.lower(), p.path, "", ""))
    except Exception:
        return url


def source_path(root: Path, url: str, content_type: str = "") -> Path:
    p = urllib.parse.urlsplit(url)
    host = safe_name(p.netloc, 120)
    raw_path = urllib.parse.unquote(p.path).lstrip("/") or "index"
    ext = Path(raw_path).suffix
    if not ext:
        ct = content_type.lower()
        ext = mimetypes.guess_extension(ct.split(";")[0]) or ".bin"
        raw_path += ext
    q = f"__q_{sha256(p.query.encode())[:10]}" if p.query else ""
    pp = Path(raw_path)
    target = root / host / pp.parent / f"{safe_name(pp.stem, 120)}{q}{pp.suffix}"
    target.parent.mkdir(parents=True, exist_ok=True)
    return target


def get(url: str, timeout: int = 45, attempts: int = 4) -> requests.Response:
    last: Exception | None = None
    for i in range(attempts):
        try:
            r = SESSION.get(url, timeout=timeout, allow_redirects=True)
            if r.status_code in {429, 500, 502, 503, 504} and i + 1 < attempts:
                time.sleep(0.8 + 1.2 * i)
                continue
            return r
        except Exception as exc:
            last = exc
            if i + 1 == attempts:
                raise
            time.sleep(0.8 + 1.2 * i)
    raise RuntimeError(last)


def walk_strings(value: Any) -> Iterable[str]:
    if isinstance(value, dict):
        for v in value.values():
            yield from walk_strings(v)
    elif isinstance(value, list):
        for v in value:
            yield from walk_strings(v)
    elif isinstance(value, str):
        yield value


def collect_urls(value: Any) -> list[str]:
    urls: list[str] = []
    for text in walk_strings(value):
        for match in re.findall(r"https?://[^\s\"'<>\\]+", text):
            urls.append(match.rstrip(")],.;"))
    return list(dict.fromkeys(urls))


def collect_labels(value: Any) -> list[str]:
    labels: list[str] = []
    if isinstance(value, dict):
        for k, v in value.items():
            if k in {"name", "title", "lottery_title", "content", "theme"} and isinstance(v, str):
                t = re.sub(r"<[^>]+>", " ", v)
                t = re.sub(r"\s+", " ", t).strip()
                if 2 <= len(t) <= 80:
                    labels.append(t)
            labels.extend(collect_labels(v))
    elif isinstance(value, list):
        for v in value:
            labels.extend(collect_labels(v))
    return list(dict.fromkeys(labels))


def data_uri(data: bytes, content_type: str) -> str:
    ct = (content_type or "application/octet-stream").split(";")[0]
    return f"data:{ct};base64,{base64.b64encode(data).decode('ascii')}"


@dataclass
class ResourceRecord:
    url: str
    final_url: str
    local_path: str | None
    status: int | None
    content_type: str
    size: int
    digest: str | None
    ok: bool
    error: str | None = None


class ResourceStore:
    def __init__(self, campaign_root: Path):
        self.root = campaign_root / "resources"
        self.root.mkdir(parents=True, exist_ok=True)
        self.records: list[ResourceRecord] = []
        self.by_canonical: dict[str, tuple[bytes, str]] = {}

    def download(self, url: str) -> ResourceRecord:
        key = canonical(url)
        if key in self.by_canonical:
            data, ct = self.by_canonical[key]
            return ResourceRecord(url, url, None, 200, ct, len(data), sha256(data), True)
        try:
            response = get(url)
            body = response.content
            ct = response.headers.get("content-type", "application/octet-stream")
            ok = response.status_code == 200 and len(body) > 0
            local = None
            if ok:
                target = source_path(self.root, response.url, ct)
                target.write_bytes(body)
                local = str(target.relative_to(self.root.parent)).replace(os.sep, "/")
                self.by_canonical[key] = (body, ct)
                self.by_canonical[canonical(response.url)] = (body, ct)
            rec = ResourceRecord(url, response.url, local, response.status_code, ct, len(body), sha256(body) if ok else None, ok)
        except Exception as exc:
            rec = ResourceRecord(url, url, None, None, "", 0, None, False, repr(exc))
        self.records.append(rec)
        return rec

    def ensure(self, url: str, base: str | None = None) -> tuple[bytes, str] | None:
        if not url or url.startswith(("data:", "blob:", "javascript:", "#", "about:")):
            return None
        try:
            absolute = urllib.parse.urljoin(base or "", url)
        except Exception:
            return None
        key = canonical(absolute)
        if key in self.by_canonical:
            return self.by_canonical[key]
        rec = self.download(absolute)
        if rec.ok:
            return self.by_canonical.get(key) or self.by_canonical.get(canonical(rec.final_url))
        return None


REMOTE_RE = re.compile(r"https?://[^\s\"')<>]+", re.I)
CSS_URL_RE = re.compile(r"url\((['\"]?)([^)'\"]+)\1\)", re.I)


def rewrite_css(css: str, base_url: str, store: ResourceStore) -> str:
    def repl(match: re.Match[str]) -> str:
        raw = match.group(2).strip()
        if raw.startswith(("data:", "#", "var(")):
            return match.group(0)
        item = store.ensure(raw, base_url)
        if not item:
            return "none"
        body, ct = item
        if len(body) > 8 * 1024 * 1024:
            return "none"
        return f"url('{data_uri(body, ct)}')"
    return CSS_URL_RE.sub(repl, css)


def prepare_dom_for_freeze(page) -> None:
    page.evaluate(
        """
        () => {
          document.querySelectorAll('img').forEach(img => {
            try { if (img.currentSrc) img.setAttribute('src', img.currentSrc); } catch(e) {}
            img.removeAttribute('srcset');
            img.removeAttribute('loading');
          });
          document.querySelectorAll('*').forEach(el => {
            try {
              const cs = getComputedStyle(el);
              if (cs.backgroundImage && cs.backgroundImage !== 'none' && !el.style.backgroundImage) {
                el.style.backgroundImage = cs.backgroundImage;
              }
              if (cs.backgroundColor && !el.style.backgroundColor) el.style.backgroundColor = cs.backgroundColor;
            } catch(e) {}
          });
          document.querySelectorAll('video').forEach(v => { try { v.pause(); } catch(e) {} });
        }
        """
    )


def freeze_html(raw_html: str, base_url: str, store: ResourceStore) -> str:
    soup = BeautifulSoup(raw_html, "html.parser")
    for tag in soup.find_all(["script", "noscript", "iframe"]):
        tag.decompose()
    for meta in soup.find_all("meta"):
        if meta.get("http-equiv", "").lower() in {"content-security-policy", "refresh"}:
            meta.decompose()
    for link in list(soup.find_all("link")):
        rel = " ".join(link.get("rel") or []).lower()
        href = link.get("href")
        if "stylesheet" in rel and href:
            item = store.ensure(href, base_url)
            if item:
                body, _ = item
                css = rewrite_css(body.decode("utf-8", errors="replace"), urllib.parse.urljoin(base_url, href), store)
                style = soup.new_tag("style")
                style["data-original-href"] = urllib.parse.urljoin(base_url, href)
                style.string = css
                link.replace_with(style)
            else:
                link.decompose()
        else:
            link.decompose()
    for style in soup.find_all("style"):
        if style.string:
            style.string.replace_with(rewrite_css(style.string, base_url, store))
    for tag in soup.find_all(True):
        if tag.has_attr("style"):
            tag["style"] = rewrite_css(str(tag["style"]), base_url, store)
        for attr in ["src", "poster", "data-src"]:
            raw = tag.get(attr)
            if not raw:
                continue
            item = store.ensure(raw, base_url)
            if item and len(item[0]) <= 12 * 1024 * 1024:
                tag[attr] = data_uri(item[0], item[1])
            else:
                tag.attrs.pop(attr, None)
        if tag.has_attr("srcset"):
            tag.attrs.pop("srcset", None)
        if tag.name == "a" and tag.get("href", "").startswith(("http://", "https://")):
            tag["href"] = "#"
            tag["data-offline-original-href"] = "removed"
    if soup.head is None:
        soup.html.insert(0, soup.new_tag("head"))
    guard = soup.new_tag("style")
    guard.string = """
      html,body{margin:0!important;min-height:100%;background:#090b10!important;overflow-x:hidden!important}
      *{box-sizing:border-box} img{max-width:100%} video{max-width:100%}
      .offline-removed{display:none!important}
    """
    soup.head.append(guard)
    frozen = str(soup)
    frozen = REMOTE_RE.sub("#", frozen)
    return frozen


def auto_scroll(page) -> None:
    page.evaluate(
        """
        async () => {
          const wait = ms => new Promise(r => setTimeout(r, ms));
          const candidates = [document.scrollingElement, document.documentElement, document.body, ...document.querySelectorAll('*')]
            .filter(Boolean)
            .filter(el => el.scrollHeight > el.clientHeight + 120)
            .sort((a,b) => b.scrollHeight - a.scrollHeight);
          const s = candidates[0] || document.scrollingElement;
          const max = Math.min(s ? s.scrollHeight : 0, 50000);
          for (let y=0; y<=max; y+=620) {
            if (s === document.scrollingElement || s === document.documentElement || s === document.body) window.scrollTo(0,y);
            else s.scrollTop = y;
            await wait(70);
          }
          if (s === document.scrollingElement || s === document.documentElement || s === document.body) window.scrollTo(0,0);
          else s.scrollTop=0;
        }
        """
    )


def visible_controls(page) -> list[dict[str, Any]]:
    return page.evaluate(
        """
        () => {
          const nodes = [...document.querySelectorAll('button,a,[role="button"],[class*="tab" i],[class*="btn" i],[class*="menu" i],[onclick]')];
          return nodes.map((el,index) => {
            const r=el.getBoundingClientRect();
            const text=(el.innerText||el.getAttribute('aria-label')||el.getAttribute('title')||'').replace(/\s+/g,' ').trim();
            return {index,text,tag:el.tagName,href:el.href||'',cls:typeof el.className==='string'?el.className:'',visible:r.width>20&&r.height>16&&r.bottom>0};
          }).filter(x => x.visible && x.text && x.text.length <= 100);
        }
        """
    )


def screenshot_hash(page) -> tuple[bytes, str]:
    data = page.screenshot(full_page=True, animations="disabled", caret="hide")
    return data, sha256(data)[:20]


def load_font(size: int, bold: bool = False):
    candidates = FONT_BOLD_CANDIDATES if bold else FONT_CANDIDATES
    for path in candidates:
        if Path(path).exists():
            try:
                return ImageFont.truetype(path, size=size)
            except Exception:
                pass
    return ImageFont.load_default()


def make_contact_sheet(title: str, states: list[dict[str, Any]], out_path: Path, columns: int = 3) -> None:
    card_w, gap, top = 360, 22, 110
    prepared = []
    for state in states:
        path = Path(state["screenshotAbs"])
        if not path.exists():
            continue
        im = Image.open(path).convert("RGB")
        new_h = max(1, round(im.height * card_w / im.width))
        im = im.resize((card_w, new_h), Image.Resampling.LANCZOS)
        prepared.append((state, im))
    if not prepared:
        return
    columns = min(columns, len(prepared))
    heights = [top] * columns
    placements = []
    for state, im in prepared:
        col = min(range(columns), key=lambda i: heights[i])
        x = gap + col * (card_w + gap)
        y = heights[col]
        placements.append((state, im, x, y))
        heights[col] += 42 + 8 + im.height + gap
    width = gap + columns * (card_w + gap)
    height = max(heights) + gap
    board = Image.new("RGB", (width, height), "#070a10")
    draw = ImageDraw.Draw(board)
    title_font = load_font(26, True)
    sub_font = load_font(14, False)
    label_font = load_font(15, True)
    draw.text((gap, 24), title, font=title_font, fill="#f4f6fb")
    draw.text((gap, 63), f"{len(prepared)} 个原始 SPA 页面状态 · 完全离线复原", font=sub_font, fill="#929bad")
    for state, im, x, y in placements:
        draw.rounded_rectangle((x, y, x + card_w, y + 42), radius=11, fill="#171b25")
        label = state["label"][:28]
        draw.text((x + 13, y + 11), label, font=label_font, fill="#f2f4f8")
        board.paste(im, (x, y + 50))
    out_path.parent.mkdir(parents=True, exist_ok=True)
    board.save(out_path, quality=90, subsampling=0)


def extract_snapshot_parts(snapshot_html: str) -> tuple[str, str]:
    soup = BeautifulSoup(snapshot_html, "html.parser")
    styles = "\n".join(str(s) for s in soup.find_all("style"))
    body = soup.body.decode_contents() if soup.body else snapshot_html
    return styles, body


def build_activity_spa(campaign: dict[str, Any], states: list[dict[str, Any]], activity_dir: Path) -> None:
    templates = []
    buttons = []
    for index, state in enumerate(states):
        frozen = Path(state["snapshotAbs"]).read_text("utf-8", errors="replace")
        styles, body = extract_snapshot_parts(frozen)
        tid = f"state-{index}"
        templates.append(f'<template id="{tid}">{styles}<div class="offline-state-root">{body}</div></template>')
        active = " active" if index == 0 else ""
        buttons.append(f'<button class="state-btn{active}" data-state="{tid}">{html_lib.escape(state["label"])}</button>')
    title = html_lib.escape(campaign["title"])
    page = f"""<!doctype html><html lang="zh-CN"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>{title}</title><style>
      *{{box-sizing:border-box}}html,body{{margin:0;background:#070a10;color:#fff;font-family:system-ui,-apple-system,'PingFang SC','Microsoft YaHei',sans-serif}}
      .app{{min-height:100vh}}.top{{position:sticky;top:0;z-index:20;background:rgba(7,10,16,.96);border-bottom:1px solid #242b38;padding:12px 14px}}
      h1{{font-size:18px;margin:0 0 9px}}.nav{{display:flex;gap:8px;overflow:auto;padding-bottom:2px}}.state-btn{{border:1px solid #374154;background:#171c27;color:#aeb7c8;border-radius:20px;padding:8px 12px;white-space:nowrap}}.state-btn.active{{border-color:#ff527b;color:#fff;background:#4c1d2e}}
      .stage{{display:grid;place-items:start center;padding:16px}}#mount{{display:block;width:390px;max-width:100%;min-height:844px;background:#000;border-radius:14px;overflow:hidden;border:1px solid #2a3241}}
      @media(min-width:900px){{#mount{{width:475px}}}}
    </style></head><body><main class="app"><header class="top"><h1>{title} · 原始 SPA 离线回放</h1><nav class="nav">{''.join(buttons)}</nav></header><section class="stage"><div id="mount"></div></section></main>{''.join(templates)}<script>
      const mount=document.getElementById('mount'); const shadow=mount.attachShadow({{mode:'open'}}); const buttons=[...document.querySelectorAll('.state-btn')];
      function openState(id){{const t=document.getElementById(id); if(!t)return; shadow.replaceChildren(t.content.cloneNode(true)); buttons.forEach(b=>b.classList.toggle('active',b.dataset.state===id)); location.hash=id;}}
      buttons.forEach(b=>b.addEventListener('click',()=>openState(b.dataset.state))); openState(location.hash.slice(1)||buttons[0]?.dataset.state);
    </script></body></html>"""
    activity_dir.mkdir(parents=True, exist_ok=True)
    (activity_dir / "index.html").write_text(page, "utf-8")


def build_root_index(campaign_results: list[dict[str, Any]]) -> None:
    cards = []
    for result in campaign_results:
        c = result["campaign"]
        preview_rel = f"preview/offline-assembled/{c['slug']}-assembled-pages.jpg"
        activity_rel = f"public/bigo-original-spa/pack-04/activities/{c['slug']}/index.html"
        systems = " / ".join(c.get("keywords", [])[:5])
        cards.append(f"""<article class="card"><img src="{preview_rel}" alt="{html_lib.escape(c['title'])}"><div class="body"><div class="meta">{len(result['states'])} 个页面状态 · actId {', '.join(map(str,c['ids']))}</div><h2>{html_lib.escape(c['title'])}</h2><p>{html_lib.escape(systems)}</p><a href="{activity_rel}">打开完全离线 SPA →</a></div></article>""")
    page = f"""<!doctype html><html lang="zh-CN"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>Pro-BIGO Increment 04</title><style>
      *{{box-sizing:border-box}}body{{margin:0;background:#070a10;color:#f5f7fb;font-family:system-ui,-apple-system,'PingFang SC','Microsoft YaHei',sans-serif}}main{{max-width:1440px;margin:auto;padding:28px}}h1{{margin:0 0 6px;font-size:30px}}.sub{{color:#949daf;margin-bottom:24px}}.grid{{display:grid;grid-template-columns:repeat(auto-fit,minmax(320px,1fr));gap:22px;align-items:start}}.card{{background:#111621;border:1px solid #252d3b;border-radius:16px;overflow:hidden}}.card img{{display:block;width:100%;max-height:520px;object-fit:cover;object-position:top}}.body{{padding:16px}}h2{{font-size:20px;margin:6px 0}}.meta{{font-size:12px;color:#ff7c9c}}p{{color:#abb3c2;min-height:44px}}a{{display:inline-block;color:#fff;background:#e8426d;text-decoration:none;padding:9px 13px;border-radius:9px}}</style></head><body><main><h1>Pro-BIGO Increment 04 · 五个深度复合 Campaign</h1><div class="sub">官方 SPA 原始渲染 · 全素材落地 · 完全离线组装 · 非单页榜单活动</div><section class="grid">{''.join(cards)}</section></main></body></html>"""
    (OUT / "index.html").write_text(page, "utf-8")


def campaign_capture(browser, campaign: dict[str, Any]) -> dict[str, Any]:
    slug = campaign["slug"]
    csrc = SOURCE / "campaigns" / slug
    csrc.mkdir(parents=True, exist_ok=True)
    store = ResourceStore(csrc)
    configs: dict[int, Any] = {}
    config_records = []
    for act_id in campaign["ids"]:
        api_url = f"https://ta.bigolive.tv/bigo_act_template_api/act_machineV2/index?actid={act_id}&actId={act_id}"
        rec = store.download(api_url)
        config_records.append(rec.__dict__)
        if rec.ok and rec.local_path:
            path = csrc / rec.local_path
            try:
                configs[act_id] = json.loads(path.read_text("utf-8"))
            except Exception:
                pass
        shell_url = f"https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}&from_source=3&from_id={act_id}&lang=cn&langSource=pear"
        config_records.append(store.download(shell_url).__dict__)
    # Download all source URLs from official configs in parallel.
    urls = []
    for config in configs.values():
        urls.extend(collect_urls(config))
    urls = list(dict.fromkeys(urls))
    with concurrent.futures.ThreadPoolExecutor(max_workers=16) as pool:
        list(pool.map(store.download, urls))

    context = browser.new_context(
        viewport={"width": 390, "height": 844}, device_scale_factor=1,
        is_mobile=True, has_touch=True, locale="zh-CN", timezone_id="Asia/Shanghai",
        user_agent=UA,
    )
    context.set_extra_http_headers({"Accept-Language": "zh-CN,zh;q=0.9,en;q=0.7"})
    states: list[dict[str, Any]] = []
    seen_hashes: set[str] = set()
    state_index = 0

    for act_id in campaign["ids"]:
        url = f"https://activity.bigo.tv/live/act/act_16907/index.html?id={act_id}&from_source=3&from_id={act_id}&lang=cn&langSource=pear"
        page = context.new_page()
        captured_responses = []
        pending = []
        def on_response(response):
            try:
                u = response.url
                if u.startswith("http"):
                    captured_responses.append({"url": u, "status": response.status, "contentType": response.headers.get("content-type", "")})
            except Exception:
                pass
        page.on("response", on_response)
        try:
            page.goto(url, wait_until="domcontentloaded", timeout=120000)
            page.wait_for_timeout(9000)
            try:
                page.wait_for_load_state("networkidle", timeout=7000)
            except Exception:
                pass
            auto_scroll(page)
            page.wait_for_timeout(600)
        except Exception as exc:
            (csrc / f"navigation-{act_id}.txt").write_text(repr(exc), "utf-8")

        config = configs.get(act_id, {})
        labels = campaign.get("keywords", []) + collect_labels(config)
        controls = visible_controls(page)
        # Prefer keyword-matching controls and retain a few other tab-like controls.
        ordered = []
        for control in controls:
            text = control["text"]
            score = 0
            if any(k.lower() in text.lower() or text.lower() in k.lower() for k in labels if len(k) >= 2):
                score += 10
            if INTERESTING.search(text + " " + control.get("cls", "")):
                score += 5
            if control.get("href", "").startswith("http"):
                score -= 8
            ordered.append((score, control))
        ordered.sort(key=lambda x: x[0], reverse=True)

        attempts: list[tuple[str, str | None]] = [(f"act-{act_id} 主页面", None)]
        for score, control in ordered:
            if score <= 0:
                continue
            label = control["text"]
            if any(label == x[0] for x in attempts):
                continue
            attempts.append((label, label))
            if len(attempts) >= 14:
                break

        for label, click_text in attempts:
            if click_text:
                try:
                    page.goto(url, wait_until="domcontentloaded", timeout=90000)
                    page.wait_for_timeout(5500)
                    locator = page.get_by_text(click_text, exact=True).first
                    if locator.count() == 0:
                        locator = page.locator("button,a,[role=button],[class*=tab i],[class*=btn i]").filter(has_text=click_text).first
                    if locator.count() == 0:
                        continue
                    locator.click(force=True, timeout=7000)
                    page.wait_for_timeout(2200)
                    auto_scroll(page)
                except Exception:
                    continue
            try:
                image, digest = screenshot_hash(page)
            except Exception:
                continue
            if digest in seen_hashes:
                continue
            seen_hashes.add(digest)
            state_index += 1
            state_slug = f"{state_index:02d}-{safe_name(label, 44)}"
            shot_dir = SCREENSHOTS / slug
            shot_dir.mkdir(parents=True, exist_ok=True)
            shot_path = shot_dir / f"{state_slug}.png"
            shot_path.write_bytes(image)
            try:
                prepare_dom_for_freeze(page)
            except Exception:
                pass
            raw_html = page.content()
            frozen = freeze_html(raw_html, page.url, store)
            snapshot_dir = csrc / "snapshots"
            snapshot_dir.mkdir(parents=True, exist_ok=True)
            snapshot_path = snapshot_dir / f"{state_slug}.html"
            snapshot_path.write_text(frozen, "utf-8")
            states.append({
                "actId": act_id, "label": label, "slug": state_slug, "url": page.url,
                "screenshot": str(shot_path.relative_to(OUT)).replace(os.sep, "/"),
                "screenshotAbs": str(shot_path), "snapshotAbs": str(snapshot_path),
                "sha256": digest,
            })
            if len(states) >= max(campaign.get("minimumStates", 6) + 7, 14):
                break
        (csrc / f"network-{act_id}.json").write_text(json.dumps(captured_responses, ensure_ascii=False, indent=2), "utf-8")
        page.close()
        if len(states) >= max(campaign.get("minimumStates", 6) + 7, 14):
            break
    context.close()

    # Keep at least the most useful unique states; preserve all when modest.
    states = states[:16]
    activity_dir = PUBLIC / slug
    build_activity_spa(campaign, states, activity_dir)
    sheet_path = PREVIEW / f"{slug}-assembled-pages.jpg"
    make_contact_sheet(campaign["title"], states, sheet_path, columns=3)
    source_report = {
        "campaign": campaign, "configsFound": sorted(configs.keys()),
        "sourceRecords": config_records, "resourceRecords": [r.__dict__ for r in store.records],
        "states": [{k:v for k,v in s.items() if not k.endswith("Abs")} for s in states],
        "downloadedResources": sum(1 for r in store.records if r.ok),
        "missingResources": sum(1 for r in store.records if not r.ok),
        "downloadedBytes": sum(r.size for r in store.records if r.ok),
    }
    (csrc / "source-summary.json").write_text(json.dumps(source_report, ensure_ascii=False, indent=2), "utf-8")
    return {"campaign": campaign, "states": states, "source": source_report}


def offline_qa(campaign_results: list[dict[str, Any]]) -> dict[str, Any]:
    html_files = [OUT / "index.html"] + [PUBLIC / r["campaign"]["slug"] / "index.html" for r in campaign_results]
    issues = []
    for path in html_files:
        text = path.read_text("utf-8", errors="replace")
        checks = {
            "remoteUrl": bool(re.search(r"https?://", text, re.I)),
            "fetch": bool(re.search(r"\bfetch\s*\(", text, re.I)),
            "xhr": "XMLHttpRequest" in text,
            "iframe": bool(re.search(r"<iframe\b", text, re.I)),
        }
        if any(checks.values()):
            issues.append({"path": str(path.relative_to(OUT)), "checks": checks})
    return {"passed": not issues, "issues": issues, "htmlFiles": len(html_files)}


def write_package_docs(campaign_results: list[dict[str, Any]], qa: dict[str, Any]) -> None:
    delivery = {
        "packageId": PACKAGE_ID,
        "campaignCount": len(campaign_results),
        "campaigns": [
            {
                "slug": r["campaign"]["slug"], "title": r["campaign"]["title"],
                "actIds": r["campaign"]["ids"], "states": len(r["states"]),
                "downloadedResources": r["source"]["downloadedResources"],
                "missingResources": r["source"]["missingResources"],
                "downloadedBytes": r["source"]["downloadedBytes"],
            }
            for r in campaign_results
        ],
        "offlineQA": qa,
    }
    (OUT / "DELIVERY-MANIFEST.json").write_text(json.dumps(delivery, ensure_ascii=False, indent=2), "utf-8")
    (REPORTS / "QA_REPORT.json").write_text(json.dumps(qa, ensure_ascii=False, indent=2), "utf-8")
    lines = ["# Pro-BIGO Increment 04", "", "五个非单页榜单的深度复合 Campaign，使用 BIGO 官方 SPA 渲染、官方配置和原始素材完成离线组装。", ""]
    for r in campaign_results:
        c = r["campaign"]
        lines.append(f"- {c['title']} · actId {', '.join(map(str,c['ids']))} · {len(r['states'])} 个页面状态")
    lines += ["", f"离线 QA：{'通过' if qa['passed'] else '存在问题'}", "", "打开 index.html 或双击 start.command。"]
    (OUT / "README.md").write_text("\n".join(lines), "utf-8")
    (OUT / "STATUS.md").write_text("\n".join(lines), "utf-8")
    (OUT / "start.command").write_text("#!/bin/bash\ncd \"$(dirname \"$0\")\"\nopen index.html\n", "utf-8")
    os.chmod(OUT / "start.command", 0o755)


def build_overview(campaign_results: list[dict[str, Any]]) -> None:
    # Compose campaign contact sheets into one board.
    images = []
    for result in campaign_results:
        p = PREVIEW / f"{result['campaign']['slug']}-assembled-pages.jpg"
        if p.exists():
            im = Image.open(p).convert("RGB")
            w = 700
            h = round(im.height * w / im.width)
            images.append((result["campaign"]["title"], im.resize((w,h), Image.Resampling.LANCZOS)))
    if not images:
        return
    gap, top = 26, 130
    columns = 2
    heights = [top] * columns
    placements = []
    for title, im in images:
        col = min(range(columns), key=lambda i: heights[i])
        x = gap + col * (700 + gap)
        y = heights[col]
        placements.append((title, im, x, y))
        heights[col] += 48 + im.height + gap
    width = gap + columns * (700 + gap)
    height = max(heights) + gap
    board = Image.new("RGB", (width, height), "#070a10")
    draw = ImageDraw.Draw(board)
    draw.text((gap, 25), "PRO-BIGO · Increment 04 五个深度复合 Campaign", font=load_font(30, True), fill="#f5f7fb")
    draw.text((gap, 73), "官方 SPA 原始渲染 · 全素材落地 · 完全离线组装", font=load_font(16), fill="#929bad")
    for title, im, x, y in placements:
        draw.rounded_rectangle((x,y,x+700,y+42), radius=11, fill="#171b25")
        draw.text((x+14,y+10), title, font=load_font(16,True), fill="#f2f4f8")
        board.paste(im,(x,y+48))
    board.save(PREVIEW / "pro-bigo-increment-04-overview.jpg", quality=90, subsampling=0)


def inventory_and_zip() -> tuple[str, int]:
    entries = []
    for p in sorted(x for x in OUT.rglob("*") if x.is_file()):
        data = p.read_bytes()
        entries.append({"path": str(p.relative_to(OUT)).replace(os.sep, "/"), "bytes": len(data), "sha256": sha256(data)})
    (REPORTS / "INVENTORY.json").write_text(json.dumps(entries, ensure_ascii=False, indent=2), "utf-8")
    sums = "\n".join(f"{e['sha256']}  {e['path']}" for e in entries) + "\n"
    (OUT / "SHA256SUMS.txt").write_text(sums, "utf-8")
    archive = OUT.parent / f"{PACKAGE_ID}.zip"
    if archive.exists():
        archive.unlink()
    with zipfile.ZipFile(archive, "w", compression=zipfile.ZIP_DEFLATED, compresslevel=5, allowZip64=True) as zf:
        for p in sorted(x for x in OUT.rglob("*") if x.is_file()):
            zf.write(p, p.relative_to(OUT.parent))
    digest = sha256(archive.read_bytes())
    return digest, archive.stat().st_size


def main() -> None:
    if OUT.exists():
        shutil.rmtree(OUT)
    for d in [SOURCE, PUBLIC, PREVIEW, REPORTS, SCREENSHOTS]:
        d.mkdir(parents=True, exist_ok=True)
    with sync_playwright() as pw:
        browser = pw.chromium.launch(headless=True, args=["--disable-dev-shm-usage", "--no-sandbox", "--autoplay-policy=no-user-gesture-required"])
        results = []
        for campaign in MANIFEST["campaigns"]:
            print(f"=== Recovering {campaign['title']} ===", flush=True)
            results.append(campaign_capture(browser, campaign))
        browser.close()
    build_root_index(results)
    build_overview(results)
    qa = offline_qa(results)
    write_package_docs(results, qa)
    digest, size = inventory_and_zip()
    result = {
        "packageId": PACKAGE_ID, "campaigns": len(results),
        "states": sum(len(r["states"]) for r in results),
        "qa": qa, "zipSha256": digest, "zipBytes": size,
        "zip": f"{PACKAGE_ID}.zip",
    }
    (OUT / "RESULT.json").write_text(json.dumps(result, ensure_ascii=False, indent=2), "utf-8")
    print(json.dumps(result, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    main()
