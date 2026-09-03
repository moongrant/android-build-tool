package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import p279o0O00o0o.OooOOOO;
import p279o0O00o0o.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17830OooO0Oo;

    public OooOO0(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17830OooO0Oo = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f17830OooO0Oo;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.f17789OooO;
        if (snackbarBaseLayout == null) {
            return;
        }
        ViewParent parent = snackbarBaseLayout.getParent();
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.f17789OooO;
        if (parent != null) {
            snackbarBaseLayout2.setVisibility(0);
        }
        if (snackbarBaseLayout2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f17793OooO0Oo);
            valueAnimatorOfFloat.addUpdateListener(new OooO00o(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f17794OooO0o);
            valueAnimatorOfFloat2.addUpdateListener(new OooO0O0(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f17790OooO00o);
            animatorSet.addListener(new o000oOoO(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = snackbarBaseLayout2.getHeight();
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        snackbarBaseLayout2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f17795OooO0o0);
        valueAnimator.setDuration(baseTransientBottomBar.f17792OooO0OO);
        valueAnimator.addListener(new OooOOOO(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new OooO0OO(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
