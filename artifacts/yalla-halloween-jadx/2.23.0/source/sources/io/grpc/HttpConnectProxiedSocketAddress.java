package io.grpc;

import com.google.common.base.OooOo;
import com.google.common.base.Oooo000;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@ExperimentalApi("https://github.com/grpc/grpc-java/issues/5279")
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {
    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        ((HttpConnectProxiedSocketAddress) obj).getClass();
        return Oooo000.OooO00o(null, null) && Oooo000.OooO00o(null, null) && Oooo000.OooO00o(null, null) && Oooo000.OooO00o(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null});
    }

    public final String toString() {
        OooOo.OooO00o oooO00oOooO0O0 = OooOo.OooO0O0(this);
        oooO00oOooO0O0.OooO00o(null, "proxyAddr");
        oooO00oOooO0O0.OooO00o(null, "targetAddr");
        oooO00oOooO0O0.OooO00o(null, "username");
        oooO00oOooO0O0.OooO0O0(String.valueOf(false), "hasPassword");
        return oooO00oOooO0O0.toString();
    }
}
