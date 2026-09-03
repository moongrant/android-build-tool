package p641o0ooOO0o;

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
import p648o0ooOoo.oO000Oo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;
import p653o0ooo00O.o000O0o;
import p658o0ooo0oo.o0oO0O0o;
import p661o0oooO00.o0000O0O;
import p661o0oooO00.o000OO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OoO00O implements Cloneable, o00OO.OooO00o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final List<Protocol> f57882Oooo00O = oO000o00.OooOO0o(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final List<o00Oo00> f57883Oooo00o = oO000o00.OooOO0o(o00Oo00.f57763OooO0o0, o00Oo00.f57762OooO0o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f57884OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo00oO f57885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<o0OoOoOo> f57886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f57887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<o0OoOoOo> f57888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0.OooO0OO f57889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f57890OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f57891OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f57892OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o0O0o f57893OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o0O00o0 f57894OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final Proxy f57895OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ProxySelector f57896OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final SocketFactory f57897OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f57898OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f57899OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f57900OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final List<o00Oo00> f57901OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final X509TrustManager f57902OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final List<Protocol> f57903OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final HostnameVerifier f57904OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f57905OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public final o0000O0O f57906OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f57907OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f57908OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f57909OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f57910OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final long f57911OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final o000O0o f57912Oooo000;

    public o0OoO00O(@NotNull OooO00o builder) {
        ProxySelector proxySelector;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f57885OooO0Oo = builder.f57914OooO00o;
        this.f57887OooO0o0 = builder.f57915OooO0O0;
        this.f57886OooO0o = oO000o00.OooOo(builder.f57916OooO0OO);
        this.f57888OooO0oO = oO000o00.OooOo(builder.f57917OooO0Oo);
        this.f57889OooO0oo = builder.f57919OooO0o0;
        this.f57884OooO = builder.f57918OooO0o;
        this.f57890OooOO0 = builder.f57920OooO0oO;
        this.f57891OooOO0O = builder.f57921OooO0oo;
        this.f57892OooOO0o = builder.f57913OooO;
        this.f57894OooOOO0 = builder.f57922OooOO0;
        this.f57893OooOOO = builder.f57923OooOO0O;
        Proxy proxy = builder.f57924OooOO0o;
        this.f57895OooOOOO = proxy;
        if (proxy != null) {
            proxySelector = o0oO0O0o.f59623OooO00o;
        } else {
            proxySelector = builder.f57926OooOOO0;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = o0oO0O0o.f59623OooO00o;
            }
        }
        this.f57896OooOOOo = proxySelector;
        this.f57898OooOOo0 = builder.f57925OooOOO;
        this.f57897OooOOo = builder.f57927OooOOOO;
        List<o00Oo00> list = builder.f57929OooOOo;
        this.f57901OooOo0 = list;
        this.f57903OooOo0O = builder.f57931OooOOoo;
        this.f57904OooOo0o = builder.f57934OooOo00;
        this.f57905OooOoO = builder.f57936OooOo0o;
        this.f57907OooOoOO = builder.f57932OooOo;
        this.f57909OooOoo0 = builder.f57938OooOoO0;
        this.f57908OooOoo = builder.f57937OooOoO;
        this.f57910OooOooO = builder.f57939OooOoOO;
        this.f57911OooOooo = builder.f57941OooOoo0;
        o000O0o o000o0o2 = builder.f57940OooOoo;
        this.f57912Oooo000 = o000o0o2 == null ? new o000O0o() : o000o0o2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((o00Oo00) it.next()).f57764OooO00o) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            this.f57899OooOOoo = null;
            this.f57906OooOoO0 = null;
            this.f57902OooOo00 = null;
            this.f57900OooOo = o00OOO0.f57755OooO0OO;
        } else {
            SSLSocketFactory sSLSocketFactory = builder.f57928OooOOOo;
            if (sSLSocketFactory != null) {
                this.f57899OooOOoo = sSLSocketFactory;
                o0000O0O certificateChainCleaner = builder.f57935OooOo0O;
                Intrinsics.checkNotNull(certificateChainCleaner);
                this.f57906OooOoO0 = certificateChainCleaner;
                X509TrustManager x509TrustManager = builder.f57930OooOOo0;
                Intrinsics.checkNotNull(x509TrustManager);
                this.f57902OooOo00 = x509TrustManager;
                o00OOO0 o00ooo1 = builder.f57933OooOo0;
                Intrinsics.checkNotNull(certificateChainCleaner);
                o00ooo1.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                this.f57900OooOo = Intrinsics.areEqual(o00ooo1.f57757OooO0O0, certificateChainCleaner) ? o00ooo1 : new o00OOO0(o00ooo1.f57756OooO00o, certificateChainCleaner);
            } else {
                p657o0ooo0o0.o000O0o o000o0o3 = p657o0ooo0o0.o000O0o.f59618OooO00o;
                X509TrustManager trustManager = p657o0ooo0o0.o000O0o.f59618OooO00o.OooOOO();
                this.f57902OooOo00 = trustManager;
                p657o0ooo0o0.o000O0o o000o0o4 = p657o0ooo0o0.o000O0o.f59618OooO00o;
                Intrinsics.checkNotNull(trustManager);
                this.f57899OooOOoo = o000o0o4.OooOOO0(trustManager);
                Intrinsics.checkNotNull(trustManager);
                Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                o0000O0O certificateChainCleaner2 = p657o0ooo0o0.o000O0o.f59618OooO00o.OooO0O0(trustManager);
                this.f57906OooOoO0 = certificateChainCleaner2;
                o00OOO0 o00ooo2 = builder.f57933OooOo0;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                o00ooo2.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                this.f57900OooOo = Intrinsics.areEqual(o00ooo2.f57757OooO0O0, certificateChainCleaner2) ? o00ooo2 : new o00OOO0(o00ooo2.f57756OooO00o, certificateChainCleaner2);
            }
        }
        List<o0OoOoOo> list2 = this.f57886OooO0o;
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", list2).toString());
        }
        List<o0OoOoOo> list3 = this.f57888OooO0oO;
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", list3).toString());
        }
        List<o00Oo00> list4 = this.f57901OooOo0;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                } else if (((o00Oo00) it2.next()).f57764OooO00o) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        X509TrustManager x509TrustManager2 = this.f57902OooOo00;
        o0000O0O o0000o0o2 = this.f57906OooOoO0;
        SSLSocketFactory sSLSocketFactory2 = this.f57899OooOOoo;
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
        if (!Intrinsics.areEqual(this.f57900OooOo, o00OOO0.f57755OooO0OO)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // o0ooOO0o.o00OO.OooO00o
    @NotNull
    public final o0000O0 OooO0O0(@NotNull o0O00O0o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new o0000O0(this, request, false);
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f57913OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public oo00oO f57914OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00OOOOo f57915OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57916OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList f57917OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f57918OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public o0.OooO0OO f57919OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public o00OO0OO f57920OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f57921OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NotNull
        public o0O00o0 f57922OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public o0O0o f57923OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public Proxy f57924OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @NotNull
        public o00OO0OO f57925OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public final ProxySelector f57926OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @NotNull
        public final SocketFactory f57927OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public SSLSocketFactory f57928OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @NotNull
        public final List<o00Oo00> f57929OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public X509TrustManager f57930OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @NotNull
        public List<? extends Protocol> f57931OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f57932OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @NotNull
        public final o00OOO0 f57933OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @NotNull
        public final HostnameVerifier f57934OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public o0000O0O f57935OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f57936OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f57937OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f57938OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f57939OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public o000O0o f57940OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final long f57941OooOoo0;

        public OooO00o() {
            this.f57914OooO00o = new oo00oO();
            this.f57915OooO0O0 = new o00OOOOo(5L, TimeUnit.MINUTES);
            this.f57916OooO0OO = new ArrayList();
            this.f57917OooO0Oo = new ArrayList();
            o0 o0Var = o0.NONE;
            Intrinsics.checkNotNullParameter(o0Var, "<this>");
            this.f57919OooO0o0 = new oO000Oo(o0Var);
            this.f57918OooO0o = true;
            o00OO0O0 o00oo0o1 = o00OO0OO.f57754OooO00o;
            this.f57920OooO0oO = o00oo0o1;
            this.f57921OooO0oo = true;
            this.f57913OooO = true;
            this.f57922OooOO0 = o0O00o0.f57845OooO00o;
            this.f57923OooOO0O = o0O0o.f57881OooO00o;
            this.f57925OooOOO = o00oo0o1;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f57927OooOOOO = socketFactory;
            this.f57929OooOOo = o0OoO00O.f57883Oooo00o;
            this.f57931OooOOoo = o0OoO00O.f57882Oooo00O;
            this.f57934OooOo00 = o000OO.f59741OooO00o;
            this.f57933OooOo0 = o00OOO0.f57755OooO0OO;
            this.f57932OooOo = ResponseInfo.UnknownError;
            this.f57938OooOoO0 = ResponseInfo.UnknownError;
            this.f57937OooOoO = ResponseInfo.UnknownError;
            this.f57941OooOoo0 = 1024L;
        }

        @NotNull
        public final void OooO00o(@NotNull o0OoOoOo interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f57916OooO0OO.add(interceptor);
        }

        @NotNull
        public final void OooO0O0(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57932OooOo = oO000o00.OooO0O0(j, unit);
        }

        @NotNull
        public final void OooO0OO(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57938OooOoO0 = oO000o00.OooO0O0(j, unit);
        }

        @NotNull
        public final void OooO0Oo(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, this.f57928OooOOOo) || !Intrinsics.areEqual(trustManager, this.f57930OooOOo0)) {
                this.f57940OooOoo = null;
            }
            this.f57928OooOOOo = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            p657o0ooo0o0.o000O0o o000o0o2 = p657o0ooo0o0.o000O0o.f59618OooO00o;
            this.f57935OooOo0O = p657o0ooo0o0.o000O0o.f59618OooO00o.OooO0O0(trustManager);
            this.f57930OooOOo0 = trustManager;
        }

        @NotNull
        public final void OooO0o0(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f57937OooOoO = oO000o00.OooO0O0(j, unit);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o0OoO00O okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f57914OooO00o = okHttpClient.f57885OooO0Oo;
            this.f57915OooO0O0 = okHttpClient.f57887OooO0o0;
            CollectionsKt__MutableCollectionsKt.addAll(this.f57916OooO0OO, okHttpClient.f57886OooO0o);
            CollectionsKt__MutableCollectionsKt.addAll(this.f57917OooO0Oo, okHttpClient.f57888OooO0oO);
            this.f57919OooO0o0 = okHttpClient.f57889OooO0oo;
            this.f57918OooO0o = okHttpClient.f57884OooO;
            this.f57920OooO0oO = okHttpClient.f57890OooOO0;
            this.f57921OooO0oo = okHttpClient.f57891OooOO0O;
            this.f57913OooO = okHttpClient.f57892OooOO0o;
            this.f57922OooOO0 = okHttpClient.f57894OooOOO0;
            this.f57923OooOO0O = okHttpClient.f57893OooOOO;
            this.f57924OooOO0o = okHttpClient.f57895OooOOOO;
            this.f57926OooOOO0 = okHttpClient.f57896OooOOOo;
            this.f57925OooOOO = okHttpClient.f57898OooOOo0;
            this.f57927OooOOOO = okHttpClient.f57897OooOOo;
            this.f57928OooOOOo = okHttpClient.f57899OooOOoo;
            this.f57930OooOOo0 = okHttpClient.f57902OooOo00;
            this.f57929OooOOo = okHttpClient.f57901OooOo0;
            this.f57931OooOOoo = okHttpClient.f57903OooOo0O;
            this.f57934OooOo00 = okHttpClient.f57904OooOo0o;
            this.f57933OooOo0 = okHttpClient.f57900OooOo;
            this.f57935OooOo0O = okHttpClient.f57906OooOoO0;
            this.f57936OooOo0o = okHttpClient.f57905OooOoO;
            this.f57932OooOo = okHttpClient.f57907OooOoOO;
            this.f57938OooOoO0 = okHttpClient.f57909OooOoo0;
            this.f57937OooOoO = okHttpClient.f57908OooOoo;
            this.f57939OooOoOO = okHttpClient.f57910OooOooO;
            this.f57941OooOoo0 = okHttpClient.f57911OooOooo;
            this.f57940OooOoo = okHttpClient.f57912Oooo000;
        }
    }

    public o0OoO00O() {
        this(new OooO00o());
    }
}
