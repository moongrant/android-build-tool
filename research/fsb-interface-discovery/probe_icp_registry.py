#!/usr/bin/env python3
"""Inspect public mini-program filing query pages and query the target name.

Only public filing information is requested. The script does not create an
account, authenticate, or bypass an interactive challenge. It may solve a
plain arithmetic question displayed by the public page/API.
"""
from __future__ import annotations

import ast
import json
import operator
import os
import re
import time
from pathlib import Path
from typing import Any
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

OUT = Path(os.environ.get("FSB_ICP_OUT", "research/fsb-interface-discovery/icp-results"))
OUT.mkdir(parents=True, exist_ok=True)
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/144.0.0.0 Safari/537.36",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
})

TARGET = "泛思博特网球订场"
PAGES = [
    "https://www.jingxialai.com/beian/",
    "https://icp.chinaz.com/miniapp",
]


def dump(name: str, value: Any) -> None:
    (OUT / name).write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding="utf-8")


def request(label: str, method: str, url: str, **kwargs: Any) -> dict[str, Any]:
    started = time.time()
    rec: dict[str, Any] = {"label": label, "method": method, "url": url}
    try:
        r = S.request(method, url, timeout=30, allow_redirects=True, **kwargs)
        rec.update({
            "statusCode": r.status_code,
            "finalUrl": r.url,
            "elapsedMs": round((time.time() - started) * 1000),
            "headers": {k: v for k, v in r.headers.items() if k.lower() not in {"set-cookie", "cookie", "authorization"}},
            "bodyText": r.text[:800_000],
        })
        try:
            rec["bodyJson"] = r.json()
        except Exception:
            pass
    except Exception as exc:
        rec.update({"error": f"{type(exc).__name__}: {exc}"})
    dump(f"{label}.json", rec)
    return rec


def extract_routes(text: str) -> list[str]:
    patterns = [
        r"https?://[^\"'\s<>]+",
        r"/wp-json/[^\"'\s<>]+",
        r"/api/[^\"'\s<>]+",
        r"admin-ajax\.php",
        r"rest_url\([^)]*\)",
        r"fetch\([^)]{0,500}\)",
        r"axios\.[a-z]+\([^)]{0,500}\)",
        r"XMLHttpRequest[^;]{0,1000}",
    ]
    out: list[str] = []
    for pattern in patterns:
        for match in re.finditer(pattern, text, re.I | re.S):
            value = re.sub(r"\s+", " ", match.group(0))
            if any(token in value.lower() for token in ("beian", "icp", "miniapp", "captcha", "verify", "query", "备案")) and value not in out:
                out.append(value[:2000])
            if len(out) >= 200:
                return out
    return out


def safe_eval_arithmetic(expr: str) -> int | None:
    expr = expr.strip().replace("×", "*").replace("÷", "/")
    if not re.fullmatch(r"[0-9+\-*/()\s]+", expr):
        return None
    ops = {
        ast.Add: operator.add,
        ast.Sub: operator.sub,
        ast.Mult: operator.mul,
        ast.Div: operator.floordiv,
        ast.FloorDiv: operator.floordiv,
        ast.USub: operator.neg,
        ast.UAdd: operator.pos,
    }
    def walk(node: ast.AST) -> int:
        if isinstance(node, ast.Expression): return walk(node.body)
        if isinstance(node, ast.Constant) and isinstance(node.value, int): return int(node.value)
        if isinstance(node, ast.BinOp) and type(node.op) in ops: return int(ops[type(node.op)](walk(node.left), walk(node.right)))
        if isinstance(node, ast.UnaryOp) and type(node.op) in ops: return int(ops[type(node.op)](walk(node.operand)))
        raise ValueError("unsupported")
    try:
        return walk(ast.parse(expr, mode="eval"))
    except Exception:
        return None


def inspect_page(index: int, page_url: str) -> dict[str, Any]:
    page = request(f"page-{index}", "GET", page_url, headers={"Accept": "text/html,application/xhtml+xml"})
    html = page.get("bodyText", "")
    soup = BeautifulSoup(html, "html.parser")
    assets: list[str] = []
    inline_scripts: list[str] = []
    for tag in soup.find_all("script"):
        src = tag.get("src")
        if src:
            url = urljoin(page_url, src)
            if url not in assets:
                assets.append(url)
        elif tag.string:
            inline_scripts.append(tag.string)
    for tag in soup.find_all("link"):
        href = tag.get("href")
        if href and ("preload" in (tag.get("rel") or []) or str(href).endswith(".js")):
            url = urljoin(page_url, href)
            if url not in assets:
                assets.append(url)

    route_evidence = extract_routes(html)
    asset_summaries: list[dict[str, Any]] = []
    for j, asset in enumerate(assets[:60], 1):
        rec = request(f"page-{index}-asset-{j:02d}", "GET", asset, headers={"Referer": page_url, "Accept": "*/*"})
        text = rec.get("bodyText", "")
        routes = extract_routes(text)
        if routes:
            route_evidence.extend(route for route in routes if route not in route_evidence)
        asset_summaries.append({"url": asset, "statusCode": rec.get("statusCode"), "length": len(text), "routes": routes[:30]})

    visible_text = soup.get_text(" ", strip=True)
    arithmetic: list[dict[str, Any]] = []
    for match in re.finditer(r"(?<!\d)(\d{1,3}\s*[+\-×÷*/]\s*\d{1,3})(?!\d)", visible_text):
        expr = match.group(1)
        answer = safe_eval_arithmetic(expr)
        arithmetic.append({"expr": expr, "answer": answer})

    return {
        "url": page_url,
        "statusCode": page.get("statusCode"),
        "finalUrl": page.get("finalUrl"),
        "visibleTextPreview": visible_text[:5000],
        "forms": [
            {
                "action": form.get("action"),
                "method": form.get("method"),
                "inputs": [{"name": i.get("name"), "type": i.get("type"), "placeholder": i.get("placeholder"), "value": i.get("value")} for i in form.find_all("input")],
            }
            for form in soup.find_all("form")
        ],
        "arithmetic": arithmetic,
        "routeEvidence": route_evidence,
        "assets": asset_summaries,
        "inlineScriptCount": len(inline_scripts),
    }


def main() -> int:
    report = {"target": TARGET, "pages": [], "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())}
    for index, page in enumerate(PAGES, 1):
        report["pages"].append(inspect_page(index, page))
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
