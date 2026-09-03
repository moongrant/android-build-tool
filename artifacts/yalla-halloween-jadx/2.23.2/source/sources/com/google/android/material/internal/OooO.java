package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Drawable f16725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Drawable f16726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float[] f16727OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f16728OooO0Oo;

    public OooO(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f16725OooO00o = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.f16726OooO0O0 = drawableMutate;
        drawableMutate.setAlpha(0);
        this.f16727OooO0OO = new float[2];
    }

    public final void OooO00o(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f16728OooO0Oo != f) {
            this.f16728OooO0Oo = f;
            float[] fArr = this.f16727OooO0OO;
            if (f <= 0.5f) {
                fArr[0] = 1.0f - (f * 2.0f);
                fArr[1] = 0.0f;
            } else {
                fArr[0] = 0.0f;
                fArr[1] = (f * 2.0f) - 1.0f;
            }
            this.f16725OooO00o.setAlpha((int) (fArr[0] * 255.0f));
            this.f16726OooO0O0.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        this.f16725OooO00o.draw(canvas);
        this.f16726OooO0O0.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f16725OooO00o.getIntrinsicHeight(), this.f16726OooO0O0.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f16725OooO00o.getIntrinsicWidth(), this.f16726OooO0O0.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f16725OooO00o.getMinimumHeight(), this.f16726OooO0O0.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f16725OooO00o.getMinimumWidth(), this.f16726OooO0O0.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f16725OooO00o.isStateful() || this.f16726OooO0O0.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = this.f16728OooO0Oo;
        Drawable drawable = this.f16726OooO0O0;
        Drawable drawable2 = this.f16725OooO00o;
        if (f <= 0.5f) {
            drawable2.setAlpha(i);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f16725OooO00o.setBounds(i, i2, i3, i4);
        this.f16726OooO0O0.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f16725OooO00o.setColorFilter(colorFilter);
        this.f16726OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f16725OooO00o.setState(iArr) || this.f16726OooO0O0.setState(iArr);
    }
}
