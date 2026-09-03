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
import java.util.Objects;
import o0OOO0O0.OooO0O0;
import o0OOO0O0.OooO0OO;
import o0OOO0O0.OooOO0;
import o0OOO0O0.OooOO0O;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final int f17495OoooOoO = Oooo000.Widget_MaterialComponents_CircularProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final OooO0O0 OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f17480Oooo0o).f17496OooO;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f17480Oooo0o).f17498OooO0oo;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f17480Oooo0o).f17497OooO0oO;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f17480Oooo0o).f17496OooO = i;
        invalidate();
    }

    public void setIndicatorInset(@Px int i) {
        S s = this.f17480Oooo0o;
        if (((CircularProgressIndicatorSpec) s).f17498OooO0oo != i) {
            ((CircularProgressIndicatorSpec) s).f17498OooO0oo = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        S s = this.f17480Oooo0o;
        if (((CircularProgressIndicatorSpec) s).f17497OooO0oO != iMax) {
            ((CircularProgressIndicatorSpec) s).f17497OooO0oO = iMax;
            Objects.requireNonNull((CircularProgressIndicatorSpec) s);
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        Objects.requireNonNull((CircularProgressIndicatorSpec) this.f17480Oooo0o);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, f17495OoooOoO);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f17480Oooo0o;
        setIndeterminateDrawable(new o0OOO0O0.Oooo000(context2, circularProgressIndicatorSpec, new OooO0OO(circularProgressIndicatorSpec), new OooOO0(circularProgressIndicatorSpec)));
        Context context3 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec2 = (CircularProgressIndicatorSpec) this.f17480Oooo0o;
        setProgressDrawable(new OooOO0O(context3, circularProgressIndicatorSpec2, new OooO0OO(circularProgressIndicatorSpec2)));
    }
}
