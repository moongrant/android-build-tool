package com.yalla.yalla.ui.adapter;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OOo.o0O00;
import p579o0oOoo.oOo00o0o;
import p579o0oOoo.ooOOOOoo;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSystemMessageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageAdapter.kt\ncom/yalla/yalla/ui/adapter/SystemMessageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,592:1\n1#2:593\n*E\n"})
public final class o00 extends p400o0Oo0OO.OooOO0O<SystemMessage> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27459OooOOo0;

    public static final class OooO00o extends androidx.recyclerview.widget.OooOo.OooO<SystemMessage> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(SystemMessage systemMessage, SystemMessage systemMessage2) {
            SystemMessage oldItem = systemMessage;
            SystemMessage newItem = systemMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid());
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(SystemMessage systemMessage, SystemMessage systemMessage2) {
            SystemMessage oldItem = systemMessage;
            SystemMessage newItem = systemMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid()) && oldItem.getUid() == newItem.getUid();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(@NotNull FragmentActivity activity) {
        super(Integer.valueOf(oO00OO0O.message_item_system_message), new OooO00o());
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27459OooOOo0 = activity;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x0a22 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:296:0x0a29  */
    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder holder, SystemMessage systemMessage) {
        int upCrystal;
        String imageurl;
        String userName;
        String strValueOf;
        String string;
        String roomName;
        String shopUrl;
        SystemMessage item = systemMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        p592o0oo00O.OooOOO0.OooO0O0("SystemMessage " + holder.getLayoutPosition() + " \n " + item);
        TextView textView = (TextView) holder.getView(oO00O0oO.tvTime);
        boolean z = true;
        if (holder.getLayoutPosition() == getItemCount() - 1 || (holder.getLayoutPosition() < getItemCount() - 1 && item.getTime() - getData(holder.getLayoutPosition() + 1).getTime() > 60000)) {
            textView.setText(p601o0oo0O0.o0000oo.OooO0Oo(item.getTime(), System.currentTimeMillis()));
            com.code.android.util.o000OO00.OooOOOO(textView);
        } else {
            com.code.android.util.o000OO00.OooO0O0(textView);
        }
        NetImageView netImageView = (NetImageView) holder.getView(oO00O0oO.ivSystemNotice);
        netImageView.setImageResource(0);
        TextView textView2 = (TextView) holder.getView(oO00O0oO.tvSystemNoticeTitle);
        TextView textView3 = (TextView) holder.getView(oO00O0oO.tvSystemNoticeContent);
        UserVipView userVipView = (UserVipView) holder.getView(oO00O0oO.userVipView);
        userVipView.getClass();
        VipLevel vipLevel = VipLevel.Vip0;
        userVipView.OooOOO(vipLevel.getValue(), true, null);
        SVGAView sVGAView = (SVGAView) holder.getView(oO00O0oO.svView);
        sVGAView.OooOOO0(true);
        sVGAView.setImageResource(0);
        com.code.android.util.o000OO00.OooO0O0(sVGAView);
        NetImageView netImageView2 = (NetImageView) holder.getView(oO00O0oO.niv);
        com.code.android.util.o000OO00.OooO0O0(netImageView2);
        TextView textView4 = (TextView) holder.getView(oO00O0oO.tvSystemViewMore);
        com.code.android.util.o000OO00.OooO0O0(textView4);
        TextView textView5 = (TextView) holder.getView(oO00O0oO.tvMedalLevel);
        com.code.android.util.o000OO00.OooO0O0(textView5);
        textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.View_more));
        int type = item.getType();
        FragmentActivity fragmentActivity = this.f27459OooOOo0;
        if (type == 88) {
            netImageView.setImageResource(oO00OOO.icon_system_message_wealth);
            SystemMessage.WealthLevelUpInfo wealthLevelUpInfo = item.getWealthLevelUpInfo();
            if (wealthLevelUpInfo != null) {
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_wealth_notify_title));
                textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_wealth_notify_cotent), String.valueOf(wealthLevelUpInfo.getWealthLv())));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Go));
                String badgeImage = wealthLevelUpInfo.getBadgeImage();
                if (badgeImage != null) {
                    com.code.android.util.o000OO00.OooOOOO(sVGAView);
                    sVGAView.OooOO0O(badgeImage, fragmentActivity);
                    sVGAView.OooOO0o();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            return;
        }
        switch (type) {
            case 1:
                int i = UserPremiumView.f30802OooO0o0;
                SystemMessage.PremiumInfo vipInfo = item.getVipInfo();
                sVGAView.setImageResource(UserPremiumView.OooO00o.OooO00o(vipInfo != null ? vipInfo.getVipLevel() : 0));
                SystemMessage.PremiumInfo vipInfo2 = item.getVipInfo();
                textView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip_title), UserPremiumView.OooO00o.OooO0O0(vipInfo2 != null ? vipInfo2.getVipLevel() : PremiumLevel.Premium1.getValue())));
                SystemMessage.PremiumInfo vipInfo3 = item.getVipInfo();
                Integer numValueOf = vipInfo3 != null ? Integer.valueOf(vipInfo3.getVipLevel()) : null;
                int value = PremiumLevel.Premium1.getValue();
                if (numValueOf != null && numValueOf.intValue() == value) {
                    textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip1_content));
                } else {
                    int value2 = PremiumLevel.Premium2.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value2) {
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip2_content));
                    } else {
                        int value3 = PremiumLevel.Premium3.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value3) {
                            textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip3_content));
                        } else {
                            int value4 = PremiumLevel.Premium4.getValue();
                            if (numValueOf != null && numValueOf.intValue() == value4) {
                                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip4_content));
                            } else {
                                int value5 = PremiumLevel.Premium5.getValue();
                                if (numValueOf != null && numValueOf.intValue() == value5) {
                                    textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_subscribe_vip5_content));
                                }
                            }
                        }
                    }
                }
                netImageView.setImageResource(oOo00OO0.icon_system_message_aristocracy);
                com.code.android.util.o000OO00.OooOOOO(sVGAView);
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 2:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_create_topic_member_title));
                textView3.setText(item.getMessage());
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 3:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                SystemMessage.TopicStateInfo topicStateInfo = item.getTopicStateInfo();
                Integer numValueOf2 = topicStateInfo != null ? Integer.valueOf(topicStateInfo.getTopicType()) : null;
                textView2.setText((numValueOf2 != null && numValueOf2.intValue() == 2) ? com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_create_topic_failed_title) : (numValueOf2 != null && numValueOf2.intValue() == 3) ? com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_create_topic_dissolve_title) : com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_create_topic_success_title));
                textView3.setText(item.getMessage());
                SystemMessage.TopicStateInfo topicStateInfo2 = item.getTopicStateInfo();
                if (topicStateInfo2 != null && topicStateInfo2.getTopicType() == 1) {
                    com.code.android.util.o000OO00.OooOOOO(textView4);
                }
                break;
            case 4:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_mora_expired));
                textView3.setText(item.getMessage());
                break;
            case 5:
                String strOooO00o = null;
                SystemMessage.UserUpgradeInfo userUpgradeInfo = item.getUserUpgradeInfo();
                int upCoin = userUpgradeInfo != null ? userUpgradeInfo.getUpCoin() : 0;
                SystemMessage.UserUpgradeInfo userUpgradeInfo2 = item.getUserUpgradeInfo();
                upCrystal = userUpgradeInfo2 != null ? userUpgradeInfo2.getUpCrystal() : 0;
                SystemMessage.UserUpgradeInfo userUpgradeInfo3 = item.getUserUpgradeInfo();
                Integer numValueOf3 = userUpgradeInfo3 != null ? Integer.valueOf(userUpgradeInfo3.getUserLevel()) : null;
                netImageView.setImageResource(oOo00OO0.icon_system_message_user_upgrade);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_user_level_upgrade_title));
                if (upCoin > 0 && upCrystal > 0) {
                    strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_user_level_upgrade_coin_crystal), String.valueOf(upCoin)), String.valueOf(upCrystal)), String.valueOf(numValueOf3));
                } else if (upCoin > 0) {
                    strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_user_level_upgrade_coin), String.valueOf(upCoin)), String.valueOf(numValueOf3));
                } else if (upCrystal > 0) {
                    strOooO00o = com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_user_level_upgrade_cryctal), String.valueOf(upCrystal)), String.valueOf(numValueOf3));
                }
                textView3.setText(strOooO00o);
                break;
            case 6:
                netImageView.setImageResource(oOo00OO0.icon_system_message_room_upgrade);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.icon_system_message_room_upgrade_title));
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_room_promotion_content);
                String[] strArr = new String[1];
                SystemMessage.RoomUpgradeInfo roomUpgradeInfo = item.getRoomUpgradeInfo();
                strArr[0] = String.valueOf(roomUpgradeInfo != null ? Integer.valueOf(roomUpgradeInfo.getRoomLevel()) : null);
                textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
                break;
            case 7:
                netImageView.setImageResource(oOo00OO0.icon_system_message_salary);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_salary_title));
                String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_salary_content);
                String[] strArr2 = new String[1];
                SystemMessage.RoomWageInfo roomWageInfo = item.getRoomWageInfo();
                strArr2[0] = String.valueOf(roomWageInfo != null ? Integer.valueOf(roomWageInfo.getWageCoin()) : null);
                textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO2, strArr2));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 8:
                netImageView.setImageResource(oOo00OO0.icon_system_message_money_back);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_back_title));
                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_back_gold));
                break;
            case 9:
                netImageView.setImageResource(oOo00OO0.icon_system_message_money_back);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_back_title));
                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Lucky_Bag_back_gift));
                break;
            case 10:
                netImageView.setImageResource(oOo00OO0.icon_system_message_membership_due);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_vip_aristocracy_due_remind_title));
                break;
            case 11:
                String strOooO0OO3 = null;
                netImageView.setImageResource(oOo00OO0.icon_system_message_aristocracy);
                SystemMessage.AristocracyExpiredInfo aristocracyInfo = item.getAristocracyInfo();
                int buyType = aristocracyInfo != null ? aristocracyInfo.getBuyType() : 0;
                if (buyType == 0) {
                    strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_vip_aristocracy_due_will_remind_title);
                } else if (buyType == 2) {
                    strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_vip_aristocracy_due_remind_title);
                }
                textView2.setText(strOooO0OO3);
                textView3.setText(item.getMessage());
                int i2 = UserPremiumView.f30802OooO0o0;
                SystemMessage.AristocracyExpiredInfo aristocracyInfo2 = item.getAristocracyInfo();
                int iOooO00o = UserPremiumView.OooO00o.OooO00o(aristocracyInfo2 != null ? aristocracyInfo2.getNVIPLv() : 0);
                sVGAView.setImageResource(iOooO00o);
                if (iOooO00o > 0) {
                    com.code.android.util.o000OO00.OooOOOO(sVGAView);
                }
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 12:
                netImageView.setImageResource(oOo00OO0.icon_system_message_uniqueid);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_uniqueid_due_will_remind_title));
                String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_uniqueid_due_remind);
                String[] strArr3 = new String[1];
                SystemMessage.UniqueIdDueRemindInfo uniqueIdDueRemindInfo = item.getUniqueIdDueRemindInfo();
                strArr3[0] = String.valueOf(uniqueIdDueRemindInfo != null ? Long.valueOf(uniqueIdDueRemindInfo.getExpirationTime()) : null);
                textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO4, strArr3));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 13:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_top_card_refund_title));
                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_top_card_refund));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 14:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_top_card_bid_title));
                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_top_card_bid));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 15:
                netImageView.setImageResource(oOo00OO0.icon_system_message_salary);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_vip_coin_rebate_title));
                String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_vip_coin_rebate);
                String[] strArr4 = new String[1];
                SystemMessage.ConsumerRebateInfo consumerRebateInfo = item.getConsumerRebateInfo();
                strArr4[0] = String.valueOf(consumerRebateInfo != null ? Integer.valueOf(consumerRebateInfo.getRebateCoin()) : null);
                textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO5, strArr4));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 16:
                netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_unlocked_a_profile_frame_title));
                textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_unlocked_a_profile_frame));
                SystemMessage.UnlockAvatarFrameInfo unlockAvatarFrameInfo = item.getUnlockAvatarFrameInfo();
                String avatarFrameUrl = unlockAvatarFrameInfo != null ? unlockAvatarFrameInfo.getAvatarFrameUrl() : null;
                sVGAView.setImageDrawable(null);
                sVGAView.setVisibility(8);
                sVGAView.OooO0oO(false);
                if (!com.code.android.util.OooOo00.OooO00o(avatarFrameUrl) && !"/headframe/0.png".equals(avatarFrameUrl)) {
                    sVGAView.setVisibility(0);
                    sVGAView.f10172OooOooO = 0;
                    sVGAView.setImageResource(0);
                    sVGAView.OooOO0O(avatarFrameUrl, fragmentActivity);
                    sVGAView.OooOO0o();
                }
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            case 17:
                netImageView.setImageResource(oOo00OO0.icon_system_message_aristocracy);
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_premium_reward_title));
                String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(oO00OOo0.premium_reward);
                String[] strArr5 = new String[1];
                SystemMessage.SubscribeRewardInfo subscribeRewardInfo = item.getSubscribeRewardInfo();
                strArr5[0] = String.valueOf(subscribeRewardInfo != null ? Integer.valueOf(subscribeRewardInfo.getRewardCoin()) : null);
                textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO6, strArr5));
                com.code.android.util.o000OO00.OooOOOO(textView4);
                break;
            default:
                String str = "";
                switch (type) {
                    case 19:
                        SystemMessage.MedalNoticeInfo medalNoticeInfo = item.getMedalNoticeInfo();
                        int medalId = medalNoticeInfo != null ? medalNoticeInfo.getMedalId() : 0;
                        SystemMessage.MedalNoticeInfo medalNoticeInfo2 = item.getMedalNoticeInfo();
                        upCrystal = medalNoticeInfo2 != null ? medalNoticeInfo2.getMedalLevel() : 0;
                        netImageView.setImageResource(oOo00OO0.icon_message_system_badge);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_newbadge_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_newbadge));
                        if (upCrystal > 0 && medalId > 0) {
                            int i3 = oOo00OO0.icon_badge_no_pic;
                            sVGAView.f10172OooOooO = i3;
                            sVGAView.setImageResource(i3);
                            String string2 = oOo00o0o.OooO00o(medalId, upCrystal).toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "getMedalUri(medalId, medalLevel).toString()");
                            sVGAView.OooOO0O(string2, fragmentActivity);
                            sVGAView.OooOO0o();
                            com.code.android.util.o000OO00.OooOOOO(sVGAView);
                        }
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 20:
                        SystemMessage.MedalNoticeInfo medalNoticeInfo3 = item.getMedalNoticeInfo();
                        int medalId2 = medalNoticeInfo3 != null ? medalNoticeInfo3.getMedalId() : 0;
                        SystemMessage.MedalNoticeInfo medalNoticeInfo4 = item.getMedalNoticeInfo();
                        upCrystal = medalNoticeInfo4 != null ? medalNoticeInfo4.getMedalLevel() : 0;
                        netImageView.setImageResource(oOo00OO0.icon_message_system_badge);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_newbadge_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_newbadge));
                        if (upCrystal > 0 && medalId2 > 0) {
                            int i4 = oOo00OO0.icon_honor_badge_nopic;
                            sVGAView.f10172OooOooO = i4;
                            sVGAView.setImageResource(i4);
                            String string3 = oOo00o0o.OooO00o(medalId2, 1).toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "getMedalUri(medalId, 1).toString()");
                            sVGAView.OooOO0O(string3, fragmentActivity);
                            sVGAView.OooOO0o();
                            textView5.setText(String.valueOf(upCrystal));
                            com.code.android.util.o000OO00.OooOOOO(sVGAView);
                            com.code.android.util.o000OO00.OooOOOO(textView5);
                        }
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 21:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_message_treasure_win));
                        textView3.setText(item.getMessage());
                        SystemMessage.TreasureBox treasureBox = item.getTreasureBox();
                        if (treasureBox != null && (imageurl = treasureBox.getImageurl()) != null) {
                            com.code.android.util.o000OO00.OooOOOO(sVGAView);
                            sVGAView.OooOO0O(imageurl, fragmentActivity);
                            sVGAView.OooOO0o();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        SystemMessage.TreasureBox treasureBox2 = item.getTreasureBox();
                        if (treasureBox2 != null && treasureBox2.getAwardType() == 1) {
                            com.code.android.util.o000OO00.OooOOOO(textView4);
                        }
                        break;
                    case 22:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_successful_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_successful_content));
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 23:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_title));
                        String strOooO0OO7 = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content);
                        SystemMessage.CustomTheme customTheme = item.getCustomTheme();
                        Integer numValueOf4 = customTheme != null ? Integer.valueOf(customTheme.getCause()) : null;
                        if (numValueOf4 != null && numValueOf4.intValue() == 1) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content1)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 2) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content2)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 3) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content3)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 4) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content4)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 5) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content5)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 6) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content6)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 7) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content7)));
                        } else if (numValueOf4 != null && numValueOf4.intValue() == 9) {
                            textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO7, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_content8)));
                        }
                        break;
                    case 24:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_delete_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_custom_theme_delete_content));
                        break;
                    case 25:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_ka_vip);
                        SystemMessage.VipMsgInfo kaVipMsgInfo = item.getKaVipMsgInfo();
                        int kaVipLevel = kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipLevel() : vipLevel.getValue();
                        String strValueOf2 = String.valueOf(VipLevel.INSTANCE.of(kaVipLevel).level());
                        SystemMessage.VipMsgInfo kaVipMsgInfo2 = item.getKaVipMsgInfo();
                        Integer numValueOf5 = kaVipMsgInfo2 != null ? Integer.valueOf(kaVipMsgInfo2.getKaVipType()) : null;
                        if (numValueOf5 != null && numValueOf5.intValue() == 1) {
                            userVipView.f30811Oooo000 = true;
                            userVipView.OooOOO(kaVipLevel, true, fragmentActivity);
                            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_expire));
                            textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_expire_content), strValueOf2));
                        } else if (numValueOf5 != null && numValueOf5.intValue() == 2) {
                            if (kaVipLevel > vipLevel.getValue()) {
                                kaVipLevel -= VipLevel.Vip1.getValue();
                            }
                            userVipView.f30811Oooo000 = true;
                            userVipView.OooOOO(kaVipLevel, true, fragmentActivity);
                            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_will_upgrade));
                            textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_will_upgrade_content), strValueOf2));
                        } else if (numValueOf5 != null && numValueOf5.intValue() == 3) {
                            userVipView.f30811Oooo000 = true;
                            userVipView.OooOOO(kaVipLevel, true, fragmentActivity);
                            textView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_obtain), strValueOf2));
                            textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_ka_vip_obtain_content), strValueOf2));
                        }
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 26:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_give_theme_reimburse_title));
                        SystemMessage.GiveThemeInfo giveThemeInfo = item.getGiveThemeInfo();
                        long userId = giveThemeInfo != null ? giveThemeInfo.getUserId() : 0L;
                        o0O00 o0o00OooOOo = p581o0oOoo00.o000OOo.OooO00o().OooOOo();
                        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                        Friend friendOooO0OO = o0o00OooOOo.OooO0OO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), userId);
                        UserInfoRepo.f23204OooO00o.getClass();
                        UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(userId);
                        String strOooO0OO8 = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_give_theme_reimburse_content);
                        String[] strArr6 = new String[1];
                        if (friendOooO0OO == null) {
                            if (userInfoOooO0Oo != null) {
                                userName = userInfoOooO0Oo.getUserName();
                            } else {
                                userName = null;
                            }
                            strValueOf = String.valueOf(userName);
                        } else {
                            String memoName = friendOooO0OO.getMemoName();
                            if (memoName != null && !StringsKt.isBlank(memoName)) {
                                z = false;
                            }
                            if (z) {
                                if (userInfoOooO0Oo != null) {
                                    userName = userInfoOooO0Oo.getUserName();
                                } else {
                                    userName = null;
                                }
                                strValueOf = String.valueOf(userName);
                            } else {
                                strValueOf = String.valueOf(friendOooO0OO.getMemoName());
                            }
                        }
                        strArr6[0] = strValueOf;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO8, strArr6));
                        break;
                    case 27:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_start));
                        String strOooO0OO9 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_start_creater);
                        String[] strArr7 = new String[1];
                        SystemMessage.EventInfo eventInfo = item.getEventInfo();
                        strArr7[0] = eventInfo != null ? eventInfo.getName() : null;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO9, strArr7));
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 28:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_start));
                        String strOooO0OO10 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_start_subscriber);
                        String[] strArr8 = new String[1];
                        SystemMessage.EventInfo eventInfo2 = item.getEventInfo();
                        strArr8[0] = eventInfo2 != null ? eventInfo2.getName() : null;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO10, strArr8));
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 29:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_deleted));
                        String strOooO0OO11 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_deleted);
                        String[] strArr9 = new String[2];
                        SystemMessage.EventInfo eventInfo3 = item.getEventInfo();
                        strArr9[0] = eventInfo3 != null ? eventInfo3.getName() : null;
                        SystemMessage.EventInfo eventInfo4 = item.getEventInfo();
                        strArr9[1] = ooOOOOoo.OooO00o(eventInfo4 != null ? eventInfo4.getReasonType() : null);
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO11, strArr9));
                        break;
                    case 30:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_cancel));
                        String strOooO0OO12 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_cancel);
                        String[] strArr10 = new String[1];
                        SystemMessage.EventInfo eventInfo5 = item.getEventInfo();
                        strArr10[0] = eventInfo5 != null ? eventInfo5.getName() : null;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO12, strArr10));
                        break;
                    case 31:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_passed));
                        String strOooO0OO13 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_passed);
                        String[] strArr11 = new String[1];
                        SystemMessage.EventInfo eventInfo6 = item.getEventInfo();
                        strArr11[0] = eventInfo6 != null ? eventInfo6.getName() : null;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO13, strArr11));
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 32:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Title_recommend));
                        String strOooO0OO14 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Message_Content_recommend);
                        String[] strArr12 = new String[1];
                        SystemMessage.EventInfo eventInfo7 = item.getEventInfo();
                        strArr12[0] = eventInfo7 != null ? eventInfo7.getName() : null;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO14, strArr12));
                        break;
                    case 33:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_salary);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_mssage_title_first_recharge_rewards));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_mssage_content_first_recharge_rewards));
                        break;
                    case 34:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_salary);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Recharge_Successful));
                        textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.xxx_golds_recharge_successful), item.getMessage()));
                        break;
                    case 35:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_salary);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.system_mssage_title_first_month_recharge_rewards));
                        String strOooO0OO15 = com.code.android.util.o0000.OooO0OO(oO00OOo0.system_mssage_content_first_month_recharge_rewards);
                        String[] strArr13 = new String[1];
                        SystemMessage.FirstRewardInfo firstRewardInfo = item.getFirstRewardInfo();
                        if (firstRewardInfo != null && (string = Integer.valueOf(firstRewardInfo.getRewardCoin()).toString()) != null) {
                            str = string;
                        }
                        strArr13[0] = str;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO15, strArr13));
                        break;
                    case 36:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.member_badge_frozen_tip_title));
                        String strOooO0OO16 = com.code.android.util.o0000.OooO0OO(oO00OOo0.member_badge_frozen_tip_message);
                        String[] strArr14 = new String[1];
                        SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = item.getMemberBadgeFrozenInfo();
                        if (memberBadgeFrozenInfo != null && (roomName = memberBadgeFrozenInfo.getRoomName()) != null) {
                            str = roomName;
                        }
                        strArr14[0] = str;
                        textView3.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO16, strArr14));
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        break;
                    case 37:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.member_badge_reward_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.member_badge_reward_content));
                        com.code.android.util.o000OO00.OooOOOO(netImageView2);
                        com.code.android.util.o000OO00.OooOOOO(textView4);
                        SystemMessage.MemberBadgeTopRankReward memberBadgeTopRankReward = item.getMemberBadgeTopRankReward();
                        if (memberBadgeTopRankReward != null && (shopUrl = memberBadgeTopRankReward.getShopUrl()) != null) {
                            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(netImageView2.getContext());
                            oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO0O0(shopUrl);
                            oooO00o.f43909OooO00o = 0;
                            oooO00o.OooO0o0(6);
                            oooO00o.OooO0Oo(netImageView2);
                            break;
                        }
                        break;
                    case 38:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.backpack_expired_system_title));
                        textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.backpack_expired_system_content));
                        SystemMessage.GiftBackpackExpired giftBackpackExpired = item.getGiftBackpackExpired();
                        if (giftBackpackExpired != null) {
                            String headurl = giftBackpackExpired.getHeadurl();
                            str = headurl != null ? headurl : "";
                            com.code.android.util.o000OO00.OooOOOO(netImageView2);
                            com.code.android.util.o000OO00.OooOOOO(textView4);
                            textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.View));
                            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(netImageView2.getContext());
                            oooO00o2.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO0O0(str);
                            oooO00o2.f43909OooO00o = 0;
                            oooO00o2.f43914OooO0o0 = true;
                            oooO00o2.OooO0o0(6);
                            oooO00o2.OooO0Oo(netImageView2);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        break;
                    case 39:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        SystemMessage.GiftBlindTaskReward giftBlindTaskReward = item.getGiftBlindTaskReward();
                        if (giftBlindTaskReward != null) {
                            Integer awardtype = giftBlindTaskReward.getAwardtype();
                            SystemMessage.AwardType awardType = SystemMessage.AwardType.INSTANCE;
                            int chatBox = awardType.getChatBox();
                            if (awardtype != null && awardtype.intValue() == chatBox) {
                                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Chat_Box));
                                textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Chat_Box_content), String.valueOf(giftBlindTaskReward.getAwardcount())));
                            } else {
                                int headdressCard = awardType.getHeaddressCard();
                                if (awardtype != null && awardtype.intValue() == headdressCard) {
                                    textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Hat));
                                    textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Hat_content));
                                } else {
                                    int backpackGift = awardType.getBackpackGift();
                                    if (awardtype != null && awardtype.intValue() == backpackGift) {
                                        textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Gift));
                                        textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Gift_content), String.valueOf(giftBlindTaskReward.getAwardcount())));
                                    } else {
                                        int headPortraitBox = awardType.getHeadPortraitBox();
                                        if (awardtype != null && awardtype.intValue() == headPortraitBox) {
                                            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Profile_Frame));
                                            textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Got_a_Profile_Frame_content), String.valueOf(giftBlindTaskReward.getAwardcount())));
                                        }
                                    }
                                }
                            }
                            com.code.android.util.o000OO00.OooOOOO(netImageView2);
                            com.code.android.util.o000OO00.OooOOOO(textView4);
                            textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.View));
                            String awardimage = giftBlindTaskReward.getAwardimage();
                            str = awardimage != null ? awardimage : "";
                            o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(netImageView2.getContext());
                            oooO00o3.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO0O0(str);
                            oooO00o3.f43909OooO00o = 0;
                            oooO00o3.f43914OooO0o0 = true;
                            oooO00o3.OooO0o0(6);
                            oooO00o3.OooO0Oo(netImageView2);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        break;
                    case 40:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        SystemMessage.GiftBlindRankingReward giftBlindRankingReward = item.getGiftBlindRankingReward();
                        if (giftBlindRankingReward != null) {
                            Integer toptype = giftBlindRankingReward.getToptype();
                            SystemMessage.TopType topType = SystemMessage.TopType.INSTANCE;
                            int giftRankingSend = topType.getGiftRankingSend();
                            if (toptype != null && toptype.intValue() == giftRankingSend) {
                                textView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Sent_Ranking_XXX_Rewards), String.valueOf(giftBlindRankingReward.getToprank())));
                                textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Sent_Ranking_XXX_Rewards_content), String.valueOf(giftBlindRankingReward.getToprank())), String.valueOf(giftBlindRankingReward.getAwardcount())));
                            } else {
                                int giftRankingReception = topType.getGiftRankingReception();
                                if (toptype != null && toptype.intValue() == giftRankingReception) {
                                    textView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Received_Ranking_XXX_Rewards), String.valueOf(giftBlindRankingReward.getToprank())));
                                    textView3.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Received_Ranking_XXX_Rewards_content), String.valueOf(giftBlindRankingReward.getToprank())), String.valueOf(giftBlindRankingReward.getAwardcount())));
                                }
                            }
                            com.code.android.util.o000OO00.OooOOOO(textView4);
                            textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.View));
                            String awardimage2 = giftBlindRankingReward.getAwardimage();
                            if (awardimage2 != null) {
                                com.code.android.util.o000OO00.OooOOOO(netImageView2);
                                o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(netImageView2.getContext());
                                oooO00o4.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO0O0(awardimage2);
                                oooO00o4.f43909OooO00o = 0;
                                oooO00o4.f43914OooO0o0 = true;
                                oooO00o4.OooO0o0(6);
                                oooO00o4.OooO0Oo(netImageView2);
                            }
                            Unit unit5 = Unit.INSTANCE;
                        }
                        break;
                    case 41:
                        netImageView.setImageResource(oOo00OO0.icon_system_message_notice);
                        SystemMessage.Vip6DistributeSupremeGift vip6DistributeSupremeGift = item.getVip6DistributeSupremeGift();
                        if (vip6DistributeSupremeGift != null) {
                            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.vip6_message_notify_title));
                            textView3.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.vip6_message_notify_content));
                            com.code.android.util.o000OO00.OooOOOO(textView4);
                            textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.View));
                            String propImage = vip6DistributeSupremeGift.getPropImage();
                            if (propImage != null) {
                                com.code.android.util.o000OO00.OooOOOO(netImageView2);
                                o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(netImageView2.getContext());
                                oooO00o5.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO0O0(propImage);
                                oooO00o5.f43909OooO00o = 0;
                                oooO00o5.f43914OooO0o0 = true;
                                oooO00o5.OooO0o0(6);
                                oooO00o5.OooO0Oo(netImageView2);
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        break;
                }
                break;
        }
    }
}
