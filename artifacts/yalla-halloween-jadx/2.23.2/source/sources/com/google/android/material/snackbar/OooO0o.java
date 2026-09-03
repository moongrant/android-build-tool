package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17352OooO0Oo;

    public OooO0o(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17352OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        p064o0000oO0.OooOO0 oooOO1 = BaseTransientBottomBar.f17307OooOo0;
        this.f17352OooO0Oo.f17312OooO.setTranslationY(iIntValue);
    }
}
