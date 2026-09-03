package com.common.support.apm.sailfishhttp;

import com.common.support.apm.configuration.specific.HostConfig;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HostSwitchInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "hostProvider", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "getHostProvider", "()Lcom/common/support/apm/sailfishhttp/HostProvider;", "<init>", "(Lcom/common/support/apm/sailfishhttp/HostProvider;)V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class HostSwitchInterceptor implements o0OoOoOo {

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

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        o0O000O o0o000oOooO0OO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!HostConfig.INSTANCE.isHostSwitchOn()) {
            return chain.OooO0OO(chain.OooO00o());
        }
        o0O00O0o o0o00o0oOooO00o = chain.OooO00o();
        String[] strArrHosts = this.hostProvider.hosts();
        o0O00O0o o0o00o0oOooO0O0 = o0o00o0oOooO00o;
        int i = 0;
        o0O00o00 o0o00o00OooO0OO = null;
        IOException e = null;
        while (i < strArrHosts.length) {
            boolean z = true;
            try {
                o0o00o00OooO0OO = chain.OooO0OO(o0o00o0oOooO0O0);
                if (o0o00o00OooO0OO.f57850OooO0oO < 500) {
                    z = false;
                }
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
            if (!z) {
                this.hostProvider.updateValidHost(o0o00o0oOooO0O0.f57828OooO00o.f57789OooO00o + "://" + o0o00o0oOooO0O0.f57828OooO00o.f57792OooO0Oo);
                break;
            }
            o0O000O o0o000o = null;
            do {
                String str = strArrHosts[i];
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
                    oooO00o.OooO0oO(null, str);
                    o0o000oOooO0OO = oooO00o.OooO0OO();
                } catch (IllegalArgumentException unused) {
                    o0o000oOooO0OO = null;
                }
                if (o0o000oOooO0OO != null) {
                    i++;
                    o0o000o = o0o000oOooO0OO;
                }
                if (o0o000o != null) {
                    break;
                }
            } while (i < strArrHosts.length);
            if (o0o000o == null) {
                break;
            }
            o0o00o0oOooO00o.getClass();
            o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o(o0o00o0oOooO00o);
            o0O000O.OooO00o oooO00oOooO0o = o0o00o0oOooO00o.f57828OooO00o.OooO0o();
            oooO00oOooO0o.OooOO0(o0o000o.f57789OooO00o);
            oooO00oOooO0o.OooO0o(o0o000o.f57792OooO0Oo);
            o0O000O url = oooO00oOooO0o.OooO0OO();
            Intrinsics.checkNotNullParameter(url, "url");
            oooO00o2.f57834OooO00o = url;
            oooO00o2.OooO0O0();
            o0o00o0oOooO0O0 = oooO00o2.OooO0O0();
        }
        if (e != null) {
            throw e;
        }
        if (o0o00o00OooO0OO != null) {
            return o0o00o00OooO0OO;
        }
        throw new IOException("No Response");
    }
}
