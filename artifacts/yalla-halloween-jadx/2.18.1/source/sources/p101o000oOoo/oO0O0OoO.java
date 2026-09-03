package p101o000oOoo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O0OoO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Transition f29759Oooo0o;

    public oO0O0OoO(Transition transition) {
        this.f29759Oooo0o = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f29759Oooo0o.OooOOOo();
        animator.removeListener(this);
    }
}
