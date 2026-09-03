package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p338o0OO0o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f17043OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NonNull
    public final OooOO0O f17044Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NonNull
    public final OooOO0O f17045Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final OooOOO f17046OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooOOO0 f17047Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f17048o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f17049o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f17050o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f17051o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f17052o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int f17053o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NonNull
    public ColorStateList f17054oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f17055ooOO;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final int f17039o00oO0o = Oooo000.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final Property<View, Float> f17038o00oO0O = new OooO0OO();

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public static final Property<View, Float> f17040o0ooOO0 = new OooO0o();

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public static final Property<View, Float> f17041o0ooOOo = new OooO();

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public static final Property<View, Float> f17042o0ooOoO = new OooOO0();

    public class OooO extends Property<View, Float> {
        public OooO() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return Float.valueOf(ViewCompat.OooO.OooO0o(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(view2, iIntValue, paddingTop, ViewCompat.OooO.OooO0o0(view2), view2.getPaddingBottom());
        }
    }

    public class OooO00o implements OooOOOO {
        public OooO00o() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final ViewGroup.LayoutParams OooO00o() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f17048o00O0O;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f17055ooOO;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getWidth() {
            int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return measuredWidth + extendedFloatingActionButton.f17055ooOO + extendedFloatingActionButton.f17048o00O0O;
        }
    }

    public class OooO0O0 implements OooOOOO {
        public OooO0O0() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final ViewGroup.LayoutParams OooO00o() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.getCollapsedSize(), ExtendedFloatingActionButton.this.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOOO
        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class OooO0OO extends Property<View, Float> {
        public OooO0OO() {
            super(Float.class, ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    public class OooO0o extends Property<View, Float> {
        public OooO0o() {
            super(Float.class, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    public class OooOO0 extends Property<View, Float> {
        public OooOO0() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return Float.valueOf(ViewCompat.OooO.OooO0o0(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(view2, ViewCompat.OooO.OooO0o(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public class OooOO0O extends o0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooOOOO f17062OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f17063OooO0oo;

        public OooOO0O(o0OO.OooO00o oooO00o, OooOOOO oooOOOO, boolean z) {
            super(ExtendedFloatingActionButton.this, oooO00o);
            this.f17062OooO0oO = oooOOOO;
            this.f17063OooO0oo = z;
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void OooO00o() {
            super.OooO00o();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f17051o00o0O = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f17062OooO0oO.OooO00o().width;
            layoutParams.height = this.f17062OooO0oO.OooO00o().height;
        }

        @Override // o0OO.OooOOO0
        public final int OooO0OO() {
            return this.f17063OooO0oo ? p337o0OO0o0.OooO0OO.mtrl_extended_fab_change_size_expand_motion_spec : p337o0OO0o0.OooO0OO.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // o0OO.OooOOO0
        public final void OooO0Oo() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f17050o00Ooo = this.f17063OooO0oo;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f17062OooO0oO.OooO00o().width;
            layoutParams.height = this.f17062OooO0oO.OooO00o().height;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
            int paddingStart = this.f17062OooO0oO.getPaddingStart();
            int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
            int paddingEnd = this.f17062OooO0oO.getPaddingEnd();
            int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(extendedFloatingActionButton2, paddingStart, paddingTop, paddingEnd, paddingBottom);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // o0OO.OooOOO0
        public final boolean OooO0o() {
            boolean z = this.f17063OooO0oo;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return z == extendedFloatingActionButton.f17050o00Ooo || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // o0OO.OooOOO0
        public final void OooO0o0() {
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        @NonNull
        public final AnimatorSet OooO0oO() {
            OooOo00 oooOo00OooO = OooO();
            if (oooOo00OooO.OooO0oO(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o0 = oooOo00OooO.OooO0o0(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                propertyValuesHolderArrOooO0o0[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f17062OooO0oO.getWidth());
                oooOo00OooO.OooO0oo(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, propertyValuesHolderArrOooO0o0);
            }
            if (oooOo00OooO.OooO0oO(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o1 = oooOo00OooO.OooO0o0(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                propertyValuesHolderArrOooO0o1[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f17062OooO0oO.getHeight());
                oooOo00OooO.OooO0oo(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, propertyValuesHolderArrOooO0o1);
            }
            if (oooOo00OooO.OooO0oO("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o2 = oooOo00OooO.OooO0o0("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrOooO0o2[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                propertyValuesHolder.setFloatValues(ViewCompat.OooO.OooO0o(extendedFloatingActionButton), this.f17062OooO0oO.getPaddingStart());
                oooOo00OooO.OooO0oo("paddingStart", propertyValuesHolderArrOooO0o2);
            }
            if (oooOo00OooO.OooO0oO("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o3 = oooOo00OooO.OooO0o0("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrOooO0o3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                propertyValuesHolder2.setFloatValues(ViewCompat.OooO.OooO0o0(extendedFloatingActionButton2), this.f17062OooO0oO.getPaddingEnd());
                oooOo00OooO.OooO0oo("paddingEnd", propertyValuesHolderArrOooO0o3);
            }
            if (oooOo00OooO.OooO0oO("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o4 = oooOo00OooO.OooO0o0("labelOpacity");
                boolean z = this.f17063OooO0oo;
                float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                float f2 = z ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                propertyValuesHolderArrOooO0o4[0].setFloatValues(f2, f);
                oooOo00OooO.OooO0oo("labelOpacity", propertyValuesHolderArrOooO0o4);
            }
            return OooO0oo(oooOo00OooO);
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f17050o00Ooo = this.f17063OooO0oo;
            extendedFloatingActionButton.f17051o00o0O = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class OooOOO extends o0OO.OooO0O0 {
        public OooOOO(o0OO.OooO00o oooO00o) {
            super(ExtendedFloatingActionButton.this, oooO00o);
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void OooO00o() {
            super.OooO00o();
            ExtendedFloatingActionButton.this.f17043OooooOo = 0;
        }

        @Override // o0OO.OooOOO0
        public final int OooO0OO() {
            return p337o0OO0o0.OooO0OO.mtrl_extended_fab_show_motion_spec;
        }

        @Override // o0OO.OooOOO0
        public final void OooO0Oo() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // o0OO.OooOOO0
        public final boolean OooO0o() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i = ExtendedFloatingActionButton.f17039o00oO0o;
            return extendedFloatingActionButton.OooOO0();
        }

        @Override // o0OO.OooOOO0
        public final void OooO0o0() {
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f17043OooooOo = 2;
        }
    }

    public class OooOOO0 extends o0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f17065OooO0oO;

        public OooOOO0(o0OO.OooO00o oooO00o) {
            super(ExtendedFloatingActionButton.this, oooO00o);
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void OooO00o() {
            super.OooO00o();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f17043OooooOo = 0;
            if (this.f17065OooO0oO) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void OooO0O0() {
            this.f37165OooO0Oo.f37161OooO00o = null;
            this.f17065OooO0oO = true;
        }

        @Override // o0OO.OooOOO0
        public final int OooO0OO() {
            return p337o0OO0o0.OooO0OO.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // o0OO.OooOOO0
        public final void OooO0Oo() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // o0OO.OooOOO0
        public final boolean OooO0o() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i = ExtendedFloatingActionButton.f17039o00oO0o;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.f17043OooooOo != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f17043OooooOo == 2) {
                return false;
            }
            return true;
        }

        @Override // o0OO.OooOOO0
        public final void OooO0o0() {
        }

        @Override // o0OO.OooO0O0, o0OO.OooOOO0
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f17065OooO0oO = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f17043OooooOo = 1;
        }
    }

    public interface OooOOOO {
        ViewGroup.LayoutParams OooO00o();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    public static void OooO(ExtendedFloatingActionButton extendedFloatingActionButton, o0OO.OooOOO0 oooOOO0) {
        if (oooOOO0.OooO0o()) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!((ViewCompat.OooOO0O.OooO0OO(extendedFloatingActionButton) || (!extendedFloatingActionButton.OooOO0() && extendedFloatingActionButton.f17052o00ooo)) && !extendedFloatingActionButton.isInEditMode())) {
            oooOOO0.OooO0Oo();
            oooOOO0.OooO0o0();
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet animatorSetOooO0oO = oooOOO0.OooO0oO();
        animatorSetOooO0oO.addListener(new o0OO.OooO0o(oooOOO0));
        Iterator<Animator.AnimatorListener> it = ((o0OO.OooO0O0) oooOOO0).f37164OooO0OO.iterator();
        while (it.hasNext()) {
            animatorSetOooO0oO.addListener(it.next());
        }
        animatorSetOooO0oO.start();
    }

    public final boolean OooOO0() {
        if (getVisibility() != 0) {
            return this.f17043OooooOo == 2;
        }
        return this.f17043OooooOo != 1;
    }

    public final void OooOO0O() {
        this.f17054oo000o = getTextColors();
    }

    public final void OooOO0o(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f17049o00Oo0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.f17053o0OoOo0;
        if (i >= 0) {
            return i;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return (Math.min(ViewCompat.OooO.OooO0o(this), ViewCompat.OooO.OooO0o0(this)) * 2) + getIconSize();
    }

    @Nullable
    public OooOo00 getExtendMotionSpec() {
        return this.f17044Oooooo.f37166OooO0o;
    }

    @Nullable
    public OooOo00 getHideMotionSpec() {
        return this.f17047Ooooooo.f37166OooO0o;
    }

    @Nullable
    public OooOo00 getShowMotionSpec() {
        return this.f17046OoooooO.f37166OooO0o;
    }

    @Nullable
    public OooOo00 getShrinkMotionSpec() {
        return this.f17045Oooooo0.f37166OooO0o;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17050o00Ooo && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f17050o00Ooo = false;
            this.f17045Oooooo0.OooO0Oo();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f17052o00ooo = z;
    }

    public void setExtendMotionSpec(@Nullable OooOo00 oooOo00) {
        this.f17044Oooooo.f37166OooO0o = oooOo00;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(OooOo00.OooO0O0(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f17050o00Ooo == z) {
            return;
        }
        OooOO0O oooOO0O = z ? this.f17044Oooooo : this.f17045Oooooo0;
        if (oooOO0O.OooO0o()) {
            return;
        }
        oooOO0O.OooO0Oo();
    }

    public void setHideMotionSpec(@Nullable OooOo00 oooOo00) {
        this.f17047Ooooooo.f37166OooO0o = oooOo00;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(OooOo00.OooO0O0(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f17050o00Ooo || this.f17051o00o0O) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        this.f17055ooOO = ViewCompat.OooO.OooO0o(this);
        this.f17048o00O0O = ViewCompat.OooO.OooO0o0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f17050o00Ooo || this.f17051o00o0O) {
            return;
        }
        this.f17055ooOO = i;
        this.f17048o00O0O = i3;
    }

    public void setShowMotionSpec(@Nullable OooOo00 oooOo00) {
        this.f17046OoooooO.f37166OooO0o = oooOo00;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(OooOo00.OooO0O0(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable OooOo00 oooOo00) {
        this.f17045Oooooo0.f37166OooO0o = oooOo00;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(OooOo00.OooO0O0(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        OooOO0O();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f17056OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f17057OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f17058OooO0OO;

        public ExtendedFloatingActionButtonBehavior() {
            this.f17057OooO0O0 = false;
            this.f17058OooO0OO = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull View view, @NonNull Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
            if (oooO0o.f7768OooO0oo == 0) {
                oooO0o.f7768OooO0oo = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooOo0(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f7761OooO00o instanceof BottomSheetBehavior : false) {
                    OooOo0O(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.OooO(extendedFloatingActionButton);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayList.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f7761OooO00o instanceof BottomSheetBehavior : false) && OooOo0O(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooOo0(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.OooOo0o(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean OooOo0(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!OooOo00(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f17056OooO00o == null) {
                this.f17056OooO00o = new Rect();
            }
            Rect rect = this.f17056OooO00o;
            com.google.android.material.internal.OooO0o.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.OooO(extendedFloatingActionButton, this.f17058OooO0OO ? extendedFloatingActionButton.f17045Oooooo0 : extendedFloatingActionButton.f17047Ooooooo);
                return true;
            }
            ExtendedFloatingActionButton.OooO(extendedFloatingActionButton, this.f17058OooO0OO ? extendedFloatingActionButton.f17044Oooooo : extendedFloatingActionButton.f17046OoooooO);
            return true;
        }

        public final boolean OooOo00(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f17057OooO0O0 || this.f17058OooO0OO) && ((CoordinatorLayout.OooO0o) extendedFloatingActionButton.getLayoutParams()).f7765OooO0o == view.getId();
        }

        public final boolean OooOo0O(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!OooOo00(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.OooO(extendedFloatingActionButton, this.f17058OooO0OO ? extendedFloatingActionButton.f17045Oooooo0 : extendedFloatingActionButton.f17047Ooooooo);
                return true;
            }
            ExtendedFloatingActionButton.OooO(extendedFloatingActionButton, this.f17058OooO0OO ? extendedFloatingActionButton.f17044Oooooo : extendedFloatingActionButton.f17046OoooooO);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.ExtendedFloatingActionButton_Behavior_Layout);
            this.f17057OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f17058OooO0OO = typedArrayObtainStyledAttributes.getBoolean(Oooo0.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17039o00oO0o;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17043OooooOo = 0;
        o0OO.OooO00o oooO00o = new o0OO.OooO00o();
        OooOOO oooOOO = new OooOOO(oooO00o);
        this.f17046OoooooO = oooOOO;
        OooOOO0 oooOOO0 = new OooOOO0(oooO00o);
        this.f17047Ooooooo = oooOOO0;
        this.f17050o00Ooo = true;
        this.f17051o00o0O = false;
        this.f17052o00ooo = false;
        Context context2 = getContext();
        this.f17049o00Oo0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.ExtendedFloatingActionButton, i, i2, new int[0]);
        OooOo00 oooOo00OooO00o = OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.ExtendedFloatingActionButton_showMotionSpec);
        OooOo00 oooOo00OooO00o2 = OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.ExtendedFloatingActionButton_hideMotionSpec);
        OooOo00 oooOo00OooO00o3 = OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.ExtendedFloatingActionButton_extendMotionSpec);
        OooOo00 oooOo00OooO00o4 = OooOo00.OooO00o(context2, typedArrayOooO0Oo, Oooo0.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f17053o0OoOo0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.ExtendedFloatingActionButton_collapsedSize, -1);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        this.f17055ooOO = ViewCompat.OooO.OooO0o(this);
        this.f17048o00O0O = ViewCompat.OooO.OooO0o0(this);
        o0OO.OooO00o oooO00o2 = new o0OO.OooO00o();
        OooOO0O oooOO0O = new OooOO0O(oooO00o2, new OooO00o(), true);
        this.f17044Oooooo = oooOO0O;
        OooOO0O oooOO0O2 = new OooOO0O(oooO00o2, new OooO0O0(), false);
        this.f17045Oooooo0 = oooOO0O2;
        oooOOO.f37166OooO0o = oooOo00OooO00o;
        oooOOO0.f37166OooO0o = oooOo00OooO00o2;
        oooOO0O.f37166OooO0o = oooOo00OooO00o3;
        oooOO0O2.f37166OooO0o = oooOo00OooO00o4;
        typedArrayOooO0Oo.recycle();
        setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0Oo(context2, attributeSet, i, i2, com.google.android.material.shape.OooO00o.f17554OooOOO0)));
        OooOO0O();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        OooOO0O();
    }
}
