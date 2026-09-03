package com.yalla.yalla.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f27574OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f27575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f27576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f27577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f27578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27579OooO0oo;

    public o00O000(o00O0000 o00o0001, RecyclerView.o0O0O00 o0o0o00, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f27574OooO = o00o0001;
        this.f27575OooO0Oo = o0o0o00;
        this.f27577OooO0o0 = i;
        this.f27576OooO0o = view;
        this.f27578OooO0oO = i2;
        this.f27579OooO0oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f27577OooO0o0;
        View view = this.f27576OooO0o;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f27578OooO0oO != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27579OooO0oo.setListener(null);
        o00O0000 o00o0001 = this.f27574OooO;
        RecyclerView.o0O0O00 o0o0o00 = this.f27575OooO0Oo;
        o00o0001.OooO0oo(o0o0o00);
        o00o0001.f27585OooOO0o.remove(o0o0o00);
        o00o0001.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27574OooO.getClass();
    }
}
