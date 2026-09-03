package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000.OooO0o f27609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27611OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f27612OooO0oO;

    public o00O000o(o00O0000 o00o0001, o00O0000.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27612OooO0oO = o00o0001;
        this.f27609OooO0Oo = oooO0o;
        this.f27611OooO0o0 = viewPropertyAnimator;
        this.f27610OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27611OooO0o0.setListener(null);
        View view = this.f27610OooO0o;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o00O0000.OooO0o oooO0o = this.f27609OooO0Oo;
        RecyclerView.o0O0O00 o0o0o00 = oooO0o.f27603OooO00o;
        o00O0000 o00o0001 = this.f27612OooO0oO;
        o00o0001.OooO0oo(o0o0o00);
        o00o0001.f27586OooOOO.remove(oooO0o.f27603OooO00o);
        o00o0001.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.o0O0O00 o0o0o00 = this.f27609OooO0Oo.f27603OooO00o;
        this.f27612OooO0oO.getClass();
    }
}
