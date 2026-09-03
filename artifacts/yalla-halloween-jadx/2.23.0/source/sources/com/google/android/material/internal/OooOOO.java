package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements OooOOOO.OooO00o {
    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public final void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
