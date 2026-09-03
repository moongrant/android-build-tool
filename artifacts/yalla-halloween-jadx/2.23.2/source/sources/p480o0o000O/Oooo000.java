package p480o0o000O;

import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p373o0OOoO.OooO0o;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ IMSocketManagerOld f48407OooO00o;

    public Oooo000(IMSocketManagerOld iMSocketManagerOld) {
        this.f48407OooO00o = iMSocketManagerOld;
    }

    @Override // p373o0OOoO.OooO0o
    public final void OooO00o(@NotNull byte[] rawMsg) {
        Intrinsics.checkNotNullParameter(rawMsg, "msg");
        Intrinsics.checkNotNullParameter(rawMsg, "rawMsg");
        int i = rawMsg[0] & UByte.MAX_VALUE;
        IMSocketManagerOld iMSocketManagerOld = this.f48407OooO00o;
        if (i != 100) {
            iMSocketManagerOld.f24488OooO0O0.OooO00o(rawMsg);
        } else {
            o0000O00.OooO0O0("SocketManager handle : 100");
            iMSocketManagerOld.OooO();
        }
    }
}
