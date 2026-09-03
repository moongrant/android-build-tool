package p078o000Oo0O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f34951OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Transition f34952OooO0o0;

    public o000OOo(Transition transition, OooOO0 oooOO1) {
        this.f34952OooO0o0 = transition;
        this.f34951OooO0Oo = oooOO1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f34951OooO0Oo.remove(animator);
        this.f34952OooO0o0.f8218OooOOOo.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f34952OooO0o0.f8218OooOOOo.add(animator);
    }
}
