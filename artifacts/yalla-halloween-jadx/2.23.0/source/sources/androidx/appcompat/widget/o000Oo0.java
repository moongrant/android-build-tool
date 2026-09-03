package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f3325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TypedArray f3326OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TypedValue f3327OooO0OO;

    public o000Oo0(Context context, TypedArray typedArray) {
        this.f3325OooO00o = context;
        this.f3326OooO0O0 = typedArray;
    }

    public static o000Oo0 OooOOO0(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new o000Oo0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final int OooO(int i, int i2) {
        return this.f3326OooO0O0.getResourceId(i, i2);
    }

    public final boolean OooO00o(int i, boolean z) {
        return this.f3326OooO0O0.getBoolean(i, z);
    }

    public final ColorStateList OooO0O0(int i) {
        int resourceId;
        ColorStateList colorStateListOooO0O0;
        TypedArray typedArray = this.f3326OooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO0O0 = ContextCompat.OooO0O0(resourceId, this.f3325OooO00o)) == null) ? typedArray.getColorStateList(i) : colorStateListOooO0O0;
    }

    public final int OooO0OO(int i, int i2) {
        return this.f3326OooO0O0.getDimensionPixelOffset(i, i2);
    }

    public final int OooO0Oo(int i, int i2) {
        return this.f3326OooO0O0.getDimensionPixelSize(i, i2);
    }

    public final Drawable OooO0o(int i) {
        int resourceId;
        Drawable drawableOooO0oO;
        if (!this.f3326OooO0O0.hasValue(i) || (resourceId = this.f3326OooO0O0.getResourceId(i, 0)) == 0) {
            return null;
        }
        OooOOO0 oooOOO0OooO00o = OooOOO0.OooO00o();
        Context context = this.f3325OooO00o;
        synchronized (oooOOO0OooO00o) {
            drawableOooO0oO = oooOOO0OooO00o.f2983OooO00o.OooO0oO(context, resourceId, true);
        }
        return drawableOooO0oO;
    }

    public final Drawable OooO0o0(int i) {
        int resourceId;
        TypedArray typedArray = this.f3326OooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : p013OooOo0o.o00Oo0.OooO00o(this.f3325OooO00o, resourceId);
    }

    @Nullable
    public final Typeface OooO0oO(@StyleableRes int i, int i2, @Nullable o00Oo0.OooO00o oooO00o) {
        int resourceId = this.f3326OooO0O0.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3327OooO0OO == null) {
            this.f3327OooO0OO = new TypedValue();
        }
        TypedValue typedValue = this.f3327OooO0OO;
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        Context context = this.f3325OooO00o;
        if (context.isRestricted()) {
            return null;
        }
        return androidx.core.content.res.OooO00o.OooO0OO(context, resourceId, typedValue, i2, oooO00o, true, false);
    }

    public final int OooO0oo(int i, int i2) {
        return this.f3326OooO0O0.getInt(i, i2);
    }

    public final String OooOO0(int i) {
        return this.f3326OooO0O0.getString(i);
    }

    public final CharSequence OooOO0O(int i) {
        return this.f3326OooO0O0.getText(i);
    }

    public final boolean OooOO0o(int i) {
        return this.f3326OooO0O0.hasValue(i);
    }

    public final void OooOOO() {
        this.f3326OooO0O0.recycle();
    }
}
