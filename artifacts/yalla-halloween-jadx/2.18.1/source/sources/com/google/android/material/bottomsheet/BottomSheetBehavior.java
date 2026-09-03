package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p021OooOooo.o00O0O;
import p058o0000OoO.OooO;
import p072o000O0o0.o0000OO0;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.OooOo;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p427o0OoO0o.o00000;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final int f16593Ooooo00 = Oooo000.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16594OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f16595OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f16596OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f16597OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16598OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16600OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16601OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public MaterialShapeDrawable f16602OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f16603OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16604OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f16605OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16606OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16607OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16608OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16609OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f16610OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16611OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f16612OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f16613OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f16614OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f16615OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f16616OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.google.android.material.shape.OooO00o f16617OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public ValueAnimator f16618OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final BottomSheetBehavior<V>.OooO0o f16619OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f16620OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f16621OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f16622OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f16623OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f16624OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f16625Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f16626Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f16627Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f16628Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f16629Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f16630Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public o00000 f16631Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f16632Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f16633Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f16634Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f16635Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NonNull
    public final ArrayList<OooO0OO> f16636OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f16637OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f16638OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16639OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public VelocityTracker f16640OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f16641OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f16642OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f16643OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f16644OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooO0O0 f16645OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f16646o000oOoO;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f16647Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f16648Oooo0oO;

        public OooO00o(View view, int i) {
            this.f16647Oooo0o = view;
            this.f16648Oooo0oO = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            View view = this.f16647Oooo0o;
            int i = this.f16648Oooo0oO;
            int i2 = BottomSheetBehavior.f16593Ooooo00;
            bottomSheetBehavior.Oooo0O0(view, i, false);
        }
    }

    public class OooO0O0 extends o00000.OooO0OO {
        public OooO0O0() {
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO(@NonNull View view, int i, int i2) {
            BottomSheetBehavior.this.OooOo0o(i2);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO00o(@NonNull View view, int i) {
            return view.getLeft();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0O0(@NonNull View view, int i) {
            int iOooOoOO = BottomSheetBehavior.this.OooOoOO();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return o00O0O.OooO0o0(i, iOooOoOO, bottomSheetBehavior.f16628Oooo00O ? bottomSheetBehavior.f16638OoooO00 : bottomSheetBehavior.f16624OooOooo);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0Oo() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f16628Oooo00O ? bottomSheetBehavior.f16638OoooO00 : bottomSheetBehavior.f16624OooOooo;
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oo(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16626Oooo0) {
                    bottomSheetBehavior.Oooo00o(1);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:6:0x000f  */
        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooOO0(@NonNull View view, float f, float f2) {
            int i = 4;
            if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (!BottomSheetBehavior.this.f16596OooO0O0) {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    Objects.requireNonNull(BottomSheetBehavior.this);
                    if (top > BottomSheetBehavior.this.f16621OooOoo) {
                        i = 6;
                    }
                }
                i = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16628Oooo00O && bottomSheetBehavior.Oooo0(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (!(top2 > (bottomSheetBehavior2.OooOoOO() + bottomSheetBehavior2.f16638OoooO00) / 2)) {
                            if (!BottomSheetBehavior.this.f16596OooO0O0 && Math.abs(view.getTop() - BottomSheetBehavior.this.OooOoOO()) >= Math.abs(view.getTop() - BottomSheetBehavior.this.f16621OooOoo)) {
                                i = 6;
                            } else {
                                i = 3;
                            }
                        }
                    }
                    i = 5;
                } else if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.f16596OooO0O0) {
                        int i2 = bottomSheetBehavior3.f16621OooOoo;
                        if (top3 < i2) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f16624OooOooo)) {
                                i = 3;
                            } else {
                                Objects.requireNonNull(BottomSheetBehavior.this);
                            }
                        } else if (Math.abs(top3 - i2) < Math.abs(top3 - BottomSheetBehavior.this.f16624OooOooo)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                        }
                        i = 6;
                    } else if (Math.abs(top3 - bottomSheetBehavior3.f16622OooOoo0) < Math.abs(top3 - BottomSheetBehavior.this.f16624OooOooo)) {
                        i = 3;
                    }
                } else if (!BottomSheetBehavior.this.f16596OooO0O0) {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - BottomSheetBehavior.this.f16621OooOoo) < Math.abs(top4 - BottomSheetBehavior.this.f16624OooOooo)) {
                        Objects.requireNonNull(BottomSheetBehavior.this);
                        i = 6;
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            Objects.requireNonNull(bottomSheetBehavior4);
            bottomSheetBehavior4.Oooo0O0(view, i, true);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final boolean OooOO0O(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f16630Oooo0O0;
            if (i2 == 1 || bottomSheetBehavior.f16642OoooOOo) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f16646o000oOoO == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f16639OoooO0O;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f16637OoooO0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class OooO0OO {
        public void OooO00o(@NonNull View view) {
        }

        public abstract void OooO0O0(@NonNull View view);

        public abstract void OooO0OO(@NonNull View view, int i);
    }

    public class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16651OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f16652OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f16653OooO0OO = new OooO00o();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = OooO0o.this;
                oooO0o.f16652OooO0O0 = false;
                o00000 o00000Var = BottomSheetBehavior.this.f16631Oooo0OO;
                if (o00000Var != null && o00000Var.OooO()) {
                    OooO0o oooO0o2 = OooO0o.this;
                    oooO0o2.OooO00o(oooO0o2.f16651OooO00o);
                    return;
                }
                OooO0o oooO0o3 = OooO0o.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16630Oooo0O0 == 2) {
                    bottomSheetBehavior.Oooo00o(oooO0o3.f16651OooO00o);
                }
            }
        }

        public OooO0o() {
        }

        public final void OooO00o(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f16637OoooO0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f16651OooO00o = i;
            if (this.f16652OooO0O0) {
                return;
            }
            V v = BottomSheetBehavior.this.f16637OoooO0.get();
            OooO00o oooO00o = this.f16653OooO0OO;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOO0(v, oooO00o);
            this.f16652OooO0O0 = true;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public BottomSheetBehavior() {
        this.f16595OooO00o = 0;
        this.f16596OooO0O0 = true;
        this.f16603OooOO0 = -1;
        this.f16604OooOO0O = -1;
        this.f16619OooOoO0 = new OooO0o();
        this.f16623OooOooO = 0.5f;
        this.f16627Oooo000 = -1.0f;
        this.f16626Oooo0 = true;
        this.f16630Oooo0O0 = 4;
        this.f16636OoooO = new ArrayList<>();
        this.f16644OoooOoO = -1;
        this.f16645OoooOoo = new OooO0O0();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> OooOoO0(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.OooO0o)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) layoutParams).f7761OooO00o;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooOoO(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f16603OooOO0, marginLayoutParams.width), OooOoO(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f16604OooOO0O, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
        this.f16637OoooO0 = null;
        this.f16631Oooo0OO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0o() {
        this.f16637OoooO0 = null;
        this.f16631Oooo0OO = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        o00000 o00000Var;
        if (!v.isShown() || !this.f16626Oooo0) {
            this.f16633Oooo0o0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16646o000oOoO = -1;
            VelocityTracker velocityTracker = this.f16640OoooOO0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16640OoooOO0 = null;
            }
        }
        if (this.f16640OoooOO0 == null) {
            this.f16640OoooOO0 = VelocityTracker.obtain();
        }
        this.f16640OoooOO0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f16641OoooOOO = (int) motionEvent.getY();
            if (this.f16630Oooo0O0 != 2) {
                WeakReference<View> weakReference = this.f16639OoooO0O;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.OooOo0(view, x, this.f16641OoooOOO)) {
                    this.f16646o000oOoO = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f16642OoooOOo = true;
                }
            }
            this.f16633Oooo0o0 = this.f16646o000oOoO == -1 && !coordinatorLayout.OooOo0(v, x, this.f16641OoooOOO);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16642OoooOOo = false;
            this.f16646o000oOoO = -1;
            if (this.f16633Oooo0o0) {
                this.f16633Oooo0o0 = false;
                return false;
            }
        }
        if (!this.f16633Oooo0o0 && (o00000Var = this.f16631Oooo0OO) != null && o00000Var.OooOo(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f16639OoooO0O;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f16633Oooo0o0 || this.f16630Oooo0O0 == 1 || coordinatorLayout.OooOo0(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f16631Oooo0OO == null || Math.abs(((float) this.f16641OoooOOO) - motionEvent.getY()) <= ((float) this.f16631Oooo0OO.f39850OooO0O0)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO0o.OooO0O0(coordinatorLayout) && !ViewCompat.OooO0o.OooO0O0(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f16637OoooO0 == null) {
            this.f16599OooO0o = coordinatorLayout.getResources().getDimensionPixelSize(OooOO0.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f16607OooOOO0 || this.f16600OooO0o0) ? false : true;
            if (this.f16606OooOOO || this.f16608OooOOOO || this.f16609OooOOOo || this.f16610OooOOo || this.f16612OooOOoo || this.f16615OooOo00 || z) {
                o00Ooo.OooO00o(v, new o0OO0o.OooO0O0(this, z));
            }
            this.f16637OoooO0 = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.f16602OooO0oo;
            if (materialShapeDrawable != null) {
                ViewCompat.OooO0o.OooOOo0(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f16602OooO0oo;
                float fOooO = this.f16627Oooo000;
                if (fOooO == -1.0f) {
                    fOooO = ViewCompat.OooOOO.OooO(v);
                }
                materialShapeDrawable2.OooOOOO(fOooO);
                boolean z2 = this.f16630Oooo0O0 == 3;
                this.f16613OooOo = z2;
                this.f16602OooO0oo.OooOOo0(z2 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f);
            } else {
                ColorStateList colorStateList = this.f16594OooO;
                if (colorStateList != null) {
                    ViewCompat.OooOoO0(v, colorStateList);
                }
            }
            Oooo0OO();
            if (ViewCompat.OooO0o.OooO0OO(v) == 0) {
                ViewCompat.OooO0o.OooOOoo(v, 1);
            }
        }
        if (this.f16631Oooo0OO == null) {
            this.f16631Oooo0OO = new o00000(coordinatorLayout.getContext(), coordinatorLayout, this.f16645OoooOoo);
        }
        int top = v.getTop();
        coordinatorLayout.OooOo0o(v, i);
        this.f16625Oooo = coordinatorLayout.getWidth();
        this.f16638OoooO00 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f16635Oooo0oo = height;
        int i2 = this.f16638OoooO00;
        int i3 = i2 - height;
        int i4 = this.f16616OooOo0O;
        if (i3 < i4) {
            if (this.f16611OooOOo0) {
                this.f16635Oooo0oo = i2;
            } else {
                this.f16635Oooo0oo = i2 - i4;
            }
        }
        this.f16622OooOoo0 = Math.max(0, i2 - this.f16635Oooo0oo);
        this.f16621OooOoo = (int) ((1.0f - this.f16623OooOooO) * this.f16638OoooO00);
        OooOo0();
        int i5 = this.f16630Oooo0O0;
        if (i5 == 3) {
            ViewCompat.OooOOOo(v, OooOoOO());
        } else if (i5 == 6) {
            ViewCompat.OooOOOo(v, this.f16621OooOoo);
        } else if (this.f16628Oooo00O && i5 == 5) {
            ViewCompat.OooOOOo(v, this.f16638OoooO00);
        } else if (i5 == 4) {
            ViewCompat.OooOOOo(v, this.f16624OooOooo);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.OooOOOo(v, top - v.getTop());
        }
        this.f16639OoooO0O = new WeakReference<>(OooOo(v));
        for (int i6 = 0; i6 < this.f16636OoooO.size(); i6++) {
            this.f16636OoooO.get(i6).OooO00o(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOO0(@NonNull View view) {
        WeakReference<View> weakReference = this.f16639OoooO0O;
        return (weakReference == null || view != weakReference.get() || this.f16630Oooo0O0 == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOO0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f16639OoooO0O;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < OooOoOO()) {
                iArr[1] = top - OooOoOO();
                ViewCompat.OooOOOo(v, -iArr[1]);
                Oooo00o(3);
            } else {
                if (!this.f16626Oooo0) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.OooOOOo(v, -i2);
                Oooo00o(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.f16624OooOooo;
            if (i4 > i5 && !this.f16628Oooo00O) {
                iArr[1] = top - i5;
                ViewCompat.OooOOOo(v, -iArr[1]);
                Oooo00o(4);
            } else {
                if (!this.f16626Oooo0) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.OooOOOo(v, -i2);
                Oooo00o(1);
            }
        }
        OooOo0o(v.getTop());
        this.f16632Oooo0o = i2;
        this.f16634Oooo0oO = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOO0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOOO(@NonNull View view, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f16595OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f16598OooO0Oo = savedState.f16656Oooo;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f16596OooO0O0 = savedState.f16659OoooO00;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f16628Oooo00O = savedState.f16658OoooO0;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f16629Oooo00o = savedState.f16660OoooO0O;
            }
        }
        int i2 = savedState.f16657Oooo0oo;
        if (i2 == 1 || i2 == 2) {
            this.f16630Oooo0O0 = 4;
        } else {
            this.f16630Oooo0O0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable OooOOOo(@NonNull View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == OooOoOO()) {
            Oooo00o(3);
            return;
        }
        WeakReference<View> weakReference = this.f16639OoooO0O;
        if (weakReference != null && view == weakReference.get() && this.f16634Oooo0oO) {
            if (this.f16632Oooo0o > 0) {
                if (!this.f16596OooO0O0 && v.getTop() > this.f16621OooOoo) {
                    i3 = 6;
                }
            } else if (this.f16628Oooo00O) {
                VelocityTracker velocityTracker = this.f16640OoooOO0;
                if (velocityTracker == null) {
                    yVelocity = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f16597OooO0OO);
                    yVelocity = this.f16640OoooOO0.getYVelocity(this.f16646o000oOoO);
                }
                if (Oooo0(v, yVelocity)) {
                    i3 = 5;
                } else if (this.f16632Oooo0o == 0) {
                    top2 = v.getTop();
                    if (this.f16596OooO0O0) {
                        i2 = this.f16621OooOoo;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f16624OooOooo)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f16624OooOooo)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f16622OooOoo0) >= Math.abs(top2 - this.f16624OooOooo)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f16596OooO0O0) {
                        top = v.getTop();
                        if (Math.abs(top - this.f16621OooOoo) < Math.abs(top - this.f16624OooOooo)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f16632Oooo0o == 0) {
                top2 = v.getTop();
                if (this.f16596OooO0O0) {
                    i2 = this.f16621OooOoo;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f16624OooOooo)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f16624OooOooo)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f16622OooOoo0) >= Math.abs(top2 - this.f16624OooOooo)) {
                    i3 = 4;
                }
            } else {
                if (!this.f16596OooO0O0) {
                    top = v.getTop();
                    if (Math.abs(top - this.f16621OooOoo) < Math.abs(top - this.f16624OooOooo)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            Oooo0O0(v, i3, false);
            this.f16634Oooo0oO = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.f16632Oooo0o = 0;
        this.f16634Oooo0oO = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f16630Oooo0O0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        o00000 o00000Var = this.f16631Oooo0OO;
        if (o00000Var != null && (this.f16626Oooo0 || i == 1)) {
            o00000Var.OooOOo0(motionEvent);
        }
        if (actionMasked == 0) {
            this.f16646o000oOoO = -1;
            VelocityTracker velocityTracker = this.f16640OoooOO0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16640OoooOO0 = null;
            }
        }
        if (this.f16640OoooOO0 == null) {
            this.f16640OoooOO0 = VelocityTracker.obtain();
        }
        this.f16640OoooOO0.addMovement(motionEvent);
        if (this.f16631Oooo0OO != null && (this.f16626Oooo0 || this.f16630Oooo0O0 == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.f16633Oooo0o0) {
            float fAbs = Math.abs(this.f16641OoooOOO - motionEvent.getY());
            o00000 o00000Var2 = this.f16631Oooo0OO;
            if (fAbs > o00000Var2.f39850OooO0O0) {
                o00000Var2.OooO0OO(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f16633Oooo0o0;
    }

    @Nullable
    @VisibleForTesting
    public final View OooOo(View view) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOOO.OooOOOo(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewOooOo = OooOo(viewGroup.getChildAt(i));
            if (viewOooOo != null) {
                return viewOooOo;
            }
        }
        return null;
    }

    public final void OooOo0() {
        int iOooOo0O = OooOo0O();
        if (this.f16596OooO0O0) {
            this.f16624OooOooo = Math.max(this.f16638OoooO00 - iOooOo0O, this.f16622OooOoo0);
        } else {
            this.f16624OooOooo = this.f16638OoooO00 - iOooOo0O;
        }
    }

    public final void OooOo00(@NonNull OooO0OO oooO0OO) {
        if (this.f16636OoooO.contains(oooO0OO)) {
            return;
        }
        this.f16636OoooO.add(oooO0OO);
    }

    public final int OooOo0O() {
        int i;
        if (this.f16600OooO0o0) {
            return Math.min(Math.max(this.f16599OooO0o, this.f16638OoooO00 - ((this.f16625Oooo * 9) / 16)), this.f16635Oooo0oo) + this.f16614OooOo0;
        }
        return (this.f16607OooOOO0 || this.f16606OooOOO || (i = this.f16605OooOO0o) <= 0) ? this.f16598OooO0Oo + this.f16614OooOo0 : Math.max(this.f16598OooO0Oo, i + this.f16601OooO0oO);
    }

    public final void OooOo0o(int i) {
        V v = this.f16637OoooO0.get();
        if (v == null || this.f16636OoooO.isEmpty()) {
            return;
        }
        int i2 = this.f16624OooOooo;
        if (i <= i2 && i2 != OooOoOO()) {
            OooOoOO();
        }
        for (int i3 = 0; i3 < this.f16636OoooO.size(); i3++) {
            this.f16636OoooO.get(i3).OooO0O0(v);
        }
    }

    public final int OooOoO(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int OooOoOO() {
        if (this.f16596OooO0O0) {
            return this.f16622OooOoo0;
        }
        return Math.max(this.f16620OooOoOO, this.f16611OooOOo0 ? 0 : this.f16616OooOo0O);
    }

    public final void OooOoo(@NonNull OooO0OO oooO0OO) {
        this.f16636OoooO.remove(oooO0OO);
    }

    public final int OooOoo0(int i) {
        if (i == 3) {
            return OooOoOO();
        }
        if (i == 4) {
            return this.f16624OooOooo;
        }
        if (i == 5) {
            return this.f16638OoooO00;
        }
        if (i == 6) {
            return this.f16621OooOoo;
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid state to get top offset: ", i));
    }

    public final void OooOooO(V v, o0000OO0.OooO00o oooO00o, int i) {
        ViewCompat.OooOo0(v, oooO00o, new o0OO0o.OooO0OO(this, i));
    }

    public final void OooOooo(boolean z) {
        if (this.f16628Oooo00O != z) {
            this.f16628Oooo00O = z;
            if (!z && this.f16630Oooo0O0 == 5) {
                Oooo00O(4);
            }
            Oooo0OO();
        }
    }

    public final boolean Oooo0(@NonNull View view, float f) {
        if (this.f16629Oooo00o) {
            return true;
        }
        if (view.getTop() < this.f16624OooOooo) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f16624OooOooo)) / ((float) OooOo0O()) > 0.5f;
    }

    public final void Oooo000(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f16600OooO0o0) {
                this.f16600OooO0o0 = true;
                z = true;
            }
        } else if (this.f16600OooO0o0 || this.f16598OooO0Oo != i) {
            this.f16600OooO0o0 = false;
            this.f16598OooO0Oo = Math.max(0, i);
            z = true;
        }
        if (z) {
            Oooo0oO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    public final void Oooo00O(int i) {
        boolean z;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(OooO.OooO00o(OooO00o.OooO00o.OooO0o0("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f16628Oooo00O && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f16596OooO0O0 && OooOoo0(i) <= this.f16622OooOoo0) ? 3 : i;
        WeakReference<V> weakReference = this.f16637OoooO0;
        if (weakReference == null || weakReference.get() == null) {
            Oooo00o(i);
            return;
        }
        V v = this.f16637OoooO0.get();
        OooO00o oooO00o = new OooO00o(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            z = ViewCompat.OooOO0O.OooO0O0(v);
        }
        if (z) {
            v.post(oooO00o);
        } else {
            oooO00o.run();
        }
    }

    public final void Oooo00o(int i) {
        V v;
        if (this.f16630Oooo0O0 == i) {
            return;
        }
        this.f16630Oooo0O0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f16628Oooo00O;
        }
        WeakReference<V> weakReference = this.f16637OoooO0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            Oooo0o(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Oooo0o(false);
        }
        Oooo0o0(i);
        for (int i2 = 0; i2 < this.f16636OoooO.size(); i2++) {
            this.f16636OoooO.get(i2).OooO0OO(v, i);
        }
        Oooo0OO();
    }

    public final void Oooo0O0(View view, int i, boolean z) {
        int iOooOoo0 = OooOoo0(i);
        o00000 o00000Var = this.f16631Oooo0OO;
        if (!(o00000Var != null && (!z ? !o00000Var.OooOoO0(view, view.getLeft(), iOooOoo0) : !o00000Var.OooOo0o(view.getLeft(), iOooOoo0)))) {
            Oooo00o(i);
            return;
        }
        Oooo00o(2);
        Oooo0o0(i);
        this.f16619OooOoO0.OooO00o(i);
    }

    public final void Oooo0OO() {
        V v;
        int iOooO00o;
        WeakReference<V> weakReference = this.f16637OoooO0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.OooOo00(524288, v);
        ViewCompat.OooOOO(v, 0);
        ViewCompat.OooOo00(262144, v);
        ViewCompat.OooOOO(v, 0);
        ViewCompat.OooOo00(1048576, v);
        ViewCompat.OooOOO(v, 0);
        int i = this.f16644OoooOoO;
        if (i != -1) {
            ViewCompat.OooOo00(i, v);
            ViewCompat.OooOOO(v, 0);
        }
        if (!this.f16596OooO0O0 && this.f16630Oooo0O0 != 6) {
            String string = v.getResources().getString(OooOo.bottomsheet_action_expand_halfway);
            o0OO0o.OooO0OO oooO0OO = new o0OO0o.OooO0OO(this, 6);
            List<o0000OO0.OooO00o> listOooOO0 = ViewCompat.OooOO0(v);
            int i2 = 0;
            while (true) {
                if (i2 >= listOooOO0.size()) {
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        int[] iArr = ViewCompat.f7875OooO0o0;
                        if (i4 >= iArr.length || i3 != -1) {
                            break;
                        }
                        int i5 = iArr[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < listOooOO0.size(); i6++) {
                            z &= listOooOO0.get(i6).OooO00o() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                        i4++;
                    }
                    iOooO00o = i3;
                    break;
                }
                if (TextUtils.equals(string, listOooOO0.get(i2).OooO0O0())) {
                    iOooO00o = listOooOO0.get(i2).OooO00o();
                    break;
                }
                i2++;
            }
            if (iOooO00o != -1) {
                ViewCompat.OooO00o(v, new o0000OO0.OooO00o(null, iOooO00o, string, oooO0OO, null));
            }
            this.f16644OoooOoO = iOooO00o;
        }
        if (this.f16628Oooo00O && this.f16630Oooo0O0 != 5) {
            OooOooO(v, o0000OO0.OooO00o.f28205OooOOO, 5);
        }
        int i7 = this.f16630Oooo0O0;
        if (i7 == 3) {
            OooOooO(v, o0000OO0.OooO00o.f28206OooOOO0, this.f16596OooO0O0 ? 4 : 6);
            return;
        }
        if (i7 == 4) {
            OooOooO(v, o0000OO0.OooO00o.f28204OooOO0o, this.f16596OooO0O0 ? 3 : 6);
        } else {
            if (i7 != 6) {
                return;
            }
            OooOooO(v, o0000OO0.OooO00o.f28206OooOOO0, 4);
            OooOooO(v, o0000OO0.OooO00o.f28204OooOO0o, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    public final void Oooo0o(boolean z) {
        WeakReference<V> weakReference = this.f16637OoooO0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f16643OoooOo0 != null) {
                    return;
                } else {
                    this.f16643OoooOo0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f16637OoooO0.get() && z) {
                    this.f16643OoooOo0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f16643OoooOo0 = null;
        }
    }

    public final void Oooo0o0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f16613OooOo != z) {
            this.f16613OooOo = z;
            if (this.f16602OooO0oo == null || (valueAnimator = this.f16618OooOoO) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f16618OooOoO.reverse();
                return;
            }
            float f = z ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f;
            this.f16618OooOoO.setFloatValues(1.0f - f, f);
            this.f16618OooOoO.start();
        }
    }

    public final void Oooo0oO() {
        V v;
        if (this.f16637OoooO0 != null) {
            OooOo0();
            if (this.f16630Oooo0O0 != 4 || (v = this.f16637OoooO0.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f16656Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f16657Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f16658OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f16659OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public boolean f16660OoooO0O;

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
            this.f16657Oooo0oo = parcel.readInt();
            this.f16656Oooo = parcel.readInt();
            this.f16659OoooO00 = parcel.readInt() == 1;
            this.f16658OoooO0 = parcel.readInt() == 1;
            this.f16660OoooO0O = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f16657Oooo0oo);
            parcel.writeInt(this.f16656Oooo);
            parcel.writeInt(this.f16659OoooO00 ? 1 : 0);
            parcel.writeInt(this.f16658OoooO0 ? 1 : 0);
            parcel.writeInt(this.f16660OoooO0O ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f16657Oooo0oo = bottomSheetBehavior.f16630Oooo0O0;
            this.f16656Oooo = bottomSheetBehavior.f16598OooO0Oo;
            this.f16659OoooO00 = bottomSheetBehavior.f16596OooO0O0;
            this.f16658OoooO0 = bottomSheetBehavior.f16628Oooo00O;
            this.f16660OoooO0O = bottomSheetBehavior.f16629Oooo00o;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f16595OooO00o = 0;
        this.f16596OooO0O0 = true;
        this.f16603OooOO0 = -1;
        this.f16604OooOO0O = -1;
        this.f16619OooOoO0 = new OooO0o();
        this.f16623OooOooO = 0.5f;
        this.f16627Oooo000 = -1.0f;
        this.f16626Oooo0 = true;
        this.f16630Oooo0O0 = 4;
        this.f16636OoooO = new ArrayList<>();
        this.f16644OoooOoO = -1;
        this.f16645OoooOoo = new OooO0O0();
        this.f16601OooO0oO = context.getResources().getDimensionPixelSize(OooOO0.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.BottomSheetBehavior_Layout);
        int i2 = Oooo0.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            this.f16594OooO = o0OOO0O.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Oooo0.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f16617OooOo0o = new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO0OO(context, attributeSet, p337o0OO0o0.OooO0o.bottomSheetStyle, f16593Ooooo00));
        }
        if (this.f16617OooOo0o != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f16617OooOo0o);
            this.f16602OooO0oo = materialShapeDrawable;
            materialShapeDrawable.OooOOO0(context);
            ColorStateList colorStateList = this.f16594OooO;
            if (colorStateList != null) {
                this.f16602OooO0oo.OooOOOo(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f16602OooO0oo.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        this.f16618OooOoO = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f16618OooOoO.addUpdateListener(new o0OO0o.OooO00o(this));
        this.f16627Oooo000 = typedArrayObtainStyledAttributes.getDimension(Oooo0.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = Oooo0.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f16603OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, -1);
        }
        int i4 = Oooo0.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f16604OooOO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1);
        }
        int i5 = Oooo0.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i5);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            Oooo000(i);
        } else {
            Oooo000(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        OooOooo(typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f16607OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f16596OooO0O0 != z) {
            this.f16596OooO0O0 = z;
            if (this.f16637OoooO0 != null) {
                OooOo0();
            }
            Oooo00o((this.f16596OooO0O0 && this.f16630Oooo0O0 == 6) ? 3 : this.f16630Oooo0O0);
            Oooo0OO();
        }
        this.f16629Oooo00o = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f16626Oooo0 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f16595OooO00o = typedArrayObtainStyledAttributes.getInt(Oooo0.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(Oooo0.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f < 1.0f) {
            this.f16623OooOooO = f;
            if (this.f16637OoooO0 != null) {
                this.f16621OooOoo = (int) ((1.0f - f) * this.f16638OoooO00);
            }
            int i6 = Oooo0.BottomSheetBehavior_Layout_behavior_expandedOffset;
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i7 = typedValuePeekValue2.data;
                if (i7 >= 0) {
                    this.f16620OooOoOO = i7;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f16620OooOoOO = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f16606OooOOO = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.f16608OooOOOO = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.f16609OooOOOo = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.f16611OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.f16610OooOOo = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.f16612OooOOoo = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.f16615OooOo00 = typedArrayObtainStyledAttributes.getBoolean(Oooo0.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            typedArrayObtainStyledAttributes.recycle();
            this.f16597OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
