package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable.OooO00o f11135OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f11136OooO0o0;

    public OooO0O0(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.OooO00o oooO00o) {
        this.f11136OooO0o0 = circularProgressDrawable;
        this.f11135OooO0Oo = oooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        CircularProgressDrawable circularProgressDrawable = this.f11136OooO0o0;
        CircularProgressDrawable.OooO00o oooO00o = this.f11135OooO0Oo;
        circularProgressDrawable.OooO00o(1.0f, oooO00o, true);
        oooO00o.f11122OooOO0O = oooO00o.f11118OooO0o0;
        oooO00o.f11123OooOO0o = oooO00o.f11117OooO0o;
        oooO00o.f11125OooOOO0 = oooO00o.f11119OooO0oO;
        oooO00o.OooO00o((oooO00o.f11121OooOO0 + 1) % oooO00o.f11112OooO.length);
        if (!circularProgressDrawable.f11106OooO) {
            circularProgressDrawable.f11111OooO0oo += 1.0f;
            return;
        }
        circularProgressDrawable.f11106OooO = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (oooO00o.f11124OooOOO) {
            oooO00o.f11124OooOOO = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f11136OooO0o0.f11111OooO0oo = 0.0f;
    }
}
