package o0000O0O;

import kotlin.PublishedApi;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {
    public static final long OooO00o(double d) {
        return OooO0o0(4294967296L, (float) d);
    }

    public static final long OooO0O0(float f) {
        return OooO0o0(4294967296L, f);
    }

    public static final long OooO0OO(int i) {
        return OooO0o0(4294967296L, i);
    }

    public static final boolean OooO0Oo(long j) {
        o00O0O.OooO00o oooO00o = o00O0O.f27323OooO0O0;
        return (j & 1095216660480L) == 0;
    }

    @PublishedApi
    public static final long OooO0o0(long j, float f) {
        long jFloatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        o00O0O.OooO00o oooO00o = o00O0O.f27323OooO0O0;
        return jFloatToIntBits;
    }
}
