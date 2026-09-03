package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.OooO0O0 f18230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Drawable f18231OooO0o0;

    public OooO0O0(com.google.android.material.circularreveal.OooO0O0 oooO0O0, Drawable drawable) {
        this.f18230OooO0Oo = oooO0O0;
        this.f18231OooO0o0 = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18230OooO0Oo.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f18230OooO0Oo.setCircularRevealOverlayDrawable(this.f18231OooO0o0);
    }
}
