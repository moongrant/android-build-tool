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
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function3<h3<ChatMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25362OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f25362OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<ChatMessage> h3Var, View view, Integer num) {
        String strOooO00o;
        h3<ChatMessage> chatMessageBasePagingAdapter = h3Var;
        View view2 = view;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        PrivateChatActivity privateChatActivity = this.f25362OooO0Oo;
        p434o0OoOOOO.o00O0OO o00o0oo2 = privateChatActivity.f25253OooOooO;
        p569o0oOo0o0.o0OOO0o o0ooo0o2 = null;
        if (o00o0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
            o00o0oo2 = null;
        }
        MutableState<Oooo000> mutableState = privateChatActivity.f25254OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        o00o0oo2.OooO00o(mutableState.getValue());
        MutableState<Oooo000> mutableState2 = privateChatActivity.f25254OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        p371o0OOo0oO.oo000o value = mutableState2.getValue().f25223OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        int id = view2.getId();
        if (id == p562o0oOo000.o0OO00O.svga_message_status) {
            Lazy lazy = privateChatActivity.f25245OooOo00;
            p205o00o0o0o.o000O o000o = (p205o00o0o0o.o000O) lazy.getValue();
            String string = privateChatActivity.getString(p562o0oOo000.o000000.resend);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            o000o.OooOo00(string);
            ((p205o00o0o0o.o000O) lazy.getValue()).OooOo0(new o000(privateChatActivity, data));
            ((p205o00o0o0o.o000O) lazy.getValue()).OooOO0o();
        } else if (id == p562o0oOo000.o0OO00O.niv_chat_message_header) {
            if (data.getIsAcceptMsg()) {
                strOooO00o = String.valueOf(privateChatActivity.OooOo().getTargetId());
            } else {
                p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                strOooO00o = p004OooO0oO.o0OoOo0.OooO00o();
            }
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            o0000OO0 o0000oo1 = new o0000OO0();
            Bundle bundle = new Bundle();
            bundle.putString("Id", strOooO00o);
            bundle.putBoolean("UserInfoActivityNew_Go_To_Add_Friend", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_ROOM_KEY", false);
            bundle.putBoolean("UserInfoActivityNew_FROM_PRIVATE_CHAT", true);
            p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(privateChatActivity);
            oooOo.f57388OooO0O0 = UserInfoActivity.class;
            oooOo.OooO00o(bundle);
            oooOo.OooO0O0(o0000oo1);
        } else if (id == p562o0oOo000.o0OO00O.fl_share_room_send) {
            o0oo0000.OooO00o.OooO0O0("104009");
            o0oo0000.OooO00o.OooO0O0("204013");
            MutableState mutableState3 = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            ChatMessage.ShareRoomInfo shareRoomInfo = data.getShareRoomInfo();
            Intrinsics.checkNotNull(shareRoomInfo);
            p429o0OoOO.o0Oo0oo.OooO0o0(shareRoomInfo.getRoomId(), EnterRoomParentPage.Message_Chat_SharedRoom);
        } else if (id == p562o0oOo000.o0OO00O.fl_share_room_receive) {
            o0oo0000.OooO00o.OooO0O0("204013");
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
                MutableState mutableState4 = p429o0OoOO.o0Oo0oo.f46817OooO00o;
                p429o0OoOO.o0Oo0oo.OooO0o(roomModel, EnterRoomParentPage.Message_Chat_SharedRoom);
            }
        } else if (id == p562o0oOo000.o0OO00O.fl_share_post_send || p562o0oOo000.o0OO00O.fl_share_post_receive == id) {
            if (data.getShareMomentInfo() != null) {
                String mid = data.getMid();
                ChatMessage.ShareMomentInfo shareMomentInfo = data.getShareMomentInfo();
                Intrinsics.checkNotNull(shareMomentInfo);
                BaseMomentDetailVM.momentDetail$default(privateChatActivity.OooOo0o(), androidx.media3.session.o0000O00.OooO00o(shareMomentInfo.getMomentId()), 0, 2, null).observe(privateChatActivity, new p384o0OOoo0O.o000oOoO(new o00000O(privateChatActivity, mid), null, null, false));
            }
        } else if (id == p562o0oOo000.o0OO00O.fl_share_topic_send || p562o0oOo000.o0OO00O.fl_share_topic_receive == id) {
            if (data.getShareTopicInfo() != null) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                ChatMessage.ShareTopicInfo shareTopicInfo = data.getShareTopicInfo();
                Intrinsics.checkNotNull(shareTopicInfo);
                topicInfoModel.setId(shareTopicInfo.getTopicId());
                int i = TopicDetailActivity.f25854OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(privateChatActivity, topicInfoModel);
            }
        } else if (id == p562o0oOo000.o0OO00O.fl_share_user_send || p562o0oOo000.o0OO00O.fl_share_user_receive == id) {
            if (data.getShareUserInfo() != null) {
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
                ChatMessage.ShareUserInfo shareUserInfo = data.getShareUserInfo();
                Intrinsics.checkNotNull(shareUserInfo);
                UserInfoActivity.OooO00o.OooO0OO(oooO00o2, privateChatActivity, androidx.media3.session.o0000O00.OooO00o(shareUserInfo.getUserId()), false, 8);
            }
        } else if (id == p562o0oOo000.o0OO00O.clShareActivitySend || p562o0oOo000.o0OO00O.clShareActivityReceive == id) {
            if (data.getShareActivityInfo() != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.PrivateChatShare);
                ChatMessage.ShareActivityInfo shareActivityInfo = data.getShareActivityInfo();
                Intrinsics.checkNotNull(shareActivityInfo);
                webPageInfo.OooO0o0(shareActivityInfo.getActivityUrl());
                int i2 = WebActivity.f25130OooOoO0;
                WebActivity.OooO00o.OooO00o(privateChatActivity, webPageInfo);
            }
        } else if (id == p562o0oOo000.o0OO00O.clRoomTheme) {
            if (!privateChatActivity.f25250OooOoOO) {
                privateChatActivity.f25250OooOoOO = true;
                privateChatActivity.OooOo().getRoomThemeGiveState(data);
            }
        } else if ((id == p562o0oOo000.o0OO00O.clShareEventSend || id == p562o0oOo000.o0OO00O.clShareEventReceive) && data.getShareEventRoomInfo() != null) {
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = data.getShareEventRoomInfo();
            EventModel eventModel = new EventModel();
            eventModel.setMid(data.getMid());
            Intrinsics.checkNotNull(shareEventRoomInfo);
            eventModel.setId(shareEventRoomInfo.getEventId());
            p569o0oOo0o0.o0OOO0o o0ooo0o3 = p569o0oOo0o0.o00000OO.f56399OooO0O0;
            if (o0ooo0o3 != null) {
                o0ooo0o2 = o0ooo0o3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("event");
            }
            o0ooo0o2.OooO0o(eventModel);
        }
        return Unit.INSTANCE;
    }
}
