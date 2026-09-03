package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o00oO0o;
import p272o0O0000o.o00000;
import p272o0O0000o.o000OO;
import p547o0oO0Ooo.p4;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends p4 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f17011OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17012OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17013OooO0oo;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.linearProgressIndicatorStyle);
    }

    @Override // p547o0oO0Ooo.p4
    public final void OooO00o() {
        if (this.f17012OooO0oO == 0) {
            if (this.f55806OooO0O0 > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f55807OooO0OO.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        int i2 = LinearProgressIndicator.f17010OooOOo0;
        super(context, attributeSet, i, i2);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.LinearProgressIndicator, o00000.linearProgressIndicatorStyle, i2, new int[0]);
        this.f17012OooO0oO = typedArrayOooO0Oo.getInt(o000OO.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f17013OooO0oo = typedArrayOooO0Oo.getInt(o000OO.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayOooO0Oo.recycle();
        OooO00o();
        this.f17011OooO = this.f17013OooO0oo == 1;
    }
}
