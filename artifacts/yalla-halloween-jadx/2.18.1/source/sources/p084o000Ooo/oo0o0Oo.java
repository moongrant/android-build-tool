package p084o000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class oo0o0Oo extends Drawable implements Drawable.Callback, o0OO00O, o0Oo0oo {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final PorterDuff.Mode f28385OoooO0O = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o000OOo f28386Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f28387Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public PorterDuff.Mode f28388Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f28389Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f28390OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f28391OoooO00;

    public oo0o0Oo(@NonNull o000OOo o000ooo2, @Nullable Resources resources) {
        Drawable.ConstantState constantState;
        this.f28386Oooo = o000ooo2;
        if (o000ooo2 == null || (constantState = o000ooo2.f28377OooO0O0) == null) {
            return;
        }
        OooO00o(constantState.newDrawable(resources));
    }

    @Override // p084o000Ooo.o0OO00O
    public final void OooO00o(Drawable drawable) {
        Drawable drawable2 = this.f28390OoooO0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f28390OoooO0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o000OOo o000ooo2 = this.f28386Oooo;
            if (o000ooo2 != null) {
                o000ooo2.f28377OooO0O0 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p084o000Ooo.o0OO00O
    public final Drawable OooO0O0() {
        return this.f28390OoooO0;
    }

    public boolean OooO0OO() {
        throw null;
    }

    public final boolean OooO0Oo(int[] iArr) {
        if (!OooO0OO()) {
            return false;
        }
        o000OOo o000ooo2 = this.f28386Oooo;
        ColorStateList colorStateList = o000ooo2.f28378OooO0OO;
        PorterDuff.Mode mode = o000ooo2.f28379OooO0Oo;
        if (colorStateList == null || mode == null) {
            this.f28389Oooo0oo = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f28389Oooo0oo || colorForState != this.f28387Oooo0o || mode != this.f28388Oooo0oO) {
                setColorFilter(colorForState, mode);
                this.f28387Oooo0o = colorForState;
                this.f28388Oooo0oO = mode;
                this.f28389Oooo0oo = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        this.f28390OoooO0.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o000OOo o000ooo2 = this.f28386Oooo;
        return changingConfigurations | (o000ooo2 != null ? o000ooo2.getChangingConfigurations() : 0) | this.f28390OoooO0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        o000OOo o000ooo2 = this.f28386Oooo;
        if (o000ooo2 == null) {
            return null;
        }
        if (!(o000ooo2.f28377OooO0O0 != null)) {
            return null;
        }
        o000ooo2.f28376OooO00o = getChangingConfigurations();
        return this.f28386Oooo;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable getCurrent() {
        return this.f28390OoooO0.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28390OoooO0.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28390OoooO0.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public final int getLayoutDirection() {
        return o0OOO0o.OooO0O0(this.f28390OoooO0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f28390OoooO0.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f28390OoooO0.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f28390OoooO0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        return this.f28390OoooO0.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final int[] getState() {
        return this.f28390OoooO0.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f28390OoooO0.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public final boolean isAutoMirrored() {
        return o0OOO0o.OooO00o.OooO0Oo(this.f28390OoooO0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        o000OOo o000ooo2;
        ColorStateList colorStateList = (!OooO0OO() || (o000ooo2 = this.f28386Oooo) == null) ? null : o000ooo2.f28378OooO0OO;
        return (colorStateList != null && colorStateList.isStateful()) || this.f28390OoooO0.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f28390OoooO0.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        if (!this.f28391OoooO00 && super.mutate() == this) {
            this.f28386Oooo = new o000OOo(this.f28386Oooo);
            Drawable drawable = this.f28390OoooO0;
            if (drawable != null) {
                drawable.mutate();
            }
            o000OOo o000ooo2 = this.f28386Oooo;
            if (o000ooo2 != null) {
                Drawable drawable2 = this.f28390OoooO0;
                o000ooo2.f28377OooO0O0 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f28391OoooO00 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28390OoooO0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public final boolean onLayoutDirectionChanged(int i) {
        return o0OOO0o.OooO0OO(this.f28390OoooO0, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f28390OoooO0.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f28390OoooO0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public final void setAutoMirrored(boolean z) {
        o0OOO0o.OooO00o.OooO0o0(this.f28390OoooO0, z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f28390OoooO0.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28390OoooO0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f28390OoooO0.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f28390OoooO0.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return OooO0Oo(iArr) || this.f28390OoooO0.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f28386Oooo.f28378OooO0OO = colorStateList;
        OooO0Oo(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f28386Oooo.f28379OooO0Oo = mode;
        OooO0Oo(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f28390OoooO0.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public oo0o0Oo(@Nullable Drawable drawable) {
        this.f28386Oooo = new o000OOo(this.f28386Oooo);
        OooO00o(drawable);
    }
}
