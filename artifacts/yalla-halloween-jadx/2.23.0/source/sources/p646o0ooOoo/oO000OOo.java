package p646o0ooOoo;

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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ErrorCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p634o0ooO0oO.o00O0;
import p634o0ooO0oO.o00O00;
import p634o0ooO0oO.o00O0O0;
import p634o0ooO0oO.o00O0O00;
import p634o0ooO0oO.o00O0O0O;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OO0OO;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O00000;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p634o0ooO0oO.oo0o0O0;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.o00OO000;
import p639o0ooOO0o.o00OO0O0;
import p647o0ooOooo.kc;
import p647o0ooOooo.nc;
import p650o0ooo000.o000O0o;
import p651o0ooo00O.o000;
import p651o0ooo00O.o0000O0O;
import p651o0ooo00O.o0000oo;
import p651o0ooo00O.o000OOo;
import p651o0ooo00O.o0O0O00;
import p652o0ooo00o.o000O0O0;
import p655o0ooo0o0.o000OO;
import p659o0oooO00.o00;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000OOo extends o000OOo.OooO0O0 implements o00O0O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00 f59616OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O00000 f59617OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Socket f59618OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Socket f59619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Protocol f59620OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00OO0OO f59621OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000OOo f59622OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00O0000 f59623OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f59624OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f59625OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f59626OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f59627OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f59628OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f59629OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59630OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f59631OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public oO000OOo(@NotNull oO000o00 connectionPool, @NotNull o0O00000 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f59617OooO0O0 = route;
        this.f59629OooOOOO = 1;
        this.f59630OooOOOo = new ArrayList();
        this.f59631OooOOo0 = LongCompanionObject.MAX_VALUE;
    }

    public static void OooO0Oo(@NotNull o00OOOO0 client, @NotNull o0O00000 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f57327OooO0O0.type() != Proxy.Type.DIRECT) {
            o00O00 o00o01 = failedRoute.f57326OooO00o;
            o00o01.f57152OooO0oo.connectFailed(o00o01.f57144OooO.OooOO0O(), failedRoute.f57327OooO0O0.address(), failure);
        }
        oO0O0OoO oo0o0ooo = client.f57283Oooo000;
        synchronized (oo0o0ooo) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            oo0o0ooo.f59650OooO00o.add(failedRoute);
        }
    }

    public final boolean OooO(@NotNull o00O00 address, @Nullable List<o0O00000> list) {
        boolean z;
        boolean z2;
        o00OO0OO o00oo0oo;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = o0O000o0.f57386OooO00o;
        if (this.f59630OooOOOo.size() < this.f59629OooOOOO && !this.f59624OooOO0) {
            o0O00000 o0o00000 = this.f59617OooO0O0;
            if (!o0o00000.f57326OooO00o.OooO00o(address)) {
                return false;
            }
            o00OO o00oo2 = address.f57144OooO;
            String str = o00oo2.f57206OooO0Oo;
            o00O00 o00o01 = o0o00000.f57326OooO00o;
            if (Intrinsics.areEqual(str, o00o01.f57144OooO.f57206OooO0Oo)) {
                return true;
            }
            if (this.f59622OooO0oO != null && list != null) {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        o0O00000 o0o00001 = (o0O00000) it.next();
                        if (o0o00001.f57327OooO0O0.type() == Proxy.Type.DIRECT && o0o00000.f57327OooO0O0.type() == Proxy.Type.DIRECT && Intrinsics.areEqual(o0o00000.f57328OooO0OO, o0o00001.f57328OooO0OO)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    if (address.f57148OooO0Oo != o000OO.f60127OooO00o) {
                        return false;
                    }
                    byte[] bArr2 = o0O000o0.f57386OooO00o;
                    o00OO o00oo3 = o00o01.f57144OooO;
                    int i = o00oo3.f57208OooO0o0;
                    String hostname = o00oo2.f57206OooO0Oo;
                    if (o00oo2.f57208OooO0o0 == i) {
                        if (!Intrinsics.areEqual(hostname, o00oo3.f57206OooO0Oo)) {
                            if (!this.f59625OooOO0O && (o00oo0oo = this.f59621OooO0o0) != null) {
                                Intrinsics.checkNotNull(o00oo0oo);
                                List<Certificate> listOooO00o = o00oo0oo.OooO00o();
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
                        o00O0 o00o1 = address.f57150OooO0o0;
                        Intrinsics.checkNotNull(o00o1);
                        o00OO0OO o00oo0oo2 = this.f59621OooO0o0;
                        Intrinsics.checkNotNull(o00oo0oo2);
                        List<Certificate> peerCertificates = o00oo0oo2.OooO00o();
                        o00o1.getClass();
                        Intrinsics.checkNotNullParameter(hostname, "hostname");
                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                        o00o1.OooO00o(hostname, new o00O0O00(o00o1, peerCertificates, hostname));
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                    }
                }
            }
        }
        return false;
    }

    @Override // o0ooo00O.o000OOo.OooO0O0
    public final synchronized void OooO00o(@NotNull o000OOo connection, @NotNull o000 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f59629OooOOOO = (settings.f59853OooO00o & 16) != 0 ? settings.f59854OooO0O0[4] : Integer.MAX_VALUE;
    }

    @Override // o0ooo00O.o000OOo.OooO0O0
    public final void OooO0O0(@NotNull o0000O0O stream) throws IOException {
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
    public final void OooO0OO(int i, int i2, int i3, int i4, boolean z, @NotNull oO0Oo0oo call, @NotNull o00OO00O eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        boolean z2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        boolean z3 = false;
        if (!(this.f59620OooO0o == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<oo0o0O0> list = this.f59617OooO0O0.f57326OooO00o.f57154OooOO0O;
        oO0Ooooo oo0ooooo = new oO0Ooooo(list);
        o00O00 o00o01 = this.f59617OooO0O0.f57326OooO00o;
        if (o00o01.f57147OooO0OO == null) {
            if (!list.contains(oo0o0O0.f57371OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f59617OooO0O0.f57326OooO00o.f57144OooO.f57206OooO0Oo;
            o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
            if (!o000O0O0.f60031OooO00o.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(o000oOoO.OooO00o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o00o01.f57153OooOO0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                o0O00000 o0o00000 = this.f59617OooO0O0;
                if (o0o00000.f57326OooO00o.f57147OooO0OO != null && o0o00000.f57327OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0o(i, i2, i3, call, eventListener);
                    if (this.f59618OooO0OO == null) {
                        break;
                    }
                } else {
                    try {
                        OooO0o0(i, i2, call, eventListener);
                    } catch (IOException e) {
                        e = e;
                        socket = this.f59619OooO0Oo;
                        if (socket != null) {
                            o0O000o0.OooO0Oo(socket);
                        }
                        socket2 = this.f59618OooO0OO;
                        if (socket2 != null) {
                            o0O000o0.OooO0Oo(socket2);
                        }
                        this.f59619OooO0Oo = null;
                        this.f59618OooO0OO = null;
                        this.f59623OooO0oo = null;
                        this.f59616OooO = null;
                        this.f59621OooO0o0 = null;
                        this.f59620OooO0o = null;
                        this.f59622OooO0oO = null;
                        this.f59629OooOOOO = 1;
                        o0O00000 o0o00001 = this.f59617OooO0O0;
                        eventListener.connectFailed(call, o0o00001.f57328OooO0OO, o0o00001.f57327OooO0O0, null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            Intrinsics.checkNotNullParameter(e, "e");
                            ExceptionsKt.addSuppressed(routeException.f60852OooO0Oo, e);
                            routeException.f60853OooO0o0 = e;
                        }
                        if (z) {
                            throw routeException;
                        }
                        Intrinsics.checkNotNullParameter(e, "e");
                        oo0ooooo.f59688OooO0Oo = true;
                        if (!oo0ooooo.f59687OooO0OO) {
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
                    OooO0oO(oo0ooooo, i4, call, eventListener);
                    o0O00000 o0o00002 = this.f59617OooO0O0;
                    eventListener.connectEnd(call, o0o00002.f57328OooO0OO, o0o00002.f57327OooO0O0, this.f59620OooO0o);
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.f59619OooO0Oo;
                    if (socket != null) {
                        o0O000o0.OooO0Oo(socket);
                    }
                    socket2 = this.f59618OooO0OO;
                    if (socket2 != null) {
                        o0O000o0.OooO0Oo(socket2);
                    }
                    this.f59619OooO0Oo = null;
                    this.f59618OooO0OO = null;
                    this.f59623OooO0oo = null;
                    this.f59616OooO = null;
                    this.f59621OooO0o0 = null;
                    this.f59620OooO0o = null;
                    this.f59622OooO0oO = null;
                    this.f59629OooOOOO = 1;
                    o0O00000 o0o00003 = this.f59617OooO0O0;
                    eventListener.connectFailed(call, o0o00003.f57328OooO0OO, o0o00003.f57327OooO0O0, null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        Intrinsics.checkNotNullParameter(e, "e");
                        ExceptionsKt.addSuppressed(routeException.f60852OooO0Oo, e);
                        routeException.f60853OooO0o0 = e;
                    }
                    if (z) {
                        throw routeException;
                    }
                    Intrinsics.checkNotNullParameter(e, "e");
                    oo0ooooo.f59688OooO0Oo = true;
                    if (!oo0ooooo.f59687OooO0OO || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
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
        o0O00000 o0o00004 = this.f59617OooO0O0;
        if (o0o00004.f57326OooO00o.f57147OooO0OO != null && o0o00004.f57327OooO0O0.type() == Proxy.Type.HTTP) {
            z3 = true;
        }
        if (z3 && this.f59618OooO0OO == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f59631OooOOo0 = System.nanoTime();
    }

    public final void OooO0o(int i, int i2, int i3, oO0Oo0oo oo0oo0oo, o00OO00O o00oo00o) throws IOException {
        o00OOOOo o00ooooo2;
        o0O00000 o0o00000;
        oO0Oo0oo oo0oo0oo2 = oo0oo0oo;
        o00OO00O o00oo00o2 = o00oo00o;
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        o0O00000 o0o00001 = this.f59617OooO0O0;
        o00OO url = o0o00001.f57326OooO00o.f57144OooO;
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57319OooO00o = url;
        o00OOOO0 o00oooo1 = null;
        oooO00o.OooO0o(FirebasePerformance.HttpMethod.CONNECT, null);
        o00O00 o00o01 = o0o00001.f57326OooO00o;
        boolean z = true;
        oooO00o.OooO0Oo("Host", o0O000o0.OooOo0o(o00o01.f57144OooO, true));
        oooO00o.OooO0Oo("Proxy-Connection", "Keep-Alive");
        oooO00o.OooO0Oo("User-Agent", "okhttp/4.10.0");
        o00OOOOo request = oooO00o.OooO0O0();
        o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o();
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f57356OooO00o = request;
        Protocol protocol = Protocol.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o2.f57357OooO0O0 = protocol;
        oooO00o2.f57358OooO0OO = 407;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        oooO00o2.f57359OooO0Oo = "Preemptive Authenticate";
        oooO00o2.f57362OooO0oO = o0O000o0.f57388OooO0OO;
        oooO00o2.f57365OooOO0O = -1L;
        oooO00o2.f57366OooOO0o = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        oo0O.OooO00o oooO00o3 = oooO00o2.f57360OooO0o;
        oooO00o3.getClass();
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        oo0O.OooO0O0.OooO00o("Proxy-Authenticate");
        oo0O.OooO0O0.OooO0O0("OkHttp-Preemptive", "Proxy-Authenticate");
        oooO00o3.OooO0Oo("Proxy-Authenticate");
        oooO00o3.OooO0O0("Proxy-Authenticate", "OkHttp-Preemptive");
        o00OOOOo o00oooooAuthenticate = o00o01.f57149OooO0o.authenticate(o0o00001, oooO00o2.OooO00o());
        if (o00oooooAuthenticate != null) {
            request = o00oooooAuthenticate;
        }
        o00OOOOo request2 = request;
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            OooO0o0(i, i2, oo0oo0oo2, o00oo00o2);
            String str = "CONNECT " + o0O000o0.OooOo0o(request.f57313OooO00o, z) + " HTTP/1.1";
            while (true) {
                o00O0000 o00o0001 = this.f59623OooO0oo;
                Intrinsics.checkNotNull(o00o0001);
                o00 o00Var = this.f59616OooO;
                Intrinsics.checkNotNull(o00Var);
                o000O0o o000o0o2 = new o000O0o(o00oooo1, this, o00o0001, o00Var);
                o00O00O o00o00oTimeout = o00o0001.timeout();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o00o00oTimeout.OooO0oO(j, timeUnit);
                o00ooooo2 = request;
                o0o00000 = o0o00001;
                o00Var.timeout().OooO0oO(i3, timeUnit);
                o000o0o2.OooOO0(request2.f57315OooO0OO, str);
                o000o0o2.OooO00o();
                o0oOOo.OooO00o oooO00oOooO0o0 = o000o0o2.OooO0o0(false);
                Intrinsics.checkNotNull(oooO00oOooO0o0);
                oooO00oOooO0o0.getClass();
                Intrinsics.checkNotNullParameter(request2, "request");
                oooO00oOooO0o0.f57356OooO00o = request2;
                o0oOOo response = oooO00oOooO0o0.OooO00o();
                Intrinsics.checkNotNullParameter(response, "response");
                long jOooOO0O = o0O000o0.OooOO0O(response);
                if (jOooOO0O != -1) {
                    o000O0o.OooO0o oooO0oOooO = o000o0o2.OooO(jOooOO0O);
                    o0O000o0.OooOo0(oooO0oOooO, Integer.MAX_VALUE, timeUnit);
                    oooO0oOooO.close();
                }
                int i5 = response.f57345OooO0oO;
                if (i5 == 200) {
                    if (!o00o0001.f60234OooO0o0.oo000o() || !o00Var.f60164OooO0o0.oo000o()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    request2 = null;
                    break;
                }
                if (i5 != 407) {
                    throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(i5)));
                }
                request2 = o00o01.f57149OooO0o.authenticate(o0o00000, response);
                if (request2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt.OooOO0o("close", response.OooO0OO("Connection", null))) {
                    break;
                }
                i2 = i2;
                o0o00001 = o0o00000;
                request = o00ooooo2;
                o00oooo1 = null;
            }
            if (request2 == null) {
                return;
            }
            Socket socket = this.f59618OooO0OO;
            if (socket != null) {
                o0O000o0.OooO0Oo(socket);
            }
            this.f59618OooO0OO = null;
            this.f59616OooO = null;
            this.f59623OooO0oo = null;
            o00oo00o.connectEnd(oo0oo0oo, o0o00000.f57328OooO0OO, o0o00000.f57327OooO0O0, null);
            o00oo00o2 = o00oo00o;
            o0o00001 = o0o00000;
            request = o00ooooo2;
            z = true;
            o00oooo1 = null;
            oo0oo0oo2 = oo0oo0oo;
        }
    }

    public final void OooO0o0(int i, int i2, oO0Oo0oo oo0oo0oo, o00OO00O o00oo00o) throws IOException {
        Socket socketCreateSocket;
        o0O00000 o0o00000 = this.f59617OooO0O0;
        Proxy proxy = o0o00000.f57327OooO0O0;
        o00O00 o00o01 = o0o00000.f57326OooO00o;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = o00o01.f57146OooO0O0.createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f59618OooO0OO = socketCreateSocket;
        o00oo00o.connectStart(oo0oo0oo, this.f59617OooO0O0.f57328OooO0OO, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
            o000O0O0.f60031OooO00o.OooO0o0(socketCreateSocket, this.f59617OooO0O0.f57328OooO0OO, i);
            try {
                this.f59623OooO0oo = o000O0Oo.OooO0O0(o000O0Oo.OooO0o(socketCreateSocket));
                this.f59616OooO = o000O0Oo.OooO00o(o000O0Oo.OooO0Oo(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f59617OooO0O0.f57328OooO0OO));
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
    public final void OooO0oO(oO0Ooooo oo0ooooo, int i, oO0Oo0oo oo0oo0oo, o00OO00O o00oo00o) throws Throwable {
        Protocol protocolOooO00o;
        o00O00 o00o01 = this.f59617OooO0O0.f57326OooO00o;
        if (o00o01.f57147OooO0OO == null) {
            List<Protocol> list = o00o01.f57153OooOO0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f59619OooO0Oo = this.f59618OooO0OO;
                this.f59620OooO0o = Protocol.HTTP_1_1;
                return;
            } else {
                this.f59619OooO0Oo = this.f59618OooO0OO;
                this.f59620OooO0o = protocol;
                OooOOO0(i);
                return;
            }
        }
        o00oo00o.secureConnectStart(oo0oo0oo);
        o00O00 o00o02 = this.f59617OooO0O0.f57326OooO00o;
        SSLSocketFactory sSLSocketFactory = o00o02.f57147OooO0OO;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f59618OooO0OO;
            o00OO o00oo2 = o00o02.f57144OooO;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, o00oo2.f57206OooO0Oo, o00oo2.f57208OooO0o0, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                oo0o0O0 oo0o0o0OooO00o = oo0ooooo.OooO00o(sSLSocket2);
                if (oo0o0o0OooO00o.f57374OooO0O0) {
                    o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
                    o000O0O0.f60031OooO00o.OooO0Oo(sSLSocket2, o00o02.f57144OooO.f57206OooO0Oo, o00o02.f57153OooOO0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                o00OO0OO o00oo0ooOooO00o = o00OO0OO.OooO00o.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = o00o02.f57148OooO0Oo;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(o00o02.f57144OooO.f57206OooO0Oo, sslSocketSession)) {
                    List<Certificate> listOooO00o = o00oo0ooOooO00o.OooO00o();
                    if (!(!listOooO00o.isEmpty())) {
                        throw new SSLPeerUnverifiedException("Hostname " + o00o02.f57144OooO.f57206OooO0Oo + " not verified (no certificates)");
                    }
                    X509Certificate certificate = (X509Certificate) listOooO00o.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(o00o02.f57144OooO.f57206OooO0Oo);
                    sb.append(" not verified:\n              |    certificate: ");
                    o00O0 o00o1 = o00O0.f57137OooO0OO;
                    sb.append(o00O0.OooO0O0.OooO00o(certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb.append(CollectionsKt.plus((Collection) o000OO.OooO00o(certificate, 7), (Iterable) o000OO.OooO00o(certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null));
                }
                o00O0 o00o2 = o00o02.f57150OooO0o0;
                Intrinsics.checkNotNull(o00o2);
                this.f59621OooO0o0 = new o00OO0OO(o00oo0ooOooO00o.f57227OooO00o, o00oo0ooOooO00o.f57228OooO0O0, o00oo0ooOooO00o.f57229OooO0OO, new ooOOOOoo(o00o2, o00oo0ooOooO00o, o00o02));
                o00o2.OooO00o(o00o02.f57144OooO.f57206OooO0Oo, new oO0OOo0o(this));
                if (oo0o0o0OooO00o.f57374OooO0O0) {
                    o000O0O0 o000o0o2 = o000O0O0.f60031OooO00o;
                    strOooO0o = o000O0O0.f60031OooO00o.OooO0o(sSLSocket2);
                }
                this.f59619OooO0Oo = sSLSocket2;
                this.f59623OooO0oo = o000O0Oo.OooO0O0(o000O0Oo.OooO0o(sSLSocket2));
                this.f59616OooO = o000O0Oo.OooO00o(o000O0Oo.OooO0Oo(sSLSocket2));
                if (strOooO0o != null) {
                    Protocol.INSTANCE.getClass();
                    protocolOooO00o = Protocol.Companion.OooO00o(strOooO0o);
                } else {
                    protocolOooO00o = Protocol.HTTP_1_1;
                }
                this.f59620OooO0o = protocolOooO00o;
                o000O0O0 o000o0o3 = o000O0O0.f60031OooO00o;
                o000O0O0.f60031OooO00o.OooO00o(sSLSocket2);
                o00oo00o.secureConnectEnd(oo0oo0oo, this.f59621OooO0o0);
                if (this.f59620OooO0o == Protocol.HTTP_2) {
                    OooOOO0(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    o000O0O0 o000o0o4 = o000O0O0.f60031OooO00o;
                    o000O0O0.f60031OooO00o.OooO00o(sSLSocket);
                }
                if (sSLSocket != null) {
                    o0O000o0.OooO0Oo(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void OooO0oo() {
        this.f59628OooOOO0++;
    }

    public final boolean OooOO0(boolean z) {
        long j;
        byte[] bArr = o0O000o0.f57386OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f59618OooO0OO;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f59619OooO0Oo;
        Intrinsics.checkNotNull(socket2);
        o00O0000 source = this.f59623OooO0oo;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o000OOo o000ooo2 = this.f59622OooO0oO;
        if (o000ooo2 != null) {
            return o000ooo2.OooOOo0(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f59631OooOOo0;
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
                return !source.oo000o();
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
    public final kc OooOO0O(@NotNull o00OOOO0 client, @NotNull nc chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f59619OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o00O0000 o00o0001 = this.f59623OooO0oo;
        Intrinsics.checkNotNull(o00o0001);
        o00 o00Var = this.f59616OooO;
        Intrinsics.checkNotNull(o00Var);
        o000OOo o000ooo2 = this.f59622OooO0oO;
        if (o000ooo2 != null) {
            return new o0000oo(client, this, chain, o000ooo2);
        }
        int i = chain.f59721OooO0oO;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00o0001.timeout().OooO0oO(i, timeUnit);
        o00Var.timeout().OooO0oO(chain.f59722OooO0oo, timeUnit);
        return new o000O0o(client, this, o00o0001, o00Var);
    }

    public final synchronized void OooOO0o() {
        this.f59624OooOO0 = true;
    }

    public final void OooOOO0(int i) throws IOException {
        String strStringPlus;
        Socket socket = this.f59619OooO0Oo;
        Intrinsics.checkNotNull(socket);
        o00O0000 source = this.f59623OooO0oo;
        Intrinsics.checkNotNull(source);
        o00 sink = this.f59616OooO;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        o00OO0O0 taskRunner = o00OO0O0.f57441OooO0oo;
        o000OOo.OooO00o oooO00o = new o000OOo.OooO00o(taskRunner);
        String peerName = this.f59617OooO0O0.f57326OooO00o.f57144OooO.f57206OooO0Oo;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        oooO00o.f59971OooO0OO = socket;
        if (oooO00o.f59969OooO00o) {
            strStringPlus = o0O000o0.f57392OooO0oO + ' ' + peerName;
        } else {
            strStringPlus = Intrinsics.stringPlus("MockWebServer ", peerName);
        }
        Intrinsics.checkNotNullParameter(strStringPlus, "<set-?>");
        oooO00o.f59972OooO0Oo = strStringPlus;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        oooO00o.f59974OooO0o0 = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        oooO00o.f59973OooO0o = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        oooO00o.f59975OooO0oO = this;
        oooO00o.f59968OooO = i;
        o000OOo o000ooo2 = new o000OOo(oooO00o);
        this.f59622OooO0oO = o000ooo2;
        o000 o000Var = o000OOo.f59937OooOooo;
        this.f59629OooOOOO = (o000Var.f59853OooO00o & 16) != 0 ? o000Var.f59854OooO0O0[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        p651o0ooo00O.o000OO o000oo2 = o000ooo2.f59963OooOoo0;
        synchronized (o000oo2) {
            if (o000oo2.f59936OooO0oo) {
                throw new IOException("closed");
            }
            if (o000oo2.f59934OooO0o0) {
                Logger logger = p651o0ooo00O.o000OO.f59930OooOO0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o0O000o0.OooO(Intrinsics.stringPlus(">> CONNECTION ", o0O0O00.f59986OooO0O0.OooO0o()), new Object[0]));
                }
                o000oo2.f59932OooO0Oo.o0000O00(o0O0O00.f59986OooO0O0);
                o000oo2.f59932OooO0Oo.flush();
            }
        }
        o000ooo2.f59963OooOoo0.OooOo00(o000ooo2.f59955OooOo0);
        int iOooO00o = o000ooo2.f59955OooOo0.OooO00o();
        if (iOooO00o != 65535) {
            o000ooo2.f59963OooOoo0.OooO0o0(0, iOooO00o - 65535);
        }
        taskRunner.OooO0o().OooO0OO(new o00OO000(o000ooo2.f59942OooO0oO, o000ooo2.f59962OooOoo), 0L);
    }

    @NotNull
    public final String toString() {
        o00O0O0 o00o0o0;
        StringBuilder sb = new StringBuilder("Connection{");
        o0O00000 o0o00000 = this.f59617OooO0O0;
        sb.append(o0o00000.f57326OooO00o.f57144OooO.f57206OooO0Oo);
        sb.append(':');
        sb.append(o0o00000.f57326OooO00o.f57144OooO.f57208OooO0o0);
        sb.append(", proxy=");
        sb.append(o0o00000.f57327OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o0o00000.f57328OooO0OO);
        sb.append(" cipherSuite=");
        o00OO0OO o00oo0oo = this.f59621OooO0o0;
        Object obj = "none";
        if (o00oo0oo != null && (o00o0o0 = o00oo0oo.f57228OooO0O0) != null) {
            obj = o00o0o0;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f59620OooO0o);
        sb.append('}');
        return sb.toString();
    }
}
