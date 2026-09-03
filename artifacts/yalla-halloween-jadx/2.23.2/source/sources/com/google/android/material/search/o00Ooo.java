package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f17086OooO0Oo;

    public o00Ooo(oo000o oo000oVar) {
        this.f17086OooO0Oo = oo000oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oo000o oo000oVar = this.f17086OooO0Oo;
        oo000oVar.f17091OooO0OO.setVisibility(8);
        if (!oo000oVar.f17089OooO00o.OooO0OO()) {
            oo000oVar.f17089OooO00o.OooO0O0();
        }
        oo000oVar.f17089OooO00o.setTransitionState(SearchView.TransitionState.HIDDEN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17086OooO0Oo.f17089OooO00o.setTransitionState(SearchView.TransitionState.HIDING);
    }
}
