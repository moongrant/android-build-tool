package p483o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooO0O0;
import p153o00Oo0oO.o00000O0;
import p157o00OoO00.OooOOO0;
import p252o00ooO0.o000000O;
import p485o0o000Oo.oo000o;
import p610o0oo0OO.o000;
import p613o0oo0OOo.oOo000o0;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends o000000O {
    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO00o.OooO0OO(7000L, timeUnit);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f32360OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sslParams.sSLSocketFactory");
        X509TrustManager x509TrustManager = OooO00o2.f32361OooO0O0;
        Intrinsics.checkNotNullExpressionValue(x509TrustManager, "sslParams.trustManager");
        oooO00o.OooO0oo(sSLSocketFactory, x509TrustManager);
        oooO00o.OooO0oO(7000L, timeUnit);
        p485o0o000Oo.o0OoOo0 o0oooo1 = new p485o0o000Oo.o0OoOo0();
        Intrinsics.checkNotNullParameter("WebApi - OkHttpUtil", o000O0O0.OooO00o(-15164701384208L));
        o0oooo1.f40901OooO0OO = "WebApi - OkHttpUtil";
        OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
        oooO0O0.OooO0OO(oooO00o);
        oooO00o.OooO00o(o0oooo1);
        oooO00o.OooO00o(new oo000o());
        oooO0O0.OooO0O0(oooO00o);
        o00OO o00oo2 = new o00OO(oooO00o);
        o00000O0.OooO0O0().f32199OooO00o = o00oo2;
        oOo000o0 ooo000o0 = (oOo000o0) o000.OooO00o();
        Objects.requireNonNull(ooo000o0);
        ooo000o0.f48376OooO00o = o00oo2;
    }
}
