package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo0 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Rect f17289OooO00o;

    public Oooo0(@NonNull Rect rect) {
        this.f17289OooO00o = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f, @NonNull Rect rect, @NonNull Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left;
        int i2 = i + ((int) ((rect4.left - i) * f));
        int i3 = rect3.top;
        int i4 = i3 + ((int) ((rect4.top - i3) * f));
        int i5 = rect3.right;
        int i6 = i5 + ((int) ((rect4.right - i5) * f));
        int i7 = rect3.bottom;
        int i8 = i7 + ((int) ((rect4.bottom - i7) * f));
        Rect rect5 = this.f17289OooO00o;
        rect5.set(i2, i4, i6, i8);
        return rect5;
    }
}
