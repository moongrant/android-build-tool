package p660o0ooo0o0;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.NativeCrypto;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51233OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Comparator<String> f51234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, o00O00> f51235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51239OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51240OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51241OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51242OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51243OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51244OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51245OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51246OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51247OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51248OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51249OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00 f51250OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO0O0 f51251OooOo00;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f51252OooO00o;

    public static final class OooO00o implements Comparator<String> {
        /* JADX WARN: Code duplicated, block: B:10:0x0030 A[RETURN, SYNTHETIC] */
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
                    if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                        return -1;
                    }
                    return 1;
                }
            }
            int length = a.length();
            int length2 = b.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    public static final class OooO0O0 {
        public static final o00O00 OooO00o(OooO0O0 oooO0O0, String str) {
            o00O00 o00o01 = new o00O00(str);
            o00O00.f51235OooO0OO.put(str, o00o01);
            return o00o01;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.String, o0ooo0o0.o00O00>] */
        @JvmStatic
        @NotNull
        public final synchronized o00O00 OooO0O0(@NotNull String javaName) {
            o00O00 o00o01;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            ?? r0 = o00O00.f51235OooO0OO;
            o00o01 = (o00O00) r0.get(javaName);
            if (o00o01 == null) {
                o00o01 = (o00O00) r0.get(OooO0OO(javaName));
                if (o00o01 == null) {
                    o00o01 = new o00O00(javaName);
                }
                r0.put(javaName, o00o01);
            }
            return o00o01;
        }

        public final String OooO0OO(String str) {
            if (StringsKt.OooOoOO(str, "TLS_")) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String strSubstring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!StringsKt.OooOoOO(str, "SSL_")) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TLS_");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring2);
            return sb2.toString();
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f51251OooOo00 = oooO0O0;
        f51234OooO0O0 = new OooO00o();
        f51235OooO0OO = new LinkedHashMap();
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_NULL_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_MD5");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_RC4_128_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_DES_CBC_SHA");
        f51236OooO0Oo = OooO0O0.OooO00o(oooO0O0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
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
        f51238OooO0o0 = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f51237OooO0o = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_CBC_SHA");
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
        f51239OooO0oO = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f51240OooO0oo = OooO0O0.OooO00o(oooO0O0, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, NativeCrypto.TLS_EMPTY_RENEGOTIATION_INFO_SCSV);
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
        f51233OooO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f51241OooOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
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
        f51242OooOO0O = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f51243OooOO0o = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f51245OooOOO0 = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f51244OooOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f51246OooOOOO = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f51247OooOOOo = OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f51249OooOOo0 = OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_GCM_SHA256");
        f51248OooOOo = OooO0O0.OooO00o(oooO0O0, "TLS_AES_256_GCM_SHA384");
        f51250OooOOoo = OooO0O0.OooO00o(oooO0O0, "TLS_CHACHA20_POLY1305_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_SHA256");
        OooO0O0.OooO00o(oooO0O0, "TLS_AES_128_CCM_8_SHA256");
    }

    public o00O00(String str) {
        this.f51252OooO00o = str;
    }

    @NotNull
    public final String toString() {
        return this.f51252OooO00o;
    }
}
