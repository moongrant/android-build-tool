package p649o0ooo0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O implements o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f59808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00OO000 f59809OooO0O0;

    public interface OooO00o {
        boolean OooO00o(@NotNull SSLSocket sSLSocket);

        @NotNull
        o00OO000 OooO0O0(@NotNull SSLSocket sSLSocket);
    }

    public o00O(@NotNull OooO00o socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f59808OooO00o = socketAdapterFactory;
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f59808OooO00o.OooO00o(sslSocket);
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p649o0ooo0.o00OO000
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        o00OO000 o00oo001;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        synchronized (this) {
            if (this.f59809OooO0O0 == null && this.f59808OooO00o.OooO00o(sslSocket)) {
                this.f59809OooO0O0 = this.f59808OooO00o.OooO0O0(sslSocket);
            }
            o00oo001 = this.f59809OooO0O0;
        }
        if (o00oo001 == null) {
            return null;
        }
        return o00oo001.OooO0OO(sslSocket);
    }

    @Override // p649o0ooo0.o00OO000
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        o00OO000 o00oo001;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        synchronized (this) {
            if (this.f59809OooO0O0 == null && this.f59808OooO00o.OooO00o(sslSocket)) {
                this.f59809OooO0O0 = this.f59808OooO00o.OooO0O0(sslSocket);
            }
            o00oo001 = this.f59809OooO0O0;
        }
        if (o00oo001 == null) {
            return;
        }
        o00oo001.OooO0Oo(sslSocket, str, protocols);
    }
}
