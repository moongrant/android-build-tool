package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable.OooO00o f8039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f8040OooO0o0;

    public OooO00o(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.OooO00o oooO00o) {
        this.f8040OooO0o0 = circularProgressDrawable;
        this.f8039OooO0Oo = oooO00o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CircularProgressDrawable circularProgressDrawable = this.f8040OooO0o0;
        circularProgressDrawable.getClass();
        CircularProgressDrawable.OooO00o oooO00o = this.f8039OooO0Oo;
        CircularProgressDrawable.OooO0Oo(fFloatValue, oooO00o);
        circularProgressDrawable.OooO00o(fFloatValue, oooO00o, false);
        circularProgressDrawable.invalidateSelf();
    }
}
