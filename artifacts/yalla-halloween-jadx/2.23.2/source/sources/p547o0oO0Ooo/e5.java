package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ g5 f55792OooO0Oo;

    public e5(g5 g5Var) {
        this.f55792OooO0Oo = g5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        g5 g5Var = this.f55792OooO0Oo;
        g5Var.f55802OooO0oo = (g5Var.f55802OooO0oo + 1) % g5Var.f55801OooO0oO.f55807OooO0OO.length;
        g5Var.f55797OooO = true;
    }
}
