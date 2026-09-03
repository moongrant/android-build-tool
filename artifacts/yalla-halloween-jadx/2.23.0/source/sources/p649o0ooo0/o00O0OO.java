package p649o0ooo0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p652o0ooo00o.o000O00;
import p652o0ooo00o.o000O0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO implements o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f59815OooO00o = new OooO00o();

    public static final class OooO00o implements o00O.OooO00o {
        @Override // o0ooo0.o00O.OooO00o
        public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            boolean z = o000O00.f60026OooO0Oo;
            return o000O00.OooO00o.OooO00o() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // o0ooo0.o00O.OooO00o
        @NotNull
        public final o00OO000 OooO0O0(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new o00O0OO();
        }
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // p649o0ooo0.o00OO000
    public final boolean OooO0O0() {
        boolean z = o000O00.f60026OooO0Oo;
        return o000O00.f60026OooO0Oo;
    }

    @Override // p649o0ooo0.o00OO000
    @Nullable
    public final String OooO0OO(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p649o0ooo0.o00OO000
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (OooO00o(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
            Object[] array = o000O0O0.OooO00o.OooO00o(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
