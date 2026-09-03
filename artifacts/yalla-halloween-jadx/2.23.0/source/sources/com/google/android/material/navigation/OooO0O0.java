package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f17451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f17452OooO0o0;

    public OooO0O0(NavigationBarItemView navigationBarItemView, float f) {
        this.f17452OooO0o0 = navigationBarItemView;
        this.f17451OooO0Oo = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.f17355Oooo00o;
        this.f17452OooO0o0.OooO0O0(fFloatValue, this.f17451OooO0Oo);
    }
}
