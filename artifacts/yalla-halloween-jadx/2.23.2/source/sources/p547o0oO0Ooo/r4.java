package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t4 f55815OooO0Oo;

    public r4(t4 t4Var) {
        this.f55815OooO0Oo = t4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        t4 t4Var = this.f55815OooO0Oo;
        t4Var.f55827OooO0oo = (t4Var.f55827OooO0oo + 4) % t4Var.f55826OooO0oO.f55807OooO0OO.length;
    }
}
