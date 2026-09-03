package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooOO0 f10933OooO0Oo;

    public o00Ooo(o00O0O.OooOO0 oooOO1) {
        this.f10933OooO0Oo = oooOO1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10933OooO0Oo.f10930OooOOOo = valueAnimator.getAnimatedFraction();
    }
}
