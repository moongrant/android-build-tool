#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch11-wave1/archive_wave1.mjs')
src = p.read_text(encoding='utf-8')

old = """if(p.includes('/act/2025/tsl/v1/acinfo')){res={matchList:[],teamList:[],betList:[],taskList:[],rankList:[],rewardList:[],records:[],score:0,ticketCount:0};kind='empty-football-game';}\n  else if(p.includes('/act/2025/tsl/v1/bet/rank')||p.includes('/act/2025/tsl/v1/bet/record')||p.includes('/act/2025/tsl/v1/bet/win/record')){res=[];kind='empty-football-list';}"""

# Match metadata, team icons and base award tiers are copied from the official
# activityId=1089 serverConfig. User bets, percentages, tickets and records stay at zero.
new = """if(p.includes('/act/2025/tsl/v1/acinfo')){res={awardTotal:0,betNum:0,baseAwardList:[{baseAward:5000000,cond:10000},{baseAward:50000000,cond:100000},{baseAward:150000000,cond:300000},{baseAward:250000000,cond:500000},{baseAward:500000000,cond:1000000}],matchBetInfoList:[
    {matchId:253705,matchTime:1748091600,endTime:1748090700,homeTeam:1,homeTeamTranslateKey:'896_ggpfdgzvge',homeTeamName:'Eyupspor',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744772317578283146_1081447028.png',awayTeam:2,awayTeamTranslateKey:'896_samfdcdmke',awayTeamName:'Antalyaspor',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744687931388742898_3524147768.png',matchResult:1,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253707,matchTime:1748102400,endTime:1748101500,homeTeam:1,homeTeamTranslateKey:'896_ivwwuwzztk',homeTeamName:'Gaziantep',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744772353273724147_3733742046.png',awayTeam:2,awayTeamTranslateKey:'896_wjuitkgdjy',awayTeamName:'Kasimpasa',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688385034299794_2229116089.png',matchResult:3,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253709,matchTime:1748102400,endTime:1748101500,homeTeam:1,homeTeamTranslateKey:'896_ifaqzeaoii',homeTeamName:'Goztepe',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688320200792587_658534205.png',awayTeam:2,awayTeamTranslateKey:'896_cwswlsggfb',awayTeamName:'Galatasaray',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688190209926976_1764727282.png',matchResult:2,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253708,matchTime:1748188800,endTime:1748187900,homeTeam:1,homeTeamTranslateKey:'896_gxuuouchmj',homeTeamName:'Istanbul Basaksehir',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688248354888353_36710419.png',awayTeam:2,awayTeamTranslateKey:'896_uvrqblgbhs',awayTeamName:'Adana Demirspor',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744772291360906145_3475748814.png',matchResult:2,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253701,matchTime:1748188800,endTime:1748187900,homeTeam:1,homeTeamTranslateKey:'896_tafsjflxyk',homeTeamName:'Besiktas',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688361477518813_29401962.png',awayTeam:2,awayTeamTranslateKey:'896_mgsczdrshl',awayTeamName:'Rizespor',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688063642273961_1684980872.png',matchResult:2,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253704,matchTime:1748188800,endTime:1748187900,homeTeam:1,homeTeamTranslateKey:'896_vpbkyfauss',homeTeamName:'Konyaspor',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744687943332065801_1754584514.png',awayTeam:2,awayTeamTranslateKey:'896_znsqauggvo',awayTeamName:'Alanyaspor',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688133023818791_284348070.png',matchResult:2,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253703,matchTime:1748188800,endTime:1748187900,homeTeam:1,homeTeamTranslateKey:'896_nwrswbjwsn',homeTeamName:'Trabzonspor',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688403294717756_789481244.png',awayTeam:2,awayTeamTranslateKey:'896_cllgoyzfzj',awayTeamName:'Samsunspor',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688273647546517_1069747961.png',matchResult:3,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253706,matchTime:1748188800,endTime:1748187900,homeTeam:1,homeTeamTranslateKey:'896_pnbqdfxwps',homeTeamName:'Kayserispor',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688140074658184_1660548213.png',awayTeam:2,awayTeamTranslateKey:'921_ydbbhnmiob',awayTeamName:'Bodrum',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1747131206558611835_862098978.png',matchResult:3,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0},
    {matchId:253702,matchTime:1748278800,endTime:1748277900,homeTeam:1,homeTeamTranslateKey:'896_btrlpjdipc',homeTeamName:'Hatayspor',homeTeamIcon:'https://res-g.resygg.com/awss3_103192_1744772244816262962_3826173459.png',awayTeam:2,awayTeamTranslateKey:'896_gpslfdpgva',awayTeamName:'Fenerbahce',awayTeamIcon:'https://res-g.resygg.com/awss3_103192_1744688352882891239_3252006554.png',matchResult:1,matchStatus:2,awardPool:0,homeTeamPer:0,tiePer:0,awayTeamPer:0,usedBetNum:0}
  ]};kind='official-football-zero-user-state';}
  else if(p.includes('/act/2025/tsl/v1/bet/rank')){res=[];kind='empty-football-rank';}
  else if(p.includes('/act/2025/tsl/v1/bet/record')||p.includes('/act/2025/tsl/v1/bet/win/record')){res={list:[],scroll:''};kind='empty-football-records';}"""

if old not in src:
    raise SystemExit('football fixture block not found')
src = src.replace(old, new, 1)

anchor = "async function captureOffline(browser,online){"
prefetch = r'''async function prefetchWave1KnownResources(){
  const targets=[
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/768af630be319fc95751.png',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/7320319d2a44ae3e2ef1.png',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/d6bd4a962603107b8f27.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/45b45996d92458e601d1.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/67fb60b93227677c4264.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/66bc5aeb5288611740b9.png?x-oss-process=image/format,webp',
    'https://web.fallaweb.com/falla-web/act-football-game-tr/prod/0.4.0/assets/876627ed7a311cb14764.png?x-oss-process=image/format,webp'
  ];
  let added=0,failed=[];
  for(const url of targets){
    const candidates=[url,url.split('?')[0]];
    let body=null,sourceUrl=null,headers=null,status=200;
    for(const candidate of [...new Set(candidates)]){
      try{
        const r=await fetch(candidate,{headers:{'user-agent':UA,'accept':'image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8','referer':'https://web.fallaweb.com/'},redirect:'follow',signal:AbortSignal.timeout(25000)});
        if(!r.ok)continue;
        body=Buffer.from(await r.arrayBuffer());
        if(!body.length)continue;
        sourceUrl=String(r.url);headers=Object.fromEntries(r.headers.entries());status=r.status;break;
      }catch{}
    }
    if(!body){failed.push(url);continue;}
    await savePrefetchedRecord({method:'GET',url,sourceUrl,body,status,headers:headers||{},pageId:'wave1-known-static'});added++;
  }
  return {added,failed};
}

'''
if anchor not in src:
    raise SystemExit('captureOffline anchor not found')
src = src.replace(anchor, prefetch + anchor, 1)

old_main = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();console.log(`OFFLINE ${online.length}`);"
new_main = "const closureAdded=await staticClosure();const activityConfigAdded=await prefetchActivityConfigs();const wave1KnownResources=await prefetchWave1KnownResources();console.log(`OFFLINE ${online.length}`);"
if old_main not in src:
    raise SystemExit('main prefetch hook not found')
src = src.replace(old_main, new_main, 1)

old_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,captureErrors:captureErrors.length"
new_manifest = "staticClosureAdded:closureAdded,activityConfigAdded,wave1KnownResources,captureErrors:captureErrors.length"
if old_manifest not in src:
    raise SystemExit('manifest hook not found')
src = src.replace(old_manifest, new_manifest, 1)

p.write_text(src, encoding='utf-8')
print('patched football fixture and static assets')
