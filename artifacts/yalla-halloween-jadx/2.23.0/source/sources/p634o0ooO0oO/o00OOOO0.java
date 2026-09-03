package p634o0ooO0oO;

import com.qiniu.android.http.ResponseInfo;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000Oo;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO0O0OoO;
import p646o0ooOoo.oO0Oo0oo;
import p652o0ooo00o.o000O0O0;
import p653o0ooo0O.oo0o0Oo;
import p655o0ooo0o0.o0000O0O;
import p655o0ooo0o0.o000OO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOOO0 implements Cloneable, o00O00o0.OooO00o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final List<Protocol> f57253Oooo00O = o0O000o0.OooOO0o(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final List<oo0o0O0> f57254Oooo00o = o0O000o0.OooOO0o(oo0o0O0.f57372OooO0o0, oo0o0O0.f57371OooO0o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f57255OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f57256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<o00OOO00> f57257OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O0OO0 f57258OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<o00OOO00> f57259OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00OO00O.OooO0OO f57260OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final oOO00O f57261OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f57262OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f57263OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o00OO000 f57264OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00O0OOO f57265OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final Proxy f57266OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ProxySelector f57267OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final SocketFactory f57268OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final oOO00O f57269OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f57270OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final o00O0 f57271OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final List<oo0o0O0> f57272OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final X509TrustManager f57273OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final List<Protocol> f57274OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final HostnameVerifier f57275OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f57276OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public final o0000O0O f57277OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f57278OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f57279OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f57280OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f57281OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final long f57282OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final oO0O0OoO f57283Oooo000;

    public o00OOOO0(@NotNull OooO00o builder) {
        ProxySelector proxySelector;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f57256OooO0Oo = builder.f57285OooO00o;
        this.f57258OooO0o0 = builder.f57286OooO0O0;
        this.f57257OooO0o = o0O000o0.OooOo(builder.f57287OooO0OO);
        this.f57259OooO0oO = o0O000o0.OooOo(builder.f57288OooO0Oo);
        this.f57260OooO0oo = builder.f57290OooO0o0;
        this.f57255OooO = builder.f57289OooO0o;
        this.f57261OooOO0 = builder.f57291OooO0oO;
        this.f57262OooOO0O = builder.f57292OooO0oo;
        this.f57263OooOO0o = builder.f57284OooO;
        this.f57265OooOOO0 = builder.f57293OooOO0;
        this.f57264OooOOO = builder.f57294OooOO0O;
        Proxy proxy = builder.f57295OooOO0o;
        this.f57266OooOOOO = proxy;
        if (proxy != null) {
            proxySelector = oo0o0Oo.f60043OooO00o;
        } else {
            proxySelector = builder.f57297OooOOO0;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = oo0o0Oo.f60043OooO00o;
            }
        }
        this.f57267OooOOOo = proxySelector;
        this.f57269OooOOo0 = builder.f57296OooOOO;
        this.f57268OooOOo = builder.f57298OooOOOO;
        List<oo0o0O0> list = builder.f57300OooOOo;
        this.f57272OooOo0 = list;
        this.f57274OooOo0O = builder.f57302OooOOoo;
        this.f57275OooOo0o = builder.f57305OooOo00;
        this.f57276OooOoO = builder.f57307OooOo0o;
        this.f57278OooOoOO = builder.f57303OooOo;
        this.f57280OooOoo0 = builder.f57309OooOoO0;
        this.f57279OooOoo = builder.f57308OooOoO;
        this.f57281OooOooO = builder.f57310OooOoOO;
        this.f57282OooOooo = builder.f57312OooOoo0;
        oO0O0OoO oo0o0ooo = builder.f57311OooOoo;
        this.f57283Oooo000 = oo0o0ooo == null ? new oO0O0OoO() : oo0o0ooo;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((oo0o0O0) it.next()).f57373OooO00o) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            this.f57270OooOOoo = null;
            this.f57277OooOoO0 = null;
            this.f57273OooOo00 = null;
            this.f57271OooOo = o00O0.f57137OooO0OO;
        } else {
            SSLSocketFactory sSLSocketFactory = builder.f57299OooOOOo;
            if (sSLSocketFactory != null) {
                this.f57270OooOOoo = sSLSocketFactory;
                o0000O0O certificateChainCleaner = builder.f57306OooOo0O;
                Intrinsics.checkNotNull(certificateChainCleaner);
                this.f57277OooOoO0 = certificateChainCleaner;
                X509TrustManager x509TrustManager = builder.f57301OooOOo0;
                Intrinsics.checkNotNull(x509TrustManager);
                this.f57273OooOo00 = x509TrustManager;
                o00O0 o00o1 = builder.f57304OooOo0;
                Intrinsics.checkNotNull(certificateChainCleaner);
                o00o1.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                this.f57271OooOo = Intrinsics.areEqual(o00o1.f57139OooO0O0, certificateChainCleaner) ? o00o1 : new o00O0(o00o1.f57138OooO00o, certificateChainCleaner);
            } else {
                o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                X509TrustManager trustManager = o000O0O0.f60031OooO00o.OooOOO();
                this.f57273OooOo00 = trustManager;
                o000O0O0 o000o0o2 = o000O0O0.f60031OooO00o;
                Intrinsics.checkNotNull(trustManager);
                this.f57270OooOOoo = o000o0o2.OooOOO0(trustManager);
                Intrinsics.checkNotNull(trustManager);
                Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                o0000O0O certificateChainCleaner2 = o000O0O0.f60031OooO00o.OooO0O0(trustManager);
                this.f57277OooOoO0 = certificateChainCleaner2;
                o00O0 o00o2 = builder.f57304OooOo0;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                o00o2.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                this.f57271OooOo = Intrinsics.areEqual(o00o2.f57139OooO0O0, certificateChainCleaner2) ? o00o2 : new o00O0(o00o2.f57138OooO00o, certificateChainCleaner2);
            }
        }
        List<o00OOO00> list2 = this.f57257OooO0o;
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", list2).toString());
        }
        List<o00OOO00> list3 = this.f57259OooO0oO;
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", list3).toString());
        }
        List<oo0o0O0> list4 = this.f57272OooOo0;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                } else if (((oo0o0O0) it2.next()).f57373OooO00o) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        X509TrustManager x509TrustManager2 = this.f57273OooOo00;
        o0000O0O o0000o0o2 = this.f57277OooOoO0;
        SSLSocketFactory sSLSocketFactory2 = this.f57270OooOOoo;
        if (!z2) {
            if (sSLSocketFactory2 == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (o0000o0o2 == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (x509TrustManager2 == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(sSLSocketFactory2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(o0000o0o2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(x509TrustManager2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.f57271OooOo, o00O0.f57137OooO0OO)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // o0ooO0oO.o00O00o0.OooO00o
    @NotNull
    public final oO0Oo0oo OooO0O0(@NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new oO0Oo0oo(this, request, false);
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f57284OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public oo0oOO0 f57285OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00O0OO0 f57286OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57287OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList f57288OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f57289OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public o00OO00O.OooO0OO f57290OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public oOO00O f57291OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f57292OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NotNull
        public o00O0OOO f57293OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public o00OO000 f57294OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public Proxy f57295OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @NotNull
        public oOO00O f57296OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public final ProxySelector f57297OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @NotNull
        public final SocketFactory f57298OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public SSLSocketFactory f57299OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @NotNull
        public final List<oo0o0O0> f57300OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public X509TrustManager f57301OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @NotNull
        public List<? extends Protocol> f57302OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f57303OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @NotNull
        public o00O0 f57304OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @NotNull
        public final HostnameVerifier f57305OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public o0000O0O f57306OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f57307OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f57308OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f57309OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f57310OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public oO0O0OoO f57311OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final long f57312OooOoo0;

        public OooO00o() {
            this.f57285OooO00o = new oo0oOO0();
            this.f57286OooO0O0 = new o00O0OO0(5L, TimeUnit.MINUTES);
            this.f57287OooO0OO = new ArrayList();
            this.f57288OooO0Oo = new ArrayList();
            o00OO00O o00oo00o = o00OO00O.NONE;
            Intrinsics.checkNotNullParameter(o00oo00o, "<this>");
            this.f57290OooO0o0 = new o0O000Oo(o00oo00o);
            this.f57289OooO0o = true;
            o00O00O o00o00o2 = oOO00O.f57368OooO00o;
            this.f57291OooO0oO = o00o00o2;
            this.f57292OooO0oo = true;
            this.f57284OooO = true;
            this.f57293OooOO0 = o00O0OOO.f57200OooO00o;
            this.f57294OooOO0O = o00OO000.f57220OooO00o;
            this.f57296OooOOO = o00o00o2;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f57298OooOOOO = socketFactory;
            this.f57300OooOOo = o00OOOO0.f57254Oooo00o;
            this.f57302OooOOoo = o00OOOO0.f57253Oooo00O;
            this.f57305OooOo00 = o000OO.f60127OooO00o;
            this.f57304OooOo0 = o00O0.f57137OooO0OO;
            this.f57303OooOo = ResponseInfo.UnknownError;
            this.f57309OooOoO0 = ResponseInfo.UnknownError;
            this.f57308OooOoO = ResponseInfo.UnknownError;
            this.f57312OooOoo0 = 1024L;
        }

        @NotNull
        public final void OooO00o(@NotNull o00OOO00 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f57287OooO0OO.add(interceptor);
        }

        @NotNull
        public final void OooO0O0(@NotNull o00O0 certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.areEqual(certificatePinner, this.f57304OooOo0)) {
                this.f57311OooOoo = null;
            }
            Intrinsics.checkNotNullParameter(certificatePinner, "<set-?>");
            this.f57304OooOo0 = certificatePinner;
        }

        @NotNull
        public final void OooO0OO(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57303OooOo = o0O000o0.OooO0O0(j, unit);
        }

        @NotNull
        public final void OooO0Oo(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57309OooOoO0 = o0O000o0.OooO0O0(j, unit);
        }

        @NotNull
        public final void OooO0o(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57308OooOoO = o0O000o0.OooO0O0(j, unit);
        }

        @NotNull
        public final void OooO0o0(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, this.f57299OooOOOo) || !Intrinsics.areEqual(trustManager, this.f57301OooOOo0)) {
                this.f57311OooOoo = null;
            }
            this.f57299OooOOOo = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
            this.f57306OooOo0O = o000O0O0.f60031OooO00o.OooO0O0(trustManager);
            this.f57301OooOOo0 = trustManager;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o00OOOO0 okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f57285OooO00o = okHttpClient.f57256OooO0Oo;
            this.f57286OooO0O0 = okHttpClient.f57258OooO0o0;
            CollectionsKt__MutableCollectionsKt.addAll(this.f57287OooO0OO, okHttpClient.f57257OooO0o);
            CollectionsKt__MutableCollectionsKt.addAll(this.f57288OooO0Oo, okHttpClient.f57259OooO0oO);
            this.f57290OooO0o0 = okHttpClient.f57260OooO0oo;
            this.f57289OooO0o = okHttpClient.f57255OooO;
            this.f57291OooO0oO = okHttpClient.f57261OooOO0;
            this.f57292OooO0oo = okHttpClient.f57262OooOO0O;
            this.f57284OooO = okHttpClient.f57263OooOO0o;
            this.f57293OooOO0 = okHttpClient.f57265OooOOO0;
            this.f57294OooOO0O = okHttpClient.f57264OooOOO;
            this.f57295OooOO0o = okHttpClient.f57266OooOOOO;
            this.f57297OooOOO0 = okHttpClient.f57267OooOOOo;
            this.f57296OooOOO = okHttpClient.f57269OooOOo0;
            this.f57298OooOOOO = okHttpClient.f57268OooOOo;
            this.f57299OooOOOo = okHttpClient.f57270OooOOoo;
            this.f57301OooOOo0 = okHttpClient.f57273OooOo00;
            this.f57300OooOOo = okHttpClient.f57272OooOo0;
            this.f57302OooOOoo = okHttpClient.f57274OooOo0O;
            this.f57305OooOo00 = okHttpClient.f57275OooOo0o;
            this.f57304OooOo0 = okHttpClient.f57271OooOo;
            this.f57306OooOo0O = okHttpClient.f57277OooOoO0;
            this.f57307OooOo0o = okHttpClient.f57276OooOoO;
            this.f57303OooOo = okHttpClient.f57278OooOoOO;
            this.f57309OooOoO0 = okHttpClient.f57280OooOoo0;
            this.f57308OooOoO = okHttpClient.f57279OooOoo;
            this.f57310OooOoOO = okHttpClient.f57281OooOooO;
            this.f57312OooOoo0 = okHttpClient.f57282OooOooo;
            this.f57311OooOoo = okHttpClient.f57283Oooo000;
        }
    }

    public o00OOOO0() {
        this(new OooO00o());
    }
}
