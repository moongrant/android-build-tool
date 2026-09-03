package p412o0Oo0o00;

import OooO00o.OooO00o;
import com.facebook.internal.security.CertificateUtil;
import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p016OooOoO0.OooOo00;
import p413o0Oo0o0O.o000000;
import p413o0Oo0o0O.o00Ooo;
import p413o0Oo0o0O.o0O0O00;
import p414o0Oo0o0o.o00000O0;
import p416o0Oo0oO0.o0ooOOo;
import p419o0Oo0oo0.o0000Ooo;
import p674o0oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0000O0O f39201OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O00 f39202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00 f39203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f39204OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000O0 f39206OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0ooOOo f39207OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f39209OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39210OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Object f39211OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f39205OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Protocol f39208OooO0oO = Protocol.HTTP_1_1;

    public o0000(o0000O00 o0000o00, o000O00 o000o01) {
        this.f39202OooO00o = o0000o00;
        this.f39203OooO0O0 = o000o01;
    }

    public final void OooO00o(int i, int i2, int i3, o000O000 o000o001, o00Ooo o00ooo2) throws Throwable {
        SSLSocket sSLSocket;
        this.f39204OooO0OO.setSoTimeout(i2);
        o0O0O00.f39356OooO00o.OooO0OO(this.f39204OooO0OO, this.f39203OooO0O0.f39301OooO0OO, i);
        o000O00 o000o01 = this.f39203OooO0O0;
        if (o000o01.f39299OooO00o.f39341OooO0o0 != null) {
            if (o000o01.f39300OooO0O0.type() == Proxy.Type.HTTP) {
                o0000O.OooO00o oooO00o = new o0000O.OooO00o();
                oooO00o.f39267OooO00o = "https";
                String str = o000o001.f39302OooO00o.f39262OooO0Oo;
                if (str == null) {
                    throw new IllegalArgumentException("host == null");
                }
                String strOooO0O0 = o0000O.OooO00o.OooO0O0(str, 0, str.length());
                if (strOooO0O0 == null) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo("unexpected host: ", str));
                }
                oooO00o.f39270OooO0Oo = strOooO0O0;
                int i4 = o000o001.f39302OooO00o.f39264OooO0o0;
                if (i4 > 0 && i4 <= 65535) {
                    oooO00o.f39272OooO0o0 = i4;
                    o0000O o0000oOooO00o = oooO00o.OooO00o();
                    o000O000.OooO00o oooO00o2 = new o000O000.OooO00o();
                    oooO00o2.f39308OooO00o = o0000oOooO00o;
                    oooO00o2.f39310OooO0OO.OooO0oO("Host", o000000.OooO0oO(o0000oOooO00o));
                    oooO00o2.f39310OooO0OO.OooO0oO("Proxy-Connection", "Keep-Alive");
                    String strOooO0O1 = o000o001.OooO0O0("User-Agent");
                    if (strOooO0O1 != null) {
                        oooO00o2.OooO0O0("User-Agent", strOooO0O1);
                    }
                    String strOooO0O2 = o000o001.OooO0O0("Proxy-Authorization");
                    if (strOooO0O2 != null) {
                        oooO00o2.OooO0O0("Proxy-Authorization", strOooO0O2);
                    }
                    o000O000 o000o000OooO00o = oooO00o2.OooO00o();
                    o0ooOOo o0ooooo2 = new o0ooOOo(this.f39202OooO00o, this, this.f39204OooO0OO);
                    o0ooooo2.OooO0o0(i2, i3);
                    o0000O o0000o2 = o000o000OooO00o.f39302OooO00o;
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CONNECT ");
                    sbOooO0o0.append(o0000o2.f39262OooO0Oo);
                    sbOooO0o0.append(CertificateUtil.DELIMITER);
                    String strOooO00o = o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, o0000o2.f39264OooO0o0, " HTTP/1.1");
                    while (true) {
                        o0ooooo2.OooO0o(o000o000OooO00o.f39304OooO0OO, strOooO00o);
                        o0ooooo2.f39625OooO0o0.flush();
                        o000O0o.OooO00o oooO00oOooO0Oo = o0ooooo2.OooO0Oo();
                        oooO00oOooO0Oo.f39324OooO00o = o000o000OooO00o;
                        o000O0o o000o0oOooO00o = oooO00oOooO0Oo.OooO00o();
                        Comparator<String> comparator = p416o0Oo0oO0.o0O0O00.f39585OooO00o;
                        long jOooO00o = p416o0Oo0oO0.o0O0O00.OooO00o(o000o0oOooO00o.f39317OooO0o);
                        if (jOooO00o == -1) {
                            jOooO00o = 0;
                        }
                        o0O0O0O o0o0o0oOooO0O0 = o0ooooo2.OooO0O0(jOooO00o);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        o000000.OooOO0o(o0o0o0oOooO0O0, Integer.MAX_VALUE);
                        ((o0ooOOo.OooO) o0o0o0oOooO0O0).close();
                        int i5 = o000o0oOooO00o.f39315OooO0OO;
                        if (i5 == 200) {
                            if (o0ooooo2.f39623OooO0Oo.f52063Oooo0o.f52099Oooo0oO <= 0) {
                                break;
                            } else {
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                        } else {
                            if (i5 != 407) {
                                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unexpected response code for CONNECT: ");
                                sbOooO0o1.append(o000o0oOooO00o.f39315OooO0OO);
                                throw new IOException(sbOooO0o1.toString());
                            }
                            o000O00 o000o02 = this.f39203OooO0O0;
                            o000o000OooO00o = p416o0Oo0oO0.o0O0O00.OooO0OO(o000o02.f39299OooO00o.f39343OooO0oo, o000o0oOooO00o, o000o02.f39300OooO0O0);
                            if (o000o000OooO00o == null) {
                                throw new IOException("Failed to authenticate with proxy");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("unexpected port: ", i4));
                }
            }
            o000OOo o000ooo2 = this.f39203OooO0O0.f39299OooO00o;
            try {
                try {
                    sSLSocket = (SSLSocket) o000ooo2.f39341OooO0o0.createSocket(this.f39204OooO0OO, o000ooo2.f39337OooO0O0, o000ooo2.f39338OooO0OO, true);
                    try {
                        o0000oo o0000ooVarOooO00o = o00ooo2.OooO00o(sSLSocket);
                        if (o0000ooVarOooO00o.f39294OooO0Oo) {
                            o0O0O00.f39356OooO00o.OooO0O0(sSLSocket, o000ooo2.f39337OooO0O0, o000ooo2.f39335OooO);
                        }
                        sSLSocket.startHandshake();
                        o0000O0O o0000o0oOooO00o = o0000O0O.OooO00o(sSLSocket.getSession());
                        if (!o000ooo2.f39340OooO0o.verify(o000ooo2.f39337OooO0O0, sSLSocket.getSession())) {
                            X509Certificate x509Certificate = (X509Certificate) o0000o0oOooO00o.f39284OooO0O0.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + o000ooo2.f39337OooO0O0 + " not verified:\n    certificate: " + o00000OO.OooO0O0(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o0000Ooo.OooO00o(x509Certificate));
                        }
                        o000ooo2.f39342OooO0oO.OooO00o(o000ooo2.f39337OooO0O0, o0000o0oOooO00o.f39284OooO0O0);
                        String strOooO0Oo = o0000ooVarOooO00o.f39294OooO0Oo ? o0O0O00.f39356OooO00o.OooO0Oo(sSLSocket) : null;
                        this.f39208OooO0oO = strOooO0Oo != null ? Protocol.OooO00o(strOooO0Oo) : Protocol.HTTP_1_1;
                        this.f39201OooO = o0000o0oOooO00o;
                        this.f39204OooO0OO = sSLSocket;
                        o0O0O00.f39356OooO00o.OooO00o(sSLSocket);
                    } catch (AssertionError e) {
                        e = e;
                        if (!o000000.OooOO0O(e)) {
                            throw e;
                        }
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        if (sSLSocket != null) {
                            o0O0O00.f39356OooO00o.OooO00o(sSLSocket);
                        }
                        o000000.OooO0Oo(sSLSocket);
                        throw th;
                    }
                } catch (AssertionError e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = null;
            }
        }
        Protocol protocol = this.f39208OooO0oO;
        if (protocol != Protocol.SPDY_3 && protocol != Protocol.HTTP_2) {
            this.f39207OooO0o0 = new o0ooOOo(this.f39202OooO00o, this, this.f39204OooO0OO);
            return;
        }
        this.f39204OooO0OO.setSoTimeout(0);
        o00000O0.OooO0OO oooO0OO = new o00000O0.OooO0OO(this.f39203OooO0O0.f39299OooO00o.f39337OooO0O0, this.f39204OooO0OO);
        oooO0OO.f39462OooO0OO = this.f39208OooO0oO;
        o00000O0 o00000o1 = new o00000O0(oooO0OO);
        this.f39206OooO0o = o00000o1;
        o00000o1.f39451OooooOO.Oooo00O();
        o00000o1.f39451OooooOO.Oooo(o00000o1.f39446OoooOoO);
        int iOooO0O0 = o00000o1.f39446OoooOoO.OooO0O0();
        if (iOooO0O0 != 65536) {
            o00000o1.f39451OooooOO.OooO0oO(0, iOooO0O0 - 65536);
        }
    }

    public final boolean OooO0O0() {
        return (this.f39204OooO0OO.isClosed() || this.f39204OooO0OO.isInputShutdown() || this.f39204OooO0OO.isOutputShutdown()) ? false : true;
    }

    public final boolean OooO0OO() {
        return this.f39206OooO0o != null;
    }

    public final boolean OooO0Oo() {
        boolean z;
        o00000O0 o00000o1 = this.f39206OooO0o;
        if (o00000o1 != null) {
            synchronized (o00000o1) {
                z = o00000o1.f39442OoooOO0 != Long.MAX_VALUE;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0o0(Object obj) {
        if (OooO0OO()) {
            return;
        }
        synchronized (this.f39202OooO00o) {
            if (this.f39211OooOO0O != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.f39211OooOO0O = obj;
        }
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Connection{");
        sbOooO0o0.append(this.f39203OooO0O0.f39299OooO00o.f39337OooO0O0);
        sbOooO0o0.append(CertificateUtil.DELIMITER);
        sbOooO0o0.append(this.f39203OooO0O0.f39299OooO00o.f39338OooO0OO);
        sbOooO0o0.append(", proxy=");
        sbOooO0o0.append(this.f39203OooO0O0.f39300OooO0O0);
        sbOooO0o0.append(" hostAddress=");
        sbOooO0o0.append(this.f39203OooO0O0.f39301OooO0OO.getAddress().getHostAddress());
        sbOooO0o0.append(" cipherSuite=");
        o0000O0O o0000o0o2 = this.f39201OooO;
        sbOooO0o0.append(o0000o0o2 != null ? o0000o0o2.f39283OooO00o : "none");
        sbOooO0o0.append(" protocol=");
        sbOooO0o0.append(this.f39208OooO0oO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
