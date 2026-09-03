package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p547o0oO0Ooo.a5;
import p547o0oO0Ooo.b5;
import p547o0oO0Ooo.d5;
import p547o0oO0Ooo.g5;
import p547o0oO0Ooo.p4;
import p547o0oO0Ooo.u4;
import p547o0oO0Ooo.z4;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int f17010OooOOo0 = o0000O0O.Widget_MaterialComponents_LinearProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final p4 OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void OooO0O0(int i, boolean z) {
        S s = this.f16991OooO0Oo;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).f17012OooO0oO == 0 && isIndeterminate()) {
            return;
        }
        super.OooO0O0(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f16991OooO0Oo).f17012OooO0oO;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f16991OooO0Oo).f17013OooO0oo;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f16991OooO0Oo;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).f17013OooO0oo != 1) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) s).f17013OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || ((LinearProgressIndicatorSpec) s).f17013OooO0oo != 3)) {
                z2 = false;
            }
        }
        linearProgressIndicatorSpec.f17011OooO = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        a5<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        u4<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        S s = this.f16991OooO0Oo;
        if (((LinearProgressIndicatorSpec) s).f17012OooO0oO == i) {
            return;
        }
        if (OooO0OO() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) s).f17012OooO0oO = i;
        ((LinearProgressIndicatorSpec) s).OooO00o();
        if (i == 0) {
            a5<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            d5 d5Var = new d5((LinearProgressIndicatorSpec) s);
            indeterminateDrawable.f55779OooOOOo = d5Var;
            d5Var.f55851OooO00o = indeterminateDrawable;
        } else {
            a5<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            g5 g5Var = new g5(getContext(), (LinearProgressIndicatorSpec) s);
            indeterminateDrawable2.f55779OooOOOo = g5Var;
            g5Var.f55851OooO00o = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f16991OooO0Oo).OooO00o();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f16991OooO0Oo;
        ((LinearProgressIndicatorSpec) s).f17013OooO0oo = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) s).f17013OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || i != 3)) {
                z = false;
            }
        }
        linearProgressIndicatorSpec.f17011OooO = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f16991OooO0Oo).OooO00o();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        z4 g5Var;
        super(context, attributeSet, i, f17010OooOOo0);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f16991OooO0Oo;
        b5 b5Var = new b5(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f17012OooO0oO == 0) {
            g5Var = new d5(linearProgressIndicatorSpec);
        } else {
            g5Var = new g5(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new a5(context2, linearProgressIndicatorSpec, b5Var, g5Var));
        setProgressDrawable(new u4(getContext(), linearProgressIndicatorSpec, new b5(linearProgressIndicatorSpec)));
    }
}
