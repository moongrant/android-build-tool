package p663o0oooO0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o000O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0OO f51805OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OO.OooO00o f51806OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00OO f51807OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f51808OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f51809OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00Oo00 f51810OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f51811OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0OO f51812OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o000O f51813OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p660o0ooo0o0.oo0o0O0 f51814OooOO0;

    public oo0o0O0(@NotNull o00OO0OO connectionPool, @NotNull o000O address, @NotNull o00O0OO call, @NotNull p660o0ooo0o0.oo0o0O0 eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f51812OooO0oO = connectionPool;
        this.f51813OooO0oo = address;
        this.f51805OooO = call;
        this.f51814OooOO0 = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x024a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x0265  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00Oo00>] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList, java.util.List<o0ooo0o0.o00Oo00>] */
    public final o00OO00O OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        o00Oo00 o00oo00OooO0O0;
        o00OO.OooO00o oooO00o;
        o00OO o00oo2;
        ArrayList arrayList;
        o00OO.OooO00o oooO00o2;
        List<o00Oo00> list;
        Proxy proxy;
        String hostName;
        int port;
        boolean zContains;
        o00OO00O connection;
        oo0O oo0o;
        o00Oo00 route;
        Socket socketOooOO0O;
        while (!this.f51805OooO.f51737OoooOo0) {
            o00OO00O o00oo00o = this.f51805OooO.f51733OoooO0O;
            if (o00oo00o != null) {
                synchronized (o00oo00o) {
                    socketOooOO0O = (o00oo00o.f51779OooO || !OooO0O0(o00oo00o.f51794OooOOo0.f51473OooO00o.f51218OooO00o)) ? this.f51805OooO.OooOO0O() : null;
                    Unit unit = Unit.INSTANCE;
                }
                if (this.f51805OooO.f51733OoooO0O != null) {
                    if (!(socketOooOO0O == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketOooOO0O != null) {
                        o00OOO00.OooO0o0(socketOooOO0O);
                    }
                    this.f51814OooOO0.connectionReleased(this.f51805OooO, o00oo00o);
                    this.f51808OooO0OO = 0;
                    this.f51809OooO0Oo = 0;
                    this.f51811OooO0o0 = 0;
                    if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, null, false)) {
                        o00oo00o = this.f51805OooO.f51733OoooO0O;
                        Intrinsics.checkNotNull(o00oo00o);
                        this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o);
                    } else {
                        o00oo00OooO0O0 = this.f51810OooO0o;
                        try {
                            if (o00oo00OooO0O0 != null) {
                                Intrinsics.checkNotNull(o00oo00OooO0O0);
                                this.f51810OooO0o = null;
                            } else {
                                oooO00o = this.f51806OooO00o;
                                if (oooO00o != null) {
                                    Intrinsics.checkNotNull(oooO00o);
                                    if (oooO00o.OooO00o()) {
                                        o00OO.OooO00o oooO00o3 = this.f51806OooO00o;
                                        Intrinsics.checkNotNull(oooO00o3);
                                        o00oo00OooO0O0 = oooO00o3.OooO0O0();
                                    }
                                }
                                o00oo2 = this.f51807OooO0O0;
                                if (o00oo2 == null) {
                                    o000O o000o = this.f51813OooO0oo;
                                    o00O0OO o00o0oo2 = this.f51805OooO;
                                    o00oo2 = new o00OO(o000o, o00o0oo2.f51740Ooooo00.f51346o00o0O, o00o0oo2, this.f51814OooOO0);
                                    this.f51807OooO0O0 = o00oo2;
                                }
                                if (o00oo2.OooO00o()) {
                                    throw new NoSuchElementException();
                                }
                                arrayList = new ArrayList();
                                while (o00oo2.OooO0O0()) {
                                    if (o00oo2.OooO0O0()) {
                                        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("No route to ");
                                        sbOooO0o0.append(o00oo2.f51771OooO0o0.f51218OooO00o.f51387OooO0o0);
                                        sbOooO0o0.append("; exhausted proxy configurations: ");
                                        sbOooO0o0.append(o00oo2.f51766OooO00o);
                                        throw new SocketException(sbOooO0o0.toString());
                                    }
                                    List<? extends Proxy> list2 = o00oo2.f51766OooO00o;
                                    int i5 = o00oo2.f51767OooO0O0;
                                    o00oo2.f51767OooO0O0 = i5 + 1;
                                    proxy = list2.get(i5);
                                    ArrayList arrayList2 = new ArrayList();
                                    o00oo2.f51768OooO0OO = arrayList2;
                                    if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                        o00OO000 o00oo001 = o00oo2.f51771OooO0o0.f51218OooO00o;
                                        hostName = o00oo001.f51387OooO0o0;
                                        port = o00oo001.f51386OooO0o;
                                    } else {
                                        SocketAddress socketAddressAddress = proxy.address();
                                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Proxy.address() is not an InetSocketAddress: ");
                                            sbOooO0o1.append(socketAddressAddress.getClass());
                                            throw new IllegalArgumentException(sbOooO0o1.toString().toString());
                                        }
                                        InetSocketAddress socketHost = (InetSocketAddress) socketAddressAddress;
                                        Intrinsics.checkNotNullParameter(socketHost, "$this$socketHost");
                                        InetAddress address = socketHost.getAddress();
                                        if (address != null) {
                                            hostName = address.getHostAddress();
                                            Intrinsics.checkNotNullExpressionValue(hostName, "address.hostAddress");
                                        } else {
                                            hostName = socketHost.getHostName();
                                            Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                                        }
                                        port = socketHost.getPort();
                                    }
                                    if (1 <= port || 65535 < port) {
                                        throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                    }
                                    if (proxy.type() == Proxy.Type.SOCKS) {
                                        arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                    } else {
                                        o00oo2.f51773OooO0oo.dnsStart(o00oo2.f51772OooO0oO, hostName);
                                        List<InetAddress> listLookup = o00oo2.f51771OooO0o0.f51221OooO0Oo.lookup(hostName);
                                        if (listLookup.isEmpty()) {
                                            throw new UnknownHostException(o00oo2.f51771OooO0o0.f51221OooO0Oo + " returned no addresses for " + hostName);
                                        }
                                        o00oo2.f51773OooO0oo.dnsEnd(o00oo2.f51772OooO0oO, hostName, listLookup);
                                        Iterator<InetAddress> it = listLookup.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(new InetSocketAddress(it.next(), port));
                                        }
                                    }
                                    Iterator<? extends InetSocketAddress> it2 = o00oo2.f51768OooO0OO.iterator();
                                    while (it2.hasNext()) {
                                        o00Oo00 route2 = new o00Oo00(o00oo2.f51771OooO0o0, proxy, it2.next());
                                        oo0O oo0o2 = o00oo2.f51770OooO0o;
                                        synchronized (oo0o2) {
                                            Intrinsics.checkNotNullParameter(route2, "route");
                                            zContains = oo0o2.f51804OooO00o.contains(route2);
                                        }
                                        if (zContains) {
                                            o00oo2.f51769OooO0Oo.add(route2);
                                        } else {
                                            arrayList.add(route2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        break;
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    CollectionsKt.addAll(arrayList, o00oo2.f51769OooO0Oo);
                                    o00oo2.f51769OooO0Oo.clear();
                                }
                                oooO00o2 = new o00OO.OooO00o(arrayList);
                                this.f51806OooO00o = oooO00o2;
                                list = oooO00o2.f51775OooO0O0;
                                if (!this.f51805OooO.f51737OoooOo0) {
                                    throw new IOException("Canceled");
                                }
                                if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, false)) {
                                    o00oo00o = this.f51805OooO.f51733OoooO0O;
                                    Intrinsics.checkNotNull(o00oo00o);
                                    this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o);
                                } else {
                                    o00oo00OooO0O0 = oooO00o2.OooO0O0();
                                    connection = new o00OO00O(this.f51812OooO0oO, o00oo00OooO0O0);
                                    this.f51805OooO.f51739OoooOoo = connection;
                                    connection.OooO0Oo(i, i2, i3, i4, z, this.f51805OooO, this.f51814OooOO0);
                                    this.f51805OooO.f51739OoooOoo = null;
                                    oo0o = this.f51805OooO.f51740Ooooo00.f51346o00o0O;
                                    route = connection.f51794OooOOo0;
                                    synchronized (oo0o) {
                                        Intrinsics.checkNotNullParameter(route, "route");
                                        oo0o.f51804OooO00o.remove(route);
                                    }
                                    if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, true)) {
                                        o00OO00O o00oo00o2 = this.f51805OooO.f51733OoooO0O;
                                        Intrinsics.checkNotNull(o00oo00o2);
                                        this.f51810OooO0o = o00oo00OooO0O0;
                                        Socket socket = connection.f51781OooO0OO;
                                        Intrinsics.checkNotNull(socket);
                                        o00OOO00.OooO0o0(socket);
                                        this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o2);
                                        o00oo00o = o00oo00o2;
                                    } else {
                                        synchronized (connection) {
                                            o00OO0OO o00oo0oo = this.f51812OooO0oO;
                                            Objects.requireNonNull(o00oo0oo);
                                            Intrinsics.checkNotNullParameter(connection, "connection");
                                            byte[] bArr = o00OOO00.f51183OooO00o;
                                            o00oo0oo.f51799OooO0Oo.add(connection);
                                            o00oo0oo.f51797OooO0O0.OooO0OO(o00oo0oo.f51798OooO0OO, 0L);
                                            this.f51805OooO.OooO0Oo(connection);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        this.f51814OooOO0.connectionAcquired(this.f51805OooO, connection);
                                    }
                                }
                            }
                            connection.OooO0Oo(i, i2, i3, i4, z, this.f51805OooO, this.f51814OooOO0);
                            this.f51805OooO.f51739OoooOoo = null;
                            oo0o = this.f51805OooO.f51740Ooooo00.f51346o00o0O;
                            route = connection.f51794OooOOo0;
                            synchronized (oo0o) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                oo0o.f51804OooO00o.remove(route);
                                if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, true)) {
                                    o00OO00O o00oo00o3 = this.f51805OooO.f51733OoooO0O;
                                    Intrinsics.checkNotNull(o00oo00o3);
                                    this.f51810OooO0o = o00oo00OooO0O0;
                                    Socket socket2 = connection.f51781OooO0OO;
                                    Intrinsics.checkNotNull(socket2);
                                    o00OOO00.OooO0o0(socket2);
                                    this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o3);
                                    o00oo00o = o00oo00o3;
                                } else {
                                    synchronized (connection) {
                                        o00OO0OO o00oo0oo2 = this.f51812OooO0oO;
                                        Objects.requireNonNull(o00oo0oo2);
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr2 = o00OOO00.f51183OooO00o;
                                        o00oo0oo2.f51799OooO0Oo.add(connection);
                                        o00oo0oo2.f51797OooO0O0.OooO0OO(o00oo0oo2.f51798OooO0OO, 0L);
                                        this.f51805OooO.OooO0Oo(connection);
                                        Unit unit3 = Unit.INSTANCE;
                                        this.f51814OooOO0.connectionAcquired(this.f51805OooO, connection);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.f51805OooO.f51739OoooOoo = null;
                            throw th;
                        }
                        list = null;
                        connection = new o00OO00O(this.f51812OooO0oO, o00oo00OooO0O0);
                        this.f51805OooO.f51739OoooOoo = connection;
                    }
                }
                connection = o00oo00o;
            } else {
                this.f51808OooO0OO = 0;
                this.f51809OooO0Oo = 0;
                this.f51811OooO0o0 = 0;
                if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, null, false)) {
                    o00oo00o = this.f51805OooO.f51733OoooO0O;
                    Intrinsics.checkNotNull(o00oo00o);
                    this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o);
                } else {
                    o00oo00OooO0O0 = this.f51810OooO0o;
                    if (o00oo00OooO0O0 != null) {
                        Intrinsics.checkNotNull(o00oo00OooO0O0);
                        this.f51810OooO0o = null;
                    } else {
                        oooO00o = this.f51806OooO00o;
                        if (oooO00o != null) {
                            Intrinsics.checkNotNull(oooO00o);
                            if (oooO00o.OooO00o()) {
                                o00OO.OooO00o oooO00o4 = this.f51806OooO00o;
                                Intrinsics.checkNotNull(oooO00o4);
                                o00oo00OooO0O0 = oooO00o4.OooO0O0();
                            }
                        }
                        o00oo2 = this.f51807OooO0O0;
                        if (o00oo2 == null) {
                            o000O o000o2 = this.f51813OooO0oo;
                            o00O0OO o00o0oo3 = this.f51805OooO;
                            o00oo2 = new o00OO(o000o2, o00o0oo3.f51740Ooooo00.f51346o00o0O, o00o0oo3, this.f51814OooOO0);
                            this.f51807OooO0O0 = o00oo2;
                        }
                        if (o00oo2.OooO00o()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (o00oo2.OooO0O0()) {
                            if (o00oo2.OooO0O0()) {
                                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("No route to ");
                                sbOooO0o2.append(o00oo2.f51771OooO0o0.f51218OooO00o.f51387OooO0o0);
                                sbOooO0o2.append("; exhausted proxy configurations: ");
                                sbOooO0o2.append(o00oo2.f51766OooO00o);
                                throw new SocketException(sbOooO0o2.toString());
                            }
                            List<? extends Proxy> list3 = o00oo2.f51766OooO00o;
                            int i6 = o00oo2.f51767OooO0O0;
                            o00oo2.f51767OooO0O0 = i6 + 1;
                            proxy = list3.get(i6);
                            ArrayList arrayList3 = new ArrayList();
                            o00oo2.f51768OooO0OO = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                o00OO000 o00oo002 = o00oo2.f51771OooO0o0.f51218OooO00o;
                                hostName = o00oo002.f51387OooO0o0;
                                port = o00oo002.f51386OooO0o;
                            } else {
                                o00OO000 o00oo003 = o00oo2.f51771OooO0o0.f51218OooO00o;
                                hostName = o00oo003.f51387OooO0o0;
                                port = o00oo003.f51386OooO0o;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            CollectionsKt.addAll(arrayList, o00oo2.f51769OooO0Oo);
                            o00oo2.f51769OooO0Oo.clear();
                        }
                        oooO00o2 = new o00OO.OooO00o(arrayList);
                        this.f51806OooO00o = oooO00o2;
                        list = oooO00o2.f51775OooO0O0;
                        if (!this.f51805OooO.f51737OoooOo0) {
                            throw new IOException("Canceled");
                        }
                        if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, false)) {
                            o00oo00o = this.f51805OooO.f51733OoooO0O;
                            Intrinsics.checkNotNull(o00oo00o);
                            this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o);
                        } else {
                            o00oo00OooO0O0 = oooO00o2.OooO0O0();
                            connection = new o00OO00O(this.f51812OooO0oO, o00oo00OooO0O0);
                            this.f51805OooO.f51739OoooOoo = connection;
                            connection.OooO0Oo(i, i2, i3, i4, z, this.f51805OooO, this.f51814OooOO0);
                            this.f51805OooO.f51739OoooOoo = null;
                            oo0o = this.f51805OooO.f51740Ooooo00.f51346o00o0O;
                            route = connection.f51794OooOOo0;
                            synchronized (oo0o) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                oo0o.f51804OooO00o.remove(route);
                                if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, true)) {
                                    o00OO00O o00oo00o4 = this.f51805OooO.f51733OoooO0O;
                                    Intrinsics.checkNotNull(o00oo00o4);
                                    this.f51810OooO0o = o00oo00OooO0O0;
                                    Socket socket3 = connection.f51781OooO0OO;
                                    Intrinsics.checkNotNull(socket3);
                                    o00OOO00.OooO0o0(socket3);
                                    this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o4);
                                    o00oo00o = o00oo00o4;
                                } else {
                                    synchronized (connection) {
                                        o00OO0OO o00oo0oo3 = this.f51812OooO0oO;
                                        Objects.requireNonNull(o00oo0oo3);
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr3 = o00OOO00.f51183OooO00o;
                                        o00oo0oo3.f51799OooO0Oo.add(connection);
                                        o00oo0oo3.f51797OooO0O0.OooO0OO(o00oo0oo3.f51798OooO0OO, 0L);
                                        this.f51805OooO.OooO0Oo(connection);
                                        Unit unit4 = Unit.INSTANCE;
                                        this.f51814OooOO0.connectionAcquired(this.f51805OooO, connection);
                                    }
                                }
                            }
                        }
                    }
                    list = null;
                    connection = new o00OO00O(this.f51812OooO0oO, o00oo00OooO0O0);
                    this.f51805OooO.f51739OoooOoo = connection;
                    connection.OooO0Oo(i, i2, i3, i4, z, this.f51805OooO, this.f51814OooOO0);
                    this.f51805OooO.f51739OoooOoo = null;
                    oo0o = this.f51805OooO.f51740Ooooo00.f51346o00o0O;
                    route = connection.f51794OooOOo0;
                    synchronized (oo0o) {
                        Intrinsics.checkNotNullParameter(route, "route");
                        oo0o.f51804OooO00o.remove(route);
                        if (this.f51812OooO0oO.OooO00o(this.f51813OooO0oo, this.f51805OooO, list, true)) {
                            o00OO00O o00oo00o5 = this.f51805OooO.f51733OoooO0O;
                            Intrinsics.checkNotNull(o00oo00o5);
                            this.f51810OooO0o = o00oo00OooO0O0;
                            Socket socket4 = connection.f51781OooO0OO;
                            Intrinsics.checkNotNull(socket4);
                            o00OOO00.OooO0o0(socket4);
                            this.f51814OooOO0.connectionAcquired(this.f51805OooO, o00oo00o5);
                            o00oo00o = o00oo00o5;
                        } else {
                            synchronized (connection) {
                                o00OO0OO o00oo0oo4 = this.f51812OooO0oO;
                                Objects.requireNonNull(o00oo0oo4);
                                Intrinsics.checkNotNullParameter(connection, "connection");
                                byte[] bArr4 = o00OOO00.f51183OooO00o;
                                o00oo0oo4.f51799OooO0Oo.add(connection);
                                o00oo0oo4.f51797OooO0O0.OooO0OO(o00oo0oo4.f51798OooO0OO, 0L);
                                this.f51805OooO.OooO0Oo(connection);
                                Unit unit5 = Unit.INSTANCE;
                                this.f51814OooOO0.connectionAcquired(this.f51805OooO, connection);
                            }
                        }
                    }
                }
                connection = o00oo00o;
            }
            if (connection.OooOO0(z2)) {
                return connection;
            }
            connection.OooOOO0();
            if (this.f51810OooO0o == null) {
                o00OO.OooO00o oooO00o5 = this.f51806OooO00o;
                if (oooO00o5 != null ? oooO00o5.OooO00o() : true) {
                    continue;
                } else {
                    o00OO o00oo3 = this.f51807OooO0O0;
                    if (!(o00oo3 != null ? o00oo3.OooO00o() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean OooO0O0(@NotNull o00OO000 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        o00OO000 o00oo001 = this.f51813OooO0oo.f51218OooO00o;
        return url.f51386OooO0o == o00oo001.f51386OooO0o && Intrinsics.areEqual(url.f51387OooO0o0, o00oo001.f51387OooO0o0);
    }

    public final void OooO0OO(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f51810OooO0o = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).f53034Oooo0o == ErrorCode.REFUSED_STREAM) {
            this.f51808OooO0OO++;
        } else if (e instanceof ConnectionShutdownException) {
            this.f51809OooO0Oo++;
        } else {
            this.f51811OooO0o0++;
        }
    }
}
