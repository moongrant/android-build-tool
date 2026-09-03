package p101o000oOoo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oO000o00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f29740Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Transition f29741Oooo0oO;

    public oO000o00(Transition transition, Oooo0 oooo0) {
        this.f29741Oooo0oO = transition;
        this.f29740Oooo0o = oooo0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f29740Oooo0o.remove(animator);
        this.f29741Oooo0oO.f9569OoooOo0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f29741Oooo0oO.f9569OoooOo0.add(animator);
    }
}
