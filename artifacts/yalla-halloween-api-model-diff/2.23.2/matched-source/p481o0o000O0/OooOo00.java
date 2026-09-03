package p481o0o000O0;

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
import p407o0Oo0Oo.o00;
import p407o0Oo0Oo.o000;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends OooOo {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        o0000O00.OooO0OO("FriendRequestMsgProcessor", "message = " + msg);
        switch (msg.getHead()) {
            case 2111:
                String mid = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
                Intrinsics.checkNotNullParameter(mid, "mid");
                o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (!(o00VarOooOo00.OooO0oo(((Number) OooO00o.OooO00o()).longValue(), mid) != null)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooOOOO(MessageIM.Message2111.parseFrom(msg.getBody()), msg, this, null), 2, null);
                    return;
                }
                break;
            case 2112:
                MessageIM.Message2112 from = MessageIM.Message2112.parseFrom(msg.getBody());
                if (!o000000.OooO00o(Integer.valueOf(from.getResult()))) {
                    long fromId = from.getFromId();
                    o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    o000VarOooOOoo.OooOOOO(((Number) OooO00o.OooO00o()).longValue(), fromId);
                } else {
                    Friend friend = new Friend();
                    o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                    friend.setUid(((Number) OooO00o.OooO00o()).longValue());
                    friend.setFriendId(msg.getFromId());
                    friend.setTime(msg.getTime());
                    o00Oo0.OooO00o().OooOo00().OooOO0O(1, ((Number) OooO00o.OooO00o()).longValue(), friend.getFriendId());
                    o000O000.OooO0o(friend);
                    BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooOOO(from, null), 3, null).start();
                }
                break;
            case 2113:
                long fromId2 = MessageIM.Message2113.parseFrom(msg.getBody()).getFromId();
                o000 o000VarOooOOoo2 = o00Oo0.OooO00o().OooOOoo();
                o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                o000VarOooOOoo2.OooOOOO(((Number) OooO00o.OooO00o()).longValue(), fromId2);
                break;
        }
    }
}
