package o0OOO0O;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.o0000O0;
import p337o0OO0o0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {
    @Nullable
    public static ColorStateList OooO00o(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        ColorStateList colorStateListOooO00o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListOooO00o;
    }

    @Nullable
    public static ColorStateList OooO0O0(@NonNull Context context, @NonNull o0000O0 o0000o1, @StyleableRes int i) {
        int iOooOOO0;
        ColorStateList colorStateListOooO00o;
        return (!o0000o1.OooOOOo(i) || (iOooOOO0 = o0000o1.OooOOO0(i, 0)) == 0 || (colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(context, iOooOOO0)) == null) ? o0000o1.OooO0OO(i) : colorStateListOooO00o;
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
        Drawable drawableOooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableOooO0O0 = p012OooOo0.OooOO0O.OooO0O0(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableOooO0O0;
    }

    public static int OooO0o(@NonNull Context context, @StyleRes int i) {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Oooo0.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(Oooo0.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return (Build.VERSION.SDK_INT >= 22 ? typedValue.getComplexUnit() : (typedValue.data >> 0) & 15) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    @Nullable
    public static OooO0o OooO0o0(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new OooO0o(context, resourceId);
    }

    public static boolean OooO0oO(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
