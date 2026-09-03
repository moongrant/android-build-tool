package o0O0O00;

import androidx.compose.runtime.Stable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo {
    @Stable
    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = o000O0.f35263OooO0O0;
        return jFloatToIntBits;
    }

    @Stable
    public static final long OooO0O0(long j, long j2) {
        return o00O0O.OooOo.OooO00o(o000O0.OooO00o(j2) * o00O0O.OooOo00.OooO0Oo(j), o000O0.OooO0O0(j2) * o00O0O.OooOo00.OooO0O0(j));
    }
}
