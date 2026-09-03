package com.squareup.okhttp;

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
import p338o0OO0ooo.o0000;
import p338o0OO0ooo.o0000OO0;
import p338o0OO0ooo.o000O0;
import p338o0OO0ooo.o000O000;
import p338o0OO0ooo.o000O0O0;
import p338o0OO0ooo.o000O0Oo;
import p338o0OO0ooo.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f21547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f21548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo f21549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000OO0 f21550OooO0Oo;

    public OooOO0(o00Oo0 o00oo1, o00Ooo o00ooo2) {
        SSLSocketFactory sSLSocketFactory;
        o00Oo0 o00oo2 = new o00Oo0(o00oo1);
        if (o00oo2.f21603OooOO0O == null) {
            o00oo2.f21603OooOO0O = ProxySelector.getDefault();
        }
        if (o00oo2.f21604OooOO0o == null) {
            o00oo2.f21604OooOO0o = CookieHandler.getDefault();
        }
        if (o00oo2.f21607OooOOOO == null) {
            o00oo2.f21607OooOOOO = SocketFactory.getDefault();
        }
        if (o00oo2.f21608OooOOOo == null) {
            synchronized (o00oo1) {
                if (o00Oo0.f21595OooOooO == null) {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        o00Oo0.f21595OooOooO = sSLContext.getSocketFactory();
                    } catch (GeneralSecurityException unused) {
                        throw new AssertionError();
                    }
                }
                sSLSocketFactory = o00Oo0.f21595OooOooO;
            }
            o00oo2.f21608OooOOOo = sSLSocketFactory;
        }
        if (o00oo2.f21610OooOOo0 == null) {
            o00oo2.f21610OooOOo0 = o0OOO00.OooO0O0.f43568OooO00o;
        }
        if (o00oo2.f21609OooOOo == null) {
            o00oo2.f21609OooOOo = OooOO0O.f21551OooO0O0;
        }
        if (o00oo2.f21611OooOOoo == null) {
            o00oo2.f21611OooOOoo = o0000.f43478OooO00o;
        }
        if (o00oo2.f21614OooOo00 == null) {
            o00oo2.f21614OooOo00 = OooOOOO.f21567OooO0o;
        }
        if (o00oo2.f21600OooO0oO == null) {
            o00oo2.f21600OooO0oO = o00Oo0.f21594OooOoo0;
        }
        if (o00oo2.f21601OooO0oo == null) {
            o00oo2.f21601OooO0oo = o00Oo0.f21593OooOoo;
        }
        if (o00oo2.f21613OooOo0 == null) {
            o00oo2.f21613OooOo0 = p336o0OO0oo0.OooOOOO.f43306OooO00o;
        }
        this.f21547OooO00o = o00oo2;
        this.f21549OooO0OO = o00ooo2;
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
    public final oo000o OooO00o() throws Throwable {
        boolean z;
        boolean z2;
        o00Ooo o00ooo2;
        o00Ooo o00oooOooO00o;
        String strOooO0OO;
        o0OoOo0 o0oooo0OooO0OO;
        o00Ooo.OooO00o oooO00o;
        String str;
        o00Oo0 o00oo1 = this.f21547OooO00o;
        if (o00oo1.f21596OooO.size() > 0) {
            return ((o00O0O) o00oo1.f21596OooO.get(0)).OooO00o();
        }
        o00Ooo o00ooo3 = this.f21549OooO0OO;
        o00ooo3.getClass();
        this.f21550OooO0Oo = new o0000OO0(this.f21547OooO00o, o00ooo3, false, false, false, null, null, null, null);
        int i = 0;
        while (true) {
            o0000OO0 o0000oo1 = null;
            boolean z3 = true;
            try {
                this.f21550OooO0Oo.OooO0oo();
                this.f21550OooO0Oo.OooO0o();
                o0000OO0 o0000oo2 = this.f21550OooO0Oo;
                oo000o oo000oVar = o0000oo2.f43501OooOOO;
                if (oo000oVar == null) {
                    throw new IllegalStateException();
                }
                if (oo000oVar == null) {
                    throw new IllegalStateException();
                }
                o0ooOOo o0ooooo = o0000oo2.f43495OooO0o0;
                o00Oo0 o00oo2 = o0000oo2.f43490OooO00o;
                Proxy proxy = o0ooooo != null ? o0ooooo.f21648OooO0O0 : o00oo2.f21598OooO0o;
                int i2 = oo000oVar.f21653OooO0OO;
                o00Ooo o00ooo4 = o0000oo2.f43499OooOO0O;
                if (i2 != 307 && i2 != 308) {
                    if (i2 != 401) {
                        if (i2 != 407) {
                            switch (i2) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    if (!o00oo2.f21616OooOo0o) {
                                        o0OoOo0 o0oooo0 = o00ooo4.f21620OooO00o;
                                        o0oooo0.getClass();
                                        o0oooo0OooO0OO = new o0OoOo0.OooO00o().OooO0OO(o0oooo0, strOooO0OO);
                                        if (o0oooo0OooO0OO != null) {
                                            if (o0oooo0OooO0OO.f21631OooO00o.equals(o00ooo4.f21620OooO00o.f21631OooO00o)) {
                                            }
                                            oooO00o = new o00Ooo.OooO00o(o00ooo4);
                                            str = o00ooo4.f21621OooO0O0;
                                            if (!o000O000.OooO0O0(str)) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                oooO00o.OooO0OO("GET");
                                                oooO00o.f21628OooO0OO.OooO0o0("Transfer-Encoding");
                                                oooO00o.f21628OooO0OO.OooO0o0("Content-Length");
                                                oooO00o.f21628OooO0OO.OooO0o0("Content-Type");
                                            }
                                            if (!o0000oo2.OooO0oO(o0oooo0OooO0OO)) {
                                                oooO00o.f21628OooO0OO.OooO0o0("Authorization");
                                            }
                                            oooO00o.f21626OooO00o = o0oooo0OooO0OO;
                                            o00oooOooO00o = oooO00o.OooO00o();
                                            o00ooo2 = o00oooOooO00o;
                                        } else {
                                            o00ooo2 = null;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    o00ooo2 = null;
                                    break;
                            }
                        } else if (proxy.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    }
                    o00oooOooO00o = o000Oo0.OooO0OO(o00oo2.f21611OooOOoo, o0000oo2.f43501OooOOO, proxy);
                    o00ooo2 = o00oooOooO00o;
                } else if (!o00ooo4.f21621OooO0O0.equals("GET") && !o00ooo4.f21621OooO0O0.equals("HEAD")) {
                    o00ooo2 = null;
                } else if (!o00oo2.f21616OooOo0o || (strOooO0OO = o0000oo2.f43501OooOOO.OooO0OO("Location")) == null) {
                    o00ooo2 = null;
                } else {
                    o0OoOo0 o0oooo1 = o00ooo4.f21620OooO00o;
                    o0oooo1.getClass();
                    o0oooo0OooO0OO = new o0OoOo0.OooO00o().OooO0OO(o0oooo1, strOooO0OO);
                    if (o0oooo0OooO0OO != null) {
                        o00ooo2 = null;
                    } else if (!o0oooo0OooO0OO.f21631OooO00o.equals(o00ooo4.f21620OooO00o.f21631OooO00o) || o00oo2.f21615OooOo0O) {
                        oooO00o = new o00Ooo.OooO00o(o00ooo4);
                        str = o00ooo4.f21621OooO0O0;
                        if (!o000O000.OooO0O0(str) && !str.equals(FirebasePerformance.HttpMethod.DELETE)) {
                            z3 = false;
                        }
                        if (z3) {
                            oooO00o.OooO0OO("GET");
                            oooO00o.f21628OooO0OO.OooO0o0("Transfer-Encoding");
                            oooO00o.f21628OooO0OO.OooO0o0("Content-Length");
                            oooO00o.f21628OooO0OO.OooO0o0("Content-Type");
                        }
                        if (!o0000oo2.OooO0oO(o0oooo0OooO0OO)) {
                            oooO00o.f21628OooO0OO.OooO0o0("Authorization");
                        }
                        oooO00o.f21626OooO00o = o0oooo0OooO0OO;
                        o00oooOooO00o = oooO00o.OooO00o();
                        o00ooo2 = o00oooOooO00o;
                    } else {
                        o00ooo2 = null;
                    }
                }
                if (o00ooo2 == null) {
                    o0000OO0 o0000oo3 = this.f21550OooO0Oo;
                    o000O0O0 o000o0o1 = o0000oo3.f43496OooO0oO;
                    if (o000o0o1 != null && o0000oo3.f43491OooO0O0 != null) {
                        o000o0o1.OooO0o();
                    }
                    o0000oo3.f43491OooO0O0 = null;
                    return oo000oVar;
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException(android.support.v4.media.OooO00o.OooO00o("Too many follow-up requests: ", i));
                }
                if (!this.f21550OooO0Oo.OooO0oO(o00ooo2.f21620OooO00o)) {
                    o0000OO0 o0000oo4 = this.f21550OooO0Oo;
                    o000O0O0 o000o0o2 = o0000oo4.f43496OooO0oO;
                    if (o000o0o2 != null && o0000oo4.f43491OooO0O0 != null) {
                        o000o0o2.OooO0o();
                    }
                    o0000oo4.f43491OooO0O0 = null;
                }
                this.f21550OooO0Oo = new o0000OO0(this.f21547OooO00o, o00ooo2, false, false, false, this.f21550OooO0Oo.OooO00o(), null, null, oo000oVar);
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                o0000OO0 o0000oo5 = this.f21550OooO0Oo;
                o000O0Oo o000o0oo2 = o0000oo5.f43493OooO0Oo;
                if (o000o0oo2 != null && o0000oo5.f43491OooO0O0 != null) {
                    o0000oo5.OooO0OO(o000o0oo2, e2.f21590OooO0Oo);
                }
                o000O0Oo o000o0oo3 = o0000oo5.f43493OooO0Oo;
                if (o000o0oo3 != null || o0000oo5.f43491OooO0O0 != null) {
                    if (o000o0oo3 == null) {
                        if (!o0000oo5.f43490OooO00o.f21612OooOo) {
                            IOException iOException = e2.f21590OooO0Oo;
                            z3 = (!(iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
                        }
                        if (z3) {
                            o0000oo1 = new o0000OO0(o0000oo5.f43490OooO00o, o0000oo5.f43499OooOO0O, o0000oo5.f43498OooOO0, o0000oo5.f43504OooOOOo, o0000oo5.f43506OooOOo0, o0000oo5.OooO00o(), o0000oo5.f43493OooO0Oo, (o000O0) o0000oo5.f43503OooOOOO, o0000oo5.f43494OooO0o);
                        }
                    } else {
                        if (o000o0oo3.f43515OooO < o000o0oo3.f43523OooO0oo.size()) {
                            z2 = true;
                        } else if ((o000o0oo3.f43522OooO0oO < o000o0oo3.f43520OooO0o.size()) || (!o000o0oo3.f43524OooOO0.isEmpty())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (!o0000oo5.f43490OooO00o.f21612OooOo) {
                                IOException iOException2 = e2.f21590OooO0Oo;
                                if (!(iOException2 instanceof ProtocolException)) {
                                }
                            }
                            if (z3) {
                                o0000oo1 = new o0000OO0(o0000oo5.f43490OooO00o, o0000oo5.f43499OooOO0O, o0000oo5.f43498OooOO0, o0000oo5.f43504OooOOOo, o0000oo5.f43506OooOOo0, o0000oo5.OooO00o(), o0000oo5.f43493OooO0Oo, (o000O0) o0000oo5.f43503OooOOOO, o0000oo5.f43494OooO0o);
                            }
                        }
                    }
                }
                if (o0000oo1 == null) {
                    throw e2.f21590OooO0Oo;
                }
                this.f21550OooO0Oo = o0000oo1;
            } catch (IOException e3) {
                o0000OO0 o0000oo6 = this.f21550OooO0Oo;
                o000O0Oo o000o0oo4 = o0000oo6.f43493OooO0Oo;
                if (o000o0oo4 != null && o0000oo6.f43491OooO0O0 != null) {
                    o0000oo6.OooO0OO(o000o0oo4, e3);
                }
                o000O0Oo o000o0oo5 = o0000oo6.f43493OooO0Oo;
                if (o000o0oo5 != null || o0000oo6.f43491OooO0O0 != null) {
                    if (o000o0oo5 != null) {
                        if (o000o0oo5.f43515OooO < o000o0oo5.f43523OooO0oo.size()) {
                            z = true;
                        } else if ((o000o0oo5.f43522OooO0oO < o000o0oo5.f43520OooO0o.size()) || (!o000o0oo5.f43524OooOO0.isEmpty())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if ((o0000oo6.f43490OooO00o.f21612OooOo || (e3 instanceof ProtocolException) || (e3 instanceof InterruptedIOException)) ? false : true) {
                                o0000oo1 = new o0000OO0(o0000oo6.f43490OooO00o, o0000oo6.f43499OooOO0O, o0000oo6.f43498OooOO0, o0000oo6.f43504OooOOOo, o0000oo6.f43506OooOOo0, o0000oo6.OooO00o(), o0000oo6.f43493OooO0Oo, null, o0000oo6.f43494OooO0o);
                            }
                        }
                    } else if ((o0000oo6.f43490OooO00o.f21612OooOo || (e3 instanceof ProtocolException) || (e3 instanceof InterruptedIOException)) ? false : true) {
                        o0000oo1 = new o0000OO0(o0000oo6.f43490OooO00o, o0000oo6.f43499OooOO0O, o0000oo6.f43498OooOO0, o0000oo6.f43504OooOOOo, o0000oo6.f43506OooOOo0, o0000oo6.OooO00o(), o0000oo6.f43493OooO0Oo, null, o0000oo6.f43494OooO0o);
                    }
                }
                if (o0000oo1 == null) {
                    throw e3;
                }
                this.f21550OooO0Oo = o0000oo1;
            }
        }
    }
}
