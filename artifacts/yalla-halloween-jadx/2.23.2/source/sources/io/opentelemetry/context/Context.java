package io.opentelemetry.context;

import com.google.errorprone.annotations.MustBeClosed;
import java.util.concurrent.Callable;
import javax.annotation.Nullable;
import p440o0OoOo0.o00000O0;

/* JADX INFO: loaded from: classes5.dex */
public interface Context {
    OooO00o OooO00o(Callable callable);

    o00000O0 OooO0O0(Runnable runnable);

    @Nullable
    <V> V OooO0OO(ContextKey<V> contextKey);

    Context OooO0Oo(ContextKey contextKey, ImplicitContextKeyed implicitContextKeyed);

    @MustBeClosed
    Scope OooO0o();

    Context OooO0o0(ImplicitContextKeyed implicitContextKeyed);
}
