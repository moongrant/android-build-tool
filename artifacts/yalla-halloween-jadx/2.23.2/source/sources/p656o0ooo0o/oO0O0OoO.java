package p656o0ooo0o;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0OoO implements oO00OO0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f59594OooO00o = "com.google.android.gms.org.conscrypt";

    @Override // o0ooo0o.oO00OO0O.OooO00o
    public final boolean OooO00o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt__StringsJVMKt.startsWith$default(name, Intrinsics.stringPlus(this.f59594OooO00o, "."), false, 2, null);
    }

    @Override // o0ooo0o.oO00OO0O.OooO00o
    @NotNull
    public final oO00OOO OooO0O0(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        oO0O0OoO oo0o0ooo = oO00O0o0.f59584OooO0o;
        Class<?> cls = sslSocket.getClass();
        Class<?> superclass = cls;
        while (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(superclass);
        return new oO00O0o0(superclass);
    }
}
