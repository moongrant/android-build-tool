package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f41764OooO0Oo;

    public o0OoOo0(o00O0O o00o0o2) {
        this.f41764OooO0Oo = o00o0o2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        o00O0O o00o0o2 = this.f41764OooO0Oo;
        o00o0o2.f41760OooO0oO = (o00o0o2.f41760OooO0oO + 1) % o00o0o2.f41758OooO0o.f41703OooO0OO.length;
        o00o0o2.f41761OooO0oo = true;
    }
}
