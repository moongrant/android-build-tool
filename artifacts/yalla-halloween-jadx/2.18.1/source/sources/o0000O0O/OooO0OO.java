package o0000O0O;

import androidx.compose.runtime.Stable;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    @Stable
    public static final long OooO00o(int i, int i2, int i3, int i4) {
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 >= i3) {
            if (i >= 0 && i3 >= 0) {
                return OooO0O0.f27298OooO0O0.OooO0O0(i, i2, i3, i4);
            }
            throw new IllegalArgumentException(Oooo000.Oooo0.OooO00o("minWidth(", i, ") and minHeight(", i3, ") must be >= 0").toString());
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long OooO0O0(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return OooO00o(0, i, 0, i2);
    }

    @Stable
    public static final long OooO0OO(long j, long j2) {
        return o0OoOo0.OooO00o(RangesKt.coerceIn((int) (j2 >> 32), OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j)), RangesKt.coerceIn(o000oOoO.OooO0O0(j2), OooO0O0.OooO(j), OooO0O0.OooO0oO(j)));
    }

    public static final long OooO0Oo(long j, long j2) {
        return OooO00o(RangesKt.coerceIn(OooO0O0.OooOO0(j2), OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j)), RangesKt.coerceIn(OooO0O0.OooO0oo(j2), OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j)), RangesKt.coerceIn(OooO0O0.OooO(j2), OooO0O0.OooO(j), OooO0O0.OooO0oO(j)), RangesKt.coerceIn(OooO0O0.OooO0oO(j2), OooO0O0.OooO(j), OooO0O0.OooO0oO(j)));
    }

    @Stable
    public static final int OooO0o(long j, int i) {
        return RangesKt.coerceIn(i, OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j));
    }

    @Stable
    public static final int OooO0o0(long j, int i) {
        return RangesKt.coerceIn(i, OooO0O0.OooO(j), OooO0O0.OooO0oO(j));
    }

    @Stable
    public static final long OooO0oO(long j, int i, int i2) {
        int iCoerceAtLeast = RangesKt.coerceAtLeast(OooO0O0.OooOO0(j) + i, 0);
        int iOooO0oo = OooO0O0.OooO0oo(j);
        if (iOooO0oo != Integer.MAX_VALUE) {
            iOooO0oo = RangesKt.coerceAtLeast(iOooO0oo + i, 0);
        }
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(OooO0O0.OooO(j) + i2, 0);
        int iOooO0oO = OooO0O0.OooO0oO(j);
        if (iOooO0oO != Integer.MAX_VALUE) {
            iOooO0oO = RangesKt.coerceAtLeast(iOooO0oO + i2, 0);
        }
        return OooO00o(iCoerceAtLeast, iOooO0oo, iCoerceAtLeast2, iOooO0oO);
    }
}
