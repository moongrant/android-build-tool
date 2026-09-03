package p479o0o000OO;

import com.common.support.longlink.LongLink;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 implements LongLink.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f47683OooO00o;

    public o0OoOo0(o000oOoO o000oooo2) {
        this.f47683OooO00o = o000oooo2;
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onClosed(int i) {
        LongLink.ConnectionCallback.DefaultImpls.onClosed(this, i);
        o000oOoO o000oooo2 = this.f47683OooO00o;
        OooOOO0.OooO0OO(o000oooo2.f47660OooO0O0, "onClosed code = " + i);
        OooOo00 oooOo00 = o000oooo2.f47665OooO0oO;
        if (oooOo00 != null) {
            oooOo00.OooO0OO();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnected() {
        LongLink.ConnectionCallback.DefaultImpls.onConnected(this);
        o000oOoO o000oooo2 = this.f47683OooO00o;
        OooOOO0.OooO0OO(o000oooo2.f47660OooO0O0, "onConnected");
        OooOo00 oooOo00 = o000oooo2.f47665OooO0oO;
        if (oooOo00 != null) {
            oooOo00.OooO0O0();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnecting() {
        LongLink.ConnectionCallback.DefaultImpls.onConnecting(this);
        o000oOoO o000oooo2 = this.f47683OooO00o;
        OooOOO0.OooO0OO(o000oooo2.f47660OooO0O0, "onConnecting");
        OooOo00 oooOo00 = o000oooo2.f47665OooO0oO;
        if (oooOo00 != null) {
            oooOo00.OooO00o();
        }
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnectionFailed(@NotNull Throwable throwable, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onConnectionFailed(this, throwable, i, message);
        OooOOO0.OooO0OO(this.f47683OooO00o.f47660OooO0O0, "onConnectionFailed code = " + i + ", message = " + message + ", throwable = " + throwable.getMessage());
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onDisconnected(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onDisconnected(this, i, message);
        OooOOO0.OooO0OO(this.f47683OooO00o.f47660OooO0O0, "onDisconnected code = " + i + " message = " + message);
    }
}
