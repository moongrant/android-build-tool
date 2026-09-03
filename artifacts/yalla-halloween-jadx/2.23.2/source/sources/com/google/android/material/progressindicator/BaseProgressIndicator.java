package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.o00oO0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p274o0O000oo.OooOOO0;
import p547o0oO0Ooo.a5;
import p547o0oO0Ooo.o4;
import p547o0oO0Ooo.p4;
import p547o0oO0Ooo.u4;
import p547o0oO0Ooo.x4;
import p547o0oO0Ooo.y4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends p4> extends ProgressBar {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int f16989OooOOOo = o0000O0O.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o4 f16990OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final S f16991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16992OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16993OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f16994OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f16995OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f16996OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16997OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f16998OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO0OO f16999OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0O0 f17000OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO0o f17001OooOOOO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HideAnimationBehavior {
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BaseProgressIndicator.f16989OooOOOo;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f16995OooO0oo > 0) {
                SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BaseProgressIndicator.f16989OooOOOo;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            boolean z = false;
            ((x4) baseProgressIndicator.getCurrentDrawable()).OooO0o0(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z = true;
            }
            if (z) {
                baseProgressIndicator.setVisibility(4);
            }
            baseProgressIndicator.getClass();
        }
    }

    public class OooO0OO extends o00O00OO.OooO0OO {
        public OooO0OO() {
        }

        @Override // o00O00OO.OooO0OO
        public final void OooO00o(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.OooO0O0(baseProgressIndicator.f16993OooO0o0, baseProgressIndicator.f16992OooO0o);
        }
    }

    public class OooO0o extends o00O00OO.OooO0OO {
        public OooO0o() {
        }

        @Override // o00O00OO.OooO0OO
        public final void OooO00o(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f16996OooOO0) {
                return;
            }
            baseProgressIndicator.setVisibility(baseProgressIndicator.f16997OooOO0O);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, f16989OooOOOo), attributeSet, i);
        this.f16996OooOO0 = false;
        this.f16997OooOO0O = 4;
        this.f16998OooOO0o = new OooO00o();
        this.f17000OooOOO0 = new OooO0O0();
        this.f16999OooOOO = new OooO0OO();
        this.f17001OooOOOO = new OooO0o();
        Context context2 = getContext();
        this.f16991OooO0Oo = (S) OooO00o(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_showDelay, -1);
        this.f16995OooO0oo = Math.min(typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayOooO0Oo.recycle();
        this.f16990OooO = new o4();
        this.f16994OooO0oO = true;
    }

    @Nullable
    private y4<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f55778OooOOOO;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f55831OooOOOO;
    }

    public abstract S OooO00o(@NonNull Context context, @NonNull AttributeSet attributeSet);

    public void OooO0O0(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f16993OooO0o0 = i;
            this.f16992OooO0o = z;
            this.f16996OooOO0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                o4 o4Var = this.f16990OooO;
                ContentResolver contentResolver = getContext().getContentResolver();
                o4Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f55779OooOOOo.OooO0Oo();
                    return;
                }
            }
            this.f16999OooOOO.OooO00o(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final boolean OooO0OO() {
        boolean z;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (!ViewCompat.OooOO0O.OooO0O0(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (true) {
            if (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f16991OooO0Oo.f55809OooO0o;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f16991OooO0Oo.f55807OooO0OO;
    }

    public int getShowAnimationBehavior() {
        return this.f16991OooO0Oo.f55810OooO0o0;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f16991OooO0Oo.f55808OooO0Oo;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f16991OooO0Oo.f55806OooO0O0;
    }

    @Px
    public int getTrackThickness() {
        return this.f16991OooO0Oo.f55805OooO00o;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f55779OooOOOo.OooO0OO(this.f16999OooOOO);
        }
        u4<S> progressDrawable = getProgressDrawable();
        OooO0o oooO0o = this.f17001OooOOOO;
        if (progressDrawable != null) {
            u4<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f55839OooO == null) {
                progressDrawable2.f55839OooO = new ArrayList();
            }
            if (!progressDrawable2.f55839OooO.contains(oooO0o)) {
                progressDrawable2.f55839OooO.add(oooO0o);
            }
        }
        if (getIndeterminateDrawable() != null) {
            a5<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f55839OooO == null) {
                indeterminateDrawable.f55839OooO = new ArrayList();
            }
            if (!indeterminateDrawable.f55839OooO.contains(oooO0o)) {
                indeterminateDrawable.f55839OooO.add(oooO0o);
            }
        }
        if (OooO0OO()) {
            if (this.f16995OooO0oo > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17000OooOOO0);
        removeCallbacks(this.f16998OooOO0o);
        ((x4) getCurrentDrawable()).OooO0o0(false, false, false);
        a5<S> indeterminateDrawable = getIndeterminateDrawable();
        OooO0o oooO0o = this.f17001OooOOOO;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().OooO0oO(oooO0o);
            getIndeterminateDrawable().f55779OooOOOo.OooO0o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0oO(oooO0o);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        y4<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.OooO0o0() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.OooO0o0() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.OooO0Oo() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.OooO0Oo() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f16994OooO0oO) {
            ((x4) getCurrentDrawable()).OooO0o0(OooO0OO(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f16994OooO0oO) {
            ((x4) getCurrentDrawable()).OooO0o0(OooO0OO(), false, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull o4 o4Var) {
        this.f16990OooO = o4Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f55841OooO0o = o4Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f55841OooO0o = o4Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f16991OooO0Oo.f55809OooO0o = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        x4 x4Var = (x4) getCurrentDrawable();
        if (x4Var != null) {
            x4Var.OooO0o0(false, false, false);
        }
        super.setIndeterminate(z);
        x4 x4Var2 = (x4) getCurrentDrawable();
        if (x4Var2 != null) {
            x4Var2.OooO0o0(OooO0OO(), false, false);
        }
        if ((x4Var2 instanceof a5) && OooO0OO()) {
            ((a5) x4Var2).f55779OooOOOo.OooO0o0();
        }
        this.f16996OooOO0 = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof a5)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((x4) drawable).OooO0o0(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{OooOOO0.OooO0O0(o00000.colorPrimary, getContext(), -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f16991OooO0Oo.f55807OooO0OO = iArr;
        getIndeterminateDrawable().f55779OooOOOo.OooO0O0();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        OooO0O0(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof u4)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            u4 u4Var = (u4) drawable;
            u4Var.OooO0o0(false, false, false);
            super.setProgressDrawable(u4Var);
            u4Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f16991OooO0Oo.f55810OooO0o0 = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        S s = this.f16991OooO0Oo;
        if (s.f55808OooO0Oo != i) {
            s.f55808OooO0Oo = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i) {
        S s = this.f16991OooO0Oo;
        if (s.f55806OooO0O0 != i) {
            s.f55806OooO0O0 = Math.min(i, s.f55805OooO00o / 2);
        }
    }

    public void setTrackThickness(@Px int i) {
        S s = this.f16991OooO0Oo;
        if (s.f55805OooO00o != i) {
            s.f55805OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f16997OooOO0O = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public a5<S> getIndeterminateDrawable() {
        return (a5) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public u4<S> getProgressDrawable() {
        return (u4) super.getProgressDrawable();
    }
}
