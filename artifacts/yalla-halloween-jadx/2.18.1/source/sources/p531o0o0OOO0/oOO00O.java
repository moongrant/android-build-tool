package p531o0o0OOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.MutableLiveData;
import com.common.support.longlink.pulse.PulseStrategy;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMConnectState;
import kotlin.jvm.internal.Intrinsics;
import o0O000O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p448o0OoOoOO.o0OO;
import p449o0OoOoOo.o;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p651o0ooOoOO.kj;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OOO00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oOO00O implements o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f43415OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO<Integer> f43416OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0O000O.OooO00o<Integer> f43417OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O00 f43418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f43419OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OO f43420OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f43421OooO0oO;

    public static final class OooO00o implements o0O000O.OooO00o.OooO0O0 {
        @Override // o0O000O.OooO00o.OooO0O0
        public final void OooO00o(int i) {
            Intrinsics.checkNotNullParameter(this, "this");
            o00O00.OooO0O0("SocketManager onClosed code = " + i);
            SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
        }

        @Override // o0O000O.OooO00o.OooO0O0
        public final void OooO0O0() {
            o00O00.OooO0O0("SocketManager onConnecting");
            Intrinsics.checkNotNullParameter(this, "this");
            SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.Connecting);
        }

        @Override // o0O000O.OooO00o.OooO0O0
        public final void OooO0OO(int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(this, "this");
            Intrinsics.checkNotNullParameter(message, "message");
            o00O00.OooO0O0("SocketManager onDisconnected code = " + i + " message = " + message);
            SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
        }

        @Override // o0O000O.OooO00o.OooO0O0
        public final void OooO0Oo() {
            Intrinsics.checkNotNullParameter(this, "this");
            o00O00.OooO0O0("SocketManager onConnected");
            SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectSuccess);
        }

        @Override // o0O000O.OooO00o.OooO0O0
        public final void OooO0o0(@NotNull Throwable throwable, int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(this, "this");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(message, "message");
            o00O00.OooO0O0("SocketManager onConnectionFailed code = " + i + " message = " + message);
            SharedMessageVM.INSTANCE.getConnectState().postValue(IMConnectState.ConnectLost);
        }
    }

    public static final class OooO0O0 implements o0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final PulseStrategy f43422OooO00o = PulseStrategy.CLIENT_PING_PONG;

        @Override // p448o0OoOoOO.o0OO
        public final long OooO00o() {
            return 45000L;
        }

        @Override // p448o0OoOoOO.o0OO
        public final long OooO0O0() {
            return 20000L;
        }

        @Override // p448o0OoOoOO.o0OO
        @NotNull
        public final PulseStrategy OooO0OO() {
            return this.f43422OooO00o;
        }

        @Override // p448o0OoOoOO.o0OO
        public final void OooO0Oo() {
        }
    }

    public oOO00O(@NotNull LifecycleService context, @NotNull OooO<Integer> messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f43415OooO00o = context;
        this.f43416OooO0O0 = messageHandler;
        new MutableLiveData();
        this.f43418OooO0Oo = new o00O00();
        this.f43420OooO0o0 = new o00OO(new o00OO.OooO00o());
        this.f43419OooO0o = new OooO0O0();
        this.f43421OooO0oO = new OooO00o();
    }

    @Override // p531o0o0OOO0.o00O0
    public final void OooO00o() {
    }

    @Override // p531o0o0OOO0.o00O0
    public final void OooO0o0() {
        o00O00.OooO0O0("SocketManager connect");
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        oooO00o.OooOO0o(o0ooOOo.f32245OooOoo0.get(0));
        oooO00o.OooO0o0("yalla-token", String.valueOf(OooOOO.f41216OooO00o.OooOo0O().getValue()));
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        oooO00o.OooO0o0("yalla-deviceID", o0Oo0oo.OooO00o());
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        oooO00o.OooO0o0("yalla-clientVer", String.valueOf(o0OOO0o.OooO00o()));
        o00OOO00 originalRequest = oooO00o.OooO0O0();
        LifecycleService context = this.f43415OooO00o;
        o00O00 protocol = this.f43418OooO0Oo;
        OooO<Integer> messageHandler = this.f43416OooO0O0;
        o00OO okHttpClient = this.f43420OooO0o0;
        OooO0O0 pulseAdapter = this.f43419OooO0o;
        o reconnectionConfig = new o();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        kj connectionFactory = new kj(okHttpClient, originalRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        o0O000O.OooO0O0 oooO0O0 = new o0O000O.OooO0O0(context, protocol, messageHandler, connectionFactory, reconnectionConfig, pulseAdapter);
        OooO00o callback = this.f43421OooO0oO;
        Intrinsics.checkNotNullParameter(callback, "callback");
        oooO0O0.f35070OooOO0o.add(callback);
        oooO0O0.open();
        o0O000O.OooO00o.C0355OooO00o.f35059OooO0O0 = !o0OOO0o.OooO0OO();
        this.f43417OooO0OO = oooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o0O000O.OooO00o<java.lang.Integer>, o0O000O.OooO0O0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o0O000O.OooO00o<java.lang.Integer>, o0O000O.OooO0O0] */
    @Override // p531o0o0OOO0.o00O0
    public final void disconnect() {
        o00O00.OooO0O0("SocketManager disconnect");
        ?? r0 = this.f43417OooO0OO;
        if (r0 != 0) {
            r0.OooO0Oo(this.f43421OooO0oO);
        }
        ?? r1 = this.f43417OooO0OO;
        if (r1 != 0) {
            r1.OooO00o(1000);
        }
        this.f43417OooO0OO = null;
    }
}
