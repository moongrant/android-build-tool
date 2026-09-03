package p542o0o0o00O;

import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p373o0OOoO0O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ IMSocketManagerOld f55806OooO00o;

    public o0ooOOo(IMSocketManagerOld iMSocketManagerOld) {
        this.f55806OooO00o = iMSocketManagerOld;
    }

    @Override // p373o0OOoO0O.OooOOO0
    public final void OooO00o(@NotNull byte[] rawMsg) {
        Intrinsics.checkNotNullParameter(rawMsg, "msg");
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        int i = rawMsg[0] & UByte.MAX_VALUE;
        IMSocketManagerOld iMSocketManagerOld = this.f55806OooO00o;
        if (i != 100) {
            iMSocketManagerOld.f24950OooO0O0.OooO00o(rawMsg);
        } else {
            p592o0oo00O.OooOOO0.OooO0O0("SocketManager handle : 100");
            iMSocketManagerOld.OooO();
        }
    }
}
