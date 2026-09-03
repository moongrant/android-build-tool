package p547o0oO0Ooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import o00O00OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t4 f55816OooO0Oo;

    public s4(t4 t4Var) {
        this.f55816OooO0Oo = t4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        t4 t4Var = this.f55816OooO0Oo;
        t4Var.OooO00o();
        OooO0OO oooO0OO = t4Var.f55829OooOO0O;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(t4Var.f55851OooO00o);
        }
    }
}
