package p641o0ooOO0o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.TlsVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final TlsVersion f57781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0o0Oo f57782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f57783OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f57784OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0ooOO0o.o0O0000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0493OooO00o extends Lambda implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f57785OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0493OooO00o(List<? extends Certificate> list) {
                super(0);
                this.f57785OooO0Oo = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f57785OooO0Oo;
            }
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static o0O0000O OooO00o(@NotNull SSLSession sSLSession) throws IOException {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
            }
            o0o0Oo o0o0ooOooO0O0 = o0o0Oo.f57943OooO0O0.OooO0O0(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.INSTANCE.getClass();
            TlsVersion tlsVersionOooO00o = TlsVersion.Companion.OooO00o(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listEmptyList = peerCertificates != null ? oO000o00.OooOO0o(Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new o0O0000O(tlsVersionOooO00o, o0o0ooOooO0O0, localCertificates != null ? oO000o00.OooOO0o(Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new C0493OooO00o(listEmptyList));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<List<Certificate>> f57786OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f57786OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return this.f57786OooO0Oo.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0000O(@NotNull TlsVersion tlsVersion, @NotNull o0o0Oo cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f57781OooO00o = tlsVersion;
        this.f57782OooO0O0 = cipherSuite;
        this.f57783OooO0OO = localCertificates;
        this.f57784OooO0Oo = LazyKt.lazy(new OooO0O0(peerCertificatesFn));
    }

    @JvmName(name = "peerCertificates")
    @NotNull
    public final List<Certificate> OooO00o() {
        return (List) this.f57784OooO0Oo.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O0000O) {
            o0O0000O o0o0000o2 = (o0O0000O) obj;
            if (o0o0000o2.f57781OooO00o == this.f57781OooO00o && Intrinsics.areEqual(o0o0000o2.f57782OooO0O0, this.f57782OooO0O0) && Intrinsics.areEqual(o0o0000o2.OooO00o(), OooO00o()) && Intrinsics.areEqual(o0o0000o2.f57783OooO0OO, this.f57783OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57783OooO0OO.hashCode() + ((OooO00o().hashCode() + ((this.f57782OooO0O0.hashCode() + ((this.f57781OooO00o.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> listOooO00o = OooO00o();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(listOooO00o));
        for (Certificate certificate : listOooO00o) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f57781OooO00o);
        sb.append(" cipherSuite=");
        sb.append(this.f57782OooO0O0);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f57783OooO0OO;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
