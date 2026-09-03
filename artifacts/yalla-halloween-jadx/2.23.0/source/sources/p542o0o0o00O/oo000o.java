package p542o0o0o00O;

import com.common.support.longlink.LongLink;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMConnectState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o implements LongLink.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f55807OooO00o;

    public oo000o(o00Ooo o00ooo2) {
        this.f55807OooO00o = o00ooo2;
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onClosed(int i) {
        LongLink.ConnectionCallback.DefaultImpls.onClosed(this, i);
        o00Ooo o00ooo2 = this.f55807OooO00o;
        OooOOO0.OooO0OO(o00ooo2.f55787OooO0OO, "onClosed longLink = " + o00ooo2.f55788OooO0Oo + " code = " + i);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnected() {
        LongLink.ConnectionCallback.DefaultImpls.onConnected(this);
        o00Ooo o00ooo2 = this.f55807OooO00o;
        OooOOO0.OooO0OO(o00ooo2.f55787OooO0OO, "onConnected longLink = " + o00ooo2.f55788OooO0Oo);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectSuccess);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnecting() {
        o00Ooo o00ooo2 = this.f55807OooO00o;
        OooOOO0.OooO0OO(o00ooo2.f55787OooO0OO, "onConnecting longLink = " + o00ooo2.f55788OooO0Oo);
        LongLink.ConnectionCallback.DefaultImpls.onConnecting(this);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.Connecting);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnectionFailed(@NotNull Throwable throwable, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onConnectionFailed(this, throwable, i, message);
        o00Ooo o00ooo2 = this.f55807OooO00o;
        OooOOO0.OooO0OO(o00ooo2.f55787OooO0OO, "onConnectionFailed longLink = " + o00ooo2.f55788OooO0Oo + " throwable = " + throwable.getMessage() + " code = " + i + " message = " + message);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onDisconnected(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onDisconnected(this, i, message);
        o00Ooo o00ooo2 = this.f55807OooO00o;
        OooOOO0.OooO0OO(o00ooo2.f55787OooO0OO, "onDisconnected longLink = " + o00ooo2.f55788OooO0Oo + " code = " + i + " message = " + message);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }
}
