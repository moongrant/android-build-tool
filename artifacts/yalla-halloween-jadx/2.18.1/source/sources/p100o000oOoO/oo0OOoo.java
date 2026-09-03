package p100o000oOoO;

import androidx.compose.runtime.InvalidationResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o0OO00O;
import p036OoooOOO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0OOoo implements oo0ooO, o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f29697OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00O f29698OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00oOoo f29699OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super oOO00O, ? super Integer, Unit> f29700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f29701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f29702OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0OO00O<o00OOO0<?>, Object> f29703OooO0oO;

    public oo0OOoo(@Nullable o00O o00o2) {
        this.f29698OooO0O0 = o00o2;
    }

    @Override // p100o000oOoO.oo0ooO
    public final void OooO00o(@NotNull Function2<? super oOO00O, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f29700OooO0Oo = block;
    }

    @NotNull
    public final InvalidationResult OooO0O0(@Nullable Object obj) {
        InvalidationResult invalidationResultOooOoO0;
        o00O o00o2 = this.f29698OooO0O0;
        return (o00o2 == null || (invalidationResultOooOoO0 = o00o2.OooOoO0(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultOooOoO0;
    }

    public final void OooO0OO() {
        this.f29698OooO0O0 = null;
        this.f29701OooO0o = null;
        this.f29703OooO0oO = null;
    }

    public final void OooO0Oo(boolean z) {
        if (z) {
            this.f29697OooO00o |= 32;
        } else {
            this.f29697OooO00o &= -33;
        }
    }

    @Override // p100o000oOoO.o0O0OOO0
    public final void invalidate() {
        o00O o00o2 = this.f29698OooO0O0;
        if (o00o2 != null) {
            o00o2.OooOoO0(this, null);
        }
    }
}
