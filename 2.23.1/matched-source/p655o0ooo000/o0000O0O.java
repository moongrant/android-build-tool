package p655o0ooo000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import p640o0ooO0oo.o0O0o00O;
import p640o0ooO0oo.o0OO000o;
import p640o0ooO0oo.o0OOOO00;
import p640o0ooO0oo.o0OOOO0o;
import p640o0ooO0oo.o0oo0000;
import p640o0ooO0oo.oO0000O;
import p640o0ooO0oo.oO0000Oo;
import p640o0ooO0oo.oO0000o0;
import p640o0ooO0oo.oO000O0;
import p640o0ooO0oo.ooo0Oo0;
import p643o0ooOO0O.o00OO0O0;
import p652o0ooOooo.a1;
import p652o0ooOooo.b1;
import p652o0ooOooo.g1;
import p652o0ooOooo.i1;
import p652o0ooOooo.y0;
import p652o0ooOooo.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0O implements o0OOOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0oo0000 f58283OooO00o;

    public o0000O0O(@NotNull o0oo0000 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f58283OooO00o = client;
    }

    public static int OooO0OO(oO0000Oo oo0000oo, int i) {
        String strOooO0OO = oo0000oo.OooO0OO("Retry-After", null);
        if (strOooO0OO == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strOooO0OO)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strOooO0OO);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final ooo0Oo0 OooO00o(oO0000Oo oo0000oo, y0 y0Var) throws IOException {
        String strOooO0OO;
        b1 b1Var;
        oO000O0 oo000o0 = (y0Var == null || (b1Var = y0Var.f57794OooO0o) == null) ? null : b1Var.f57747OooO0O0;
        int i = oo0000oo.f57457OooO0oO;
        ooo0Oo0 ooo0oo0 = oo0000oo.f57454OooO0Oo;
        String method = ooo0oo0.f57513OooO0O0;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f58283OooO00o.f57392OooOO0.authenticate(oo000o0, oo0000oo);
            }
            if (i == 421) {
                oO0000O oo0000o = ooo0oo0.f57515OooO0Oo;
                if ((oo0000o != null && oo0000o.isOneShot()) || y0Var == null || !(!Intrinsics.areEqual(y0Var.f57792OooO0OO.f57809OooO0O0.f57274OooO.f57348OooO0Oo, y0Var.f57794OooO0o.f57747OooO0O0.f57485OooO00o.f57274OooO.f57348OooO0Oo))) {
                    return null;
                }
                b1 b1Var2 = y0Var.f57794OooO0o;
                synchronized (b1Var2) {
                    b1Var2.f57755OooOO0O = true;
                }
                return oo0000oo.f57454OooO0Oo;
            }
            if (i == 503) {
                oO0000Oo oo0000oo2 = oo0000oo.f57463OooOOO0;
                if ((oo0000oo2 == null || oo0000oo2.f57457OooO0oO != 503) && OooO0OO(oo0000oo, Integer.MAX_VALUE) == 0) {
                    return oo0000oo.f57454OooO0Oo;
                }
                return null;
            }
            if (i == 407) {
                Intrinsics.checkNotNull(oo000o0);
                if (oo000o0.f57486OooO0O0.type() == Proxy.Type.HTTP) {
                    return this.f58283OooO00o.f57400OooOOo0.authenticate(oo000o0, oo0000oo);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f58283OooO00o.f57386OooO) {
                    return null;
                }
                oO0000O oo0000o2 = ooo0oo0.f57515OooO0Oo;
                if (oo0000o2 != null && oo0000o2.isOneShot()) {
                    return null;
                }
                oO0000Oo oo0000oo3 = oo0000oo.f57463OooOOO0;
                if ((oo0000oo3 == null || oo0000oo3.f57457OooO0oO != 408) && OooO0OO(oo0000oo, 0) <= 0) {
                    return oo0000oo.f57454OooO0Oo;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        o0oo0000 o0oo0000Var = this.f58283OooO00o;
        if (!o0oo0000Var.f57393OooOO0O || (strOooO0OO = oo0000oo.OooO0OO("Location", null)) == null) {
            return null;
        }
        ooo0Oo0 ooo0oo1 = oo0000oo.f57454OooO0Oo;
        o0OOOO00 url = ooo0oo1.f57512OooO00o.OooOO0(strOooO0OO);
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f57345OooO00o, ooo0oo1.f57512OooO00o.f57345OooO00o) && !o0oo0000Var.f57394OooOO0o) {
            return null;
        }
        ooo0Oo0.OooO00o oooO00o = new ooo0Oo0.OooO00o(ooo0oo1);
        if (o0000O00.OooO00o(method)) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean zAreEqual = Intrinsics.areEqual(method, "PROPFIND");
            int i2 = oo0000oo.f57457OooO0oO;
            boolean z = zAreEqual || i2 == 308 || i2 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(!Intrinsics.areEqual(method, "PROPFIND")) || i2 == 308 || i2 == 307) {
                oooO00o.OooO0o(method, z ? ooo0oo1.f57515OooO0Oo : null);
            } else {
                oooO00o.OooO0o("GET", null);
            }
            if (!z) {
                oooO00o.OooO0oo("Transfer-Encoding");
                oooO00o.OooO0oo("Content-Length");
                oooO00o.OooO0oo("Content-Type");
            }
        }
        if (!o00OO0O0.OooO00o(ooo0oo1.f57512OooO00o, url)) {
            oooO00o.OooO0oo("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57518OooO00o = url;
        return oooO00o.OooO0O0();
    }

    public final boolean OooO0O0(IOException iOException, a1 a1Var, ooo0Oo0 ooo0oo0, boolean z) {
        boolean zOooO00o;
        oO000O0 oo000o0;
        i1 i1Var;
        b1 b1Var;
        if (!this.f58283OooO00o.f57386OooO) {
            return false;
        }
        if (z) {
            oO0000O oo0000o = ooo0oo0.f57515OooO0Oo;
            if ((oo0000o != null && oo0000o.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        z0 z0Var = a1Var.f57731OooOO0o;
        Intrinsics.checkNotNull(z0Var);
        int i = z0Var.f57814OooO0oO;
        if (i == 0 && z0Var.f57815OooO0oo == 0 && z0Var.f57807OooO == 0) {
            zOooO00o = false;
        } else if (z0Var.f57816OooOO0 == null) {
            if (i <= 1 && z0Var.f57815OooO0oo <= 1 && z0Var.f57807OooO <= 0 && (b1Var = z0Var.f57810OooO0OO.f57733OooOOO0) != null) {
                synchronized (b1Var) {
                    oo000o0 = (b1Var.f57756OooOO0o == 0 && o00OO0O0.OooO00o(b1Var.f57747OooO0O0.f57485OooO00o.f57274OooO, z0Var.f57809OooO0O0.f57274OooO)) ? b1Var.f57747OooO0O0 : null;
                }
            }
            if (oo000o0 != null) {
                z0Var.f57816OooOO0 = oo000o0;
            } else {
                i1.OooO00o oooO00o = z0Var.f57813OooO0o0;
                if (!(oooO00o != null && oooO00o.OooO00o()) && (i1Var = z0Var.f57812OooO0o) != null) {
                    zOooO00o = i1Var.OooO00o();
                }
            }
            zOooO00o = true;
        } else {
            zOooO00o = true;
        }
        return zOooO00o;
    }

    @Override // p640o0ooO0oo.o0OOOO0o
    @NotNull
    public final oO0000Oo intercept(@NotNull o0OOOO0o.OooO00o chain) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o0OO000o o0oo000o;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0000oo o0000ooVar = (o0000oo) chain;
        ooo0Oo0 ooo0oo0 = o0000ooVar.f58290OooO0o0;
        a1 a1Var = o0000ooVar.f58285OooO00o;
        boolean z = true;
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        oO0000Oo oo0000oo = null;
        ooo0Oo0 request = ooo0oo0;
        boolean z2 = true;
        while (true) {
            a1Var.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(a1Var.f57734OooOOOO == null ? z : false)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (a1Var) {
                if (!(a1Var.f57737OooOOo0 ^ z)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(a1Var.f57735OooOOOo ^ z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z2) {
                g1 g1Var = a1Var.f57727OooO0oO;
                o0OOOO00 o0oooo01 = request.f57512OooO00o;
                boolean z3 = o0oooo01.f57353OooOO0;
                o0oo0000 o0oo0000Var = a1Var.f57724OooO0Oo;
                if (z3) {
                    SSLSocketFactory sSLSocketFactory2 = o0oo0000Var.f57401OooOOoo;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = o0oo0000Var.f57406OooOo0o;
                    o0oo000o = o0oo0000Var.f57402OooOo;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    o0oo000o = null;
                }
                a1Var.f57731OooOO0o = new z0(g1Var, new o0O0o00O(o0oooo01.f57348OooO0Oo, o0oooo01.f57350OooO0o0, o0oo0000Var.f57395OooOOO, o0oo0000Var.f57399OooOOo, sSLSocketFactory, hostnameVerifier, o0oo000o, o0oo0000Var.f57400OooOOo0, o0oo0000Var.f57397OooOOOO, o0oo0000Var.f57405OooOo0O, o0oo0000Var.f57403OooOo0, o0oo0000Var.f57398OooOOOo), a1Var, a1Var.f57728OooO0oo);
            }
            try {
                if (a1Var.f57738OooOOoo) {
                    throw new IOException("Canceled");
                }
                try {
                    oO0000Oo oo0000ooOooO0O0 = o0000ooVar.OooO0O0(request);
                    if (oo0000oo != null) {
                        oO0000Oo.OooO00o oooO00o = new oO0000Oo.OooO00o(oo0000ooOooO0O0);
                        oO0000Oo.OooO00o oooO00o2 = new oO0000Oo.OooO00o(oo0000oo);
                        oooO00o2.f57474OooO0oO = null;
                        oO0000Oo oo0000ooOooO00o = oooO00o2.OooO00o();
                        if (!(oo0000ooOooO00o.f57459OooOO0 == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        oooO00o.f57476OooOO0 = oo0000ooOooO00o;
                        oo0000ooOooO0O0 = oooO00o.OooO00o();
                    }
                    oo0000oo = oo0000ooOooO0O0;
                    y0 y0Var = a1Var.f57734OooOOOO;
                    try {
                        request = OooO00o(oo0000oo, y0Var);
                        if (request == null) {
                            if (y0Var != null && y0Var.f57795OooO0o0) {
                                if (!(!a1Var.f57732OooOOO)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                a1Var.f57732OooOOO = true;
                                a1Var.f57723OooO.OooOO0();
                            }
                            a1Var.OooO0o(false);
                            return oo0000oo;
                        }
                        oO0000O oo0000o = request.f57515OooO0Oo;
                        if (oo0000o != null && oo0000o.isOneShot()) {
                            a1Var.OooO0o(false);
                            return oo0000oo;
                        }
                        oO0000o0 oo0000o0 = oo0000oo.f57459OooOO0;
                        if (oo0000o0 != null) {
                            o00OO0O0.OooO0OO(oo0000o0);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i)));
                        }
                        a1Var.OooO0o(true);
                        listEmptyList = listEmptyList;
                        z2 = true;
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!OooO0O0(e, a1Var, request, !(e instanceof ConnectionShutdownException))) {
                        o00OO0O0.OooOoOO(e, listEmptyList);
                        throw e;
                    }
                    listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e);
                    a1Var.OooO0o(true);
                    z = true;
                    i = i;
                    z2 = false;
                } catch (RouteException e2) {
                    List list = listEmptyList;
                    if (!OooO0O0(e2.f60146OooO0o0, a1Var, request, false)) {
                        IOException iOException = e2.f60145OooO0Oo;
                        o00OO0O0.OooOoOO(iOException, list);
                        throw iOException;
                    }
                    List listPlus = CollectionsKt.plus((Collection<? extends IOException>) list, e2.f60145OooO0Oo);
                    a1Var.OooO0o(true);
                    z = true;
                    i = i;
                    listEmptyList = listPlus;
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            a1Var.OooO0o(true);
            throw th;
        }
    }
}
