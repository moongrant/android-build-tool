package p634o0ooO0oO;

import com.facebook.internal.security.CertificateUtil;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;
import p635o0ooO0oo.o0O000O;
import p655o0ooo0o0.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0 f57137OooO0OO = new o00O0(CollectionsKt.toSet(new OooO00o().f57140OooO00o), null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Set<OooO0OO> f57138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0000O0O f57139OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ArrayList f57140OooO00o = new ArrayList();

        @NotNull
        public final void OooO00o(@NotNull String... pins) {
            Intrinsics.checkNotNullParameter("*.twitter.com", "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            int length = pins.length;
            int i = 0;
            while (i < length) {
                String str = pins[i];
                i++;
                this.f57140OooO00o.add(new OooO0OO(str));
            }
        }
    }

    public static final class OooO0O0 {
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
            ByteString byteString = ByteString.f60866OooO0oO;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.OooO00o.OooO0o0(encoded).OooO0Oo("SHA-256");
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f57141OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f57142OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ByteString f57143OooO0OO;

        public OooO0OO(@NotNull String pin) {
            Intrinsics.checkNotNullParameter("*.twitter.com", "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            boolean z = true;
            if ((!StringsKt.Oooo00o("*.twitter.com", "*.") || StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 1, false, 4, (Object) null) != -1) && ((!StringsKt.Oooo00o("*.twitter.com", "**.") || StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 0, false, 6, (Object) null) != -1)) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected pattern: ", "*.twitter.com").toString());
            }
            String strOooO0O0 = o0O000O.OooO0O0("*.twitter.com");
            if (strOooO0O0 == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pattern: ", "*.twitter.com"));
            }
            this.f57141OooO00o = strOooO0O0;
            if (StringsKt.Oooo00o(pin, "sha1/")) {
                this.f57142OooO0O0 = "sha1";
                ByteString byteString = ByteString.f60866OooO0oO;
                String strSubstring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                ByteString byteStringOooO00o = ByteString.OooO00o.OooO00o(strSubstring);
                if (byteStringOooO00o == null) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pin hash: ", pin));
                }
                this.f57143OooO0OO = byteStringOooO00o;
                return;
            }
            if (!StringsKt.Oooo00o(pin, "sha256/")) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("pins must start with 'sha256/' or 'sha1/': ", pin));
            }
            this.f57142OooO0O0 = "sha256";
            ByteString byteString2 = ByteString.f60866OooO0oO;
            String strSubstring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            ByteString byteStringOooO00o2 = ByteString.OooO00o.OooO00o(strSubstring2);
            if (byteStringOooO00o2 == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid pin hash: ", pin));
            }
            this.f57143OooO0OO = byteStringOooO00o2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return Intrinsics.areEqual(this.f57141OooO00o, oooO0OO.f57141OooO00o) && Intrinsics.areEqual(this.f57142OooO0O0, oooO0OO.f57142OooO0O0) && Intrinsics.areEqual(this.f57143OooO0OO, oooO0OO.f57143OooO0OO);
        }

        public final int hashCode() {
            return this.f57143OooO0OO.hashCode() + o0OO00O.OooO00o(this.f57142OooO0O0, this.f57141OooO00o.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return this.f57142OooO0O0 + '/' + this.f57143OooO0OO.OooO00o();
        }
    }

    public o00O0(@NotNull Set<OooO0OO> pins, @Nullable o0000O0O o0000o0o2) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f57138OooO00o = pins;
        this.f57139OooO0O0 = o0000o0o2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    public final void OooO00o(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<OooO0OO> set = this.f57138OooO00o;
        List<OooO0OO> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            oooO0OO.getClass();
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            String str = oooO0OO.f57141OooO00o;
            boolean zAreEqual = true;
            if (StringsKt.Oooo00o(str, "**.")) {
                int length = str.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length, str, 3, length, false, 16, (Object) null) || (length2 != 0 && hostname.charAt(length2 - 1) != '.')) {
                    zAreEqual = false;
                }
            } else if (StringsKt.Oooo00o(str, "*.")) {
                int length3 = str.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt__StringsJVMKt.regionMatches$default(hostname, hostname.length() - length3, str, 1, length3, false, 16, (Object) null) || StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    zAreEqual = false;
                }
            } else {
                zAreEqual = Intrinsics.areEqual(hostname, str);
            }
            if (zAreEqual) {
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
            ByteString byteStringOooO0O0 = null;
            ByteString byteStringOooO0Oo = null;
            for (OooO0OO oooO0OO2 : listEmptyList) {
                String str2 = oooO0OO2.f57142OooO0O0;
                boolean zAreEqual2 = Intrinsics.areEqual(str2, "sha256");
                ByteString byteString = oooO0OO2.f57143OooO0OO;
                if (zAreEqual2) {
                    if (byteStringOooO0O0 == null) {
                        byteStringOooO0O0 = OooO0O0.OooO0O0(x509Certificate);
                    }
                    if (Intrinsics.areEqual(byteString, byteStringOooO0O0)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(str2, "sha1")) {
                        throw new AssertionError(Intrinsics.stringPlus("unsupported hashAlgorithm: ", oooO0OO2.f57142OooO0O0));
                    }
                    if (byteStringOooO0Oo == null) {
                        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
                        ByteString byteString2 = ByteString.f60866OooO0oO;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
                        byteStringOooO0Oo = ByteString.OooO00o.OooO0o0(encoded).OooO0Oo("SHA-1");
                    }
                    if (Intrinsics.areEqual(byteString, byteStringOooO0Oo)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(OooO0O0.OooO00o(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(CertificateUtil.DELIMITER);
        for (OooO0OO oooO0OO3 : listEmptyList) {
            sb.append("\n    ");
            sb.append(oooO0OO3);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O0) {
            o00O0 o00o1 = (o00O0) obj;
            if (Intrinsics.areEqual(o00o1.f57138OooO00o, this.f57138OooO00o) && Intrinsics.areEqual(o00o1.f57139OooO0O0, this.f57139OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f57138OooO00o.hashCode() + 1517) * 41;
        o0000O0O o0000o0o2 = this.f57139OooO0O0;
        return iHashCode + (o0000o0o2 != null ? o0000o0o2.hashCode() : 0);
    }
}
