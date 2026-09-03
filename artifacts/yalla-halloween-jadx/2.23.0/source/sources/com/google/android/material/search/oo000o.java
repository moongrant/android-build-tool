package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f17579OooO0Oo;

    public oo000o(o0OOO0o o0ooo0o2) {
        this.f17579OooO0Oo = o0ooo0o2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o0OOO0o o0ooo0o2 = this.f17579OooO0Oo;
        o0ooo0o2.f17564OooO0OO.setVisibility(8);
        if (!o0ooo0o2.f17562OooO00o.OooO0OO()) {
            o0ooo0o2.f17562OooO00o.OooO0O0();
        }
        o0ooo0o2.f17562OooO00o.setTransitionState(SearchView.TransitionState.HIDDEN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17579OooO0Oo.f17562OooO00o.setTransitionState(SearchView.TransitionState.HIDING);
    }
}
