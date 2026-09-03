package p396o0Oo00o0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.otlp.biz.OtlpInterceptor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import o0OoO.OooOO0O;
import okhttp3.logging.HttpLoggingInterceptor;
import p191o00o0O0.o00Oo0;
import p384o0OOoo0O.OooOo;
import p424o0OoO0Oo.o00OO00O;
import p424o0OoO0Oo.o00OOO00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends o00Oo0 {
    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        o00OO00O.OooO00o OooO00o2 = o00OO00O.OooO00o();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oooO00o.OooO0O0(7000L, timeUnit);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f46729OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sSLSocketFactory");
        X509TrustManager trustManager = OooO00o2.f46730OooO0O0;
        Intrinsics.checkNotNullExpressionValue(trustManager, "trustManager");
        oooO00o.OooO0Oo(sSLSocketFactory, trustManager);
        oooO00o.OooO0OO(7000L, timeUnit);
        OooOO0O oooOO0O = new OooOO0O();
        Intrinsics.checkNotNullParameter("WebApi - OkHttpUtil", ViewHierarchyConstants.TAG_KEY);
        oooOO0O.f46610OooO0OO = "WebApi - OkHttpUtil";
        Lazy lazy = OooOo.f43318OooO00o;
        OooOo.OooO0OO(oooO00o);
        oooO00o.OooO00o(oooOO0O);
        oooO00o.OooO00o(new OtlpInterceptor());
        oooO00o.OooO00o(new HttpLoggingInterceptor(0));
        OooOo.OooO0O0(oooO00o);
        o00OOO00.OooO0O0().f46736OooO00o = new o0OoO00O(oooO00o);
    }
}
