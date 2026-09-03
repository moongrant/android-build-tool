package p415o0Oo0o00;

import android.support.v4.media.OooO00o;
import com.qiniu.android.http.request.Request;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p169o00Ooo0.OooOo;
import p416o0Oo0o0O.o0OO00O;
import p419o0Oo0oO0.o00000;
import p419o0Oo0oO0.o000000O;
import p419o0Oo0oO0.o00O0O;
import p419o0Oo0oO0.o0O0O00;
import p419o0Oo0oO0.o0Oo0oo;
import p422o0Oo0oo0.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f39254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f39255OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O000 f39256OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0Oo0oo f39257OooO0Oo;

    public o00000O(o000 o000Var, o000O000 o000o001) {
        SSLSocketFactory sSLSocketFactory;
        Objects.requireNonNull(o000Var);
        o000 o000Var2 = new o000(o000Var);
        if (o000Var2.f39203OoooOOO == null) {
            o000Var2.f39203OoooOOO = ProxySelector.getDefault();
        }
        if (o000Var2.f39204OoooOOo == null) {
            o000Var2.f39204OoooOOo = CookieHandler.getDefault();
        }
        if (o000Var2.f39207OoooOoo == null) {
            o000Var2.f39207OoooOoo = SocketFactory.getDefault();
        }
        if (o000Var2.f39208Ooooo00 == null) {
            synchronized (o000Var) {
                if (o000.f39196o00o0O == null) {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        o000.f39196o00o0O = sSLContext.getSocketFactory();
                    } catch (GeneralSecurityException unused) {
                        throw new AssertionError();
                    }
                }
                sSLSocketFactory = o000.f39196o00o0O;
            }
            o000Var2.f39208Ooooo00 = sSLSocketFactory;
        }
        if (o000Var2.f39209Ooooo0o == null) {
            o000Var2.f39209Ooooo0o = o0000Ooo.f39789OooO00o;
        }
        if (o000Var2.f39210OooooO0 == null) {
            o000Var2.f39210OooooO0 = o00000OO.f39275OooO0O0;
        }
        if (o000Var2.f39211OooooOO == null) {
            o000Var2.f39211OooooOO = o00O0O.f39600OooO00o;
        }
        if (o000Var2.f39212OooooOo == null) {
            o000Var2.f39212OooooOo = o0000O00.f39296OooO0o;
        }
        if (o000Var2.f39201OoooO0O == null) {
            o000Var2.f39201OoooO0O = o000.f39194o00Oo0;
        }
        if (o000Var2.f39198OoooO == null) {
            o000Var2.f39198OoooO = o000.f39195o00Ooo;
        }
        if (o000Var2.f39214Oooooo0 == null) {
            o000Var2.f39214Oooooo0 = o0OO00O.f39391OooO00o;
        }
        this.f39254OooO00o = o000Var2;
        this.f39256OooO0OO = o000o001;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o0000OO0>] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o0000OO0>] */
    public final o000O0o OooO00o() throws Throwable {
        boolean z;
        String strOooO0OO;
        o0000O o0000oOooO0OO;
        o000O000.OooO00o oooO00o;
        o000O000 o000o001 = this.f39256OooO0OO;
        if (this.f39254OooO00o.f39202OoooOO0.size() > 0) {
            return ((o0000OO0) this.f39254OooO00o.f39202OoooOO0.get(0)).OooO00o();
        }
        Objects.requireNonNull(o000o001);
        this.f39257OooO0Oo = new o0Oo0oo(this.f39254OooO00o, o000o001, false, false, false, null, null, null, null);
        int i = 0;
        while (true) {
            o0Oo0oo o0oo0oo2 = null;
            o000o000OooO00o = null;
            o000o000OooO00o = null;
            o000o000OooO00o = null;
            o000o000OooO00o = null;
            o000o000OooO00o = null;
            o000O000 o000o000OooO00o = null;
            o0oo0oo = null;
            o0oo0oo = null;
            o0Oo0oo o0oo0oo3 = null;
            o0oo0oo2 = null;
            o0oo0oo2 = null;
            try {
                this.f39257OooO0Oo.OooOO0O();
                this.f39257OooO0Oo.OooO0oO();
                o0Oo0oo o0oo0oo4 = this.f39257OooO0Oo;
                o000O0o o000o0o2 = o0oo0oo4.f39630OooOOO;
                if (o000o0o2 == null) {
                    throw new IllegalStateException();
                }
                o000O00 o000o01 = o0oo0oo4.f39624OooO0o0;
                Proxy proxy = o000o01 != null ? o000o01.f39320OooO0O0 : o0oo0oo4.f39619OooO00o.f39199OoooO0;
                int i2 = o000o0o2.f39335OooO0OO;
                if (i2 == 307 || i2 == 308) {
                    if (o0oo0oo4.f39628OooOO0O.f39323OooO0O0.equals(Request.HttpMethodGet) || o0oo0oo4.f39628OooOO0O.f39323OooO0O0.equals(Request.HttpMethodHEAD)) {
                        if (o0oo0oo4.f39619OooO00o.f39215OoooooO && (strOooO0OO = o0oo0oo4.f39630OooOOO.OooO0OO("Location")) != null) {
                            o0000O o0000o2 = o0oo0oo4.f39628OooOO0O.f39322OooO00o;
                            Objects.requireNonNull(o0000o2);
                            o0000oOooO0OO = new o0000O.OooO00o().OooO0OO(o0000o2, strOooO0OO);
                            if (o0000oOooO0OO != null && (o0000oOooO0OO.f39279OooO00o.equals(o0oo0oo4.f39628OooOO0O.f39322OooO00o.f39279OooO00o) || o0oo0oo4.f39619OooO00o.f39213Oooooo)) {
                                oooO00o = new o000O000.OooO00o(o0oo0oo4.f39628OooOO0O);
                                if (OooOo.OooO0o0(o0oo0oo4.f39628OooOO0O.f39323OooO0O0)) {
                                    oooO00o.OooO0OO(Request.HttpMethodGet);
                                    oooO00o.OooO0Oo("Transfer-Encoding");
                                    oooO00o.OooO0Oo("Content-Length");
                                    oooO00o.OooO0Oo("Content-Type");
                                }
                                if (!o0oo0oo4.OooOO0(o0000oOooO0OO)) {
                                    oooO00o.OooO0Oo("Authorization");
                                }
                                oooO00o.f39328OooO00o = o0000oOooO0OO;
                                o000o000OooO00o = oooO00o.OooO00o();
                            }
                        }
                    }
                } else if (i2 == 401) {
                    o000o000OooO00o = o0O0O00.OooO0OO(o0oo0oo4.f39619OooO00o.f39211OooooOO, o0oo0oo4.f39630OooOOO, proxy);
                } else if (i2 != 407) {
                    switch (i2) {
                        case ShopVehicleListModel.VehicleTagType_Vip300 /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            if (o0oo0oo4.f39619OooO00o.f39215OoooooO) {
                                o0000O o0000o3 = o0oo0oo4.f39628OooOO0O.f39322OooO00o;
                                Objects.requireNonNull(o0000o3);
                                o0000oOooO0OO = new o0000O.OooO00o().OooO0OO(o0000o3, strOooO0OO);
                                if (o0000oOooO0OO != null) {
                                    oooO00o = new o000O000.OooO00o(o0oo0oo4.f39628OooOO0O);
                                    if (OooOo.OooO0o0(o0oo0oo4.f39628OooOO0O.f39323OooO0O0)) {
                                        oooO00o.OooO0OO(Request.HttpMethodGet);
                                        oooO00o.OooO0Oo("Transfer-Encoding");
                                        oooO00o.OooO0Oo("Content-Length");
                                        oooO00o.OooO0Oo("Content-Type");
                                    }
                                    if (!o0oo0oo4.OooOO0(o0000oOooO0OO)) {
                                        oooO00o.OooO0Oo("Authorization");
                                    }
                                    oooO00o.f39328OooO00o = o0000oOooO0OO;
                                    o000o000OooO00o = oooO00o.OooO00o();
                                }
                            }
                            break;
                    }
                } else {
                    if (proxy.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    o000o000OooO00o = o0O0O00.OooO0OO(o0oo0oo4.f39619OooO00o.f39211OooooOO, o0oo0oo4.f39630OooOOO, proxy);
                }
                o000O000 o000o002 = o000o000OooO00o;
                if (o000o002 == null) {
                    this.f39257OooO0Oo.OooO();
                    return o000o0o2;
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException(OooO00o.OooO00o("Too many follow-up requests: ", i));
                }
                if (!this.f39257OooO0Oo.OooOO0(o000o002.f39322OooO00o)) {
                    this.f39257OooO0Oo.OooO();
                }
                this.f39257OooO0Oo = new o0Oo0oo(this.f39254OooO00o, o000o002, false, false, false, this.f39257OooO0Oo.OooO00o(), null, null, o000o0o2);
            } catch (RequestException e) {
                throw e.OooO00o();
            } catch (RouteException e2) {
                o0Oo0oo o0oo0oo5 = this.f39257OooO0Oo;
                o00000 o00000Var = o0oo0oo5.f39622OooO0Oo;
                if (o00000Var != null && o0oo0oo5.f39620OooO0O0 != null) {
                    o0oo0oo5.OooO0OO(o00000Var, e2.f19703Oooo);
                }
                o00000 o00000Var2 = o0oo0oo5.f39622OooO0Oo;
                if ((o00000Var2 != null || o0oo0oo5.f39620OooO0O0 != null) && (o00000Var2 == null || o00000Var2.OooO00o())) {
                    if (o0oo0oo5.f39619OooO00o.f39216Ooooooo) {
                        IOException iOException = e2.f19703Oooo;
                        z = ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
                    }
                    if (z) {
                        o0oo0oo3 = new o0Oo0oo(o0oo0oo5.f39619OooO00o, o0oo0oo5.f39628OooOO0O, o0oo0oo5.f39627OooOO0, o0oo0oo5.f39633OooOOOo, o0oo0oo5.f39635OooOOo0, o0oo0oo5.OooO00o(), o0oo0oo5.f39622OooO0Oo, (o000000O) o0oo0oo5.f39632OooOOOO, o0oo0oo5.f39623OooO0o);
                    }
                }
                if (o0oo0oo3 == null) {
                    throw e2.f19703Oooo;
                }
                this.f39257OooO0Oo = o0oo0oo3;
            } catch (IOException e3) {
                o0Oo0oo o0oo0oo6 = this.f39257OooO0Oo;
                o00000 o00000Var3 = o0oo0oo6.f39622OooO0Oo;
                if (o00000Var3 != null && o0oo0oo6.f39620OooO0O0 != null) {
                    o0oo0oo6.OooO0OO(o00000Var3, e3);
                }
                o00000 o00000Var4 = o0oo0oo6.f39622OooO0Oo;
                if ((o00000Var4 != null || o0oo0oo6.f39620OooO0O0 != null) && (o00000Var4 == null || o00000Var4.OooO00o())) {
                    if ((!o0oo0oo6.f39619OooO00o.f39216Ooooooo || (e3 instanceof ProtocolException) || (e3 instanceof InterruptedIOException)) ? false : true) {
                        o0oo0oo2 = new o0Oo0oo(o0oo0oo6.f39619OooO00o, o0oo0oo6.f39628OooOO0O, o0oo0oo6.f39627OooOO0, o0oo0oo6.f39633OooOOOo, o0oo0oo6.f39635OooOOo0, o0oo0oo6.OooO00o(), o0oo0oo6.f39622OooO0Oo, null, o0oo0oo6.f39623OooO0o);
                    }
                }
                if (o0oo0oo2 == null) {
                    throw e3;
                }
                this.f39257OooO0Oo = o0oo0oo2;
            }
        }
    }
}
