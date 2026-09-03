package p649o0ooo0;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO0 implements o00O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f59816OooO00o = "com.google.android.gms.org.conscrypt";

    @Override // o0ooo0.o00O.OooO00o
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt.Oooo00o(name, Intrinsics.stringPlus(this.f59816OooO00o, "."));
    }

    @Override // o0ooo0.o00O.OooO00o
    @NotNull
    public final o00OO000 OooO0O0(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        o00O0OO0 o00o0oo1 = oo0o0O0.f59821OooO0o;
        Class<?> cls = sslSocket.getClass();
        Class<?> superclass = cls;
        while (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(superclass);
        return new oo0o0O0(superclass);
    }
}
