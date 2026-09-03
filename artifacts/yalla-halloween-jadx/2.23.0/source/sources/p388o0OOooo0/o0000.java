package p388o0OOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.otlp.biz.OtlpInterceptor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
import p145o00Oo0O.o000oOoO;
import p377o0OOoOo.o0000O0O;
import p420o0OoO0OO.o000000;
import p420o0OoO0OO.o0Oo0oo;
import p424o0OoO0oO.o0000O0;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000 extends o000oOoO {
    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        o0Oo0oo.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO00o.OooO0OO(7000L, timeUnit);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f45553OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sslParams.sSLSocketFactory");
        X509TrustManager x509TrustManager = OooO00o2.f45554OooO0O0;
        Intrinsics.checkNotNullExpressionValue(x509TrustManager, "sslParams.trustManager");
        oooO00o.OooO0o0(sSLSocketFactory, x509TrustManager);
        oooO00o.OooO0Oo(7000L, timeUnit);
        o0000O0 o0000o1 = new o0000O0();
        Intrinsics.checkNotNullParameter("WebApi - OkHttpUtil", ViewHierarchyConstants.TAG_KEY);
        o0000o1.f45574OooO0OO = "WebApi - OkHttpUtil";
        Lazy lazy = o0000O0O.f44197OooO00o;
        o0000O0O.OooO0OO(oooO00o);
        oooO00o.OooO00o(o0000o1);
        oooO00o.OooO00o(new OtlpInterceptor());
        oooO00o.OooO00o(new HttpLoggingInterceptor(0));
        o0000O0O.OooO0O0(oooO00o);
        o000000.OooO0O0().f45542OooO00o = new o00OOOO0(oooO00o);
    }
}
