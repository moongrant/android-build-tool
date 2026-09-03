package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f17091Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f17092Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f17093Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooOO0O f17094Oooo0oo;

    public OooO0O0(OooO0o oooO0o, boolean z, OooO0o.OooOO0O oooOO0O) {
        this.f17091Oooo = oooO0o;
        this.f17093Oooo0oO = z;
        this.f17094Oooo0oo = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f17092Oooo0o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0o oooO0o = this.f17091Oooo;
        oooO0o.f17123OooOOoo = 0;
        oooO0o.f17118OooOOO0 = null;
        if (this.f17092Oooo0o) {
            return;
        }
        FloatingActionButton floatingActionButton = oooO0o.f17128OooOo0o;
        boolean z = this.f17093Oooo0oO;
        floatingActionButton.OooO0O0(z ? 8 : 4, z);
        OooO0o.OooOO0O oooOO0O = this.f17094Oooo0oo;
        if (oooOO0O != null) {
            OooO00o oooO00o = (OooO00o) oooOO0O;
            oooO00o.f17089OooO00o.OooO00o(oooO00o.f17090OooO0O0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17091Oooo.f17128OooOo0o.OooO0O0(0, this.f17093Oooo0oO);
        OooO0o oooO0o = this.f17091Oooo;
        oooO0o.f17123OooOOoo = 1;
        oooO0o.f17118OooOOO0 = animator;
        this.f17092Oooo0o = false;
    }
}
