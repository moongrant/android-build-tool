package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f16978OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f16979OooO0o0;

    public OooO0O0(NavigationBarItemView navigationBarItemView, float f) {
        this.f16979OooO0o0 = navigationBarItemView;
        this.f16978OooO0Oo = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.f16882Oooo00o;
        this.f16979OooO0o0.OooO0O0(fFloatValue, this.f16978OooO0Oo);
    }
}
