package p052o00000oO;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<double[]> f33475OooO00o = new ThreadLocal<>();

    @ColorInt
    public static int OooO00o(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) double d2, @FloatRange(from = 0.0d, to = 108.883d) double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double dPow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double dPow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    @ColorInt
    public static int OooO0O0(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f, @ColorInt int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static int OooO0OO(@ColorInt int i, @ColorInt int i2) {
        int i3;
        int i4;
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i5 = 255 - iAlpha2;
        int i6 = 255 - (((255 - iAlpha) * i5) / 255);
        int iRed = Color.red(i);
        int iRed2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((iRed2 * iAlpha) * i5) + ((iRed * 255) * iAlpha2)) / (i6 * 255);
        }
        int iGreen = Color.green(i);
        int iGreen2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((iGreen2 * iAlpha) * i5) + ((iGreen * 255) * iAlpha2)) / (i6 * 255);
        }
        int iBlue = Color.blue(i);
        int iBlue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((iBlue2 * iAlpha) * i5) + ((iBlue * 255) * iAlpha2)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    @ColorInt
    public static int OooO0Oo(@ColorInt int i, @IntRange(from = ULong.MIN_VALUE, to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
