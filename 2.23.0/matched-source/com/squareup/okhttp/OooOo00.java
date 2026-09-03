package com.squareup.okhttp;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOo00 f21574OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOo00 f21575OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooOo00 f21576OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f21577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f21578OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f21579OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f21580OooO0Oo;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        OooO00o oooO00o = new OooO00o(true);
        String[] strArr = new String[14];
        for (int i = 0; i < 14; i++) {
            strArr[i] = cipherSuiteArr[i].javaName;
        }
        oooO00o.f21582OooO0O0 = strArr;
        TlsVersion tlsVersion = TlsVersion.TLS_1_0;
        oooO00o.OooO00o(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, tlsVersion);
        if (!oooO00o.f21581OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o.f21584OooO0Oo = true;
        OooOo00 oooOo00 = new OooOo00(oooO00o);
        f21575OooO0o0 = oooOo00;
        OooO00o oooO00o2 = new OooO00o(oooOo00);
        oooO00o2.OooO00o(tlsVersion);
        if (!oooO00o2.f21581OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o2.f21584OooO0Oo = true;
        f21574OooO0o = new OooOo00(oooO00o2);
        f21576OooO0oO = new OooOo00(new OooO00o(false));
    }

    public OooOo00(OooO00o oooO00o) {
        this.f21577OooO00o = oooO00o.f21581OooO00o;
        this.f21578OooO0O0 = oooO00o.f21582OooO0O0;
        this.f21579OooO0OO = oooO00o.f21583OooO0OO;
        this.f21580OooO0Oo = oooO00o.f21584OooO0Oo;
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
                    if (p336o0OO0oo0.o000oOoO.OooO0Oo(str, strArr2[i])) {
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
        if (!this.f21577OooO00o) {
            return false;
        }
        if (!OooO0O0(this.f21579OooO0OO, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr = this.f21578OooO0O0;
        if (strArr == null) {
            return sSLSocket.getEnabledCipherSuites().length > 0;
        }
        return OooO0O0(strArr, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        boolean z = oooOo00.f21577OooO00o;
        boolean z2 = this.f21577OooO00o;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f21578OooO0O0, oooOo00.f21578OooO0O0) && Arrays.equals(this.f21579OooO0OO, oooOo00.f21579OooO0OO) && this.f21580OooO0Oo == oooOo00.f21580OooO0Oo);
    }

    public final int hashCode() {
        if (this.f21577OooO00o) {
            return ((((527 + Arrays.hashCode(this.f21578OooO0O0)) * 31) + Arrays.hashCode(this.f21579OooO0OO)) * 31) + (!this.f21580OooO0Oo ? 1 : 0);
        }
        return 17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[SYNTHETIC] */
    public final String toString() {
        List listOooO0o;
        TlsVersion tlsVersion;
        if (!this.f21577OooO00o) {
            return "ConnectionSpec()";
        }
        int i = 0;
        String[] strArr = this.f21578OooO0O0;
        if (strArr == null) {
            listOooO0o = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                cipherSuiteArr[i2] = str.startsWith("SSL_") ? CipherSuite.valueOf("TLS_" + str.substring(4)) : CipherSuite.valueOf(str);
            }
            listOooO0o = p336o0OO0oo0.o000oOoO.OooO0o(cipherSuiteArr);
        }
        StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("ConnectionSpec(cipherSuites=", listOooO0o == null ? "[use default]" : listOooO0o.toString(), ", tlsVersions=");
        String[] strArr2 = this.f21579OooO0OO;
        TlsVersion[] tlsVersionArr = new TlsVersion[strArr2.length];
        while (i < strArr2.length) {
            String str2 = strArr2[i];
            str2.getClass();
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
                            throw new IllegalArgumentException("Unexpected TLS version: ".concat(str2));
                    }
            }
        }
        sbOooO00o.append(p336o0OO0oo0.o000oOoO.OooO0o(tlsVersionArr));
        sbOooO00o.append(", supportsTlsExtensions=");
        sbOooO00o.append(this.f21580OooO0Oo);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f21581OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String[] f21582OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String[] f21583OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f21584OooO0Oo;

        public OooO00o(boolean z) {
            this.f21581OooO00o = z;
        }

        public final void OooO00o(TlsVersion... tlsVersionArr) {
            if (!this.f21581OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            this.f21583OooO0OO = strArr;
        }

        public OooO00o(OooOo00 oooOo00) {
            this.f21581OooO00o = oooOo00.f21577OooO00o;
            this.f21582OooO0O0 = oooOo00.f21578OooO0O0;
            this.f21583OooO0OO = oooOo00.f21579OooO0OO;
            this.f21584OooO0Oo = oooOo00.f21580OooO0Oo;
        }
    }
}
