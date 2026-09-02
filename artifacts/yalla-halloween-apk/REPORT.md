# Yalla Halloween Historical APK Archaeology

- Versions downloaded and scanned: 5
- Raw Halloween-family matches: 30911
- Matches adjacent to activity URLs/IDs: 81
- Activity URLs extracted: 11

| Version | Files | Raw matches | Matching paths | Activity URLs |
|---|---:|---:|---:|---:|
| 2.28.0 | 5998 | 2864 | 47 | 1 |
| 2.29.0 | 6040 | 2933 | 49 | 1 |
| 3.0.4 | 6177 | 8367 | 49 | 3 |
| 3.0.5 | 6177 | 8367 | 49 | 3 |
| 3.0.6 | 6177 | 8380 | 49 | 3 |

## Event-context matches

### 2.28.0 · `split-1/classes5.dex` · bat
```
|CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `follow
```

### 2.28.0 · `split-1/classes5.dex` · bat
```
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGE
```

### 2.28.0 · `split-1/classes5.dex` · bat
```
INMIC
INSERT INTO FriendsTableTemp (id, name, head, vip, vip_level, idx, uid, sex, add_from, time, role, sign) SELECT userid, username, headphoto, uservip, supervip, standbyone, standbytwo, standbythree, standbyfour, ctime, role, sign FROM FriendsTable
UINSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)
INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`orderType`,`sku`,`amount`,`usdAmount`,`unit`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`time`,`uid`,`isRead`,`num`,`point`,`dayNum`,`jsonData`,`title`,`icon`,`jumpUrl`,`rewardItem`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`currExpePercent`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`,`BarrageGameInfo_title`,`BarrageGameInfo_content`,`BarrageGameInfo_img`,`BarrageGameInfo_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ErrorCodeTable` (`code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)
```

### 2.28.0 · `split-1/classes5.dex` · witch
```
Landroid/widget/ProgressBar;
Landroid/widget/RelativeLayout;
0Landroid/widget/SeekBar$OnSeekBarChangeListener;
Landroid/widget/SeekBar;
Landroid/widget/Switch;
$Landroid/widget/TextView$BufferType;
Landroid/widget/TextView;
Landroid/widget/Toast;
%Landroidx/activity/ComponentActivity;
```

### 2.28.0 · `split-1/classes6.dex` · witch
```
Landroid/widget/RadioButton;
Landroid/widget/RelativeLayout;
Landroid/widget/ScrollView;
Landroid/widget/Space;
Landroid/widget/Switch;
Landroid/widget/TableRow;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
%Landroidx/activity/ComponentActivity;
```

### 2.28.0 · `split-1/classes2.dex` · bat
```
For more information please visit https://google.github.io/accompanist/systemuicontroller
accompanist/web is deprecated and the API is no longer maintained. 
We recommend forking the implementation and customising it to your needs. 
For more information please visit https://google.github.io/accompanist/web
batch {
event_filter {
property_filter {
Cloudbridge Configured: 
================
```

### 2.28.0 · `split-1/LICENSES.txt` · skeleton
```
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
```

### 2.28.0 · `split-1/LICENSES.txt` · skeleton
```
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
```

### 2.28.0 · `split-1/classes7.dex` · bat
```
https://developer.android.com/guide/topics/permissions/overview
\Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.
WAttempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.
fAttempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.
bAttempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.
_Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.
[Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.
Attempted to register plugin (
8Attempted to run a DartExecutor that is already running.
```

### 2.28.0 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// aero : see https://www.information.aero/index.php?id=66
aero
accident-investigation.aero
accident-prevention.aero
aerobatic.aero
aeroclub.aero
aerodrome.aero
agents.aero
aircraft.aero
```

### 2.28.0 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--fiqz9s ("Zhongguo/China", Chinese, Traditional) : CN
// CNNIC
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--lgbbat1ad8j ("Algeria/Al Jazair", Arabic) : DZ
// xn--wgbh1c ("Egypt/Masr", Arabic) : EG
// http://www.dotmasr.eg/
// xn--e1a4c ("eu", Cyrillic) : EU
// xn--node ("ge", Georgian Mkhedruli) : GE
```

### 2.28.0 · `split-1/mozilla/public-suffix-list.txt` · hante
```
// Submitted by Hanno B
ck <hanno@schokokeks.org>
schokokeks.net
// Scry Security : http://www.scrysec.com
// Submitted by Shante Adam <shante@skyhat.io>
scrysec.com
// Securepoint GmbH : https://www.securepoint.de
// Submitted by Erik Anders <erik.anders@securepoint.de>
firewall-gateway.com
```

### 2.28.0 · `split-1/mozilla/public-suffix-list.txt` · hante
```
applinzi.com
sinaapp.com
vipsinaapp.com
// Skyhat : http://www.skyhat.io
// Submitted by Shante Adam <shante@skyhat.io>
bounty-full.com
alpha.bounty-full.com
beta.bounty-full.com
// staticland : https://static.land
```

### 2.28.0 · `split-1/META-INF/commons-codec-1.10/META-INF/NOTICE.txt` · bat
```
Copyright 2002-2014 The Apache Software Foundation
This product includes software developed at
The Apache Software Foundation (http://www.apache.org/).
src/test/org/apache/commons/codec/language/DoubleMetaphoneTest.java
contains test data from http://aspell.net/test/orig/batch0.tab.
Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org)
===============================================================================
The content of package org.apache.commons.codec.language.bm has been translated
from the original php source code available at http://stevemorse.org/phoneticinfo.htm
```

### 2.28.0 · `split-1/res/layout/main_activity_wrm_test.xml` · witch
```
android
((androidx.compose.ui.platform.ComposeView
11androidx.constraintlayout.widget.ConstraintLayout
''com.yalla.yalla.ui.view.ScrollableViews
""com.yalla.yalla.ui.view.SwitchView
''http://schemas.android.com/apk/res-auto
**http://schemas.android.com/apk/res/android
include
layout
```

### 2.28.0 · `split-2/lib/armeabi-v7a/libapp.so` · witch
```
_checkCacheSize@159034022
_errorMessage@14069316
_GiftRuleGroupComponent&PositionComponent&HasGameRef&HasPaint@566276047
1-ci kvartal2
None of the patterns in the switch expression the matched input value. See https://github.com/dart-lang/language/issues/3488 for details.
init:gameRoundIndex
_SplayTreeValueIterable@3220832
isInternalRefresh
_handleAnimationChanged@330443363
```

### 2.28.0 · `split-2/lib/armeabi-v7a/libapp.so` · witch
```
aprile
Maart
huhtikuuta
enero
None of the patterns in the exhaustive switch statement the matched input value. See https://github.com/dart-lang/language/issues/3488 for details.
set:onHorizontalDragUpdate
_yieldAsyncStar@4048458
PinPUp
_await@4048458
```

### 2.29.0 · `split-1/classes5.dex` · bat
```
|CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `follow
```

### 2.29.0 · `split-1/classes5.dex` · bat
```
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGE
```

### 2.29.0 · `split-1/classes5.dex` · bat
```
INITIATE_VOTE_REQUEST
INSERT INTO FriendsTableTemp (id, name, head, vip, vip_level, idx, uid, sex, add_from, time, role, sign) SELECT userid, username, headphoto, uservip, supervip, standbyone, standbytwo, standbythree, standbyfour, ctime, role, sign FROM FriendsTable
UINSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)
INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`orderType`,`sku`,`amount`,`usdAmount`,`unit`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`time`,`uid`,`isRead`,`num`,`point`,`dayNum`,`jsonData`,`title`,`icon`,`jumpUrl`,`rewardItem`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`currExpePercent`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`,`BarrageGameInfo_title`,`BarrageGameInfo_content`,`BarrageGameInfo_img`,`BarrageGameInfo_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`jsonData`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ErrorCodeTable` (`code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)
```

### 2.29.0 · `split-1/classes5.dex` · witch
```
Landroid/widget/ProgressBar;
Landroid/widget/RelativeLayout;
0Landroid/widget/SeekBar$OnSeekBarChangeListener;
Landroid/widget/SeekBar;
Landroid/widget/Switch;
$Landroid/widget/TextView$BufferType;
Landroid/widget/TextView;
Landroid/widget/Toast;
%Landroidx/activity/ComponentActivity;
```

### 2.29.0 · `split-1/classes6.dex` · witch
```
Landroid/widget/RadioButton;
Landroid/widget/RelativeLayout;
Landroid/widget/ScrollView;
Landroid/widget/Space;
Landroid/widget/Switch;
Landroid/widget/TableRow;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
%Landroidx/activity/ComponentActivity;
```

### 2.29.0 · `split-1/classes2.dex` · bat
```
For more information please visit https://google.github.io/accompanist/systemuicontroller
accompanist/web is deprecated and the API is no longer maintained. 
We recommend forking the implementation and customising it to your needs. 
For more information please visit https://google.github.io/accompanist/web
batch {
event_filter {
property_filter {
Cloudbridge Configured: 
================
```

### 2.29.0 · `split-1/LICENSES.txt` · skeleton
```
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
```

### 2.29.0 · `split-1/LICENSES.txt` · skeleton
```
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
```

### 2.29.0 · `split-1/classes7.dex` · bat
```
https://developer.android.com/guide/topics/permissions/overview
\Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.
WAttempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.
fAttempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.
bAttempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.
_Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.
[Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.
Attempted to register plugin (
8Attempted to run a DartExecutor that is already running.
```

### 2.29.0 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// aero : see https://www.information.aero/index.php?id=66
aero
accident-investigation.aero
accident-prevention.aero
aerobatic.aero
aeroclub.aero
aerodrome.aero
agents.aero
aircraft.aero
```

### 2.29.0 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--fiqz9s ("Zhongguo/China", Chinese, Traditional) : CN
// CNNIC
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--lgbbat1ad8j ("Algeria/Al Jazair", Arabic) : DZ
// xn--wgbh1c ("Egypt/Masr", Arabic) : EG
// http://www.dotmasr.eg/
// xn--e1a4c ("eu", Cyrillic) : EU
// xn--node ("ge", Georgian Mkhedruli) : GE
```

### 2.29.0 · `split-1/mozilla/public-suffix-list.txt` · hante
```
// Submitted by Hanno B
ck <hanno@schokokeks.org>
schokokeks.net
// Scry Security : http://www.scrysec.com
// Submitted by Shante Adam <shante@skyhat.io>
scrysec.com
// Securepoint GmbH : https://www.securepoint.de
// Submitted by Erik Anders <erik.anders@securepoint.de>
firewall-gateway.com
```

### 2.29.0 · `split-1/mozilla/public-suffix-list.txt` · hante
```
applinzi.com
sinaapp.com
vipsinaapp.com
// Skyhat : http://www.skyhat.io
// Submitted by Shante Adam <shante@skyhat.io>
bounty-full.com
alpha.bounty-full.com
beta.bounty-full.com
// staticland : https://static.land
```

### 2.29.0 · `split-1/META-INF/commons-codec-1.10/META-INF/NOTICE.txt` · bat
```
Copyright 2002-2014 The Apache Software Foundation
This product includes software developed at
The Apache Software Foundation (http://www.apache.org/).
src/test/org/apache/commons/codec/language/DoubleMetaphoneTest.java
contains test data from http://aspell.net/test/orig/batch0.tab.
Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org)
===============================================================================
The content of package org.apache.commons.codec.language.bm has been translated
from the original php source code available at http://stevemorse.org/phoneticinfo.htm
```

### 2.29.0 · `split-1/res/layout/main_activity_wrm_test.xml` · witch
```
android
((androidx.compose.ui.platform.ComposeView
11androidx.constraintlayout.widget.ConstraintLayout
''com.yalla.yalla.ui.view.ScrollableViews
""com.yalla.yalla.ui.view.SwitchView
''http://schemas.android.com/apk/res-auto
**http://schemas.android.com/apk/res/android
include
layout
```

### 2.29.0 · `split-2/lib/armeabi-v7a/libapp.so` · witch
```
1-ci kvartal2
_errorMessage@14069316
_GiftRuleGroupComponent&PositionComponent&HasGameRef&HasPaint@566276047
init:_kEmptyChildList@432082469
None of the patterns in the switch expression the matched input value. See https://github.com/dart-lang/language/issues/3488 for details.
init:gameRoundIndex
_SplayTreeValueIterable@3220832
isInternalRefresh
_handleAnimationChanged@330443363
```

### 2.29.0 · `split-2/lib/armeabi-v7a/libapp.so` · witch
```
aprile
Maart
huhtikuuta
enero
None of the patterns in the exhaustive switch statement the matched input value. See https://github.com/dart-lang/language/issues/3488 for details.
set:onHorizontalDragUpdate
_yieldAsyncStar@4048458
PinPUp
_await@4048458
```

### 3.0.4 · `split-1/classes8.dex` · witch
```
Landroid/widget/RadioButton;
Landroid/widget/RelativeLayout;
Landroid/widget/ScrollView;
Landroid/widget/Space;
Landroid/widget/Switch;
Landroid/widget/TableRow;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
%Landroidx/activity/ComponentActivity;
```

### 3.0.4 · `split-1/classes5.dex` · bat
```
For more information please visit https://google.github.io/accompanist/systemuicontroller
accompanist/web is deprecated and the API is no longer maintained. 
We recommend forking the implementation and customising it to your needs. 
For more information please visit https://google.github.io/accompanist/web
batch {
event_filter {
for session 
property_filter {
Cloudbridge Configured: 
```

### 3.0.4 · `split-1/classes9.dex` · bat
```
https://developer.android.com/guide/topics/permissions/overview
\Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.
WAttempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.
fAttempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.
bAttempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.
_Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.
[Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.
Attempted to register plugin (
8Attempted to run a DartExecutor that is already running.
```

### 3.0.4 · `split-1/classes6.dex` · bat
```
|CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum`
```

### 3.0.4 · `split-1/classes6.dex` · bat
```
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER 
```

### 3.0.4 · `split-1/classes6.dex` · bat
```
INPUT_TYPE_FIELD_NUMBER
INSERT INTO FriendsTableTemp (id, name, head, vip, vip_level, idx, uid, sex, add_from, time, role, sign) SELECT userid, username, headphoto, uservip, supervip, standbyone, standbytwo, standbythree, standbyfour, ctime, role, sign FROM FriendsTable
UINSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)
INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`orderType`,`sku`,`amount`,`usdAmount`,`unit`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`scene`,`time`,`uid`,`isRead`,`num`,`point`,`dayNum`,`jsonData`,`title`,`icon`,`jumpUrl`,`rewardItem`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`currExpePercent`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`,`BarrageGameInfo_title`,`BarrageGameInfo_content`,`BarrageGameInfo_img`,`BarrageGameInfo_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`jsonData`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ErrorCodeTable` (`code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)
```

### 3.0.4 · `split-1/LICENSES.txt` · skeleton
```
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
```

### 3.0.4 · `split-1/LICENSES.txt` · skeleton
```
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
```

### 3.0.4 · `split-1/classes7.dex` · witch
```
Landroid/widget/ProgressBar;
Landroid/widget/RelativeLayout;
0Landroid/widget/SeekBar$OnSeekBarChangeListener;
Landroid/widget/SeekBar;
Landroid/widget/Switch;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
Landroid/widget/Toast;
%Landroidx/activity/ComponentActivity;
```

### 3.0.4 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// aero : see https://www.information.aero/index.php?id=66
aero
accident-investigation.aero
accident-prevention.aero
aerobatic.aero
aeroclub.aero
aerodrome.aero
agents.aero
aircraft.aero
```

### 3.0.4 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--fiqz9s ("Zhongguo/China", Chinese, Traditional) : CN
// CNNIC
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--lgbbat1ad8j ("Algeria/Al Jazair", Arabic) : DZ
// xn--wgbh1c ("Egypt/Masr", Arabic) : EG
// http://www.dotmasr.eg/
// xn--e1a4c ("eu", Cyrillic) : EU
// xn--node ("ge", Georgian Mkhedruli) : GE
```

### 3.0.4 · `split-1/mozilla/public-suffix-list.txt` · hante
```
// Submitted by Hanno B
ck <hanno@schokokeks.org>
schokokeks.net
// Scry Security : http://www.scrysec.com
// Submitted by Shante Adam <shante@skyhat.io>
scrysec.com
// Securepoint GmbH : https://www.securepoint.de
// Submitted by Erik Anders <erik.anders@securepoint.de>
firewall-gateway.com
```

### 3.0.4 · `split-1/mozilla/public-suffix-list.txt` · hante
```
applinzi.com
sinaapp.com
vipsinaapp.com
// Skyhat : http://www.skyhat.io
// Submitted by Shante Adam <shante@skyhat.io>
bounty-full.com
alpha.bounty-full.com
beta.bounty-full.com
// staticland : https://static.land
```

### 3.0.4 · `split-1/META-INF/commons-codec-1.10/META-INF/NOTICE.txt` · bat
```
Copyright 2002-2014 The Apache Software Foundation
This product includes software developed at
The Apache Software Foundation (http://www.apache.org/).
src/test/org/apache/commons/codec/language/DoubleMetaphoneTest.java
contains test data from http://aspell.net/test/orig/batch0.tab.
Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org)
===============================================================================
The content of package org.apache.commons.codec.language.bm has been translated
from the original php source code available at http://stevemorse.org/phoneticinfo.htm
```

### 3.0.4 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
set:contentLength
av. J.-C.
https://pro-game.yallalive.cn
decodeMethodCall
_spine_skeleton_set_skin_by_namePtr@1142030055
MaterialLocalizationPs
10^2
_clearMountedBit@501309486
Arial
```

### 3.0.4 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
Canvas::saveLayer
2n trimestre2
" is not supported by the platform. Refer to https://flutter.dev/docs/release/breaking-changes/network-policy-ios-android.
Invalid HTTP header field value: 
init:_spine_skeleton_drawable_get_animation_state_dataPtr@11420300552
stretch
_now@283319124
_maybeNotifyListeners@375411118
Piektdiena
```

### 3.0.5 · `split-1/classes8.dex` · witch
```
Landroid/widget/RadioButton;
Landroid/widget/RelativeLayout;
Landroid/widget/ScrollView;
Landroid/widget/Space;
Landroid/widget/Switch;
Landroid/widget/TableRow;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
%Landroidx/activity/ComponentActivity;
```

### 3.0.5 · `split-1/classes5.dex` · bat
```
For more information please visit https://google.github.io/accompanist/systemuicontroller
accompanist/web is deprecated and the API is no longer maintained. 
We recommend forking the implementation and customising it to your needs. 
For more information please visit https://google.github.io/accompanist/web
batch {
event_filter {
for session 
property_filter {
Cloudbridge Configured: 
```

### 3.0.5 · `split-1/classes9.dex` · bat
```
https://developer.android.com/guide/topics/permissions/overview
\Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.
WAttempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.
fAttempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.
bAttempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.
_Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.
[Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.
Attempted to register plugin (
8Attempted to run a DartExecutor that is already running.
```

### 3.0.5 · `split-1/classes6.dex` · bat
```
|CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum`
```

### 3.0.5 · `split-1/classes6.dex` · bat
```
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER 
```

### 3.0.5 · `split-1/classes6.dex` · bat
```
INPUT_TYPE_FIELD_NUMBER
INSERT INTO FriendsTableTemp (id, name, head, vip, vip_level, idx, uid, sex, add_from, time, role, sign) SELECT userid, username, headphoto, uservip, supervip, standbyone, standbytwo, standbythree, standbyfour, ctime, role, sign FROM FriendsTable
UINSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)
INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`orderType`,`sku`,`amount`,`usdAmount`,`unit`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`scene`,`time`,`uid`,`isRead`,`num`,`point`,`dayNum`,`jsonData`,`title`,`icon`,`jumpUrl`,`rewardItem`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`currExpePercent`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`,`BarrageGameInfo_title`,`BarrageGameInfo_content`,`BarrageGameInfo_img`,`BarrageGameInfo_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`jsonData`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ErrorCodeTable` (`code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)
```

### 3.0.5 · `split-1/LICENSES.txt` · skeleton
```
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
```

### 3.0.5 · `split-1/LICENSES.txt` · skeleton
```
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
```

### 3.0.5 · `split-1/classes7.dex` · witch
```
Landroid/widget/ProgressBar;
Landroid/widget/RelativeLayout;
0Landroid/widget/SeekBar$OnSeekBarChangeListener;
Landroid/widget/SeekBar;
Landroid/widget/Switch;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
Landroid/widget/Toast;
%Landroidx/activity/ComponentActivity;
```

### 3.0.5 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// aero : see https://www.information.aero/index.php?id=66
aero
accident-investigation.aero
accident-prevention.aero
aerobatic.aero
aeroclub.aero
aerodrome.aero
agents.aero
aircraft.aero
```

### 3.0.5 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--fiqz9s ("Zhongguo/China", Chinese, Traditional) : CN
// CNNIC
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--lgbbat1ad8j ("Algeria/Al Jazair", Arabic) : DZ
// xn--wgbh1c ("Egypt/Masr", Arabic) : EG
// http://www.dotmasr.eg/
// xn--e1a4c ("eu", Cyrillic) : EU
// xn--node ("ge", Georgian Mkhedruli) : GE
```

### 3.0.5 · `split-1/mozilla/public-suffix-list.txt` · hante
```
// Submitted by Hanno B
ck <hanno@schokokeks.org>
schokokeks.net
// Scry Security : http://www.scrysec.com
// Submitted by Shante Adam <shante@skyhat.io>
scrysec.com
// Securepoint GmbH : https://www.securepoint.de
// Submitted by Erik Anders <erik.anders@securepoint.de>
firewall-gateway.com
```

### 3.0.5 · `split-1/mozilla/public-suffix-list.txt` · hante
```
applinzi.com
sinaapp.com
vipsinaapp.com
// Skyhat : http://www.skyhat.io
// Submitted by Shante Adam <shante@skyhat.io>
bounty-full.com
alpha.bounty-full.com
beta.bounty-full.com
// staticland : https://static.land
```

### 3.0.5 · `split-1/META-INF/commons-codec-1.10/META-INF/NOTICE.txt` · bat
```
Copyright 2002-2014 The Apache Software Foundation
This product includes software developed at
The Apache Software Foundation (http://www.apache.org/).
src/test/org/apache/commons/codec/language/DoubleMetaphoneTest.java
contains test data from http://aspell.net/test/orig/batch0.tab.
Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org)
===============================================================================
The content of package org.apache.commons.codec.language.bm has been translated
from the original php source code available at http://stevemorse.org/phoneticinfo.htm
```

### 3.0.5 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
set:contentLength
av. J.-C.
https://pro-game.yallalive.cn
decodeMethodCall
_spine_skeleton_set_skin_by_namePtr@1142030055
MaterialLocalizationPs
10^2
_clearMountedBit@501309486
Arial
```

### 3.0.5 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
Canvas::saveLayer
2n trimestre2
" is not supported by the platform. Refer to https://flutter.dev/docs/release/breaking-changes/network-policy-ios-android.
Invalid HTTP header field value: 
init:_spine_skeleton_drawable_get_animation_state_dataPtr@11420300552
stretch
_now@283319124
_maybeNotifyListeners@375411118
Piektdiena
```

### 3.0.6 · `split-1/classes5.dex` · bat
```
For more information please visit https://google.github.io/accompanist/systemuicontroller
accompanist/web is deprecated and the API is no longer maintained. 
We recommend forking the implementation and customising it to your needs. 
For more information please visit https://google.github.io/accompanist/web
batch {
event_filter {
for session 
property_filter {
Cloudbridge Configured: 
```

### 3.0.6 · `split-1/classes9.dex` · bat
```
https://developer.android.com/guide/topics/permissions/overview
\Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.
WAttempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.
fAttempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.
bAttempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.
_Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.
[Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.
Attempted to register plugin (
8Attempted to run a DartExecutor that is already running.
```

### 3.0.6 · `split-1/classes6.dex` · bat
```
|CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum`
```

### 3.0.6 · `split-1/classes6.dex` · bat
```
CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))
CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))
CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `scene` INTEGER NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `num` INTEGER, `point` INTEGER, `dayNum` INTEGER, `jsonData` TEXT, `title` TEXT, `icon` TEXT, `jumpUrl` TEXT, `rewardItem` TEXT, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `currExpePercent` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, `BarrageGameInfo_title` TEXT, `BarrageGameInfo_content` TEXT, `BarrageGameInfo_img` TEXT, `BarrageGameInfo_region` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))
CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)
CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))
CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT NOT NULL, `background` TEXT NOT NULL, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT NOT NULL, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT NOT NULL, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER 
```

### 3.0.6 · `split-1/classes6.dex` · bat
```
INPUT_TYPE_FIELD_NUMBER
INSERT INTO FriendsTableTemp (id, name, head, vip, vip_level, idx, uid, sex, add_from, time, role, sign) SELECT userid, username, headphoto, uservip, supervip, standbyone, standbytwo, standbythree, standbyfour, ctime, role, sign FROM FriendsTable
UINSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)
INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`orderType`,`sku`,`amount`,`usdAmount`,`unit`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR IGNORE INTO `SystemMessageTable` (`mid`,`type`,`message`,`scene`,`time`,`uid`,`isRead`,`num`,`point`,`dayNum`,`jsonData`,`title`,`icon`,`jumpUrl`,`rewardItem`,`vipLevel`,`awardType`,`treasureBoxNumber`,`treasureBoxImageUrl`,`kaVipType`,`kaVipLevel`,`currExpePercent`,`rewardCoin`,`messageType`,`MemberBadgeFrozenInfo_roomId`,`MemberBadgeFrozenInfo_roomName`,`MemberBadgeTopRankReward_shopId`,`MemberBadgeTopRankReward_shopUrl`,`GiftBackpackExpired_dyid`,`GiftBackpackExpired_headurl`,`GiftBackpackExpired_sex`,`GiftBackpackExpired_ispraise`,`GiftBackpackExpired_level`,`GiftBackpackExpired_coin`,`GiftBackpackExpired_upcrystal`,`GiftBackpackExpired_language`,`GiftBackpackExpired_nickname`,`GiftBackpackExpired_dyurl`,`GiftBlindTaskReward_awardtype`,`GiftBlindTaskReward_awardcount`,`GiftBlindTaskReward_awardId`,`GiftBlindTaskReward_awardimage`,`GiftBlindRankingReward_toprank`,`GiftBlindRankingReward_toptype`,`GiftBlindRankingReward_awardtype`,`GiftBlindRankingReward_awardcount`,`GiftBlindRankingReward_awardId`,`GiftBlindRankingReward_awardimage`,`Vip6DistributeSupremeGift_propCount`,`Vip6DistributeSupremeGift_propId`,`Vip6DistributeSupremeGift_propImage`,`joinTopicId`,`topicType`,`topicId`,`topicName`,`topicFailType`,`userUpLevel`,`userUpCoin`,`userUpCrystal`,`roomUpLevel`,`roomWageCoin`,`aristocracyBuyType`,`aristocracyLevel`,`nVIPLv`,`uniqueIdExpirationTime`,`consumerRebateCoin`,`unlockAvatarFrameUrl`,`subscribeRewardCoin`,`medalLevel`,`medalId`,`WealthLevelUpInfo_wealthLevel`,`WealthLevelUpInfo_badgeLevel`,`WealthLevelUpInfo_badgeImage`,`custom_theme_cause`,`give_theme_userId`,`give_theme_dayNum`,`eventName`,`eventMinute`,`eventStartTime`,`eventReason`,`reasonType`,`eventRoomId`,`eventId`,`BarrageGameInfo_title`,`BarrageGameInfo_content`,`BarrageGameInfo_img`,`BarrageGameInfo_region`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`jsonData`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `ErrorCodeTable` (`code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?)
INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)
```

### 3.0.6 · `split-1/LICENSES.txt` · skeleton
```
   GNU General Public License for more details.
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
```

### 3.0.6 · `split-1/LICENSES.txt` · skeleton
```
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */
/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
```

### 3.0.6 · `split-1/classes7.dex` · witch
```
Landroid/widget/ProgressBar;
Landroid/widget/RelativeLayout;
0Landroid/widget/SeekBar$OnSeekBarChangeListener;
Landroid/widget/SeekBar;
Landroid/widget/Switch;
0Landroid/widget/TextView$OnEditorActionListener;
Landroid/widget/TextView;
Landroid/widget/Toast;
%Landroidx/activity/ComponentActivity;
```

### 3.0.6 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// aero : see https://www.information.aero/index.php?id=66
aero
accident-investigation.aero
accident-prevention.aero
aerobatic.aero
aeroclub.aero
aerodrome.aero
agents.aero
aircraft.aero
```

### 3.0.6 · `split-1/mozilla/public-suffix-list.txt` · bat
```
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--fiqz9s ("Zhongguo/China", Chinese, Traditional) : CN
// CNNIC
// http://cnnic.cn/html/Dir/2005/10/11/3218.htm
// xn--lgbbat1ad8j ("Algeria/Al Jazair", Arabic) : DZ
// xn--wgbh1c ("Egypt/Masr", Arabic) : EG
// http://www.dotmasr.eg/
// xn--e1a4c ("eu", Cyrillic) : EU
// xn--node ("ge", Georgian Mkhedruli) : GE
```

### 3.0.6 · `split-1/mozilla/public-suffix-list.txt` · hante
```
// Submitted by Hanno B
ck <hanno@schokokeks.org>
schokokeks.net
// Scry Security : http://www.scrysec.com
// Submitted by Shante Adam <shante@skyhat.io>
scrysec.com
// Securepoint GmbH : https://www.securepoint.de
// Submitted by Erik Anders <erik.anders@securepoint.de>
firewall-gateway.com
```

### 3.0.6 · `split-1/mozilla/public-suffix-list.txt` · hante
```
applinzi.com
sinaapp.com
vipsinaapp.com
// Skyhat : http://www.skyhat.io
// Submitted by Shante Adam <shante@skyhat.io>
bounty-full.com
alpha.bounty-full.com
beta.bounty-full.com
// staticland : https://static.land
```

### 3.0.6 · `split-1/META-INF/commons-codec-1.10/META-INF/NOTICE.txt` · bat
```
Copyright 2002-2014 The Apache Software Foundation
This product includes software developed at
The Apache Software Foundation (http://www.apache.org/).
src/test/org/apache/commons/codec/language/DoubleMetaphoneTest.java
contains test data from http://aspell.net/test/orig/batch0.tab.
Copyright (C) 2002 Kevin Atkinson (kevina@gnu.org)
===============================================================================
The content of package org.apache.commons.codec.language.bm has been translated
from the original php source code available at http://stevemorse.org/phoneticinfo.htm
```

### 3.0.6 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
set:contentLength
av. J.-C.
https://pro-game.yallalive.cn
decodeMethodCall
_spine_skeleton_set_skin_by_namePtr@1142030055
MaterialLocalizationPs
10^2
_clearMountedBit@501309486
Arial
```

### 3.0.6 · `split-2/lib/armeabi-v7a/libapp.so` · skeleton
```
Canvas::saveLayer
2n trimestre2
" is not supported by the platform. Refer to https://flutter.dev/docs/release/breaking-changes/network-policy-ios-android.
Invalid HTTP header field value: 
init:_spine_skeleton_drawable_get_animation_state_dataPtr@11420300552
stretch
_now@283319124
_maybeNotifyListeners@375411118
Piektdiena
```

## Activity URLs

- `2.28.0` · `http://aspell.net/test/orig/batch0.tab`
- `2.29.0` · `http://aspell.net/test/orig/batch0.tab`
- `3.0.4` · `http://aspell.net/test/orig/batch0.tab`
- `3.0.4` · `https://activitytest2.yallalive.cn/activity/2024dist/templateActivity/?activityId`
- `3.0.4` · `https://activitytest2.yallalive.cn/activity/2025dist/H5ToCdemo/`
- `3.0.5` · `http://aspell.net/test/orig/batch0.tab`
- `3.0.5` · `https://activitytest2.yallalive.cn/activity/2024dist/templateActivity/?activityId`
- `3.0.5` · `https://activitytest2.yallalive.cn/activity/2025dist/H5ToCdemo/`
- `3.0.6` · `http://aspell.net/test/orig/batch0.tab`
- `3.0.6` · `https://activitytest2.yallalive.cn/activity/2024dist/templateActivity/?activityId`
- `3.0.6` · `https://activitytest2.yallalive.cn/activity/2025dist/H5ToCdemo/`