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
        return new Rect(density.mo324toPx0680j_4(dpRect.m3848getLeftD9Ej5fM()), density.mo324toPx0680j_4(dpRect.m3850getTopD9Ej5fM()), density.mo324toPx0680j_4(dpRect.m3849getRightD9Ej5fM()), density.mo324toPx0680j_4(dpRect.m3847getBottomD9Ej5fM()));
    }

    @Stable
    public static int OooO00o(Density density, long j) {
        return MathKt.roundToInt(density.mo323toPxR2X_6o(j));
    }

    @Stable
    public static int OooO0O0(Density density, float f) {
        float fMo324toPx0680j_4 = density.mo324toPx0680j_4(f);
        if (Float.isInfinite(fMo324toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt.roundToInt(fMo324toPx0680j_4);
    }

    @Stable
    public static float OooO0OO(Density density, long j) {
        if (!TextUnitType.m3974equalsimpl0(TextUnit.m3945getTypeUIouoOA(j), TextUnitType.INSTANCE.m3979getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m3765constructorimpl(density.getFontScale() * TextUnit.m3946getValueimpl(j));
    }

    @Stable
    public static float OooO0Oo(Density density, float f) {
        return Dp.m3765constructorimpl(f / density.getDensity());
    }

    @Stable
    public static long OooO0o(Density density, long j) {
        return (j > Size.INSTANCE.m1513getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m1513getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m3787DpSizeYgX7TsA(density.mo320toDpu2uoSUM(Size.m1505getWidthimpl(j)), density.mo320toDpu2uoSUM(Size.m1502getHeightimpl(j))) : DpSize.INSTANCE.m3872getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static float OooO0o0(Density density, int i) {
        return Dp.m3765constructorimpl(i / density.getDensity());
    }

    @Stable
    public static float OooO0oO(Density density, long j) {
        if (!TextUnitType.m3974equalsimpl0(TextUnit.m3945getTypeUIouoOA(j), TextUnitType.INSTANCE.m3979getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return density.getDensity() * density.getFontScale() * TextUnit.m3946getValueimpl(j);
    }

    @Stable
    public static float OooO0oo(Density density, float f) {
        return density.getDensity() * f;
    }

    @Stable
    public static long OooOO0(Density density, long j) {
        return (j > DpSize.INSTANCE.m3872getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m3872getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(density.mo324toPx0680j_4(DpSize.m3863getWidthD9Ej5fM(j)), density.mo324toPx0680j_4(DpSize.m3861getHeightD9Ej5fM(j))) : Size.INSTANCE.m1513getUnspecifiedNHjbRc();
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
