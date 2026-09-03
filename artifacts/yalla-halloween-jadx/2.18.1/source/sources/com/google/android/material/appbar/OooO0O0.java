package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f16459Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16460Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f16461Oooo0oo;

    public OooO0O0(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f16461Oooo0oo = baseBehavior;
        this.f16459Oooo0o = coordinatorLayout;
        this.f16460Oooo0oO = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f16461Oooo0oo.OooOoo(this.f16459Oooo0o, this.f16460Oooo0oO, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
