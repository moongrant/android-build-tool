package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooOO0 f9184Oooo0o;

    public o00Oo0(o0OoOo0.OooOO0 oooOO1) {
        this.f9184Oooo0o = oooOO1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9184Oooo0o.f9257OoooOo0 = valueAnimator.getAnimatedFraction();
    }
}
