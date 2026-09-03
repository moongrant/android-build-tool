package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.internal.o00oO0o;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o000OO;
import p273o0O00Oo.OooO0OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class CircularProgressIndicatorSpec extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17480OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Px
    public int f17481OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Px
    public int f17482OooO0oo;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.circularProgressIndicatorStyle);
    }

    @Override // p273o0O00Oo.OooO0OO
    public final void OooO00o() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        int i2 = CircularProgressIndicator.f17479OooOOo0;
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(o00000O.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(o00000O.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.CircularProgressIndicator, i, i2, new int[0]);
        this.f17481OooO0oO = Math.max(c1.OooO0OO(context, typedArrayOooO0Oo, o000OO.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f41701OooO00o * 2);
        this.f17482OooO0oo = c1.OooO0OO(context, typedArrayOooO0Oo, o000OO.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f17480OooO = typedArrayOooO0Oo.getInt(o000OO.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayOooO0Oo.recycle();
    }
}
