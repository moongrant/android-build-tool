package p157o00OoO00;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SSLSocketFactory f32360OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public X509TrustManager f32361OooO0O0;
    }

    public static class OooO0O0 implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static OooO00o OooO00o() {
        OooO00o oooO00o = new OooO00o();
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            OooO0O0 oooO0O0 = new OooO0O0();
            sSLContext.init(null, new TrustManager[]{oooO0O0}, null);
            oooO00o.f32360OooO00o = sSLContext.getSocketFactory();
            oooO00o.f32361OooO0O0 = oooO0O0;
            return oooO00o;
        } catch (KeyManagementException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }
}
