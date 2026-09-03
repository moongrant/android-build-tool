package p652o0ooOooo;

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
import p640o0ooO0oo.o0O0o00O;
import p640o0ooO0oo.o0OO;
import p640o0ooO0oo.o0OO0;
import p640o0ooO0oo.o0OO000o;
import p640o0ooO0oo.o0OO00OO;
import p640o0ooO0oo.o0OOO0;
import p640o0ooO0oo.o0OOO0OO;
import p640o0ooO0oo.o0OOOO00;
import p640o0ooO0oo.o0oo0000;
import p640o0ooO0oo.oO0000Oo;
import p640o0ooO0oo.oO000O0;
import p640o0ooO0oo.oo0oO0;
import p640o0ooO0oo.oo0ooO;
import p640o0ooO0oo.ooo0Oo0;
import p643o0ooOO0O.o00OO0O0;
import p651o0ooOoo.b0;
import p651o0ooOoo.z;
import p654o0ooo0.o000OO0O;
import p655o0ooo000.o0000Ooo;
import p655o0ooo000.o0000oo;
import p656o0ooo00O.o0;
import p657o0ooo00o.o0O000;
import p657o0ooo00o.o0O000O;
import p657o0ooo00o.o0O00oO0;
import p657o0ooo00o.o0O0O0O;
import p657o0ooo00o.o0O0O0o0;
import p657o0ooo00o.o0oO0Ooo;
import p659o0ooo0o.oo0o0O0;
import p663o0oooO0.o00OO;
import p663o0oooO0.o00OOOOo;
import p663o0oooO0.oo0O;
import p663o0oooO0.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class b1 extends o0O000O.OooO0O0 implements o0OO00OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public oo0O f57746OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oO000O0 f57747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Socket f57748OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Socket f57749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Protocol f57750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o0OOO0 f57751OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O000O f57752OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00OO f57753OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f57754OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f57755OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f57756OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f57757OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f57758OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f57759OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f57760OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f57761OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b1(@NotNull g1 connectionPool, @NotNull oO000O0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f57747OooO0O0 = route;
        this.f57759OooOOOO = 1;
        this.f57760OooOOOo = new ArrayList();
        this.f57761OooOOo0 = LongCompanionObject.MAX_VALUE;
    }

    public static void OooO0Oo(@NotNull o0oo0000 client, @NotNull oO000O0 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f57486OooO0O0.type() != Proxy.Type.DIRECT) {
            o0O0o00O o0o0o00o = failedRoute.f57485OooO00o;
            o0o0o00o.f57282OooO0oo.connectFailed(o0o0o00o.f57274OooO.OooOO0O(), failedRoute.f57486OooO0O0.address(), failure);
        }
        h1 h1Var = client.f57414Oooo000;
        synchronized (h1Var) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            h1Var.f57774OooO00o.add(failedRoute);
        }
    }

    public final boolean OooO(@NotNull o0O0o00O address, @Nullable List<oO000O0> list) {
        boolean z;
        boolean z2;
        o0OOO0 o0ooo1;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = o00OO0O0.f57561OooO00o;
        if (this.f57760OooOOOo.size() < this.f57759OooOOOO && !this.f57754OooOO0) {
            oO000O0 oo000o0 = this.f57747OooO0O0;
            if (!oo000o0.f57485OooO00o.OooO00o(address)) {
                return false;
            }
            o0OOOO00 o0oooo01 = address.f57274OooO;
            String str = o0oooo01.f57348OooO0Oo;
            o0O0o00O o0o0o00o = oo000o0.f57485OooO00o;
            if (Intrinsics.areEqual(str, o0o0o00o.f57274OooO.f57348OooO0Oo)) {
                return true;
            }
            if (this.f57752OooO0oO != null && list != null) {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        oO000O0 oo000o1 = (oO000O0) it.next();
                        if (oo000o1.f57486OooO0O0.type() == Proxy.Type.DIRECT && oo000o0.f57486OooO0O0.type() == Proxy.Type.DIRECT && Intrinsics.areEqual(oo000o0.f57487OooO0OO, oo000o1.f57487OooO0OO)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    if (address.f57278OooO0Oo != oo0o0O0.f58508OooO00o) {
                        return false;
                    }
                    byte[] bArr2 = o00OO0O0.f57561OooO00o;
                    o0OOOO00 o0oooo02 = o0o0o00o.f57274OooO;
                    int i = o0oooo02.f57350OooO0o0;
                    String hostname = o0oooo01.f57348OooO0Oo;
                    if (o0oooo01.f57350OooO0o0 == i) {
                        if (!Intrinsics.areEqual(hostname, o0oooo02.f57348OooO0Oo)) {
                            if (!this.f57755OooOO0O && (o0ooo1 = this.f57751OooO0o0) != null) {
                                Intrinsics.checkNotNull(o0ooo1);
                                List<Certificate> listOooO00o = o0ooo1.OooO00o();
                                if ((listOooO00o.isEmpty() ^ true) && oo0o0O0.OooO0O0(hostname, (X509Certificate) listOooO00o.get(0))) {
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
                        o0OO000o o0oo000o = address.f57280OooO0o0;
                        Intrinsics.checkNotNull(o0oo000o);
                        o0OOO0 o0ooo2 = this.f57751OooO0o0;
                        Intrinsics.checkNotNull(o0ooo2);
                        List<Certificate> peerCertificates = o0ooo2.OooO00o();
                        o0oo000o.getClass();
                        Intrinsics.checkNotNullParameter(hostname, "hostname");
                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                        o0oo000o.OooO00o(hostname, new oo0oO0(o0oo000o, peerCertificates, hostname));
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                    }
                }
            }
        }
        return false;
    }

    @Override // o0ooo00o.o0O000O.OooO0O0
    public final synchronized void OooO00o(@NotNull o0O000O connection, @NotNull o0O0O0o0 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f57759OooOOOO = (settings.f58464OooO00o & 16) != 0 ? settings.f58465OooO0O0[4] : Integer.MAX_VALUE;
    }

    @Override // o0ooo00o.o0O000O.OooO0O0
    public final void OooO0O0(@NotNull o0O00oO0 stream) throws IOException {
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
    public final void OooO0OO(int i, int i2, int i3, int i4, boolean z, @NotNull a1 call, @NotNull o0OO eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        boolean z3 = false;
        if (!(this.f57750OooO0o == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<o0OO0> list = this.f57747OooO0O0.f57485OooO00o.f57284OooOO0O;
        x0 x0Var = new x0(list);
        o0O0o00O o0o0o00o = this.f57747OooO0O0.f57485OooO00o;
        if (o0o0o00o.f57277OooO0OO == null) {
            if (!list.contains(o0OO0.f57306OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f57747OooO0O0.f57485OooO00o.f57274OooO.f57348OooO0Oo;
            o000OO0O o000oo0o2 = o000OO0O.f58265OooO00o;
            if (!o000OO0O.f58265OooO00o.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(o000oOoO.OooO00o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o0o0o00o.f57283OooOO0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                oO000O0 oo000o0 = this.f57747OooO0O0;
                if (oo000o0.f57485OooO00o.f57277OooO0OO != null && oo000o0.f57486OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0o(i, i2, i3, call, eventListener);
                    if (this.f57748OooO0OO == null) {
                        break;
                    }
                } else {
                    try {
                        OooO0o0(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f57749OooO0Oo;
                        if (socket != null) {
                            o00OO0O0.OooO0Oo(socket);
                        }
                        socket2 = this.f57748OooO0OO;
                        if (socket2 != null) {
                            o00OO0O0.OooO0Oo(socket2);
                        }
                        this.f57749OooO0Oo = null;
                        this.f57748OooO0OO = null;
                        this.f57753OooO0oo = null;
                        this.f57746OooO = null;
                        this.f57751OooO0o0 = null;
                        this.f57750OooO0o = null;
                        this.f57752OooO0oO = null;
                        this.f57759OooOOOO = 1;
                        oO000O0 oo000o1 = this.f57747OooO0O0;
                        eventListener.connectFailed(call, oo000o1.f57487OooO0OO, oo000o1.f57486OooO0O0, null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics.checkNotNullParameter(e, "e");
                            ExceptionsKt.addSuppressed(routeException.f60145OooO0Oo, e);
                            routeException.f60146OooO0o0 = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics.checkNotNullParameter(e, "e");
                        x0Var.f57789OooO0Oo = true;
                        if (!x0Var.f57788OooO0OO) {
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
                    OooO0oO(x0Var, i4, call, eventListener);
                    oO000O0 oo000o2 = this.f57747OooO0O0;
                    eventListener.connectEnd(call, oo000o2.f57487OooO0OO, oo000o2.f57486OooO0O0, this.f57750OooO0o);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f57749OooO0Oo;
                    if (socket != null) {
                        o00OO0O0.OooO0Oo(socket);
                    }
                    socket2 = this.f57748OooO0OO;
                    if (socket2 != null) {
                        o00OO0O0.OooO0Oo(socket2);
                    }
                    this.f57749OooO0Oo = null;
                    this.f57748OooO0OO = null;
                    this.f57753OooO0oo = null;
                    this.f57746OooO = null;
                    this.f57751OooO0o0 = null;
                    this.f57750OooO0o = null;
                    this.f57752OooO0oO = null;
                    this.f57759OooOOOO = 1;
                    oO000O0 oo000o3 = this.f57747OooO0O0;
                    eventListener.connectFailed(call, oo000o3.f57487OooO0OO, oo000o3.f57486OooO0O0, null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        ExceptionsKt.addSuppressed(routeException.f60145OooO0Oo, e);
                        routeException.f60146OooO0o0 = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    x0Var.f57789OooO0Oo = true;
                    if (!x0Var.f57788OooO0OO || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
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
        oO000O0 oo000o4 = this.f57747OooO0O0;
        if (oo000o4.f57485OooO00o.f57277OooO0OO != null && oo000o4.f57486OooO0O0.type() == Proxy.Type.HTTP) {
            z3 = true;
        }
        if (z3 && this.f57748OooO0OO == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f57761OooOOo0 = System.nanoTime();
    }

    public final void OooO0o(int i, int i2, int i3, a1 a1Var, o0OO o0oo) throws IOException {
        ooo0Oo0 ooo0oo0;
        oO000O0 oo000o0;
        a1 a1Var2 = a1Var;
        o0OO o0oo2 = o0oo;
        ooo0Oo0.OooO00o oooO00o = new ooo0Oo0.OooO00o();
        oO000O0 oo000o1 = this.f57747OooO0O0;
        o0OOOO00 url = oo000o1.f57485OooO00o.f57274OooO;
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57518OooO00o = url;
        o0oo0000 o0oo0000Var = null;
        oooO00o.OooO0o(FirebasePerformance.HttpMethod.CONNECT, null);
        o0O0o00O o0o0o00o = oo000o1.f57485OooO00o;
        boolean z = true;
        oooO00o.OooO0Oo("Host", o00OO0O0.OooOo0o(o0o0o00o.f57274OooO, true));
        oooO00o.OooO0Oo("Proxy-Connection", "Keep-Alive");
        oooO00o.OooO0Oo("User-Agent", "okhttp/4.10.0");
        ooo0Oo0 request = oooO00o.OooO0O0();
        oO0000Oo.OooO00o oooO00o2 = new oO0000Oo.OooO00o();
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f57468OooO00o = request;
        Protocol protocol = Protocol.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o2.f57469OooO0O0 = protocol;
        oooO00o2.f57470OooO0OO = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f57471OooO0Oo = "Preemptive Authenticate";
        oooO00o2.f57474OooO0oO = o00OO0O0.f57563OooO0OO;
        oooO00o2.f57477OooOO0O = -1L;
        oooO00o2.f57478OooOO0o = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        o0OOO0OO.OooO00o oooO00o3 = oooO00o2.f57472OooO0o;
        oooO00o3.getClass();
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        o0OOO0OO.OooO0O0.OooO00o("Proxy-Authenticate");
        o0OOO0OO.OooO0O0.OooO0O0("OkHttp-Preemptive", "Proxy-Authenticate");
        oooO00o3.OooO0Oo("Proxy-Authenticate");
        oooO00o3.OooO0O0("Proxy-Authenticate", "OkHttp-Preemptive");
        ooo0Oo0 ooo0oo0Authenticate = o0o0o00o.f57279OooO0o.authenticate(oo000o1, oooO00o2.OooO00o());
        if (ooo0oo0Authenticate != null) {
            request = ooo0oo0Authenticate;
        }
        ooo0Oo0 request2 = request;
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            OooO0o0(i, i2, a1Var2, o0oo2);
            String str = "CONNECT " + o00OO0O0.OooOo0o(request.f57512OooO00o, z) + " HTTP/1.1";
            while (true) {
                o00OO o00oo2 = this.f57753OooO0oo;
                Intrinsics.checkNotNull(o00oo2);
                oo0O oo0o = this.f57746OooO;
                Intrinsics.checkNotNull(oo0o);
                o0 o0Var = new o0(o0oo0000Var, this, o00oo2, oo0o);
                o00OOOOo o00oooooTimeout = o00oo2.timeout();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o00oooooTimeout.OooO0oO(j, timeUnit);
                ooo0oo0 = request;
                oo000o0 = oo000o1;
                oo0o.timeout().OooO0oO(i3, timeUnit);
                o0Var.OooOO0(request2.f57514OooO0OO, str);
                o0Var.OooO00o();
                oO0000Oo.OooO00o oooO00oOooO0Oo = o0Var.OooO0Oo(false);
                Intrinsics.checkNotNull(oooO00oOooO0Oo);
                oooO00oOooO0Oo.getClass();
                Intrinsics.checkNotNullParameter(request2, "request");
                oooO00oOooO0Oo.f57468OooO00o = request2;
                oO0000Oo response = oooO00oOooO0Oo.OooO00o();
                Intrinsics.checkNotNullParameter(response, "response");
                long jOooOO0O = o00OO0O0.OooOO0O(response);
                if (jOooOO0O != -1) {
                    o0.OooO0o oooO0oOooO = o0Var.OooO(jOooOO0O);
                    o00OO0O0.OooOo0(oooO0oOooO, Integer.MAX_VALUE, timeUnit);
                    oooO0oOooO.close();
                }
                int i5 = response.f57457OooO0oO;
                if (i5 == 200) {
                    if (!o00oo2.f58688OooO0o0.o00oO0o() || !oo0o.f58746OooO0o0.o00oO0o()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request2 = null;
                    break;
                }
                if (i5 != 407) {
                    throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(i5)));
                }
                request2 = o0o0o00o.f57279OooO0o.authenticate(oo000o0, response);
                if (request2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt__StringsJVMKt.equals("close", response.OooO0OO("Connection", null), true)) {
                    break;
                }
                i2 = i2;
                oo000o1 = oo000o0;
                request = ooo0oo0;
                o0oo0000Var = null;
            }
            if (request2 == null) {
                return;
            }
            Socket socket = this.f57748OooO0OO;
            if (socket != null) {
                o00OO0O0.OooO0Oo(socket);
            }
            this.f57748OooO0OO = null;
            this.f57746OooO = null;
            this.f57753OooO0oo = null;
            o0oo.connectEnd(a1Var, oo000o0.f57487OooO0OO, oo000o0.f57486OooO0O0, null);
            o0oo2 = o0oo;
            oo000o1 = oo000o0;
            request = ooo0oo0;
            z = true;
            o0oo0000Var = null;
            a1Var2 = a1Var;
        }
    }

    public final void OooO0o0(int i, int i2, a1 a1Var, o0OO o0oo) throws IOException {
        Socket socketCreateSocket;
        oO000O0 oo000o0 = this.f57747OooO0O0;
        Proxy proxy = oo000o0.f57486OooO0O0;
        o0O0o00O o0o0o00o = oo000o0.f57485OooO00o;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = o0o0o00o.f57276OooO0O0.createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f57748OooO0OO = socketCreateSocket;
        o0oo.connectStart(a1Var, this.f57747OooO0O0.f57487OooO0OO, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            o000OO0O o000oo0o2 = o000OO0O.f58265OooO00o;
            o000OO0O.f58265OooO00o.OooO0o0(socketCreateSocket, this.f57747OooO0O0.f57487OooO0OO, i);
            try {
                this.f57753OooO0oo = oo0oOO0.OooO0O0(oo0oOO0.OooO0o(socketCreateSocket));
                this.f57746OooO = oo0oOO0.OooO00o(oo0oOO0.OooO0Oo(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f57747OooO0O0.f57487OooO0OO));
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
    public final void OooO0oO(x0 x0Var, int i, a1 a1Var, o0OO o0oo) throws Throwable {
        Protocol protocolOooO00o;
        o0O0o00O o0o0o00o = this.f57747OooO0O0.f57485OooO00o;
        if (o0o0o00o.f57277OooO0OO == null) {
            List<Protocol> list = o0o0o00o.f57283OooOO0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f57749OooO0Oo = this.f57748OooO0OO;
                this.f57750OooO0o = Protocol.HTTP_1_1;
                return;
            } else {
                this.f57749OooO0Oo = this.f57748OooO0OO;
                this.f57750OooO0o = protocol;
                OooOOO0(i);
                return;
            }
        }
        o0oo.secureConnectStart(a1Var);
        o0O0o00O o0o0o00o2 = this.f57747OooO0O0.f57485OooO00o;
        SSLSocketFactory sSLSocketFactory = o0o0o00o2.f57277OooO0OO;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f57748OooO0OO;
            o0OOOO00 o0oooo01 = o0o0o00o2.f57274OooO;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, o0oooo01.f57348OooO0Oo, o0oooo01.f57350OooO0o0, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                o0OO0 o0oo0OooO00o = x0Var.OooO00o(sSLSocket2);
                if (o0oo0OooO00o.f57309OooO0O0) {
                    o000OO0O o000oo0o2 = o000OO0O.f58265OooO00o;
                    o000OO0O.f58265OooO00o.OooO0Oo(sSLSocket2, o0o0o00o2.f57274OooO.f57348OooO0Oo, o0o0o00o2.f57283OooOO0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                o0OOO0 o0ooo0OooO00o = o0OOO0.OooO00o.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = o0o0o00o2.f57278OooO0Oo;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(o0o0o00o2.f57274OooO.f57348OooO0Oo, sslSocketSession)) {
                    List<Certificate> listOooO00o = o0ooo0OooO00o.OooO00o();
                    if (!(!listOooO00o.isEmpty())) {
                        throw new SSLPeerUnverifiedException("Hostname " + o0o0o00o2.f57274OooO.f57348OooO0Oo + " not verified (no certificates)");
                    }
                    X509Certificate certificate = (X509Certificate) listOooO00o.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(o0o0o00o2.f57274OooO.f57348OooO0Oo);
                    sb.append(" not verified:\n              |    certificate: ");
                    o0OO000o o0oo000o = o0OO000o.f57316OooO0OO;
                    sb.append(o0OO000o.OooO0O0.OooO00o(certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb.append(CollectionsKt.plus((Collection) oo0o0O0.OooO00o(certificate, 7), (Iterable) oo0o0O0.OooO00o(certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
                }
                o0OO000o o0oo000o2 = o0o0o00o2.f57280OooO0o0;
                Intrinsics.checkNotNull(o0oo000o2);
                this.f57751OooO0o0 = new o0OOO0(o0ooo0OooO00o.f57329OooO00o, o0ooo0OooO00o.f57330OooO0O0, o0ooo0OooO00o.f57331OooO0OO, new c1(o0oo000o2, o0ooo0OooO00o, o0o0o00o2));
                o0oo000o2.OooO00o(o0o0o00o2.f57274OooO.f57348OooO0Oo, new d1(this));
                if (o0oo0OooO00o.f57309OooO0O0) {
                    o000OO0O o000oo0o3 = o000OO0O.f58265OooO00o;
                    strOooO0o = o000OO0O.f58265OooO00o.OooO0o(sSLSocket2);
                }
                this.f57749OooO0Oo = sSLSocket2;
                this.f57753OooO0oo = oo0oOO0.OooO0O0(oo0oOO0.OooO0o(sSLSocket2));
                this.f57746OooO = oo0oOO0.OooO00o(oo0oOO0.OooO0Oo(sSLSocket2));
                if (strOooO0o != null) {
                    Protocol.INSTANCE.getClass();
                    protocolOooO00o = Protocol.Companion.OooO00o(strOooO0o);
                } else {
                    protocolOooO00o = Protocol.HTTP_1_1;
                }
                this.f57750OooO0o = protocolOooO00o;
                o000OO0O o000oo0o4 = o000OO0O.f58265OooO00o;
                o000OO0O.f58265OooO00o.OooO00o(sSLSocket2);
                o0oo.secureConnectEnd(a1Var, this.f57751OooO0o0);
                if (this.f57750OooO0o == Protocol.HTTP_2) {
                    OooOOO0(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    o000OO0O o000oo0o5 = o000OO0O.f58265OooO00o;
                    o000OO0O.f58265OooO00o.OooO00o(sSLSocket);
                }
                if (sSLSocket != null) {
                    o00OO0O0.OooO0Oo(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void OooO0oo() {
        this.f57758OooOOO0++;
    }

    public final boolean OooOO0(boolean z) {
        long j;
        byte[] bArr = o00OO0O0.f57561OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f57748OooO0OO;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f57749OooO0Oo;
        Intrinsics.checkNotNull(socket2);
        o00OO source = this.f57753OooO0oo;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o0O000O o0o000o = this.f57752OooO0oO;
        if (o0o000o != null) {
            return o0o000o.OooOOoo(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f57761OooOOo0;
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
                return !source.o00oO0o();
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
    public final o0000Ooo OooOO0O(@NotNull o0oo0000 client, @NotNull o0000oo chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f57749OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o00OO o00oo2 = this.f57753OooO0oo;
        Intrinsics.checkNotNull(o00oo2);
        oo0O oo0o = this.f57746OooO;
        Intrinsics.checkNotNull(oo0o);
        o0O000O o0o000o = this.f57752OooO0oO;
        if (o0o000o != null) {
            return new o0oO0Ooo(client, this, chain, o0o000o);
        }
        int i = chain.f58291OooO0oO;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00oo2.timeout().OooO0oO(i, timeUnit);
        oo0o.timeout().OooO0oO(chain.f58292OooO0oo, timeUnit);
        return new o0(client, this, o00oo2, oo0o);
    }

    public final synchronized void OooOO0o() {
        this.f57754OooOO0 = true;
    }

    public final void OooOOO0(int i) throws IOException {
        String strStringPlus;
        Socket socket = this.f57749OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o00OO source = this.f57753OooO0oo;
        Intrinsics.checkNotNull(source);
        oo0O sink = this.f57746OooO;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        b0 taskRunner = b0.f57708OooO0oo;
        o0O000O.OooO00o oooO00o = new o0O000O.OooO00o(taskRunner);
        String peerName = this.f57747OooO0O0.f57485OooO00o.f57274OooO.f57348OooO0Oo;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        oooO00o.f58391OooO0OO = socket;
        if (oooO00o.f58389OooO00o) {
            strStringPlus = o00OO0O0.f57567OooO0oO + ' ' + peerName;
        } else {
            strStringPlus = Intrinsics.stringPlus("MockWebServer ", peerName);
        }
        Intrinsics.checkNotNullParameter(strStringPlus, "<set-?>");
        oooO00o.f58392OooO0Oo = strStringPlus;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        oooO00o.f58394OooO0o0 = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        oooO00o.f58393OooO0o = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        oooO00o.f58395OooO0oO = this;
        oooO00o.f58388OooO = i;
        o0O000O o0o000o = new o0O000O(oooO00o);
        this.f57752OooO0oO = o0o000o;
        o0O0O0o0 o0o0o0o0 = o0O000O.f58357OooOooo;
        this.f57759OooOOOO = (o0o0o0o0.f58464OooO00o & 16) != 0 ? o0o0o0o0.f58465OooO0O0[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        o0O0O0O o0o0o0o = o0o000o.f58383OooOoo0;
        synchronized (o0o0o0o) {
            if (o0o0o0o.f58462OooO0oo) {
                throw new IOException("closed");
            }
            if (o0o0o0o.f58460OooO0o0) {
                Logger logger = o0O0O0O.f58456OooOO0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o00OO0O0.OooO(Intrinsics.stringPlus(">> CONNECTION ", o0O000.f58325OooO0O0.OooO0o()), new Object[0]));
                }
                o0o0o0o.f58458OooO0Oo.o0000O00(o0O000.f58325OooO0O0);
                o0o0o0o.f58458OooO0Oo.flush();
            }
        }
        o0o000o.f58383OooOoo0.OooOo0O(o0o000o.f58375OooOo0);
        int iOooO00o = o0o000o.f58375OooOo0.OooO00o();
        if (iOooO00o != 65535) {
            o0o000o.f58383OooOoo0.OooO0o0(0, iOooO00o - 65535);
        }
        taskRunner.OooO0o().OooO0OO(new z(o0o000o.f58362OooO0oO, o0o000o.f58382OooOoo), 0L);
    }

    @NotNull
    public final String toString() {
        oo0ooO oo0ooo;
        StringBuilder sb = new StringBuilder("Connection{");
        oO000O0 oo000o0 = this.f57747OooO0O0;
        sb.append(oo000o0.f57485OooO00o.f57274OooO.f57348OooO0Oo);
        sb.append(':');
        sb.append(oo000o0.f57485OooO00o.f57274OooO.f57350OooO0o0);
        sb.append(", proxy=");
        sb.append(oo000o0.f57486OooO0O0);
        sb.append(" hostAddress=");
        sb.append(oo000o0.f57487OooO0OO);
        sb.append(" cipherSuite=");
        o0OOO0 o0ooo1 = this.f57751OooO0o0;
        Object obj = "none";
        if (o0ooo1 != null && (oo0ooo = o0ooo1.f57330OooO0O0) != null) {
            obj = oo0ooo;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f57750OooO0o);
        sb.append('}');
        return sb.toString();
    }
}
