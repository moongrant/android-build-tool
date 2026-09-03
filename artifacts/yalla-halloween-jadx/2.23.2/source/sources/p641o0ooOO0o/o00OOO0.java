package p641o0ooOO0o;

import com.facebook.internal.security.CertificateUtil;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p661o0oooO00.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OOO0 f57755OooO0OO = new o00OOO0(CollectionsKt.toSet(new ArrayList()), null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Set<OooO0O0> f57756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0000O0O f57757OooO0O0;

    public static final class OooO00o {
        @JvmStatic
        @NotNull
        public static String OooO00o(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return Intrinsics.stringPlus("sha256/", OooO0O0(certificate).OooO00o());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @JvmStatic
        @NotNull
        public static ByteString OooO0O0(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString byteString = ByteString.f60193OooO0oO;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.OooO00o.OooO0o0(encoded).OooO0Oo("SHA-256");
        }
    }

    public static final class OooO0O0 {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            oooO0O0.getClass();
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            oooO0O0.getClass();
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            oooO0O0.getClass();
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            throw null;
        }
    }

    public o00OOO0(@NotNull Set<OooO0O0> pins, @Nullable o0000O0O o0000o0o2) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f57756OooO00o = pins;
        this.f57757OooO0O0 = o0000o0o2;
    }

    public final void OooO00o(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<OooO0O0> set = this.f57756OooO00o;
        List<OooO0O0> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            ((OooO0O0) obj).getClass();
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt__StringsJVMKt.startsWith$default(null, "**.", false, 2, null)) {
                throw null;
            }
            if (StringsKt__StringsJVMKt.startsWith$default(null, "*.", false, 2, null)) {
                throw null;
            }
            if (Intrinsics.areEqual(hostname, (Object) null)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                TypeIntrinsics.asMutableList(listEmptyList).add(obj);
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            Iterator it = listEmptyList.iterator();
            ByteString byteStringOooO0O0 = null;
            ByteString byteStringOooO0Oo = null;
            while (it.hasNext()) {
                ((OooO0O0) it.next()).getClass();
                if (Intrinsics.areEqual((Object) null, "sha256")) {
                    if (byteStringOooO0O0 == null) {
                        byteStringOooO0O0 = OooO00o.OooO0O0(x509Certificate);
                    }
                    if (Intrinsics.areEqual((Object) null, byteStringOooO0O0)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual((Object) null, "sha1")) {
                        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", null));
                    }
                    if (byteStringOooO0Oo == null) {
                        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
                        ByteString byteString = ByteString.f60193OooO0oO;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
                        byteStringOooO0Oo = ByteString.OooO00o.OooO0o0(encoded).OooO0Oo("SHA-1");
                    }
                    if (Intrinsics.areEqual((Object) null, byteStringOooO0Oo)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(OooO00o.OooO00o(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(CertificateUtil.DELIMITER);
        for (OooO0O0 oooO0O0 : listEmptyList) {
            sb.append("\n    ");
            sb.append(oooO0O0);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00OOO0) {
            o00OOO0 o00ooo1 = (o00OOO0) obj;
            if (Intrinsics.areEqual(o00ooo1.f57756OooO00o, this.f57756OooO00o) && Intrinsics.areEqual(o00ooo1.f57757OooO0O0, this.f57757OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f57756OooO00o.hashCode() + 1517) * 41;
        o0000O0O o0000o0o2 = this.f57757OooO0O0;
        return iHashCode + (o0000o0o2 != null ? o0000o0o2.hashCode() : 0);
    }
}
