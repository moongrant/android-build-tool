package p494o0o00O0O;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.app.base.fragment.ContributionFragment;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import p715oooo00o.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends o0O000o0 {
    public OooOOO() {
        super(21, 22);
    }

    public static Cursor OooO0oO(OooOOO oooOOO, SupportSQLiteDatabase supportSQLiteDatabase, String str, long j) {
        Objects.requireNonNull(oooOOO);
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT * FROM " + str + " LIMIT " + j + ",500");
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "db.query(\"SELECT * FROM …able LIMIT $start,$rows\")");
        return cursorQuery;
    }

    @Override // p715oooo00o.o0O000o0
    public final void OooO00o(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.beginTransaction();
        try {
            database.execSQL("CREATE TABLE IF NOT EXISTS `SimpleMessageTable` (`uid` INTEGER NOT NULL, `type` INTEGER NOT NULL, `time` INTEGER NOT NULL, `content` TEXT, `activityNum` INTEGER, `fansNum` INTEGER, `visitorNum` INTEGER, PRIMARY KEY(`uid`, `type`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SimpleMessageTable_uid_type` ON `SimpleMessageTable` (`uid`, `type`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `FriendTable` (`uid` INTEGER NOT NULL, `friendId` INTEGER NOT NULL, `memoName` TEXT, `time` INTEGER NOT NULL, `inRoom` INTEGER NOT NULL, `deleteMark` INTEGER NOT NULL, `isCheckUserRisk` INTEGER NOT NULL, PRIMARY KEY(`uid`, `friendId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendTable_uid_friendId` ON `FriendTable` (`uid`, `friendId`)");
            database.execSQL("DROP TABLE IF EXISTS `UserInfoTable` ");
            database.execSQL("CREATE TABLE IF NOT EXISTS `UserInfoTable` (`userId` INTEGER NOT NULL, `userIdx` TEXT NOT NULL, `idLevel` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userAvatar` TEXT NOT NULL, `userFrame` TEXT, `background` TEXT, `userLevel` INTEGER NOT NULL, `gender` INTEGER NOT NULL, `bio` TEXT, `birthday` TEXT NOT NULL, `age` INTEGER NOT NULL, `countryId` INTEGER NOT NULL, `region` INTEGER NOT NULL, `medal` TEXT, `visitorNum` INTEGER NOT NULL, `followedNum` INTEGER NOT NULL, `fansNum` INTEGER NOT NULL, `joinRoomNum` INTEGER NOT NULL, `role` INTEGER NOT NULL, `regTime` INTEGER NOT NULL, `tags` TEXT NOT NULL, `vip` INTEGER NOT NULL, `vipLevel` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserInfoTable_userId` ON `UserInfoTable` (`userId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `MomentMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `type` INTEGER NOT NULL, `userId_MomentPraise` INTEGER, `userNickName_MomentPraise` TEXT, `userHeadUrl_MomentPraise` TEXT, `momentId_MomentPraise` INTEGER, `momentImageUrl_MomentPraise` TEXT, `momentContent_MomentPraise` TEXT, `userId_CommentPraise` INTEGER, `userNickName_CommentPraise` TEXT, `userHeadUrl_CommentPraise` TEXT, `momentId_CommentPraise` INTEGER, `momentImageUrl_CommentPraise` TEXT, `momentContent_CommentPraise` TEXT, `userId_MomentComment` INTEGER, `userNickName_MomentComment` TEXT, `userHeadUrl_MomentComment` TEXT, `momentId_MomentComment` INTEGER, `momentImageUrl_MomentComment` TEXT, `momentContent_MomentComment` TEXT, `commentId_MomentComment` INTEGER, `commentContent_MomentComment` TEXT, `userId_CommentReply` INTEGER, `userNickName_CommentReply` TEXT, `userHeadUrl_CommentReply` TEXT, `momentId_CommentReply` INTEGER, `momentImageUrl_CommentReply` TEXT, `momentContent_CommentReply` TEXT, `commentId_CommentReply` INTEGER, `commentContent_CommentReply` TEXT, `replyId_CommentReply` INTEGER, `replyContent_CommentReply` TEXT, `userId_MomentAt` INTEGER, `userNickName_MomentAt` TEXT, `userHeadUrl_MomentAt` TEXT, `momentId_MomentAt` INTEGER, `momentImageUrl_MomentAt` TEXT, `momentContent_MomentAt` TEXT, `userId_CommentAt` INTEGER, `userNickName_CommentAt` TEXT, `userHeadUrl_CommentAt` TEXT, `momentId_CommentAt` INTEGER, `momentImageUrl_CommentAt` TEXT, `momentContent_CommentAt` TEXT, `commentId_CommentAt` INTEGER, `commentContent_CommentAt` TEXT, `userId_MomentGift` INTEGER, `userNickName_MomentGift` TEXT, `userHeadUrl_MomentGift` TEXT, `momentId_MomentGift` INTEGER, `momentImageUrl_MomentGift` TEXT, `giftNum_MomentGift` INTEGER, `giftImage_MomentGift` TEXT, `userId_CommentReward` INTEGER, `userNickName_CommentReward` TEXT, `userHeadUrl_CommentReward` TEXT, `momentId_CommentReward` INTEGER, `momentImageUrl_CommentReward` TEXT, `commentId_CommentReward` INTEGER, `commentContent_CommentReward` TEXT, `userId_ReplyReward` INTEGER, `userNickName_ReplyReward` TEXT, `userHeadUrl_ReplyReward` TEXT, `momentId_ReplyReward` INTEGER, `momentImageUrl_ReplyReward` TEXT, `commentId_ReplyReward` INTEGER, `commentContent_ReplyReward` TEXT, `momentId_MomentFeatured` INTEGER, `momentImageUrl_MomentFeatured` TEXT, `momentId_CommentFeatured` INTEGER, `momentImageUrl_CommentFeatured` TEXT, `momentContent_CommentFeatured` TEXT, `commentId_CommentFeatured` INTEGER, `userId_MomentTopicTop` INTEGER, `userHeadUrl_MomentTopicTop` TEXT, `momentImageUrl_MomentTopicTop` TEXT, `topicId_MomentTopicTop` INTEGER, `topicName_MomentTopicTop` TEXT, `userId_MomentTopicTopRevoke` INTEGER, `userHeadUrl_MomentTopicTopRevoke` TEXT, `momentImageUrl_MomentTopicTopRevoke` TEXT, `topicId_MomentTopicTopRevoke` INTEGER, `topicName_MomentTopicTopRevoke` TEXT, `userId_MomentTopicRemoveOwner` INTEGER, `userHeadUrl_MomentTopicRemoveOwner` TEXT, `momentImageUrl_MomentTopicRemoveOwner` TEXT, `momentId_MomentTopicRemoveOwner` INTEGER, `topicName_MomentTopicRemoveOwner` TEXT, `userId_MomentTopicRemoveAdmin` INTEGER, `userHeadUrl_MomentTopicRemoveAdmin` TEXT, `momentImageUrl_MomentTopicRemoveAdmin` TEXT, `momentId_MomentTopicRemoveAdmin` INTEGER, `topicName_MomentTopicRemoveAdmin` TEXT, `momentId_MomentSystemRemove` INTEGER, `momentImageUrl_MomentSystemRemove` TEXT, `deleteType_MomentSystemRemove` INTEGER, `commentId_CommentSystemRemove` INTEGER, `commentContent_CommentSystemRemove` TEXT, `deleteType_CommentSystemRemove` INTEGER, `deleteContent_CommentSystemRemove` TEXT, `momentId_MomentReportFeedback` INTEGER, `momentImageUrl_MomentReportFeedback` TEXT, `momentContent_MomentReportFeedback` TEXT, `commentId_CommentReportFeedback` INTEGER, `commentContent_CommentReportFeedback` TEXT, `momentImageUrl_CommentReportFeedback` TEXT, `topicUserId_TopicCreateSuccess` INTEGER, `topicId_TopicCreateSuccess` INTEGER, `topicName_TopicCreateSuccess` TEXT, `message_TopicCreateSuccess` TEXT, `topicUserId_TopicCreateFail` INTEGER, `topicId_TopicCreateFail` INTEGER, `topicName_TopicCreateFail` TEXT, `message_TopicCreateFail` TEXT, `failType_TopicCreateFail` INTEGER, `topicUserId_TopicCreateDisband` INTEGER, `topicId_TopicCreateDisband` INTEGER, `topicName_TopicCreateDisband` TEXT, `message_TopicCreateDisband` TEXT, `disbandContent_TopicCreateDisband` INTEGER, `topicId_TopicMemberAdd` INTEGER, `content_TopicMemberAdd` TEXT, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_MomentMessageTable_uid_mid` ON `MomentMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER,`giftUrl` TEXT, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, PRIMARY KEY(`uid`, `mid`))");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)");
            long jOooO0O0 = OooO0O0(database, "ChatMessage");
            if (jOooO0O0 > 0) {
                LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O0), 500L);
                long first = longProgressionStep.getFirst();
                long last = longProgressionStep.getLast();
                long step = longProgressionStep.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        OooO0o(database, OooO0OO(OooO0oO(this, database, "ChatMessage", first)));
                        if (first == last) {
                            break;
                        } else {
                            first += step;
                        }
                    }
                }
            }
            long jOooO0O1 = OooO0O0(database, "NewFriendsTable");
            if (jOooO0O1 > 0) {
                LongProgression longProgressionStep2 = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O1), 500L);
                long first2 = longProgressionStep2.getFirst();
                long last2 = longProgressionStep2.getLast();
                long step2 = longProgressionStep2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        OooO0o0(database, OooO0Oo(OooO0oO(this, database, "NewFriendsTable", first2)));
                        if (first2 == last2) {
                            break;
                        } else {
                            first2 += step2;
                        }
                    }
                }
            }
            long jOooO0O2 = OooO0O0(database, "CommentNotice");
            if (jOooO0O2 > 0) {
                LongProgression longProgressionStep3 = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O2), 500L);
                long first3 = longProgressionStep3.getFirst();
                long last3 = longProgressionStep3.getLast();
                long step3 = longProgressionStep3.getStep();
                if ((step3 > 0 && first3 <= last3) || (step3 < 0 && last3 <= first3)) {
                    while (true) {
                        OooOOOO.OooO0O0(database, OooOOOO.OooO00o(OooO0oO(this, database, "CommentNotice", first3)));
                        if (first3 == last3) {
                            break;
                        } else {
                            first3 += step3;
                        }
                    }
                }
            }
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public final long OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT COUNT(*) FROM " + str);
        if (cursorQuery.moveToFirst()) {
            return cursorQuery.getLong(0);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x026e A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0276 A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0280 A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x028a A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0294  */
    /* JADX WARN: Code duplicated, block: B:67:0x0295  */
    /* JADX WARN: Code duplicated, block: B:68:0x029d  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ec A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02f6 A[Catch: all -> 0x0409, TryCatch #0 {all -> 0x0409, blocks: (B:3:0x0002, B:4:0x0139, B:6:0x0141, B:8:0x0147, B:13:0x0161, B:15:0x0167, B:17:0x016d, B:19:0x0173, B:21:0x0179, B:26:0x01af, B:28:0x01b5, B:30:0x01bb, B:32:0x01c1, B:37:0x01ed, B:39:0x01f3, B:41:0x01f9, B:43:0x0201, B:45:0x0209, B:47:0x0213, B:55:0x0237, B:56:0x0268, B:58:0x026e, B:60:0x0276, B:62:0x0280, B:64:0x028a, B:73:0x02b6, B:74:0x02df, B:76:0x02ec, B:79:0x0303, B:83:0x03b5, B:78:0x02f6, B:36:0x01cd, B:25:0x0187, B:12:0x0150), top: B:93:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x03b0  */
    public final List<ChatMessageOld> OooO0OO(Cursor cursor) {
        ChatMessageOld.Gif gif;
        ChatMessageOld.ShareRoom shareRoom;
        ChatMessageOld.ShareMoment shareMoment;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ChatMessageOld.ShareTopic shareTopic;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ChatMessageOld.ShareUser shareUser;
        ChatMessageOld chatMessageOld;
        int i13;
        boolean z;
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("midx");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("fromid");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("toid");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("type");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("msg");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("time");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("ltime");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("giftid");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("number");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("url");
            int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("description");
            int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("msgstatus");
            int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("filename");
            int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("isread");
            int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("warn");
            int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("gif_id");
            int i14 = columnIndexOrThrow14;
            int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("gif_url");
            int i15 = columnIndexOrThrow13;
            int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("room_head");
            int i16 = columnIndexOrThrow12;
            int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("room_name");
            int i17 = columnIndexOrThrow11;
            int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("room_id");
            int i18 = columnIndexOrThrow10;
            int columnIndexOrThrow24 = cursor.getColumnIndexOrThrow("room_idx");
            int i19 = columnIndexOrThrow9;
            int columnIndexOrThrow25 = cursor.getColumnIndexOrThrow("room_ip");
            int i20 = columnIndexOrThrow8;
            int columnIndexOrThrow26 = cursor.getColumnIndexOrThrow("moment_id");
            int i21 = columnIndexOrThrow7;
            int columnIndexOrThrow27 = cursor.getColumnIndexOrThrow("moment_image");
            int i22 = columnIndexOrThrow6;
            int columnIndexOrThrow28 = cursor.getColumnIndexOrThrow("moment_text");
            int i23 = columnIndexOrThrow5;
            int columnIndexOrThrow29 = cursor.getColumnIndexOrThrow("moment_msg");
            int i24 = columnIndexOrThrow4;
            int columnIndexOrThrow30 = cursor.getColumnIndexOrThrow("topic_id");
            int i25 = columnIndexOrThrow3;
            int columnIndexOrThrow31 = cursor.getColumnIndexOrThrow("topic_image");
            int i26 = columnIndexOrThrow2;
            int columnIndexOrThrow32 = cursor.getColumnIndexOrThrow("topic_name");
            int i27 = columnIndexOrThrow;
            int columnIndexOrThrow33 = cursor.getColumnIndexOrThrow("topic_userCount");
            int columnIndexOrThrow34 = cursor.getColumnIndexOrThrow("topic_momentCount");
            int columnIndexOrThrow35 = cursor.getColumnIndexOrThrow("topic_msg");
            int columnIndexOrThrow36 = cursor.getColumnIndexOrThrow(AccessToken.USER_ID_KEY);
            int columnIndexOrThrow37 = cursor.getColumnIndexOrThrow("user_idx");
            int columnIndexOrThrow38 = cursor.getColumnIndexOrThrow("user_head");
            int columnIndexOrThrow39 = cursor.getColumnIndexOrThrow("user_name");
            int columnIndexOrThrow40 = cursor.getColumnIndexOrThrow("user_msg");
            int i28 = columnIndexOrThrow32;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (!cursor.moveToNext()) {
                    CloseableKt.closeFinally(cursor, null);
                    return arrayList2;
                }
                if (cursor.isNull(columnIndexOrThrow19) && cursor.isNull(columnIndexOrThrow20)) {
                    gif = null;
                } else {
                    gif = new ChatMessageOld.Gif();
                    gif.gifId = cursor.getInt(columnIndexOrThrow19);
                    gif.gifUrl = cursor.getString(columnIndexOrThrow20);
                }
                if (cursor.isNull(columnIndexOrThrow21) && cursor.isNull(columnIndexOrThrow22) && cursor.isNull(columnIndexOrThrow23) && cursor.isNull(columnIndexOrThrow24) && cursor.isNull(columnIndexOrThrow25)) {
                    shareRoom = null;
                } else {
                    shareRoom = new ChatMessageOld.ShareRoom();
                    shareRoom.roomHeader = cursor.getString(columnIndexOrThrow21);
                    shareRoom.roomName = cursor.getString(columnIndexOrThrow22);
                    shareRoom.roomId = cursor.getLong(columnIndexOrThrow23);
                    shareRoom.roomIdx = cursor.getString(columnIndexOrThrow24);
                    shareRoom.roomIp = cursor.getString(columnIndexOrThrow25);
                }
                if (cursor.isNull(columnIndexOrThrow26) && cursor.isNull(columnIndexOrThrow27) && cursor.isNull(columnIndexOrThrow28) && cursor.isNull(columnIndexOrThrow29)) {
                    shareMoment = null;
                } else {
                    shareMoment = new ChatMessageOld.ShareMoment();
                    shareMoment.momentId = cursor.getLong(columnIndexOrThrow26);
                    shareMoment.image = cursor.getString(columnIndexOrThrow27);
                    shareMoment.text = cursor.getString(columnIndexOrThrow28);
                    shareMoment.msg = cursor.getString(columnIndexOrThrow29);
                }
                if (cursor.isNull(columnIndexOrThrow30) && cursor.isNull(columnIndexOrThrow31)) {
                    i2 = i28;
                    if (cursor.isNull(i2)) {
                        i = columnIndexOrThrow33;
                        if (cursor.isNull(i)) {
                            i3 = columnIndexOrThrow29;
                            i4 = columnIndexOrThrow34;
                            if (cursor.isNull(i4)) {
                                i5 = columnIndexOrThrow28;
                                i6 = columnIndexOrThrow35;
                                if (cursor.isNull(i6)) {
                                    shareTopic = null;
                                }
                                if (cursor.isNull(columnIndexOrThrow36)) {
                                    i8 = columnIndexOrThrow37;
                                    if (cursor.isNull(i8)) {
                                        i7 = columnIndexOrThrow31;
                                        i9 = columnIndexOrThrow38;
                                        if (cursor.isNull(i9)) {
                                            i10 = columnIndexOrThrow30;
                                            i11 = columnIndexOrThrow39;
                                            if (cursor.isNull(i11)) {
                                                i4 = i4;
                                                i12 = columnIndexOrThrow40;
                                                if (cursor.isNull(i12)) {
                                                    shareUser = null;
                                                } else {
                                                    shareUser = new ChatMessageOld.ShareUser();
                                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                                    shareUser.idx = cursor.getLong(i8);
                                                    shareUser.head = cursor.getString(i9);
                                                    shareUser.name = cursor.getString(i11);
                                                    shareUser.msg = cursor.getString(i12);
                                                }
                                            }
                                        }
                                        chatMessageOld = new ChatMessageOld();
                                        i13 = i27;
                                        if (cursor.isNull(i13)) {
                                            chatMessageOld.id = null;
                                        } else {
                                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                        }
                                        int i29 = i26;
                                        int i30 = i11;
                                        chatMessageOld.mid = cursor.getString(i29);
                                        int i31 = i25;
                                        int i32 = i;
                                        chatMessageOld.from = cursor.getLong(i31);
                                        int i33 = i24;
                                        chatMessageOld.to = cursor.getLong(i33);
                                        int i34 = i23;
                                        chatMessageOld.type = cursor.getInt(i34);
                                        i23 = i34;
                                        int i35 = i22;
                                        chatMessageOld.msg = cursor.getString(i35);
                                        i22 = i35;
                                        int i36 = i21;
                                        int i37 = i12;
                                        chatMessageOld.time = cursor.getLong(i36);
                                        int i38 = i20;
                                        chatMessageOld.localtime = cursor.getLong(i38);
                                        int i39 = i19;
                                        chatMessageOld.giftid = cursor.getLong(i39);
                                        int i40 = i18;
                                        chatMessageOld.number = cursor.getInt(i40);
                                        i18 = i40;
                                        int i41 = i17;
                                        chatMessageOld.url = cursor.getString(i41);
                                        i17 = i41;
                                        int i42 = i16;
                                        chatMessageOld.description = cursor.getString(i42);
                                        i16 = i42;
                                        int i43 = i15;
                                        chatMessageOld.duration = cursor.getInt(i43);
                                        i15 = i43;
                                        int i44 = i14;
                                        chatMessageOld.msgstatus = cursor.getInt(i44);
                                        i14 = i44;
                                        int i45 = columnIndexOrThrow15;
                                        chatMessageOld.filename = cursor.getString(i45);
                                        columnIndexOrThrow15 = i45;
                                        int i46 = columnIndexOrThrow16;
                                        chatMessageOld.isRead = cursor.getInt(i46);
                                        columnIndexOrThrow16 = i46;
                                        int i47 = columnIndexOrThrow17;
                                        chatMessageOld.uid = cursor.getString(i47);
                                        columnIndexOrThrow18 = columnIndexOrThrow18;
                                        if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        chatMessageOld.isWarn = z;
                                        chatMessageOld.gif = gif;
                                        chatMessageOld.shareRoom = shareRoom;
                                        chatMessageOld.shareMoment = shareMoment;
                                        chatMessageOld.shareTopic = shareTopic;
                                        chatMessageOld.shareUser = shareUser;
                                        arrayList = arrayList2;
                                        arrayList.add(chatMessageOld);
                                        columnIndexOrThrow17 = i47;
                                        columnIndexOrThrow28 = i5;
                                        columnIndexOrThrow27 = columnIndexOrThrow27;
                                        columnIndexOrThrow31 = i7;
                                        columnIndexOrThrow30 = i10;
                                        columnIndexOrThrow34 = i4;
                                        columnIndexOrThrow35 = i6;
                                        columnIndexOrThrow26 = columnIndexOrThrow26;
                                        columnIndexOrThrow22 = columnIndexOrThrow22;
                                        columnIndexOrThrow36 = columnIndexOrThrow36;
                                        columnIndexOrThrow37 = i8;
                                        columnIndexOrThrow40 = i37;
                                        columnIndexOrThrow39 = i30;
                                        columnIndexOrThrow38 = i9;
                                        columnIndexOrThrow21 = columnIndexOrThrow21;
                                        i27 = i13;
                                        columnIndexOrThrow20 = columnIndexOrThrow20;
                                        i28 = i2;
                                        i21 = i36;
                                        i26 = i29;
                                        columnIndexOrThrow24 = columnIndexOrThrow24;
                                        i20 = i38;
                                        i19 = i39;
                                        columnIndexOrThrow25 = columnIndexOrThrow25;
                                        i24 = i33;
                                        columnIndexOrThrow29 = i3;
                                        columnIndexOrThrow33 = i32;
                                        i25 = i31;
                                    } else {
                                        i7 = columnIndexOrThrow31;
                                        i10 = columnIndexOrThrow30;
                                        i9 = columnIndexOrThrow38;
                                        i11 = columnIndexOrThrow39;
                                    }
                                    i12 = columnIndexOrThrow40;
                                    shareUser = new ChatMessageOld.ShareUser();
                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                    shareUser.idx = cursor.getLong(i8);
                                    shareUser.head = cursor.getString(i9);
                                    shareUser.name = cursor.getString(i11);
                                    shareUser.msg = cursor.getString(i12);
                                    chatMessageOld = new ChatMessageOld();
                                    i13 = i27;
                                    if (cursor.isNull(i13)) {
                                        chatMessageOld.id = null;
                                    } else {
                                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                    }
                                    int i210 = i26;
                                    int i310 = i11;
                                    chatMessageOld.mid = cursor.getString(i210);
                                    int i311 = i25;
                                    int i312 = i;
                                    chatMessageOld.from = cursor.getLong(i311);
                                    int i313 = i24;
                                    chatMessageOld.to = cursor.getLong(i313);
                                    int i314 = i23;
                                    chatMessageOld.type = cursor.getInt(i314);
                                    i23 = i314;
                                    int i315 = i22;
                                    chatMessageOld.msg = cursor.getString(i315);
                                    i22 = i315;
                                    int i316 = i21;
                                    int i317 = i12;
                                    chatMessageOld.time = cursor.getLong(i316);
                                    int i318 = i20;
                                    chatMessageOld.localtime = cursor.getLong(i318);
                                    int i319 = i19;
                                    chatMessageOld.giftid = cursor.getLong(i319);
                                    int i48 = i18;
                                    chatMessageOld.number = cursor.getInt(i48);
                                    i18 = i48;
                                    int i49 = i17;
                                    chatMessageOld.url = cursor.getString(i49);
                                    i17 = i49;
                                    int i410 = i16;
                                    chatMessageOld.description = cursor.getString(i410);
                                    i16 = i410;
                                    int i411 = i15;
                                    chatMessageOld.duration = cursor.getInt(i411);
                                    i15 = i411;
                                    int i412 = i14;
                                    chatMessageOld.msgstatus = cursor.getInt(i412);
                                    i14 = i412;
                                    int i413 = columnIndexOrThrow15;
                                    chatMessageOld.filename = cursor.getString(i413);
                                    columnIndexOrThrow15 = i413;
                                    int i414 = columnIndexOrThrow16;
                                    chatMessageOld.isRead = cursor.getInt(i414);
                                    columnIndexOrThrow16 = i414;
                                    int i415 = columnIndexOrThrow17;
                                    chatMessageOld.uid = cursor.getString(i415);
                                    columnIndexOrThrow18 = columnIndexOrThrow18;
                                    if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    chatMessageOld.isWarn = z;
                                    chatMessageOld.gif = gif;
                                    chatMessageOld.shareRoom = shareRoom;
                                    chatMessageOld.shareMoment = shareMoment;
                                    chatMessageOld.shareTopic = shareTopic;
                                    chatMessageOld.shareUser = shareUser;
                                    arrayList = arrayList2;
                                    arrayList.add(chatMessageOld);
                                    columnIndexOrThrow17 = i415;
                                    columnIndexOrThrow28 = i5;
                                    columnIndexOrThrow27 = columnIndexOrThrow27;
                                    columnIndexOrThrow31 = i7;
                                    columnIndexOrThrow30 = i10;
                                    columnIndexOrThrow34 = i4;
                                    columnIndexOrThrow35 = i6;
                                    columnIndexOrThrow26 = columnIndexOrThrow26;
                                    columnIndexOrThrow22 = columnIndexOrThrow22;
                                    columnIndexOrThrow36 = columnIndexOrThrow36;
                                    columnIndexOrThrow37 = i8;
                                    columnIndexOrThrow40 = i317;
                                    columnIndexOrThrow39 = i310;
                                    columnIndexOrThrow38 = i9;
                                    columnIndexOrThrow21 = columnIndexOrThrow21;
                                    i27 = i13;
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    i28 = i2;
                                    i21 = i316;
                                    i26 = i210;
                                    columnIndexOrThrow24 = columnIndexOrThrow24;
                                    i20 = i318;
                                    i19 = i319;
                                    columnIndexOrThrow25 = columnIndexOrThrow25;
                                    i24 = i313;
                                    columnIndexOrThrow29 = i3;
                                    columnIndexOrThrow33 = i312;
                                    i25 = i311;
                                } else {
                                    i7 = columnIndexOrThrow31;
                                    i8 = columnIndexOrThrow37;
                                    i9 = columnIndexOrThrow38;
                                }
                                i10 = columnIndexOrThrow30;
                                i11 = columnIndexOrThrow39;
                                i12 = columnIndexOrThrow40;
                                shareUser = new ChatMessageOld.ShareUser();
                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                shareUser.idx = cursor.getLong(i8);
                                shareUser.head = cursor.getString(i9);
                                shareUser.name = cursor.getString(i11);
                                shareUser.msg = cursor.getString(i12);
                                chatMessageOld = new ChatMessageOld();
                                i13 = i27;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i211 = i26;
                                int i3110 = i11;
                                chatMessageOld.mid = cursor.getString(i211);
                                int i3111 = i25;
                                int i3112 = i;
                                chatMessageOld.from = cursor.getLong(i3111);
                                int i3113 = i24;
                                chatMessageOld.to = cursor.getLong(i3113);
                                int i3114 = i23;
                                chatMessageOld.type = cursor.getInt(i3114);
                                i23 = i3114;
                                int i3115 = i22;
                                chatMessageOld.msg = cursor.getString(i3115);
                                i22 = i3115;
                                int i3116 = i21;
                                int i3117 = i12;
                                chatMessageOld.time = cursor.getLong(i3116);
                                int i3118 = i20;
                                chatMessageOld.localtime = cursor.getLong(i3118);
                                int i3119 = i19;
                                chatMessageOld.giftid = cursor.getLong(i3119);
                                int i416 = i18;
                                chatMessageOld.number = cursor.getInt(i416);
                                i18 = i416;
                                int i417 = i17;
                                chatMessageOld.url = cursor.getString(i417);
                                i17 = i417;
                                int i418 = i16;
                                chatMessageOld.description = cursor.getString(i418);
                                i16 = i418;
                                int i419 = i15;
                                chatMessageOld.duration = cursor.getInt(i419);
                                i15 = i419;
                                int i4110 = i14;
                                chatMessageOld.msgstatus = cursor.getInt(i4110);
                                i14 = i4110;
                                int i4111 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i4111);
                                columnIndexOrThrow15 = i4111;
                                int i4112 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i4112);
                                columnIndexOrThrow16 = i4112;
                                int i4113 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i4113);
                                columnIndexOrThrow18 = columnIndexOrThrow18;
                                if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i4113;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i3117;
                                columnIndexOrThrow39 = i3110;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i27 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i28 = i2;
                                i21 = i3116;
                                i26 = i211;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i20 = i3118;
                                i19 = i3119;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i24 = i3113;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i3112;
                                i25 = i3111;
                            }
                            shareTopic = new ChatMessageOld.ShareTopic();
                            shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                            shareTopic.image = cursor.getString(columnIndexOrThrow31);
                            shareTopic.name = cursor.getString(i2);
                            shareTopic.userCount = cursor.getInt(i);
                            shareTopic.momentCount = cursor.getInt(i4);
                            shareTopic.msg = cursor.getString(i6);
                            if (cursor.isNull(columnIndexOrThrow36)) {
                                i8 = columnIndexOrThrow37;
                                if (cursor.isNull(i8)) {
                                    i7 = columnIndexOrThrow31;
                                    i9 = columnIndexOrThrow38;
                                    if (cursor.isNull(i9)) {
                                        i10 = columnIndexOrThrow30;
                                        i11 = columnIndexOrThrow39;
                                        if (cursor.isNull(i11)) {
                                            i4 = i4;
                                            i12 = columnIndexOrThrow40;
                                            if (cursor.isNull(i12)) {
                                                shareUser = new ChatMessageOld.ShareUser();
                                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                                shareUser.idx = cursor.getLong(i8);
                                                shareUser.head = cursor.getString(i9);
                                                shareUser.name = cursor.getString(i11);
                                                shareUser.msg = cursor.getString(i12);
                                            } else {
                                                shareUser = null;
                                            }
                                        }
                                    }
                                    chatMessageOld = new ChatMessageOld();
                                    i13 = i27;
                                    if (cursor.isNull(i13)) {
                                        chatMessageOld.id = null;
                                    } else {
                                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                    }
                                    int i212 = i26;
                                    int i31110 = i11;
                                    chatMessageOld.mid = cursor.getString(i212);
                                    int i31111 = i25;
                                    int i31112 = i;
                                    chatMessageOld.from = cursor.getLong(i31111);
                                    int i31113 = i24;
                                    chatMessageOld.to = cursor.getLong(i31113);
                                    int i31114 = i23;
                                    chatMessageOld.type = cursor.getInt(i31114);
                                    i23 = i31114;
                                    int i31115 = i22;
                                    chatMessageOld.msg = cursor.getString(i31115);
                                    i22 = i31115;
                                    int i31116 = i21;
                                    int i31117 = i12;
                                    chatMessageOld.time = cursor.getLong(i31116);
                                    int i31118 = i20;
                                    chatMessageOld.localtime = cursor.getLong(i31118);
                                    int i31119 = i19;
                                    chatMessageOld.giftid = cursor.getLong(i31119);
                                    int i4114 = i18;
                                    chatMessageOld.number = cursor.getInt(i4114);
                                    i18 = i4114;
                                    int i4115 = i17;
                                    chatMessageOld.url = cursor.getString(i4115);
                                    i17 = i4115;
                                    int i4116 = i16;
                                    chatMessageOld.description = cursor.getString(i4116);
                                    i16 = i4116;
                                    int i4117 = i15;
                                    chatMessageOld.duration = cursor.getInt(i4117);
                                    i15 = i4117;
                                    int i4118 = i14;
                                    chatMessageOld.msgstatus = cursor.getInt(i4118);
                                    i14 = i4118;
                                    int i4119 = columnIndexOrThrow15;
                                    chatMessageOld.filename = cursor.getString(i4119);
                                    columnIndexOrThrow15 = i4119;
                                    int i41110 = columnIndexOrThrow16;
                                    chatMessageOld.isRead = cursor.getInt(i41110);
                                    columnIndexOrThrow16 = i41110;
                                    int i41111 = columnIndexOrThrow17;
                                    chatMessageOld.uid = cursor.getString(i41111);
                                    columnIndexOrThrow18 = columnIndexOrThrow18;
                                    if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    chatMessageOld.isWarn = z;
                                    chatMessageOld.gif = gif;
                                    chatMessageOld.shareRoom = shareRoom;
                                    chatMessageOld.shareMoment = shareMoment;
                                    chatMessageOld.shareTopic = shareTopic;
                                    chatMessageOld.shareUser = shareUser;
                                    arrayList = arrayList2;
                                    arrayList.add(chatMessageOld);
                                    columnIndexOrThrow17 = i41111;
                                    columnIndexOrThrow28 = i5;
                                    columnIndexOrThrow27 = columnIndexOrThrow27;
                                    columnIndexOrThrow31 = i7;
                                    columnIndexOrThrow30 = i10;
                                    columnIndexOrThrow34 = i4;
                                    columnIndexOrThrow35 = i6;
                                    columnIndexOrThrow26 = columnIndexOrThrow26;
                                    columnIndexOrThrow22 = columnIndexOrThrow22;
                                    columnIndexOrThrow36 = columnIndexOrThrow36;
                                    columnIndexOrThrow37 = i8;
                                    columnIndexOrThrow40 = i31117;
                                    columnIndexOrThrow39 = i31110;
                                    columnIndexOrThrow38 = i9;
                                    columnIndexOrThrow21 = columnIndexOrThrow21;
                                    i27 = i13;
                                    columnIndexOrThrow20 = columnIndexOrThrow20;
                                    i28 = i2;
                                    i21 = i31116;
                                    i26 = i212;
                                    columnIndexOrThrow24 = columnIndexOrThrow24;
                                    i20 = i31118;
                                    i19 = i31119;
                                    columnIndexOrThrow25 = columnIndexOrThrow25;
                                    i24 = i31113;
                                    columnIndexOrThrow29 = i3;
                                    columnIndexOrThrow33 = i31112;
                                    i25 = i31111;
                                } else {
                                    i7 = columnIndexOrThrow31;
                                    i10 = columnIndexOrThrow30;
                                    i9 = columnIndexOrThrow38;
                                    i11 = columnIndexOrThrow39;
                                }
                                i12 = columnIndexOrThrow40;
                                shareUser = new ChatMessageOld.ShareUser();
                                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                shareUser.idx = cursor.getLong(i8);
                                shareUser.head = cursor.getString(i9);
                                shareUser.name = cursor.getString(i11);
                                shareUser.msg = cursor.getString(i12);
                                chatMessageOld = new ChatMessageOld();
                                i13 = i27;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i213 = i26;
                                int i311110 = i11;
                                chatMessageOld.mid = cursor.getString(i213);
                                int i311111 = i25;
                                int i311112 = i;
                                chatMessageOld.from = cursor.getLong(i311111);
                                int i311113 = i24;
                                chatMessageOld.to = cursor.getLong(i311113);
                                int i311114 = i23;
                                chatMessageOld.type = cursor.getInt(i311114);
                                i23 = i311114;
                                int i311115 = i22;
                                chatMessageOld.msg = cursor.getString(i311115);
                                i22 = i311115;
                                int i311116 = i21;
                                int i311117 = i12;
                                chatMessageOld.time = cursor.getLong(i311116);
                                int i311118 = i20;
                                chatMessageOld.localtime = cursor.getLong(i311118);
                                int i311119 = i19;
                                chatMessageOld.giftid = cursor.getLong(i311119);
                                int i41112 = i18;
                                chatMessageOld.number = cursor.getInt(i41112);
                                i18 = i41112;
                                int i41113 = i17;
                                chatMessageOld.url = cursor.getString(i41113);
                                i17 = i41113;
                                int i41114 = i16;
                                chatMessageOld.description = cursor.getString(i41114);
                                i16 = i41114;
                                int i41115 = i15;
                                chatMessageOld.duration = cursor.getInt(i41115);
                                i15 = i41115;
                                int i41116 = i14;
                                chatMessageOld.msgstatus = cursor.getInt(i41116);
                                i14 = i41116;
                                int i41117 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i41117);
                                columnIndexOrThrow15 = i41117;
                                int i41118 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i41118);
                                columnIndexOrThrow16 = i41118;
                                int i41119 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i41119);
                                columnIndexOrThrow18 = columnIndexOrThrow18;
                                if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i41119;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i311117;
                                columnIndexOrThrow39 = i311110;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i27 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i28 = i2;
                                i21 = i311116;
                                i26 = i213;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i20 = i311118;
                                i19 = i311119;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i24 = i311113;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i311112;
                                i25 = i311111;
                            } else {
                                i7 = columnIndexOrThrow31;
                                i8 = columnIndexOrThrow37;
                                i9 = columnIndexOrThrow38;
                            }
                            i10 = columnIndexOrThrow30;
                            i11 = columnIndexOrThrow39;
                            i12 = columnIndexOrThrow40;
                            shareUser = new ChatMessageOld.ShareUser();
                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                            shareUser.idx = cursor.getLong(i8);
                            shareUser.head = cursor.getString(i9);
                            shareUser.name = cursor.getString(i11);
                            shareUser.msg = cursor.getString(i12);
                            chatMessageOld = new ChatMessageOld();
                            i13 = i27;
                            if (cursor.isNull(i13)) {
                                chatMessageOld.id = null;
                            } else {
                                chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                            }
                            int i214 = i26;
                            int i3111110 = i11;
                            chatMessageOld.mid = cursor.getString(i214);
                            int i3111111 = i25;
                            int i3111112 = i;
                            chatMessageOld.from = cursor.getLong(i3111111);
                            int i3111113 = i24;
                            chatMessageOld.to = cursor.getLong(i3111113);
                            int i3111114 = i23;
                            chatMessageOld.type = cursor.getInt(i3111114);
                            i23 = i3111114;
                            int i3111115 = i22;
                            chatMessageOld.msg = cursor.getString(i3111115);
                            i22 = i3111115;
                            int i3111116 = i21;
                            int i3111117 = i12;
                            chatMessageOld.time = cursor.getLong(i3111116);
                            int i3111118 = i20;
                            chatMessageOld.localtime = cursor.getLong(i3111118);
                            int i3111119 = i19;
                            chatMessageOld.giftid = cursor.getLong(i3111119);
                            int i411110 = i18;
                            chatMessageOld.number = cursor.getInt(i411110);
                            i18 = i411110;
                            int i411111 = i17;
                            chatMessageOld.url = cursor.getString(i411111);
                            i17 = i411111;
                            int i411112 = i16;
                            chatMessageOld.description = cursor.getString(i411112);
                            i16 = i411112;
                            int i411113 = i15;
                            chatMessageOld.duration = cursor.getInt(i411113);
                            i15 = i411113;
                            int i411114 = i14;
                            chatMessageOld.msgstatus = cursor.getInt(i411114);
                            i14 = i411114;
                            int i411115 = columnIndexOrThrow15;
                            chatMessageOld.filename = cursor.getString(i411115);
                            columnIndexOrThrow15 = i411115;
                            int i411116 = columnIndexOrThrow16;
                            chatMessageOld.isRead = cursor.getInt(i411116);
                            columnIndexOrThrow16 = i411116;
                            int i411117 = columnIndexOrThrow17;
                            chatMessageOld.uid = cursor.getString(i411117);
                            columnIndexOrThrow18 = columnIndexOrThrow18;
                            if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            chatMessageOld.isWarn = z;
                            chatMessageOld.gif = gif;
                            chatMessageOld.shareRoom = shareRoom;
                            chatMessageOld.shareMoment = shareMoment;
                            chatMessageOld.shareTopic = shareTopic;
                            chatMessageOld.shareUser = shareUser;
                            arrayList = arrayList2;
                            arrayList.add(chatMessageOld);
                            columnIndexOrThrow17 = i411117;
                            columnIndexOrThrow28 = i5;
                            columnIndexOrThrow27 = columnIndexOrThrow27;
                            columnIndexOrThrow31 = i7;
                            columnIndexOrThrow30 = i10;
                            columnIndexOrThrow34 = i4;
                            columnIndexOrThrow35 = i6;
                            columnIndexOrThrow26 = columnIndexOrThrow26;
                            columnIndexOrThrow22 = columnIndexOrThrow22;
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            columnIndexOrThrow37 = i8;
                            columnIndexOrThrow40 = i3111117;
                            columnIndexOrThrow39 = i3111110;
                            columnIndexOrThrow38 = i9;
                            columnIndexOrThrow21 = columnIndexOrThrow21;
                            i27 = i13;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            i28 = i2;
                            i21 = i3111116;
                            i26 = i214;
                            columnIndexOrThrow24 = columnIndexOrThrow24;
                            i20 = i3111118;
                            i19 = i3111119;
                            columnIndexOrThrow25 = columnIndexOrThrow25;
                            i24 = i3111113;
                            columnIndexOrThrow29 = i3;
                            columnIndexOrThrow33 = i3111112;
                            i25 = i3111111;
                        }
                        i5 = columnIndexOrThrow28;
                        i6 = columnIndexOrThrow35;
                        shareTopic = new ChatMessageOld.ShareTopic();
                        shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                        shareTopic.image = cursor.getString(columnIndexOrThrow31);
                        shareTopic.name = cursor.getString(i2);
                        shareTopic.userCount = cursor.getInt(i);
                        shareTopic.momentCount = cursor.getInt(i4);
                        shareTopic.msg = cursor.getString(i6);
                        if (cursor.isNull(columnIndexOrThrow36)) {
                            i8 = columnIndexOrThrow37;
                            if (cursor.isNull(i8)) {
                                i7 = columnIndexOrThrow31;
                                i9 = columnIndexOrThrow38;
                                if (cursor.isNull(i9)) {
                                    i10 = columnIndexOrThrow30;
                                    i11 = columnIndexOrThrow39;
                                    if (cursor.isNull(i11)) {
                                        i4 = i4;
                                        i12 = columnIndexOrThrow40;
                                        if (cursor.isNull(i12)) {
                                            shareUser = new ChatMessageOld.ShareUser();
                                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                            shareUser.idx = cursor.getLong(i8);
                                            shareUser.head = cursor.getString(i9);
                                            shareUser.name = cursor.getString(i11);
                                            shareUser.msg = cursor.getString(i12);
                                        } else {
                                            shareUser = null;
                                        }
                                    }
                                }
                                chatMessageOld = new ChatMessageOld();
                                i13 = i27;
                                if (cursor.isNull(i13)) {
                                    chatMessageOld.id = null;
                                } else {
                                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                                }
                                int i215 = i26;
                                int i31111110 = i11;
                                chatMessageOld.mid = cursor.getString(i215);
                                int i31111111 = i25;
                                int i31111112 = i;
                                chatMessageOld.from = cursor.getLong(i31111111);
                                int i31111113 = i24;
                                chatMessageOld.to = cursor.getLong(i31111113);
                                int i31111114 = i23;
                                chatMessageOld.type = cursor.getInt(i31111114);
                                i23 = i31111114;
                                int i31111115 = i22;
                                chatMessageOld.msg = cursor.getString(i31111115);
                                i22 = i31111115;
                                int i31111116 = i21;
                                int i31111117 = i12;
                                chatMessageOld.time = cursor.getLong(i31111116);
                                int i31111118 = i20;
                                chatMessageOld.localtime = cursor.getLong(i31111118);
                                int i31111119 = i19;
                                chatMessageOld.giftid = cursor.getLong(i31111119);
                                int i411118 = i18;
                                chatMessageOld.number = cursor.getInt(i411118);
                                i18 = i411118;
                                int i411119 = i17;
                                chatMessageOld.url = cursor.getString(i411119);
                                i17 = i411119;
                                int i4111110 = i16;
                                chatMessageOld.description = cursor.getString(i4111110);
                                i16 = i4111110;
                                int i4111111 = i15;
                                chatMessageOld.duration = cursor.getInt(i4111111);
                                i15 = i4111111;
                                int i4111112 = i14;
                                chatMessageOld.msgstatus = cursor.getInt(i4111112);
                                i14 = i4111112;
                                int i4111113 = columnIndexOrThrow15;
                                chatMessageOld.filename = cursor.getString(i4111113);
                                columnIndexOrThrow15 = i4111113;
                                int i4111114 = columnIndexOrThrow16;
                                chatMessageOld.isRead = cursor.getInt(i4111114);
                                columnIndexOrThrow16 = i4111114;
                                int i4111115 = columnIndexOrThrow17;
                                chatMessageOld.uid = cursor.getString(i4111115);
                                columnIndexOrThrow18 = columnIndexOrThrow18;
                                if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                chatMessageOld.isWarn = z;
                                chatMessageOld.gif = gif;
                                chatMessageOld.shareRoom = shareRoom;
                                chatMessageOld.shareMoment = shareMoment;
                                chatMessageOld.shareTopic = shareTopic;
                                chatMessageOld.shareUser = shareUser;
                                arrayList = arrayList2;
                                arrayList.add(chatMessageOld);
                                columnIndexOrThrow17 = i4111115;
                                columnIndexOrThrow28 = i5;
                                columnIndexOrThrow27 = columnIndexOrThrow27;
                                columnIndexOrThrow31 = i7;
                                columnIndexOrThrow30 = i10;
                                columnIndexOrThrow34 = i4;
                                columnIndexOrThrow35 = i6;
                                columnIndexOrThrow26 = columnIndexOrThrow26;
                                columnIndexOrThrow22 = columnIndexOrThrow22;
                                columnIndexOrThrow36 = columnIndexOrThrow36;
                                columnIndexOrThrow37 = i8;
                                columnIndexOrThrow40 = i31111117;
                                columnIndexOrThrow39 = i31111110;
                                columnIndexOrThrow38 = i9;
                                columnIndexOrThrow21 = columnIndexOrThrow21;
                                i27 = i13;
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                i28 = i2;
                                i21 = i31111116;
                                i26 = i215;
                                columnIndexOrThrow24 = columnIndexOrThrow24;
                                i20 = i31111118;
                                i19 = i31111119;
                                columnIndexOrThrow25 = columnIndexOrThrow25;
                                i24 = i31111113;
                                columnIndexOrThrow29 = i3;
                                columnIndexOrThrow33 = i31111112;
                                i25 = i31111111;
                            } else {
                                i7 = columnIndexOrThrow31;
                                i10 = columnIndexOrThrow30;
                                i9 = columnIndexOrThrow38;
                                i11 = columnIndexOrThrow39;
                            }
                            i12 = columnIndexOrThrow40;
                            shareUser = new ChatMessageOld.ShareUser();
                            shareUser.id = cursor.getLong(columnIndexOrThrow36);
                            shareUser.idx = cursor.getLong(i8);
                            shareUser.head = cursor.getString(i9);
                            shareUser.name = cursor.getString(i11);
                            shareUser.msg = cursor.getString(i12);
                            chatMessageOld = new ChatMessageOld();
                            i13 = i27;
                            if (cursor.isNull(i13)) {
                                chatMessageOld.id = null;
                            } else {
                                chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                            }
                            int i216 = i26;
                            int i311111110 = i11;
                            chatMessageOld.mid = cursor.getString(i216);
                            int i311111111 = i25;
                            int i311111112 = i;
                            chatMessageOld.from = cursor.getLong(i311111111);
                            int i311111113 = i24;
                            chatMessageOld.to = cursor.getLong(i311111113);
                            int i311111114 = i23;
                            chatMessageOld.type = cursor.getInt(i311111114);
                            i23 = i311111114;
                            int i311111115 = i22;
                            chatMessageOld.msg = cursor.getString(i311111115);
                            i22 = i311111115;
                            int i311111116 = i21;
                            int i311111117 = i12;
                            chatMessageOld.time = cursor.getLong(i311111116);
                            int i311111118 = i20;
                            chatMessageOld.localtime = cursor.getLong(i311111118);
                            int i311111119 = i19;
                            chatMessageOld.giftid = cursor.getLong(i311111119);
                            int i4111116 = i18;
                            chatMessageOld.number = cursor.getInt(i4111116);
                            i18 = i4111116;
                            int i4111117 = i17;
                            chatMessageOld.url = cursor.getString(i4111117);
                            i17 = i4111117;
                            int i4111118 = i16;
                            chatMessageOld.description = cursor.getString(i4111118);
                            i16 = i4111118;
                            int i4111119 = i15;
                            chatMessageOld.duration = cursor.getInt(i4111119);
                            i15 = i4111119;
                            int i41111110 = i14;
                            chatMessageOld.msgstatus = cursor.getInt(i41111110);
                            i14 = i41111110;
                            int i41111111 = columnIndexOrThrow15;
                            chatMessageOld.filename = cursor.getString(i41111111);
                            columnIndexOrThrow15 = i41111111;
                            int i41111112 = columnIndexOrThrow16;
                            chatMessageOld.isRead = cursor.getInt(i41111112);
                            columnIndexOrThrow16 = i41111112;
                            int i41111113 = columnIndexOrThrow17;
                            chatMessageOld.uid = cursor.getString(i41111113);
                            columnIndexOrThrow18 = columnIndexOrThrow18;
                            if (cursor.getInt(columnIndexOrThrow18) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            chatMessageOld.isWarn = z;
                            chatMessageOld.gif = gif;
                            chatMessageOld.shareRoom = shareRoom;
                            chatMessageOld.shareMoment = shareMoment;
                            chatMessageOld.shareTopic = shareTopic;
                            chatMessageOld.shareUser = shareUser;
                            arrayList = arrayList2;
                            arrayList.add(chatMessageOld);
                            columnIndexOrThrow17 = i41111113;
                            columnIndexOrThrow28 = i5;
                            columnIndexOrThrow27 = columnIndexOrThrow27;
                            columnIndexOrThrow31 = i7;
                            columnIndexOrThrow30 = i10;
                            columnIndexOrThrow34 = i4;
                            columnIndexOrThrow35 = i6;
                            columnIndexOrThrow26 = columnIndexOrThrow26;
                            columnIndexOrThrow22 = columnIndexOrThrow22;
                            columnIndexOrThrow36 = columnIndexOrThrow36;
                            columnIndexOrThrow37 = i8;
                            columnIndexOrThrow40 = i311111117;
                            columnIndexOrThrow39 = i311111110;
                            columnIndexOrThrow38 = i9;
                            columnIndexOrThrow21 = columnIndexOrThrow21;
                            i27 = i13;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            i28 = i2;
                            i21 = i311111116;
                            i26 = i216;
                            columnIndexOrThrow24 = columnIndexOrThrow24;
                            i20 = i311111118;
                            i19 = i311111119;
                            columnIndexOrThrow25 = columnIndexOrThrow25;
                            i24 = i311111113;
                            columnIndexOrThrow29 = i3;
                            columnIndexOrThrow33 = i311111112;
                            i25 = i311111111;
                        } else {
                            i7 = columnIndexOrThrow31;
                            i8 = columnIndexOrThrow37;
                            i9 = columnIndexOrThrow38;
                        }
                        i10 = columnIndexOrThrow30;
                        i11 = columnIndexOrThrow39;
                        i12 = columnIndexOrThrow40;
                        shareUser = new ChatMessageOld.ShareUser();
                        shareUser.id = cursor.getLong(columnIndexOrThrow36);
                        shareUser.idx = cursor.getLong(i8);
                        shareUser.head = cursor.getString(i9);
                        shareUser.name = cursor.getString(i11);
                        shareUser.msg = cursor.getString(i12);
                        chatMessageOld = new ChatMessageOld();
                        i13 = i27;
                        if (cursor.isNull(i13)) {
                            chatMessageOld.id = null;
                        } else {
                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                        }
                        int i217 = i26;
                        int i3111111110 = i11;
                        chatMessageOld.mid = cursor.getString(i217);
                        int i3111111111 = i25;
                        int i3111111112 = i;
                        chatMessageOld.from = cursor.getLong(i3111111111);
                        int i3111111113 = i24;
                        chatMessageOld.to = cursor.getLong(i3111111113);
                        int i3111111114 = i23;
                        chatMessageOld.type = cursor.getInt(i3111111114);
                        i23 = i3111111114;
                        int i3111111115 = i22;
                        chatMessageOld.msg = cursor.getString(i3111111115);
                        i22 = i3111111115;
                        int i3111111116 = i21;
                        int i3111111117 = i12;
                        chatMessageOld.time = cursor.getLong(i3111111116);
                        int i3111111118 = i20;
                        chatMessageOld.localtime = cursor.getLong(i3111111118);
                        int i3111111119 = i19;
                        chatMessageOld.giftid = cursor.getLong(i3111111119);
                        int i41111114 = i18;
                        chatMessageOld.number = cursor.getInt(i41111114);
                        i18 = i41111114;
                        int i41111115 = i17;
                        chatMessageOld.url = cursor.getString(i41111115);
                        i17 = i41111115;
                        int i41111116 = i16;
                        chatMessageOld.description = cursor.getString(i41111116);
                        i16 = i41111116;
                        int i41111117 = i15;
                        chatMessageOld.duration = cursor.getInt(i41111117);
                        i15 = i41111117;
                        int i41111118 = i14;
                        chatMessageOld.msgstatus = cursor.getInt(i41111118);
                        i14 = i41111118;
                        int i41111119 = columnIndexOrThrow15;
                        chatMessageOld.filename = cursor.getString(i41111119);
                        columnIndexOrThrow15 = i41111119;
                        int i411111110 = columnIndexOrThrow16;
                        chatMessageOld.isRead = cursor.getInt(i411111110);
                        columnIndexOrThrow16 = i411111110;
                        int i411111111 = columnIndexOrThrow17;
                        chatMessageOld.uid = cursor.getString(i411111111);
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        if (cursor.getInt(columnIndexOrThrow18) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        chatMessageOld.isWarn = z;
                        chatMessageOld.gif = gif;
                        chatMessageOld.shareRoom = shareRoom;
                        chatMessageOld.shareMoment = shareMoment;
                        chatMessageOld.shareTopic = shareTopic;
                        chatMessageOld.shareUser = shareUser;
                        arrayList = arrayList2;
                        arrayList.add(chatMessageOld);
                        columnIndexOrThrow17 = i411111111;
                        columnIndexOrThrow28 = i5;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow31 = i7;
                        columnIndexOrThrow30 = i10;
                        columnIndexOrThrow34 = i4;
                        columnIndexOrThrow35 = i6;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        columnIndexOrThrow37 = i8;
                        columnIndexOrThrow40 = i3111111117;
                        columnIndexOrThrow39 = i3111111110;
                        columnIndexOrThrow38 = i9;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        i27 = i13;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        i28 = i2;
                        i21 = i3111111116;
                        i26 = i217;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        i20 = i3111111118;
                        i19 = i3111111119;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        i24 = i3111111113;
                        columnIndexOrThrow29 = i3;
                        columnIndexOrThrow33 = i3111111112;
                        i25 = i3111111111;
                    } else {
                        i = columnIndexOrThrow33;
                    }
                } else {
                    i = columnIndexOrThrow33;
                    i2 = i28;
                }
                i3 = columnIndexOrThrow29;
                i4 = columnIndexOrThrow34;
                i5 = columnIndexOrThrow28;
                i6 = columnIndexOrThrow35;
                shareTopic = new ChatMessageOld.ShareTopic();
                shareTopic.circleId = cursor.getLong(columnIndexOrThrow30);
                shareTopic.image = cursor.getString(columnIndexOrThrow31);
                shareTopic.name = cursor.getString(i2);
                shareTopic.userCount = cursor.getInt(i);
                shareTopic.momentCount = cursor.getInt(i4);
                shareTopic.msg = cursor.getString(i6);
                if (cursor.isNull(columnIndexOrThrow36)) {
                    i8 = columnIndexOrThrow37;
                    if (cursor.isNull(i8)) {
                        i7 = columnIndexOrThrow31;
                        i9 = columnIndexOrThrow38;
                        if (cursor.isNull(i9)) {
                            i10 = columnIndexOrThrow30;
                            i11 = columnIndexOrThrow39;
                            if (cursor.isNull(i11)) {
                                i4 = i4;
                                i12 = columnIndexOrThrow40;
                                if (cursor.isNull(i12)) {
                                    shareUser = new ChatMessageOld.ShareUser();
                                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                                    shareUser.idx = cursor.getLong(i8);
                                    shareUser.head = cursor.getString(i9);
                                    shareUser.name = cursor.getString(i11);
                                    shareUser.msg = cursor.getString(i12);
                                } else {
                                    shareUser = null;
                                }
                            }
                        }
                        chatMessageOld = new ChatMessageOld();
                        i13 = i27;
                        if (cursor.isNull(i13)) {
                            chatMessageOld.id = null;
                        } else {
                            chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                        }
                        int i218 = i26;
                        int i31111111110 = i11;
                        chatMessageOld.mid = cursor.getString(i218);
                        int i31111111111 = i25;
                        int i31111111112 = i;
                        chatMessageOld.from = cursor.getLong(i31111111111);
                        int i31111111113 = i24;
                        chatMessageOld.to = cursor.getLong(i31111111113);
                        int i31111111114 = i23;
                        chatMessageOld.type = cursor.getInt(i31111111114);
                        i23 = i31111111114;
                        int i31111111115 = i22;
                        chatMessageOld.msg = cursor.getString(i31111111115);
                        i22 = i31111111115;
                        int i31111111116 = i21;
                        int i31111111117 = i12;
                        chatMessageOld.time = cursor.getLong(i31111111116);
                        int i31111111118 = i20;
                        chatMessageOld.localtime = cursor.getLong(i31111111118);
                        int i31111111119 = i19;
                        chatMessageOld.giftid = cursor.getLong(i31111111119);
                        int i411111112 = i18;
                        chatMessageOld.number = cursor.getInt(i411111112);
                        i18 = i411111112;
                        int i411111113 = i17;
                        chatMessageOld.url = cursor.getString(i411111113);
                        i17 = i411111113;
                        int i411111114 = i16;
                        chatMessageOld.description = cursor.getString(i411111114);
                        i16 = i411111114;
                        int i411111115 = i15;
                        chatMessageOld.duration = cursor.getInt(i411111115);
                        i15 = i411111115;
                        int i411111116 = i14;
                        chatMessageOld.msgstatus = cursor.getInt(i411111116);
                        i14 = i411111116;
                        int i411111117 = columnIndexOrThrow15;
                        chatMessageOld.filename = cursor.getString(i411111117);
                        columnIndexOrThrow15 = i411111117;
                        int i411111118 = columnIndexOrThrow16;
                        chatMessageOld.isRead = cursor.getInt(i411111118);
                        columnIndexOrThrow16 = i411111118;
                        int i411111119 = columnIndexOrThrow17;
                        chatMessageOld.uid = cursor.getString(i411111119);
                        columnIndexOrThrow18 = columnIndexOrThrow18;
                        if (cursor.getInt(columnIndexOrThrow18) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        chatMessageOld.isWarn = z;
                        chatMessageOld.gif = gif;
                        chatMessageOld.shareRoom = shareRoom;
                        chatMessageOld.shareMoment = shareMoment;
                        chatMessageOld.shareTopic = shareTopic;
                        chatMessageOld.shareUser = shareUser;
                        arrayList = arrayList2;
                        arrayList.add(chatMessageOld);
                        columnIndexOrThrow17 = i411111119;
                        columnIndexOrThrow28 = i5;
                        columnIndexOrThrow27 = columnIndexOrThrow27;
                        columnIndexOrThrow31 = i7;
                        columnIndexOrThrow30 = i10;
                        columnIndexOrThrow34 = i4;
                        columnIndexOrThrow35 = i6;
                        columnIndexOrThrow26 = columnIndexOrThrow26;
                        columnIndexOrThrow22 = columnIndexOrThrow22;
                        columnIndexOrThrow36 = columnIndexOrThrow36;
                        columnIndexOrThrow37 = i8;
                        columnIndexOrThrow40 = i31111111117;
                        columnIndexOrThrow39 = i31111111110;
                        columnIndexOrThrow38 = i9;
                        columnIndexOrThrow21 = columnIndexOrThrow21;
                        i27 = i13;
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        i28 = i2;
                        i21 = i31111111116;
                        i26 = i218;
                        columnIndexOrThrow24 = columnIndexOrThrow24;
                        i20 = i31111111118;
                        i19 = i31111111119;
                        columnIndexOrThrow25 = columnIndexOrThrow25;
                        i24 = i31111111113;
                        columnIndexOrThrow29 = i3;
                        columnIndexOrThrow33 = i31111111112;
                        i25 = i31111111111;
                    } else {
                        i7 = columnIndexOrThrow31;
                        i10 = columnIndexOrThrow30;
                        i9 = columnIndexOrThrow38;
                        i11 = columnIndexOrThrow39;
                    }
                    i12 = columnIndexOrThrow40;
                    shareUser = new ChatMessageOld.ShareUser();
                    shareUser.id = cursor.getLong(columnIndexOrThrow36);
                    shareUser.idx = cursor.getLong(i8);
                    shareUser.head = cursor.getString(i9);
                    shareUser.name = cursor.getString(i11);
                    shareUser.msg = cursor.getString(i12);
                    chatMessageOld = new ChatMessageOld();
                    i13 = i27;
                    if (cursor.isNull(i13)) {
                        chatMessageOld.id = null;
                    } else {
                        chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                    }
                    int i219 = i26;
                    int i311111111110 = i11;
                    chatMessageOld.mid = cursor.getString(i219);
                    int i311111111111 = i25;
                    int i311111111112 = i;
                    chatMessageOld.from = cursor.getLong(i311111111111);
                    int i311111111113 = i24;
                    chatMessageOld.to = cursor.getLong(i311111111113);
                    int i311111111114 = i23;
                    chatMessageOld.type = cursor.getInt(i311111111114);
                    i23 = i311111111114;
                    int i311111111115 = i22;
                    chatMessageOld.msg = cursor.getString(i311111111115);
                    i22 = i311111111115;
                    int i311111111116 = i21;
                    int i311111111117 = i12;
                    chatMessageOld.time = cursor.getLong(i311111111116);
                    int i311111111118 = i20;
                    chatMessageOld.localtime = cursor.getLong(i311111111118);
                    int i311111111119 = i19;
                    chatMessageOld.giftid = cursor.getLong(i311111111119);
                    int i4111111110 = i18;
                    chatMessageOld.number = cursor.getInt(i4111111110);
                    i18 = i4111111110;
                    int i4111111111 = i17;
                    chatMessageOld.url = cursor.getString(i4111111111);
                    i17 = i4111111111;
                    int i4111111112 = i16;
                    chatMessageOld.description = cursor.getString(i4111111112);
                    i16 = i4111111112;
                    int i4111111113 = i15;
                    chatMessageOld.duration = cursor.getInt(i4111111113);
                    i15 = i4111111113;
                    int i4111111114 = i14;
                    chatMessageOld.msgstatus = cursor.getInt(i4111111114);
                    i14 = i4111111114;
                    int i4111111115 = columnIndexOrThrow15;
                    chatMessageOld.filename = cursor.getString(i4111111115);
                    columnIndexOrThrow15 = i4111111115;
                    int i4111111116 = columnIndexOrThrow16;
                    chatMessageOld.isRead = cursor.getInt(i4111111116);
                    columnIndexOrThrow16 = i4111111116;
                    int i4111111117 = columnIndexOrThrow17;
                    chatMessageOld.uid = cursor.getString(i4111111117);
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    if (cursor.getInt(columnIndexOrThrow18) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    chatMessageOld.isWarn = z;
                    chatMessageOld.gif = gif;
                    chatMessageOld.shareRoom = shareRoom;
                    chatMessageOld.shareMoment = shareMoment;
                    chatMessageOld.shareTopic = shareTopic;
                    chatMessageOld.shareUser = shareUser;
                    arrayList = arrayList2;
                    arrayList.add(chatMessageOld);
                    columnIndexOrThrow17 = i4111111117;
                    columnIndexOrThrow28 = i5;
                    columnIndexOrThrow27 = columnIndexOrThrow27;
                    columnIndexOrThrow31 = i7;
                    columnIndexOrThrow30 = i10;
                    columnIndexOrThrow34 = i4;
                    columnIndexOrThrow35 = i6;
                    columnIndexOrThrow26 = columnIndexOrThrow26;
                    columnIndexOrThrow22 = columnIndexOrThrow22;
                    columnIndexOrThrow36 = columnIndexOrThrow36;
                    columnIndexOrThrow37 = i8;
                    columnIndexOrThrow40 = i311111111117;
                    columnIndexOrThrow39 = i311111111110;
                    columnIndexOrThrow38 = i9;
                    columnIndexOrThrow21 = columnIndexOrThrow21;
                    i27 = i13;
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    i28 = i2;
                    i21 = i311111111116;
                    i26 = i219;
                    columnIndexOrThrow24 = columnIndexOrThrow24;
                    i20 = i311111111118;
                    i19 = i311111111119;
                    columnIndexOrThrow25 = columnIndexOrThrow25;
                    i24 = i311111111113;
                    columnIndexOrThrow29 = i3;
                    columnIndexOrThrow33 = i311111111112;
                    i25 = i311111111111;
                } else {
                    i7 = columnIndexOrThrow31;
                    i8 = columnIndexOrThrow37;
                    i9 = columnIndexOrThrow38;
                }
                i10 = columnIndexOrThrow30;
                i11 = columnIndexOrThrow39;
                i12 = columnIndexOrThrow40;
                shareUser = new ChatMessageOld.ShareUser();
                shareUser.id = cursor.getLong(columnIndexOrThrow36);
                shareUser.idx = cursor.getLong(i8);
                shareUser.head = cursor.getString(i9);
                shareUser.name = cursor.getString(i11);
                shareUser.msg = cursor.getString(i12);
                chatMessageOld = new ChatMessageOld();
                i13 = i27;
                if (cursor.isNull(i13)) {
                    chatMessageOld.id = null;
                } else {
                    chatMessageOld.id = Integer.valueOf(cursor.getInt(i13));
                }
                int i2110 = i26;
                int i3111111111110 = i11;
                chatMessageOld.mid = cursor.getString(i2110);
                int i3111111111111 = i25;
                int i3111111111112 = i;
                chatMessageOld.from = cursor.getLong(i3111111111111);
                int i3111111111113 = i24;
                chatMessageOld.to = cursor.getLong(i3111111111113);
                int i3111111111114 = i23;
                chatMessageOld.type = cursor.getInt(i3111111111114);
                i23 = i3111111111114;
                int i3111111111115 = i22;
                chatMessageOld.msg = cursor.getString(i3111111111115);
                i22 = i3111111111115;
                int i3111111111116 = i21;
                int i3111111111117 = i12;
                chatMessageOld.time = cursor.getLong(i3111111111116);
                int i3111111111118 = i20;
                chatMessageOld.localtime = cursor.getLong(i3111111111118);
                int i3111111111119 = i19;
                chatMessageOld.giftid = cursor.getLong(i3111111111119);
                int i4111111118 = i18;
                chatMessageOld.number = cursor.getInt(i4111111118);
                i18 = i4111111118;
                int i4111111119 = i17;
                chatMessageOld.url = cursor.getString(i4111111119);
                i17 = i4111111119;
                int i41111111110 = i16;
                chatMessageOld.description = cursor.getString(i41111111110);
                i16 = i41111111110;
                int i41111111111 = i15;
                chatMessageOld.duration = cursor.getInt(i41111111111);
                i15 = i41111111111;
                int i41111111112 = i14;
                chatMessageOld.msgstatus = cursor.getInt(i41111111112);
                i14 = i41111111112;
                int i41111111113 = columnIndexOrThrow15;
                chatMessageOld.filename = cursor.getString(i41111111113);
                columnIndexOrThrow15 = i41111111113;
                int i41111111114 = columnIndexOrThrow16;
                chatMessageOld.isRead = cursor.getInt(i41111111114);
                columnIndexOrThrow16 = i41111111114;
                int i41111111115 = columnIndexOrThrow17;
                chatMessageOld.uid = cursor.getString(i41111111115);
                columnIndexOrThrow18 = columnIndexOrThrow18;
                if (cursor.getInt(columnIndexOrThrow18) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                chatMessageOld.isWarn = z;
                chatMessageOld.gif = gif;
                chatMessageOld.shareRoom = shareRoom;
                chatMessageOld.shareMoment = shareMoment;
                chatMessageOld.shareTopic = shareTopic;
                chatMessageOld.shareUser = shareUser;
                arrayList = arrayList2;
                arrayList.add(chatMessageOld);
                columnIndexOrThrow17 = i41111111115;
                columnIndexOrThrow28 = i5;
                columnIndexOrThrow27 = columnIndexOrThrow27;
                columnIndexOrThrow31 = i7;
                columnIndexOrThrow30 = i10;
                columnIndexOrThrow34 = i4;
                columnIndexOrThrow35 = i6;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = columnIndexOrThrow22;
                columnIndexOrThrow36 = columnIndexOrThrow36;
                columnIndexOrThrow37 = i8;
                columnIndexOrThrow40 = i3111111111117;
                columnIndexOrThrow39 = i3111111111110;
                columnIndexOrThrow38 = i9;
                columnIndexOrThrow21 = columnIndexOrThrow21;
                i27 = i13;
                columnIndexOrThrow20 = columnIndexOrThrow20;
                i28 = i2;
                i21 = i3111111111116;
                i26 = i2110;
                columnIndexOrThrow24 = columnIndexOrThrow24;
                i20 = i3111111111118;
                i19 = i3111111111119;
                columnIndexOrThrow25 = columnIndexOrThrow25;
                i24 = i3111111111113;
                columnIndexOrThrow29 = i3;
                columnIndexOrThrow33 = i3111111111112;
                i25 = i3111111111111;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    public final List<NewFriendsOld> OooO0Oo(Cursor cursor) {
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("standbytwo");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("userid");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("mid");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(ServerProtocol.DIALOG_PARAM_STATE);
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("time");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("isRead");
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                NewFriendsOld newFriendsOld = new NewFriendsOld();
                if (!cursor.isNull(columnIndexOrThrow)) {
                    newFriendsOld.standbytwo = cursor.getString(columnIndexOrThrow);
                    newFriendsOld.userid = cursor.getString(columnIndexOrThrow2);
                    newFriendsOld.mid = cursor.getString(columnIndexOrThrow3);
                    newFriendsOld.state = cursor.getString(columnIndexOrThrow4);
                    newFriendsOld.message = cursor.getString(columnIndexOrThrow5);
                    newFriendsOld.time = cursor.getLong(columnIndexOrThrow6);
                    boolean z = true;
                    if (cursor.getInt(columnIndexOrThrow7) != 1) {
                        z = false;
                    }
                    newFriendsOld.isRead = z;
                }
                arrayList.add(newFriendsOld);
            }
            CloseableKt.closeFinally(cursor, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x035a  */
    public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase, List<? extends ChatMessageOld> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            String str = "uid";
            String str2 = "it.uid";
            String str3 = "";
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    supportSQLiteDatabase.insert("ChatMessageTable", 5, (ContentValues) it2.next());
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (ChatMessageOld chatMessageOld : list) {
                    String str4 = chatMessageOld.uid;
                    Intrinsics.checkNotNullExpressionValue(str4, str2);
                    long jOooO0oO = OooO.OooO0oO(str4);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str, Long.valueOf(jOooO0oO));
                    String str5 = str;
                    String str6 = str2;
                    long j = chatMessageOld.from;
                    if (j == jOooO0oO) {
                        j = chatMessageOld.to;
                    }
                    contentValues.put("targetId", Long.valueOf(j));
                    contentValues.put("mid", chatMessageOld.mid);
                    contentValues.put("sendState", Integer.valueOf(chatMessageOld.msgstatus));
                    contentValues.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, "");
                    String str7 = chatMessageOld.msg;
                    if (str7 == null) {
                        str7 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(str7, "it.msg ?: \"\"");
                    }
                    contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str7);
                    int i = chatMessageOld.type;
                    if (i == 2103) {
                        i = 1;
                    } else if (i == 2105) {
                        i = 5;
                    } else if (i == 2109) {
                        i = 2;
                    } else if (i == 2115) {
                        i = 3;
                    } else if (i != 2124) {
                        switch (i) {
                            case 2119:
                                i = 4;
                                break;
                            case 2120:
                                i = 6;
                                break;
                            case 2121:
                                i = 7;
                                break;
                            case 2122:
                                i = 8;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                    contentValues.put("type", Integer.valueOf(i));
                    contentValues.put("unReadCount", (Integer) 0);
                    contentValues.put("draft", "");
                    contentValues.put("time", Long.valueOf(chatMessageOld.time));
                    contentValues.put("topTime", (Integer) 0);
                    contentValues.put("isVoiceAndUnread", Boolean.valueOf(chatMessageOld.isRead == 1));
                    contentValues.put("isAcceptMsg", Boolean.valueOf(chatMessageOld.to == jOooO0oO));
                    arrayList2.add(contentValues);
                    str2 = str6;
                    str = str5;
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    supportSQLiteDatabase.insert("ConversationTable", 5, (ContentValues) it3.next());
                }
                return;
            }
            ChatMessageOld chatMessageOld2 = (ChatMessageOld) it.next();
            String str8 = chatMessageOld2.uid;
            Intrinsics.checkNotNullExpressionValue(str8, "it.uid");
            long jOooO0oO2 = OooO.OooO0oO(str8);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("uid", chatMessageOld2.uid);
            contentValues2.put("mid", chatMessageOld2.mid);
            long j2 = chatMessageOld2.from;
            if (j2 == jOooO0oO2) {
                j2 = chatMessageOld2.to;
            }
            contentValues2.put("targetId", Long.valueOf(j2));
            String str9 = chatMessageOld2.msg;
            if (str9 == null) {
                str9 = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(str9, "it.msg ?: \"\"");
            }
            contentValues2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str9);
            contentValues2.put("time", Long.valueOf(chatMessageOld2.time));
            contentValues2.put("sendState", Integer.valueOf(chatMessageOld2.msgstatus));
            contentValues2.put("isWarn", Boolean.valueOf(chatMessageOld2.isWarn));
            contentValues2.put("isAcceptMsg", Boolean.valueOf(chatMessageOld2.to == jOooO0oO2));
            int i2 = chatMessageOld2.type;
            if (i2 == 2103) {
                contentValues2.put("contentType", (Integer) 1);
            } else if (i2 == 2105) {
                contentValues2.put("contentType", (Integer) 5);
                contentValues2.put("giftId", Long.valueOf(chatMessageOld2.giftid));
                contentValues2.put("giftNumber", Integer.valueOf(chatMessageOld2.number));
                contentValues2.put("giftUrl", "");
            } else if (i2 == 2109) {
                contentValues2.put("contentType", (Integer) 2);
                String str10 = chatMessageOld2.url;
                if (str10 == null) {
                    str10 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(str10, "it.url ?: \"\"");
                }
                contentValues2.put("voiceUrl", str10);
                contentValues2.put("voiceDuration", Integer.valueOf(chatMessageOld2.duration));
                String str11 = chatMessageOld2.filename;
                if (str11 != null) {
                    Intrinsics.checkNotNullExpressionValue(str11, "it.filename ?: \"\"");
                    str3 = str11;
                }
                contentValues2.put("voiceFileName", str3);
                contentValues2.put("isVoiceRead", Boolean.valueOf(chatMessageOld2.isRead == 1));
            } else if (i2 == 2115) {
                contentValues2.put("contentType", (Integer) 3);
                contentValues2.put("emoticonType", Long.valueOf(chatMessageOld2.giftid));
                contentValues2.put("emoticonValue", chatMessageOld2.msg);
                contentValues2.put("emoticonIsRead", Boolean.valueOf(chatMessageOld2.isRead == 1));
            } else if (i2 != 2124) {
                switch (i2) {
                    case 2119:
                        contentValues2.put("contentType", (Integer) 4);
                        contentValues2.put("gifId", Integer.valueOf(chatMessageOld2.gif.gifId));
                        contentValues2.put("gifUrl", chatMessageOld2.gif.gifUrl);
                        break;
                    case 2120:
                        contentValues2.put("contentType", (Integer) 6);
                        contentValues2.put("roomHeader", chatMessageOld2.shareRoom.roomHeader);
                        contentValues2.put("roomName", chatMessageOld2.shareRoom.roomName);
                        contentValues2.put(ContributionFragment.ARG_1, Long.valueOf(chatMessageOld2.shareRoom.roomId));
                        contentValues2.put("roomIdx", chatMessageOld2.shareRoom.roomIdx);
                        contentValues2.put("roomIp", chatMessageOld2.shareRoom.roomIp + "");
                        break;
                    case 2121:
                        contentValues2.put("contentType", (Integer) 7);
                        contentValues2.put("momentId", Long.valueOf(chatMessageOld2.shareMoment.momentId));
                        contentValues2.put("momentImage", chatMessageOld2.shareMoment.image);
                        contentValues2.put("momentText", chatMessageOld2.shareMoment.text + "");
                        contentValues2.put("momentMsg", chatMessageOld2.shareMoment.msg + "");
                        break;
                    case 2122:
                        contentValues2.put("contentType", (Integer) 8);
                        contentValues2.put("topicId", Long.valueOf(chatMessageOld2.shareTopic.circleId));
                        contentValues2.put("topicImage", chatMessageOld2.shareTopic.image);
                        contentValues2.put("topicName", chatMessageOld2.shareTopic.name);
                        contentValues2.put("topicUserCount", Integer.valueOf(chatMessageOld2.shareTopic.userCount));
                        contentValues2.put("topicMomentCount", Integer.valueOf(chatMessageOld2.shareTopic.momentCount));
                        contentValues2.put("topicMsg", chatMessageOld2.shareTopic.msg + "");
                        break;
                }
            } else {
                contentValues2.put("contentType", (Integer) 9);
                contentValues2.put("shareUserId", Long.valueOf(chatMessageOld2.shareUser.id));
                contentValues2.put("shareUserIdx", Long.valueOf(chatMessageOld2.shareUser.idx));
                contentValues2.put("shareUserHead", chatMessageOld2.shareUser.head);
                contentValues2.put("shareUserName", chatMessageOld2.shareUser.name);
                contentValues2.put("shareUserMessage", chatMessageOld2.shareUser.msg + "");
            }
            arrayList.add(contentValues2);
        }
    }

    public final void OooO0o0(SupportSQLiteDatabase supportSQLiteDatabase, List<? extends NewFriendsOld> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (NewFriendsOld newFriendsOld : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", newFriendsOld.standbytwo);
            contentValues.put("targetUserId", newFriendsOld.userid);
            contentValues.put("mid", newFriendsOld.mid);
            String str = newFriendsOld.state;
            Intrinsics.checkNotNullExpressionValue(str, "it.state");
            int i = 0;
            switch (str.hashCode()) {
                case -934813676:
                    if (str.equals(NewFriendsOld.State_Refuse)) {
                        i = 2;
                    }
                    break;
                case 108960:
                    str.equals(NewFriendsOld.State_New);
                    break;
                case 92762796:
                    if (str.equals(NewFriendsOld.State_Agree)) {
                        i = 1;
                    }
                    break;
                case 1544803905:
                    if (str.equals(NewFriendsOld.State_Default)) {
                        i = -1;
                    }
                    break;
            }
            contentValues.put(ServerProtocol.DIALOG_PARAM_STATE, Integer.valueOf(i));
            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, newFriendsOld.message);
            contentValues.put("time", Long.valueOf(newFriendsOld.time));
            contentValues.put("isRead", Boolean.valueOf(newFriendsOld.isRead));
            arrayList.add(contentValues);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            supportSQLiteDatabase.insert("FriendRequestMessageTable", 5, (ContentValues) it.next());
        }
    }
}
