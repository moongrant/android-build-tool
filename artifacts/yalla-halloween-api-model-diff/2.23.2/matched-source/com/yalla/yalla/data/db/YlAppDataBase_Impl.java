package com.yalla.yalla.data.db;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.AccessToken;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o00.OooO0O0;
import o0000O0O.OooO;
import p004OooO0oO.o000oOoO;
import p004OooO0oO.o0OoOo0;
import p110o000ooo0.o000000O;
import p110o000ooo0.o0000OO0;
import p110o000ooo0.o0ooOOo;
import p407o0Oo0Oo.OooOOOO;
import p407o0Oo0Oo.OooOo;
import p407o0Oo0Oo.OooOo00;
import p407o0Oo0Oo.Oooo000;
import p407o0Oo0Oo.o;
import p407o0Oo0Oo.o00;
import p407o0Oo0Oo.o000;
import p407o0Oo0Oo.o00000;
import p407o0Oo0Oo.o000000;
import p407o0Oo0Oo.o000O000;
import p407o0Oo0Oo.o000OOo;
import p407o0Oo0Oo.o00O0000;
import p407o0Oo0Oo.o00O00OO;
import p407o0Oo0Oo.o00O0O0O;
import p407o0Oo0Oo.o00O0OO;
import p407o0Oo0Oo.o00O0OO0;
import p407o0Oo0Oo.o00O0OOO;
import p407o0Oo0Oo.o00OO0O0;
import p407o0Oo0Oo.o0O;
import p407o0Oo0Oo.o0O000;
import p407o0Oo0Oo.o0O0000O;
import p407o0Oo0Oo.o0O000O;
import p407o0Oo0Oo.o0O00O0o;
import p407o0Oo0Oo.o0O00OO;
import p407o0Oo0Oo.o0O00OOO;
import p407o0Oo0Oo.o0O00oO0;
import p407o0Oo0Oo.o0O0O00;
import p407o0Oo0Oo.o0O0O0O;
import p407o0Oo0Oo.o0O0O0Oo;
import p407o0Oo0Oo.o0O0OO0;
import p407o0Oo0Oo.o0O0OOO0;
import p407o0Oo0Oo.o0O0oo00;
import p407o0Oo0Oo.o0O0oo0o;
import p407o0Oo0Oo.o0OO00OO;
import p407o0Oo0Oo.o0OO00o0;
import p407o0Oo0Oo.o0OO0o00;
import p407o0Oo0Oo.o0OOO0;
import p407o0Oo0Oo.o0OOO0OO;
import p407o0Oo0Oo.o0OOo000;
import p407o0Oo0Oo.o0OOooO0;
import p407o0Oo0Oo.o0OoO00O;
import p407o0Oo0Oo.o0OoOoOo;
import p407o0Oo0Oo.o0o0000;
import p407o0Oo0Oo.oO00000;
import p407o0Oo0Oo.oO0000o0;
import p407o0Oo0Oo.oo00oO;
import p407o0Oo0Oo.ooo0Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class YlAppDataBase_Impl extends YlAppDataBase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile o0O0000O f22337OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile o00O0O0O f22338OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile o0O0oo00 f22339OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile o0O00oO0 f22340OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile o0O0OO0 f22341OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile o0O0oo0o f22342OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile OooOOOO f22343OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile o0O0O00 f22344OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o0OOo000 f22345OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile o0O00OO f22346OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public volatile ooo0Oo0 f22347OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile o00000 f22348OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile o0OOO0 f22349OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile oO0000o0 f22350OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile o00O0000 f22351OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile o0OO00OO f22352OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile o000O000 f22353OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile o00OO0O0 f22354OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile o0OoO00O f22355OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile o0OOooO0 f22356Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile o00O0OO f22357Oooo00O;

    public class OooO00o extends o0000OO0.OooO00o {
        public OooO00o() {
            super(47);
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MessageRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `title` TEXT, `message` TEXT, `type` INTEGER NOT NULL, `headphoto` TEXT, `scount` INTEGER NOT NULL, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `level` INTEGER NOT NULL, `isTop` INTEGER NOT NULL, `isTopTime` INTEGER NOT NULL, `dtime` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `status` INTEGER NOT NULL, `isread` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MessageRecord_midx_fromid` ON `MessageRecord` (`midx`, `fromid`)", "CREATE TABLE IF NOT EXISTS `ChatMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `msg` TEXT, `time` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `giftid` INTEGER NOT NULL, `number` INTEGER NOT NULL, `url` TEXT, `description` TEXT, `duration` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `filename` TEXT, `isread` INTEGER NOT NULL, `uid` TEXT, `warn` INTEGER NOT NULL, `gif_id` INTEGER, `gif_url` TEXT, `room_head` TEXT, `room_name` TEXT, `room_id` INTEGER, `room_idx` TEXT, `room_ip` TEXT, `moment_id` INTEGER, `moment_image` TEXT, `moment_text` TEXT, `moment_msg` TEXT, `topic_id` INTEGER, `topic_image` TEXT, `topic_name` TEXT, `topic_userCount` INTEGER, `topic_momentCount` INTEGER, `topic_msg` TEXT, `user_id` INTEGER, `user_idx` INTEGER, `user_head` TEXT, `user_name` TEXT, `user_msg` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessage_midx` ON `ChatMessage` (`midx`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `UserRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` INTEGER NOT NULL, `headurl` TEXT, `nickname` TEXT, `time` INTEGER NOT NULL, `localtime` INTEGER NOT NULL, `level` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `sex` INTEGER NOT NULL, `prettyId` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserRecord_userid` ON `UserRecord` (`userid`)", "CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessage_midx` ON `SystemMessage` (`midx`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `CommentNotice` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `fromUser` TEXT, `fromUid` INTEGER NOT NULL, `msg` TEXT, `localtime` INTEGER NOT NULL, `moment` TEXT, `momentId` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `uid` TEXT, `isRead` INTEGER NOT NULL, `form_header` TEXT, `form_name` TEXT, `post_image` TEXT, `gift_id` INTEGER NOT NULL, `gift_image` TEXT, `gift_num` INTEGER NOT NULL, `delete_type` INTEGER NOT NULL, `objectId` INTEGER NOT NULL, `dyImg` TEXT, `hostImg` TEXT, `circleName` TEXT, `hostId` INTEGER NOT NULL, `commentId` INTEGER NOT NULL, `rewardType` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_CommentNotice_midx` ON `CommentNotice` (`midx`)", "CREATE TABLE IF NOT EXISTS `FriendsTable` (`id` TEXT NOT NULL, `name` TEXT, `head` TEXT, `vip` TEXT, `vip_level` TEXT, `idx` TEXT, `uid` TEXT NOT NULL, `sex` TEXT, `add_from` TEXT, `time` INTEGER NOT NULL, `role` INTEGER NOT NULL, `sign` TEXT, `headframeurl` TEXT, `check_warn` INTEGER NOT NULL, `memoName` TEXT, PRIMARY KEY(`id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_FriendsTable_id_uid` ON `FriendsTable` (`id`, `uid`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewFriendsTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` TEXT, `username` TEXT, `headphoto` TEXT, `uservip` TEXT, `state` TEXT, `message` TEXT, `time` INTEGER NOT NULL, `standbyone` TEXT, `standbytwo` TEXT, `standbythree` TEXT, `isRead` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `userLevel` INTEGER NOT NULL, `mid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFriendsTable_userid` ON `NewFriendsTable` (`userid`)", "CREATE TABLE IF NOT EXISTS `NewFans` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `fansid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFans_fansid` ON `NewFans` (`fansid`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewVisitor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `visitorid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewVisitor_visitorid` ON `NewVisitor` (`visitorid`)", "CREATE TABLE IF NOT EXISTS `DraftMessageTable` (`uid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `userId`))", "CREATE INDEX IF NOT EXISTS `index_DraftMessageTable_uid_userId` ON `DraftMessageTable` (`uid`, `userId`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MusicTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `mTitle` TEXT, `mTitleKey` TEXT, `mDuration` INTEGER NOT NULL, `mArtist` TEXT, `mArtistKey` TEXT, `mComposer` TEXT, `mAlbum` TEXT, `mAlbumKey` TEXT, `mDisplayName` TEXT, `mMimeType` TEXT, `mPath` TEXT, `user` TEXT, `initialLetter` TEXT, `isSelect` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))", "CREATE INDEX IF NOT EXISTS `index_SearchHistoryTable_uid_tag_type` ON `SearchHistoryTable` (`uid`, `tag`, `type`)", "CREATE TABLE IF NOT EXISTS `RoomHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT, `time` INTEGER NOT NULL, `baridx` TEXT, `barname` TEXT, `barlevel` TEXT, `barimage` TEXT, `roomserverip` TEXT, `isencrypt` TEXT, `notice` TEXT, `labelname` TEXT, `istop` INTEGER NOT NULL, `countryid` TEXT, `isofficial` INTEGER NOT NULL, `bartype` TEXT, `medal` TEXT)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomHistory_repeat` ON `RoomHistory` (`repeat`)", "CREATE TABLE IF NOT EXISTS `RoomJoinHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomJoinHistory_repeat` ON `RoomJoinHistory` (`repeat`)", "CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomTheme_roomId` ON `RoomTheme` (`roomId`)", "CREATE TABLE IF NOT EXISTS `ApiErrorCodeDB` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Code` TEXT, `MessgeEn` TEXT, `MessgeME` TEXT, `MessgeTr` TEXT, `MessgeIn` TEXT, `MessgePT` TEXT, `MessgeES` TEXT, `MessgeHi` TEXT, `MessgeUr` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ApiErrorCodeDB_Code` ON `ApiErrorCodeDB` (`Code`)", "CREATE TABLE IF NOT EXISTS `ReadPostTable` (`cid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `readPostId` INTEGER NOT NULL, PRIMARY KEY(`cid`, `userId`))");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_ReadPostTable_cid_userId` ON `ReadPostTable` (`cid`, `userId`)", "CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_TopicRecentTable_topic_id_uid` ON `TopicRecentTable` (`topic_id`, `uid`)", "CREATE TABLE IF NOT EXISTS `BillingOrder` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `order_id` TEXT NOT NULL, `purchase_id` TEXT NOT NULL, `type` TEXT NOT NULL, `status` INTEGER NOT NULL, `sku` TEXT NOT NULL, `purchase_token` TEXT NOT NULL)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT, `background` TEXT, `userLevel` INTEGER NOT NULL, `isBlackUser` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGER NOT NULL, `tags` TEXT NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `kaVipState` INTEGER NOT NULL, `kaVipLevel` INTEGER NOT NULL, `showVIP` INTEGER NOT NULL DEFAULT 1, `currWealLv` INTEGER NOT NULL, `currBadgeImg` TEXT NOT NULL, `currBadgeLv` INTEGER NOT NULL, PRIMARY KEY(`userId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserInfoTable_userId` ON `UserInfoTable` (`userId`)", "CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `momentType` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `unknownMessage` TEXT NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER, `giftUrl` TEXT, `isGiftBlind` INTEGER, `isGiftBlindBox` INTEGER, `isGiftBackpack` INTEGER, `isGiftCustomMade` INTEGER, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `momentType` INTEGER, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, `themeBgName` TEXT, `themeBgImgUrl` TEXT, `themeVideoUrl` TEXT, `themeDayLimit` INTEGER, `themeExpireTime` INTEGER, `themeGiveId` INTEGER, `themeState` INTEGER, `eventId` INTEGER, `eventName` TEXT, `eventImageUrl` TEXT, `eventTagId` INTEGER, `eventStartTime` INTEGER, `eventEndTime` INTEGER, `eventRoomId` INTEGER, `eventRoomName` TEXT, `eventRoomIp` TEXT, `eventDeleted` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `buriedPointSource` TEXT NOT NULL, `buriedPointMessageId` TEXT NOT NULL, `type` INTEGER NOT NULL, `messageType` INTEGER NOT NULL, `jumpType` INTEGER NOT NULL, `jumpId` TEXT NOT NULL, `coverImage` TEXT NOT NULL, `detailImage` TEXT NOT NULL, `title` TEXT, `detailTitle` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `surveyMessageId` INTEGER, `surveyIsSubmit` INTEGER, `surveyScore` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `FriendTable` (`uid` INTEGER NOT NULL, `friendId` INTEGER NOT NULL, `memoName` TEXT, `time` INTEGER NOT NULL, `inRoom` INTEGER NOT NULL, `deleteMark` INTEGER NOT NULL, `isCheckUserRisk` INTEGER NOT NULL, PRIMARY KEY(`uid`, `friendId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendTable_uid_friendId` ON `FriendTable` (`uid`, `friendId`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)", "CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SimpleMessageTable_uid_type` ON `SimpleMessageTable` (`uid`, `type`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MomentMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `type` INTEGER NOT NULL, `userId_MomentPraise` INTEGER, `userNickName_MomentPraise` TEXT, `userHeadUrl_MomentPraise` TEXT, `momentId_MomentPraise` INTEGER, `momentImageUrl_MomentPraise` TEXT, `momentContent_MomentPraise` TEXT, `userId_CommentPraise` INTEGER, `userNickName_CommentPraise` TEXT, `userHeadUrl_CommentPraise` TEXT, `momentId_CommentPraise` INTEGER, `momentImageUrl_CommentPraise` TEXT, `momentContent_CommentPraise` TEXT, `userId_MomentComment` INTEGER, `userNickName_MomentComment` TEXT, `userHeadUrl_MomentComment` TEXT, `momentId_MomentComment` INTEGER, `momentImageUrl_MomentComment` TEXT, `momentContent_MomentComment` TEXT, `commentId_MomentComment` INTEGER, `commentContent_MomentComment` TEXT, `userId_CommentReply` INTEGER, `userNickName_CommentReply` TEXT, `userHeadUrl_CommentReply` TEXT, `momentId_CommentReply` INTEGER, `momentImageUrl_CommentReply` TEXT, `momentContent_CommentReply` TEXT, `commentId_CommentReply` INTEGER, `commentContent_CommentReply` TEXT, `replyId_CommentReply` INTEGER, `replyContent_CommentReply` TEXT, `userId_MomentAt` INTEGER, `userNickName_MomentAt` TEXT, `userHeadUrl_MomentAt` TEXT, `momentId_MomentAt` INTEGER, `momentImageUrl_MomentAt` TEXT, `momentContent_MomentAt` TEXT, `userId_CommentAt` INTEGER, `userNickName_CommentAt` TEXT, `userHeadUrl_CommentAt` TEXT, `momentId_CommentAt` INTEGER, `momentImageUrl_CommentAt` TEXT, `momentContent_CommentAt` TEXT, `commentId_CommentAt` INTEGER, `commentContent_CommentAt` TEXT, `userId_MomentGift` INTEGER, `userNickName_MomentGift` TEXT, `userHeadUrl_MomentGift` TEXT, `momentId_MomentGift` INTEGER, `momentImageUrl_MomentGift` TEXT, `giftNum_MomentGift` INTEGER, `giftImage_MomentGift` TEXT, `userId_CommentReward` INTEGER, `userNickName_CommentReward` TEXT, `userHeadUrl_CommentReward` TEXT, `momentId_CommentReward` INTEGER, `momentImageUrl_CommentReward` TEXT, `commentId_CommentReward` INTEGER, `commentContent_CommentReward` TEXT, `userId_ReplyReward` INTEGER, `userNickName_ReplyReward` TEXT, `userHeadUrl_ReplyReward` TEXT, `momentId_ReplyReward` INTEGER, `momentImageUrl_ReplyReward` TEXT, `commentId_ReplyReward` INTEGER, `commentContent_ReplyReward` TEXT, `momentId_MomentFeatured` INTEGER, `momentImageUrl_MomentFeatured` TEXT, `momentId_CommentFeatured` INTEGER, `momentImageUrl_CommentFeatured` TEXT, `momentContent_CommentFeatured` TEXT, `commentId_CommentFeatured` INTEGER, `userId_MomentTopicTop` INTEGER, `userHeadUrl_MomentTopicTop` TEXT, `momentImageUrl_MomentTopicTop` TEXT, `topicId_MomentTopicTop` INTEGER, `topicName_MomentTopicTop` TEXT, `userId_MomentTopicTopRevoke` INTEGER, `userHeadUrl_MomentTopicTopRevoke` TEXT, `momentImageUrl_MomentTopicTopRevoke` TEXT, `topicId_MomentTopicTopRevoke` INTEGER, `topicName_MomentTopicTopRevoke` TEXT, `userId_MomentTopicRemoveOwner` INTEGER, `userHeadUrl_MomentTopicRemoveOwner` TEXT, `momentImageUrl_MomentTopicRemoveOwner` TEXT, `momentId_MomentTopicRemoveOwner` INTEGER, `topicName_MomentTopicRemoveOwner` TEXT, `userId_MomentTopicRemoveAdmin` INTEGER, `userHeadUrl_MomentTopicRemoveAdmin` TEXT, `momentImageUrl_MomentTopicRemoveAdmin` TEXT, `momentId_MomentTopicRemoveAdmin` INTEGER, `topicName_MomentTopicRemoveAdmin` TEXT, `userId_TopicGroupCreateSuccessNotice` INTEGER, `nickName_TopicGroupCreateSuccessNotice` TEXT, `headUrl_TopicGroupCreateSuccessNotice` TEXT, `circleId_TopicGroupCreateSuccessNotice` INTEGER, `circleName_TopicGroupCreateSuccessNotice` TEXT, `circleHead_TopicGroupCreateSuccessNotice` TEXT, `type_TopicGroupCreateSuccessNotice` INTEGER, `groupOpenId_TopicGroupCreateSuccessNotice` TEXT, `userId_TopicGroupCreateOrJoinResult` INTEGER, `circleId_TopicGroupCreateOrJoinResult` INTEGER, `type_TopicGroupCreateOrJoinResult` INTEGER, `momentId_MomentSystemRemove` INTEGER, `momentImageUrl_MomentSystemRemove` TEXT, `deleteType_MomentSystemRemove` INTEGER, `commentId_CommentSystemRemove` INTEGER, `commentContent_CommentSystemRemove` TEXT, `deleteType_CommentSystemRemove` INTEGER, `deleteContent_CommentSystemRemove` TEXT, `momentId_MomentReportFeedback` INTEGER, `momentImageUrl_MomentReportFeedback` TEXT, `momentContent_MomentReportFeedback` TEXT, `momentTitle_MomentReportFeedback` TEXT, `commentId_CommentReportFeedback` INTEGER, `commentContent_CommentReportFeedback` TEXT, `momentImageUrl_CommentReportFeedback` TEXT, `commentTitle_CommentReportFeedback` TEXT, `commentCommentId_CommentReportFeedback` INTEGER, `commentCommentContent_CommentReportFeedback` TEXT, `circleId_CircleReportFeedback` INTEGER, `circleContent_CircleReportFeedback` TEXT, `circleImageUrl_CircleReportFeedback` TEXT, `circleTitle_CircleReportFeedback` TEXT, `topicUserId_TopicCreateSuccess` INTEGER, `topicId_TopicCreateSuccess` INTEGER, `topicName_TopicCreateSuccess` TEXT, `message_TopicCreateSuccess` TEXT, `topicUserId_TopicCreateFail` INTEGER, `topicId_TopicCreateFail` INTEGER, `topicName_TopicCreateFail` TEXT, `message_TopicCreateFail` TEXT, `failType_TopicCreateFail` INTEGER, `topicUserId_TopicCreateDisband` INTEGER, `topicId_TopicCreateDisband` INTEGER, `topicName_TopicCreateDisband` TEXT, `message_TopicCreateDisband` TEXT, `disbandContent_TopicCreateDisband` INTEGER, `topicId_TopicMemberAdd` INTEGER, `content_TopicMemberAdd` TEXT, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MomentMessageTable_uid_mid` ON `MomentMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `PayOrderTable` (`user_id` INTEGER NOT NULL, `order_id` TEXT NOT NULL, `sku` TEXT NOT NULL, `amount` REAL, `type` INTEGER NOT NULL, `purchase_token` TEXT NOT NULL, `huaWeiAccountFlag` INTEGER NOT NULL, `isConsume` INTEGER NOT NULL, `purchaseState` INTEGER NOT NULL, `isAcknowledged` INTEGER NOT NULL, `isSubscription` INTEGER NOT NULL, `subscriptionState` INTEGER NOT NULL, `subscriptionId` TEXT NOT NULL, `subscriptionOrderId` TEXT NOT NULL, `createTime` INTEGER NOT NULL, PRIMARY KEY(`order_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_PayOrderTable_order_id` ON `PayOrderTable` (`order_id`)");
            OooO.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SquareEventRoomTable_uid_mid` ON `SquareEventRoomTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `BuriedPointTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `device_brand` TEXT, `os_version` TEXT, `carrier` TEXT, `device_model` TEXT, `app_version` TEXT, `app_channel` TEXT, `ip` TEXT, `device_id` TEXT, `session_id` TEXT, `os` INTEGER NOT NULL, `user_id` TEXT, `event_id` TEXT, `event_type` INTEGER NOT NULL, `url` TEXT, `event_time` INTEGER NOT NULL, `room_id` INTEGER, `ext_info` TEXT)", "CREATE TABLE IF NOT EXISTS `HideContentTable` (`userId` INTEGER NOT NULL, `contentId` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`userId`, `type`, `contentId`))");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_HideContentTable_userId_type_contentId` ON `HideContentTable` (`userId`, `type`, `contentId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '90059d6bc2a40062e3120370c0bcf2af')");
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase db) {
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `MessageRecord`", "DROP TABLE IF EXISTS `ChatMessage`", "DROP TABLE IF EXISTS `UserRecord`", "DROP TABLE IF EXISTS `SystemMessage`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `CommentNotice`", "DROP TABLE IF EXISTS `FriendsTable`", "DROP TABLE IF EXISTS `NewFriendsTable`", "DROP TABLE IF EXISTS `NewFans`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `NewVisitor`", "DROP TABLE IF EXISTS `DraftMessageTable`", "DROP TABLE IF EXISTS `MusicTable`", "DROP TABLE IF EXISTS `SearchHistoryTable`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `RoomHistory`", "DROP TABLE IF EXISTS `RoomJoinHistory`", "DROP TABLE IF EXISTS `RoomTheme`", "DROP TABLE IF EXISTS `ApiErrorCodeDB`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `ReadPostTable`", "DROP TABLE IF EXISTS `TopicRecentTable`", "DROP TABLE IF EXISTS `BillingOrder`", "DROP TABLE IF EXISTS `UserInfoTable`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `ConversationTable`", "DROP TABLE IF EXISTS `ChatMessageTable`", "DROP TABLE IF EXISTS `YallaTeamMessageTable`", "DROP TABLE IF EXISTS `SystemMessageTable`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `FriendTable`", "DROP TABLE IF EXISTS `FriendRequestMessageTable`", "DROP TABLE IF EXISTS `SimpleMessageTable`", "DROP TABLE IF EXISTS `MomentMessageTable`");
            OooO.OooO0O0(db, "DROP TABLE IF EXISTS `PayOrderTable`", "DROP TABLE IF EXISTS `SquareEventRoomTable`", "DROP TABLE IF EXISTS `BuriedPointTable`", "DROP TABLE IF EXISTS `HideContentTable`");
            YlAppDataBase_Impl ylAppDataBase_Impl = YlAppDataBase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = ylAppDataBase_Impl.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ylAppDataBase_Impl.f10984OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0OO(SupportSQLiteDatabase db) {
            YlAppDataBase_Impl ylAppDataBase_Impl = YlAppDataBase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = ylAppDataBase_Impl.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ylAppDataBase_Impl.f10984OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            YlAppDataBase_Impl.this.f10978OooO00o = supportSQLiteDatabase;
            YlAppDataBase_Impl.this.OooOO0O(supportSQLiteDatabase);
            List<? extends RoomDatabase.OooO0O0> list = YlAppDataBase_Impl.this.f10984OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    YlAppDataBase_Impl.this.f10984OooO0oO.get(i).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO0O0.OooO00o(supportSQLiteDatabase);
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final void OooO0o0() {
        }

        @Override // o000ooo0.o0000OO0.OooO00o
        public final o0000OO0.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(19);
            map.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map.put("midx", new TableInfo.OooO00o(0, 1, "midx", "TEXT", null, false));
            map.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", null, false));
            map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, false));
            map.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map.put("headphoto", new TableInfo.OooO00o(0, 1, "headphoto", "TEXT", null, false));
            map.put("scount", new TableInfo.OooO00o(0, 1, "scount", "INTEGER", null, true));
            map.put("fromid", new TableInfo.OooO00o(0, 1, "fromid", "INTEGER", null, true));
            map.put("toid", new TableInfo.OooO00o(0, 1, "toid", "INTEGER", null, true));
            map.put("level", new TableInfo.OooO00o(0, 1, "level", "INTEGER", null, true));
            map.put("isTop", new TableInfo.OooO00o(0, 1, "isTop", "INTEGER", null, true));
            map.put("isTopTime", new TableInfo.OooO00o(0, 1, "isTopTime", "INTEGER", null, true));
            map.put("dtime", new TableInfo.OooO00o(0, 1, "dtime", "INTEGER", null, true));
            map.put("ltime", new TableInfo.OooO00o(0, 1, "ltime", "INTEGER", null, true));
            map.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, new TableInfo.OooO00o(0, 1, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "INTEGER", null, true));
            map.put("isread", new TableInfo.OooO00o(0, 1, "isread", "INTEGER", null, true));
            map.put("msgstatus", new TableInfo.OooO00o(0, 1, "msgstatus", "INTEGER", null, true));
            map.put("role", new TableInfo.OooO00o(0, 1, "role", "INTEGER", null, true));
            HashSet hashSetOooO0OO = o0OoOo0.OooO0OO(map, "headframeurl", new TableInfo.OooO00o(0, 1, "headframeurl", "TEXT", null, false), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new TableInfo.OooO0o("index_MessageRecord_midx_fromid", true, Arrays.asList("midx", "fromid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("MessageRecord", map, hashSetOooO0OO, hashSet);
            TableInfo tableInfoOooO00o = TableInfo.OooO00o(supportSQLiteDatabase, "MessageRecord");
            if (!tableInfo.equals(tableInfoOooO00o)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("MessageRecord(com.yalla.yalla.data.db.model.MessageRecord).\n Expected:\n", tableInfo, "\n Found:\n", tableInfoOooO00o));
            }
            HashMap map2 = new HashMap(40);
            map2.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map2.put("midx", new TableInfo.OooO00o(0, 1, "midx", "TEXT", null, false));
            map2.put("fromid", new TableInfo.OooO00o(0, 1, "fromid", "INTEGER", null, true));
            map2.put("toid", new TableInfo.OooO00o(0, 1, "toid", "INTEGER", null, true));
            map2.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map2.put("msg", new TableInfo.OooO00o(0, 1, "msg", "TEXT", null, false));
            map2.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map2.put("ltime", new TableInfo.OooO00o(0, 1, "ltime", "INTEGER", null, true));
            map2.put("giftid", new TableInfo.OooO00o(0, 1, "giftid", "INTEGER", null, true));
            map2.put("number", new TableInfo.OooO00o(0, 1, "number", "INTEGER", null, true));
            map2.put("url", new TableInfo.OooO00o(0, 1, "url", "TEXT", null, false));
            map2.put("description", new TableInfo.OooO00o(0, 1, "description", "TEXT", null, false));
            map2.put("duration", new TableInfo.OooO00o(0, 1, "duration", "INTEGER", null, true));
            map2.put("msgstatus", new TableInfo.OooO00o(0, 1, "msgstatus", "INTEGER", null, true));
            map2.put("filename", new TableInfo.OooO00o(0, 1, "filename", "TEXT", null, false));
            map2.put("isread", new TableInfo.OooO00o(0, 1, "isread", "INTEGER", null, true));
            map2.put("uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false));
            map2.put("warn", new TableInfo.OooO00o(0, 1, "warn", "INTEGER", null, true));
            map2.put("gif_id", new TableInfo.OooO00o(0, 1, "gif_id", "INTEGER", null, false));
            map2.put("gif_url", new TableInfo.OooO00o(0, 1, "gif_url", "TEXT", null, false));
            map2.put("room_head", new TableInfo.OooO00o(0, 1, "room_head", "TEXT", null, false));
            map2.put("room_name", new TableInfo.OooO00o(0, 1, "room_name", "TEXT", null, false));
            map2.put("room_id", new TableInfo.OooO00o(0, 1, "room_id", "INTEGER", null, false));
            map2.put("room_idx", new TableInfo.OooO00o(0, 1, "room_idx", "TEXT", null, false));
            map2.put("room_ip", new TableInfo.OooO00o(0, 1, "room_ip", "TEXT", null, false));
            map2.put("moment_id", new TableInfo.OooO00o(0, 1, "moment_id", "INTEGER", null, false));
            map2.put("moment_image", new TableInfo.OooO00o(0, 1, "moment_image", "TEXT", null, false));
            map2.put("moment_text", new TableInfo.OooO00o(0, 1, "moment_text", "TEXT", null, false));
            map2.put("moment_msg", new TableInfo.OooO00o(0, 1, "moment_msg", "TEXT", null, false));
            map2.put("topic_id", new TableInfo.OooO00o(0, 1, "topic_id", "INTEGER", null, false));
            map2.put("topic_image", new TableInfo.OooO00o(0, 1, "topic_image", "TEXT", null, false));
            map2.put("topic_name", new TableInfo.OooO00o(0, 1, "topic_name", "TEXT", null, false));
            map2.put("topic_userCount", new TableInfo.OooO00o(0, 1, "topic_userCount", "INTEGER", null, false));
            map2.put("topic_momentCount", new TableInfo.OooO00o(0, 1, "topic_momentCount", "INTEGER", null, false));
            map2.put("topic_msg", new TableInfo.OooO00o(0, 1, "topic_msg", "TEXT", null, false));
            map2.put(AccessToken.USER_ID_KEY, new TableInfo.OooO00o(0, 1, AccessToken.USER_ID_KEY, "INTEGER", null, false));
            map2.put("user_idx", new TableInfo.OooO00o(0, 1, "user_idx", "INTEGER", null, false));
            map2.put("user_head", new TableInfo.OooO00o(0, 1, "user_head", "TEXT", null, false));
            map2.put("user_name", new TableInfo.OooO00o(0, 1, "user_name", "TEXT", null, false));
            HashSet hashSetOooO0OO2 = o0OoOo0.OooO0OO(map2, "user_msg", new TableInfo.OooO00o(0, 1, "user_msg", "TEXT", null, false), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.OooO0o("index_ChatMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo2 = new TableInfo("ChatMessage", map2, hashSetOooO0OO2, hashSet2);
            TableInfo tableInfoOooO00o2 = TableInfo.OooO00o(supportSQLiteDatabase, "ChatMessage");
            if (!tableInfo2.equals(tableInfoOooO00o2)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("ChatMessage(com.yalla.yalla.data.db.model.ChatMessageOld).\n Expected:\n", tableInfo2, "\n Found:\n", tableInfoOooO00o2));
            }
            HashMap map3 = new HashMap(13);
            map3.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map3.put("userid", new TableInfo.OooO00o(0, 1, "userid", "INTEGER", null, true));
            map3.put("headurl", new TableInfo.OooO00o(0, 1, "headurl", "TEXT", null, false));
            map3.put("nickname", new TableInfo.OooO00o(0, 1, "nickname", "TEXT", null, false));
            map3.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map3.put("localtime", new TableInfo.OooO00o(0, 1, "localtime", "INTEGER", null, true));
            map3.put("level", new TableInfo.OooO00o(0, 1, "level", "INTEGER", null, true));
            map3.put("vip", new TableInfo.OooO00o(0, 1, "vip", "INTEGER", null, true));
            map3.put("vipLevel", new TableInfo.OooO00o(0, 1, "vipLevel", "INTEGER", null, true));
            map3.put("sex", new TableInfo.OooO00o(0, 1, "sex", "INTEGER", null, true));
            map3.put("prettyId", new TableInfo.OooO00o(0, 1, "prettyId", "INTEGER", null, true));
            map3.put("role", new TableInfo.OooO00o(0, 1, "role", "INTEGER", null, true));
            HashSet hashSetOooO0OO3 = o0OoOo0.OooO0OO(map3, "headframeurl", new TableInfo.OooO00o(0, 1, "headframeurl", "TEXT", null, false), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new TableInfo.OooO0o("index_UserRecord_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("UserRecord", map3, hashSetOooO0OO3, hashSet3);
            TableInfo tableInfoOooO00o3 = TableInfo.OooO00o(supportSQLiteDatabase, "UserRecord");
            if (!tableInfo3.equals(tableInfoOooO00o3)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("UserRecord(com.yalla.yalla.data.db.model.UserRecord).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfoOooO00o3));
            }
            HashMap map4 = new HashMap(11);
            map4.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map4.put("type_code", new TableInfo.OooO00o(0, 1, "type_code", "INTEGER", null, true));
            map4.put("midx", new TableInfo.OooO00o(0, 1, "midx", "TEXT", null, false));
            map4.put("data", new TableInfo.OooO00o(0, 1, "data", "TEXT", null, false));
            map4.put("content", new TableInfo.OooO00o(0, 1, "content", "TEXT", null, false));
            map4.put("localtime", new TableInfo.OooO00o(0, 1, "localtime", "INTEGER", null, true));
            map4.put("datetime", new TableInfo.OooO00o(0, 1, "datetime", "TEXT", null, false));
            map4.put("uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false));
            map4.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map4.put("topic_id", new TableInfo.OooO00o(0, 1, "topic_id", "INTEGER", null, true));
            HashSet hashSetOooO0OO4 = o0OoOo0.OooO0OO(map4, "topic_state", new TableInfo.OooO00o(0, 1, "topic_state", "INTEGER", null, true), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.OooO0o("index_SystemMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo4 = new TableInfo("SystemMessage", map4, hashSetOooO0OO4, hashSet4);
            TableInfo tableInfoOooO00o4 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemMessage");
            if (!tableInfo4.equals(tableInfoOooO00o4)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("SystemMessage(com.yalla.yalla.data.db.model.SystemMessageOld).\n Expected:\n", tableInfo4, "\n Found:\n", tableInfoOooO00o4));
            }
            HashMap map5 = new HashMap(26);
            map5.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map5.put("type_code", new TableInfo.OooO00o(0, 1, "type_code", "INTEGER", null, true));
            map5.put("midx", new TableInfo.OooO00o(0, 1, "midx", "TEXT", null, false));
            map5.put("fromUser", new TableInfo.OooO00o(0, 1, "fromUser", "TEXT", null, false));
            map5.put("fromUid", new TableInfo.OooO00o(0, 1, "fromUid", "INTEGER", null, true));
            map5.put("msg", new TableInfo.OooO00o(0, 1, "msg", "TEXT", null, false));
            map5.put("localtime", new TableInfo.OooO00o(0, 1, "localtime", "INTEGER", null, true));
            map5.put("moment", new TableInfo.OooO00o(0, 1, "moment", "TEXT", null, false));
            map5.put("momentId", new TableInfo.OooO00o(0, 1, "momentId", "INTEGER", null, true));
            map5.put("cid", new TableInfo.OooO00o(0, 1, "cid", "INTEGER", null, true));
            map5.put("uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false));
            map5.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map5.put("form_header", new TableInfo.OooO00o(0, 1, "form_header", "TEXT", null, false));
            map5.put("form_name", new TableInfo.OooO00o(0, 1, "form_name", "TEXT", null, false));
            map5.put("post_image", new TableInfo.OooO00o(0, 1, "post_image", "TEXT", null, false));
            map5.put("gift_id", new TableInfo.OooO00o(0, 1, "gift_id", "INTEGER", null, true));
            map5.put("gift_image", new TableInfo.OooO00o(0, 1, "gift_image", "TEXT", null, false));
            map5.put("gift_num", new TableInfo.OooO00o(0, 1, "gift_num", "INTEGER", null, true));
            map5.put("delete_type", new TableInfo.OooO00o(0, 1, "delete_type", "INTEGER", null, true));
            map5.put("objectId", new TableInfo.OooO00o(0, 1, "objectId", "INTEGER", null, true));
            map5.put("dyImg", new TableInfo.OooO00o(0, 1, "dyImg", "TEXT", null, false));
            map5.put("hostImg", new TableInfo.OooO00o(0, 1, "hostImg", "TEXT", null, false));
            map5.put("circleName", new TableInfo.OooO00o(0, 1, "circleName", "TEXT", null, false));
            map5.put("hostId", new TableInfo.OooO00o(0, 1, "hostId", "INTEGER", null, true));
            map5.put("commentId", new TableInfo.OooO00o(0, 1, "commentId", "INTEGER", null, true));
            HashSet hashSetOooO0OO5 = o0OoOo0.OooO0OO(map5, "rewardType", new TableInfo.OooO00o(0, 1, "rewardType", "INTEGER", null, true), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new TableInfo.OooO0o("index_CommentNotice_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo5 = new TableInfo("CommentNotice", map5, hashSetOooO0OO5, hashSet5);
            TableInfo tableInfoOooO00o5 = TableInfo.OooO00o(supportSQLiteDatabase, "CommentNotice");
            if (!tableInfo5.equals(tableInfoOooO00o5)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("CommentNotice(com.yalla.yalla.data.db.model.CommentNoticeOld).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfoOooO00o5));
            }
            HashMap map6 = new HashMap(15);
            map6.put("id", new TableInfo.OooO00o(1, 1, "id", "TEXT", null, true));
            map6.put("name", new TableInfo.OooO00o(0, 1, "name", "TEXT", null, false));
            map6.put("head", new TableInfo.OooO00o(0, 1, "head", "TEXT", null, false));
            map6.put("vip", new TableInfo.OooO00o(0, 1, "vip", "TEXT", null, false));
            map6.put("vip_level", new TableInfo.OooO00o(0, 1, "vip_level", "TEXT", null, false));
            map6.put("idx", new TableInfo.OooO00o(0, 1, "idx", "TEXT", null, false));
            map6.put("uid", new TableInfo.OooO00o(2, 1, "uid", "TEXT", null, true));
            map6.put("sex", new TableInfo.OooO00o(0, 1, "sex", "TEXT", null, false));
            map6.put("add_from", new TableInfo.OooO00o(0, 1, "add_from", "TEXT", null, false));
            map6.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map6.put("role", new TableInfo.OooO00o(0, 1, "role", "INTEGER", null, true));
            map6.put("sign", new TableInfo.OooO00o(0, 1, "sign", "TEXT", null, false));
            map6.put("headframeurl", new TableInfo.OooO00o(0, 1, "headframeurl", "TEXT", null, false));
            map6.put("check_warn", new TableInfo.OooO00o(0, 1, "check_warn", "INTEGER", null, true));
            HashSet hashSetOooO0OO6 = o0OoOo0.OooO0OO(map6, "memoName", new TableInfo.OooO00o(0, 1, "memoName", "TEXT", null, false), 0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.OooO0o("index_FriendsTable_id_uid", false, Arrays.asList("id", "uid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo6 = new TableInfo("FriendsTable", map6, hashSetOooO0OO6, hashSet6);
            TableInfo tableInfoOooO00o6 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendsTable");
            if (!tableInfo6.equals(tableInfoOooO00o6)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("FriendsTable(com.yalla.yalla.data.db.model.FriendsTableOld).\n Expected:\n", tableInfo6, "\n Found:\n", tableInfoOooO00o6));
            }
            HashMap map7 = new HashMap(17);
            map7.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map7.put("userid", new TableInfo.OooO00o(0, 1, "userid", "TEXT", null, false));
            map7.put("username", new TableInfo.OooO00o(0, 1, "username", "TEXT", null, false));
            map7.put("headphoto", new TableInfo.OooO00o(0, 1, "headphoto", "TEXT", null, false));
            map7.put("uservip", new TableInfo.OooO00o(0, 1, "uservip", "TEXT", null, false));
            map7.put("state", new TableInfo.OooO00o(0, 1, "state", "TEXT", null, false));
            map7.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, false));
            map7.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map7.put("standbyone", new TableInfo.OooO00o(0, 1, "standbyone", "TEXT", null, false));
            map7.put("standbytwo", new TableInfo.OooO00o(0, 1, "standbytwo", "TEXT", null, false));
            map7.put("standbythree", new TableInfo.OooO00o(0, 1, "standbythree", "TEXT", null, false));
            map7.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map7.put("gender", new TableInfo.OooO00o(0, 1, "gender", "INTEGER", null, true));
            map7.put("vip", new TableInfo.OooO00o(0, 1, "vip", "INTEGER", null, true));
            map7.put("vipLevel", new TableInfo.OooO00o(0, 1, "vipLevel", "INTEGER", null, true));
            map7.put("userLevel", new TableInfo.OooO00o(0, 1, "userLevel", "INTEGER", null, true));
            HashSet hashSetOooO0OO7 = o0OoOo0.OooO0OO(map7, "mid", new TableInfo.OooO00o(0, 1, "mid", "TEXT", null, false), 0);
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new TableInfo.OooO0o("index_NewFriendsTable_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            TableInfo tableInfo7 = new TableInfo("NewFriendsTable", map7, hashSetOooO0OO7, hashSet7);
            TableInfo tableInfoOooO00o7 = TableInfo.OooO00o(supportSQLiteDatabase, "NewFriendsTable");
            if (!tableInfo7.equals(tableInfoOooO00o7)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("NewFriendsTable(com.yalla.yalla.data.db.model.NewFriendsOld).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfoOooO00o7));
            }
            HashMap map8 = new HashMap(3);
            map8.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map8.put("fansid", new TableInfo.OooO00o(0, 1, "fansid", "TEXT", null, false));
            HashSet hashSetOooO0OO8 = o0OoOo0.OooO0OO(map8, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.OooO0o("index_NewFans_fansid", true, Arrays.asList("fansid"), Arrays.asList("ASC")));
            TableInfo tableInfo8 = new TableInfo("NewFans", map8, hashSetOooO0OO8, hashSet8);
            TableInfo tableInfoOooO00o8 = TableInfo.OooO00o(supportSQLiteDatabase, "NewFans");
            if (!tableInfo8.equals(tableInfoOooO00o8)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("NewFans(com.yalla.yalla.data.db.model.NewFans).\n Expected:\n", tableInfo8, "\n Found:\n", tableInfoOooO00o8));
            }
            HashMap map9 = new HashMap(3);
            map9.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map9.put("visitorid", new TableInfo.OooO00o(0, 1, "visitorid", "TEXT", null, false));
            HashSet hashSetOooO0OO9 = o0OoOo0.OooO0OO(map9, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new TableInfo.OooO0o("index_NewVisitor_visitorid", true, Arrays.asList("visitorid"), Arrays.asList("ASC")));
            TableInfo tableInfo9 = new TableInfo("NewVisitor", map9, hashSetOooO0OO9, hashSet9);
            TableInfo tableInfoOooO00o9 = TableInfo.OooO00o(supportSQLiteDatabase, "NewVisitor");
            if (!tableInfo9.equals(tableInfoOooO00o9)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("NewVisitor(com.yalla.yalla.data.db.model.NewVisitor).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfoOooO00o9));
            }
            HashMap map10 = new HashMap(4);
            map10.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map10.put("userId", new TableInfo.OooO00o(2, 1, "userId", "INTEGER", null, true));
            map10.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            HashSet hashSetOooO0OO10 = o0OoOo0.OooO0OO(map10, "time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true), 0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.OooO0o("index_DraftMessageTable_uid_userId", false, Arrays.asList("uid", "userId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo10 = new TableInfo("DraftMessageTable", map10, hashSetOooO0OO10, hashSet10);
            TableInfo tableInfoOooO00o10 = TableInfo.OooO00o(supportSQLiteDatabase, "DraftMessageTable");
            if (!tableInfo10.equals(tableInfoOooO00o10)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("DraftMessageTable(com.yalla.yalla.data.db.table.DraftMessage).\n Expected:\n", tableInfo10, "\n Found:\n", tableInfoOooO00o10));
            }
            HashMap map11 = new HashMap(15);
            map11.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map11.put("mTitle", new TableInfo.OooO00o(0, 1, "mTitle", "TEXT", null, false));
            map11.put("mTitleKey", new TableInfo.OooO00o(0, 1, "mTitleKey", "TEXT", null, false));
            map11.put("mDuration", new TableInfo.OooO00o(0, 1, "mDuration", "INTEGER", null, true));
            map11.put("mArtist", new TableInfo.OooO00o(0, 1, "mArtist", "TEXT", null, false));
            map11.put("mArtistKey", new TableInfo.OooO00o(0, 1, "mArtistKey", "TEXT", null, false));
            map11.put("mComposer", new TableInfo.OooO00o(0, 1, "mComposer", "TEXT", null, false));
            map11.put("mAlbum", new TableInfo.OooO00o(0, 1, "mAlbum", "TEXT", null, false));
            map11.put("mAlbumKey", new TableInfo.OooO00o(0, 1, "mAlbumKey", "TEXT", null, false));
            map11.put("mDisplayName", new TableInfo.OooO00o(0, 1, "mDisplayName", "TEXT", null, false));
            map11.put("mMimeType", new TableInfo.OooO00o(0, 1, "mMimeType", "TEXT", null, false));
            map11.put("mPath", new TableInfo.OooO00o(0, 1, "mPath", "TEXT", null, false));
            map11.put("user", new TableInfo.OooO00o(0, 1, "user", "TEXT", null, false));
            map11.put("initialLetter", new TableInfo.OooO00o(0, 1, "initialLetter", "TEXT", null, false));
            TableInfo tableInfo11 = new TableInfo("MusicTable", map11, o0OoOo0.OooO0OO(map11, "isSelect", new TableInfo.OooO00o(0, 1, "isSelect", "INTEGER", null, true), 0), new HashSet(0));
            TableInfo tableInfoOooO00o11 = TableInfo.OooO00o(supportSQLiteDatabase, "MusicTable");
            if (!tableInfo11.equals(tableInfoOooO00o11)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("MusicTable(com.yalla.yalla.data.db.model.MusicTable).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfoOooO00o11));
            }
            HashMap map12 = new HashMap(4);
            map12.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map12.put(ViewHierarchyConstants.TAG_KEY, new TableInfo.OooO00o(2, 1, ViewHierarchyConstants.TAG_KEY, "TEXT", null, true));
            map12.put("type", new TableInfo.OooO00o(3, 1, "type", "INTEGER", null, true));
            HashSet hashSetOooO0OO11 = o0OoOo0.OooO0OO(map12, "time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true), 0);
            HashSet hashSet11 = new HashSet(1);
            hashSet11.add(new TableInfo.OooO0o("index_SearchHistoryTable_uid_tag_type", false, Arrays.asList("uid", ViewHierarchyConstants.TAG_KEY, "type"), Arrays.asList("ASC", "ASC", "ASC")));
            TableInfo tableInfo12 = new TableInfo("SearchHistoryTable", map12, hashSetOooO0OO11, hashSet11);
            TableInfo tableInfoOooO00o12 = TableInfo.OooO00o(supportSQLiteDatabase, "SearchHistoryTable");
            if (!tableInfo12.equals(tableInfoOooO00o12)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("SearchHistoryTable(com.yalla.yalla.data.db.model.SearchHistoryTable).\n Expected:\n", tableInfo12, "\n Found:\n", tableInfoOooO00o12));
            }
            HashMap map13 = new HashMap(18);
            map13.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map13.put("repeat", new TableInfo.OooO00o(0, 1, "repeat", "TEXT", null, false));
            map13.put("barid", new TableInfo.OooO00o(0, 1, "barid", "TEXT", null, false));
            map13.put("uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false));
            map13.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map13.put("baridx", new TableInfo.OooO00o(0, 1, "baridx", "TEXT", null, false));
            map13.put("barname", new TableInfo.OooO00o(0, 1, "barname", "TEXT", null, false));
            map13.put("barlevel", new TableInfo.OooO00o(0, 1, "barlevel", "TEXT", null, false));
            map13.put("barimage", new TableInfo.OooO00o(0, 1, "barimage", "TEXT", null, false));
            map13.put("roomserverip", new TableInfo.OooO00o(0, 1, "roomserverip", "TEXT", null, false));
            map13.put("isencrypt", new TableInfo.OooO00o(0, 1, "isencrypt", "TEXT", null, false));
            map13.put("notice", new TableInfo.OooO00o(0, 1, "notice", "TEXT", null, false));
            map13.put("labelname", new TableInfo.OooO00o(0, 1, "labelname", "TEXT", null, false));
            map13.put("istop", new TableInfo.OooO00o(0, 1, "istop", "INTEGER", null, true));
            map13.put("countryid", new TableInfo.OooO00o(0, 1, "countryid", "TEXT", null, false));
            map13.put("isofficial", new TableInfo.OooO00o(0, 1, "isofficial", "INTEGER", null, true));
            map13.put("bartype", new TableInfo.OooO00o(0, 1, "bartype", "TEXT", null, false));
            HashSet hashSetOooO0OO12 = o0OoOo0.OooO0OO(map13, "medal", new TableInfo.OooO00o(0, 1, "medal", "TEXT", null, false), 0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new TableInfo.OooO0o("index_RoomHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            TableInfo tableInfo13 = new TableInfo("RoomHistory", map13, hashSetOooO0OO12, hashSet12);
            TableInfo tableInfoOooO00o13 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomHistory");
            if (!tableInfo13.equals(tableInfoOooO00o13)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("RoomHistory(com.yalla.yalla.data.db.model.RoomHistory).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfoOooO00o13));
            }
            HashMap map14 = new HashMap(4);
            map14.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map14.put("repeat", new TableInfo.OooO00o(0, 1, "repeat", "TEXT", null, false));
            map14.put("barid", new TableInfo.OooO00o(0, 1, "barid", "TEXT", null, false));
            HashSet hashSetOooO0OO13 = o0OoOo0.OooO0OO(map14, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet13 = new HashSet(1);
            hashSet13.add(new TableInfo.OooO0o("index_RoomJoinHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            TableInfo tableInfo14 = new TableInfo("RoomJoinHistory", map14, hashSetOooO0OO13, hashSet13);
            TableInfo tableInfoOooO00o14 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomJoinHistory");
            if (!tableInfo14.equals(tableInfoOooO00o14)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("RoomJoinHistory(com.yalla.yalla.data.db.model.RoomJoinHistory).\n Expected:\n", tableInfo14, "\n Found:\n", tableInfoOooO00o14));
            }
            HashMap map15 = new HashMap(3);
            map15.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map15.put(ContributionFragment.ARG_1, new TableInfo.OooO00o(0, 1, ContributionFragment.ARG_1, "INTEGER", null, true));
            HashSet hashSetOooO0OO14 = o0OoOo0.OooO0OO(map15, "roomTheme", new TableInfo.OooO00o(0, 1, "roomTheme", "TEXT", null, false), 0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new TableInfo.OooO0o("index_RoomTheme_roomId", true, Arrays.asList(ContributionFragment.ARG_1), Arrays.asList("ASC")));
            TableInfo tableInfo15 = new TableInfo("RoomTheme", map15, hashSetOooO0OO14, hashSet14);
            TableInfo tableInfoOooO00o15 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomTheme");
            if (!tableInfo15.equals(tableInfoOooO00o15)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("RoomTheme(com.yalla.yalla.data.db.model.RoomTheme).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfoOooO00o15));
            }
            HashMap map16 = new HashMap(10);
            map16.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map16.put("Code", new TableInfo.OooO00o(0, 1, "Code", "TEXT", null, false));
            map16.put("MessgeEn", new TableInfo.OooO00o(0, 1, "MessgeEn", "TEXT", null, false));
            map16.put("MessgeME", new TableInfo.OooO00o(0, 1, "MessgeME", "TEXT", null, false));
            map16.put("MessgeTr", new TableInfo.OooO00o(0, 1, "MessgeTr", "TEXT", null, false));
            map16.put("MessgeIn", new TableInfo.OooO00o(0, 1, "MessgeIn", "TEXT", null, false));
            map16.put("MessgePT", new TableInfo.OooO00o(0, 1, "MessgePT", "TEXT", null, false));
            map16.put("MessgeES", new TableInfo.OooO00o(0, 1, "MessgeES", "TEXT", null, false));
            map16.put("MessgeHi", new TableInfo.OooO00o(0, 1, "MessgeHi", "TEXT", null, false));
            HashSet hashSetOooO0OO15 = o0OoOo0.OooO0OO(map16, "MessgeUr", new TableInfo.OooO00o(0, 1, "MessgeUr", "TEXT", null, false), 0);
            HashSet hashSet15 = new HashSet(1);
            hashSet15.add(new TableInfo.OooO0o("index_ApiErrorCodeDB_Code", true, Arrays.asList("Code"), Arrays.asList("ASC")));
            TableInfo tableInfo16 = new TableInfo("ApiErrorCodeDB", map16, hashSetOooO0OO15, hashSet15);
            TableInfo tableInfoOooO00o16 = TableInfo.OooO00o(supportSQLiteDatabase, "ApiErrorCodeDB");
            if (!tableInfo16.equals(tableInfoOooO00o16)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("ApiErrorCodeDB(com.yalla.yalla.data.db.model.ApiErrorCodeDB).\n Expected:\n", tableInfo16, "\n Found:\n", tableInfoOooO00o16));
            }
            HashMap map17 = new HashMap(3);
            map17.put("cid", new TableInfo.OooO00o(1, 1, "cid", "INTEGER", null, true));
            map17.put("userId", new TableInfo.OooO00o(2, 1, "userId", "INTEGER", null, true));
            HashSet hashSetOooO0OO16 = o0OoOo0.OooO0OO(map17, "readPostId", new TableInfo.OooO00o(0, 1, "readPostId", "INTEGER", null, true), 0);
            HashSet hashSet16 = new HashSet(1);
            hashSet16.add(new TableInfo.OooO0o("index_ReadPostTable_cid_userId", true, Arrays.asList("cid", "userId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo17 = new TableInfo("ReadPostTable", map17, hashSetOooO0OO16, hashSet16);
            TableInfo tableInfoOooO00o17 = TableInfo.OooO00o(supportSQLiteDatabase, "ReadPostTable");
            if (!tableInfo17.equals(tableInfoOooO00o17)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("ReadPostTable(com.yalla.yalla.data.db.model.ReadPostTable).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfoOooO00o17));
            }
            HashMap map18 = new HashMap(4);
            map18.put("topic_id", new TableInfo.OooO00o(1, 1, "topic_id", "INTEGER", null, true));
            map18.put("topic_name", new TableInfo.OooO00o(0, 1, "topic_name", "TEXT", null, false));
            map18.put("create_time", new TableInfo.OooO00o(0, 1, "create_time", "INTEGER", null, true));
            HashSet hashSetOooO0OO17 = o0OoOo0.OooO0OO(map18, "uid", new TableInfo.OooO00o(2, 1, "uid", "TEXT", null, true), 0);
            HashSet hashSet17 = new HashSet(1);
            hashSet17.add(new TableInfo.OooO0o("index_TopicRecentTable_topic_id_uid", false, Arrays.asList("topic_id", "uid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo18 = new TableInfo("TopicRecentTable", map18, hashSetOooO0OO17, hashSet17);
            TableInfo tableInfoOooO00o18 = TableInfo.OooO00o(supportSQLiteDatabase, "TopicRecentTable");
            if (!tableInfo18.equals(tableInfoOooO00o18)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("TopicRecentTable(com.yalla.yalla.data.db.model.TopicRecentTable).\n Expected:\n", tableInfo18, "\n Found:\n", tableInfoOooO00o18));
            }
            HashMap map19 = new HashMap(8);
            map19.put("_id", new TableInfo.OooO00o(1, 1, "_id", "INTEGER", null, true));
            map19.put(AccessToken.USER_ID_KEY, new TableInfo.OooO00o(0, 1, AccessToken.USER_ID_KEY, "TEXT", null, true));
            map19.put("order_id", new TableInfo.OooO00o(0, 1, "order_id", "TEXT", null, true));
            map19.put("purchase_id", new TableInfo.OooO00o(0, 1, "purchase_id", "TEXT", null, true));
            map19.put("type", new TableInfo.OooO00o(0, 1, "type", "TEXT", null, true));
            map19.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, new TableInfo.OooO00o(0, 1, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "INTEGER", null, true));
            map19.put("sku", new TableInfo.OooO00o(0, 1, "sku", "TEXT", null, true));
            TableInfo tableInfo19 = new TableInfo("BillingOrder", map19, o0OoOo0.OooO0OO(map19, "purchase_token", new TableInfo.OooO00o(0, 1, "purchase_token", "TEXT", null, true), 0), new HashSet(0));
            TableInfo tableInfoOooO00o19 = TableInfo.OooO00o(supportSQLiteDatabase, "BillingOrder");
            if (!tableInfo19.equals(tableInfoOooO00o19)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("BillingOrder(com.yalla.yalla.data.db.model.BillingOrder).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfoOooO00o19));
            }
            HashMap map20 = new HashMap(31);
            map20.put("userId", new TableInfo.OooO00o(1, 1, "userId", "INTEGER", null, true));
            map20.put("userIdx", new TableInfo.OooO00o(0, 1, "userIdx", "TEXT", null, true));
            map20.put("idLevel", new TableInfo.OooO00o(0, 1, "idLevel", "INTEGER", null, true));
            map20.put("userName", new TableInfo.OooO00o(0, 1, "userName", "TEXT", null, true));
            map20.put("userAvatar", new TableInfo.OooO00o(0, 1, "userAvatar", "TEXT", null, true));
            map20.put("userFrame", new TableInfo.OooO00o(0, 1, "userFrame", "TEXT", null, false));
            map20.put("background", new TableInfo.OooO00o(0, 1, "background", "TEXT", null, false));
            map20.put("userLevel", new TableInfo.OooO00o(0, 1, "userLevel", "INTEGER", null, true));
            map20.put("isBlackUser", new TableInfo.OooO00o(0, 1, "isBlackUser", "INTEGER", null, true));
            map20.put("gender", new TableInfo.OooO00o(0, 1, "gender", "INTEGER", null, true));
            map20.put("bio", new TableInfo.OooO00o(0, 1, "bio", "TEXT", null, false));
            map20.put("birthday", new TableInfo.OooO00o(0, 1, "birthday", "TEXT", null, true));
            map20.put("age", new TableInfo.OooO00o(0, 1, "age", "INTEGER", null, true));
            map20.put("countryId", new TableInfo.OooO00o(0, 1, "countryId", "INTEGER", null, true));
            map20.put("region", new TableInfo.OooO00o(0, 1, "region", "INTEGER", null, true));
            map20.put("medal", new TableInfo.OooO00o(0, 1, "medal", "TEXT", null, false));
            map20.put("visitorNum", new TableInfo.OooO00o(0, 1, "visitorNum", "INTEGER", null, true));
            map20.put("followedNum", new TableInfo.OooO00o(0, 1, "followedNum", "INTEGER", null, true));
            map20.put("fansNum", new TableInfo.OooO00o(0, 1, "fansNum", "INTEGER", null, true));
            map20.put("joinRoomNum", new TableInfo.OooO00o(0, 1, "joinRoomNum", "INTEGER", null, true));
            map20.put("role", new TableInfo.OooO00o(0, 1, "role", "INTEGER", null, true));
            map20.put("regTime", new TableInfo.OooO00o(0, 1, "regTime", "INTEGER", null, true));
            map20.put("tags", new TableInfo.OooO00o(0, 1, "tags", "TEXT", null, true));
            map20.put("vip", new TableInfo.OooO00o(0, 1, "vip", "INTEGER", null, true));
            map20.put("vipLevel", new TableInfo.OooO00o(0, 1, "vipLevel", "INTEGER", null, true));
            map20.put("kaVipState", new TableInfo.OooO00o(0, 1, "kaVipState", "INTEGER", null, true));
            map20.put("kaVipLevel", new TableInfo.OooO00o(0, 1, "kaVipLevel", "INTEGER", null, true));
            map20.put("showVIP", new TableInfo.OooO00o(0, 1, "showVIP", "INTEGER", "1", true));
            map20.put("currWealLv", new TableInfo.OooO00o(0, 1, "currWealLv", "INTEGER", null, true));
            map20.put("currBadgeImg", new TableInfo.OooO00o(0, 1, "currBadgeImg", "TEXT", null, true));
            HashSet hashSetOooO0OO18 = o0OoOo0.OooO0OO(map20, "currBadgeLv", new TableInfo.OooO00o(0, 1, "currBadgeLv", "INTEGER", null, true), 0);
            HashSet hashSet18 = new HashSet(1);
            hashSet18.add(new TableInfo.OooO0o("index_UserInfoTable_userId", true, Arrays.asList("userId"), Arrays.asList("ASC")));
            TableInfo tableInfo20 = new TableInfo("UserInfoTable", map20, hashSetOooO0OO18, hashSet18);
            TableInfo tableInfoOooO00o20 = TableInfo.OooO00o(supportSQLiteDatabase, "UserInfoTable");
            if (!tableInfo20.equals(tableInfoOooO00o20)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("UserInfoTable(com.yalla.yalla.data.db.table.UserInfo).\n Expected:\n", tableInfo20, "\n Found:\n", tableInfoOooO00o20));
            }
            HashMap map21 = new HashMap(14);
            map21.put("uid", new TableInfo.OooO00o(2, 1, "uid", "INTEGER", null, true));
            map21.put("targetId", new TableInfo.OooO00o(1, 1, "targetId", "INTEGER", null, true));
            map21.put("mid", new TableInfo.OooO00o(0, 1, "mid", "TEXT", null, true));
            map21.put("sendState", new TableInfo.OooO00o(0, 1, "sendState", "INTEGER", null, true));
            map21.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", null, true));
            map21.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            map21.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map21.put("momentType", new TableInfo.OooO00o(0, 1, "momentType", "INTEGER", null, true));
            map21.put("unReadCount", new TableInfo.OooO00o(0, 1, "unReadCount", "INTEGER", null, true));
            map21.put("draft", new TableInfo.OooO00o(0, 1, "draft", "TEXT", null, true));
            map21.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map21.put("topTime", new TableInfo.OooO00o(0, 1, "topTime", "INTEGER", null, true));
            map21.put("isVoiceAndUnread", new TableInfo.OooO00o(0, 1, "isVoiceAndUnread", "INTEGER", null, true));
            HashSet hashSetOooO0OO19 = o0OoOo0.OooO0OO(map21, "isAcceptMsg", new TableInfo.OooO00o(0, 1, "isAcceptMsg", "INTEGER", null, true), 0);
            HashSet hashSet19 = new HashSet(1);
            hashSet19.add(new TableInfo.OooO0o("index_ConversationTable_uid_targetId", true, Arrays.asList("uid", "targetId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo21 = new TableInfo("ConversationTable", map21, hashSetOooO0OO19, hashSet19);
            TableInfo tableInfoOooO00o21 = TableInfo.OooO00o(supportSQLiteDatabase, "ConversationTable");
            if (!tableInfo21.equals(tableInfoOooO00o21)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("ConversationTable(com.yalla.yalla.data.db.table.Conversation).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfoOooO00o21));
            }
            HashMap map22 = new HashMap(69);
            map22.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map22.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map22.put("targetId", new TableInfo.OooO00o(0, 1, "targetId", "INTEGER", null, true));
            map22.put("contentType", new TableInfo.OooO00o(0, 1, "contentType", "INTEGER", null, true));
            map22.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            map22.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map22.put("sendState", new TableInfo.OooO00o(0, 1, "sendState", "INTEGER", null, true));
            map22.put("isWarn", new TableInfo.OooO00o(0, 1, "isWarn", "INTEGER", null, true));
            map22.put("isAcceptMsg", new TableInfo.OooO00o(0, 1, "isAcceptMsg", "INTEGER", null, true));
            map22.put("unknownMessage", new TableInfo.OooO00o(0, 1, "unknownMessage", "TEXT", null, true));
            map22.put("voiceUrl", new TableInfo.OooO00o(0, 1, "voiceUrl", "TEXT", null, false));
            map22.put("voiceDuration", new TableInfo.OooO00o(0, 1, "voiceDuration", "INTEGER", null, false));
            map22.put("voiceFileName", new TableInfo.OooO00o(0, 1, "voiceFileName", "TEXT", null, false));
            map22.put("isVoiceRead", new TableInfo.OooO00o(0, 1, "isVoiceRead", "INTEGER", null, false));
            map22.put("emoticonType", new TableInfo.OooO00o(0, 1, "emoticonType", "INTEGER", null, false));
            map22.put("emoticonValue", new TableInfo.OooO00o(0, 1, "emoticonValue", "INTEGER", null, false));
            map22.put("emoticonIsRead", new TableInfo.OooO00o(0, 1, "emoticonIsRead", "INTEGER", null, false));
            map22.put("giftId", new TableInfo.OooO00o(0, 1, "giftId", "INTEGER", null, false));
            map22.put("giftNumber", new TableInfo.OooO00o(0, 1, "giftNumber", "INTEGER", null, false));
            map22.put("giftUrl", new TableInfo.OooO00o(0, 1, "giftUrl", "TEXT", null, false));
            map22.put("isGiftBlind", new TableInfo.OooO00o(0, 1, "isGiftBlind", "INTEGER", null, false));
            map22.put("isGiftBlindBox", new TableInfo.OooO00o(0, 1, "isGiftBlindBox", "INTEGER", null, false));
            map22.put("isGiftBackpack", new TableInfo.OooO00o(0, 1, "isGiftBackpack", "INTEGER", null, false));
            map22.put("isGiftCustomMade", new TableInfo.OooO00o(0, 1, "isGiftCustomMade", "INTEGER", null, false));
            map22.put("gifId", new TableInfo.OooO00o(0, 1, "gifId", "INTEGER", null, false));
            map22.put("gifUrl", new TableInfo.OooO00o(0, 1, "gifUrl", "TEXT", null, false));
            map22.put("roomHeader", new TableInfo.OooO00o(0, 1, "roomHeader", "TEXT", null, false));
            map22.put("roomName", new TableInfo.OooO00o(0, 1, "roomName", "TEXT", null, false));
            map22.put(ContributionFragment.ARG_1, new TableInfo.OooO00o(0, 1, ContributionFragment.ARG_1, "INTEGER", null, false));
            map22.put("roomIdx", new TableInfo.OooO00o(0, 1, "roomIdx", "INTEGER", null, false));
            map22.put("roomIp", new TableInfo.OooO00o(0, 1, "roomIp", "TEXT", null, false));
            map22.put("momentId", new TableInfo.OooO00o(0, 1, "momentId", "INTEGER", null, false));
            map22.put("momentImage", new TableInfo.OooO00o(0, 1, "momentImage", "TEXT", null, false));
            map22.put("momentText", new TableInfo.OooO00o(0, 1, "momentText", "TEXT", null, false));
            map22.put("momentMsg", new TableInfo.OooO00o(0, 1, "momentMsg", "TEXT", null, false));
            map22.put("momentType", new TableInfo.OooO00o(0, 1, "momentType", "INTEGER", null, false));
            map22.put("topicId", new TableInfo.OooO00o(0, 1, "topicId", "INTEGER", null, false));
            map22.put("topicImage", new TableInfo.OooO00o(0, 1, "topicImage", "TEXT", null, false));
            map22.put("topicName", new TableInfo.OooO00o(0, 1, "topicName", "TEXT", null, false));
            map22.put("topicUserCount", new TableInfo.OooO00o(0, 1, "topicUserCount", "INTEGER", null, false));
            map22.put("topicMomentCount", new TableInfo.OooO00o(0, 1, "topicMomentCount", "INTEGER", null, false));
            map22.put("topicMsg", new TableInfo.OooO00o(0, 1, "topicMsg", "TEXT", null, false));
            map22.put("shareUserId", new TableInfo.OooO00o(0, 1, "shareUserId", "INTEGER", null, false));
            map22.put("shareUserIdx", new TableInfo.OooO00o(0, 1, "shareUserIdx", "INTEGER", null, false));
            map22.put("shareUserHead", new TableInfo.OooO00o(0, 1, "shareUserHead", "TEXT", null, false));
            map22.put("shareUserName", new TableInfo.OooO00o(0, 1, "shareUserName", "TEXT", null, false));
            map22.put("shareUserMessage", new TableInfo.OooO00o(0, 1, "shareUserMessage", "TEXT", null, false));
            map22.put("activityImage", new TableInfo.OooO00o(0, 1, "activityImage", "TEXT", null, false));
            map22.put("activityText1", new TableInfo.OooO00o(0, 1, "activityText1", "TEXT", null, false));
            map22.put("activityText2", new TableInfo.OooO00o(0, 1, "activityText2", "TEXT", null, false));
            map22.put("activityMsg", new TableInfo.OooO00o(0, 1, "activityMsg", "TEXT", null, false));
            map22.put("activityUrl", new TableInfo.OooO00o(0, 1, "activityUrl", "TEXT", null, false));
            map22.put("themeBgName", new TableInfo.OooO00o(0, 1, "themeBgName", "TEXT", null, false));
            map22.put("themeBgImgUrl", new TableInfo.OooO00o(0, 1, "themeBgImgUrl", "TEXT", null, false));
            map22.put("themeVideoUrl", new TableInfo.OooO00o(0, 1, "themeVideoUrl", "TEXT", null, false));
            map22.put("themeDayLimit", new TableInfo.OooO00o(0, 1, "themeDayLimit", "INTEGER", null, false));
            map22.put("themeExpireTime", new TableInfo.OooO00o(0, 1, "themeExpireTime", "INTEGER", null, false));
            map22.put("themeGiveId", new TableInfo.OooO00o(0, 1, "themeGiveId", "INTEGER", null, false));
            map22.put("themeState", new TableInfo.OooO00o(0, 1, "themeState", "INTEGER", null, false));
            map22.put("eventId", new TableInfo.OooO00o(0, 1, "eventId", "INTEGER", null, false));
            map22.put("eventName", new TableInfo.OooO00o(0, 1, "eventName", "TEXT", null, false));
            map22.put("eventImageUrl", new TableInfo.OooO00o(0, 1, "eventImageUrl", "TEXT", null, false));
            map22.put("eventTagId", new TableInfo.OooO00o(0, 1, "eventTagId", "INTEGER", null, false));
            map22.put("eventStartTime", new TableInfo.OooO00o(0, 1, "eventStartTime", "INTEGER", null, false));
            map22.put("eventEndTime", new TableInfo.OooO00o(0, 1, "eventEndTime", "INTEGER", null, false));
            map22.put("eventRoomId", new TableInfo.OooO00o(0, 1, "eventRoomId", "INTEGER", null, false));
            map22.put("eventRoomName", new TableInfo.OooO00o(0, 1, "eventRoomName", "TEXT", null, false));
            map22.put("eventRoomIp", new TableInfo.OooO00o(0, 1, "eventRoomIp", "TEXT", null, false));
            HashSet hashSetOooO0OO20 = o0OoOo0.OooO0OO(map22, "eventDeleted", new TableInfo.OooO00o(0, 1, "eventDeleted", "INTEGER", null, false), 0);
            HashSet hashSet20 = new HashSet(1);
            hashSet20.add(new TableInfo.OooO0o("index_ChatMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo22 = new TableInfo("ChatMessageTable", map22, hashSetOooO0OO20, hashSet20);
            TableInfo tableInfoOooO00o22 = TableInfo.OooO00o(supportSQLiteDatabase, "ChatMessageTable");
            if (!tableInfo22.equals(tableInfoOooO00o22)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("ChatMessageTable(com.yalla.yalla.data.db.table.ChatMessage).\n Expected:\n", tableInfo22, "\n Found:\n", tableInfoOooO00o22));
            }
            HashMap map23 = new HashMap(18);
            map23.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map23.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map23.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            map23.put("buriedPointSource", new TableInfo.OooO00o(0, 1, "buriedPointSource", "TEXT", null, true));
            map23.put("buriedPointMessageId", new TableInfo.OooO00o(0, 1, "buriedPointMessageId", "TEXT", null, true));
            map23.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map23.put("messageType", new TableInfo.OooO00o(0, 1, "messageType", "INTEGER", null, true));
            map23.put("jumpType", new TableInfo.OooO00o(0, 1, "jumpType", "INTEGER", null, true));
            map23.put("jumpId", new TableInfo.OooO00o(0, 1, "jumpId", "TEXT", null, true));
            map23.put("coverImage", new TableInfo.OooO00o(0, 1, "coverImage", "TEXT", null, true));
            map23.put("detailImage", new TableInfo.OooO00o(0, 1, "detailImage", "TEXT", null, true));
            map23.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", null, false));
            map23.put("detailTitle", new TableInfo.OooO00o(0, 1, "detailTitle", "TEXT", null, true));
            map23.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map23.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map23.put("surveyMessageId", new TableInfo.OooO00o(0, 1, "surveyMessageId", "INTEGER", null, false));
            map23.put("surveyIsSubmit", new TableInfo.OooO00o(0, 1, "surveyIsSubmit", "INTEGER", null, false));
            HashSet hashSetOooO0OO21 = o0OoOo0.OooO0OO(map23, "surveyScore", new TableInfo.OooO00o(0, 1, "surveyScore", "INTEGER", null, false), 0);
            HashSet hashSet21 = new HashSet(1);
            hashSet21.add(new TableInfo.OooO0o("index_YallaTeamMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo23 = new TableInfo("YallaTeamMessageTable", map23, hashSetOooO0OO21, hashSet21);
            TableInfo tableInfoOooO00o23 = TableInfo.OooO00o(supportSQLiteDatabase, "YallaTeamMessageTable");
            if (!tableInfo23.equals(tableInfoOooO00o23)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("YallaTeamMessageTable(com.yalla.yalla.data.db.table.YallaTeamMessage).\n Expected:\n", tableInfo23, "\n Found:\n", tableInfoOooO00o23));
            }
            HashMap map24 = new HashMap(73);
            map24.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map24.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map24.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            map24.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map24.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map24.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map24.put("vipLevel", new TableInfo.OooO00o(0, 1, "vipLevel", "INTEGER", null, false));
            map24.put("awardType", new TableInfo.OooO00o(0, 1, "awardType", "INTEGER", null, false));
            map24.put("treasureBoxNumber", new TableInfo.OooO00o(0, 1, "treasureBoxNumber", "INTEGER", null, false));
            map24.put("treasureBoxImageUrl", new TableInfo.OooO00o(0, 1, "treasureBoxImageUrl", "TEXT", null, false));
            map24.put("kaVipType", new TableInfo.OooO00o(0, 1, "kaVipType", "INTEGER", null, false));
            map24.put("kaVipLevel", new TableInfo.OooO00o(0, 1, "kaVipLevel", "INTEGER", null, false));
            map24.put("rewardCoin", new TableInfo.OooO00o(0, 1, "rewardCoin", "INTEGER", null, false));
            map24.put("messageType", new TableInfo.OooO00o(0, 1, "messageType", "INTEGER", null, false));
            map24.put("MemberBadgeFrozenInfo_roomId", new TableInfo.OooO00o(0, 1, "MemberBadgeFrozenInfo_roomId", "INTEGER", null, false));
            map24.put("MemberBadgeFrozenInfo_roomName", new TableInfo.OooO00o(0, 1, "MemberBadgeFrozenInfo_roomName", "TEXT", null, false));
            map24.put("MemberBadgeTopRankReward_shopId", new TableInfo.OooO00o(0, 1, "MemberBadgeTopRankReward_shopId", "INTEGER", null, false));
            map24.put("MemberBadgeTopRankReward_shopUrl", new TableInfo.OooO00o(0, 1, "MemberBadgeTopRankReward_shopUrl", "TEXT", null, false));
            map24.put("GiftBackpackExpired_dyid", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_dyid", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_headurl", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_headurl", "TEXT", null, false));
            map24.put("GiftBackpackExpired_sex", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_sex", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_ispraise", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_ispraise", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_level", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_level", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_coin", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_coin", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_upcrystal", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_upcrystal", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_language", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_language", "INTEGER", null, false));
            map24.put("GiftBackpackExpired_nickname", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_nickname", "TEXT", null, false));
            map24.put("GiftBackpackExpired_dyurl", new TableInfo.OooO00o(0, 1, "GiftBackpackExpired_dyurl", "TEXT", null, false));
            map24.put("GiftBlindTaskReward_awardtype", new TableInfo.OooO00o(0, 1, "GiftBlindTaskReward_awardtype", "INTEGER", null, false));
            map24.put("GiftBlindTaskReward_awardcount", new TableInfo.OooO00o(0, 1, "GiftBlindTaskReward_awardcount", "INTEGER", null, false));
            map24.put("GiftBlindTaskReward_awardId", new TableInfo.OooO00o(0, 1, "GiftBlindTaskReward_awardId", "INTEGER", null, false));
            map24.put("GiftBlindTaskReward_awardimage", new TableInfo.OooO00o(0, 1, "GiftBlindTaskReward_awardimage", "TEXT", null, false));
            map24.put("GiftBlindRankingReward_toprank", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_toprank", "INTEGER", null, false));
            map24.put("GiftBlindRankingReward_toptype", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_toptype", "INTEGER", null, false));
            map24.put("GiftBlindRankingReward_awardtype", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_awardtype", "INTEGER", null, false));
            map24.put("GiftBlindRankingReward_awardcount", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_awardcount", "INTEGER", null, false));
            map24.put("GiftBlindRankingReward_awardId", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_awardId", "INTEGER", null, false));
            map24.put("GiftBlindRankingReward_awardimage", new TableInfo.OooO00o(0, 1, "GiftBlindRankingReward_awardimage", "TEXT", null, false));
            map24.put("Vip6DistributeSupremeGift_propCount", new TableInfo.OooO00o(0, 1, "Vip6DistributeSupremeGift_propCount", "INTEGER", null, false));
            map24.put("Vip6DistributeSupremeGift_propId", new TableInfo.OooO00o(0, 1, "Vip6DistributeSupremeGift_propId", "INTEGER", null, false));
            map24.put("Vip6DistributeSupremeGift_propImage", new TableInfo.OooO00o(0, 1, "Vip6DistributeSupremeGift_propImage", "TEXT", null, false));
            map24.put("joinTopicId", new TableInfo.OooO00o(0, 1, "joinTopicId", "INTEGER", null, false));
            map24.put("topicType", new TableInfo.OooO00o(0, 1, "topicType", "INTEGER", null, false));
            map24.put("topicId", new TableInfo.OooO00o(0, 1, "topicId", "INTEGER", null, false));
            map24.put("topicName", new TableInfo.OooO00o(0, 1, "topicName", "TEXT", null, false));
            map24.put("topicFailType", new TableInfo.OooO00o(0, 1, "topicFailType", "INTEGER", null, false));
            map24.put("userUpLevel", new TableInfo.OooO00o(0, 1, "userUpLevel", "INTEGER", null, false));
            map24.put("userUpCoin", new TableInfo.OooO00o(0, 1, "userUpCoin", "INTEGER", null, false));
            map24.put("userUpCrystal", new TableInfo.OooO00o(0, 1, "userUpCrystal", "INTEGER", null, false));
            map24.put("roomUpLevel", new TableInfo.OooO00o(0, 1, "roomUpLevel", "INTEGER", null, false));
            map24.put("roomWageCoin", new TableInfo.OooO00o(0, 1, "roomWageCoin", "INTEGER", null, false));
            map24.put("aristocracyBuyType", new TableInfo.OooO00o(0, 1, "aristocracyBuyType", "INTEGER", null, false));
            map24.put("aristocracyLevel", new TableInfo.OooO00o(0, 1, "aristocracyLevel", "INTEGER", null, false));
            map24.put("nVIPLv", new TableInfo.OooO00o(0, 1, "nVIPLv", "INTEGER", null, false));
            map24.put("uniqueIdExpirationTime", new TableInfo.OooO00o(0, 1, "uniqueIdExpirationTime", "INTEGER", null, false));
            map24.put("consumerRebateCoin", new TableInfo.OooO00o(0, 1, "consumerRebateCoin", "INTEGER", null, false));
            map24.put("unlockAvatarFrameUrl", new TableInfo.OooO00o(0, 1, "unlockAvatarFrameUrl", "TEXT", null, false));
            map24.put("subscribeRewardCoin", new TableInfo.OooO00o(0, 1, "subscribeRewardCoin", "INTEGER", null, false));
            map24.put("medalLevel", new TableInfo.OooO00o(0, 1, "medalLevel", "INTEGER", null, false));
            map24.put("medalId", new TableInfo.OooO00o(0, 1, "medalId", "INTEGER", null, false));
            map24.put("WealthLevelUpInfo_wealthLevel", new TableInfo.OooO00o(0, 1, "WealthLevelUpInfo_wealthLevel", "INTEGER", null, false));
            map24.put("WealthLevelUpInfo_badgeLevel", new TableInfo.OooO00o(0, 1, "WealthLevelUpInfo_badgeLevel", "INTEGER", null, false));
            map24.put("WealthLevelUpInfo_badgeImage", new TableInfo.OooO00o(0, 1, "WealthLevelUpInfo_badgeImage", "TEXT", null, false));
            map24.put("custom_theme_cause", new TableInfo.OooO00o(0, 1, "custom_theme_cause", "INTEGER", null, false));
            map24.put("give_theme_userId", new TableInfo.OooO00o(0, 1, "give_theme_userId", "INTEGER", null, false));
            map24.put("give_theme_dayNum", new TableInfo.OooO00o(0, 1, "give_theme_dayNum", "INTEGER", null, false));
            map24.put("eventName", new TableInfo.OooO00o(0, 1, "eventName", "TEXT", null, false));
            map24.put("eventMinute", new TableInfo.OooO00o(0, 1, "eventMinute", "INTEGER", null, false));
            map24.put("eventStartTime", new TableInfo.OooO00o(0, 1, "eventStartTime", "INTEGER", null, false));
            map24.put("eventReason", new TableInfo.OooO00o(0, 1, "eventReason", "TEXT", null, false));
            map24.put("reasonType", new TableInfo.OooO00o(0, 1, "reasonType", "INTEGER", null, false));
            map24.put("eventRoomId", new TableInfo.OooO00o(0, 1, "eventRoomId", "INTEGER", null, false));
            HashSet hashSetOooO0OO22 = o0OoOo0.OooO0OO(map24, "eventId", new TableInfo.OooO00o(0, 1, "eventId", "INTEGER", null, false), 0);
            HashSet hashSet22 = new HashSet(1);
            hashSet22.add(new TableInfo.OooO0o("index_SystemMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo24 = new TableInfo("SystemMessageTable", map24, hashSetOooO0OO22, hashSet22);
            TableInfo tableInfoOooO00o24 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemMessageTable");
            if (!tableInfo24.equals(tableInfoOooO00o24)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("SystemMessageTable(com.yalla.yalla.data.db.table.SystemMessage).\n Expected:\n", tableInfo24, "\n Found:\n", tableInfoOooO00o24));
            }
            HashMap map25 = new HashMap(7);
            map25.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map25.put("friendId", new TableInfo.OooO00o(2, 1, "friendId", "INTEGER", null, true));
            map25.put("memoName", new TableInfo.OooO00o(0, 1, "memoName", "TEXT", null, false));
            map25.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map25.put("inRoom", new TableInfo.OooO00o(0, 1, "inRoom", "INTEGER", null, true));
            map25.put("deleteMark", new TableInfo.OooO00o(0, 1, "deleteMark", "INTEGER", null, true));
            HashSet hashSetOooO0OO23 = o0OoOo0.OooO0OO(map25, "isCheckUserRisk", new TableInfo.OooO00o(0, 1, "isCheckUserRisk", "INTEGER", null, true), 0);
            HashSet hashSet23 = new HashSet(1);
            hashSet23.add(new TableInfo.OooO0o("index_FriendTable_uid_friendId", true, Arrays.asList("uid", "friendId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo25 = new TableInfo("FriendTable", map25, hashSetOooO0OO23, hashSet23);
            TableInfo tableInfoOooO00o25 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendTable");
            if (!tableInfo25.equals(tableInfoOooO00o25)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("FriendTable(com.yalla.yalla.data.db.table.Friend).\n Expected:\n", tableInfo25, "\n Found:\n", tableInfoOooO00o25));
            }
            HashMap map26 = new HashMap(7);
            map26.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map26.put("targetUserId", new TableInfo.OooO00o(2, 1, "targetUserId", "INTEGER", null, true));
            map26.put("mid", new TableInfo.OooO00o(0, 1, "mid", "TEXT", null, false));
            map26.put("state", new TableInfo.OooO00o(0, 1, "state", "INTEGER", null, true));
            map26.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, false));
            map26.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            HashSet hashSetOooO0OO24 = o0OoOo0.OooO0OO(map26, "isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true), 0);
            HashSet hashSet24 = new HashSet(1);
            hashSet24.add(new TableInfo.OooO0o("index_FriendRequestMessageTable_uid_targetUserId", true, Arrays.asList("uid", "targetUserId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo26 = new TableInfo("FriendRequestMessageTable", map26, hashSetOooO0OO24, hashSet24);
            TableInfo tableInfoOooO00o26 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendRequestMessageTable");
            if (!tableInfo26.equals(tableInfoOooO00o26)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("FriendRequestMessageTable(com.yalla.yalla.data.db.table.FriendRequestMessage).\n Expected:\n", tableInfo26, "\n Found:\n", tableInfoOooO00o26));
            }
            HashMap map27 = new HashMap(7);
            map27.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map27.put("type", new TableInfo.OooO00o(2, 1, "type", "INTEGER", null, true));
            map27.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map27.put("content", new TableInfo.OooO00o(0, 1, "content", "TEXT", null, false));
            map27.put("activityNum", new TableInfo.OooO00o(0, 1, "activityNum", "INTEGER", null, false));
            map27.put("fansNum", new TableInfo.OooO00o(0, 1, "fansNum", "INTEGER", null, false));
            HashSet hashSetOooO0OO25 = o0OoOo0.OooO0OO(map27, "visitorNum", new TableInfo.OooO00o(0, 1, "visitorNum", "INTEGER", null, false), 0);
            HashSet hashSet25 = new HashSet(1);
            hashSet25.add(new TableInfo.OooO0o("index_SimpleMessageTable_uid_type", true, Arrays.asList("uid", "type"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo27 = new TableInfo("SimpleMessageTable", map27, hashSetOooO0OO25, hashSet25);
            TableInfo tableInfoOooO00o27 = TableInfo.OooO00o(supportSQLiteDatabase, "SimpleMessageTable");
            if (!tableInfo27.equals(tableInfoOooO00o27)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("SimpleMessageTable(com.yalla.yalla.data.db.table.SimpleMessage).\n Expected:\n", tableInfo27, "\n Found:\n", tableInfoOooO00o27));
            }
            HashMap map28 = new HashMap(145);
            map28.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map28.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map28.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            map28.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map28.put("isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true));
            map28.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map28.put("userId_MomentPraise", new TableInfo.OooO00o(0, 1, "userId_MomentPraise", "INTEGER", null, false));
            map28.put("userNickName_MomentPraise", new TableInfo.OooO00o(0, 1, "userNickName_MomentPraise", "TEXT", null, false));
            map28.put("userHeadUrl_MomentPraise", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentPraise", "TEXT", null, false));
            map28.put("momentId_MomentPraise", new TableInfo.OooO00o(0, 1, "momentId_MomentPraise", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentPraise", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentPraise", "TEXT", null, false));
            map28.put("momentContent_MomentPraise", new TableInfo.OooO00o(0, 1, "momentContent_MomentPraise", "TEXT", null, false));
            map28.put("userId_CommentPraise", new TableInfo.OooO00o(0, 1, "userId_CommentPraise", "INTEGER", null, false));
            map28.put("userNickName_CommentPraise", new TableInfo.OooO00o(0, 1, "userNickName_CommentPraise", "TEXT", null, false));
            map28.put("userHeadUrl_CommentPraise", new TableInfo.OooO00o(0, 1, "userHeadUrl_CommentPraise", "TEXT", null, false));
            map28.put("momentId_CommentPraise", new TableInfo.OooO00o(0, 1, "momentId_CommentPraise", "INTEGER", null, false));
            map28.put("momentImageUrl_CommentPraise", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentPraise", "TEXT", null, false));
            map28.put("momentContent_CommentPraise", new TableInfo.OooO00o(0, 1, "momentContent_CommentPraise", "TEXT", null, false));
            map28.put("userId_MomentComment", new TableInfo.OooO00o(0, 1, "userId_MomentComment", "INTEGER", null, false));
            map28.put("userNickName_MomentComment", new TableInfo.OooO00o(0, 1, "userNickName_MomentComment", "TEXT", null, false));
            map28.put("userHeadUrl_MomentComment", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentComment", "TEXT", null, false));
            map28.put("momentId_MomentComment", new TableInfo.OooO00o(0, 1, "momentId_MomentComment", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentComment", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentComment", "TEXT", null, false));
            map28.put("momentContent_MomentComment", new TableInfo.OooO00o(0, 1, "momentContent_MomentComment", "TEXT", null, false));
            map28.put("commentId_MomentComment", new TableInfo.OooO00o(0, 1, "commentId_MomentComment", "INTEGER", null, false));
            map28.put("commentContent_MomentComment", new TableInfo.OooO00o(0, 1, "commentContent_MomentComment", "TEXT", null, false));
            map28.put("userId_CommentReply", new TableInfo.OooO00o(0, 1, "userId_CommentReply", "INTEGER", null, false));
            map28.put("userNickName_CommentReply", new TableInfo.OooO00o(0, 1, "userNickName_CommentReply", "TEXT", null, false));
            map28.put("userHeadUrl_CommentReply", new TableInfo.OooO00o(0, 1, "userHeadUrl_CommentReply", "TEXT", null, false));
            map28.put("momentId_CommentReply", new TableInfo.OooO00o(0, 1, "momentId_CommentReply", "INTEGER", null, false));
            map28.put("momentImageUrl_CommentReply", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentReply", "TEXT", null, false));
            map28.put("momentContent_CommentReply", new TableInfo.OooO00o(0, 1, "momentContent_CommentReply", "TEXT", null, false));
            map28.put("commentId_CommentReply", new TableInfo.OooO00o(0, 1, "commentId_CommentReply", "INTEGER", null, false));
            map28.put("commentContent_CommentReply", new TableInfo.OooO00o(0, 1, "commentContent_CommentReply", "TEXT", null, false));
            map28.put("replyId_CommentReply", new TableInfo.OooO00o(0, 1, "replyId_CommentReply", "INTEGER", null, false));
            map28.put("replyContent_CommentReply", new TableInfo.OooO00o(0, 1, "replyContent_CommentReply", "TEXT", null, false));
            map28.put("userId_MomentAt", new TableInfo.OooO00o(0, 1, "userId_MomentAt", "INTEGER", null, false));
            map28.put("userNickName_MomentAt", new TableInfo.OooO00o(0, 1, "userNickName_MomentAt", "TEXT", null, false));
            map28.put("userHeadUrl_MomentAt", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentAt", "TEXT", null, false));
            map28.put("momentId_MomentAt", new TableInfo.OooO00o(0, 1, "momentId_MomentAt", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentAt", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentAt", "TEXT", null, false));
            map28.put("momentContent_MomentAt", new TableInfo.OooO00o(0, 1, "momentContent_MomentAt", "TEXT", null, false));
            map28.put("userId_CommentAt", new TableInfo.OooO00o(0, 1, "userId_CommentAt", "INTEGER", null, false));
            map28.put("userNickName_CommentAt", new TableInfo.OooO00o(0, 1, "userNickName_CommentAt", "TEXT", null, false));
            map28.put("userHeadUrl_CommentAt", new TableInfo.OooO00o(0, 1, "userHeadUrl_CommentAt", "TEXT", null, false));
            map28.put("momentId_CommentAt", new TableInfo.OooO00o(0, 1, "momentId_CommentAt", "INTEGER", null, false));
            map28.put("momentImageUrl_CommentAt", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentAt", "TEXT", null, false));
            map28.put("momentContent_CommentAt", new TableInfo.OooO00o(0, 1, "momentContent_CommentAt", "TEXT", null, false));
            map28.put("commentId_CommentAt", new TableInfo.OooO00o(0, 1, "commentId_CommentAt", "INTEGER", null, false));
            map28.put("commentContent_CommentAt", new TableInfo.OooO00o(0, 1, "commentContent_CommentAt", "TEXT", null, false));
            map28.put("userId_MomentGift", new TableInfo.OooO00o(0, 1, "userId_MomentGift", "INTEGER", null, false));
            map28.put("userNickName_MomentGift", new TableInfo.OooO00o(0, 1, "userNickName_MomentGift", "TEXT", null, false));
            map28.put("userHeadUrl_MomentGift", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentGift", "TEXT", null, false));
            map28.put("momentId_MomentGift", new TableInfo.OooO00o(0, 1, "momentId_MomentGift", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentGift", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentGift", "TEXT", null, false));
            map28.put("giftNum_MomentGift", new TableInfo.OooO00o(0, 1, "giftNum_MomentGift", "INTEGER", null, false));
            map28.put("giftImage_MomentGift", new TableInfo.OooO00o(0, 1, "giftImage_MomentGift", "TEXT", null, false));
            map28.put("userId_CommentReward", new TableInfo.OooO00o(0, 1, "userId_CommentReward", "INTEGER", null, false));
            map28.put("userNickName_CommentReward", new TableInfo.OooO00o(0, 1, "userNickName_CommentReward", "TEXT", null, false));
            map28.put("userHeadUrl_CommentReward", new TableInfo.OooO00o(0, 1, "userHeadUrl_CommentReward", "TEXT", null, false));
            map28.put("momentId_CommentReward", new TableInfo.OooO00o(0, 1, "momentId_CommentReward", "INTEGER", null, false));
            map28.put("momentImageUrl_CommentReward", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentReward", "TEXT", null, false));
            map28.put("commentId_CommentReward", new TableInfo.OooO00o(0, 1, "commentId_CommentReward", "INTEGER", null, false));
            map28.put("commentContent_CommentReward", new TableInfo.OooO00o(0, 1, "commentContent_CommentReward", "TEXT", null, false));
            map28.put("userId_ReplyReward", new TableInfo.OooO00o(0, 1, "userId_ReplyReward", "INTEGER", null, false));
            map28.put("userNickName_ReplyReward", new TableInfo.OooO00o(0, 1, "userNickName_ReplyReward", "TEXT", null, false));
            map28.put("userHeadUrl_ReplyReward", new TableInfo.OooO00o(0, 1, "userHeadUrl_ReplyReward", "TEXT", null, false));
            map28.put("momentId_ReplyReward", new TableInfo.OooO00o(0, 1, "momentId_ReplyReward", "INTEGER", null, false));
            map28.put("momentImageUrl_ReplyReward", new TableInfo.OooO00o(0, 1, "momentImageUrl_ReplyReward", "TEXT", null, false));
            map28.put("commentId_ReplyReward", new TableInfo.OooO00o(0, 1, "commentId_ReplyReward", "INTEGER", null, false));
            map28.put("commentContent_ReplyReward", new TableInfo.OooO00o(0, 1, "commentContent_ReplyReward", "TEXT", null, false));
            map28.put("momentId_MomentFeatured", new TableInfo.OooO00o(0, 1, "momentId_MomentFeatured", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentFeatured", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentFeatured", "TEXT", null, false));
            map28.put("momentId_CommentFeatured", new TableInfo.OooO00o(0, 1, "momentId_CommentFeatured", "INTEGER", null, false));
            map28.put("momentImageUrl_CommentFeatured", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentFeatured", "TEXT", null, false));
            map28.put("momentContent_CommentFeatured", new TableInfo.OooO00o(0, 1, "momentContent_CommentFeatured", "TEXT", null, false));
            map28.put("commentId_CommentFeatured", new TableInfo.OooO00o(0, 1, "commentId_CommentFeatured", "INTEGER", null, false));
            map28.put("userId_MomentTopicTop", new TableInfo.OooO00o(0, 1, "userId_MomentTopicTop", "INTEGER", null, false));
            map28.put("userHeadUrl_MomentTopicTop", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentTopicTop", "TEXT", null, false));
            map28.put("momentImageUrl_MomentTopicTop", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentTopicTop", "TEXT", null, false));
            map28.put("topicId_MomentTopicTop", new TableInfo.OooO00o(0, 1, "topicId_MomentTopicTop", "INTEGER", null, false));
            map28.put("topicName_MomentTopicTop", new TableInfo.OooO00o(0, 1, "topicName_MomentTopicTop", "TEXT", null, false));
            map28.put("userId_MomentTopicTopRevoke", new TableInfo.OooO00o(0, 1, "userId_MomentTopicTopRevoke", "INTEGER", null, false));
            map28.put("userHeadUrl_MomentTopicTopRevoke", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentTopicTopRevoke", "TEXT", null, false));
            map28.put("momentImageUrl_MomentTopicTopRevoke", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentTopicTopRevoke", "TEXT", null, false));
            map28.put("topicId_MomentTopicTopRevoke", new TableInfo.OooO00o(0, 1, "topicId_MomentTopicTopRevoke", "INTEGER", null, false));
            map28.put("topicName_MomentTopicTopRevoke", new TableInfo.OooO00o(0, 1, "topicName_MomentTopicTopRevoke", "TEXT", null, false));
            map28.put("userId_MomentTopicRemoveOwner", new TableInfo.OooO00o(0, 1, "userId_MomentTopicRemoveOwner", "INTEGER", null, false));
            map28.put("userHeadUrl_MomentTopicRemoveOwner", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentTopicRemoveOwner", "TEXT", null, false));
            map28.put("momentImageUrl_MomentTopicRemoveOwner", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentTopicRemoveOwner", "TEXT", null, false));
            map28.put("momentId_MomentTopicRemoveOwner", new TableInfo.OooO00o(0, 1, "momentId_MomentTopicRemoveOwner", "INTEGER", null, false));
            map28.put("topicName_MomentTopicRemoveOwner", new TableInfo.OooO00o(0, 1, "topicName_MomentTopicRemoveOwner", "TEXT", null, false));
            map28.put("userId_MomentTopicRemoveAdmin", new TableInfo.OooO00o(0, 1, "userId_MomentTopicRemoveAdmin", "INTEGER", null, false));
            map28.put("userHeadUrl_MomentTopicRemoveAdmin", new TableInfo.OooO00o(0, 1, "userHeadUrl_MomentTopicRemoveAdmin", "TEXT", null, false));
            map28.put("momentImageUrl_MomentTopicRemoveAdmin", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentTopicRemoveAdmin", "TEXT", null, false));
            map28.put("momentId_MomentTopicRemoveAdmin", new TableInfo.OooO00o(0, 1, "momentId_MomentTopicRemoveAdmin", "INTEGER", null, false));
            map28.put("topicName_MomentTopicRemoveAdmin", new TableInfo.OooO00o(0, 1, "topicName_MomentTopicRemoveAdmin", "TEXT", null, false));
            map28.put("userId_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "userId_TopicGroupCreateSuccessNotice", "INTEGER", null, false));
            map28.put("nickName_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "nickName_TopicGroupCreateSuccessNotice", "TEXT", null, false));
            map28.put("headUrl_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "headUrl_TopicGroupCreateSuccessNotice", "TEXT", null, false));
            map28.put("circleId_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "circleId_TopicGroupCreateSuccessNotice", "INTEGER", null, false));
            map28.put("circleName_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "circleName_TopicGroupCreateSuccessNotice", "TEXT", null, false));
            map28.put("circleHead_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "circleHead_TopicGroupCreateSuccessNotice", "TEXT", null, false));
            map28.put("type_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "type_TopicGroupCreateSuccessNotice", "INTEGER", null, false));
            map28.put("groupOpenId_TopicGroupCreateSuccessNotice", new TableInfo.OooO00o(0, 1, "groupOpenId_TopicGroupCreateSuccessNotice", "TEXT", null, false));
            map28.put("userId_TopicGroupCreateOrJoinResult", new TableInfo.OooO00o(0, 1, "userId_TopicGroupCreateOrJoinResult", "INTEGER", null, false));
            map28.put("circleId_TopicGroupCreateOrJoinResult", new TableInfo.OooO00o(0, 1, "circleId_TopicGroupCreateOrJoinResult", "INTEGER", null, false));
            map28.put("type_TopicGroupCreateOrJoinResult", new TableInfo.OooO00o(0, 1, "type_TopicGroupCreateOrJoinResult", "INTEGER", null, false));
            map28.put("momentId_MomentSystemRemove", new TableInfo.OooO00o(0, 1, "momentId_MomentSystemRemove", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentSystemRemove", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentSystemRemove", "TEXT", null, false));
            map28.put("deleteType_MomentSystemRemove", new TableInfo.OooO00o(0, 1, "deleteType_MomentSystemRemove", "INTEGER", null, false));
            map28.put("commentId_CommentSystemRemove", new TableInfo.OooO00o(0, 1, "commentId_CommentSystemRemove", "INTEGER", null, false));
            map28.put("commentContent_CommentSystemRemove", new TableInfo.OooO00o(0, 1, "commentContent_CommentSystemRemove", "TEXT", null, false));
            map28.put("deleteType_CommentSystemRemove", new TableInfo.OooO00o(0, 1, "deleteType_CommentSystemRemove", "INTEGER", null, false));
            map28.put("deleteContent_CommentSystemRemove", new TableInfo.OooO00o(0, 1, "deleteContent_CommentSystemRemove", "TEXT", null, false));
            map28.put("momentId_MomentReportFeedback", new TableInfo.OooO00o(0, 1, "momentId_MomentReportFeedback", "INTEGER", null, false));
            map28.put("momentImageUrl_MomentReportFeedback", new TableInfo.OooO00o(0, 1, "momentImageUrl_MomentReportFeedback", "TEXT", null, false));
            map28.put("momentContent_MomentReportFeedback", new TableInfo.OooO00o(0, 1, "momentContent_MomentReportFeedback", "TEXT", null, false));
            map28.put("momentTitle_MomentReportFeedback", new TableInfo.OooO00o(0, 1, "momentTitle_MomentReportFeedback", "TEXT", null, false));
            map28.put("commentId_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "commentId_CommentReportFeedback", "INTEGER", null, false));
            map28.put("commentContent_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "commentContent_CommentReportFeedback", "TEXT", null, false));
            map28.put("momentImageUrl_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "momentImageUrl_CommentReportFeedback", "TEXT", null, false));
            map28.put("commentTitle_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "commentTitle_CommentReportFeedback", "TEXT", null, false));
            map28.put("commentCommentId_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "commentCommentId_CommentReportFeedback", "INTEGER", null, false));
            map28.put("commentCommentContent_CommentReportFeedback", new TableInfo.OooO00o(0, 1, "commentCommentContent_CommentReportFeedback", "TEXT", null, false));
            map28.put("circleId_CircleReportFeedback", new TableInfo.OooO00o(0, 1, "circleId_CircleReportFeedback", "INTEGER", null, false));
            map28.put("circleContent_CircleReportFeedback", new TableInfo.OooO00o(0, 1, "circleContent_CircleReportFeedback", "TEXT", null, false));
            map28.put("circleImageUrl_CircleReportFeedback", new TableInfo.OooO00o(0, 1, "circleImageUrl_CircleReportFeedback", "TEXT", null, false));
            map28.put("circleTitle_CircleReportFeedback", new TableInfo.OooO00o(0, 1, "circleTitle_CircleReportFeedback", "TEXT", null, false));
            map28.put("topicUserId_TopicCreateSuccess", new TableInfo.OooO00o(0, 1, "topicUserId_TopicCreateSuccess", "INTEGER", null, false));
            map28.put("topicId_TopicCreateSuccess", new TableInfo.OooO00o(0, 1, "topicId_TopicCreateSuccess", "INTEGER", null, false));
            map28.put("topicName_TopicCreateSuccess", new TableInfo.OooO00o(0, 1, "topicName_TopicCreateSuccess", "TEXT", null, false));
            map28.put("message_TopicCreateSuccess", new TableInfo.OooO00o(0, 1, "message_TopicCreateSuccess", "TEXT", null, false));
            map28.put("topicUserId_TopicCreateFail", new TableInfo.OooO00o(0, 1, "topicUserId_TopicCreateFail", "INTEGER", null, false));
            map28.put("topicId_TopicCreateFail", new TableInfo.OooO00o(0, 1, "topicId_TopicCreateFail", "INTEGER", null, false));
            map28.put("topicName_TopicCreateFail", new TableInfo.OooO00o(0, 1, "topicName_TopicCreateFail", "TEXT", null, false));
            map28.put("message_TopicCreateFail", new TableInfo.OooO00o(0, 1, "message_TopicCreateFail", "TEXT", null, false));
            map28.put("failType_TopicCreateFail", new TableInfo.OooO00o(0, 1, "failType_TopicCreateFail", "INTEGER", null, false));
            map28.put("topicUserId_TopicCreateDisband", new TableInfo.OooO00o(0, 1, "topicUserId_TopicCreateDisband", "INTEGER", null, false));
            map28.put("topicId_TopicCreateDisband", new TableInfo.OooO00o(0, 1, "topicId_TopicCreateDisband", "INTEGER", null, false));
            map28.put("topicName_TopicCreateDisband", new TableInfo.OooO00o(0, 1, "topicName_TopicCreateDisband", "TEXT", null, false));
            map28.put("message_TopicCreateDisband", new TableInfo.OooO00o(0, 1, "message_TopicCreateDisband", "TEXT", null, false));
            map28.put("disbandContent_TopicCreateDisband", new TableInfo.OooO00o(0, 1, "disbandContent_TopicCreateDisband", "INTEGER", null, false));
            map28.put("topicId_TopicMemberAdd", new TableInfo.OooO00o(0, 1, "topicId_TopicMemberAdd", "INTEGER", null, false));
            HashSet hashSetOooO0OO26 = o0OoOo0.OooO0OO(map28, "content_TopicMemberAdd", new TableInfo.OooO00o(0, 1, "content_TopicMemberAdd", "TEXT", null, false), 0);
            HashSet hashSet26 = new HashSet(1);
            hashSet26.add(new TableInfo.OooO0o("index_MomentMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo28 = new TableInfo("MomentMessageTable", map28, hashSetOooO0OO26, hashSet26);
            TableInfo tableInfoOooO00o28 = TableInfo.OooO00o(supportSQLiteDatabase, "MomentMessageTable");
            if (!tableInfo28.equals(tableInfoOooO00o28)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("MomentMessageTable(com.yalla.yalla.data.db.table.MomentMessage).\n Expected:\n", tableInfo28, "\n Found:\n", tableInfoOooO00o28));
            }
            HashMap map29 = new HashMap(15);
            map29.put(AccessToken.USER_ID_KEY, new TableInfo.OooO00o(0, 1, AccessToken.USER_ID_KEY, "INTEGER", null, true));
            map29.put("order_id", new TableInfo.OooO00o(1, 1, "order_id", "TEXT", null, true));
            map29.put("sku", new TableInfo.OooO00o(0, 1, "sku", "TEXT", null, true));
            map29.put("amount", new TableInfo.OooO00o(0, 1, "amount", "REAL", null, false));
            map29.put("type", new TableInfo.OooO00o(0, 1, "type", "INTEGER", null, true));
            map29.put("purchase_token", new TableInfo.OooO00o(0, 1, "purchase_token", "TEXT", null, true));
            map29.put("huaWeiAccountFlag", new TableInfo.OooO00o(0, 1, "huaWeiAccountFlag", "INTEGER", null, true));
            map29.put("isConsume", new TableInfo.OooO00o(0, 1, "isConsume", "INTEGER", null, true));
            map29.put("purchaseState", new TableInfo.OooO00o(0, 1, "purchaseState", "INTEGER", null, true));
            map29.put("isAcknowledged", new TableInfo.OooO00o(0, 1, "isAcknowledged", "INTEGER", null, true));
            map29.put("isSubscription", new TableInfo.OooO00o(0, 1, "isSubscription", "INTEGER", null, true));
            map29.put("subscriptionState", new TableInfo.OooO00o(0, 1, "subscriptionState", "INTEGER", null, true));
            map29.put("subscriptionId", new TableInfo.OooO00o(0, 1, "subscriptionId", "TEXT", null, true));
            map29.put("subscriptionOrderId", new TableInfo.OooO00o(0, 1, "subscriptionOrderId", "TEXT", null, true));
            HashSet hashSetOooO0OO27 = o0OoOo0.OooO0OO(map29, "createTime", new TableInfo.OooO00o(0, 1, "createTime", "INTEGER", null, true), 0);
            HashSet hashSet27 = new HashSet(1);
            hashSet27.add(new TableInfo.OooO0o("index_PayOrderTable_order_id", true, Arrays.asList("order_id"), Arrays.asList("ASC")));
            TableInfo tableInfo29 = new TableInfo("PayOrderTable", map29, hashSetOooO0OO27, hashSet27);
            TableInfo tableInfoOooO00o29 = TableInfo.OooO00o(supportSQLiteDatabase, "PayOrderTable");
            if (!tableInfo29.equals(tableInfoOooO00o29)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("PayOrderTable(com.yalla.yalla.data.db.table.PayOrder).\n Expected:\n", tableInfo29, "\n Found:\n", tableInfoOooO00o29));
            }
            HashMap map30 = new HashMap(5);
            map30.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map30.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map30.put("targetId", new TableInfo.OooO00o(0, 1, "targetId", "INTEGER", null, true));
            map30.put(ContributionFragment.ARG_1, new TableInfo.OooO00o(0, 1, ContributionFragment.ARG_1, "INTEGER", null, true));
            HashSet hashSetOooO0OO28 = o0OoOo0.OooO0OO(map30, "eventCreateTime", new TableInfo.OooO00o(0, 1, "eventCreateTime", "INTEGER", null, true), 0);
            HashSet hashSet28 = new HashSet(1);
            hashSet28.add(new TableInfo.OooO0o("index_SquareEventRoomTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo30 = new TableInfo("SquareEventRoomTable", map30, hashSetOooO0OO28, hashSet28);
            TableInfo tableInfoOooO00o30 = TableInfo.OooO00o(supportSQLiteDatabase, "SquareEventRoomTable");
            if (!tableInfo30.equals(tableInfoOooO00o30)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("SquareEventRoomTable(com.yalla.yalla.data.db.table.SquareEventRoom).\n Expected:\n", tableInfo30, "\n Found:\n", tableInfoOooO00o30));
            }
            HashMap map31 = new HashMap(18);
            map31.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map31.put("device_brand", new TableInfo.OooO00o(0, 1, "device_brand", "TEXT", null, false));
            map31.put("os_version", new TableInfo.OooO00o(0, 1, "os_version", "TEXT", null, false));
            map31.put("carrier", new TableInfo.OooO00o(0, 1, "carrier", "TEXT", null, false));
            map31.put("device_model", new TableInfo.OooO00o(0, 1, "device_model", "TEXT", null, false));
            map31.put("app_version", new TableInfo.OooO00o(0, 1, "app_version", "TEXT", null, false));
            map31.put("app_channel", new TableInfo.OooO00o(0, 1, "app_channel", "TEXT", null, false));
            map31.put("ip", new TableInfo.OooO00o(0, 1, "ip", "TEXT", null, false));
            map31.put("device_id", new TableInfo.OooO00o(0, 1, "device_id", "TEXT", null, false));
            map31.put("session_id", new TableInfo.OooO00o(0, 1, "session_id", "TEXT", null, false));
            map31.put("os", new TableInfo.OooO00o(0, 1, "os", "INTEGER", null, true));
            map31.put(AccessToken.USER_ID_KEY, new TableInfo.OooO00o(0, 1, AccessToken.USER_ID_KEY, "TEXT", null, false));
            map31.put("event_id", new TableInfo.OooO00o(0, 1, "event_id", "TEXT", null, false));
            map31.put("event_type", new TableInfo.OooO00o(0, 1, "event_type", "INTEGER", null, true));
            map31.put("url", new TableInfo.OooO00o(0, 1, "url", "TEXT", null, false));
            map31.put("event_time", new TableInfo.OooO00o(0, 1, "event_time", "INTEGER", null, true));
            map31.put("room_id", new TableInfo.OooO00o(0, 1, "room_id", "INTEGER", null, false));
            TableInfo tableInfo31 = new TableInfo("BuriedPointTable", map31, o0OoOo0.OooO0OO(map31, "ext_info", new TableInfo.OooO00o(0, 1, "ext_info", "TEXT", null, false), 0), new HashSet(0));
            TableInfo tableInfoOooO00o31 = TableInfo.OooO00o(supportSQLiteDatabase, "BuriedPointTable");
            if (!tableInfo31.equals(tableInfoOooO00o31)) {
                return new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("BuriedPointTable(com.yalla.yalla.data.db.model.BuriedPoint).\n Expected:\n", tableInfo31, "\n Found:\n", tableInfoOooO00o31));
            }
            HashMap map32 = new HashMap(3);
            map32.put("userId", new TableInfo.OooO00o(1, 1, "userId", "INTEGER", null, true));
            map32.put("contentId", new TableInfo.OooO00o(3, 1, "contentId", "TEXT", null, true));
            HashSet hashSetOooO0OO29 = o0OoOo0.OooO0OO(map32, "type", new TableInfo.OooO00o(2, 1, "type", "INTEGER", null, true), 0);
            HashSet hashSet29 = new HashSet(1);
            hashSet29.add(new TableInfo.OooO0o("index_HideContentTable_userId_type_contentId", true, Arrays.asList("userId", "type", "contentId"), Arrays.asList("ASC", "ASC", "ASC")));
            TableInfo tableInfo32 = new TableInfo("HideContentTable", map32, hashSetOooO0OO29, hashSet29);
            TableInfo tableInfoOooO00o32 = TableInfo.OooO00o(supportSQLiteDatabase, "HideContentTable");
            return !tableInfo32.equals(tableInfoOooO00o32) ? new o0000OO0.OooO0O0(false, o000oOoO.OooO00o("HideContentTable(com.yalla.yalla.data.db.table.HideContent).\n Expected:\n", tableInfo32, "\n Found:\n", tableInfoOooO00o32)) : new o0000OO0.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> OooO() {
        HashMap map = new HashMap();
        map.put(o.class, Collections.emptyList());
        map.put(o000OOo.class, Collections.emptyList());
        map.put(o00O00OO.class, Collections.emptyList());
        map.put(oo00oO.class, Collections.emptyList());
        map.put(o0O0OOO0.class, Collections.emptyList());
        map.put(o0O000.class, Collections.emptyList());
        map.put(o0O000O.class, Collections.emptyList());
        map.put(o0O00OOO.class, Collections.emptyList());
        map.put(o0O0O0O.class, Collections.emptyList());
        map.put(o0O0O0Oo.class, Collections.emptyList());
        map.put(p407o0Oo0Oo.OooO.class, Collections.emptyList());
        map.put(o0O00O0o.class, Collections.emptyList());
        map.put(o0OOO0OO.class, Collections.emptyList());
        map.put(OooOo00.class, Collections.emptyList());
        map.put(o0o0000.class, Collections.emptyList());
        map.put(p407o0Oo0Oo.o0000OO0.class, Collections.emptyList());
        map.put(o000000.class, Collections.emptyList());
        map.put(Oooo000.class, Collections.emptyList());
        map.put(oO00000.class, Collections.emptyList());
        map.put(o0OO0o00.class, Collections.emptyList());
        map.put(o00.class, Collections.emptyList());
        map.put(o000.class, Collections.emptyList());
        map.put(o0O.class, Collections.emptyList());
        map.put(o00O0OOO.class, Collections.emptyList());
        map.put(o0OoOoOo.class, Collections.emptyList());
        map.put(o0OO00o0.class, Collections.emptyList());
        map.put(OooOo.class, Collections.emptyList());
        map.put(o00O0OO0.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public final o000000O OooO0Oo() {
        return new o000000O(this, new HashMap(0), new HashMap(0), "MessageRecord", "ChatMessage", "UserRecord", "SystemMessage", "CommentNotice", "FriendsTable", "NewFriendsTable", "NewFans", "NewVisitor", "DraftMessageTable", "MusicTable", "SearchHistoryTable", "RoomHistory", "RoomJoinHistory", "RoomTheme", "ApiErrorCodeDB", "ReadPostTable", "TopicRecentTable", "BillingOrder", "UserInfoTable", "ConversationTable", "ChatMessageTable", "YallaTeamMessageTable", "SystemMessageTable", "FriendTable", "FriendRequestMessageTable", "SimpleMessageTable", "MomentMessageTable", "PayOrderTable", "SquareEventRoomTable", "BuriedPointTable", "HideContentTable");
    }

    @Override // androidx.room.RoomDatabase
    public final List OooO0o(@NonNull LinkedHashMap linkedHashMap) {
        return Arrays.asList(new p109o000ooo.o00O0OO0[0]);
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(o0ooOOo o0ooooo) {
        o0000OO0 callback = new o0000OO0(o0ooooo, new OooO00o(), "90059d6bc2a40062e3120370c0bcf2af", "5e6b6dd674e1b7df0bd3275b9ee14cef");
        Context context = o0ooooo.f35953OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = o0ooooo.f35954OooO0O0;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return o0ooooo.f35955OooO0OO.create(new SupportSQLiteOpenHelper.Configuration(context, str, callback, false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends oo00o.OooO0O0>> OooO0oo() {
        return new HashSet();
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final p407o0Oo0Oo.OooO OooOOOo() {
        OooOOOO oooOOOO;
        if (this.f22343OooOOoo != null) {
            return this.f22343OooOOoo;
        }
        synchronized (this) {
            if (this.f22343OooOOoo == null) {
                this.f22343OooOOoo = new OooOOOO(this);
            }
            oooOOOO = this.f22343OooOOoo;
        }
        return oooOOOO;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o000000 OooOOo() {
        o00000 o00000Var;
        if (this.f22348OooOo0o != null) {
            return this.f22348OooOo0o;
        }
        synchronized (this) {
            if (this.f22348OooOo0o == null) {
                this.f22348OooOo0o = new o00000(this);
            }
            o00000Var = this.f22348OooOo0o;
        }
        return o00000Var;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final Oooo000 OooOOo0() {
        o0O0O00 o0o0o00;
        if (this.f22344OooOo != null) {
            return this.f22344OooOo;
        }
        synchronized (this) {
            if (this.f22344OooOo == null) {
                this.f22344OooOo = new o0O0O00(this);
            }
            o0o0o00 = this.f22344OooOo;
        }
        return o0o0o00;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o000 OooOOoo() {
        o000O000 o000o001;
        if (this.f22353OooOoo0 != null) {
            return this.f22353OooOoo0;
        }
        synchronized (this) {
            if (this.f22353OooOoo0 == null) {
                this.f22353OooOoo0 = new o000O000(this);
            }
            o000o001 = this.f22353OooOoo0;
        }
        return o000o001;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00O0OOO OooOo() {
        o00OO0O0 o00oo0o1;
        if (this.f22354OooOooO != null) {
            return this.f22354OooOooO;
        }
        synchronized (this) {
            if (this.f22354OooOooO == null) {
                this.f22354OooOooO = new o00OO0O0(this);
            }
            o00oo0o1 = this.f22354OooOooO;
        }
        return o00oo0o1;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00O00OO OooOo0() {
        o00O0O0O o00o0o0o2;
        if (this.f22338OooOOO0 != null) {
            return this.f22338OooOOO0;
        }
        synchronized (this) {
            if (this.f22338OooOOO0 == null) {
                this.f22338OooOOO0 = new o00O0O0O(this);
            }
            o00o0o0o2 = this.f22338OooOOO0;
        }
        return o00o0o0o2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00 OooOo00() {
        o00O0000 o00o0001;
        if (this.f22351OooOoOO != null) {
            return this.f22351OooOoOO;
        }
        synchronized (this) {
            if (this.f22351OooOoOO == null) {
                this.f22351OooOoOO = new o00O0000(this);
            }
            o00o0001 = this.f22351OooOoOO;
        }
        return o00o0001;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OO00o0 OooOo0O() {
        o0OOooO0 o0ooooo0;
        if (this.f22356Oooo000 != null) {
            return this.f22356Oooo000;
        }
        synchronized (this) {
            if (this.f22356Oooo000 == null) {
                this.f22356Oooo000 = new o0OOooO0(this);
            }
            o0ooooo0 = this.f22356Oooo000;
        }
        return o0ooooo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00O0OO0 OooOo0o() {
        o00O0OO o00o0oo2;
        if (this.f22357Oooo00O != null) {
            return this.f22357Oooo00O;
        }
        synchronized (this) {
            if (this.f22357Oooo00O == null) {
                this.f22357Oooo00O = new o00O0OO(this);
            }
            o00o0oo2 = this.f22357Oooo00O;
        }
        return o00o0oo2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OoOoOo OooOoO() {
        o0OoO00O o0ooo00o2;
        if (this.f22355OooOooo != null) {
            return this.f22355OooOooo;
        }
        synchronized (this) {
            if (this.f22355OooOooo == null) {
                this.f22355OooOooo = new o0OoO00O(this);
            }
            o0ooo00o2 = this.f22355OooOooo;
        }
        return o0ooo00o2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oo00oO OooOoO0() {
        o0O0000O o0o0000o2;
        if (this.f22337OooOOO != null) {
            return this.f22337OooOOO;
        }
        synchronized (this) {
            if (this.f22337OooOOO == null) {
                this.f22337OooOOO = new o0O0000O(this);
            }
            o0o0000o2 = this.f22337OooOOO;
        }
        return o0o0000o2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O00O0o OooOoOO() {
        o0O00OO o0o00oo2;
        if (this.f22346OooOo00 != null) {
            return this.f22346OooOo00;
        }
        synchronized (this) {
            if (this.f22346OooOo00 == null) {
                this.f22346OooOo00 = new o0O00OO(this);
            }
            o0o00oo2 = this.f22346OooOo00;
        }
        return o0o00oo2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O0O0O OooOoo() {
        o0O0oo0o o0o0oo0o;
        if (this.f22342OooOOo0 != null) {
            return this.f22342OooOOo0;
        }
        synchronized (this) {
            if (this.f22342OooOOo0 == null) {
                this.f22342OooOOo0 = new o0O0oo0o(this);
            }
            o0o0oo0o = this.f22342OooOOo0;
        }
        return o0o0oo0o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O00OOO OooOoo0() {
        o0O00oO0 o0o00oo1;
        if (this.f22340OooOOOo != null) {
            return this.f22340OooOOOo;
        }
        synchronized (this) {
            if (this.f22340OooOOOo == null) {
                this.f22340OooOOOo = new o0O00oO0(this);
            }
            o0o00oo1 = this.f22340OooOOOo;
        }
        return o0o00oo1;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O0O0Oo OooOooO() {
        o0O0OO0 o0o0oo0;
        if (this.f22341OooOOo != null) {
            return this.f22341OooOOo;
        }
        synchronized (this) {
            if (this.f22341OooOOo == null) {
                this.f22341OooOOo = new o0O0OO0(this);
            }
            o0o0oo0 = this.f22341OooOOo;
        }
        return o0o0oo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O0OOO0 OooOooo() {
        o0O0oo00 o0o0oo00;
        if (this.f22339OooOOOO != null) {
            return this.f22339OooOOOO;
        }
        synchronized (this) {
            if (this.f22339OooOOOO == null) {
                this.f22339OooOOOO = new o0O0oo00(this);
            }
            o0o0oo00 = this.f22339OooOOOO;
        }
        return o0o0oo00;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0o0000 Oooo0() {
        ooo0Oo0 ooo0oo0;
        if (this.f22347OooOo0O != null) {
            return this.f22347OooOo0O;
        }
        synchronized (this) {
            if (this.f22347OooOo0O == null) {
                this.f22347OooOo0O = new ooo0Oo0(this);
            }
            ooo0oo0 = this.f22347OooOo0O;
        }
        return ooo0oo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O Oooo000() {
        o0OO00OO o0oo00oo2;
        if (this.f22352OooOoo != null) {
            return this.f22352OooOoo;
        }
        synchronized (this) {
            if (this.f22352OooOoo == null) {
                this.f22352OooOoo = new o0OO00OO(this);
            }
            o0oo00oo2 = this.f22352OooOoo;
        }
        return o0oo00oo2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OO0o00 Oooo00O() {
        o0OOO0 o0ooo1;
        if (this.f22349OooOoO != null) {
            return this.f22349OooOoO;
        }
        synchronized (this) {
            if (this.f22349OooOoO == null) {
                this.f22349OooOoO = new o0OOO0(this);
            }
            o0ooo1 = this.f22349OooOoO;
        }
        return o0ooo1;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OOO0OO Oooo00o() {
        o0OOo000 o0ooo001;
        if (this.f22345OooOo0 != null) {
            return this.f22345OooOo0;
        }
        synchronized (this) {
            if (this.f22345OooOo0 == null) {
                this.f22345OooOo0 = new o0OOo000(this);
            }
            o0ooo001 = this.f22345OooOo0;
        }
        return o0ooo001;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO00000 Oooo0O0() {
        oO0000o0 oo0000o0;
        if (this.f22350OooOoO0 != null) {
            return this.f22350OooOoO0;
        }
        synchronized (this) {
            if (this.f22350OooOoO0 == null) {
                this.f22350OooOoO0 = new oO0000o0(this);
            }
            oo0000o0 = this.f22350OooOoO0;
        }
        return oo0000o0;
    }
}
