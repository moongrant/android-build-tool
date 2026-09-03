package p424o0OoO0Oo;

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
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public class o00OO00O {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SSLSocketFactory f46729OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public X509TrustManager f46730OooO0O0;
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
            oooO00o.f46729OooO00o = sSLContext.getSocketFactory();
            oooO00o.f46730OooO0O0 = oooO0O0;
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
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put(str, str2);
        oooO0O0.f22926OooO0O0 = true;
        oooO0O0.f22927OooO0OO = o0000.OooO0OO(o000000.setting);
        OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43387OooooOO, linkedHashMapOooO00o, oooO0O0);
    }
}
