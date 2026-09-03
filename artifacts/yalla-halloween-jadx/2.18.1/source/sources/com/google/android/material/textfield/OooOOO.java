package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f17889Oooo0o;

    public OooOOO(OooOO0O oooOO0O) {
        this.f17889Oooo0o = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOO0O oooOO0O = this.f17889Oooo0o;
        oooOO0O.f17895OooO0OO.setChecked(oooOO0O.f17870OooOOO0);
        this.f17889Oooo0o.f17875OooOOoo.start();
    }
}
