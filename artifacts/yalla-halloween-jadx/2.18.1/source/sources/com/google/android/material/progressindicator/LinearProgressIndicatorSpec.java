package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o000oOoO;
import o0OOO0O0.OooO0O0;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class LinearProgressIndicatorSpec extends OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f17500OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17502OooO0oo;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.linearProgressIndicatorStyle);
    }

    @Override // o0OOO0O0.OooO0O0
    public final void OooO00o() {
        if (this.f17501OooO0oO == 0) {
            if (this.f38053OooO0O0 > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f38054OooO0OO.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        int i2 = LinearProgressIndicator.f17499OoooOoO;
        super(context, attributeSet, i, i2);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSet, Oooo0.LinearProgressIndicator, OooO0o.linearProgressIndicatorStyle, i2, new int[0]);
        this.f17501OooO0oO = typedArrayOooO0Oo.getInt(Oooo0.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f17502OooO0oo = typedArrayOooO0Oo.getInt(Oooo0.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayOooO0Oo.recycle();
        OooO00o();
        this.f17500OooO = this.f17502OooO0oo == 1;
    }
}
