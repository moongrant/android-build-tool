package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOO0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final View f16808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float[] f16809OooO0o = new float[2];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final View f16810OooO0o0;

    public OooOO0(@Nullable ActionMenuView actionMenuView, @Nullable ActionMenuView actionMenuView2) {
        this.f16808OooO0Oo = actionMenuView;
        this.f16810OooO0o0 = actionMenuView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f16809OooO0o;
        if (fFloatValue <= 0.5f) {
            fArr[0] = 1.0f - (fFloatValue * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (fFloatValue * 2.0f) - 1.0f;
        }
        View view = this.f16808OooO0Oo;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f16810OooO0o0;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
