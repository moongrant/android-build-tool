package p338o0OO0ooo;

import com.facebook.internal.security.CertificateUtil;
import com.squareup.okhttp.OooO00o;
import com.squareup.okhttp.o00Oo0;
import com.squareup.okhttp.o0OoOo0;
import com.squareup.okhttp.o0ooOOo;
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
import p336o0OO0oo0.OooOO0O;
import p336o0OO0oo0.OooOOOO;
import p336o0OO0oo0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f43515OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f43516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0 f43517OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO f43518OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo000 f43519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Proxy> f43520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Proxy f43521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f43522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<InetSocketAddress> f43523OooO0oo = Collections.emptyList();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f43524OooOO0 = new ArrayList();

    public o000O0Oo(OooO00o oooO00o, o0OoOo0 o0oooo0, o00Oo0 o00oo1) {
        this.f43520OooO0o = Collections.emptyList();
        this.f43516OooO00o = oooO00o;
        this.f43517OooO0O0 = o0oooo0;
        OooOO0O.f43304OooO0O0.getClass();
        this.f43519OooO0Oo = o00oo1.f21597OooO0Oo;
        OooOO0O.f43304OooO0O0.getClass();
        this.f43518OooO0OO = o00oo1.f21613OooOo0;
        Proxy proxy = oooO00o.f21515OooO00o;
        if (proxy != null) {
            this.f43520OooO0o = Collections.singletonList(proxy);
        } else {
            this.f43520OooO0o = new ArrayList();
            List<Proxy> listSelect = o00oo1.f21603OooOO0O.select(o0oooo0.OooOO0());
            if (listSelect != null) {
                this.f43520OooO0o.addAll(listSelect);
            }
            this.f43520OooO0o.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f43520OooO0o.add(Proxy.NO_PROXY);
        }
        this.f43522OooO0oO = 0;
    }

    public final o0ooOOo OooO00o() throws IOException {
        boolean zContains;
        String hostName;
        int port;
        if (!(this.f43515OooO < this.f43523OooO0oo.size())) {
            if (!(this.f43522OooO0oO < this.f43520OooO0o.size())) {
                if (!this.f43524OooOO0.isEmpty()) {
                    return (o0ooOOo) this.f43524OooOO0.remove(0);
                }
                throw new NoSuchElementException();
            }
            boolean z = this.f43522OooO0oO < this.f43520OooO0o.size();
            OooO00o oooO00o = this.f43516OooO00o;
            if (!z) {
                throw new SocketException("No route to " + oooO00o.f21516OooO0O0 + "; exhausted proxy configurations: " + this.f43520OooO0o);
            }
            List<Proxy> list = this.f43520OooO0o;
            int i = this.f43522OooO0oO;
            this.f43522OooO0oO = i + 1;
            Proxy proxy = list.get(i);
            this.f43523OooO0oo = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                hostName = oooO00o.f21516OooO0O0;
                port = oooO00o.f21517OooO0OO;
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
            ((OooOOOO.OooO00o) this.f43518OooO0OO).getClass();
            if (hostName == null) {
                throw new UnknownHostException("host == null");
            }
            for (InetAddress inetAddress : InetAddress.getAllByName(hostName)) {
                this.f43523OooO0oo.add(new InetSocketAddress(inetAddress, port));
            }
            this.f43515OooO = 0;
            this.f43521OooO0o0 = proxy;
        }
        if (!(this.f43515OooO < this.f43523OooO0oo.size())) {
            throw new SocketException("No route to " + this.f43516OooO00o.f21516OooO0O0 + "; exhausted inet socket addresses: " + this.f43523OooO0oo);
        }
        List<InetSocketAddress> list2 = this.f43523OooO0oo;
        int i2 = this.f43515OooO;
        this.f43515OooO = i2 + 1;
        o0ooOOo o0ooooo = new o0ooOOo(this.f43516OooO00o, this.f43521OooO0o0, list2.get(i2));
        Oooo000 oooo000 = this.f43519OooO0Oo;
        synchronized (oooo000) {
            zContains = oooo000.f43327OooO00o.contains(o0ooooo);
        }
        if (!zContains) {
            return o0ooooo;
        }
        this.f43524OooOO0.add(o0ooooo);
        return OooO00o();
    }
}
