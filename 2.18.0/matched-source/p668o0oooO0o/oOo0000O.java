package p668o0oooO0o;

import com.qiniu.android.http.request.Request;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
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
import p662o0ooo0o0.o000OO00;
import p662o0ooo0o0.o00O000o;
import p662o0ooo0o0.o00OO0O0;
import p662o0ooo0o0.o00OOO0;
import p662o0ooo0o0.o00OOO00;
import p662o0ooo0o0.o00OOOO0;
import p662o0ooo0o0.o00OOOOo;
import p662o0ooo0o0.o00Oo00;
import p662o0ooo0o0.o0oOO;
import p665o0oooO0.o00O0OO;
import p665o0oooO0.o00O0OO0;
import p665o0oooO0.o00OO;
import p665o0oooO0.o00OO00O;
import p665o0oooO0.o00OO0OO;
import p665o0oooO0.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0000O implements o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOO00 f51898OooO00o;

    public oOo0000O(@NotNull o00OOO00 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f51898OooO00o = client;
    }

    public final o00OOO0 OooO00o(o00OOOOo o00ooooo2, o00O0OO0 o00o0oo1) throws IOException {
        String link;
        o00OO00O o00oo00o;
        o0oOO o0ooo2 = (o00o0oo1 == null || (o00oo00o = o00o0oo1.f51768OooO0O0) == null) ? null : o00oo00o.f51812OooOOo0;
        int i = o00ooooo2.f51419OoooO;
        o00OOO0 o00ooo1 = o00ooooo2.f51421OoooO00;
        String method = o00ooo1.f51340OooO0OO;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f51898OooO00o.f51372o000oOoO.authenticate(o0ooo2, o00ooooo2);
            }
            if (i == 421) {
                o00OOOO0 o00oooo1 = o00ooo1.f51343OooO0o0;
                if ((o00oooo1 != null && o00oooo1.isOneShot()) || o00o0oo1 == null || !(!Intrinsics.areEqual(o00o0oo1.f51772OooO0o0.f51831OooO0oo.f51211OooO00o.f51319OooO0o0, o00o0oo1.f51768OooO0O0.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51319OooO0o0))) {
                    return null;
                }
                o00OO00O o00oo00o2 = o00o0oo1.f51768OooO0O0;
                synchronized (o00oo00o2) {
                    o00oo00o2.f51805OooOO0 = true;
                }
                return o00ooooo2.f51421OoooO00;
            }
            if (i == 503) {
                o00OOOOo o00ooooo3 = o00ooooo2.f51427OoooOoO;
                if ((o00ooooo3 == null || o00ooooo3.f51419OoooO != 503) && OooO0OO(o00ooooo2, Integer.MAX_VALUE) == 0) {
                    return o00ooooo2.f51421OoooO00;
                }
                return null;
            }
            if (i == 407) {
                Intrinsics.checkNotNull(o0ooo2);
                if (o0ooo2.f51473OooO0O0.type() == Proxy.Type.HTTP) {
                    return this.f51898OooO00o.f51365OooooO0.authenticate(o0ooo2, o00ooooo2);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f51898OooO00o.f51357OoooOO0) {
                    return null;
                }
                o00OOOO0 o00oooo2 = o00ooo1.f51343OooO0o0;
                if (o00oooo2 != null && o00oooo2.isOneShot()) {
                    return null;
                }
                o00OOOOo o00ooooo4 = o00ooooo2.f51427OoooOoO;
                if ((o00ooooo4 == null || o00ooooo4.f51419OoooO != 408) && OooO0OO(o00ooooo2, 0) <= 0) {
                    return o00ooooo2.f51421OoooO00;
                }
                return null;
            }
            switch (i) {
                case ShopVehicleListModel.VehicleTagType_Vip300 /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f51898OooO00o.f51358OoooOOO || (link = o00ooooo2.OooO0O0("Location", null)) == null) {
            return null;
        }
        p662o0ooo0o0.o00OO00O o00oo00o3 = o00ooooo2.f51421OoooO00.f51339OooO0O0;
        Objects.requireNonNull(o00oo00o3);
        Intrinsics.checkNotNullParameter(link, "link");
        o0ooo0o0.o00OO00O.OooO00o oooO00oOooO0oO = o00oo00o3.OooO0oO(link);
        p662o0ooo0o0.o00OO00O url = oooO00oOooO0oO != null ? oooO00oOooO0oO.OooO0OO() : null;
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f51315OooO0O0, o00ooooo2.f51421OoooO00.f51339OooO0O0.f51315OooO0O0) && !this.f51898OooO00o.f51359OoooOOo) {
            return null;
        }
        o00OOO0.OooO00o oooO00o = new o00OOO0.OooO00o(o00ooooo2.f51421OoooO00);
        if (oOo00ooO.OooO00o(method)) {
            int i2 = o00ooooo2.f51419OoooO;
            Intrinsics.checkNotNullParameter(method, "method");
            boolean z = Intrinsics.areEqual(method, "PROPFIND") || i2 == 308 || i2 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(!Intrinsics.areEqual(method, "PROPFIND")) || i2 == 308 || i2 == 307) {
                oooO00o.OooO0oO(method, z ? o00ooooo2.f51421OoooO00.f51343OooO0o0 : null);
            } else {
                oooO00o.OooO0oO(Request.HttpMethodGet, null);
            }
            if (!z) {
                oooO00o.OooO("Transfer-Encoding");
                oooO00o.OooO("Content-Length");
                oooO00o.OooO("Content-Type");
            }
        }
        if (!p661o0ooo0o.o00OOO00.OooO00o(o00ooooo2.f51421OoooO00.f51339OooO0O0, url)) {
            oooO00o.OooO("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f51344OooO00o = url;
        return oooO00o.OooO0O0();
    }

    public final boolean OooO0O0(IOException iOException, o00O0OO o00o0oo2, o00OOO0 o00ooo1, boolean z) {
        boolean zOooO00o;
        o00OO o00oo2;
        o00OO00O o00oo00o;
        if (!this.f51898OooO00o.f51357OoooOO0) {
            return false;
        }
        if (z) {
            o00OOOO0 o00oooo1 = o00ooo1.f51343OooO0o0;
            if ((o00oooo1 != null && o00oooo1.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        oo0o0O0 oo0o0o0 = o00o0oo2.f51749OoooOO0;
        Intrinsics.checkNotNull(oo0o0o0);
        int i = oo0o0o0.f51826OooO0OO;
        if (i == 0 && oo0o0o0.f51827OooO0Oo == 0 && oo0o0o0.f51829OooO0o0 == 0) {
            zOooO00o = false;
        } else if (oo0o0o0.f51828OooO0o != null) {
            zOooO00o = true;
        } else {
            o0oOO o0ooo2 = null;
            if (i <= 1 && oo0o0o0.f51827OooO0Oo <= 1 && oo0o0o0.f51829OooO0o0 <= 0 && (o00oo00o = oo0o0o0.f51823OooO.f51761o000oOoO) != null) {
                synchronized (o00oo00o) {
                    if (o00oo00o.f51806OooOO0O == 0 && p661o0ooo0o.o00OOO00.OooO00o(o00oo00o.f51812OooOOo0.f51472OooO00o.f51211OooO00o, oo0o0o0.f51831OooO0oo.f51211OooO00o)) {
                        o0ooo2 = o00oo00o.f51812OooOOo0;
                    }
                }
            }
            if (o0ooo2 != null) {
                oo0o0o0.f51828OooO0o = o0ooo2;
            } else {
                o00OO.OooO00o oooO00o = oo0o0o0.f51824OooO00o;
                if ((oooO00o == null || !oooO00o.OooO00o()) && (o00oo2 = oo0o0o0.f51825OooO0O0) != null) {
                    zOooO00o = o00oo2.OooO00o();
                }
            }
            zOooO00o = true;
        }
        return zOooO00o;
    }

    public final int OooO0OO(o00OOOOo o00ooooo2, int i) {
        String strOooO0O0 = o00ooooo2.OooO0O0("Retry-After", null);
        if (strOooO0O0 == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strOooO0O0)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strOooO0O0);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // p662o0ooo0o0.o00OO0O0
    @NotNull
    public final o00OOOOo intercept(@NotNull o00OO0O0.OooO00o chain) throws Throwable {
        List listPlus;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o00O000o o00o000o2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        oO0OO00o oo0oo00o = (oO0OO00o) chain;
        o00OOO0 o00ooo1 = oo0oo00o.f51893OooO0o;
        o00O0OO o00o0oo2 = oo0oo00o.f51890OooO0O0;
        boolean z2 = true;
        List listEmptyList = CollectionsKt.emptyList();
        o00OOOOo o00ooooo2 = null;
        int i = 0;
        o00OOO0 request = o00ooo1;
        boolean z3 = true;
        while (true) {
            Objects.requireNonNull(o00o0oo2);
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(o00o0oo2.f51751OoooOOo == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (o00o0oo2) {
                if (!(o00o0oo2.f51753OoooOoO ^ z2)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(o00o0oo2.f51752OoooOo0 ^ z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z3) {
                o00OO0OO o00oo0oo = o00o0oo2.f51744Oooo;
                p662o0ooo0o0.o00OO00O o00oo00o = request.f51339OooO0O0;
                if (o00oo00o.f51314OooO00o) {
                    o00OOO00 o00ooo01 = o00o0oo2.f51758OooooOO;
                    SSLSocketFactory sSLSocketFactory2 = o00ooo01.f51367OooooOo;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = o00ooo01.f51371Ooooooo;
                    o00o000o2 = o00ooo01.f51379o0OoOo0;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    o00o000o2 = null;
                }
                String str = o00oo00o.f51319OooO0o0;
                int i2 = o00oo00o.f51318OooO0o;
                o00OOO00 o00ooo02 = o00o0oo2.f51758OooooOO;
                o00o0oo2.f51749OoooOO0 = new oo0o0O0(o00oo0oo, new o000OO00(str, i2, o00ooo02.f51362OoooOoo, o00ooo02.f51366OooooOO, sSLSocketFactory, hostnameVerifier, o00o000o2, o00ooo02.f51365OooooO0, o00ooo02.f51363Ooooo00, o00ooo02.f51370OoooooO, o00ooo02.f51368Oooooo, o00ooo02.f51364Ooooo0o), o00o0oo2, o00o0oo2.f51747OoooO00);
            }
            try {
                if (o00o0oo2.f51755Ooooo00) {
                    throw new IOException("Canceled");
                }
                try {
                    o00OOOOo o00oooooOooO0O0 = oo0oo00o.OooO0O0(request);
                    if (o00ooooo2 != 0) {
                        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00oooooOooO0O0);
                        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00ooooo2);
                        oooO00o2.f51439OooO0oO = null;
                        o00OOOOo o00oooooOooO00o = oooO00o2.OooO00o();
                        if (!(o00oooooOooO00o.f51424OoooOOO == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        oooO00o.f51441OooOO0 = o00oooooOooO00o;
                        o00oooooOooO0O0 = oooO00o.OooO00o();
                    }
                    o00OOOOo o00ooooo3 = o00oooooOooO0O0;
                    o00O0OO0 o00o0oo1 = o00o0oo2.f51751OoooOOo;
                    try {
                        request = OooO00o(o00ooooo3, o00o0oo1);
                        if (request == null) {
                            if (o00o0oo1 != null && o00o0oo1.f51767OooO00o) {
                                o00o0oo2.OooOO0o();
                            }
                            o00o0oo2.OooO0o(false);
                            return o00ooooo3;
                        }
                        o00OOOO0 o00oooo1 = request.f51343OooO0o0;
                        if (o00oooo1 != null && o00oooo1.isOneShot()) {
                            o00o0oo2.OooO0o(false);
                            return o00ooooo3;
                        }
                        o00Oo00 o00oo00 = o00ooooo3.f51424OoooOOO;
                        if (o00oo00 != null) {
                            p661o0ooo0o.o00OOO00.OooO0Oo(o00oo00);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                        o00o0oo2.OooO0o(true);
                        o00ooooo2 = o00ooooo3;
                        listEmptyList = listEmptyList;
                        z3 = true;
                        o00ooooo2 = o00ooooo2;
                        z2 = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!OooO0O0(e, o00o0oo2, request, !(e instanceof ConnectionShutdownException))) {
                        p661o0ooo0o.o00OOO00.OooOoo(e, listEmptyList);
                        throw e;
                    }
                    listPlus = CollectionsKt.plus((Collection<? extends IOException>) listEmptyList, e);
                    z = true;
                    o00o0oo2.OooO0o(z);
                    listEmptyList = listPlus;
                    i = i;
                    z3 = false;
                } catch (RouteException e2) {
                    List list = listEmptyList;
                    if (!OooO0O0(e2.f53048Oooo, o00o0oo2, request, false)) {
                        IOException iOException = e2.f53049OoooO00;
                        p661o0ooo0o.o00OOO00.OooOoo(iOException, list);
                        throw iOException;
                    }
                    listPlus = CollectionsKt.plus((Collection<? extends IOException>) list, e2.f53049OoooO00);
                    z = true;
                    o00o0oo2.OooO0o(z);
                    listEmptyList = listPlus;
                    i = i;
                    z3 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            o00o0oo2.OooO0o(true);
            throw th;
        }
    }
}
