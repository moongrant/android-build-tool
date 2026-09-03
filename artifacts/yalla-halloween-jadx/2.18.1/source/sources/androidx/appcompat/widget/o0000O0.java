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

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f5366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TypedArray f5367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TypedValue f5368OooO0OO;

    public o0000O0(Context context, TypedArray typedArray) {
        this.f5366OooO00o = context;
        this.f5367OooO0O0 = typedArray;
    }

    public static o0000O0 OooOOo(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new o0000O0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static o0000O0 OooOOo0(Context context, AttributeSet attributeSet, int[] iArr) {
        return new o0000O0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    @Nullable
    public final Typeface OooO(@StyleableRes int i, int i2, @Nullable androidx.core.content.res.OooO00o.OooO oooO) {
        int resourceId = this.f5367OooO0O0.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f5368OooO0OO == null) {
            this.f5368OooO0OO = new TypedValue();
        }
        Context context = this.f5366OooO00o;
        TypedValue typedValue = this.f5368OooO0OO;
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
        if (context.isRestricted()) {
            return null;
        }
        return androidx.core.content.res.OooO00o.OooO0O0(context, resourceId, typedValue, i2, oooO, true, false);
    }

    public final boolean OooO00o(int i, boolean z) {
        return this.f5367OooO0O0.getBoolean(i, z);
    }

    public final int OooO0O0(int i) {
        return this.f5367OooO0O0.getColor(i, 0);
    }

    public final ColorStateList OooO0OO(int i) {
        int resourceId;
        ColorStateList colorStateListOooO00o;
        return (!this.f5367OooO0O0.hasValue(i) || (resourceId = this.f5367OooO0O0.getResourceId(i, 0)) == 0 || (colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(this.f5366OooO00o, resourceId)) == null) ? this.f5367OooO0O0.getColorStateList(i) : colorStateListOooO00o;
    }

    public final float OooO0Oo(int i) {
        return this.f5367OooO0O0.getDimension(i, -1.0f);
    }

    public final int OooO0o(int i, int i2) {
        return this.f5367OooO0O0.getDimensionPixelSize(i, i2);
    }

    public final int OooO0o0(int i, int i2) {
        return this.f5367OooO0O0.getDimensionPixelOffset(i, i2);
    }

    public final Drawable OooO0oO(int i) {
        int resourceId;
        return (!this.f5367OooO0O0.hasValue(i) || (resourceId = this.f5367OooO0O0.getResourceId(i, 0)) == 0) ? this.f5367OooO0O0.getDrawable(i) : p012OooOo0.OooOO0O.OooO0O0(this.f5366OooO00o, resourceId);
    }

    public final Drawable OooO0oo(int i) {
        int resourceId;
        Drawable drawableOooO0oO;
        if (!this.f5367OooO0O0.hasValue(i) || (resourceId = this.f5367OooO0O0.getResourceId(i, 0)) == 0) {
            return null;
        }
        OooOO0O oooOO0OOooO00o = OooOO0O.OooO00o();
        Context context = this.f5366OooO00o;
        synchronized (oooOO0OOooO00o) {
            drawableOooO0oO = oooOO0OOooO00o.f5088OooO00o.OooO0oO(context, resourceId, true);
        }
        return drawableOooO0oO;
    }

    public final int OooOO0(int i, int i2) {
        return this.f5367OooO0O0.getInt(i, i2);
    }

    public final int OooOO0O(int i, int i2) {
        return this.f5367OooO0O0.getInteger(i, i2);
    }

    public final int OooOO0o(int i, int i2) {
        return this.f5367OooO0O0.getLayoutDimension(i, i2);
    }

    public final String OooOOO(int i) {
        return this.f5367OooO0O0.getString(i);
    }

    public final int OooOOO0(int i, int i2) {
        return this.f5367OooO0O0.getResourceId(i, i2);
    }

    public final CharSequence OooOOOO(int i) {
        return this.f5367OooO0O0.getText(i);
    }

    public final boolean OooOOOo(int i) {
        return this.f5367OooO0O0.hasValue(i);
    }

    public final void OooOOoo() {
        this.f5367OooO0O0.recycle();
    }
}
