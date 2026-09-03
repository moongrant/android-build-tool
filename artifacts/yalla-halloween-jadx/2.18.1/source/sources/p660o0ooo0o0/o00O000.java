package p660o0ooo0o0;

import com.facebook.internal.security.CertificateUtil;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p086o000OooO.o0O0O00;
import p659o0ooo0o.o00OO0OO;
import p670o0oooOo.v;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Set<OooO0OO> f51255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final v f51256OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f51254OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O000 f51253OooO0OO = new o00O000(CollectionsKt.toSet(new ArrayList()));

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<OooO0OO> f51257OooO00o = new ArrayList();

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00O000$OooO0OO>] */
        @NotNull
        public final OooO00o OooO00o(@NotNull String... pins) {
            Intrinsics.checkNotNullParameter("*.twitter.com", "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.f51257OooO00o.add(new OooO0OO(str));
            }
            return this;
        }
    }

    public static final class OooO0O0 {
        @JvmStatic
        @NotNull
        public final String OooO00o(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sha256/");
            sbOooO0o0.append(OooO0O0((X509Certificate) certificate).OooO00o());
            return sbOooO0o0.toString();
        }

        @JvmStatic
        @NotNull
        public final ByteString OooO0O0(@NotNull X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.f53047OoooO00.OooO0Oo(encoded, 0, encoded.length).OooO0O0(EvpMdRef.SHA256.JCA_NAME);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f51258OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f51259OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ByteString f51260OooO0OO;

        public OooO0OO(@NotNull String pin) {
            Intrinsics.checkNotNullParameter("*.twitter.com", "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            boolean z = true;
            if ((!StringsKt.OooOoOO("*.twitter.com", "*.") || StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 1, false, 4, (Object) null) != -1) && ((!StringsKt.OooOoOO("*.twitter.com", "**.") || StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 2, false, 4, (Object) null) != -1) && StringsKt__StringsKt.indexOf$default((CharSequence) "*.twitter.com", "*", 0, false, 6, (Object) null) != -1)) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Unexpected pattern: *.twitter.com".toString());
            }
            String strOooO0O0 = o00OO0OO.OooO0O0("*.twitter.com");
            if (strOooO0O0 == null) {
                throw new IllegalArgumentException("Invalid pattern: *.twitter.com");
            }
            this.f51258OooO00o = strOooO0O0;
            if (StringsKt.OooOoOO(pin, "sha1/")) {
                this.f51259OooO0O0 = "sha1";
                ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
                String strSubstring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                ByteString byteStringOooO00o = oooO00o.OooO00o(strSubstring);
                if (byteStringOooO00o == null) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid pin hash: ", pin));
                }
                this.f51260OooO0OO = byteStringOooO00o;
                return;
            }
            if (!StringsKt.OooOoOO(pin, "sha256/")) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("pins must start with 'sha256/' or 'sha1/': ", pin));
            }
            this.f51259OooO0O0 = "sha256";
            ByteString.OooO00o oooO00o2 = ByteString.f53047OoooO00;
            String strSubstring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            ByteString byteStringOooO00o2 = oooO00o2.OooO00o(strSubstring2);
            if (byteStringOooO00o2 == null) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid pin hash: ", pin));
            }
            this.f51260OooO0OO = byteStringOooO00o2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return ((Intrinsics.areEqual(this.f51258OooO00o, oooO0OO.f51258OooO00o) ^ true) || (Intrinsics.areEqual(this.f51259OooO0O0, oooO0OO.f51259OooO0O0) ^ true) || (Intrinsics.areEqual(this.f51260OooO0OO, oooO0OO.f51260OooO0OO) ^ true)) ? false : true;
        }

        public final int hashCode() {
            return this.f51260OooO0OO.hashCode() + o0O0O00.OooO00o(this.f51259OooO0O0, this.f51258OooO00o.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return this.f51259OooO0O0 + '/' + this.f51260OooO0OO.OooO00o();
        }
    }

    public o00O000(Set pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f51255OooO00o = pins;
        this.f51256OooO0O0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    public final void OooO00o(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<OooO0OO> set = this.f51255OooO00o;
        List<OooO0OO> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            Objects.requireNonNull(oooO0OO);
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            boolean zAreEqual = true;
            if (StringsKt.OooOoOO(oooO0OO.f51258OooO00o, "**.")) {
                int length = oooO0OO.f51258OooO00o.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt__StringsJVMKt.regionMatches(hostname, hostname.length() - length, oooO0OO.f51258OooO00o, 3, length, (16 & 16) != 0 ? false : false) || (length2 != 0 && hostname.charAt(length2 - 1) != '.')) {
                    zAreEqual = false;
                }
            } else if (StringsKt.OooOoOO(oooO0OO.f51258OooO00o, "*.")) {
                int length3 = oooO0OO.f51258OooO00o.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt__StringsJVMKt.regionMatches(hostname, hostname.length() - length3, oooO0OO.f51258OooO00o, 1, length3, (16 & 16) != 0 ? false : false) || StringsKt__StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    zAreEqual = false;
                }
            } else {
                zAreEqual = Intrinsics.areEqual(hostname, oooO0OO.f51258OooO00o);
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
        for (X509Certificate sha1Hash : listInvoke) {
            ByteString byteStringOooO0O0 = null;
            ByteString byteStringOooO0O1 = null;
            for (OooO0OO oooO0OO2 : listEmptyList) {
                String str = oooO0OO2.f51259OooO0O0;
                int iHashCode = str.hashCode();
                if (iHashCode != -903629273) {
                    if (iHashCode != 3528965 || !str.equals("sha1")) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unsupported hashAlgorithm: ");
                        sbOooO0o0.append(oooO0OO2.f51259OooO0O0);
                        throw new AssertionError(sbOooO0o0.toString());
                    }
                    if (byteStringOooO0O1 == null) {
                        Intrinsics.checkNotNullParameter(sha1Hash, "$this$sha1Hash");
                        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
                        PublicKey publicKey = sha1Hash.getPublicKey();
                        Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
                        byte[] encoded = publicKey.getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
                        byteStringOooO0O1 = ByteString.f53047OoooO00.OooO0Oo(encoded, 0, encoded.length).OooO0O0(EvpMdRef.SHA1.JCA_NAME);
                    }
                    if (Intrinsics.areEqual(oooO0OO2.f51260OooO0OO, byteStringOooO0O1)) {
                        return;
                    }
                } else {
                    if (!str.equals("sha256")) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("unsupported hashAlgorithm: ");
                        sbOooO0o1.append(oooO0OO2.f51259OooO0O0);
                        throw new AssertionError(sbOooO0o1.toString());
                    }
                    if (byteStringOooO0O0 == null) {
                        byteStringOooO0O0 = f51254OooO0Oo.OooO0O0(sha1Hash);
                    }
                    if (Intrinsics.areEqual(oooO0OO2.f51260OooO0OO, byteStringOooO0O0)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate : listInvoke) {
            sbOooO00o.append("\n    ");
            sbOooO00o.append(f51254OooO0Oo.OooO00o(x509Certificate));
            sbOooO00o.append(": ");
            Principal subjectDN = x509Certificate.getSubjectDN();
            Intrinsics.checkNotNullExpressionValue(subjectDN, "element.subjectDN");
            sbOooO00o.append(subjectDN.getName());
        }
        sbOooO00o.append("\n  Pinned certificates for ");
        sbOooO00o.append(hostname);
        sbOooO00o.append(CertificateUtil.DELIMITER);
        for (OooO0OO oooO0OO3 : listEmptyList) {
            sbOooO00o.append("\n    ");
            sbOooO00o.append(oooO0OO3);
        }
        String string = sbOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    @NotNull
    public final o00O000 OooO0O0(@NotNull v certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f51256OooO0O0, certificateChainCleaner) ? this : new o00O000(this.f51255OooO00o, certificateChainCleaner);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O000) {
            o00O000 o00o001 = (o00O000) obj;
            if (Intrinsics.areEqual(o00o001.f51255OooO00o, this.f51255OooO00o) && Intrinsics.areEqual(o00o001.f51256OooO0O0, this.f51256OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f51255OooO00o.hashCode() + 1517) * 41;
        v vVar = this.f51256OooO0O0;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public o00O000(@NotNull Set<OooO0OO> pins, @Nullable v vVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f51255OooO00o = pins;
        this.f51256OooO0O0 = vVar;
    }
}
