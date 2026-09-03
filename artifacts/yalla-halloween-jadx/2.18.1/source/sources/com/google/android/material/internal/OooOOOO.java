package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f17317OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f17318OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public ValueAnimator f17319OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f17320OooO0Oo = new OooO00o();

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooOOOO oooOOOO = OooOOOO.this;
            if (oooOOOO.f17319OooO0OO == animator) {
                oooOOOO.f17319OooO0OO = null;
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f17322OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ValueAnimator f17323OooO0O0;

        public OooO0O0(int[] iArr, ValueAnimator valueAnimator) {
            this.f17322OooO00o = iArr;
            this.f17323OooO0O0 = valueAnimator;
        }
    }

    public final void OooO00o(int[] iArr, ValueAnimator valueAnimator) {
        OooO0O0 oooO0O0 = new OooO0O0(iArr, valueAnimator);
        valueAnimator.addListener(this.f17320OooO0Oo);
        this.f17317OooO00o.add(oooO0O0);
    }
}
