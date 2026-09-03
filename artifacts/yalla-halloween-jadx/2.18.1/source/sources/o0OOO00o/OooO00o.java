package o0OOO00o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0OOO0O.OooO0O0;
import p016OooOoO0.OooOo00;
import p071o000O0o.OooOO0O;
import p073o000O0oO.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {
    public static float OooO00o(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean OooO0O0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int OooO0OO(@NonNull Context context, @AttrRes int i, int i2) {
        TypedValue typedValueOooO00o = OooO0O0.OooO00o(context, i);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 16) ? i2 : typedValueOooO00o.data;
    }

    @NonNull
    public static TimeInterpolator OooO0Oo(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!OooO0O0(strValueOf, "cubic-bezier")) {
            if (OooO0O0(strValueOf, "path")) {
                return OooOO0.OooO0OO(OooOO0O.OooO0Oo(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid motion easing type: ", strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return OooOO0.OooO0O0(OooO00o(strArrSplit, 0), OooO00o(strArrSplit, 1), OooO00o(strArrSplit, 2), OooO00o(strArrSplit, 3));
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        sbOooO0o0.append(strArrSplit.length);
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }
}
