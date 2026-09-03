package o00O0O;

import androidx.compose.runtime.Stable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    @Stable
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        OooO00o.C0334OooO00o c0334OooO00o = OooO00o.f30396OooO00o;
        return jFloatToIntBits;
    }
}
