package p656o0ooo0o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p657o0ooo0o0.o0000O0O;
import p657o0ooo0o0.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o implements oO00OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f59583OooO00o = new OooO00o();

    public static final class OooO00o implements oO00OO0O.OooO00o {
        @Override // o0ooo0o.oO00OO0O.OooO00o
        public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            boolean z = o0000O0O.f59612OooO0Oo;
            return o0000O0O.OooO00o.OooO00o() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // o0ooo0o.oO00OO0O.OooO00o
        @NotNull
        public final oO00OOO OooO0O0(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new oO00O0o();
        }
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // p656o0ooo0o.oO00OOO
    public final boolean OooO0O0() {
        boolean z = o0000O0O.f59612OooO0Oo;
        return o0000O0O.f59612OooO0Oo;
    }

    @Override // p656o0ooo0o.oO00OOO
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p656o0ooo0o.oO00OOO
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (OooO00o(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o000O0o o000o0o2 = o000O0o.f59618OooO00o;
            Object[] array = o000O0o.OooO00o.OooO00o(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
