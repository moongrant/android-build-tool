package p479o0o000OO;

import com.code.android.util.o000O0;
import com.common.support.longlink.LongLink;
import com.common.support.networkstate.NetworkStateUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements LongLink.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo f47657OooO00o;

    public Oooo000(OooOo oooOo) {
        this.f47657OooO00o = oooOo;
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onClosed(int i) {
        LongLink.ConnectionCallback.DefaultImpls.onClosed(this, i);
        OooOo oooOo = this.f47657OooO00o;
        OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "onClosed code = " + i);
        OooOo00 oooOo00 = oooOo.f47642OooO0o;
        if (oooOo00 != null) {
            oooOo00.OooO0OO();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnected() {
        LongLink.ConnectionCallback.DefaultImpls.onConnected(this);
        OooOo oooOo = this.f47657OooO00o;
        OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "onConnected");
        OooOo00 oooOo00 = oooOo.f47642OooO0o;
        if (oooOo00 != null) {
            oooOo00.OooO0O0();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnecting() {
        LongLink.ConnectionCallback.DefaultImpls.onConnecting(this);
        OooOo oooOo = this.f47657OooO00o;
        OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "onConnecting");
        OooOo00 oooOo00 = oooOo.f47642OooO0o;
        if (oooOo00 != null) {
            oooOo00.OooO00o();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnectionFailed(@NotNull Throwable throwable, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onConnectionFailed(this, throwable, i, message);
        OooOo oooOo = this.f47657OooO00o;
        OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "onConnectionFailed code = " + i + ", message = " + message + ", throwable = " + throwable.getMessage());
        if (NetworkStateUtil.INSTANCE.isConnected(o000O0.OooO00o())) {
            return;
        }
        OooOo00 oooOo00 = oooOo.f47642OooO0o;
        if (oooOo00 != null) {
            oooOo00.OooO0OO();
        }
        oooOo.disconnect();
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onDisconnected(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onDisconnected(this, i, message);
        OooOOO0.OooO0OO(this.f47657OooO00o.f47639OooO0O0, "onDisconnected code = " + i + " message = " + message);
    }
}
