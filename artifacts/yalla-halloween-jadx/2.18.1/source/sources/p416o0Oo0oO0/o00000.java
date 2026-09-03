package p416o0Oo0oO0;

import OooO00o.OooO00o;
import com.facebook.internal.security.CertificateUtil;
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
import java.util.Objects;
import java.util.Set;
import p412o0Oo0o00.o000;
import p412o0Oo0o00.o0000O;
import p412o0Oo0o00.o000O00;
import p412o0Oo0o00.o000OOo;
import p413o0Oo0o0O.o0OO00O;
import p413o0Oo0o0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f39562OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo f39563OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O f39564OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO00O f39565OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.android.billingclient.api.o00000 f39566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Proxy> f39567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Proxy f39568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<InetSocketAddress> f39570OooO0oo = Collections.emptyList();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<o000O00> f39571OooOO0 = new ArrayList();

    public o00000(o000OOo o000ooo2, o0000O o0000o2, o000 o000Var) {
        this.f39567OooO0o = Collections.emptyList();
        this.f39563OooO00o = o000ooo2;
        this.f39564OooO0O0 = o0000o2;
        Objects.requireNonNull(o0ooOOo.f39374OooO0O0);
        this.f39566OooO0Oo = o000Var.f39178Oooo0o;
        Objects.requireNonNull(o0ooOOo.f39374OooO0O0);
        this.f39565OooO0OO = o000Var.f39193OooooO0;
        Proxy proxy = o000ooo2.f39336OooO00o;
        if (proxy != null) {
            this.f39567OooO0o = Collections.singletonList(proxy);
        } else {
            this.f39567OooO0o = new ArrayList();
            List<Proxy> listSelect = o000Var.f39181OoooO.select(o0000o2.OooOO0O());
            if (listSelect != null) {
                this.f39567OooO0o.addAll(listSelect);
            }
            this.f39567OooO0o.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f39567OooO0o.add(Proxy.NO_PROXY);
        }
        this.f39569OooO0oO = 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o000O00>] */
    public final boolean OooO00o() {
        return OooO0O0() || OooO0OO() || (this.f39571OooOO0.isEmpty() ^ true);
    }

    public final boolean OooO0O0() {
        return this.f39562OooO < this.f39570OooO0oo.size();
    }

    public final boolean OooO0OO() {
        return this.f39569OooO0oO < this.f39567OooO0o.size();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o000O00>] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o000O00>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0Oo0o00.o000O00>] */
    public final o000O00 OooO0Oo() throws IOException {
        boolean zContains;
        String hostName;
        int port;
        if (!OooO0O0()) {
            if (!OooO0OO()) {
                if (!this.f39571OooOO0.isEmpty()) {
                    return (o000O00) this.f39571OooOO0.remove(0);
                }
                throw new NoSuchElementException();
            }
            if (!OooO0OO()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("No route to ");
                sbOooO0o0.append(this.f39563OooO00o.f39337OooO0O0);
                sbOooO0o0.append("; exhausted proxy configurations: ");
                sbOooO0o0.append(this.f39567OooO0o);
                throw new SocketException(sbOooO0o0.toString());
            }
            List<Proxy> list = this.f39567OooO0o;
            int i = this.f39569OooO0oO;
            this.f39569OooO0oO = i + 1;
            Proxy proxy = list.get(i);
            this.f39570OooO0oo = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                o000OOo o000ooo2 = this.f39563OooO00o;
                hostName = o000ooo2.f39337OooO0O0;
                port = o000ooo2.f39338OooO0OO;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Proxy.address() is not an InetSocketAddress: ");
                    sbOooO0o1.append(socketAddressAddress.getClass());
                    throw new IllegalArgumentException(sbOooO0o1.toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (port < 1 || port > 65535) {
                throw new SocketException("No route to " + hostName + CertificateUtil.DELIMITER + port + "; port is out of range");
            }
            Objects.requireNonNull((o0OO00O.OooO00o) this.f39565OooO0OO);
            if (hostName == null) {
                throw new UnknownHostException("host == null");
            }
            InetAddress[] allByName = InetAddress.getAllByName(hostName);
            for (InetAddress inetAddress : allByName) {
                this.f39570OooO0oo.add(new InetSocketAddress(inetAddress, port));
            }
            this.f39562OooO = 0;
            this.f39568OooO0o0 = proxy;
        }
        if (!OooO0O0()) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("No route to ");
            sbOooO0o2.append(this.f39563OooO00o.f39337OooO0O0);
            sbOooO0o2.append("; exhausted inet socket addresses: ");
            sbOooO0o2.append(this.f39570OooO0oo);
            throw new SocketException(sbOooO0o2.toString());
        }
        List<InetSocketAddress> list2 = this.f39570OooO0oo;
        int i2 = this.f39562OooO;
        this.f39562OooO = i2 + 1;
        o000O00 o000o01 = new o000O00(this.f39563OooO00o, this.f39568OooO0o0, list2.get(i2));
        com.android.billingclient.api.o00000 o00000Var = this.f39566OooO0Oo;
        synchronized (o00000Var) {
            zContains = ((Set) o00000Var.f11262OooO00o).contains(o000o01);
        }
        if (!zContains) {
            return o000o01;
        }
        this.f39571OooOO0.add(o000o01);
        return OooO0Oo();
    }
}
