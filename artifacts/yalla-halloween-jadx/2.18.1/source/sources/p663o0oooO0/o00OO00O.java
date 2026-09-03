package p663o0oooO0;

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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o000O;
import p660o0ooo0o0.o00O000;
import p660o0ooo0o0.o00O000o;
import p660o0ooo0o0.o00O00O;
import p660o0ooo0o0.o00O00OO;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00Oo00;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.oo0o0O0;
import p660o0ooo0o0.oo0oOO0;
import p662o0oooO.o00O0;
import p662o0oooO.o00O0O0;
import p662o0oooO.o00O0O0O;
import p662o0oooO.o00O0OOO;
import p662o0oooO.o00oOoo;
import p664o0oooO00.o000000O;
import p664o0oooO00.o000OOo;
import p665o0oooO0O.oO00Oo0;
import p666o0oooO0o.oO0OOO00;
import p666o0oooO0o.oOo00o0o;
import p667o0oooOO.s;
import p670o0oooOo.w;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O extends o00oOoo.OooO0o implements o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f51779OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Socket f51780OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f51781OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oo0oOO0 f51782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00oOoo f51783OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Protocol f51784OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O00OO f51785OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0O00O f51786OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f51787OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f51788OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f51789OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f51790OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f51791OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final List<Reference<o00O0OO>> f51792OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f51793OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o00Oo00 f51794OooOOo0;

    public o00OO00O(@NotNull o00OO0OO connectionPool, @NotNull o00Oo00 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f51794OooOOo0 = route;
        this.f51790OooOOO = 1;
        this.f51792OooOOOO = new ArrayList();
        this.f51793OooOOOo = Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<o0oooO0.o00O0OO>>] */
    public final boolean OooO(@NotNull o000O address, @Nullable List<o00Oo00> list) {
        boolean z;
        boolean z2;
        oo0oOO0 oo0ooo0;
        boolean z3;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = o00OOO00.f51183OooO00o;
        if (this.f51792OooOOOO.size() >= this.f51790OooOOO || this.f51779OooO || !this.f51794OooOOo0.f51473OooO00o.OooO00o(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.f51218OooO00o.f51387OooO0o0, this.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51387OooO0o0)) {
            return true;
        }
        if (this.f51783OooO0o != null && list != null) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    o00Oo00 o00oo00 = (o00Oo00) it.next();
                    if (o00oo00.f51474OooO0O0.type() == Proxy.Type.DIRECT && this.f51794OooOOo0.f51474OooO0O0.type() == Proxy.Type.DIRECT && Intrinsics.areEqual(this.f51794OooOOo0.f51475OooO0OO, o00oo00.f51475OooO0OO)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                HostnameVerifier hostnameVerifier = address.f51224OooO0oO;
                w wVar = w.f51947OooO00o;
                if (hostnameVerifier != wVar) {
                    return false;
                }
                o00OO000 o00oo001 = address.f51218OooO00o;
                byte[] bArr2 = o00OOO00.f51183OooO00o;
                o00OO000 o00oo002 = this.f51794OooOOo0.f51473OooO00o.f51218OooO00o;
                if (o00oo001.f51386OooO0o == o00oo002.f51386OooO0o) {
                    if (!Intrinsics.areEqual(o00oo001.f51387OooO0o0, o00oo002.f51387OooO0o0)) {
                        if (!this.f51787OooOO0 && (oo0ooo0 = this.f51782OooO0Oo) != null) {
                            Intrinsics.checkNotNull(oo0ooo0);
                            List<Certificate> listOooO0O0 = oo0ooo0.OooO0O0();
                            if (!listOooO0O0.isEmpty()) {
                                String str = o00oo001.f51387OooO0o0;
                                Certificate certificate = listOooO0O0.get(0);
                                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                if (wVar.OooO0Oo(str, (X509Certificate) certificate)) {
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
                    o00O000 o00o001 = address.f51225OooO0oo;
                    Intrinsics.checkNotNull(o00o001);
                    String hostname = address.f51218OooO00o.f51387OooO0o0;
                    oo0oOO0 oo0ooo1 = this.f51782OooO0Oo;
                    Intrinsics.checkNotNull(oo0ooo1);
                    List<Certificate> peerCertificates = oo0ooo1.OooO0O0();
                    Objects.requireNonNull(o00o001);
                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                    o00o001.OooO00o(hostname, new o00O000o(o00o001, peerCertificates, hostname));
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    @Override // p660o0ooo0o0.o00O00O
    @NotNull
    public final Socket OooO00o() {
        Socket socket = this.f51781OooO0OO;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // o0oooO.o00oOoo.OooO0o
    public final synchronized void OooO0O0(@NotNull o00oOoo connection, @NotNull o00O0OOO settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f51790OooOOO = (settings.f51657OooO00o & 16) != 0 ? settings.f51658OooO0O0[4] : Integer.MAX_VALUE;
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
    public final void OooO0Oo(int i, int i2, int i3, int i4, boolean z, @NotNull o0O0ooO call, @NotNull oo0o0O0 eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        boolean z3 = false;
        if (!(this.f51784OooO0o0 == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<o00O00OO> list = this.f51794OooOOo0.f51473OooO00o.f51220OooO0OO;
        o00O0O0O o00o0o0o2 = new o00O0O0O(list);
        o000O o000o = this.f51794OooOOo0.f51473OooO00o;
        if (o000o.f51222OooO0o == null) {
            if (!list.contains(o00O00OO.f51280OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51387OooO0o0;
            s.OooO00o oooO00o = s.f51921OooO0OO;
            if (!s.f51919OooO00o.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(OooO0OO.OooO00o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o000o.f51219OooO0O0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                o00Oo00 o00oo00 = this.f51794OooOOo0;
                if (o00oo00.f51473OooO00o.f51222OooO0o != null && o00oo00.f51474OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0oO(i, i2, i3, call, eventListener);
                    if (this.f51780OooO0O0 == null) {
                        break;
                    }
                } else {
                    try {
                        OooO0o(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f51781OooO0OO;
                        if (socket != null) {
                            o00OOO00.OooO0o0(socket);
                        }
                        socket2 = this.f51780OooO0O0;
                        if (socket2 != null) {
                            o00OOO00.OooO0o0(socket2);
                        }
                        this.f51781OooO0OO = null;
                        this.f51780OooO0O0 = null;
                        this.f51785OooO0oO = null;
                        this.f51786OooO0oo = null;
                        this.f51782OooO0Oo = null;
                        this.f51784OooO0o0 = null;
                        this.f51783OooO0o = null;
                        this.f51790OooOOO = 1;
                        o00Oo00 o00oo01 = this.f51794OooOOo0;
                        eventListener.connectFailed(call, o00oo01.f51475OooO0OO, o00oo01.f51474OooO0O0, null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics.checkNotNullParameter(e, "e");
                            ExceptionsKt.addSuppressed(routeException.f53033Oooo0oO, e);
                            routeException.f53032Oooo0o = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics.checkNotNullParameter(e, "e");
                        o00o0o0o2.f51724OooO0OO = true;
                        if (!o00o0o0o2.f51723OooO0O0) {
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
                    o00Oo00 o00oo02 = this.f51794OooOOo0;
                    eventListener.connectEnd(call, o00oo02.f51475OooO0OO, o00oo02.f51474OooO0O0, this.f51784OooO0o0);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f51781OooO0OO;
                    if (socket != null) {
                        o00OOO00.OooO0o0(socket);
                    }
                    socket2 = this.f51780OooO0O0;
                    if (socket2 != null) {
                        o00OOO00.OooO0o0(socket2);
                    }
                    this.f51781OooO0OO = null;
                    this.f51780OooO0O0 = null;
                    this.f51785OooO0oO = null;
                    this.f51786OooO0oo = null;
                    this.f51782OooO0Oo = null;
                    this.f51784OooO0o0 = null;
                    this.f51783OooO0o = null;
                    this.f51790OooOOO = 1;
                    o00Oo00 o00oo03 = this.f51794OooOOo0;
                    eventListener.connectFailed(call, o00oo03.f51475OooO0OO, o00oo03.f51474OooO0O0, null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        ExceptionsKt.addSuppressed(routeException.f53033Oooo0oO, e);
                        routeException.f53032Oooo0o = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    o00o0o0o2.f51724OooO0OO = true;
                    if (!o00o0o0o2.f51723OooO0O0 || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
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
        o00Oo00 o00oo04 = this.f51794OooOOo0;
        if (o00oo04.f51473OooO00o.f51222OooO0o != null && o00oo04.f51474OooO0O0.type() == Proxy.Type.HTTP) {
            z3 = true;
        }
        if (z3 && this.f51780OooO0O0 == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f51793OooOOOo = System.nanoTime();
    }

    public final void OooO0o(int i, int i2, o0O0ooO o0o0ooo, oo0o0O0 oo0o0o0) throws IOException {
        Socket socket;
        int i3;
        o00Oo00 o00oo00 = this.f51794OooOOo0;
        Proxy proxy = o00oo00.f51474OooO0O0;
        o000O o000o = o00oo00.f51473OooO00o;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = o00O0OOO.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) {
            socket = o000o.f51223OooO0o0.createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f51780OooO0O0 = socket;
        oo0o0o0.connectStart(o0o0ooo, this.f51794OooOOo0.f51475OooO0OO, proxy);
        socket.setSoTimeout(i2);
        try {
            s.OooO00o oooO00o = s.f51921OooO0OO;
            s.f51919OooO00o.OooO0o0(socket, this.f51794OooOOo0.f51475OooO0OO, i);
            try {
                this.f51785OooO0oO = (o0O00OO) o0O000Oo.OooO0OO(o0O000Oo.OooOO0(socket));
                this.f51786OooO0oo = (o0O00O) o0O000Oo.OooO0O0(o0O000Oo.OooO0o(socket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to connect to ");
            sbOooO0o0.append(this.f51794OooOOo0.f51475OooO0OO);
            ConnectException connectException = new ConnectException(sbOooO0o0.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void OooO0o0(@NotNull o00OO client, @NotNull o00Oo00 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f51474OooO0O0.type() != Proxy.Type.DIRECT) {
            o000O o000o = failedRoute.f51473OooO00o;
            o000o.f51227OooOO0O.connectFailed(o000o.f51218OooO00o.OooOO0o(), failedRoute.f51474OooO0O0.address(), failure);
        }
        oo0O oo0o = client.f51346o00o0O;
        synchronized (oo0o) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            oo0o.f51804OooO00o.add(failedRoute);
        }
    }

    public final void OooO0oO(int i, int i2, int i3, o0O0ooO o0o0ooo, oo0o0O0 oo0o0o0) throws IOException {
        int i4;
        o0ooo0o0.o00OOO00.OooO00o oooO00o = new o0ooo0o0.o00OOO00.OooO00o();
        oooO00o.OooOOO0(this.f51794OooOOo0.f51473OooO00o.f51218OooO00o);
        o00OO o00oo2 = null;
        oooO00o.OooO0oO("CONNECT", null);
        boolean z = true;
        oooO00o.OooO0o0("Host", o00OOO00.OooOoO0(this.f51794OooOOo0.f51473OooO00o.f51218OooO00o, true));
        oooO00o.OooO0o0("Proxy-Connection", "Keep-Alive");
        oooO00o.OooO0o0("User-Agent", "okhttp/4.9.3");
        p660o0ooo0o0.o00OOO00 request = oooO00o.OooO0O0();
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o();
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f51452OooO00o = request;
        oooO00o2.OooO0o(Protocol.HTTP_1_1);
        oooO00o2.f51454OooO0OO = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f51455OooO0Oo = "Preemptive Authenticate";
        oooO00o2.f51458OooO0oO = o00OOO00.f51185OooO0OO;
        oooO00o2.f51461OooOO0O = -1L;
        oooO00o2.f51462OooOO0o = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        oooO00o2.f51456OooO0o.OooO0oO("Proxy-Authenticate", "OkHttp-Preemptive");
        o00OOOO0 o00oooo0OooO00o = oooO00o2.OooO00o();
        o00Oo00 o00oo00 = this.f51794OooOOo0;
        p660o0ooo0o0.o00OOO00 o00ooo00Authenticate = o00oo00.f51473OooO00o.f51217OooO.authenticate(o00oo00, o00oooo0OooO00o);
        if (o00ooo00Authenticate != null) {
            request = o00ooo00Authenticate;
        }
        o00OO000 o00oo001 = request.f51425OooO0O0;
        int i5 = 0;
        while (i5 < 21) {
            OooO0o(i, i2, o0o0ooo, oo0o0o0);
            String str = "CONNECT " + o00OOO00.OooOoO0(o00oo001, z) + " HTTP/1.1";
            while (true) {
                o0O00OO o0o00oo2 = this.f51785OooO0oO;
                Intrinsics.checkNotNull(o0o00oo2);
                o0O00O o0o00o2 = this.f51786OooO0oo;
                Intrinsics.checkNotNull(o0o00o2);
                oO00Oo0 oo00oo0 = new oO00Oo0(o00oo2, this, o0o00oo2, o0o00o2);
                o0oO0O0o o0oo0o0oTimeout = o0o00oo2.timeout();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o0oo0o0oTimeout.OooO0oO(j, timeUnit);
                i4 = i5;
                o0o00o2.timeout().OooO0oO(i3, timeUnit);
                oo00oo0.OooOO0O(request.f51427OooO0Oo, str);
                oo00oo0.f51847OooO0oO.flush();
                o00OOOO0.OooO00o oooO00oOooO0OO = oo00oo0.OooO0OO(false);
                Intrinsics.checkNotNull(oooO00oOooO0OO);
                Objects.requireNonNull(oooO00oOooO0OO);
                Intrinsics.checkNotNullParameter(request, "request");
                oooO00oOooO0OO.f51452OooO00o = request;
                o00OOOO0 response = oooO00oOooO0OO.OooO00o();
                Intrinsics.checkNotNullParameter(response, "response");
                long jOooOO0o = o00OOO00.OooOO0o(response);
                if (jOooOO0o != -1) {
                    o0O0O0O o0o0o0oOooOO0 = oo00oo0.OooOO0(jOooOO0o);
                    o00OOO00.OooOo0O(o0o0o0oOooOO0, Integer.MAX_VALUE);
                    ((oO00Oo0.OooO0o) o0o0o0oOooOO0).close();
                }
                int i6 = response.f51443OoooO00;
                if (i6 == 200) {
                    if (!o0o00oo2.f52063Oooo0o.OooOooo() || !o0o00o2.f52054Oooo0o.OooOooo()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request = null;
                    break;
                }
                if (i6 != 407) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unexpected response code for CONNECT: ");
                    sbOooO0o0.append(response.f51443OoooO00);
                    throw new IOException(sbOooO0o0.toString());
                }
                o00Oo00 o00oo01 = this.f51794OooOOo0;
                request = o00oo01.f51473OooO00o.f51217OooO.authenticate(o00oo01, response);
                if (request == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt.OooO("close", response.OooO0O0("Connection", null))) {
                    break;
                }
                o00oo2 = null;
                i2 = i2;
                i5 = i4;
            }
            if (request == null) {
                return;
            }
            Socket socket = this.f51780OooO0O0;
            if (socket != null) {
                o00OOO00.OooO0o0(socket);
            }
            o00oo2 = null;
            this.f51780OooO0O0 = null;
            this.f51786OooO0oo = null;
            this.f51785OooO0oO = null;
            o00Oo00 o00oo02 = this.f51794OooOOo0;
            oo0o0o0.connectEnd(o0o0ooo, o00oo02.f51475OooO0OO, o00oo02.f51474OooO0O0, null);
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
    public final void OooO0oo(o00O0O0O o00o0o0o2, int i, o0O0ooO o0o0ooo, oo0o0O0 oo0o0o0) throws Throwable {
        o000O o000o = this.f51794OooOOo0.f51473OooO00o;
        if (o000o.f51222OooO0o == null) {
            List<Protocol> list = o000o.f51219OooO0O0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f51781OooO0OO = this.f51780OooO0O0;
                this.f51784OooO0o0 = Protocol.HTTP_1_1;
                return;
            } else {
                this.f51781OooO0OO = this.f51780OooO0O0;
                this.f51784OooO0o0 = protocol;
                OooOOO(i);
                return;
            }
        }
        oo0o0o0.secureConnectStart(o0o0ooo);
        o000O o000o2 = this.f51794OooOOo0.f51473OooO00o;
        SSLSocketFactory sSLSocketFactory = o000o2.f51222OooO0o;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f51780OooO0O0;
            o00OO000 o00oo001 = o000o2.f51218OooO00o;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, o00oo001.f51387OooO0o0, o00oo001.f51386OooO0o, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                o00O00OO o00o00ooOooO00o = o00o0o0o2.OooO00o(sSLSocket2);
                if (o00o00ooOooO00o.f51283OooO0O0) {
                    s.OooO00o oooO00o = s.f51921OooO0OO;
                    s.f51919OooO00o.OooO0Oo(sSLSocket2, o000o2.f51218OooO00o.f51387OooO0o0, o000o2.f51219OooO0O0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                oo0oOO0.OooO00o oooO00o2 = oo0oOO0.f51482OooO0o0;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                oo0oOO0 oo0ooo0OooO00o = oooO00o2.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = o000o2.f51224OooO0oO;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(o000o2.f51218OooO00o.f51387OooO0o0, sslSocketSession)) {
                    o00O000 o00o001 = o000o2.f51225OooO0oo;
                    Intrinsics.checkNotNull(o00o001);
                    this.f51782OooO0Oo = new oo0oOO0(oo0ooo0OooO00o.f51484OooO0O0, oo0ooo0OooO00o.f51485OooO0OO, oo0ooo0OooO00o.f51486OooO0Oo, new oo0oOO0(o00o001, oo0ooo0OooO00o, o000o2));
                    o00o001.OooO00o(o000o2.f51218OooO00o.f51387OooO0o0, new o00O(this));
                    if (o00o00ooOooO00o.f51283OooO0O0) {
                        s.OooO00o oooO00o3 = s.f51921OooO0OO;
                        strOooO0o = s.f51919OooO00o.OooO0o(sSLSocket2);
                    }
                    this.f51781OooO0OO = sSLSocket2;
                    this.f51785OooO0oO = (o0O00OO) o0O000Oo.OooO0OO(o0O000Oo.OooOO0(sSLSocket2));
                    this.f51786OooO0oo = (o0O00O) o0O000Oo.OooO0O0(o0O000Oo.OooO0o(sSLSocket2));
                    this.f51784OooO0o0 = strOooO0o != null ? Protocol.INSTANCE.OooO00o(strOooO0o) : Protocol.HTTP_1_1;
                    s.OooO00o oooO00o4 = s.f51921OooO0OO;
                    s.f51919OooO00o.OooO00o(sSLSocket2);
                    oo0o0o0.secureConnectEnd(o0o0ooo, this.f51782OooO0Oo);
                    if (this.f51784OooO0o0 == Protocol.HTTP_2) {
                        OooOOO(i);
                        return;
                    }
                    return;
                }
                List<Certificate> listOooO0O0 = oo0ooo0OooO00o.OooO0O0();
                if (!(!listOooO0O0.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + o000o2.f51218OooO00o.f51387OooO0o0 + " not verified (no certificates)");
                }
                Certificate certificate = listOooO0O0.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate certificate2 = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(o000o2.f51218OooO00o.f51387OooO0o0);
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(o00O000.f51254OooO0Oo.OooO00o(certificate2));
                sb.append("\n              |    DN: ");
                Principal subjectDN = certificate2.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                w wVar = w.f51947OooO00o;
                Intrinsics.checkNotNullParameter(certificate2, "certificate");
                sb.append(CollectionsKt.plus((Collection) wVar.OooO0O0(certificate2, 7), (Iterable) wVar.OooO0O0(certificate2, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    s.OooO00o oooO00o5 = s.f51921OooO0OO;
                    s.f51919OooO00o.OooO00o(sSLSocket);
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
        byte[] bArr = o00OOO00.f51183OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f51780OooO0O0;
        Intrinsics.checkNotNull(socket);
        Socket isHealthy = this.f51781OooO0OO;
        Intrinsics.checkNotNull(isHealthy);
        o0O00OO source = this.f51785OooO0oO;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || isHealthy.isClosed() || isHealthy.isInputShutdown() || isHealthy.isOutputShutdown()) {
            return false;
        }
        o00oOoo o00oooo2 = this.f51783OooO0o;
        if (o00oooo2 != null) {
            synchronized (o00oooo2) {
                if (o00oooo2.f51668OoooO0O) {
                    return false;
                }
                return o00oooo2.f51675Ooooo00 >= o00oooo2.f51674OoooOoo || jNanoTime < o00oooo2.f51676Ooooo0o;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f51793OooOOOo;
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
        return this.f51783OooO0o != null;
    }

    @NotNull
    public final oO0OOO00 OooOO0o(@NotNull o00OO client, @NotNull oOo00o0o chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f51781OooO0OO;
        Intrinsics.checkNotNull(socket);
        o0O00OO o0o00oo2 = this.f51785OooO0oO;
        Intrinsics.checkNotNull(o0o00oo2);
        o0O00O o0o00o2 = this.f51786OooO0oo;
        Intrinsics.checkNotNull(o0o00o2);
        o00oOoo o00oooo2 = this.f51783OooO0o;
        if (o00oooo2 != null) {
            return new o00O0(client, this, chain, o00oooo2);
        }
        socket.setSoTimeout(chain.f51886OooO0oo);
        o0oO0O0o o0oo0o0oTimeout = o0o00oo2.timeout();
        long j = chain.f51886OooO0oo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0oo0o0oTimeout.OooO0oO(j, timeUnit);
        o0o00o2.timeout().OooO0oO(chain.f51878OooO, timeUnit);
        return new oO00Oo0(client, this, o0o00oo2, o0o00o2);
    }

    public final void OooOOO(int i) throws IOException {
        String strOooO0Oo;
        int i2;
        Socket socket = this.f51781OooO0OO;
        Intrinsics.checkNotNull(socket);
        o0O00OO source = this.f51785OooO0oO;
        Intrinsics.checkNotNull(source);
        o0O00O sink = this.f51786OooO0oo;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        o000000O taskRunner = o000000O.f51825OooO0oo;
        o00oOoo.OooO0O0 oooO0O0 = new o00oOoo.OooO0O0(taskRunner);
        String peerName = this.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51387OooO0o0;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        oooO0O0.f51696OooO00o = socket;
        if (oooO0O0.f51703OooO0oo) {
            strOooO0Oo = o00OOO00.f51189OooO0oO + ' ' + peerName;
        } else {
            strOooO0Oo = OooOo00.OooO0Oo("MockWebServer ", peerName);
        }
        oooO0O0.f51697OooO0O0 = strOooO0Oo;
        oooO0O0.f51698OooO0OO = source;
        oooO0O0.f51699OooO0Oo = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        oooO0O0.f51701OooO0o0 = this;
        oooO0O0.f51702OooO0oO = i;
        o00oOoo o00oooo2 = new o00oOoo(oooO0O0);
        this.f51783OooO0o = o00oooo2;
        o00oOoo.OooO0OO oooO0OO = o00oOoo.f51660o00Ooo;
        o00O0OOO o00o0ooo2 = o00oOoo.f51659o00Oo0;
        this.f51790OooOOO = (o00o0ooo2.f51657OooO00o & 16) != 0 ? o00o0ooo2.f51658OooO0O0[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        o00O0O0O o00o0o0o2 = o00oooo2.f51686o0OoOo0;
        synchronized (o00o0o0o2) {
            if (o00o0o0o2.f51646Oooo0oo) {
                throw new IOException("closed");
            }
            if (o00o0o0o2.f51647OoooO0) {
                Logger logger = o00O0O0O.f51642OoooO0O;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o00OOO00.OooOO0(">> CONNECTION " + p662o0oooO.o0O0ooO.f51711OooO00o.OooO0o(), new Object[0]));
                }
                o00o0o0o2.f51648OoooO00.o000000(p662o0oooO.o0O0ooO.f51711OooO00o);
                o00o0o0o2.f51648OoooO00.flush();
            }
        }
        o00O0O0O o00o0o0o3 = o00oooo2.f51686o0OoOo0;
        o00O0OOO settings = o00oooo2.f51677OooooO0;
        synchronized (o00o0o0o3) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (o00o0o0o3.f51646Oooo0oo) {
                throw new IOException("closed");
            }
            o00o0o0o3.OooO0O0(0, Integer.bitCount(settings.f51657OooO00o) * 6, 4, 0);
            int i3 = 0;
            while (i3 < 10) {
                boolean z = true;
                if (((1 << i3) & settings.f51657OooO00o) == 0) {
                    z = false;
                }
                if (z) {
                    if (i3 != 4) {
                        i2 = i3 != 7 ? i3 : 4;
                    } else {
                        i2 = 3;
                    }
                    o00o0o0o3.f51648OoooO00.OooOo0(i2);
                    o00o0o0o3.f51648OoooO00.OooOo0o(settings.f51658OooO0O0[i3]);
                }
                i3++;
            }
            o00o0o0o3.f51648OoooO00.flush();
        }
        int iOooO00o = o00oooo2.f51677OooooO0.OooO00o();
        if (iOooO00o != 65535) {
            o00oooo2.f51686o0OoOo0.OooO0oO(0, iOooO00o - 65535);
        }
        taskRunner.OooO0o().OooO0OO(new o000OOo(o00oooo2.f51687ooOO, o00oooo2.f51661Oooo), 0L);
    }

    public final synchronized void OooOOO0() {
        this.f51779OooO = true;
    }

    @NotNull
    public final String toString() {
        Object obj;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Connection{");
        sbOooO0o0.append(this.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51387OooO0o0);
        sbOooO0o0.append(':');
        sbOooO0o0.append(this.f51794OooOOo0.f51473OooO00o.f51218OooO00o.f51386OooO0o);
        sbOooO0o0.append(',');
        sbOooO0o0.append(" proxy=");
        sbOooO0o0.append(this.f51794OooOOo0.f51474OooO0O0);
        sbOooO0o0.append(" hostAddress=");
        sbOooO0o0.append(this.f51794OooOOo0.f51475OooO0OO);
        sbOooO0o0.append(" cipherSuite=");
        oo0oOO0 oo0ooo0 = this.f51782OooO0Oo;
        if (oo0ooo0 == null || (obj = oo0ooo0.f51485OooO0OO) == null) {
            obj = "none";
        }
        sbOooO0o0.append(obj);
        sbOooO0o0.append(" protocol=");
        sbOooO0o0.append(this.f51784OooO0o0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
