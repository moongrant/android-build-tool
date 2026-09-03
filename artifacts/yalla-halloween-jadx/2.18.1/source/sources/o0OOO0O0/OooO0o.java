package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f38062Oooo0o;

    public OooO0o(OooOO0 oooOO1) {
        this.f38062Oooo0o = oooOO1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        OooOO0 oooOO1 = this.f38062Oooo0o;
        oooOO1.f38073OooO0oo = (oooOO1.f38073OooO0oo + 4) % oooOO1.f38072OooO0oO.f38054OooO0OO.length;
    }
}
