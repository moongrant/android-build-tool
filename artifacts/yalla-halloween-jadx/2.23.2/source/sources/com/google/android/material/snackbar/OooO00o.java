package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17349OooO0Oo;

    public OooO00o(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17349OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f17349OooO0Oo.f17312OooO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
