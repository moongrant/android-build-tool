package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f17559OooO0Oo;

    public o00Ooo(o0OOO0o o0ooo0o2) {
        this.f17559OooO0Oo = o0ooo0o2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o0OOO0o o0ooo0o2 = this.f17559OooO0Oo;
        if (!o0ooo0o2.f17562OooO00o.OooO0OO()) {
            o0ooo0o2.f17562OooO00o.OooO0Oo();
        }
        o0ooo0o2.f17562OooO00o.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o0OOO0o o0ooo0o2 = this.f17559OooO0Oo;
        o0ooo0o2.f17564OooO0OO.setVisibility(0);
        SearchBar searchBar = o0ooo0o2.f17573OooOOO0;
        searchBar.f17511OoooOoo.getClass();
        View centerView = searchBar.getCenterView();
        if (centerView instanceof o0O000.OooO00o) {
            ((o0O000.OooO00o) centerView).OooO00o();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }
}
