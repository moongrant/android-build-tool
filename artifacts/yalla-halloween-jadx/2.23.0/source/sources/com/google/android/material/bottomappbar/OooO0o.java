package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16411OooO0Oo;

    public OooO0o(BottomAppBar bottomAppBar) {
        this.f16411OooO0Oo = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = BottomAppBar.f16366o0ooOOo;
        BottomAppBar bottomAppBar = this.f16411OooO0Oo;
        bottomAppBar.getClass();
        bottomAppBar.f16370OoooOoO = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = BottomAppBar.f16366o0ooOOo;
        this.f16411OooO0Oo.getClass();
    }
}
