package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    static {
        DrawScope.Companion companion = DrawScope.INSTANCE;
    }

    public static void OooO00o(DrawScope drawScope, @NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        OooOoO(drawScope, image, j, j2, j3, j4, f, style, colorFilter, i, 0, ConstantsKt.MINIMUM_BLOCK_SIZE, null);
    }

    public static long OooO0O0(DrawScope drawScope) {
        return SizeKt.m1526getCenteruvyYCjk(drawScope.getDrawContext().mo2124getSizeNHjbRc());
    }

    public static long OooO0OO(DrawScope drawScope) {
        return drawScope.getDrawContext().mo2124getSizeNHjbRc();
    }

    public static long OooO0Oo(DrawScope drawScope, long j, long j2) {
        return SizeKt.Size(Size.m1516getWidthimpl(j) - Offset.m1447getXimpl(j2), Size.m1513getHeightimpl(j) - Offset.m1448getYimpl(j2));
    }

    public static /* synthetic */ void OooOo(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo2101drawCircleVaOC9Bg(j, (i2 & 2) != 0 ? Size.m1515getMinDimensionimpl(drawScope.mo2118getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo2117getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOo0(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j;
        drawScope.mo2098drawArcillE91I(brush, f, f2, z, jM1463getZeroF1C5BW0, (i2 & 32) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j2, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : colorFilter, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOo0O(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j2;
        drawScope.mo2099drawArcyD3GUKo(j, f, f2, z, jM1463getZeroF1C5BW0, (i2 & 32) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : colorFilter, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOo0o(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo2100drawCircleV9BoPsw(brush, (i2 & 2) != 0 ? Size.m1515getMinDimensionimpl(drawScope.mo2118getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo2117getCenterF1C5BW0() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOoO(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM3903getZeronOccac = (i3 & 2) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j;
        long jIntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo2103drawImageAZ2fEMs(imageBitmap, jM3903getZeronOccac, jIntSize, (i3 & 8) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j3, (i3 & 16) != 0 ? jIntSize : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? DrawScope.INSTANCE.m2149getDefaultFilterQualityfv9h1I() : i2);
    }

    public static /* synthetic */ void OooOoO0(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM3903getZeronOccac = (i2 & 2) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j;
        long jIntSize = (i2 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo2102drawImage9jGpkUE(imageBitmap, jM3903getZeronOccac, jIntSize, (i2 & 8) != 0 ? IntOffset.INSTANCE.m3903getZeronOccac() : j3, (i2 & 16) != 0 ? jIntSize : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 128) != 0 ? null : colorFilter, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOoOO(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo2104drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOoo(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo2106drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m2207getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void OooOoo0(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo2105drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m2207getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void OooOooO(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j;
        drawScope.mo2107drawOvalAsUm42w(brush, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void OooOooo(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j2;
        drawScope.mo2108drawOvalnJ9OG0(j, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void Oooo0(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo2112drawPointsGsft0Ws(list, i, brush, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.INSTANCE.m2005getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i3);
    }

    public static /* synthetic */ void Oooo000(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo2109drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
    }

    public static /* synthetic */ void Oooo00O(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo2110drawPathLG529CI(path, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void Oooo00o(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo2111drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.INSTANCE.m2005getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i3);
    }

    public static /* synthetic */ void Oooo0O0(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j;
        drawScope.mo2113drawRectAsUm42w(brush, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void Oooo0OO(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j2;
        drawScope.mo2114drawRectnJ9OG0(j, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void Oooo0o(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j2;
        drawScope.mo2116drawRoundRectuAw5IA(j, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m1432getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void Oooo0o0(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM1463getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1463getZeroF1C5BW0() : j;
        drawScope.mo2115drawRoundRectZuiqVtQ(brush, jM1463getZeroF1C5BW0, (i2 & 4) != 0 ? OooO0Oo(drawScope, drawScope.mo2118getSizeNHjbRc(), jM1463getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m1432getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? DrawScope.INSTANCE.m2148getDefaultBlendMode0nO6VwU() : i);
    }
}
