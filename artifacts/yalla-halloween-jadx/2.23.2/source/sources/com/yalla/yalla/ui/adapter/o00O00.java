package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO.OooO0o f27107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27108OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27109OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f27110OooO0oO;

    public o00O00(o0O0ooO o0o0ooo, o0O0ooO.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27110OooO0oO = o0o0ooo;
        this.f27107OooO0Oo = oooO0o;
        this.f27109OooO0o0 = viewPropertyAnimator;
        this.f27108OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27109OooO0o0.setListener(null);
        View view = this.f27108OooO0o;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o0O0ooO.OooO0o oooO0o = this.f27107OooO0Oo;
        RecyclerView.o0O0O00 o0o0o00 = oooO0o.f27193OooO00o;
        o0O0ooO o0o0ooo = this.f27110OooO0oO;
        o0o0ooo.OooO0oo(o0o0o00);
        o0o0ooo.f27176OooOOO.remove(oooO0o.f27193OooO00o);
        o0o0ooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.o0O0O00 o0o0o00 = this.f27107OooO0Oo.f27193OooO00o;
        this.f27110OooO0oO.getClass();
    }
}
