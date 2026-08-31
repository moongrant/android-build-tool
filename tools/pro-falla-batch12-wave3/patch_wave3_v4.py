#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch12-wave3/archive_wave3.mjs')
src = p.read_text(encoding='utf-8')

capture_anchor = "async function captureOffline(browser,online){"
compat = r'''async function prefetchWave3FinalCompatibility(){
  const transparent=Buffer.from('iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVQIHWP4z8DwHwAFgAI/ScLxWQAAAABJRU5ErkJggg==','base64');
  const pngHeaders={'content-type':'image/png','cache-control':'public,max-age=31536000','access-control-allow-origin':'*','x-pro-falla-local':'removed-historical-asset-compat'};
  const jsonHeaders={'content-type':'application/json; charset=utf-8','cache-control':'no-store','access-control-allow-origin':'*','x-pro-falla-local':'historical-api-fixture'};
  const missingAssets=[
    'https://res-g.resygg.com/awss3_866790_1711355926521005199_1260971201.png',
    'https://falla-res1.resygg.com/awss3_2168516_1681381941057340048_2094395677.png',
    'https://web-test.falla.live/falla-web/act-ramadan-competition-23/hk/0.0.17/assets/67b05cf5f45f93c9fab6.png',
    'https://web-test.falla.live/falla-web/act-ramadan-23/hk/0.0.7/assets/fd5dfa11ef963ceda4ff.png',
    'https://web-test.falla.live/falla-web/act-ramadan-Eid-Al-Fitr/hk/0.0.2/assets/ef36c6783c131348bcf7.png',
    'https://falla-res1.resygg.com/awss3_2168516_1684204435978798176_3091115283.png',
    'https://falla-res1.resygg.com/awss3_2168516_1684207460450688010_2952533994.png',
    'https://web-test.falla.live/falla-web/act-ramadan-Eid-Al-Fitr/hk/0.0.2/assets/7a7252e8d9c1a26cd3f3.png',
    'https://web-test.falla.live/falla-web/act-ramadan-Eid-Al-Fitr/hk/0.0.2/assets/0a20d0925a5de9217d24.png',
    'https://res-g.resygg.com/awss3_866790_1710180891761028774_3139593970.png',
    'https://res-g.resygg.com/awss3_3553038_1709265310826330900_3704684507.png',
    'https://falla-res1.resygg.com/awss3_866790_1711161029506450336_4095752138.png',
    'https://falla-res1.resygg.com/awss3_866790_1711329771073913990_2480443826.png',
    'https://web-test.falla.live/falla-web/act-ramadan-ring/hk/0.0.7/assets/e3b37ceaa7cd6f86f459.png'
  ];
  const apiUrl='https://apihk.falla.live/api/web/act/2024/happyEid/dayRank';
  const apiBody=Buffer.from(JSON.stringify({code:0,msg:'success',res:{list:[],rankList:[],myRank:null,records:[]}}));
  let assetAdded=0,apiAdded=0;
  for(const url of missingAssets){
    await savePrefetchedRecord({method:'GET',url,sourceUrl:'removed-historical-asset-compat',body:transparent,status:200,headers:pngHeaders,pageId:'batch12-wave3-final-static-compat'});assetAdded++;
  }
  await savePrefetchedRecord({method:'POST',url:apiUrl,sourceUrl:'historical-anonymous-api-fixture',body:apiBody,status:200,headers:jsonHeaders,postData:'',pageId:'batch12-wave3-final-api-compat'});apiAdded++;
  await savePrefetchedRecord({method:'GET',url:apiUrl,sourceUrl:'historical-anonymous-image-fixture',body:transparent,status:200,headers:pngHeaders,pageId:'batch12-wave3-final-api-image-compat'});apiAdded++;
  return {assetAdded,apiAdded,assets:missingAssets,apiUrl};
}

'''
if capture_anchor not in src:
    raise SystemExit('capture anchor not found')
src = src.replace(capture_anchor, compat + capture_anchor, 1)

old = "const wave3Compatibility=await prefetchWave3Compatibility();console.log(`OFFLINE ${online.length}`);"
new = "const wave3Compatibility=await prefetchWave3Compatibility();const wave3FinalCompatibility=await prefetchWave3FinalCompatibility();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('compatibility call anchor not found')
src = src.replace(old, new, 1)

old = "wave3Resources,wave3Compatibility,captureErrors:captureErrors.length"
new = "wave3Resources,wave3Compatibility,wave3FinalCompatibility,captureErrors:captureErrors.length"
if old not in src:
    raise SystemExit('manifest compatibility anchor not found')
src = src.replace(old, new, 1)

p.write_text(src, encoding='utf-8')
print('patched wave3 archiver v4')
