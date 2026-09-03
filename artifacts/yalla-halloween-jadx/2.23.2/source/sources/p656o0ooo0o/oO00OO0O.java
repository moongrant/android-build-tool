package p656o0ooo0o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OO0O implements oO00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f59591OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oO00OOO f59592OooO0O0;

    public interface OooO00o {
        boolean OooO00o(@NotNull SSLSocket sSLSocket);

        @NotNull
        oO00OOO OooO0O0(@NotNull SSLSocket sSLSocket);
    }

    public oO00OO0O(@NotNull OooO00o socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f59591OooO00o = socketAdapterFactory;
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f59591OooO00o.OooO00o(sslSocket);
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p656o0ooo0o.oO00OOO
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        oO00OOO oo00ooo;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.f59592OooO0O0 == null && this.f59591OooO00o.OooO00o(sslSocket)) {
                this.f59592OooO0O0 = this.f59591OooO00o.OooO0O0(sslSocket);
            }
            oo00ooo = this.f59592OooO0O0;
        }
        if (oo00ooo == null) {
            return null;
        }
        return oo00ooo.OooO0OO(sslSocket);
    }

    @Override // p656o0ooo0o.oO00OOO
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        oO00OOO oo00ooo;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            if (this.f59592OooO0O0 == null && this.f59591OooO00o.OooO00o(sslSocket)) {
                this.f59592OooO0O0 = this.f59591OooO00o.OooO0O0(sslSocket);
            }
            oo00ooo = this.f59592OooO0O0;
        }
        if (oo00ooo == null) {
            return;
        }
        oo00ooo.OooO0Oo(sslSocket, str, protocols);
    }
}
