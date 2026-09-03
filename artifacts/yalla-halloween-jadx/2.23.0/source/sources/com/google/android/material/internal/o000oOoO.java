package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO implements TimeInterpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimeInterpolator f17300OooO00o;

    public o000oOoO(@NonNull Interpolator interpolator) {
        this.f17300OooO00o = interpolator;
    }

    @NonNull
    public static TimeInterpolator OooO00o(boolean z, @NonNull Interpolator interpolator) {
        return z ? interpolator : new o000oOoO(interpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.f17300OooO00o.getInterpolation(f);
    }
}
