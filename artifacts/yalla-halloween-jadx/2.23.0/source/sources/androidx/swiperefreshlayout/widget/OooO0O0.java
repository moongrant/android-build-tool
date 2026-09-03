package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable.OooO00o f8041OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f8042OooO0o0;

    public OooO0O0(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.OooO00o oooO00o) {
        this.f8042OooO0o0 = circularProgressDrawable;
        this.f8041OooO0Oo = oooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        CircularProgressDrawable circularProgressDrawable = this.f8042OooO0o0;
        CircularProgressDrawable.OooO00o oooO00o = this.f8041OooO0Oo;
        circularProgressDrawable.OooO00o(1.0f, oooO00o, true);
        oooO00o.f8028OooOO0O = oooO00o.f8024OooO0o0;
        oooO00o.f8029OooOO0o = oooO00o.f8023OooO0o;
        oooO00o.f8031OooOOO0 = oooO00o.f8025OooO0oO;
        oooO00o.OooO00o((oooO00o.f8027OooOO0 + 1) % oooO00o.f8018OooO.length);
        if (!circularProgressDrawable.f8012OooO) {
            circularProgressDrawable.f8017OooO0oo += 1.0f;
            return;
        }
        circularProgressDrawable.f8012OooO = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (oooO00o.f8030OooOOO) {
            oooO00o.f8030OooOOO = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f8042OooO0o0.f8017OooO0oo = 0.0f;
    }
}
