package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements OooOOOO.OooO00o, o00000O0.OooO00o {
    public /* synthetic */ OooOOO(AnalyticsListener.OooO00o oooO00o, long j) {
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public void OooO0OO(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OooOo0O();
    }
}
