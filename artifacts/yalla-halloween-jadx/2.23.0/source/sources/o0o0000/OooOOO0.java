package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends OooOO0O {
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) throws InvalidProtocolBufferException {
        MessageIM.Message2141 from;
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("IMNoticeMsgProcessor", "message = " + msg);
        long fromId = msg.getFromId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if ((l != null && fromId == l.longValue()) || com.code.android.util.OooOo00.OooO00o(msg.getMid()) || msg.getHead() != 2141 || (from = MessageIM.Message2141.parseFrom(msg.getBody())) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(from, "parseFrom(body)");
        long roomId = from.getRoomId();
        String roomImage = from.getRoomImage();
        Intrinsics.checkNotNullExpressionValue(roomImage, "it.roomImage");
        String roomName = from.getRoomName();
        Intrinsics.checkNotNullExpressionValue(roomName, "it.roomName");
        LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD").post(new p557o0oOo.OooOo00(roomId, roomImage, roomName, from.getEndTime()));
    }
}
