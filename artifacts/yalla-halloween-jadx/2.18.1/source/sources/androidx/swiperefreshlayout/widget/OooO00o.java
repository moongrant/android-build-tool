package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable.OooO00o f9384Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f9385Oooo0oO;

    public OooO00o(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.OooO00o oooO00o) {
        this.f9385Oooo0oO = circularProgressDrawable;
        this.f9384Oooo0o = oooO00o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9385Oooo0oO.OooO0Oo(fFloatValue, this.f9384Oooo0o);
        this.f9385Oooo0oO.OooO00o(fFloatValue, this.f9384Oooo0o, false);
        this.f9385Oooo0oO.invalidateSelf();
    }
}
