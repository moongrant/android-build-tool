package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f27643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27644OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f27645OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f27646OooO0oO;

    public o00oOoo(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.o0O0O00 o0o0o00, o00O0000 o00o0001) {
        this.f27646OooO0oO = o00o0001;
        this.f27643OooO0Oo = o0o0o00;
        this.f27645OooO0o0 = view;
        this.f27644OooO0o = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f27645OooO0o0.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27644OooO0o.setListener(null);
        o00O0000 o00o0001 = this.f27646OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f27643OooO0Oo;
        o00o0001.OooO0oo(o0o0o00);
        o00o0001.f27584OooOO0O.remove(o0o0o00);
        o00o0001.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27646OooO0oO.getClass();
    }
}
