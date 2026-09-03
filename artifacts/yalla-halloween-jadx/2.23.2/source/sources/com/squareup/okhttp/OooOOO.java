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
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.o0OO00O;
import p341o0OO0ooo.o00000;
import p341o0OO0ooo.o000000O;
import p341o0OO0ooo.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Oooo000 f21081OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f21082OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00oO0o f21083OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f21084OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000 f21086OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0OO.OooO f21087OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f21089OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f21090OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Object f21091OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f21085OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Protocol f21088OooO0oO = Protocol.HTTP_1_1;

    public OooOOO(OooOOOO oooOOOO, o00oO0o o00oo0o2) {
        this.f21082OooO00o = oooOOOO;
        this.f21083OooO0O0 = o00oo0o2;
    }

    public final boolean OooO00o() {
        synchronized (this.f21082OooO00o) {
            if (this.f21091OooOO0O == null) {
                return false;
            }
            this.f21091OooOO0O = null;
            return true;
        }
    }

    public final void OooO0O0(int i, int i2, int i3, o00Oo0 o00oo1, p340o0OO0ooO.o0OoOo0 o0oooo1) throws Throwable {
        SSLSocket sSLSocket;
        this.f21084OooO0OO.setSoTimeout(i2);
        o0OO00O o0oo00o2 = o0OO00O.f42574OooO00o;
        Socket socket = this.f21084OooO0OO;
        o00oO0o o00oo0o2 = this.f21083OooO0O0;
        o0oo00o2.OooO0OO(socket, o00oo0o2.f21197OooO0OO, i);
        OooO00o oooO00o = o00oo0o2.f21195OooO00o;
        SSLSocketFactory sSLSocketFactory = oooO00o.f21047OooO0o0;
        OooOOOO oooOOOO = this.f21082OooO00o;
        boolean z = false;
        if (sSLSocketFactory != null) {
            Proxy proxy = o00oo0o2.f21196OooO0O0;
            if (proxy.type() == Proxy.Type.HTTP) {
                o000oOoO.OooO00o oooO00o2 = new o000oOoO.OooO00o();
                oooO00o2.f21129OooO00o = "https";
                String str = o00oo1.f21164OooO00o.f21124OooO0Oo;
                if (str == null) {
                    throw new IllegalArgumentException("host == null");
                }
                String strOooO0O0 = o000oOoO.OooO00o.OooO0O0(0, str.length(), str);
                if (strOooO0O0 == null) {
                    throw new IllegalArgumentException("unexpected host: ".concat(str));
                }
                oooO00o2.f21132OooO0Oo = strOooO0O0;
                int i4 = o00oo1.f21164OooO00o.f21126OooO0o0;
                if (i4 > 0 && i4 <= 65535) {
                    oooO00o2.f21134OooO0o0 = i4;
                    o000oOoO o000ooooOooO00o = oooO00o2.OooO00o();
                    o00Oo0.OooO00o oooO00o3 = new o00Oo0.OooO00o();
                    oooO00o3.f21170OooO00o = o000ooooOooO00o;
                    oooO00o3.f21172OooO0OO.OooO0o("Host", o000OOo.OooO0o0(o000ooooOooO00o));
                    oooO00o3.f21172OooO0OO.OooO0o("Proxy-Connection", "Keep-Alive");
                    String strOooO00o = o00oo1.OooO00o("User-Agent");
                    if (strOooO00o != null) {
                        oooO00o3.OooO0O0("User-Agent", strOooO00o);
                    }
                    String strOooO00o2 = o00oo1.OooO00o("Proxy-Authorization");
                    if (strOooO00o2 != null) {
                        oooO00o3.OooO0O0("Proxy-Authorization", strOooO00o2);
                    }
                    o00Oo0 o00oo0OooO00o = oooO00o3.OooO00o();
                    o0OO.OooO oooO = new o0OO.OooO(oooOOOO, this, this.f21084OooO0OO);
                    oooO.OooO0Oo(i2, i3);
                    StringBuilder sb = new StringBuilder("CONNECT ");
                    o000oOoO o000oooo2 = o00oo0OooO00o.f21164OooO00o;
                    sb.append(o000oooo2.f21124OooO0Oo);
                    sb.append(CertificateUtil.DELIMITER);
                    String strOooO00o3 = p022Oooo00O.OooOO0.OooO00o(sb, o000oooo2.f21126OooO0o0, " HTTP/1.1");
                    while (true) {
                        oooO.OooO0o0(o00oo0OooO00o.f21166OooO0OO, strOooO00o3);
                        oooO.f42154OooO0o0.flush();
                        o00Ooo.OooO00o oooO00oOooO0OO = oooO.OooO0OO();
                        oooO00oOooO0OO.f21186OooO00o = o00oo0OooO00o;
                        o00Ooo o00oooOooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO.OooOOOO.OooO00o oooO00o4 = o0OO.OooOOOO.f42212OooO00o;
                        long jOooO00o = o0OO.OooOOOO.OooO00o(o00oooOooO00o.f21179OooO0o);
                        if (jOooO00o == -1) {
                            jOooO00o = 0;
                        }
                        o0OO.OooO.C0444OooO c0444OooOOooO0O0 = oooO.OooO0O0(jOooO00o);
                        o000OOo.OooO0oo(c0444OooOOooO0O0, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                        c0444OooOOooO0O0.close();
                        int i5 = o00oooOooO00o.f21177OooO0OO;
                        if (i5 == 200) {
                            if (oooO.f42152OooO0Oo.f59801OooO0o0.f59828OooO0o0 <= 0) {
                                break;
                            } else {
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                        } else {
                            if (i5 != 407) {
                                throw new IOException(android.support.v4.media.OooO00o.OooO00o("Unexpected response code for CONNECT: ", i5));
                            }
                            o00oo0OooO00o = o0OO.OooOOOO.OooO0OO(oooO00o.f21049OooO0oo, o00oooOooO00o, proxy);
                            if (o00oo0OooO00o == null) {
                                throw new IOException("Failed to authenticate with proxy");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("unexpected port: ", i4));
                }
            }
            SSLSocketFactory sSLSocketFactory2 = oooO00o.f21047OooO0o0;
            String str2 = oooO00o.f21043OooO0O0;
            try {
                try {
                    sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(this.f21084OooO0OO, str2, oooO00o.f21044OooO0OO, true);
                    try {
                        boolean z2 = o0oooo1.OooO00o(sSLSocket).f21108OooO0Oo;
                        if (z2) {
                            o0OO00O.f42574OooO00o.OooO0O0(sSLSocket, str2, oooO00o.f21041OooO);
                        }
                        sSLSocket.startHandshake();
                        Oooo000 oooo000OooO00o = Oooo000.OooO00o(sSLSocket.getSession());
                        boolean zVerify = oooO00o.f21046OooO0o.verify(str2, sSLSocket.getSession());
                        List<Certificate> list = oooo000OooO00o.f21116OooO0O0;
                        if (!zVerify) {
                            X509Certificate x509Certificate = (X509Certificate) list.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + str2 + " not verified:\n    certificate: " + OooOO0O.OooO0O0(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o0OOO00o.OooO0O0.OooO00o(x509Certificate));
                        }
                        oooO00o.f21048OooO0oO.OooO00o(str2, list);
                        String strOooO0Oo = z2 ? o0OO00O.f42574OooO00o.OooO0Oo(sSLSocket) : null;
                        this.f21088OooO0oO = strOooO0Oo != null ? Protocol.OooO00o(strOooO0Oo) : Protocol.HTTP_1_1;
                        this.f21081OooO = oooo000OooO00o;
                        this.f21084OooO0OO = sSLSocket;
                        o0OO00O.f42574OooO00o.OooO00o(sSLSocket);
                    } catch (AssertionError e) {
                        e = e;
                        byte[] bArr = o000OOo.f42529OooO00o;
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
                            o0OO00O.f42574OooO00o.OooO00o(sSLSocket);
                        }
                        o000OOo.OooO0OO(sSLSocket);
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
        Protocol protocol = this.f21088OooO0oO;
        if (protocol != Protocol.SPDY_3 && protocol != Protocol.HTTP_2) {
            this.f21087OooO0o0 = new o0OO.OooO(oooOOOO, this, this.f21084OooO0OO);
            return;
        }
        this.f21084OooO0OO.setSoTimeout(0);
        o00000.OooO0OO oooO0OO = new o00000.OooO0OO(oooO00o.f21043OooO0O0, this.f21084OooO0OO);
        oooO0OO.f42633OooO0OO = this.f21088OooO0oO;
        o00000 o00000Var = new o00000(oooO0OO);
        this.f21086OooO0o = o00000Var;
        o000000O o000000o2 = o00000Var.f42623OooOo0O;
        o000000o2.OooOOoo();
        o000O0 o000o0 = o00000Var.f42619OooOOo0;
        o000000o2.o0OOO0o(o000o0);
        int iOooO0O0 = o000o0.OooO0O0();
        if (iOooO0O0 != 65536) {
            o000000o2.OooO0o0(0, iOooO0O0 - 65536);
        }
    }

    public final long OooO0OO() {
        long j;
        o00000 o00000Var = this.f21086OooO0o;
        if (o00000Var == null) {
            return this.f21089OooO0oo;
        }
        synchronized (o00000Var) {
            j = o00000Var.f42613OooOO0o;
        }
        return j;
    }

    public final boolean OooO0Oo() {
        return (this.f21084OooO0OO.isClosed() || this.f21084OooO0OO.isInputShutdown() || this.f21084OooO0OO.isOutputShutdown()) ? false : true;
    }

    public final boolean OooO0o() {
        boolean z;
        o00000 o00000Var = this.f21086OooO0o;
        if (o00000Var == null) {
            return true;
        }
        synchronized (o00000Var) {
            z = o00000Var.f42613OooOO0o != LongCompanionObject.MAX_VALUE;
        }
        return z;
    }

    public final boolean OooO0o0() {
        return this.f21086OooO0o != null;
    }

    public final void OooO0oO(Object obj) {
        if (OooO0o0()) {
            return;
        }
        synchronized (this.f21082OooO00o) {
            if (this.f21091OooOO0O != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.f21091OooOO0O = obj;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        o00oO0o o00oo0o2 = this.f21083OooO0O0;
        sb.append(o00oo0o2.f21195OooO00o.f21043OooO0O0);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(o00oo0o2.f21195OooO00o.f21044OooO0OO);
        sb.append(", proxy=");
        sb.append(o00oo0o2.f21196OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o00oo0o2.f21197OooO0OO.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        Oooo000 oooo000 = this.f21081OooO;
        sb.append(oooo000 != null ? oooo000.f21115OooO00o : "none");
        sb.append(" protocol=");
        sb.append(this.f21088OooO0oO);
        sb.append('}');
        return sb.toString();
    }
}
