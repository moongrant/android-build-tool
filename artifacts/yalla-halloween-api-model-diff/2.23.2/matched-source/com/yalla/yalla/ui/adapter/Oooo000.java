package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.view.DotView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.Oo0000;
import p590o0oOooo0.a;
import p590o0oOooo0.b;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends p571o0oOoO0.o0000oo<SystemConversationModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final a f26967OooOoo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            try {
                iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(@NotNull Context context) {
        super(context, p562o0oOo000.oo0o0Oo.message_item_conversation_system);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.f26967OooOoo0 = aVar;
        OooOoO0(aVar.f57102OooO00o);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        SystemConversationModel model = (SystemConversationModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            helper.itemView.setTag(p562o0oOo000.o0OO00O.tag_userinfo, null);
            helper.itemView.setTag(p562o0oOo000.o0OO00O.tag_friend_memo_name_tag, null);
            ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.ivHeader);
            DotView dotView = (DotView) helper.getView(p562o0oOo000.o0OO00O.dotView);
            TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvTitle);
            TextView textView2 = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvContent);
            TextView textView3 = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvTime);
            dotView.OooOO0o(false);
            dotView.setNumber(Integer.valueOf(model.getUnReadCount()));
            textView3.setText("");
            if (model.getTime() > 0) {
                textView3.setText(o0O0O0o0.OooO0Oo(model.getTime(), System.currentTimeMillis()));
            }
            textView2.setText("");
            textView2.setVisibility(8);
            if (!StringsKt.isBlank(model.getContent())) {
                textView2.setText(model.getContent());
                textView2.setVisibility(0);
            }
            int i = OooO00o.$EnumSwitchMapping$0[model.getType().ordinal()];
            if (i == 1) {
                imageView.setImageResource(p562o0oOo000.o0O0O00.icon_message_system);
                textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.subscription_service));
            } else {
                if (i != 2) {
                    return;
                }
                imageView.setImageResource(p562o0oOo000.o0O0O00.icon_yalla_team);
                textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.MessageFragment_item_YallaTeam));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void Oooo0o(@NotNull MessageModelHeadType type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        a aVar = this.f26967OooOoo0;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = a.OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            aVar.f57103OooO0O0.setUnReadCount(i);
        } else if (i2 == 2) {
            aVar.f57104OooO0OO.setUnReadCount(i);
        }
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void Oooo0o0(@Nullable SystemMessage systemMessage) {
        String strOooO0OO;
        String roomName;
        Integer awardtype;
        a aVar = this.f26967OooOoo0;
        SystemConversationModel systemConversationModel = aVar.f57103OooO0O0;
        String strOooO0OO2 = "";
        if (systemMessage == null) {
            systemConversationModel.setTime(0L);
            systemConversationModel.setContent("");
        } else {
            int type = systemMessage.getType();
            if (type != 88) {
                switch (type) {
                    case 1:
                        int i = UserPremiumView.f30257OooO0o0;
                        SystemMessage.PremiumInfo vipInfo = systemMessage.getVipInfo();
                        systemConversationModel.setContent(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_subscribe_vip_title), UserPremiumView.OooO00o.OooO0O0(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
                        break;
                    case 2:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_create_topic_member_title));
                        break;
                    case 3:
                        SystemMessage.TopicStateInfo topicStateInfo = systemMessage.getTopicStateInfo();
                        Integer numValueOf = topicStateInfo != null ? Integer.valueOf(topicStateInfo.getTopicType()) : null;
                        if (numValueOf != null && numValueOf.intValue() == 2) {
                            strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_create_topic_failed_title);
                        } else {
                            strOooO0OO = (numValueOf != null && numValueOf.intValue() == 3) ? com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_create_topic_dissolve_title) : com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_create_topic_success_title);
                        }
                        systemConversationModel.setContent(strOooO0OO);
                        break;
                    case 4:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_mora_expired));
                        break;
                    case 5:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_user_level_upgrade_title));
                        break;
                    case 6:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.icon_system_message_room_upgrade_title));
                        break;
                    case 7:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_salary_title));
                        break;
                    case 8:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_back_title));
                        break;
                    case 9:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_back_title));
                        break;
                    case 10:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_vip_aristocracy_due_remind_title));
                        break;
                    case 11:
                        SystemMessage.AristocracyExpiredInfo aristocracyInfo = systemMessage.getAristocracyInfo();
                        int buyType = aristocracyInfo != null ? aristocracyInfo.getBuyType() : 0;
                        if (buyType == 0) {
                            strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_vip_aristocracy_due_will_remind_title);
                        } else if (buyType == 2) {
                            strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_vip_aristocracy_due_remind_title);
                        }
                        systemConversationModel.setContent(strOooO0OO2);
                        break;
                    case 12:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_uniqueid_due_will_remind_title));
                        break;
                    case 13:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_top_card_refund_title));
                        break;
                    case 14:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_top_card_bid_title));
                        break;
                    case 15:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_vip_coin_rebate_title));
                        break;
                    case 16:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_unlocked_a_profile_frame_title));
                        break;
                    case 17:
                        systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_premium_reward_title));
                        break;
                    default:
                        switch (type) {
                            case 19:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_newbadge_title));
                                break;
                            case 20:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_newbadge_title));
                                break;
                            case 21:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_message_treasure_win));
                                break;
                            case 22:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_custom_theme_successful_title));
                                break;
                            case 23:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_custom_theme_failed_title));
                                break;
                            case 24:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_custom_theme_delete_title));
                                break;
                            case 25:
                                SystemMessage.VipMsgInfo kaVipMsgInfo = systemMessage.getKaVipMsgInfo();
                                int kaVipType = kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipType() : 0;
                                if (kaVipType == 1) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_ka_vip_expire);
                                } else if (kaVipType == 2) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_ka_vip_will_upgrade);
                                } else if (kaVipType == 3) {
                                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_ka_vip_obtain);
                                    String[] strArr = new String[1];
                                    VipLevel.Companion companion = VipLevel.INSTANCE;
                                    SystemMessage.VipMsgInfo kaVipMsgInfo2 = systemMessage.getKaVipMsgInfo();
                                    strArr[0] = String.valueOf(companion.of(kaVipMsgInfo2 != null ? kaVipMsgInfo2.getKaVipLevel() : 0).level());
                                    strOooO0OO2 = com.code.android.util.o0000O.OooO00o(strOooO0OO3, strArr);
                                }
                                systemConversationModel.setContent(strOooO0OO2);
                                break;
                            case 26:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_give_theme_reimburse_title));
                                break;
                            case 27:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_start));
                                break;
                            case 28:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_start));
                                break;
                            case 29:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_deleted));
                                break;
                            case 30:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_cancel));
                                break;
                            case 31:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_passed));
                                break;
                            case 32:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Event_Message_Title_recommend));
                                break;
                            case 33:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_mssage_title_first_recharge_rewards));
                                break;
                            case 34:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Recharge_Successful));
                                break;
                            case 35:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.system_mssage_title_first_month_recharge_rewards));
                                break;
                            case 36:
                                String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.member_badge_frozen_tip_message);
                                String[] strArr2 = new String[1];
                                SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = systemMessage.getMemberBadgeFrozenInfo();
                                if (memberBadgeFrozenInfo != null && (roomName = memberBadgeFrozenInfo.getRoomName()) != null) {
                                    strOooO0OO2 = roomName;
                                }
                                strArr2[0] = strOooO0OO2;
                                systemConversationModel.setContent(com.code.android.util.o0000O.OooO00o(strOooO0OO4, strArr2));
                                break;
                            case 37:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.member_badge_reward_title));
                                break;
                            case 38:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.backpack_expired_system_title));
                                break;
                            case 39:
                                SystemMessage.GiftBlindTaskReward giftBlindTaskReward = systemMessage.getGiftBlindTaskReward();
                                int iIntValue = (giftBlindTaskReward == null || (awardtype = giftBlindTaskReward.getAwardtype()) == null) ? 0 : awardtype.intValue();
                                SystemMessage.AwardType awardType = SystemMessage.AwardType.INSTANCE;
                                if (iIntValue == awardType.getChatBox()) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Got_a_Chat_Box);
                                } else if (iIntValue == awardType.getHeaddressCard()) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Got_a_Hat);
                                } else if (iIntValue == awardType.getBackpackGift()) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Got_a_Gift);
                                } else if (iIntValue == awardType.getHeadPortraitBox()) {
                                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Got_a_Profile_Frame);
                                }
                                systemConversationModel.setContent(strOooO0OO2);
                                break;
                            case 40:
                                SystemMessage.GiftBlindRankingReward giftBlindRankingReward = systemMessage.getGiftBlindRankingReward();
                                Integer toptype = giftBlindRankingReward != null ? giftBlindRankingReward.getToptype() : null;
                                SystemMessage.TopType topType = SystemMessage.TopType.INSTANCE;
                                int giftRankingSend = topType.getGiftRankingSend();
                                if (toptype != null && toptype.intValue() == giftRankingSend) {
                                    String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Sent_Ranking_XXX_Rewards);
                                    String[] strArr3 = new String[1];
                                    SystemMessage.GiftBlindRankingReward giftBlindRankingReward2 = systemMessage.getGiftBlindRankingReward();
                                    strArr3[0] = String.valueOf(giftBlindRankingReward2 != null ? giftBlindRankingReward2.getToprank() : null);
                                    strOooO0OO2 = com.code.android.util.o0000O.OooO00o(strOooO0OO5, strArr3);
                                } else {
                                    int giftRankingReception = topType.getGiftRankingReception();
                                    if (toptype != null && toptype.intValue() == giftRankingReception) {
                                        String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Received_Ranking_XXX_Rewards);
                                        String[] strArr4 = new String[1];
                                        SystemMessage.GiftBlindRankingReward giftBlindRankingReward3 = systemMessage.getGiftBlindRankingReward();
                                        strArr4[0] = String.valueOf(giftBlindRankingReward3 != null ? giftBlindRankingReward3.getToprank() : null);
                                        strOooO0OO2 = com.code.android.util.o0000O.OooO00o(strOooO0OO6, strArr4);
                                    }
                                }
                                systemConversationModel.setContent(strOooO0OO2);
                                break;
                            case 41:
                                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.vip6_message_notify_title));
                                break;
                        }
                        break;
                }
            } else {
                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_wealth_notify_title));
            }
            systemConversationModel.setTime(systemMessage.getTime());
        }
        CollectionsKt.sortWith(aVar.f57102OooO00o, new Oo0000(b.f57109OooO0Oo));
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void Oooo0oO(@Nullable YallaTeamMessage yallaTeamMessage) {
        a aVar = this.f26967OooOoo0;
        SystemConversationModel systemConversationModel = aVar.f57104OooO0OO;
        if (yallaTeamMessage == null) {
            systemConversationModel.setTime(0L);
            systemConversationModel.setContent("");
        } else {
            systemConversationModel.setTime(yallaTeamMessage.getTime());
            int type = yallaTeamMessage.getType();
            if (type == 2) {
                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_thanks_feedback));
            } else if (type == 4) {
                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_feedback_replied));
            } else if (type == 6) {
                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_welcome_to_yalla));
            } else if (type != 7) {
                systemConversationModel.setContent(p423o0OoO0OO.o00O00OO.OooO0o(yallaTeamMessage.getTitle()) ? com.code.android.util.o0OoOo0.OooOOO(yallaTeamMessage.getTitle(), "") : yallaTeamMessage.getMessage());
            } else {
                systemConversationModel.setContent(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_satisfaction_survey_title));
            }
        }
        CollectionsKt.sortWith(aVar.f57102OooO00o, new Oo0000(b.f57109OooO0Oo));
        notifyItemRangeChanged(0, getItemCount());
    }
}
