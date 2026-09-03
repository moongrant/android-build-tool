package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f17854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TabLayout.OooOO0 f17855OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f17856OooO0o0;

    public OooO0O0(TabLayout.OooOO0 oooOO1, View view, View view2) {
        this.f17855OooO0o = oooOO1;
        this.f17854OooO0Oo = view;
        this.f17856OooO0o0 = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f17855OooO0o.OooO0OO(this.f17854OooO0Oo, this.f17856OooO0o0, valueAnimator.getAnimatedFraction());
    }
}
