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
import p474o0OoooOO.oo0oO0;
import p593o0oOoooO.h0;
import p646o0ooOOOO.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function3<n0<ChatMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25361OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25361OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(n0<ChatMessage> n0Var, View view, Integer num) {
        String strOooO00o;
        n0<ChatMessage> chatMessageBasePagingAdapter = n0Var;
        View view2 = view;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        PrivateChatActivity privateChatActivity = this.f25361OooO0Oo;
        p436o0OoOOOO.oo0oOO0 oo0ooo0 = privateChatActivity.f25254OooOooO;
        p571o0oOo0o0.o0OoOo0 o0oooo1 = null;
        if (oo0ooo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
            oo0ooo0 = null;
        }
        MutableState<Oooo000> mutableState = privateChatActivity.f25255OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        oo0ooo0.OooO00o(mutableState.getValue());
        MutableState<Oooo000> mutableState2 = privateChatActivity.f25255OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        p373o0OOo0oO.o00oO0o value = mutableState2.getValue().f25224OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        int id = view2.getId();
        if (id == p565o0oOo000.o0Oo0oo.svga_message_status) {
            Lazy lazy = privateChatActivity.f25246OooOo00;
            p205o00o0o0o.o000O o000o = (p205o00o0o0o.o000O) lazy.getValue();
            String string = privateChatActivity.getString(p565o0oOo000.o000OOo.resend);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            o000o.OooOo00(string);
            ((p205o00o0o0o.o000O) lazy.getValue()).OooOo0(new o000(privateChatActivity, data));
            ((p205o00o0o0o.o000O) lazy.getValue()).OooOO0o();
        } else if (id == p565o0oOo000.o0Oo0oo.niv_chat_message_header) {
            if (data.getIsAcceptMsg()) {
                strOooO00o = String.valueOf(privateChatActivity.OooOo().getTargetId());
            } else {
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                strOooO00o = o0000O0O.OooO.OooO00o();
            }
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26776Oooo0o;
            o0000OO0 o0000oo1 = new o0000OO0();
            Bundle bundle = new Bundle();
            bundle.putString("Id", strOooO00o);
            bundle.putBoolean("UserInfoActivityNew_Go_To_Add_Friend", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_ROOM_KEY", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_PRIVATE_CHAT", true);
            p604o0oo00oo.o000 o000Var = new p604o0oo00oo.o000(privateChatActivity);
            o000Var.f56955OooO0O0 = UserInfoActivity.class;
            o000Var.OooO00o(bundle);
            o000Var.OooO0O0(o0000oo1);
        } else if (id == p565o0oOo000.o0Oo0oo.fl_share_room_send) {
            h0.OooO0O0("104009");
            h0.OooO0O0("204013");
            MutableState mutableState3 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
            ChatMessage.ShareRoomInfo shareRoomInfo = data.getShareRoomInfo();
            Intrinsics.checkNotNull(shareRoomInfo);
            p431o0OoOO.o0Oo0oo.OooO0o0(shareRoomInfo.getRoomId(), EnterRoomParentPage.Message_Chat_SharedRoom);
        } else if (id == p565o0oOo000.o0Oo0oo.fl_share_room_receive) {
            h0.OooO0O0("204013");
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
                MutableState mutableState4 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                p431o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Message_Chat_SharedRoom);
            }
        } else if (id == p565o0oOo000.o0Oo0oo.fl_share_post_send || p565o0oOo000.o0Oo0oo.fl_share_post_receive == id) {
            if (data.getShareMomentInfo() != null) {
                String mid = data.getMid();
                ChatMessage.ShareMomentInfo shareMomentInfo = data.getShareMomentInfo();
                Intrinsics.checkNotNull(shareMomentInfo);
                BaseMomentDetailVM.momentDetail$default(privateChatActivity.OooOo0o(), androidx.camera.core.impl.o00oOoo.OooO00o(shareMomentInfo.getMomentId()), 0, 2, null).observe(privateChatActivity, new p386o0OOoo0O.o0OoOo0(new o00000O(privateChatActivity, mid), null, null, false));
            }
        } else if (id == p565o0oOo000.o0Oo0oo.fl_share_topic_send || p565o0oOo000.o0Oo0oo.fl_share_topic_receive == id) {
            if (data.getShareTopicInfo() != null) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                ChatMessage.ShareTopicInfo shareTopicInfo = data.getShareTopicInfo();
                Intrinsics.checkNotNull(shareTopicInfo);
                topicInfoModel.setId(shareTopicInfo.getTopicId());
                int i = TopicDetailActivity.f25856OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(privateChatActivity, topicInfoModel);
            }
        } else if (id == p565o0oOo000.o0Oo0oo.fl_share_user_send || p565o0oOo000.o0Oo0oo.fl_share_user_receive == id) {
            if (data.getShareUserInfo() != null) {
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26776Oooo0o;
                ChatMessage.ShareUserInfo shareUserInfo = data.getShareUserInfo();
                Intrinsics.checkNotNull(shareUserInfo);
                UserInfoActivity.OooO00o.OooO0OO(oooO00o2, privateChatActivity, androidx.camera.core.impl.o00oOoo.OooO00o(shareUserInfo.getUserId()), false, 8);
            }
        } else if (id == p565o0oOo000.o0Oo0oo.clShareActivitySend || p565o0oOo000.o0Oo0oo.clShareActivityReceive == id) {
            if (data.getShareActivityInfo() != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.PrivateChatShare);
                ChatMessage.ShareActivityInfo shareActivityInfo = data.getShareActivityInfo();
                Intrinsics.checkNotNull(shareActivityInfo);
                webPageInfo.OooO0o0(shareActivityInfo.getActivityUrl());
                int i2 = WebActivity.f25131OooOoO0;
                WebActivity.OooO00o.OooO00o(privateChatActivity, webPageInfo);
            }
        } else if (id == p565o0oOo000.o0Oo0oo.clRoomTheme) {
            if (!privateChatActivity.f25251OooOoOO) {
                privateChatActivity.f25251OooOoOO = true;
                privateChatActivity.OooOo().getRoomThemeGiveState(data);
            }
        } else if ((id == p565o0oOo000.o0Oo0oo.clShareEventSend || id == p565o0oOo000.o0Oo0oo.clShareEventReceive) && data.getShareEventRoomInfo() != null) {
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = data.getShareEventRoomInfo();
            EventModel eventModel = new EventModel();
            eventModel.setMid(data.getMid());
            Intrinsics.checkNotNull(shareEventRoomInfo);
            eventModel.setId(shareEventRoomInfo.getEventId());
            p571o0oOo0o0.o0OoOo0 o0oooo2 = p571o0oOo0o0.o0O0O00.f56324OooO0O0;
            if (o0oooo2 != null) {
                o0oooo1 = o0oooo2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("event");
            }
            o0oooo1.OooO0o(eventModel);
        }
        return Unit.INSTANCE;
    }
}
