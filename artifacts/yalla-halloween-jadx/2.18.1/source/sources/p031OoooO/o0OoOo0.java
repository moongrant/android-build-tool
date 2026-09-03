package p031OoooO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ReadOnlyComposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f2902OooO00o = new o0OoOo0();

    @Override // p031OoooO.oo000o
    @Composable
    @ReadOnlyComposable
    public final long OooO00o(long j, float f, @Nullable oOO00O ooo00o, int i) {
        OooOOO oooOOO = (OooOOO) ooo00o.OooOO0o(OooOOOO.f2586OooO00o);
        if (Float.compare(f, 0) <= 0 || oooOOO.OooO0oO()) {
            return j;
        }
        o0O0O0o0<oo000o> o0o0o0o0 = o00oO0o.f2881OooO00o;
        return o00000OO.OooO0Oo(o00000O0.OooO0OO(OooOOOO.OooO00o(j, ooo00o), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j);
    }
}
