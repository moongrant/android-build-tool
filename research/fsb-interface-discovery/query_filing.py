#!/usr/bin/env python3
"""Query the public mini-program filing registry for Fansibote.

The registry itself presents a basic arithmetic question. This script answers
that public question and submits a normal browser-equivalent public query. It
does not authenticate, create an account, or bypass a protected challenge.
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

import requests

OUT = Path(os.environ.get("FSB_FILING_QUERY_OUT", "research/fsb-interface-discovery/filing-query-results"))
OUT.mkdir(parents=True, exist_ok=True)
URL = "https://www.jingxialai.com/beian/api.php"
PAGE = "https://www.jingxialai.com/beian/"
S = requests.Session()
S.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/144.0.0.0 Safari/537.36",
    "Accept": "application/json, text/plain, */*",
    "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8",
    "Origin": "https://www.jingxialai.com",
    "Referer": PAGE,
})
FINGERPRINT = "fsb-public-filing-research|Mozilla/5.0|zh-CN|1920x1080|Asia/Shanghai"


def dump(name: str, obj: Any) -> None:
    (OUT / name).write_text(json.dumps(obj, ensure_ascii=False, indent=2), encoding="utf-8")


def safe_eval(expr: str) -> int:
    expr = expr.replace("×", "*").replace("÷", "/").strip()
    if not re.fullmatch(r"[0-9+\-*/()\s]+", expr):
        raise ValueError(f"Unsupported public arithmetic question: {expr!r}")
    funcs = {
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
        if isinstance(node, ast.BinOp) and type(node.op) in funcs: return int(funcs[type(node.op)](walk(node.left), walk(node.right)))
        if isinstance(node, ast.UnaryOp) and type(node.op) in funcs: return int(funcs[type(node.op)](walk(node.operand)))
        raise ValueError("Unsupported expression")
    return walk(ast.parse(expr, mode="eval"))


def post(data: dict[str, str]) -> dict[str, Any]:
    response = S.post(URL, data=data, timeout=35)
    record: dict[str, Any] = {
        "statusCode": response.status_code,
        "bodyText": response.text[:200_000],
    }
    try:
        record["bodyJson"] = response.json()
    except Exception:
        pass
    return record


def get_captcha() -> tuple[str, str, dict[str, Any]]:
    record = post({"action": "captcha", "fingerprint": FINGERPRINT})
    payload = record.get("bodyJson")
    if not isinstance(payload, dict) or not payload.get("ok") or not isinstance(payload.get("captcha"), dict):
        raise RuntimeError(f"Captcha request failed: {record}")
    captcha = payload["captcha"]
    captcha_id = str(captcha.get("captcha_id") or "")
    question = str(captcha.get("question") or "")
    if not captcha_id or not question:
        raise RuntimeError(f"Incomplete captcha: {captcha}")
    return captcha_id, question, record


def query(keyword: str, query_type: str = "applet", page: int = 1) -> dict[str, Any]:
    captcha_id, question, captcha_record = get_captcha()
    answer = safe_eval(question)
    query_record = post({
        "action": "query",
        "type": query_type,
        "keyword": keyword,
        "page": str(page),
        "fingerprint": FINGERPRINT,
        "captcha_id": captcha_id,
        "captcha_answer": str(answer),
    })
    return {
        "keyword": keyword,
        "type": query_type,
        "captchaQuestion": question,
        "captchaAnswer": answer,
        "captchaResponse": captcha_record,
        "queryResponse": query_record,
    }


def extract_companies(result: dict[str, Any]) -> list[str]:
    payload = result.get("queryResponse", {}).get("bodyJson")
    if not isinstance(payload, dict): return []
    body = payload.get("data")
    if not isinstance(body, dict): return []
    data = body.get("data")
    if not isinstance(data, dict): return []
    rows = data.get("list")
    if not isinstance(rows, list): return []
    companies = []
    for row in rows:
        if isinstance(row, dict):
            value = row.get("company") or row.get("owner")
            if value and str(value) not in companies:
                companies.append(str(value))
    return companies


def main() -> int:
    results: list[dict[str, Any]] = []
    primary = query("泛思博特网球订场")
    results.append(primary)
    companies = extract_companies(primary)
    for company in companies[:5]:
        time.sleep(1.2)
        results.append(query(company))
    report = {
        "target": "泛思博特网球订场",
        "companies": companies,
        "results": results,
        "generatedAtUtc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    dump("report.json", report)
    print(json.dumps(report, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
