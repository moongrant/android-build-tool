package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p079o000Oo0o.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f41711OooO0Oo;

    public OooOO0(OooOO0O oooOO0O) {
        this.f41711OooO0Oo = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        OooOO0O oooOO0O = this.f41711OooO0Oo;
        oooOO0O.OooO00o();
        o000OO00 o000oo01 = oooOO0O.f41724OooOO0O;
        if (o000oo01 != null) {
            o000oo01.OooO00o(oooOO0O.f41748OooO00o);
        }
    }
}
