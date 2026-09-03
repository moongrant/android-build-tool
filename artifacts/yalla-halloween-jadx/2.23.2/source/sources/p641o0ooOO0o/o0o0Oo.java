package p641o0ooOO0o;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57942OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f57943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f57944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f57945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57946OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57947OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57948OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57949OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57950OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57951OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57952OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57953OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57954OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57955OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57956OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57957OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57958OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57959OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0o0Oo f57960OooOo00;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f57961OooO00o;

    public static final class OooO00o implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a = str;
            String b = str2;
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            int iMin = Math.min(a.length(), b.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = a.charAt(i);
                char cCharAt2 = b.charAt(i);
                if (cCharAt != cCharAt2) {
                    if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) >= 0) {
                        return 1;
                    }
                    return -1;
                }
            }
            int length = a.length();
            int length2 = b.length();
            if (length == length2) {
                return 0;
            }
            if (length >= length2) {
                return 1;
            }
            return -1;
        }
    }

    public static final class OooO0O0 {
        public static final o0o0Oo OooO00o(OooO0O0 oooO0O0, String str) {
            o0o0Oo o0o0oo = new o0o0Oo(str);
            o0o0Oo.f57945OooO0Oo.put(str, o0o0oo);
            return o0o0oo;
        }

        @JvmStatic
        @NotNull
        public final synchronized o0o0Oo OooO0O0(@NotNull String javaName) {
            o0o0Oo o0o0oo;
            String strStringPlus;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = o0o0Oo.f57945OooO0Oo;
            o0o0oo = (o0o0Oo) linkedHashMap.get(javaName);
            if (o0o0oo == null) {
                if (StringsKt__StringsJVMKt.startsWith$default(javaName, "TLS_", false, 2, null)) {
                    String strSubstring = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("SSL_", strSubstring);
                } else if (StringsKt__StringsJVMKt.startsWith$default(javaName, "SSL_", false, 2, null)) {
                    String strSubstring2 = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("TLS_", strSubstring2);
                } else {
                    strStringPlus = javaName;
                }
                o0o0oo = (o0o0Oo) linkedHashMap.get(strStringPlus);
                if (o0o0oo == null) {
                    o0o0oo = new o0o0Oo(javaName);
                }
                linkedHashMap.put(javaName, o0o0oo);
            }
            return o0o0oo;
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f57943OooO0O0 = oooO0O0;
        f57944OooO0OO = new OooO00o();
        f57945OooO0Oo = new LinkedHashMap();
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_DES_CBC_SHA");
        f57947OooO0o0 = OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_DH_anon_WITH_RC4_128_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DH_anon_WITH_DES_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_DES_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_DES_CBC_MD5");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_WITH_RC4_128_MD5");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        OooO0O0.OooO00o(oooO0O0, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f57946OooO0o = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f57948OooO0oO = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_NULL_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_PSK_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_PSK_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_PSK_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_SEED_CBC_SHA");
        f57949OooO0oo = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f57942OooO = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        OooO0O0.OooO00o(oooO0O0, "TLS_FALLBACK_SCSV");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f57950OooOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f57951OooOO0O = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_anon_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f57952OooOO0o = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f57954OooOOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f57953OooOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f57955OooOOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f57956OooOOOo = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f57958OooOOo0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f57957OooOOo = OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_GCM_SHA256");
        f57959OooOOoo = OooO0O0.OooO00o(oooO0O0, "TLS_AES_256_GCM_SHA384");
        f57960OooOo00 = OooO0O0.OooO00o(oooO0O0, "TLS_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_8_SHA256");
    }

    public o0o0Oo(String str) {
        this.f57961OooO00o = str;
    }

    @NotNull
    public final String toString() {
        return this.f57961OooO00o;
    }
}
