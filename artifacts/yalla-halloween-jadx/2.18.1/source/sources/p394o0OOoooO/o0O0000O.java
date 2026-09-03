package p394o0OOoooO;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import kotlin.KotlinVersion;
import kotlin.ULong;
import o0OOO0O.OooO0O0;
import p071o000O0o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O {
    @ColorInt
    public static int OooO00o(@ColorInt int i, @IntRange(from = ULong.MIN_VALUE, to = 255) int i2) {
        return OooO0o.OooO0o0(i, (Color.alpha(i) * i2) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @ColorInt
    public static int OooO0O0(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        TypedValue typedValueOooO00o = OooO0O0.OooO00o(context, i);
        return typedValueOooO00o != null ? typedValueOooO00o.data : i2;
    }

    @ColorInt
    public static int OooO0OO(@NonNull View view, @AttrRes int i) {
        return OooO0O0.OooO0O0(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static boolean OooO0Oo(@ColorInt int i) {
        if (i != 0) {
            ThreadLocal<double[]> threadLocal = OooO0o.f28166OooO00o;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i);
            int iGreen = Color.green(i);
            int iBlue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = ((double) iRed) / 255.0d;
            double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) iGreen) / 255.0d;
            double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double[] dArr2 = dArr;
            double d3 = ((double) iBlue) / 255.0d;
            double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            dArr2[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr2[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (dArr2[1] / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    @ColorInt
    public static int OooO0o0(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return OooO0o.OooO0O0(OooO0o.OooO0o0(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
