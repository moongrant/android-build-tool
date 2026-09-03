package p536o0o0OOoo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.app.base.model.RoomModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO00o;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p464o0Ooo0oO.o0000O0O;
import p470o0Oooo0.o00O0000;
import p498o0o00Oo0.OooOOO;
import p584o0oOoo.o000O;
import p606o0oo0O.OooOo;
import p620o0oo0o0O.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends Lambda implements Function3<o0000O0O<ChatMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43789Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f43789Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<ChatMessage> o0000o0o2, View view, Integer num) {
        o0000O0O<ChatMessage> chatMessageBasePagingAdapter = o0000o0o2;
        View view2 = view;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        PrivateChatActivity privateChatActivity = this.f43789Oooo0o;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        privateChatActivity.Oooo000();
        o00O0000 o00o0001 = this.f43789Oooo0o.f22174OooooOo;
        if (o00o0001 != null) {
            Intrinsics.checkNotNull(o00o0001);
            o00o0001.OooO0OO();
        }
        int id = view2.getId();
        if (id == R.id.svga_message_status) {
            oo0oOO0 oo0ooo0OooOoOO = PrivateChatActivity.OooOoOO(this.f43789Oooo0o);
            String string = this.f43789Oooo0o.getString(R.string.resend);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.resend)");
            oo0ooo0OooOoOO.OooOo0O(string);
            PrivateChatActivity.OooOoOO(this.f43789Oooo0o).OooOo0o(new f0(this.f43789Oooo0o, data));
            PrivateChatActivity.OooOoOO(this.f43789Oooo0o).OooOOO0();
        } else if (id == R.id.niv_chat_message_header) {
            UserInfoActivity.f23452o0ooOO0.OooO0O0(this.f43789Oooo0o, data.getIsAcceptMsg() ? String.valueOf(this.f43789Oooo0o.Oooo0O0().getTargetId()) : OooO00o.OooO0O0(OooOOO.f41216OooO00o), true, new o00O00o0() { // from class: o0o0OOoo.e0
                @Override // p620o0oo0o0O.o00O00o0
                public final void onActivityResult(int i, Intent intent) {
                }
            });
        } else if (id == R.id.fl_share_room_send) {
            OooOo.OooO0O0("104009");
            o0O00000.OooO0OO("Message_chat_EnterRoom");
            RoomStateManager roomStateManager = RoomStateManager.INSTANCE;
            ChatMessage.ShareRoomInfo shareRoomInfo = data.getShareRoomInfo();
            Intrinsics.checkNotNull(shareRoomInfo);
            roomStateManager.enterRoom(shareRoomInfo.getRoomId(), EnterRoomParentPage.Message_Chat_SharedRoom);
        } else if (id == R.id.fl_share_room_receive) {
            o0O00000.OooO0OO("Message_chat_EnterRoom");
            if (data.getShareRoomInfo() != null) {
                RoomModel roomModel = new RoomModel();
                ChatMessage.ShareRoomInfo shareRoomInfo2 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo2);
                roomModel.setName(shareRoomInfo2.getRoomName());
                ChatMessage.ShareRoomInfo shareRoomInfo3 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo3);
                roomModel.setImage(shareRoomInfo3.getRoomHeader());
                StringBuilder sb = new StringBuilder();
                ChatMessage.ShareRoomInfo shareRoomInfo4 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo4);
                sb.append(shareRoomInfo4.getRoomIdx());
                sb.append("");
                roomModel.setBaridx(sb.toString());
                ChatMessage.ShareRoomInfo shareRoomInfo5 = data.getShareRoomInfo();
                Intrinsics.checkNotNull(shareRoomInfo5);
                roomModel.setId(shareRoomInfo5.getRoomId());
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Message_Chat_SharedRoom);
            }
        } else if (id == R.id.fl_share_post_send || R.id.fl_share_post_receive == id) {
            if (data.getShareMomentInfo() != null) {
                PrivateChatActivity privateChatActivity2 = this.f43789Oooo0o;
                String mid = data.getMid();
                ChatMessage.ShareMomentInfo shareMomentInfo = data.getShareMomentInfo();
                Intrinsics.checkNotNull(shareMomentInfo);
                long momentId = shareMomentInfo.getMomentId();
                ((MomentVM) privateChatActivity2.f22177OoooooO.getValue()).momentDetail("" + momentId, 0).observe(privateChatActivity2, new o0o0000.OooOo(new q(privateChatActivity2, mid), null, null, false));
            }
        } else if (id == R.id.fl_share_topic_send || R.id.fl_share_topic_receive == id) {
            if (data.getShareTopicInfo() != null) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                ChatMessage.ShareTopicInfo shareTopicInfo = data.getShareTopicInfo();
                Intrinsics.checkNotNull(shareTopicInfo);
                topicInfoModel.setId(shareTopicInfo.getTopicId());
                TopicDetailActivity.f22567o0OoOo0.OooO00o(this.f43789Oooo0o, topicInfoModel);
            }
        } else if (id == R.id.fl_share_user_send || R.id.fl_share_user_receive == id) {
            if (data.getShareUserInfo() != null) {
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                PrivateChatActivity privateChatActivity3 = this.f43789Oooo0o;
                StringBuilder sb2 = new StringBuilder();
                ChatMessage.ShareUserInfo shareUserInfo = data.getShareUserInfo();
                Intrinsics.checkNotNull(shareUserInfo);
                sb2.append(shareUserInfo.getUserId());
                sb2.append("");
                UserInfoActivity.OooO00o.OooO0Oo(oooO00o2, privateChatActivity3, sb2.toString(), false, 8);
            }
        } else if (id == R.id.clShareActivitySend || R.id.clShareActivityReceive == id) {
            if (data.getShareActivityInfo() != null) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.PrivateChatShare);
                ChatMessage.ShareActivityInfo shareActivityInfo = data.getShareActivityInfo();
                Intrinsics.checkNotNull(shareActivityInfo);
                webPageInfo.OooO0Oo(shareActivityInfo.getActivityUrl());
                WebActivity.f22108OoooooO.OooO00o(this.f43789Oooo0o, webPageInfo);
            }
        } else if (id == R.id.clRoomTheme) {
            PrivateChatActivity privateChatActivity4 = this.f43789Oooo0o;
            if (!privateChatActivity4.f22186ooOO) {
                privateChatActivity4.f22186ooOO = true;
                privateChatActivity4.Oooo0O0().getRoomThemeGiveState(data);
            }
        } else if ((id == R.id.clShareEventSend || id == R.id.clShareEventReceive) && data.getShareEventRoomInfo() != null) {
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = data.getShareEventRoomInfo();
            EventModel model = new EventModel();
            model.setMid(data.getMid());
            Intrinsics.checkNotNull(shareEventRoomInfo);
            model.setId(shareEventRoomInfo.getEventId());
            Intrinsics.checkNotNullParameter(model, "model");
            Bundle bundleOooO00o = OooO0OO.OooO00o();
            bundleOooO00o.putSerializable("key", model);
            o000O.OooO00o(EventDetailScreen.f24568OooO00o, bundleOooO00o);
        }
        return Unit.INSTANCE;
    }
}
