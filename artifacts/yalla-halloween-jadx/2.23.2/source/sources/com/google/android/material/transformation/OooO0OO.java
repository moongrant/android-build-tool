package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.OooO0O0 f17756OooO0Oo;

    public OooO0OO(com.google.android.material.circularreveal.OooO0O0 oooO0O0) {
        this.f17756OooO0Oo = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.circularreveal.OooO0O0 oooO0O0 = this.f17756OooO0Oo;
        com.google.android.material.circularreveal.OooO0O0.OooO0o revealInfo = oooO0O0.getRevealInfo();
        revealInfo.f16328OooO0OO = Float.MAX_VALUE;
        oooO0O0.setRevealInfo(revealInfo);
    }
}
