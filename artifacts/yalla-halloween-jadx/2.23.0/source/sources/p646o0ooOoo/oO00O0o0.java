package p646o0ooOoo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O00;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o0O00000;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00 f59640OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oO0O0OoO f59641OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f59642OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f59644OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<? extends Proxy> f59645OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<? extends InetSocketAddress> f59646OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59647OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<o0O00000> f59648OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f59649OooO0O0;

        public OooO00o(@NotNull ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f59648OooO00o = routes;
        }

        public final boolean OooO00o() {
            return this.f59649OooO0O0 < this.f59648OooO00o.size();
        }
    }

    public oO00O0o0(@NotNull o00O00 address, @NotNull oO0O0OoO routeDatabase, @NotNull oO0Oo0oo call, @NotNull o00OO00O eventListener) {
        List<Proxy> listOooOo;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f59640OooO00o = address;
        this.f59641OooO0O0 = routeDatabase;
        this.f59642OooO0OO = call;
        this.f59643OooO0Oo = eventListener;
        this.f59645OooO0o0 = CollectionsKt.emptyList();
        this.f59646OooO0oO = CollectionsKt.emptyList();
        this.f59647OooO0oo = new ArrayList();
        o00OO o00oo2 = address.f57144OooO;
        eventListener.proxySelectStart(call, o00oo2);
        Proxy proxy = address.f57151OooO0oO;
        if (proxy != null) {
            listOooOo = CollectionsKt.listOf(proxy);
        } else {
            URI uriOooOO0O = o00oo2.OooOO0O();
            if (uriOooOO0O.getHost() == null) {
                listOooOo = o0O000o0.OooOO0o(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f57152OooO0oo.select(uriOooOO0O);
                if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                    listOooOo = o0O000o0.OooOO0o(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    listOooOo = o0O000o0.OooOo(proxiesOrNull);
                }
            }
        }
        this.f59645OooO0o0 = listOooOo;
        this.f59644OooO0o = 0;
        eventListener.proxySelectEnd(call, o00oo2, listOooOo);
    }

    public final boolean OooO00o() {
        return (this.f59644OooO0o < this.f59645OooO0o0.size()) || (this.f59647OooO0oo.isEmpty() ^ true);
    }

    @NotNull
    public final OooO00o OooO0O0() throws IOException {
        String hostName;
        int port;
        boolean zContains;
        if (!OooO00o()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        do {
            boolean z = false;
            if (!(this.f59644OooO0o < this.f59645OooO0o0.size())) {
                break;
            }
            boolean z2 = this.f59644OooO0o < this.f59645OooO0o0.size();
            o00O00 o00o01 = this.f59640OooO00o;
            if (!z2) {
                throw new SocketException("No route to " + o00o01.f57144OooO.f57206OooO0Oo + "; exhausted proxy configurations: " + this.f59645OooO0o0);
            }
            List<? extends Proxy> list = this.f59645OooO0o0;
            int i = this.f59644OooO0o;
            this.f59644OooO0o = i + 1;
            Proxy proxy = list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.f59646OooO0oO = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                o00OO o00oo2 = o00o01.f57144OooO;
                hostName = o00oo2.f57206OooO0Oo;
                port = o00oo2.f57208OooO0o0;
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
                }
                Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                } else {
                    hostName = address.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostName, "address.hostAddress");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 <= port && port < 65536) {
                z = true;
            }
            if (!z) {
                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                o00OO00O o00oo00o = this.f59643OooO0Oo;
                o00O00o0 o00o00o1 = this.f59642OooO0OO;
                o00oo00o.dnsStart(o00o00o1, hostName);
                List<InetAddress> listLookup = o00o01.f57145OooO00o.lookup(hostName);
                if (listLookup.isEmpty()) {
                    throw new UnknownHostException(o00o01.f57145OooO00o + " returned no addresses for " + hostName);
                }
                o00oo00o.dnsEnd(o00o00o1, hostName, listLookup);
                Iterator<InetAddress> it = listLookup.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress(it.next(), port));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f59646OooO0oO.iterator();
            while (it2.hasNext()) {
                o0O00000 route = new o0O00000(this.f59640OooO00o, proxy, it2.next());
                oO0O0OoO oo0o0ooo = this.f59641OooO0O0;
                synchronized (oo0o0ooo) {
                    Intrinsics.checkNotNullParameter(route, "route");
                    zContains = oo0o0ooo.f59650OooO00o.contains(route);
                }
                if (zContains) {
                    this.f59647OooO0oo.add(route);
                } else {
                    arrayList.add(route);
                }
            }
        } while (!(!arrayList.isEmpty()));
        if (arrayList.isEmpty()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59647OooO0oo);
            this.f59647OooO0oo.clear();
        }
        return new OooO00o(arrayList);
    }
}
