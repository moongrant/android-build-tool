package p100o000oOoO;

import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@PublishedApi
public final class o00OO0OO implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f29498Oooo0o;

    public o00OO0OO(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f29498Oooo0o = coroutineScope;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        CoroutineScopeKt.cancel$default(this.f29498Oooo0o, null, 1, null);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        CoroutineScopeKt.cancel$default(this.f29498Oooo0o, null, 1, null);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
    }
}
