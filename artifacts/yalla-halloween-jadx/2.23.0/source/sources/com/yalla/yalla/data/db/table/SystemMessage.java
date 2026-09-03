package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "SystemMessageTable")
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 ¹\u00012\u00020\u0001:8·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010¶\u0001\u001a\u00020]H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR \u0010D\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010J\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010P\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010V\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001e\u0010\\\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010b\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR \u0010e\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR \u0010k\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010w\u001a\u00020x8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010}\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0087\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0089\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u008f\u0001\u001a\u00020x8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010z\"\u0005\b\u0091\u0001\u0010|R&\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R&\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R&\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R&\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R&\u0010°\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001¨\u0006Ó\u0001"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage;", "", "()V", "aristocracyInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$AristocracyExpiredInfo;", "getAristocracyInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$AristocracyExpiredInfo;", "setAristocracyInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$AristocracyExpiredInfo;)V", "consumerRebateInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$ConsumerRebateInfo;", "getConsumerRebateInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$ConsumerRebateInfo;", "setConsumerRebateInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$ConsumerRebateInfo;)V", "customTheme", "Lcom/yalla/yalla/data/db/table/SystemMessage$CustomTheme;", "getCustomTheme", "()Lcom/yalla/yalla/data/db/table/SystemMessage$CustomTheme;", "setCustomTheme", "(Lcom/yalla/yalla/data/db/table/SystemMessage$CustomTheme;)V", "eventInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$EventInfo;", "getEventInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$EventInfo;", "setEventInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$EventInfo;)V", "firstRewardInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$FirstRewardInfo;", "getFirstRewardInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$FirstRewardInfo;", "setFirstRewardInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$FirstRewardInfo;)V", "giftBackpackExpired", "Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBackpackExpired;", "getGiftBackpackExpired", "()Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBackpackExpired;", "setGiftBackpackExpired", "(Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBackpackExpired;)V", "giftBlindRankingReward", "Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindRankingReward;", "getGiftBlindRankingReward", "()Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindRankingReward;", "setGiftBlindRankingReward", "(Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindRankingReward;)V", "giftBlindTaskReward", "Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindTaskReward;", "getGiftBlindTaskReward", "()Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindTaskReward;", "setGiftBlindTaskReward", "(Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindTaskReward;)V", "giveThemeInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$GiveThemeInfo;", "getGiveThemeInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$GiveThemeInfo;", "setGiveThemeInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$GiveThemeInfo;)V", "isRead", "", "()Z", "setRead", "(Z)V", "joinTopicInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$JoinTopicInfo;", "getJoinTopicInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$JoinTopicInfo;", "setJoinTopicInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$JoinTopicInfo;)V", "kaVipMsgInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$VipMsgInfo;", "getKaVipMsgInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$VipMsgInfo;", "setKaVipMsgInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$VipMsgInfo;)V", "medalNoticeInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$MedalNoticeInfo;", "getMedalNoticeInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$MedalNoticeInfo;", "setMedalNoticeInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$MedalNoticeInfo;)V", "memberBadgeFrozenInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeFrozenInfo;", "getMemberBadgeFrozenInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeFrozenInfo;", "setMemberBadgeFrozenInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeFrozenInfo;)V", "memberBadgeTopRankReward", "Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeTopRankReward;", "getMemberBadgeTopRankReward", "()Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeTopRankReward;", "setMemberBadgeTopRankReward", "(Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeTopRankReward;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", "roomUpgradeInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$RoomUpgradeInfo;", "getRoomUpgradeInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$RoomUpgradeInfo;", "setRoomUpgradeInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$RoomUpgradeInfo;)V", "roomWageInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$RoomWageInfo;", "getRoomWageInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$RoomWageInfo;", "setRoomWageInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$RoomWageInfo;)V", "subscribeRewardInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$SubscribeRewardInfo;", "getSubscribeRewardInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$SubscribeRewardInfo;", "setSubscribeRewardInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$SubscribeRewardInfo;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "topicStateInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$TopicStateInfo;", "getTopicStateInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$TopicStateInfo;", "setTopicStateInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$TopicStateInfo;)V", "treasureBox", "Lcom/yalla/yalla/data/db/table/SystemMessage$TreasureBox;", "getTreasureBox", "()Lcom/yalla/yalla/data/db/table/SystemMessage$TreasureBox;", "setTreasureBox", "(Lcom/yalla/yalla/data/db/table/SystemMessage$TreasureBox;)V", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "uniqueIdDueRemindInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$UniqueIdDueRemindInfo;", "getUniqueIdDueRemindInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$UniqueIdDueRemindInfo;", "setUniqueIdDueRemindInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$UniqueIdDueRemindInfo;)V", "unlockAvatarFrameInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$UnlockAvatarFrameInfo;", "getUnlockAvatarFrameInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$UnlockAvatarFrameInfo;", "setUnlockAvatarFrameInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$UnlockAvatarFrameInfo;)V", "userUpgradeInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$UserUpgradeInfo;", "getUserUpgradeInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$UserUpgradeInfo;", "setUserUpgradeInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$UserUpgradeInfo;)V", "vip6DistributeSupremeGift", "Lcom/yalla/yalla/data/db/table/SystemMessage$Vip6DistributeSupremeGift;", "getVip6DistributeSupremeGift", "()Lcom/yalla/yalla/data/db/table/SystemMessage$Vip6DistributeSupremeGift;", "setVip6DistributeSupremeGift", "(Lcom/yalla/yalla/data/db/table/SystemMessage$Vip6DistributeSupremeGift;)V", "vipInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$PremiumInfo;", "getVipInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$PremiumInfo;", "setVipInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$PremiumInfo;)V", "wealthLevelUpInfo", "Lcom/yalla/yalla/data/db/table/SystemMessage$WealthLevelUpInfo;", "getWealthLevelUpInfo", "()Lcom/yalla/yalla/data/db/table/SystemMessage$WealthLevelUpInfo;", "setWealthLevelUpInfo", "(Lcom/yalla/yalla/data/db/table/SystemMessage$WealthLevelUpInfo;)V", "toString", "AristocracyExpiredInfo", "AwardType", "Companion", "ConsumerRebateInfo", "CustomTheme", "EventInfo", "FirstRewardInfo", "GiftBackpackExpired", "GiftBlindRankingReward", "GiftBlindTaskReward", "GiveThemeInfo", "JoinTopicInfo", "MedalNoticeInfo", "MemberBadgeFrozenInfo", "MemberBadgeTopRankReward", "PremiumInfo", "RoomUpgradeInfo", "RoomWageInfo", "SubscribeRewardInfo", "TopType", "TopicStateInfo", "TreasureBox", "UniqueIdDueRemindInfo", "UnlockAvatarFrameInfo", "UserUpgradeInfo", "Vip6DistributeSupremeGift", "VipMsgInfo", "WealthLevelUpInfo", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    public static final int GIFT_BACKPACK_EXPIRED = 38;
    public static final int GIFT_BLIND_RANKING_REWARD = 40;
    public static final int GIFT_BLIND_TASK_REWARD = 39;
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
    public static final int VIP6_DISTRIBUTE_SUPREME_GIFT = 41;
    public static final int VIP_CONSUMER_REBATE = 15;
    public static final int WEALTH_LEVEL_UPDATE = 88;

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
    private GiftBackpackExpired giftBackpackExpired;

    @Embedded
    @Nullable
    private GiftBlindRankingReward giftBlindRankingReward;

    @Embedded
    @Nullable
    private GiftBlindTaskReward giftBlindTaskReward;

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
    private Vip6DistributeSupremeGift vip6DistributeSupremeGift;

    @Embedded
    @Nullable
    private PremiumInfo vipInfo;

    @Embedded
    @Nullable
    private WealthLevelUpInfo wealthLevelUpInfo;
    public static final int $stable = 8;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$AristocracyExpiredInfo;", "", "()V", "buyType", "", "getBuyType", "()I", "setBuyType", "(I)V", "nVIPLv", "getNVIPLv", "setNVIPLv", "vipLevel", "getVipLevel", "setVipLevel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$AwardType;", "", "()V", "BackpackGift", "", "getBackpackGift", "()I", "ChatBox", "getChatBox", "HeadPortraitBox", "getHeadPortraitBox", "HeaddressCard", "getHeaddressCard", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AwardType {
        public static final int $stable = 0;

        @NotNull
        public static final AwardType INSTANCE = new AwardType();

        @Ignore
        private static final int ChatBox = 1;

        @Ignore
        private static final int HeaddressCard = 2;

        @Ignore
        private static final int BackpackGift = 3;

        @Ignore
        private static final int HeadPortraitBox = 4;

        private AwardType() {
        }

        public final int getBackpackGift() {
            return BackpackGift;
        }

        public final int getChatBox() {
            return ChatBox;
        }

        public final int getHeadPortraitBox() {
            return HeadPortraitBox;
        }

        public final int getHeaddressCard() {
            return HeaddressCard;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$ConsumerRebateInfo;", "", "()V", "rebateCoin", "", "getRebateCoin", "()I", "setRebateCoin", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$CustomTheme;", "", "()V", "cause", "", "getCause", "()I", "setCause", "(I)V", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006#"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$EventInfo;", "", "()V", "eventId", "", "getEventId", "()Ljava/lang/Long;", "setEventId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minute", "", "getMinute", "()Ljava/lang/Integer;", "setMinute", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "reason", "getReason", "setReason", "reasonType", "getReasonType", "setReasonType", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "startTime", "getStartTime", "setStartTime", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$FirstRewardInfo;", "", "()V", "messageType", "", "getMessageType", "()I", "setMessageType", "(I)V", "rewardCoin", "getRewardCoin", "setRewardCoin", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010 \u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR \u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010&\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b¨\u0006,"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBackpackExpired;", "", "()V", "coin", "", "getCoin", "()Ljava/lang/Long;", "setCoin", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dyid", "getDyid", "setDyid", "dyurl", "", "getDyurl", "()Ljava/lang/String;", "setDyurl", "(Ljava/lang/String;)V", "headurl", "getHeadurl", "setHeadurl", "ispraise", "", "getIspraise", "()Ljava/lang/Integer;", "setIspraise", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "language", "getLanguage", "setLanguage", "level", "getLevel", "setLevel", "nickname", "getNickname", "setNickname", "sex", "getSex", "setSex", "upcrystal", "getUpcrystal", "setUpcrystal", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiftBackpackExpired {
        public static final int $stable = 8;

        @ColumnInfo(name = "GiftBackpackExpired_coin")
        @Nullable
        private Long coin;

        @ColumnInfo(name = "GiftBackpackExpired_dyid")
        @Nullable
        private Long dyid;

        @ColumnInfo(name = "GiftBackpackExpired_dyurl")
        @Nullable
        private String dyurl;

        @ColumnInfo(name = "GiftBackpackExpired_headurl")
        @Nullable
        private String headurl;

        @ColumnInfo(name = "GiftBackpackExpired_ispraise")
        @Nullable
        private Integer ispraise;

        @ColumnInfo(name = "GiftBackpackExpired_language")
        @Nullable
        private Integer language;

        @ColumnInfo(name = "GiftBackpackExpired_level")
        @Nullable
        private Integer level;

        @ColumnInfo(name = "GiftBackpackExpired_nickname")
        @Nullable
        private String nickname;

        @ColumnInfo(name = "GiftBackpackExpired_sex")
        @Nullable
        private Integer sex;

        @ColumnInfo(name = "GiftBackpackExpired_upcrystal")
        @Nullable
        private Long upcrystal;

        @Nullable
        public final Long getCoin() {
            return this.coin;
        }

        @Nullable
        public final Long getDyid() {
            return this.dyid;
        }

        @Nullable
        public final String getDyurl() {
            return this.dyurl;
        }

        @Nullable
        public final String getHeadurl() {
            return this.headurl;
        }

        @Nullable
        public final Integer getIspraise() {
            return this.ispraise;
        }

        @Nullable
        public final Integer getLanguage() {
            return this.language;
        }

        @Nullable
        public final Integer getLevel() {
            return this.level;
        }

        @Nullable
        public final String getNickname() {
            return this.nickname;
        }

        @Nullable
        public final Integer getSex() {
            return this.sex;
        }

        @Nullable
        public final Long getUpcrystal() {
            return this.upcrystal;
        }

        public final void setCoin(@Nullable Long l) {
            this.coin = l;
        }

        public final void setDyid(@Nullable Long l) {
            this.dyid = l;
        }

        public final void setDyurl(@Nullable String str) {
            this.dyurl = str;
        }

        public final void setHeadurl(@Nullable String str) {
            this.headurl = str;
        }

        public final void setIspraise(@Nullable Integer num) {
            this.ispraise = num;
        }

        public final void setLanguage(@Nullable Integer num) {
            this.language = num;
        }

        public final void setLevel(@Nullable Integer num) {
            this.level = num;
        }

        public final void setNickname(@Nullable String str) {
            this.nickname = str;
        }

        public final void setSex(@Nullable Integer num) {
            this.sex = num;
        }

        public final void setUpcrystal(@Nullable Long l) {
            this.upcrystal = l;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindRankingReward;", "", "()V", "awardId", "", "getAwardId", "()Ljava/lang/Long;", "setAwardId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "awardcount", "", "getAwardcount", "()Ljava/lang/Integer;", "setAwardcount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "awardimage", "", "getAwardimage", "()Ljava/lang/String;", "setAwardimage", "(Ljava/lang/String;)V", "awardtype", "getAwardtype", "setAwardtype", "toprank", "getToprank", "setToprank", "toptype", "getToptype", "setToptype", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiftBlindRankingReward {
        public static final int $stable = 8;

        @ColumnInfo(name = "GiftBlindRankingReward_awardId")
        @Nullable
        private Long awardId;

        @ColumnInfo(name = "GiftBlindRankingReward_awardcount")
        @Nullable
        private Integer awardcount;

        @ColumnInfo(name = "GiftBlindRankingReward_awardimage")
        @Nullable
        private String awardimage;

        @ColumnInfo(name = "GiftBlindRankingReward_awardtype")
        @Nullable
        private Integer awardtype;

        @ColumnInfo(name = "GiftBlindRankingReward_toprank")
        @Nullable
        private Integer toprank;

        @ColumnInfo(name = "GiftBlindRankingReward_toptype")
        @Nullable
        private Integer toptype;

        @Nullable
        public final Long getAwardId() {
            return this.awardId;
        }

        @Nullable
        public final Integer getAwardcount() {
            return this.awardcount;
        }

        @Nullable
        public final String getAwardimage() {
            return this.awardimage;
        }

        @Nullable
        public final Integer getAwardtype() {
            return this.awardtype;
        }

        @Nullable
        public final Integer getToprank() {
            return this.toprank;
        }

        @Nullable
        public final Integer getToptype() {
            return this.toptype;
        }

        public final void setAwardId(@Nullable Long l) {
            this.awardId = l;
        }

        public final void setAwardcount(@Nullable Integer num) {
            this.awardcount = num;
        }

        public final void setAwardimage(@Nullable String str) {
            this.awardimage = str;
        }

        public final void setAwardtype(@Nullable Integer num) {
            this.awardtype = num;
        }

        public final void setToprank(@Nullable Integer num) {
            this.toprank = num;
        }

        public final void setToptype(@Nullable Integer num) {
            this.toptype = num;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$GiftBlindTaskReward;", "", "()V", "awardId", "", "getAwardId", "()Ljava/lang/Long;", "setAwardId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "awardcount", "", "getAwardcount", "()Ljava/lang/Integer;", "setAwardcount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "awardimage", "", "getAwardimage", "()Ljava/lang/String;", "setAwardimage", "(Ljava/lang/String;)V", "awardtype", "getAwardtype", "setAwardtype", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiftBlindTaskReward {
        public static final int $stable = 8;

        @ColumnInfo(name = "GiftBlindTaskReward_awardId")
        @Nullable
        private Long awardId;

        @ColumnInfo(name = "GiftBlindTaskReward_awardcount")
        @Nullable
        private Integer awardcount;

        @ColumnInfo(name = "GiftBlindTaskReward_awardimage")
        @Nullable
        private String awardimage;

        @ColumnInfo(name = "GiftBlindTaskReward_awardtype")
        @Nullable
        private Integer awardtype;

        @Nullable
        public final Long getAwardId() {
            return this.awardId;
        }

        @Nullable
        public final Integer getAwardcount() {
            return this.awardcount;
        }

        @Nullable
        public final String getAwardimage() {
            return this.awardimage;
        }

        @Nullable
        public final Integer getAwardtype() {
            return this.awardtype;
        }

        public final void setAwardId(@Nullable Long l) {
            this.awardId = l;
        }

        public final void setAwardcount(@Nullable Integer num) {
            this.awardcount = num;
        }

        public final void setAwardimage(@Nullable String str) {
            this.awardimage = str;
        }

        public final void setAwardtype(@Nullable Integer num) {
            this.awardtype = num;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$GiveThemeInfo;", "", "()V", "dayNum", "", "getDayNum", "()I", "setDayNum", "(I)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$JoinTopicInfo;", "", "()V", "joinTopicId", "", "getJoinTopicId", "()I", "setJoinTopicId", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$MedalNoticeInfo;", "", "()V", "medalId", "", "getMedalId", "()I", "setMedalId", "(I)V", "medalLevel", "getMedalLevel", "setMedalLevel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeFrozenInfo;", "", "()V", ContributionFragment.ARG_1, "", "getRoomId", "()Ljava/lang/Long;", "setRoomId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "roomName", "", "getRoomName", "()Ljava/lang/String;", "setRoomName", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$MemberBadgeTopRankReward;", "", "()V", "shopId", "", "getShopId", "()Ljava/lang/Integer;", "setShopId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shopUrl", "", "getShopUrl", "()Ljava/lang/String;", "setShopUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$PremiumInfo;", "", "()V", "vipLevel", "", "getVipLevel", "()I", "setVipLevel", "(I)V", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return OooOO0.OooO00o(this);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$RoomUpgradeInfo;", "", "()V", "roomLevel", "", "getRoomLevel", "()I", "setRoomLevel", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$RoomWageInfo;", "", "()V", "wageCoin", "", "getWageCoin", "()I", "setWageCoin", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$SubscribeRewardInfo;", "", "()V", "rewardCoin", "", "getRewardCoin", "()I", "setRewardCoin", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$TopType;", "", "()V", "GiftRankingReception", "", "getGiftRankingReception", "()I", "GiftRankingSend", "getGiftRankingSend", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TopType {
        public static final int $stable = 0;

        @NotNull
        public static final TopType INSTANCE = new TopType();

        @Ignore
        private static final int GiftRankingSend = 1;

        @Ignore
        private static final int GiftRankingReception = 2;

        private TopType() {
        }

        public final int getGiftRankingReception() {
            return GiftRankingReception;
        }

        public final int getGiftRankingSend() {
            return GiftRankingSend;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$TopicStateInfo;", "", "()V", "topicFailType", "", "getTopicFailType", "()I", "setTopicFailType", "(I)V", "topicId", "getTopicId", "setTopicId", "topicName", "", "getTopicName", "()Ljava/lang/String;", "setTopicName", "(Ljava/lang/String;)V", "topicType", "getTopicType", "setTopicType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$TreasureBox;", "", "()V", "awardType", "", "getAwardType", "()I", "setAwardType", "(I)V", "imageurl", "", "getImageurl", "()Ljava/lang/String;", "setImageurl", "(Ljava/lang/String;)V", "number", "getNumber", "setNumber", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return OooOO0.OooO00o(this);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$UniqueIdDueRemindInfo;", "", "()V", "expirationTime", "", "getExpirationTime", "()J", "setExpirationTime", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$UnlockAvatarFrameInfo;", "", "()V", "avatarFrameUrl", "", "getAvatarFrameUrl", "()Ljava/lang/String;", "setAvatarFrameUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$UserUpgradeInfo;", "", "()V", "upCoin", "", "getUpCoin", "()I", "setUpCoin", "(I)V", "upCrystal", "getUpCrystal", "setUpCrystal", "userLevel", "getUserLevel", "setUserLevel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$Vip6DistributeSupremeGift;", "", "()V", "propCount", "", "getPropCount", "()Ljava/lang/Integer;", "setPropCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "propId", "", "getPropId", "()Ljava/lang/Long;", "setPropId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "propImage", "", "getPropImage", "()Ljava/lang/String;", "setPropImage", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Vip6DistributeSupremeGift {
        public static final int $stable = 8;

        @ColumnInfo(name = "Vip6DistributeSupremeGift_propCount")
        @Nullable
        private Integer propCount;

        @ColumnInfo(name = "Vip6DistributeSupremeGift_propId")
        @Nullable
        private Long propId;

        @ColumnInfo(name = "Vip6DistributeSupremeGift_propImage")
        @Nullable
        private String propImage;

        @Nullable
        public final Integer getPropCount() {
            return this.propCount;
        }

        @Nullable
        public final Long getPropId() {
            return this.propId;
        }

        @Nullable
        public final String getPropImage() {
            return this.propImage;
        }

        public final void setPropCount(@Nullable Integer num) {
            this.propCount = num;
        }

        public final void setPropId(@Nullable Long l) {
            this.propId = l;
        }

        public final void setPropImage(@Nullable String str) {
            this.propImage = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$VipMsgInfo;", "", "()V", "kaVipLevel", "", "getKaVipLevel", "()I", "setKaVipLevel", "(I)V", "kaVipType", "getKaVipType", "setKaVipType", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/db/table/SystemMessage$WealthLevelUpInfo;", "", "()V", "badgeImage", "", "getBadgeImage", "()Ljava/lang/String;", "setBadgeImage", "(Ljava/lang/String;)V", "badgeLevel", "", "getBadgeLevel", "()Ljava/lang/Integer;", "setBadgeLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "wealthLv", "getWealthLv", "setWealthLv", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WealthLevelUpInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "WealthLevelUpInfo_badgeImage")
        @Nullable
        private String badgeImage;

        @ColumnInfo(name = "WealthLevelUpInfo_badgeLevel")
        @Nullable
        private Integer badgeLevel;

        @ColumnInfo(name = "WealthLevelUpInfo_wealthLevel")
        @Nullable
        private Integer wealthLv;

        @Nullable
        public final String getBadgeImage() {
            return this.badgeImage;
        }

        @Nullable
        public final Integer getBadgeLevel() {
            return this.badgeLevel;
        }

        @Nullable
        public final Integer getWealthLv() {
            return this.wealthLv;
        }

        public final void setBadgeImage(@Nullable String str) {
            this.badgeImage = str;
        }

        public final void setBadgeLevel(@Nullable Integer num) {
            this.badgeLevel = num;
        }

        public final void setWealthLv(@Nullable Integer num) {
            this.wealthLv = num;
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
    public final GiftBackpackExpired getGiftBackpackExpired() {
        return this.giftBackpackExpired;
    }

    @Nullable
    public final GiftBlindRankingReward getGiftBlindRankingReward() {
        return this.giftBlindRankingReward;
    }

    @Nullable
    public final GiftBlindTaskReward getGiftBlindTaskReward() {
        return this.giftBlindTaskReward;
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
    public final Vip6DistributeSupremeGift getVip6DistributeSupremeGift() {
        return this.vip6DistributeSupremeGift;
    }

    @Nullable
    public final PremiumInfo getVipInfo() {
        return this.vipInfo;
    }

    @Nullable
    public final WealthLevelUpInfo getWealthLevelUpInfo() {
        return this.wealthLevelUpInfo;
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

    public final void setGiftBackpackExpired(@Nullable GiftBackpackExpired giftBackpackExpired) {
        this.giftBackpackExpired = giftBackpackExpired;
    }

    public final void setGiftBlindRankingReward(@Nullable GiftBlindRankingReward giftBlindRankingReward) {
        this.giftBlindRankingReward = giftBlindRankingReward;
    }

    public final void setGiftBlindTaskReward(@Nullable GiftBlindTaskReward giftBlindTaskReward) {
        this.giftBlindTaskReward = giftBlindTaskReward;
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

    public final void setVip6DistributeSupremeGift(@Nullable Vip6DistributeSupremeGift vip6DistributeSupremeGift) {
        this.vip6DistributeSupremeGift = vip6DistributeSupremeGift;
    }

    public final void setVipInfo(@Nullable PremiumInfo premiumInfo) {
        this.vipInfo = premiumInfo;
    }

    public final void setWealthLevelUpInfo(@Nullable WealthLevelUpInfo wealthLevelUpInfo) {
        this.wealthLevelUpInfo = wealthLevelUpInfo;
    }

    @NotNull
    public String toString() {
        return OooOO0.OooO00o(this);
    }
}
