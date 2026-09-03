package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f38051Oooo0o;

    public OooO(OooOO0 oooOO1) {
        this.f38051Oooo0o = oooOO1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38051Oooo0o.OooO00o();
        p103o000oo00.OooOO0O oooOO0O = this.f38051Oooo0o.f38075OooOO0O;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
    }
}
