package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o<V extends o0O0O00> implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0oOO<V> f1201OooO00o;

    public o0O0o(float f, float f2, @Nullable V v) {
        this.f1201OooO00o = new o0oOO<>(v != null ? new o00OOO0(v, f, f2) : new o00OOO0O(f, f2));
    }

    @Override // p023Oooo00O.o00OOO00
    public final boolean OooO00o() {
        Objects.requireNonNull(this.f1201OooO00o);
        return false;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0O0(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1201OooO00o.OooO0O0(j, initialValue, targetValue, initialVelocity);
    }

    @Override // p023Oooo00O.o00OOO00
    public final long OooO0Oo(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f1201OooO00o.OooO0Oo(initialValue, targetValue, initialVelocity);
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0o0(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1201OooO00o.OooO0o0(initialValue, targetValue, initialVelocity);
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0oO(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1201OooO00o.OooO0oO(j, initialValue, targetValue, initialVelocity);
    }
}
