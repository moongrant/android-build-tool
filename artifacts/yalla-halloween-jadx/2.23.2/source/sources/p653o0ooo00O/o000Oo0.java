package p653o0ooo00O;

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
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OO00O;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0oO0O0o;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59382OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O0o f59383OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OO f59384OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0 f59385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f59386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<? extends Proxy> f59387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<? extends InetSocketAddress> f59388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f59389OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<o0oO0O0o> f59390OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f59391OooO0O0;

        public OooO00o(@NotNull ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f59390OooO00o = routes;
        }

        public final boolean OooO00o() {
            return this.f59391OooO0O0 < this.f59390OooO00o.size();
        }
    }

    public o000Oo0(@NotNull o00OO00O address, @NotNull o000O0o routeDatabase, @NotNull o0000O0 call, @NotNull o0 eventListener) {
        List<Proxy> listOooOo;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f59382OooO00o = address;
        this.f59383OooO0O0 = routeDatabase;
        this.f59384OooO0OO = call;
        this.f59385OooO0Oo = eventListener;
        this.f59387OooO0o0 = CollectionsKt.emptyList();
        this.f59388OooO0oO = CollectionsKt.emptyList();
        this.f59389OooO0oo = new ArrayList();
        o0O000O o0o000o = address.f57743OooO;
        eventListener.proxySelectStart(call, o0o000o);
        Proxy proxy = address.f57750OooO0oO;
        if (proxy != null) {
            listOooOo = CollectionsKt.listOf(proxy);
        } else {
            URI uriOooOO0O = o0o000o.OooOO0O();
            if (uriOooOO0O.getHost() == null) {
                listOooOo = oO000o00.OooOO0o(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f57751OooO0oo.select(uriOooOO0O);
                if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                    listOooOo = oO000o00.OooOO0o(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    listOooOo = oO000o00.OooOo(proxiesOrNull);
                }
            }
        }
        this.f59387OooO0o0 = listOooOo;
        this.f59386OooO0o = 0;
        eventListener.proxySelectEnd(call, o0o000o, listOooOo);
    }

    public final boolean OooO00o() {
        return (this.f59386OooO0o < this.f59387OooO0o0.size()) || (this.f59389OooO0oo.isEmpty() ^ true);
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
            if (!(this.f59386OooO0o < this.f59387OooO0o0.size())) {
                break;
            }
            boolean z2 = this.f59386OooO0o < this.f59387OooO0o0.size();
            o00OO00O o00oo00o = this.f59382OooO00o;
            if (!z2) {
                throw new SocketException("No route to " + o00oo00o.f57743OooO.f57792OooO0Oo + "; exhausted proxy configurations: " + this.f59387OooO0o0);
            }
            List<? extends Proxy> list = this.f59387OooO0o0;
            int i = this.f59386OooO0o;
            this.f59386OooO0o = i + 1;
            Proxy proxy = list.get(i);
            ArrayList arrayList2 = new ArrayList();
            this.f59388OooO0oO = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                o0O000O o0o000o = o00oo00o.f57743OooO;
                hostName = o0o000o.f57792OooO0Oo;
                port = o0o000o.f57794OooO0o0;
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
                o0 o0Var = this.f59385OooO0Oo;
                o00OO o00oo2 = this.f59384OooO0OO;
                o0Var.dnsStart(o00oo2, hostName);
                List<InetAddress> listLookup = o00oo00o.f57744OooO00o.lookup(hostName);
                if (listLookup.isEmpty()) {
                    throw new UnknownHostException(o00oo00o.f57744OooO00o + " returned no addresses for " + hostName);
                }
                o0Var.dnsEnd(o00oo2, hostName, listLookup);
                Iterator<InetAddress> it = listLookup.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress(it.next(), port));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f59388OooO0oO.iterator();
            while (it2.hasNext()) {
                o0oO0O0o route = new o0oO0O0o(this.f59382OooO00o, proxy, it2.next());
                o000O0o o000o0o2 = this.f59383OooO0O0;
                synchronized (o000o0o2) {
                    Intrinsics.checkNotNullParameter(route, "route");
                    zContains = o000o0o2.f59378OooO00o.contains(route);
                }
                if (zContains) {
                    this.f59389OooO0oo.add(route);
                } else {
                    arrayList.add(route);
                }
            }
        } while (!(!arrayList.isEmpty()));
        if (arrayList.isEmpty()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f59389OooO0oo);
            this.f59389OooO0oo.clear();
        }
        return new OooO00o(arrayList);
    }
}
