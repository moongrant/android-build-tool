package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f17467Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f17468Oooo0oO;

    public OooO00o(NavigationBarItemView navigationBarItemView, float f) {
        this.f17468Oooo0oO = navigationBarItemView;
        this.f17467Oooo0o = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        NavigationBarItemView navigationBarItemView = this.f17468Oooo0oO;
        float f = this.f17467Oooo0o;
        int[] iArr = NavigationBarItemView.f17370o00Ooo;
        navigationBarItemView.OooO0o0(fFloatValue, f);
    }
}
