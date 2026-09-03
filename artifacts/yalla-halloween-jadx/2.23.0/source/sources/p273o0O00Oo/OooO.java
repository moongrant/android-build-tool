package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f41700OooO0Oo;

    public OooO(OooOO0O oooOO0O) {
        this.f41700OooO0Oo = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        OooOO0O oooOO0O = this.f41700OooO0Oo;
        oooOO0O.f41722OooO0oo = (oooOO0O.f41722OooO0oo + 4) % oooOO0O.f41721OooO0oO.f41703OooO0OO.length;
    }
}
