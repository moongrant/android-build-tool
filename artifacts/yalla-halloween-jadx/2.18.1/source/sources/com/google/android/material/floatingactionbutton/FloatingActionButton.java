package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import androidx.appcompat.widget.OooOo00;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OO.OooOO0O;
import p021OooOooo.o00oO0o;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p344o0OO0ooo.o0OOo000;
import p344o0OO0ooo.o0o0000;
import p347o0OOO0o0.o00000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements o0OOo000, o00000, CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final int f17067OooooO0 = Oooo000.Widget_Design_FloatingActionButton;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17068Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17069Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f17070Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17071OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17072OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f17073OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17074OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f17075OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f17076OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f17077OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final Rect f17078OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Rect f17079OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NonNull
    public final OooOo00 f17080OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NonNull
    public final o0o0000 f17081Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooOO0O f17082Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f17083o000oOoO;

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

    public class OooO0O0 implements p345o0OOO0Oo.OooO0o {
        public OooO0O0() {
        }
    }

    public class OooO0OO<T extends FloatingActionButton> implements OooO0o.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final p338o0OO0o0O.Oooo000<T> f17087OooO00o;

        public OooO0OO(p338o0OO0o0O.Oooo000<T> oooo000) {
            this.f17087OooO00o = oooo000;
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOO0
        public final void OooO00o() {
            p338o0OO0o0O.Oooo000<T> oooo000 = this.f17087OooO00o;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.OooO0O0 oooO0O0 = (BottomAppBar.OooO0O0) oooo000;
            Objects.requireNonNull(oooO0O0);
            BottomAppBar.this.f16540o000000o.OooOOo0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOO0
        public final void OooO0O0() {
            p338o0OO0o0O.Oooo000<T> oooo000 = this.f17087OooO00o;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.OooO0O0 oooO0O0 = (BottomAppBar.OooO0O0) oooo000;
            Objects.requireNonNull(oooO0O0);
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().f16586OoooO00 != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().f16586OoooO00 = translationX;
                BottomAppBar.this.f16540o000000o.invalidateSelf();
            }
            float f = -floatingActionButton.getTranslationY();
            float scaleY = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f);
            if (BottomAppBar.this.getTopEdgeTreatment().f16581Oooo != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().OooO0o0(fMax);
                BottomAppBar.this.f16540o000000o.invalidateSelf();
            }
            MaterialShapeDrawable materialShapeDrawable = BottomAppBar.this.f16540o000000o;
            if (floatingActionButton.getVisibility() == 0) {
                scaleY = floatingActionButton.getScaleY();
            }
            materialShapeDrawable.OooOOo0(scaleY);
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof OooO0OO) && ((OooO0OO) obj).f17087OooO00o.equals(this.f17087OooO00o);
        }

        public final int hashCode() {
            return this.f17087OooO00o.hashCode();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Size {
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    public static int OooOOO(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private OooO0o getImpl() {
        if (this.f17082Ooooo0o == null) {
            this.f17082Ooooo0o = new OooOO0O(this, new OooO0O0());
        }
        return this.f17082Ooooo0o;
    }

    public final void OooO(@Nullable OooO00o oooO00o, boolean z) {
        OooO0o impl = getImpl();
        com.google.android.material.floatingactionbutton.OooO00o oooO00o2 = oooO00o == null ? null : new com.google.android.material.floatingactionbutton.OooO00o(this, oooO00o);
        if (impl.OooO0oo()) {
            return;
        }
        Animator animator = impl.f17118OooOOO0;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.OooOo00()) {
            impl.f17128OooOo0o.OooO0O0(z ? 8 : 4, z);
            if (oooO00o2 != null) {
                oooO00o2.f17089OooO00o.OooO00o(oooO00o2.f17090OooO0O0);
                return;
            }
            return;
        }
        p338o0OO0o0O.OooOo00 oooOo00 = impl.f17119OooOOOO;
        AnimatorSet animatorSetOooO0O0 = oooOo00 != null ? impl.OooO0O0(oooOo00, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : impl.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.4f, 0.4f);
        animatorSetOooO0O0.addListener(new com.google.android.material.floatingactionbutton.OooO0O0(impl, z, oooO00o2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f17125OooOo0;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetOooO0O0.addListener(it.next());
            }
        }
        animatorSetOooO0O0.start();
    }

    @Override // p344o0OO0ooo.o0OOo000
    public final boolean OooO00o() {
        return this.f17081Ooooo00.f38025OooO0O0;
    }

    public final void OooO0Oo(@NonNull Animator.AnimatorListener animatorListener) {
        OooO0o impl = getImpl();
        if (impl.f17125OooOo0 == null) {
            impl.f17125OooOo0 = new ArrayList<>();
        }
        impl.f17125OooOo0.add(animatorListener);
    }

    public final void OooO0o(@NonNull p338o0OO0o0O.Oooo000<? extends FloatingActionButton> oooo000) {
        OooO0o impl = getImpl();
        OooO0OO oooO0OO = new OooO0OO(oooo000);
        if (impl.f17127OooOo0O == null) {
            impl.f17127OooOo0O = new ArrayList<>();
        }
        impl.f17127OooOo0O.add(oooO0OO);
    }

    public final void OooO0o0(@NonNull Animator.AnimatorListener animatorListener) {
        OooO0o impl = getImpl();
        if (impl.f17126OooOo00 == null) {
            impl.f17126OooOo00 = new ArrayList<>();
        }
        impl.f17126OooOo00.add(animatorListener);
    }

    @Deprecated
    public final boolean OooO0oO(@NonNull Rect rect) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        OooOO0o(rect);
        return true;
    }

    public final int OooO0oo(int i) {
        int i2 = this.f17075OoooOO0;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(OooOO0.design_fab_size_normal) : resources.getDimensionPixelSize(OooOO0.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? OooO0oo(1) : OooO0oo(0);
    }

    public final boolean OooOO0() {
        return getImpl().OooO0oo();
    }

    public final boolean OooOO0O() {
        return getImpl().OooO();
    }

    public final void OooOO0o(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f17078OoooOo0;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void OooOOO0() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f17068Oooo;
        if (colorStateList == null) {
            o0OOO0o.OooO00o(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f17073OoooO00;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(colorForState, mode));
    }

    public final void OooOOOO(@Nullable OooO00o oooO00o, boolean z) {
        OooO0o impl = getImpl();
        com.google.android.material.floatingactionbutton.OooO00o oooO00o2 = oooO00o == null ? null : new com.google.android.material.floatingactionbutton.OooO00o(this, oooO00o);
        if (impl.OooO()) {
            return;
        }
        Animator animator = impl.f17118OooOOO0;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.f17117OooOOO == null;
        if (!impl.OooOo00()) {
            impl.f17128OooOo0o.OooO0O0(0, z);
            impl.f17128OooOo0o.setAlpha(1.0f);
            impl.f17128OooOo0o.setScaleY(1.0f);
            impl.f17128OooOo0o.setScaleX(1.0f);
            impl.OooOOOo(1.0f);
            if (oooO00o2 != null) {
                oooO00o2.f17089OooO00o.OooO0O0();
                return;
            }
            return;
        }
        if (impl.f17128OooOo0o.getVisibility() != 0) {
            FloatingActionButton floatingActionButton = impl.f17128OooOo0o;
            float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            floatingActionButton.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            impl.f17128OooOo0o.setScaleY(z2 ? 0.4f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            impl.f17128OooOo0o.setScaleX(z2 ? 0.4f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            if (z2) {
                f = 0.4f;
            }
            impl.OooOOOo(f);
        }
        p338o0OO0o0O.OooOo00 oooOo00 = impl.f17117OooOOO;
        AnimatorSet animatorSetOooO0O0 = oooOo00 != null ? impl.OooO0O0(oooOo00, 1.0f, 1.0f, 1.0f) : impl.OooO0OO(1.0f, 1.0f, 1.0f);
        animatorSetOooO0O0.addListener(new com.google.android.material.floatingactionbutton.OooO0OO(impl, z, oooO00o2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f17126OooOo00;
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
        getImpl().OooOO0o(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f17069Oooo0oO;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f17070Oooo0oo;
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
        return getImpl().f17105OooO;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f17114OooOO0;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().f17111OooO0o0;
    }

    @Px
    public int getCustomSize() {
        return this.f17075OoooOO0;
    }

    public int getExpandedComponentIdHint() {
        return this.f17081Ooooo00.f38026OooO0OO;
    }

    @Nullable
    public p338o0OO0o0O.OooOo00 getHideMotionSpec() {
        return getImpl().f17119OooOOOO;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f17072OoooO0;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f17072OoooO0;
    }

    @NonNull
    public com.google.android.material.shape.OooO00o getShapeAppearanceModel() {
        com.google.android.material.shape.OooO00o oooO00o = getImpl().f17106OooO00o;
        Objects.requireNonNull(oooO00o);
        return oooO00o;
    }

    @Nullable
    public p338o0OO0o0O.OooOo00 getShowMotionSpec() {
        return getImpl().f17117OooOOO;
    }

    public int getSize() {
        return this.f17071OoooO;
    }

    public int getSizeDimension() {
        return OooO0oo(this.f17071OoooO);
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
        return this.f17068Oooo;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f17073OoooO00;
    }

    public boolean getUseCompatPadding() {
        return this.f17077OoooOOo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().OooOO0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooO0o impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f17107OooO0O0;
        if (materialShapeDrawable != null) {
            o0O0O00.OooO0Oo(impl.f17128OooOo0o, materialShapeDrawable);
        }
        if (!(impl instanceof OooOO0O)) {
            ViewTreeObserver viewTreeObserver = impl.f17128OooOo0o.getViewTreeObserver();
            if (impl.f17132OooOoo == null) {
                impl.f17132OooOoo = new o0OO.OooOO0(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f17132OooOoo);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0o impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f17128OooOo0o.getViewTreeObserver();
        o0OO.OooOO0 oooOO1 = impl.f17132OooOoo;
        if (oooOO1 != null) {
            viewTreeObserver.removeOnPreDrawListener(oooOO1);
            impl.f17132OooOoo = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f17083o000oOoO = (sizeDimension - this.f17076OoooOOO) / 2;
        getImpl().OooOo0O();
        int iMin = Math.min(OooOOO(sizeDimension, i), OooOOO(sizeDimension, i2));
        Rect rect = this.f17078OoooOo0;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f8027Oooo0o);
        o0o0000 o0o0000Var = this.f17081Ooooo00;
        Bundle orDefault = extendableSavedState.f17742Oooo0oo.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(o0o0000Var);
        o0o0000Var.f38025OooO0O0 = bundle.getBoolean("expanded", false);
        o0o0000Var.f38026OooO0OO = bundle.getInt("expandedComponentIdHint", 0);
        if (o0o0000Var.f38025OooO0O0) {
            ViewParent parent = o0o0000Var.f38024OooO00o.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).OooO0oO(o0o0000Var.f38024OooO00o);
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
        o00oO0o<String, Bundle> o00oo0o2 = extendableSavedState.f17742Oooo0oo;
        o0o0000 o0o0000Var = this.f17081Ooooo00;
        Objects.requireNonNull(o0o0000Var);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", o0o0000Var.f38025OooO0O0);
        bundle.putInt("expandedComponentIdHint", o0o0000Var.f38026OooO0OO);
        o00oo0o2.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && OooO0oO(this.f17079OoooOoO) && !this.f17079OoooOoO.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
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
        if (this.f17069Oooo0oO != colorStateList) {
            this.f17069Oooo0oO = colorStateList;
            OooO0o impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f17107OooO0O0;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            o0OO.OooO0OO oooO0OO = impl.f17109OooO0Oo;
            if (oooO0OO != null) {
                oooO0OO.OooO0O0(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17070Oooo0oo != mode) {
            this.f17070Oooo0oo = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f17107OooO0O0;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        OooO0o impl = getImpl();
        if (impl.f17113OooO0oo != f) {
            impl.f17113OooO0oo = f;
            impl.OooOOO0(f, impl.f17105OooO, impl.f17114OooOO0);
        }
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        OooO0o impl = getImpl();
        if (impl.f17105OooO != f) {
            impl.f17105OooO = f;
            impl.OooOOO0(impl.f17113OooO0oo, f, impl.f17114OooOO0);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        OooO0o impl = getImpl();
        if (impl.f17114OooOO0 != f) {
            impl.f17114OooOO0 = f;
            impl.OooOOO0(impl.f17113OooO0oo, impl.f17105OooO, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f17075OoooOO0) {
            this.f17075OoooOO0 = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().OooOo0o(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f17110OooO0o) {
            getImpl().f17110OooO0o = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f17081Ooooo00.f38026OooO0OO = i;
    }

    public void setHideMotionSpec(@Nullable p338o0OO0o0O.OooOo00 oooOo00) {
        getImpl().f17119OooOOOO = oooOo00;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(p338o0OO0o0O.OooOo00.OooO0O0(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            OooO0o impl = getImpl();
            impl.OooOOOo(impl.f17122OooOOo0);
            if (this.f17068Oooo != null) {
                OooOOO0();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.f17080OoooOoo.OooO0OO(i);
        OooOOO0();
    }

    public void setMaxImageSize(int i) {
        this.f17076OoooOOO = i;
        OooO0o impl = getImpl();
        if (impl.f17121OooOOo != i) {
            impl.f17121OooOOo = i;
            impl.OooOOOo(impl.f17122OooOOo0);
        }
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().OooOOO();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().OooOOO();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        OooO0o impl = getImpl();
        impl.f17112OooO0oO = z;
        impl.OooOo0O();
    }

    @Override // p347o0OOO0o0.o00000
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        getImpl().OooOOo(oooO00o);
    }

    public void setShowMotionSpec(@Nullable p338o0OO0o0O.OooOo00 oooOo00) {
        getImpl().f17117OooOOO = oooOo00;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(p338o0OO0o0O.OooOo00.OooO0O0(getContext(), i));
    }

    public void setSize(int i) {
        this.f17075OoooOO0 = 0;
        if (i != this.f17071OoooO) {
            this.f17071OoooO = i;
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
        if (this.f17068Oooo != colorStateList) {
            this.f17068Oooo = colorStateList;
            OooOOO0();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f17073OoooO00 != mode) {
            this.f17073OoooO00 = mode;
            OooOOO0();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().OooOOOO();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().OooOOOO();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().OooOOOO();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f17077OoooOOo != z) {
            this.f17077OoooOOo = z;
            getImpl().OooOO0O();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f17084OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f17085OooO0O0;

        public BaseBehavior() {
            this.f17085OooO0O0 = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO00o(@NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f17078OoooOo0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
            if (oooO0o.f7768OooO0oo == 0) {
                oooO0o.f7768OooO0oo = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooOo0(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f7761OooO00o instanceof BottomSheetBehavior : false) {
                    OooOo0O(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.OooO(floatingActionButton);
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayList.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f7761OooO00o instanceof BottomSheetBehavior : false) && OooOo0O(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooOo0(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.OooOo0o(floatingActionButton, i);
            Rect rect = floatingActionButton.f17078OoooOo0;
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
                ViewCompat.OooOOOo(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            ViewCompat.OooOOOO(floatingActionButton, i4);
            return true;
        }

        public final boolean OooOo0(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!OooOo00(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f17084OooO00o == null) {
                this.f17084OooO00o = new Rect();
            }
            Rect rect = this.f17084OooO00o;
            com.google.android.material.internal.OooO0o.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.OooO(null, false);
                return true;
            }
            floatingActionButton.OooOOOO(null, false);
            return true;
        }

        public final boolean OooOo00(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f17085OooO0O0 && ((CoordinatorLayout.OooO0o) floatingActionButton.getLayoutParams()).f7765OooO0o == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean OooOo0O(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!OooOo00(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.OooO(null, false);
                return true;
            }
            floatingActionButton.OooOOOO(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.FloatingActionButton_Behavior_Layout);
            this.f17085OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.floatingActionButtonStyle);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f17072OoooO0 != colorStateList) {
            this.f17072OoooO0 = colorStateList;
            getImpl().OooOOo0(this.f17072OoooO0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17067OooooO0;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17078OoooOo0 = new Rect();
        this.f17079OoooOoO = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.FloatingActionButton, i, i2, new int[0]);
        this.f17069Oooo0oO = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.FloatingActionButton_backgroundTint);
        this.f17070Oooo0oo = o00Ooo.OooO0oO(typedArrayOooO0Oo.getInt(Oooo0.FloatingActionButton_backgroundTintMode, -1), null);
        this.f17072OoooO0 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.FloatingActionButton_rippleColor);
        this.f17071OoooO = typedArrayOooO0Oo.getInt(Oooo0.FloatingActionButton_fabSize, -1);
        this.f17075OoooOO0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.FloatingActionButton_fabCustomSize, 0);
        this.f17074OoooO0O = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayOooO0Oo.getDimension(Oooo0.FloatingActionButton_elevation, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float dimension2 = typedArrayOooO0Oo.getDimension(Oooo0.FloatingActionButton_hoveredFocusedTranslationZ, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float dimension3 = typedArrayOooO0Oo.getDimension(Oooo0.FloatingActionButton_pressedTranslationZ, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17077OoooOOo = typedArrayOooO0Oo.getBoolean(Oooo0.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(OooOO0.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.FloatingActionButton_maxImageSize, 0));
        p338o0OO0o0O.OooOo00 oooOo00OooO00o = p338o0OO0o0O.OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.FloatingActionButton_showMotionSpec);
        p338o0OO0o0O.OooOo00 oooOo00OooO00o2 = p338o0OO0o0O.OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.FloatingActionButton_hideMotionSpec);
        com.google.android.material.shape.OooO00o oooO00o = new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0Oo(context2, attributeSet, i, i2, com.google.android.material.shape.OooO00o.f17554OooOOO0));
        boolean z = typedArrayOooO0Oo.getBoolean(Oooo0.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayOooO0Oo.getBoolean(Oooo0.FloatingActionButton_android_enabled, true));
        typedArrayOooO0Oo.recycle();
        OooOo00 oooOo00 = new OooOo00(this);
        this.f17080OoooOoo = oooOo00;
        oooOo00.OooO0O0(attributeSet, i);
        this.f17081Ooooo00 = new o0o0000(this);
        getImpl().OooOOo(oooO00o);
        getImpl().OooO0oO(this.f17069Oooo0oO, this.f17070Oooo0oo, this.f17072OoooO0, this.f17074OoooO0O);
        getImpl().f17115OooOO0O = dimensionPixelSize;
        OooO0o impl = getImpl();
        if (impl.f17113OooO0oo != dimension) {
            impl.f17113OooO0oo = dimension;
            impl.OooOOO0(dimension, impl.f17105OooO, impl.f17114OooOO0);
        }
        OooO0o impl2 = getImpl();
        if (impl2.f17105OooO != dimension2) {
            impl2.f17105OooO = dimension2;
            impl2.OooOOO0(impl2.f17113OooO0oo, dimension2, impl2.f17114OooOO0);
        }
        OooO0o impl3 = getImpl();
        if (impl3.f17114OooOO0 != dimension3) {
            impl3.f17114OooOO0 = dimension3;
            impl3.OooOOO0(impl3.f17113OooO0oo, impl3.f17105OooO, dimension3);
        }
        getImpl().f17117OooOOO = oooOo00OooO00o;
        getImpl().f17119OooOOOO = oooOo00OooO00o2;
        getImpl().f17110OooO0o = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
