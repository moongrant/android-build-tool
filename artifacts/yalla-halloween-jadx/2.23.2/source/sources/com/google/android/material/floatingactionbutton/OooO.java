package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.InterfaceC0219OooOO0O f16566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f16567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16568OooO0oO;

    public OooO(OooOO0O oooOO0O, boolean z, OooO0o oooO0o) {
        this.f16568OooO0oO = oooOO0O;
        this.f16567OooO0o0 = z;
        this.f16566OooO0o = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f16565OooO0Oo = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOO0O oooOO0O = this.f16568OooO0oO;
        oooOO0O.f16607OooOOo = 0;
        oooOO0O.f16602OooOO0o = null;
        if (this.f16565OooO0Oo) {
            return;
        }
        boolean z = this.f16567OooO0o0;
        oooOO0O.f16613OooOo0O.OooO0O0(z ? 8 : 4, z);
        OooOO0O.InterfaceC0219OooOO0O interfaceC0219OooOO0O = this.f16566OooO0o;
        if (interfaceC0219OooOO0O != null) {
            OooO0o oooO0o = (OooO0o) interfaceC0219OooOO0O;
            oooO0o.f16575OooO00o.OooO00o(oooO0o.f16576OooO0O0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOO0O oooOO0O = this.f16568OooO0oO;
        oooOO0O.f16613OooOo0O.OooO0O0(0, this.f16567OooO0o0);
        oooOO0O.f16607OooOOo = 1;
        oooOO0O.f16602OooOO0o = animator;
        this.f16565OooO0Oo = false;
    }
}
