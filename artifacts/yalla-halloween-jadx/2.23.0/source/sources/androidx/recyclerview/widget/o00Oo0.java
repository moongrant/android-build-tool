package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooOO0 f7801OooO0Oo;

    public o00Oo0(o0OoOo0.OooOO0 oooOO1) {
        this.f7801OooO0Oo = oooOO1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7801OooO0Oo.f7873OooOOOo = valueAnimator.getAnimatedFraction();
    }
}
