package p660o0ooo0o0;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
import org.conscrypt.SSLNullSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f51482OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f51483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final TlsVersion f51484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O00 f51485OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f51486OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0ooo0o0.oo0oOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0428OooO00o extends Lambda implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List f51487Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0428OooO00o(List list) {
                super(0);
                this.f51487Oooo0o = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f51487Oooo0o;
            }
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final oo0oOO0 OooO00o(@NotNull SSLSession handshake) throws IOException {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals(SSLNullSession.INVALID_CIPHER)) {
                throw new IOException(OooOo00.OooO0Oo("cipherSuite == ", cipherSuite));
            }
            o00O00 o00o00OooO0O0 = o00O00.f51251OooOo00.OooO0O0(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionOooO00o = TlsVersion.INSTANCE.OooO00o(protocol);
            try {
                Certificate[] peerCertificates = handshake.getPeerCertificates();
                listEmptyList = peerCertificates != null ? o00OOO00.OooOOO0((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Certificate[] localCertificates = handshake.getLocalCertificates();
            return new oo0oOO0(tlsVersionOooO00o, o00o00OooO0O0, localCertificates != null ? o00OOO00.OooOOO0((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new C0428OooO00o(listEmptyList));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f51488Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0 function0) {
            super(0);
            this.f51488Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.f51488Oooo0o.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo0oOO0(@NotNull TlsVersion tlsVersion, @NotNull o00O00 cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f51484OooO0O0 = tlsVersion;
        this.f51485OooO0OO = cipherSuite;
        this.f51486OooO0Oo = localCertificates;
        this.f51483OooO00o = LazyKt.lazy(new OooO0O0(peerCertificatesFn));
    }

    public final String OooO00o(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @JvmName(name = "peerCertificates")
    @NotNull
    public final List<Certificate> OooO0O0() {
        return (List) this.f51483OooO00o.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof oo0oOO0) {
            oo0oOO0 oo0ooo0 = (oo0oOO0) obj;
            if (oo0ooo0.f51484OooO0O0 == this.f51484OooO0O0 && Intrinsics.areEqual(oo0ooo0.f51485OooO0OO, this.f51485OooO0OO) && Intrinsics.areEqual(oo0ooo0.OooO0O0(), OooO0O0()) && Intrinsics.areEqual(oo0ooo0.f51486OooO0Oo, this.f51486OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51486OooO0Oo.hashCode() + ((OooO0O0().hashCode() + ((this.f51485OooO0OO.hashCode() + ((this.f51484OooO0O0.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        List<Certificate> listOooO0O0 = OooO0O0();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO0O0, 10));
        Iterator<T> it = listOooO0O0.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO00o((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sbOooO00o = Oooo0.OooO00o("Handshake{", "tlsVersion=");
        sbOooO00o.append(this.f51484OooO0O0);
        sbOooO00o.append(' ');
        sbOooO00o.append("cipherSuite=");
        sbOooO00o.append(this.f51485OooO0OO);
        sbOooO00o.append(' ');
        sbOooO00o.append("peerCertificates=");
        sbOooO00o.append(string);
        sbOooO00o.append(' ');
        sbOooO00o.append("localCertificates=");
        List<Certificate> list = this.f51486OooO0Oo;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(OooO00o((Certificate) it2.next()));
        }
        sbOooO00o.append(arrayList2);
        sbOooO00o.append('}');
        return sbOooO00o.toString();
    }
}
