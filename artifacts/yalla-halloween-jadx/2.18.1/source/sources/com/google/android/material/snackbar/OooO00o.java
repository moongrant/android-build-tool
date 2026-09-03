package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17722Oooo0o;

    public OooO00o(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17722Oooo0o = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f17722Oooo0o.f17694OooO0OO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
