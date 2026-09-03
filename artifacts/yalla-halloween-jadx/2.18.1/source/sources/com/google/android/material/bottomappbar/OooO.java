package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16567Oooo0o;

    public OooO(BottomAppBar bottomAppBar) {
        this.f16567Oooo0o = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16567Oooo0o.f16555o000OO.onAnimationStart(animator);
        FloatingActionButton floatingActionButtonOooOooO = this.f16567Oooo0o.OooOooO();
        if (floatingActionButtonOooOooO != null) {
            floatingActionButtonOooOooO.setTranslationX(this.f16567Oooo0o.getFabTranslationX());
        }
    }
}
