package p100o000oOoO;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function1<o00OOOO0, o0o0Oo> f29507Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0o0Oo f29508Oooo0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO0O(@NotNull Function1<? super o00OOOO0, ? extends o0o0Oo> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f29507Oooo0o = effect;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        o0o0Oo o0o0oo = this.f29508Oooo0oO;
        if (o0o0oo != null) {
            o0o0oo.dispose();
        }
        this.f29508Oooo0oO = null;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        this.f29508Oooo0oO = this.f29507Oooo0o.invoke(o00Oo00.f29510OooO00o);
    }
}
