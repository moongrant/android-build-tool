package p084o000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0O00 extends oo0o0Oo {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static Method f28380OoooO;

    public o0O0O00(Drawable drawable) {
        super(drawable);
        OooO0o0();
    }

    @Override // p084o000Ooo.oo0o0Oo
    public final boolean OooO0OO() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f28390OoooO0;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void OooO0o0() {
        if (f28380OoooO == null) {
            try {
                f28380OoooO = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Rect getDirtyBounds() {
        return this.f28390OoooO0.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        this.f28390OoooO0.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f28390OoooO0;
        if (drawable != null && (method = f28380OoooO) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f28390OoooO0.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f28390OoooO0.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p084o000Ooo.oo0o0Oo, android.graphics.drawable.Drawable
    public final boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p084o000Ooo.oo0o0Oo, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (OooO0OO()) {
            super.setTint(i);
        } else {
            this.f28390OoooO0.setTint(i);
        }
    }

    @Override // p084o000Ooo.oo0o0Oo, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (OooO0OO()) {
            super.setTintList(colorStateList);
        } else {
            this.f28390OoooO0.setTintList(colorStateList);
        }
    }

    @Override // p084o000Ooo.oo0o0Oo, android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (OooO0OO()) {
            super.setTintMode(mode);
        } else {
            this.f28390OoooO0.setTintMode(mode);
        }
    }

    public o0O0O00(o000OOo o000ooo2, Resources resources) {
        super(o000ooo2, resources);
        OooO0o0();
    }
}
