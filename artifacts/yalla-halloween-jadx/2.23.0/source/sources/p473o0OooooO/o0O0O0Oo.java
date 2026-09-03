package p473o0OooooO;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.ActivityPushMessageModel;
import com.yalla.yalla.model.EventPushModel;
import com.yalla.yalla.model.FirebaseDataMessage;
import com.yalla.yalla.model.FriendRequestPushModel;
import com.yalla.yalla.model.RoomMemberConvenePushModel;
import com.yalla.yalla.model.YallaTeamPushMessageModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFirebaseMessageDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseMessageDispatcher.kt\ncom/yalla/yalla/service/im/firebase/FirebaseMessageDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class o0O0O0Oo {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(@NotNull String message, boolean z) {
        EventPushModel eventPushModel;
        RoomMemberConvenePushModel roomMemberConvenePushModel;
        YallaTeamPushMessageModel yallaTeamPushMessageModel;
        ActivityPushMessageModel activityPushMessageModel;
        FriendRequestPushModel friendRequestPushModel;
        Intrinsics.checkNotNullParameter(message, "message");
        if (StringsKt.isBlank(message)) {
            return;
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        T value = o000000O.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            OooOOO0.OooO0OO("FirebaseMessageHandler", "post fromNotification = " + z + " message = " + message);
            FirebaseDataMessage firebaseDataMessage = (FirebaseDataMessage) oOo00OO0.OooO00o(message, FirebaseDataMessage.class);
            if (firebaseDataMessage != null) {
                int type = firebaseDataMessage.getType();
                String info = firebaseDataMessage.getInfo();
                String source = firebaseDataMessage.getSource();
                String message_id = firebaseDataMessage.getMessage_id();
                OooOOO0.OooO0OO("FirebaseMessageHandler", "data fromNotification = " + z + " type = " + type + "  value = " + info);
                o0OO000.OooO0O0("101090", MapsKt.mapOf(TuplesKt.to("type", Integer.valueOf(type)), TuplesKt.to("source", source), TuplesKt.to("message_id", message_id)));
                if (type == 1002) {
                    if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && (friendRequestPushModel = (FriendRequestPushModel) oOo00OO0.OooO00o(info, FriendRequestPushModel.class)) != null) {
                        long receiverId = friendRequestPushModel.getReceiverId();
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        if (l != null && receiverId == l.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity context = OooO0O0.OooO0O0();
                            if (!z || (context instanceof FriendRequestMessageActivity) || context == null) {
                                return;
                            }
                            int i = FriendRequestMessageActivity.f25650OooOo0o;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) FriendRequestMessageActivity.class));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type == 1003) {
                    if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && (activityPushMessageModel = (ActivityPushMessageModel) oOo00OO0.OooO00o(info, ActivityPushMessageModel.class)) != null) {
                        long receiverId2 = activityPushMessageModel.getReceiverId();
                        Long l2 = (Long) o000000O.OooOOo0().getValue();
                        if (l2 != null && receiverId2 == l2.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity activityOooO0O0 = OooO0O0.OooO0O0();
                            if (!z || (activityOooO0O0 instanceof ActivitiesNoticeActivity) || activityOooO0O0 == null) {
                                return;
                            }
                            activityOooO0O0.startActivity(new Intent(activityOooO0O0, (Class<?>) ActivitiesNoticeActivity.class));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type == 1004) {
                    if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && (yallaTeamPushMessageModel = (YallaTeamPushMessageModel) oOo00OO0.OooO00o(info, YallaTeamPushMessageModel.class)) != null) {
                        long receiverId3 = yallaTeamPushMessageModel.getReceiverId();
                        Long l3 = (Long) o000000O.OooOOo0().getValue();
                        if (l3 != null && receiverId3 == l3.longValue()) {
                            LiveEventBus.get("New_Message_Firebase").post(bool);
                            Activity activityOooO0O1 = OooO0O0.OooO0O0();
                            if (!z || (activityOooO0O1 instanceof YallaTeamMessageActivity) || activityOooO0O1 == null) {
                                return;
                            }
                            activityOooO0O1.startActivity(new Intent(activityOooO0O1, (Class<?>) YallaTeamMessageActivity.class));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (type != 1005) {
                    if (type == 1006 && Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && (eventPushModel = (EventPushModel) oOo00OO0.OooO00o(info, EventPushModel.class)) != null) {
                        long receiverId4 = eventPushModel.getReceiverId();
                        Long l4 = (Long) o000000O.OooOOo0().getValue();
                        if (l4 != null && receiverId4 == l4.longValue() && z) {
                            RoomModel roomModel = new RoomModel();
                            roomModel.setId(eventPushModel.getRoomId());
                            MutableState mutableState = o0OOO0o.f45698OooO00o;
                            o0OOO0o.OooO0o(roomModel, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && (roomMemberConvenePushModel = (RoomMemberConvenePushModel) oOo00OO0.OooO00o(info, RoomMemberConvenePushModel.class)) != null) {
                    long receiverId5 = roomMemberConvenePushModel.getReceiverId();
                    Long l5 = (Long) o000000O.OooOOo0().getValue();
                    if (l5 != null && receiverId5 == l5.longValue()) {
                        Activity activityOooO0O2 = OooO0O0.OooO0O0();
                        if (!z || (activityOooO0O2 instanceof MixedRoomActivity) || activityOooO0O2 == null) {
                            return;
                        }
                        RoomModel roomModel2 = new RoomModel();
                        roomModel2.setId(roomMemberConvenePushModel.getRoomId());
                        MutableState mutableState2 = o0OOO0o.f45698OooO00o;
                        o0OOO0o.OooO0o(roomModel2, null);
                    }
                }
            }
        }
    }
}
