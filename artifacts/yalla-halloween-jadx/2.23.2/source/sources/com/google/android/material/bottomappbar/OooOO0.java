package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15944OooO0Oo;

    public OooOO0(BottomAppBar bottomAppBar) {
        this.f15944OooO0Oo = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f15944OooO0Oo;
        bottomAppBar.f15913o00oO0O.onAnimationStart(animator);
        FloatingActionButton floatingActionButtonOooOoO0 = bottomAppBar.OooOoO0();
        if (floatingActionButtonOooOoO0 != null) {
            floatingActionButtonOooOoO0.setTranslationX(bottomAppBar.getFabTranslationX());
        }
    }
}
