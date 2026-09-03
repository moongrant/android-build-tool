package p669o0oooOOo;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class bk extends vj {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f51923OooO0oo = new OooO00o();

    public static final class OooO00o {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(@NotNull Class<? super SSLSocket> sslSocketClass, @NotNull Class<? super SSLSocketFactory> sslSocketFactoryClass, @NotNull Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
    }
}
