package com.common.support.apm.sailfishhttp;

import com.common.support.apm.configuration.specific.HostConfig;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HostSwitchInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "Lo0ooO0oO/o0oOOo;", "intercept", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "hostProvider", "Lcom/common/support/apm/sailfishhttp/HostProvider;", "getHostProvider", "()Lcom/common/support/apm/sailfishhttp/HostProvider;", "<init>", "(Lcom/common/support/apm/sailfishhttp/HostProvider;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class HostSwitchInterceptor implements o00OOO00 {

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

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        o00OO o00ooOooO0OO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!HostConfig.INSTANCE.isHostSwitchOn()) {
            return chain.OooO0O0(chain.OooO00o());
        }
        o00OOOOo o00oooooOooO00o = chain.OooO00o();
        String[] strArrHosts = this.hostProvider.hosts();
        o00OOOOo o00oooooOooO0O0 = o00oooooOooO00o;
        int i = 0;
        o0oOOo o0ooooOooO0O0 = null;
        IOException e = null;
        while (i < strArrHosts.length) {
            boolean z = true;
            try {
                o0ooooOooO0O0 = chain.OooO0O0(o00oooooOooO0O0);
                if (o0ooooOooO0O0.f57345OooO0oO < 500) {
                    z = false;
                }
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
            if (!z) {
                this.hostProvider.updateValidHost(o00oooooOooO0O0.f57313OooO00o.f57203OooO00o + "://" + o00oooooOooO0O0.f57313OooO00o.f57206OooO0Oo);
                break;
            }
            o00OO o00oo2 = null;
            do {
                String str = strArrHosts[i];
                Intrinsics.checkNotNullParameter(str, "<this>");
                try {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    o00OO.OooO00o oooO00o = new o00OO.OooO00o();
                    oooO00o.OooO0oO(null, str);
                    o00ooOooO0OO = oooO00o.OooO0OO();
                } catch (IllegalArgumentException unused) {
                    o00ooOooO0OO = null;
                }
                if (o00ooOooO0OO != null) {
                    i++;
                    o00oo2 = o00ooOooO0OO;
                }
                if (o00oo2 != null) {
                    break;
                }
            } while (i < strArrHosts.length);
            if (o00oo2 == null) {
                break;
            }
            o00oooooOooO00o.getClass();
            o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00oooooOooO00o);
            o00OO.OooO00o oooO00oOooO0o = o00oooooOooO00o.f57313OooO00o.OooO0o();
            oooO00oOooO0o.OooOO0(o00oo2.f57203OooO00o);
            oooO00oOooO0o.OooO0o(o00oo2.f57206OooO0Oo);
            o00OO url = oooO00oOooO0o.OooO0OO();
            Intrinsics.checkNotNullParameter(url, "url");
            oooO00o2.f57319OooO00o = url;
            oooO00o2.OooO0O0();
            o00oooooOooO0O0 = oooO00o2.OooO0O0();
        }
        if (e != null) {
            throw e;
        }
        if (o0ooooOooO0O0 != null) {
            return o0ooooOooO0O0;
        }
        throw new IOException("No Response");
    }
}
