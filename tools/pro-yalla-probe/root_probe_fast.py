from __future__ import annotations

import importlib.util
from pathlib import Path

SCRIPT = Path(__file__).with_name("root_probe.py")
spec = importlib.util.spec_from_file_location("pro_yalla_root_probe", SCRIPT)
if spec is None or spec.loader is None:
    raise RuntimeError(f"Unable to load {SCRIPT}")
module = importlib.util.module_from_spec(spec)
spec.loader.exec_module(module)


async def skip_render(rows):
    print(f"Fast probe found {len(rows)} promising shells; browser rendering is deferred to the focused capture stage.", flush=True)


module.render_promising = skip_render
module.main()
