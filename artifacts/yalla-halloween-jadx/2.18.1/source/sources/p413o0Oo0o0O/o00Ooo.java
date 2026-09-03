package p413o0Oo0o0O;

import OooO00o.OooO00o;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p412o0Oo0o00.o000;
import p412o0Oo0o00.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0000oo> f39351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39352OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f39353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f39354OooO0Oo;

    public o00Ooo(List<o0000oo> list) {
        this.f39351OooO00o = list;
    }

    public final o0000oo OooO00o(SSLSocket sSLSocket) throws IOException {
        o0000oo o0000ooVar;
        boolean z;
        String[] enabledCipherSuites;
        int i = this.f39352OooO0O0;
        int size = this.f39351OooO00o.size();
        while (true) {
            if (i >= size) {
                o0000ooVar = null;
                break;
            }
            o0000ooVar = this.f39351OooO00o.get(i);
            if (o0000ooVar.OooO00o(sSLSocket)) {
                this.f39352OooO0O0 = i + 1;
                break;
            }
            i++;
        }
        if (o0000ooVar == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to find acceptable protocols. isFallback=");
            sbOooO0o0.append(this.f39354OooO0Oo);
            sbOooO0o0.append(", modes=");
            sbOooO0o0.append(this.f39351OooO00o);
            sbOooO0o0.append(", supported protocols=");
            sbOooO0o0.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(sbOooO0o0.toString());
        }
        int i2 = this.f39352OooO0O0;
        while (true) {
            if (i2 >= this.f39351OooO00o.size()) {
                z = false;
                break;
            }
            if (this.f39351OooO00o.get(i2).OooO00o(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f39353OooO0OO = z;
        o000.OooO00o oooO00o = o0ooOOo.f39374OooO0O0;
        boolean z2 = this.f39354OooO0Oo;
        Objects.requireNonNull(oooO00o);
        if (o0000ooVar.f39292OooO0O0 != null) {
            enabledCipherSuites = (String[]) o000000.OooOO0(o0000ooVar.f39292OooO0O0, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z2 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length + 1;
            String[] strArr = new String[length];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length - 1] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        String[] strArr2 = (String[]) o000000.OooOO0(o0000ooVar.f39293OooO0OO, sSLSocket.getEnabledProtocols());
        o0000oo.OooO00o oooO00o2 = new o0000oo.OooO00o(o0000ooVar);
        if (!oooO00o2.f39295OooO00o) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (enabledCipherSuites == null) {
            oooO00o2.f39296OooO0O0 = null;
        } else {
            oooO00o2.f39296OooO0O0 = (String[]) enabledCipherSuites.clone();
        }
        if (!oooO00o2.f39295OooO00o) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr2 == null) {
            oooO00o2.f39297OooO0OO = null;
        } else {
            oooO00o2.f39297OooO0OO = (String[]) strArr2.clone();
        }
        o0000oo o0000ooVar2 = new o0000oo(oooO00o2);
        sSLSocket.setEnabledProtocols(o0000ooVar2.f39293OooO0OO);
        String[] strArr3 = o0000ooVar2.f39292OooO0O0;
        if (strArr3 != null) {
            sSLSocket.setEnabledCipherSuites(strArr3);
        }
        return o0000ooVar;
    }
}
