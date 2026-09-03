package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f17329OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ValueAnimator f17330OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f17331OooO0OO = new OooO00o();

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0OoOo0 o0oooo0 = o0OoOo0.this;
            if (o0oooo0.f17330OooO0O0 == animator) {
                o0oooo0.f17330OooO0O0 = null;
            }
        }
    }

    public static class OooO0O0 {
        public OooO0O0(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void OooO00o(int[] iArr, ValueAnimator valueAnimator) {
        OooO0O0 oooO0O0 = new OooO0O0(iArr, valueAnimator);
        valueAnimator.addListener(this.f17331OooO0OO);
        this.f17329OooO00o.add(oooO0O0);
    }
}
