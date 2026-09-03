package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17827OooO0Oo;

    public OooO0O0(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17827OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f17827OooO0Oo;
        baseTransientBottomBar.f17789OooO.setScaleX(fFloatValue);
        baseTransientBottomBar.f17789OooO.setScaleY(fFloatValue);
    }
}
