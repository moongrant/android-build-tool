package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0O0.OooO0O0;
import o0OOO0O0.OooOO0O;
import o0OOO0O0.OooOo;
import o0OOO0O0.Oooo0;
import o0OOO0O0.o00Ooo;
import o0OOO0O0.o0OoOo0;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final int f17499OoooOoO = Oooo000.Widget_MaterialComponents_LinearProgressIndicator;

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
    public final OooO0O0 OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void OooO0O0(int i, boolean z) {
        S s = this.f17480Oooo0o;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).f17501OooO0oO == 0 && isIndeterminate()) {
            return;
        }
        super.OooO0O0(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17501OooO0oO;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17502OooO0oo;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f17480Oooo0o;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).f17502OooO0oo != 1) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17502OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || ((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17502OooO0oo != 3)) {
                z2 = false;
            }
        }
        linearProgressIndicatorSpec.f17500OooO = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        o0OOO0O0.Oooo000<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        OooOO0O<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17501OooO0oO == i) {
            return;
        }
        if (OooO0OO() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.f17480Oooo0o;
        ((LinearProgressIndicatorSpec) s).f17501OooO0oO = i;
        ((LinearProgressIndicatorSpec) s).OooO00o();
        if (i == 0) {
            o0OOO0O0.Oooo000<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            o0OoOo0 o0oooo1 = new o0OoOo0((LinearProgressIndicatorSpec) this.f17480Oooo0o);
            indeterminateDrawable.f38104OoooOo0 = o0oooo1;
            o0oooo1.f38095OooO00o = indeterminateDrawable;
        } else {
            o0OOO0O0.Oooo000<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            o00Ooo o00ooo2 = new o00Ooo(getContext(), (LinearProgressIndicatorSpec) this.f17480Oooo0o);
            indeterminateDrawable2.f38104OoooOo0 = o00ooo2;
            o00ooo2.f38095OooO00o = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f17480Oooo0o).OooO00o();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f17480Oooo0o;
        ((LinearProgressIndicatorSpec) s).f17502OooO0oo = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) this.f17480Oooo0o).f17502OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || i != 3)) {
                z = false;
            }
        }
        linearProgressIndicatorSpec.f17500OooO = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f17480Oooo0o).OooO00o();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        OooOo o00ooo2;
        super(context, attributeSet, i, f17499OoooOoO);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f17480Oooo0o;
        Oooo0 oooo0 = new Oooo0(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f17501OooO0oO == 0) {
            o00ooo2 = new o0OoOo0(linearProgressIndicatorSpec);
        } else {
            o00ooo2 = new o00Ooo(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new o0OOO0O0.Oooo000(context2, linearProgressIndicatorSpec, oooo0, o00ooo2));
        Context context3 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f17480Oooo0o;
        setProgressDrawable(new OooOO0O(context3, linearProgressIndicatorSpec2, new Oooo0(linearProgressIndicatorSpec2)));
    }
}
