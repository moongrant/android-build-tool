package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f17587OooO0Oo;

    public o000oOoO(o0OoOo0 o0oooo1) {
        this.f17587OooO0Oo = o0oooo1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o0OoOo0 o0oooo1 = this.f17587OooO0Oo;
        o0oooo1.OooOOo0();
        o0oooo1.f17649OooOOo.start();
    }
}
