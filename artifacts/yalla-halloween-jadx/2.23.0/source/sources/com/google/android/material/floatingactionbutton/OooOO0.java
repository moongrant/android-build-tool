package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f17050OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f17051OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.InterfaceC0222OooOO0O f17052OooO0o0;

    public OooOO0(OooOO0O oooOO0O, boolean z, OooO0o oooO0o) {
        this.f17051OooO0o = oooOO0O;
        this.f17050OooO0Oo = z;
        this.f17052OooO0o0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOO0O oooOO0O = this.f17051OooO0o;
        oooOO0O.f17080OooOOo = 0;
        oooOO0O.f17075OooOO0o = null;
        OooOO0O.InterfaceC0222OooOO0O interfaceC0222OooOO0O = this.f17052OooO0o0;
        if (interfaceC0222OooOO0O != null) {
            ((OooO0o) interfaceC0222OooOO0O).f17048OooO00o.OooO0O0();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOO0O oooOO0O = this.f17051OooO0o;
        oooOO0O.f17086OooOo0O.OooO0O0(0, this.f17050OooO0Oo);
        oooOO0O.f17080OooOOo = 2;
        oooOO0O.f17075OooOO0o = animator;
    }
}
