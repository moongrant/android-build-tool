package p666o0oooO0o;

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
import p660o0ooo0o0.o000O;
import p660o0ooo0o0.o00O000;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o00Oo00;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00O0OO;
import p663o0oooO0.o00O0OO0;
import p663o0oooO0.o00OO0OO;
import p663o0oooO0.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO00o implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO f51872OooO00o;

    public oO0OO00o(@NotNull o00OO client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f51872OooO00o = client;
    }

    public final o00OOO00 OooO00o(o00OOOO0 o00oooo1, o00O0OO0 o00o0oo1) throws IOException {
        String link;
        p663o0oooO0.o00OO00O o00oo00o;
        o00Oo00 o00oo00 = (o00o0oo1 == null || (o00oo00o = o00o0oo1.f51750OooO0O0) == null) ? null : o00oo00o.f51794OooOOo0;
        int i = o00oooo1.f51443OoooO00;
        o00OOO00 o00ooo01 = o00oooo1.f51439Oooo0oO;
        String method = o00ooo01.f51426OooO0OO;
        if (i != 307 && i != 308) {
            if (i == 401) {
                return this.f51872OooO00o.f51326OoooO0O.authenticate(o00oo00, o00oooo1);
            }
            if (i == 421) {
                o0o0Oo o0o0oo = o00ooo01.f51429OooO0o0;
                if ((o0o0oo != null && o0o0oo.isOneShot()) || o00o0oo1 == null || !(!Intrinsics.areEqual(o00o0oo1.f51754OooO0o0.f51813OooO0oo.f51218OooO00o.f51387OooO0o0, o00o0oo1.f51750OooO0O0.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51387OooO0o0))) {
                    return null;
                }
                p663o0oooO0.o00OO00O o00oo00o2 = o00o0oo1.f51750OooO0O0;
                synchronized (o00oo00o2) {
                    o00oo00o2.f51787OooOO0 = true;
                }
                return o00oooo1.f51439Oooo0oO;
            }
            if (i == 503) {
                o00OOOO0 o00oooo2 = o00oooo1.f51446OoooOOO;
                if ((o00oooo2 == null || o00oooo2.f51443OoooO00 != 503) && OooO0OO(o00oooo1, Integer.MAX_VALUE) == 0) {
                    return o00oooo1.f51439Oooo0oO;
                }
                return null;
            }
            if (i == 407) {
                Intrinsics.checkNotNull(o00oo00);
                if (o00oo00.f51474OooO0O0.type() == Proxy.Type.HTTP) {
                    return this.f51872OooO00o.f51332OoooOoo.authenticate(o00oo00, o00oooo1);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i == 408) {
                if (!this.f51872OooO00o.f51324OoooO0) {
                    return null;
                }
                o0o0Oo o0o0oo2 = o00ooo01.f51429OooO0o0;
                if (o0o0oo2 != null && o0o0oo2.isOneShot()) {
                    return null;
                }
                o00OOOO0 o00oooo3 = o00oooo1.f51446OoooOOO;
                if ((o00oooo3 == null || o00oooo3.f51443OoooO00 != 408) && OooO0OO(o00oooo1, 0) <= 0) {
                    return o00oooo1.f51439Oooo0oO;
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
        if (!this.f51872OooO00o.f51323OoooO || (link = o00oooo1.OooO0O0("Location", null)) == null) {
            return null;
        }
        o00OO000 o00oo001 = o00oooo1.f51439Oooo0oO.f51425OooO0O0;
        Objects.requireNonNull(o00oo001);
        Intrinsics.checkNotNullParameter(link, "link");
        o00OO000.OooO00o oooO00oOooO0oO = o00oo001.OooO0oO(link);
        o00OO000 url = oooO00oOooO0oO != null ? oooO00oOooO0oO.OooO0OO() : null;
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f51383OooO0O0, o00oooo1.f51439Oooo0oO.f51425OooO0O0.f51383OooO0O0) && !this.f51872OooO00o.f51327OoooOO0) {
            return null;
        }
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(o00oooo1.f51439Oooo0oO);
        if (oO00o0.OooO00o(method)) {
            int i2 = o00oooo1.f51443OoooO00;
            Intrinsics.checkNotNullParameter(method, "method");
            boolean z = Intrinsics.areEqual(method, "PROPFIND") || i2 == 308 || i2 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(!Intrinsics.areEqual(method, "PROPFIND")) || i2 == 308 || i2 == 307) {
                oooO00o.OooO0oO(method, z ? o00oooo1.f51439Oooo0oO.f51429OooO0o0 : null);
            } else {
                oooO00o.OooO0oO(Request.HttpMethodGet, null);
            }
            if (!z) {
                oooO00o.OooO("Transfer-Encoding");
                oooO00o.OooO("Content-Length");
                oooO00o.OooO("Content-Type");
            }
        }
        if (!p659o0ooo0o.o00OOO00.OooO00o(o00oooo1.f51439Oooo0oO.f51425OooO0O0, url)) {
            oooO00o.OooO("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f51430OooO00o = url;
        return oooO00o.OooO0O0();
    }

    public final boolean OooO0O0(IOException iOException, o00O0OO o00o0oo2, o00OOO00 o00ooo01, boolean z) {
        boolean zOooO00o;
        p663o0oooO0.o00OO o00oo2;
        p663o0oooO0.o00OO00O o00oo00o;
        if (!this.f51872OooO00o.f51324OoooO0) {
            return false;
        }
        if (z) {
            o0o0Oo o0o0oo = o00ooo01.f51429OooO0o0;
            if ((o0o0oo != null && o0o0oo.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        oo0o0O0 oo0o0o0 = o00o0oo2.f51731OoooO0;
        Intrinsics.checkNotNull(oo0o0o0);
        int i = oo0o0o0.f51808OooO0OO;
        if (i == 0 && oo0o0o0.f51809OooO0Oo == 0 && oo0o0o0.f51811OooO0o0 == 0) {
            zOooO00o = false;
        } else if (oo0o0o0.f51810OooO0o != null) {
            zOooO00o = true;
        } else {
            o00Oo00 o00oo00 = null;
            if (i <= 1 && oo0o0o0.f51809OooO0Oo <= 1 && oo0o0o0.f51811OooO0o0 <= 0 && (o00oo00o = oo0o0o0.f51805OooO.f51733OoooO0O) != null) {
                synchronized (o00oo00o) {
                    if (o00oo00o.f51788OooOO0O == 0 && p659o0ooo0o.o00OOO00.OooO00o(o00oo00o.f51794OooOOo0.f51473OooO00o.f51218OooO00o, oo0o0o0.f51813OooO0oo.f51218OooO00o)) {
                        o00oo00 = o00oo00o.f51794OooOOo0;
                    }
                }
            }
            if (o00oo00 != null) {
                oo0o0o0.f51810OooO0o = o00oo00;
            } else {
                o0oooO0.o00OO.OooO00o oooO00o = oo0o0o0.f51806OooO00o;
                if ((oooO00o == null || !oooO00o.OooO00o()) && (o00oo2 = oo0o0o0.f51807OooO0O0) != null) {
                    zOooO00o = o00oo2.OooO00o();
                }
            }
            zOooO00o = true;
        }
        return zOooO00o;
    }

    public final int OooO0OO(o00OOOO0 o00oooo1, int i) {
        String strOooO0O0 = o00oooo1.OooO0O0("Retry-After", null);
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

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws Throwable {
        List listPlus;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        o00O000 o00o001;
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o00O0OO o00o0oo2 = ooo00o0o.f51880OooO0O0;
        boolean z2 = true;
        List listEmptyList = CollectionsKt.emptyList();
        o00OOOO0 o00oooo1 = null;
        int i = 0;
        o00OOO00 request = o00ooo01;
        boolean z3 = true;
        while (true) {
            Objects.requireNonNull(o00o0oo2);
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(o00o0oo2.f51734OoooOO0 == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (o00o0oo2) {
                if (!(o00o0oo2.f51735OoooOOO ^ z2)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(o00o0oo2.f51743o000oOoO ^ z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z3) {
                o00OO0OO o00oo0oo = o00o0oo2.f51727Oooo0o;
                o00OO000 o00oo001 = request.f51425OooO0O0;
                if (o00oo001.f51382OooO00o) {
                    o00OO o00oo2 = o00o0oo2.f51740Ooooo00;
                    SSLSocketFactory sSLSocketFactory2 = o00oo2.f51334Ooooo0o;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = o00oo2.f51339Oooooo0;
                    o00o001 = o00oo2.f51338Oooooo;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    o00o001 = null;
                }
                String str = o00oo001.f51387OooO0o0;
                int i2 = o00oo001.f51386OooO0o;
                o00OO o00oo3 = o00o0oo2.f51740Ooooo00;
                o00o0oo2.f51731OoooO0 = new oo0o0O0(o00oo0oo, new o000O(str, i2, o00oo3.f51329OoooOOo, o00oo3.f51333Ooooo00, sSLSocketFactory, hostnameVerifier, o00o001, o00oo3.f51332OoooOoo, o00oo3.f51330OoooOo0, o00oo3.f51337OooooOo, o00oo3.f51336OooooOO, o00oo3.f51331OoooOoO), o00o0oo2, o00o0oo2.f51728Oooo0oO);
            }
            try {
                if (o00o0oo2.f51737OoooOo0) {
                    throw new IOException("Canceled");
                }
                try {
                    o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(request);
                    if (o00oooo1 != 0) {
                        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
                        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(o00oooo1);
                        oooO00o2.f51458OooO0oO = null;
                        o00OOOO0 o00oooo0OooO00o = oooO00o2.OooO00o();
                        if (!(o00oooo0OooO00o.f51441OoooO == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        oooO00o.f51460OooOO0 = o00oooo0OooO00o;
                        o00oooo0OooO0O0 = oooO00o.OooO00o();
                    }
                    o00OOOO0 o00oooo2 = o00oooo0OooO0O0;
                    o00O0OO0 o00o0oo1 = o00o0oo2.f51734OoooOO0;
                    try {
                        request = OooO00o(o00oooo2, o00o0oo1);
                        if (request == null) {
                            if (o00o0oo1 != null && o00o0oo1.f51749OooO00o) {
                                o00o0oo2.OooOO0o();
                            }
                            o00o0oo2.OooO0o(false);
                            return o00oooo2;
                        }
                        o0o0Oo o0o0oo = request.f51429OooO0o0;
                        if (o0o0oo != null && o0o0oo.isOneShot()) {
                            o00o0oo2.OooO0o(false);
                            return o00oooo2;
                        }
                        o00OOOOo o00ooooo2 = o00oooo2.f51441OoooO;
                        if (o00ooooo2 != null) {
                            p659o0ooo0o.o00OOO00.OooO0Oo(o00ooooo2);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                        o00o0oo2.OooO0o(true);
                        o00oooo1 = o00oooo2;
                        listEmptyList = listEmptyList;
                        z3 = true;
                        o00oooo1 = o00oooo1;
                        z2 = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!OooO0O0(e, o00o0oo2, request, !(e instanceof ConnectionShutdownException))) {
                        p659o0ooo0o.o00OOO00.OooOoo(e, listEmptyList);
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
                    if (!OooO0O0(e2.f53032Oooo0o, o00o0oo2, request, false)) {
                        IOException iOException = e2.f53033Oooo0oO;
                        p659o0ooo0o.o00OOO00.OooOoo(iOException, list);
                        throw iOException;
                    }
                    listPlus = CollectionsKt.plus((Collection<? extends IOException>) list, e2.f53033Oooo0oO);
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
