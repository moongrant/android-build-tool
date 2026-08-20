#!/usr/bin/env python3
from pathlib import Path

src_path=Path('tools/pro-falla-batch4/archive_selected.mjs')
src=src_path.read_text(encoding='utf-8')

old="""async function badJsonRecord(rec){
  if(!rec||!/json/i.test(rec.contentType||''))return false;
  try{const obj=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));return obj&&typeof obj==='object'&&'code'in obj&&Number(obj.code)!==0;}catch{return false;}
}
"""
new="""async function badJsonRecord(rec){
  if(!rec)return false;
  if(Number(rec.status||200)>=400)return true;
  if(!/json/i.test(rec.contentType||''))return false;
  try{const obj=JSON.parse((await fs.readFile(path.join(OUT,rec.objectPath))).toString('utf8'));return obj&&typeof obj==='object'&&'code'in obj&&Number(obj.code)!==0;}catch{return false;}
}
"""
if old not in src: raise SystemExit('badJsonRecord block not found')
src=src.replace(old,new,1)

old_rank="p.includes('/rank')||p.includes('ranklist')||p.includes('carousel')||p.includes('/records')"
new_rank="p.includes('rank')||p.includes('carousel')||p.includes('/records')"
if old_rank not in src: raise SystemExit('rank fixture expression not found')
src=src.replace(old_rank,new_rank,1)

anchor="""async function captureOffline(browser,online){
"""
insert=r"""async function prefetchKnownStatic(){
  const desired=[
    'https://web.fallaweb.com/falla-web/act-game-championship/prod/0.2.0/assets/1ec420146b984b6cc9a4.png',
    'https://web.fallaweb.com/falla-web/act-game-championship/prod/0.2.0/assets/1ec420146b984b6cc9a4.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-team-treasure-2512/prod/0.6.0/assets/66f0c8d176d3ba8fe33a.png',
    'https://web.fallaweb.com/falla-web/act-team-treasure-2512/prod/0.6.0/assets/e883651ff2c1d614506b.png',
    'https://web.fallaweb.com/falla-web/act-team-treasure-2512/prod/0.6.0/assets/ba4f9b8615be26506c22.png'
  ];
  let added=0;
  for(const url of desired){
    if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;
    const candidates=[url,url.split('?')[0]];
    let fetched=null,sourceUrl=null,headers=null,status=0;
    for(const candidate of [...new Set(candidates)]){
      try{const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8'},redirect:'follow',signal:AbortSignal.timeout(25000)});if(!r.ok)continue;fetched=Buffer.from(await r.arrayBuffer());sourceUrl=candidate;headers=Object.fromEntries(r.headers.entries());status=r.status;break;}catch{}
    }
    if(!fetched)continue;
    const bodyHash=sha(fetched),objectPath=`objects/${bodyHash}${extFrom(url,headers?.['content-type']||'')}`;try{await fs.access(path.join(OUT,objectPath));}catch{await fs.writeFile(path.join(OUT,objectPath),fetched);}
    const rec={key:requestKey('GET',url,''),method:'GET',url,sourceUrl,postDataHash:sha(''),status:status||200,statusText:'OK',headers:headers||{'content-type':'image/png'},objectPath,bytes:fetched.length,sha256:bodyHash,contentType:(headers||{})['content-type']||'image/png',pageIds:['known-static-closure']};records.set(rec.key,rec);byUrl.set(urlKey('GET',url),rec);byPath.set(pathKey('GET',url),rec);added++;
  }
  return added;
}

"""+anchor
if anchor not in src: raise SystemExit('captureOffline anchor not found')
src=src.replace(anchor,insert,1)

old_call="const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();console.log(`OFFLINE ${online.length}`);"
new_call="const browser=await chromium.launch({headless:true,args:['--no-sandbox','--disable-dev-shm-usage']});console.log(`ONLINE ${defs.length}`);const online=await mapLimit(defs,CONCURRENCY,(d,i)=>captureOnline(browser,d,i));const closureAdded=await staticClosure();const knownStaticAdded=await prefetchKnownStatic();console.log(`OFFLINE ${online.length}`);"
if old_call not in src: raise SystemExit('main closure call not found')
src=src.replace(old_call,new_call,1)

old_manifest="staticClosureAdded:closureAdded,captureErrors:captureErrors.length"
new_manifest="staticClosureAdded:closureAdded,knownStaticAdded,captureErrors:captureErrors.length"
if old_manifest not in src: raise SystemExit('manifest closure field not found')
src=src.replace(old_manifest,new_manifest,1)

src=src.replace("`- Static closure additions: ${manifest.staticClosureAdded}`", "`- Static closure additions: ${manifest.staticClosureAdded}`", 1)
Path('tools/pro-falla-batch4/archive_selected_repaired.mjs').write_text(src,encoding='utf-8')
print('wrote archive_selected_repaired.mjs')
