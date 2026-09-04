#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch9-wave2/archive_wave2.mjs')
src = p.read_text(encoding='utf-8')

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchWave2Resources(){
  const targets=[
    {url:'https://res-g.resygg.com/awss3_866790_1704682227477107148_2930159829.png'},
    {url:'https://res-g.resygg.com/awss3_866790_1704682231638541312_3579486003.png'},
    {url:'https://web-test.falla.live/falla-web/act-slots-party/hk/0.0.4/assets/190afb43b385c987f5c1.png',alts:['https://web.fallaweb.com/falla-web/act-slots-party/prod/0.1.0/assets/190afb43b385c987f5c1.png']},

    {url:'https://falla-res1.resygg.com/awss3_2168516_1686558341278730656_2278417378.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1686558664815021598_3023762725.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1686558782152109491_498498579.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1687761041139768265_2343261323.png'},

    {url:'https://web.fallaweb.com/falla-web/act-super-car-club-2/prod/0.2.0/assets/56e662700e81d528bb44.png'},
    {url:'https://web.fallaweb.com/falla-web/act-super-car-club-2/prod/0.2.0/assets/614df895df5222f0f1e4.png'},
    {url:'https://web.fallaweb.com/falla-web/act-super-car-club-2/prod/0.2.0/assets/798755b7093d0f70f699.png?x-oss-process=image/format,webp',alts:['https://web.fallaweb.com/falla-web/act-super-car-club-2/prod/0.2.0/assets/798755b7093d0f70f699.png']},

    {url:'https://falla-res1.resygg.com/awss3_2168516_1679911612885429749_4219046317.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1679911778279145040_3662752869.png'},
    {url:'https://falla-res1.resygg.com/awss3_2168516_1679911948777193466_2859852832.png'},
    {url:'https://web-test.falla.live/falla-web/act-ramadan-competition-23/hk/0.0.17/assets/67b05cf5f45f93c9fab6.png',alts:['https://web.fallaweb.com/falla-web/act-ramadan-competition-23/prod/0.1.0/assets/67b05cf5f45f93c9fab6.png']},

    {url:'https://res-g.resygg.com/awss3_3553038_1703819744731743784_1099204412.png'},
    {url:'https://res-g.resygg.com/awss3_3553038_1703819839242527663_1502774084.png'},
    {url:'https://res-g.resygg.com/awss3_3553038_1703819947857541253_3606233605.png'}
  ];
  let added=0;const failed=[];
  function mirrors(url){
    const out=[url];
    try{
      const u=new URL(url), path=u.pathname+u.search;
      if(u.hostname==='res-g.resygg.com'){
        out.push('https://falla-res1.resygg.com'+path,'https://falla-res1.falla.live'+path);
      }else if(u.hostname==='falla-res1.resygg.com'){
        out.push('https://res-g.resygg.com'+path,'https://falla-res1.falla.live'+path);
      }
    }catch{}
    return out;
  }
  for(const target of targets){
    if(byUrl.has(urlKey('GET',target.url))||byPath.has(pathKey('GET',target.url)))continue;
    const candidates=[...mirrors(target.url),...(target.alts||[])];
    let got=null;
    for(const candidate of [...new Set(candidates)]){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8','referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        const body=Buffer.from(await r.arrayBuffer());if(!body.length)continue;
        got={body,sourceUrl:String(r.url),status:r.status,headers:Object.fromEntries(r.headers.entries())};break;
      }catch{}
    }
    if(!got){failed.push(target.url);continue;}
    await savePrefetchedRecord({method:'GET',url:target.url,sourceUrl:got.sourceUrl,body:got.body,status:got.status,headers:got.headers,pageId:'wave2-static-closure'});added++;
  }
  return {added,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const wave2Resources=await prefetchWave2Resources();console.log(`OFFLINE ${online.length}`);"
if old not in src:
    raise SystemExit('main prefetch call not found')
src = src.replace(old, new, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,wave2Resources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest insertion point not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched archive_wave2.mjs')
