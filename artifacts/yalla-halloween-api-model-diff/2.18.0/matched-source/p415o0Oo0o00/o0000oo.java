package p415o0Oo0o00;

import OooO0o.OooO0o;
import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.TlsVersion;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p016OooOoO0.OooOo00;
import p416o0Oo0o0O.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0000oo f39308OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0000oo f39309OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0000oo f39310OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f39311OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f39312OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f39313OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f39314OooO0Oo;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        OooO00o oooO00o = new OooO00o(true);
        String[] strArr = new String[14];
        for (int i = 0; i < 14; i++) {
            strArr[i] = cipherSuiteArr[i].javaName;
        }
        oooO00o.f39316OooO0O0 = strArr;
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        oooO00o.OooO00o(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion);
        if (!oooO00o.f39315OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o.f39318OooO0Oo = true;
        o0000oo o0000ooVar = new o0000oo(oooO00o);
        f39309OooO0o0 = o0000ooVar;
        OooO00o oooO00o2 = new OooO00o(o0000ooVar);
        oooO00o2.OooO00o(tlsVersion);
        if (!oooO00o2.f39315OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o2.f39318OooO0Oo = true;
        f39308OooO0o = new o0000oo(oooO00o2);
        f39310OooO0oO = new o0000oo(new OooO00o(false));
    }

    public o0000oo(OooO00o oooO00o) {
        this.f39311OooO00o = oooO00o.f39315OooO00o;
        this.f39312OooO0O0 = oooO00o.f39316OooO0O0;
        this.f39313OooO0OO = oooO00o.f39317OooO0OO;
        this.f39314OooO0Oo = oooO00o.f39318OooO0Oo;
    }

    public static boolean OooO0O0(String[] strArr, String[] strArr2) {
        boolean z;
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (o000000.OooO0o(str, strArr2[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OooO00o(SSLSocket sSLSocket) {
        if (!this.f39311OooO00o) {
            return false;
        }
        if (!OooO0O0(this.f39313OooO0OO, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f39312OooO0O0 == null) {
            return sSLSocket.getEnabledCipherSuites().length > 0;
        }
        return OooO0O0(this.f39312OooO0O0, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        boolean z = this.f39311OooO00o;
        if (z != o0000ooVar.f39311OooO00o) {
            return false;
        }
        return !z || (Arrays.equals(this.f39312OooO0O0, o0000ooVar.f39312OooO0O0) && Arrays.equals(this.f39313OooO0OO, o0000ooVar.f39313OooO0OO) && this.f39314OooO0Oo == o0000ooVar.f39314OooO0Oo);
    }

    public final int hashCode() {
        if (this.f39311OooO00o) {
            return ((((527 + Arrays.hashCode(this.f39312OooO0O0)) * 31) + Arrays.hashCode(this.f39313OooO0OO)) * 31) + (!this.f39314OooO0Oo ? 1 : 0);
        }
        return 17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    public final String toString() {
        List listOooO;
        CipherSuite cipherSuiteValueOf;
        TlsVersion tlsVersion;
        if (!this.f39311OooO00o) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f39312OooO0O0;
        if (strArr == null) {
            listOooO = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.f39312OooO0O0;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str.startsWith("SSL_")) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("TLS_");
                    sbOooO0O0.append(str.substring(4));
                    cipherSuiteValueOf = CipherSuite.valueOf(sbOooO0O0.toString());
                } else {
                    cipherSuiteValueOf = CipherSuite.valueOf(str);
                }
                cipherSuiteArr[i] = cipherSuiteValueOf;
                i++;
            }
            listOooO = o000000.OooO(cipherSuiteArr);
        }
        StringBuilder sbOooO00o = OooO0o.OooO00o("ConnectionSpec(cipherSuites=", listOooO == null ? "[use default]" : listOooO.toString(), ", tlsVersions=");
        TlsVersion[] tlsVersionArr = new TlsVersion[this.f39313OooO0OO.length];
        int i2 = 0;
        while (true) {
            String[] strArr3 = this.f39313OooO0OO;
            if (i2 >= strArr3.length) {
                sbOooO00o.append(o000000.OooO(tlsVersionArr));
                sbOooO00o.append(", supportsTlsExtensions=");
                sbOooO00o.append(this.f39314OooO0Oo);
                sbOooO00o.append(")");
                return sbOooO00o.toString();
            }
            String str2 = strArr3[i2];
            Objects.requireNonNull(str2);
            str2.hashCode();
            byte b = -1;
            switch (str2) {
                case "TLSv1.1":
                    b = 0;
                case "TLSv1.2":
                    b = 1;
                case "SSLv3":
                    b = 2;
                case "TLSv1":
                    b = 3;
                default:
                    switch (b) {
                        case 0:
                            tlsVersion = TlsVersion.TLS_1_1;
                            break;
                        case 1:
                            tlsVersion = TlsVersion.TLS_1_2;
                            break;
                        case 2:
                            tlsVersion = TlsVersion.SSL_3_0;
                            break;
                        case 3:
                            tlsVersion = TlsVersion.TLS_1_0;
                            break;
                        default:
                            throw new IllegalArgumentException(OooOo00.OooO00o("Unexpected TLS version: ", str2));
                    }
            }
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f39315OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String[] f39316OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String[] f39317OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f39318OooO0Oo;

        public OooO00o(boolean z) {
            this.f39315OooO00o = z;
        }

        public final OooO00o OooO00o(TlsVersion... tlsVersionArr) {
            if (!this.f39315OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            this.f39317OooO0OO = strArr;
            return this;
        }

        public OooO00o(o0000oo o0000ooVar) {
            this.f39315OooO00o = o0000ooVar.f39311OooO00o;
            this.f39316OooO0O0 = o0000ooVar.f39312OooO0O0;
            this.f39317OooO0OO = o0000ooVar.f39313OooO0OO;
            this.f39318OooO0Oo = o0000ooVar.f39314OooO0Oo;
        }
    }
}
