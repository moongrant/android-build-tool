package oOO00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Transition f60156OooO0Oo;

    public o00Oo0(Transition transition) {
        this.f60156OooO0Oo = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f60156OooO0Oo.OooOOOO();
        animator.removeListener(this);
    }
}
