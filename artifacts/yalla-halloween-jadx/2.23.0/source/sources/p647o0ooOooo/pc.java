package p647o0ooOooo;

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
import p634o0ooO0oO.o00O0;
import p634o0ooO0oO.o00O00;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O00000;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p635o0ooO0oo.o0O000o0;
import p646o0ooOoo.oO000OOo;
import p646o0ooOoo.oO000o00;
import p646o0ooOoo.oO00O0o0;
import p646o0ooOoo.oO0Oo0oo;
import p646o0ooOoo.oO0OoOO0;
import p646o0ooOoo.oO0o0o;

/* JADX INFO: loaded from: classes5.dex */
public final class pc implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f59726OooO00o;

    public pc(@NotNull o00OOOO0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f59726OooO00o = client;
    }

    public static int OooO0OO(o0oOOo o0oooo, int i) {
        String strOooO0OO = o0oooo.OooO0OO("Retry-After", null);
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

    public final o00OOOOo OooO00o(o0oOOo o0oooo, oO0o0o oo0o0o) throws IOException {
        String strOooO0OO;
        oO000OOo oo000ooo;
        o0O00000 o0o00000 = (oo0o0o == null || (oo000ooo = oo0o0o.f59693OooO0o) == null) ? null : oo000ooo.f59617OooO0O0;
        int i = o0oooo.f57345OooO0oO;
        o00OOOOo o00ooooo2 = o0oooo.f57342OooO0Oo;
        String method = o00ooooo2.f57314OooO0O0;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f59726OooO00o.f57261OooOO0.authenticate(o0o00000, o0oooo);
            }
            if (i == 421) {
                oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
                if ((oo00oo != null && oo00oo.isOneShot()) || oo0o0o == null || !(!Intrinsics.areEqual(oo0o0o.f59691OooO0OO.f59677OooO0O0.f57144OooO.f57206OooO0Oo, oo0o0o.f59693OooO0o.f59617OooO0O0.f57326OooO00o.f57144OooO.f57206OooO0Oo))) {
                    return null;
                }
                oO000OOo oo000ooo2 = oo0o0o.f59693OooO0o;
                synchronized (oo000ooo2) {
                    oo000ooo2.f59625OooOO0O = true;
                }
                return o0oooo.f57342OooO0Oo;
            }
            if (i == 503) {
                o0oOOo o0oooo2 = o0oooo.f57351OooOOO0;
                if ((o0oooo2 == null || o0oooo2.f57345OooO0oO != 503) && OooO0OO(o0oooo, Integer.MAX_VALUE) == 0) {
                    return o0oooo.f57342OooO0Oo;
                }
                return null;
            }
            if (i == 407) {
                Intrinsics.checkNotNull(o0o00000);
                if (o0o00000.f57327OooO0O0.type() == Proxy.Type.HTTP) {
                    return this.f59726OooO00o.f57269OooOOo0.authenticate(o0o00000, o0oooo);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f59726OooO00o.f57255OooO) {
                    return null;
                }
                oo00oO oo00oo2 = o00ooooo2.f57316OooO0Oo;
                if (oo00oo2 != null && oo00oo2.isOneShot()) {
                    return null;
                }
                o0oOOo o0oooo3 = o0oooo.f57351OooOOO0;
                if ((o0oooo3 == null || o0oooo3.f57345OooO0oO != 408) && OooO0OO(o0oooo, 0) <= 0) {
                    return o0oooo.f57342OooO0Oo;
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
        o00OOOO0 o00oooo1 = this.f59726OooO00o;
        if (!o00oooo1.f57262OooOO0O || (strOooO0OO = o0oooo.OooO0OO("Location", null)) == null) {
            return null;
        }
        o00OOOOo o00ooooo3 = o0oooo.f57342OooO0Oo;
        o00OO url = o00ooooo3.f57313OooO00o.OooOO0(strOooO0OO);
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f57203OooO00o, o00ooooo3.f57313OooO00o.f57203OooO00o) && !o00oooo1.f57263OooOO0o) {
            return null;
        }
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo3);
        if (mc.OooO00o(method)) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean zAreEqual = Intrinsics.areEqual(method, "PROPFIND");
            int i2 = o0oooo.f57345OooO0oO;
            boolean z = zAreEqual || i2 == 308 || i2 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(!Intrinsics.areEqual(method, "PROPFIND")) || i2 == 308 || i2 == 307) {
                oooO00o.OooO0o(method, z ? o00ooooo3.f57316OooO0Oo : null);
            } else {
                oooO00o.OooO0o("GET", null);
            }
            if (!z) {
                oooO00o.OooO0oo("Transfer-Encoding");
                oooO00o.OooO0oo("Content-Length");
                oooO00o.OooO0oo("Content-Type");
            }
        }
        if (!o0O000o0.OooO00o(o00ooooo3.f57313OooO00o, url)) {
            oooO00o.OooO0oo("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57319OooO00o = url;
        return oooO00o.OooO0O0();
    }

    public final boolean OooO0O0(IOException iOException, oO0Oo0oo oo0oo0oo, o00OOOOo o00ooooo2, boolean z) {
        boolean zOooO00o;
        o0O00000 o0o00000;
        oO00O0o0 oo00o0o0;
        oO000OOo oo000ooo;
        if (!this.f59726OooO00o.f57255OooO) {
            return false;
        }
        if (z) {
            oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
            if ((oo00oo != null && oo00oo.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        oO0OoOO0 oo0oooo0 = oo0oo0oo.f59660OooOO0o;
        Intrinsics.checkNotNull(oo0oooo0);
        int i = oo0oooo0.f59682OooO0oO;
        if (i == 0 && oo0oooo0.f59683OooO0oo == 0 && oo0oooo0.f59675OooO == 0) {
            zOooO00o = false;
        } else if (oo0oooo0.f59684OooOO0 == null) {
            if (i <= 1 && oo0oooo0.f59683OooO0oo <= 1 && oo0oooo0.f59675OooO <= 0 && (oo000ooo = oo0oooo0.f59678OooO0OO.f59662OooOOO0) != null) {
                synchronized (oo000ooo) {
                    o0o00000 = (oo000ooo.f59626OooOO0o == 0 && o0O000o0.OooO00o(oo000ooo.f59617OooO0O0.f57326OooO00o.f57144OooO, oo0oooo0.f59677OooO0O0.f57144OooO)) ? oo000ooo.f59617OooO0O0 : null;
                }
            }
            if (o0o00000 != null) {
                oo0oooo0.f59684OooOO0 = o0o00000;
            } else {
                oO00O0o0.OooO00o oooO00o = oo0oooo0.f59681OooO0o0;
                if (!(oooO00o != null && oooO00o.OooO00o()) && (oo00o0o0 = oo0oooo0.f59680OooO0o) != null) {
                    zOooO00o = oo00o0o0.OooO00o();
                }
            }
            zOooO00o = true;
        } else {
            zOooO00o = true;
        }
        return zOooO00o;
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o00O0 o00o1;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        oO0Oo0oo oo0oo0oo = ncVar.f59715OooO00o;
        boolean z = true;
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        o0oOOo o0oooo = null;
        o00OOOOo request = o00ooooo2;
        boolean z2 = true;
        while (true) {
            oo0oo0oo.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(oo0oo0oo.f59663OooOOOO == null ? z : false)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (oo0oo0oo) {
                if (!(oo0oo0oo.f59666OooOOo0 ^ z)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(oo0oo0oo.f59664OooOOOo ^ z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z2) {
                oO000o00 oo000o00 = oo0oo0oo.f59656OooO0oO;
                o00OO o00oo2 = request.f57313OooO00o;
                boolean z3 = o00oo2.f57211OooOO0;
                o00OOOO0 o00oooo1 = oo0oo0oo.f59653OooO0Oo;
                if (z3) {
                    SSLSocketFactory sSLSocketFactory2 = o00oooo1.f57270OooOOoo;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = o00oooo1.f57275OooOo0o;
                    o00o1 = o00oooo1.f57271OooOo;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    o00o1 = null;
                }
                oo0oo0oo.f59660OooOO0o = new oO0OoOO0(oo000o00, new o00O00(o00oo2.f57206OooO0Oo, o00oo2.f57208OooO0o0, o00oooo1.f57264OooOOO, o00oooo1.f57268OooOOo, sSLSocketFactory, hostnameVerifier, o00o1, o00oooo1.f57269OooOOo0, o00oooo1.f57266OooOOOO, o00oooo1.f57274OooOo0O, o00oooo1.f57272OooOo0, o00oooo1.f57267OooOOOo), oo0oo0oo, oo0oo0oo.f59657OooO0oo);
            }
            try {
                if (oo0oo0oo.f59667OooOOoo) {
                    throw new IOException("Canceled");
                }
                try {
                    o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(request);
                    if (o0oooo != null) {
                        o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0ooooOooO0O0);
                        o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o(o0oooo);
                        oooO00o2.f57362OooO0oO = null;
                        o0oOOo o0ooooOooO00o = oooO00o2.OooO00o();
                        if (!(o0ooooOooO00o.f57347OooOO0 == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        oooO00o.f57364OooOO0 = o0ooooOooO00o;
                        o0ooooOooO0O0 = oooO00o.OooO00o();
                    }
                    o0oooo = o0ooooOooO0O0;
                    oO0o0o oo0o0o = oo0oo0oo.f59663OooOOOO;
                    try {
                        request = OooO00o(o0oooo, oo0o0o);
                        if (request == null) {
                            if (oo0o0o != null && oo0o0o.f59694OooO0o0) {
                                if (!(!oo0oo0oo.f59661OooOOO)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                oo0oo0oo.f59661OooOOO = true;
                                oo0oo0oo.f59652OooO.OooOO0();
                            }
                            oo0oo0oo.OooO0o(false);
                            return o0oooo;
                        }
                        oo00oO oo00oo = request.f57316OooO0Oo;
                        if (oo00oo != null && oo00oo.isOneShot()) {
                            oo0oo0oo.OooO0o(false);
                            return o0oooo;
                        }
                        o0O0o o0o0o = o0oooo.f57347OooOO0;
                        if (o0o0o != null) {
                            o0O000o0.OooO0OO(o0o0o);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i)));
                        }
                        oo0oo0oo.OooO0o(true);
                        listEmptyList = listEmptyList;
                        z2 = true;
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!OooO0O0(e, oo0oo0oo, request, !(e instanceof ConnectionShutdownException))) {
                        o0O000o0.OooOoOO(e, listEmptyList);
                        throw e;
                    }
                    listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e);
                    oo0oo0oo.OooO0o(true);
                    z = true;
                    i = i;
                    z2 = false;
                } catch (RouteException e2) {
                    List list = listEmptyList;
                    if (!OooO0O0(e2.f60853OooO0o0, oo0oo0oo, request, false)) {
                        IOException iOException = e2.f60852OooO0Oo;
                        o0O000o0.OooOoOO(iOException, list);
                        throw iOException;
                    }
                    List listPlus = CollectionsKt.plus((Collection<? extends IOException>) list, e2.f60852OooO0Oo);
                    oo0oo0oo.OooO0o(true);
                    z = true;
                    i = i;
                    listEmptyList = listPlus;
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            oo0oo0oo.OooO0o(true);
            throw th;
        }
    }
}
