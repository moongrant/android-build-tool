package p645o0ooOoOO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class gc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f59614OooO0Oo;

    public gc(OooO0O0 oooO0O0) {
        this.f59614OooO0Oo = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f59614OooO0Oo.OooO0O0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f59614OooO0Oo.OooO00o();
    }
}
