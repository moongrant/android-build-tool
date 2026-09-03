package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import o00O00OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ g5 f55793OooO0Oo;

    public f5(g5 g5Var) {
        this.f55793OooO0Oo = g5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        g5 g5Var = this.f55793OooO0Oo;
        g5Var.OooO00o();
        OooO0OO oooO0OO = g5Var.f55804OooOO0O;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(g5Var.f55851OooO00o);
        }
    }
}
