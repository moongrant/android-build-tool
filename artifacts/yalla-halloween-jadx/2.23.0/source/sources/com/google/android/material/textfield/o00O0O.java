package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f18063OooO0Oo;

    public o00O0O(o00Oo0 o00oo1) {
        this.f18063OooO0Oo = o00oo1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o00Oo0 o00oo1 = this.f18063OooO0Oo;
        o00oo1.OooOOo0();
        o00oo1.f18076OooOOo.start();
    }
}
