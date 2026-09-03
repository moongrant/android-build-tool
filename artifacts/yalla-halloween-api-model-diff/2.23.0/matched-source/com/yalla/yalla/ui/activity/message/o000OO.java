package com.yalla.yalla.ui.activity.message;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<ChatMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25819OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25819OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<ChatMessage> oooOO0O, View view, Integer num) {
        String strOooO00o;
        p400o0Oo0OO.OooOO0O<ChatMessage> chatMessageBasePagingAdapter = oooOO0O;
        View view2 = view;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        PrivateChatActivity privateChatActivity = this.f25819OooO0Oo;
        p430o0OoOOO0.o000O0o o000o0o2 = privateChatActivity.f25708OooOooO;
        p560o0oOo000.o00000O0 o00000o1 = null;
        if (o000o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
            o000o0o2 = null;
        }
        MutableState<Oooo000> mutableState = privateChatActivity.f25709OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        o000o0o2.OooO00o(mutableState.getValue());
        MutableState<Oooo000> mutableState2 = privateChatActivity.f25709OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        p367o0OOo0o0.OooOOOO value = mutableState2.getValue().f25678OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        int id = view2.getId();
        if (id == oO00O0oO.svga_message_status) {
            Lazy lazy = privateChatActivity.f25700OooOo00;
            p157o00OoOO0.o0OO00O o0oo00o2 = (p157o00OoOO0.o0OO00O) lazy.getValue();
            String string = privateChatActivity.getString(oO00OOo0.resend);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.resend)");
            o0oo00o2.OooOo00(string);
            ((p157o00OoOO0.o0OO00O) lazy.getValue()).OooOo0(new o0000O0O(privateChatActivity, data));
            ((p157o00OoOO0.o0OO00O) lazy.getValue()).OooOO0o();
        } else if (id == oO00O0oO.niv_chat_message_header) {
            if (data.getIsAcceptMsg()) {
                strOooO00o = String.valueOf(privateChatActivity.OooOo().getTargetId());
            } else {
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                strOooO00o = androidx.compose.runtime.Oooo0.OooO00o();
            }
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            o0000O0 o0000o1 = new o0000O0();
            Bundle bundle = new Bundle();
            bundle.putString("Id", strOooO00o);
            bundle.putBoolean("UserInfoActivityNew_Go_To_Add_Friend", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_ROOM_KEY", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_PRIVATE_CHAT", true);
            p599o0oo00oo.o000OO o000oo2 = new p599o0oo00oo.o000OO(privateChatActivity);
            o000oo2.f56864OooO0O0 = UserInfoActivity.class;
            o000oo2.OooO00o(bundle);
            o000oo2.OooO0O0(o0000o1);
        } else if (id == oO00O0oO.fl_share_room_send) {
            p587o0oOooo.o0OO000.OooO00o("104009");
            p587o0oOooo.o0OO000.OooO00o("204013");
            MutableState mutableState3 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            ChatMessage.ShareRoomInfo shareRoomInfo = data.getShareRoomInfo();
            Intrinsics.checkNotNull(shareRoomInfo);
            p427o0OoOO00.o0OOO0o.OooO0o0(shareRoomInfo.getRoomId(), EnterRoomParentPage.Message_Chat_SharedRoom);
        } else if (id == oO00O0oO.fl_share_room_receive) {
            p587o0oOooo.o0OO000.OooO00o("204013");
            if (data.getShareRoomInfo() != null) {
                RoomModel roomModel = new RoomModel();
                ChatMessage.ShareRoomInfo shareRoomInfo2 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo2);
                roomModel.setName(shareRoomInfo2.getRoomName());
                ChatMessage.ShareRoomInfo shareRoomInfo3 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo3);
                roomModel.setImage(shareRoomInfo3.getRoomHeader());
                ChatMessage.ShareRoomInfo shareRoomInfo4 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo4);
                long roomIdx = shareRoomInfo4.getRoomIdx();
                StringBuilder sb = new StringBuilder();
                sb.append(roomIdx);
                roomModel.setBaridx(sb.toString());
                ChatMessage.ShareRoomInfo shareRoomInfo5 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo5);
                roomModel.setId(shareRoomInfo5.getRoomId());
                MutableState mutableState4 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Message_Chat_SharedRoom);
            }
        } else if (id == oO00O0oO.fl_share_post_send || oO00O0oO.fl_share_post_receive == id) {
            if (data.getShareMomentInfo() != null) {
                String mid = data.getMid();
                ChatMessage.ShareMomentInfo shareMomentInfo = data.getShareMomentInfo();
                Intrinsics.checkNotNull(shareMomentInfo);
                BaseMomentDetailVM.momentDetail$default(privateChatActivity.OooOo0o(), oo0ooO.OooO00o(shareMomentInfo.getMomentId()), 0, 2, null).observe(privateChatActivity, new p377o0OOoOo.o0000OO0(new o0O0O00(privateChatActivity, mid), null, null, false));
            }
        } else if (id == oO00O0oO.fl_share_topic_send || oO00O0oO.fl_share_topic_receive == id) {
            if (data.getShareTopicInfo() != null) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                ChatMessage.ShareTopicInfo shareTopicInfo = data.getShareTopicInfo();
                Intrinsics.checkNotNull(shareTopicInfo);
                topicInfoModel.setId(shareTopicInfo.getTopicId());
                int i = TopicDetailActivity.f26305OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(privateChatActivity, topicInfoModel);
            }
        } else if (id == oO00O0oO.fl_share_user_send || oO00O0oO.fl_share_user_receive == id) {
            if (data.getShareUserInfo() != null) {
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
                ChatMessage.ShareUserInfo shareUserInfo = data.getShareUserInfo();
                Intrinsics.checkNotNull(shareUserInfo);
                UserInfoActivity.OooO00o.OooO0OO(oooO00o2, privateChatActivity, oo0ooO.OooO00o(shareUserInfo.getUserId()), false, 8);
            }
        } else if (id == oO00O0oO.clShareActivitySend || oO00O0oO.clShareActivityReceive == id) {
            if (data.getShareActivityInfo() != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.PrivateChatShare);
                ChatMessage.ShareActivityInfo shareActivityInfo = data.getShareActivityInfo();
                Intrinsics.checkNotNull(shareActivityInfo);
                webPageInfo.OooO0o0(shareActivityInfo.getActivityUrl());
                int i2 = WebActivity.f25584OooOoO0;
                WebActivity.OooO00o.OooO00o(privateChatActivity, webPageInfo);
            }
        } else if (id == oO00O0oO.clRoomTheme) {
            if (!privateChatActivity.f25705OooOoOO) {
                privateChatActivity.f25705OooOoOO = true;
                privateChatActivity.OooOo().getRoomThemeGiveState(data);
            }
        } else if ((id == oO00O0oO.clShareEventSend || id == oO00O0oO.clShareEventReceive) && data.getShareEventRoomInfo() != null) {
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = data.getShareEventRoomInfo();
            EventModel eventModel = new EventModel();
            eventModel.setMid(data.getMid());
            Intrinsics.checkNotNull(shareEventRoomInfo);
            eventModel.setId(shareEventRoomInfo.getEventId());
            p560o0oOo000.o00000O0 o00000o2 = p560o0oOo000.o0000OO0.f56183OooO0O0;
            if (o00000o2 != null) {
                o00000o1 = o00000o2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("event");
            }
            o00000o1.OooO0o(eventModel);
        }
        return Unit.INSTANCE;
    }
}
