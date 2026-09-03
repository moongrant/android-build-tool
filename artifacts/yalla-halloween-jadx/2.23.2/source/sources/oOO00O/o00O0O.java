package oOO00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p190o00o0O.OooO f60154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Transition f60155OooO0o0;

    public o00O0O(Transition transition, p190o00o0O.OooO oooO) {
        this.f60155OooO0o0 = transition;
        this.f60154OooO0Oo = oooO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f60154OooO0Oo.remove(animator);
        this.f60155OooO0o0.f11312OooOOOo.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f60155OooO0o0.f11312OooOOOo.add(animator);
    }
}
