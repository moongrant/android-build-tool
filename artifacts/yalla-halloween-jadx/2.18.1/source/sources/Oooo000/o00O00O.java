package Oooo000;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O00O implements p023Oooo00O.o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f933OooO00o;

    public o00O00O(@NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f933OooO00o = new o000O0Oo(oOO00O.f998OooO00o, density);
    }

    @Override // p023Oooo00O.o0000O
    public final void OooO00o() {
    }

    @Override // p023Oooo00O.o0000O
    public final long OooO0O0(float f) {
        return ((long) (Math.exp(this.f933OooO00o.OooO0O0(f) / (((double) o000OO0O.f881OooO00o) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p023Oooo00O.o0000O
    public final float OooO0OO(float f, float f2) {
        o000O0Oo o000o0oo2 = this.f933OooO00o;
        double dOooO0O0 = o000o0oo2.OooO0O0(f2);
        double d = o000OO0O.f881OooO00o;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dOooO0O0) * ((double) (o000o0oo2.f872OooO00o * o000o0oo2.f874OooO0OO))))) + f;
    }

    @Override // p023Oooo00O.o0000O
    public final float OooO0Oo(long j, float f) {
        long j2 = j / 1000000;
        o000O0Oo.OooO00o OooO00o2 = this.f933OooO00o.OooO00o(f);
        long j3 = OooO00o2.f877OooO0OO;
        return (((Math.signum(OooO00o2.f875OooO00o) * OooO0OO.f797OooO00o.OooO00o(j3 > 0 ? j2 / j3 : 1.0f).f800OooO0O0) * OooO00o2.f876OooO0O0) / OooO00o2.f877OooO0OO) * 1000.0f;
    }

    @Override // p023Oooo00O.o0000O
    public final float OooO0o0(long j, float f, float f2) {
        long j2 = j / 1000000;
        o000O0Oo.OooO00o OooO00o2 = this.f933OooO00o.OooO00o(f2);
        long j3 = OooO00o2.f877OooO0OO;
        return (Math.signum(OooO00o2.f875OooO00o) * OooO00o2.f876OooO0O0 * OooO0OO.f797OooO00o.OooO00o(j3 > 0 ? j2 / j3 : 1.0f).f799OooO00o) + f;
    }
}
