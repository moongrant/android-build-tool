package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    @Stable
    @NotNull
    public static Rect OooO(Density density, @NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(density.mo326toPx0680j_4(dpRect.m3858getLeftD9Ej5fM()), density.mo326toPx0680j_4(dpRect.m3860getTopD9Ej5fM()), density.mo326toPx0680j_4(dpRect.m3859getRightD9Ej5fM()), density.mo326toPx0680j_4(dpRect.m3857getBottomD9Ej5fM()));
    }

    @Stable
    public static int OooO00o(Density density, long j) {
        return MathKt.roundToInt(density.mo325toPxR2X_6o(j));
    }

    @Stable
    public static int OooO0O0(Density density, float f) {
        float fMo326toPx0680j_4 = density.mo326toPx0680j_4(f);
        if (Float.isInfinite(fMo326toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt.roundToInt(fMo326toPx0680j_4);
    }

    @Stable
    public static float OooO0OO(Density density, long j) {
        if (!TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(j), TextUnitType.INSTANCE.m3989getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m3775constructorimpl(density.getFontScale() * TextUnit.m3956getValueimpl(j));
    }

    @Stable
    public static float OooO0Oo(Density density, float f) {
        return Dp.m3775constructorimpl(f / density.getDensity());
    }

    @Stable
    public static long OooO0o(Density density, long j) {
        return (j > Size.INSTANCE.m1524getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m1524getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m3797DpSizeYgX7TsA(density.mo322toDpu2uoSUM(Size.m1516getWidthimpl(j)), density.mo322toDpu2uoSUM(Size.m1513getHeightimpl(j))) : DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static float OooO0o0(Density density, int i) {
        return Dp.m3775constructorimpl(i / density.getDensity());
    }

    @Stable
    public static float OooO0oO(Density density, long j) {
        if (!TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(j), TextUnitType.INSTANCE.m3989getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return density.getDensity() * density.getFontScale() * TextUnit.m3956getValueimpl(j);
    }

    @Stable
    public static float OooO0oo(Density density, float f) {
        return density.getDensity() * f;
    }

    @Stable
    public static long OooOO0(Density density, long j) {
        return (j > DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m3882getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(density.mo326toPx0680j_4(DpSize.m3873getWidthD9Ej5fM(j)), density.mo326toPx0680j_4(DpSize.m3871getHeightD9Ej5fM(j))) : Size.INSTANCE.m1524getUnspecifiedNHjbRc();
    }

    @Stable
    public static long OooOO0O(Density density, float f) {
        return TextUnitKt.getSp(f / density.getFontScale());
    }

    @Stable
    public static long OooOO0o(Density density, float f) {
        return TextUnitKt.getSp(f / (density.getDensity() * density.getFontScale()));
    }

    @Stable
    public static long OooOOO0(Density density, int i) {
        return TextUnitKt.getSp(i / (density.getDensity() * density.getFontScale()));
    }
}
