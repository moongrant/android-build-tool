package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static AnimatorSet OooO00o(@NonNull OooO0O0 oooO0O0, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(oooO0O0, OooO0O0.C0221OooO0O0.f16797OooO00o, OooO0O0.OooO00o.f16795OooO0O0, new OooO0O0.OooO0o(f, f2, f3));
        OooO0O0.OooO0o revealInfo = oooO0O0.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) oooO0O0, (int) f, (int) f2, revealInfo.f16801OooO0OO, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
