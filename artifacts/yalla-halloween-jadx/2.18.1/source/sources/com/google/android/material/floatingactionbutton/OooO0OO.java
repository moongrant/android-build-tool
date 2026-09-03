package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f17095Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooOO0O f17096Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f17097Oooo0oo;

    public OooO0OO(OooO0o oooO0o, boolean z, OooO0o.OooOO0O oooOO0O) {
        this.f17097Oooo0oo = oooO0o;
        this.f17095Oooo0o = z;
        this.f17096Oooo0oO = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0o oooO0o = this.f17097Oooo0oo;
        oooO0o.f17123OooOOoo = 0;
        oooO0o.f17118OooOOO0 = null;
        OooO0o.OooOO0O oooOO0O = this.f17096Oooo0oO;
        if (oooOO0O != null) {
            ((OooO00o) oooOO0O).f17089OooO00o.OooO0O0();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17097Oooo0oo.f17128OooOo0o.OooO0O0(0, this.f17095Oooo0o);
        OooO0o oooO0o = this.f17097Oooo0oo;
        oooO0o.f17123OooOOoo = 2;
        oooO0o.f17118OooOOO0 = animator;
    }
}
