package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import androidx.media3.ui.o0OoOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0000O.o00000;
import o0000O.o0O0O00;
import p028Oooo0oO.o0oOO;
import p056o0000Oo0.OooO0o;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p281o0O00o0o.o00O0O;
import p281o0O00o0o.o00Oo0;
import p281o0O00o0o.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final int f17200OooOo0O = o0000O0.side_sheet_accessibility_pane_title;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int f17201OooOo0o = o0000O0O.Widget_Material3_SideSheet;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0o f17202OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O f17203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17204OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ColorStateList f17205OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0O0 f17206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f17207OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SideSheetBehavior<V>.OooO0O0 f17208OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f17209OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17210OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f17211OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f17212OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17213OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f17214OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f17215OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f17216OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f17217OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public VelocityTracker f17218OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @IdRes
    public int f17219OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17220OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO00o f17221OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet f17222OooOo00;

    public class OooO00o extends OooO0o.OooO0OO {
        public OooO00o() {
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO(@NonNull View view, int i, int i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f17217OooOOOo;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                o00O0O o00o0o2 = sideSheetBehavior.f17203OooO00o;
                int left = view.getLeft();
                view.getRight();
                int i3 = o00o0o2.f41086OooO00o.f17215OooOOO0;
                if (left <= i3) {
                    marginLayoutParams.rightMargin = i3 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f17222OooOo00;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            o00O0O o00o0o3 = sideSheetBehavior.f17203OooO00o;
            int i4 = o00o0o3.f41086OooO00o.f17215OooOOO0;
            o00o0o3.OooO00o();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((o00Oo0) it.next()).OooO0O0();
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO00o(@NonNull View view, int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return o0000O00.OooO00o.OooO0O0(i, sideSheetBehavior.f17203OooO00o.OooO00o(), sideSheetBehavior.f17215OooOOO0);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0O0(@NonNull View view, int i) {
            return view.getTop();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0OO(@NonNull View view) {
            return SideSheetBehavior.this.f17215OooOOO0;
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oo(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f17209OooO0oO) {
                    sideSheetBehavior.OooOo00(1);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x006d  */
        /* JADX WARN: Code duplicated, block: B:33:0x0084  */
        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooOO0(@NonNull View view, float f, float f2) {
            int i;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            o00O0O o00o0o2 = sideSheetBehavior.f17203OooO00o;
            o00o0o2.getClass();
            if (f >= 0.0f) {
                float right = view.getRight();
                SideSheetBehavior<? extends View> sideSheetBehavior2 = o00o0o2.f41086OooO00o;
                if (Math.abs((sideSheetBehavior2.f17212OooOO0O * f) + right) > 0.5f) {
                    if (!(((Math.abs(f) > Math.abs(f2) ? 1 : (Math.abs(f) == Math.abs(f2) ? 0 : -1)) > 0) && f2 > ((float) 500))) {
                        if (view.getLeft() > (sideSheetBehavior2.f17215OooOOO0 - o00o0o2.OooO00o()) / 2) {
                        }
                    }
                } else {
                    if (f == 0.0f) {
                        int left = view.getLeft();
                        i = Math.abs(left - o00o0o2.OooO00o()) < Math.abs(left - sideSheetBehavior2.f17215OooOOO0) ? 3 : 5;
                    } else {
                        if (!(Math.abs(f) > Math.abs(f2))) {
                            int left2 = view.getLeft();
                            if (Math.abs(left2 - o00o0o2.OooO00o()) < Math.abs(left2 - sideSheetBehavior2.f17215OooOOO0)) {
                            }
                        }
                    }
                }
            }
            sideSheetBehavior.OooOo0(view, i, true);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final boolean OooOO0O(int i, @NonNull View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f17210OooO0oo == 1 || (weakReference = sideSheetBehavior.f17216OooOOOO) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f17224OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f17225OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0OoOo0 f17226OooO0OO = new o0OoOo0(this, 1);

        public OooO0O0() {
        }

        public final void OooO00o(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f17216OooOOOO;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f17224OooO00o = i;
            if (this.f17225OooO0O0) {
                return;
            }
            V v = sideSheetBehavior.f17216OooOOOO.get();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOO0(v, this.f17226OooO0OO);
            this.f17225OooO0O0 = true;
        }
    }

    public SideSheetBehavior() {
        this.f17208OooO0o0 = new OooO0O0();
        this.f17209OooO0oO = true;
        this.f17210OooO0oo = 5;
        this.f17212OooOO0O = 0.1f;
        this.f17219OooOOo0 = -1;
        this.f17222OooOo00 = new LinkedHashSet();
        this.f17221OooOo0 = new OooO00o();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
        this.f17216OooOOOO = null;
        this.f17202OooO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0o() {
        this.f17216OooOOOO = null;
        this.f17202OooO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        OooO0o oooO0o;
        VelocityTracker velocityTracker;
        if (!((v.isShown() || ViewCompat.OooO0o0(v) != null) && this.f17209OooO0oO)) {
            this.f17211OooOO0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f17218OooOOo) != null) {
            velocityTracker.recycle();
            this.f17218OooOOo = null;
        }
        if (this.f17218OooOOo == null) {
            this.f17218OooOOo = VelocityTracker.obtain();
        }
        this.f17218OooOOo.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f17220OooOOoo = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f17211OooOO0) {
            this.f17211OooOO0 = false;
            return false;
        }
        return (this.f17211OooOO0 || (oooO0o = this.f17202OooO) == null || !oooO0o.OooOo0(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int i2;
        int i3;
        View viewFindViewById;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooO0o.OooO0O0(coordinatorLayout) && !ViewCompat.OooO0o.OooO0O0(v)) {
            v.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f17216OooOOOO == null) {
            this.f17216OooOOOO = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.f17204OooO0O0;
            if (materialShapeDrawable != null) {
                ViewCompat.OooO0o.OooOOo0(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f17204OooO0O0;
                float fOooO = this.f17207OooO0o;
                if (fOooO == -1.0f) {
                    fOooO = ViewCompat.OooOOO.OooO(v);
                }
                materialShapeDrawable2.OooOOO0(fOooO);
            } else {
                ColorStateList colorStateList = this.f17205OooO0OO;
                if (colorStateList != null) {
                    ViewCompat.OooOOO.OooOOo0(v, colorStateList);
                }
            }
            int i4 = this.f17210OooO0oo == 5 ? 4 : 0;
            if (v.getVisibility() != i4) {
                v.setVisibility(i4);
            }
            OooOo0O();
            if (ViewCompat.OooO0o.OooO0OO(v) == 0) {
                ViewCompat.OooO0o.OooOOoo(v, 1);
            }
            if (ViewCompat.OooO0o0(v) == null) {
                ViewCompat.OooOOOo(v, v.getResources().getString(f17200OooOo0O));
            }
        }
        if (this.f17202OooO == null) {
            this.f17202OooO = new OooO0o(coordinatorLayout.getContext(), coordinatorLayout, this.f17221OooOo0);
        }
        o00O0O o00o0o2 = this.f17203OooO00o;
        o00o0o2.getClass();
        int left2 = v.getLeft() - o00o0o2.f41086OooO00o.f17214OooOOO;
        coordinatorLayout.OooOOOo(i, v);
        this.f17215OooOOO0 = coordinatorLayout.getWidth();
        this.f17213OooOO0o = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f17203OooO00o.getClass();
            i2 = marginLayoutParams.rightMargin;
        } else {
            i2 = 0;
        }
        this.f17214OooOOO = i2;
        int i5 = this.f17210OooO0oo;
        if (i5 == 1 || i5 == 2) {
            o00O0O o00o0o3 = this.f17203OooO00o;
            o00o0o3.getClass();
            left = left2 - (v.getLeft() - o00o0o3.f41086OooO00o.f17214OooOOO);
        } else if (i5 != 3) {
            if (i5 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f17210OooO0oo);
            }
            left = this.f17203OooO00o.f41086OooO00o.f17215OooOOO0;
        }
        v.offsetLeftAndRight(left);
        if (this.f17217OooOOOo == null && (i3 = this.f17219OooOOo0) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f17217OooOOOo = new WeakReference<>(viewFindViewById);
        }
        for (o00Oo0 o00oo1 : this.f17222OooOo00) {
            if (o00oo1 instanceof o00oO0o) {
                ((o00oO0o) o00oo1).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOOO(@NonNull View view, @NonNull Parcelable parcelable) {
        int i = ((SavedState) parcelable).f17228OooO0o;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f17210OooO0oo = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable OooOOOo(@NonNull View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f17210OooO0oo;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        OooO0o oooO0o = this.f17202OooO;
        if (oooO0o != null && (this.f17209OooO0oO || i == 1)) {
            oooO0o.OooOOO(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f17218OooOOo) != null) {
            velocityTracker.recycle();
            this.f17218OooOOo = null;
        }
        if (this.f17218OooOOo == null) {
            this.f17218OooOOo = VelocityTracker.obtain();
        }
        this.f17218OooOOo.addMovement(motionEvent);
        OooO0o oooO0o2 = this.f17202OooO;
        if ((oooO0o2 != null && (this.f17209OooO0oO || this.f17210OooO0oo == 1)) && actionMasked == 2 && !this.f17211OooOO0) {
            if ((oooO0o2 != null && (this.f17209OooO0oO || this.f17210OooO0oo == 1)) && Math.abs(this.f17220OooOOoo - motionEvent.getX()) > this.f17202OooO.f33648OooO0O0) {
                z = true;
            }
            if (z) {
                this.f17202OooO.OooO0OO(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.f17211OooOO0;
    }

    public final void OooOo0(View view, int i, boolean z) {
        int iOooO00o;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f17203OooO00o.f41086OooO00o;
        if (i == 3) {
            iOooO00o = sideSheetBehavior.f17203OooO00o.OooO00o();
        } else {
            if (i != 5) {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid state to get outer edge offset: ", i));
            }
            iOooO00o = sideSheetBehavior.f17203OooO00o.f41086OooO00o.f17215OooOOO0;
        }
        OooO0o oooO0o = sideSheetBehavior.f17202OooO;
        if (!(oooO0o != null && (!z ? !oooO0o.OooOo0O(view, iOooO00o, view.getTop()) : !oooO0o.OooOo00(iOooO00o, view.getTop())))) {
            OooOo00(i);
        } else {
            OooOo00(2);
            this.f17208OooO0o0.OooO00o(i);
        }
    }

    public final void OooOo00(int i) {
        V v;
        if (this.f17210OooO0oo == i) {
            return;
        }
        this.f17210OooO0oo = i;
        WeakReference<V> weakReference = this.f17216OooOOOO;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.f17210OooO0oo == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.f17222OooOo00.iterator();
        while (it.hasNext()) {
            ((o00Oo0) it.next()).OooO00o();
        }
        OooOo0O();
    }

    public final void OooOo0O() {
        V v;
        WeakReference<V> weakReference = this.f17216OooOOOO;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.OooOO0o(262144, v);
        ViewCompat.OooO(0, v);
        ViewCompat.OooOO0o(ZegoConstants.ErrorMask.RoomServerErrorMask, v);
        ViewCompat.OooO(0, v);
        final int i = 5;
        if (this.f17210OooO0oo != 5) {
            ViewCompat.OooOOO0(v, o0O0O00.OooO00o.f33521OooOOO, null, new o00000() { // from class: androidx.media3.session.o0ooOOo
                /* JADX WARN: Code duplicated, block: B:19:0x0040  */
                @Override // o0000O.o00000
                public final boolean perform(View view, o0000O.o00000.OooO00o oooO00o) {
                    boolean z;
                    final SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this;
                    int i2 = SideSheetBehavior.f17200OooOo0O;
                    sideSheetBehavior.getClass();
                    final int i3 = i;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(o0oOO.OooO0O0(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f17216OooOOOO;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.OooOo00(i3);
                    } else {
                        View view2 = (View) sideSheetBehavior.f17216OooOOOO.get();
                        Runnable runnable = new Runnable() { // from class: o0O00o0o.oo000o
                            @Override // java.lang.Runnable
                            public final void run() {
                                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                                View view3 = (View) sideSheetBehavior2.f17216OooOOOO.get();
                                if (view3 != null) {
                                    sideSheetBehavior2.OooOo0(view3, i3, false);
                                }
                            }
                        };
                        ViewParent parent = view2.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            z = false;
                        } else {
                            WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                            if (ViewCompat.OooOO0O.OooO0O0(view2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            view2.post(runnable);
                        } else {
                            runnable.run();
                        }
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f17210OooO0oo != 3) {
            ViewCompat.OooOOO0(v, o0O0O00.OooO00o.f33520OooOO0o, null, new o00000() { // from class: androidx.media3.session.o0ooOOo
                /* JADX WARN: Code duplicated, block: B:19:0x0040  */
                @Override // o0000O.o00000
                public final boolean perform(View view, o0000O.o00000.OooO00o oooO00o) {
                    boolean z;
                    final SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this;
                    int i3 = SideSheetBehavior.f17200OooOo0O;
                    sideSheetBehavior.getClass();
                    final int i4 = i2;
                    if (i4 == 1 || i4 == 2) {
                        throw new IllegalArgumentException(o0oOO.OooO0O0(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f17216OooOOOO;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.OooOo00(i4);
                    } else {
                        View view2 = (View) sideSheetBehavior.f17216OooOOOO.get();
                        Runnable runnable = new Runnable() { // from class: o0O00o0o.oo000o
                            @Override // java.lang.Runnable
                            public final void run() {
                                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                                View view3 = (View) sideSheetBehavior2.f17216OooOOOO.get();
                                if (view3 != null) {
                                    sideSheetBehavior2.OooOo0(view3, i4, false);
                                }
                            }
                        };
                        ViewParent parent = view2.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            z = false;
                        } else {
                            WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                            if (ViewCompat.OooOO0O.OooO0O0(view2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            view2.post(runnable);
                        } else {
                            runnable.run();
                        }
                    }
                    return true;
                }
            });
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f17228OooO0o;

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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17228OooO0o = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f17228OooO0o);
        }

        public SavedState(android.view.AbsSavedState absSavedState, @NonNull SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f17228OooO0o = sideSheetBehavior.f17210OooO0oo;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17208OooO0o0 = new OooO0O0();
        this.f17209OooO0oO = true;
        this.f17210OooO0oo = 5;
        this.f17212OooOO0O = 0.1f;
        this.f17219OooOOo0 = -1;
        this.f17222OooOo00 = new LinkedHashSet();
        this.f17221OooOo0 = new OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.SideSheetBehavior_Layout);
        int i = o000OO.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            this.f17205OooO0OO = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(o000OO.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f17206OooO0Oo = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context, attributeSet, 0, f17201OooOo0o));
        }
        int i2 = o000OO.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, -1);
            this.f17219OooOOo0 = resourceId;
            WeakReference<View> weakReference = this.f17217OooOOOo;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f17217OooOOOo = null;
            WeakReference<V> weakReference2 = this.f17216OooOOOO;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    if (ViewCompat.OooOO0O.OooO0OO(v)) {
                        v.requestLayout();
                    }
                }
            }
        }
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17206OooO0Oo;
        if (oooO0O0 != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO0O0);
            this.f17204OooO0O0 = materialShapeDrawable;
            materialShapeDrawable.OooOO0O(context);
            ColorStateList colorStateList = this.f17205OooO0OO;
            if (colorStateList != null) {
                this.f17204OooO0O0.OooOOO(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f17204OooO0O0.setTint(typedValue.data);
            }
        }
        this.f17207OooO0o = typedArrayObtainStyledAttributes.getDimension(o000OO.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f17209OooO0oO = typedArrayObtainStyledAttributes.getBoolean(o000OO.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f17203OooO00o == null) {
            this.f17203OooO00o = new o00O0O(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
