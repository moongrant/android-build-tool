package p340o0OO0ooO;

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
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OO00O f42574OooO00o;

    public static class OooO00o extends o0OO00O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0Oo0oo<Socket> f42575OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0Oo0oo<Socket> f42576OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f42577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o0Oo0oo<Socket> f42578OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f42579OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0Oo0oo<Socket> f42580OooO0oO;

        public OooO00o(o0Oo0oo<Socket> o0oo0oo2, o0Oo0oo<Socket> o0oo0oo3, Method method, Method method2, o0Oo0oo<Socket> o0oo0oo4, o0Oo0oo<Socket> o0oo0oo5) {
            this.f42575OooO0O0 = o0oo0oo2;
            this.f42576OooO0OO = o0oo0oo3;
            this.f42577OooO0Oo = method;
            this.f42579OooO0o0 = method2;
            this.f42578OooO0o = o0oo0oo4;
            this.f42580OooO0oO = o0oo0oo5;
        }

        @Override // p340o0OO0ooO.o0OO00O
        public final void OooO0O0(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f42575OooO0O0.OooO0OO(sSLSocket, Boolean.TRUE);
                this.f42576OooO0OO.OooO0OO(sSLSocket, str);
            }
            o0Oo0oo<Socket> o0oo0oo2 = this.f42580OooO0oO;
            if (o0oo0oo2 != null) {
                if (o0oo0oo2.OooO00o(sSLSocket.getClass()) != null) {
                    Object[] objArr = new Object[1];
                    oo0OOoo oo0oooo = new oo0OOoo();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Protocol protocol = list.get(i);
                        if (protocol != Protocol.HTTP_1_0) {
                            oo0oooo.o00o0O(protocol.toString().length());
                            oo0oooo.o00000OO(protocol.toString());
                        }
                    }
                    objArr[0] = oo0oooo.o00ooo();
                    try {
                        o0oo0oo2.OooO0O0(sSLSocket, objArr);
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

        @Override // p340o0OO0ooO.o0OO00O
        public final void OooO0OO(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        @Override // p340o0OO0ooO.o0OO00O
        public final String OooO0Oo(SSLSocket sSLSocket) {
            o0Oo0oo<Socket> o0oo0oo2 = this.f42578OooO0o;
            if (o0oo0oo2 == null) {
                return null;
            }
            if (!(o0oo0oo2.OooO00o(sSLSocket.getClass()) != null)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) o0oo0oo2.OooO0O0(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, o000OOo.f42531OooO0OO);
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

        @Override // p340o0OO0ooO.o0OO00O
        public final void OooO0o(Socket socket) throws SocketException {
            Method method = this.f42579OooO0o0;
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

        @Override // p340o0OO0ooO.o0OO00O
        public final void OooO0o0(Socket socket) throws SocketException {
            Method method = this.f42577OooO0Oo;
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

    public static class OooO0O0 extends o0OO00O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f42581OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f42582OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f42583OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Class<?> f42584OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Class<?> f42585OooO0o0;

        public OooO0O0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f42581OooO0O0 = method;
            this.f42582OooO0OO = method2;
            this.f42583OooO0Oo = method3;
            this.f42585OooO0o0 = cls;
            this.f42584OooO0o = cls2;
        }

        @Override // p340o0OO0ooO.o0OO00O
        public final void OooO00o(SSLSocket sSLSocket) {
            try {
                this.f42583OooO0Oo.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // p340o0OO0ooO.o0OO00O
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
                this.f42581OooO0O0.invoke(null, sSLSocket, Proxy.newProxyInstance(o0OO00O.class.getClassLoader(), new Class[]{this.f42585OooO0o0, this.f42584OooO0o}, new OooO0OO(arrayList)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p340o0OO0ooO.o0OO00O
        public final String OooO0Oo(SSLSocket sSLSocket) {
            try {
                OooO0OO oooO0OO = (OooO0OO) Proxy.getInvocationHandler(this.f42582OooO0OO.invoke(null, sSLSocket));
                boolean z = oooO0OO.f42587OooO0O0;
                if (!z && oooO0OO.f42588OooO0OO == null) {
                    oo000o.f42598OooO00o.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return oooO0OO.f42588OooO0OO;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    public static class OooO0OO implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<String> f42586OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f42587OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f42588OooO0OO;

        public OooO0OO(ArrayList arrayList) {
            this.f42586OooO00o = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o000OOo.f42530OooO0O0;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f42587OooO0O0 = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            List<String> list = this.f42586OooO00o;
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
                            this.f42588OooO0OO = str;
                            return str;
                        }
                    }
                    String str2 = list.get(0);
                    this.f42588OooO0OO = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f42588OooO0OO = (String) objArr[0];
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0OO00O o0oo00o2;
        Method method;
        Method method2;
        Method method3;
        o0Oo0oo o0oo0oo2;
        o0Oo0oo o0oo0oo3;
        try {
            try {
                Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            o0Oo0oo o0oo0oo4 = new o0Oo0oo(null, "setUseSessionTickets", Boolean.TYPE);
            o0Oo0oo o0oo0oo5 = new o0Oo0oo(null, "setHostname", String.class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    Method method4 = cls.getMethod("untagSocket", Socket.class);
                    try {
                        Class.forName("android.net.Network");
                        o0Oo0oo o0oo0oo6 = new o0Oo0oo(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                        try {
                            o0oo0oo3 = o0oo0oo6;
                            o0oo0oo2 = new o0Oo0oo(null, "setAlpnProtocols", byte[].class);
                            method2 = method4;
                        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                            method2 = method4;
                            o0oo0oo3 = o0oo0oo6;
                            o0oo0oo2 = 0;
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method2 = method4;
                        method3 = null;
                        o0oo0oo2 = method3;
                        o0oo0oo3 = method3;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method2 = null;
                    method3 = method2;
                    o0oo0oo2 = method3;
                    o0oo0oo3 = method3;
                    o0oo00o2 = new OooO00o(o0oo0oo4, o0oo0oo5, method, method2, o0oo0oo3, o0oo0oo2);
                    f42574OooO00o = o0oo00o2;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                method = null;
                method2 = null;
            }
            o0oo00o2 = new OooO00o(o0oo0oo4, o0oo0oo5, method, method2, o0oo0oo3, o0oo0oo2);
        } catch (ClassNotFoundException unused6) {
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                o0oo00o2 = new OooO0O0(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                o0oo00o2 = new o0OO00O();
            }
        }
        f42574OooO00o = o0oo00o2;
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
