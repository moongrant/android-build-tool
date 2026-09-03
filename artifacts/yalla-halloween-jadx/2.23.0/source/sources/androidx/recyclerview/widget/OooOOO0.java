package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f7551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f7553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f7554OooO0oO;

    public OooOOO0(View view, ViewPropertyAnimator viewPropertyAnimator, OooOO0 oooOO1, RecyclerView.o0O0O00 o0o0o00) {
        this.f7554OooO0oO = oooOO1;
        this.f7551OooO0Oo = o0o0o00;
        this.f7553OooO0o0 = view;
        this.f7552OooO0o = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7553OooO0o0.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7552OooO0o.setListener(null);
        OooOO0 oooOO1 = this.f7554OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f7551OooO0Oo;
        oooOO1.OooO0oo(o0o0o00);
        oooOO1.f7520OooOOOO.remove(o0o0o00);
        oooOO1.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7554OooO0oO.getClass();
    }
}
