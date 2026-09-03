package p565o0oOo0;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.message.MessageModelHeadType;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.SystemConversationModel;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189o00o00o0.OooO0OO;
import p189o00o00o0.OooO0o;
import p255o00ooO0O.o000O0O0;
import p524o0o0O0o.o00O0;
import p619o0oo0o.o0000;
import p619o0oo0o.o0000Ooo;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends OooO0OO<SystemConversationModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000 f45115OooO00o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull Context context) {
        super(context, R.layout.message_item_conversation_system);
        Intrinsics.checkNotNullParameter(context, "context");
        o0000 o0000Var = new o0000();
        this.f45115OooO00o = o0000Var;
        setNewData(o0000Var.f48487OooO00o);
    }

    public final void OooO00o(@Nullable SystemMessage systemMessage) {
        String strOooO0OO;
        String roomName;
        o0000 o0000Var = this.f45115OooO00o;
        Objects.requireNonNull(o0000Var);
        String strOooO0OO2 = "";
        if (systemMessage == null) {
            o0000Var.f48488OooO0O0.setTime(0L);
            o0000Var.f48488OooO0O0.setContent("");
        } else {
            switch (systemMessage.getType()) {
                case 1:
                    UserPremiumView.OooO00o oooO00o = UserPremiumView.f21071OoooO;
                    SystemMessage.PremiumInfo vipInfo = systemMessage.getVipInfo();
                    o0000Var.f48488OooO0O0.setContent(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.system_message_subscribe_vip_title), oooO00o.OooO0O0(vipInfo != null ? vipInfo.getVipLevel() : PremiumLevel.Premium1.getValue())));
                    break;
                case 2:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_create_topic_member_title));
                    break;
                case 3:
                    SystemConversationModel systemConversationModel = o0000Var.f48488OooO0O0;
                    SystemMessage.TopicStateInfo topicStateInfo = systemMessage.getTopicStateInfo();
                    Integer numValueOf = topicStateInfo != null ? Integer.valueOf(topicStateInfo.getTopicType()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 2) {
                        strOooO0OO = o000O0O0.OooO0OO(R.string.system_message_create_topic_failed_title);
                    } else {
                        strOooO0OO = (numValueOf != null && numValueOf.intValue() == 3) ? o000O0O0.OooO0OO(R.string.system_message_create_topic_dissolve_title) : o000O0O0.OooO0OO(R.string.system_message_create_topic_success_title);
                    }
                    systemConversationModel.setContent(strOooO0OO);
                    break;
                case 4:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_mora_expired));
                    break;
                case 5:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_user_level_upgrade_title));
                    break;
                case 6:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.icon_system_message_room_upgrade_title));
                    break;
                case 7:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_salary_title));
                    break;
                case 8:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_title));
                    break;
                case 9:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Lucky_Bag_back_title));
                    break;
                case 10:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_remind_title));
                    break;
                case 11:
                    SystemConversationModel systemConversationModel2 = o0000Var.f48488OooO0O0;
                    SystemMessage.AristocracyExpiredInfo aristocracyInfo = systemMessage.getAristocracyInfo();
                    int buyType = aristocracyInfo != null ? aristocracyInfo.getBuyType() : 0;
                    if (buyType == 0) {
                        strOooO0OO2 = o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_will_remind_title);
                    } else if (buyType == 2) {
                        strOooO0OO2 = o000O0O0.OooO0OO(R.string.system_message_vip_aristocracy_due_remind_title);
                    }
                    systemConversationModel2.setContent(strOooO0OO2);
                    break;
                case 12:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_uniqueid_due_will_remind_title));
                    break;
                case 13:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_top_card_refund_title));
                    break;
                case 14:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_top_card_bid_title));
                    break;
                case 15:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_vip_coin_rebate_title));
                    break;
                case 16:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_unlocked_a_profile_frame_title));
                    break;
                case 17:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_premium_reward_title));
                    break;
                case 19:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_newbadge_title));
                    break;
                case 20:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_newbadge_title));
                    break;
                case 21:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_message_treasure_win));
                    break;
                case 22:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.message_custom_theme_successful_title));
                    break;
                case 23:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.message_custom_theme_failed_title));
                    break;
                case 24:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.message_custom_theme_delete_title));
                    break;
                case 25:
                    SystemConversationModel systemConversationModel3 = o0000Var.f48488OooO0O0;
                    SystemMessage.VipMsgInfo kaVipMsgInfo = systemMessage.getKaVipMsgInfo();
                    int kaVipType = kaVipMsgInfo != null ? kaVipMsgInfo.getKaVipType() : 0;
                    if (kaVipType == 1) {
                        strOooO0OO2 = o000O0O0.OooO0OO(R.string.message_ka_vip_expire);
                    } else if (kaVipType == 2) {
                        strOooO0OO2 = o000O0O0.OooO0OO(R.string.message_ka_vip_will_upgrade);
                    } else if (kaVipType == 3) {
                        String strOooO0OO3 = o000O0O0.OooO0OO(R.string.message_ka_vip_obtain);
                        String[] strArr = new String[1];
                        VipLevel.Companion companion = VipLevel.INSTANCE;
                        SystemMessage.VipMsgInfo kaVipMsgInfo2 = systemMessage.getKaVipMsgInfo();
                        strArr[0] = String.valueOf(companion.OooO0O0(kaVipMsgInfo2 != null ? kaVipMsgInfo2.getKaVipLevel() : 0).OooO0O0());
                        strOooO0OO2 = OooOo.OooO00o(strOooO0OO3, strArr);
                    }
                    systemConversationModel3.setContent(strOooO0OO2);
                    break;
                case 26:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.message_give_theme_reimburse_title));
                    break;
                case 27:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_start));
                    break;
                case 28:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_start));
                    break;
                case 29:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_deleted));
                    break;
                case 30:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_cancel));
                    break;
                case 31:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_passed));
                    break;
                case 32:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Event_Message_Title_recommend));
                    break;
                case 33:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_mssage_title_first_recharge_rewards));
                    break;
                case 34:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.Recharge_Successful));
                    break;
                case 35:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.system_mssage_title_first_month_recharge_rewards));
                    break;
                case 36:
                    SystemConversationModel systemConversationModel4 = o0000Var.f48488OooO0O0;
                    String strOooO0OO4 = o000O0O0.OooO0OO(R.string.member_badge_frozen_tip_message);
                    String[] strArr2 = new String[1];
                    SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = systemMessage.getMemberBadgeFrozenInfo();
                    if (memberBadgeFrozenInfo != null && (roomName = memberBadgeFrozenInfo.getRoomName()) != null) {
                        strOooO0OO2 = roomName;
                    }
                    strArr2[0] = strOooO0OO2;
                    systemConversationModel4.setContent(OooOo.OooO00o(strOooO0OO4, strArr2));
                    break;
                case 37:
                    o0000Var.f48488OooO0O0.setContent(o000O0O0.OooO0OO(R.string.member_badge_reward_title));
                    break;
            }
            o0000Var.f48488OooO0O0.setTime(systemMessage.getTime());
        }
        CollectionsKt.sortWith(o0000Var.f48487OooO00o, o0000Ooo.f48502Oooo);
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void OooO0O0(@NotNull MessageModelHeadType type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        o0000 o0000Var = this.f45115OooO00o;
        Objects.requireNonNull(o0000Var);
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = o0000.OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            o0000Var.f48488OooO0O0.setUnReadCount(i);
        } else if (i2 == 2) {
            o0000Var.f48489OooO0OO.setUnReadCount(i);
        }
        notifyItemRangeChanged(0, getItemCount());
    }

    public final void OooO0OO(@Nullable YallaTeamMessage yallaTeamMessage) {
        o0000 o0000Var = this.f45115OooO00o;
        if (yallaTeamMessage == null) {
            o0000Var.f48489OooO0OO.setTime(0L);
            o0000Var.f48489OooO0OO.setContent("");
        } else {
            o0000Var.f48489OooO0OO.setTime(yallaTeamMessage.getTime());
            int type = yallaTeamMessage.getType();
            if (type == 2) {
                o0000Var.f48489OooO0OO.setContent(o000O0O0.OooO0OO(R.string.yalla_team_thanks_feedback));
            } else if (type == 4) {
                o0000Var.f48489OooO0OO.setContent(o000O0O0.OooO0OO(R.string.yalla_team_feedback_replied));
            } else if (type == 6) {
                o0000Var.f48489OooO0OO.setContent(o000O0O0.OooO0OO(R.string.yalla_team_welcome_to_yalla));
            } else if (type != 7) {
                o0000Var.f48489OooO0OO.setContent(o00O0.OooO0o0(yallaTeamMessage.getTitle()) ? o00O0.OooO0oO(yallaTeamMessage.getTitle()) : yallaTeamMessage.getMessage());
            } else {
                o0000Var.f48489OooO0OO.setContent(o000O0O0.OooO0OO(R.string.yalla_team_satisfaction_survey_title));
            }
        }
        CollectionsKt.sortWith(o0000Var.f48487OooO00o, o0000Ooo.f48502Oooo);
        notifyItemRangeChanged(0, getItemCount());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        SystemConversationModel model = (SystemConversationModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            helper.itemView.setTag(R.id.tag_userinfo, null);
            helper.itemView.setTag(R.id.tag_friend_memo_name_tag, null);
            ImageView imageView = (ImageView) helper.OooO0Oo(R.id.ivHeader);
            DotView dotView = (DotView) helper.OooO0Oo(R.id.dotView);
            TextView textView = (TextView) helper.OooO0Oo(R.id.tvTitle);
            TextView textView2 = (TextView) helper.OooO0Oo(R.id.tvContent);
            TextView textView3 = (TextView) helper.OooO0Oo(R.id.tvTime);
            dotView.OooO0OO(false);
            dotView.setNumber(Integer.valueOf(model.getUnReadCount()));
            textView3.setText("");
            if (model.getTime() > 0) {
                textView3.setText(oo00o.f48643OooO00o.OooO0Oo(model.getTime(), System.currentTimeMillis()));
            }
            textView2.setText("");
            textView2.setVisibility(8);
            if (!StringsKt.isBlank(model.getContent())) {
                textView2.setText(model.getContent());
                textView2.setVisibility(0);
            }
            int i = OooO00o.$EnumSwitchMapping$0[model.getType().ordinal()];
            if (i == 1) {
                imageView.setImageResource(R.mipmap.icon_message_system);
                textView.setText(o000O0O0.OooO0OO(R.string.subscription_service));
            } else {
                if (i != 2) {
                    return;
                }
                imageView.setImageResource(R.mipmap.icon_yalla_team);
                textView.setText(o000O0O0.OooO0OO(R.string.MessageFragment_item_YallaTeam));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
