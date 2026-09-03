package o0000O0O;

import androidx.compose.runtime.Stable;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    @Stable
    public static int OooO00o(OooO oooO, float f) {
        float fOoooOoo = oooO.OoooOoo(f);
        if (Float.isInfinite(fOoooOoo)) {
            return Integer.MAX_VALUE;
        }
        return MathKt.roundToInt(fOoooOoo);
    }

    @Stable
    public static long OooO0O0(OooO oooO, long j) {
        o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
        if (j != o00O0O.OooOo00.f30418OooO0Oo) {
            return OooOOO.OooO0O0(oooO.OoooOO0(o00O0O.OooOo00.OooO0Oo(j)), oooO.OoooOO0(o00O0O.OooOo00.OooO0O0(j)));
        }
        OooOo00.OooO00o oooO00o2 = OooOo00.f27313OooO0O0;
        return OooOo00.f27315OooO0Oo;
    }

    @Stable
    public static float OooO0OO(OooO oooO, long j) {
        if (!o00Ooo.OooO00o(o00O0O.OooO0O0(j), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return oooO.getDensity() * oooO.OoooOOo() * o00O0O.OooO0OO(j);
    }

    @Stable
    public static long OooO0Oo(OooO oooO, long j) {
        OooOo00.OooO00o oooO00o = OooOo00.f27313OooO0O0;
        if (j != OooOo00.f27315OooO0Oo) {
            return o00O0O.OooOo.OooO00o(oooO.OoooOoo(OooOo00.OooO0O0(j)), oooO.OoooOoo(OooOo00.OooO00o(j)));
        }
        o00O0O.OooOo00.OooO00o oooO00o2 = o00O0O.OooOo00.f30416OooO0O0;
        return o00O0O.OooOo00.f30418OooO0Oo;
    }
}
