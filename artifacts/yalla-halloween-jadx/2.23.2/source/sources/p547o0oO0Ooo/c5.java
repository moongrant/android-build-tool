package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ d5 f55784OooO0Oo;

    public c5(d5 d5Var) {
        this.f55784OooO0Oo = d5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        d5 d5Var = this.f55784OooO0Oo;
        d5Var.f55790OooO0oO = (d5Var.f55790OooO0oO + 1) % d5Var.f55788OooO0o.f55807OooO0OO.length;
        d5Var.f55791OooO0oo = true;
    }
}
