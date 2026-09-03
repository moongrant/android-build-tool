package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f27651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27652OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27653OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f27654OooO0oO;

    public o0O0ooO(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.o0O0O00 o0o0o00, o00O0000 o00o0001) {
        this.f27654OooO0oO = o00o0001;
        this.f27651OooO0Oo = o0o0o00;
        this.f27653OooO0o0 = viewPropertyAnimator;
        this.f27652OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27653OooO0o0.setListener(null);
        this.f27652OooO0o.setAlpha(1.0f);
        o00O0000 o00o0001 = this.f27654OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f27651OooO0Oo;
        o00o0001.OooO0oo(o0o0o00);
        o00o0001.f27587OooOOO0.remove(o0o0o00);
        o00o0001.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27654OooO0oO.getClass();
    }
}
