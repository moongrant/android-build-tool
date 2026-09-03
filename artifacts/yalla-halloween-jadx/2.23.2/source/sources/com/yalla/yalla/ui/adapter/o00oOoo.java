package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f27162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f27165OooO0oO;

    public o00oOoo(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.o0O0O00 o0o0o00, o0O0ooO o0o0ooo) {
        this.f27165OooO0oO = o0o0ooo;
        this.f27162OooO0Oo = o0o0o00;
        this.f27164OooO0o0 = viewPropertyAnimator;
        this.f27163OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27164OooO0o0.setListener(null);
        this.f27163OooO0o.setAlpha(1.0f);
        o0O0ooO o0o0ooo = this.f27165OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f27162OooO0Oo;
        o0o0ooo.OooO0oo(o0o0o00);
        o0o0ooo.f27177OooOOO0.remove(o0o0o00);
        o0o0ooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27165OooO0oO.getClass();
    }
}
