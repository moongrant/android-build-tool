package p274o0O000oo;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import kotlin.ULong;
import p052o00000oO.OooOO0;
import p276o0O00OoO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {
    @ColorInt
    public static int OooO00o(@ColorInt int i, @IntRange(from = ULong.MIN_VALUE, to = 255) int i2) {
        return OooOO0.OooO0Oo(i, (Color.alpha(i) * i2) / 255);
    }

    @ColorInt
    public static int OooO0O0(@AttrRes int i, @NonNull Context context, @ColorInt int i2) {
        TypedValue typedValueOooO00o = OooO0OO.OooO00o(i, context);
        if (typedValueOooO00o == null) {
            return i2;
        }
        int i3 = typedValueOooO00o.resourceId;
        if (i3 == 0) {
            return typedValueOooO00o.data;
        }
        Object obj = ContextCompat.f5281OooO00o;
        return ContextCompat.OooO0o.OooO00o(context, i3);
    }

    @ColorInt
    public static int OooO0OO(@AttrRes int i, @NonNull View view) {
        Context context = view.getContext();
        TypedValue typedValueOooO0OO = OooO0OO.OooO0OO(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueOooO0OO.resourceId;
        if (i2 == 0) {
            return typedValueOooO0OO.data;
        }
        Object obj = ContextCompat.f5281OooO00o;
        return ContextCompat.OooO0o.OooO00o(context, i2);
    }

    public static boolean OooO0Oo(@ColorInt int i) {
        boolean z;
        if (i != 0) {
            ThreadLocal<double[]> threadLocal = OooOO0.f33475OooO00o;
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
            double d3 = ((double) iBlue) / 255.0d;
            double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            z = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z = false;
        }
        return z;
    }

    @ColorInt
    public static int OooO0o0(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f, @ColorInt int i2) {
        return OooOO0.OooO0OO(OooOO0.OooO0Oo(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
