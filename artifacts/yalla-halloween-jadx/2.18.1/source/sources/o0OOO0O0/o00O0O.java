package o0OOO0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f38106Oooo0o;

    public o00O0O(o00Ooo o00ooo2) {
        this.f38106Oooo0o = o00ooo2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        o00Ooo o00ooo2 = this.f38106Oooo0o;
        o00ooo2.f38116OooO0oo = (o00ooo2.f38116OooO0oo + 1) % o00ooo2.f38115OooO0oO.f38054OooO0OO.length;
        o00ooo2.f38111OooO = true;
    }
}
