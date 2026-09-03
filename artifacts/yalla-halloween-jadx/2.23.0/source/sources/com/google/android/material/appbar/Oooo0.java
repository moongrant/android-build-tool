package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f16278OooO0Oo;

    public Oooo0(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f16278OooO0Oo = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f16278OooO0Oo.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
