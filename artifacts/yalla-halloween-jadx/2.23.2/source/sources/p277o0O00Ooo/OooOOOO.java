package p277o0O00Ooo;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import p052o00000oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f41031OooO00o = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f41032OooO0O0 = {R.attr.state_focused};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f41033OooO0OO = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f41034OooO0Oo = {R.attr.state_selected};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f41036OooO0o0 = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public static final String f41035OooO0o = OooOOOO.class.getSimpleName();

    @NonNull
    public static ColorStateList OooO00o(@Nullable ColorStateList colorStateList) {
        int[] iArr = f41032OooO0O0;
        return new ColorStateList(new int[][]{f41034OooO0Oo, iArr, StateSet.NOTHING}, new int[]{OooO0O0(colorStateList, f41033OooO0OO), OooO0O0(colorStateList, iArr), OooO0O0(colorStateList, f41031OooO00o)});
    }

    @ColorInt
    public static int OooO0O0(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return OooOO0.OooO0Oo(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    @NonNull
    public static ColorStateList OooO0OO(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f41036OooO0o0, 0)) != 0) {
            Log.w(f41035OooO0o, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean OooO0Oo(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
