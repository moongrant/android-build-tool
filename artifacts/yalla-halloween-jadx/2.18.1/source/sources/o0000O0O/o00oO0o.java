package o0000O0O;

import androidx.compose.runtime.Stable;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {
    @Stable
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
        return jFloatToIntBits;
    }
}
