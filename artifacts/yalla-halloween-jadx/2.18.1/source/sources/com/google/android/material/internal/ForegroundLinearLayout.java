package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public Drawable f17183Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final Rect f17184Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final Rect f17185OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f17186OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f17187OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f17188Oooooo0;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17183Ooooo00;
        if (drawable != null) {
            if (this.f17188Oooooo0) {
                this.f17188Oooooo0 = false;
                Rect rect = this.f17184Ooooo0o;
                Rect rect2 = this.f17185OooooO0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f17187OooooOo) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f17186OooooOO, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f17183Ooooo00;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17183Ooooo00;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17183Ooooo00.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f17183Ooooo00;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f17186OooooOO;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(11)
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17183Ooooo00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f17188Oooooo0 = z | this.f17188Oooooo0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17188Oooooo0 = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17183Ooooo00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17183Ooooo00);
            }
            this.f17183Ooooo00 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17186OooooOO == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f17186OooooOO != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f17186OooooOO = i;
            if (i == 119 && this.f17183Ooooo00 != null) {
                this.f17183Ooooo00.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17183Ooooo00;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17184Ooooo0o = new Rect();
        this.f17185OooooO0 = new Rect();
        this.f17186OooooOO = 119;
        this.f17187OooooOo = true;
        this.f17188Oooooo0 = false;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSet, p337o0OO0o0.Oooo0.ForegroundLinearLayout, i, 0, new int[0]);
        this.f17186OooooOO = typedArrayOooO0Oo.getInt(p337o0OO0o0.Oooo0.ForegroundLinearLayout_android_foregroundGravity, this.f17186OooooOO);
        Drawable drawable = typedArrayOooO0Oo.getDrawable(p337o0OO0o0.Oooo0.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17187OooooOo = typedArrayOooO0Oo.getBoolean(p337o0OO0o0.Oooo0.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayOooO0Oo.recycle();
    }
}
