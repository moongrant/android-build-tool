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
import o000O.OooO0O0;
import o000O0O0.OooO;
import o000O0O0.OooOo;
import o000O0O0.o0Oo0oo;
import p071o000O0o0.o00000O0;
import p085o000OooO.o00Oo0;
import p085o000OooO.o00oO0o;
import p085o000OooO.oo000o;
import p403o0Oo0OOo.o00O00OO;
import p403o0Oo0OOo.o00O0O0;
import p403o0Oo0OOo.o00O0O0O;
import p403o0Oo0OOo.o00O0OO0;
import p403o0Oo0OOo.o00OOOO0;
import p403o0Oo0OOo.o00OOOOo;
import p403o0Oo0OOo.o0O00;
import p403o0Oo0OOo.o0O000o0;
import p403o0Oo0OOo.o0O0O0o0;
import p403o0Oo0OOo.o0O0OO0;
import p403o0Oo0OOo.o0O0oo00;
import p403o0Oo0OOo.o0OO00OO;
import p403o0Oo0OOo.o0OO00o0;
import p403o0Oo0OOo.o0OO0O0;
import p403o0Oo0OOo.o0OOO00;
import p403o0Oo0OOo.o0OOooO0;
import p403o0Oo0OOo.o0OoO00O;
import p403o0Oo0OOo.o0o0Oo;
import p403o0Oo0OOo.o0oOO;
import p403o0Oo0OOo.oO0;
import p403o0Oo0OOo.oO0000O;
import p403o0Oo0OOo.oO000O0O;
import p403o0Oo0OOo.oO000Oo0;
import p403o0Oo0OOo.oO000o00;
import p403o0Oo0OOo.oO00O0oO;
import p403o0Oo0OOo.oO00OOO;
import p403o0Oo0OOo.oO00OOOo;
import p403o0Oo0OOo.oO00Oo0;
import p403o0Oo0OOo.oO00Oo00;
import p403o0Oo0OOo.oO0O000;
import p403o0Oo0OOo.oO0O00O;
import p403o0Oo0OOo.oO0O00o0;
import p403o0Oo0OOo.oO0O0Oo0;
import p403o0Oo0OOo.oO0O0OoO;
import p403o0Oo0OOo.oO0OOo0o;
import p403o0Oo0OOo.oO0Oo0o0;
import p403o0Oo0OOo.oO0OoOO0;
import p403o0Oo0OOo.oO0Ooooo;
import p403o0Oo0OOo.oO0o0000;
import p403o0Oo0OOo.oO0o0o;
import p403o0Oo0OOo.oO0oO000;
import p403o0Oo0OOo.oOO0000;
import p403o0Oo0OOo.oOo00OO0;
import p403o0Oo0OOo.oOo00o0o;
import p403o0Oo0OOo.oOo00ooO;
import p403o0Oo0OOo.oOo0oooO;
import p403o0Oo0OOo.oo0o0O0;
import p403o0Oo0OOo.ooOOO00O;
import p403o0Oo0OOo.ooo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class YlAppDataBase_Impl extends YlAppDataBase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile oO000O0O f22810OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile o0OO00OO f22811OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile oOo00o0o f22812OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile oOo00OO0 f22813OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile oO00Oo00 f22814OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile oO00OOO f22815OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile o00O0O0 f22816OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile o0o0Oo f22817OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile ooOOO00O f22818OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile oO000o00 f22819OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public volatile oO0Oo0o0 f22820OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile o0oOO f22821OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile oOo0oooO f22822OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile oOO0000 f22823OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile o0O0OO0 f22824OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile oO0 f22825OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile o0OoO00O f22826OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile o0OOO00 f22827OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile oO0OOo0o f22828OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile oO0O00O f22829Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile o0OO0O0 f22830Oooo00O;

    public class OooO00o extends o0Oo0oo.OooO00o {
        public OooO00o() {
            super(47);
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MessageRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `title` TEXT, `message` TEXT, `type` INTEGER NOT NULL, `headphoto` TEXT, `scount` INTEGER NOT NULL, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `level` INTEGER NOT NULL, `isTop` INTEGER NOT NULL, `isTopTime` INTEGER NOT NULL, `dtime` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `status` INTEGER NOT NULL, `isread` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MessageRecord_midx_fromid` ON `MessageRecord` (`midx`, `fromid`)", "CREATE TABLE IF NOT EXISTS `ChatMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `msg` TEXT, `time` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `giftid` INTEGER NOT NULL, `number` INTEGER NOT NULL, `url` TEXT, `description` TEXT, `duration` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `filename` TEXT, `isread` INTEGER NOT NULL, `uid` TEXT, `warn` INTEGER NOT NULL, `gif_id` INTEGER, `gif_url` TEXT, `room_head` TEXT, `room_name` TEXT, `room_id` INTEGER, `room_idx` TEXT, `room_ip` TEXT, `moment_id` INTEGER, `moment_image` TEXT, `moment_text` TEXT, `moment_msg` TEXT, `topic_id` INTEGER, `topic_image` TEXT, `topic_name` TEXT, `topic_userCount` INTEGER, `topic_momentCount` INTEGER, `topic_msg` TEXT, `user_id` INTEGER, `user_idx` INTEGER, `user_head` TEXT, `user_name` TEXT, `user_msg` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessage_midx` ON `ChatMessage` (`midx`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `UserRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` INTEGER NOT NULL, `headurl` TEXT, `nickname` TEXT, `time` INTEGER NOT NULL, `localtime` INTEGER NOT NULL, `level` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `sex` INTEGER NOT NULL, `prettyId` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserRecord_userid` ON `UserRecord` (`userid`)", "CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessage_midx` ON `SystemMessage` (`midx`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `CommentNotice` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `fromUser` TEXT, `fromUid` INTEGER NOT NULL, `msg` TEXT, `localtime` INTEGER NOT NULL, `moment` TEXT, `momentId` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `uid` TEXT, `isRead` INTEGER NOT NULL, `form_header` TEXT, `form_name` TEXT, `post_image` TEXT, `gift_id` INTEGER NOT NULL, `gift_image` TEXT, `gift_num` INTEGER NOT NULL, `delete_type` INTEGER NOT NULL, `objectId` INTEGER NOT NULL, `dyImg` TEXT, `hostImg` TEXT, `circleName` TEXT, `hostId` INTEGER NOT NULL, `commentId` INTEGER NOT NULL, `rewardType` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_CommentNotice_midx` ON `CommentNotice` (`midx`)", "CREATE TABLE IF NOT EXISTS `FriendsTable` (`id` TEXT NOT NULL, `name` TEXT, `head` TEXT, `vip` TEXT, `vip_level` TEXT, `idx` TEXT, `uid` TEXT NOT NULL, `sex` TEXT, `add_from` TEXT, `time` INTEGER NOT NULL, `role` INTEGER NOT NULL, `sign` TEXT, `headframeurl` TEXT, `check_warn` INTEGER NOT NULL, `memoName` TEXT, PRIMARY KEY(`id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_FriendsTable_id_uid` ON `FriendsTable` (`id`, `uid`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewFriendsTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` TEXT, `username` TEXT, `headphoto` TEXT, `uservip` TEXT, `state` TEXT, `message` TEXT, `time` INTEGER NOT NULL, `standbyone` TEXT, `standbytwo` TEXT, `standbythree` TEXT, `isRead` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `userLevel` INTEGER NOT NULL, `mid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFriendsTable_userid` ON `NewFriendsTable` (`userid`)", "CREATE TABLE IF NOT EXISTS `NewFans` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `fansid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFans_fansid` ON `NewFans` (`fansid`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewVisitor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `visitorid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewVisitor_visitorid` ON `NewVisitor` (`visitorid`)", "CREATE TABLE IF NOT EXISTS `DraftMessageTable` (`uid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `userId`))", "CREATE INDEX IF NOT EXISTS `index_DraftMessageTable_uid_userId` ON `DraftMessageTable` (`uid`, `userId`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MusicTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `mTitle` TEXT, `mTitleKey` TEXT, `mDuration` INTEGER NOT NULL, `mArtist` TEXT, `mArtistKey` TEXT, `mComposer` TEXT, `mAlbum` TEXT, `mAlbumKey` TEXT, `mDisplayName` TEXT, `mMimeType` TEXT, `mPath` TEXT, `user` TEXT, `initialLetter` TEXT, `isSelect` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))", "CREATE INDEX IF NOT EXISTS `index_SearchHistoryTable_uid_tag_type` ON `SearchHistoryTable` (`uid`, `tag`, `type`)", "CREATE TABLE IF NOT EXISTS `RoomHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT, `time` INTEGER NOT NULL, `baridx` TEXT, `barname` TEXT, `barlevel` TEXT, `barimage` TEXT, `roomserverip` TEXT, `isencrypt` TEXT, `notice` TEXT, `labelname` TEXT, `istop` INTEGER NOT NULL, `countryid` TEXT, `isofficial` INTEGER NOT NULL, `bartype` TEXT, `medal` TEXT)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomHistory_repeat` ON `RoomHistory` (`repeat`)", "CREATE TABLE IF NOT EXISTS `RoomJoinHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomJoinHistory_repeat` ON `RoomJoinHistory` (`repeat`)", "CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomTheme_roomId` ON `RoomTheme` (`roomId`)", "CREATE TABLE IF NOT EXISTS `ApiErrorCodeDB` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Code` TEXT, `MessgeEn` TEXT, `MessgeME` TEXT, `MessgeTr` TEXT, `MessgeIn` TEXT, `MessgePT` TEXT, `MessgeES` TEXT, `MessgeHi` TEXT, `MessgeUr` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ApiErrorCodeDB_Code` ON `ApiErrorCodeDB` (`Code`)", "CREATE TABLE IF NOT EXISTS `ReadPostTable` (`cid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `readPostId` INTEGER NOT NULL, PRIMARY KEY(`cid`, `userId`))");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_ReadPostTable_cid_userId` ON `ReadPostTable` (`cid`, `userId`)", "CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_TopicRecentTable_topic_id_uid` ON `TopicRecentTable` (`topic_id`, `uid`)", "CREATE TABLE IF NOT EXISTS `BillingOrder` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `order_id` TEXT NOT NULL, `purchase_id` TEXT NOT NULL, `type` TEXT NOT NULL, `status` INTEGER NOT NULL, `sku` TEXT NOT NULL, `purchase_token` TEXT NOT NULL)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT, `background` TEXT, `userLevel` INTEGER NOT NULL, `isBlackUser` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGER NOT NULL, `tags` TEXT NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `kaVipState` INTEGER NOT NULL, `kaVipLevel` INTEGER NOT NULL, `showVIP` INTEGER NOT NULL DEFAULT 1, `currWealLv` INTEGER NOT NULL, `currBadgeImg` TEXT NOT NULL, `currBadgeLv` INTEGER NOT NULL, PRIMARY KEY(`userId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserInfoTable_userId` ON `UserInfoTable` (`userId`)", "CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `momentType` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `unknownMessage` TEXT NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER, `giftUrl` TEXT, `isGiftBlind` INTEGER, `isGiftBlindBox` INTEGER, `isGiftBackpack` INTEGER, `isGiftCustomMade` INTEGER, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `momentType` INTEGER, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, `themeBgName` TEXT, `themeBgImgUrl` TEXT, `themeVideoUrl` TEXT, `themeDayLimit` INTEGER, `themeExpireTime` INTEGER, `themeGiveId` INTEGER, `themeState` INTEGER, `eventId` INTEGER, `eventName` TEXT, `eventImageUrl` TEXT, `eventTagId` INTEGER, `eventStartTime` INTEGER, `eventEndTime` INTEGER, `eventRoomId` INTEGER, `eventRoomName` TEXT, `eventRoomIp` TEXT, `eventDeleted` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `buriedPointSource` TEXT NOT NULL, `buriedPointMessageId` TEXT NOT NULL, `type` INTEGER NOT NULL, `messageType` INTEGER NOT NULL, `jumpType` INTEGER NOT NULL, `jumpId` TEXT NOT NULL, `coverImage` TEXT NOT NULL, `detailImage` TEXT NOT NULL, `title` TEXT, `detailTitle` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `surveyMessageId` INTEGER, `surveyIsSubmit` INTEGER, `surveyScore` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `GiftBackpackExpired_dyid` INTEGER, `GiftBackpackExpired_headurl` TEXT, `GiftBackpackExpired_sex` INTEGER, `GiftBackpackExpired_ispraise` INTEGER, `GiftBackpackExpired_level` INTEGER, `GiftBackpackExpired_coin` INTEGER, `GiftBackpackExpired_upcrystal` INTEGER, `GiftBackpackExpired_language` INTEGER, `GiftBackpackExpired_nickname` TEXT, `GiftBackpackExpired_dyurl` TEXT, `GiftBlindTaskReward_awardtype` INTEGER, `GiftBlindTaskReward_awardcount` INTEGER, `GiftBlindTaskReward_awardId` INTEGER, `GiftBlindTaskReward_awardimage` TEXT, `GiftBlindRankingReward_toprank` INTEGER, `GiftBlindRankingReward_toptype` INTEGER, `GiftBlindRankingReward_awardtype` INTEGER, `GiftBlindRankingReward_awardcount` INTEGER, `GiftBlindRankingReward_awardId` INTEGER, `GiftBlindRankingReward_awardimage` TEXT, `Vip6DistributeSupremeGift_propCount` INTEGER, `Vip6DistributeSupremeGift_propId` INTEGER, `Vip6DistributeSupremeGift_propImage` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `WealthLevelUpInfo_wealthLevel` INTEGER, `WealthLevelUpInfo_badgeLevel` INTEGER, `WealthLevelUpInfo_badgeImage` TEXT, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `FriendTable` (`uid` INTEGER NOT NULL, `friendId` INTEGER NOT NULL, `memoName` TEXT, `time` INTEGER NOT NULL, `inRoom` INTEGER NOT NULL, `deleteMark` INTEGER NOT NULL, `isCheckUserRisk` INTEGER NOT NULL, PRIMARY KEY(`uid`, `friendId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendTable_uid_friendId` ON `FriendTable` (`uid`, `friendId`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)", "CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SimpleMessageTable_uid_type` ON `SimpleMessageTable` (`uid`, `type`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MomentMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `type` INTEGER NOT NULL, `userId_MomentPraise` INTEGER, `userNickName_MomentPraise` TEXT, `userHeadUrl_MomentPraise` TEXT, `momentId_MomentPraise` INTEGER, `momentImageUrl_MomentPraise` TEXT, `momentContent_MomentPraise` TEXT, `userId_CommentPraise` INTEGER, `userNickName_CommentPraise` TEXT, `userHeadUrl_CommentPraise` TEXT, `momentId_CommentPraise` INTEGER, `momentImageUrl_CommentPraise` TEXT, `momentContent_CommentPraise` TEXT, `userId_MomentComment` INTEGER, `userNickName_MomentComment` TEXT, `userHeadUrl_MomentComment` TEXT, `momentId_MomentComment` INTEGER, `momentImageUrl_MomentComment` TEXT, `momentContent_MomentComment` TEXT, `commentId_MomentComment` INTEGER, `commentContent_MomentComment` TEXT, `userId_CommentReply` INTEGER, `userNickName_CommentReply` TEXT, `userHeadUrl_CommentReply` TEXT, `momentId_CommentReply` INTEGER, `momentImageUrl_CommentReply` TEXT, `momentContent_CommentReply` TEXT, `commentId_CommentReply` INTEGER, `commentContent_CommentReply` TEXT, `replyId_CommentReply` INTEGER, `replyContent_CommentReply` TEXT, `userId_MomentAt` INTEGER, `userNickName_MomentAt` TEXT, `userHeadUrl_MomentAt` TEXT, `momentId_MomentAt` INTEGER, `momentImageUrl_MomentAt` TEXT, `momentContent_MomentAt` TEXT, `userId_CommentAt` INTEGER, `userNickName_CommentAt` TEXT, `userHeadUrl_CommentAt` TEXT, `momentId_CommentAt` INTEGER, `momentImageUrl_CommentAt` TEXT, `momentContent_CommentAt` TEXT, `commentId_CommentAt` INTEGER, `commentContent_CommentAt` TEXT, `userId_MomentGift` INTEGER, `userNickName_MomentGift` TEXT, `userHeadUrl_MomentGift` TEXT, `momentId_MomentGift` INTEGER, `momentImageUrl_MomentGift` TEXT, `giftNum_MomentGift` INTEGER, `giftImage_MomentGift` TEXT, `userId_CommentReward` INTEGER, `userNickName_CommentReward` TEXT, `userHeadUrl_CommentReward` TEXT, `momentId_CommentReward` INTEGER, `momentImageUrl_CommentReward` TEXT, `commentId_CommentReward` INTEGER, `commentContent_CommentReward` TEXT, `userId_ReplyReward` INTEGER, `userNickName_ReplyReward` TEXT, `userHeadUrl_ReplyReward` TEXT, `momentId_ReplyReward` INTEGER, `momentImageUrl_ReplyReward` TEXT, `commentId_ReplyReward` INTEGER, `commentContent_ReplyReward` TEXT, `momentId_MomentFeatured` INTEGER, `momentImageUrl_MomentFeatured` TEXT, `momentId_CommentFeatured` INTEGER, `momentImageUrl_CommentFeatured` TEXT, `momentContent_CommentFeatured` TEXT, `commentId_CommentFeatured` INTEGER, `userId_MomentTopicTop` INTEGER, `userHeadUrl_MomentTopicTop` TEXT, `momentImageUrl_MomentTopicTop` TEXT, `topicId_MomentTopicTop` INTEGER, `topicName_MomentTopicTop` TEXT, `userId_MomentTopicTopRevoke` INTEGER, `userHeadUrl_MomentTopicTopRevoke` TEXT, `momentImageUrl_MomentTopicTopRevoke` TEXT, `topicId_MomentTopicTopRevoke` INTEGER, `topicName_MomentTopicTopRevoke` TEXT, `userId_MomentTopicRemoveOwner` INTEGER, `userHeadUrl_MomentTopicRemoveOwner` TEXT, `momentImageUrl_MomentTopicRemoveOwner` TEXT, `momentId_MomentTopicRemoveOwner` INTEGER, `topicName_MomentTopicRemoveOwner` TEXT, `userId_MomentTopicRemoveAdmin` INTEGER, `userHeadUrl_MomentTopicRemoveAdmin` TEXT, `momentImageUrl_MomentTopicRemoveAdmin` TEXT, `momentId_MomentTopicRemoveAdmin` INTEGER, `topicName_MomentTopicRemoveAdmin` TEXT, `userId_TopicGroupCreateSuccessNotice` INTEGER, `nickName_TopicGroupCreateSuccessNotice` TEXT, `headUrl_TopicGroupCreateSuccessNotice` TEXT, `circleId_TopicGroupCreateSuccessNotice` INTEGER, `circleName_TopicGroupCreateSuccessNotice` TEXT, `circleHead_TopicGroupCreateSuccessNotice` TEXT, `type_TopicGroupCreateSuccessNotice` INTEGER, `groupOpenId_TopicGroupCreateSuccessNotice` TEXT, `userId_TopicGroupCreateOrJoinResult` INTEGER, `circleId_TopicGroupCreateOrJoinResult` INTEGER, `type_TopicGroupCreateOrJoinResult` INTEGER, `momentId_MomentSystemRemove` INTEGER, `momentImageUrl_MomentSystemRemove` TEXT, `deleteType_MomentSystemRemove` INTEGER, `commentId_CommentSystemRemove` INTEGER, `commentContent_CommentSystemRemove` TEXT, `deleteType_CommentSystemRemove` INTEGER, `deleteContent_CommentSystemRemove` TEXT, `momentId_MomentReportFeedback` INTEGER, `momentImageUrl_MomentReportFeedback` TEXT, `momentContent_MomentReportFeedback` TEXT, `momentTitle_MomentReportFeedback` TEXT, `commentId_CommentReportFeedback` INTEGER, `commentContent_CommentReportFeedback` TEXT, `momentImageUrl_CommentReportFeedback` TEXT, `commentTitle_CommentReportFeedback` TEXT, `commentCommentId_CommentReportFeedback` INTEGER, `commentCommentContent_CommentReportFeedback` TEXT, `circleId_CircleReportFeedback` INTEGER, `circleContent_CircleReportFeedback` TEXT, `circleImageUrl_CircleReportFeedback` TEXT, `circleTitle_CircleReportFeedback` TEXT, `topicUserId_TopicCreateSuccess` INTEGER, `topicId_TopicCreateSuccess` INTEGER, `topicName_TopicCreateSuccess` TEXT, `message_TopicCreateSuccess` TEXT, `topicUserId_TopicCreateFail` INTEGER, `topicId_TopicCreateFail` INTEGER, `topicName_TopicCreateFail` TEXT, `message_TopicCreateFail` TEXT, `failType_TopicCreateFail` INTEGER, `topicUserId_TopicCreateDisband` INTEGER, `topicId_TopicCreateDisband` INTEGER, `topicName_TopicCreateDisband` TEXT, `message_TopicCreateDisband` TEXT, `disbandContent_TopicCreateDisband` INTEGER, `topicId_TopicMemberAdd` INTEGER, `content_TopicMemberAdd` TEXT, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MomentMessageTable_uid_mid` ON `MomentMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `PayOrderTable` (`user_id` INTEGER NOT NULL, `order_id` TEXT NOT NULL, `sku` TEXT NOT NULL, `amount` REAL, `type` INTEGER NOT NULL, `purchase_token` TEXT NOT NULL, `huaWeiAccountFlag` INTEGER NOT NULL, `isConsume` INTEGER NOT NULL, `purchaseState` INTEGER NOT NULL, `isAcknowledged` INTEGER NOT NULL, `isSubscription` INTEGER NOT NULL, `subscriptionState` INTEGER NOT NULL, `subscriptionId` TEXT NOT NULL, `subscriptionOrderId` TEXT NOT NULL, `createTime` INTEGER NOT NULL, PRIMARY KEY(`order_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_PayOrderTable_order_id` ON `PayOrderTable` (`order_id`)");
            o00Oo0.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SquareEventRoomTable_uid_mid` ON `SquareEventRoomTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `BuriedPointTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `device_brand` TEXT, `os_version` TEXT, `carrier` TEXT, `device_model` TEXT, `app_version` TEXT, `app_channel` TEXT, `ip` TEXT, `device_id` TEXT, `session_id` TEXT, `os` INTEGER NOT NULL, `user_id` TEXT, `event_id` TEXT, `event_type` INTEGER NOT NULL, `url` TEXT, `event_time` INTEGER NOT NULL, `room_id` INTEGER, `ext_info` TEXT)", "CREATE TABLE IF NOT EXISTS `HideContentTable` (`userId` INTEGER NOT NULL, `contentId` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`userId`, `type`, `contentId`))");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_HideContentTable_userId_type_contentId` ON `HideContentTable` (`userId`, `type`, `contentId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '90059d6bc2a40062e3120370c0bcf2af')");
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase db) {
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `MessageRecord`", "DROP TABLE IF EXISTS `ChatMessage`", "DROP TABLE IF EXISTS `UserRecord`", "DROP TABLE IF EXISTS `SystemMessage`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `CommentNotice`", "DROP TABLE IF EXISTS `FriendsTable`", "DROP TABLE IF EXISTS `NewFriendsTable`", "DROP TABLE IF EXISTS `NewFans`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `NewVisitor`", "DROP TABLE IF EXISTS `DraftMessageTable`", "DROP TABLE IF EXISTS `MusicTable`", "DROP TABLE IF EXISTS `SearchHistoryTable`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `RoomHistory`", "DROP TABLE IF EXISTS `RoomJoinHistory`", "DROP TABLE IF EXISTS `RoomTheme`", "DROP TABLE IF EXISTS `ApiErrorCodeDB`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `ReadPostTable`", "DROP TABLE IF EXISTS `TopicRecentTable`", "DROP TABLE IF EXISTS `BillingOrder`", "DROP TABLE IF EXISTS `UserInfoTable`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `ConversationTable`", "DROP TABLE IF EXISTS `ChatMessageTable`", "DROP TABLE IF EXISTS `YallaTeamMessageTable`", "DROP TABLE IF EXISTS `SystemMessageTable`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `FriendTable`", "DROP TABLE IF EXISTS `FriendRequestMessageTable`", "DROP TABLE IF EXISTS `SimpleMessageTable`", "DROP TABLE IF EXISTS `MomentMessageTable`");
            o00Oo0.OooO0O0(db, "DROP TABLE IF EXISTS `PayOrderTable`", "DROP TABLE IF EXISTS `SquareEventRoomTable`", "DROP TABLE IF EXISTS `BuriedPointTable`", "DROP TABLE IF EXISTS `HideContentTable`");
            YlAppDataBase_Impl ylAppDataBase_Impl = YlAppDataBase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = ylAppDataBase_Impl.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ylAppDataBase_Impl.f7890OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0OO(SupportSQLiteDatabase db) {
            YlAppDataBase_Impl ylAppDataBase_Impl = YlAppDataBase_Impl.this;
            List<? extends RoomDatabase.OooO0O0> list = ylAppDataBase_Impl.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ylAppDataBase_Impl.f7890OooO0oO.get(i).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            YlAppDataBase_Impl.this.f7884OooO00o = supportSQLiteDatabase;
            YlAppDataBase_Impl.this.OooOO0O(supportSQLiteDatabase);
            List<? extends RoomDatabase.OooO0O0> list = YlAppDataBase_Impl.this.f7890OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    YlAppDataBase_Impl.this.f7890OooO0oO.get(i).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            OooO0O0.OooO00o(supportSQLiteDatabase);
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final void OooO0o0() {
        }

        @Override // o000O0O0.o0Oo0oo.OooO00o
        public final o0Oo0oo.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
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
            HashSet hashSetOooO00o = o00oO0o.OooO00o(map, "headframeurl", new TableInfo.OooO00o(0, 1, "headframeurl", "TEXT", null, false), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new TableInfo.OooO0o("index_MessageRecord_midx_fromid", true, Arrays.asList("midx", "fromid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("MessageRecord", map, hashSetOooO00o, hashSet);
            TableInfo tableInfoOooO00o = TableInfo.OooO00o(supportSQLiteDatabase, "MessageRecord");
            if (!tableInfo.equals(tableInfoOooO00o)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("MessageRecord(com.yalla.yalla.data.db.model.MessageRecord).\n Expected:\n", tableInfo, "\n Found:\n", tableInfoOooO00o));
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
            HashSet hashSetOooO00o2 = o00oO0o.OooO00o(map2, "user_msg", new TableInfo.OooO00o(0, 1, "user_msg", "TEXT", null, false), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.OooO0o("index_ChatMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo2 = new TableInfo("ChatMessage", map2, hashSetOooO00o2, hashSet2);
            TableInfo tableInfoOooO00o2 = TableInfo.OooO00o(supportSQLiteDatabase, "ChatMessage");
            if (!tableInfo2.equals(tableInfoOooO00o2)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("ChatMessage(com.yalla.yalla.data.db.model.ChatMessageOld).\n Expected:\n", tableInfo2, "\n Found:\n", tableInfoOooO00o2));
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
            HashSet hashSetOooO00o3 = o00oO0o.OooO00o(map3, "headframeurl", new TableInfo.OooO00o(0, 1, "headframeurl", "TEXT", null, false), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new TableInfo.OooO0o("index_UserRecord_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("UserRecord", map3, hashSetOooO00o3, hashSet3);
            TableInfo tableInfoOooO00o3 = TableInfo.OooO00o(supportSQLiteDatabase, "UserRecord");
            if (!tableInfo3.equals(tableInfoOooO00o3)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("UserRecord(com.yalla.yalla.data.db.model.UserRecord).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfoOooO00o3));
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
            HashSet hashSetOooO00o4 = o00oO0o.OooO00o(map4, "topic_state", new TableInfo.OooO00o(0, 1, "topic_state", "INTEGER", null, true), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.OooO0o("index_SystemMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo4 = new TableInfo("SystemMessage", map4, hashSetOooO00o4, hashSet4);
            TableInfo tableInfoOooO00o4 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemMessage");
            if (!tableInfo4.equals(tableInfoOooO00o4)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("SystemMessage(com.yalla.yalla.data.db.model.SystemMessageOld).\n Expected:\n", tableInfo4, "\n Found:\n", tableInfoOooO00o4));
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
            HashSet hashSetOooO00o5 = o00oO0o.OooO00o(map5, "rewardType", new TableInfo.OooO00o(0, 1, "rewardType", "INTEGER", null, true), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new TableInfo.OooO0o("index_CommentNotice_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            TableInfo tableInfo5 = new TableInfo("CommentNotice", map5, hashSetOooO00o5, hashSet5);
            TableInfo tableInfoOooO00o5 = TableInfo.OooO00o(supportSQLiteDatabase, "CommentNotice");
            if (!tableInfo5.equals(tableInfoOooO00o5)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("CommentNotice(com.yalla.yalla.data.db.model.CommentNoticeOld).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfoOooO00o5));
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
            HashSet hashSetOooO00o6 = o00oO0o.OooO00o(map6, "memoName", new TableInfo.OooO00o(0, 1, "memoName", "TEXT", null, false), 0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.OooO0o("index_FriendsTable_id_uid", false, Arrays.asList("id", "uid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo6 = new TableInfo("FriendsTable", map6, hashSetOooO00o6, hashSet6);
            TableInfo tableInfoOooO00o6 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendsTable");
            if (!tableInfo6.equals(tableInfoOooO00o6)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("FriendsTable(com.yalla.yalla.data.db.model.FriendsTableOld).\n Expected:\n", tableInfo6, "\n Found:\n", tableInfoOooO00o6));
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
            HashSet hashSetOooO00o7 = o00oO0o.OooO00o(map7, "mid", new TableInfo.OooO00o(0, 1, "mid", "TEXT", null, false), 0);
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new TableInfo.OooO0o("index_NewFriendsTable_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            TableInfo tableInfo7 = new TableInfo("NewFriendsTable", map7, hashSetOooO00o7, hashSet7);
            TableInfo tableInfoOooO00o7 = TableInfo.OooO00o(supportSQLiteDatabase, "NewFriendsTable");
            if (!tableInfo7.equals(tableInfoOooO00o7)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("NewFriendsTable(com.yalla.yalla.data.db.model.NewFriendsOld).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfoOooO00o7));
            }
            HashMap map8 = new HashMap(3);
            map8.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map8.put("fansid", new TableInfo.OooO00o(0, 1, "fansid", "TEXT", null, false));
            HashSet hashSetOooO00o8 = o00oO0o.OooO00o(map8, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.OooO0o("index_NewFans_fansid", true, Arrays.asList("fansid"), Arrays.asList("ASC")));
            TableInfo tableInfo8 = new TableInfo("NewFans", map8, hashSetOooO00o8, hashSet8);
            TableInfo tableInfoOooO00o8 = TableInfo.OooO00o(supportSQLiteDatabase, "NewFans");
            if (!tableInfo8.equals(tableInfoOooO00o8)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("NewFans(com.yalla.yalla.data.db.model.NewFans).\n Expected:\n", tableInfo8, "\n Found:\n", tableInfoOooO00o8));
            }
            HashMap map9 = new HashMap(3);
            map9.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map9.put("visitorid", new TableInfo.OooO00o(0, 1, "visitorid", "TEXT", null, false));
            HashSet hashSetOooO00o9 = o00oO0o.OooO00o(map9, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new TableInfo.OooO0o("index_NewVisitor_visitorid", true, Arrays.asList("visitorid"), Arrays.asList("ASC")));
            TableInfo tableInfo9 = new TableInfo("NewVisitor", map9, hashSetOooO00o9, hashSet9);
            TableInfo tableInfoOooO00o9 = TableInfo.OooO00o(supportSQLiteDatabase, "NewVisitor");
            if (!tableInfo9.equals(tableInfoOooO00o9)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("NewVisitor(com.yalla.yalla.data.db.model.NewVisitor).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfoOooO00o9));
            }
            HashMap map10 = new HashMap(4);
            map10.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map10.put("userId", new TableInfo.OooO00o(2, 1, "userId", "INTEGER", null, true));
            map10.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, true));
            HashSet hashSetOooO00o10 = o00oO0o.OooO00o(map10, "time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true), 0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.OooO0o("index_DraftMessageTable_uid_userId", false, Arrays.asList("uid", "userId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo10 = new TableInfo("DraftMessageTable", map10, hashSetOooO00o10, hashSet10);
            TableInfo tableInfoOooO00o10 = TableInfo.OooO00o(supportSQLiteDatabase, "DraftMessageTable");
            if (!tableInfo10.equals(tableInfoOooO00o10)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("DraftMessageTable(com.yalla.yalla.data.db.table.DraftMessage).\n Expected:\n", tableInfo10, "\n Found:\n", tableInfoOooO00o10));
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
            TableInfo tableInfo11 = new TableInfo("MusicTable", map11, o00oO0o.OooO00o(map11, "isSelect", new TableInfo.OooO00o(0, 1, "isSelect", "INTEGER", null, true), 0), new HashSet(0));
            TableInfo tableInfoOooO00o11 = TableInfo.OooO00o(supportSQLiteDatabase, "MusicTable");
            if (!tableInfo11.equals(tableInfoOooO00o11)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("MusicTable(com.yalla.yalla.data.db.model.MusicTable).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfoOooO00o11));
            }
            HashMap map12 = new HashMap(4);
            map12.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map12.put(ViewHierarchyConstants.TAG_KEY, new TableInfo.OooO00o(2, 1, ViewHierarchyConstants.TAG_KEY, "TEXT", null, true));
            map12.put("type", new TableInfo.OooO00o(3, 1, "type", "INTEGER", null, true));
            HashSet hashSetOooO00o11 = o00oO0o.OooO00o(map12, "time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true), 0);
            HashSet hashSet11 = new HashSet(1);
            hashSet11.add(new TableInfo.OooO0o("index_SearchHistoryTable_uid_tag_type", false, Arrays.asList("uid", ViewHierarchyConstants.TAG_KEY, "type"), Arrays.asList("ASC", "ASC", "ASC")));
            TableInfo tableInfo12 = new TableInfo("SearchHistoryTable", map12, hashSetOooO00o11, hashSet11);
            TableInfo tableInfoOooO00o12 = TableInfo.OooO00o(supportSQLiteDatabase, "SearchHistoryTable");
            if (!tableInfo12.equals(tableInfoOooO00o12)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("SearchHistoryTable(com.yalla.yalla.data.db.model.SearchHistoryTable).\n Expected:\n", tableInfo12, "\n Found:\n", tableInfoOooO00o12));
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
            HashSet hashSetOooO00o12 = o00oO0o.OooO00o(map13, "medal", new TableInfo.OooO00o(0, 1, "medal", "TEXT", null, false), 0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new TableInfo.OooO0o("index_RoomHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            TableInfo tableInfo13 = new TableInfo("RoomHistory", map13, hashSetOooO00o12, hashSet12);
            TableInfo tableInfoOooO00o13 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomHistory");
            if (!tableInfo13.equals(tableInfoOooO00o13)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("RoomHistory(com.yalla.yalla.data.db.model.RoomHistory).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfoOooO00o13));
            }
            HashMap map14 = new HashMap(4);
            map14.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map14.put("repeat", new TableInfo.OooO00o(0, 1, "repeat", "TEXT", null, false));
            map14.put("barid", new TableInfo.OooO00o(0, 1, "barid", "TEXT", null, false));
            HashSet hashSetOooO00o13 = o00oO0o.OooO00o(map14, "uid", new TableInfo.OooO00o(0, 1, "uid", "TEXT", null, false), 0);
            HashSet hashSet13 = new HashSet(1);
            hashSet13.add(new TableInfo.OooO0o("index_RoomJoinHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            TableInfo tableInfo14 = new TableInfo("RoomJoinHistory", map14, hashSetOooO00o13, hashSet13);
            TableInfo tableInfoOooO00o14 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomJoinHistory");
            if (!tableInfo14.equals(tableInfoOooO00o14)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("RoomJoinHistory(com.yalla.yalla.data.db.model.RoomJoinHistory).\n Expected:\n", tableInfo14, "\n Found:\n", tableInfoOooO00o14));
            }
            HashMap map15 = new HashMap(3);
            map15.put("id", new TableInfo.OooO00o(1, 1, "id", "INTEGER", null, false));
            map15.put(ContributionFragment.ARG_1, new TableInfo.OooO00o(0, 1, ContributionFragment.ARG_1, "INTEGER", null, true));
            HashSet hashSetOooO00o14 = o00oO0o.OooO00o(map15, "roomTheme", new TableInfo.OooO00o(0, 1, "roomTheme", "TEXT", null, false), 0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new TableInfo.OooO0o("index_RoomTheme_roomId", true, Arrays.asList(ContributionFragment.ARG_1), Arrays.asList("ASC")));
            TableInfo tableInfo15 = new TableInfo("RoomTheme", map15, hashSetOooO00o14, hashSet14);
            TableInfo tableInfoOooO00o15 = TableInfo.OooO00o(supportSQLiteDatabase, "RoomTheme");
            if (!tableInfo15.equals(tableInfoOooO00o15)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("RoomTheme(com.yalla.yalla.data.db.model.RoomTheme).\n Expected:\n", tableInfo15, "\n Found:\n", tableInfoOooO00o15));
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
            HashSet hashSetOooO00o15 = o00oO0o.OooO00o(map16, "MessgeUr", new TableInfo.OooO00o(0, 1, "MessgeUr", "TEXT", null, false), 0);
            HashSet hashSet15 = new HashSet(1);
            hashSet15.add(new TableInfo.OooO0o("index_ApiErrorCodeDB_Code", true, Arrays.asList("Code"), Arrays.asList("ASC")));
            TableInfo tableInfo16 = new TableInfo("ApiErrorCodeDB", map16, hashSetOooO00o15, hashSet15);
            TableInfo tableInfoOooO00o16 = TableInfo.OooO00o(supportSQLiteDatabase, "ApiErrorCodeDB");
            if (!tableInfo16.equals(tableInfoOooO00o16)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("ApiErrorCodeDB(com.yalla.yalla.data.db.model.ApiErrorCodeDB).\n Expected:\n", tableInfo16, "\n Found:\n", tableInfoOooO00o16));
            }
            HashMap map17 = new HashMap(3);
            map17.put("cid", new TableInfo.OooO00o(1, 1, "cid", "INTEGER", null, true));
            map17.put("userId", new TableInfo.OooO00o(2, 1, "userId", "INTEGER", null, true));
            HashSet hashSetOooO00o16 = o00oO0o.OooO00o(map17, "readPostId", new TableInfo.OooO00o(0, 1, "readPostId", "INTEGER", null, true), 0);
            HashSet hashSet16 = new HashSet(1);
            hashSet16.add(new TableInfo.OooO0o("index_ReadPostTable_cid_userId", true, Arrays.asList("cid", "userId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo17 = new TableInfo("ReadPostTable", map17, hashSetOooO00o16, hashSet16);
            TableInfo tableInfoOooO00o17 = TableInfo.OooO00o(supportSQLiteDatabase, "ReadPostTable");
            if (!tableInfo17.equals(tableInfoOooO00o17)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("ReadPostTable(com.yalla.yalla.data.db.model.ReadPostTable).\n Expected:\n", tableInfo17, "\n Found:\n", tableInfoOooO00o17));
            }
            HashMap map18 = new HashMap(4);
            map18.put("topic_id", new TableInfo.OooO00o(1, 1, "topic_id", "INTEGER", null, true));
            map18.put("topic_name", new TableInfo.OooO00o(0, 1, "topic_name", "TEXT", null, false));
            map18.put("create_time", new TableInfo.OooO00o(0, 1, "create_time", "INTEGER", null, true));
            HashSet hashSetOooO00o17 = o00oO0o.OooO00o(map18, "uid", new TableInfo.OooO00o(2, 1, "uid", "TEXT", null, true), 0);
            HashSet hashSet17 = new HashSet(1);
            hashSet17.add(new TableInfo.OooO0o("index_TopicRecentTable_topic_id_uid", false, Arrays.asList("topic_id", "uid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo18 = new TableInfo("TopicRecentTable", map18, hashSetOooO00o17, hashSet17);
            TableInfo tableInfoOooO00o18 = TableInfo.OooO00o(supportSQLiteDatabase, "TopicRecentTable");
            if (!tableInfo18.equals(tableInfoOooO00o18)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("TopicRecentTable(com.yalla.yalla.data.db.model.TopicRecentTable).\n Expected:\n", tableInfo18, "\n Found:\n", tableInfoOooO00o18));
            }
            HashMap map19 = new HashMap(8);
            map19.put("_id", new TableInfo.OooO00o(1, 1, "_id", "INTEGER", null, true));
            map19.put(AccessToken.USER_ID_KEY, new TableInfo.OooO00o(0, 1, AccessToken.USER_ID_KEY, "TEXT", null, true));
            map19.put("order_id", new TableInfo.OooO00o(0, 1, "order_id", "TEXT", null, true));
            map19.put("purchase_id", new TableInfo.OooO00o(0, 1, "purchase_id", "TEXT", null, true));
            map19.put("type", new TableInfo.OooO00o(0, 1, "type", "TEXT", null, true));
            map19.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, new TableInfo.OooO00o(0, 1, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "INTEGER", null, true));
            map19.put("sku", new TableInfo.OooO00o(0, 1, "sku", "TEXT", null, true));
            TableInfo tableInfo19 = new TableInfo("BillingOrder", map19, o00oO0o.OooO00o(map19, "purchase_token", new TableInfo.OooO00o(0, 1, "purchase_token", "TEXT", null, true), 0), new HashSet(0));
            TableInfo tableInfoOooO00o19 = TableInfo.OooO00o(supportSQLiteDatabase, "BillingOrder");
            if (!tableInfo19.equals(tableInfoOooO00o19)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("BillingOrder(com.yalla.yalla.data.db.model.BillingOrder).\n Expected:\n", tableInfo19, "\n Found:\n", tableInfoOooO00o19));
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
            HashSet hashSetOooO00o18 = o00oO0o.OooO00o(map20, "currBadgeLv", new TableInfo.OooO00o(0, 1, "currBadgeLv", "INTEGER", null, true), 0);
            HashSet hashSet18 = new HashSet(1);
            hashSet18.add(new TableInfo.OooO0o("index_UserInfoTable_userId", true, Arrays.asList("userId"), Arrays.asList("ASC")));
            TableInfo tableInfo20 = new TableInfo("UserInfoTable", map20, hashSetOooO00o18, hashSet18);
            TableInfo tableInfoOooO00o20 = TableInfo.OooO00o(supportSQLiteDatabase, "UserInfoTable");
            if (!tableInfo20.equals(tableInfoOooO00o20)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("UserInfoTable(com.yalla.yalla.data.db.table.UserInfo).\n Expected:\n", tableInfo20, "\n Found:\n", tableInfoOooO00o20));
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
            HashSet hashSetOooO00o19 = o00oO0o.OooO00o(map21, "isAcceptMsg", new TableInfo.OooO00o(0, 1, "isAcceptMsg", "INTEGER", null, true), 0);
            HashSet hashSet19 = new HashSet(1);
            hashSet19.add(new TableInfo.OooO0o("index_ConversationTable_uid_targetId", true, Arrays.asList("uid", "targetId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo21 = new TableInfo("ConversationTable", map21, hashSetOooO00o19, hashSet19);
            TableInfo tableInfoOooO00o21 = TableInfo.OooO00o(supportSQLiteDatabase, "ConversationTable");
            if (!tableInfo21.equals(tableInfoOooO00o21)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("ConversationTable(com.yalla.yalla.data.db.table.Conversation).\n Expected:\n", tableInfo21, "\n Found:\n", tableInfoOooO00o21));
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
            HashSet hashSetOooO00o20 = o00oO0o.OooO00o(map22, "eventDeleted", new TableInfo.OooO00o(0, 1, "eventDeleted", "INTEGER", null, false), 0);
            HashSet hashSet20 = new HashSet(1);
            hashSet20.add(new TableInfo.OooO0o("index_ChatMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo22 = new TableInfo("ChatMessageTable", map22, hashSetOooO00o20, hashSet20);
            TableInfo tableInfoOooO00o22 = TableInfo.OooO00o(supportSQLiteDatabase, "ChatMessageTable");
            if (!tableInfo22.equals(tableInfoOooO00o22)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("ChatMessageTable(com.yalla.yalla.data.db.table.ChatMessage).\n Expected:\n", tableInfo22, "\n Found:\n", tableInfoOooO00o22));
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
            HashSet hashSetOooO00o21 = o00oO0o.OooO00o(map23, "surveyScore", new TableInfo.OooO00o(0, 1, "surveyScore", "INTEGER", null, false), 0);
            HashSet hashSet21 = new HashSet(1);
            hashSet21.add(new TableInfo.OooO0o("index_YallaTeamMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo23 = new TableInfo("YallaTeamMessageTable", map23, hashSetOooO00o21, hashSet21);
            TableInfo tableInfoOooO00o23 = TableInfo.OooO00o(supportSQLiteDatabase, "YallaTeamMessageTable");
            if (!tableInfo23.equals(tableInfoOooO00o23)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("YallaTeamMessageTable(com.yalla.yalla.data.db.table.YallaTeamMessage).\n Expected:\n", tableInfo23, "\n Found:\n", tableInfoOooO00o23));
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
            HashSet hashSetOooO00o22 = o00oO0o.OooO00o(map24, "eventId", new TableInfo.OooO00o(0, 1, "eventId", "INTEGER", null, false), 0);
            HashSet hashSet22 = new HashSet(1);
            hashSet22.add(new TableInfo.OooO0o("index_SystemMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo24 = new TableInfo("SystemMessageTable", map24, hashSetOooO00o22, hashSet22);
            TableInfo tableInfoOooO00o24 = TableInfo.OooO00o(supportSQLiteDatabase, "SystemMessageTable");
            if (!tableInfo24.equals(tableInfoOooO00o24)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("SystemMessageTable(com.yalla.yalla.data.db.table.SystemMessage).\n Expected:\n", tableInfo24, "\n Found:\n", tableInfoOooO00o24));
            }
            HashMap map25 = new HashMap(7);
            map25.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map25.put("friendId", new TableInfo.OooO00o(2, 1, "friendId", "INTEGER", null, true));
            map25.put("memoName", new TableInfo.OooO00o(0, 1, "memoName", "TEXT", null, false));
            map25.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map25.put("inRoom", new TableInfo.OooO00o(0, 1, "inRoom", "INTEGER", null, true));
            map25.put("deleteMark", new TableInfo.OooO00o(0, 1, "deleteMark", "INTEGER", null, true));
            HashSet hashSetOooO00o23 = o00oO0o.OooO00o(map25, "isCheckUserRisk", new TableInfo.OooO00o(0, 1, "isCheckUserRisk", "INTEGER", null, true), 0);
            HashSet hashSet23 = new HashSet(1);
            hashSet23.add(new TableInfo.OooO0o("index_FriendTable_uid_friendId", true, Arrays.asList("uid", "friendId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo25 = new TableInfo("FriendTable", map25, hashSetOooO00o23, hashSet23);
            TableInfo tableInfoOooO00o25 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendTable");
            if (!tableInfo25.equals(tableInfoOooO00o25)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("FriendTable(com.yalla.yalla.data.db.table.Friend).\n Expected:\n", tableInfo25, "\n Found:\n", tableInfoOooO00o25));
            }
            HashMap map26 = new HashMap(7);
            map26.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map26.put("targetUserId", new TableInfo.OooO00o(2, 1, "targetUserId", "INTEGER", null, true));
            map26.put("mid", new TableInfo.OooO00o(0, 1, "mid", "TEXT", null, false));
            map26.put("state", new TableInfo.OooO00o(0, 1, "state", "INTEGER", null, true));
            map26.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new TableInfo.OooO00o(0, 1, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", null, false));
            map26.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            HashSet hashSetOooO00o24 = o00oO0o.OooO00o(map26, "isRead", new TableInfo.OooO00o(0, 1, "isRead", "INTEGER", null, true), 0);
            HashSet hashSet24 = new HashSet(1);
            hashSet24.add(new TableInfo.OooO0o("index_FriendRequestMessageTable_uid_targetUserId", true, Arrays.asList("uid", "targetUserId"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo26 = new TableInfo("FriendRequestMessageTable", map26, hashSetOooO00o24, hashSet24);
            TableInfo tableInfoOooO00o26 = TableInfo.OooO00o(supportSQLiteDatabase, "FriendRequestMessageTable");
            if (!tableInfo26.equals(tableInfoOooO00o26)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("FriendRequestMessageTable(com.yalla.yalla.data.db.table.FriendRequestMessage).\n Expected:\n", tableInfo26, "\n Found:\n", tableInfoOooO00o26));
            }
            HashMap map27 = new HashMap(7);
            map27.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map27.put("type", new TableInfo.OooO00o(2, 1, "type", "INTEGER", null, true));
            map27.put("time", new TableInfo.OooO00o(0, 1, "time", "INTEGER", null, true));
            map27.put("content", new TableInfo.OooO00o(0, 1, "content", "TEXT", null, false));
            map27.put("activityNum", new TableInfo.OooO00o(0, 1, "activityNum", "INTEGER", null, false));
            map27.put("fansNum", new TableInfo.OooO00o(0, 1, "fansNum", "INTEGER", null, false));
            HashSet hashSetOooO00o25 = o00oO0o.OooO00o(map27, "visitorNum", new TableInfo.OooO00o(0, 1, "visitorNum", "INTEGER", null, false), 0);
            HashSet hashSet25 = new HashSet(1);
            hashSet25.add(new TableInfo.OooO0o("index_SimpleMessageTable_uid_type", true, Arrays.asList("uid", "type"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo27 = new TableInfo("SimpleMessageTable", map27, hashSetOooO00o25, hashSet25);
            TableInfo tableInfoOooO00o27 = TableInfo.OooO00o(supportSQLiteDatabase, "SimpleMessageTable");
            if (!tableInfo27.equals(tableInfoOooO00o27)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("SimpleMessageTable(com.yalla.yalla.data.db.table.SimpleMessage).\n Expected:\n", tableInfo27, "\n Found:\n", tableInfoOooO00o27));
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
            HashSet hashSetOooO00o26 = o00oO0o.OooO00o(map28, "content_TopicMemberAdd", new TableInfo.OooO00o(0, 1, "content_TopicMemberAdd", "TEXT", null, false), 0);
            HashSet hashSet26 = new HashSet(1);
            hashSet26.add(new TableInfo.OooO0o("index_MomentMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo28 = new TableInfo("MomentMessageTable", map28, hashSetOooO00o26, hashSet26);
            TableInfo tableInfoOooO00o28 = TableInfo.OooO00o(supportSQLiteDatabase, "MomentMessageTable");
            if (!tableInfo28.equals(tableInfoOooO00o28)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("MomentMessageTable(com.yalla.yalla.data.db.table.MomentMessage).\n Expected:\n", tableInfo28, "\n Found:\n", tableInfoOooO00o28));
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
            HashSet hashSetOooO00o27 = o00oO0o.OooO00o(map29, "createTime", new TableInfo.OooO00o(0, 1, "createTime", "INTEGER", null, true), 0);
            HashSet hashSet27 = new HashSet(1);
            hashSet27.add(new TableInfo.OooO0o("index_PayOrderTable_order_id", true, Arrays.asList("order_id"), Arrays.asList("ASC")));
            TableInfo tableInfo29 = new TableInfo("PayOrderTable", map29, hashSetOooO00o27, hashSet27);
            TableInfo tableInfoOooO00o29 = TableInfo.OooO00o(supportSQLiteDatabase, "PayOrderTable");
            if (!tableInfo29.equals(tableInfoOooO00o29)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("PayOrderTable(com.yalla.yalla.data.db.table.PayOrder).\n Expected:\n", tableInfo29, "\n Found:\n", tableInfoOooO00o29));
            }
            HashMap map30 = new HashMap(5);
            map30.put("mid", new TableInfo.OooO00o(2, 1, "mid", "TEXT", null, true));
            map30.put("uid", new TableInfo.OooO00o(1, 1, "uid", "INTEGER", null, true));
            map30.put("targetId", new TableInfo.OooO00o(0, 1, "targetId", "INTEGER", null, true));
            map30.put(ContributionFragment.ARG_1, new TableInfo.OooO00o(0, 1, ContributionFragment.ARG_1, "INTEGER", null, true));
            HashSet hashSetOooO00o28 = o00oO0o.OooO00o(map30, "eventCreateTime", new TableInfo.OooO00o(0, 1, "eventCreateTime", "INTEGER", null, true), 0);
            HashSet hashSet28 = new HashSet(1);
            hashSet28.add(new TableInfo.OooO0o("index_SquareEventRoomTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo30 = new TableInfo("SquareEventRoomTable", map30, hashSetOooO00o28, hashSet28);
            TableInfo tableInfoOooO00o30 = TableInfo.OooO00o(supportSQLiteDatabase, "SquareEventRoomTable");
            if (!tableInfo30.equals(tableInfoOooO00o30)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("SquareEventRoomTable(com.yalla.yalla.data.db.table.SquareEventRoom).\n Expected:\n", tableInfo30, "\n Found:\n", tableInfoOooO00o30));
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
            TableInfo tableInfo31 = new TableInfo("BuriedPointTable", map31, o00oO0o.OooO00o(map31, "ext_info", new TableInfo.OooO00o(0, 1, "ext_info", "TEXT", null, false), 0), new HashSet(0));
            TableInfo tableInfoOooO00o31 = TableInfo.OooO00o(supportSQLiteDatabase, "BuriedPointTable");
            if (!tableInfo31.equals(tableInfoOooO00o31)) {
                return new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("BuriedPointTable(com.yalla.yalla.data.db.model.BuriedPoint).\n Expected:\n", tableInfo31, "\n Found:\n", tableInfoOooO00o31));
            }
            HashMap map32 = new HashMap(3);
            map32.put("userId", new TableInfo.OooO00o(1, 1, "userId", "INTEGER", null, true));
            map32.put("contentId", new TableInfo.OooO00o(3, 1, "contentId", "TEXT", null, true));
            HashSet hashSetOooO00o29 = o00oO0o.OooO00o(map32, "type", new TableInfo.OooO00o(2, 1, "type", "INTEGER", null, true), 0);
            HashSet hashSet29 = new HashSet(1);
            hashSet29.add(new TableInfo.OooO0o("index_HideContentTable_userId_type_contentId", true, Arrays.asList("userId", "type", "contentId"), Arrays.asList("ASC", "ASC", "ASC")));
            TableInfo tableInfo32 = new TableInfo("HideContentTable", map32, hashSetOooO00o29, hashSet29);
            TableInfo tableInfoOooO00o32 = TableInfo.OooO00o(supportSQLiteDatabase, "HideContentTable");
            return !tableInfo32.equals(tableInfoOooO00o32) ? new o0Oo0oo.OooO0O0(false, oo000o.OooO00o("HideContentTable(com.yalla.yalla.data.db.table.HideContent).\n Expected:\n", tableInfo32, "\n Found:\n", tableInfoOooO00o32)) : new o0Oo0oo.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> OooO() {
        HashMap map = new HashMap();
        map.put(oO0o0000.class, Collections.emptyList());
        map.put(o00OOOO0.class, Collections.emptyList());
        map.put(o0O0oo00.class, Collections.emptyList());
        map.put(oO0000O.class, Collections.emptyList());
        map.put(oO00Oo0.class, Collections.emptyList());
        map.put(oO0Ooooo.class, Collections.emptyList());
        map.put(oO0o0o.class, Collections.emptyList());
        map.put(oO0O0OoO.class, Collections.emptyList());
        map.put(oO00O0oO.class, Collections.emptyList());
        map.put(oO00OOOo.class, Collections.emptyList());
        map.put(o00O00OO.class, Collections.emptyList());
        map.put(oO000Oo0.class, Collections.emptyList());
        map.put(oO0O0Oo0.class, Collections.emptyList());
        map.put(o00O0O0O.class, Collections.emptyList());
        map.put(ooo0o.class, Collections.emptyList());
        map.put(o0O000o0.class, Collections.emptyList());
        map.put(o00OOOOo.class, Collections.emptyList());
        map.put(oo0o0O0.class, Collections.emptyList());
        map.put(oO0oO000.class, Collections.emptyList());
        map.put(oO0O00o0.class, Collections.emptyList());
        map.put(o0O0O0o0.class, Collections.emptyList());
        map.put(o0O00.class, Collections.emptyList());
        map.put(oOo00ooO.class, Collections.emptyList());
        map.put(o0OOooO0.class, Collections.emptyList());
        map.put(oO0OoOO0.class, Collections.emptyList());
        map.put(oO0O000.class, Collections.emptyList());
        map.put(o00O0OO0.class, Collections.emptyList());
        map.put(o0OO00o0.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public final OooOo OooO0Oo() {
        return new OooOo(this, new HashMap(0), new HashMap(0), "MessageRecord", "ChatMessage", "UserRecord", "SystemMessage", "CommentNotice", "FriendsTable", "NewFriendsTable", "NewFans", "NewVisitor", "DraftMessageTable", "MusicTable", "SearchHistoryTable", "RoomHistory", "RoomJoinHistory", "RoomTheme", "ApiErrorCodeDB", "ReadPostTable", "TopicRecentTable", "BillingOrder", "UserInfoTable", "ConversationTable", "ChatMessageTable", "YallaTeamMessageTable", "SystemMessageTable", "FriendTable", "FriendRequestMessageTable", "SimpleMessageTable", "MomentMessageTable", "PayOrderTable", "SquareEventRoomTable", "BuriedPointTable", "HideContentTable");
    }

    @Override // androidx.room.RoomDatabase
    public final List OooO0o(@NonNull LinkedHashMap linkedHashMap) {
        return Arrays.asList(new o00000O0[0]);
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(OooO oooO) {
        o0Oo0oo callback = new o0Oo0oo(oooO, new OooO00o(), "90059d6bc2a40062e3120370c0bcf2af", "5e6b6dd674e1b7df0bd3275b9ee14cef");
        Context context = oooO.f34689OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return oooO.f34691OooO0OO.create(new SupportSQLiteOpenHelper.Configuration(context, oooO.f34690OooO0O0, callback, false));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<Object>> OooO0oo() {
        return new HashSet();
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00O00OO OooOOOO() {
        o00O0O0 o00o0o0;
        if (this.f22816OooOOoo != null) {
            return this.f22816OooOOoo;
        }
        synchronized (this) {
            if (this.f22816OooOOoo == null) {
                this.f22816OooOOoo = new o00O0O0(this);
            }
            o00o0o0 = this.f22816OooOOoo;
        }
        return o00o0o0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oo0o0O0 OooOOOo() {
        o0o0Oo o0o0oo;
        if (this.f22817OooOo != null) {
            return this.f22817OooOo;
        }
        synchronized (this) {
            if (this.f22817OooOo == null) {
                this.f22817OooOo = new o0o0Oo(this);
            }
            o0o0oo = this.f22817OooOo;
        }
        return o0o0oo;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O00 OooOOo() {
        o0OoO00O o0ooo00o2;
        if (this.f22826OooOoo0 != null) {
            return this.f22826OooOoo0;
        }
        synchronized (this) {
            if (this.f22826OooOoo0 == null) {
                this.f22826OooOoo0 = new o0OoO00O(this);
            }
            o0ooo00o2 = this.f22826OooOoo0;
        }
        return o0ooo00o2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o00OOOOo OooOOo0() {
        o0oOO o0ooo2;
        if (this.f22821OooOo0o != null) {
            return this.f22821OooOo0o;
        }
        synchronized (this) {
            if (this.f22821OooOo0o == null) {
                this.f22821OooOo0o = new o0oOO(this);
            }
            o0ooo2 = this.f22821OooOo0o;
        }
        return o0ooo2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O0O0o0 OooOOoo() {
        o0O0OO0 o0o0oo0;
        if (this.f22824OooOoOO != null) {
            return this.f22824OooOoOO;
        }
        synchronized (this) {
            if (this.f22824OooOoOO == null) {
                this.f22824OooOoOO = new o0O0OO0(this);
            }
            o0o0oo0 = this.f22824OooOoOO;
        }
        return o0o0oo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0000O OooOo() {
        oO000O0O oo000o0o;
        if (this.f22810OooOOO != null) {
            return this.f22810OooOOO;
        }
        synchronized (this) {
            if (this.f22810OooOOO == null) {
                this.f22810OooOOO = new oO000O0O(this);
            }
            oo000o0o = this.f22810OooOOO;
        }
        return oo000o0o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0O000 OooOo0() {
        oO0O00O oo0o00o;
        if (this.f22829Oooo000 != null) {
            return this.f22829Oooo000;
        }
        synchronized (this) {
            if (this.f22829Oooo000 == null) {
                this.f22829Oooo000 = new oO0O00O(this);
            }
            oo0o00o = this.f22829Oooo000;
        }
        return oo0o00o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0O0oo00 OooOo00() {
        o0OO00OO o0oo00oo2;
        if (this.f22811OooOOO0 != null) {
            return this.f22811OooOOO0;
        }
        synchronized (this) {
            if (this.f22811OooOOO0 == null) {
                this.f22811OooOOO0 = new o0OO00OO(this);
            }
            o0oo00oo2 = this.f22811OooOOO0;
        }
        return o0oo00oo2;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OO00o0 OooOo0O() {
        o0OO0O0 o0oo0o1;
        if (this.f22830Oooo00O != null) {
            return this.f22830Oooo00O;
        }
        synchronized (this) {
            if (this.f22830Oooo00O == null) {
                this.f22830Oooo00O = new o0OO0O0(this);
            }
            o0oo0o1 = this.f22830Oooo00O;
        }
        return o0oo0o1;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final o0OOooO0 OooOo0o() {
        o0OOO00 o0ooo00;
        if (this.f22827OooOooO != null) {
            return this.f22827OooOooO;
        }
        synchronized (this) {
            if (this.f22827OooOooO == null) {
                this.f22827OooOooO = new o0OOO00(this);
            }
            o0ooo00 = this.f22827OooOooO;
        }
        return o0ooo00;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO000Oo0 OooOoO() {
        oO000o00 oo000o00;
        if (this.f22819OooOo00 != null) {
            return this.f22819OooOo00;
        }
        synchronized (this) {
            if (this.f22819OooOo00 == null) {
                this.f22819OooOo00 = new oO000o00(this);
            }
            oo000o00 = this.f22819OooOo00;
        }
        return oo000o00;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0OoOO0 OooOoO0() {
        oO0OOo0o oo0ooo0o;
        if (this.f22828OooOooo != null) {
            return this.f22828OooOooo;
        }
        synchronized (this) {
            if (this.f22828OooOooo == null) {
                this.f22828OooOooo = new oO0OOo0o(this);
            }
            oo0ooo0o = this.f22828OooOooo;
        }
        return oo0ooo0o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0O0OoO OooOoOO() {
        oOo00OO0 ooo00oo0;
        if (this.f22813OooOOOo != null) {
            return this.f22813OooOOOo;
        }
        synchronized (this) {
            if (this.f22813OooOOOo == null) {
                this.f22813OooOOOo = new oOo00OO0(this);
            }
            ooo00oo0 = this.f22813OooOOOo;
        }
        return ooo00oo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO00OOOo OooOoo() {
        oO00Oo00 oo00oo00;
        if (this.f22814OooOOo != null) {
            return this.f22814OooOOo;
        }
        synchronized (this) {
            if (this.f22814OooOOo == null) {
                this.f22814OooOOo = new oO00Oo00(this);
            }
            oo00oo00 = this.f22814OooOOo;
        }
        return oo00oo00;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO00O0oO OooOoo0() {
        oO00OOO oo00ooo;
        if (this.f22815OooOOo0 != null) {
            return this.f22815OooOOo0;
        }
        synchronized (this) {
            if (this.f22815OooOOo0 == null) {
                this.f22815OooOOo0 = new oO00OOO(this);
            }
            oo00ooo = this.f22815OooOOo0;
        }
        return oo00ooo;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO00Oo0 OooOooO() {
        oOo00o0o ooo00o0o;
        if (this.f22812OooOOOO != null) {
            return this.f22812OooOOOO;
        }
        synchronized (this) {
            if (this.f22812OooOOOO == null) {
                this.f22812OooOOOO = new oOo00o0o(this);
            }
            ooo00o0o = this.f22812OooOOOO;
        }
        return ooo00o0o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oOo00ooO OooOooo() {
        oO0 oo0;
        if (this.f22825OooOoo != null) {
            return this.f22825OooOoo;
        }
        synchronized (this) {
            if (this.f22825OooOoo == null) {
                this.f22825OooOoo = new oO0(this);
            }
            oo0 = this.f22825OooOoo;
        }
        return oo0;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0oO000 Oooo0() {
        oOO0000 ooo0000;
        if (this.f22823OooOoO0 != null) {
            return this.f22823OooOoO0;
        }
        synchronized (this) {
            if (this.f22823OooOoO0 == null) {
                this.f22823OooOoO0 = new oOO0000(this);
            }
            ooo0000 = this.f22823OooOoO0;
        }
        return ooo0000;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0O00o0 Oooo000() {
        oOo0oooO ooo0oooo;
        if (this.f22822OooOoO != null) {
            return this.f22822OooOoO;
        }
        synchronized (this) {
            if (this.f22822OooOoO == null) {
                this.f22822OooOoO = new oOo0oooO(this);
            }
            ooo0oooo = this.f22822OooOoO;
        }
        return ooo0oooo;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final oO0O0Oo0 Oooo00O() {
        ooOOO00O ooooo00o;
        if (this.f22818OooOo0 != null) {
            return this.f22818OooOo0;
        }
        synchronized (this) {
            if (this.f22818OooOo0 == null) {
                this.f22818OooOo0 = new ooOOO00O(this);
            }
            ooooo00o = this.f22818OooOo0;
        }
        return ooooo00o;
    }

    @Override // com.yalla.yalla.data.db.YlAppDataBase
    public final ooo0o Oooo00o() {
        oO0Oo0o0 oo0oo0o0;
        if (this.f22820OooOo0O != null) {
            return this.f22820OooOo0O;
        }
        synchronized (this) {
            if (this.f22820OooOo0O == null) {
                this.f22820OooOo0O = new oO0Oo0o0(this);
            }
            oo0oo0o0 = this.f22820OooOo0O;
        }
        return oo0oo0o0;
    }
}
