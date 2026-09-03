package com.yalla.yalla.common.db;

import android.content.Context;
import androidx.room.OooO;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.app.base.fragment.ContributionFragment;
import com.facebook.AccessToken;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.ao;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p023Oooo00O.o000O00;
import p091o000o00o.o00000O0;
import p092o000o0O.o00Oo0;
import p092o000o0O.o00Ooo;
import p492o0o00O0.OooOOO;
import p492o0o00O0.OooOOOO;
import p492o0o00O0.OooOo;
import p492o0o00O0.OooOo00;
import p492o0o00O0.Oooo0;
import p492o0o00O0.Oooo000;
import p492o0o00O0.o000000O;
import p492o0o00O0.o000OOo;
import p492o0o00O0.o000oOoO;
import p492o0o00O0.o0Oo0oo;
import p492o0o00O0.o0ooOOo;
import p492o0o00O0.oo000o;
import p492o0o00O0.oo0o0Oo;
import p519o0o0O00O.o0000;
import p519o0o0O00O.o00000;
import p519o0o0O00O.o000000;
import p519o0o0O00O.o00000O;
import p519o0o0O00O.o00000OO;
import p519o0o0O00O.o0000O;
import p519o0o0O00O.o0000O0;
import p519o0o0O00O.o0000O00;
import p519o0o0O00O.o0000O0O;
import p519o0o0O00O.o0000Ooo;
import p519o0o0O00O.o0000oo;
import p519o0o0O00O.o000OO;
import p519o0o0O00O.o00O0O;
import p519o0o0O00O.o00oO0o;
import p519o0o0O00O.o0O0O00;
import p519o0o0O00O.o0OO00O;
import p519o0o0O00O.o0OOO0o;
import p519o0o0O00O.o0OoOo0;
import p715oooo00o.o0O000Oo;
import p715oooo00o.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
public final class YlAppDataBase_Impl extends YlAppDataBase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile o0OO00O f20595OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile o0O0O00 f20596OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile o0000O0 f20597OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile o0000Ooo f20598OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile o00000O f20599OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public volatile o0000O00 f20600OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile OooOo f20601OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o00000 f20602OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile o00O0O f20603OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public volatile o000OO f20604OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile o000OOo f20605OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile o000000O f20606OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile OooOOOO f20607OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile oo0o0Oo f20608OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile o000oOoO f20609OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile o0OOO0o f20610OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile o0ooOOo f20611OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile p492o0o00O0.o00O0O f20612OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile oo000o f20613Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile o0Oo0oo f20614Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public volatile p519o0o0O00O.oo000o f20615Oooo00o;

    public class OooO00o extends OooO.OooO00o {
        public OooO00o() {
            super(37);
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase) {
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MessageRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `title` TEXT, `message` TEXT, `type` INTEGER NOT NULL, `headphoto` TEXT, `scount` INTEGER NOT NULL, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `level` INTEGER NOT NULL, `isTop` INTEGER NOT NULL, `isTopTime` INTEGER NOT NULL, `dtime` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `status` INTEGER NOT NULL, `isread` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MessageRecord_midx_fromid` ON `MessageRecord` (`midx`, `fromid`)", "CREATE TABLE IF NOT EXISTS `ChatMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `midx` TEXT, `fromid` INTEGER NOT NULL, `toid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `msg` TEXT, `time` INTEGER NOT NULL, `ltime` INTEGER NOT NULL, `giftid` INTEGER NOT NULL, `number` INTEGER NOT NULL, `url` TEXT, `description` TEXT, `duration` INTEGER NOT NULL, `msgstatus` INTEGER NOT NULL, `filename` TEXT, `isread` INTEGER NOT NULL, `uid` TEXT, `warn` INTEGER NOT NULL, `gif_id` INTEGER, `gif_url` TEXT, `room_head` TEXT, `room_name` TEXT, `room_id` INTEGER, `room_idx` TEXT, `room_ip` TEXT, `moment_id` INTEGER, `moment_image` TEXT, `moment_text` TEXT, `moment_msg` TEXT, `topic_id` INTEGER, `topic_image` TEXT, `topic_name` TEXT, `topic_userCount` INTEGER, `topic_momentCount` INTEGER, `topic_msg` TEXT, `user_id` INTEGER, `user_idx` INTEGER, `user_head` TEXT, `user_name` TEXT, `user_msg` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessage_midx` ON `ChatMessage` (`midx`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `UserRecord` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` INTEGER NOT NULL, `headurl` TEXT, `nickname` TEXT, `time` INTEGER NOT NULL, `localtime` INTEGER NOT NULL, `level` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `sex` INTEGER NOT NULL, `prettyId` INTEGER NOT NULL, `role` INTEGER NOT NULL, `headframeurl` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserRecord_userid` ON `UserRecord` (`userid`)", "CREATE TABLE IF NOT EXISTS `SystemMessage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `data` TEXT, `content` TEXT, `localtime` INTEGER NOT NULL, `datetime` TEXT, `uid` TEXT, `isRead` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `topic_state` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessage_midx` ON `SystemMessage` (`midx`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `CommentNotice` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type_code` INTEGER NOT NULL, `midx` TEXT, `fromUser` TEXT, `fromUid` INTEGER NOT NULL, `msg` TEXT, `localtime` INTEGER NOT NULL, `moment` TEXT, `momentId` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `uid` TEXT, `isRead` INTEGER NOT NULL, `form_header` TEXT, `form_name` TEXT, `post_image` TEXT, `gift_id` INTEGER NOT NULL, `gift_image` TEXT, `gift_num` INTEGER NOT NULL, `delete_type` INTEGER NOT NULL, `objectId` INTEGER NOT NULL, `dyImg` TEXT, `hostImg` TEXT, `circleName` TEXT, `hostId` INTEGER NOT NULL, `commentId` INTEGER NOT NULL, `rewardType` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_CommentNotice_midx` ON `CommentNotice` (`midx`)", "CREATE TABLE IF NOT EXISTS `FriendsTable` (`id` TEXT NOT NULL, `name` TEXT, `head` TEXT, `vip` TEXT, `vip_level` TEXT, `idx` TEXT, `uid` TEXT NOT NULL, `sex` TEXT, `add_from` TEXT, `time` INTEGER NOT NULL, `role` INTEGER NOT NULL, `sign` TEXT, `headframeurl` TEXT, `check_warn` INTEGER NOT NULL, `memoName` TEXT, PRIMARY KEY(`id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_FriendsTable_id_uid` ON `FriendsTable` (`id`, `uid`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewFriendsTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userid` TEXT, `username` TEXT, `headphoto` TEXT, `uservip` TEXT, `state` TEXT, `message` TEXT, `time` INTEGER NOT NULL, `standbyone` TEXT, `standbytwo` TEXT, `standbythree` TEXT, `isRead` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `userLevel` INTEGER NOT NULL, `mid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFriendsTable_userid` ON `NewFriendsTable` (`userid`)", "CREATE TABLE IF NOT EXISTS `NewFans` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `fansid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewFans_fansid` ON `NewFans` (`fansid`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `NewVisitor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `visitorid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_NewVisitor_visitorid` ON `NewVisitor` (`visitorid`)", "CREATE TABLE IF NOT EXISTS `DraftMessageTable` (`uid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `userId`))", "CREATE INDEX IF NOT EXISTS `index_DraftMessageTable_uid_userId` ON `DraftMessageTable` (`uid`, `userId`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `MusicTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `mTitle` TEXT, `mTitleKey` TEXT, `mDuration` INTEGER NOT NULL, `mArtist` TEXT, `mArtistKey` TEXT, `mComposer` TEXT, `mAlbum` TEXT, `mAlbumKey` TEXT, `mDisplayName` TEXT, `mMimeType` TEXT, `mPath` TEXT, `user` TEXT, `initialLetter` TEXT, `isSelect` INTEGER NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MusicTable_mTitleKey` ON `MusicTable` (`mTitleKey`)", "CREATE TABLE IF NOT EXISTS `SearchHistoryTable` (`uid` INTEGER NOT NULL, `tag` TEXT NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`uid`, `tag`, `type`))", "CREATE INDEX IF NOT EXISTS `index_SearchHistoryTable_uid_tag_type` ON `SearchHistoryTable` (`uid`, `tag`, `type`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `RoomHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT, `time` INTEGER NOT NULL, `baridx` TEXT, `barname` TEXT, `barlevel` TEXT, `barimage` TEXT, `roomserverip` TEXT, `isencrypt` TEXT, `notice` TEXT, `labelname` TEXT, `istop` INTEGER NOT NULL, `countryid` TEXT, `isofficial` INTEGER NOT NULL, `bartype` TEXT, `medal` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomHistory_repeat` ON `RoomHistory` (`repeat`)", "CREATE TABLE IF NOT EXISTS `RoomJoinHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `repeat` TEXT, `barid` TEXT, `uid` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomJoinHistory_repeat` ON `RoomJoinHistory` (`repeat`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `RoomTheme` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `roomId` INTEGER NOT NULL, `roomTheme` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomTheme_roomId` ON `RoomTheme` (`roomId`)", "CREATE TABLE IF NOT EXISTS `ApiErrorCodeDB` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Code` TEXT, `MessgeEn` TEXT, `MessgeME` TEXT, `MessgeTr` TEXT, `MessgeIn` TEXT, `MessgePT` TEXT, `MessgeES` TEXT, `MessgeHi` TEXT, `MessgeUr` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ApiErrorCodeDB_Code` ON `ApiErrorCodeDB` (`Code`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `ReadPostTable` (`cid` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `readPostId` INTEGER NOT NULL, PRIMARY KEY(`cid`, `userId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ReadPostTable_cid_userId` ON `ReadPostTable` (`cid`, `userId`)", "CREATE TABLE IF NOT EXISTS `TopicRecentTable` (`topic_id` INTEGER NOT NULL, `topic_name` TEXT, `create_time` INTEGER NOT NULL, `uid` TEXT NOT NULL, PRIMARY KEY(`topic_id`, `uid`))", "CREATE INDEX IF NOT EXISTS `index_TopicRecentTable_topic_id_uid` ON `TopicRecentTable` (`topic_id`, `uid`)");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `BillingOrder` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `order_id` TEXT NOT NULL, `purchase_id` TEXT NOT NULL, `type` TEXT NOT NULL, `status` INTEGER NOT NULL, `sku` TEXT NOT NULL, `purchase_token` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT, `background` TEXT, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGER NOT NULL, `tags` TEXT NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, `kaVipState` INTEGER NOT NULL, `kaVipLevel` INTEGER NOT NULL, `showVIP` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`userId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_UserInfoTable_userId` ON `UserInfoTable` (`userId`)", "CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `momentType` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)", "CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `unknownMessage` TEXT NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER, `giftUrl` TEXT, `isGiftBlind` INTEGER, `isGiftCustomMade` INTEGER, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `momentType` INTEGER, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, `themeBgName` TEXT, `themeBgImgUrl` TEXT, `themeVideoUrl` TEXT, `themeDayLimit` INTEGER, `themeExpireTime` INTEGER, `themeGiveId` INTEGER, `themeState` INTEGER, `eventId` INTEGER, `eventName` TEXT, `eventImageUrl` TEXT, `eventTagId` INTEGER, `eventStartTime` INTEGER, `eventEndTime` INTEGER, `eventRoomId` INTEGER, `eventRoomName` TEXT, `eventRoomIp` TEXT, `eventDeleted` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `messageType` INTEGER NOT NULL, `jumpType` INTEGER NOT NULL, `jumpId` TEXT NOT NULL, `coverImage` TEXT NOT NULL, `detailImage` TEXT NOT NULL, `title` TEXT, `detailTitle` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `surveyMessageId` INTEGER, `surveyIsSubmit` INTEGER, `surveyScore` INTEGER, PRIMARY KEY(`uid`, `mid`))");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `awardType` INTEGER, `treasureBoxNumber` INTEGER, `treasureBoxImageUrl` TEXT, `kaVipType` INTEGER, `kaVipLevel` INTEGER, `rewardCoin` INTEGER, `messageType` INTEGER, `MemberBadgeFrozenInfo_roomId` INTEGER, `MemberBadgeFrozenInfo_roomName` TEXT, `MemberBadgeTopRankReward_shopId` INTEGER, `MemberBadgeTopRankReward_shopUrl` TEXT, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `nVIPLv` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, `custom_theme_cause` INTEGER, `give_theme_userId` INTEGER, `give_theme_dayNum` INTEGER, `eventName` TEXT, `eventMinute` INTEGER, `eventStartTime` INTEGER, `eventReason` TEXT, `reasonType` INTEGER, `eventRoomId` INTEGER, `eventId` INTEGER, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `FriendTable` (`uid` INTEGER NOT NULL, `friendId` INTEGER NOT NULL, `memoName` TEXT, `time` INTEGER NOT NULL, `inRoom` INTEGER NOT NULL, `deleteMark` INTEGER NOT NULL, `isCheckUserRisk` INTEGER NOT NULL, PRIMARY KEY(`uid`, `friendId`))");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendTable_uid_friendId` ON `FriendTable` (`uid`, `friendId`)", "CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)", "CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_SimpleMessageTable_uid_type` ON `SimpleMessageTable` (`uid`, `type`)", "CREATE TABLE IF NOT EXISTS `MomentMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `type` INTEGER NOT NULL, `userId_MomentPraise` INTEGER, `userNickName_MomentPraise` TEXT, `userHeadUrl_MomentPraise` TEXT, `momentId_MomentPraise` INTEGER, `momentImageUrl_MomentPraise` TEXT, `momentContent_MomentPraise` TEXT, `userId_CommentPraise` INTEGER, `userNickName_CommentPraise` TEXT, `userHeadUrl_CommentPraise` TEXT, `momentId_CommentPraise` INTEGER, `momentImageUrl_CommentPraise` TEXT, `momentContent_CommentPraise` TEXT, `userId_MomentComment` INTEGER, `userNickName_MomentComment` TEXT, `userHeadUrl_MomentComment` TEXT, `momentId_MomentComment` INTEGER, `momentImageUrl_MomentComment` TEXT, `momentContent_MomentComment` TEXT, `commentId_MomentComment` INTEGER, `commentContent_MomentComment` TEXT, `userId_CommentReply` INTEGER, `userNickName_CommentReply` TEXT, `userHeadUrl_CommentReply` TEXT, `momentId_CommentReply` INTEGER, `momentImageUrl_CommentReply` TEXT, `momentContent_CommentReply` TEXT, `commentId_CommentReply` INTEGER, `commentContent_CommentReply` TEXT, `replyId_CommentReply` INTEGER, `replyContent_CommentReply` TEXT, `userId_MomentAt` INTEGER, `userNickName_MomentAt` TEXT, `userHeadUrl_MomentAt` TEXT, `momentId_MomentAt` INTEGER, `momentImageUrl_MomentAt` TEXT, `momentContent_MomentAt` TEXT, `userId_CommentAt` INTEGER, `userNickName_CommentAt` TEXT, `userHeadUrl_CommentAt` TEXT, `momentId_CommentAt` INTEGER, `momentImageUrl_CommentAt` TEXT, `momentContent_CommentAt` TEXT, `commentId_CommentAt` INTEGER, `commentContent_CommentAt` TEXT, `userId_MomentGift` INTEGER, `userNickName_MomentGift` TEXT, `userHeadUrl_MomentGift` TEXT, `momentId_MomentGift` INTEGER, `momentImageUrl_MomentGift` TEXT, `giftNum_MomentGift` INTEGER, `giftImage_MomentGift` TEXT, `userId_CommentReward` INTEGER, `userNickName_CommentReward` TEXT, `userHeadUrl_CommentReward` TEXT, `momentId_CommentReward` INTEGER, `momentImageUrl_CommentReward` TEXT, `commentId_CommentReward` INTEGER, `commentContent_CommentReward` TEXT, `userId_ReplyReward` INTEGER, `userNickName_ReplyReward` TEXT, `userHeadUrl_ReplyReward` TEXT, `momentId_ReplyReward` INTEGER, `momentImageUrl_ReplyReward` TEXT, `commentId_ReplyReward` INTEGER, `commentContent_ReplyReward` TEXT, `momentId_MomentFeatured` INTEGER, `momentImageUrl_MomentFeatured` TEXT, `momentId_CommentFeatured` INTEGER, `momentImageUrl_CommentFeatured` TEXT, `momentContent_CommentFeatured` TEXT, `commentId_CommentFeatured` INTEGER, `userId_MomentTopicTop` INTEGER, `userHeadUrl_MomentTopicTop` TEXT, `momentImageUrl_MomentTopicTop` TEXT, `topicId_MomentTopicTop` INTEGER, `topicName_MomentTopicTop` TEXT, `userId_MomentTopicTopRevoke` INTEGER, `userHeadUrl_MomentTopicTopRevoke` TEXT, `momentImageUrl_MomentTopicTopRevoke` TEXT, `topicId_MomentTopicTopRevoke` INTEGER, `topicName_MomentTopicTopRevoke` TEXT, `userId_MomentTopicRemoveOwner` INTEGER, `userHeadUrl_MomentTopicRemoveOwner` TEXT, `momentImageUrl_MomentTopicRemoveOwner` TEXT, `momentId_MomentTopicRemoveOwner` INTEGER, `topicName_MomentTopicRemoveOwner` TEXT, `userId_MomentTopicRemoveAdmin` INTEGER, `userHeadUrl_MomentTopicRemoveAdmin` TEXT, `momentImageUrl_MomentTopicRemoveAdmin` TEXT, `momentId_MomentTopicRemoveAdmin` INTEGER, `topicName_MomentTopicRemoveAdmin` TEXT, `userId_TopicGroupCreateSuccessNotice` INTEGER, `nickName_TopicGroupCreateSuccessNotice` TEXT, `headUrl_TopicGroupCreateSuccessNotice` TEXT, `circleId_TopicGroupCreateSuccessNotice` INTEGER, `circleName_TopicGroupCreateSuccessNotice` TEXT, `circleHead_TopicGroupCreateSuccessNotice` TEXT, `type_TopicGroupCreateSuccessNotice` INTEGER, `groupOpenId_TopicGroupCreateSuccessNotice` TEXT, `userId_TopicGroupCreateOrJoinResult` INTEGER, `circleId_TopicGroupCreateOrJoinResult` INTEGER, `type_TopicGroupCreateOrJoinResult` INTEGER, `momentId_MomentSystemRemove` INTEGER, `momentImageUrl_MomentSystemRemove` TEXT, `deleteType_MomentSystemRemove` INTEGER, `commentId_CommentSystemRemove` INTEGER, `commentContent_CommentSystemRemove` TEXT, `deleteType_CommentSystemRemove` INTEGER, `deleteContent_CommentSystemRemove` TEXT, `momentId_MomentReportFeedback` INTEGER, `momentImageUrl_MomentReportFeedback` TEXT, `momentContent_MomentReportFeedback` TEXT, `momentTitle_MomentReportFeedback` TEXT, `commentId_CommentReportFeedback` INTEGER, `commentContent_CommentReportFeedback` TEXT, `momentImageUrl_CommentReportFeedback` TEXT, `commentTitle_CommentReportFeedback` TEXT, `commentCommentId_CommentReportFeedback` INTEGER, `commentCommentContent_CommentReportFeedback` TEXT, `circleId_CircleReportFeedback` INTEGER, `circleContent_CircleReportFeedback` TEXT, `circleImageUrl_CircleReportFeedback` TEXT, `circleTitle_CircleReportFeedback` TEXT, `topicUserId_TopicCreateSuccess` INTEGER, `topicId_TopicCreateSuccess` INTEGER, `topicName_TopicCreateSuccess` TEXT, `message_TopicCreateSuccess` TEXT, `topicUserId_TopicCreateFail` INTEGER, `topicId_TopicCreateFail` INTEGER, `topicName_TopicCreateFail` TEXT, `message_TopicCreateFail` TEXT, `failType_TopicCreateFail` INTEGER, `topicUserId_TopicCreateDisband` INTEGER, `topicId_TopicCreateDisband` INTEGER, `topicName_TopicCreateDisband` TEXT, `message_TopicCreateDisband` TEXT, `disbandContent_TopicCreateDisband` INTEGER, `topicId_TopicMemberAdd` INTEGER, `content_TopicMemberAdd` TEXT, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MomentMessageTable_uid_mid` ON `MomentMessageTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `PayOrderTable` (`user_id` INTEGER NOT NULL, `order_id` TEXT NOT NULL, `sku` TEXT NOT NULL, `amount` REAL, `type` INTEGER NOT NULL, `purchase_token` TEXT NOT NULL, `huaWeiAccountFlag` INTEGER NOT NULL, `isConsume` INTEGER NOT NULL, `purchaseState` INTEGER NOT NULL, `isAcknowledged` INTEGER NOT NULL, `isSubscription` INTEGER NOT NULL, `subscriptionState` INTEGER NOT NULL, `subscriptionId` TEXT NOT NULL, `subscriptionOrderId` TEXT NOT NULL, `createTime` INTEGER NOT NULL, PRIMARY KEY(`order_id`))");
            o000O00.OooO0O0(supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_PayOrderTable_order_id` ON `PayOrderTable` (`order_id`)", "CREATE TABLE IF NOT EXISTS `SquareEventRoomTable` (`mid` TEXT NOT NULL, `uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `roomId` INTEGER NOT NULL, `eventCreateTime` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_SquareEventRoomTable_uid_mid` ON `SquareEventRoomTable` (`uid`, `mid`)", "CREATE TABLE IF NOT EXISTS `BuriedPointTable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `device_brand` TEXT, `os_version` TEXT, `carrier` TEXT, `device_model` TEXT, `app_version` TEXT, `app_channel` TEXT, `ip` TEXT, `device_id` TEXT, `session_id` TEXT, `os` INTEGER NOT NULL, `user_id` TEXT, `event_id` TEXT, `event_type` INTEGER NOT NULL, `url` TEXT, `event_time` INTEGER NOT NULL, `room_id` INTEGER, `ext_info` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ca355523321b3bbfc57586cc1bd7ef52')");
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase) {
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `MessageRecord`", "DROP TABLE IF EXISTS `ChatMessage`", "DROP TABLE IF EXISTS `UserRecord`", "DROP TABLE IF EXISTS `SystemMessage`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `CommentNotice`", "DROP TABLE IF EXISTS `FriendsTable`", "DROP TABLE IF EXISTS `NewFriendsTable`", "DROP TABLE IF EXISTS `NewFans`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `NewVisitor`", "DROP TABLE IF EXISTS `DraftMessageTable`", "DROP TABLE IF EXISTS `MusicTable`", "DROP TABLE IF EXISTS `SearchHistoryTable`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `RoomHistory`", "DROP TABLE IF EXISTS `RoomJoinHistory`", "DROP TABLE IF EXISTS `RoomTheme`", "DROP TABLE IF EXISTS `ApiErrorCodeDB`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `ReadPostTable`", "DROP TABLE IF EXISTS `TopicRecentTable`", "DROP TABLE IF EXISTS `BillingOrder`", "DROP TABLE IF EXISTS `UserInfoTable`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `ConversationTable`", "DROP TABLE IF EXISTS `ChatMessageTable`", "DROP TABLE IF EXISTS `YallaTeamMessageTable`", "DROP TABLE IF EXISTS `SystemMessageTable`");
            o000O00.OooO0O0(supportSQLiteDatabase, "DROP TABLE IF EXISTS `FriendTable`", "DROP TABLE IF EXISTS `FriendRequestMessageTable`", "DROP TABLE IF EXISTS `SimpleMessageTable`", "DROP TABLE IF EXISTS `MomentMessageTable`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `PayOrderTable`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SquareEventRoomTable`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `BuriedPointTable`");
            List<RoomDatabase.OooO0O0> list = YlAppDataBase_Impl.this.f9312OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Objects.requireNonNull(YlAppDataBase_Impl.this.f9312OooO0oO.get(i));
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0OO() {
            List<RoomDatabase.OooO0O0> list = YlAppDataBase_Impl.this.f9312OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Objects.requireNonNull(YlAppDataBase_Impl.this.f9312OooO0oO.get(i));
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase) {
            YlAppDataBase_Impl.this.f9306OooO00o = supportSQLiteDatabase;
            YlAppDataBase_Impl.this.OooOO0o(supportSQLiteDatabase);
            List<RoomDatabase.OooO0O0> list = YlAppDataBase_Impl.this.f9312OooO0oO;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    YlAppDataBase_Impl.this.f9312OooO0oO.get(i).OooO00o(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase) {
            o00Oo0.OooO00o(supportSQLiteDatabase);
        }

        @Override // androidx.room.OooO.OooO00o
        public final void OooO0o0() {
        }

        @Override // androidx.room.OooO.OooO00o
        public final OooO.OooO0O0 OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(19);
            map.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map.put("midx", new o00Ooo.OooO00o("midx", "TEXT", false, 0, null, 1));
            map.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", false, 0, null, 1));
            map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", false, 0, null, 1));
            map.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map.put("headphoto", new o00Ooo.OooO00o("headphoto", "TEXT", false, 0, null, 1));
            map.put("scount", new o00Ooo.OooO00o("scount", "INTEGER", true, 0, null, 1));
            map.put("fromid", new o00Ooo.OooO00o("fromid", "INTEGER", true, 0, null, 1));
            map.put("toid", new o00Ooo.OooO00o("toid", "INTEGER", true, 0, null, 1));
            map.put("level", new o00Ooo.OooO00o("level", "INTEGER", true, 0, null, 1));
            map.put("isTop", new o00Ooo.OooO00o("isTop", "INTEGER", true, 0, null, 1));
            map.put("isTopTime", new o00Ooo.OooO00o("isTopTime", "INTEGER", true, 0, null, 1));
            map.put("dtime", new o00Ooo.OooO00o("dtime", "INTEGER", true, 0, null, 1));
            map.put("ltime", new o00Ooo.OooO00o("ltime", "INTEGER", true, 0, null, 1));
            map.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, new o00Ooo.OooO00o(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "INTEGER", true, 0, null, 1));
            map.put("isread", new o00Ooo.OooO00o("isread", "INTEGER", true, 0, null, 1));
            map.put("msgstatus", new o00Ooo.OooO00o("msgstatus", "INTEGER", true, 0, null, 1));
            map.put("role", new o00Ooo.OooO00o("role", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o = p108o000ooO0.o00Ooo.OooO00o(map, "headframeurl", new o00Ooo.OooO00o("headframeurl", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new o00Ooo.OooO0o("index_MessageRecord_midx_fromid", true, Arrays.asList("midx", "fromid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo2 = new o00Ooo("MessageRecord", map, hashSetOooO00o, hashSet);
            o00Ooo o00oooOooO00o = o00Ooo.OooO00o(supportSQLiteDatabase, "MessageRecord");
            if (!o00ooo2.equals(o00oooOooO00o)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("MessageRecord(com.yalla.yalla.data.db.model.MessageRecord).\n Expected:\n", o00ooo2, "\n Found:\n", o00oooOooO00o));
            }
            HashMap map2 = new HashMap(40);
            map2.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map2.put("midx", new o00Ooo.OooO00o("midx", "TEXT", false, 0, null, 1));
            map2.put("fromid", new o00Ooo.OooO00o("fromid", "INTEGER", true, 0, null, 1));
            map2.put("toid", new o00Ooo.OooO00o("toid", "INTEGER", true, 0, null, 1));
            map2.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map2.put("msg", new o00Ooo.OooO00o("msg", "TEXT", false, 0, null, 1));
            map2.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map2.put("ltime", new o00Ooo.OooO00o("ltime", "INTEGER", true, 0, null, 1));
            map2.put("giftid", new o00Ooo.OooO00o("giftid", "INTEGER", true, 0, null, 1));
            map2.put("number", new o00Ooo.OooO00o("number", "INTEGER", true, 0, null, 1));
            map2.put("url", new o00Ooo.OooO00o("url", "TEXT", false, 0, null, 1));
            map2.put("description", new o00Ooo.OooO00o("description", "TEXT", false, 0, null, 1));
            map2.put("duration", new o00Ooo.OooO00o("duration", "INTEGER", true, 0, null, 1));
            map2.put("msgstatus", new o00Ooo.OooO00o("msgstatus", "INTEGER", true, 0, null, 1));
            map2.put("filename", new o00Ooo.OooO00o("filename", "TEXT", false, 0, null, 1));
            map2.put("isread", new o00Ooo.OooO00o("isread", "INTEGER", true, 0, null, 1));
            map2.put("uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1));
            map2.put("warn", new o00Ooo.OooO00o("warn", "INTEGER", true, 0, null, 1));
            map2.put("gif_id", new o00Ooo.OooO00o("gif_id", "INTEGER", false, 0, null, 1));
            map2.put("gif_url", new o00Ooo.OooO00o("gif_url", "TEXT", false, 0, null, 1));
            map2.put("room_head", new o00Ooo.OooO00o("room_head", "TEXT", false, 0, null, 1));
            map2.put("room_name", new o00Ooo.OooO00o("room_name", "TEXT", false, 0, null, 1));
            map2.put("room_id", new o00Ooo.OooO00o("room_id", "INTEGER", false, 0, null, 1));
            map2.put("room_idx", new o00Ooo.OooO00o("room_idx", "TEXT", false, 0, null, 1));
            map2.put("room_ip", new o00Ooo.OooO00o("room_ip", "TEXT", false, 0, null, 1));
            map2.put("moment_id", new o00Ooo.OooO00o("moment_id", "INTEGER", false, 0, null, 1));
            map2.put("moment_image", new o00Ooo.OooO00o("moment_image", "TEXT", false, 0, null, 1));
            map2.put("moment_text", new o00Ooo.OooO00o("moment_text", "TEXT", false, 0, null, 1));
            map2.put("moment_msg", new o00Ooo.OooO00o("moment_msg", "TEXT", false, 0, null, 1));
            map2.put("topic_id", new o00Ooo.OooO00o("topic_id", "INTEGER", false, 0, null, 1));
            map2.put("topic_image", new o00Ooo.OooO00o("topic_image", "TEXT", false, 0, null, 1));
            map2.put("topic_name", new o00Ooo.OooO00o("topic_name", "TEXT", false, 0, null, 1));
            map2.put("topic_userCount", new o00Ooo.OooO00o("topic_userCount", "INTEGER", false, 0, null, 1));
            map2.put("topic_momentCount", new o00Ooo.OooO00o("topic_momentCount", "INTEGER", false, 0, null, 1));
            map2.put("topic_msg", new o00Ooo.OooO00o("topic_msg", "TEXT", false, 0, null, 1));
            map2.put(AccessToken.USER_ID_KEY, new o00Ooo.OooO00o(AccessToken.USER_ID_KEY, "INTEGER", false, 0, null, 1));
            map2.put("user_idx", new o00Ooo.OooO00o("user_idx", "INTEGER", false, 0, null, 1));
            map2.put("user_head", new o00Ooo.OooO00o("user_head", "TEXT", false, 0, null, 1));
            map2.put("user_name", new o00Ooo.OooO00o("user_name", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o2 = p108o000ooO0.o00Ooo.OooO00o(map2, "user_msg", new o00Ooo.OooO00o("user_msg", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new o00Ooo.OooO0o("index_ChatMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            o00Ooo o00ooo3 = new o00Ooo("ChatMessage", map2, hashSetOooO00o2, hashSet2);
            o00Ooo o00oooOooO00o2 = o00Ooo.OooO00o(supportSQLiteDatabase, "ChatMessage");
            if (!o00ooo3.equals(o00oooOooO00o2)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("ChatMessage(com.yalla.yalla.data.db.model.ChatMessageOld).\n Expected:\n", o00ooo3, "\n Found:\n", o00oooOooO00o2));
            }
            HashMap map3 = new HashMap(13);
            map3.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map3.put("userid", new o00Ooo.OooO00o("userid", "INTEGER", true, 0, null, 1));
            map3.put("headurl", new o00Ooo.OooO00o("headurl", "TEXT", false, 0, null, 1));
            map3.put("nickname", new o00Ooo.OooO00o("nickname", "TEXT", false, 0, null, 1));
            map3.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map3.put("localtime", new o00Ooo.OooO00o("localtime", "INTEGER", true, 0, null, 1));
            map3.put("level", new o00Ooo.OooO00o("level", "INTEGER", true, 0, null, 1));
            map3.put("vip", new o00Ooo.OooO00o("vip", "INTEGER", true, 0, null, 1));
            map3.put("vipLevel", new o00Ooo.OooO00o("vipLevel", "INTEGER", true, 0, null, 1));
            map3.put("sex", new o00Ooo.OooO00o("sex", "INTEGER", true, 0, null, 1));
            map3.put("prettyId", new o00Ooo.OooO00o("prettyId", "INTEGER", true, 0, null, 1));
            map3.put("role", new o00Ooo.OooO00o("role", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o3 = p108o000ooO0.o00Ooo.OooO00o(map3, "headframeurl", new o00Ooo.OooO00o("headframeurl", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new o00Ooo.OooO0o("index_UserRecord_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            o00Ooo o00ooo4 = new o00Ooo("UserRecord", map3, hashSetOooO00o3, hashSet3);
            o00Ooo o00oooOooO00o3 = o00Ooo.OooO00o(supportSQLiteDatabase, "UserRecord");
            if (!o00ooo4.equals(o00oooOooO00o3)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("UserRecord(com.yalla.yalla.data.db.model.UserRecord).\n Expected:\n", o00ooo4, "\n Found:\n", o00oooOooO00o3));
            }
            HashMap map4 = new HashMap(11);
            map4.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map4.put("type_code", new o00Ooo.OooO00o("type_code", "INTEGER", true, 0, null, 1));
            map4.put("midx", new o00Ooo.OooO00o("midx", "TEXT", false, 0, null, 1));
            map4.put("data", new o00Ooo.OooO00o("data", "TEXT", false, 0, null, 1));
            map4.put("content", new o00Ooo.OooO00o("content", "TEXT", false, 0, null, 1));
            map4.put("localtime", new o00Ooo.OooO00o("localtime", "INTEGER", true, 0, null, 1));
            map4.put("datetime", new o00Ooo.OooO00o("datetime", "TEXT", false, 0, null, 1));
            map4.put("uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1));
            map4.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map4.put("topic_id", new o00Ooo.OooO00o("topic_id", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o4 = p108o000ooO0.o00Ooo.OooO00o(map4, "topic_state", new o00Ooo.OooO00o("topic_state", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new o00Ooo.OooO0o("index_SystemMessage_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            o00Ooo o00ooo5 = new o00Ooo("SystemMessage", map4, hashSetOooO00o4, hashSet4);
            o00Ooo o00oooOooO00o4 = o00Ooo.OooO00o(supportSQLiteDatabase, "SystemMessage");
            if (!o00ooo5.equals(o00oooOooO00o4)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("SystemMessage(com.yalla.yalla.data.db.model.SystemMessageOld).\n Expected:\n", o00ooo5, "\n Found:\n", o00oooOooO00o4));
            }
            HashMap map5 = new HashMap(26);
            map5.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map5.put("type_code", new o00Ooo.OooO00o("type_code", "INTEGER", true, 0, null, 1));
            map5.put("midx", new o00Ooo.OooO00o("midx", "TEXT", false, 0, null, 1));
            map5.put("fromUser", new o00Ooo.OooO00o("fromUser", "TEXT", false, 0, null, 1));
            map5.put("fromUid", new o00Ooo.OooO00o("fromUid", "INTEGER", true, 0, null, 1));
            map5.put("msg", new o00Ooo.OooO00o("msg", "TEXT", false, 0, null, 1));
            map5.put("localtime", new o00Ooo.OooO00o("localtime", "INTEGER", true, 0, null, 1));
            map5.put("moment", new o00Ooo.OooO00o("moment", "TEXT", false, 0, null, 1));
            map5.put("momentId", new o00Ooo.OooO00o("momentId", "INTEGER", true, 0, null, 1));
            map5.put("cid", new o00Ooo.OooO00o("cid", "INTEGER", true, 0, null, 1));
            map5.put("uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1));
            map5.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map5.put("form_header", new o00Ooo.OooO00o("form_header", "TEXT", false, 0, null, 1));
            map5.put("form_name", new o00Ooo.OooO00o("form_name", "TEXT", false, 0, null, 1));
            map5.put("post_image", new o00Ooo.OooO00o("post_image", "TEXT", false, 0, null, 1));
            map5.put("gift_id", new o00Ooo.OooO00o("gift_id", "INTEGER", true, 0, null, 1));
            map5.put("gift_image", new o00Ooo.OooO00o("gift_image", "TEXT", false, 0, null, 1));
            map5.put("gift_num", new o00Ooo.OooO00o("gift_num", "INTEGER", true, 0, null, 1));
            map5.put("delete_type", new o00Ooo.OooO00o("delete_type", "INTEGER", true, 0, null, 1));
            map5.put("objectId", new o00Ooo.OooO00o("objectId", "INTEGER", true, 0, null, 1));
            map5.put("dyImg", new o00Ooo.OooO00o("dyImg", "TEXT", false, 0, null, 1));
            map5.put("hostImg", new o00Ooo.OooO00o("hostImg", "TEXT", false, 0, null, 1));
            map5.put("circleName", new o00Ooo.OooO00o("circleName", "TEXT", false, 0, null, 1));
            map5.put("hostId", new o00Ooo.OooO00o("hostId", "INTEGER", true, 0, null, 1));
            map5.put("commentId", new o00Ooo.OooO00o("commentId", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o5 = p108o000ooO0.o00Ooo.OooO00o(map5, "rewardType", new o00Ooo.OooO00o("rewardType", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new o00Ooo.OooO0o("index_CommentNotice_midx", true, Arrays.asList("midx"), Arrays.asList("ASC")));
            o00Ooo o00ooo6 = new o00Ooo("CommentNotice", map5, hashSetOooO00o5, hashSet5);
            o00Ooo o00oooOooO00o5 = o00Ooo.OooO00o(supportSQLiteDatabase, "CommentNotice");
            if (!o00ooo6.equals(o00oooOooO00o5)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("CommentNotice(com.yalla.yalla.data.db.model.CommentNoticeOld).\n Expected:\n", o00ooo6, "\n Found:\n", o00oooOooO00o5));
            }
            HashMap map6 = new HashMap(15);
            map6.put("id", new o00Ooo.OooO00o("id", "TEXT", true, 1, null, 1));
            map6.put("name", new o00Ooo.OooO00o("name", "TEXT", false, 0, null, 1));
            map6.put("head", new o00Ooo.OooO00o("head", "TEXT", false, 0, null, 1));
            map6.put("vip", new o00Ooo.OooO00o("vip", "TEXT", false, 0, null, 1));
            map6.put("vip_level", new o00Ooo.OooO00o("vip_level", "TEXT", false, 0, null, 1));
            map6.put("idx", new o00Ooo.OooO00o("idx", "TEXT", false, 0, null, 1));
            map6.put("uid", new o00Ooo.OooO00o("uid", "TEXT", true, 2, null, 1));
            map6.put("sex", new o00Ooo.OooO00o("sex", "TEXT", false, 0, null, 1));
            map6.put("add_from", new o00Ooo.OooO00o("add_from", "TEXT", false, 0, null, 1));
            map6.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map6.put("role", new o00Ooo.OooO00o("role", "INTEGER", true, 0, null, 1));
            map6.put("sign", new o00Ooo.OooO00o("sign", "TEXT", false, 0, null, 1));
            map6.put("headframeurl", new o00Ooo.OooO00o("headframeurl", "TEXT", false, 0, null, 1));
            map6.put("check_warn", new o00Ooo.OooO00o("check_warn", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o6 = p108o000ooO0.o00Ooo.OooO00o(map6, "memoName", new o00Ooo.OooO00o("memoName", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new o00Ooo.OooO0o("index_FriendsTable_id_uid", false, Arrays.asList("id", "uid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo7 = new o00Ooo("FriendsTable", map6, hashSetOooO00o6, hashSet6);
            o00Ooo o00oooOooO00o6 = o00Ooo.OooO00o(supportSQLiteDatabase, "FriendsTable");
            if (!o00ooo7.equals(o00oooOooO00o6)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("FriendsTable(com.yalla.yalla.data.db.model.FriendsTableOld).\n Expected:\n", o00ooo7, "\n Found:\n", o00oooOooO00o6));
            }
            HashMap map7 = new HashMap(17);
            map7.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map7.put("userid", new o00Ooo.OooO00o("userid", "TEXT", false, 0, null, 1));
            map7.put("username", new o00Ooo.OooO00o("username", "TEXT", false, 0, null, 1));
            map7.put("headphoto", new o00Ooo.OooO00o("headphoto", "TEXT", false, 0, null, 1));
            map7.put("uservip", new o00Ooo.OooO00o("uservip", "TEXT", false, 0, null, 1));
            map7.put(ServerProtocol.DIALOG_PARAM_STATE, new o00Ooo.OooO00o(ServerProtocol.DIALOG_PARAM_STATE, "TEXT", false, 0, null, 1));
            map7.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", false, 0, null, 1));
            map7.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map7.put("standbyone", new o00Ooo.OooO00o("standbyone", "TEXT", false, 0, null, 1));
            map7.put("standbytwo", new o00Ooo.OooO00o("standbytwo", "TEXT", false, 0, null, 1));
            map7.put("standbythree", new o00Ooo.OooO00o("standbythree", "TEXT", false, 0, null, 1));
            map7.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map7.put("gender", new o00Ooo.OooO00o("gender", "INTEGER", true, 0, null, 1));
            map7.put("vip", new o00Ooo.OooO00o("vip", "INTEGER", true, 0, null, 1));
            map7.put("vipLevel", new o00Ooo.OooO00o("vipLevel", "INTEGER", true, 0, null, 1));
            map7.put("userLevel", new o00Ooo.OooO00o("userLevel", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o7 = p108o000ooO0.o00Ooo.OooO00o(map7, "mid", new o00Ooo.OooO00o("mid", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new o00Ooo.OooO0o("index_NewFriendsTable_userid", true, Arrays.asList("userid"), Arrays.asList("ASC")));
            o00Ooo o00ooo8 = new o00Ooo("NewFriendsTable", map7, hashSetOooO00o7, hashSet7);
            o00Ooo o00oooOooO00o7 = o00Ooo.OooO00o(supportSQLiteDatabase, "NewFriendsTable");
            if (!o00ooo8.equals(o00oooOooO00o7)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("NewFriendsTable(com.yalla.yalla.data.db.model.NewFriendsOld).\n Expected:\n", o00ooo8, "\n Found:\n", o00oooOooO00o7));
            }
            HashMap map8 = new HashMap(3);
            map8.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map8.put("fansid", new o00Ooo.OooO00o("fansid", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o8 = p108o000ooO0.o00Ooo.OooO00o(map8, "uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new o00Ooo.OooO0o("index_NewFans_fansid", true, Arrays.asList("fansid"), Arrays.asList("ASC")));
            o00Ooo o00ooo9 = new o00Ooo("NewFans", map8, hashSetOooO00o8, hashSet8);
            o00Ooo o00oooOooO00o8 = o00Ooo.OooO00o(supportSQLiteDatabase, "NewFans");
            if (!o00ooo9.equals(o00oooOooO00o8)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("NewFans(com.yalla.yalla.data.db.model.NewFans).\n Expected:\n", o00ooo9, "\n Found:\n", o00oooOooO00o8));
            }
            HashMap map9 = new HashMap(3);
            map9.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map9.put("visitorid", new o00Ooo.OooO00o("visitorid", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o9 = p108o000ooO0.o00Ooo.OooO00o(map9, "uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new o00Ooo.OooO0o("index_NewVisitor_visitorid", true, Arrays.asList("visitorid"), Arrays.asList("ASC")));
            o00Ooo o00ooo10 = new o00Ooo("NewVisitor", map9, hashSetOooO00o9, hashSet9);
            o00Ooo o00oooOooO00o9 = o00Ooo.OooO00o(supportSQLiteDatabase, "NewVisitor");
            if (!o00ooo10.equals(o00oooOooO00o9)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("NewVisitor(com.yalla.yalla.data.db.model.NewVisitor).\n Expected:\n", o00ooo10, "\n Found:\n", o00oooOooO00o9));
            }
            HashMap map10 = new HashMap(4);
            map10.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map10.put("userId", new o00Ooo.OooO00o("userId", "INTEGER", true, 2, null, 1));
            map10.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            HashSet hashSetOooO00o10 = p108o000ooO0.o00Ooo.OooO00o(map10, "time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new o00Ooo.OooO0o("index_DraftMessageTable_uid_userId", false, Arrays.asList("uid", "userId"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo11 = new o00Ooo("DraftMessageTable", map10, hashSetOooO00o10, hashSet10);
            o00Ooo o00oooOooO00o10 = o00Ooo.OooO00o(supportSQLiteDatabase, "DraftMessageTable");
            if (!o00ooo11.equals(o00oooOooO00o10)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("DraftMessageTable(com.yalla.yalla.common.db.table.DraftMessage).\n Expected:\n", o00ooo11, "\n Found:\n", o00oooOooO00o10));
            }
            HashMap map11 = new HashMap(15);
            map11.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map11.put("mTitle", new o00Ooo.OooO00o("mTitle", "TEXT", false, 0, null, 1));
            map11.put("mTitleKey", new o00Ooo.OooO00o("mTitleKey", "TEXT", false, 0, null, 1));
            map11.put("mDuration", new o00Ooo.OooO00o("mDuration", "INTEGER", true, 0, null, 1));
            map11.put("mArtist", new o00Ooo.OooO00o("mArtist", "TEXT", false, 0, null, 1));
            map11.put("mArtistKey", new o00Ooo.OooO00o("mArtistKey", "TEXT", false, 0, null, 1));
            map11.put("mComposer", new o00Ooo.OooO00o("mComposer", "TEXT", false, 0, null, 1));
            map11.put("mAlbum", new o00Ooo.OooO00o("mAlbum", "TEXT", false, 0, null, 1));
            map11.put("mAlbumKey", new o00Ooo.OooO00o("mAlbumKey", "TEXT", false, 0, null, 1));
            map11.put("mDisplayName", new o00Ooo.OooO00o("mDisplayName", "TEXT", false, 0, null, 1));
            map11.put("mMimeType", new o00Ooo.OooO00o("mMimeType", "TEXT", false, 0, null, 1));
            map11.put("mPath", new o00Ooo.OooO00o("mPath", "TEXT", false, 0, null, 1));
            map11.put("user", new o00Ooo.OooO00o("user", "TEXT", false, 0, null, 1));
            map11.put("initialLetter", new o00Ooo.OooO00o("initialLetter", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o11 = p108o000ooO0.o00Ooo.OooO00o(map11, "isSelect", new o00Ooo.OooO00o("isSelect", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet11 = new HashSet(1);
            hashSet11.add(new o00Ooo.OooO0o("index_MusicTable_mTitleKey", true, Arrays.asList("mTitleKey"), Arrays.asList("ASC")));
            o00Ooo o00ooo12 = new o00Ooo("MusicTable", map11, hashSetOooO00o11, hashSet11);
            o00Ooo o00oooOooO00o11 = o00Ooo.OooO00o(supportSQLiteDatabase, "MusicTable");
            if (!o00ooo12.equals(o00oooOooO00o11)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("MusicTable(com.yalla.yalla.data.db.model.MusicTable).\n Expected:\n", o00ooo12, "\n Found:\n", o00oooOooO00o11));
            }
            HashMap map12 = new HashMap(4);
            map12.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map12.put(ViewHierarchyConstants.TAG_KEY, new o00Ooo.OooO00o(ViewHierarchyConstants.TAG_KEY, "TEXT", true, 2, null, 1));
            map12.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 3, null, 1));
            HashSet hashSetOooO00o12 = p108o000ooO0.o00Ooo.OooO00o(map12, "time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new o00Ooo.OooO0o("index_SearchHistoryTable_uid_tag_type", false, Arrays.asList("uid", ViewHierarchyConstants.TAG_KEY, "type"), Arrays.asList("ASC", "ASC", "ASC")));
            o00Ooo o00ooo13 = new o00Ooo("SearchHistoryTable", map12, hashSetOooO00o12, hashSet12);
            o00Ooo o00oooOooO00o12 = o00Ooo.OooO00o(supportSQLiteDatabase, "SearchHistoryTable");
            if (!o00ooo13.equals(o00oooOooO00o12)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("SearchHistoryTable(com.yalla.yalla.data.db.model.SearchHistoryTable).\n Expected:\n", o00ooo13, "\n Found:\n", o00oooOooO00o12));
            }
            HashMap map13 = new HashMap(18);
            map13.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map13.put("repeat", new o00Ooo.OooO00o("repeat", "TEXT", false, 0, null, 1));
            map13.put("barid", new o00Ooo.OooO00o("barid", "TEXT", false, 0, null, 1));
            map13.put("uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1));
            map13.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map13.put("baridx", new o00Ooo.OooO00o("baridx", "TEXT", false, 0, null, 1));
            map13.put("barname", new o00Ooo.OooO00o("barname", "TEXT", false, 0, null, 1));
            map13.put("barlevel", new o00Ooo.OooO00o("barlevel", "TEXT", false, 0, null, 1));
            map13.put("barimage", new o00Ooo.OooO00o("barimage", "TEXT", false, 0, null, 1));
            map13.put("roomserverip", new o00Ooo.OooO00o("roomserverip", "TEXT", false, 0, null, 1));
            map13.put("isencrypt", new o00Ooo.OooO00o("isencrypt", "TEXT", false, 0, null, 1));
            map13.put("notice", new o00Ooo.OooO00o("notice", "TEXT", false, 0, null, 1));
            map13.put("labelname", new o00Ooo.OooO00o("labelname", "TEXT", false, 0, null, 1));
            map13.put("istop", new o00Ooo.OooO00o("istop", "INTEGER", true, 0, null, 1));
            map13.put("countryid", new o00Ooo.OooO00o("countryid", "TEXT", false, 0, null, 1));
            map13.put("isofficial", new o00Ooo.OooO00o("isofficial", "INTEGER", true, 0, null, 1));
            map13.put("bartype", new o00Ooo.OooO00o("bartype", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o13 = p108o000ooO0.o00Ooo.OooO00o(map13, "medal", new o00Ooo.OooO00o("medal", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet13 = new HashSet(1);
            hashSet13.add(new o00Ooo.OooO0o("index_RoomHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            o00Ooo o00ooo14 = new o00Ooo("RoomHistory", map13, hashSetOooO00o13, hashSet13);
            o00Ooo o00oooOooO00o13 = o00Ooo.OooO00o(supportSQLiteDatabase, "RoomHistory");
            if (!o00ooo14.equals(o00oooOooO00o13)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("RoomHistory(com.yalla.yalla.data.db.model.RoomHistory).\n Expected:\n", o00ooo14, "\n Found:\n", o00oooOooO00o13));
            }
            HashMap map14 = new HashMap(4);
            map14.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map14.put("repeat", new o00Ooo.OooO00o("repeat", "TEXT", false, 0, null, 1));
            map14.put("barid", new o00Ooo.OooO00o("barid", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o14 = p108o000ooO0.o00Ooo.OooO00o(map14, "uid", new o00Ooo.OooO00o("uid", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new o00Ooo.OooO0o("index_RoomJoinHistory_repeat", true, Arrays.asList("repeat"), Arrays.asList("ASC")));
            o00Ooo o00ooo15 = new o00Ooo("RoomJoinHistory", map14, hashSetOooO00o14, hashSet14);
            o00Ooo o00oooOooO00o14 = o00Ooo.OooO00o(supportSQLiteDatabase, "RoomJoinHistory");
            if (!o00ooo15.equals(o00oooOooO00o14)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("RoomJoinHistory(com.yalla.yalla.data.db.model.RoomJoinHistory).\n Expected:\n", o00ooo15, "\n Found:\n", o00oooOooO00o14));
            }
            HashMap map15 = new HashMap(3);
            map15.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map15.put(ContributionFragment.ARG_1, new o00Ooo.OooO00o(ContributionFragment.ARG_1, "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o15 = p108o000ooO0.o00Ooo.OooO00o(map15, "roomTheme", new o00Ooo.OooO00o("roomTheme", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet15 = new HashSet(1);
            hashSet15.add(new o00Ooo.OooO0o("index_RoomTheme_roomId", true, Arrays.asList(ContributionFragment.ARG_1), Arrays.asList("ASC")));
            o00Ooo o00ooo16 = new o00Ooo("RoomTheme", map15, hashSetOooO00o15, hashSet15);
            o00Ooo o00oooOooO00o15 = o00Ooo.OooO00o(supportSQLiteDatabase, "RoomTheme");
            if (!o00ooo16.equals(o00oooOooO00o15)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("RoomTheme(com.yalla.yalla.data.db.model.RoomTheme).\n Expected:\n", o00ooo16, "\n Found:\n", o00oooOooO00o15));
            }
            HashMap map16 = new HashMap(10);
            map16.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map16.put("Code", new o00Ooo.OooO00o("Code", "TEXT", false, 0, null, 1));
            map16.put("MessgeEn", new o00Ooo.OooO00o("MessgeEn", "TEXT", false, 0, null, 1));
            map16.put("MessgeME", new o00Ooo.OooO00o("MessgeME", "TEXT", false, 0, null, 1));
            map16.put("MessgeTr", new o00Ooo.OooO00o("MessgeTr", "TEXT", false, 0, null, 1));
            map16.put("MessgeIn", new o00Ooo.OooO00o("MessgeIn", "TEXT", false, 0, null, 1));
            map16.put("MessgePT", new o00Ooo.OooO00o("MessgePT", "TEXT", false, 0, null, 1));
            map16.put("MessgeES", new o00Ooo.OooO00o("MessgeES", "TEXT", false, 0, null, 1));
            map16.put("MessgeHi", new o00Ooo.OooO00o("MessgeHi", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o16 = p108o000ooO0.o00Ooo.OooO00o(map16, "MessgeUr", new o00Ooo.OooO00o("MessgeUr", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet16 = new HashSet(1);
            hashSet16.add(new o00Ooo.OooO0o("index_ApiErrorCodeDB_Code", true, Arrays.asList("Code"), Arrays.asList("ASC")));
            o00Ooo o00ooo17 = new o00Ooo("ApiErrorCodeDB", map16, hashSetOooO00o16, hashSet16);
            o00Ooo o00oooOooO00o16 = o00Ooo.OooO00o(supportSQLiteDatabase, "ApiErrorCodeDB");
            if (!o00ooo17.equals(o00oooOooO00o16)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("ApiErrorCodeDB(com.yalla.yalla.data.db.model.ApiErrorCodeDB).\n Expected:\n", o00ooo17, "\n Found:\n", o00oooOooO00o16));
            }
            HashMap map17 = new HashMap(3);
            map17.put("cid", new o00Ooo.OooO00o("cid", "INTEGER", true, 1, null, 1));
            map17.put("userId", new o00Ooo.OooO00o("userId", "INTEGER", true, 2, null, 1));
            HashSet hashSetOooO00o17 = p108o000ooO0.o00Ooo.OooO00o(map17, "readPostId", new o00Ooo.OooO00o("readPostId", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet17 = new HashSet(1);
            hashSet17.add(new o00Ooo.OooO0o("index_ReadPostTable_cid_userId", true, Arrays.asList("cid", "userId"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo18 = new o00Ooo("ReadPostTable", map17, hashSetOooO00o17, hashSet17);
            o00Ooo o00oooOooO00o17 = o00Ooo.OooO00o(supportSQLiteDatabase, "ReadPostTable");
            if (!o00ooo18.equals(o00oooOooO00o17)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("ReadPostTable(com.yalla.yalla.data.db.model.ReadPostTable).\n Expected:\n", o00ooo18, "\n Found:\n", o00oooOooO00o17));
            }
            HashMap map18 = new HashMap(4);
            map18.put("topic_id", new o00Ooo.OooO00o("topic_id", "INTEGER", true, 1, null, 1));
            map18.put("topic_name", new o00Ooo.OooO00o("topic_name", "TEXT", false, 0, null, 1));
            map18.put("create_time", new o00Ooo.OooO00o("create_time", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o18 = p108o000ooO0.o00Ooo.OooO00o(map18, "uid", new o00Ooo.OooO00o("uid", "TEXT", true, 2, null, 1), 0);
            HashSet hashSet18 = new HashSet(1);
            hashSet18.add(new o00Ooo.OooO0o("index_TopicRecentTable_topic_id_uid", false, Arrays.asList("topic_id", "uid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo19 = new o00Ooo("TopicRecentTable", map18, hashSetOooO00o18, hashSet18);
            o00Ooo o00oooOooO00o18 = o00Ooo.OooO00o(supportSQLiteDatabase, "TopicRecentTable");
            if (!o00ooo19.equals(o00oooOooO00o18)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("TopicRecentTable(com.yalla.yalla.data.db.model.TopicRecentTable).\n Expected:\n", o00ooo19, "\n Found:\n", o00oooOooO00o18));
            }
            HashMap map19 = new HashMap(8);
            map19.put(ao.d, new o00Ooo.OooO00o(ao.d, "INTEGER", true, 1, null, 1));
            map19.put(AccessToken.USER_ID_KEY, new o00Ooo.OooO00o(AccessToken.USER_ID_KEY, "TEXT", true, 0, null, 1));
            map19.put("order_id", new o00Ooo.OooO00o("order_id", "TEXT", true, 0, null, 1));
            map19.put("purchase_id", new o00Ooo.OooO00o("purchase_id", "TEXT", true, 0, null, 1));
            map19.put("type", new o00Ooo.OooO00o("type", "TEXT", true, 0, null, 1));
            map19.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, new o00Ooo.OooO00o(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "INTEGER", true, 0, null, 1));
            map19.put("sku", new o00Ooo.OooO00o("sku", "TEXT", true, 0, null, 1));
            o00Ooo o00ooo20 = new o00Ooo("BillingOrder", map19, p108o000ooO0.o00Ooo.OooO00o(map19, "purchase_token", new o00Ooo.OooO00o("purchase_token", "TEXT", true, 0, null, 1), 0), new HashSet(0));
            o00Ooo o00oooOooO00o19 = o00Ooo.OooO00o(supportSQLiteDatabase, "BillingOrder");
            if (!o00ooo20.equals(o00oooOooO00o19)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("BillingOrder(com.yalla.yalla.data.db.model.BillingOrder).\n Expected:\n", o00ooo20, "\n Found:\n", o00oooOooO00o19));
            }
            HashMap map20 = new HashMap(27);
            map20.put("userId", new o00Ooo.OooO00o("userId", "INTEGER", true, 1, null, 1));
            map20.put("userIdx", new o00Ooo.OooO00o("userIdx", "TEXT", true, 0, null, 1));
            map20.put("idLevel", new o00Ooo.OooO00o("idLevel", "INTEGER", true, 0, null, 1));
            map20.put("userName", new o00Ooo.OooO00o("userName", "TEXT", true, 0, null, 1));
            map20.put("userAvatar", new o00Ooo.OooO00o("userAvatar", "TEXT", true, 0, null, 1));
            map20.put("userFrame", new o00Ooo.OooO00o("userFrame", "TEXT", false, 0, null, 1));
            map20.put("background", new o00Ooo.OooO00o("background", "TEXT", false, 0, null, 1));
            map20.put("userLevel", new o00Ooo.OooO00o("userLevel", "INTEGER", true, 0, null, 1));
            map20.put("gender", new o00Ooo.OooO00o("gender", "INTEGER", true, 0, null, 1));
            map20.put("bio", new o00Ooo.OooO00o("bio", "TEXT", false, 0, null, 1));
            map20.put("birthday", new o00Ooo.OooO00o("birthday", "TEXT", true, 0, null, 1));
            map20.put("age", new o00Ooo.OooO00o("age", "INTEGER", true, 0, null, 1));
            map20.put("countryId", new o00Ooo.OooO00o("countryId", "INTEGER", true, 0, null, 1));
            map20.put("region", new o00Ooo.OooO00o("region", "INTEGER", true, 0, null, 1));
            map20.put("medal", new o00Ooo.OooO00o("medal", "TEXT", false, 0, null, 1));
            map20.put("visitorNum", new o00Ooo.OooO00o("visitorNum", "INTEGER", true, 0, null, 1));
            map20.put("followedNum", new o00Ooo.OooO00o("followedNum", "INTEGER", true, 0, null, 1));
            map20.put("fansNum", new o00Ooo.OooO00o("fansNum", "INTEGER", true, 0, null, 1));
            map20.put("joinRoomNum", new o00Ooo.OooO00o("joinRoomNum", "INTEGER", true, 0, null, 1));
            map20.put("role", new o00Ooo.OooO00o("role", "INTEGER", true, 0, null, 1));
            map20.put("regTime", new o00Ooo.OooO00o("regTime", "INTEGER", true, 0, null, 1));
            map20.put("tags", new o00Ooo.OooO00o("tags", "TEXT", true, 0, null, 1));
            map20.put("vip", new o00Ooo.OooO00o("vip", "INTEGER", true, 0, null, 1));
            map20.put("vipLevel", new o00Ooo.OooO00o("vipLevel", "INTEGER", true, 0, null, 1));
            map20.put("kaVipState", new o00Ooo.OooO00o("kaVipState", "INTEGER", true, 0, null, 1));
            map20.put("kaVipLevel", new o00Ooo.OooO00o("kaVipLevel", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o19 = p108o000ooO0.o00Ooo.OooO00o(map20, "showVIP", new o00Ooo.OooO00o("showVIP", "INTEGER", true, 0, "1", 1), 0);
            HashSet hashSet19 = new HashSet(1);
            hashSet19.add(new o00Ooo.OooO0o("index_UserInfoTable_userId", true, Arrays.asList("userId"), Arrays.asList("ASC")));
            o00Ooo o00ooo21 = new o00Ooo("UserInfoTable", map20, hashSetOooO00o19, hashSet19);
            o00Ooo o00oooOooO00o20 = o00Ooo.OooO00o(supportSQLiteDatabase, "UserInfoTable");
            if (!o00ooo21.equals(o00oooOooO00o20)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("UserInfoTable(com.yalla.yalla.common.db.table.UserInfo).\n Expected:\n", o00ooo21, "\n Found:\n", o00oooOooO00o20));
            }
            HashMap map21 = new HashMap(14);
            map21.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 2, null, 1));
            map21.put("targetId", new o00Ooo.OooO00o("targetId", "INTEGER", true, 1, null, 1));
            map21.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 0, null, 1));
            map21.put("sendState", new o00Ooo.OooO00o("sendState", "INTEGER", true, 0, null, 1));
            map21.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", true, 0, null, 1));
            map21.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            map21.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map21.put("momentType", new o00Ooo.OooO00o("momentType", "INTEGER", true, 0, null, 1));
            map21.put("unReadCount", new o00Ooo.OooO00o("unReadCount", "INTEGER", true, 0, null, 1));
            map21.put("draft", new o00Ooo.OooO00o("draft", "TEXT", true, 0, null, 1));
            map21.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map21.put("topTime", new o00Ooo.OooO00o("topTime", "INTEGER", true, 0, null, 1));
            map21.put("isVoiceAndUnread", new o00Ooo.OooO00o("isVoiceAndUnread", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o20 = p108o000ooO0.o00Ooo.OooO00o(map21, "isAcceptMsg", new o00Ooo.OooO00o("isAcceptMsg", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet20 = new HashSet(1);
            hashSet20.add(new o00Ooo.OooO0o("index_ConversationTable_uid_targetId", true, Arrays.asList("uid", "targetId"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo22 = new o00Ooo("ConversationTable", map21, hashSetOooO00o20, hashSet20);
            o00Ooo o00oooOooO00o21 = o00Ooo.OooO00o(supportSQLiteDatabase, "ConversationTable");
            if (!o00ooo22.equals(o00oooOooO00o21)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("ConversationTable(com.yalla.yalla.common.db.table.Conversation).\n Expected:\n", o00ooo22, "\n Found:\n", o00oooOooO00o21));
            }
            HashMap map22 = new HashMap(67);
            map22.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map22.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 2, null, 1));
            map22.put("targetId", new o00Ooo.OooO00o("targetId", "INTEGER", true, 0, null, 1));
            map22.put("contentType", new o00Ooo.OooO00o("contentType", "INTEGER", true, 0, null, 1));
            map22.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            map22.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map22.put("sendState", new o00Ooo.OooO00o("sendState", "INTEGER", true, 0, null, 1));
            map22.put("isWarn", new o00Ooo.OooO00o("isWarn", "INTEGER", true, 0, null, 1));
            map22.put("isAcceptMsg", new o00Ooo.OooO00o("isAcceptMsg", "INTEGER", true, 0, null, 1));
            map22.put("unknownMessage", new o00Ooo.OooO00o("unknownMessage", "TEXT", true, 0, null, 1));
            map22.put("voiceUrl", new o00Ooo.OooO00o("voiceUrl", "TEXT", false, 0, null, 1));
            map22.put("voiceDuration", new o00Ooo.OooO00o("voiceDuration", "INTEGER", false, 0, null, 1));
            map22.put("voiceFileName", new o00Ooo.OooO00o("voiceFileName", "TEXT", false, 0, null, 1));
            map22.put("isVoiceRead", new o00Ooo.OooO00o("isVoiceRead", "INTEGER", false, 0, null, 1));
            map22.put("emoticonType", new o00Ooo.OooO00o("emoticonType", "INTEGER", false, 0, null, 1));
            map22.put("emoticonValue", new o00Ooo.OooO00o("emoticonValue", "INTEGER", false, 0, null, 1));
            map22.put("emoticonIsRead", new o00Ooo.OooO00o("emoticonIsRead", "INTEGER", false, 0, null, 1));
            map22.put("giftId", new o00Ooo.OooO00o("giftId", "INTEGER", false, 0, null, 1));
            map22.put("giftNumber", new o00Ooo.OooO00o("giftNumber", "INTEGER", false, 0, null, 1));
            map22.put("giftUrl", new o00Ooo.OooO00o("giftUrl", "TEXT", false, 0, null, 1));
            map22.put("isGiftBlind", new o00Ooo.OooO00o("isGiftBlind", "INTEGER", false, 0, null, 1));
            map22.put("isGiftCustomMade", new o00Ooo.OooO00o("isGiftCustomMade", "INTEGER", false, 0, null, 1));
            map22.put("gifId", new o00Ooo.OooO00o("gifId", "INTEGER", false, 0, null, 1));
            map22.put("gifUrl", new o00Ooo.OooO00o("gifUrl", "TEXT", false, 0, null, 1));
            map22.put("roomHeader", new o00Ooo.OooO00o("roomHeader", "TEXT", false, 0, null, 1));
            map22.put("roomName", new o00Ooo.OooO00o("roomName", "TEXT", false, 0, null, 1));
            map22.put(ContributionFragment.ARG_1, new o00Ooo.OooO00o(ContributionFragment.ARG_1, "INTEGER", false, 0, null, 1));
            map22.put("roomIdx", new o00Ooo.OooO00o("roomIdx", "INTEGER", false, 0, null, 1));
            map22.put("roomIp", new o00Ooo.OooO00o("roomIp", "TEXT", false, 0, null, 1));
            map22.put("momentId", new o00Ooo.OooO00o("momentId", "INTEGER", false, 0, null, 1));
            map22.put("momentImage", new o00Ooo.OooO00o("momentImage", "TEXT", false, 0, null, 1));
            map22.put("momentText", new o00Ooo.OooO00o("momentText", "TEXT", false, 0, null, 1));
            map22.put("momentMsg", new o00Ooo.OooO00o("momentMsg", "TEXT", false, 0, null, 1));
            map22.put("momentType", new o00Ooo.OooO00o("momentType", "INTEGER", false, 0, null, 1));
            map22.put("topicId", new o00Ooo.OooO00o("topicId", "INTEGER", false, 0, null, 1));
            map22.put("topicImage", new o00Ooo.OooO00o("topicImage", "TEXT", false, 0, null, 1));
            map22.put("topicName", new o00Ooo.OooO00o("topicName", "TEXT", false, 0, null, 1));
            map22.put("topicUserCount", new o00Ooo.OooO00o("topicUserCount", "INTEGER", false, 0, null, 1));
            map22.put("topicMomentCount", new o00Ooo.OooO00o("topicMomentCount", "INTEGER", false, 0, null, 1));
            map22.put("topicMsg", new o00Ooo.OooO00o("topicMsg", "TEXT", false, 0, null, 1));
            map22.put("shareUserId", new o00Ooo.OooO00o("shareUserId", "INTEGER", false, 0, null, 1));
            map22.put("shareUserIdx", new o00Ooo.OooO00o("shareUserIdx", "INTEGER", false, 0, null, 1));
            map22.put("shareUserHead", new o00Ooo.OooO00o("shareUserHead", "TEXT", false, 0, null, 1));
            map22.put("shareUserName", new o00Ooo.OooO00o("shareUserName", "TEXT", false, 0, null, 1));
            map22.put("shareUserMessage", new o00Ooo.OooO00o("shareUserMessage", "TEXT", false, 0, null, 1));
            map22.put("activityImage", new o00Ooo.OooO00o("activityImage", "TEXT", false, 0, null, 1));
            map22.put("activityText1", new o00Ooo.OooO00o("activityText1", "TEXT", false, 0, null, 1));
            map22.put("activityText2", new o00Ooo.OooO00o("activityText2", "TEXT", false, 0, null, 1));
            map22.put("activityMsg", new o00Ooo.OooO00o("activityMsg", "TEXT", false, 0, null, 1));
            map22.put("activityUrl", new o00Ooo.OooO00o("activityUrl", "TEXT", false, 0, null, 1));
            map22.put("themeBgName", new o00Ooo.OooO00o("themeBgName", "TEXT", false, 0, null, 1));
            map22.put("themeBgImgUrl", new o00Ooo.OooO00o("themeBgImgUrl", "TEXT", false, 0, null, 1));
            map22.put("themeVideoUrl", new o00Ooo.OooO00o("themeVideoUrl", "TEXT", false, 0, null, 1));
            map22.put("themeDayLimit", new o00Ooo.OooO00o("themeDayLimit", "INTEGER", false, 0, null, 1));
            map22.put("themeExpireTime", new o00Ooo.OooO00o("themeExpireTime", "INTEGER", false, 0, null, 1));
            map22.put("themeGiveId", new o00Ooo.OooO00o("themeGiveId", "INTEGER", false, 0, null, 1));
            map22.put("themeState", new o00Ooo.OooO00o("themeState", "INTEGER", false, 0, null, 1));
            map22.put("eventId", new o00Ooo.OooO00o("eventId", "INTEGER", false, 0, null, 1));
            map22.put("eventName", new o00Ooo.OooO00o("eventName", "TEXT", false, 0, null, 1));
            map22.put("eventImageUrl", new o00Ooo.OooO00o("eventImageUrl", "TEXT", false, 0, null, 1));
            map22.put("eventTagId", new o00Ooo.OooO00o("eventTagId", "INTEGER", false, 0, null, 1));
            map22.put("eventStartTime", new o00Ooo.OooO00o("eventStartTime", "INTEGER", false, 0, null, 1));
            map22.put("eventEndTime", new o00Ooo.OooO00o("eventEndTime", "INTEGER", false, 0, null, 1));
            map22.put("eventRoomId", new o00Ooo.OooO00o("eventRoomId", "INTEGER", false, 0, null, 1));
            map22.put("eventRoomName", new o00Ooo.OooO00o("eventRoomName", "TEXT", false, 0, null, 1));
            map22.put("eventRoomIp", new o00Ooo.OooO00o("eventRoomIp", "TEXT", false, 0, null, 1));
            HashSet hashSetOooO00o21 = p108o000ooO0.o00Ooo.OooO00o(map22, "eventDeleted", new o00Ooo.OooO00o("eventDeleted", "INTEGER", false, 0, null, 1), 0);
            HashSet hashSet21 = new HashSet(1);
            hashSet21.add(new o00Ooo.OooO0o("index_ChatMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo23 = new o00Ooo("ChatMessageTable", map22, hashSetOooO00o21, hashSet21);
            o00Ooo o00oooOooO00o22 = o00Ooo.OooO00o(supportSQLiteDatabase, "ChatMessageTable");
            if (!o00ooo23.equals(o00oooOooO00o22)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("ChatMessageTable(com.yalla.yalla.common.db.table.ChatMessage).\n Expected:\n", o00ooo23, "\n Found:\n", o00oooOooO00o22));
            }
            HashMap map23 = new HashMap(16);
            map23.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map23.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 2, null, 1));
            map23.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map23.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            map23.put("messageType", new o00Ooo.OooO00o("messageType", "INTEGER", true, 0, null, 1));
            map23.put("jumpType", new o00Ooo.OooO00o("jumpType", "INTEGER", true, 0, null, 1));
            map23.put("jumpId", new o00Ooo.OooO00o("jumpId", "TEXT", true, 0, null, 1));
            map23.put("coverImage", new o00Ooo.OooO00o("coverImage", "TEXT", true, 0, null, 1));
            map23.put("detailImage", new o00Ooo.OooO00o("detailImage", "TEXT", true, 0, null, 1));
            map23.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_TITLE, "TEXT", false, 0, null, 1));
            map23.put("detailTitle", new o00Ooo.OooO00o("detailTitle", "TEXT", true, 0, null, 1));
            map23.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map23.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map23.put("surveyMessageId", new o00Ooo.OooO00o("surveyMessageId", "INTEGER", false, 0, null, 1));
            map23.put("surveyIsSubmit", new o00Ooo.OooO00o("surveyIsSubmit", "INTEGER", false, 0, null, 1));
            HashSet hashSetOooO00o22 = p108o000ooO0.o00Ooo.OooO00o(map23, "surveyScore", new o00Ooo.OooO00o("surveyScore", "INTEGER", false, 0, null, 1), 0);
            HashSet hashSet22 = new HashSet(1);
            hashSet22.add(new o00Ooo.OooO0o("index_YallaTeamMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo24 = new o00Ooo("YallaTeamMessageTable", map23, hashSetOooO00o22, hashSet22);
            o00Ooo o00oooOooO00o23 = o00Ooo.OooO00o(supportSQLiteDatabase, "YallaTeamMessageTable");
            if (!o00ooo24.equals(o00oooOooO00o23)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("YallaTeamMessageTable(com.yalla.yalla.common.db.table.YallaTeamMessage).\n Expected:\n", o00ooo24, "\n Found:\n", o00oooOooO00o23));
            }
            HashMap map24 = new HashMap(47);
            map24.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 2, null, 1));
            map24.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map24.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            map24.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map24.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map24.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map24.put("vipLevel", new o00Ooo.OooO00o("vipLevel", "INTEGER", false, 0, null, 1));
            map24.put("awardType", new o00Ooo.OooO00o("awardType", "INTEGER", false, 0, null, 1));
            map24.put("treasureBoxNumber", new o00Ooo.OooO00o("treasureBoxNumber", "INTEGER", false, 0, null, 1));
            map24.put("treasureBoxImageUrl", new o00Ooo.OooO00o("treasureBoxImageUrl", "TEXT", false, 0, null, 1));
            map24.put("kaVipType", new o00Ooo.OooO00o("kaVipType", "INTEGER", false, 0, null, 1));
            map24.put("kaVipLevel", new o00Ooo.OooO00o("kaVipLevel", "INTEGER", false, 0, null, 1));
            map24.put("rewardCoin", new o00Ooo.OooO00o("rewardCoin", "INTEGER", false, 0, null, 1));
            map24.put("messageType", new o00Ooo.OooO00o("messageType", "INTEGER", false, 0, null, 1));
            map24.put("MemberBadgeFrozenInfo_roomId", new o00Ooo.OooO00o("MemberBadgeFrozenInfo_roomId", "INTEGER", false, 0, null, 1));
            map24.put("MemberBadgeFrozenInfo_roomName", new o00Ooo.OooO00o("MemberBadgeFrozenInfo_roomName", "TEXT", false, 0, null, 1));
            map24.put("MemberBadgeTopRankReward_shopId", new o00Ooo.OooO00o("MemberBadgeTopRankReward_shopId", "INTEGER", false, 0, null, 1));
            map24.put("MemberBadgeTopRankReward_shopUrl", new o00Ooo.OooO00o("MemberBadgeTopRankReward_shopUrl", "TEXT", false, 0, null, 1));
            map24.put("joinTopicId", new o00Ooo.OooO00o("joinTopicId", "INTEGER", false, 0, null, 1));
            map24.put("topicType", new o00Ooo.OooO00o("topicType", "INTEGER", false, 0, null, 1));
            map24.put("topicId", new o00Ooo.OooO00o("topicId", "INTEGER", false, 0, null, 1));
            map24.put("topicName", new o00Ooo.OooO00o("topicName", "TEXT", false, 0, null, 1));
            map24.put("topicFailType", new o00Ooo.OooO00o("topicFailType", "INTEGER", false, 0, null, 1));
            map24.put("userUpLevel", new o00Ooo.OooO00o("userUpLevel", "INTEGER", false, 0, null, 1));
            map24.put("userUpCoin", new o00Ooo.OooO00o("userUpCoin", "INTEGER", false, 0, null, 1));
            map24.put("userUpCrystal", new o00Ooo.OooO00o("userUpCrystal", "INTEGER", false, 0, null, 1));
            map24.put("roomUpLevel", new o00Ooo.OooO00o("roomUpLevel", "INTEGER", false, 0, null, 1));
            map24.put("roomWageCoin", new o00Ooo.OooO00o("roomWageCoin", "INTEGER", false, 0, null, 1));
            map24.put("aristocracyBuyType", new o00Ooo.OooO00o("aristocracyBuyType", "INTEGER", false, 0, null, 1));
            map24.put("aristocracyLevel", new o00Ooo.OooO00o("aristocracyLevel", "INTEGER", false, 0, null, 1));
            map24.put("nVIPLv", new o00Ooo.OooO00o("nVIPLv", "INTEGER", false, 0, null, 1));
            map24.put("uniqueIdExpirationTime", new o00Ooo.OooO00o("uniqueIdExpirationTime", "INTEGER", false, 0, null, 1));
            map24.put("consumerRebateCoin", new o00Ooo.OooO00o("consumerRebateCoin", "INTEGER", false, 0, null, 1));
            map24.put("unlockAvatarFrameUrl", new o00Ooo.OooO00o("unlockAvatarFrameUrl", "TEXT", false, 0, null, 1));
            map24.put("subscribeRewardCoin", new o00Ooo.OooO00o("subscribeRewardCoin", "INTEGER", false, 0, null, 1));
            map24.put("medalLevel", new o00Ooo.OooO00o("medalLevel", "INTEGER", false, 0, null, 1));
            map24.put("medalId", new o00Ooo.OooO00o("medalId", "INTEGER", false, 0, null, 1));
            map24.put("custom_theme_cause", new o00Ooo.OooO00o("custom_theme_cause", "INTEGER", false, 0, null, 1));
            map24.put("give_theme_userId", new o00Ooo.OooO00o("give_theme_userId", "INTEGER", false, 0, null, 1));
            map24.put("give_theme_dayNum", new o00Ooo.OooO00o("give_theme_dayNum", "INTEGER", false, 0, null, 1));
            map24.put("eventName", new o00Ooo.OooO00o("eventName", "TEXT", false, 0, null, 1));
            map24.put("eventMinute", new o00Ooo.OooO00o("eventMinute", "INTEGER", false, 0, null, 1));
            map24.put("eventStartTime", new o00Ooo.OooO00o("eventStartTime", "INTEGER", false, 0, null, 1));
            map24.put("eventReason", new o00Ooo.OooO00o("eventReason", "TEXT", false, 0, null, 1));
            map24.put("reasonType", new o00Ooo.OooO00o("reasonType", "INTEGER", false, 0, null, 1));
            map24.put("eventRoomId", new o00Ooo.OooO00o("eventRoomId", "INTEGER", false, 0, null, 1));
            HashSet hashSetOooO00o23 = p108o000ooO0.o00Ooo.OooO00o(map24, "eventId", new o00Ooo.OooO00o("eventId", "INTEGER", false, 0, null, 1), 0);
            HashSet hashSet23 = new HashSet(1);
            hashSet23.add(new o00Ooo.OooO0o("index_SystemMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo25 = new o00Ooo("SystemMessageTable", map24, hashSetOooO00o23, hashSet23);
            o00Ooo o00oooOooO00o24 = o00Ooo.OooO00o(supportSQLiteDatabase, "SystemMessageTable");
            if (!o00ooo25.equals(o00oooOooO00o24)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("SystemMessageTable(com.yalla.yalla.common.db.table.SystemMessage).\n Expected:\n", o00ooo25, "\n Found:\n", o00oooOooO00o24));
            }
            HashMap map25 = new HashMap(7);
            map25.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map25.put("friendId", new o00Ooo.OooO00o("friendId", "INTEGER", true, 2, null, 1));
            map25.put("memoName", new o00Ooo.OooO00o("memoName", "TEXT", false, 0, null, 1));
            map25.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map25.put("inRoom", new o00Ooo.OooO00o("inRoom", "INTEGER", true, 0, null, 1));
            map25.put("deleteMark", new o00Ooo.OooO00o("deleteMark", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o24 = p108o000ooO0.o00Ooo.OooO00o(map25, "isCheckUserRisk", new o00Ooo.OooO00o("isCheckUserRisk", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet24 = new HashSet(1);
            hashSet24.add(new o00Ooo.OooO0o("index_FriendTable_uid_friendId", true, Arrays.asList("uid", "friendId"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo26 = new o00Ooo("FriendTable", map25, hashSetOooO00o24, hashSet24);
            o00Ooo o00oooOooO00o25 = o00Ooo.OooO00o(supportSQLiteDatabase, "FriendTable");
            if (!o00ooo26.equals(o00oooOooO00o25)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("FriendTable(com.yalla.yalla.common.db.table.Friend).\n Expected:\n", o00ooo26, "\n Found:\n", o00oooOooO00o25));
            }
            HashMap map26 = new HashMap(7);
            map26.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map26.put("targetUserId", new o00Ooo.OooO00o("targetUserId", "INTEGER", true, 2, null, 1));
            map26.put("mid", new o00Ooo.OooO00o("mid", "TEXT", false, 0, null, 1));
            map26.put(ServerProtocol.DIALOG_PARAM_STATE, new o00Ooo.OooO00o(ServerProtocol.DIALOG_PARAM_STATE, "INTEGER", true, 0, null, 1));
            map26.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", false, 0, null, 1));
            map26.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o25 = p108o000ooO0.o00Ooo.OooO00o(map26, "isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet25 = new HashSet(1);
            hashSet25.add(new o00Ooo.OooO0o("index_FriendRequestMessageTable_uid_targetUserId", true, Arrays.asList("uid", "targetUserId"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo27 = new o00Ooo("FriendRequestMessageTable", map26, hashSetOooO00o25, hashSet25);
            o00Ooo o00oooOooO00o26 = o00Ooo.OooO00o(supportSQLiteDatabase, "FriendRequestMessageTable");
            if (!o00ooo27.equals(o00oooOooO00o26)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("FriendRequestMessageTable(com.yalla.yalla.common.db.table.FriendRequestMessage).\n Expected:\n", o00ooo27, "\n Found:\n", o00oooOooO00o26));
            }
            HashMap map27 = new HashMap(7);
            map27.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map27.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 2, null, 1));
            map27.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map27.put("content", new o00Ooo.OooO00o("content", "TEXT", false, 0, null, 1));
            map27.put("activityNum", new o00Ooo.OooO00o("activityNum", "INTEGER", false, 0, null, 1));
            map27.put("fansNum", new o00Ooo.OooO00o("fansNum", "INTEGER", false, 0, null, 1));
            HashSet hashSetOooO00o26 = p108o000ooO0.o00Ooo.OooO00o(map27, "visitorNum", new o00Ooo.OooO00o("visitorNum", "INTEGER", false, 0, null, 1), 0);
            HashSet hashSet26 = new HashSet(1);
            hashSet26.add(new o00Ooo.OooO0o("index_SimpleMessageTable_uid_type", true, Arrays.asList("uid", "type"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo28 = new o00Ooo("SimpleMessageTable", map27, hashSetOooO00o26, hashSet26);
            o00Ooo o00oooOooO00o27 = o00Ooo.OooO00o(supportSQLiteDatabase, "SimpleMessageTable");
            if (!o00ooo28.equals(o00oooOooO00o27)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("SimpleMessageTable(com.yalla.yalla.common.db.table.SimpleMessage).\n Expected:\n", o00ooo28, "\n Found:\n", o00oooOooO00o27));
            }
            HashMap map28 = new HashMap(145);
            map28.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map28.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 2, null, 1));
            map28.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new o00Ooo.OooO00o(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "TEXT", true, 0, null, 1));
            map28.put("time", new o00Ooo.OooO00o("time", "INTEGER", true, 0, null, 1));
            map28.put("isRead", new o00Ooo.OooO00o("isRead", "INTEGER", true, 0, null, 1));
            map28.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map28.put("userId_MomentPraise", new o00Ooo.OooO00o("userId_MomentPraise", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_MomentPraise", new o00Ooo.OooO00o("userNickName_MomentPraise", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_MomentPraise", new o00Ooo.OooO00o("userHeadUrl_MomentPraise", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentPraise", new o00Ooo.OooO00o("momentId_MomentPraise", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentPraise", new o00Ooo.OooO00o("momentImageUrl_MomentPraise", "TEXT", false, 0, null, 1));
            map28.put("momentContent_MomentPraise", new o00Ooo.OooO00o("momentContent_MomentPraise", "TEXT", false, 0, null, 1));
            map28.put("userId_CommentPraise", new o00Ooo.OooO00o("userId_CommentPraise", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_CommentPraise", new o00Ooo.OooO00o("userNickName_CommentPraise", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_CommentPraise", new o00Ooo.OooO00o("userHeadUrl_CommentPraise", "TEXT", false, 0, null, 1));
            map28.put("momentId_CommentPraise", new o00Ooo.OooO00o("momentId_CommentPraise", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_CommentPraise", new o00Ooo.OooO00o("momentImageUrl_CommentPraise", "TEXT", false, 0, null, 1));
            map28.put("momentContent_CommentPraise", new o00Ooo.OooO00o("momentContent_CommentPraise", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentComment", new o00Ooo.OooO00o("userId_MomentComment", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_MomentComment", new o00Ooo.OooO00o("userNickName_MomentComment", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_MomentComment", new o00Ooo.OooO00o("userHeadUrl_MomentComment", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentComment", new o00Ooo.OooO00o("momentId_MomentComment", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentComment", new o00Ooo.OooO00o("momentImageUrl_MomentComment", "TEXT", false, 0, null, 1));
            map28.put("momentContent_MomentComment", new o00Ooo.OooO00o("momentContent_MomentComment", "TEXT", false, 0, null, 1));
            map28.put("commentId_MomentComment", new o00Ooo.OooO00o("commentId_MomentComment", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_MomentComment", new o00Ooo.OooO00o("commentContent_MomentComment", "TEXT", false, 0, null, 1));
            map28.put("userId_CommentReply", new o00Ooo.OooO00o("userId_CommentReply", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_CommentReply", new o00Ooo.OooO00o("userNickName_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_CommentReply", new o00Ooo.OooO00o("userHeadUrl_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("momentId_CommentReply", new o00Ooo.OooO00o("momentId_CommentReply", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_CommentReply", new o00Ooo.OooO00o("momentImageUrl_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("momentContent_CommentReply", new o00Ooo.OooO00o("momentContent_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("commentId_CommentReply", new o00Ooo.OooO00o("commentId_CommentReply", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_CommentReply", new o00Ooo.OooO00o("commentContent_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("replyId_CommentReply", new o00Ooo.OooO00o("replyId_CommentReply", "INTEGER", false, 0, null, 1));
            map28.put("replyContent_CommentReply", new o00Ooo.OooO00o("replyContent_CommentReply", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentAt", new o00Ooo.OooO00o("userId_MomentAt", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_MomentAt", new o00Ooo.OooO00o("userNickName_MomentAt", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_MomentAt", new o00Ooo.OooO00o("userHeadUrl_MomentAt", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentAt", new o00Ooo.OooO00o("momentId_MomentAt", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentAt", new o00Ooo.OooO00o("momentImageUrl_MomentAt", "TEXT", false, 0, null, 1));
            map28.put("momentContent_MomentAt", new o00Ooo.OooO00o("momentContent_MomentAt", "TEXT", false, 0, null, 1));
            map28.put("userId_CommentAt", new o00Ooo.OooO00o("userId_CommentAt", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_CommentAt", new o00Ooo.OooO00o("userNickName_CommentAt", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_CommentAt", new o00Ooo.OooO00o("userHeadUrl_CommentAt", "TEXT", false, 0, null, 1));
            map28.put("momentId_CommentAt", new o00Ooo.OooO00o("momentId_CommentAt", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_CommentAt", new o00Ooo.OooO00o("momentImageUrl_CommentAt", "TEXT", false, 0, null, 1));
            map28.put("momentContent_CommentAt", new o00Ooo.OooO00o("momentContent_CommentAt", "TEXT", false, 0, null, 1));
            map28.put("commentId_CommentAt", new o00Ooo.OooO00o("commentId_CommentAt", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_CommentAt", new o00Ooo.OooO00o("commentContent_CommentAt", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentGift", new o00Ooo.OooO00o("userId_MomentGift", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_MomentGift", new o00Ooo.OooO00o("userNickName_MomentGift", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_MomentGift", new o00Ooo.OooO00o("userHeadUrl_MomentGift", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentGift", new o00Ooo.OooO00o("momentId_MomentGift", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentGift", new o00Ooo.OooO00o("momentImageUrl_MomentGift", "TEXT", false, 0, null, 1));
            map28.put("giftNum_MomentGift", new o00Ooo.OooO00o("giftNum_MomentGift", "INTEGER", false, 0, null, 1));
            map28.put("giftImage_MomentGift", new o00Ooo.OooO00o("giftImage_MomentGift", "TEXT", false, 0, null, 1));
            map28.put("userId_CommentReward", new o00Ooo.OooO00o("userId_CommentReward", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_CommentReward", new o00Ooo.OooO00o("userNickName_CommentReward", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_CommentReward", new o00Ooo.OooO00o("userHeadUrl_CommentReward", "TEXT", false, 0, null, 1));
            map28.put("momentId_CommentReward", new o00Ooo.OooO00o("momentId_CommentReward", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_CommentReward", new o00Ooo.OooO00o("momentImageUrl_CommentReward", "TEXT", false, 0, null, 1));
            map28.put("commentId_CommentReward", new o00Ooo.OooO00o("commentId_CommentReward", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_CommentReward", new o00Ooo.OooO00o("commentContent_CommentReward", "TEXT", false, 0, null, 1));
            map28.put("userId_ReplyReward", new o00Ooo.OooO00o("userId_ReplyReward", "INTEGER", false, 0, null, 1));
            map28.put("userNickName_ReplyReward", new o00Ooo.OooO00o("userNickName_ReplyReward", "TEXT", false, 0, null, 1));
            map28.put("userHeadUrl_ReplyReward", new o00Ooo.OooO00o("userHeadUrl_ReplyReward", "TEXT", false, 0, null, 1));
            map28.put("momentId_ReplyReward", new o00Ooo.OooO00o("momentId_ReplyReward", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_ReplyReward", new o00Ooo.OooO00o("momentImageUrl_ReplyReward", "TEXT", false, 0, null, 1));
            map28.put("commentId_ReplyReward", new o00Ooo.OooO00o("commentId_ReplyReward", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_ReplyReward", new o00Ooo.OooO00o("commentContent_ReplyReward", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentFeatured", new o00Ooo.OooO00o("momentId_MomentFeatured", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentFeatured", new o00Ooo.OooO00o("momentImageUrl_MomentFeatured", "TEXT", false, 0, null, 1));
            map28.put("momentId_CommentFeatured", new o00Ooo.OooO00o("momentId_CommentFeatured", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_CommentFeatured", new o00Ooo.OooO00o("momentImageUrl_CommentFeatured", "TEXT", false, 0, null, 1));
            map28.put("momentContent_CommentFeatured", new o00Ooo.OooO00o("momentContent_CommentFeatured", "TEXT", false, 0, null, 1));
            map28.put("commentId_CommentFeatured", new o00Ooo.OooO00o("commentId_CommentFeatured", "INTEGER", false, 0, null, 1));
            map28.put("userId_MomentTopicTop", new o00Ooo.OooO00o("userId_MomentTopicTop", "INTEGER", false, 0, null, 1));
            map28.put("userHeadUrl_MomentTopicTop", new o00Ooo.OooO00o("userHeadUrl_MomentTopicTop", "TEXT", false, 0, null, 1));
            map28.put("momentImageUrl_MomentTopicTop", new o00Ooo.OooO00o("momentImageUrl_MomentTopicTop", "TEXT", false, 0, null, 1));
            map28.put("topicId_MomentTopicTop", new o00Ooo.OooO00o("topicId_MomentTopicTop", "INTEGER", false, 0, null, 1));
            map28.put("topicName_MomentTopicTop", new o00Ooo.OooO00o("topicName_MomentTopicTop", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentTopicTopRevoke", new o00Ooo.OooO00o("userId_MomentTopicTopRevoke", "INTEGER", false, 0, null, 1));
            map28.put("userHeadUrl_MomentTopicTopRevoke", new o00Ooo.OooO00o("userHeadUrl_MomentTopicTopRevoke", "TEXT", false, 0, null, 1));
            map28.put("momentImageUrl_MomentTopicTopRevoke", new o00Ooo.OooO00o("momentImageUrl_MomentTopicTopRevoke", "TEXT", false, 0, null, 1));
            map28.put("topicId_MomentTopicTopRevoke", new o00Ooo.OooO00o("topicId_MomentTopicTopRevoke", "INTEGER", false, 0, null, 1));
            map28.put("topicName_MomentTopicTopRevoke", new o00Ooo.OooO00o("topicName_MomentTopicTopRevoke", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentTopicRemoveOwner", new o00Ooo.OooO00o("userId_MomentTopicRemoveOwner", "INTEGER", false, 0, null, 1));
            map28.put("userHeadUrl_MomentTopicRemoveOwner", new o00Ooo.OooO00o("userHeadUrl_MomentTopicRemoveOwner", "TEXT", false, 0, null, 1));
            map28.put("momentImageUrl_MomentTopicRemoveOwner", new o00Ooo.OooO00o("momentImageUrl_MomentTopicRemoveOwner", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentTopicRemoveOwner", new o00Ooo.OooO00o("momentId_MomentTopicRemoveOwner", "INTEGER", false, 0, null, 1));
            map28.put("topicName_MomentTopicRemoveOwner", new o00Ooo.OooO00o("topicName_MomentTopicRemoveOwner", "TEXT", false, 0, null, 1));
            map28.put("userId_MomentTopicRemoveAdmin", new o00Ooo.OooO00o("userId_MomentTopicRemoveAdmin", "INTEGER", false, 0, null, 1));
            map28.put("userHeadUrl_MomentTopicRemoveAdmin", new o00Ooo.OooO00o("userHeadUrl_MomentTopicRemoveAdmin", "TEXT", false, 0, null, 1));
            map28.put("momentImageUrl_MomentTopicRemoveAdmin", new o00Ooo.OooO00o("momentImageUrl_MomentTopicRemoveAdmin", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentTopicRemoveAdmin", new o00Ooo.OooO00o("momentId_MomentTopicRemoveAdmin", "INTEGER", false, 0, null, 1));
            map28.put("topicName_MomentTopicRemoveAdmin", new o00Ooo.OooO00o("topicName_MomentTopicRemoveAdmin", "TEXT", false, 0, null, 1));
            map28.put("userId_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("userId_TopicGroupCreateSuccessNotice", "INTEGER", false, 0, null, 1));
            map28.put("nickName_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("nickName_TopicGroupCreateSuccessNotice", "TEXT", false, 0, null, 1));
            map28.put("headUrl_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("headUrl_TopicGroupCreateSuccessNotice", "TEXT", false, 0, null, 1));
            map28.put("circleId_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("circleId_TopicGroupCreateSuccessNotice", "INTEGER", false, 0, null, 1));
            map28.put("circleName_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("circleName_TopicGroupCreateSuccessNotice", "TEXT", false, 0, null, 1));
            map28.put("circleHead_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("circleHead_TopicGroupCreateSuccessNotice", "TEXT", false, 0, null, 1));
            map28.put("type_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("type_TopicGroupCreateSuccessNotice", "INTEGER", false, 0, null, 1));
            map28.put("groupOpenId_TopicGroupCreateSuccessNotice", new o00Ooo.OooO00o("groupOpenId_TopicGroupCreateSuccessNotice", "TEXT", false, 0, null, 1));
            map28.put("userId_TopicGroupCreateOrJoinResult", new o00Ooo.OooO00o("userId_TopicGroupCreateOrJoinResult", "INTEGER", false, 0, null, 1));
            map28.put("circleId_TopicGroupCreateOrJoinResult", new o00Ooo.OooO00o("circleId_TopicGroupCreateOrJoinResult", "INTEGER", false, 0, null, 1));
            map28.put("type_TopicGroupCreateOrJoinResult", new o00Ooo.OooO00o("type_TopicGroupCreateOrJoinResult", "INTEGER", false, 0, null, 1));
            map28.put("momentId_MomentSystemRemove", new o00Ooo.OooO00o("momentId_MomentSystemRemove", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentSystemRemove", new o00Ooo.OooO00o("momentImageUrl_MomentSystemRemove", "TEXT", false, 0, null, 1));
            map28.put("deleteType_MomentSystemRemove", new o00Ooo.OooO00o("deleteType_MomentSystemRemove", "INTEGER", false, 0, null, 1));
            map28.put("commentId_CommentSystemRemove", new o00Ooo.OooO00o("commentId_CommentSystemRemove", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_CommentSystemRemove", new o00Ooo.OooO00o("commentContent_CommentSystemRemove", "TEXT", false, 0, null, 1));
            map28.put("deleteType_CommentSystemRemove", new o00Ooo.OooO00o("deleteType_CommentSystemRemove", "INTEGER", false, 0, null, 1));
            map28.put("deleteContent_CommentSystemRemove", new o00Ooo.OooO00o("deleteContent_CommentSystemRemove", "TEXT", false, 0, null, 1));
            map28.put("momentId_MomentReportFeedback", new o00Ooo.OooO00o("momentId_MomentReportFeedback", "INTEGER", false, 0, null, 1));
            map28.put("momentImageUrl_MomentReportFeedback", new o00Ooo.OooO00o("momentImageUrl_MomentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("momentContent_MomentReportFeedback", new o00Ooo.OooO00o("momentContent_MomentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("momentTitle_MomentReportFeedback", new o00Ooo.OooO00o("momentTitle_MomentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("commentId_CommentReportFeedback", new o00Ooo.OooO00o("commentId_CommentReportFeedback", "INTEGER", false, 0, null, 1));
            map28.put("commentContent_CommentReportFeedback", new o00Ooo.OooO00o("commentContent_CommentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("momentImageUrl_CommentReportFeedback", new o00Ooo.OooO00o("momentImageUrl_CommentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("commentTitle_CommentReportFeedback", new o00Ooo.OooO00o("commentTitle_CommentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("commentCommentId_CommentReportFeedback", new o00Ooo.OooO00o("commentCommentId_CommentReportFeedback", "INTEGER", false, 0, null, 1));
            map28.put("commentCommentContent_CommentReportFeedback", new o00Ooo.OooO00o("commentCommentContent_CommentReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("circleId_CircleReportFeedback", new o00Ooo.OooO00o("circleId_CircleReportFeedback", "INTEGER", false, 0, null, 1));
            map28.put("circleContent_CircleReportFeedback", new o00Ooo.OooO00o("circleContent_CircleReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("circleImageUrl_CircleReportFeedback", new o00Ooo.OooO00o("circleImageUrl_CircleReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("circleTitle_CircleReportFeedback", new o00Ooo.OooO00o("circleTitle_CircleReportFeedback", "TEXT", false, 0, null, 1));
            map28.put("topicUserId_TopicCreateSuccess", new o00Ooo.OooO00o("topicUserId_TopicCreateSuccess", "INTEGER", false, 0, null, 1));
            map28.put("topicId_TopicCreateSuccess", new o00Ooo.OooO00o("topicId_TopicCreateSuccess", "INTEGER", false, 0, null, 1));
            map28.put("topicName_TopicCreateSuccess", new o00Ooo.OooO00o("topicName_TopicCreateSuccess", "TEXT", false, 0, null, 1));
            map28.put("message_TopicCreateSuccess", new o00Ooo.OooO00o("message_TopicCreateSuccess", "TEXT", false, 0, null, 1));
            map28.put("topicUserId_TopicCreateFail", new o00Ooo.OooO00o("topicUserId_TopicCreateFail", "INTEGER", false, 0, null, 1));
            map28.put("topicId_TopicCreateFail", new o00Ooo.OooO00o("topicId_TopicCreateFail", "INTEGER", false, 0, null, 1));
            map28.put("topicName_TopicCreateFail", new o00Ooo.OooO00o("topicName_TopicCreateFail", "TEXT", false, 0, null, 1));
            map28.put("message_TopicCreateFail", new o00Ooo.OooO00o("message_TopicCreateFail", "TEXT", false, 0, null, 1));
            map28.put("failType_TopicCreateFail", new o00Ooo.OooO00o("failType_TopicCreateFail", "INTEGER", false, 0, null, 1));
            map28.put("topicUserId_TopicCreateDisband", new o00Ooo.OooO00o("topicUserId_TopicCreateDisband", "INTEGER", false, 0, null, 1));
            map28.put("topicId_TopicCreateDisband", new o00Ooo.OooO00o("topicId_TopicCreateDisband", "INTEGER", false, 0, null, 1));
            map28.put("topicName_TopicCreateDisband", new o00Ooo.OooO00o("topicName_TopicCreateDisband", "TEXT", false, 0, null, 1));
            map28.put("message_TopicCreateDisband", new o00Ooo.OooO00o("message_TopicCreateDisband", "TEXT", false, 0, null, 1));
            map28.put("disbandContent_TopicCreateDisband", new o00Ooo.OooO00o("disbandContent_TopicCreateDisband", "INTEGER", false, 0, null, 1));
            map28.put("topicId_TopicMemberAdd", new o00Ooo.OooO00o("topicId_TopicMemberAdd", "INTEGER", false, 0, null, 1));
            HashSet hashSetOooO00o27 = p108o000ooO0.o00Ooo.OooO00o(map28, "content_TopicMemberAdd", new o00Ooo.OooO00o("content_TopicMemberAdd", "TEXT", false, 0, null, 1), 0);
            HashSet hashSet27 = new HashSet(1);
            hashSet27.add(new o00Ooo.OooO0o("index_MomentMessageTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo29 = new o00Ooo("MomentMessageTable", map28, hashSetOooO00o27, hashSet27);
            o00Ooo o00oooOooO00o28 = o00Ooo.OooO00o(supportSQLiteDatabase, "MomentMessageTable");
            if (!o00ooo29.equals(o00oooOooO00o28)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("MomentMessageTable(com.yalla.yalla.common.db.table.MomentMessage).\n Expected:\n", o00ooo29, "\n Found:\n", o00oooOooO00o28));
            }
            HashMap map29 = new HashMap(15);
            map29.put(AccessToken.USER_ID_KEY, new o00Ooo.OooO00o(AccessToken.USER_ID_KEY, "INTEGER", true, 0, null, 1));
            map29.put("order_id", new o00Ooo.OooO00o("order_id", "TEXT", true, 1, null, 1));
            map29.put("sku", new o00Ooo.OooO00o("sku", "TEXT", true, 0, null, 1));
            map29.put("amount", new o00Ooo.OooO00o("amount", "REAL", false, 0, null, 1));
            map29.put("type", new o00Ooo.OooO00o("type", "INTEGER", true, 0, null, 1));
            map29.put("purchase_token", new o00Ooo.OooO00o("purchase_token", "TEXT", true, 0, null, 1));
            map29.put("huaWeiAccountFlag", new o00Ooo.OooO00o("huaWeiAccountFlag", "INTEGER", true, 0, null, 1));
            map29.put("isConsume", new o00Ooo.OooO00o("isConsume", "INTEGER", true, 0, null, 1));
            map29.put("purchaseState", new o00Ooo.OooO00o("purchaseState", "INTEGER", true, 0, null, 1));
            map29.put("isAcknowledged", new o00Ooo.OooO00o("isAcknowledged", "INTEGER", true, 0, null, 1));
            map29.put("isSubscription", new o00Ooo.OooO00o("isSubscription", "INTEGER", true, 0, null, 1));
            map29.put("subscriptionState", new o00Ooo.OooO00o("subscriptionState", "INTEGER", true, 0, null, 1));
            map29.put("subscriptionId", new o00Ooo.OooO00o("subscriptionId", "TEXT", true, 0, null, 1));
            map29.put("subscriptionOrderId", new o00Ooo.OooO00o("subscriptionOrderId", "TEXT", true, 0, null, 1));
            HashSet hashSetOooO00o28 = p108o000ooO0.o00Ooo.OooO00o(map29, "createTime", new o00Ooo.OooO00o("createTime", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet28 = new HashSet(1);
            hashSet28.add(new o00Ooo.OooO0o("index_PayOrderTable_order_id", true, Arrays.asList("order_id"), Arrays.asList("ASC")));
            o00Ooo o00ooo30 = new o00Ooo("PayOrderTable", map29, hashSetOooO00o28, hashSet28);
            o00Ooo o00oooOooO00o29 = o00Ooo.OooO00o(supportSQLiteDatabase, "PayOrderTable");
            if (!o00ooo30.equals(o00oooOooO00o29)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("PayOrderTable(com.yalla.yalla.common.db.table.PayOrder).\n Expected:\n", o00ooo30, "\n Found:\n", o00oooOooO00o29));
            }
            HashMap map30 = new HashMap(5);
            map30.put("mid", new o00Ooo.OooO00o("mid", "TEXT", true, 2, null, 1));
            map30.put("uid", new o00Ooo.OooO00o("uid", "INTEGER", true, 1, null, 1));
            map30.put("targetId", new o00Ooo.OooO00o("targetId", "INTEGER", true, 0, null, 1));
            map30.put(ContributionFragment.ARG_1, new o00Ooo.OooO00o(ContributionFragment.ARG_1, "INTEGER", true, 0, null, 1));
            HashSet hashSetOooO00o29 = p108o000ooO0.o00Ooo.OooO00o(map30, "eventCreateTime", new o00Ooo.OooO00o("eventCreateTime", "INTEGER", true, 0, null, 1), 0);
            HashSet hashSet29 = new HashSet(1);
            hashSet29.add(new o00Ooo.OooO0o("index_SquareEventRoomTable_uid_mid", true, Arrays.asList("uid", "mid"), Arrays.asList("ASC", "ASC")));
            o00Ooo o00ooo31 = new o00Ooo("SquareEventRoomTable", map30, hashSetOooO00o29, hashSet29);
            o00Ooo o00oooOooO00o30 = o00Ooo.OooO00o(supportSQLiteDatabase, "SquareEventRoomTable");
            if (!o00ooo31.equals(o00oooOooO00o30)) {
                return new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("SquareEventRoomTable(com.yalla.yalla.common.db.table.SquareEventRoom).\n Expected:\n", o00ooo31, "\n Found:\n", o00oooOooO00o30));
            }
            HashMap map31 = new HashMap(18);
            map31.put("id", new o00Ooo.OooO00o("id", "INTEGER", false, 1, null, 1));
            map31.put(ak.F, new o00Ooo.OooO00o(ak.F, "TEXT", false, 0, null, 1));
            map31.put("os_version", new o00Ooo.OooO00o("os_version", "TEXT", false, 0, null, 1));
            map31.put(ak.P, new o00Ooo.OooO00o(ak.P, "TEXT", false, 0, null, 1));
            map31.put("device_model", new o00Ooo.OooO00o("device_model", "TEXT", false, 0, null, 1));
            map31.put("app_version", new o00Ooo.OooO00o("app_version", "TEXT", false, 0, null, 1));
            map31.put("app_channel", new o00Ooo.OooO00o("app_channel", "TEXT", false, 0, null, 1));
            map31.put("ip", new o00Ooo.OooO00o("ip", "TEXT", false, 0, null, 1));
            map31.put("device_id", new o00Ooo.OooO00o("device_id", "TEXT", false, 0, null, 1));
            map31.put("session_id", new o00Ooo.OooO00o("session_id", "TEXT", false, 0, null, 1));
            map31.put(ak.x, new o00Ooo.OooO00o(ak.x, "INTEGER", true, 0, null, 1));
            map31.put(AccessToken.USER_ID_KEY, new o00Ooo.OooO00o(AccessToken.USER_ID_KEY, "TEXT", false, 0, null, 1));
            map31.put("event_id", new o00Ooo.OooO00o("event_id", "TEXT", false, 0, null, 1));
            map31.put("event_type", new o00Ooo.OooO00o("event_type", "INTEGER", true, 0, null, 1));
            map31.put("url", new o00Ooo.OooO00o("url", "TEXT", false, 0, null, 1));
            map31.put("event_time", new o00Ooo.OooO00o("event_time", "INTEGER", true, 0, null, 1));
            map31.put("room_id", new o00Ooo.OooO00o("room_id", "INTEGER", false, 0, null, 1));
            o00Ooo o00ooo32 = new o00Ooo("BuriedPointTable", map31, p108o000ooO0.o00Ooo.OooO00o(map31, "ext_info", new o00Ooo.OooO00o("ext_info", "TEXT", false, 0, null, 1), 0), new HashSet(0));
            o00Ooo o00oooOooO00o31 = o00Ooo.OooO00o(supportSQLiteDatabase, "BuriedPointTable");
            return !o00ooo32.equals(o00oooOooO00o31) ? new OooO.OooO0O0(false, p108o000ooO0.o00Oo0.OooO0O0("BuriedPointTable(com.yalla.yalla.data.db.model.BuriedPoint).\n Expected:\n", o00ooo32, "\n Found:\n", o00oooOooO00o31)) : new OooO.OooO0O0(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public final o00000O0 OooO0Oo() {
        return new o00000O0(this, new HashMap(0), new HashMap(0), "MessageRecord", "ChatMessage", "UserRecord", "SystemMessage", "CommentNotice", "FriendsTable", "NewFriendsTable", "NewFans", "NewVisitor", "DraftMessageTable", "MusicTable", "SearchHistoryTable", "RoomHistory", "RoomJoinHistory", "RoomTheme", "ApiErrorCodeDB", "ReadPostTable", "TopicRecentTable", "BillingOrder", "UserInfoTable", "ConversationTable", "ChatMessageTable", "YallaTeamMessageTable", "SystemMessageTable", "FriendTable", "FriendRequestMessageTable", "SimpleMessageTable", "MomentMessageTable", "PayOrderTable", "SquareEventRoomTable", "BuriedPointTable");
    }

    @Override // androidx.room.RoomDatabase
    public final List OooO0o() {
        return Arrays.asList(new o0O000o0[0]);
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper OooO0o0(androidx.room.OooO00o oooO00o) {
        OooO oooO = new OooO(oooO00o, new OooO00o(), "ca355523321b3bbfc57586cc1bd7ef52", "1f5724d37a2fd5a872193ad2d793aad8");
        Context context = oooO00o.f9291OooO0O0;
        String str = oooO00o.f9292OooO0OO;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return oooO00o.f9290OooO00o.create(new SupportSQLiteOpenHelper.Configuration(context, str, oooO, false));
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends o0O000Oo>> OooO0oO() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> OooO0oo() {
        HashMap map = new HashMap();
        map.put(o0000O.class, Collections.emptyList());
        map.put(o00oO0o.class, Collections.emptyList());
        map.put(p519o0o0O00O.o0Oo0oo.class, Collections.emptyList());
        map.put(p519o0o0O00O.oo0o0Oo.class, Collections.emptyList());
        map.put(o0000oo.class, Collections.emptyList());
        map.put(p519o0o0O00O.o000OOo.class, Collections.emptyList());
        map.put(o000000.class, Collections.emptyList());
        map.put(p519o0o0O00O.o00000O0.class, Collections.emptyList());
        map.put(o00000OO.class, Collections.emptyList());
        map.put(o0000.class, Collections.emptyList());
        map.put(o0OoOo0.class, Collections.emptyList());
        map.put(p519o0o0O00O.o000000O.class, Collections.emptyList());
        map.put(o0000O0O.class, Collections.emptyList());
        map.put(p519o0o0O00O.o00Oo0.class, Collections.emptyList());
        map.put(p492o0o00O0.o0O0O00.class, Collections.emptyList());
        map.put(Oooo000.class, Collections.emptyList());
        map.put(OooOo00.class, Collections.emptyList());
        map.put(OooOOO.class, Collections.emptyList());
        map.put(p492o0o00O0.o000000.class, Collections.emptyList());
        map.put(p492o0o00O0.o0OO00O.class, Collections.emptyList());
        map.put(p519o0o0O00O.o0ooOOo.class, Collections.emptyList());
        map.put(Oooo0.class, Collections.emptyList());
        map.put(p492o0o00O0.o00oO0o.class, Collections.emptyList());
        map.put(p492o0o00O0.o0OoOo0.class, Collections.emptyList());
        map.put(p492o0o00O0.o00Ooo.class, Collections.emptyList());
        map.put(p492o0o00O0.o0OOO0o.class, Collections.emptyList());
        map.put(p519o0o0O00O.o00Ooo.class, Collections.emptyList());
        return map;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final OooOOO OooOOo() {
        OooOOOO oooOOOO;
        if (this.f20607OooOoO0 != null) {
            return this.f20607OooOoO0;
        }
        synchronized (this) {
            if (this.f20607OooOoO0 == null) {
                this.f20607OooOoO0 = new OooOOOO(this);
            }
            oooOOOO = this.f20607OooOoO0;
        }
        return oooOOOO;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final o0OoOo0 OooOOo0() {
        o00O0O o00o0o2;
        if (this.f20603OooOo00 != null) {
            return this.f20603OooOo00;
        }
        synchronized (this) {
            if (this.f20603OooOo00 == null) {
                this.f20603OooOo00 = new o00O0O(this);
            }
            o00o0o2 = this.f20603OooOo00;
        }
        return o00o0o2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final OooOo00 OooOOoo() {
        OooOo oooOo;
        if (this.f20601OooOo != null) {
            return this.f20601OooOo;
        }
        synchronized (this) {
            if (this.f20601OooOo == null) {
                this.f20601OooOo = new OooOo(this);
            }
            oooOo = this.f20601OooOo;
        }
        return oooOo;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o0OOO0o OooOo() {
        o0Oo0oo o0oo0oo2;
        if (this.f20614Oooo00O != null) {
            return this.f20614Oooo00O;
        }
        synchronized (this) {
            if (this.f20614Oooo00O == null) {
                this.f20614Oooo00O = new o0Oo0oo(this);
            }
            o0oo0oo2 = this.f20614Oooo00O;
        }
        return o0oo0oo2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.o0ooOOo OooOo0() {
        o0OOO0o o0ooo0o2;
        if (this.f20610OooOoo0 != null) {
            return this.f20610OooOoo0;
        }
        synchronized (this) {
            if (this.f20610OooOoo0 == null) {
                this.f20610OooOoo0 = new o0OOO0o(this);
            }
            o0ooo0o2 = this.f20610OooOoo0;
        }
        return o0ooo0o2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final Oooo0 OooOo00() {
        o000oOoO o000oooo2;
        if (this.f20609OooOoo != null) {
            return this.f20609OooOoo;
        }
        synchronized (this) {
            if (this.f20609OooOoo == null) {
                this.f20609OooOoo = new o000oOoO(this);
            }
            o000oooo2 = this.f20609OooOoo;
        }
        return o000oooo2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.o0Oo0oo OooOo0O() {
        o0OO00O o0oo00o2;
        if (this.f20595OooOOO != null) {
            return this.f20595OooOOO;
        }
        synchronized (this) {
            if (this.f20595OooOOO == null) {
                this.f20595OooOOO = new o0OO00O(this);
            }
            o0oo00o2 = this.f20595OooOOO;
        }
        return o0oo00o2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.o00Ooo OooOo0o() {
        p519o0o0O00O.oo000o oo000oVar;
        if (this.f20615Oooo00o != null) {
            return this.f20615Oooo00o;
        }
        synchronized (this) {
            if (this.f20615Oooo00o == null) {
                this.f20615Oooo00o = new p519o0o0O00O.oo000o(this);
            }
            oo000oVar = this.f20615Oooo00o;
        }
        return oo000oVar;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.oo0o0Oo OooOoO() {
        o0O0O00 o0o0o00;
        if (this.f20596OooOOOO != null) {
            return this.f20596OooOOOO;
        }
        synchronized (this) {
            if (this.f20596OooOOOO == null) {
                this.f20596OooOOOO = new o0O0O00(this);
            }
            o0o0o00 = this.f20596OooOOOO;
        }
        return o0o0o00;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o0OoOo0 OooOoO0() {
        p492o0o00O0.o00O0O o00o0o2;
        if (this.f20612OooOooo != null) {
            return this.f20612OooOooo;
        }
        synchronized (this) {
            if (this.f20612OooOooo == null) {
                this.f20612OooOooo = new p492o0o00O0.o00O0O(this);
            }
            o00o0o2 = this.f20612OooOooo;
        }
        return o00o0o2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o00Ooo OooOoOO() {
        oo000o oo000oVar;
        if (this.f20613Oooo000 != null) {
            return this.f20613Oooo000;
        }
        synchronized (this) {
            if (this.f20613Oooo000 == null) {
                this.f20613Oooo000 = new oo000o(this);
            }
            oo000oVar = this.f20613Oooo000;
        }
        return oo000oVar;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.o00000O0 OooOoo() {
        o00000O o00000o;
        if (this.f20599OooOOo0 != null) {
            return this.f20599OooOOo0;
        }
        synchronized (this) {
            if (this.f20599OooOOo0 == null) {
                this.f20599OooOOo0 = new o00000O(this);
            }
            o00000o = this.f20599OooOOo0;
        }
        return o00000o;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p519o0o0O00O.o000000O OooOoo0() {
        o00000 o00000Var;
        if (this.f20602OooOo0 != null) {
            return this.f20602OooOo0;
        }
        synchronized (this) {
            if (this.f20602OooOo0 == null) {
                this.f20602OooOo0 = new o00000(this);
            }
            o00000Var = this.f20602OooOo0;
        }
        return o00000Var;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final o00000OO OooOooO() {
        o0000Ooo o0000ooo;
        if (this.f20598OooOOo != null) {
            return this.f20598OooOOo;
        }
        synchronized (this) {
            if (this.f20598OooOOo == null) {
                this.f20598OooOOo = new o0000Ooo(this);
            }
            o0000ooo = this.f20598OooOOo;
        }
        return o0000ooo;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final o0000 OooOooo() {
        o0000O00 o0000o00;
        if (this.f20600OooOOoo != null) {
            return this.f20600OooOOoo;
        }
        synchronized (this) {
            if (this.f20600OooOOoo == null) {
                this.f20600OooOOoo = new o0000O00(this);
            }
            o0000o00 = this.f20600OooOOoo;
        }
        return o0000o00;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final o0000O0O Oooo0() {
        o000OO o000oo2;
        if (this.f20604OooOo0O != null) {
            return this.f20604OooOo0O;
        }
        synchronized (this) {
            if (this.f20604OooOo0O == null) {
                this.f20604OooOo0O = new o000OO(this);
            }
            o000oo2 = this.f20604OooOo0O;
        }
        return o000oo2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final o0000oo Oooo000() {
        o0000O0 o0000o1;
        if (this.f20597OooOOOo != null) {
            return this.f20597OooOOOo;
        }
        synchronized (this) {
            if (this.f20597OooOOOo == null) {
                this.f20597OooOOOo = new o0000O0(this);
            }
            o0000o1 = this.f20597OooOOOo;
        }
        return o0000o1;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o00oO0o Oooo00O() {
        o0ooOOo o0ooooo2;
        if (this.f20611OooOooO != null) {
            return this.f20611OooOooO;
        }
        synchronized (this) {
            if (this.f20611OooOooO == null) {
                this.f20611OooOooO = new o0ooOOo(this);
            }
            o0ooooo2 = this.f20611OooOooO;
        }
        return o0ooooo2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o0OO00O Oooo00o() {
        oo0o0Oo oo0o0oo;
        if (this.f20608OooOoOO != null) {
            return this.f20608OooOoOO;
        }
        synchronized (this) {
            if (this.f20608OooOoOO == null) {
                this.f20608OooOoOO = new oo0o0Oo(this);
            }
            oo0o0oo = this.f20608OooOoOO;
        }
        return oo0o0oo;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o0O0O00 Oooo0O0() {
        o000OOo o000ooo2;
        if (this.f20605OooOo0o != null) {
            return this.f20605OooOo0o;
        }
        synchronized (this) {
            if (this.f20605OooOo0o == null) {
                this.f20605OooOo0o = new o000OOo(this);
            }
            o000ooo2 = this.f20605OooOo0o;
        }
        return o000ooo2;
    }

    @Override // com.yalla.yalla.common.db.YlAppDataBase
    public final p492o0o00O0.o000000 Oooo0OO() {
        o000000O o000000o2;
        if (this.f20606OooOoO != null) {
            return this.f20606OooOoO;
        }
        synchronized (this) {
            if (this.f20606OooOoO == null) {
                this.f20606OooOoO = new o000000O(this);
            }
            o000000o2 = this.f20606OooOoO;
        }
        return o000000o2;
    }
}
