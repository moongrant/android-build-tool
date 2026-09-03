package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o000000;
import com.yalla.yalla.data.db.table.Friend;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OOo.o0O00;
import p403o0Oo0OOo.o0O0O0o0;
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 extends OooOO0O {
    public final void OooO0O0(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("FriendRequestMsgProcessor", "message = " + msg);
        switch (msg.getHead()) {
            case 2111:
                String mid = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid, "msg.mid");
                Intrinsics.checkNotNullParameter(mid, "mid");
                o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (!(o0o0o0o0OooOOoo.OooO0oo(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), mid) != null)) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooO(MessageIM.Message2111.parseFrom(msg.getBody()), msg, this, null), 2, null);
                    return;
                }
                break;
            case 2112:
                MessageIM.Message2112 from = MessageIM.Message2112.parseFrom(msg.getBody());
                if (!o000000.OooO00o(Integer.valueOf(from.getResult()))) {
                    long fromId = from.getFromId();
                    o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    o0o00OooOOo.OooOOOO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), fromId);
                } else {
                    Friend friend = new Friend();
                    o000000O o000000o4 = o000000O.f46674OooO00o;
                    friend.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                    friend.setFriendId(msg.getFromId());
                    friend.setTime(msg.getTime());
                    o000OOo.OooO00o().OooOOoo().OooOO0O(1, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), friend.getFriendId());
                    oOO0O0O.OooO0o(friend);
                    BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooO0o(from, null), 3, null).start();
                }
                break;
            case 2113:
                long fromId2 = MessageIM.Message2113.parseFrom(msg.getBody()).getFromId();
                o0O00 o0o00OooOOo2 = o000OOo.OooO00o().OooOOo();
                o000000O o000000o5 = o000000O.f46674OooO00o;
                o0o00OooOOo2.OooOOOO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), fromId2);
                break;
        }
    }
}
