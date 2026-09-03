package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f38105Oooo0o;

    public o000oOoO(o0OoOo0 o0oooo1) {
        this.f38105Oooo0o = o0oooo1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        o0OoOo0 o0oooo1 = this.f38105Oooo0o;
        o0oooo1.f38124OooO0oO = (o0oooo1.f38124OooO0oO + 1) % o0oooo1.f38122OooO0o.f38054OooO0OO.length;
        o0oooo1.f38125OooO0oo = true;
    }
}
