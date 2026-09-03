package p480o0o000O;

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
import p384o0OOoo0O.Oooo0;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p424o0OoO0Oo.o00OO00O;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f48394OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MessageHandler<Integer> f48395OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f48396OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public LongLink<Integer> f48397OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0OoO00O f48398OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f48399OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOo f48400OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooOo00 f48401OooO0oo;

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

    public OooOOOO(@NotNull IMMessageService context, @NotNull o000oOoO messageHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f48394OooO00o = context;
        this.f48395OooO0O0 = messageHandler;
        this.f48396OooO0OO = "IMSocketManager";
        new MutableLiveData();
        this.f48399OooO0o0 = new OooOOO0();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        o00OO00O.OooO00o OooO00o2 = o00OO00O.OooO00o();
        SSLSocketFactory sSLSocketFactory = OooO00o2.f46729OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sSLSocketFactory");
        X509TrustManager trustManager = OooO00o2.f46730OooO0O0;
        Intrinsics.checkNotNullExpressionValue(trustManager, "trustManager");
        oooO00o.OooO0Oo(sSLSocketFactory, trustManager);
        this.f48398OooO0o = new o0OoO00O(oooO00o);
        this.f48400OooO0oO = new OooOo();
        o0000O00.OooO0OO("IMSocketManager", "init " + this + ", longLink = " + this.f48397OooO0Oo);
        this.f48401OooO0oo = new OooOo00(this);
    }

    @Override // p480o0o000O.o0OoOo0
    public final void OooO00o() {
        if (SharedMessageVM.INSTANCE.getConnectState().getValue() == IMConnectState.ConnectLost) {
            o0000O00.OooO0OO(this.f48396OooO0OO, "connectIfLost");
            OooO0OO();
        }
    }

    @Override // p480o0o000O.o0OoOo0
    public final void OooO0OO() {
        LongLink<Integer> longLink = this.f48397OooO0Oo;
        String str = this.f48396OooO0OO;
        if (longLink != null) {
            o0000O00.OooO0OO(str, "connect disconnect before connect longLink = " + longLink);
            disconnect();
        }
        SharedMessageVM.INSTANCE.getConnectState().setValue(IMConnectState.Connecting);
        o0000O00.OooO0OO(str, "connect longLink = " + this.f48397OooO0Oo);
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(Oooo0.f43360OooOoo0.get(0));
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oooO00o.OooO0Oo("yalla-token", String.valueOf(o0O00oO0.OooOOOo().getValue()));
        oooO00o.OooO0Oo("yalla-deviceID", o000000.OooO00o());
        oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(oo0o0Oo.OooO0OO()));
        o0O00O0o o0o00o0oOooO0O0 = oooO00o.OooO0O0();
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<Integer> longLinkCreateWebSocketLongLink = companion.createWebSocketLongLink(this.f48394OooO00o, this.f48399OooO0o0, this.f48395OooO0O0, this.f48398OooO0o, o0o00o0oOooO0O0, (128 & 32) != 0 ? new DefaultReconnectionConfig() : new OooO00o(), (128 & 64) != 0 ? new DefaultPulseAdapter() : this.f48400OooO0oO, (128 & 128) != 0 ? null : null);
        longLinkCreateWebSocketLongLink.addConnectionCallback(this.f48401OooO0oo);
        longLinkCreateWebSocketLongLink.open();
        companion.setLoggable(!oo0o0Oo.OooO0o0());
        this.f48397OooO0Oo = longLinkCreateWebSocketLongLink;
        o0000O00.OooO0OO(str, "connect longLink = " + longLinkCreateWebSocketLongLink);
    }

    @Override // p480o0o000O.o0OoOo0
    public final void disconnect() {
        o0000O00.OooO0OO(this.f48396OooO0OO, "disconnect longLink = " + this.f48397OooO0Oo);
        LongLink<Integer> longLink = this.f48397OooO0Oo;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f48401OooO0oo);
        }
        LongLink<Integer> longLink2 = this.f48397OooO0Oo;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f48397OooO0Oo = null;
    }
}
