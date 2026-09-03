package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.InterfaceC0222OooOO0O f17039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f17040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f17041OooO0oO;

    public OooO(OooOO0O oooOO0O, boolean z, OooO0o oooO0o) {
        this.f17041OooO0oO = oooOO0O;
        this.f17040OooO0o0 = z;
        this.f17039OooO0o = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f17038OooO0Oo = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOO0O oooOO0O = this.f17041OooO0oO;
        oooOO0O.f17080OooOOo = 0;
        oooOO0O.f17075OooOO0o = null;
        if (this.f17038OooO0Oo) {
            return;
        }
        boolean z = this.f17040OooO0o0;
        oooOO0O.f17086OooOo0O.OooO0O0(z ? 8 : 4, z);
        OooOO0O.InterfaceC0222OooOO0O interfaceC0222OooOO0O = this.f17039OooO0o;
        if (interfaceC0222OooOO0O != null) {
            OooO0o oooO0o = (OooO0o) interfaceC0222OooOO0O;
            oooO0o.f17048OooO00o.OooO00o(oooO0o.f17049OooO0O0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOO0O oooOO0O = this.f17041OooO0oO;
        oooOO0O.f17086OooOo0O.OooO0O0(0, this.f17040OooO0o0);
        oooOO0O.f17080OooOOo = 1;
        oooOO0O.f17075OooOO0o = animator;
        this.f17038OooO0Oo = false;
    }
}
