package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17723Oooo0o;

    public OooO0O0(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17723Oooo0o = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f17723Oooo0o.f17694OooO0OO.setScaleX(fFloatValue);
        this.f17723Oooo0o.f17694OooO0OO.setScaleY(fFloatValue);
    }
}
