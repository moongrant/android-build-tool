package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f38107Oooo0o;

    public o00Oo0(o00Ooo o00ooo2) {
        this.f38107Oooo0o = o00ooo2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38107Oooo0o.OooO00o();
        p103o000oo00.OooOO0O oooOO0O = this.f38107Oooo0o.f38118OooOO0O;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
    }
}
