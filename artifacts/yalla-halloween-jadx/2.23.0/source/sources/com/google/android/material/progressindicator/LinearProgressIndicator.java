package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0O;
import p273o0O00Oo.OooO0OO;
import p273o0O00Oo.OooOOO0;
import p273o0O00Oo.Oooo0;
import p273o0O00Oo.Oooo000;
import p273o0O00Oo.o000oOoO;
import p273o0O00Oo.o00O0O;
import p273o0O00Oo.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final int f17483OooOOo0 = o0000O0O.Widget_MaterialComponents_LinearProgressIndicator;

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
    public final OooO0OO OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void OooO0O0(int i, boolean z) {
        S s = this.f17464OooO0Oo;
        if (s != 0 && ((LinearProgressIndicatorSpec) s).f17485OooO0oO == 0 && isIndeterminate()) {
            return;
        }
        super.OooO0O0(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f17464OooO0Oo).f17485OooO0oO;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f17464OooO0Oo).f17486OooO0oo;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f17464OooO0Oo;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).f17486OooO0oo != 1) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) s).f17486OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || ((LinearProgressIndicatorSpec) s).f17486OooO0oo != 3)) {
                z2 = false;
            }
        }
        linearProgressIndicatorSpec.f17484OooO = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        Oooo0<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        OooOOO0<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        S s = this.f17464OooO0Oo;
        if (((LinearProgressIndicatorSpec) s).f17485OooO0oO == i) {
            return;
        }
        if (OooO0OO() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) s).f17485OooO0oO = i;
        ((LinearProgressIndicatorSpec) s).OooO00o();
        if (i == 0) {
            Oooo0<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            o00O0O o00o0o2 = new o00O0O((LinearProgressIndicatorSpec) s);
            indeterminateDrawable.f41747OooOOOo = o00o0o2;
            o00o0o2.f41748OooO00o = indeterminateDrawable;
        } else {
            Oooo0<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            oo000o oo000oVar = new oo000o(getContext(), (LinearProgressIndicatorSpec) s);
            indeterminateDrawable2.f41747OooOOOo = oo000oVar;
            oo000oVar.f41748OooO00o = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f17464OooO0Oo).OooO00o();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f17464OooO0Oo;
        ((LinearProgressIndicatorSpec) s).f17486OooO0oo = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if ((ViewCompat.OooO.OooO0Oo(this) != 1 || ((LinearProgressIndicatorSpec) s).f17486OooO0oo != 2) && (ViewCompat.OooO.OooO0Oo(this) != 0 || i != 3)) {
                z = false;
            }
        }
        linearProgressIndicatorSpec.f17484OooO = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f17464OooO0Oo).OooO00o();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        Oooo000 oo000oVar;
        super(context, attributeSet, i, f17483OooOOo0);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f17464OooO0Oo;
        o000oOoO o000oooo2 = new o000oOoO(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f17485OooO0oO == 0) {
            oo000oVar = new o00O0O(linearProgressIndicatorSpec);
        } else {
            oo000oVar = new oo000o(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new Oooo0(context2, linearProgressIndicatorSpec, o000oooo2, oo000oVar));
        setProgressDrawable(new OooOOO0(getContext(), linearProgressIndicatorSpec, new o000oOoO(linearProgressIndicatorSpec)));
    }
}
