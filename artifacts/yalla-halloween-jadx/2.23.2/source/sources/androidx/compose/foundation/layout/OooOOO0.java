package androidx.compose.foundation.layout;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 {
    public static float OooO00o(SideCalculator sideCalculator, float f, float f2) {
        return RangesKt.coerceAtMost(sideCalculator.motionOf(f, f2), 0.0f);
    }

    public static float OooO0O0(SideCalculator sideCalculator, float f, float f2) {
        return RangesKt.coerceAtLeast(sideCalculator.motionOf(f, f2), 0.0f);
    }
}
