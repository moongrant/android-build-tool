package p542o0o0o00O;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.MutableLiveData;
import com.common.support.longlink.LongLink;
import com.common.support.longlink.MessageHandler;
import com.common.support.longlink.connection.DefaultReconnectionConfig;
import com.common.support.longlink.connection.ReconnectionConfig;
import com.common.support.longlink.pulse.DefaultPulseAdapter;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.service.im.socket.IMConnectState;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p382o0OOoo0o.oo000o;
import p420o0OoO0OO.o0Oo0oo;
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo implements o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f55785OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MessageHandler<Integer> f55786OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f55787OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public LongLink<Integer> f55788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f55789OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O0O f55790OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00oO0o f55791OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final oo000o f55792OooO0oo;

    public static final class OooO00o implements ReconnectionConfig {
        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final void beforeReconnection(int i) {
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long getMaxReconnectionGap() {
            return 10000L;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final int getMaxReconnectionTimes() {
            return -1;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long reconnectionGap(int i) {
            return RangesKt.coerceAtMost(((long) i) * 2000, 10000L);
        }
    }

    public o00Ooo(@NotNull IMMessageService context, @NotNull o0Oo0oo messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f55785OooO00o = context;
        this.f55786OooO0O0 = messageHandler;
        this.f55787OooO0OO = "IMSocketManager";
        new MutableLiveData();
        this.f55790OooO0o0 = new o00O0O();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        o0Oo0oo.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        SSLSocketFactory sSLSocketFactory = OooO00o2.f45553OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "defaultSslFactory.sSLSocketFactory");
        X509TrustManager x509TrustManager = OooO00o2.f45554OooO0O0;
        Intrinsics.checkNotNullExpressionValue(x509TrustManager, "defaultSslFactory.trustManager");
        oooO00o.OooO0o0(sSLSocketFactory, x509TrustManager);
        this.f55789OooO0o = new o00OOOO0(oooO00o);
        this.f55791OooO0oO = new o00oO0o();
        OooOOO0.OooO0OO("IMSocketManager", "init " + this + ", longLink = " + this.f55788OooO0Oo);
        this.f55792OooO0oo = new oo000o(this);
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void OooO00o() {
        if (SharedMessageVM.INSTANCE.getConnectState().getValue() == IMConnectState.ConnectLost) {
            OooOOO0.OooO0OO(this.f55787OooO0OO, "connectIfLost");
            OooO0OO();
        }
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void OooO0OO() {
        LongLink<Integer> longLink = this.f55788OooO0Oo;
        String str = this.f55787OooO0OO;
        if (longLink != null) {
            OooOOO0.OooO0OO(str, "connect disconnect before connect longLink = " + longLink);
            disconnect();
        }
        SharedMessageVM.INSTANCE.getConnectState().setValue(IMConnectState.Connecting);
        OooOOO0.OooO0OO(str, "connect longLink = " + this.f55788OooO0Oo);
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(o0000O.f44101OooOoo0.get(0));
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oooO00o.OooO0Oo("yalla-token", String.valueOf(o000000O.OooOOOo().getValue()));
        oooO00o.OooO0Oo("yalla-deviceID", oo000o.OooO00o());
        oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(p382o0OOoo0o.o00Ooo.OooO0OO()));
        o00OOOOo o00oooooOooO0O0 = oooO00o.OooO0O0();
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<Integer> longLinkCreateWebSocketLongLink = companion.createWebSocketLongLink(this.f55785OooO00o, this.f55790OooO0o0, this.f55786OooO0O0, this.f55789OooO0o, o00oooooOooO0O0, (128 & 32) != 0 ? new DefaultReconnectionConfig() : new OooO00o(), (128 & 64) != 0 ? new DefaultPulseAdapter() : this.f55791OooO0oO, (128 & 128) != 0 ? null : null);
        longLinkCreateWebSocketLongLink.addConnectionCallback(this.f55792OooO0oo);
        longLinkCreateWebSocketLongLink.open();
        companion.setLoggable(!p382o0OOoo0o.o00Ooo.OooO0o0());
        this.f55788OooO0Oo = longLinkCreateWebSocketLongLink;
        OooOOO0.OooO0OO(str, "connect longLink = " + longLinkCreateWebSocketLongLink);
    }

    @Override // p542o0o0o00O.o0OO00O
    public final void disconnect() {
        OooOOO0.OooO0OO(this.f55787OooO0OO, "disconnect longLink = " + this.f55788OooO0Oo);
        LongLink<Integer> longLink = this.f55788OooO0Oo;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f55792OooO0oo);
        }
        LongLink<Integer> longLink2 = this.f55788OooO0Oo;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f55788OooO0Oo = null;
    }
}
