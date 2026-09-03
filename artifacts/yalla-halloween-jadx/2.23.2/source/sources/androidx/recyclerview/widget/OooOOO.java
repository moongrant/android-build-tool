package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f10635OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10636OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f10637OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f10638OooO0oO;

    public OooOOO(View view, ViewPropertyAnimator viewPropertyAnimator, OooOO0O oooOO0O, RecyclerView.o0O0O00 o0o0o00) {
        this.f10638OooO0oO = oooOO0O;
        this.f10635OooO0Oo = o0o0o00;
        this.f10637OooO0o0 = view;
        this.f10636OooO0o = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10637OooO0o0.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10636OooO0o.setListener(null);
        OooOO0O oooOO0O = this.f10638OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f10635OooO0Oo;
        oooOO0O.OooO0oo(o0o0o00);
        oooOO0O.f10614OooOOOO.remove(o0o0o00);
        oooOO0O.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10638OooO0oO.getClass();
    }
}
