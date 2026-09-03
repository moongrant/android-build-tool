package p412o0Oo0o00;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo f39299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Proxy f39300OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f39301OooO0OO;

    public o000O00(o000OOo o000ooo2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(o000ooo2, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f39299OooO00o = o000ooo2;
        this.f39300OooO0O0 = proxy;
        this.f39301OooO0OO = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return this.f39299OooO00o.equals(o000o01.f39299OooO00o) && this.f39300OooO0O0.equals(o000o01.f39300OooO0O0) && this.f39301OooO0OO.equals(o000o01.f39301OooO0OO);
    }

    public final int hashCode() {
        return this.f39301OooO0OO.hashCode() + ((this.f39300OooO0O0.hashCode() + ((this.f39299OooO00o.hashCode() + 527) * 31)) * 31);
    }
}
