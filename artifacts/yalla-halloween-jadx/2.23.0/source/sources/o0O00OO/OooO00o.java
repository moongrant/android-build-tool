package o0O00OO;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import p052o00000oO.OooOOO;
import p545o0oO0Ooo.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {
    public static float OooO00o(int i, String[] strArr) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean OooO0O0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int OooO0OO(@AttrRes int i, @NonNull Context context, int i2) {
        TypedValue typedValueOooO00o = b1.OooO00o(i, context);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 16) ? i2 : typedValueOooO00o.data;
    }

    @NonNull
    public static TimeInterpolator OooO0Oo(@NonNull Context context, @AttrRes int i, @NonNull Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!(OooO0O0(strValueOf, "cubic-bezier") || OooO0O0(strValueOf, "path"))) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!OooO0O0(strValueOf, "cubic-bezier")) {
            if (OooO0O0(strValueOf, "path")) {
                return o0000OO0.OooO00o.OooO0OO(OooOOO.OooO0Oo(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return o0000OO0.OooO00o.OooO0O0(OooO00o(0, strArrSplit), OooO00o(1, strArrSplit), OooO00o(2, strArrSplit), OooO00o(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}
