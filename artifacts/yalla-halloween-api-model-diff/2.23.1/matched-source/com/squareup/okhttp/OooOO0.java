package com.squareup.okhttp;

import com.google.android.gms.internal.measurement.o00oOoo;
import com.google.firebase.perf.FirebasePerformance;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p341o0OO0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O f21079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f21080OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f21081OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0OO.OooOO0O f21082OooO0Oo;

    public OooOO0(o00O0O o00o0o2, o00Oo0 o00oo1) {
        SSLSocketFactory sSLSocketFactory;
        o00O0O o00o0o3 = new o00O0O(o00o0o2);
        if (o00o0o3.f21152OooOO0O == null) {
            o00o0o3.f21152OooOO0O = ProxySelector.getDefault();
        }
        if (o00o0o3.f21153OooOO0o == null) {
            o00o0o3.f21153OooOO0o = CookieHandler.getDefault();
        }
        if (o00o0o3.f21156OooOOOO == null) {
            o00o0o3.f21156OooOOOO = SocketFactory.getDefault();
        }
        if (o00o0o3.f21157OooOOOo == null) {
            synchronized (o00o0o2) {
                if (o00O0O.f21144OooOooO == null) {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        o00O0O.f21144OooOooO = sSLContext.getSocketFactory();
                    } catch (GeneralSecurityException unused) {
                        throw new AssertionError();
                    }
                }
                sSLSocketFactory = o00O0O.f21144OooOooO;
            }
            o00o0o3.f21157OooOOOo = sSLSocketFactory;
        }
        if (o00o0o3.f21159OooOOo0 == null) {
            o00o0o3.f21159OooOOo0 = o0OOO00o.OooO0O0.f42748OooO00o;
        }
        if (o00o0o3.f21158OooOOo == null) {
            o00o0o3.f21158OooOOo = OooOO0O.f21083OooO0O0;
        }
        if (o00o0o3.f21160OooOOoo == null) {
            o00o0o3.f21160OooOOoo = o0OO.OooO00o.f42169OooO00o;
        }
        if (o00o0o3.f21163OooOo00 == null) {
            o00o0o3.f21163OooOo00 = OooOOOO.f21099OooO0o;
        }
        if (o00o0o3.f21149OooO0oO == null) {
            o00o0o3.f21149OooO0oO = o00O0O.f21143OooOoo0;
        }
        if (o00o0o3.f21150OooO0oo == null) {
            o00o0o3.f21150OooO0oo = o00O0O.f21142OooOoo;
        }
        if (o00o0o3.f21162OooOo0 == null) {
            o00o0o3.f21162OooOo0 = o0OOO0o.f42585OooO00o;
        }
        this.f21079OooO00o = o00o0o3;
        this.f21081OooO0OO = o00oo1;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x0230  */
    /* JADX WARN: Code duplicated, block: B:156:0x0233  */
    /* JADX WARN: Code duplicated, block: B:159:0x023a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0257  */
    /* JADX WARN: Code duplicated, block: B:175:0x025b  */
    /* JADX WARN: Code duplicated, block: B:201:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0067. Please report as an issue. */
    public final o00Ooo OooO00o() throws Throwable {
        boolean z;
        boolean z2;
        o00Oo0 o00oo1;
        o00Oo0 o00oo0OooO00o;
        String strOooO0OO;
        o000oOoO o000ooooOooO0OO;
        o00Oo0.OooO00o oooO00o;
        String str;
        o00O0O o00o0o2 = this.f21079OooO00o;
        if (o00o0o2.f21145OooO.size() > 0) {
            return ((o0OoOo0) o00o0o2.f21145OooO.get(0)).OooO00o();
        }
        o00Oo0 o00oo2 = this.f21081OooO0OO;
        o00oo2.getClass();
        this.f21082OooO0Oo = new o0OO.OooOO0O(this.f21079OooO00o, o00oo2, false, false, false, null, null, null, null);
        int i = 0;
        while (true) {
            o0OO.OooOO0O oooOO0O = null;
            boolean z3 = true;
            try {
                this.f21082OooO0Oo.OooO0oo();
                this.f21082OooO0Oo.OooO0o();
                o0OO.OooOO0O oooOO0O2 = this.f21082OooO0Oo;
                o00Ooo o00ooo2 = oooOO0O2.f42194OooOOO;
                if (o00ooo2 == null) {
                    throw new IllegalStateException();
                }
                if (o00ooo2 == null) {
                    throw new IllegalStateException();
                }
                o00oO0o o00oo0o2 = oooOO0O2.f42188OooO0o0;
                o00O0O o00o0o3 = oooOO0O2.f42183OooO00o;
                Proxy proxy = o00oo0o2 != null ? o00oo0o2.f21201OooO0O0 : o00o0o3.f21147OooO0o;
                int i2 = o00ooo2.f21182OooO0OO;
                o00Oo0 o00oo3 = oooOO0O2.f42192OooOO0O;
                if (i2 != 307 && i2 != 308) {
                    if (i2 != 401) {
                        if (i2 != 407) {
                            switch (i2) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    if (!o00o0o3.f21165OooOo0o) {
                                        o000oOoO o000oooo2 = o00oo3.f21169OooO00o;
                                        o000oooo2.getClass();
                                        o000ooooOooO0OO = new o000oOoO.OooO00o().OooO0OO(o000oooo2, strOooO0OO);
                                        if (o000ooooOooO0OO != null) {
                                            if (o000ooooOooO0OO.f21126OooO00o.equals(o00oo3.f21169OooO00o.f21126OooO00o)) {
                                            }
                                            oooO00o = new o00Oo0.OooO00o(o00oo3);
                                            str = o00oo3.f21170OooO0O0;
                                            if (!o00oOoo.OooO0O0(str)) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                oooO00o.OooO0OO("GET");
                                                oooO00o.f21177OooO0OO.OooO0o0("Transfer-Encoding");
                                                oooO00o.f21177OooO0OO.OooO0o0("Content-Length");
                                                oooO00o.f21177OooO0OO.OooO0o0("Content-Type");
                                            }
                                            if (!oooOO0O2.OooO0oO(o000ooooOooO0OO)) {
                                                oooO00o.f21177OooO0OO.OooO0o0("Authorization");
                                            }
                                            oooO00o.f21175OooO00o = o000ooooOooO0OO;
                                            o00oo0OooO00o = oooO00o.OooO00o();
                                            o00oo1 = o00oo0OooO00o;
                                        } else {
                                            o00oo1 = null;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    o00oo1 = null;
                                    break;
                            }
                        } else if (proxy.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    }
                    o00oo0OooO00o = o0OO.OooOOOO.OooO0OO(o00o0o3.f21160OooOOoo, oooOO0O2.f42194OooOOO, proxy);
                    o00oo1 = o00oo0OooO00o;
                } else if (!o00oo3.f21170OooO0O0.equals("GET") && !o00oo3.f21170OooO0O0.equals("HEAD")) {
                    o00oo1 = null;
                } else if (!o00o0o3.f21165OooOo0o || (strOooO0OO = oooOO0O2.f42194OooOOO.OooO0OO("Location")) == null) {
                    o00oo1 = null;
                } else {
                    o000oOoO o000oooo3 = o00oo3.f21169OooO00o;
                    o000oooo3.getClass();
                    o000ooooOooO0OO = new o000oOoO.OooO00o().OooO0OO(o000oooo3, strOooO0OO);
                    if (o000ooooOooO0OO != null) {
                        o00oo1 = null;
                    } else if (!o000ooooOooO0OO.f21126OooO00o.equals(o00oo3.f21169OooO00o.f21126OooO00o) || o00o0o3.f21164OooOo0O) {
                        oooO00o = new o00Oo0.OooO00o(o00oo3);
                        str = o00oo3.f21170OooO0O0;
                        if (!o00oOoo.OooO0O0(str) && !str.equals(FirebasePerformance.HttpMethod.DELETE)) {
                            z3 = false;
                        }
                        if (z3) {
                            oooO00o.OooO0OO("GET");
                            oooO00o.f21177OooO0OO.OooO0o0("Transfer-Encoding");
                            oooO00o.f21177OooO0OO.OooO0o0("Content-Length");
                            oooO00o.f21177OooO0OO.OooO0o0("Content-Type");
                        }
                        if (!oooOO0O2.OooO0oO(o000ooooOooO0OO)) {
                            oooO00o.f21177OooO0OO.OooO0o0("Authorization");
                        }
                        oooO00o.f21175OooO00o = o000ooooOooO0OO;
                        o00oo0OooO00o = oooO00o.OooO00o();
                        o00oo1 = o00oo0OooO00o;
                    } else {
                        o00oo1 = null;
                    }
                }
                if (o00oo1 == null) {
                    o0OO.OooOO0O oooOO0O3 = this.f21082OooO0Oo;
                    o0OO.o0OoOo0 o0oooo1 = oooOO0O3.f42189OooO0oO;
                    if (o0oooo1 != null && oooOO0O3.f42184OooO0O0 != null) {
                        o0oooo1.OooO0o();
                    }
                    oooOO0O3.f42184OooO0O0 = null;
                    return o00ooo2;
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("Too many follow-up requests: ", i));
                }
                if (!this.f21082OooO0Oo.OooO0oO(o00oo1.f21169OooO00o)) {
                    o0OO.OooOO0O oooOO0O4 = this.f21082OooO0Oo;
                    o0OO.o0OoOo0 o0oooo2 = oooOO0O4.f42189OooO0oO;
                    if (o0oooo2 != null && oooOO0O4.f42184OooO0O0 != null) {
                        o0oooo2.OooO0o();
                    }
                    oooOO0O4.f42184OooO0O0 = null;
                }
                this.f21082OooO0Oo = new o0OO.OooOO0O(this.f21079OooO00o, o00oo1, false, false, false, this.f21082OooO0Oo.OooO00o(), null, null, o00ooo2);
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                o0OO.OooOO0O oooOO0O5 = this.f21082OooO0Oo;
                o0OO.Oooo0 oooo0 = oooOO0O5.f42186OooO0Oo;
                if (oooo0 != null && oooOO0O5.f42184OooO0O0 != null) {
                    oooOO0O5.OooO0OO(oooo0, e2.f21124OooO0Oo);
                }
                o0OO.Oooo0 oooo1 = oooOO0O5.f42186OooO0Oo;
                if (oooo1 != null || oooOO0O5.f42184OooO0O0 != null) {
                    if (oooo1 == null) {
                        if (!oooOO0O5.f42183OooO00o.f21161OooOo) {
                            IOException iOException = e2.f21124OooO0Oo;
                            z3 = (!(iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
                        }
                        if (z3) {
                            oooOO0O = new o0OO.OooOO0O(oooOO0O5.f42183OooO00o, oooOO0O5.f42192OooOO0O, oooOO0O5.f42191OooOO0, oooOO0O5.f42197OooOOOo, oooOO0O5.f42199OooOOo0, oooOO0O5.OooO00o(), oooOO0O5.f42186OooO0Oo, (o0OO.Oooo000) oooOO0O5.f42196OooOOOO, oooOO0O5.f42187OooO0o);
                        }
                    } else {
                        if (oooo1.f42213OooO < oooo1.f42221OooO0oo.size()) {
                            z2 = true;
                        } else if ((oooo1.f42220OooO0oO < oooo1.f42218OooO0o.size()) || (!oooo1.f42222OooOO0.isEmpty())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (!oooOO0O5.f42183OooO00o.f21161OooOo) {
                                IOException iOException2 = e2.f21124OooO0Oo;
                                if (!(iOException2 instanceof ProtocolException)) {
                                }
                            }
                            if (z3) {
                                oooOO0O = new o0OO.OooOO0O(oooOO0O5.f42183OooO00o, oooOO0O5.f42192OooOO0O, oooOO0O5.f42191OooOO0, oooOO0O5.f42197OooOOOo, oooOO0O5.f42199OooOOo0, oooOO0O5.OooO00o(), oooOO0O5.f42186OooO0Oo, (o0OO.Oooo000) oooOO0O5.f42196OooOOOO, oooOO0O5.f42187OooO0o);
                            }
                        }
                    }
                }
                if (oooOO0O == null) {
                    throw e2.f21124OooO0Oo;
                }
                this.f21082OooO0Oo = oooOO0O;
            } catch (IOException e3) {
                o0OO.OooOO0O oooOO0O6 = this.f21082OooO0Oo;
                o0OO.Oooo0 oooo2 = oooOO0O6.f42186OooO0Oo;
                if (oooo2 != null && oooOO0O6.f42184OooO0O0 != null) {
                    oooOO0O6.OooO0OO(oooo2, e3);
                }
                o0OO.Oooo0 oooo3 = oooOO0O6.f42186OooO0Oo;
                if (oooo3 != null || oooOO0O6.f42184OooO0O0 != null) {
                    if (oooo3 != null) {
                        if (oooo3.f42213OooO < oooo3.f42221OooO0oo.size()) {
                            z = true;
                        } else if ((oooo3.f42220OooO0oO < oooo3.f42218OooO0o.size()) || (!oooo3.f42222OooOO0.isEmpty())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if ((oooOO0O6.f42183OooO00o.f21161OooOo || (e3 instanceof ProtocolException) || (e3 instanceof InterruptedIOException)) ? false : true) {
                                oooOO0O = new o0OO.OooOO0O(oooOO0O6.f42183OooO00o, oooOO0O6.f42192OooOO0O, oooOO0O6.f42191OooOO0, oooOO0O6.f42197OooOOOo, oooOO0O6.f42199OooOOo0, oooOO0O6.OooO00o(), oooOO0O6.f42186OooO0Oo, null, oooOO0O6.f42187OooO0o);
                            }
                        }
                    } else if ((oooOO0O6.f42183OooO00o.f21161OooOo || (e3 instanceof ProtocolException) || (e3 instanceof InterruptedIOException)) ? false : true) {
                        oooOO0O = new o0OO.OooOO0O(oooOO0O6.f42183OooO00o, oooOO0O6.f42192OooOO0O, oooOO0O6.f42191OooOO0, oooOO0O6.f42197OooOOOo, oooOO0O6.f42199OooOOo0, oooOO0O6.OooO00o(), oooOO0O6.f42186OooO0Oo, null, oooOO0O6.f42187OooO0o);
                    }
                }
                if (oooOO0O == null) {
                    throw e3;
                }
                this.f21082OooO0Oo = oooOO0O;
            }
        }
    }
}
