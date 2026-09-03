package com.squareup.okhttp;

import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.LongCompanionObject;
import p337o0OO0ooO.o00000O;
import p338o0OO0ooo.o000OO;
import p338o0OO0ooo.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Oooo0 f21554OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f21555OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f21556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f21557OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public p337o0OO0ooO.Oooo0 f21559OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000OO f21560OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f21562OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f21563OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Object f21564OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f21558OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Protocol f21561OooO0oO = Protocol.HTTP_1_1;

    public OooOOO(OooOOOO oooOOOO, o0ooOOo o0ooooo) {
        this.f21555OooO00o = oooOOOO;
        this.f21556OooO0O0 = o0ooooo;
    }

    public final boolean OooO00o() {
        synchronized (this.f21555OooO00o) {
            if (this.f21564OooOO0O == null) {
                return false;
            }
            this.f21564OooOO0O = null;
            return true;
        }
    }

    public final void OooO0O0(int i, int i2, int i3, o00Ooo o00ooo2, p336o0OO0oo0.OooO0OO oooO0OO) throws Throwable {
        SSLSocket sSLSocket;
        this.f21557OooO0OO.setSoTimeout(i2);
        p336o0OO0oo0.OooOo oooOo = p336o0OO0oo0.OooOo.f43307OooO00o;
        Socket socket = this.f21557OooO0OO;
        o0ooOOo o0ooooo = this.f21556OooO0O0;
        oooOo.OooO0OO(socket, o0ooooo.f21649OooO0OO, i);
        OooO00o oooO00o = o0ooooo.f21647OooO00o;
        SSLSocketFactory sSLSocketFactory = oooO00o.f21520OooO0o0;
        OooOOOO oooOOOO = this.f21555OooO00o;
        boolean z = false;
        if (sSLSocketFactory != null) {
            Proxy proxy = o0ooooo.f21648OooO0O0;
            if (proxy.type() == Proxy.Type.HTTP) {
                o0OoOo0.OooO00o oooO00o2 = new o0OoOo0.OooO00o();
                oooO00o2.f21639OooO00o = "https";
                String str = o00ooo2.f21620OooO00o.f21634OooO0Oo;
                if (str == null) {
                    throw new IllegalArgumentException("host == null");
                }
                String strOooO0O0 = o0OoOo0.OooO00o.OooO0O0(0, str.length(), str);
                if (strOooO0O0 == null) {
                    throw new IllegalArgumentException("unexpected host: ".concat(str));
                }
                oooO00o2.f21642OooO0Oo = strOooO0O0;
                int i4 = o00ooo2.f21620OooO00o.f21636OooO0o0;
                if (i4 > 0 && i4 <= 65535) {
                    oooO00o2.f21644OooO0o0 = i4;
                    o0OoOo0 o0oooo0OooO00o = oooO00o2.OooO00o();
                    o00Ooo.OooO00o oooO00o3 = new o00Ooo.OooO00o();
                    oooO00o3.f21626OooO00o = o0oooo0OooO00o;
                    oooO00o3.f21628OooO0OO.OooO0o("Host", p336o0OO0oo0.o000oOoO.OooO0o0(o0oooo0OooO00o));
                    oooO00o3.f21628OooO0OO.OooO0o("Proxy-Connection", "Keep-Alive");
                    String strOooO00o = o00ooo2.OooO00o("User-Agent");
                    if (strOooO00o != null) {
                        oooO00o3.OooO0O0("User-Agent", strOooO00o);
                    }
                    String strOooO00o2 = o00ooo2.OooO00o("Proxy-Authorization");
                    if (strOooO00o2 != null) {
                        oooO00o3.OooO0O0("Proxy-Authorization", strOooO00o2);
                    }
                    o00Ooo o00oooOooO00o = oooO00o3.OooO00o();
                    o000OO o000oo2 = new o000OO(oooOOOO, this, this.f21557OooO0OO);
                    o000oo2.OooO0Oo(i2, i3);
                    StringBuilder sb = new StringBuilder("CONNECT ");
                    o0OoOo0 o0oooo0 = o00oooOooO00o.f21620OooO00o;
                    sb.append(o0oooo0.f21634OooO0Oo);
                    sb.append(CertificateUtil.DELIMITER);
                    String strOooO0O1 = p022Oooo00O.OooOO0.OooO0O0(sb, o0oooo0.f21636OooO0o0, " HTTP/1.1");
                    while (true) {
                        o000oo2.OooO0o0(o00oooOooO00o.f21622OooO0OO, strOooO0O1);
                        o000oo2.f43532OooO0o0.flush();
                        oo000o.OooO00o oooO00oOooO0OO = o000oo2.OooO0OO();
                        oooO00oOooO0OO.f21662OooO00o = o00oooOooO00o;
                        oo000o oo000oVarOooO00o = oooO00oOooO0OO.OooO00o();
                        o000Oo0.OooO00o oooO00o4 = o000Oo0.f43555OooO00o;
                        long jOooO00o = o000Oo0.OooO00o(oo000oVarOooO00o.f21655OooO0o);
                        if (jOooO00o == -1) {
                            jOooO00o = 0;
                        }
                        o000OO.OooO oooOOooO0O0 = o000oo2.OooO0O0(jOooO00o);
                        p336o0OO0oo0.o000oOoO.OooO0oo(oooOOooO0O0, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                        oooOOooO0O0.close();
                        int i5 = oo000oVarOooO00o.f21653OooO0OO;
                        if (i5 == 200) {
                            if (o000oo2.f43530OooO0Oo.f60234OooO0o0.f60177OooO0o0 <= 0) {
                                break;
                            } else {
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                        } else {
                            if (i5 != 407) {
                                throw new IOException(android.support.v4.media.OooO00o.OooO00o("Unexpected response code for CONNECT: ", i5));
                            }
                            o00oooOooO00o = o000Oo0.OooO0OO(oooO00o.f21522OooO0oo, oo000oVarOooO00o, proxy);
                            if (o00oooOooO00o == null) {
                                throw new IOException("Failed to authenticate with proxy");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("unexpected port: ", i4));
                }
            }
            SSLSocketFactory sSLSocketFactory2 = oooO00o.f21520OooO0o0;
            String str2 = oooO00o.f21516OooO0O0;
            try {
                try {
                    sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(this.f21557OooO0OO, str2, oooO00o.f21517OooO0OO, true);
                    try {
                        boolean z2 = oooO0OO.OooO00o(sSLSocket).f21580OooO0Oo;
                        if (z2) {
                            p336o0OO0oo0.OooOo.f43307OooO00o.OooO0O0(sSLSocket, str2, oooO00o.f21514OooO);
                        }
                        sSLSocket.startHandshake();
                        Oooo0 oooo0OooO00o = Oooo0.OooO00o(sSLSocket.getSession());
                        boolean zVerify = oooO00o.f21519OooO0o.verify(str2, sSLSocket.getSession());
                        List<Certificate> list = oooo0OooO00o.f21586OooO0O0;
                        if (!zVerify) {
                            X509Certificate x509Certificate = (X509Certificate) list.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + str2 + " not verified:\n    certificate: " + OooOO0O.OooO0O0(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o0OOO00.OooO0O0.OooO00o(x509Certificate));
                        }
                        oooO00o.f21521OooO0oO.OooO00o(str2, list);
                        String strOooO0Oo = z2 ? p336o0OO0oo0.OooOo.f43307OooO00o.OooO0Oo(sSLSocket) : null;
                        this.f21561OooO0oO = strOooO0Oo != null ? Protocol.OooO00o(strOooO0Oo) : Protocol.HTTP_1_1;
                        this.f21554OooO = oooo0OooO00o;
                        this.f21557OooO0OO = sSLSocket;
                        p336o0OO0oo0.OooOo.f43307OooO00o.OooO00o(sSLSocket);
                    } catch (AssertionError e) {
                        e = e;
                        byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
                        if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                            z = true;
                        }
                        if (!z) {
                            throw e;
                        }
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        if (sSLSocket != null) {
                            p336o0OO0oo0.OooOo.f43307OooO00o.OooO00o(sSLSocket);
                        }
                        p336o0OO0oo0.o000oOoO.OooO0OO(sSLSocket);
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
        Protocol protocol = this.f21561OooO0oO;
        if (protocol != Protocol.SPDY_3 && protocol != Protocol.HTTP_2) {
            this.f21560OooO0o0 = new o000OO(oooOOOO, this, this.f21557OooO0OO);
            return;
        }
        this.f21557OooO0OO.setSoTimeout(0);
        o0OO0ooO.Oooo0.OooO0OO oooO0OO2 = new o0OO0ooO.Oooo0.OooO0OO(oooO00o.f21516OooO0O0, this.f21557OooO0OO);
        oooO0OO2.f43360OooO0OO = this.f21561OooO0oO;
        p337o0OO0ooO.Oooo0 oooo0 = new p337o0OO0ooO.Oooo0(oooO0OO2);
        this.f21559OooO0o = oooo0;
        p337o0OO0ooO.Oooo000 oooo000 = oooo0.f43350OooOo0O;
        oooo000.OooOOoo();
        o00000O o00000o = oooo0.f43346OooOOo0;
        oooo000.o00000(o00000o);
        int iOooO0O0 = o00000o.OooO0O0();
        if (iOooO0O0 != 65536) {
            oooo000.OooO0o0(0, iOooO0O0 - 65536);
        }
    }

    public final long OooO0OO() {
        long j;
        p337o0OO0ooO.Oooo0 oooo0 = this.f21559OooO0o;
        if (oooo0 == null) {
            return this.f21562OooO0oo;
        }
        synchronized (oooo0) {
            j = oooo0.f43340OooOO0o;
        }
        return j;
    }

    public final boolean OooO0Oo() {
        return (this.f21557OooO0OO.isClosed() || this.f21557OooO0OO.isInputShutdown() || this.f21557OooO0OO.isOutputShutdown()) ? false : true;
    }

    public final boolean OooO0o() {
        boolean z;
        p337o0OO0ooO.Oooo0 oooo0 = this.f21559OooO0o;
        if (oooo0 == null) {
            return true;
        }
        synchronized (oooo0) {
            z = oooo0.f43340OooOO0o != LongCompanionObject.MAX_VALUE;
        }
        return z;
    }

    public final boolean OooO0o0() {
        return this.f21559OooO0o != null;
    }

    public final void OooO0oO(Object obj) {
        if (OooO0o0()) {
            return;
        }
        synchronized (this.f21555OooO00o) {
            if (this.f21564OooOO0O != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.f21564OooOO0O = obj;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        o0ooOOo o0ooooo = this.f21556OooO0O0;
        sb.append(o0ooooo.f21647OooO00o.f21516OooO0O0);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(o0ooooo.f21647OooO00o.f21517OooO0OO);
        sb.append(", proxy=");
        sb.append(o0ooooo.f21648OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o0ooooo.f21649OooO0OO.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        Oooo0 oooo0 = this.f21554OooO;
        sb.append(oooo0 != null ? oooo0.f21585OooO00o : "none");
        sb.append(" protocol=");
        sb.append(this.f21561OooO0oO);
        sb.append('}');
        return sb.toString();
    }
}
