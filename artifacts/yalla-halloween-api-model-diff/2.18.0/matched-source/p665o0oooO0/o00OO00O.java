package p665o0oooO0;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p661o0ooo0o.o00OOO00;
import p662o0ooo0o0.o000OO00;
import p662o0ooo0o0.o00O;
import p662o0ooo0o0.o00O00;
import p662o0ooo0o0.o00O000o;
import p662o0ooo0o0.o00O00o0;
import p662o0ooo0o0.o00O0OO;
import p662o0ooo0o0.o00OOO0;
import p662o0ooo0o0.o00OOOOo;
import p662o0ooo0o0.o0oOO;
import p662o0ooo0o0.oOO00O;
import p664o0oooO.o00O0;
import p664o0oooO.o00O0O0;
import p664o0oooO.o00O0O0O;
import p664o0oooO.o00O0OOO;
import p664o0oooO.o00oOoo;
import p664o0oooO.o0O0ooO;
import p666o0oooO00.o000000O;
import p666o0oooO00.o000OOo;
import p667o0oooO0O.oO00o000;
import p668o0oooO0o.oO00o0;
import p668o0oooO0o.oO0OO00o;
import p669o0oooOO.r;
import p672o0oooOo.v;
import p676o0oooo0.o0O000Oo;
import p676o0oooo0.o0O00O;
import p676o0oooo0.o0O00OO;
import p676o0oooo0.o0O0O0O;
import p676o0oooo0.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O extends o00oOoo.OooO0o implements oOO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f51797OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Socket f51798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f51799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O f51800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00oOoo f51801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Protocol f51802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O00OO f51803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0O00O f51804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f51805OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f51806OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f51807OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f51808OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f51809OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final List<Reference<o00O0OO>> f51810OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f51811OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0oOO f51812OooOOo0;

    public o00OO00O(@NotNull o00OO0OO connectionPool, @NotNull o0oOO route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f51812OooOOo0 = route;
        this.f51808OooOOO = 1;
        this.f51810OooOOOO = new ArrayList();
        this.f51811OooOOOo = Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<o0oooO0.o00O0OO>>] */
    public final boolean OooO(@NotNull o000OO00 address, @Nullable List<o0oOO> list) {
        boolean z;
        boolean z2;
        o00O o00o2;
        boolean z3;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = o00OOO00.f51201OooO00o;
        if (this.f51810OooOOOO.size() >= this.f51808OooOOO || this.f51797OooO || !this.f51812OooOOo0.f51472OooO00o.OooO00o(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.f51211OooO00o.f51319OooO0o0, this.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51319OooO0o0)) {
            return true;
        }
        if (this.f51801OooO0o != null && list != null) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    o0oOO o0ooo2 = (o0oOO) it.next();
                    if (o0ooo2.f51473OooO0O0.type() == Proxy.Type.DIRECT && this.f51812OooOOo0.f51473OooO0O0.type() == Proxy.Type.DIRECT && Intrinsics.areEqual(this.f51812OooOOo0.f51474OooO0OO, o0ooo2.f51474OooO0OO)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                HostnameVerifier hostnameVerifier = address.f51217OooO0oO;
                v vVar = v.f51965OooO00o;
                if (hostnameVerifier != vVar) {
                    return false;
                }
                p662o0ooo0o0.o00OO00O o00oo00o = address.f51211OooO00o;
                byte[] bArr2 = o00OOO00.f51201OooO00o;
                p662o0ooo0o0.o00OO00O o00oo00o2 = this.f51812OooOOo0.f51472OooO00o.f51211OooO00o;
                if (o00oo00o.f51318OooO0o == o00oo00o2.f51318OooO0o) {
                    if (!Intrinsics.areEqual(o00oo00o.f51319OooO0o0, o00oo00o2.f51319OooO0o0)) {
                        if (!this.f51805OooOO0 && (o00o2 = this.f51800OooO0Oo) != null) {
                            Intrinsics.checkNotNull(o00o2);
                            List<Certificate> listOooO0O0 = o00o2.OooO0O0();
                            if (!listOooO0O0.isEmpty()) {
                                String str = o00oo00o.f51319OooO0o0;
                                Certificate certificate = listOooO0O0.get(0);
                                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                if (vVar.OooO0Oo(str, (X509Certificate) certificate)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                        z2 = false;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                try {
                    o00O000o o00o000o2 = address.f51218OooO0oo;
                    Intrinsics.checkNotNull(o00o000o2);
                    String hostname = address.f51211OooO00o.f51319OooO0o0;
                    o00O o00o3 = this.f51800OooO0Oo;
                    Intrinsics.checkNotNull(o00o3);
                    List<Certificate> peerCertificates = o00o3.OooO0O0();
                    Objects.requireNonNull(o00o000o2);
                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                    o00o000o2.OooO00o(hostname, new o00O00(o00o000o2, peerCertificates, hostname));
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    @Override // p662o0ooo0o0.oOO00O
    @NotNull
    public final Socket OooO00o() {
        Socket socket = this.f51799OooO0OO;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // o0oooO.o00oOoo.OooO0o
    public final synchronized void OooO0O0(@NotNull o00oOoo connection, @NotNull o00O0OOO settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f51808OooOOO = (settings.f51675OooO00o & 16) != 0 ? settings.f51676OooO0O0[4] : Integer.MAX_VALUE;
    }

    @Override // o0oooO.o00oOoo.OooO0o
    public final void OooO0OO(@NotNull o00O0O0 stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:0: B:96:0x0075->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168  */
    public final void OooO0Oo(int i, int i2, int i3, int i4, boolean z, @NotNull p662o0ooo0o0.o00oOoo call, @NotNull o00O0OO eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        boolean z3 = false;
        if (!(this.f51802OooO0o0 == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<o00O00o0> list = this.f51812OooOOo0.f51472OooO00o.f51213OooO0OO;
        o00O0O0O o00o0o0o2 = new o00O0O0O(list);
        o000OO00 o000oo01 = this.f51812OooOOo0.f51472OooO00o;
        if (o000oo01.f51215OooO0o == null) {
            if (!list.contains(o00O00o0.f51286OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51319OooO0o0;
            r.OooO00o oooO00o = r.f51939OooO0OO;
            if (!r.f51937OooO00o.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(OooO0OO.OooO00o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o000oo01.f51212OooO0O0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                o0oOO o0ooo2 = this.f51812OooOOo0;
                if (o0ooo2.f51472OooO00o.f51215OooO0o != null && o0ooo2.f51473OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0oO(i, i2, i3, call, eventListener);
                    if (this.f51798OooO0O0 == null) {
                        break;
                    }
                } else {
                    try {
                        OooO0o(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f51799OooO0OO;
                        if (socket != null) {
                            o00OOO00.OooO0o0(socket);
                        }
                        socket2 = this.f51798OooO0O0;
                        if (socket2 != null) {
                            o00OOO00.OooO0o0(socket2);
                        }
                        this.f51799OooO0OO = null;
                        this.f51798OooO0O0 = null;
                        this.f51803OooO0oO = null;
                        this.f51804OooO0oo = null;
                        this.f51800OooO0Oo = null;
                        this.f51802OooO0o0 = null;
                        this.f51801OooO0o = null;
                        this.f51808OooOOO = 1;
                        o0oOO o0ooo3 = this.f51812OooOOo0;
                        eventListener.connectFailed(call, o0ooo3.f51474OooO0OO, o0ooo3.f51473OooO0O0, null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics.checkNotNullParameter(e, "e");
                            ExceptionsKt.addSuppressed(routeException.f53049OoooO00, e);
                            routeException.f53048Oooo = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics.checkNotNullParameter(e, "e");
                        o00o0o0o2.f51742OooO0OO = true;
                        if (!o00o0o0o2.f51741OooO0O0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            throw routeException;
                        }
                    }
                }
                try {
                    OooO0oo(o00o0o0o2, i4, call, eventListener);
                    o0oOO o0ooo4 = this.f51812OooOOo0;
                    eventListener.connectEnd(call, o0ooo4.f51474OooO0OO, o0ooo4.f51473OooO0O0, this.f51802OooO0o0);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f51799OooO0OO;
                    if (socket != null) {
                        o00OOO00.OooO0o0(socket);
                    }
                    socket2 = this.f51798OooO0O0;
                    if (socket2 != null) {
                        o00OOO00.OooO0o0(socket2);
                    }
                    this.f51799OooO0OO = null;
                    this.f51798OooO0O0 = null;
                    this.f51803OooO0oO = null;
                    this.f51804OooO0oo = null;
                    this.f51800OooO0Oo = null;
                    this.f51802OooO0o0 = null;
                    this.f51801OooO0o = null;
                    this.f51808OooOOO = 1;
                    o0oOO o0ooo5 = this.f51812OooOOo0;
                    eventListener.connectFailed(call, o0ooo5.f51474OooO0OO, o0ooo5.f51473OooO0O0, null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        ExceptionsKt.addSuppressed(routeException.f53049OoooO00, e);
                        routeException.f53048Oooo = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    o00o0o0o2.f51742OooO0OO = true;
                    if (!o00o0o0o2.f51741OooO0O0 || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        throw routeException;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        o0oOO o0ooo6 = this.f51812OooOOo0;
        if (o0ooo6.f51472OooO00o.f51215OooO0o != null && o0ooo6.f51473OooO0O0.type() == Proxy.Type.HTTP) {
            z3 = true;
        }
        if (z3 && this.f51798OooO0O0 == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f51811OooOOOo = System.nanoTime();
    }

    public final void OooO0o(int i, int i2, p662o0ooo0o0.o00oOoo o00oooo2, o00O0OO o00o0oo2) throws IOException {
        Socket socket;
        int i3;
        o0oOO o0ooo2 = this.f51812OooOOo0;
        Proxy proxy = o0ooo2.f51473OooO0O0;
        o000OO00 o000oo01 = o0ooo2.f51472OooO00o;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = o00O0OOO.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) {
            socket = o000oo01.f51216OooO0o0.createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f51798OooO0O0 = socket;
        o00o0oo2.connectStart(o00oooo2, this.f51812OooOOo0.f51474OooO0OO, proxy);
        socket.setSoTimeout(i2);
        try {
            r.OooO00o oooO00o = r.f51939OooO0OO;
            r.f51937OooO00o.OooO0o0(socket, this.f51812OooOOo0.f51474OooO0OO, i);
            try {
                this.f51803OooO0oO = (o0O00OO) o0O000Oo.OooO0OO(o0O000Oo.OooOO0(socket));
                this.f51804OooO0oo = (o0O00O) o0O000Oo.OooO0O0(o0O000Oo.OooO0o(socket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("Failed to connect to ");
            sbOooO0O0.append(this.f51812OooOOo0.f51474OooO0OO);
            ConnectException connectException = new ConnectException(sbOooO0O0.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void OooO0o0(@NotNull p662o0ooo0o0.o00OOO00 client, @NotNull o0oOO failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f51473OooO0O0.type() != Proxy.Type.DIRECT) {
            o000OO00 o000oo01 = failedRoute.f51472OooO00o;
            o000oo01.f51220OooOO0O.connectFailed(o000oo01.f51211OooO00o.OooOO0o(), failedRoute.f51473OooO0O0.address(), failure);
        }
        oo0O oo0o = client.f51377o00oO0o;
        synchronized (oo0o) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            oo0o.f51822OooO00o.add(failedRoute);
        }
    }

    public final void OooO0oO(int i, int i2, int i3, p662o0ooo0o0.o00oOoo o00oooo2, o00O0OO o00o0oo2) throws IOException {
        int i4;
        o00OOO0.OooO00o oooO00o = new o00OOO0.OooO00o();
        oooO00o.OooOOO0(this.f51812OooOOo0.f51472OooO00o.f51211OooO00o);
        p662o0ooo0o0.o00OOO00 o00ooo01 = null;
        oooO00o.OooO0oO("CONNECT", null);
        boolean z = true;
        oooO00o.OooO0o0("Host", o00OOO00.OooOoO0(this.f51812OooOOo0.f51472OooO00o.f51211OooO00o, true));
        oooO00o.OooO0o0("Proxy-Connection", "Keep-Alive");
        oooO00o.OooO0o0("User-Agent", "okhttp/4.9.3");
        o00OOO0 request = oooO00o.OooO0O0();
        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o();
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f51433OooO00o = request;
        oooO00o2.OooO0o(Protocol.HTTP_1_1);
        oooO00o2.f51435OooO0OO = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f51436OooO0Oo = "Preemptive Authenticate";
        oooO00o2.f51439OooO0oO = o00OOO00.f51203OooO0OO;
        oooO00o2.f51442OooOO0O = -1L;
        oooO00o2.f51443OooOO0o = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        oooO00o2.f51437OooO0o.OooO0oO("Proxy-Authenticate", "OkHttp-Preemptive");
        o00OOOOo o00oooooOooO00o = oooO00o2.OooO00o();
        o0oOO o0ooo2 = this.f51812OooOOo0;
        o00OOO0 o00ooo0Authenticate = o0ooo2.f51472OooO00o.f51210OooO.authenticate(o0ooo2, o00oooooOooO00o);
        if (o00ooo0Authenticate != null) {
            request = o00ooo0Authenticate;
        }
        p662o0ooo0o0.o00OO00O o00oo00o = request.f51339OooO0O0;
        int i5 = 0;
        while (i5 < 21) {
            OooO0o(i, i2, o00oooo2, o00o0oo2);
            String str = "CONNECT " + o00OOO00.OooOoO0(o00oo00o, z) + " HTTP/1.1";
            while (true) {
                o0O00OO o0o00oo2 = this.f51803OooO0oO;
                Intrinsics.checkNotNull(o0o00oo2);
                o0O00O o0o00o2 = this.f51804OooO0oo;
                Intrinsics.checkNotNull(o0o00o2);
                oO00o000 oo00o000 = new oO00o000(o00ooo01, this, o0o00oo2, o0o00o2);
                o0oO0O0o o0oo0o0oTimeout = o0o00oo2.timeout();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o0oo0o0oTimeout.OooO0oO(j, timeUnit);
                i4 = i5;
                o0o00o2.timeout().OooO0oO(i3, timeUnit);
                oo00o000.OooOO0O(request.f51341OooO0Oo, str);
                oo00o000.f51865OooO0oO.flush();
                o00OOOOo.OooO00o oooO00oOooO0OO = oo00o000.OooO0OO(false);
                Intrinsics.checkNotNull(oooO00oOooO0OO);
                Objects.requireNonNull(oooO00oOooO0OO);
                Intrinsics.checkNotNullParameter(request, "request");
                oooO00oOooO0OO.f51433OooO00o = request;
                o00OOOOo response = oooO00oOooO0OO.OooO00o();
                Intrinsics.checkNotNullParameter(response, "response");
                long jOooOO0o = o00OOO00.OooOO0o(response);
                if (jOooOO0o != -1) {
                    o0O0O0O o0o0o0oOooOO0 = oo00o000.OooOO0(jOooOO0o);
                    o00OOO00.OooOo0O(o0o0o0oOooOO0, Integer.MAX_VALUE);
                    ((oO00o000.OooO0o) o0o0o0oOooOO0).close();
                }
                int i6 = response.f51419OoooO;
                if (i6 == 200) {
                    if (!o0o00oo2.f52081Oooo.OooOooo() || !o0o00o2.f52072Oooo.OooOooo()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request = null;
                    break;
                }
                if (i6 != 407) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO0O0("Unexpected response code for CONNECT: ");
                    sbOooO0O0.append(response.f51419OoooO);
                    throw new IOException(sbOooO0O0.toString());
                }
                o0oOO o0ooo3 = this.f51812OooOOo0;
                request = o0ooo3.f51472OooO00o.f51210OooO.authenticate(o0ooo3, response);
                if (request == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt__StringsJVMKt.equals("close", response.OooO0O0("Connection", null), true)) {
                    break;
                }
                o00ooo01 = null;
                i2 = i2;
                i5 = i4;
            }
            if (request == null) {
                return;
            }
            Socket socket = this.f51798OooO0O0;
            if (socket != null) {
                o00OOO00.OooO0o0(socket);
            }
            o00ooo01 = null;
            this.f51798OooO0O0 = null;
            this.f51804OooO0oo = null;
            this.f51803OooO0oO = null;
            o0oOO o0ooo4 = this.f51812OooOOo0;
            o00o0oo2.connectEnd(o00oooo2, o0ooo4.f51474OooO0OO, o0ooo4.f51473OooO0O0, null);
            i5 = i4 + 1;
            z = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0oo(o00O0O0O o00o0o0o2, int i, p662o0ooo0o0.o00oOoo o00oooo2, o00O0OO o00o0oo2) throws Throwable {
        o000OO00 o000oo01 = this.f51812OooOOo0.f51472OooO00o;
        if (o000oo01.f51215OooO0o == null) {
            List<Protocol> list = o000oo01.f51212OooO0O0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f51799OooO0OO = this.f51798OooO0O0;
                this.f51802OooO0o0 = Protocol.HTTP_1_1;
                return;
            } else {
                this.f51799OooO0OO = this.f51798OooO0O0;
                this.f51802OooO0o0 = protocol;
                OooOOO(i);
                return;
            }
        }
        o00o0oo2.secureConnectStart(o00oooo2);
        o000OO00 o000oo02 = this.f51812OooOOo0.f51472OooO00o;
        SSLSocketFactory sSLSocketFactory = o000oo02.f51215OooO0o;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f51798OooO0O0;
            p662o0ooo0o0.o00OO00O o00oo00o = o000oo02.f51211OooO00o;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, o00oo00o.f51319OooO0o0, o00oo00o.f51318OooO0o, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                o00O00o0 o00o00o0OooO00o = o00o0o0o2.OooO00o(sSLSocket2);
                if (o00o00o0OooO00o.f51289OooO0O0) {
                    r.OooO00o oooO00o = r.f51939OooO0OO;
                    r.f51937OooO00o.OooO0Oo(sSLSocket2, o000oo02.f51211OooO00o.f51319OooO0o0, o000oo02.f51212OooO0O0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                o00O.OooO00o oooO00o2 = o00O.f51221OooO0o0;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                o00O o00oOooO00o = oooO00o2.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = o000oo02.f51217OooO0oO;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(o000oo02.f51211OooO00o.f51319OooO0o0, sslSocketSession)) {
                    o00O000o o00o000o2 = o000oo02.f51218OooO0oo;
                    Intrinsics.checkNotNull(o00o000o2);
                    this.f51800OooO0Oo = new o00O(o00oOooO00o.f51223OooO0O0, o00oOooO00o.f51224OooO0OO, o00oOooO00o.f51225OooO0Oo, new oo0oOO0(o00o000o2, o00oOooO00o, o000oo02));
                    o00o000o2.OooO00o(o000oo02.f51211OooO00o.f51319OooO0o0, new o00O(this));
                    if (o00o00o0OooO00o.f51289OooO0O0) {
                        r.OooO00o oooO00o3 = r.f51939OooO0OO;
                        strOooO0o = r.f51937OooO00o.OooO0o(sSLSocket2);
                    }
                    this.f51799OooO0OO = sSLSocket2;
                    this.f51803OooO0oO = (o0O00OO) o0O000Oo.OooO0OO(o0O000Oo.OooOO0(sSLSocket2));
                    this.f51804OooO0oo = (o0O00O) o0O000Oo.OooO0O0(o0O000Oo.OooO0o(sSLSocket2));
                    this.f51802OooO0o0 = strOooO0o != null ? Protocol.INSTANCE.OooO00o(strOooO0o) : Protocol.HTTP_1_1;
                    r.OooO00o oooO00o4 = r.f51939OooO0OO;
                    r.f51937OooO00o.OooO00o(sSLSocket2);
                    o00o0oo2.secureConnectEnd(o00oooo2, this.f51800OooO0Oo);
                    if (this.f51802OooO0o0 == Protocol.HTTP_2) {
                        OooOOO(i);
                        return;
                    }
                    return;
                }
                List<Certificate> listOooO0O0 = o00oOooO00o.OooO0O0();
                if (!(!listOooO0O0.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + o000oo02.f51211OooO00o.f51319OooO0o0 + " not verified (no certificates)");
                }
                Certificate certificate = listOooO0O0.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate certificate2 = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(o000oo02.f51211OooO00o.f51319OooO0o0);
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(o00O000o.f51258OooO0Oo.OooO00o(certificate2));
                sb.append("\n              |    DN: ");
                Principal subjectDN = certificate2.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                v vVar = v.f51965OooO00o;
                Intrinsics.checkNotNullParameter(certificate2, "certificate");
                sb.append(CollectionsKt.plus((Collection) vVar.OooO0O0(certificate2, 7), (Iterable) vVar.OooO0O0(certificate2, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    r.OooO00o oooO00o5 = r.f51939OooO0OO;
                    r.f51937OooO00o.OooO00o(sSLSocket);
                }
                if (sSLSocket != null) {
                    o00OOO00.OooO0o0(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean OooOO0(boolean z) {
        long j;
        byte[] bArr = o00OOO00.f51201OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f51798OooO0O0;
        Intrinsics.checkNotNull(socket);
        Socket isHealthy = this.f51799OooO0OO;
        Intrinsics.checkNotNull(isHealthy);
        o0O00OO source = this.f51803OooO0oO;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || isHealthy.isClosed() || isHealthy.isInputShutdown() || isHealthy.isOutputShutdown()) {
            return false;
        }
        o00oOoo o00oooo2 = this.f51801OooO0o;
        if (o00oooo2 != null) {
            synchronized (o00oooo2) {
                if (o00oooo2.f51699o000oOoO) {
                    return false;
                }
                return o00oooo2.f51693OooooOO >= o00oooo2.f51692OooooO0 || jNanoTime < o00oooo2.f51694OooooOo;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f51811OooOOOo;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                return !source.OooOooo();
            } finally {
                isHealthy.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final boolean OooOO0O() {
        return this.f51801OooO0o != null;
    }

    @NotNull
    public final oO00o0 OooOO0o(@NotNull p662o0ooo0o0.o00OOO00 client, @NotNull oO0OO00o chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f51799OooO0OO;
        Intrinsics.checkNotNull(socket);
        o0O00OO o0o00oo2 = this.f51803OooO0oO;
        Intrinsics.checkNotNull(o0o00oo2);
        o0O00O o0o00o2 = this.f51804OooO0oo;
        Intrinsics.checkNotNull(o0o00o2);
        o00oOoo o00oooo2 = this.f51801OooO0o;
        if (o00oooo2 != null) {
            return new o00O0(client, this, chain, o00oooo2);
        }
        socket.setSoTimeout(chain.f51896OooO0oo);
        o0oO0O0o o0oo0o0oTimeout = o0o00oo2.timeout();
        long j = chain.f51896OooO0oo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0oo0o0oTimeout.OooO0oO(j, timeUnit);
        o0o00o2.timeout().OooO0oO(chain.f51888OooO, timeUnit);
        return new oO00o000(client, this, o0o00oo2, o0o00o2);
    }

    public final void OooOOO(int i) throws IOException {
        String strOooO00o;
        int i2;
        Socket socket = this.f51799OooO0OO;
        Intrinsics.checkNotNull(socket);
        o0O00OO source = this.f51803OooO0oO;
        Intrinsics.checkNotNull(source);
        o0O00O sink = this.f51804OooO0oo;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        o000000O taskRunner = o000000O.f51843OooO0oo;
        o00oOoo.OooO0O0 oooO0O0 = new o00oOoo.OooO0O0(taskRunner);
        String peerName = this.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51319OooO0o0;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        oooO0O0.f51714OooO00o = socket;
        if (oooO0O0.f51721OooO0oo) {
            strOooO00o = o00OOO00.f51207OooO0oO + ' ' + peerName;
        } else {
            strOooO00o = OooOo00.OooO00o("MockWebServer ", peerName);
        }
        oooO0O0.f51715OooO0O0 = strOooO00o;
        oooO0O0.f51716OooO0OO = source;
        oooO0O0.f51717OooO0Oo = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        oooO0O0.f51719OooO0o0 = this;
        oooO0O0.f51720OooO0oO = i;
        o00oOoo o00oooo2 = new o00oOoo(oooO0O0);
        this.f51801OooO0o = o00oooo2;
        o00oOoo.OooO0OO oooO0OO = o00oOoo.f51678oo000o;
        o00O0OOO o00o0ooo2 = o00oOoo.f51677o00ooo;
        this.f51808OooOOO = (o00o0ooo2.f51675OooO00o & 16) != 0 ? o00o0ooo2.f51676OooO0O0[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        o00O0O0O o00o0o0o2 = o00oooo2.f51701o00Oo0;
        synchronized (o00o0o0o2) {
            if (o00o0o0o2.f51663OoooO0) {
                throw new IOException("closed");
            }
            if (o00o0o0o2.f51666OoooOO0) {
                Logger logger = o00O0O0O.f51660o000oOoO;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o00OOO00.OooOO0(">> CONNECTION " + o0O0ooO.f51729OooO00o.OooO0o(), new Object[0]));
                }
                o00o0o0o2.f51662OoooO.o000000(o0O0ooO.f51729OooO00o);
                o00o0o0o2.f51662OoooO.flush();
            }
        }
        o00O0O0O o00o0o0o3 = o00oooo2.f51701o00Oo0;
        o00O0OOO settings = o00oooo2.f51696Oooooo0;
        synchronized (o00o0o0o3) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (o00o0o0o3.f51663OoooO0) {
                throw new IOException("closed");
            }
            o00o0o0o3.OooO0O0(0, Integer.bitCount(settings.f51675OooO00o) * 6, 4, 0);
            int i3 = 0;
            while (i3 < 10) {
                boolean z = true;
                if (((1 << i3) & settings.f51675OooO00o) == 0) {
                    z = false;
                }
                if (z) {
                    if (i3 != 4) {
                        i2 = i3 != 7 ? i3 : 4;
                    } else {
                        i2 = 3;
                    }
                    o00o0o0o3.f51662OoooO.OooOo0(i2);
                    o00o0o0o3.f51662OoooO.OooOo0o(settings.f51676OooO0O0[i3]);
                }
                i3++;
            }
            o00o0o0o3.f51662OoooO.flush();
        }
        int iOooO00o = o00oooo2.f51696Oooooo0.OooO00o();
        if (iOooO00o != 65535) {
            o00oooo2.f51701o00Oo0.OooO0oO(0, iOooO00o - 65535);
        }
        taskRunner.OooO0o().OooO0OO(new o000OOo(o00oooo2.f51702o00Ooo, o00oooo2.f51683OoooO0O), 0L);
    }

    public final synchronized void OooOOO0() {
        this.f51797OooO = true;
    }

    @NotNull
    public final String toString() {
        Object obj;
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("Connection{");
        sbOooO0O0.append(this.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51319OooO0o0);
        sbOooO0O0.append(':');
        sbOooO0O0.append(this.f51812OooOOo0.f51472OooO00o.f51211OooO00o.f51318OooO0o);
        sbOooO0O0.append(',');
        sbOooO0O0.append(" proxy=");
        sbOooO0O0.append(this.f51812OooOOo0.f51473OooO0O0);
        sbOooO0O0.append(" hostAddress=");
        sbOooO0O0.append(this.f51812OooOOo0.f51474OooO0OO);
        sbOooO0O0.append(" cipherSuite=");
        o00O o00o2 = this.f51800OooO0Oo;
        if (o00o2 == null || (obj = o00o2.f51224OooO0OO) == null) {
            obj = "none";
        }
        sbOooO0O0.append(obj);
        sbOooO0O0.append(" protocol=");
        sbOooO0O0.append(this.f51802OooO0o0);
        sbOooO0O0.append('}');
        return sbOooO0O0.toString();
    }
}
