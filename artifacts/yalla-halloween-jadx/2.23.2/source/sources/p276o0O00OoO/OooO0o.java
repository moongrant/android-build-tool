package p276o0O00OoO;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.content.ContextCompat;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {
    @Nullable
    public static ColorStateList OooO00o(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        ColorStateList colorStateListOooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO0O0 = ContextCompat.OooO0O0(resourceId, context)) == null) ? typedArray.getColorStateList(i) : colorStateListOooO0O0;
    }

    @Nullable
    public static ColorStateList OooO0O0(@NonNull Context context, @NonNull o000Oo0 o000oo1, @StyleableRes int i) {
        int iOooO;
        ColorStateList colorStateListOooO0O0;
        return (!o000oo1.OooOO0o(i) || (iOooO = o000oo1.OooO(i, 0)) == 0 || (colorStateListOooO0O0 = ContextCompat.OooO0O0(iOooO, context)) == null) ? o000oo1.OooO0O0(i) : colorStateListOooO0O0;
    }

    public static int OooO0OO(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable OooO0Oo(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        Drawable drawableOooO00o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableOooO00o = o00Oo0.OooO00o(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableOooO00o;
    }

    public static boolean OooO0o0(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
