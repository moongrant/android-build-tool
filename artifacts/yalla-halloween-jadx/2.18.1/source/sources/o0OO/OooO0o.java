package o0OO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f37186Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f37187Oooo0oO;

    public OooO0o(OooOOO0 oooOOO0) {
        this.f37187Oooo0oO = oooOOO0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f37186Oooo0o = true;
        this.f37187Oooo0oO.OooO0O0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f37187Oooo0oO.OooO00o();
        if (this.f37186Oooo0o) {
            return;
        }
        this.f37187Oooo0oO.OooO0o0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f37187Oooo0oO.onAnimationStart(animator);
        this.f37186Oooo0o = false;
    }
}
