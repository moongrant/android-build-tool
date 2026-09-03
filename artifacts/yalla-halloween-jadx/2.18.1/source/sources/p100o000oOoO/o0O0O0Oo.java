package p100o000oOoO;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0Oo<T> implements o0O0oo0o<T>, o0O00OO<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f29555Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<T> f29556Oooo0oO;

    public o0O0O0Oo(@NotNull o0O00OO<T> state, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f29555Oooo0o = coroutineContext;
        this.f29556Oooo0oO = state;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f29555Oooo0o;
    }

    @Override // p100o000oOoO.o0O00OO, p100o000oOoO.oO0Oo
    public final T getValue() {
        return this.f29556Oooo0oO.getValue();
    }

    @Override // p100o000oOoO.o0O00OO
    public final void setValue(T t) {
        this.f29556Oooo0oO.setValue(t);
    }
}
