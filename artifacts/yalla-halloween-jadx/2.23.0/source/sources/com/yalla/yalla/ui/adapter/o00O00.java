package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000.OooO0o f27570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27572OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f27573OooO0oO;

    public o00O00(o00O0000 o00o0001, o00O0000.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27573OooO0oO = o00o0001;
        this.f27570OooO0Oo = oooO0o;
        this.f27572OooO0o0 = viewPropertyAnimator;
        this.f27571OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27572OooO0o0.setListener(null);
        View view = this.f27571OooO0o;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o00O0000.OooO0o oooO0o = this.f27570OooO0Oo;
        RecyclerView.o0O0O00 o0o0o00 = oooO0o.f27604OooO0O0;
        o00O0000 o00o0001 = this.f27573OooO0oO;
        o00o0001.OooO0oo(o0o0o00);
        o00o0001.f27586OooOOO.remove(oooO0o.f27604OooO0O0);
        o00o0001.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.o0O0O00 o0o0o00 = this.f27570OooO0Oo.f27604OooO0O0;
        this.f27573OooO0oO.getClass();
    }
}
