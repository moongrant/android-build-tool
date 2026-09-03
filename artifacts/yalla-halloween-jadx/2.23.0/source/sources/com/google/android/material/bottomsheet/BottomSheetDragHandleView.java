package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import o0000O.o0Oo0oo;
import o0O000Oo.OooOO0O;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int f16502OooOOO0 = o0000O0O.Widget_Material3_BottomSheet_DragHandle;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f16503OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f16504OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16505OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<?> f16506OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f16507OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16508OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f16509OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final String f16510OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f16511OooOO0o;

    public class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NonNull View view) {
            int i2 = BottomSheetDragHandleView.f16502OooOOO0;
            BottomSheetDragHandleView.this.OooO0Oo(i);
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                int i = BottomSheetDragHandleView.f16502OooOOO0;
                BottomSheetDragHandleView.this.OooO0OO();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f16506OooO0o0;
        OooO00o oooO00o = this.f16511OooOO0o;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f16479OoooOOo.remove(oooO00o);
            this.f16506OooO0o0.OooOooO(null);
        }
        this.f16506OooO0o0 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.OooOooO(this);
            OooO0Oo(this.f16506OooO0o0.f16470Oooo0o0);
            this.f16506OooO0o0.OooOo00(oooO00o);
        }
        OooO0o0();
    }

    public final boolean OooO0OO() {
        boolean z = false;
        if (!this.f16507OooO0oO) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.f16504OooO0Oo;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.f16510OooOO0O);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.f16506OooO0o0;
        if (!bottomSheetBehavior.f16433OooO0O0) {
            bottomSheetBehavior.getClass();
            z = true;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f16506OooO0o0;
        int i = bottomSheetBehavior2.f16470Oooo0o0;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (!z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.f16508OooO0oo) {
                i3 = 4;
            }
            i2 = i3;
        } else if (!z) {
            i2 = 4;
        }
        bottomSheetBehavior2.Oooo0O0(i2);
        return true;
    }

    public final void OooO0Oo(int i) {
        if (i == 4) {
            this.f16508OooO0oo = true;
        } else if (i == 3) {
            this.f16508OooO0oo = false;
        }
        ViewCompat.OooOOO0(this, o0Oo0oo.OooO00o.f34028OooO0oO, this.f16508OooO0oo ? this.f16503OooO : this.f16509OooOO0, new OooOO0O(this));
    }

    public final void OooO0o0() {
        this.f16507OooO0oO = this.f16505OooO0o && this.f16506OooO0o0 != null;
        int i = this.f16506OooO0o0 == null ? 2 : 1;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, i);
        setClickable(this.f16507OooO0oO);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f16505OooO0o = z;
        OooO0o0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.OooO0o) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) layoutParams).f5211OooO00o;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f16504OooO0Oo;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f16504OooO0Oo;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, f16502OooOOO0), attributeSet, i);
        this.f16503OooO = getResources().getString(o0000O0.bottomsheet_action_expand);
        this.f16509OooOO0 = getResources().getString(o0000O0.bottomsheet_action_collapse);
        this.f16510OooOO0O = getResources().getString(o0000O0.bottomsheet_drag_handle_clicked);
        this.f16511OooOO0o = new OooO00o();
        this.f16504OooO0Oo = (AccessibilityManager) getContext().getSystemService("accessibility");
        OooO0o0();
        ViewCompat.OooOOOO(this, new OooO0O0());
    }
}
