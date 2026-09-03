package p420o0OoO0OO;

import com.code.android.util.o0000;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p377o0OOoOo.o0000O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class o0Oo0oo {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SSLSocketFactory f45553OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public X509TrustManager f45554OooO0O0;
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
            oooO00o.f45553OooO00o = sSLContext.getSocketFactory();
            oooO00o.f45554OooO0O0 = oooO0O0;
            return oooO00o;
        } catch (KeyManagementException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    public static void OooO0O0(String str, String str2, OooO0OO.OooO0O0 oooO0O0) {
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put(str, str2);
        oooO0O0.f23395OooO0O0 = true;
        oooO0O0.f23396OooO0OO = o0000.OooO0OO(oO00OOo0.setting);
        OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44128OooooOO, linkedHashMapOooO00o, oooO0O0);
    }
}
