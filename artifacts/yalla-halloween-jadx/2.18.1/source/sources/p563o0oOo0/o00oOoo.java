package p563o0oOo0;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.OooOo;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o000O00;
import p168o00Ooo0.o00oO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.oOO00O;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p616o0oo0Ooo.oO0O00;
import p617o0oo0o.o0OOO0o;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00oOoo extends o0000O0O<SystemMessage> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f45093OooOOo0;

    public static final class OooO00o extends OooOo.OooO<SystemMessage> {
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
    public o00oOoo(@NotNull FragmentActivity activity) {
        super(Integer.valueOf(R.layout.message_item_system_message), new OooO00o());
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45093OooOOo0 = activity;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0366 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0368  */
    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, SystemMessage systemMessage) {
        int medalLevel;
        String imageurl;
        String strValueOf;
        String string;
        String roomName;
        String shopUrl;
        SystemMessage item = systemMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        o00O00.OooO0O0("SystemMessage=" + item);
        TextView textView = (TextView) holder.OooO00o(R.id.tvTime);
        if (holder.getLayoutPosition() == getItemCount() - 1 || (holder.getLayoutPosition() < getItemCount() - 1 && item.getTime() - getData(holder.getLayoutPosition() + 1).getTime() > 60000)) {
            textView.setText(o00O0.f48624OooO00o.OooO0Oo(item.getTime(), System.currentTimeMillis()));
            oOO00O.OooO(textView);
        } else {
            oOO00O.OooO00o(textView);
        }
        Unit unit = Unit.INSTANCE;
        NetImageView netImageView = (NetImageView) holder.OooO00o(R.id.ivSystemNotice);
        netImageView.setImageResource(0);
        TextView textView2 = (TextView) holder.OooO00o(R.id.tvSystemNoticeTitle);
        TextView textView3 = (TextView) holder.OooO00o(R.id.tvSystemNoticeContent);
        SVGAView sVGAView = (SVGAView) holder.OooO00o(R.id.svView);
        sVGAView.OooOO0(true);
        sVGAView.setImageResource(0);
        oOO00O.OooO00o(sVGAView);
        NetImageView netImageView2 = (NetImageView) holder.OooO00o(R.id.niv);
        oOO00O.OooO00o(netImageView2);
        TextView textView4 = (TextView) holder.OooO00o(R.id.tvSystemViewMore);
        oOO00O.OooO00o(textView4);
        TextView textView5 = (TextView) holder.OooO00o(R.id.tvMedalLevel);
        oOO00O.OooO00o(textView5);
        String str = "";
        String strOooO0OO = null;
        String strOooO00o = null;
        switch (item.getType()) {
            case 1:
                UserPremiumView.OooO00o oooO00o = UserPremiumView.f21052OoooO00;
                SystemMessage.PremiumInfo vipInfo = item.getVipInfo();
                sVGAView.setImageResource(oooO00o.OooO00o(vipInfo != null ? vipInfo.getVipLevel() : 0));
                SystemMessage.PremiumInfo vipInfo2 = item.getVipInfo();
                textView2.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip_title), oooO00o.OooO0O0(vipInfo2 != null ? vipInfo2.getVipLevel() : PremiumLevel.Premium1.getValue())));
                SystemMessage.PremiumInfo vipInfo3 = item.getVipInfo();
                Integer numValueOf = vipInfo3 != null ? Integer.valueOf(vipInfo3.getVipLevel()) : null;
                int value = PremiumLevel.Premium1.getValue();
                if (numValueOf != null && numValueOf.intValue() == value) {
                    textView3.setText(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip1_content));
                } else {
                    int value2 = PremiumLevel.Premium2.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value2) {
                        textView3.setText(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip2_content));
                    } else {
                        int value3 = PremiumLevel.Premium3.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value3) {
                            textView3.setText(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip3_content));
                        } else {
                            int value4 = PremiumLevel.Premium4.getValue();
                            if (numValueOf != null && numValueOf.intValue() == value4) {
                                textView3.setText(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip4_content));
                            } else {
                                int value5 = PremiumLevel.Premium5.getValue();
                                if (numValueOf != null && numValueOf.intValue() == value5) {
                                    textView3.setText(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip5_content));
                                }
                            }
                        }
                    }
                }
                netImageView.setImageResource(R.drawable.icon_system_message_aristocracy);
                oOO00O.OooO(sVGAView);
                oOO00O.OooO(textView4);
                break;
            case 2:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_create_topic_member_title));
                textView3.setText(item.getMessage());
                oOO00O.OooO(textView4);
                break;
            case 3:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                SystemMessage.TopicStateInfo topicStateInfo = item.getTopicStateInfo();
                Integer numValueOf2 = topicStateInfo != null ? Integer.valueOf(topicStateInfo.getTopicType()) : null;
                textView2.setText((numValueOf2 != null && numValueOf2.intValue() == 2) ? o000O0O0.OooO0OO(R.string.system_message_create_topic_failed_title) : (numValueOf2 != null && numValueOf2.intValue() == 3) ? o000O0O0.OooO0OO(R.string.system_message_create_topic_dissolve_title) : o000O0O0.OooO0OO(R.string.system_message_create_topic_success_title));
                textView3.setText(item.getMessage());
                SystemMessage.TopicStateInfo topicStateInfo2 = item.getTopicStateInfo();
                if (topicStateInfo2 != null && topicStateInfo2.getTopicType() == 1) {
                    oOO00O.OooO(textView4);
                }
                break;
            case 4:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_mora_expired));
                textView3.setText(item.getMessage());
                break;
            case 5:
                SystemMessage.UserUpgradeInfo userUpgradeInfo = item.getUserUpgradeInfo();
                int upCoin = userUpgradeInfo != null ? userUpgradeInfo.getUpCoin() : 0;
                SystemMessage.UserUpgradeInfo userUpgradeInfo2 = item.getUserUpgradeInfo();
                int upCrystal = userUpgradeInfo2 != null ? userUpgradeInfo2.getUpCrystal() : 0;
                SystemMessage.UserUpgradeInfo userUpgradeInfo3 = item.getUserUpgradeInfo();
                Integer numValueOf3 = userUpgradeInfo3 != null ? Integer.valueOf(userUpgradeInfo3.getUserLevel()) : null;
                netImageView.setImageResource(R.drawable.icon_system_message_user_upgrade);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_user_level_upgrade_title));
                if (upCoin > 0 && upCrystal > 0) {
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.system_message_user_level_upgrade_coin_crystal), String.valueOf(upCoin)), String.valueOf(upCrystal)), String.valueOf(numValueOf3));
                } else if (upCoin > 0) {
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.system_message_user_level_upgrade_coin), String.valueOf(upCoin)), String.valueOf(numValueOf3));
                } else if (upCrystal > 0) {
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.system_message_user_level_upgrade_cryctal), String.valueOf(upCrystal)), String.valueOf(numValueOf3));
                }
                textView3.setText(strOooO00o);
                break;
            case 6:
                netImageView.setImageResource(R.drawable.icon_system_message_room_upgrade);
                textView2.setText(o000O0O0.OooO0OO(R.string.icon_system_message_room_upgrade_title));
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.system_message_room_promotion_content);
                String[] strArr = new String[1];
                SystemMessage.RoomUpgradeInfo roomUpgradeInfo = item.getRoomUpgradeInfo();
                strArr[0] = String.valueOf(roomUpgradeInfo != null ? Integer.valueOf(roomUpgradeInfo.getRoomLevel()) : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr));
                break;
            case 7:
                netImageView.setImageResource(R.drawable.icon_system_message_salary);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_salary_title));
                String strOooO0OO3 = o000O0O0.OooO0OO(R.string.system_message_salary_content);
                String[] strArr2 = new String[1];
                SystemMessage.RoomWageInfo roomWageInfo = item.getRoomWageInfo();
                strArr2[0] = String.valueOf(roomWageInfo != null ? Integer.valueOf(roomWageInfo.getWageCoin()) : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO3, strArr2));
                oOO00O.OooO(textView4);
                break;
            case 8:
                netImageView.setImageResource(R.drawable.icon_system_message_money_back);
                textView2.setText(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_gold));
                break;
            case 9:
                netImageView.setImageResource(R.drawable.icon_system_message_money_back);
                textView2.setText(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_gift));
                break;
            case 10:
                netImageView.setImageResource(R.drawable.icon_system_message_membership_due);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_remind_title));
                break;
            case 11:
                netImageView.setImageResource(R.drawable.icon_system_message_aristocracy);
                SystemMessage.AristocracyExpiredInfo aristocracyInfo = item.getAristocracyInfo();
                int buyType = aristocracyInfo != null ? aristocracyInfo.getBuyType() : 0;
                if (buyType == 0) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_will_remind_title);
                } else if (buyType == 2) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_remind_title);
                }
                textView2.setText(strOooO0OO);
                textView3.setText(item.getMessage());
                UserPremiumView.OooO00o oooO00o2 = UserPremiumView.f21052OoooO00;
                SystemMessage.AristocracyExpiredInfo aristocracyInfo2 = item.getAristocracyInfo();
                int iOooO00o = oooO00o2.OooO00o(aristocracyInfo2 != null ? aristocracyInfo2.getNVIPLv() : 0);
                sVGAView.setImageResource(iOooO00o);
                if (iOooO00o > 0) {
                    oOO00O.OooO(sVGAView);
                }
                oOO00O.OooO(textView4);
                break;
            case 12:
                netImageView.setImageResource(R.drawable.icon_system_message_uniqueid);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_uniqueid_due_will_remind_title));
                String strOooO0OO4 = o000O0O0.OooO0OO(R.string.system_message_uniqueid_due_remind);
                String[] strArr3 = new String[1];
                SystemMessage.UniqueIdDueRemindInfo uniqueIdDueRemindInfo = item.getUniqueIdDueRemindInfo();
                strArr3[0] = String.valueOf(uniqueIdDueRemindInfo != null ? Long.valueOf(uniqueIdDueRemindInfo.getExpirationTime()) : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO4, strArr3));
                oOO00O.OooO(textView4);
                break;
            case 13:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_top_card_refund_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.system_message_top_card_refund));
                oOO00O.OooO(textView4);
                break;
            case 14:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_top_card_bid_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.system_message_top_card_bid));
                oOO00O.OooO(textView4);
                break;
            case 15:
                netImageView.setImageResource(R.drawable.icon_system_message_salary);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_vip_coin_rebate_title));
                String strOooO0OO5 = o000O0O0.OooO0OO(R.string.system_message_vip_coin_rebate);
                String[] strArr4 = new String[1];
                SystemMessage.ConsumerRebateInfo consumerRebateInfo = item.getConsumerRebateInfo();
                strArr4[0] = String.valueOf(consumerRebateInfo != null ? Integer.valueOf(consumerRebateInfo.getRebateCoin()) : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO5, strArr4));
                oOO00O.OooO(textView4);
                break;
            case 16:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_unlocked_a_profile_frame_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.message_unlocked_a_profile_frame));
                FragmentActivity fragmentActivity = this.f45093OooOOo0;
                SystemMessage.UnlockAvatarFrameInfo unlockAvatarFrameInfo = item.getUnlockAvatarFrameInfo();
                String avatarFrameUrl = unlockAvatarFrameInfo != null ? unlockAvatarFrameInfo.getAvatarFrameUrl() : null;
                sVGAView.setImageDrawable(null);
                sVGAView.setVisibility(8);
                sVGAView.OooO0o0(false);
                if (!OooO0OO.OooO00o(avatarFrameUrl) && !"/headframe/0.png".equals(avatarFrameUrl)) {
                    sVGAView.setVisibility(0);
                    sVGAView.f21010OooooO0 = 0;
                    sVGAView.OooO0oo(avatarFrameUrl, fragmentActivity);
                    sVGAView.OooO();
                }
                oOO00O.OooO(textView4);
                break;
            case 17:
                netImageView.setImageResource(R.drawable.icon_system_message_aristocracy);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_premium_reward_title));
                String strOooO0OO6 = o000O0O0.OooO0OO(R.string.premium_reward);
                String[] strArr5 = new String[1];
                SystemMessage.SubscribeRewardInfo subscribeRewardInfo = item.getSubscribeRewardInfo();
                strArr5[0] = String.valueOf(subscribeRewardInfo != null ? Integer.valueOf(subscribeRewardInfo.getRewardCoin()) : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO6, strArr5));
                oOO00O.OooO(textView4);
                break;
            case 19:
                SystemMessage.MedalNoticeInfo medalNoticeInfo = item.getMedalNoticeInfo();
                int medalId = medalNoticeInfo != null ? medalNoticeInfo.getMedalId() : 0;
                SystemMessage.MedalNoticeInfo medalNoticeInfo2 = item.getMedalNoticeInfo();
                medalLevel = medalNoticeInfo2 != null ? medalNoticeInfo2.getMedalLevel() : 0;
                netImageView.setImageResource(R.drawable.icon_message_system_badge);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_newbadge_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.system_message_newbadge));
                if (medalLevel > 0 && medalId > 0) {
                    sVGAView.f21010OooooO0 = R.drawable.icon_badge_no_pic;
                    String string2 = o00oO0o.OooO00o(medalId, medalLevel).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "getMedalUri(medalId, medalLevel).toString()");
                    sVGAView.OooO0oo(string2, this.f45093OooOOo0);
                    sVGAView.OooO();
                    oOO00O.OooO(sVGAView);
                }
                oOO00O.OooO(textView4);
                break;
            case 20:
                SystemMessage.MedalNoticeInfo medalNoticeInfo3 = item.getMedalNoticeInfo();
                int medalId2 = medalNoticeInfo3 != null ? medalNoticeInfo3.getMedalId() : 0;
                SystemMessage.MedalNoticeInfo medalNoticeInfo4 = item.getMedalNoticeInfo();
                medalLevel = medalNoticeInfo4 != null ? medalNoticeInfo4.getMedalLevel() : 0;
                netImageView.setImageResource(R.drawable.icon_message_system_badge);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_newbadge_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.system_message_newbadge));
                if (medalLevel > 0 && medalId2 > 0) {
                    sVGAView.f21010OooooO0 = R.drawable.icon_honor_badge_nopic;
                    String string3 = o00oO0o.OooO00o(medalId2, 1).toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "getMedalUri(medalId, 1).toString()");
                    sVGAView.OooO0oo(string3, this.f45093OooOOo0);
                    sVGAView.OooO();
                    textView5.setText(String.valueOf(medalLevel));
                    oOO00O.OooO(sVGAView);
                    oOO00O.OooO(textView5);
                }
                oOO00O.OooO(textView4);
                break;
            case 21:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_message_treasure_win));
                textView3.setText(item.getMessage());
                SystemMessage.TreasureBox treasureBox = item.getTreasureBox();
                if (treasureBox != null && (imageurl = treasureBox.getImageurl()) != null) {
                    oOO00O.OooO(sVGAView);
                    sVGAView.OooO0oo(imageurl, this.f45093OooOOo0);
                    sVGAView.OooO();
                }
                SystemMessage.TreasureBox treasureBox2 = item.getTreasureBox();
                if (treasureBox2 != null && treasureBox2.getAwardType() == 1) {
                    oOO00O.OooO(textView4);
                }
                break;
            case 22:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.message_custom_theme_successful_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.message_custom_theme_successful_content));
                oOO00O.OooO(textView4);
                break;
            case 23:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.message_custom_theme_failed_title));
                String strOooO0OO7 = o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content);
                SystemMessage.CustomTheme customTheme = item.getCustomTheme();
                Integer numValueOf4 = customTheme != null ? Integer.valueOf(customTheme.getCause()) : null;
                if (numValueOf4 != null && numValueOf4.intValue() == 1) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content1)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 2) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content2)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 3) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content3)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 4) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content4)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 5) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content5)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 6) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content6)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 7) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content7)));
                } else if (numValueOf4 != null && numValueOf4.intValue() == 9) {
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO7, o000O0O0.OooO0OO(R.string.message_custom_theme_failed_content8)));
                }
                break;
            case 24:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.message_custom_theme_delete_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.message_custom_theme_delete_content));
                break;
            case 25:
                netImageView.setImageResource(R.drawable.icon_system_message_ka_vip);
                VipLevel.Companion companion = VipLevel.INSTANCE;
                SystemMessage.VipMsgInfo kaVipMsgInfo = item.getKaVipMsgInfo();
                sVGAView.setImageResource(companion.OooO00o(kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipLevel() : 0));
                oOO00O.OooO(sVGAView);
                SystemMessage.VipMsgInfo kaVipMsgInfo2 = item.getKaVipMsgInfo();
                String strValueOf2 = String.valueOf(companion.OooO0O0(kaVipMsgInfo2 != null ? kaVipMsgInfo2.getKaVipLevel() : 0).OooO0O0());
                SystemMessage.VipMsgInfo kaVipMsgInfo3 = item.getKaVipMsgInfo();
                Integer numValueOf5 = kaVipMsgInfo3 != null ? Integer.valueOf(kaVipMsgInfo3.getKaVipType()) : null;
                if (numValueOf5 != null && numValueOf5.intValue() == 1) {
                    textView2.setText(o000O0O0.OooO0OO(R.string.message_ka_vip_expire));
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_ka_vip_expire_content), strValueOf2));
                } else if (numValueOf5 != null && numValueOf5.intValue() == 2) {
                    textView2.setText(o000O0O0.OooO0OO(R.string.message_ka_vip_will_upgrade));
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_ka_vip_will_upgrade_content), strValueOf2));
                } else if (numValueOf5 != null && numValueOf5.intValue() == 3) {
                    textView2.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_ka_vip_obtain), strValueOf2));
                    textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_ka_vip_obtain_content), strValueOf2));
                }
                oOO00O.OooO(textView4);
                break;
            case 26:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.message_give_theme_reimburse_title));
                SystemMessage.GiveThemeInfo giveThemeInfo = item.getGiveThemeInfo();
                long userId = giveThemeInfo != null ? giveThemeInfo.getUserId() : 0L;
                Friend friendOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), userId);
                UserInfo userInfoOooO00o = o000O00.OooO00o(userId);
                String strOooO0OO8 = o000O0O0.OooO0OO(R.string.message_give_theme_reimburse_content);
                String[] strArr6 = new String[1];
                if (friendOooO0Oo != null) {
                    String memoName = friendOooO0Oo.getMemoName();
                    strValueOf = memoName == null || StringsKt.isBlank(memoName) ? String.valueOf(userInfoOooO00o != null ? userInfoOooO00o.getUserName() : null) : String.valueOf(friendOooO0Oo.getMemoName());
                }
                strArr6[0] = strValueOf;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO8, strArr6));
                break;
            case 27:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_start));
                String strOooO0OO9 = o000O0O0.OooO0OO(R.string.Event_Message_Content_start_creater);
                String[] strArr7 = new String[1];
                SystemMessage.EventInfo eventInfo = item.getEventInfo();
                strArr7[0] = eventInfo != null ? eventInfo.getName() : null;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO9, strArr7));
                oOO00O.OooO(textView4);
                break;
            case 28:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_start));
                String strOooO0OO10 = o000O0O0.OooO0OO(R.string.Event_Message_Content_start_subscriber);
                String[] strArr8 = new String[1];
                SystemMessage.EventInfo eventInfo2 = item.getEventInfo();
                strArr8[0] = eventInfo2 != null ? eventInfo2.getName() : null;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO10, strArr8));
                oOO00O.OooO(textView4);
                break;
            case 29:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_deleted));
                String strOooO0OO11 = o000O0O0.OooO0OO(R.string.Event_Message_Content_deleted);
                String[] strArr9 = new String[2];
                SystemMessage.EventInfo eventInfo3 = item.getEventInfo();
                strArr9[0] = eventInfo3 != null ? eventInfo3.getName() : null;
                SystemMessage.EventInfo eventInfo4 = item.getEventInfo();
                strArr9[1] = o0OOO0o.OooO00o(eventInfo4 != null ? eventInfo4.getReasonType() : null);
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO11, strArr9));
                break;
            case 30:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_cancel));
                String strOooO0OO12 = o000O0O0.OooO0OO(R.string.Event_Message_Content_cancel);
                String[] strArr10 = new String[1];
                SystemMessage.EventInfo eventInfo5 = item.getEventInfo();
                strArr10[0] = eventInfo5 != null ? eventInfo5.getName() : null;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO12, strArr10));
                break;
            case 31:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_passed));
                String strOooO0OO13 = o000O0O0.OooO0OO(R.string.Event_Message_Content_passed);
                String[] strArr11 = new String[1];
                SystemMessage.EventInfo eventInfo6 = item.getEventInfo();
                strArr11[0] = eventInfo6 != null ? eventInfo6.getName() : null;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO13, strArr11));
                oOO00O.OooO(textView4);
                break;
            case 32:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.Event_Message_Title_recommend));
                String strOooO0OO14 = o000O0O0.OooO0OO(R.string.Event_Message_Content_recommend);
                String[] strArr12 = new String[1];
                SystemMessage.EventInfo eventInfo7 = item.getEventInfo();
                strArr12[0] = eventInfo7 != null ? eventInfo7.getName() : null;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO14, strArr12));
                break;
            case 33:
                netImageView.setImageResource(R.drawable.icon_system_message_salary);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_mssage_title_first_recharge_rewards));
                textView3.setText(o000O0O0.OooO0OO(R.string.system_mssage_content_first_recharge_rewards));
                break;
            case 34:
                netImageView.setImageResource(R.drawable.icon_system_message_salary);
                textView2.setText(o000O0O0.OooO0OO(R.string.Recharge_Successful));
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.xxx_golds_recharge_successful), item.getMessage()));
                break;
            case 35:
                netImageView.setImageResource(R.drawable.icon_system_message_salary);
                textView2.setText(o000O0O0.OooO0OO(R.string.system_mssage_title_first_month_recharge_rewards));
                String strOooO0OO15 = o000O0O0.OooO0OO(R.string.system_mssage_content_first_month_recharge_rewards);
                String[] strArr13 = new String[1];
                SystemMessage.FirstRewardInfo firstRewardInfo = item.getFirstRewardInfo();
                if (firstRewardInfo != null && (string = Integer.valueOf(firstRewardInfo.getRewardCoin()).toString()) != null) {
                    str = string;
                }
                strArr13[0] = str;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO15, strArr13));
                break;
            case 36:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.member_badge_frozen_tip_title));
                String strOooO0OO16 = o000O0O0.OooO0OO(R.string.member_badge_frozen_tip_message);
                String[] strArr14 = new String[1];
                SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = item.getMemberBadgeFrozenInfo();
                if (memberBadgeFrozenInfo != null && (roomName = memberBadgeFrozenInfo.getRoomName()) != null) {
                    str = roomName;
                }
                strArr14[0] = str;
                textView3.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO16, strArr14));
                oOO00O.OooO(textView4);
                break;
            case 37:
                netImageView.setImageResource(R.drawable.icon_system_message_notice);
                textView2.setText(o000O0O0.OooO0OO(R.string.member_badge_reward_title));
                textView3.setText(o000O0O0.OooO0OO(R.string.member_badge_reward_content));
                oOO00O.OooO(netImageView2);
                oOO00O.OooO(textView4);
                SystemMessage.MemberBadgeTopRankReward memberBadgeTopRankReward = item.getMemberBadgeTopRankReward();
                if (memberBadgeTopRankReward != null && (shopUrl = memberBadgeTopRankReward.getShopUrl()) != null) {
                    oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(netImageView2.getContext());
                    oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgSize$default(shopUrl, o000OO00.OooO00o(106), false, 2, null);
                    oooO00o3.f48427OooO00o = 0;
                    oooO00o3.OooO0oO(6);
                    oooO00o3.OooO0o(netImageView2);
                    break;
                }
                break;
        }
    }
}
