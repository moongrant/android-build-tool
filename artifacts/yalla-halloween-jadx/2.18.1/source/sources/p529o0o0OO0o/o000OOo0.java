package p529o0o0OO0o;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.RoomModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.model.ActivityPushMessageModel;
import com.yalla.yalla.model.DataMessage;
import com.yalla.yalla.model.EventPushModel;
import com.yalla.yalla.model.FriendRequestPushModel;
import com.yalla.yalla.model.RoomMemberConvenePushModel;
import com.yalla.yalla.model.YallaTeamPushMessageModel;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 {
    public static final void OooO00o(@NotNull String message, boolean z) {
        EventPushModel eventPushModel;
        RoomMemberConvenePushModel roomMemberConvenePushModel;
        YallaTeamPushMessageModel yallaTeamPushMessageModel;
        ActivityPushMessageModel activityPushMessageModel;
        FriendRequestPushModel friendRequestPushModel;
        Intrinsics.checkNotNullParameter(message, "message");
        if (StringsKt.isBlank(message)) {
            return;
        }
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Boolean value = oooOOO.OooOooO().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            o00O00.OooO0OO("FirebaseMessageHandler", "post fromNotification = " + z + " message = " + message);
            DataMessage dataMessage = (DataMessage) o0Oo0oo.OooO0O0(message, DataMessage.class);
            if (dataMessage != null) {
                int type = dataMessage.getType();
                String info = dataMessage.getInfo();
                o00O00.OooO0OO("FirebaseMessageHandler", "data fromNotification = " + z + " type = " + type + "  value = " + info);
                if (type == 1002) {
                    if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && (friendRequestPushModel = (FriendRequestPushModel) o0Oo0oo.OooO0O0(info, FriendRequestPushModel.class)) != null) {
                        long receiverId = friendRequestPushModel.getReceiverId();
                        Long value2 = oooOOO.OooOo().getValue();
                        if (value2 != null && receiverId == value2.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity activityOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
                            if (!z || (activityOooO0O0 instanceof FriendRequestMessageActivity) || activityOooO0O0 == null) {
                                return;
                            }
                            FriendRequestMessageActivity.f22157OooooOO.OooO00o(activityOooO0O0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type == 1003) {
                    if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && (activityPushMessageModel = (ActivityPushMessageModel) o0Oo0oo.OooO0O0(info, ActivityPushMessageModel.class)) != null) {
                        long receiverId2 = activityPushMessageModel.getReceiverId();
                        Long value3 = oooOOO.OooOo().getValue();
                        if (value3 != null && receiverId2 == value3.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity activityOooO0O1 = OooO0O0.f20502OooO00o.OooO0O0();
                            if (!z || (activityOooO0O1 instanceof ActivitiesNoticeActivity) || activityOooO0O1 == null) {
                                return;
                            }
                            activityOooO0O1.startActivity(new Intent(activityOooO0O1, (Class<?>) ActivitiesNoticeActivity.class));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type == 1004) {
                    if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && (yallaTeamPushMessageModel = (YallaTeamPushMessageModel) o0Oo0oo.OooO0O0(info, YallaTeamPushMessageModel.class)) != null) {
                        long receiverId3 = yallaTeamPushMessageModel.getReceiverId();
                        Long value4 = oooOOO.OooOo().getValue();
                        if (value4 != null && receiverId3 == value4.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity activityOooO0O2 = OooO0O0.f20502OooO00o.OooO0O0();
                            if (!z || (activityOooO0O2 instanceof YallaTeamMessageActivity) || activityOooO0O2 == null) {
                                return;
                            }
                            activityOooO0O2.startActivity(new Intent(activityOooO0O2, (Class<?>) YallaTeamMessageActivity.class));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type != 1005) {
                    if (type == 1006 && Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && (eventPushModel = (EventPushModel) o0Oo0oo.OooO0O0(info, EventPushModel.class)) != null) {
                        long receiverId4 = eventPushModel.getReceiverId();
                        Long value5 = oooOOO.OooOo().getValue();
                        if (value5 != null && receiverId4 == value5.longValue() && z) {
                            RoomModel roomModel = new RoomModel();
                            roomModel.setId(eventPushModel.getRoomId());
                            RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, roomModel, (EnterRoomParentPage) null, 2, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && (roomMemberConvenePushModel = (RoomMemberConvenePushModel) o0Oo0oo.OooO0O0(info, RoomMemberConvenePushModel.class)) != null) {
                    long receiverId5 = roomMemberConvenePushModel.getReceiverId();
                    Long value6 = oooOOO.OooOo().getValue();
                    if (value6 != null && receiverId5 == value6.longValue()) {
                        Activity activityOooO0O3 = OooO0O0.f20502OooO00o.OooO0O0();
                        if (!z || (activityOooO0O3 instanceof MixedRoomActivity) || activityOooO0O3 == null) {
                            return;
                        }
                        RoomModel roomModel2 = new RoomModel();
                        roomModel2.setId(roomMemberConvenePushModel.getRoomId());
                        RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, roomModel2, (EnterRoomParentPage) null, 2, (Object) null);
                    }
                }
            }
        }
    }
}
