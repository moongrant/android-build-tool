package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.internal.o000oOoO;
import o0OOO0O.OooO0OO;
import o0OOO0O0.OooO0O0;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicatorSpec extends OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17496OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Px
    public int f17497OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Px
    public int f17498OooO0oo;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.circularProgressIndicatorStyle);
    }

    @Override // o0OOO0O0.OooO0O0
    public final void OooO00o() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        int i2 = CircularProgressIndicator.f17495OoooOoO;
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(OooOO0.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(OooOO0.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSet, Oooo0.CircularProgressIndicator, i, i2, new int[0]);
        this.f17497OooO0oO = Math.max(OooO0OO.OooO0OO(context, typedArrayOooO0Oo, Oooo0.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f38052OooO00o * 2);
        this.f17498OooO0oo = OooO0OO.OooO0OO(context, typedArrayOooO0Oo, Oooo0.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f17496OooO = typedArrayOooO0Oo.getInt(Oooo0.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayOooO0Oo.recycle();
    }
}
