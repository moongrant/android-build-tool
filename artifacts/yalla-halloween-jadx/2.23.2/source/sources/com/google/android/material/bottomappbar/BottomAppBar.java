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
import android.os.Build;
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
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.o0OO00O;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0O000.OooOo;
import p039OoooOoo.o00O0O0O;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o000000O;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p280o0O00o0O.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Integer f15896OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final MaterialShapeDrawable f15897OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Animator f15898OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public Animator f15899OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f15900Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f15901Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f15902OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f15903OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Px
    public int f15904OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final boolean f15905Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f15906Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f15907OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final boolean f15908Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @MenuRes
    public int f15909o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f15910o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f15911o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public Behavior f15912o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NonNull
    public final OooO00o f15913o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f15914o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f15915o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final boolean f15916o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f15917o0ooOO0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f15918oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final boolean f15919ooOO;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public static final int f15894o0ooOOo = o0000O0O.Widget_MaterialComponents_BottomAppBar;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public static final int f15895o0ooOoO = o00000.motionDurationLong2;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public static final int f15893o0OOO0o = o00000.motionEasingEmphasizedInterpolator;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MenuAlignmentMode {
    }

    public class OooO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f15925OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f15926OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f15927OooO0o0;

        public OooO(ActionMenuView actionMenuView, int i, boolean z) {
            this.f15925OooO0Oo = actionMenuView;
            this.f15927OooO0o0 = i;
            this.f15926OooO0o = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f15927OooO0o0;
            boolean z = this.f15926OooO0o;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f15925OooO0Oo;
            actionMenuView.setTranslationX(bottomAppBar.OooOoOO(actionMenuView, i, z));
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f15910o00Oo0) {
                return;
            }
            bottomAppBar.OooOooO(bottomAppBar.f15900Ooooo00, bottomAppBar.f15911o00Ooo);
        }
    }

    public class OooO0O0 implements OooOo<FloatingActionButton> {
        public OooO0O0() {
        }
    }

    public class OooO0OO implements oo0o0Oo.OooO0O0 {
        public OooO0OO() {
        }

        @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
        @NonNull
        public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f15908Ooooooo) {
                bottomAppBar.f15915o00ooo = windowInsetsCompat.OooO0OO();
            }
            boolean z2 = false;
            if (bottomAppBar.f15916o0OoOo0) {
                z = bottomAppBar.f15914o00oO0o != windowInsetsCompat.OooO0Oo();
                bottomAppBar.f15914o00oO0o = windowInsetsCompat.OooO0Oo();
            } else {
                z = false;
            }
            if (bottomAppBar.f15919ooOO) {
                boolean z3 = bottomAppBar.f15918oo000o != windowInsetsCompat.OooO0o0();
                bottomAppBar.f15918oo000o = windowInsetsCompat.OooO0o0();
                z2 = z3;
            }
            if (z || z2) {
                Animator animator = bottomAppBar.f15899OoooOoo;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar.f15898OoooOoO;
                if (animator2 != null) {
                    animator2.cancel();
                }
                bottomAppBar.Oooo000();
                bottomAppBar.OooOooo();
            }
            return windowInsetsCompat;
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {
        public OooO0o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = BottomAppBar.f15894o0ooOOo;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.getClass();
            bottomAppBar.f15910o00Oo0 = false;
            bottomAppBar.f15899OoooOoo = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = BottomAppBar.f15894o0ooOOo;
            BottomAppBar.this.getClass();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f15933OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f15934OooO0oO;

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

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f15933OooO0o);
            parcel.writeInt(this.f15934OooO0oO ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15933OooO0o = parcel.readInt();
            this.f15934OooO0oO = parcel.readInt() != 0;
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
        return this.f15915o00ooo;
    }

    private int getFabAlignmentAnimationDuration() {
        return o0O00OOO.OooO00o.OooO0OO(f15895o0ooOoO, getContext(), 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return OooOoo0(this.f15900Ooooo00);
    }

    private float getFabTranslationY() {
        if (this.f15902OooooO0 == 1) {
            return -getTopEdgeTreatment().f15949OooO0oO;
        }
        View viewOooOoO = OooOoO();
        return viewOooOoO != null ? (-((getMeasuredHeight() + getBottomInset()) - viewOooOoO.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f15914o00oO0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f15918oo000o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public OooOO0O getTopEdgeTreatment() {
        return (OooOO0O) this.f15897OoooOo0.f17105OooO0Oo.f17128OooO00o.f17150OooO;
    }

    @Nullable
    public final View OooOoO() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        ArrayList<View> orDefault = coordinatorLayout.f5197OooO0o0.f33215OooO0O0.getOrDefault(this, null);
        ArrayList<View> arrayList = coordinatorLayout.f5198OooO0oO;
        arrayList.clear();
        if (orDefault != null) {
            arrayList.addAll(orDefault);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Nullable
    public final FloatingActionButton OooOoO0() {
        View viewOooOoO = OooOoO();
        if (viewOooOoO instanceof FloatingActionButton) {
            return (FloatingActionButton) viewOooOoO;
        }
        return null;
    }

    public final int OooOoOO(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int dimensionPixelOffset = 0;
        if (this.f15906Oooooo0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zOooO0o = oo0o0Oo.OooO0o(this);
        int measuredWidth = zOooO0o ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f2228OooO00o & 8388615) == 8388611) {
                measuredWidth = zOooO0o ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zOooO0o ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zOooO0o ? this.f15918oo000o : -this.f15914o00oO0o;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(o00000O.m3_bottomappbar_horizontal_padding);
            if (!zOooO0o) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    public final boolean OooOoo() {
        FloatingActionButton floatingActionButtonOooOoO0 = OooOoO0();
        return floatingActionButtonOooOoO0 != null && floatingActionButtonOooOoO0.OooOO0();
    }

    public final float OooOoo0(int i) {
        boolean zOooO0o = oo0o0Oo.OooO0o(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewOooOoO = OooOoO();
        int i2 = zOooO0o ? this.f15914o00oO0o : this.f15918oo000o;
        return ((getMeasuredWidth() / 2) - ((this.f15904OooooOo == -1 || viewOooOoO == null) ? this.f15903OooooOO + i2 : ((viewOooOoO.getMeasuredWidth() / 2) + this.f15904OooooOo) + i2)) * (zOooO0o ? -1 : 1);
    }

    public final void OooOooO(int i, boolean z) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(this)) {
            this.f15910o00Oo0 = false;
            int i2 = this.f15909o00O0O;
            if (i2 != 0) {
                this.f15909o00O0O = 0;
                getMenu().clear();
                OooOO0O(i2);
                return;
            }
            return;
        }
        Animator animator = this.f15899OoooOoo;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!OooOoo()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - OooOoOO(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new com.google.android.material.bottomappbar.OooO(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f15899OoooOoo = animatorSet2;
        animatorSet2.addListener(new OooO0o());
        this.f15899OoooOoo.start();
    }

    public final void OooOooo() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f15899OoooOoo != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (OooOoo()) {
            Oooo00o(actionMenuView, this.f15900Ooooo00, this.f15911o00Ooo, false);
        } else {
            Oooo00o(actionMenuView, 0, false, false);
        }
    }

    public final void Oooo000() {
        getTopEdgeTreatment().f15950OooO0oo = getFabTranslationX();
        this.f15897OoooOo0.OooOOOO((this.f15911o00Ooo && OooOoo() && this.f15902OooooO0 == 1) ? 1.0f : 0.0f);
        View viewOooOoO = OooOoO();
        if (viewOooOoO != null) {
            viewOooOoO.setTranslationY(getFabTranslationY());
            viewOooOoO.setTranslationX(getFabTranslationX());
        }
    }

    public final void Oooo00O(@Px int i) {
        float f = i;
        if (f != getTopEdgeTreatment().f15947OooO0o) {
            getTopEdgeTreatment().f15947OooO0o = f;
            this.f15897OoooOo0.invalidateSelf();
        }
    }

    public final void Oooo00o(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        OooO oooO = new OooO(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(oooO);
        } else {
            oooO.run();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f15897OoooOo0.f17105OooO0Oo.f17132OooO0o;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f15949OooO0oO;
    }

    public int getFabAlignmentMode() {
        return this.f15900Ooooo00;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.f15904OooooOo;
    }

    public int getFabAnchorMode() {
        return this.f15902OooooO0;
    }

    public int getFabAnimationMode() {
        return this.f15901Ooooo0o;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f15948OooO0o0;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f15946OooO0Oo;
    }

    public boolean getHideOnScroll() {
        return this.f15907OoooooO;
    }

    public int getMenuAlignmentMode() {
        return this.f15906Oooooo0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo00.OooO0Oo(this, this.f15897OoooOo0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f15899OoooOoo;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f15898OoooOoO;
            if (animator2 != null) {
                animator2.cancel();
            }
            Oooo000();
            View viewOooOoO = OooOoO();
            if (viewOooOoO != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                if (ViewCompat.OooOO0O.OooO0OO(viewOooOoO)) {
                    viewOooOoO.post(new o00O0O0O(viewOooOoO, 1));
                }
            }
        }
        OooOooo();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        this.f15900Ooooo00 = savedState.f15933OooO0o;
        this.f15911o00Ooo = savedState.f15934OooO0oO;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        savedState.f15933OooO0o = this.f15900Ooooo00;
        savedState.f15934OooO0oO = this.f15911o00Ooo;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        o00Ooo.OooO0O0.OooO0oo(this.f15897OoooOo0, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            OooOO0O topEdgeTreatment = getTopEdgeTreatment();
            if (f < 0.0f) {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.f15949OooO0oO = f;
            this.f15897OoooOo0.invalidateSelf();
            Oooo000();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f15897OoooOo0;
        materialShapeDrawable.OooOOO0(f);
        int iOooO = materialShapeDrawable.f17105OooO0Oo.f17144OooOOo0 - materialShapeDrawable.OooO();
        Behavior behavior = getBehavior();
        behavior.f15875OooO0oo = iOooO;
        if (behavior.f15874OooO0oO == 1) {
            setTranslationY(behavior.f15872OooO0o + iOooO);
        }
    }

    public void setFabAlignmentMode(int i) {
        this.f15909o00O0O = 0;
        this.f15910o00Oo0 = true;
        OooOooO(i, this.f15911o00Ooo);
        if (this.f15900Ooooo00 != i) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                Animator animator = this.f15898OoooOoO;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f15901Ooooo0o == 1) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(OooOoO0(), "translationX", OooOoo0(i));
                    objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    FloatingActionButton floatingActionButtonOooOoO0 = OooOoO0();
                    if (floatingActionButtonOooOoO0 != null && !floatingActionButtonOooOoO0.OooO()) {
                        floatingActionButtonOooOoO0.OooO0oo(new com.google.android.material.bottomappbar.OooO0o(this, i), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(o0O00OOO.OooO00o.OooO0Oo(getContext(), f15893o0OOO0o, o0O000.OooO0O0.f40880OooO00o));
                this.f15898OoooOoO = animatorSet;
                animatorSet.addListener(new com.google.android.material.bottomappbar.OooO0OO(this));
                this.f15898OoooOoO.start();
            }
        }
        this.f15900Ooooo00 = i;
    }

    public void setFabAlignmentModeEndMargin(@Px int i) {
        if (this.f15904OooooOo != i) {
            this.f15904OooooOo = i;
            Oooo000();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f15902OooooO0 = i;
        Oooo000();
        View viewOooOoO = OooOoO();
        if (viewOooOoO != null) {
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) viewOooOoO.getLayoutParams();
            oooO0o.f5220OooO0Oo = 17;
            int i2 = this.f15902OooooO0;
            if (i2 == 1) {
                oooO0o.f5220OooO0Oo = 49;
            }
            if (i2 == 0) {
                oooO0o.f5220OooO0Oo |= 80;
            }
            viewOooOoO.requestLayout();
            this.f15897OoooOo0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f15901Ooooo0o = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().f15945OooO) {
            getTopEdgeTreatment().f15945OooO = f;
            this.f15897OoooOo0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f15948OooO0o0 = f;
            this.f15897OoooOo0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f15946OooO0Oo = f;
            this.f15897OoooOo0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f15907OoooooO = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f15906Oooooo0 != i) {
            this.f15906Oooooo0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                Oooo00o(actionMenuView, this.f15900Ooooo00, OooOoo(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f15896OoooOOo != null) {
            drawable = drawable.mutate();
            o00Ooo.OooO0O0.OooO0oO(drawable, this.f15896OoooOOo.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f15896OoooOOo = Integer.valueOf(i);
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
        this(context, attributeSet, o00000.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public Behavior getBehavior() {
        if (this.f15912o00o0O == null) {
            this.f15912o00o0O = new Behavior();
        }
        return this.f15912o00o0O;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public WeakReference<BottomAppBar> f15920OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NonNull
        public final Rect f15921OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f15922OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final OooO00o f15923OooOOOo;

        public class OooO00o implements View.OnLayoutChangeListener {
            public OooO00o() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f15920OooOOO.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    int measuredWidth = floatingActionButton.getMeasuredWidth();
                    int measuredHeight = floatingActionButton.getMeasuredHeight();
                    Rect rect = behavior.f15921OooOOO0;
                    rect.set(0, 0, measuredWidth, measuredHeight);
                    floatingActionButton.OooOO0O(rect);
                    int iHeight = rect.height();
                    bottomAppBar.Oooo00O(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f17156OooO0o0.OooO00o(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) view.getLayoutParams();
                if (behavior.f15922OooOOOO == 0) {
                    if (bottomAppBar.f15902OooooO0 == 1) {
                        ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(o00000O.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin = bottomAppBar.getRightInset();
                    boolean zOooO0o = oo0o0Oo.OooO0o(view);
                    int i9 = bottomAppBar.f15903OooooOO;
                    if (zOooO0o) {
                        ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin += i9;
                    } else {
                        ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin += i9;
                    }
                }
                int i10 = BottomAppBar.f15894o0ooOOo;
                bottomAppBar.Oooo000();
            }
        }

        public Behavior() {
            this.f15923OooOOOo = new OooO00o();
            this.f15921OooOOO0 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f15920OooOOO = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f15894o0ooOOo;
            View viewOooOoO = bottomAppBar.OooOoO();
            if (viewOooOoO != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                if (!ViewCompat.OooOO0O.OooO0OO(viewOooOoO)) {
                    CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) viewOooOoO.getLayoutParams();
                    oooO0o.f5220OooO0Oo = 17;
                    int i3 = bottomAppBar.f15902OooooO0;
                    if (i3 == 1) {
                        oooO0o.f5220OooO0Oo = 49;
                    }
                    if (i3 == 0) {
                        oooO0o.f5220OooO0Oo |= 80;
                    }
                    this.f15922OooOOOO = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) viewOooOoO.getLayoutParams())).bottomMargin;
                    if (viewOooOoO instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewOooOoO;
                        if (bottomAppBar.f15902OooooO0 == 0 && bottomAppBar.f15905Oooooo) {
                            ViewCompat.OooOOO.OooOOoo(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(o000000O.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(o000000O.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.OooO0Oo(bottomAppBar.f15913o00oO0O);
                        floatingActionButton.OooO0o0(new OooOO0(bottomAppBar));
                        floatingActionButton.OooO0o(bottomAppBar.f15917o0ooOO0);
                    }
                    viewOooOoO.addOnLayoutChangeListener(this.f15923OooOOOo);
                    bottomAppBar.Oooo000();
                }
            }
            coordinatorLayout.OooOOOo(i, bottomAppBar);
            super.OooO0oo(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.OooOOo0(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15923OooOOOo = new OooO00o();
            this.f15921OooOOO0 = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f15894o0ooOOo;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f15897OoooOo0 = materialShapeDrawable;
        this.f15909o00O0O = 0;
        this.f15910o00Oo0 = false;
        this.f15911o00Ooo = true;
        this.f15913o00oO0O = new OooO00o();
        this.f15917o0ooOO0 = new OooO0O0();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.BottomAppBar, i, i2, new int[0]);
        ColorStateList colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, o000OO.BottomAppBar_backgroundTint);
        int i3 = o000OO.BottomAppBar_navigationIconTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setNavigationIconTint(typedArrayOooO0Oo.getColor(i3, -1));
        }
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f15900Ooooo00 = typedArrayOooO0Oo.getInt(o000OO.BottomAppBar_fabAlignmentMode, 0);
        this.f15901Ooooo0o = typedArrayOooO0Oo.getInt(o000OO.BottomAppBar_fabAnimationMode, 0);
        this.f15902OooooO0 = typedArrayOooO0Oo.getInt(o000OO.BottomAppBar_fabAnchorMode, 1);
        this.f15905Oooooo = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f15906Oooooo0 = typedArrayOooO0Oo.getInt(o000OO.BottomAppBar_menuAlignmentMode, 0);
        this.f15907OoooooO = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_hideOnScroll, false);
        this.f15908Ooooooo = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f15916o0OoOo0 = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f15919ooOO = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f15904OooooOo = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = typedArrayOooO0Oo.getBoolean(o000OO.BottomAppBar_addElevationShadow, true);
        typedArrayOooO0Oo.recycle();
        this.f15903OooooOO = getResources().getDimensionPixelOffset(o00000O.mtrl_bottomappbar_fabOffsetEndMode);
        OooOO0O oooOO0O = new OooOO0O(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o();
        oooO00o.f17162OooO = oooOO0O;
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o));
        if (z) {
            materialShapeDrawable.OooOOo(2);
        } else {
            materialShapeDrawable.OooOOo(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.OooOOOo(Paint.Style.FILL);
        materialShapeDrawable.OooOO0O(context2);
        setElevation(dimensionPixelSize);
        o00Ooo.OooO0O0.OooO0oo(materialShapeDrawable, colorStateListOooO00o);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        OooO0OO oooO0OO = new OooO0OO();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000OO.Insets, i, i2);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(o000OO.Insets_paddingBottomSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(o000OO.Insets_paddingLeftSystemWindowInsets, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(o000OO.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        oo0o0Oo.OooO00o(this, new o0OO00O(z2, z3, z4, oooO0OO));
    }
}
