package p442o0OoOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000O0O.OooO;
import o0000O0O.OooO0o;
import o0000O0O.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOo implements OooO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public OooOo00 f40207Oooo0o = o00oO0o.f40212OooO00o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00Ooo f40208Oooo0oO;

    public final long OooO0OO() {
        return this.f40207Oooo0o.OooO0OO();
    }

    @Override // o0000O0O.OooO
    public final float OooO0o0(int i) {
        return i / getDensity();
    }

    @NotNull
    public final o00Ooo OooOOO(@NotNull Function1<? super o00oO0o, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        o00Ooo o00ooo2 = new o00Ooo(block);
        this.f40208Oooo0oO = o00ooo2;
        return o00ooo2;
    }

    @Override // o0000O0O.OooO
    public final long OooOoOO(float f) {
        return o00Oo0.OooO0O0(f / OoooOOo());
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long OooOoo0(long j) {
        return OooO0o.OooO0O0(this, j);
    }

    @Override // o0000O0O.OooO
    public final float OoooOO0(float f) {
        return f / getDensity();
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f40207Oooo0o.getDensity().OoooOOo();
    }

    @Override // o0000O0O.OooO
    public final float OoooOoo(float f) {
        return getDensity() * f;
    }

    @Override // o0000O0O.OooO
    public final int OooooOO(long j) {
        return MathKt.roundToInt(oo000o(j));
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ int OoooooO(float f) {
        return OooO0o.OooO00o(this, f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f40207Oooo0o.getDensity().getDensity();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f40207Oooo0o.getLayoutDirection();
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long o00ooo(long j) {
        return OooO0o.OooO0Oo(this, j);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ float oo000o(long j) {
        return OooO0o.OooO0OO(this, j);
    }
}
