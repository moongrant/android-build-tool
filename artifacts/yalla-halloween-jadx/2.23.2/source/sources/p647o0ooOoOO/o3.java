package p647o0ooOoOO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f58120OooO0Oo;

    public o3(OooO0O0 oooO0O0) {
        this.f58120OooO0Oo = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f58120OooO0Oo.OooO0O0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f58120OooO0Oo.OooO00o();
    }
}
