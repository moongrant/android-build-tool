package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16568Oooo0o;

    public OooO00o(BottomAppBar bottomAppBar) {
        this.f16568Oooo0o = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f16568Oooo0o;
        int i = BottomAppBar.f16535o0000OO0;
        Objects.requireNonNull(bottomAppBar);
        this.f16568Oooo0o.f16537o00000 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f16568Oooo0o);
    }
}
