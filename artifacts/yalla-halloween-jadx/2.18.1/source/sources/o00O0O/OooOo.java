package o00O0O;

import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {
    @Stable
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        return jFloatToIntBits;
    }

    public static final long OooO0O0(long j) {
        return OooOO0.OooO00o(OooOo00.OooO0Oo(j) / 2.0f, OooOo00.OooO0O0(j) / 2.0f);
    }

    @Stable
    @NotNull
    public static final OooOO0O OooO0OO(long j) {
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return OooOOO0.OooO00o(OooO.f30392OooO0OO, j);
    }
}
