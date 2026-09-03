package p336o0OO0oo0;

import com.squareup.okhttp.OooOo00;
import com.squareup.okhttp.o00Oo0;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooOo00> f43260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43261OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f43262OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43263OooO0Oo;

    public OooO0OO(List<OooOo00> list) {
        this.f43260OooO00o = list;
    }

    public final OooOo00 OooO00o(SSLSocket sSLSocket) throws IOException {
        OooOo00 oooOo00;
        boolean z;
        int i = this.f43261OooO0O0;
        List<OooOo00> list = this.f43260OooO00o;
        int size = list.size();
        while (true) {
            if (i >= size) {
                oooOo00 = null;
                break;
            }
            oooOo00 = list.get(i);
            if (oooOo00.OooO00o(sSLSocket)) {
                this.f43261OooO0O0 = i + 1;
                break;
            }
            i++;
        }
        if (oooOo00 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f43263OooO0Oo + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i2 = this.f43261OooO0O0;
        while (true) {
            if (i2 >= list.size()) {
                z = false;
                break;
            }
            if (list.get(i2).OooO00o(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f43262OooO0OO = z;
        o00Oo0.OooO00o oooO00o = OooOO0O.f43304OooO0O0;
        boolean z2 = this.f43263OooO0Oo;
        oooO00o.getClass();
        String[] strArr = oooOo00.f21578OooO0O0;
        String[] enabledCipherSuites = strArr != null ? (String[]) o000oOoO.OooO0oO(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        if (z2 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(enabledCipherSuites, 0, strArr2, 0, enabledCipherSuites.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr2;
        }
        String[] strArr3 = (String[]) o000oOoO.OooO0oO(oooOo00.f21579OooO0OO, sSLSocket.getEnabledProtocols());
        OooOo00.OooO00o oooO00o2 = new OooOo00.OooO00o(oooOo00);
        boolean z3 = oooO00o2.f21581OooO00o;
        if (!z3) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (enabledCipherSuites == null) {
            oooO00o2.f21582OooO0O0 = null;
        } else {
            oooO00o2.f21582OooO0O0 = (String[]) enabledCipherSuites.clone();
        }
        if (!z3) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            oooO00o2.f21583OooO0OO = null;
        } else {
            oooO00o2.f21583OooO0OO = (String[]) strArr3.clone();
        }
        OooOo00 oooOo01 = new OooOo00(oooO00o2);
        sSLSocket.setEnabledProtocols(oooOo01.f21579OooO0OO);
        String[] strArr4 = oooOo01.f21578OooO0O0;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        return oooOo00;
    }
}
