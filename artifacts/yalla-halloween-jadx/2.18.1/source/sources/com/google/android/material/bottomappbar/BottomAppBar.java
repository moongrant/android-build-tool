package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.internal.oo000o;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public static final int f16535o0000OO0 = Oooo000.Widget_MaterialComponents_BottomAppBar;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public boolean f16536o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @Nullable
    public Animator f16537o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @Nullable
    public Integer f16538o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public final int f16539o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final MaterialShapeDrawable f16540o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public int f16541o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @Nullable
    public Animator f16542o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public int f16543o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public boolean f16544o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final boolean f16545o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final boolean f16546o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    @MenuRes
    public int f16547o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    @NonNull
    public p338o0OO0o0O.Oooo000<FloatingActionButton> f16548o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public int f16549o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public boolean f16550o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public int f16551o0000O0O;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final boolean f16552o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public int f16553o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public Behavior f16554o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    @NonNull
    public OooO00o f16555o000OO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f16536o0000) {
                return;
            }
            bottomAppBar.Oooo0(bottomAppBar.f16541o00000O, bottomAppBar.f16550o0000O00);
        }
    }

    public class OooO0O0 implements p338o0OO0o0O.Oooo000<FloatingActionButton> {
        public OooO0O0() {
        }
    }

    public class OooO0OO implements o00Ooo.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.google.android.material.internal.o00Ooo.OooO0OO
        @NonNull
        public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull o00Ooo.OooO0o oooO0o) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f16545o00000o0) {
                bottomAppBar.f16553o0000oO = windowInsetsCompat.OooO0o();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z2 = false;
            if (bottomAppBar2.f16552o0000Ooo) {
                z = bottomAppBar2.f16551o0000O0O != windowInsetsCompat.OooO0oO();
                BottomAppBar.this.f16551o0000O0O = windowInsetsCompat.OooO0oO();
            } else {
                z = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f16546o00000oO) {
                boolean z3 = bottomAppBar3.f16549o0000O0 != windowInsetsCompat.OooO0oo();
                BottomAppBar.this.f16549o0000O0 = windowInsetsCompat.OooO0oo();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar bottomAppBar4 = BottomAppBar.this;
                Animator animator = bottomAppBar4.f16542o00000O0;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar4.f16537o00000;
                if (animator2 != null) {
                    animator2.cancel();
                }
                BottomAppBar.this.Oooo0OO();
                BottomAppBar.this.Oooo0O0();
            }
            return windowInsetsCompat;
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {
        public OooO0o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            int i = BottomAppBar.f16535o0000OO0;
            Objects.requireNonNull(bottomAppBar);
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            bottomAppBar2.f16536o0000 = false;
            bottomAppBar2.f16542o00000O0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Objects.requireNonNull(BottomAppBar.this);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f16565Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f16566Oooo0oo;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f16566Oooo0oo);
            parcel.writeInt(this.f16565Oooo ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16566Oooo0oo = parcel.readInt();
            this.f16565Oooo = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f16553o0000oO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return Oooo00O(this.f16541o00000O);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f16581Oooo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f16551o0000O0O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f16549o0000O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public OooOO0 getTopEdgeTreatment() {
        return (OooOO0) this.f16540o000000o.f17510Oooo0o.f17534OooO00o.f17555OooO;
    }

    @Nullable
    public final FloatingActionButton OooOooO() {
        View viewOooOooo = OooOooo();
        if (viewOooOooo instanceof FloatingActionButton) {
            return (FloatingActionButton) viewOooOooo;
        }
        return null;
    }

    @Nullable
    public final View OooOooo() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : (ArrayList) ((CoordinatorLayout) getParent()).OooOOOo(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final void Oooo0(int i, boolean z) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(this)) {
            this.f16536o0000 = false;
            int i2 = this.f16547o00000oo;
            if (i2 != 0) {
                this.f16547o00000oo = 0;
                getMenu().clear();
                OooOOO(i2);
                return;
            }
            return;
        }
        Animator animator = this.f16542o00000O0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!Oooo00o()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - Oooo000(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                objectAnimatorOfFloat2.addListener(new com.google.android.material.bottomappbar.OooO0OO(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f16542o00000O0 = animatorSet2;
        animatorSet2.addListener(new OooO0o());
        this.f16542o00000O0.start();
    }

    public final int Oooo000(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zOooO0o = o00Ooo.OooO0o(this);
        int measuredWidth = zOooO0o ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f4361OooO00o & 8388615) == 8388611) {
                measuredWidth = zOooO0o ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zOooO0o ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zOooO0o ? this.f16549o0000O0 : -this.f16551o0000O0O));
    }

    public final float Oooo00O(int i) {
        boolean zOooO0o = o00Ooo.OooO0o(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f16539o000000O + (zOooO0o ? this.f16551o0000O0O : this.f16549o0000O0))) * (zOooO0o ? -1 : 1);
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final boolean Oooo00o() {
        FloatingActionButton floatingActionButtonOooOooO = OooOooO();
        return floatingActionButtonOooOooO != null && floatingActionButtonOooOooO.OooOO0O();
    }

    public final void Oooo0O0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f16542o00000O0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (Oooo00o()) {
            actionMenuView.setTranslationX(Oooo000(actionMenuView, this.f16541o00000O, this.f16550o0000O00));
        } else {
            actionMenuView.setTranslationX(Oooo000(actionMenuView, 0, false));
        }
    }

    public final void Oooo0OO() {
        getTopEdgeTreatment().f16586OoooO00 = getFabTranslationX();
        View viewOooOooo = OooOooo();
        this.f16540o000000o.OooOOo0((this.f16550o0000O00 && Oooo00o()) ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        if (viewOooOooo != null) {
            viewOooOooo.setTranslationY(getFabTranslationY());
            viewOooOooo.setTranslationX(getFabTranslationX());
        }
    }

    public final boolean Oooo0o0(@Px int i) {
        float f = i;
        if (f == getTopEdgeTreatment().f16584Oooo0oo) {
            return false;
        }
        getTopEdgeTreatment().f16584Oooo0oo = f;
        this.f16540o000000o.invalidateSelf();
        return true;
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f16540o000000o.f17510Oooo0o.f17538OooO0o;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f16581Oooo;
    }

    public int getFabAlignmentMode() {
        return this.f16541o00000O;
    }

    public int getFabAnimationMode() {
        return this.f16543o00000OO;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f16583Oooo0oO;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f16582Oooo0o;
    }

    public boolean getHideOnScroll() {
        return this.f16544o00000Oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0Oo(this, this.f16540o000000o);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f16542o00000O0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f16537o00000;
            if (animator2 != null) {
                animator2.cancel();
            }
            Oooo0OO();
        }
        Oooo0O0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        this.f16541o00000O = savedState.f16566Oooo0oo;
        this.f16550o0000O00 = savedState.f16565Oooo;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16566Oooo0oo = this.f16541o00000O;
        savedState.f16565Oooo = this.f16550o0000O00;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        o0OOO0o.OooO0O0.OooO0oo(this.f16540o000000o, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().OooO0o0(f);
            this.f16540o000000o.invalidateSelf();
            Oooo0OO();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f16540o000000o.OooOOOO(f);
        MaterialShapeDrawable materialShapeDrawable = this.f16540o000000o;
        int iOooOO0 = materialShapeDrawable.f17510Oooo0o.f17550OooOOo0 - materialShapeDrawable.OooOO0();
        Behavior behavior = getBehavior();
        behavior.f16517OooO0OO = iOooOO0;
        if (behavior.f16516OooO0O0 == 1) {
            setTranslationY(behavior.f16515OooO00o + iOooOO0);
        }
    }

    public void setFabAlignmentMode(int i) {
        this.f16547o00000oo = 0;
        this.f16536o0000 = true;
        Oooo0(i, this.f16550o0000O00);
        if (this.f16541o00000O != i) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                Animator animator = this.f16537o00000;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f16543o00000OO == 1) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(OooOooO(), "translationX", Oooo00O(i));
                    objectAnimatorOfFloat.setDuration(300L);
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    FloatingActionButton floatingActionButtonOooOooO = OooOooO();
                    if (floatingActionButtonOooOooO != null && !floatingActionButtonOooOooO.OooOO0()) {
                        floatingActionButtonOooOooO.OooO(new com.google.android.material.bottomappbar.OooO0O0(this, i), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f16537o00000 = animatorSet;
                animatorSet.addListener(new com.google.android.material.bottomappbar.OooO00o(this));
                this.f16537o00000.start();
            }
        }
        this.f16541o00000O = i;
    }

    public void setFabAnimationMode(int i) {
        this.f16543o00000OO = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().f16585OoooO0) {
            getTopEdgeTreatment().f16585OoooO0 = f;
            this.f16540o000000o.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f16583Oooo0oO = f;
            this.f16540o000000o.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f16582Oooo0o = f;
            this.f16540o000000o.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f16544o00000Oo = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f16538o000000 != null) {
            drawable = o0OOO0o.OooO0o0(drawable.mutate());
            o0OOO0o.OooO0O0.OooO0oO(drawable, this.f16538o000000.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f16538o000000 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public Behavior getBehavior() {
        if (this.f16554o0000oo == null) {
            this.f16554o0000oo = new Behavior();
        }
        return this.f16554o0000oo;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public WeakReference<BottomAppBar> f16556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final Rect f16557OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f16558OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooO00o f16559OooO0oo;

        public class OooO00o implements View.OnLayoutChangeListener {
            public OooO00o() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f16556OooO0o.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f16557OooO0o0;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.OooOO0o(rect);
                int iHeight = Behavior.this.f16557OooO0o0.height();
                bottomAppBar.Oooo0o0(iHeight);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f17561OooO0o0.OooO00o(new RectF(Behavior.this.f16557OooO0o0)));
                CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) view.getLayoutParams();
                if (Behavior.this.f16558OooO0oO == 0) {
                    ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin = bottomAppBar.getRightInset();
                    if (o00Ooo.OooO0o(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin += bottomAppBar.f16539o000000O;
                    } else {
                        ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin += bottomAppBar.f16539o000000O;
                    }
                }
            }
        }

        public Behavior() {
            this.f16559OooO0oo = new OooO00o();
            this.f16557OooO0o0 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f16556OooO0o = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f16535o0000OO0;
            View viewOooOooo = bottomAppBar.OooOooo();
            if (viewOooOooo != null) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (!ViewCompat.OooOO0O.OooO0OO(viewOooOooo)) {
                    CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) viewOooOooo.getLayoutParams();
                    oooO0o.f7764OooO0Oo = 49;
                    this.f16558OooO0oO = ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin;
                    if (viewOooOooo instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewOooOooo;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(p337o0OO0o0.OooO0OO.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(p337o0OO0o0.OooO0OO.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f16559OooO0oo);
                        floatingActionButton.OooO0Oo(bottomAppBar.f16555o000OO);
                        floatingActionButton.OooO0o0(new OooO(bottomAppBar));
                        floatingActionButton.OooO0o(bottomAppBar.f16548o0000O);
                    }
                    bottomAppBar.Oooo0OO();
                }
            }
            coordinatorLayout.OooOo0o(bottomAppBar, i);
            this.f16515OooO00o = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16559OooO0oo = new OooO00o();
            this.f16557OooO0o0 = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16535o0000OO0;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f16540o000000o = materialShapeDrawable;
        this.f16547o00000oo = 0;
        this.f16536o0000 = false;
        this.f16550o0000O00 = true;
        this.f16555o000OO = new OooO00o();
        this.f16548o0000O = new OooO0O0();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.BottomAppBar, i, i2, new int[0]);
        ColorStateList colorStateListOooO00o = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.BottomAppBar_backgroundTint);
        int i3 = Oooo0.BottomAppBar_navigationIconTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(i3, -1));
        }
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f16541o00000O = typedArrayOooO0Oo.getInt(Oooo0.BottomAppBar_fabAlignmentMode, 0);
        this.f16543o00000OO = typedArrayOooO0Oo.getInt(Oooo0.BottomAppBar_fabAnimationMode, 0);
        this.f16544o00000Oo = typedArrayOooO0Oo.getBoolean(Oooo0.BottomAppBar_hideOnScroll, false);
        this.f16545o00000o0 = typedArrayOooO0Oo.getBoolean(Oooo0.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f16552o0000Ooo = typedArrayOooO0Oo.getBoolean(Oooo0.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f16546o00000oO = typedArrayOooO0Oo.getBoolean(Oooo0.BottomAppBar_paddingRightSystemWindowInsets, false);
        typedArrayOooO0Oo.recycle();
        this.f16539o000000O = getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_bottomappbar_fabOffsetEndMode);
        OooOO0 oooOO1 = new OooOO0(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o();
        c0110OooO00o.f17567OooO = oooOO1;
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(c0110OooO00o));
        materialShapeDrawable.OooOo00();
        materialShapeDrawable.OooOOo(Paint.Style.FILL);
        materialShapeDrawable.OooOOO0(context2);
        setElevation(dimensionPixelSize);
        o0OOO0o.OooO0O0.OooO0oo(materialShapeDrawable, colorStateListOooO00o);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        OooO0OO oooO0OO = new OooO0OO();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Oooo0.Insets, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(Oooo0.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        o00Ooo.OooO00o(this, new oo000o(z, z2, z3, oooO0OO));
    }
}
