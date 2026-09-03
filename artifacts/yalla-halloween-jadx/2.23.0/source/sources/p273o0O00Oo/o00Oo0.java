package p273o0O00Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f41762OooO0Oo;

    public o00Oo0(oo000o oo000oVar) {
        this.f41762OooO0Oo = oo000oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        oo000o oo000oVar = this.f41762OooO0Oo;
        oo000oVar.f41773OooO0oo = (oo000oVar.f41773OooO0oo + 1) % oo000oVar.f41772OooO0oO.f41703OooO0OO.length;
        oo000oVar.f41768OooO = true;
    }
}
