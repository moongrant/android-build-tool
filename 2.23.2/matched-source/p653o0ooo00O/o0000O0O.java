package p653o0ooo00O;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o00OO00O;
import p641o0ooOO0o.o00OOO0;
import p641o0ooOO0o.o00OOO0O;
import p641o0ooOO0o.o00OOOO0;
import p641o0ooOO0o.o00Oo00;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O0000O;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0o0Oo;
import p641o0ooOO0o.o0oO0O0o;
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o0000O00;
import p652o0ooo000.o0000Ooo;
import p654o0ooo00o.o000O;
import p654o0ooo00o.o000O0Oo;
import p655o0ooo0O.o0OOOO0o;
import p655o0ooo0O.o0OOo000;
import p655o0ooo0O.oO0000o0;
import p655o0ooo0O.oO000O0;
import p655o0ooo0O.oO000O0O;
import p655o0ooo0O.oO0Oo0oo;
import p657o0ooo0o0.o000O0o;
import p661o0oooO00.o000OO;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oO00000o;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0O extends o0OOo000.OooO0O0 implements o00OOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public p662o0oooO0O.o0OOo000 f59344OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0oO0O0o f59345OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Socket f59346OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Socket f59347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Protocol f59348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o0O0000O f59349OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0OOo000 f59350OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0o0000 f59351OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f59352OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f59353OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f59354OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f59355OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f59356OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f59357OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59358OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f59359OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0000O0O(@NotNull o000O000 connectionPool, @NotNull o0oO0O0o route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f59345OooO0O0 = route;
        this.f59357OooOOOO = 1;
        this.f59358OooOOOo = new ArrayList();
        this.f59359OooOOo0 = LongCompanionObject.MAX_VALUE;
    }

    public static void OooO0Oo(@NotNull o0OoO00O client, @NotNull o0oO0O0o failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f57963OooO0O0.type() != Proxy.Type.DIRECT) {
            o00OO00O o00oo00o = failedRoute.f57962OooO00o;
            o00oo00o.f57751OooO0oo.connectFailed(o00oo00o.f57743OooO.OooOO0O(), failedRoute.f57963OooO0O0.address(), failure);
        }
        o000O0o o000o0o2 = client.f57912Oooo000;
        synchronized (o000o0o2) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            o000o0o2.f59378OooO00o.add(failedRoute);
        }
    }

    public final boolean OooO(@NotNull o00OO00O address, @Nullable List<o0oO0O0o> list) {
        boolean z;
        boolean z2;
        o0O0000O o0o0000o2;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = oO000o00.f58124OooO00o;
        if (this.f59358OooOOOo.size() < this.f59357OooOOOO && !this.f59352OooOO0) {
            o0oO0O0o o0oo0o0o2 = this.f59345OooO0O0;
            if (!o0oo0o0o2.f57962OooO00o.OooO00o(address)) {
                return false;
            }
            o0O000O o0o000o = address.f57743OooO;
            String str = o0o000o.f57792OooO0Oo;
            o00OO00O o00oo00o = o0oo0o0o2.f57962OooO00o;
            if (Intrinsics.areEqual(str, o00oo00o.f57743OooO.f57792OooO0Oo)) {
                return true;
            }
            if (this.f59350OooO0oO != null && list != null) {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        o0oO0O0o o0oo0o0o3 = (o0oO0O0o) it.next();
                        if (o0oo0o0o3.f57963OooO0O0.type() == Proxy.Type.DIRECT && o0oo0o0o2.f57963OooO0O0.type() == Proxy.Type.DIRECT && Intrinsics.areEqual(o0oo0o0o2.f57964OooO0OO, o0oo0o0o3.f57964OooO0OO)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    if (address.f57747OooO0Oo != o000OO.f59741OooO00o) {
                        return false;
                    }
                    byte[] bArr2 = oO000o00.f58124OooO00o;
                    o0O000O o0o000o2 = o00oo00o.f57743OooO;
                    int i = o0o000o2.f57794OooO0o0;
                    String hostname = o0o000o.f57792OooO0Oo;
                    if (o0o000o.f57794OooO0o0 == i) {
                        if (!Intrinsics.areEqual(hostname, o0o000o2.f57792OooO0Oo)) {
                            if (!this.f59353OooOO0O && (o0o0000o2 = this.f59349OooO0o0) != null) {
                                Intrinsics.checkNotNull(o0o0000o2);
                                List<Certificate> listOooO00o = o0o0000o2.OooO00o();
                                if ((listOooO00o.isEmpty() ^ true) && o000OO.OooO0O0(hostname, (X509Certificate) listOooO00o.get(0))) {
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
                        o00OOO0 o00ooo1 = address.f57749OooO0o0;
                        Intrinsics.checkNotNull(o00ooo1);
                        o0O0000O o0o0000o3 = this.f59349OooO0o0;
                        Intrinsics.checkNotNull(o0o0000o3);
                        List<Certificate> peerCertificates = o0o0000o3.OooO00o();
                        o00ooo1.getClass();
                        Intrinsics.checkNotNullParameter(hostname, "hostname");
                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                        o00ooo1.OooO00o(hostname, new o00OOO0O(o00ooo1, peerCertificates, hostname));
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                    }
                }
            }
        }
        return false;
    }

    @Override // o0ooo0O.o0OOo000.OooO0O0
    public final synchronized void OooO00o(@NotNull o0OOo000 connection, @NotNull oO0Oo0oo settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f59357OooOOOO = (settings.f59566OooO00o & 16) != 0 ? settings.f59567OooO0O0[4] : Integer.MAX_VALUE;
    }

    @Override // o0ooo0O.o0OOo000.OooO0O0
    public final void OooO0O0(@NotNull oO000O0 stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:0: B:98:0x0075->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    public final void OooO0OO(int i, int i2, int i3, int i4, boolean z, @NotNull o0000O0 call, @NotNull o0 eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        boolean z3 = false;
        if (!(this.f59348OooO0o == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<o00Oo00> list = this.f59345OooO0O0.f57962OooO00o.f57753OooOO0O;
        o0000 o0000Var = new o0000(list);
        o00OO00O o00oo00o = this.f59345OooO0O0.f57962OooO00o;
        if (o00oo00o.f57746OooO0OO == null) {
            if (!list.contains(o00Oo00.f57762OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f59345OooO0O0.f57962OooO00o.f57743OooO.f57792OooO0Oo;
            o000O0o o000o0o2 = o000O0o.f59618OooO00o;
            if (!o000O0o.f59618OooO00o.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(o000oOoO.OooO0O0("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o00oo00o.f57752OooOO0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                o0oO0O0o o0oo0o0o2 = this.f59345OooO0O0;
                if (o0oo0o0o2.f57962OooO00o.f57746OooO0OO != null && o0oo0o0o2.f57963OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0o(i, i2, i3, call, eventListener);
                    if (this.f59346OooO0OO == null) {
                        break;
                    }
                } else {
                    try {
                        OooO0o0(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f59347OooO0Oo;
                        if (socket != null) {
                            oO000o00.OooO0Oo(socket);
                        }
                        socket2 = this.f59346OooO0OO;
                        if (socket2 != null) {
                            oO000o00.OooO0Oo(socket2);
                        }
                        this.f59347OooO0Oo = null;
                        this.f59346OooO0OO = null;
                        this.f59351OooO0oo = null;
                        this.f59344OooO = null;
                        this.f59349OooO0o0 = null;
                        this.f59348OooO0o = null;
                        this.f59350OooO0oO = null;
                        this.f59357OooOOOO = 1;
                        o0oO0O0o o0oo0o0o3 = this.f59345OooO0O0;
                        eventListener.connectFailed(call, o0oo0o0o3.f57964OooO0OO, o0oo0o0o3.f57963OooO0O0, null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics.checkNotNullParameter(e, "e");
                            ExceptionsKt.addSuppressed(routeException.f60179OooO0Oo, e);
                            routeException.f60180OooO0o0 = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics.checkNotNullParameter(e, "e");
                        o0000Var.f59302OooO0Oo = true;
                        if (!o0000Var.f59301OooO0OO) {
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
                    OooO0oO(o0000Var, i4, call, eventListener);
                    o0oO0O0o o0oo0o0o4 = this.f59345OooO0O0;
                    eventListener.connectEnd(call, o0oo0o0o4.f57964OooO0OO, o0oo0o0o4.f57963OooO0O0, this.f59348OooO0o);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f59347OooO0Oo;
                    if (socket != null) {
                        oO000o00.OooO0Oo(socket);
                    }
                    socket2 = this.f59346OooO0OO;
                    if (socket2 != null) {
                        oO000o00.OooO0Oo(socket2);
                    }
                    this.f59347OooO0Oo = null;
                    this.f59346OooO0OO = null;
                    this.f59351OooO0oo = null;
                    this.f59344OooO = null;
                    this.f59349OooO0o0 = null;
                    this.f59348OooO0o = null;
                    this.f59350OooO0oO = null;
                    this.f59357OooOOOO = 1;
                    o0oO0O0o o0oo0o0o5 = this.f59345OooO0O0;
                    eventListener.connectFailed(call, o0oo0o0o5.f57964OooO0OO, o0oo0o0o5.f57963OooO0O0, null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        ExceptionsKt.addSuppressed(routeException.f60179OooO0Oo, e);
                        routeException.f60180OooO0o0 = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    o0000Var.f59302OooO0Oo = true;
                    if (!o0000Var.f59301OooO0OO || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
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
        o0oO0O0o o0oo0o0o6 = this.f59345OooO0O0;
        if (o0oo0o0o6.f57962OooO00o.f57746OooO0OO != null && o0oo0o0o6.f57963OooO0O0.type() == Proxy.Type.HTTP) {
            z3 = true;
        }
        if (z3 && this.f59346OooO0OO == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f59359OooOOo0 = System.nanoTime();
    }

    public final void OooO0o(int i, int i2, int i3, o0000O0 o0000o1, o0 o0Var) throws IOException {
        o0O00O0o o0o00o0o;
        o0oO0O0o o0oo0o0o2;
        o0000O0 o0000o2 = o0000o1;
        o0 o0Var2 = o0Var;
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        o0oO0O0o o0oo0o0o3 = this.f59345OooO0O0;
        o0O000O url = o0oo0o0o3.f57962OooO00o.f57743OooO;
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57834OooO00o = url;
        o0OoO00O o0ooo00o2 = null;
        oooO00o.OooO0o(FirebasePerformance.HttpMethod.CONNECT, null);
        o00OO00O o00oo00o = o0oo0o0o3.f57962OooO00o;
        boolean z = true;
        oooO00o.OooO0Oo("Host", oO000o00.OooOo0o(o00oo00o.f57743OooO, true));
        oooO00o.OooO0Oo("Proxy-Connection", "Keep-Alive");
        oooO00o.OooO0Oo("User-Agent", "okhttp/4.10.0");
        o0O00O0o request = oooO00o.OooO0O0();
        o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o();
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f57861OooO00o = request;
        Protocol protocol = Protocol.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o2.f57862OooO0O0 = protocol;
        oooO00o2.f57863OooO0OO = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f57864OooO0Oo = "Preemptive Authenticate";
        oooO00o2.f57867OooO0oO = oO000o00.f58126OooO0OO;
        oooO00o2.f57870OooOO0O = -1L;
        oooO00o2.f57871OooOO0o = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        o0O000.OooO00o oooO00o3 = oooO00o2.f57865OooO0o;
        oooO00o3.getClass();
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        o0O000.OooO0O0.OooO00o("Proxy-Authenticate");
        o0O000.OooO0O0.OooO0O0("OkHttp-Preemptive", "Proxy-Authenticate");
        oooO00o3.OooO0Oo("Proxy-Authenticate");
        oooO00o3.OooO0O0("Proxy-Authenticate", "OkHttp-Preemptive");
        o0O00O0o o0o00o0oAuthenticate = o00oo00o.f57748OooO0o.authenticate(o0oo0o0o3, oooO00o2.OooO00o());
        if (o0o00o0oAuthenticate != null) {
            request = o0o00o0oAuthenticate;
        }
        o0O00O0o request2 = request;
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            OooO0o0(i, i2, o0000o2, o0Var2);
            String str = "CONNECT " + oO000o00.OooOo0o(request.f57828OooO00o, z) + " HTTP/1.1";
            while (true) {
                o0o0000 o0o0000Var = this.f59351OooO0oo;
                Intrinsics.checkNotNull(o0o0000Var);
                p662o0oooO0O.o0OOo000 o0ooo001 = this.f59344OooO;
                Intrinsics.checkNotNull(o0ooo001);
                p651o0ooo0.o000oOoO o000oooo2 = new p651o0ooo0.o000oOoO(o0ooo00o2, this, o0o0000Var, o0ooo001);
                oO00000o oo00000oTimeout = o0o0000Var.timeout();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oo00000oTimeout.OooO0oO(j, timeUnit);
                o0o00o0o = request;
                o0oo0o0o2 = o0oo0o0o3;
                o0ooo001.timeout().OooO0oO(i3, timeUnit);
                o000oooo2.OooOO0(request2.f57830OooO0OO, str);
                o000oooo2.OooO00o();
                o0O00o00.OooO00o oooO00oOooO0o0 = o000oooo2.OooO0o0(false);
                Intrinsics.checkNotNull(oooO00oOooO0o0);
                oooO00oOooO0o0.getClass();
                Intrinsics.checkNotNullParameter(request2, "request");
                oooO00oOooO0o0.f57861OooO00o = request2;
                o0O00o00 response = oooO00oOooO0o0.OooO00o();
                Intrinsics.checkNotNullParameter(response, "response");
                long jOooOO0O = oO000o00.OooOO0O(response);
                if (jOooOO0O != -1) {
                    o0ooo0.o000oOoO.OooO0o oooO0oOooO = o000oooo2.OooO(jOooOO0O);
                    oO000o00.OooOo0(oooO0oOooO, Integer.MAX_VALUE, timeUnit);
                    oooO0oOooO.close();
                }
                int i5 = response.f57850OooO0oO;
                if (i5 == 200) {
                    if (!o0o0000Var.f59801OooO0o0.o00oO0O() || !o0ooo001.f59797OooO0o0.o00oO0O()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request2 = null;
                    break;
                }
                if (i5 != 407) {
                    throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(i5)));
                }
                request2 = o00oo00o.f57748OooO0o.authenticate(o0oo0o0o2, response);
                if (request2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt__StringsJVMKt.equals("close", response.OooO0OO("Connection", null), true)) {
                    break;
                }
                i2 = i2;
                o0oo0o0o3 = o0oo0o0o2;
                request = o0o00o0o;
                o0ooo00o2 = null;
            }
            if (request2 == null) {
                return;
            }
            Socket socket = this.f59346OooO0OO;
            if (socket != null) {
                oO000o00.OooO0Oo(socket);
            }
            this.f59346OooO0OO = null;
            this.f59344OooO = null;
            this.f59351OooO0oo = null;
            o0Var.connectEnd(o0000o1, o0oo0o0o2.f57964OooO0OO, o0oo0o0o2.f57963OooO0O0, null);
            o0Var2 = o0Var;
            o0oo0o0o3 = o0oo0o0o2;
            request = o0o00o0o;
            z = true;
            o0ooo00o2 = null;
            o0000o2 = o0000o1;
        }
    }

    public final void OooO0o0(int i, int i2, o0000O0 o0000o1, o0 o0Var) throws IOException {
        Socket socketCreateSocket;
        o0oO0O0o o0oo0o0o2 = this.f59345OooO0O0;
        Proxy proxy = o0oo0o0o2.f57963OooO0O0;
        o00OO00O o00oo00o = o0oo0o0o2.f57962OooO00o;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = o00oo00o.f57745OooO0O0.createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f59346OooO0OO = socketCreateSocket;
        o0Var.connectStart(o0000o1, this.f59345OooO0O0.f57964OooO0OO, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            o000O0o o000o0o2 = o000O0o.f59618OooO00o;
            o000O0o.f59618OooO00o.OooO0o0(socketCreateSocket, this.f59345OooO0O0.f57964OooO0OO, i);
            try {
                this.f59351OooO0oo = o0OO.OooO0O0(o0OO.OooO0o(socketCreateSocket));
                this.f59344OooO = o0OO.OooO00o(o0OO.OooO0Oo(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f59345OooO0O0.f57964OooO0OO));
            connectException.initCause(e2);
            throw connectException;
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
    public final void OooO0oO(o0000 o0000Var, int i, o0000O0 o0000o1, o0 o0Var) throws Throwable {
        Protocol protocolOooO00o;
        o00OO00O o00oo00o = this.f59345OooO0O0.f57962OooO00o;
        if (o00oo00o.f57746OooO0OO == null) {
            List<Protocol> list = o00oo00o.f57752OooOO0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f59347OooO0Oo = this.f59346OooO0OO;
                this.f59348OooO0o = Protocol.HTTP_1_1;
                return;
            } else {
                this.f59347OooO0Oo = this.f59346OooO0OO;
                this.f59348OooO0o = protocol;
                OooOOO0(i);
                return;
            }
        }
        o0Var.secureConnectStart(o0000o1);
        o00OO00O o00oo00o2 = this.f59345OooO0O0.f57962OooO00o;
        SSLSocketFactory sSLSocketFactory = o00oo00o2.f57746OooO0OO;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f59346OooO0OO;
            o0O000O o0o000o = o00oo00o2.f57743OooO;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, o0o000o.f57792OooO0Oo, o0o000o.f57794OooO0o0, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                o00Oo00 o00oo00OooO00o = o0000Var.OooO00o(sSLSocket2);
                if (o00oo00OooO00o.f57765OooO0O0) {
                    o000O0o o000o0o2 = o000O0o.f59618OooO00o;
                    o000O0o.f59618OooO00o.OooO0Oo(sSLSocket2, o00oo00o2.f57743OooO.f57792OooO0Oo, o00oo00o2.f57752OooOO0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                o0O0000O o0o0000oOooO00o = o0O0000O.OooO00o.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = o00oo00o2.f57747OooO0Oo;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(o00oo00o2.f57743OooO.f57792OooO0Oo, sslSocketSession)) {
                    List<Certificate> listOooO00o = o0o0000oOooO00o.OooO00o();
                    if (!(!listOooO00o.isEmpty())) {
                        throw new SSLPeerUnverifiedException("Hostname " + o00oo00o2.f57743OooO.f57792OooO0Oo + " not verified (no certificates)");
                    }
                    X509Certificate certificate = (X509Certificate) listOooO00o.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(o00oo00o2.f57743OooO.f57792OooO0Oo);
                    sb.append(" not verified:\n              |    certificate: ");
                    o00OOO0 o00ooo1 = o00OOO0.f57755OooO0OO;
                    sb.append(o00OOO0.OooO00o.OooO00o(certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb.append(CollectionsKt.plus((Collection) o000OO.OooO00o(certificate, 7), (Iterable) o000OO.OooO00o(certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
                }
                o00OOO0 o00ooo2 = o00oo00o2.f57749OooO0o0;
                Intrinsics.checkNotNull(o00ooo2);
                this.f59349OooO0o0 = new o0O0000O(o0o0000oOooO00o.f57781OooO00o, o0o0000oOooO00o.f57782OooO0O0, o0o0000oOooO00o.f57783OooO0OO, new o000OO(o00ooo2, o0o0000oOooO00o, o00oo00o2));
                o00ooo2.OooO00o(o00oo00o2.f57743OooO.f57792OooO0Oo, new o0000O(this));
                if (o00oo00OooO00o.f57765OooO0O0) {
                    o000O0o o000o0o3 = o000O0o.f59618OooO00o;
                    strOooO0o = o000O0o.f59618OooO00o.OooO0o(sSLSocket2);
                }
                this.f59347OooO0Oo = sSLSocket2;
                this.f59351OooO0oo = o0OO.OooO0O0(o0OO.OooO0o(sSLSocket2));
                this.f59344OooO = o0OO.OooO00o(o0OO.OooO0Oo(sSLSocket2));
                if (strOooO0o != null) {
                    Protocol.INSTANCE.getClass();
                    protocolOooO00o = Protocol.Companion.OooO00o(strOooO0o);
                } else {
                    protocolOooO00o = Protocol.HTTP_1_1;
                }
                this.f59348OooO0o = protocolOooO00o;
                o000O0o o000o0o4 = o000O0o.f59618OooO00o;
                o000O0o.f59618OooO00o.OooO00o(sSLSocket2);
                o0Var.secureConnectEnd(o0000o1, this.f59349OooO0o0);
                if (this.f59348OooO0o == Protocol.HTTP_2) {
                    OooOOO0(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    o000O0o o000o0o5 = o000O0o.f59618OooO00o;
                    o000O0o.f59618OooO00o.OooO00o(sSLSocket);
                }
                if (sSLSocket != null) {
                    oO000o00.OooO0Oo(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void OooO0oo() {
        this.f59356OooOOO0++;
    }

    public final boolean OooOO0(boolean z) {
        long j;
        byte[] bArr = oO000o00.f58124OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f59346OooO0OO;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f59347OooO0Oo;
        Intrinsics.checkNotNull(socket2);
        o0o0000 source = this.f59351OooO0oo;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o0OOo000 o0ooo001 = this.f59350OooO0oO;
        if (o0ooo001 != null) {
            return o0ooo001.OooOOo(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f59359OooOOo0;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.o00oO0O();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @NotNull
    public final o000O0Oo OooOO0O(@NotNull o0OoO00O client, @NotNull o000O chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f59347OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o0o0000 o0o0000Var = this.f59351OooO0oo;
        Intrinsics.checkNotNull(o0o0000Var);
        p662o0oooO0O.o0OOo000 o0ooo001 = this.f59344OooO;
        Intrinsics.checkNotNull(o0ooo001);
        o0OOo000 o0ooo002 = this.f59350OooO0oO;
        if (o0ooo002 != null) {
            return new oO0000o0(client, this, chain, o0ooo002);
        }
        int i = chain.f59402OooO0oO;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0o0000Var.timeout().OooO0oO(i, timeUnit);
        o0ooo001.timeout().OooO0oO(chain.f59403OooO0oo, timeUnit);
        return new p651o0ooo0.o000oOoO(client, this, o0o0000Var, o0ooo001);
    }

    public final synchronized void OooOO0o() {
        this.f59352OooOO0 = true;
    }

    public final void OooOOO0(int i) throws IOException {
        String strStringPlus;
        Socket socket = this.f59347OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o0o0000 source = this.f59351OooO0oo;
        Intrinsics.checkNotNull(source);
        p662o0oooO0O.o0OOo000 sink = this.f59344OooO;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        o0000O00 taskRunner = o0000O00.f59287OooO0oo;
        o0OOo000.OooO00o oooO00o = new o0OOo000.OooO00o(taskRunner);
        String peerName = this.f59345OooO0O0.f57962OooO00o.f57743OooO.f57792OooO0Oo;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        oooO00o.f59484OooO0OO = socket;
        if (oooO00o.f59482OooO00o) {
            strStringPlus = oO000o00.f58130OooO0oO + ' ' + peerName;
        } else {
            strStringPlus = Intrinsics.stringPlus("MockWebServer ", peerName);
        }
        Intrinsics.checkNotNullParameter(strStringPlus, "<set-?>");
        oooO00o.f59485OooO0Oo = strStringPlus;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        oooO00o.f59487OooO0o0 = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        oooO00o.f59486OooO0o = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        oooO00o.f59488OooO0oO = this;
        oooO00o.f59481OooO = i;
        o0OOo000 o0ooo001 = new o0OOo000(oooO00o);
        this.f59350OooO0oO = o0ooo001;
        oO0Oo0oo oo0oo0oo = o0OOo000.f59450OooOooo;
        this.f59357OooOOOO = (oo0oo0oo.f59566OooO00o & 16) != 0 ? oo0oo0oo.f59567OooO0O0[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        oO000O0O oo000o0o = o0ooo001.f59476OooOoo0;
        synchronized (oo000o0o) {
            if (oo000o0o.f59563OooO0oo) {
                throw new IOException("closed");
            }
            if (oo000o0o.f59561OooO0o0) {
                Logger logger = oO000O0O.f59557OooOO0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(oO000o00.OooO(Intrinsics.stringPlus(">> CONNECTION ", o0OOOO0o.f59446OooO0O0.OooO0o()), new Object[0]));
                }
                oo000o0o.f59559OooO0Oo.o0000oo(o0OOOO0o.f59446OooO0O0);
                oo000o0o.f59559OooO0Oo.flush();
            }
        }
        o0ooo001.f59476OooOoo0.OooOo0(o0ooo001.f59468OooOo0);
        int iOooO00o = o0ooo001.f59468OooOo0.OooO00o();
        if (iOooO00o != 65535) {
            o0ooo001.f59476OooOoo0.OooO0o0(0, iOooO00o - 65535);
        }
        taskRunner.OooO0o().OooO0OO(new o0000Ooo(o0ooo001.f59455OooO0oO, o0ooo001.f59475OooOoo), 0L);
    }

    @NotNull
    public final String toString() {
        o0o0Oo o0o0oo;
        StringBuilder sb = new StringBuilder("Connection{");
        o0oO0O0o o0oo0o0o2 = this.f59345OooO0O0;
        sb.append(o0oo0o0o2.f57962OooO00o.f57743OooO.f57792OooO0Oo);
        sb.append(':');
        sb.append(o0oo0o0o2.f57962OooO00o.f57743OooO.f57794OooO0o0);
        sb.append(", proxy=");
        sb.append(o0oo0o0o2.f57963OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o0oo0o0o2.f57964OooO0OO);
        sb.append(" cipherSuite=");
        o0O0000O o0o0000o2 = this.f59349OooO0o0;
        Object obj = "none";
        if (o0o0000o2 != null && (o0o0oo = o0o0000o2.f57782OooO0O0) != null) {
            obj = o0o0oo;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f59348OooO0o);
        sb.append('}');
        return sb.toString();
    }
}
