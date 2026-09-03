package o0000O0O;

import androidx.compose.runtime.Stable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {
    @Stable
    public static final long OooO00o(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    @Stable
    public static final long OooO0O0(long j) {
        return o00O0O.OooOo.OooO00o((int) (j >> 32), o000oOoO.OooO0O0(j));
    }
}
