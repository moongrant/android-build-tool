package p486o0o000oo;

import com.code.android.util.o000O00O;
import com.common.support.longlink.LongLink;
import com.common.support.networkstate.NetworkStateUtil;
import kotlin.jvm.internal.Intrinsics;
import oo0o0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 implements LongLink.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f48722OooO00o;

    public o00O00o0(o00O00OO o00o00oo2) {
        this.f48722OooO00o = o00o00oo2;
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onClosed(int i) {
        LongLink.ConnectionCallback.DefaultImpls.onClosed(this, i);
        o00O00OO o00o00oo2 = this.f48722OooO00o;
        o0000O00.OooO0OO(o00o00oo2.f48708OooO0O0, "onClosed code = " + i);
        oOO00O ooo00o = o00o00oo2.f48711OooO0o;
        if (ooo00o != null) {
            ooo00o.OooO0OO();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnected() {
        LongLink.ConnectionCallback.DefaultImpls.onConnected(this);
        o00O00OO o00o00oo2 = this.f48722OooO00o;
        o0000O00.OooO0OO(o00o00oo2.f48708OooO0O0, "onConnected");
        oOO00O ooo00o = o00o00oo2.f48711OooO0o;
        if (ooo00o != null) {
            ooo00o.OooO0O0();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnecting() {
        LongLink.ConnectionCallback.DefaultImpls.onConnecting(this);
        o00O00OO o00o00oo2 = this.f48722OooO00o;
        o0000O00.OooO0OO(o00o00oo2.f48708OooO0O0, "onConnecting");
        oOO00O ooo00o = o00o00oo2.f48711OooO0o;
        if (ooo00o != null) {
            ooo00o.OooO00o();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnectionFailed(@NotNull Throwable throwable, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onConnectionFailed(this, throwable, i, message);
        o00O00OO o00o00oo2 = this.f48722OooO00o;
        String str = o00o00oo2.f48708OooO0O0;
        String message2 = throwable.getMessage();
        StringBuilder sbOooO00o = OooO0O0.OooO00o("onConnectionFailed code = ", i, ", message = ", message, ", throwable = ");
        sbOooO00o.append(message2);
        o0000O00.OooO0OO(str, sbOooO00o.toString());
        if (NetworkStateUtil.INSTANCE.isConnected(o000O00O.OooO00o())) {
            return;
        }
        oOO00O ooo00o = o00o00oo2.f48711OooO0o;
        if (ooo00o != null) {
            ooo00o.OooO0OO();
        }
        o00o00oo2.disconnect();
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onDisconnected(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onDisconnected(this, i, message);
        o0000O00.OooO0OO(this.f48722OooO00o.f48708OooO0O0, "onDisconnected code = " + i + " message = " + message);
    }
}
