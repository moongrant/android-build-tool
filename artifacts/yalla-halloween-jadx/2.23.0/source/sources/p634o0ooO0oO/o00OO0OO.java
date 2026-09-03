package p634o0ooO0oO;

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
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.TlsVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final TlsVersion f57227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0O0 f57228OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f57229OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f57230OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0ooO0oO.o00OO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0513OooO00o extends Lambda implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f57231OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0513OooO00o(List<? extends Certificate> list) {
                super(0);
                this.f57231OooO0Oo = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f57231OooO0Oo;
            }
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static o00OO0OO OooO00o(@NotNull SSLSession sSLSession) throws IOException {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
            }
            o00O0O0 o00o0o0OooO0O0 = o00O0O0.f57177OooO0O0.OooO0O0(cipherSuite);
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
                listEmptyList = peerCertificates != null ? o0O000o0.OooOO0o(Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new o00OO0OO(tlsVersionOooO00o, o00o0o0OooO0O0, localCertificates != null ? o0O000o0.OooOO0o(Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new C0513OooO00o(listEmptyList));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<List<Certificate>> f57232OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f57232OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return this.f57232OooO0Oo.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO0OO(@NotNull TlsVersion tlsVersion, @NotNull o00O0O0 cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f57227OooO00o = tlsVersion;
        this.f57228OooO0O0 = cipherSuite;
        this.f57229OooO0OO = localCertificates;
        this.f57230OooO0Oo = LazyKt.lazy(new OooO0O0(peerCertificatesFn));
    }

    @JvmName(name = "peerCertificates")
    @NotNull
    public final List<Certificate> OooO00o() {
        return (List) this.f57230OooO0Oo.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00OO0OO) {
            o00OO0OO o00oo0oo = (o00OO0OO) obj;
            if (o00oo0oo.f57227OooO00o == this.f57227OooO00o && Intrinsics.areEqual(o00oo0oo.f57228OooO0O0, this.f57228OooO0O0) && Intrinsics.areEqual(o00oo0oo.OooO00o(), OooO00o()) && Intrinsics.areEqual(o00oo0oo.f57229OooO0OO, this.f57229OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57229OooO0OO.hashCode() + ((OooO00o().hashCode() + ((this.f57228OooO0O0.hashCode() + ((this.f57227OooO00o.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> listOooO00o = OooO00o();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO00o, 10));
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
        sb.append(this.f57227OooO00o);
        sb.append(" cipherSuite=");
        sb.append(this.f57228OooO0O0);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f57229OooO0OO;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
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
