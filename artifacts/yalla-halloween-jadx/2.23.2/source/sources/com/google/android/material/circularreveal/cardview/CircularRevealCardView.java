package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public class CircularRevealCardView extends MaterialCardView implements OooO0O0 {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final CircularRevealHelper f16329OooOOoo;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public final void OooO00o() {
        this.f16329OooOOoo.getClass();
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public final void OooO0O0() {
        this.f16329OooOOoo.getClass();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.OooO00o
    public final void OooO0OO(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.OooO00o
    public final boolean OooO0Oo() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f16329OooOOoo;
        if (circularRevealHelper != null) {
            circularRevealHelper.OooO00o(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f16329OooOOoo.f16319OooO0o0;
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public int getCircularRevealScrimColor() {
        return this.f16329OooOOoo.OooO0O0();
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    @Nullable
    public OooO0O0.OooO0o getRevealInfo() {
        return this.f16329OooOOoo.OooO0OO();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f16329OooOOoo;
        return circularRevealHelper != null ? circularRevealHelper.OooO0Oo() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f16329OooOOoo.OooO0o0(drawable);
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f16329OooOOoo.OooO0o(i);
    }

    @Override // com.google.android.material.circularreveal.OooO0O0
    public void setRevealInfo(@Nullable OooO0O0.OooO0o oooO0o) {
        this.f16329OooOOoo.OooO0oO(oooO0o);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16329OooOOoo = new CircularRevealHelper(this);
    }
}
