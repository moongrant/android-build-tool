package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.OooO0O0 f18111Oooo0o;

    public OooO0OO(com.google.android.material.circularreveal.OooO0O0 oooO0O0) {
        this.f18111Oooo0o = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.circularreveal.OooO0O0.OooO0o revealInfo = this.f18111Oooo0o.getRevealInfo();
        revealInfo.f16864OooO0OO = Float.MAX_VALUE;
        this.f18111Oooo0o.setRevealInfo(revealInfo);
    }
}
