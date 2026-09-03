package p669o0oooOOo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p667o0oooOO.n;
import p667o0oooOO.s;

/* JADX INFO: loaded from: classes3.dex */
public final class yj implements ak {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f51942OooO00o = new OooO00o();

    public static final class OooO00o implements zj.OooO00o {
        @Override // o0oooOOo.zj.OooO00o
        public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            n.OooO00o oooO00o = n.f51902OooO0o;
            return n.f51903OooO0o0 && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // o0oooOOo.zj.OooO00o
        @NotNull
        public final ak OooO0O0(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new yj();
        }
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p669o0oooOOo.ak
    public final boolean OooO0O0() {
        n.OooO00o oooO00o = n.f51902OooO0o;
        return n.f51903OooO0o0;
    }

    @Override // p669o0oooOOo.ak
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p669o0oooOOo.ak
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = ((ArrayList) s.f51921OooO0OO.OooO00o(protocols)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
