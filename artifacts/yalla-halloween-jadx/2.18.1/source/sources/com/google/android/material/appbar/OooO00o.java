package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MaterialShapeDrawable f16457Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16458Oooo0oO;

    public OooO00o(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable) {
        this.f16458Oooo0oO = appBarLayout;
        this.f16457Oooo0o = materialShapeDrawable;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO>] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f16457Oooo0o.OooOOOO(fFloatValue);
        Drawable drawable = this.f16458Oooo0oO.f16381OooooO0;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).OooOOOO(fFloatValue);
        }
        for (AppBarLayout.OooO oooO : this.f16458Oooo0oO.f16379Ooooo00) {
            int i = this.f16457Oooo0o.f17529Oooooo0;
            oooO.onUpdate();
        }
    }
}
