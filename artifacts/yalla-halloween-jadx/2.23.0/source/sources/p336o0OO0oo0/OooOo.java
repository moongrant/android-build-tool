package p336o0OO0oo0;

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo f43307OooO00o;

    public static class OooO00o extends OooOo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOo00<Socket> f43308OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOo00<Socket> f43309OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f43310OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooOo00<Socket> f43311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f43312OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooOo00<Socket> f43313OooO0oO;

        public OooO00o(OooOo00<Socket> oooOo00, OooOo00<Socket> oooOo01, Method method, Method method2, OooOo00<Socket> oooOo02, OooOo00<Socket> oooOo03) {
            this.f43308OooO0O0 = oooOo00;
            this.f43309OooO0OO = oooOo01;
            this.f43310OooO0Oo = method;
            this.f43312OooO0o0 = method2;
            this.f43311OooO0o = oooOo02;
            this.f43313OooO0oO = oooOo03;
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO0O0(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f43308OooO0O0.OooO0OO(sSLSocket, Boolean.TRUE);
                this.f43309OooO0OO.OooO0OO(sSLSocket, str);
            }
            OooOo00<Socket> oooOo00 = this.f43313OooO0oO;
            if (oooOo00 != null) {
                if (oooOo00.OooO00o(sSLSocket.getClass()) != null) {
                    Object[] objArr = new Object[1];
                    o00000O o00000o = new o00000O();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Protocol protocol = list.get(i);
                        if (protocol != Protocol.HTTP_1_0) {
                            o00000o.o00O0O(protocol.toString().length());
                            o00000o.o00000O(protocol.toString());
                        }
                    }
                    objArr[0] = o00000o.o00Ooo();
                    try {
                        oooOo00.OooO0O0(sSLSocket, objArr);
                    } catch (InvocationTargetException e) {
                        Throwable targetException = e.getTargetException();
                        if (targetException instanceof RuntimeException) {
                            throw ((RuntimeException) targetException);
                        }
                        AssertionError assertionError = new AssertionError("Unexpected exception");
                        assertionError.initCause(targetException);
                        throw assertionError;
                    }
                }
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO0OO(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final String OooO0Oo(SSLSocket sSLSocket) {
            OooOo00<Socket> oooOo00 = this.f43311OooO0o;
            if (oooOo00 == null) {
                return null;
            }
            if (!(oooOo00.OooO00o(sSLSocket.getClass()) != null)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) oooOo00.OooO0O0(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, o000oOoO.f43330OooO0OO);
                }
                return null;
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
                AssertionError assertionError = new AssertionError("Unexpected exception");
                assertionError.initCause(targetException);
                throw assertionError;
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO0o(Socket socket) throws SocketException {
            Method method = this.f43312OooO0o0;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO0o0(Socket socket) throws SocketException {
            Method method = this.f43310OooO0Oo;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public static class OooO0O0 extends OooOo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f43314OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f43315OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f43316OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Class<?> f43317OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Class<?> f43318OooO0o0;

        public OooO0O0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f43314OooO0O0 = method;
            this.f43315OooO0OO = method2;
            this.f43316OooO0Oo = method3;
            this.f43318OooO0o0 = cls;
            this.f43317OooO0o = cls2;
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO00o(SSLSocket sSLSocket) {
            try {
                this.f43316OooO0Oo.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final void OooO0O0(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.f43314OooO0O0.invoke(null, sSLSocket, Proxy.newProxyInstance(OooOo.class.getClassLoader(), new Class[]{this.f43318OooO0o0, this.f43317OooO0o}, new OooO0OO(arrayList)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p336o0OO0oo0.OooOo
        public final String OooO0Oo(SSLSocket sSLSocket) {
            try {
                OooO0OO oooO0OO = (OooO0OO) Proxy.getInvocationHandler(this.f43315OooO0OO.invoke(null, sSLSocket));
                boolean z = oooO0OO.f43320OooO0O0;
                if (!z && oooO0OO.f43321OooO0OO == null) {
                    OooOO0O.f43303OooO00o.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return oooO0OO.f43321OooO0OO;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    public static class OooO0OO implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<String> f43319OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f43320OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f43321OooO0OO;

        public OooO0OO(ArrayList arrayList) {
            this.f43319OooO00o = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o000oOoO.f43329OooO0O0;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f43320OooO0O0 = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            List<String> list = this.f43319OooO00o;
            if (zEquals && objArr.length == 0) {
                return list;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        if (list.contains(list2.get(i))) {
                            String str = (String) list2.get(i);
                            this.f43321OooO0OO = str;
                            return str;
                        }
                    }
                    String str2 = list.get(0);
                    this.f43321OooO0OO = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f43321OooO0OO = (String) objArr[0];
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        OooOo oooOo;
        Method method;
        Method method2;
        Method method3;
        OooOo00 oooOo00;
        OooOo00 oooOo01;
        try {
            try {
                Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            OooOo00 oooOo02 = new OooOo00(null, "setUseSessionTickets", Boolean.TYPE);
            OooOo00 oooOo03 = new OooOo00(null, "setHostname", String.class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    Method method4 = cls.getMethod("untagSocket", Socket.class);
                    try {
                        Class.forName("android.net.Network");
                        OooOo00 oooOo04 = new OooOo00(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                        try {
                            oooOo01 = oooOo04;
                            oooOo00 = new OooOo00(null, "setAlpnProtocols", byte[].class);
                            method2 = method4;
                        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                            method2 = method4;
                            oooOo01 = oooOo04;
                            oooOo00 = 0;
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method2 = method4;
                        method3 = null;
                        oooOo00 = method3;
                        oooOo01 = method3;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method2 = null;
                    method3 = method2;
                    oooOo00 = method3;
                    oooOo01 = method3;
                    oooOo = new OooO00o(oooOo02, oooOo03, method, method2, oooOo01, oooOo00);
                    f43307OooO00o = oooOo;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                method = null;
                method2 = null;
            }
            oooOo = new OooO00o(oooOo02, oooOo03, method, method2, oooOo01, oooOo00);
        } catch (ClassNotFoundException unused6) {
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                oooOo = new OooO0O0(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                oooOo = new OooOo();
            }
        }
        f43307OooO00o = oooOo;
    }

    public void OooO00o(SSLSocket sSLSocket) {
    }

    public void OooO0O0(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void OooO0OO(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String OooO0Oo(SSLSocket sSLSocket) {
        return null;
    }

    public void OooO0o(Socket socket) throws SocketException {
    }

    public void OooO0o0(Socket socket) throws SocketException {
    }
}
