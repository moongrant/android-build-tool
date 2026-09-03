package o0o0000;

import android.content.Context;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;
import p640o0ooO0oO.o000O0O0;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO00O;
import p688oO000OoO.o0oOO;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f40784OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40785OooO0O0 = LazyKt.lazy(OooO00o.f40793Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40786OooO0OO = LazyKt.lazy(OooO0o.f40796Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40787OooO0Oo = LazyKt.lazy(OooO.f40792Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40789OooO0o0 = LazyKt.lazy(OooOO0O.f40798Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f40788OooO0o = LazyKt.lazy(C0388OooO0O0.f40794Oooo0o);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40790OooO0oO = LazyKt.lazy(OooOO0.f40797Oooo0o);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40791OooO0oo = LazyKt.lazy(OooOOO0.f40799Oooo0o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40783OooO = LazyKt.lazy(OooO0OO.f40795Oooo0o);

    public static final class OooO extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f40792Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://moment.yalla.live", "https://moment.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<o00OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40793Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x015f  */
        @Override // kotlin.jvm.functions.Function0
        public final o00OO invoke() throws IOException {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o00OO.OooO00o oooO00o = new o00OO.OooO00o();
            TimeUnit unit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            oooO00o.f51368OooOo = o00OOO00.OooO0O0(15L, unit);
            oooO00o.OooO0OO(5L, unit);
            oooO00o.OooO0oO(8L, unit);
            oooO00o.OooO(8L);
            Context context = o0000O.f2657OooO00o;
            Pair pair = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.cacert);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, o000O0O0.OooO00o(-3035713740304L));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamOpenRawResource);
            try {
                List<o0oOO> listOooO00o = new oo000o(new InputStreamReader(inputStreamOpenRawResource)).OooO00o();
                CertificateFactory certificateFactory = CertificateFactory.getInstance(o000O0O0.OooO00o(-3254757072400L));
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                char[] charArray = o000O0O0.OooO00o(-3280526876176L).toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, o000O0O0.OooO00o(-3306296679952L));
                keyStore.load(null, charArray);
                int i = 0;
                for (Object obj : (ArrayList) listOooO00o) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    keyStore.setCertificateEntry(o000O0O0.OooO00o(-3478095371792L) + i, certificateFactory.generateCertificate(new ByteArrayInputStream(((o0oOO) obj).f52686OooO0OO)));
                    i = i2;
                }
                KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()).init(keyStore, charArray);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                SSLContext sSLContext = SSLContext.getInstance(o000O0O0.OooO00o(-3495275240976L));
                sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
                Pair pair2 = new Pair(sSLContext.getSocketFactory(), trustManagerFactory.getTrustManagers());
                bufferedInputStream.close();
                pair = pair2;
            } catch (Throwable th) {
                try {
                    o00O00.OooO0o(o000O0O0.OooO00o(-3512455110160L), o000O0O0.OooO00o(-3551109815824L), th);
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    bufferedInputStream.close();
                    throw th2;
                }
            }
            if (!p487o0o000oO.o0OOO0o.OooO0OO() || pair == null) {
                o00OoO00.OooOOO0.OooO00o OooO00o2 = p157o00OoO00.OooOOO0.OooO00o();
                SSLSocketFactory sSLSocketFactory = OooO00o2.f32360OooO00o;
                Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, o000O0O0.OooO00o(-1270482181648L));
                X509TrustManager x509TrustManager = OooO00o2.f32361OooO0O0;
                Intrinsics.checkNotNullExpressionValue(x509TrustManager, o000O0O0.OooO00o(-1420806037008L));
                oooO00o.OooO0oo(sSLSocketFactory, x509TrustManager);
            } else {
                Object[] objArr = (Object[]) pair.getSecond();
                boolean z = true;
                if (objArr != null) {
                    if (!(objArr.length == 0)) {
                        z = false;
                    }
                }
                if (z) {
                    o00OoO00.OooOOO0.OooO00o OooO00o3 = p157o00OoO00.OooOOO0.OooO00o();
                    SSLSocketFactory sSLSocketFactory2 = OooO00o3.f32360OooO00o;
                    Intrinsics.checkNotNullExpressionValue(sSLSocketFactory2, o000O0O0.OooO00o(-1270482181648L));
                    X509TrustManager x509TrustManager2 = OooO00o3.f32361OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(x509TrustManager2, o000O0O0.OooO00o(-1420806037008L));
                    oooO00o.OooO0oo(sSLSocketFactory2, x509TrustManager2);
                } else {
                    SSLSocketFactory sSLSocketFactory3 = (SSLSocketFactory) pair.getFirst();
                    TrustManager trustManager = ((TrustManager[]) pair.getSecond())[0];
                    Intrinsics.checkNotNull(trustManager, o000O0O0.OooO00o(-978424405520L));
                    oooO00o.OooO0oo(sSLSocketFactory3, (X509TrustManager) trustManager);
                }
            }
            OooO0O0 oooO0O1 = OooO0O0.f40784OooO00o;
            oooO0O1.OooO0OO(oooO00o);
            oooO00o.OooO00o(new p485o0o000Oo.o00O0O());
            oooO00o.OooO00o(new p485o0o000Oo.o000oOoO());
            oooO00o.OooO00o(new p485o0o000Oo.o0OoOo0());
            oooO00o.OooO00o(new p485o0o000Oo.OooOo00());
            oooO00o.OooO00o(new p485o0o000Oo.o00Oo0());
            oooO00o.OooO00o(new p485o0o000Oo.Oooo000());
            oooO00o.OooO00o(new p485o0o000Oo.o00Ooo());
            oooO00o.OooO00o(new p485o0o000Oo.oo000o());
            oooO00o.OooO00o(new p485o0o000Oo.OooOo());
            oooO0O1.OooO0O0(oooO00o);
            return new o00OO(oooO00o);
        }
    }

    /* JADX INFO: renamed from: o0o0000.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0388OooO0O0 extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0388OooO0O0 f40794Oooo0o = new C0388OooO0O0();

        public C0388OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://event.yalla.live", "https://event.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f40795Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull("https://clog.yalla.live").get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f40796Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f40797Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://payv2.yalla.live", "https://payv2.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f40798Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://roomapi.yalla.live", "https://roomapi.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f40799Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            OooO0O0 oooO0O0 = OooO0O0.f40784OooO00o;
            o0O0O00.OooO0O0 oooO0O0OooO00o = OooO0O0.OooO00o();
            oooO0O0OooO00o.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://search.yalla.live", "https://search.ylapi.cc"}).get(0));
            return oooO0O0OooO00o.OooO0OO();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final o0O0O00.OooO0O0 OooO00o() {
        o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
        oooO0O0.OooO0Oo((o00OO) f40785OooO0O0.getValue());
        p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
        oooO0O0.f53808OooO0Oo.add(p693oO000oO.OooO.OooO0Oo(p516o0o0O000.o0OOO0o.OooO00o()));
        Intrinsics.checkNotNullExpressionValue(oooO0O0, o000O0O0.OooO00o(-759381073424L));
        return oooO0O0;
    }

    public final void OooO0O0(@NotNull o00OO.OooO00o oooO00o) {
        Object objM502constructorimpl;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-2176720281104L));
        if (p487o0o000oO.o0OOO0o.OooO0OO()) {
            return;
        }
        boolean z = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{o000O0O0.OooO00o(-2211080019472L), o000O0O0.OooO00o(-2417238449680L)}).iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, o000O0O0.OooO00o(-2790900604432L));
                oooO00o.OooO00o((o00OO00O) objNewInstance);
            }
            objM502constructorimpl = Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM502constructorimpl = Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM505exceptionOrNullimpl = Result.m505exceptionOrNullimpl(objM502constructorimpl);
        if (thM505exceptionOrNullimpl != null) {
            String string = thM505exceptionOrNullimpl.toString();
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    public final void OooO0OO(@NotNull o00OO.OooO00o oooO00o) {
        Object objM502constructorimpl;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-1553950023184L));
        if (p487o0o000oO.o0OOO0o.OooO0OO()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf(o000O0O0.OooO00o(-1588309761552L)).iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, o000O0O0.OooO00o(-1931907145232L));
                oooO00o.OooO00o((o00OO00O) objNewInstance);
            }
            objM502constructorimpl = Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM502constructorimpl = Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM505exceptionOrNullimpl = Result.m505exceptionOrNullimpl(objM502constructorimpl);
        if (thM505exceptionOrNullimpl != null) {
            String string = thM505exceptionOrNullimpl.toString();
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (string == null || StringsKt.isBlank(string)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    @NotNull
    public final o0O0O00 OooO0Oo() {
        Object value = f40786OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, o000O0O0.OooO00o(-3466829328L));
        return (o0O0O00) value;
    }

    @NotNull
    public final o0O0O00 OooO0o() {
        Object value = f40790OooO0oO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, o000O0O0.OooO00o(-428668591632L));
        return (o0O0O00) value;
    }

    @NotNull
    public final o0O0O00 OooO0o0() {
        Object value = f40787OooO0Oo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, o000O0O0.OooO00o(-106546044432L));
        return (o0O0O00) value;
    }
}
