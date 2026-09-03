package o00O0O;

import androidx.compose.runtime.Stable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {
    @Stable
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return jFloatToIntBits;
    }

    public static final boolean OooO0O0(long j) {
        float fOooO0OO = OooO.OooO0OO(j);
        if ((Float.isInfinite(fOooO0OO) || Float.isNaN(fOooO0OO)) ? false : true) {
            float fOooO0Oo = OooO.OooO0Oo(j);
            if ((Float.isInfinite(fOooO0Oo) || Float.isNaN(fOooO0Oo)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0OO(long j) {
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return j != OooO.f30394OooO0o0;
    }
}
