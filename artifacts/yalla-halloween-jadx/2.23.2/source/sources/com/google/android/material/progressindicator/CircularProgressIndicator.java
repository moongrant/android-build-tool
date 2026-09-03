package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p547o0oO0Ooo.a5;
import p547o0oO0Ooo.p4;
import p547o0oO0Ooo.q4;
import p547o0oO0Ooo.t4;
import p547o0oO0Ooo.u4;

/* JADX INFO: loaded from: classes3.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int f17006OooOOo0 = o0000O0O.Widget_MaterialComponents_CircularProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final p4 OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f16991OooO0Oo).f17007OooO;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f16991OooO0Oo).f17009OooO0oo;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f16991OooO0Oo).f17008OooO0oO;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f16991OooO0Oo).f17007OooO = i;
        invalidate();
    }

    public void setIndicatorInset(@Px int i) {
        S s = this.f16991OooO0Oo;
        if (((CircularProgressIndicatorSpec) s).f17009OooO0oo != i) {
            ((CircularProgressIndicatorSpec) s).f17009OooO0oo = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s = this.f16991OooO0Oo;
        if (((CircularProgressIndicatorSpec) s).f17008OooO0oO != iMax) {
            ((CircularProgressIndicatorSpec) s).f17008OooO0oO = iMax;
            ((CircularProgressIndicatorSpec) s).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f16991OooO0Oo).getClass();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, f17006OooOOo0);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f16991OooO0Oo;
        setIndeterminateDrawable(new a5(context2, circularProgressIndicatorSpec, new q4(circularProgressIndicatorSpec), new t4(circularProgressIndicatorSpec)));
        setProgressDrawable(new u4(getContext(), circularProgressIndicatorSpec, new q4(circularProgressIndicatorSpec)));
    }
}
