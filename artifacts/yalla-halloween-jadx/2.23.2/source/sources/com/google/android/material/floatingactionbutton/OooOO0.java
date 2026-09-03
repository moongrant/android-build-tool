package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f16577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16578OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.InterfaceC0219OooOO0O f16579OooO0o0;

    public OooOO0(OooOO0O oooOO0O, boolean z, OooO0o oooO0o) {
        this.f16578OooO0o = oooOO0O;
        this.f16577OooO0Oo = z;
        this.f16579OooO0o0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOO0O oooOO0O = this.f16578OooO0o;
        oooOO0O.f16607OooOOo = 0;
        oooOO0O.f16602OooOO0o = null;
        OooOO0O.InterfaceC0219OooOO0O interfaceC0219OooOO0O = this.f16579OooO0o0;
        if (interfaceC0219OooOO0O != null) {
            ((OooO0o) interfaceC0219OooOO0O).f16575OooO00o.OooO0O0();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOO0O oooOO0O = this.f16578OooO0o;
        oooOO0O.f16613OooOo0O.OooO0O0(0, this.f16577OooO0Oo);
        oooOO0O.f16607OooOOo = 2;
        oooOO0O.f16602OooOO0o = animator;
    }
}
