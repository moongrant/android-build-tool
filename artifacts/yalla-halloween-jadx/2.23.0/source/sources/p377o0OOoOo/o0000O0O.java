package p377o0OOoOo;

import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.common.support.apm.otlp.biz.OtlpInterceptor;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import p382o0OOoo0o.o00Ooo;
import p420o0OoO0OO.o0Oo0oo;
import p424o0OoO0oO.o00000O;
import p424o0OoO0oO.o00000OO;
import p424o0OoO0oO.o0000O;
import p424o0OoO0oO.o0000O0;
import p424o0OoO0oO.o0000Ooo;
import p424o0OoO0oO.o0000oo;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p635o0ooO0oo.o0O000o0;
import p665o0oooOo.oOo00OO0;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\ncom/yalla/yalla/api/old/ApiClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\ncom/yalla/yalla/api/old/ApiClient\n*L\n89#1:123,2\n111#1:125,2\n*E\n"})
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44197OooO00o = LazyKt.lazy(OooO00o.f44205OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44198OooO0O0 = LazyKt.lazy(OooO0OO.f44207OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44199OooO0OO = LazyKt.lazy(OooO0o.f44208OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f44200OooO0Oo = LazyKt.lazy(OooOO0.f44209OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44202OooO0o0 = LazyKt.lazy(OooO.f44204OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44201OooO0o = LazyKt.lazy(OooOO0O.f44210OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44203OooO0oO = LazyKt.lazy(OooO0O0.f44206OooO0Oo);

    public static final class OooO extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f44204OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://payv2.yalla.live", "https://payv2.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<o00OOOO0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44205OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOO0 invoke() {
            Lazy lazy = o0000O0O.f44197OooO00o;
            o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
            TimeUnit unit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            oooO00o.f57307OooOo0o = o0O000o0.OooO0O0(15L, unit);
            oooO00o.OooO0OO(5L, unit);
            oooO00o.OooO0Oo(8L, unit);
            oooO00o.OooO0o(8L, unit);
            if (!o00Ooo.OooO0o0()) {
                o0Oo0oo.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
                SSLSocketFactory sSLSocketFactory = OooO00o2.f45553OooO00o;
                Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "defaultSslFactory.sSLSocketFactory");
                X509TrustManager x509TrustManager = OooO00o2.f45554OooO0O0;
                Intrinsics.checkNotNullExpressionValue(x509TrustManager, "defaultSslFactory.trustManager");
                oooO00o.OooO0o0(sSLSocketFactory, x509TrustManager);
            }
            o0000O0O.OooO0OO(oooO00o);
            oooO00o.OooO00o(new p424o0OoO0oO.o0000O0O());
            oooO00o.OooO00o(new o0000oo());
            oooO00o.OooO00o(new o0000O0());
            oooO00o.OooO00o(new o00000O());
            oooO00o.OooO00o(new p424o0OoO0oO.o000OO());
            oooO00o.OooO00o(new o0000Ooo());
            oooO00o.OooO00o(new o0000O());
            oooO00o.OooO00o(new o00000OO());
            oooO00o.OooO00o(new OtlpInterceptor());
            oooO00o.OooO00o(new HttpLoggingInterceptor(0));
            o0000O0O.OooO0O0(oooO00o);
            return new o00OOOO0(oooO00o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f44206OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull("https://clog.yalla.live").get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f44207OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f44208OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://moment.yalla.live", "https://moment.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f44209OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://roomapi.yalla.live", "https://roomapi.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f44210OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            o000OO.OooO0O0 oooO0O0OooO00o = o0000O0O.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://search.yalla.live", "https://search.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final o000OO.OooO0O0 OooO00o() {
        o000OO.OooO0O0 oooO0O0 = new o000OO.OooO0O0();
        o00OOOO0 o00oooo1 = (o00OOOO0) f44197OooO00o.getValue();
        Objects.requireNonNull(o00oooo1, "client == null");
        oooO0O0.f61144OooO0O0 = o00oooo1;
        oooO0O0.OooO00o(oOo00OO0.OooO0OO(com.code.android.json.OooO00o.OooO00o()));
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "Builder()\n            .c…ry.create(JsonUtil.gson))");
        return oooO0O0;
    }

    public static void OooO0O0(@NotNull o00OOOO0.OooO00o builder) {
        Object objM4213constructorimpl;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (o00Ooo.OooO0o0()) {
            return;
        }
        boolean z = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{"com.yalla.android.netmonitor.MonitorInterceptor", "com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitWeakNetworkInterceptor"}).iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type okhttp3.Interceptor");
                builder.OooO00o((o00OOO00) objNewInstance);
            }
            objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM4216exceptionOrNullimpl = Result.m4216exceptionOrNullimpl(objM4213constructorimpl);
        if (thM4216exceptionOrNullimpl != null) {
            String string = thM4216exceptionOrNullimpl.toString();
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    public static void OooO0OO(@NotNull o00OOOO0.OooO00o builder) {
        Object objM4213constructorimpl;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (o00Ooo.OooO0o0()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf("com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitMockInterceptor").iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type okhttp3.Interceptor");
                builder.OooO00o((o00OOO00) objNewInstance);
            }
            objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM4216exceptionOrNullimpl = Result.m4216exceptionOrNullimpl(objM4213constructorimpl);
        if (thM4216exceptionOrNullimpl != null) {
            String string = thM4216exceptionOrNullimpl.toString();
            if (string == null || StringsKt.isBlank(string)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    @NotNull
    public static o000OO OooO0Oo() {
        Object value = f44198OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitMain>(...)");
        return (o000OO) value;
    }
}
