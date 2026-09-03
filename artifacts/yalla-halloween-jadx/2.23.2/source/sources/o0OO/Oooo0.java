package o0OO;

import com.facebook.internal.security.CertificateUtil;
import com.squareup.okhttp.o00O0O;
import com.squareup.okhttp.o00oO0o;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p340o0OO0ooO.o0OOO0o;
import p340o0OO0ooO.oo000o;
import p340o0OO0ooO.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f42218OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.squareup.okhttp.OooO00o f42219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.squareup.okhttp.o000oOoO f42220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o f42221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f42222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Proxy> f42223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Proxy f42224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f42225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<InetSocketAddress> f42226OooO0oo = Collections.emptyList();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f42227OooOO0 = new ArrayList();

    public Oooo0(com.squareup.okhttp.OooO00o oooO00o, com.squareup.okhttp.o000oOoO o000oooo2, o00O0O o00o0o2) {
        this.f42223OooO0o = Collections.emptyList();
        this.f42219OooO00o = oooO00o;
        this.f42220OooO0O0 = o000oooo2;
        oo000o.f42599OooO0O0.getClass();
        this.f42222OooO0Oo = o00o0o2.f21141OooO0Oo;
        oo000o.f42599OooO0O0.getClass();
        this.f42221OooO0OO = o00o0o2.f21157OooOo0;
        Proxy proxy = oooO00o.f21042OooO00o;
        if (proxy != null) {
            this.f42223OooO0o = Collections.singletonList(proxy);
        } else {
            this.f42223OooO0o = new ArrayList();
            List<Proxy> listSelect = o00o0o2.f21147OooOO0O.select(o000oooo2.OooOO0());
            if (listSelect != null) {
                this.f42223OooO0o.addAll(listSelect);
            }
            this.f42223OooO0o.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f42223OooO0o.add(Proxy.NO_PROXY);
        }
        this.f42225OooO0oO = 0;
    }

    public final o00oO0o OooO00o() throws IOException {
        boolean zContains;
        String hostName;
        int port;
        if (!(this.f42218OooO < this.f42226OooO0oo.size())) {
            if (!(this.f42225OooO0oO < this.f42223OooO0o.size())) {
                if (!this.f42227OooOO0.isEmpty()) {
                    return (o00oO0o) this.f42227OooOO0.remove(0);
                }
                throw new NoSuchElementException();
            }
            boolean z = this.f42225OooO0oO < this.f42223OooO0o.size();
            com.squareup.okhttp.OooO00o oooO00o = this.f42219OooO00o;
            if (!z) {
                throw new SocketException("No route to " + oooO00o.f21043OooO0O0 + "; exhausted proxy configurations: " + this.f42223OooO0o);
            }
            List<Proxy> list = this.f42223OooO0o;
            int i = this.f42225OooO0oO;
            this.f42225OooO0oO = i + 1;
            Proxy proxy = list.get(i);
            this.f42226OooO0oo = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                hostName = oooO00o.f21043OooO0O0;
                port = oooO00o.f21044OooO0OO;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (port < 1 || port > 65535) {
                throw new SocketException("No route to " + hostName + CertificateUtil.DELIMITER + port + "; port is out of range");
            }
            ((o0OOO0o.OooO00o) this.f42221OooO0OO).getClass();
            if (hostName == null) {
                throw new UnknownHostException("host == null");
            }
            for (InetAddress inetAddress : InetAddress.getAllByName(hostName)) {
                this.f42226OooO0oo.add(new InetSocketAddress(inetAddress, port));
            }
            this.f42218OooO = 0;
            this.f42224OooO0o0 = proxy;
        }
        if (!(this.f42218OooO < this.f42226OooO0oo.size())) {
            throw new SocketException("No route to " + this.f42219OooO00o.f21043OooO0O0 + "; exhausted inet socket addresses: " + this.f42226OooO0oo);
        }
        List<InetSocketAddress> list2 = this.f42226OooO0oo;
        int i2 = this.f42218OooO;
        this.f42218OooO = i2 + 1;
        o00oO0o o00oo0o2 = new o00oO0o(this.f42219OooO00o, this.f42224OooO0o0, list2.get(i2));
        oo0o0Oo oo0o0oo = this.f42222OooO0Oo;
        synchronized (oo0o0oo) {
            zContains = oo0o0oo.f42600OooO00o.contains(o00oo0o2);
        }
        if (!zContains) {
            return o00oo0o2;
        }
        this.f42227OooOO0.add(o00oo0o2);
        return OooO00o();
    }
}
