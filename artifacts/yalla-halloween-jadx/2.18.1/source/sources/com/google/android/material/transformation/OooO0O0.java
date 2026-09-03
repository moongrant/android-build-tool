package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.OooO0O0 f18109Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Drawable f18110Oooo0oO;

    public OooO0O0(com.google.android.material.circularreveal.OooO0O0 oooO0O0, Drawable drawable) {
        this.f18109Oooo0o = oooO0O0;
        this.f18110Oooo0oO = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18109Oooo0o.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f18109Oooo0o.setCircularRevealOverlayDrawable(this.f18110Oooo0oO);
    }
}
