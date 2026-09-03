package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.OooOo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.OooOOO0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0O000.OooOOO;
import o0O00o00.Oooo0;
import p188o00o0O.Oooo000;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements o0O00O0o.OooO00o, Oooo0, CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final int f17017OooOo00 = o0000O0O.Widget_Design_FloatingActionButton;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17018OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f17019OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17020OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17021OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f17022OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17023OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17024OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17025OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f17026OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f17027OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Rect f17028OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Rect f17029OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final o0O00O0o.OooO0O0 f17030OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final OooOo f17031OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public o0O00O.OooOO0O f17032OooOOoo;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OooO00o {
        public void OooO00o(FloatingActionButton floatingActionButton) {
        }

        public void OooO0O0() {
        }
    }

    public class OooO0O0 implements p275o0O00Ooo.OooO {
        public OooO0O0() {
        }
    }

    public class OooO0OO<T extends FloatingActionButton> implements OooOO0O.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o0O000.OooOo<T> f17036OooO00o;

        public OooO0OO(BottomAppBar.OooO0O0 oooO0O0) {
            this.f17036OooO00o = oooO0O0;
        }

        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOO0
        public final void OooO00o() {
            BottomAppBar.OooO0O0 oooO0O0 = (BottomAppBar.OooO0O0) this.f17036OooO00o;
            oooO0O0.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f16374OooooO0 != 1) {
                return;
            }
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            float translationX = floatingActionButton.getTranslationX();
            float f = bottomAppBar.getTopEdgeTreatment().f16423OooO0oo;
            MaterialShapeDrawable materialShapeDrawable = bottomAppBar.f16369OoooOo0;
            if (f != translationX) {
                bottomAppBar.getTopEdgeTreatment().f16423OooO0oo = translationX;
                materialShapeDrawable.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (bottomAppBar.getTopEdgeTreatment().f16422OooO0oO != fMax) {
                OooOOO0 topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
                if (fMax < 0.0f) {
                    topEdgeTreatment.getClass();
                    throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                }
                topEdgeTreatment.f16422OooO0oO = fMax;
                materialShapeDrawable.invalidateSelf();
            }
            materialShapeDrawable.OooOOOO(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOO0
        public final void OooO0O0() {
            BottomAppBar.OooO0O0 oooO0O0 = (BottomAppBar.OooO0O0) this.f17036OooO00o;
            oooO0O0.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            MaterialShapeDrawable materialShapeDrawable = bottomAppBar.f16369OoooOo0;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            materialShapeDrawable.OooOOOO((floatingActionButton.getVisibility() == 0 && bottomAppBar.f16374OooooO0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof OooO0OO) && ((OooO0OO) obj).f17036OooO00o.equals(this.f17036OooO00o);
        }

        public final int hashCode() {
            return this.f17036OooO00o.hashCode();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Size {
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private OooOO0O getImpl() {
        if (this.f17032OooOOoo == null) {
            this.f17032OooOOoo = new o0O00O.OooOO0O(this, new OooO0O0());
        }
        return this.f17032OooOOoo;
    }

    public final boolean OooO() {
        OooOO0O impl = getImpl();
        if (impl.f17086OooOo0O.getVisibility() == 0) {
            if (impl.f17080OooOOo != 1) {
                return false;
            }
        } else if (impl.f17080OooOOo == 2) {
            return false;
        }
        return true;
    }

    @Override // o0O00O0o.OooO00o
    public final boolean OooO00o() {
        return this.f17030OooOOo.f41697OooO0O0;
    }

    public final void OooO0Oo(@NonNull BottomAppBar.OooO00o oooO00o) {
        OooOO0O impl = getImpl();
        if (impl.f17085OooOo00 == null) {
            impl.f17085OooOo00 = new ArrayList<>();
        }
        impl.f17085OooOo00.add(oooO00o);
    }

    public final void OooO0o(@NonNull BottomAppBar.OooO0O0 oooO0O0) {
        OooOO0O impl = getImpl();
        OooO0OO oooO0OO = new OooO0OO(oooO0O0);
        if (impl.f17084OooOo0 == null) {
            impl.f17084OooOo0 = new ArrayList<>();
        }
        impl.f17084OooOo0.add(oooO0OO);
    }

    public final void OooO0o0(@NonNull com.google.android.material.bottomappbar.OooOO0O oooOO0O) {
        OooOO0O impl = getImpl();
        if (impl.f17082OooOOoo == null) {
            impl.f17082OooOOoo = new ArrayList<>();
        }
        impl.f17082OooOOoo.add(oooOO0O);
    }

    public final int OooO0oO(int i) {
        int i2 = this.f17024OooOO0O;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(o00000O.design_fab_size_normal) : resources.getDimensionPixelSize(o00000O.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? OooO0oO(1) : OooO0oO(0);
    }

    public final void OooO0oo(@Nullable com.google.android.material.bottomappbar.OooO oooO, boolean z) {
        OooOO0O impl = getImpl();
        OooO0o oooO0o = oooO == null ? null : new OooO0o(this, oooO);
        if (impl.f17086OooOo0O.getVisibility() != 0 ? impl.f17080OooOOo != 2 : impl.f17080OooOOo == 1) {
            return;
        }
        Animator animator = impl.f17075OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        FloatingActionButton floatingActionButton = impl.f17086OooOo0O;
        if (!(ViewCompat.OooOO0O.OooO0OO(floatingActionButton) && !floatingActionButton.isInEditMode())) {
            floatingActionButton.OooO0O0(z ? 8 : 4, z);
            if (oooO0o != null) {
                oooO0o.f17048OooO00o.OooO00o(oooO0o.f17049OooO0O0);
                return;
            }
            return;
        }
        OooOOO oooOOO = impl.f17076OooOOO;
        AnimatorSet animatorSetOooO0O0 = oooOOO != null ? impl.OooO0O0(oooOOO, 0.0f, 0.0f, 0.0f) : impl.OooO0OO(0.0f, 0.4f, 0.4f, OooOO0O.f17057Oooo000, OooOO0O.f17058Oooo00O);
        animatorSetOooO0O0.addListener(new OooO(impl, z, oooO0o));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f17085OooOo00;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetOooO0O0.addListener(it.next());
            }
        }
        animatorSetOooO0O0.start();
    }

    public final boolean OooOO0() {
        OooOO0O impl = getImpl();
        if (impl.f17086OooOo0O.getVisibility() != 0) {
            if (impl.f17080OooOOo != 2) {
                return false;
            }
        } else if (impl.f17080OooOOo == 1) {
            return false;
        }
        return true;
    }

    public final void OooOO0O(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f17028OooOOOO;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void OooOO0o() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f17021OooO0oO;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f17022OooO0oo;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.OooOOO0.OooO0OO(colorForState, mode));
    }

    public final void OooOOO0(@Nullable com.google.android.material.bottomappbar.OooO.OooO00o oooO00o, boolean z) {
        OooOO0O impl = getImpl();
        OooO0o oooO0o = oooO00o == null ? null : new OooO0o(this, oooO00o);
        if (impl.f17086OooOo0O.getVisibility() == 0 ? impl.f17080OooOOo != 1 : impl.f17080OooOOo == 2) {
            return;
        }
        Animator animator = impl.f17075OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.f17077OooOOO0 == null;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        FloatingActionButton floatingActionButton = impl.f17086OooOo0O;
        boolean z3 = ViewCompat.OooOO0O.OooO0OO(floatingActionButton) && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f17090OooOoOO;
        if (!z3) {
            floatingActionButton.OooO0O0(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f17079OooOOOo = 1.0f;
            impl.OooO00o(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (oooO0o != null) {
                oooO0o.f17048OooO00o.OooO0O0();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.f17079OooOOOo = f;
            impl.OooO00o(f, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        OooOOO oooOOO = impl.f17077OooOOO0;
        AnimatorSet animatorSetOooO0O0 = oooOOO != null ? impl.OooO0O0(oooOOO, 1.0f, 1.0f, 1.0f) : impl.OooO0OO(1.0f, 1.0f, 1.0f, OooOO0O.f17054OooOooO, OooOO0O.f17055OooOooo);
        animatorSetOooO0O0.addListener(new OooOO0(impl, z, oooO0o));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f17082OooOOoo;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetOooO0O0.addListener(it.next());
            }
        }
        animatorSetOooO0O0.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().OooOO0(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f17020OooO0o0;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f17019OooO0o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().OooO0o0();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f17064OooO;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f17073OooOO0;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().f17070OooO0o0;
    }

    @Px
    public int getCustomSize() {
        return this.f17024OooOO0O;
    }

    public int getExpandedComponentIdHint() {
        return this.f17030OooOOo.f41698OooO0OO;
    }

    @Nullable
    public OooOOO getHideMotionSpec() {
        return getImpl().f17076OooOOO;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f17018OooO;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f17018OooO;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        com.google.android.material.shape.OooO0O0 oooO0O0 = getImpl().f17065OooO00o;
        oooO0O0.getClass();
        return oooO0O0;
    }

    @Nullable
    public OooOOO getShowMotionSpec() {
        return getImpl().f17077OooOOO0;
    }

    public int getSize() {
        return this.f17023OooOO0;
    }

    public int getSizeDimension() {
        return OooO0oO(this.f17023OooOO0);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f17021OooO0oO;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f17022OooO0oo;
    }

    public boolean getUseCompatPadding() {
        return this.f17026OooOOO;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().OooO0oo();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOO0O impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f17066OooO0O0;
        FloatingActionButton floatingActionButton = impl.f17086OooOo0O;
        if (materialShapeDrawable != null) {
            o0O00o00.OooOOO.OooO0Oo(floatingActionButton, materialShapeDrawable);
        }
        if (!(impl instanceof o0O00O.OooOO0O)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.f17091OooOoo0 == null) {
                impl.f17091OooOoo0 = new o0O00O.OooOO0(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f17091OooOoo0);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOO0O impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f17086OooOo0O.getViewTreeObserver();
        o0O00O.OooOO0 oooOO1 = impl.f17091OooOoo0;
        if (oooOO1 != null) {
            viewTreeObserver.removeOnPreDrawListener(oooOO1);
            impl.f17091OooOoo0 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f17025OooOO0o = (sizeDimension - this.f17027OooOOO0) / 2;
        getImpl().OooOOo0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.f17028OooOOOO;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f5532OooO0Oo);
        Bundle orDefault = extendableSavedState.f17847OooO0o.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        o0O00O0o.OooO0O0 oooO0O0 = this.f17030OooOOo;
        oooO0O0.getClass();
        oooO0O0.f41697OooO0O0 = orDefault.getBoolean("expanded", false);
        oooO0O0.f41698OooO0OO = orDefault.getInt("expandedComponentIdHint", 0);
        if (oooO0O0.f41697OooO0O0) {
            View view = oooO0O0.f41696OooO00o;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).OooO0oO(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        Oooo000<String, Bundle> oooo000 = extendableSavedState.f17847OooO0o;
        o0O00O0o.OooO0O0 oooO0O0 = this.f17030OooOOo;
        oooO0O0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", oooO0O0.f41697OooO0O0);
        bundle.putInt("expandedComponentIdHint", oooO0O0.f41698OooO0OO);
        oooo000.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            boolean zOooO0OO = ViewCompat.OooOO0O.OooO0OO(this);
            Rect rect = this.f17029OooOOOo;
            if (zOooO0OO) {
                rect.set(0, 0, getWidth(), getHeight());
                OooOO0O(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17020OooO0o0 != colorStateList) {
            this.f17020OooO0o0 = colorStateList;
            OooOO0O impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f17066OooO0O0;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            o0O00O.OooO0OO oooO0OO = impl.f17068OooO0Oo;
            if (oooO0OO != null) {
                if (colorStateList != null) {
                    oooO0OO.f41688OooOOO0 = colorStateList.getColorForState(oooO0OO.getState(), oooO0OO.f41688OooOOO0);
                }
                oooO0OO.f41690OooOOOo = colorStateList;
                oooO0OO.f41687OooOOO = true;
                oooO0OO.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17019OooO0o != mode) {
            this.f17019OooO0o = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f17066OooO0O0;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        OooOO0O impl = getImpl();
        if (impl.f17072OooO0oo != f) {
            impl.f17072OooO0oo = f;
            impl.OooOO0O(f, impl.f17064OooO, impl.f17073OooOO0);
        }
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        OooOO0O impl = getImpl();
        if (impl.f17064OooO != f) {
            impl.f17064OooO = f;
            impl.OooOO0O(impl.f17072OooO0oo, f, impl.f17073OooOO0);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        OooOO0O impl = getImpl();
        if (impl.f17073OooOO0 != f) {
            impl.f17073OooOO0 = f;
            impl.OooOO0O(impl.f17072OooO0oo, impl.f17064OooO, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f17024OooOO0O) {
            this.f17024OooOO0O = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = getImpl().f17066OooO0O0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOO0(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f17069OooO0o) {
            getImpl().f17069OooO0o = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f17030OooOOo.f41698OooO0OO = i;
    }

    public void setHideMotionSpec(@Nullable OooOOO oooOOO) {
        getImpl().f17076OooOOO = oooOOO;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(OooOOO.OooO0O0(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            OooOO0O impl = getImpl();
            float f = impl.f17079OooOOOo;
            impl.f17079OooOOOo = f;
            Matrix matrix = impl.f17090OooOoOO;
            impl.OooO00o(f, matrix);
            impl.f17086OooOo0O.setImageMatrix(matrix);
            if (this.f17021OooO0oO != null) {
                OooOO0o();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.f17031OooOOo0.OooO0OO(i);
        OooOO0o();
    }

    public void setMaxImageSize(int i) {
        this.f17027OooOOO0 = i;
        OooOO0O impl = getImpl();
        if (impl.f17081OooOOo0 != i) {
            impl.f17081OooOOo0 = i;
            float f = impl.f17079OooOOOo;
            impl.f17079OooOOOo = f;
            Matrix matrix = impl.f17090OooOoOO;
            impl.OooO00o(f, matrix);
            impl.f17086OooOo0O.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<OooOO0O.OooOO0> arrayList = getImpl().f17084OooOo0;
        if (arrayList != null) {
            Iterator<OooOO0O.OooOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<OooOO0O.OooOO0> arrayList = getImpl().f17084OooOo0;
        if (arrayList != null) {
            Iterator<OooOO0O.OooOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        OooOO0O impl = getImpl();
        impl.f17071OooO0oO = z;
        impl.OooOOo0();
    }

    @Override // o0O00o00.Oooo0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        getImpl().OooOOO(oooO0O0);
    }

    public void setShowMotionSpec(@Nullable OooOOO oooOOO) {
        getImpl().f17077OooOOO0 = oooOOO;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(OooOOO.OooO0O0(i, getContext()));
    }

    public void setSize(int i) {
        this.f17024OooOO0O = 0;
        if (i != this.f17023OooOO0) {
            this.f17023OooOO0 = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17021OooO0oO != colorStateList) {
            this.f17021OooO0oO = colorStateList;
            OooOO0o();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17022OooO0oo != mode) {
            this.f17022OooO0oo = mode;
            OooOO0o();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().OooOO0o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().OooOO0o();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().OooOO0o();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f17026OooOOO != z) {
            this.f17026OooOOO = z;
            getImpl().OooO();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f17033OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f17034OooO0O0;

        public BaseBehavior() {
            this.f17034OooO0O0 = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO00o(@NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f17028OooOOOO;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
            if (oooO0o.f5218OooO0oo == 0) {
                oooO0o.f5218OooO0oo = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooOo0(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f5211OooO00o instanceof BottomSheetBehavior : false) {
                    OooOo0O(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListOooO = coordinatorLayout.OooO(floatingActionButton);
            int size = arrayListOooO.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListOooO.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f5211OooO00o instanceof BottomSheetBehavior : false) && OooOo0O(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooOo0(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.OooOOOo(i, floatingActionButton);
            Rect rect = floatingActionButton.f17028OooOOOO;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) oooO0o).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        public final boolean OooOo0(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!OooOo00(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f17033OooO00o == null) {
                this.f17033OooO00o = new Rect();
            }
            Rect rect = this.f17033OooO00o;
            com.google.android.material.internal.OooO0o.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.OooO0oo(null, false);
                return true;
            }
            floatingActionButton.OooOOO0(null, false);
            return true;
        }

        public final boolean OooOo00(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f17034OooO0O0 && ((CoordinatorLayout.OooO0o) floatingActionButton.getLayoutParams()).f5215OooO0o == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean OooOo0O(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!OooOo00(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.OooO0oo(null, false);
                return true;
            }
            floatingActionButton.OooOOO0(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.FloatingActionButton_Behavior_Layout);
            this.f17034OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(o000OO.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.floatingActionButtonStyle);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f17018OooO != colorStateList) {
            this.f17018OooO = colorStateList;
            getImpl().OooOOO0(this.f17018OooO);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17017OooOo00;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17028OooOOOO = new Rect();
        this.f17029OooOOOo = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.FloatingActionButton, i, i2, new int[0]);
        this.f17020OooO0o0 = c1.OooO00o(context2, typedArrayOooO0Oo, o000OO.FloatingActionButton_backgroundTint);
        this.f17019OooO0o = oo0o0Oo.OooO0oO(typedArrayOooO0Oo.getInt(o000OO.FloatingActionButton_backgroundTintMode, -1), null);
        this.f17018OooO = c1.OooO00o(context2, typedArrayOooO0Oo, o000OO.FloatingActionButton_rippleColor);
        this.f17023OooOO0 = typedArrayOooO0Oo.getInt(o000OO.FloatingActionButton_fabSize, -1);
        this.f17024OooOO0O = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayOooO0Oo.getDimension(o000OO.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayOooO0Oo.getDimension(o000OO.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayOooO0Oo.getDimension(o000OO.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f17026OooOOO = typedArrayOooO0Oo.getBoolean(o000OO.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(o00000O.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.FloatingActionButton_maxImageSize, 0));
        OooOOO oooOOOOooO00o = OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.FloatingActionButton_showMotionSpec);
        OooOOO oooOOOOooO00o2 = OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.FloatingActionButton_hideMotionSpec);
        com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0Oo(context2, attributeSet, i, i2, com.google.android.material.shape.OooO0O0.f17626OooOOO0));
        boolean z = typedArrayOooO0Oo.getBoolean(o000OO.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayOooO0Oo.getBoolean(o000OO.FloatingActionButton_android_enabled, true));
        typedArrayOooO0Oo.recycle();
        OooOo oooOo = new OooOo(this);
        this.f17031OooOOo0 = oooOo;
        oooOo.OooO0O0(attributeSet, i);
        this.f17030OooOOo = new o0O00O0o.OooO0O0(this);
        getImpl().OooOOO(oooO0O0);
        getImpl().OooO0oO(this.f17020OooO0o0, this.f17019OooO0o, this.f17018OooO, dimensionPixelSize);
        getImpl().f17074OooOO0O = dimensionPixelSize2;
        OooOO0O impl = getImpl();
        if (impl.f17072OooO0oo != dimension) {
            impl.f17072OooO0oo = dimension;
            impl.OooOO0O(dimension, impl.f17064OooO, impl.f17073OooOO0);
        }
        OooOO0O impl2 = getImpl();
        if (impl2.f17064OooO != dimension2) {
            impl2.f17064OooO = dimension2;
            impl2.OooOO0O(impl2.f17072OooO0oo, dimension2, impl2.f17073OooOO0);
        }
        OooOO0O impl3 = getImpl();
        if (impl3.f17073OooOO0 != dimension3) {
            impl3.f17073OooOO0 = dimension3;
            impl3.OooOO0O(impl3.f17072OooO0oo, impl3.f17064OooO, dimension3);
        }
        getImpl().f17077OooOOO0 = oooOOOOooO00o;
        getImpl().f17076OooOOO = oooOOOOooO00o2;
        getImpl().f17069OooO0o = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
