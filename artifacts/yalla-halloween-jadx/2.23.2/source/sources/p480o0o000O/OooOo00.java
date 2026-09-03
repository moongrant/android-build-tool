package p480o0o000O;

import com.common.support.longlink.LongLink;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMConnectState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 implements LongLink.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f48403OooO00o;

    public OooOo00(OooOOOO oooOOOO) {
        this.f48403OooO00o = oooOOOO;
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onClosed(int i) {
        LongLink.ConnectionCallback.DefaultImpls.onClosed(this, i);
        OooOOOO oooOOOO = this.f48403OooO00o;
        o0000O00.OooO0OO(oooOOOO.f48396OooO0OO, "onClosed longLink = " + oooOOOO.f48397OooO0Oo + " code = " + i);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnected() {
        LongLink.ConnectionCallback.DefaultImpls.onConnected(this);
        OooOOOO oooOOOO = this.f48403OooO00o;
        o0000O00.OooO0OO(oooOOOO.f48396OooO0OO, "onConnected longLink = " + oooOOOO.f48397OooO0Oo);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectSuccess);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnecting() {
        OooOOOO oooOOOO = this.f48403OooO00o;
        o0000O00.OooO0OO(oooOOOO.f48396OooO0OO, "onConnecting longLink = " + oooOOOO.f48397OooO0Oo);
        LongLink.ConnectionCallback.DefaultImpls.onConnecting(this);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.Connecting);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onConnectionFailed(@NotNull Throwable throwable, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onConnectionFailed(this, throwable, i, message);
        OooOOOO oooOOOO = this.f48403OooO00o;
        o0000O00.OooO0OO(oooOOOO.f48396OooO0OO, "onConnectionFailed longLink = " + oooOOOO.f48397OooO0Oo + " throwable = " + throwable.getMessage() + " code = " + i + " message = " + message);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }

    @Override // com.common.support.longlink.LongLink.ConnectionCallback
    public final void onDisconnected(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LongLink.ConnectionCallback.DefaultImpls.onDisconnected(this, i, message);
        OooOOOO oooOOOO = this.f48403OooO00o;
        o0000O00.OooO0OO(oooOOOO.f48396OooO0OO, "onDisconnected longLink = " + oooOOOO.f48397OooO0Oo + " code = " + i + " message = " + message);
        SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
    }
}
