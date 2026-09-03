package p634o0ooO0oO;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57176OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f57177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f57178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f57179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57180OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57181OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57182OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57183OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57184OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57185OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57186OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57187OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57188OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57189OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57190OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57191OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57192OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57193OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O0O0 f57194OooOo00;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f57195OooO00o;

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
        public static final o00O0O0 OooO00o(OooO0O0 oooO0O0, String str) {
            o00O0O0 o00o0o0 = new o00O0O0(str);
            o00O0O0.f57179OooO0Oo.put(str, o00o0o0);
            return o00o0o0;
        }

        @JvmStatic
        @NotNull
        public final synchronized o00O0O0 OooO0O0(@NotNull String javaName) {
            o00O0O0 o00o0o0;
            String strStringPlus;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = o00O0O0.f57179OooO0Oo;
            o00o0o0 = (o00O0O0) linkedHashMap.get(javaName);
            if (o00o0o0 == null) {
                if (StringsKt.Oooo00o(javaName, "TLS_")) {
                    String strSubstring = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("SSL_", strSubstring);
                } else if (StringsKt.Oooo00o(javaName, "SSL_")) {
                    String strSubstring2 = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strStringPlus = Intrinsics.stringPlus("TLS_", strSubstring2);
                } else {
                    strStringPlus = javaName;
                }
                o00o0o0 = (o00O0O0) linkedHashMap.get(strStringPlus);
                if (o00o0o0 == null) {
                    o00o0o0 = new o00O0O0(javaName);
                }
                linkedHashMap.put(javaName, o00o0o0);
            }
            return o00o0o0;
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f57177OooO0O0 = oooO0O0;
        f57178OooO0OO = new OooO00o();
        f57179OooO0Oo = new LinkedHashMap();
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_DES_CBC_SHA");
        f57181OooO0o0 = OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
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
        f57180OooO0o = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f57182OooO0oO = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_CBC_SHA");
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
        f57183OooO0oo = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f57176OooO = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_GCM_SHA384");
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
        f57184OooOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f57185OooOO0O = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
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
        f57186OooOO0o = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f57188OooOOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f57187OooOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f57189OooOOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f57190OooOOOo = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f57192OooOOo0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f57191OooOOo = OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_GCM_SHA256");
        f57193OooOOoo = OooO0O0.OooO00o(oooO0O0, "TLS_AES_256_GCM_SHA384");
        f57194OooOo00 = OooO0O0.OooO00o(oooO0O0, "TLS_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_8_SHA256");
    }

    public o00O0O0(String str) {
        this.f57195OooO00o = str;
    }

    @NotNull
    public final String toString() {
        return this.f57195OooO00o;
    }
}
