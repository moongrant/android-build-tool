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
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Drawable f17142OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f17143OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Rect f17144OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Rect f17145OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f17146OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f17147OooOo0o;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17142OooOOoo;
        if (drawable != null) {
            if (this.f17143OooOo) {
                this.f17143OooOo = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f17147OooOo0o;
                Rect rect = this.f17145OooOo00;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f17146OooOo0O;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f17144OooOo0;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
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
        Drawable drawable = this.f17142OooOOoo;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17142OooOOoo;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17142OooOOoo.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f17142OooOOoo;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f17146OooOo0O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17142OooOOoo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f17143OooOo = z | this.f17143OooOo;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17143OooOo = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17142OooOOoo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17142OooOOoo);
            }
            this.f17142OooOOoo = drawable;
            this.f17143OooOo = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17146OooOo0O == 119) {
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
        if (this.f17146OooOo0O != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f17146OooOo0O = i;
            if (i == 119 && this.f17142OooOOoo != null) {
                this.f17142OooOOoo.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17142OooOOoo;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17145OooOo00 = new Rect();
        this.f17144OooOo0 = new Rect();
        this.f17146OooOo0O = 119;
        this.f17147OooOo0o = true;
        this.f17143OooOo = false;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.ForegroundLinearLayout, i, 0, new int[0]);
        this.f17146OooOo0O = typedArrayOooO0Oo.getInt(o000OO.ForegroundLinearLayout_android_foregroundGravity, this.f17146OooOo0O);
        Drawable drawable = typedArrayOooO0Oo.getDrawable(o000OO.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17147OooOo0o = typedArrayOooO0Oo.getBoolean(o000OO.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayOooO0Oo.recycle();
    }
}
