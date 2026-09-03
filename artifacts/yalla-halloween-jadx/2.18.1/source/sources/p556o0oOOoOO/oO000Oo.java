package p556o0oOOoOO;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000Oo implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0O0OoO f44659OooO00o;

    public oO000Oo(oO0O0OoO oo0o0ooo) {
        this.f44659OooO00o = oo0o0ooo;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        oO0O0OoO.OooO00o(this.f44659OooO00o);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f44659OooO00o.f44665OooO0Oo = true;
    }
}
