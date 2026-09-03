package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f16456Oooo0o;

    public OooO(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f16456Oooo0o = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f16456Oooo0o.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
