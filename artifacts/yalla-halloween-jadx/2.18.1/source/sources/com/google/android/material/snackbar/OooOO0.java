package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import p348o0OOO0oO.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17726Oooo0o;

    public OooOO0(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17726Oooo0o = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.f17726Oooo0o.f17694OooO0OO;
        if (snackbarBaseLayout == null) {
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            this.f17726Oooo0o.f17694OooO0OO.setVisibility(0);
        }
        if (this.f17726Oooo0o.f17694OooO0OO.getAnimationMode() != 1) {
            BaseTransientBottomBar baseTransientBottomBar = this.f17726Oooo0o;
            int iOooO0OO = baseTransientBottomBar.OooO0OO();
            baseTransientBottomBar.f17694OooO0OO.setTranslationY(iOooO0OO);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(iOooO0OO, 0);
            valueAnimator.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new p348o0OOO0oO.OooOO0(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new OooO0OO(baseTransientBottomBar, iOooO0OO));
            valueAnimator.start();
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.f17726Oooo0o;
        Objects.requireNonNull(baseTransientBottomBar2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        valueAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
        valueAnimatorOfFloat.addUpdateListener(new OooO00o(baseTransientBottomBar2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(p338o0OO0o0O.OooO0o.f37975OooO0Oo);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0(baseTransientBottomBar2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new OooOOO(baseTransientBottomBar2));
        animatorSet.start();
    }
}
