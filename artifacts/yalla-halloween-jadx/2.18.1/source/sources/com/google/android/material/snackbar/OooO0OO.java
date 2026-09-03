package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17724Oooo0o;

    public OooO0OO(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f17724Oooo0o = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f17688OooOOO;
        this.f17724Oooo0o.f17694OooO0OO.setTranslationY(iIntValue);
    }
}
