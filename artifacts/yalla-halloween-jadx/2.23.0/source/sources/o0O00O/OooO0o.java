package o0O00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f41692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f41693OooO0o0;

    public OooO0o(OooO0O0 oooO0O0) {
        this.f41693OooO0o0 = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f41692OooO0Oo = true;
        this.f41693OooO0o0.OooO0o0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooOOO0 oooOOO0 = this.f41693OooO0o0;
        oooOOO0.OooO00o();
        if (this.f41692OooO0Oo) {
            return;
        }
        oooOOO0.OooO0OO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f41693OooO0o0.onAnimationStart(animator);
        this.f41692OooO0Oo = false;
    }
}
