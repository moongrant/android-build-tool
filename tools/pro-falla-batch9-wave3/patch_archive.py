#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch9-wave3/archive_wave3.mjs')
src = p.read_text(encoding='utf-8')

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchWave3Resources(){
  const targets=[
    // Lucky Seven
    'https://res-g.resygg.com/awss3_3048846_1715934454267208297_3737244240.png',
    'https://res-g.resygg.com/awss3_2181270_1720493961637207740_2273433373.png',
    'https://res-g.resygg.com/awss3_4081076_1715840110806240576_853269169.png',
    // Happy Exchange Mall
    'https://res-g.resygg.com/awss3_3048846_1724901586062358834_1546827400.png?x-oss-process=image/resize,m_pad,color_ffffff00/format,webp',
    'https://res-g.resygg.com/awss3_3048846_1724901594821139760_811048697.png',
    // Jungle Hunting
    'https://res-g.resygg.com/awss3_4081076_1717398825278232639_2325569146.png',
    'https://res-g.resygg.com/awss3_4081076_1717398836379929979_674325492.png',
    // Desert Treasure
    'https://res-g.resygg.com/awss3_1436068_1713178411814996374_2197573207.webp',
    'https://res-g.resygg.com/awss3_1436068_1713178417321064583_1320481255.png',
    // True Love Ring
    'https://falla-res1.resygg.com/awss3_1436068_1699436003326182764_3148365806.png',
    'https://falla-res1.resygg.com/awss3_1436068_1699436088045251494_920972393.png',
    'https://falla-res1.resygg.com/awss3_1436068_1699435564548310003_4290786752.png',
    'https://falla-res1.resygg.com/awss3_1436068_1699435090318161721_3676965969.png',
    'https://falla-res1.resygg.com/awss3_1436068_1699435424011842723_1179405034.png',
    // Happy New Year
    'https://web.fallaweb.com/falla-web/act-happy-newyear-25/prod/0.5.0/assets/c043d36547edb4f8728d.png',
    'https://web.fallaweb.com/falla-web/act-happy-newyear-25/prod/0.5.0/assets/16a49401f681c6afc1ed.png',
    'https://web.fallaweb.com/falla-web/act-happy-newyear-25/prod/0.5.0/assets/54ba8796d9db5c309eb8.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-happy-newyear-25/prod/0.5.0/assets/d2ac4e76965d5149fec5.png?x-oss-process=image/format,webp'
  ];
  let added=0,failed=[];
  function candidates(url){
    const out=[url];
    try{
      const u=new URL(url), clean=u.origin+u.pathname;
      if(clean!==url)out.push(clean);
      const path=u.pathname+(u.search||'');
      if(u.hostname==='res-g.resygg.com'){
        out.push('https://falla-res1.resygg.com'+path,'https://falla-res1.falla.live'+path);
        if(u.search)out.push('https://falla-res1.resygg.com'+u.pathname,'https://falla-res1.falla.live'+u.pathname);
      }else if(u.hostname==='falla-res1.resygg.com'){
        out.push('https://res-g.resygg.com'+path,'https://falla-res1.falla.live'+path);
      }
    }catch{}
    return [...new Set(out)];
  }
  for(const url of targets){
    if(byUrl.has(urlKey('GET',url))||byPath.has(pathKey('GET',url)))continue;
    let got=null;
    for(const candidate of candidates(url)){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8','referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        const body=Buffer.from(await r.arrayBuffer());
        if(!body.length)continue;
        got={body,sourceUrl:String(r.url),status:r.status,headers:Object.fromEntries(r.headers.entries())};break;
      }catch{}
    }
    if(!got){failed.push(url);continue;}
    await savePrefetchedRecord({method:'GET',url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'wave3-static-closure'});added++;
  }
  return {added,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const wave3Resources=await prefetchWave3Resources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,wave3Resources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_wave3.mjs')
