package o0000O0O;

import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements OooO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27303Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f27304Oooo0oO;

    public OooOO0(float f, float f2) {
        this.f27303Oooo0o = f;
        this.f27304Oooo0oO = f2;
    }

    @Override // o0000O0O.OooO
    public final float OooO0o0(int i) {
        return i / this.f27303Oooo0o;
    }

    @Override // o0000O0O.OooO
    public final long OooOoOO(float f) {
        return o00Oo0.OooO0O0(f / this.f27304Oooo0oO);
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
        return this.f27304Oooo0oO;
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

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO1 = (OooOO0) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f27303Oooo0o), (Object) Float.valueOf(oooOO1.f27303Oooo0o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f27304Oooo0oO), (Object) Float.valueOf(oooOO1.f27304Oooo0oO));
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f27303Oooo0o;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f27304Oooo0oO) + (Float.floatToIntBits(this.f27303Oooo0o) * 31);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ long o00ooo(long j) {
        return OooO0o.OooO0Oo(this, j);
    }

    @Override // o0000O0O.OooO
    public final /* synthetic */ float oo000o(long j) {
        return OooO0o.OooO0OO(this, j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DensityImpl(density=");
        sbOooO0o0.append(this.f27303Oooo0o);
        sbOooO0o0.append(", fontScale=");
        return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f27304Oooo0oO, ')');
    }
}
