package io.grpc;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ExperimentalApi("https://github.com/grpc/grpc-java/issues/5279")
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {
    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        Objects.requireNonNull((HttpConnectProxiedSocketAddress) obj);
        return o0OOOO0o.OooOOO.OooO00o(null, null) && o0OOOO0o.OooOOO.OooO00o(null, null) && o0OOOO0o.OooOOO.OooO00o(null, null) && o0OOOO0o.OooOOO.OooO00o(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null});
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("proxyAddr", null);
        oooO00oOooO0O0.OooO0OO("targetAddr", null);
        oooO00oOooO0O0.OooO0OO("username", null);
        oooO00oOooO0O0.OooO0O0("hasPassword", false);
        return oooO00oOooO0O0.toString();
    }
}
