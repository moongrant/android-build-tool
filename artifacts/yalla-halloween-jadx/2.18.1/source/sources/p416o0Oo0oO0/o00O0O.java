package p416o0Oo0oO0;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p412o0Oo0o00.o000000;
import p412o0Oo0o00.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O f39580OooO00o = new o00O0O();

    public final InetAddress OooO00o(Proxy proxy, o0000O o0000o2) throws IOException {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(o0000o2.f39262OooO0Oo) : ((InetSocketAddress) proxy.address()).getAddress();
    }
}
