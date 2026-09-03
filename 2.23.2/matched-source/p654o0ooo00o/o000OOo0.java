package p654o0ooo00o;

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
import p641o0ooOO0o.o00OO00O;
import p641o0ooOO0o.o00OOO0;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0O0o;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;
import p653o0ooo00O.o0000O00;
import p653o0ooo00O.o0000O0O;
import p653o0ooo00O.o0000oo;
import p653o0ooo00O.o000O000;
import p653o0ooo00O.o000Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OOo0 implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OoO00O f59412OooO00o;

    public o000OOo0(@NotNull o0OoO00O client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f59412OooO00o = client;
    }

    public static int OooO0OO(o0O00o00 o0o00o01, int i) {
        String strOooO0OO = o0o00o01.OooO0OO("Retry-After", null);
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

    public final o0O00O0o OooO00o(o0O00o00 o0o00o01, o0000O00 o0000o00) throws IOException {
        String strOooO0OO;
        o0000O0O o0000o0o2;
        o0oO0O0o o0oo0o0o2 = (o0000o00 == null || (o0000o0o2 = o0000o00.f59331OooO0o) == null) ? null : o0000o0o2.f59345OooO0O0;
        int i = o0o00o01.f57850OooO0oO;
        o0O00O0o o0o00o0o = o0o00o01.f57847OooO0Oo;
        String method = o0o00o0o.f57829OooO0O0;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f59412OooO00o.f57890OooOO0.authenticate(o0oo0o0o2, o0o00o01);
            }
            if (i == 421) {
                o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
                if ((o0oo0ooo2 != null && o0oo0ooo2.isOneShot()) || o0000o00 == null || !(!Intrinsics.areEqual(o0000o00.f59329OooO0OO.f59365OooO0O0.f57743OooO.f57792OooO0Oo, o0000o00.f59331OooO0o.f59345OooO0O0.f57962OooO00o.f57743OooO.f57792OooO0Oo))) {
                    return null;
                }
                o0000O0O o0000o0o3 = o0000o00.f59331OooO0o;
                synchronized (o0000o0o3) {
                    o0000o0o3.f59353OooOO0O = true;
                }
                return o0o00o01.f57847OooO0Oo;
            }
            if (i == 503) {
                o0O00o00 o0o00o02 = o0o00o01.f57856OooOOO0;
                if ((o0o00o02 == null || o0o00o02.f57850OooO0oO != 503) && OooO0OO(o0o00o01, Integer.MAX_VALUE) == 0) {
                    return o0o00o01.f57847OooO0Oo;
                }
                return null;
            }
            if (i == 407) {
                Intrinsics.checkNotNull(o0oo0o0o2);
                if (o0oo0o0o2.f57963OooO0O0.type() == Proxy.Type.HTTP) {
                    return this.f59412OooO00o.f57898OooOOo0.authenticate(o0oo0o0o2, o0o00o01);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f59412OooO00o.f57884OooO) {
                    return null;
                }
                o0oO0Ooo o0oo0ooo3 = o0o00o0o.f57831OooO0Oo;
                if (o0oo0ooo3 != null && o0oo0ooo3.isOneShot()) {
                    return null;
                }
                o0O00o00 o0o00o03 = o0o00o01.f57856OooOOO0;
                if ((o0o00o03 == null || o0o00o03.f57850OooO0oO != 408) && OooO0OO(o0o00o01, 0) <= 0) {
                    return o0o00o01.f57847OooO0Oo;
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
        o0OoO00O o0ooo00o2 = this.f59412OooO00o;
        if (!o0ooo00o2.f57891OooOO0O || (strOooO0OO = o0o00o01.OooO0OO("Location", null)) == null) {
            return null;
        }
        o0O00O0o o0o00o0o2 = o0o00o01.f57847OooO0Oo;
        o0O000O url = o0o00o0o2.f57828OooO00o.OooOO0(strOooO0OO);
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f57789OooO00o, o0o00o0o2.f57828OooO00o.f57789OooO00o) && !o0ooo00o2.f57892OooOO0o) {
            return null;
        }
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o2);
        if (o000O0O0.OooO00o(method)) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean zAreEqual = Intrinsics.areEqual(method, "PROPFIND");
            int i2 = o0o00o01.f57850OooO0oO;
            boolean z = zAreEqual || i2 == 308 || i2 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(!Intrinsics.areEqual(method, "PROPFIND")) || i2 == 308 || i2 == 307) {
                oooO00o.OooO0o(method, z ? o0o00o0o2.f57831OooO0Oo : null);
            } else {
                oooO00o.OooO0o("GET", null);
            }
            if (!z) {
                oooO00o.OooO0oo("Transfer-Encoding");
                oooO00o.OooO0oo("Content-Length");
                oooO00o.OooO0oo("Content-Type");
            }
        }
        if (!oO000o00.OooO00o(o0o00o0o2.f57828OooO00o, url)) {
            oooO00o.OooO0oo("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57834OooO00o = url;
        return oooO00o.OooO0O0();
    }

    public final boolean OooO0O0(IOException iOException, o0000O0 o0000o1, o0O00O0o o0o00o0o, boolean z) {
        boolean zOooO00o;
        o0oO0O0o o0oo0o0o2;
        o000Oo0 o000oo1;
        o0000O0O o0000o0o2;
        if (!this.f59412OooO00o.f57884OooO) {
            return false;
        }
        if (z) {
            o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
            if ((o0oo0ooo2 != null && o0oo0ooo2.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        o0000oo o0000ooVar = o0000o1.f59312OooOO0o;
        Intrinsics.checkNotNull(o0000ooVar);
        int i = o0000ooVar.f59370OooO0oO;
        if (i == 0 && o0000ooVar.f59371OooO0oo == 0 && o0000ooVar.f59363OooO == 0) {
            zOooO00o = false;
        } else if (o0000ooVar.f59372OooOO0 == null) {
            if (i <= 1 && o0000ooVar.f59371OooO0oo <= 1 && o0000ooVar.f59363OooO <= 0 && (o0000o0o2 = o0000ooVar.f59366OooO0OO.f59314OooOOO0) != null) {
                synchronized (o0000o0o2) {
                    o0oo0o0o2 = (o0000o0o2.f59354OooOO0o == 0 && oO000o00.OooO00o(o0000o0o2.f59345OooO0O0.f57962OooO00o.f57743OooO, o0000ooVar.f59365OooO0O0.f57743OooO)) ? o0000o0o2.f59345OooO0O0 : null;
                }
            }
            if (o0oo0o0o2 != null) {
                o0000ooVar.f59372OooOO0 = o0oo0o0o2;
            } else {
                o000Oo0.OooO00o oooO00o = o0000ooVar.f59369OooO0o0;
                if (!(oooO00o != null && oooO00o.OooO00o()) && (o000oo1 = o0000ooVar.f59368OooO0o) != null) {
                    zOooO00o = o000oo1.OooO00o();
                }
            }
            zOooO00o = true;
        } else {
            zOooO00o = true;
        }
        return zOooO00o;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o00OOO0 o00ooo1;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        o0000O0 o0000o1 = o000o.f59396OooO00o;
        boolean z = true;
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        o0O00o00 o0o00o01 = null;
        o0O00O0o request = o0o00o0o;
        boolean z2 = true;
        while (true) {
            o0000o1.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(o0000o1.f59315OooOOOO == null ? z : false)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (o0000o1) {
                if (!(o0000o1.f59318OooOOo0 ^ z)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(o0000o1.f59316OooOOOo ^ z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z2) {
                o000O000 o000o001 = o0000o1.f59308OooO0oO;
                o0O000O o0o000o = request.f57828OooO00o;
                boolean z3 = o0o000o.f57797OooOO0;
                o0OoO00O o0ooo00o2 = o0000o1.f59305OooO0Oo;
                if (z3) {
                    SSLSocketFactory sSLSocketFactory2 = o0ooo00o2.f57899OooOOoo;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = o0ooo00o2.f57904OooOo0o;
                    o00ooo1 = o0ooo00o2.f57900OooOo;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    o00ooo1 = null;
                }
                o0000o1.f59312OooOO0o = new o0000oo(o000o001, new o00OO00O(o0o000o.f57792OooO0Oo, o0o000o.f57794OooO0o0, o0ooo00o2.f57893OooOOO, o0ooo00o2.f57897OooOOo, sSLSocketFactory, hostnameVerifier, o00ooo1, o0ooo00o2.f57898OooOOo0, o0ooo00o2.f57895OooOOOO, o0ooo00o2.f57903OooOo0O, o0ooo00o2.f57901OooOo0, o0ooo00o2.f57896OooOOOo), o0000o1, o0000o1.f59309OooO0oo);
            }
            try {
                if (o0000o1.f59319OooOOoo) {
                    throw new IOException("Canceled");
                }
                try {
                    o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(request);
                    if (o0o00o01 != null) {
                        o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o00OooO0OO);
                        o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o(o0o00o01);
                        oooO00o2.f57867OooO0oO = null;
                        o0O00o00 o0o00o00OooO00o = oooO00o2.OooO00o();
                        if (!(o0o00o00OooO00o.f57852OooOO0 == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        oooO00o.f57869OooOO0 = o0o00o00OooO00o;
                        o0o00o00OooO0OO = oooO00o.OooO00o();
                    }
                    o0o00o01 = o0o00o00OooO0OO;
                    o0000O00 o0000o00 = o0000o1.f59315OooOOOO;
                    try {
                        request = OooO00o(o0o00o01, o0000o00);
                        if (request == null) {
                            if (o0000o00 != null && o0000o00.f59332OooO0o0) {
                                if (!(!o0000o1.f59313OooOOO)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                o0000o1.f59313OooOOO = true;
                                o0000o1.f59304OooO.OooOO0();
                            }
                            o0000o1.OooO0o(false);
                            return o0o00o01;
                        }
                        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
                        if (o0oo0ooo2 != null && o0oo0ooo2.isOneShot()) {
                            o0000o1.OooO0o(false);
                            return o0o00o01;
                        }
                        o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
                        if (o0o00oo1 != null) {
                            oO000o00.OooO0OO(o0o00oo1);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i)));
                        }
                        o0000o1.OooO0o(true);
                        listEmptyList = listEmptyList;
                        z2 = true;
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!OooO0O0(e, o0000o1, request, !(e instanceof ConnectionShutdownException))) {
                        oO000o00.OooOoOO(e, listEmptyList);
                        throw e;
                    }
                    listEmptyList = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e);
                    o0000o1.OooO0o(true);
                    z = true;
                    i = i;
                    z2 = false;
                } catch (RouteException e2) {
                    List list = listEmptyList;
                    if (!OooO0O0(e2.f60180OooO0o0, o0000o1, request, false)) {
                        IOException iOException = e2.f60179OooO0Oo;
                        oO000o00.OooOoOO(iOException, list);
                        throw iOException;
                    }
                    List listPlus = CollectionsKt.plus((Collection<? extends IOException>) list, e2.f60179OooO0Oo);
                    o0000o1.OooO0o(true);
                    z = true;
                    i = i;
                    listEmptyList = listPlus;
                    z2 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            o0000o1.OooO0o(true);
            throw th;
        }
    }
}
