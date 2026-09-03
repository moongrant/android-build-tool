package p481o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.OooOo00;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p475o0Ooooo0.o0O00oO0;
import p570o0oOoO.o00000OO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends OooOo {
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) throws InvalidProtocolBufferException {
        MessageIM.Message2141 from;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o0000O00.OooO0OO("IMNoticeMsgProcessor", "message = " + msg);
        long fromId = msg.getFromId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if ((l != null && fromId == l.longValue()) || OooOo00.OooO00o(msg.getMid()) || msg.getHead() != 2141 || (from = MessageIM.Message2141.parseFrom(msg.getBody())) == null) {
            return;
        }
        Intrinsics.checkNotNull(from);
        long roomId = from.getRoomId();
        String roomImage = from.getRoomImage();
        Intrinsics.checkNotNullExpressionValue(roomImage, "getRoomImage(...)");
        String roomName = from.getRoomName();
        Intrinsics.checkNotNullExpressionValue(roomName, "getRoomName(...)");
        LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD").post(new o00000OO(roomId, roomImage, roomName, from.getEndTime()));
    }
}
