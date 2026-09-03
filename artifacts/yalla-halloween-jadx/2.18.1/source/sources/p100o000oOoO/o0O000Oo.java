package p100o000oOoO;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000Oo<T> implements oO0Oo<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f29526Oooo0o;

    public o0O000Oo(@NotNull Function0<? extends T> valueProducer) {
        Intrinsics.checkNotNullParameter(valueProducer, "valueProducer");
        this.f29526Oooo0o = LazyKt.lazy(valueProducer);
    }

    @Override // p100o000oOoO.oO0Oo
    public final T getValue() {
        return (T) this.f29526Oooo0o.getValue();
    }
}
