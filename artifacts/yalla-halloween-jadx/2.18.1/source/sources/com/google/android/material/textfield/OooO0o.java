package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f17859Oooo0o;

    public OooO0o(OooO00o oooO00o) {
        this.f17859Oooo0o = oooO00o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f17859Oooo0o.f17895OooO0OO.setScaleX(fFloatValue);
        this.f17859Oooo0o.f17895OooO0OO.setScaleY(fFloatValue);
    }
}
