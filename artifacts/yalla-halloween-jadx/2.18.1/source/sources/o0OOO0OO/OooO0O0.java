package o0OOO0OO;

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
import kotlin.KotlinVersion;
import p071o000O0o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f38129OooO00o = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f38130OooO0O0 = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f38131OooO0OO = {R.attr.state_selected};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f38132OooO0Oo = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public static final String f38133OooO0o0 = OooO0O0.class.getSimpleName();

    @NonNull
    public static ColorStateList OooO00o(@Nullable ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f38131OooO0OO, StateSet.NOTHING}, new int[]{OooO0O0(colorStateList, f38130OooO0O0), OooO0O0(colorStateList, f38129OooO00o)});
    }

    @ColorInt
    public static int OooO0O0(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return OooO0o.OooO0o0(colorForState, Math.min(Color.alpha(colorForState) * 2, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    @NonNull
    public static ColorStateList OooO0OO(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f38132OooO0Oo, 0)) != 0) {
            Log.w(f38133OooO0o0, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
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
