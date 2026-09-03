package com.squareup.okhttp;

import com.qiniu.android.http.ResponseInfo;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocketFactory;
import p338o0OO0ooo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public class o00Oo0 implements Cloneable {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static SSLSocketFactory f21595OooOooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f21596OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p336o0OO0oo0.Oooo000 f21597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Proxy f21598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f21599OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public List<Protocol> f21600OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<OooOo00> f21601OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f21602OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ProxySelector f21603OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CookieHandler f21604OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO0OO f21605OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public p336o0OO0oo0.OooOOO0 f21606OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public SocketFactory f21607OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public SSLSocketFactory f21608OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooOO0O f21609OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public HostnameVerifier f21610OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0 f21611OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f21612OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public p336o0OO0oo0.OooOOOO f21613OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOOOO f21614OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f21615OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f21616OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f21617OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f21618OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f21619OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final List<Protocol> f21594OooOoo0 = p336o0OO0oo0.o000oOoO.OooO0o(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final List<OooOo00> f21593OooOoo = p336o0OO0oo0.o000oOoO.OooO0o(OooOo00.f21575OooO0o0, OooOo00.f21574OooO0o, OooOo00.f21576OooO0oO);

    public static class OooO00o extends p336o0OO0oo0.OooOO0O {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v6 */
        public final void OooO00o(o00Oo0 o00oo1, OooOOO oooOOO, o0000OO0 o0000oo1, o00Ooo o00ooo2) throws RouteException {
            RouteException routeException;
            com.squareup.okhttp.OooO00o oooO00o;
            int i;
            boolean z;
            oooOOO.OooO0oO(o0000oo1);
            boolean z2 = oooOOO.f21558OooO0Oo;
            if (!z2) {
                o0ooOOo o0ooooo = oooOOO.f21556OooO0O0;
                com.squareup.okhttp.OooO00o oooO00o2 = o0ooooo.f21647OooO00o;
                List<OooOo00> list = oooO00o2.f21523OooOO0;
                int i2 = o00oo1.f21618OooOoO0;
                int i3 = o00oo1.f21617OooOoO;
                int i4 = o00oo1.f21619OooOoOO;
                boolean z3 = o00oo1.f21612OooOo;
                if (z2) {
                    throw new IllegalStateException("already connected");
                }
                p336o0OO0oo0.OooO0OO oooO0OO = new p336o0OO0oo0.OooO0OO(list);
                Proxy proxy = o0ooooo.f21648OooO0O0;
                if (oooO00o2.f21520OooO0o0 == null && !list.contains(OooOo00.f21576OooO0oO)) {
                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list));
                }
                RouteException routeException2 = null;
                while (!oooOOO.f21558OooO0Oo) {
                    try {
                        oooOOO.f21557OooO0OO = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? oooO00o2.f21518OooO0Oo.createSocket() : new Socket(proxy);
                        oooO00o = oooO00o2;
                        i = 1;
                        routeException = routeException2;
                        try {
                            oooOOO.OooO0O0(i2, i3, i4, o00ooo2, oooO0OO);
                            oooOOO.f21558OooO0Oo = true;
                            oooO00o2 = oooO00o;
                            routeException2 = routeException;
                        } catch (IOException e) {
                            e = e;
                            p336o0OO0oo0.o000oOoO.OooO0OO(oooOOO.f21557OooO0OO);
                            oooOOO.f21557OooO0OO = null;
                            ?? r5 = 0;
                            r5 = 0;
                            r5 = 0;
                            r5 = 0;
                            r5 = 0;
                            r5 = 0;
                            RouteException routeException3 = routeException;
                            if (routeException3 == null) {
                                routeException2 = new RouteException(e);
                            } else {
                                IOException iOException = routeException3.f21590OooO0Oo;
                                Method method = RouteException.f21589OooO0o0;
                                if (method != null) {
                                    try {
                                        Object[] objArr = new Object[i];
                                        objArr[0] = iOException;
                                        method.invoke(e, objArr);
                                    } catch (IllegalAccessException | InvocationTargetException unused) {
                                    }
                                }
                                routeException3.f21590OooO0Oo = e;
                                routeException2 = routeException3;
                            }
                            if (!z3) {
                                throw routeException2;
                            }
                            oooO0OO.f43263OooO0Oo = i;
                            if (!(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!((z = e instanceof SSLHandshakeException)) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && ((z || (e instanceof SSLProtocolException)) && oooO0OO.f43262OooO0OO))) {
                                r5 = i;
                            }
                            if (r5 == 0) {
                                throw routeException2;
                            }
                            oooO00o2 = oooO00o;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        routeException = routeException2;
                        oooO00o = oooO00o2;
                        i = 1;
                    }
                }
                if (oooOOO.OooO0o0()) {
                    o00oo1.f21614OooOo00.OooO00o(oooOOO);
                }
                p336o0OO0oo0.Oooo000 oooo000 = o00oo1.f21597OooO0Oo;
                o0ooOOo o0ooooo2 = oooOOO.f21556OooO0O0;
                synchronized (oooo000) {
                    oooo000.f43327OooO00o.remove(o0ooooo2);
                }
            }
            int i5 = o00oo1.f21617OooOoO;
            int i6 = o00oo1.f21619OooOoOO;
            if (!oooOOO.f21558OooO0Oo) {
                throw new IllegalStateException("setTimeouts - not connected");
            }
            if (oooOOO.f21560OooO0o0 != null) {
                try {
                    oooOOO.f21557OooO0OO.setSoTimeout(i5);
                    oooOOO.f21560OooO0o0.OooO0Oo(i5, i6);
                } catch (IOException e3) {
                    throw new RouteException(e3);
                }
            }
        }

        public final void OooO0O0(OooOOOO oooOOOO, OooOOO oooOOO) {
            oooOOOO.getClass();
            if (!oooOOO.OooO0o0() && oooOOO.OooO00o()) {
                if (!oooOOO.OooO0Oo()) {
                    p336o0OO0oo0.o000oOoO.OooO0OO(oooOOO.f21557OooO0OO);
                    return;
                }
                try {
                    p336o0OO0oo0.OooOo.f43307OooO00o.OooO0o(oooOOO.f21557OooO0OO);
                    synchronized (oooOOOO) {
                        LinkedList<OooOOO> linkedList = oooOOOO.f21570OooO0OO;
                        boolean zIsEmpty = linkedList.isEmpty();
                        linkedList.addFirst(oooOOO);
                        if (zIsEmpty) {
                            oooOOOO.f21571OooO0Oo.execute(oooOOOO.f21572OooO0o0);
                        } else {
                            oooOOOO.notifyAll();
                        }
                        oooOOO.f21563OooOO0++;
                        if (oooOOO.f21559OooO0o != null) {
                            throw new IllegalStateException("framedConnection != null");
                        }
                        oooOOO.f21562OooO0oo = System.nanoTime();
                    }
                } catch (SocketException e) {
                    p336o0OO0oo0.OooOo.f43307OooO00o.getClass();
                    System.out.println("Unable to untagSocket(): " + e);
                    p336o0OO0oo0.o000oOoO.OooO0OO(oooOOO.f21557OooO0OO);
                }
            }
        }
    }

    static {
        p336o0OO0oo0.OooOO0O.f43304OooO0O0 = new OooO00o();
    }

    public o00Oo0() {
        this.f21596OooO = new ArrayList();
        this.f21602OooOO0 = new ArrayList();
        this.f21615OooOo0O = true;
        this.f21616OooOo0o = true;
        this.f21612OooOo = true;
        this.f21618OooOoO0 = ResponseInfo.UnknownError;
        this.f21617OooOoO = ResponseInfo.UnknownError;
        this.f21619OooOoOO = ResponseInfo.UnknownError;
        this.f21597OooO0Oo = new p336o0OO0oo0.Oooo000();
        this.f21599OooO0o0 = new Oooo000();
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o00Oo0(this);
    }

    public o00Oo0(o00Oo0 o00oo1) {
        ArrayList arrayList = new ArrayList();
        this.f21596OooO = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f21602OooOO0 = arrayList2;
        this.f21615OooOo0O = true;
        this.f21616OooOo0o = true;
        this.f21612OooOo = true;
        this.f21618OooOoO0 = ResponseInfo.UnknownError;
        this.f21617OooOoO = ResponseInfo.UnknownError;
        this.f21619OooOoOO = ResponseInfo.UnknownError;
        this.f21597OooO0Oo = o00oo1.f21597OooO0Oo;
        this.f21599OooO0o0 = o00oo1.f21599OooO0o0;
        this.f21598OooO0o = o00oo1.f21598OooO0o;
        this.f21600OooO0oO = o00oo1.f21600OooO0oO;
        this.f21601OooO0oo = o00oo1.f21601OooO0oo;
        arrayList.addAll(o00oo1.f21596OooO);
        arrayList2.addAll(o00oo1.f21602OooOO0);
        this.f21603OooOO0O = o00oo1.f21603OooOO0O;
        this.f21604OooOO0o = o00oo1.f21604OooOO0o;
        OooO0OO oooO0OO = o00oo1.f21605OooOOO;
        this.f21605OooOOO = oooO0OO;
        this.f21606OooOOO0 = oooO0OO != null ? oooO0OO.f21525OooO00o : o00oo1.f21606OooOOO0;
        this.f21607OooOOOO = o00oo1.f21607OooOOOO;
        this.f21608OooOOOo = o00oo1.f21608OooOOOo;
        this.f21610OooOOo0 = o00oo1.f21610OooOOo0;
        this.f21609OooOOo = o00oo1.f21609OooOOo;
        this.f21611OooOOoo = o00oo1.f21611OooOOoo;
        this.f21614OooOo00 = o00oo1.f21614OooOo00;
        this.f21613OooOo0 = o00oo1.f21613OooOo0;
        this.f21615OooOo0O = o00oo1.f21615OooOo0O;
        this.f21616OooOo0o = o00oo1.f21616OooOo0o;
        this.f21612OooOo = o00oo1.f21612OooOo;
        this.f21618OooOoO0 = o00oo1.f21618OooOoO0;
        this.f21617OooOoO = o00oo1.f21617OooOoO;
        this.f21619OooOoOO = o00oo1.f21619OooOoOO;
    }
}
