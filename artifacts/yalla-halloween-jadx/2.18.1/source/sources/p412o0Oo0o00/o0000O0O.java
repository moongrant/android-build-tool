package p412o0Oo0o00;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p086o000OooO.o0O0O00;
import p413o0Oo0o0O.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Certificate> f39284OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Certificate> f39285OooO0OO;

    public o0000O0O(String str, List<Certificate> list, List<Certificate> list2) {
        this.f39283OooO00o = str;
        this.f39284OooO0O0 = list;
        this.f39285OooO0OO = list2;
    }

    public static o0000O0O OooO00o(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listOooO = peerCertificates != null ? o000000.OooO(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new o0000O0O(cipherSuite, listOooO, localCertificates != null ? o000000.OooO(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000O0O)) {
            return false;
        }
        o0000O0O o0000o0o2 = (o0000O0O) obj;
        return this.f39283OooO00o.equals(o0000o0o2.f39283OooO00o) && this.f39284OooO0O0.equals(o0000o0o2.f39284OooO0O0) && this.f39285OooO0OO.equals(o0000o0o2.f39285OooO0OO);
    }

    public final int hashCode() {
        return this.f39285OooO0OO.hashCode() + ((this.f39284OooO0O0.hashCode() + o0O0O00.OooO00o(this.f39283OooO00o, 527, 31)) * 31);
    }
}
