package p413o0Oo0o0O;

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
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0O00 f39356OooO00o;

    public static class OooO00o extends o0O0O00 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oo0o0Oo<Socket> f39357OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo0o0Oo<Socket> f39358OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f39359OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0o0Oo<Socket> f39360OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f39361OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final oo0o0Oo<Socket> f39362OooO0oO;

        public OooO00o(oo0o0Oo<Socket> oo0o0oo, oo0o0Oo<Socket> oo0o0oo2, Method method, Method method2, oo0o0Oo<Socket> oo0o0oo3, oo0o0Oo<Socket> oo0o0oo4) {
            this.f39357OooO0O0 = oo0o0oo;
            this.f39358OooO0OO = oo0o0oo2;
            this.f39359OooO0Oo = method;
            this.f39361OooO0o0 = method2;
            this.f39360OooO0o = oo0o0oo3;
            this.f39362OooO0oO = oo0o0oo4;
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final void OooO0O0(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f39357OooO0O0.OooO0OO(sSLSocket, Boolean.TRUE);
                this.f39358OooO0OO.OooO0OO(sSLSocket, str);
            }
            oo0o0Oo<Socket> oo0o0oo = this.f39362OooO0oO;
            if (oo0o0oo != null) {
                if (oo0o0oo.OooO00o(sSLSocket.getClass()) != null) {
                    Object[] objArr = new Object[1];
                    o0oOO o0ooo2 = new o0oOO();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Protocol protocol = list.get(i);
                        if (protocol != Protocol.HTTP_1_0) {
                            o0ooo2.Ooooo0o(protocol.toString().length());
                            o0ooo2.o00oO0o(protocol.toString());
                        }
                    }
                    objArr[0] = o0ooo2.OooOoo0();
                    this.f39362OooO0oO.OooO0Oo(sSLSocket, objArr);
                }
            }
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final void OooO0OO(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final String OooO0Oo(SSLSocket sSLSocket) {
            byte[] bArr;
            oo0o0Oo<Socket> oo0o0oo = this.f39360OooO0o;
            if (oo0o0oo == null) {
                return null;
            }
            if ((oo0o0oo.OooO00o(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f39360OooO0o.OooO0Oo(sSLSocket, new Object[0])) != null) {
                return new String(bArr, o000000.f39348OooO0OO);
            }
            return null;
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final void OooO0o(Socket socket) throws SocketException {
            Method method = this.f39359OooO0Oo;
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

        @Override // p413o0Oo0o0O.o0O0O00
        public final void OooO0oO(Socket socket) throws SocketException {
            Method method = this.f39361OooO0o0;
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

    public static class OooO0O0 extends o0O0O00 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f39363OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f39364OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f39365OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Class<?> f39366OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Class<?> f39367OooO0o0;

        public OooO0O0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f39363OooO0O0 = method;
            this.f39364OooO0OO = method2;
            this.f39365OooO0Oo = method3;
            this.f39367OooO0o0 = cls;
            this.f39366OooO0o = cls2;
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final void OooO00o(SSLSocket sSLSocket) {
            try {
                this.f39365OooO0Oo.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // p413o0Oo0o0O.o0O0O00
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
                this.f39363OooO0O0.invoke(null, sSLSocket, Proxy.newProxyInstance(o0O0O00.class.getClassLoader(), new Class[]{this.f39367OooO0o0, this.f39366OooO0o}, new OooO0OO(arrayList)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p413o0Oo0o0O.o0O0O00
        public final String OooO0Oo(SSLSocket sSLSocket) {
            try {
                OooO0OO oooO0OO = (OooO0OO) Proxy.getInvocationHandler(this.f39364OooO0OO.invoke(null, sSLSocket));
                boolean z = oooO0OO.f39369OooO0O0;
                if (!z && oooO0OO.f39370OooO0OO == null) {
                    o0ooOOo.f39373OooO00o.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return oooO0OO.f39370OooO0OO;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    public static class OooO0OO implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<String> f39368OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f39369OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f39370OooO0OO;

        public OooO0OO(List<String> list) {
            this.f39368OooO00o = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o000000.f39347OooO0O0;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f39369OooO0O0 = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f39368OooO00o;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f39370OooO0OO = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (this.f39368OooO00o.contains(list.get(i))) {
                    String str = (String) list.get(i);
                    this.f39370OooO0OO = str;
                    return str;
                }
            }
            String str2 = this.f39368OooO00o.get(0);
            this.f39370OooO0OO = str2;
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0O0O00 o0o0o00;
        Method method;
        Method method2;
        Method method3;
        oo0o0Oo oo0o0oo;
        oo0o0Oo oo0o0oo2;
        oo0o0Oo oo0o0oo3;
        try {
            try {
                Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    o0o0o00 = new OooO0O0(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    o0o0o00 = new o0O0O00();
                }
            }
        } catch (ClassNotFoundException unused3) {
            Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
        }
        oo0o0Oo oo0o0oo4 = new oo0o0Oo(null, "setUseSessionTickets", Boolean.TYPE);
        oo0o0Oo oo0o0oo5 = new oo0o0Oo(null, "setHostname", String.class);
        try {
            Class<?> cls2 = Class.forName("android.net.TrafficStats");
            method = cls2.getMethod("tagSocket", Socket.class);
            try {
                Method method4 = cls2.getMethod("untagSocket", Socket.class);
                try {
                    Class.forName("android.net.Network");
                    oo0o0Oo oo0o0oo6 = new oo0o0Oo(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        oo0o0oo3 = new oo0o0Oo(null, "setAlpnProtocols", byte[].class);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        oo0o0oo3 = null;
                    }
                    oo0o0oo2 = oo0o0oo6;
                    method2 = method4;
                    oo0o0oo = oo0o0oo3;
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    method2 = method4;
                    method3 = null;
                    oo0o0oo = method3;
                    oo0o0oo2 = method3;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                method2 = null;
                method3 = method2;
                oo0o0oo = method3;
                oo0o0oo2 = method3;
                o0o0o00 = new OooO00o(oo0o0oo4, oo0o0oo5, method, method2, oo0o0oo2, oo0o0oo);
                f39356OooO00o = o0o0o00;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused7) {
            method = null;
            method2 = null;
        }
        o0o0o00 = new OooO00o(oo0o0oo4, oo0o0oo5, method, method2, oo0o0oo2, oo0o0oo);
        f39356OooO00o = o0o0o00;
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

    public final void OooO0o0(String str) {
        System.out.println(str);
    }

    public void OooO0oO(Socket socket) throws SocketException {
    }
}
