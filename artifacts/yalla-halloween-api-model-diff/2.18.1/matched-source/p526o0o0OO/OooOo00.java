package p526o0o0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.common.db.table.Friend;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends OooOo {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("FriendRequestMsgProcessor", "message = " + msg);
        switch (msg.getHead()) {
            case 2111:
                String mid = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid, "msg.mid");
                Intrinsics.checkNotNullParameter(mid, "mid");
                if (!(OooO0OO.OooO00o().OooOo0().OooO0oO(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), mid) != null)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooOOOO(MessageIM.Message2111.parseFrom(msg.getBody()), msg, this, null), 2, null);
                    break;
                }
                break;
            case 2112:
                MessageIM.Message2112 from = MessageIM.Message2112.parseFrom(msg.getBody());
                if (!(from.getResult() == 1)) {
                    OooO0OO.OooO00o().OooOo00().OooOOO(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), from.getFromId());
                } else {
                    Friend friend = new Friend();
                    OooOOO oooOOO = OooOOO.f41216OooO00o;
                    friend.setUid(((Number) OooO00o.OooO00o(oooOOO)).longValue());
                    friend.setFriendId(msg.getFromId());
                    friend.setTime(msg.getTime());
                    OooO0OO.OooO00o().OooOo0().OooO(((Number) OooO00o.OooO00o(oooOOO)).longValue(), friend.getFriendId(), 1);
                    o00O0O.f42677OooO00o.OooO0o(friend);
                    BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooOOO(from, null), 3, null).start();
                }
                break;
            case 2113:
                OooO0OO.OooO00o().OooOo00().OooOOO(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), MessageIM.Message2113.parseFrom(msg.getBody()).getFromId());
                break;
        }
    }
}
