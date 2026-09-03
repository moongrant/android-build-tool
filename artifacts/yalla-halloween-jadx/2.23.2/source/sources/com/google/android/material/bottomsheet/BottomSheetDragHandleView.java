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
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import o000O00O.o0000oo;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int f16029OooOOO0 = o0000O0O.Widget_Material3_BottomSheet_DragHandle;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f16030OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f16031OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16032OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<?> f16033OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f16034OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16035OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f16036OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final String f16037OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f16038OooOO0o;

    public class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NonNull View view) {
            int i2 = BottomSheetDragHandleView.f16029OooOOO0;
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
                int i = BottomSheetDragHandleView.f16029OooOOO0;
                BottomSheetDragHandleView.this.OooO0OO();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f16033OooO0o0;
        OooO00o oooO00o = this.f16038OooOO0o;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f16006OoooOOo.remove(oooO00o);
            this.f16033OooO0o0.OooOooO(null);
        }
        this.f16033OooO0o0 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.OooOooO(this);
            OooO0Oo(this.f16033OooO0o0.f15997Oooo0o0);
            this.f16033OooO0o0.OooOo00(oooO00o);
        }
        OooO0o0();
    }

    public final boolean OooO0OO() {
        boolean z = false;
        if (!this.f16034OooO0oO) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.f16031OooO0Oo;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.f16037OooOO0O);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.f16033OooO0o0;
        if (!bottomSheetBehavior.f15960OooO0O0) {
            bottomSheetBehavior.getClass();
            z = true;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f16033OooO0o0;
        int i = bottomSheetBehavior2.f15997Oooo0o0;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (!z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.f16035OooO0oo) {
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
            this.f16035OooO0oo = true;
        } else if (i == 3) {
            this.f16035OooO0oo = false;
        }
        ViewCompat.OooOOO0(this, o0O0O00.OooO00o.f33516OooO0oO, this.f16035OooO0oo ? this.f16030OooO : this.f16036OooOO0, new o0000oo(this));
    }

    public final void OooO0o0() {
        this.f16034OooO0oO = this.f16032OooO0o && this.f16033OooO0o0 != null;
        int i = this.f16033OooO0o0 == null ? 2 : 1;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, i);
        setClickable(this.f16034OooO0oO);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f16032OooO0o = z;
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
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) layoutParams).f5217OooO00o;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f16031OooO0Oo;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f16031OooO0Oo;
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
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, f16029OooOOO0), attributeSet, i);
        this.f16030OooO = getResources().getString(o0000O0.bottomsheet_action_expand);
        this.f16036OooOO0 = getResources().getString(o0000O0.bottomsheet_action_collapse);
        this.f16037OooOO0O = getResources().getString(o0000O0.bottomsheet_drag_handle_clicked);
        this.f16038OooOO0o = new OooO00o();
        this.f16031OooO0Oo = (AccessibilityManager) getContext().getSystemService("accessibility");
        OooO0o0();
        ViewCompat.OooOOOO(this, new OooO0O0());
    }
}
