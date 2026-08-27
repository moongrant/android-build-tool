#!/usr/bin/env python3
from pathlib import Path

p = Path('tools/pro-falla-batch11-wave1/archive_wave1.mjs')
src = p.read_text(encoding='utf-8')

old = """if(p.includes('/act/2025/tsl/v1/acinfo')){res={matchList:[],teamList:[],betList:[],taskList:[],rankList:[],rewardList:[],records:[],score:0,ticketCount:0};kind='empty-football-game';}\n  else if(p.includes('/act/2025/tsl/v1/bet/rank')||p.includes('/act/2025/tsl/v1/bet/record')||p.includes('/act/2025/tsl/v1/bet/win/record')){res=[];kind='empty-football-list';}"""

# Match metadata, team icons and base award tiers are copied from the official
# activityId=1089 serverConfig. User bets, percentages, tickets and records remain zero.
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
p.write_text(src, encoding='utf-8')
print('patched football fixture')
