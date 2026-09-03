package p481o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.table.SimpleMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p410o0Oo0Oo0.o00O0O;
import p474o0OoooOO.oo0oO0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O extends o000O00 {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        OooOOOO.OooO0OO("ActivityMsgProcessor", "message = " + msg);
        MessageIM.Message2102 from = MessageIM.Message2102.parseFrom(msg.getBody());
        SimpleMessage message = new SimpleMessage();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        message.setUid(((Number) OooO00o.OooO00o()).longValue());
        message.setType(1);
        message.setTime(msg.getTime());
        SimpleMessage.ActivityMessage activityMessage = new SimpleMessage.ActivityMessage();
        SimpleMessage simpleMessageOooO0OO = o00O0O.OooO00o().Oooo000().OooO0OO(((Number) OooO00o.OooO00o()).longValue());
        SimpleMessage.ActivityMessage activityMessage2 = simpleMessageOooO0OO != null ? simpleMessageOooO0OO.getActivityMessage() : null;
        activityMessage.setActivityNum((activityMessage2 != null ? activityMessage2.getActivityNum() : 0) + 1);
        String msg2 = from.getMsg();
        Intrinsics.checkNotNullExpressionValue(msg2, "getMsg(...)");
        activityMessage.setContent(msg2);
        message.setActivityMessage(activityMessage);
        Intrinsics.checkNotNullParameter(message, "message");
        o00O0O.OooO00o().Oooo000().OooO0O0(message);
        LiveEventBus.get("New_Message_Activity").post(Boolean.TRUE);
    }
}
