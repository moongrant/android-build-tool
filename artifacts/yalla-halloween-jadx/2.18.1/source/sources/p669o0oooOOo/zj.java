package p669o0oooOOo;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zj implements ak {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ak f51943OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f51944OooO0O0;

    public interface OooO00o {
        boolean OooO00o(@NotNull SSLSocket sSLSocket);

        @NotNull
        ak OooO0O0(@NotNull SSLSocket sSLSocket);
    }

    public zj(@NotNull OooO00o socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f51944OooO0O0 = socketAdapterFactory;
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f51944OooO0O0.OooO00o(sslSocket);
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p669o0oooOOo.ak
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ak akVarOooO0o0 = OooO0o0(sslSocket);
        if (akVarOooO0o0 != null) {
            return akVarOooO0o0.OooO0OO(sslSocket);
        }
        return null;
    }

    @Override // p669o0oooOOo.ak
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ak akVarOooO0o0 = OooO0o0(sslSocket);
        if (akVarOooO0o0 != null) {
            akVarOooO0o0.OooO0Oo(sslSocket, str, protocols);
        }
    }

    public final synchronized ak OooO0o0(SSLSocket sSLSocket) {
        if (this.f51943OooO00o == null && this.f51944OooO0O0.OooO00o(sSLSocket)) {
            this.f51943OooO00o = this.f51944OooO0O0.OooO0O0(sSLSocket);
        }
        return this.f51943OooO00o;
    }
}
