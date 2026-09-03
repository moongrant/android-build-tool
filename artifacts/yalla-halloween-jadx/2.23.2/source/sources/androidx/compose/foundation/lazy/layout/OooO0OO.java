package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO {
    @Stable
    public static float OooO00o(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (!TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(j), TextUnitType.INSTANCE.m3989getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m3775constructorimpl(lazyLayoutMeasureScope.getFontScale() * TextUnit.m3956getValueimpl(j));
    }

    @Stable
    public static float OooO0O0(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return Dp.m3775constructorimpl(f / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static float OooO0OO(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return Dp.m3775constructorimpl(i / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static long OooO0Oo(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (j > Size.INSTANCE.m1524getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m1524getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m3797DpSizeYgX7TsA(lazyLayoutMeasureScope.mo322toDpu2uoSUM(Size.m1516getWidthimpl(j)), lazyLayoutMeasureScope.mo322toDpu2uoSUM(Size.m1513getHeightimpl(j))) : DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static long OooO0o(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / lazyLayoutMeasureScope.getFontScale());
    }

    @Stable
    public static long OooO0o0(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (j > DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(lazyLayoutMeasureScope.mo326toPx0680j_4(DpSize.m3873getWidthD9Ej5fM(j)), lazyLayoutMeasureScope.mo326toPx0680j_4(DpSize.m3871getHeightD9Ej5fM(j))) : Size.INSTANCE.m1524getUnspecifiedNHjbRc();
    }

    @Stable
    public static long OooO0oO(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }

    @Stable
    public static long OooO0oo(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        return TextUnitKt.getSp(i / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }
}
