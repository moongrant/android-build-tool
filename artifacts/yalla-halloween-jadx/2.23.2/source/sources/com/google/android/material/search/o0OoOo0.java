package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f17087OooO0Oo;

    public o0OoOo0(oo000o oo000oVar) {
        this.f17087OooO0Oo = oo000oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oo000o oo000oVar = this.f17087OooO0Oo;
        if (!oo000oVar.f17089OooO00o.OooO0OO()) {
            oo000oVar.f17089OooO00o.OooO0Oo();
        }
        oo000oVar.f17089OooO00o.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        oo000o oo000oVar = this.f17087OooO0Oo;
        oo000oVar.f17091OooO0OO.setVisibility(0);
        SearchBar searchBar = oo000oVar.f17100OooOOO0;
        searchBar.f17038OoooOoo.getClass();
        View centerView = searchBar.getCenterView();
        if (centerView instanceof o0O000.OooO00o) {
            ((o0O000.OooO00o) centerView).OooO00o();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }
}
