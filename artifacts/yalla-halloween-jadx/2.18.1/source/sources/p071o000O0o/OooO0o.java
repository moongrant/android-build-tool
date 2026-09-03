package p071o000O0o;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.KotlinVersion;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<double[]> f28166OooO00o = new ThreadLocal<>();

    @ColorInt
    public static int OooO00o(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = 0.0d, to = 108.883d) double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(OooO0Oo((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), OooO0Oo((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), OooO0Oo((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int OooO0O0(@ColorInt int i, @ColorInt int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i3, OooO0OO(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), OooO0OO(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), OooO0OO(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    public static int OooO0OO(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * KotlinVersion.MAX_COMPONENT_VALUE) * i2)) / (i5 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int OooO0Oo(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @ColorInt
    public static int OooO0o0(@ColorInt int i, @IntRange(from = ULong.MIN_VALUE, to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
