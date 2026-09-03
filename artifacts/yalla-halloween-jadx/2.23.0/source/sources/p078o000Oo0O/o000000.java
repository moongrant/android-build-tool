package p078o000Oo0O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Transition f34931OooO0Oo;

    public o000000(Transition transition) {
        this.f34931OooO0Oo = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f34931OooO0Oo.OooOOOO();
        animator.removeListener(this);
    }
}
