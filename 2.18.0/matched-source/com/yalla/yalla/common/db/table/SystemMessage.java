package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import com.app.base.fragment.ContributionFragment;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "SystemMessageTable")
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:*\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0098\u0001\u001a\u00020KH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00102\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR \u0010D\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u00020K8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010P\u001a\u00020K8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR \u0010S\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR \u0010Y\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R \u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\u00020f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR \u0010k\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010w\u001a\u00020x8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001e\u0010}\u001a\u00020f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010h\"\u0004\b\u007f\u0010jR&\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006®\u0001"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage;", "", "()V", "aristocracyInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$AristocracyExpiredInfo;", "getAristocracyInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$AristocracyExpiredInfo;", "setAristocracyInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$AristocracyExpiredInfo;)V", "consumerRebateInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$ConsumerRebateInfo;", "getConsumerRebateInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$ConsumerRebateInfo;", "setConsumerRebateInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$ConsumerRebateInfo;)V", "customTheme", "Lcom/yalla/yalla/common/db/table/SystemMessage$CustomTheme;", "getCustomTheme", "()Lcom/yalla/yalla/common/db/table/SystemMessage$CustomTheme;", "setCustomTheme", "(Lcom/yalla/yalla/common/db/table/SystemMessage$CustomTheme;)V", "eventInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$EventInfo;", "getEventInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$EventInfo;", "setEventInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$EventInfo;)V", "firstRewardInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$FirstRewardInfo;", "getFirstRewardInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$FirstRewardInfo;", "setFirstRewardInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$FirstRewardInfo;)V", "giveThemeInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$GiveThemeInfo;", "getGiveThemeInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$GiveThemeInfo;", "setGiveThemeInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$GiveThemeInfo;)V", "isRead", "", "()Z", "setRead", "(Z)V", "joinTopicInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$JoinTopicInfo;", "getJoinTopicInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$JoinTopicInfo;", "setJoinTopicInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$JoinTopicInfo;)V", "kaVipMsgInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$VipMsgInfo;", "getKaVipMsgInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$VipMsgInfo;", "setKaVipMsgInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$VipMsgInfo;)V", "medalNoticeInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$MedalNoticeInfo;", "getMedalNoticeInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$MedalNoticeInfo;", "setMedalNoticeInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$MedalNoticeInfo;)V", "memberBadgeFrozenInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeFrozenInfo;", "getMemberBadgeFrozenInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeFrozenInfo;", "setMemberBadgeFrozenInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeFrozenInfo;)V", "memberBadgeTopRankReward", "Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeTopRankReward;", "getMemberBadgeTopRankReward", "()Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeTopRankReward;", "setMemberBadgeTopRankReward", "(Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeTopRankReward;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", "roomUpgradeInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$RoomUpgradeInfo;", "getRoomUpgradeInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$RoomUpgradeInfo;", "setRoomUpgradeInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$RoomUpgradeInfo;)V", "roomWageInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$RoomWageInfo;", "getRoomWageInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$RoomWageInfo;", "setRoomWageInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$RoomWageInfo;)V", "subscribeRewardInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$SubscribeRewardInfo;", "getSubscribeRewardInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$SubscribeRewardInfo;", "setSubscribeRewardInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$SubscribeRewardInfo;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "topicStateInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$TopicStateInfo;", "getTopicStateInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$TopicStateInfo;", "setTopicStateInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$TopicStateInfo;)V", "treasureBox", "Lcom/yalla/yalla/common/db/table/SystemMessage$TreasureBox;", "getTreasureBox", "()Lcom/yalla/yalla/common/db/table/SystemMessage$TreasureBox;", "setTreasureBox", "(Lcom/yalla/yalla/common/db/table/SystemMessage$TreasureBox;)V", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "uniqueIdDueRemindInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$UniqueIdDueRemindInfo;", "getUniqueIdDueRemindInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$UniqueIdDueRemindInfo;", "setUniqueIdDueRemindInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$UniqueIdDueRemindInfo;)V", "unlockAvatarFrameInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$UnlockAvatarFrameInfo;", "getUnlockAvatarFrameInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$UnlockAvatarFrameInfo;", "setUnlockAvatarFrameInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$UnlockAvatarFrameInfo;)V", "userUpgradeInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$UserUpgradeInfo;", "getUserUpgradeInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$UserUpgradeInfo;", "setUserUpgradeInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$UserUpgradeInfo;)V", "vipInfo", "Lcom/yalla/yalla/common/db/table/SystemMessage$PremiumInfo;", "getVipInfo", "()Lcom/yalla/yalla/common/db/table/SystemMessage$PremiumInfo;", "setVipInfo", "(Lcom/yalla/yalla/common/db/table/SystemMessage$PremiumInfo;)V", "toString", "AristocracyExpiredInfo", "Companion", "ConsumerRebateInfo", "CustomTheme", "EventInfo", "FirstRewardInfo", "GiveThemeInfo", "JoinTopicInfo", "MedalNoticeInfo", "MemberBadgeFrozenInfo", "MemberBadgeTopRankReward", "PremiumInfo", "RoomUpgradeInfo", "RoomWageInfo", "SubscribeRewardInfo", "TopicStateInfo", "TreasureBox", "UniqueIdDueRemindInfo", "UnlockAvatarFrameInfo", "UserUpgradeInfo", "VipMsgInfo", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SystemMessage {
    public static final int ACHIEVEMENT_MEDAL = 19;
    public static final int APP_WAKEUP = 18;
    public static final int ARISTOCRACY_HAS_EXPIRED = 11;
    public static final int ARISTOCRACY_WILL_EXPIRE = 10;
    public static final int CREATE_TOPIC_STATE = 3;
    public static final int CUSTOM_THEME_DELETE = 24;
    public static final int CUSTOM_THEME_FAILED = 23;
    public static final int CUSTOM_THEME_SUCCESSFUL = 22;
    public static final int EVENT_APPROVED = 31;
    public static final int EVENT_DELETED_FOR_CREATOR = 29;
    public static final int EVENT_DELETED_FOR_SUBSCRIBER = 30;
    public static final int EVENT_FIRST_MONTH_RECHARGE_BONUS = 35;
    public static final int EVENT_FIRST_RECHARGE_BONUS = 33;
    public static final int EVENT_RECHARGE_BONUS = 34;
    public static final int EVENT_RECOMMEND = 32;
    public static final int EVENT_START_FOR_CREATOR = 27;
    public static final int EVENT_START_FOR_SUBSCRIBER = 28;
    public static final int GIVE_THEME_REIMBURSE = 26;
    public static final int HEADER_FRAME_UNLOCK = 16;
    public static final int HONOR_MEDAL = 20;
    public static final int JOIN_TOPIC_MEMBER = 2;
    public static final int KA_VIP_MESSAGE = 25;
    public static final int LUCKY_REFUND = 8;
    public static final int LUCKY_RETURN_GIFT = 9;
    public static final int ROOM_MEMBER_BADGE_FROZEN = 36;
    public static final int ROOM_MEMBER_TOP_RANK_REWARD = 37;
    public static final int ROOM_UPGRADE = 6;
    public static final int ROOM_WAGES = 7;
    public static final int SUBSCRIBE_PREMIUM_REWARD = 17;
    public static final int THE_MORA_EXPIRED = 4;
    public static final int TOP_CARD_BID_REFUND = 13;
    public static final int TOP_CARD_BID_SUCCESS = 14;
    public static final int TREASURE_BOX = 21;
    public static final int TYPE_SUBSCRIBE_VIP = 1;
    public static final int UNIQUE_ID_DUE_REMIND = 12;
    public static final int USER_UPGRADE = 5;
    public static final int VIP_CONSUMER_REBATE = 15;

    @Embedded
    @Nullable
    private AristocracyExpiredInfo aristocracyInfo;

    @Embedded
    @Nullable
    private ConsumerRebateInfo consumerRebateInfo;

    @Embedded
    @Nullable
    private CustomTheme customTheme;

    @Embedded
    @Nullable
    private EventInfo eventInfo;

    @Embedded
    @Nullable
    private FirstRewardInfo firstRewardInfo;

    @Embedded
    @Nullable
    private GiveThemeInfo giveThemeInfo;

    @ColumnInfo(name = "isRead")
    private boolean isRead;

    @Embedded
    @Nullable
    private JoinTopicInfo joinTopicInfo;

    @Embedded
    @Nullable
    private VipMsgInfo kaVipMsgInfo;

    @Embedded
    @Nullable
    private MedalNoticeInfo medalNoticeInfo;

    @Embedded
    @Nullable
    private MemberBadgeFrozenInfo memberBadgeFrozenInfo;

    @Embedded
    @Nullable
    private MemberBadgeTopRankReward memberBadgeTopRankReward;

    @Embedded
    @Nullable
    private RoomUpgradeInfo roomUpgradeInfo;

    @Embedded
    @Nullable
    private RoomWageInfo roomWageInfo;

    @Embedded
    @Nullable
    private SubscribeRewardInfo subscribeRewardInfo;

    @ColumnInfo(name = "time")
    private long time;

    @Embedded
    @Nullable
    private TopicStateInfo topicStateInfo;

    @Embedded
    @Nullable
    private TreasureBox treasureBox;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;

    @Embedded
    @Nullable
    private UniqueIdDueRemindInfo uniqueIdDueRemindInfo;

    @Embedded
    @Nullable
    private UnlockAvatarFrameInfo unlockAvatarFrameInfo;

    @Embedded
    @Nullable
    private UserUpgradeInfo userUpgradeInfo;

    @Embedded
    @Nullable
    private PremiumInfo vipInfo;
    public static final int $stable = 8;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$AristocracyExpiredInfo;", "", "()V", "buyType", "", "getBuyType", "()I", "setBuyType", "(I)V", "nVIPLv", "getNVIPLv", "setNVIPLv", "vipLevel", "getVipLevel", "setVipLevel", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AristocracyExpiredInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "aristocracyBuyType")
        private int buyType;

        @ColumnInfo(name = "nVIPLv")
        private int nVIPLv;

        @ColumnInfo(name = "aristocracyLevel")
        private int vipLevel;

        public final int getBuyType() {
            return this.buyType;
        }

        public final int getNVIPLv() {
            return this.nVIPLv;
        }

        public final int getVipLevel() {
            return this.vipLevel;
        }

        public final void setBuyType(int i) {
            this.buyType = i;
        }

        public final void setNVIPLv(int i) {
            this.nVIPLv = i;
        }

        public final void setVipLevel(int i) {
            this.vipLevel = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$ConsumerRebateInfo;", "", "()V", "rebateCoin", "", "getRebateCoin", "()I", "setRebateCoin", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ConsumerRebateInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "consumerRebateCoin")
        private int rebateCoin;

        public final int getRebateCoin() {
            return this.rebateCoin;
        }

        public final void setRebateCoin(int i) {
            this.rebateCoin = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$CustomTheme;", "", "()V", "cause", "", "getCause", "()I", "setCause", "(I)V", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CustomTheme {
        public static final int REASON_OF_ADVERTISING = 3;
        public static final int REASON_OF_INSULT = 7;
        public static final int REASON_OF_LANGUAGE_MISMATCH = 5;
        public static final int REASON_OF_LOW_QUALITY_PICTURE = 6;
        public static final int REASON_OF_OTHER = 9;
        public static final int REASON_OF_PORNOGRAPHY = 1;
        public static final int REASON_OF_REPORTED_BY_USERS = 8;
        public static final int REASON_OF_SENSITIVE_INFORMATION = 4;
        public static final int REASON_OF_UNCOMFORTABLE = 2;

        @ColumnInfo(name = "custom_theme_cause")
        private int cause;
        public static final int $stable = 8;

        public final int getCause() {
            return this.cause;
        }

        public final void setCause(int i) {
            this.cause = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006#"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$EventInfo;", "", "()V", "eventId", "", "getEventId", "()Ljava/lang/Long;", "setEventId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minute", "", "getMinute", "()Ljava/lang/Integer;", "setMinute", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "reason", "getReason", "setReason", "reasonType", "getReasonType", "setReasonType", ContributionFragment.ARG_1, "getRoomId", "setRoomId", AnalyticsConfig.RTD_START_TIME, "getStartTime", "setStartTime", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EventInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "reasonType")
        @Nullable
        private Integer reasonType;

        @ColumnInfo(name = "eventName")
        @Nullable
        private String name = "";

        @ColumnInfo(name = "eventMinute")
        @Nullable
        private Integer minute = 0;

        @ColumnInfo(name = "eventStartTime")
        @Nullable
        private Long startTime = 0L;

        @ColumnInfo(name = "eventReason")
        @Nullable
        private String reason = "";

        @ColumnInfo(name = "eventRoomId")
        @Nullable
        private Long roomId = 0L;

        @ColumnInfo(name = "eventId")
        @Nullable
        private Long eventId = 0L;

        @Nullable
        public final Long getEventId() {
            return this.eventId;
        }

        @Nullable
        public final Integer getMinute() {
            return this.minute;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final Integer getReasonType() {
            return this.reasonType;
        }

        @Nullable
        public final Long getRoomId() {
            return this.roomId;
        }

        @Nullable
        public final Long getStartTime() {
            return this.startTime;
        }

        public final void setEventId(@Nullable Long l) {
            this.eventId = l;
        }

        public final void setMinute(@Nullable Integer num) {
            this.minute = num;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setReason(@Nullable String str) {
            this.reason = str;
        }

        public final void setReasonType(@Nullable Integer num) {
            this.reasonType = num;
        }

        public final void setRoomId(@Nullable Long l) {
            this.roomId = l;
        }

        public final void setStartTime(@Nullable Long l) {
            this.startTime = l;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$FirstRewardInfo;", "", "()V", "messageType", "", "getMessageType", "()I", "setMessageType", "(I)V", "rewardCoin", "getRewardCoin", "setRewardCoin", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FirstRewardInfo {
        public static final int FirstReward = 0;
        public static final int FirstRewardForMonth = 1;

        @ColumnInfo(name = "messageType")
        private int messageType;

        @ColumnInfo(name = "rewardCoin")
        private int rewardCoin;
        public static final int $stable = 8;

        public final int getMessageType() {
            return this.messageType;
        }

        public final int getRewardCoin() {
            return this.rewardCoin;
        }

        public final void setMessageType(int i) {
            this.messageType = i;
        }

        public final void setRewardCoin(int i) {
            this.rewardCoin = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$GiveThemeInfo;", "", "()V", "dayNum", "", "getDayNum", "()I", "setDayNum", "(I)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GiveThemeInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "give_theme_dayNum")
        private int dayNum;

        @ColumnInfo(name = "give_theme_userId")
        private long userId;

        public final int getDayNum() {
            return this.dayNum;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setDayNum(int i) {
            this.dayNum = i;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$JoinTopicInfo;", "", "()V", "joinTopicId", "", "getJoinTopicId", "()I", "setJoinTopicId", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class JoinTopicInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "joinTopicId")
        private int joinTopicId;

        public final int getJoinTopicId() {
            return this.joinTopicId;
        }

        public final void setJoinTopicId(int i) {
            this.joinTopicId = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$MedalNoticeInfo;", "", "()V", "medalId", "", "getMedalId", "()I", "setMedalId", "(I)V", "medalLevel", "getMedalLevel", "setMedalLevel", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MedalNoticeInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "medalId")
        private int medalId;

        @ColumnInfo(name = "medalLevel")
        private int medalLevel;

        public final int getMedalId() {
            return this.medalId;
        }

        public final int getMedalLevel() {
            return this.medalLevel;
        }

        public final void setMedalId(int i) {
            this.medalId = i;
        }

        public final void setMedalLevel(int i) {
            this.medalLevel = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeFrozenInfo;", "", "()V", ContributionFragment.ARG_1, "", "getRoomId", "()Ljava/lang/Long;", "setRoomId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "roomName", "", "getRoomName", "()Ljava/lang/String;", "setRoomName", "(Ljava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MemberBadgeFrozenInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "MemberBadgeFrozenInfo_roomId")
        @Nullable
        private Long roomId;

        @ColumnInfo(name = "MemberBadgeFrozenInfo_roomName")
        @Nullable
        private String roomName;

        @Nullable
        public final Long getRoomId() {
            return this.roomId;
        }

        @Nullable
        public final String getRoomName() {
            return this.roomName;
        }

        public final void setRoomId(@Nullable Long l) {
            this.roomId = l;
        }

        public final void setRoomName(@Nullable String str) {
            this.roomName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$MemberBadgeTopRankReward;", "", "()V", "shopId", "", "getShopId", "()Ljava/lang/Integer;", "setShopId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shopUrl", "", "getShopUrl", "()Ljava/lang/String;", "setShopUrl", "(Ljava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MemberBadgeTopRankReward {
        public static final int $stable = 8;

        @ColumnInfo(name = "MemberBadgeTopRankReward_shopId")
        @Nullable
        private Integer shopId;

        @ColumnInfo(name = "MemberBadgeTopRankReward_shopUrl")
        @Nullable
        private String shopUrl;

        @Nullable
        public final Integer getShopId() {
            return this.shopId;
        }

        @Nullable
        public final String getShopUrl() {
            return this.shopUrl;
        }

        public final void setShopId(@Nullable Integer num) {
            this.shopId = num;
        }

        public final void setShopUrl(@Nullable String str) {
            this.shopUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$PremiumInfo;", "", "()V", "vipLevel", "", "getVipLevel", "()I", "setVipLevel", "(I)V", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PremiumInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "vipLevel")
        private int vipLevel;

        public final int getVipLevel() {
            return this.vipLevel;
        }

        public final void setVipLevel(int i) {
            this.vipLevel = i;
        }

        @NotNull
        public String toString() {
            return o0O0ooO.OooO00o(OooO00o.OooO0O0("VipInfo(vipLevel="), this.vipLevel, ')');
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$RoomUpgradeInfo;", "", "()V", "roomLevel", "", "getRoomLevel", "()I", "setRoomLevel", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RoomUpgradeInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "roomUpLevel")
        private int roomLevel;

        public final int getRoomLevel() {
            return this.roomLevel;
        }

        public final void setRoomLevel(int i) {
            this.roomLevel = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$RoomWageInfo;", "", "()V", "wageCoin", "", "getWageCoin", "()I", "setWageCoin", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RoomWageInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "roomWageCoin")
        private int wageCoin;

        public final int getWageCoin() {
            return this.wageCoin;
        }

        public final void setWageCoin(int i) {
            this.wageCoin = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$SubscribeRewardInfo;", "", "()V", "rewardCoin", "", "getRewardCoin", "()I", "setRewardCoin", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SubscribeRewardInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "subscribeRewardCoin")
        private int rewardCoin;

        public final int getRewardCoin() {
            return this.rewardCoin;
        }

        public final void setRewardCoin(int i) {
            this.rewardCoin = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$TopicStateInfo;", "", "()V", "topicFailType", "", "getTopicFailType", "()I", "setTopicFailType", "(I)V", "topicId", "getTopicId", "setTopicId", "topicName", "", "getTopicName", "()Ljava/lang/String;", "setTopicName", "(Ljava/lang/String;)V", "topicType", "getTopicType", "setTopicType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TopicStateInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "topicFailType")
        private int topicFailType;

        @ColumnInfo(name = "topicId")
        private int topicId;

        @ColumnInfo(name = "topicName")
        @NotNull
        private String topicName = "";

        @ColumnInfo(name = "topicType")
        private int topicType;

        public final int getTopicFailType() {
            return this.topicFailType;
        }

        public final int getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final int getTopicType() {
            return this.topicType;
        }

        public final void setTopicFailType(int i) {
            this.topicFailType = i;
        }

        public final void setTopicId(int i) {
            this.topicId = i;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTopicType(int i) {
            this.topicType = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$TreasureBox;", "", "()V", "awardType", "", "getAwardType", "()I", "setAwardType", "(I)V", "imageurl", "", "getImageurl", "()Ljava/lang/String;", "setImageurl", "(Ljava/lang/String;)V", "number", "getNumber", "setNumber", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TreasureBox {
        public static final int $stable = 8;

        @ColumnInfo(name = "awardType")
        private int awardType;

        @ColumnInfo(name = "treasureBoxImageUrl")
        @Nullable
        private String imageurl;

        @ColumnInfo(name = "treasureBoxNumber")
        private int number;

        public final int getAwardType() {
            return this.awardType;
        }

        @Nullable
        public final String getImageurl() {
            return this.imageurl;
        }

        public final int getNumber() {
            return this.number;
        }

        public final void setAwardType(int i) {
            this.awardType = i;
        }

        public final void setImageurl(@Nullable String str) {
            this.imageurl = str;
        }

        public final void setNumber(int i) {
            this.number = i;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("TreasureBox(awardType=");
            sbOooO0O0.append(this.awardType);
            sbOooO0O0.append(", number=");
            sbOooO0O0.append(this.number);
            sbOooO0O0.append(", imageurl='");
            return OooO00o.OooO00o(sbOooO0O0, this.imageurl, "')");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$UniqueIdDueRemindInfo;", "", "()V", "expirationTime", "", "getExpirationTime", "()J", "setExpirationTime", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UniqueIdDueRemindInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "uniqueIdExpirationTime")
        private long expirationTime;

        public final long getExpirationTime() {
            return this.expirationTime;
        }

        public final void setExpirationTime(long j) {
            this.expirationTime = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$UnlockAvatarFrameInfo;", "", "()V", "avatarFrameUrl", "", "getAvatarFrameUrl", "()Ljava/lang/String;", "setAvatarFrameUrl", "(Ljava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UnlockAvatarFrameInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "unlockAvatarFrameUrl")
        @NotNull
        private String avatarFrameUrl = "";

        @NotNull
        public final String getAvatarFrameUrl() {
            return this.avatarFrameUrl;
        }

        public final void setAvatarFrameUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.avatarFrameUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$UserUpgradeInfo;", "", "()V", "upCoin", "", "getUpCoin", "()I", "setUpCoin", "(I)V", "upCrystal", "getUpCrystal", "setUpCrystal", "userLevel", "getUserLevel", "setUserLevel", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UserUpgradeInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "userUpCoin")
        private int upCoin;

        @ColumnInfo(name = "userUpCrystal")
        private int upCrystal;

        @ColumnInfo(name = "userUpLevel")
        private int userLevel;

        public final int getUpCoin() {
            return this.upCoin;
        }

        public final int getUpCrystal() {
            return this.upCrystal;
        }

        public final int getUserLevel() {
            return this.userLevel;
        }

        public final void setUpCoin(int i) {
            this.upCoin = i;
        }

        public final void setUpCrystal(int i) {
            this.upCrystal = i;
        }

        public final void setUserLevel(int i) {
            this.userLevel = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/common/db/table/SystemMessage$VipMsgInfo;", "", "()V", "kaVipLevel", "", "getKaVipLevel", "()I", "setKaVipLevel", "(I)V", "kaVipType", "getKaVipType", "setKaVipType", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VipMsgInfo {
        public static final int KA_VIP_EXPIRE = 1;
        public static final int KA_VIP_WILL_UPGRADE = 2;
        public static final int OBTAIN_KA_VIP = 3;

        @ColumnInfo(name = "kaVipLevel")
        private int kaVipLevel;

        @ColumnInfo(name = "kaVipType")
        private int kaVipType;
        public static final int $stable = 8;

        public final int getKaVipLevel() {
            return this.kaVipLevel;
        }

        public final int getKaVipType() {
            return this.kaVipType;
        }

        public final void setKaVipLevel(int i) {
            this.kaVipLevel = i;
        }

        public final void setKaVipType(int i) {
            this.kaVipType = i;
        }
    }

    @Nullable
    public final AristocracyExpiredInfo getAristocracyInfo() {
        return this.aristocracyInfo;
    }

    @Nullable
    public final ConsumerRebateInfo getConsumerRebateInfo() {
        return this.consumerRebateInfo;
    }

    @Nullable
    public final CustomTheme getCustomTheme() {
        return this.customTheme;
    }

    @Nullable
    public final EventInfo getEventInfo() {
        return this.eventInfo;
    }

    @Nullable
    public final FirstRewardInfo getFirstRewardInfo() {
        return this.firstRewardInfo;
    }

    @Nullable
    public final GiveThemeInfo getGiveThemeInfo() {
        return this.giveThemeInfo;
    }

    @Nullable
    public final JoinTopicInfo getJoinTopicInfo() {
        return this.joinTopicInfo;
    }

    @Nullable
    public final VipMsgInfo getKaVipMsgInfo() {
        return this.kaVipMsgInfo;
    }

    @Nullable
    public final MedalNoticeInfo getMedalNoticeInfo() {
        return this.medalNoticeInfo;
    }

    @Nullable
    public final MemberBadgeFrozenInfo getMemberBadgeFrozenInfo() {
        return this.memberBadgeFrozenInfo;
    }

    @Nullable
    public final MemberBadgeTopRankReward getMemberBadgeTopRankReward() {
        return this.memberBadgeTopRankReward;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final RoomUpgradeInfo getRoomUpgradeInfo() {
        return this.roomUpgradeInfo;
    }

    @Nullable
    public final RoomWageInfo getRoomWageInfo() {
        return this.roomWageInfo;
    }

    @Nullable
    public final SubscribeRewardInfo getSubscribeRewardInfo() {
        return this.subscribeRewardInfo;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final TopicStateInfo getTopicStateInfo() {
        return this.topicStateInfo;
    }

    @Nullable
    public final TreasureBox getTreasureBox() {
        return this.treasureBox;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    @Nullable
    public final UniqueIdDueRemindInfo getUniqueIdDueRemindInfo() {
        return this.uniqueIdDueRemindInfo;
    }

    @Nullable
    public final UnlockAvatarFrameInfo getUnlockAvatarFrameInfo() {
        return this.unlockAvatarFrameInfo;
    }

    @Nullable
    public final UserUpgradeInfo getUserUpgradeInfo() {
        return this.userUpgradeInfo;
    }

    @Nullable
    public final PremiumInfo getVipInfo() {
        return this.vipInfo;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setAristocracyInfo(@Nullable AristocracyExpiredInfo aristocracyExpiredInfo) {
        this.aristocracyInfo = aristocracyExpiredInfo;
    }

    public final void setConsumerRebateInfo(@Nullable ConsumerRebateInfo consumerRebateInfo) {
        this.consumerRebateInfo = consumerRebateInfo;
    }

    public final void setCustomTheme(@Nullable CustomTheme customTheme) {
        this.customTheme = customTheme;
    }

    public final void setEventInfo(@Nullable EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    public final void setFirstRewardInfo(@Nullable FirstRewardInfo firstRewardInfo) {
        this.firstRewardInfo = firstRewardInfo;
    }

    public final void setGiveThemeInfo(@Nullable GiveThemeInfo giveThemeInfo) {
        this.giveThemeInfo = giveThemeInfo;
    }

    public final void setJoinTopicInfo(@Nullable JoinTopicInfo joinTopicInfo) {
        this.joinTopicInfo = joinTopicInfo;
    }

    public final void setKaVipMsgInfo(@Nullable VipMsgInfo vipMsgInfo) {
        this.kaVipMsgInfo = vipMsgInfo;
    }

    public final void setMedalNoticeInfo(@Nullable MedalNoticeInfo medalNoticeInfo) {
        this.medalNoticeInfo = medalNoticeInfo;
    }

    public final void setMemberBadgeFrozenInfo(@Nullable MemberBadgeFrozenInfo memberBadgeFrozenInfo) {
        this.memberBadgeFrozenInfo = memberBadgeFrozenInfo;
    }

    public final void setMemberBadgeTopRankReward(@Nullable MemberBadgeTopRankReward memberBadgeTopRankReward) {
        this.memberBadgeTopRankReward = memberBadgeTopRankReward;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setRoomUpgradeInfo(@Nullable RoomUpgradeInfo roomUpgradeInfo) {
        this.roomUpgradeInfo = roomUpgradeInfo;
    }

    public final void setRoomWageInfo(@Nullable RoomWageInfo roomWageInfo) {
        this.roomWageInfo = roomWageInfo;
    }

    public final void setSubscribeRewardInfo(@Nullable SubscribeRewardInfo subscribeRewardInfo) {
        this.subscribeRewardInfo = subscribeRewardInfo;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTopicStateInfo(@Nullable TopicStateInfo topicStateInfo) {
        this.topicStateInfo = topicStateInfo;
    }

    public final void setTreasureBox(@Nullable TreasureBox treasureBox) {
        this.treasureBox = treasureBox;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setUniqueIdDueRemindInfo(@Nullable UniqueIdDueRemindInfo uniqueIdDueRemindInfo) {
        this.uniqueIdDueRemindInfo = uniqueIdDueRemindInfo;
    }

    public final void setUnlockAvatarFrameInfo(@Nullable UnlockAvatarFrameInfo unlockAvatarFrameInfo) {
        this.unlockAvatarFrameInfo = unlockAvatarFrameInfo;
    }

    public final void setUserUpgradeInfo(@Nullable UserUpgradeInfo userUpgradeInfo) {
        this.userUpgradeInfo = userUpgradeInfo;
    }

    public final void setVipInfo(@Nullable PremiumInfo premiumInfo) {
        this.vipInfo = premiumInfo;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("SystemMessage(mid='");
        sbOooO0O0.append(this.mid);
        sbOooO0O0.append("', type=");
        sbOooO0O0.append(this.type);
        sbOooO0O0.append(", message='");
        sbOooO0O0.append(this.message);
        sbOooO0O0.append("', time=");
        sbOooO0O0.append(this.time);
        sbOooO0O0.append(", uid=");
        sbOooO0O0.append(this.uid);
        sbOooO0O0.append(", isRead=");
        sbOooO0O0.append(this.isRead);
        sbOooO0O0.append(", vipInfo=");
        sbOooO0O0.append(this.vipInfo);
        sbOooO0O0.append(", joinTopicInfo=");
        sbOooO0O0.append(this.joinTopicInfo);
        sbOooO0O0.append(", topicStateInfo=");
        sbOooO0O0.append(this.topicStateInfo);
        sbOooO0O0.append(", userUpgradeInfo=");
        sbOooO0O0.append(this.userUpgradeInfo);
        sbOooO0O0.append(", roomUpgradeInfo=");
        sbOooO0O0.append(this.roomUpgradeInfo);
        sbOooO0O0.append(", roomWageInfo=");
        sbOooO0O0.append(this.roomWageInfo);
        sbOooO0O0.append(", aristocracyInfo=");
        sbOooO0O0.append(this.aristocracyInfo);
        sbOooO0O0.append(", uniqueIdDueRemindInfo=");
        sbOooO0O0.append(this.uniqueIdDueRemindInfo);
        sbOooO0O0.append(", consumerRebateInfo=");
        sbOooO0O0.append(this.consumerRebateInfo);
        sbOooO0O0.append(", unlockAvatarFrameInfo=");
        sbOooO0O0.append(this.unlockAvatarFrameInfo);
        sbOooO0O0.append(", subscribeRewardInfo=");
        sbOooO0O0.append(this.subscribeRewardInfo);
        sbOooO0O0.append(", medalNoticeInfo=");
        sbOooO0O0.append(this.medalNoticeInfo);
        sbOooO0O0.append("),customTheme={");
        sbOooO0O0.append(this.customTheme);
        sbOooO0O0.append("}kaVipMsg=");
        sbOooO0O0.append(this.kaVipMsgInfo);
        sbOooO0O0.append(",giveThemeInfo=");
        sbOooO0O0.append(this.giveThemeInfo);
        return sbOooO0O0.toString();
    }
}
