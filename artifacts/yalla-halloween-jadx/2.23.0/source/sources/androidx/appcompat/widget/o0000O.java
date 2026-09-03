package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f3234OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f3235OooO0O0 = {-16842910};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f3236OooO0OO = {R.attr.state_focused};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f3237OooO0Oo = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f3239OooO0o0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f3238OooO0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f3240OooO0oO = new int[1];

    public static void OooO00o(@NonNull Context context, @NonNull View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p012OooOo0O.o00O0O.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(p012OooOo0O.o00O0O.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int OooO0O0(int i, @NonNull Context context) {
        ColorStateList colorStateListOooO0Oo = OooO0Oo(i, context);
        if (colorStateListOooO0Oo != null && colorStateListOooO0Oo.isStateful()) {
            return colorStateListOooO0Oo.getColorForState(f3235OooO0O0, colorStateListOooO0Oo.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f3234OooO00o;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iOooO0OO = OooO0OO(i, context);
        return p052o00000oO.OooOO0.OooO0Oo(iOooO0OO, Math.round(Color.alpha(iOooO0OO) * f));
    }

    public static int OooO0OO(int i, @NonNull Context context) {
        int[] iArr = f3240OooO0oO;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public static ColorStateList OooO0Oo(int i, @NonNull Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3240OooO0oO;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = ContextCompat.OooO0O0(resourceId, context)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
