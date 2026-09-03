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
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.o0OO00O;
import p340o0OO0ooO.o0OOO0o;
import p340o0OO0ooO.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class o00O0O implements Cloneable {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static SSLSocketFactory f21139OooOooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f21140OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f21141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Proxy f21142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f21143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public List<Protocol> f21144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<OooOo00> f21145OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f21146OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ProxySelector f21147OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CookieHandler f21148OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO0OO f21149OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public p340o0OO0ooO.o00oO0o f21150OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public SocketFactory f21151OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public SSLSocketFactory f21152OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooOO0O f21153OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public HostnameVerifier f21154OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0 f21155OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f21156OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0OOO0o f21157OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOOOO f21158OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f21159OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f21160OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f21161OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f21162OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f21163OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final List<Protocol> f21138OooOoo0 = o000OOo.OooO0o(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final List<OooOo00> f21137OooOoo = o000OOo.OooO0o(OooOo00.f21103OooO0o0, OooOo00.f21102OooO0o, OooOo00.f21104OooO0oO);

    public static class OooO00o extends p340o0OO0ooO.oo000o {
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
        public final void OooO00o(o00O0O o00o0o2, OooOOO oooOOO, o0OO.OooOO0O oooOO0O, o00Oo0 o00oo1) throws RouteException {
            RouteException routeException;
            com.squareup.okhttp.OooO00o oooO00o;
            int i;
            boolean z;
            oooOOO.OooO0oO(oooOO0O);
            boolean z2 = oooOOO.f21085OooO0Oo;
            if (!z2) {
                o00oO0o o00oo0o2 = oooOOO.f21083OooO0O0;
                com.squareup.okhttp.OooO00o oooO00o2 = o00oo0o2.f21195OooO00o;
                List<OooOo00> list = oooO00o2.f21050OooOO0;
                int i2 = o00o0o2.f21162OooOoO0;
                int i3 = o00o0o2.f21161OooOoO;
                int i4 = o00o0o2.f21163OooOoOO;
                boolean z3 = o00o0o2.f21156OooOo;
                if (z2) {
                    throw new IllegalStateException("already connected");
                }
                p340o0OO0ooO.o0OoOo0 o0oooo1 = new p340o0OO0ooO.o0OoOo0(list);
                Proxy proxy = o00oo0o2.f21196OooO0O0;
                if (oooO00o2.f21047OooO0o0 == null && !list.contains(OooOo00.f21104OooO0oO)) {
                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list));
                }
                RouteException routeException2 = null;
                while (!oooOOO.f21085OooO0Oo) {
                    try {
                        oooOOO.f21084OooO0OO = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? oooO00o2.f21045OooO0Oo.createSocket() : new Socket(proxy);
                        oooO00o = oooO00o2;
                        i = 1;
                        routeException = routeException2;
                        try {
                            oooOOO.OooO0O0(i2, i3, i4, o00oo1, o0oooo1);
                            oooOOO.f21085OooO0Oo = true;
                            oooO00o2 = oooO00o;
                            routeException2 = routeException;
                        } catch (IOException e) {
                            e = e;
                            o000OOo.OooO0OO(oooOOO.f21084OooO0OO);
                            oooOOO.f21084OooO0OO = null;
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
                                IOException iOException = routeException3.f21119OooO0Oo;
                                Method method = RouteException.f21118OooO0o0;
                                if (method != null) {
                                    try {
                                        Object[] objArr = new Object[i];
                                        objArr[0] = iOException;
                                        method.invoke(e, objArr);
                                    } catch (IllegalAccessException | InvocationTargetException unused) {
                                    }
                                }
                                routeException3.f21119OooO0Oo = e;
                                routeException2 = routeException3;
                            }
                            if (!z3) {
                                throw routeException2;
                            }
                            o0oooo1.f42596OooO0Oo = i;
                            if (!(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!((z = e instanceof SSLHandshakeException)) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && ((z || (e instanceof SSLProtocolException)) && o0oooo1.f42595OooO0OO))) {
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
                    o00o0o2.f21158OooOo00.OooO00o(oooOOO);
                }
                oo0o0Oo oo0o0oo = o00o0o2.f21141OooO0Oo;
                o00oO0o o00oo0o3 = oooOOO.f21083OooO0O0;
                synchronized (oo0o0oo) {
                    oo0o0oo.f42600OooO00o.remove(o00oo0o3);
                }
            }
            int i5 = o00o0o2.f21161OooOoO;
            int i6 = o00o0o2.f21163OooOoOO;
            if (!oooOOO.f21085OooO0Oo) {
                throw new IllegalStateException("setTimeouts - not connected");
            }
            if (oooOOO.f21087OooO0o0 != null) {
                try {
                    oooOOO.f21084OooO0OO.setSoTimeout(i5);
                    oooOOO.f21087OooO0o0.OooO0Oo(i5, i6);
                } catch (IOException e3) {
                    throw new RouteException(e3);
                }
            }
        }

        public final void OooO0O0(OooOOOO oooOOOO, OooOOO oooOOO) {
            oooOOOO.getClass();
            if (!oooOOO.OooO0o0() && oooOOO.OooO00o()) {
                if (!oooOOO.OooO0Oo()) {
                    o000OOo.OooO0OO(oooOOO.f21084OooO0OO);
                    return;
                }
                try {
                    o0OO00O.f42574OooO00o.OooO0o(oooOOO.f21084OooO0OO);
                    synchronized (oooOOOO) {
                        LinkedList<OooOOO> linkedList = oooOOOO.f21097OooO0OO;
                        boolean zIsEmpty = linkedList.isEmpty();
                        linkedList.addFirst(oooOOO);
                        if (zIsEmpty) {
                            oooOOOO.f21098OooO0Oo.execute(oooOOOO.f21099OooO0o0);
                        } else {
                            oooOOOO.notifyAll();
                        }
                        oooOOO.f21090OooOO0++;
                        if (oooOOO.f21086OooO0o != null) {
                            throw new IllegalStateException("framedConnection != null");
                        }
                        oooOOO.f21089OooO0oo = System.nanoTime();
                    }
                } catch (SocketException e) {
                    o0OO00O.f42574OooO00o.getClass();
                    System.out.println("Unable to untagSocket(): " + e);
                    o000OOo.OooO0OO(oooOOO.f21084OooO0OO);
                }
            }
        }
    }

    static {
        p340o0OO0ooO.oo000o.f42599OooO0O0 = new OooO00o();
    }

    public o00O0O() {
        this.f21140OooO = new ArrayList();
        this.f21146OooOO0 = new ArrayList();
        this.f21159OooOo0O = true;
        this.f21160OooOo0o = true;
        this.f21156OooOo = true;
        this.f21162OooOoO0 = ResponseInfo.UnknownError;
        this.f21161OooOoO = ResponseInfo.UnknownError;
        this.f21163OooOoOO = ResponseInfo.UnknownError;
        this.f21141OooO0Oo = new oo0o0Oo();
        this.f21143OooO0o0 = new OooOo();
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o00O0O(this);
    }

    public o00O0O(o00O0O o00o0o2) {
        ArrayList arrayList = new ArrayList();
        this.f21140OooO = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f21146OooOO0 = arrayList2;
        this.f21159OooOo0O = true;
        this.f21160OooOo0o = true;
        this.f21156OooOo = true;
        this.f21162OooOoO0 = ResponseInfo.UnknownError;
        this.f21161OooOoO = ResponseInfo.UnknownError;
        this.f21163OooOoOO = ResponseInfo.UnknownError;
        this.f21141OooO0Oo = o00o0o2.f21141OooO0Oo;
        this.f21143OooO0o0 = o00o0o2.f21143OooO0o0;
        this.f21142OooO0o = o00o0o2.f21142OooO0o;
        this.f21144OooO0oO = o00o0o2.f21144OooO0oO;
        this.f21145OooO0oo = o00o0o2.f21145OooO0oo;
        arrayList.addAll(o00o0o2.f21140OooO);
        arrayList2.addAll(o00o0o2.f21146OooOO0);
        this.f21147OooOO0O = o00o0o2.f21147OooOO0O;
        this.f21148OooOO0o = o00o0o2.f21148OooOO0o;
        OooO0OO oooO0OO = o00o0o2.f21149OooOOO;
        this.f21149OooOOO = oooO0OO;
        this.f21150OooOOO0 = oooO0OO != null ? oooO0OO.f21052OooO00o : o00o0o2.f21150OooOOO0;
        this.f21151OooOOOO = o00o0o2.f21151OooOOOO;
        this.f21152OooOOOo = o00o0o2.f21152OooOOOo;
        this.f21154OooOOo0 = o00o0o2.f21154OooOOo0;
        this.f21153OooOOo = o00o0o2.f21153OooOOo;
        this.f21155OooOOoo = o00o0o2.f21155OooOOoo;
        this.f21158OooOo00 = o00o0o2.f21158OooOo00;
        this.f21157OooOo0 = o00o0o2.f21157OooOo0;
        this.f21159OooOo0O = o00o0o2.f21159OooOo0O;
        this.f21160OooOo0o = o00o0o2.f21160OooOo0o;
        this.f21156OooOo = o00o0o2.f21156OooOo;
        this.f21162OooOoO0 = o00o0o2.f21162OooOoO0;
        this.f21161OooOoO = o00o0o2.f21161OooOoO;
        this.f21163OooOoOO = o00o0o2.f21163OooOoOO;
    }
}
