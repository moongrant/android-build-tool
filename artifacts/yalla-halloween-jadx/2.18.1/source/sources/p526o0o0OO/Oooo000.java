package p526o0o0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO0OO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p601o0oo00Oo.o0OO0o00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends OooOo {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) throws InvalidProtocolBufferException {
        MessageIM.Message2141 from;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("IMNoticeMsgProcessor", "message = " + msg);
        long fromId = msg.getFromId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if ((value != null && fromId == value.longValue()) || OooO0OO.OooO00o(msg.getMid()) || msg.getHead() != 2141 || (from = MessageIM.Message2141.parseFrom(msg.getBody())) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(from, "parseFrom(body)");
        long roomId = from.getRoomId();
        String roomImage = from.getRoomImage();
        Intrinsics.checkNotNullExpressionValue(roomImage, "it.roomImage");
        String roomName = from.getRoomName();
        Intrinsics.checkNotNullExpressionValue(roomName, "it.roomName");
        LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD").post(new o0OO0o00(roomId, roomImage, roomName, from.getEndTime()));
    }
}
