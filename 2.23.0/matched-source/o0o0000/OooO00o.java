package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.SimpleMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o extends OooOO0O {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("ActivityMsgProcessor", "message = " + msg);
        MessageIM.Message2102 from = MessageIM.Message2102.parseFrom(msg.getBody());
        SimpleMessage message = new SimpleMessage();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        message.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        message.setType(1);
        message.setTime(msg.getTime());
        SimpleMessage.ActivityMessage activityMessage = new SimpleMessage.ActivityMessage();
        SimpleMessage simpleMessageOooO0OO = o000OOo.OooO00o().OooOooo().OooO0OO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        SimpleMessage.ActivityMessage activityMessage2 = simpleMessageOooO0OO != null ? simpleMessageOooO0OO.getActivityMessage() : null;
        activityMessage.setActivityNum((activityMessage2 != null ? activityMessage2.getActivityNum() : 0) + 1);
        String msg2 = from.getMsg();
        Intrinsics.checkNotNullExpressionValue(msg2, "message.msg");
        activityMessage.setContent(msg2);
        message.setActivityMessage(activityMessage);
        Intrinsics.checkNotNullParameter(message, "message");
        o000OOo.OooO00o().OooOooo().OooO0O0(message);
        LiveEventBus.get("New_Message_Activity").post(Boolean.TRUE);
    }
}
