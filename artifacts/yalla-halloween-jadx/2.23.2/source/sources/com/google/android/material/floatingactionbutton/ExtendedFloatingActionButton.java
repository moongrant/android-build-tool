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
import androidx.core.view.o000OOo0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.o00oO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o000000O;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f16519OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NonNull
    public final OooOO0 f16520OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NonNull
    public final OooOO0 f16521OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooOOO0 f16522OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f16523OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOO0O f16524OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f16525OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f16526OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f16527Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NonNull
    public final ExtendedFloatingActionButtonBehavior f16528Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f16529Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f16530Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NonNull
    public ColorStateList f16531Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f16532Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f16533Oooo0o0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final int f16515Oooo0o = o0000O0O.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0O0 f16516Oooo0oO = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final OooO0OO f16517Oooo0oo = new OooO0OO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooO0o f16514Oooo = new OooO0o();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final OooO f16518OoooO00 = new OooO();

    public class OooO extends Property<View, Float> {
        public OooO() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            return Float.valueOf(ViewCompat.OooO.OooO0o0(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO.OooOO0O(view2, ViewCompat.OooO.OooO0o(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public class OooO00o implements OooOOO {
        public OooO00o() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
        public final ViewGroup.LayoutParams OooO00o() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OooOOO
        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class OooO0O0 extends Property<View, Float> {
        public OooO0O0() {
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

    public class OooO0OO extends Property<View, Float> {
        public OooO0OO() {
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

    public class OooO0o extends Property<View, Float> {
        public OooO0o() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            return Float.valueOf(ViewCompat.OooO.OooO0o(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO.OooOO0O(view2, iIntValue, paddingTop, ViewCompat.OooO.OooO0o0(view2), view2.getPaddingBottom());
        }
    }

    public class OooOO0 extends o0O00O.OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooOOO f16539OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f16540OooO0oo;

        public OooOO0(o0O00O.OooO00o oooO00o, OooOOO oooOOO, boolean z) {
            super(ExtendedFloatingActionButton.this, oooO00o);
            this.f16539OooO0oO = oooOOO;
            this.f16540OooO0oo = z;
        }

        @Override // o0O00O.OooOOO0
        public final void OooO00o() {
            this.f40978OooO0Oo.f40974OooO00o = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f16530Oooo00o = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            OooOOO oooOOO = this.f16539OooO0oO;
            layoutParams.width = oooOOO.OooO00o().width;
            layoutParams.height = oooOOO.OooO00o().height;
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0O0() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z = this.f16540OooO0oo;
            extendedFloatingActionButton.f16529Oooo00O = z;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z) {
                extendedFloatingActionButton.f16532Oooo0OO = layoutParams.width;
                extendedFloatingActionButton.f16533Oooo0o0 = layoutParams.height;
            }
            OooOOO oooOOO = this.f16539OooO0oO;
            layoutParams.width = oooOOO.OooO00o().width;
            layoutParams.height = oooOOO.OooO00o().height;
            int paddingStart = oooOOO.getPaddingStart();
            int paddingTop = extendedFloatingActionButton.getPaddingTop();
            int paddingEnd = oooOOO.getPaddingEnd();
            int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO.OooOO0O(extendedFloatingActionButton, paddingStart, paddingTop, paddingEnd, paddingBottom);
            extendedFloatingActionButton.requestLayout();
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0OO() {
        }

        @Override // o0O00O.OooOOO0
        public final boolean OooO0Oo() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.f16540OooO0oo == extendedFloatingActionButton.f16529Oooo00O || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }

        @Override // o0O00O.OooOOO0
        public final int OooO0o() {
            return this.f16540OooO0oo ? o000000O.mtrl_extended_fab_change_size_expand_motion_spec : o000000O.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // o0O00O.OooO0O0, o0O00O.OooOOO0
        @NonNull
        public final AnimatorSet OooO0oO() {
            o0O000.OooOOO oooOOO = this.f40979OooO0o;
            if (oooOOO == null) {
                if (this.f40980OooO0o0 == null) {
                    this.f40980OooO0o0 = o0O000.OooOOO.OooO0O0(OooO0o(), this.f40975OooO00o);
                }
                oooOOO = this.f40980OooO0o0;
                oooOOO.getClass();
            }
            boolean zOooO0oO = oooOOO.OooO0oO(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            OooOOO oooOOO2 = this.f16539OooO0oO;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (zOooO0oO) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o0 = oooOOO.OooO0o0(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                propertyValuesHolderArrOooO0o0[0].setFloatValues(extendedFloatingActionButton.getWidth(), oooOOO2.getWidth());
                oooOOO.OooO0oo(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, propertyValuesHolderArrOooO0o0);
            }
            if (oooOOO.OooO0oO(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o1 = oooOOO.OooO0o0(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                propertyValuesHolderArrOooO0o1[0].setFloatValues(extendedFloatingActionButton.getHeight(), oooOOO2.getHeight());
                oooOOO.OooO0oo(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, propertyValuesHolderArrOooO0o1);
            }
            if (oooOOO.OooO0oO("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o2 = oooOOO.OooO0o0("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrOooO0o2[0];
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                propertyValuesHolder.setFloatValues(ViewCompat.OooO.OooO0o(extendedFloatingActionButton), oooOOO2.getPaddingStart());
                oooOOO.OooO0oo("paddingStart", propertyValuesHolderArrOooO0o2);
            }
            if (oooOOO.OooO0oO("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o3 = oooOOO.OooO0o0("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrOooO0o3[0];
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                propertyValuesHolder2.setFloatValues(ViewCompat.OooO.OooO0o0(extendedFloatingActionButton), oooOOO2.getPaddingEnd());
                oooOOO.OooO0oo("paddingEnd", propertyValuesHolderArrOooO0o3);
            }
            if (oooOOO.OooO0oO("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrOooO0o4 = oooOOO.OooO0o0("labelOpacity");
                boolean z = this.f16540OooO0oo;
                propertyValuesHolderArrOooO0o4[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                oooOOO.OooO0oo("labelOpacity", propertyValuesHolderArrOooO0o4);
            }
            return OooO0oo(oooOOO);
        }

        @Override // o0O00O.OooOOO0
        public final void onAnimationStart(Animator animator) {
            o0O00O.OooO00o oooO00o = this.f40978OooO0Oo;
            Animator animator2 = oooO00o.f40974OooO00o;
            if (animator2 != null) {
                animator2.cancel();
            }
            oooO00o.f40974OooO00o = animator;
            boolean z = this.f16540OooO0oo;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f16529Oooo00O = z;
            extendedFloatingActionButton.f16530Oooo00o = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class OooOO0O extends o0O00O.OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f16541OooO0oO;

        public OooOO0O(o0O00O.OooO00o oooO00o) {
            super(ExtendedFloatingActionButton.this, oooO00o);
        }

        @Override // o0O00O.OooOOO0
        public final void OooO00o() {
            this.f40978OooO0Oo.f40974OooO00o = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f16519OooOo = 0;
            if (this.f16541OooO0oO) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0O0() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0OO() {
        }

        @Override // o0O00O.OooOOO0
        public final boolean OooO0Oo() {
            int i = ExtendedFloatingActionButton.f16515Oooo0o;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.f16519OooOo == 1) {
                    return true;
                }
            } else if (extendedFloatingActionButton.f16519OooOo != 2) {
                return true;
            }
            return false;
        }

        @Override // o0O00O.OooOOO0
        public final int OooO0o() {
            return o000000O.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // o0O00O.OooO0O0, o0O00O.OooOOO0
        public final void OooO0o0() {
            super.OooO0o0();
            this.f16541OooO0oO = true;
        }

        @Override // o0O00O.OooOOO0
        public final void onAnimationStart(Animator animator) {
            o0O00O.OooO00o oooO00o = this.f40978OooO0Oo;
            Animator animator2 = oooO00o.f40974OooO00o;
            if (animator2 != null) {
                animator2.cancel();
            }
            oooO00o.f40974OooO00o = animator;
            this.f16541OooO0oO = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f16519OooOo = 1;
        }
    }

    public interface OooOOO {
        ViewGroup.LayoutParams OooO00o();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public class OooOOO0 extends o0O00O.OooO0O0 {
        public OooOOO0(o0O00O.OooO00o oooO00o) {
            super(ExtendedFloatingActionButton.this, oooO00o);
        }

        @Override // o0O00O.OooOOO0
        public final void OooO00o() {
            this.f40978OooO0Oo.f40974OooO00o = null;
            ExtendedFloatingActionButton.this.f16519OooOo = 0;
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0O0() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // o0O00O.OooOOO0
        public final void OooO0OO() {
        }

        @Override // o0O00O.OooOOO0
        public final boolean OooO0Oo() {
            int i = ExtendedFloatingActionButton.f16515Oooo0o;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.f16519OooOo != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f16519OooOo == 1) {
                return false;
            }
            return true;
        }

        @Override // o0O00O.OooOOO0
        public final int OooO0o() {
            return o000000O.mtrl_extended_fab_show_motion_spec;
        }

        @Override // o0O00O.OooOOO0
        public final void onAnimationStart(Animator animator) {
            o0O00O.OooO00o oooO00o = this.f40978OooO0Oo;
            Animator animator2 = oooO00o.f40974OooO00o;
            if (animator2 != null) {
                animator2.cancel();
            }
            oooO00o.f40974OooO00o = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f16519OooOo = 2;
        }
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0o0(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        o0O00O.OooO0O0 oooO0O0;
        boolean z;
        if (i == 0) {
            oooO0O0 = extendedFloatingActionButton.f16522OooOoOO;
        } else if (i == 1) {
            oooO0O0 = extendedFloatingActionButton.f16524OooOoo0;
        } else if (i == 2) {
            oooO0O0 = extendedFloatingActionButton.f16521OooOoO0;
        } else {
            if (i != 3) {
                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unknown strategy type: ", i));
            }
            oooO0O0 = extendedFloatingActionButton.f16520OooOoO;
        }
        if (oooO0O0.OooO0Oo()) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(extendedFloatingActionButton)) {
            z = extendedFloatingActionButton.isInEditMode() ? false : true;
        } else {
            boolean z2 = extendedFloatingActionButton.getVisibility() != 0 ? false : false;
            if (!z2 && extendedFloatingActionButton.f16527Oooo0) {
                if (extendedFloatingActionButton.isInEditMode()) {
                }
            }
        }
        if (!z) {
            oooO0O0.OooO0O0();
            oooO0O0.OooO0OO();
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                extendedFloatingActionButton.f16532Oooo0OO = layoutParams.width;
                extendedFloatingActionButton.f16533Oooo0o0 = layoutParams.height;
            } else {
                extendedFloatingActionButton.f16532Oooo0OO = extendedFloatingActionButton.getWidth();
                extendedFloatingActionButton.f16533Oooo0o0 = extendedFloatingActionButton.getHeight();
            }
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet animatorSetOooO0oO = oooO0O0.OooO0oO();
        animatorSetOooO0oO.addListener(new o0O00O.OooO0o(oooO0O0));
        Iterator<Animator.AnimatorListener> it = oooO0O0.f40977OooO0OO.iterator();
        while (it.hasNext()) {
            animatorSetOooO0oO.addListener(it.next());
        }
        animatorSetOooO0oO.start();
    }

    public final void OooO0o(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f16528Oooo000;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.f16523OooOoo;
        if (i >= 0) {
            return i;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return (Math.min(ViewCompat.OooO.OooO0o(this), ViewCompat.OooO.OooO0o0(this)) * 2) + getIconSize();
    }

    @Nullable
    public o0O000.OooOOO getExtendMotionSpec() {
        return this.f16520OooOoO.f40979OooO0o;
    }

    @Nullable
    public o0O000.OooOOO getHideMotionSpec() {
        return this.f16524OooOoo0.f40979OooO0o;
    }

    @Nullable
    public o0O000.OooOOO getShowMotionSpec() {
        return this.f16522OooOoOO.f40979OooO0o;
    }

    @Nullable
    public o0O000.OooOOO getShrinkMotionSpec() {
        return this.f16521OooOoO0.f40979OooO0o;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16529Oooo00O && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f16529Oooo00O = false;
            this.f16521OooOoO0.OooO0O0();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f16527Oooo0 = z;
    }

    public void setExtendMotionSpec(@Nullable o0O000.OooOOO oooOOO) {
        this.f16520OooOoO.f40979OooO0o = oooOOO;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(o0O000.OooOOO.OooO0O0(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (this.f16529Oooo00O == z) {
            return;
        }
        OooOO0 oooOO1 = z ? this.f16520OooOoO : this.f16521OooOoO0;
        if (oooOO1.OooO0Oo()) {
            return;
        }
        oooOO1.OooO0O0();
    }

    public void setHideMotionSpec(@Nullable o0O000.OooOOO oooOOO) {
        this.f16524OooOoo0.f40979OooO0o = oooOOO;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(o0O000.OooOOO.OooO0O0(i, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f16529Oooo00O || this.f16530Oooo00o) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        this.f16525OooOooO = ViewCompat.OooO.OooO0o(this);
        this.f16526OooOooo = ViewCompat.OooO.OooO0o0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f16529Oooo00O || this.f16530Oooo00o) {
            return;
        }
        this.f16525OooOooO = i;
        this.f16526OooOooo = i3;
    }

    public void setShowMotionSpec(@Nullable o0O000.OooOOO oooOOO) {
        this.f16522OooOoOO.f40979OooO0o = oooOOO;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(o0O000.OooOOO.OooO0O0(i, getContext()));
    }

    public void setShrinkMotionSpec(@Nullable o0O000.OooOOO oooOOO) {
        this.f16521OooOoO0.f40979OooO0o = oooOOO;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(o0O000.OooOOO.OooO0O0(i, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.f16531Oooo0O0 = getTextColors();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f16534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f16535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f16536OooO0OO;

        public ExtendedFloatingActionButtonBehavior() {
            this.f16535OooO0O0 = false;
            this.f16536OooO0OO = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull View view, @NonNull Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
            if (oooO0o.f5224OooO0oo == 0) {
                oooO0o.f5224OooO0oo = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooOo00(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f5217OooO00o instanceof BottomSheetBehavior : false) {
                    OooOo0(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListOooO = coordinatorLayout.OooO(extendedFloatingActionButton);
            int size = arrayListOooO.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListOooO.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooO0o ? ((CoordinatorLayout.OooO0o) layoutParams).f5217OooO00o instanceof BottomSheetBehavior : false) && OooOo0(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooOo00(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.OooOOOo(i, extendedFloatingActionButton);
            return true;
        }

        public final boolean OooOo0(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.f16535OooO0O0;
            boolean z2 = this.f16536OooO0OO;
            if (!((z || z2) && oooO0o.f5221OooO0o == view.getId())) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public final boolean OooOo00(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.f16535OooO0O0;
            boolean z2 = this.f16536OooO0OO;
            if (!((z || z2) && oooO0o.f5221OooO0o == appBarLayout.getId())) {
                return false;
            }
            if (this.f16534OooO00o == null) {
                this.f16534OooO00o = new Rect();
            }
            Rect rect = this.f16534OooO00o;
            com.google.android.material.internal.OooO0o.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.OooO0o0(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ExtendedFloatingActionButton_Behavior_Layout);
            this.f16535OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(o000OO.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f16536OooO0OO = typedArrayObtainStyledAttributes.getBoolean(o000OO.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16515Oooo0o;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16519OooOo = 0;
        o0O00O.OooO00o oooO00o = new o0O00O.OooO00o();
        OooOOO0 oooOOO0 = new OooOOO0(oooO00o);
        this.f16522OooOoOO = oooOOO0;
        OooOO0O oooOO0O = new OooOO0O(oooO00o);
        this.f16524OooOoo0 = oooOO0O;
        this.f16529Oooo00O = true;
        this.f16530Oooo00o = false;
        this.f16527Oooo0 = false;
        Context context2 = getContext();
        this.f16528Oooo000 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.ExtendedFloatingActionButton, i, i2, new int[0]);
        o0O000.OooOOO oooOOOOooO00o = o0O000.OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.ExtendedFloatingActionButton_showMotionSpec);
        o0O000.OooOOO oooOOOOooO00o2 = o0O000.OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.ExtendedFloatingActionButton_hideMotionSpec);
        o0O000.OooOOO oooOOOOooO00o3 = o0O000.OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.ExtendedFloatingActionButton_extendMotionSpec);
        o0O000.OooOOO oooOOOOooO00o4 = o0O000.OooOOO.OooO00o(context2, typedArrayOooO0Oo, o000OO.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f16523OooOoo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayOooO0Oo.getInt(o000OO.ExtendedFloatingActionButton_extendStrategy, 1);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        this.f16525OooOooO = ViewCompat.OooO.OooO0o(this);
        this.f16526OooOooo = ViewCompat.OooO.OooO0o0(this);
        o0O00O.OooO00o oooO00o2 = new o0O00O.OooO00o();
        com.google.android.material.floatingactionbutton.OooO00o oooO00o3 = new com.google.android.material.floatingactionbutton.OooO00o(this);
        com.google.android.material.floatingactionbutton.OooO0O0 oooO0O0 = new com.google.android.material.floatingactionbutton.OooO0O0(this, oooO00o3);
        OooOO0 oooOO1 = new OooOO0(oooO00o2, i3 != 1 ? i3 != 2 ? new com.google.android.material.floatingactionbutton.OooO0OO(this, oooO0O0, oooO00o3) : oooO0O0 : oooO00o3, true);
        this.f16520OooOoO = oooOO1;
        OooOO0 oooOO2 = new OooOO0(oooO00o2, new OooO00o(), false);
        this.f16521OooOoO0 = oooOO2;
        oooOOO0.f40979OooO0o = oooOOOOooO00o;
        oooOO0O.f40979OooO0o = oooOOOOooO00o2;
        oooOO1.f40979OooO0o = oooOOOOooO00o3;
        oooOO2.f40979OooO0o = oooOOOOooO00o4;
        typedArrayOooO0Oo.recycle();
        setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0Oo(context2, attributeSet, i, i2, com.google.android.material.shape.OooO0O0.f17149OooOOO0)));
        this.f16531Oooo0O0 = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f16531Oooo0O0 = getTextColors();
    }
}
