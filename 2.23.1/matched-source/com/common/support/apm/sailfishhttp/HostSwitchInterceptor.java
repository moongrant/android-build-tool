package com.common.support.apm.sailfishhttp;

import com.common.support.apm.configuration.specific.HostConfig;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p640o0ooO0oo.o0OOOO00;
import p640o0ooO0oo.o0OOOO0o;
import p640o0ooO0oo.oO0000Oo;
import p640o0ooO0oo.ooo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HostSwitchInterceptor;", "Lo0ooO0oo/o0OOOO0o;", "Lo0ooO0oo/o0OOOO0o$OooO00o;", "chain", "Lo0ooO0oo/oO0000Oo;", "intercept", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "hostProvider", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "getHostProvider", "()Lcom/common/support/apm/sailfishhttp/HostProvider;", "<init>", "(Lcom/common/support/apm/sailfishhttp/HostProvider;)V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class HostSwitchInterceptor implements o0OOOO0o {

    @NotNull
    private final HostProvider hostProvider;

    public HostSwitchInterceptor(@NotNull HostProvider hostProvider) {
        Intrinsics.checkNotNullParameter(hostProvider, "hostProvider");
        this.hostProvider = hostProvider;
    }

    @NotNull
    public final HostProvider getHostProvider() {
        return this.hostProvider;
    }

    @Override // p640o0ooO0oo.o0OOOO0o
    @NotNull
    public oO0000Oo intercept(@NotNull o0OOOO0o.OooO00o chain) throws IOException {
        o0OOOO00 o0oooo00OooO0OO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!HostConfig.INSTANCE.isHostSwitchOn()) {
            return chain.OooO0O0(chain.OooO00o());
        }
        ooo0Oo0 ooo0oo0OooO00o = chain.OooO00o();
        String[] strArrHosts = this.hostProvider.hosts();
        ooo0Oo0 ooo0oo0OooO0O0 = ooo0oo0OooO00o;
        int i = 0;
        oO0000Oo oo0000ooOooO0O0 = null;
        IOException e = null;
        while (i < strArrHosts.length) {
            boolean z = true;
            try {
                oo0000ooOooO0O0 = chain.OooO0O0(ooo0oo0OooO0O0);
                if (oo0000ooOooO0O0.f57457OooO0oO < 500) {
                    z = false;
                }
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
            if (!z) {
                this.hostProvider.updateValidHost(ooo0oo0OooO0O0.f57512OooO00o.f57345OooO00o + "://" + ooo0oo0OooO0O0.f57512OooO00o.f57348OooO0Oo);
                break;
            }
            o0OOOO00 o0oooo01 = null;
            do {
                String str = strArrHosts[i];
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    o0OOOO00.OooO00o oooO00o = new o0OOOO00.OooO00o();
                    oooO00o.OooO0oO(null, str);
                    o0oooo00OooO0OO = oooO00o.OooO0OO();
                } catch (IllegalArgumentException unused) {
                    o0oooo00OooO0OO = null;
                }
                if (o0oooo00OooO0OO != null) {
                    i++;
                    o0oooo01 = o0oooo00OooO0OO;
                }
                if (o0oooo01 != null) {
                    break;
                }
            } while (i < strArrHosts.length);
            if (o0oooo01 == null) {
                break;
            }
            ooo0oo0OooO00o.getClass();
            ooo0Oo0.OooO00o oooO00o2 = new ooo0Oo0.OooO00o(ooo0oo0OooO00o);
            o0OOOO00.OooO00o oooO00oOooO0o = ooo0oo0OooO00o.f57512OooO00o.OooO0o();
            oooO00oOooO0o.OooOO0(o0oooo01.f57345OooO00o);
            oooO00oOooO0o.OooO0o(o0oooo01.f57348OooO0Oo);
            o0OOOO00 url = oooO00oOooO0o.OooO0OO();
            Intrinsics.checkNotNullParameter(url, "url");
            oooO00o2.f57518OooO00o = url;
            oooO00o2.OooO0O0();
            ooo0oo0OooO0O0 = oooO00o2.OooO0O0();
        }
        if (e != null) {
            throw e;
        }
        if (oo0000ooOooO0O0 != null) {
            return oo0000ooOooO0O0;
        }
        throw new IOException("No Response");
    }
}
