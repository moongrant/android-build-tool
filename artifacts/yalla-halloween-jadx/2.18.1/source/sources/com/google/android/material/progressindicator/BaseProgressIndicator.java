package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
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
import com.google.android.material.internal.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0O0.OooO0O0;
import o0OOO0O0.OooOOOO;
import o0OOO0O0.OooOo00;
import p103o000oo00.OooOO0O;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseProgressIndicator<S extends o0OOO0O0.OooO0O0> extends ProgressBar {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final int f17478OoooOo0 = Oooo000.Widget_MaterialComponents_ProgressIndicator;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f17479Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public S f17480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f17481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f17482Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17483OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o0OOO0O0.OooO00o f17484OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f17485OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f17486OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooO00o f17487OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO0OO f17488OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0o f17489OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooO0O0 f17490o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HideAnimationBehavior {
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f17485OoooO00 > 0) {
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
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            int i = BaseProgressIndicator.f17478OoooOo0;
            boolean z = false;
            ((OooOOOO) baseProgressIndicator.getCurrentDrawable()).OooO0oO(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z = true;
            }
            if (z) {
                baseProgressIndicator.setVisibility(4);
            }
            Objects.requireNonNull(BaseProgressIndicator.this);
        }
    }

    public class OooO0OO extends OooOO0O {
        public OooO0OO() {
        }

        @Override // p103o000oo00.OooOO0O
        public final void OooO00o() {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.OooO0O0(baseProgressIndicator.f17481Oooo0oO, baseProgressIndicator.f17482Oooo0oo);
        }
    }

    public class OooO0o extends OooOO0O {
        public OooO0o() {
        }

        @Override // p103o000oo00.OooOO0O
        public final void OooO00o() {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f17486OoooO0O) {
                return;
            }
            baseProgressIndicator.setVisibility(baseProgressIndicator.f17483OoooO);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(OooOOO0.OooO00o(context, attributeSet, i, f17478OoooOo0), attributeSet, i);
        this.f17486OoooO0O = false;
        this.f17483OoooO = 4;
        this.f17487OoooOO0 = new OooO00o();
        this.f17490o000oOoO = new OooO0O0();
        this.f17488OoooOOO = new OooO0OO();
        this.f17489OoooOOo = new OooO0o();
        Context context2 = getContext();
        this.f17480Oooo0o = (S) OooO00o(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayOooO0Oo.getInt(Oooo0.BaseProgressIndicator_showDelay, -1);
        this.f17485OoooO00 = Math.min(typedArrayOooO0Oo.getInt(Oooo0.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayOooO0Oo.recycle();
        this.f17484OoooO0 = new o0OOO0O0.OooO00o();
        this.f17479Oooo = true;
    }

    @Nullable
    private OooOo00<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f38103OoooOOo;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f38077OoooOOo;
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
            this.f17481Oooo0oO = i;
            this.f17482Oooo0oo = z;
            this.f17486OoooO0O = true;
            if (getIndeterminateDrawable().isVisible() && this.f17484OoooO0.OooO00o(getContext().getContentResolver()) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                getIndeterminateDrawable().f38104OoooOo0.OooO0Oo();
                return;
            }
            OooO0OO oooO0OO = this.f17488OoooOOO;
            getIndeterminateDrawable();
            oooO0OO.OooO00o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final boolean OooO0OO() {
        boolean z;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
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
        return this.f17480Oooo0o.f38056OooO0o;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f17480Oooo0o.f38054OooO0OO;
    }

    public int getShowAnimationBehavior() {
        return this.f17480Oooo0o.f38057OooO0o0;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f17480Oooo0o.f38055OooO0Oo;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f17480Oooo0o.f38053OooO0O0;
    }

    @Px
    public int getTrackThickness() {
        return this.f17480Oooo0o.f38052OooO00o;
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
            getIndeterminateDrawable().f38104OoooOo0.OooO0OO(this.f17488OoooOOO);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0o(this.f17489OoooOOo);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooO0o(this.f17489OoooOOo);
        }
        if (OooO0OO()) {
            if (this.f17485OoooO00 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17490o000oOoO);
        removeCallbacks(this.f17487OoooOO0);
        ((OooOOOO) getCurrentDrawable()).OooO0OO();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooO(this.f17489OoooOOo);
            getIndeterminateDrawable().f38104OoooOo0.OooO0o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO(this.f17489OoooOOo);
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
        super.onMeasure(i, i2);
        OooOo00<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int iOooO0o0 = currentDrawingDelegate.OooO0o0();
        int iOooO0Oo = currentDrawingDelegate.OooO0Oo();
        setMeasuredDimension(iOooO0o0 < 0 ? getMeasuredWidth() : iOooO0o0 + getPaddingLeft() + getPaddingRight(), iOooO0Oo < 0 ? getMeasuredHeight() : iOooO0Oo + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f17479Oooo) {
            ((OooOOOO) getCurrentDrawable()).OooO0oO(OooO0OO(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f17479Oooo) {
            ((OooOOOO) getCurrentDrawable()).OooO0oO(OooO0OO(), false, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull o0OOO0O0.OooO00o oooO00o) {
        this.f17484OoooO0 = oooO00o;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f38088Oooo0oo = oooO00o;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f38088Oooo0oo = oooO00o;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f17480Oooo0o.f38056OooO0o = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        OooOOOO oooOOOO = (OooOOOO) getCurrentDrawable();
        if (oooOOOO != null) {
            oooOOOO.OooO0OO();
        }
        super.setIndeterminate(z);
        OooOOOO oooOOOO2 = (OooOOOO) getCurrentDrawable();
        if (oooOOOO2 != null) {
            oooOOOO2.OooO0oO(OooO0OO(), false, false);
        }
        if ((oooOOOO2 instanceof o0OOO0O0.Oooo000) && OooO0OO()) {
            ((o0OOO0O0.Oooo000) oooOOOO2).f38104OoooOo0.OooO0o0();
        }
        this.f17486OoooO0O = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof o0OOO0O0.Oooo000)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((OooOOOO) drawable).OooO0OO();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{o0O0000O.OooO0O0(getContext(), p337o0OO0o0.OooO0o.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f17480Oooo0o.f38054OooO0OO = iArr;
        getIndeterminateDrawable().f38104OoooOo0.OooO0O0();
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
            if (!(drawable instanceof o0OOO0O0.OooOO0O)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            o0OOO0O0.OooOO0O oooOO0O = (o0OOO0O0.OooOO0O) drawable;
            oooOO0O.OooO0OO();
            super.setProgressDrawable(oooOO0O);
            oooOO0O.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f17480Oooo0o.f38057OooO0o0 = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        S s = this.f17480Oooo0o;
        if (s.f38055OooO0Oo != i) {
            s.f38055OooO0Oo = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i) {
        S s = this.f17480Oooo0o;
        if (s.f38053OooO0O0 != i) {
            s.f38053OooO0O0 = Math.min(i, s.f38052OooO00o / 2);
        }
    }

    public void setTrackThickness(@Px int i) {
        S s = this.f17480Oooo0o;
        if (s.f38052OooO00o != i) {
            s.f38052OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f17483OoooO = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public o0OOO0O0.Oooo000<S> getIndeterminateDrawable() {
        return (o0OOO0O0.Oooo000) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public o0OOO0O0.OooOO0O<S> getProgressDrawable() {
        return (o0OOO0O0.OooOO0O) super.getProgressDrawable();
    }
}
