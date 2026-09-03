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
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.o00oO0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p079o000Oo0o.o000OO00;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p272o0O000oo.OooOOO;
import p273o0O00Oo.OooO0OO;
import p273o0O00Oo.OooOOO0;
import p273o0O00Oo.OooOo;
import p273o0O00Oo.OooOo00;
import p273o0O00Oo.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends p273o0O00Oo.OooO0OO> extends ProgressBar {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int f17462OooOOOo = o0000O0O.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public p273o0O00Oo.OooO0O0 f17463OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final S f17464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f17465OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f17466OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f17467OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f17468OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f17469OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17470OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f17471OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO0OO f17472OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0O0 f17473OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO0o f17474OooOOOO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HideAnimationBehavior {
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BaseProgressIndicator.f17462OooOOOo;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f17468OooO0oo > 0) {
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
            int i = BaseProgressIndicator.f17462OooOOOo;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            boolean z = false;
            ((OooOo00) baseProgressIndicator.getCurrentDrawable()).OooO0o0(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z = true;
            }
            if (z) {
                baseProgressIndicator.setVisibility(4);
            }
            baseProgressIndicator.getClass();
        }
    }

    public class OooO0OO extends o000OO00 {
        public OooO0OO() {
        }

        @Override // p079o000Oo0o.o000OO00
        public final void OooO00o(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.OooO0O0(baseProgressIndicator.f17466OooO0o0, baseProgressIndicator.f17465OooO0o);
        }
    }

    public class OooO0o extends o000OO00 {
        public OooO0o() {
        }

        @Override // p079o000Oo0o.o000OO00
        public final void OooO00o(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f17469OooOO0) {
                return;
            }
            baseProgressIndicator.setVisibility(baseProgressIndicator.f17470OooOO0O);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, f17462OooOOOo), attributeSet, i);
        this.f17469OooOO0 = false;
        this.f17470OooOO0O = 4;
        this.f17471OooOO0o = new OooO00o();
        this.f17473OooOOO0 = new OooO0O0();
        this.f17472OooOOO = new OooO0OO();
        this.f17474OooOOOO = new OooO0o();
        Context context2 = getContext();
        this.f17464OooO0Oo = (S) OooO00o(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_showDelay, -1);
        this.f17468OooO0oo = Math.min(typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayOooO0Oo.recycle();
        this.f17463OooO = new p273o0O00Oo.OooO0O0();
        this.f17467OooO0oO = true;
    }

    @Nullable
    private OooOo<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f41746OooOOOO;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f41727OooOOOO;
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
            this.f17466OooO0o0 = i;
            this.f17465OooO0o = z;
            this.f17469OooOO0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                p273o0O00Oo.OooO0O0 oooO0O0 = this.f17463OooO;
                ContentResolver contentResolver = getContext().getContentResolver();
                oooO0O0.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f41747OooOOOo.OooO0Oo();
                    return;
                }
            }
            this.f17472OooOOO.OooO00o(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final boolean OooO0OO() {
        boolean z;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        return this.f17464OooO0Oo.f41705OooO0o;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f17464OooO0Oo.f41703OooO0OO;
    }

    public int getShowAnimationBehavior() {
        return this.f17464OooO0Oo.f41706OooO0o0;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f17464OooO0Oo.f41704OooO0Oo;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f17464OooO0Oo.f41702OooO0O0;
    }

    @Px
    public int getTrackThickness() {
        return this.f17464OooO0Oo.f41701OooO00o;
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
            getIndeterminateDrawable().f41747OooOOOo.OooO0OO(this.f17472OooOOO);
        }
        OooOOO0<S> progressDrawable = getProgressDrawable();
        OooO0o oooO0o = this.f17474OooOOOO;
        if (progressDrawable != null) {
            OooOOO0<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f41736OooO == null) {
                progressDrawable2.f41736OooO = new ArrayList();
            }
            if (!progressDrawable2.f41736OooO.contains(oooO0o)) {
                progressDrawable2.f41736OooO.add(oooO0o);
            }
        }
        if (getIndeterminateDrawable() != null) {
            Oooo0<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f41736OooO == null) {
                indeterminateDrawable.f41736OooO = new ArrayList();
            }
            if (!indeterminateDrawable.f41736OooO.contains(oooO0o)) {
                indeterminateDrawable.f41736OooO.add(oooO0o);
            }
        }
        if (OooO0OO()) {
            if (this.f17468OooO0oo > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17473OooOOO0);
        removeCallbacks(this.f17471OooOO0o);
        ((OooOo00) getCurrentDrawable()).OooO0o0(false, false, false);
        Oooo0<S> indeterminateDrawable = getIndeterminateDrawable();
        OooO0o oooO0o = this.f17474OooOOOO;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().OooO0oO(oooO0o);
            getIndeterminateDrawable().f41747OooOOOo.OooO0o();
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
        OooOo<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        setMeasuredDimension(currentDrawingDelegate.OooO0o0() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.OooO0o0() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.OooO0Oo() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.OooO0Oo() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f17467OooO0oO) {
            ((OooOo00) getCurrentDrawable()).OooO0o0(OooO0OO(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f17467OooO0oO) {
            ((OooOo00) getCurrentDrawable()).OooO0o0(OooO0OO(), false, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull p273o0O00Oo.OooO0O0 oooO0O0) {
        this.f17463OooO = oooO0O0;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f41738OooO0o = oooO0O0;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f41738OooO0o = oooO0O0;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f17464OooO0Oo.f41705OooO0o = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) getCurrentDrawable();
        if (oooOo00 != null) {
            oooOo00.OooO0o0(false, false, false);
        }
        super.setIndeterminate(z);
        OooOo00 oooOo01 = (OooOo00) getCurrentDrawable();
        if (oooOo01 != null) {
            oooOo01.OooO0o0(OooO0OO(), false, false);
        }
        if ((oooOo01 instanceof Oooo0) && OooO0OO()) {
            ((Oooo0) oooOo01).f41747OooOOOo.OooO0o0();
        }
        this.f17469OooOO0 = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof Oooo0)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((OooOo00) drawable).OooO0o0(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{OooOOO.OooO0O0(o00000.colorPrimary, getContext(), -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f17464OooO0Oo.f41703OooO0OO = iArr;
        getIndeterminateDrawable().f41747OooOOOo.OooO0O0();
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
            if (!(drawable instanceof OooOOO0)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            OooOOO0 oooOOO0 = (OooOOO0) drawable;
            oooOOO0.OooO0o0(false, false, false);
            super.setProgressDrawable(oooOOO0);
            oooOOO0.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f17464OooO0Oo.f41706OooO0o0 = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        S s = this.f17464OooO0Oo;
        if (s.f41704OooO0Oo != i) {
            s.f41704OooO0Oo = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i) {
        S s = this.f17464OooO0Oo;
        if (s.f41702OooO0O0 != i) {
            s.f41702OooO0O0 = Math.min(i, s.f41701OooO00o / 2);
        }
    }

    public void setTrackThickness(@Px int i) {
        S s = this.f17464OooO0Oo;
        if (s.f41701OooO00o != i) {
            s.f41701OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f17470OooOO0O = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Oooo0<S> getIndeterminateDrawable() {
        return (Oooo0) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public OooOOO0<S> getProgressDrawable() {
        return (OooOOO0) super.getProgressDrawable();
    }
}
