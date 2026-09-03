package p528o0o0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.db.table.SimpleMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import org.jetbrains.annotations.NotNull;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 extends OooOo {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("ActivityMsgProcessor", "message = " + msg);
        MessageIM.Message2102 from = MessageIM.Message2102.parseFrom(msg.getBody());
        SimpleMessage message = new SimpleMessage();
        OooOOO oooOOO = OooOOO.f41235OooO00o;
        message.setUid(((Number) OooO00o.OooO00o(oooOOO)).longValue());
        message.setType(1);
        message.setTime(msg.getTime());
        SimpleMessage.ActivityMessage activityMessage = new SimpleMessage.ActivityMessage();
        SimpleMessage simpleMessageOooO0OO = OooO0OO.OooO00o().Oooo00O().OooO0OO(((Number) OooO00o.OooO00o(oooOOO)).longValue());
        SimpleMessage.ActivityMessage activityMessage2 = simpleMessageOooO0OO != null ? simpleMessageOooO0OO.getActivityMessage() : null;
        activityMessage.setActivityNum((activityMessage2 != null ? activityMessage2.getActivityNum() : 0) + 1);
        String msg2 = from.getMsg();
        Intrinsics.checkNotNullExpressionValue(msg2, "message.msg");
        activityMessage.setContent(msg2);
        message.setActivityMessage(activityMessage);
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0OO.OooO00o().Oooo00O().OooO0oo(message);
        LiveEventBus.get("New_Message_Activity").post(Boolean.TRUE);
    }
}
