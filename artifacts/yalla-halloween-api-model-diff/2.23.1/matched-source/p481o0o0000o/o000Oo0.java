package p481o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o000000;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.table.Friend;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import p409o0Oo0Oo.o00;
import p409o0Oo0Oo.o000;
import p410o0Oo0Oo0.o00O0O;
import p414o0Oo0o0O.o000O00;
import p474o0OoooOO.oo0oO0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000Oo0 extends o000O00 {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        OooOOOO.OooO0OO("FriendRequestMsgProcessor", "message = " + msg);
        switch (msg.getHead()) {
            case 2111:
                String mid = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
                Intrinsics.checkNotNullParameter(mid, "mid");
                o00 o00VarOooOo00 = o00O0O.OooO00o().OooOo00();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (!(o00VarOooOo00.OooO0oo(((Number) OooO00o.OooO00o()).longValue(), mid) != null)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000O0o(MessageIM.Message2111.parseFrom(msg.getBody()), msg, this, null), 2, null);
                    return;
                }
                break;
            case 2112:
                MessageIM.Message2112 from = MessageIM.Message2112.parseFrom(msg.getBody());
                if (!o000000.OooO00o(Integer.valueOf(from.getResult()))) {
                    long fromId = from.getFromId();
                    o000 o000VarOooOOoo = o00O0O.OooO00o().OooOOoo();
                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                    o000VarOooOOoo.OooOOOO(((Number) OooO00o.OooO00o()).longValue(), fromId);
                } else {
                    Friend friend = new Friend();
                    oo0oO0 oo0oo2 = oo0oO0.f47967OooO00o;
                    friend.setUid(((Number) OooO00o.OooO00o()).longValue());
                    friend.setFriendId(msg.getFromId());
                    friend.setTime(msg.getTime());
                    o00O0O.OooO00o().OooOo00().OooOO0O(1, ((Number) OooO00o.OooO00o()).longValue(), friend.getFriendId());
                    o000O00.OooO0o(friend);
                    BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new o000O000(from, null), 3, null).start();
                }
                break;
            case 2113:
                long fromId2 = MessageIM.Message2113.parseFrom(msg.getBody()).getFromId();
                o000 o000VarOooOOoo2 = o00O0O.OooO00o().OooOOoo();
                oo0oO0 oo0oo3 = oo0oO0.f47967OooO00o;
                o000VarOooOOoo2.OooOOOO(((Number) OooO00o.OooO00o()).longValue(), fromId2);
                break;
        }
    }
}
