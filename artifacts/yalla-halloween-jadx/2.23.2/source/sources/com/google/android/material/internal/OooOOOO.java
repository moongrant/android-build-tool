package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOOO implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f16811OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View[] f16812OooO0o0;

    public interface OooO00o {
        void OooO0OO(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public OooOOOO(@NonNull OooO00o oooO00o, @NonNull View... viewArr) {
        this.f16811OooO0Oo = oooO00o;
        this.f16812OooO0o0 = viewArr;
    }

    @NonNull
    public static OooOOOO OooO00o(@NonNull View... viewArr) {
        return new OooOOOO(new o000OO0O.OooOO0(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f16812OooO0o0) {
            this.f16811OooO0Oo.OooO0OO(valueAnimator, view);
        }
    }
}
