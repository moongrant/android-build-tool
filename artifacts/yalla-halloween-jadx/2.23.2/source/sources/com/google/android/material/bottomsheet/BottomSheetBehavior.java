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
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import o0O000Oo.OooOO0O;
import org.jctools.util.Pow2;
import p028Oooo0oO.o0oOO;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final int f15957OooooOo = o0000O0O.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public MaterialShapeDrawable f15958OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f15959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f15961OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15962OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f15963OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15964OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f15965OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f15966OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final ColorStateList f15967OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f15968OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f15969OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f15970OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f15971OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f15972OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f15973OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f15974OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f15975OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f15976OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f15977OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final boolean f15978OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f15979OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f15980OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f15981OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f15982OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0O0 f15983OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final BottomSheetBehavior<V>.OooO0o f15984OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f15985OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public ValueAnimator f15986OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f15987OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f15988OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f15989Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f15990Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f15991Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f15992Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final float f15993Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f15994Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f15995Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public p056o0000Oo0.OooO0o f15996Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f15997Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f15998Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f15999Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f16000OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f16001OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float f16002OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f16003OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f16004OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16005OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NonNull
    public final ArrayList<OooO0OO> f16006OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public VelocityTracker f16007OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f16008OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f16009OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f16010Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public HashMap f16011Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @VisibleForTesting
    public final SparseIntArray f16012OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final OooO0O0 f16013OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16014o000oOoO;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f16015OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f16017OooO0o0;

        public OooO00o(View view, int i) {
            this.f16015OooO0Oo = view;
            this.f16017OooO0o0 = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BottomSheetBehavior.f15957OooooOo;
            BottomSheetBehavior.this.Oooo0o(this.f16015OooO0Oo, this.f16017OooO0o0, false);
        }
    }

    public class OooO0O0 extends o0000Oo0.OooO0o.OooO0OO {
        public OooO0O0() {
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO(@NonNull View view, int i, int i2) {
            BottomSheetBehavior.this.OooOo(i2);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO00o(@NonNull View view, int i) {
            return view.getLeft();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0O0(@NonNull View view, int i) {
            return o0000O00.OooO00o.OooO0O0(i, BottomSheetBehavior.this.OooOoo0(), OooO0Oo());
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0Oo() {
            int i = BottomSheetBehavior.f15957OooooOo;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f15990Oooo0 ? bottomSheetBehavior.f16000OoooO : bottomSheetBehavior.f15992Oooo00O;
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oo(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f15995Oooo0OO) {
                    bottomSheetBehavior.Oooo0OO(1);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooOO0(@NonNull View view, float f, float f2) {
            int i;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (!bottomSheetBehavior.f15960OooO0O0) {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    if (top > bottomSheetBehavior.f15988OooOooo) {
                        i = 6;
                    }
                }
                i = 3;
            } else if (bottomSheetBehavior.f15990Oooo0 && bottomSheetBehavior.Oooo0o0(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f15962OooO0Oo) {
                    if (!(view.getTop() > (bottomSheetBehavior.OooOoo0() + bottomSheetBehavior.f16000OoooO) / 2)) {
                        if (!bottomSheetBehavior.f15960OooO0O0 && Math.abs(view.getTop() - bottomSheetBehavior.OooOoo0()) >= Math.abs(view.getTop() - bottomSheetBehavior.f15988OooOooo)) {
                            i = 6;
                        } else {
                            i = 3;
                        }
                    }
                }
                i = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.f15960OooO0O0) {
                    int i2 = bottomSheetBehavior.f15988OooOooo;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.f15992Oooo00O)) {
                            i = 3;
                        }
                    } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.f15992Oooo00O)) {
                        i = 4;
                    }
                    i = 6;
                } else if (Math.abs(top2 - bottomSheetBehavior.f15987OooOooO) < Math.abs(top2 - bottomSheetBehavior.f15992Oooo00O)) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else {
                if (!bottomSheetBehavior.f15960OooO0O0) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f15988OooOooo) < Math.abs(top3 - bottomSheetBehavior.f15992Oooo00O)) {
                        i = 6;
                    }
                }
                i = 4;
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.Oooo0o(view, i, true);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final boolean OooOO0O(int i, @NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f15997Oooo0o0;
            if (i2 == 1 || bottomSheetBehavior.f16010Ooooo00) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f16008OoooOoO == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f16005OoooOOO;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f16004OoooOO0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class OooO0OO {
        public void OooO00o(@NonNull View view) {
        }

        public abstract void OooO0O0(@NonNull View view);

        public abstract void OooO0OO(int i, @NonNull View view);
    }

    public class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16019OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f16020OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f16021OooO0OO = new OooO00o();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = OooO0o.this;
                oooO0o.f16020OooO0O0 = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                p056o0000Oo0.OooO0o oooO0o2 = bottomSheetBehavior.f15996Oooo0o;
                if (oooO0o2 != null && oooO0o2.OooO0oo()) {
                    oooO0o.OooO00o(oooO0o.f16019OooO00o);
                } else if (bottomSheetBehavior.f15997Oooo0o0 == 2) {
                    bottomSheetBehavior.Oooo0OO(oooO0o.f16019OooO00o);
                }
            }
        }

        public OooO0o() {
        }

        public final void OooO00o(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f16004OoooOO0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f16019OooO00o = i;
            if (this.f16020OooO0O0) {
                return;
            }
            V v = bottomSheetBehavior.f16004OoooOO0.get();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOO0(v, this.f16021OooO0OO);
            this.f16020OooO0O0 = true;
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
        this.f15959OooO00o = 0;
        this.f15960OooO0O0 = true;
        this.f15968OooOO0O = -1;
        this.f15969OooOO0o = -1;
        this.f15984OooOoOO = new OooO0o();
        this.f15991Oooo000 = 0.5f;
        this.f15993Oooo00o = -1.0f;
        this.f15995Oooo0OO = true;
        this.f15997Oooo0o0 = 4;
        this.f16002OoooO00 = 0.1f;
        this.f16006OoooOOo = new ArrayList<>();
        this.f16012OooooO0 = new SparseIntArray();
        this.f16013OooooOO = new OooO0O0();
    }

    @NonNull
    public static BottomSheetBehavior OooOoO(@NonNull FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.OooO0o)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) layoutParams).f5217OooO00o;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Nullable
    @VisibleForTesting
    public static View OooOoO0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooOOO.OooOOOo(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewOooOoO0 = OooOoO0(viewGroup.getChildAt(i));
                if (viewOooOoO0 != null) {
                    return viewOooOoO0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooOoOO(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f15968OooOO0O, marginLayoutParams.width), OooOoOO(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f15969OooOO0o, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
        this.f16004OoooOO0 = null;
        this.f15996Oooo0o = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooO0o() {
        this.f16004OoooOO0 = null;
        this.f15996Oooo0o = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        p056o0000Oo0.OooO0o oooO0o;
        if (!v.isShown() || !this.f15995Oooo0OO) {
            this.f15998Oooo0oO = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16008OoooOoO = -1;
            VelocityTracker velocityTracker = this.f16007OoooOo0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16007OoooOo0 = null;
            }
        }
        if (this.f16007OoooOo0 == null) {
            this.f16007OoooOo0 = VelocityTracker.obtain();
        }
        this.f16007OoooOo0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f16009OoooOoo = (int) motionEvent.getY();
            if (this.f15997Oooo0o0 != 2) {
                WeakReference<View> weakReference = this.f16005OoooOOO;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.OooOOO(view, x, this.f16009OoooOoo)) {
                    this.f16008OoooOoO = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f16010Ooooo00 = true;
                }
            }
            this.f15998Oooo0oO = this.f16008OoooOoO == -1 && !coordinatorLayout.OooOOO(v, x, this.f16009OoooOoo);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16010Ooooo00 = false;
            this.f16008OoooOoO = -1;
            if (this.f15998Oooo0oO) {
                this.f15998Oooo0oO = false;
                return false;
            }
        }
        if (!this.f15998Oooo0oO && (oooO0o = this.f15996Oooo0o) != null && oooO0o.OooOo0(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f16005OoooOOO;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f15998Oooo0oO || this.f15997Oooo0o0 == 1 || coordinatorLayout.OooOOO(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f15996Oooo0o == null || Math.abs(((float) this.f16009OoooOoo) - motionEvent.getY()) <= ((float) this.f15996Oooo0o.f33648OooO0O0)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooO0o.OooO0O0(coordinatorLayout) && !ViewCompat.OooO0o.OooO0O0(v)) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.f16004OoooOO0 == null) {
            this.f15965OooO0oO = coordinatorLayout.getResources().getDimensionPixelSize(o00000O.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f15970OooOOO || this.f15963OooO0o) ? false : true;
            if (this.f15972OooOOOO || this.f15973OooOOOo || this.f15975OooOOo0 || this.f15976OooOOoo || this.f15979OooOo00 || this.f15978OooOo0 || z) {
                oo0o0Oo.OooO00o(v, new o0O000Oo.OooO0O0(this, z));
            }
            ViewCompat.OooOOo(v, new OooOO0O(v));
            this.f16004OoooOO0 = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.f15958OooO;
            if (materialShapeDrawable != null) {
                ViewCompat.OooO0o.OooOOo0(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f15958OooO;
                float fOooO = this.f15993Oooo00o;
                if (fOooO == -1.0f) {
                    fOooO = ViewCompat.OooOOO.OooO(v);
                }
                materialShapeDrawable2.OooOOO0(fOooO);
            } else {
                ColorStateList colorStateList = this.f15967OooOO0;
                if (colorStateList != null) {
                    ViewCompat.OooOOO.OooOOo0(v, colorStateList);
                }
            }
            Oooo0oo();
            if (ViewCompat.OooO0o.OooO0OO(v) == 0) {
                ViewCompat.OooO0o.OooOOoo(v, 1);
            }
        }
        if (this.f15996Oooo0o == null) {
            this.f15996Oooo0o = new p056o0000Oo0.OooO0o(coordinatorLayout.getContext(), coordinatorLayout, this.f16013OooooOO);
        }
        int top = v.getTop();
        coordinatorLayout.OooOOOo(i, v);
        this.f16003OoooO0O = coordinatorLayout.getWidth();
        this.f16000OoooO = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f16001OoooO0 = height;
        int i3 = this.f16000OoooO;
        int i4 = i3 - height;
        int i5 = this.f15981OooOo0o;
        if (i4 < i5) {
            if (this.f15974OooOOo) {
                this.f16001OoooO0 = i3;
            } else {
                this.f16001OoooO0 = i3 - i5;
            }
        }
        this.f15987OooOooO = Math.max(0, i3 - this.f16001OoooO0);
        this.f15988OooOooo = (int) ((1.0f - this.f15991Oooo000) * this.f16000OoooO);
        OooOo0();
        int i6 = this.f15997Oooo0o0;
        if (i6 == 3) {
            v.offsetTopAndBottom(OooOoo0());
        } else if (i6 == 6) {
            v.offsetTopAndBottom(this.f15988OooOooo);
        } else if (this.f15990Oooo0 && i6 == 5) {
            v.offsetTopAndBottom(this.f16000OoooO);
        } else if (i6 == 4) {
            v.offsetTopAndBottom(this.f15992Oooo00O);
        } else if (i6 == 1 || i6 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        Oooo(this.f15997Oooo0o0, false);
        this.f16005OoooOOO = new WeakReference<>(OooOoO0(v));
        while (true) {
            ArrayList<OooO0OO> arrayList = this.f16006OoooOOo;
            if (i2 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i2).OooO00o(v);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOO0(@NonNull View view) {
        WeakReference<View> weakReference = this.f16005OoooOOO;
        return (weakReference == null || view != weakReference.get() || this.f15997Oooo0o0 == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOO0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f16005OoooOOO;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < OooOoo0()) {
                int iOooOoo0 = top - OooOoo0();
                iArr[1] = iOooOoo0;
                int i5 = -iOooOoo0;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                v.offsetTopAndBottom(i5);
                Oooo0OO(3);
            } else {
                if (!this.f15995Oooo0OO) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                v.offsetTopAndBottom(-i2);
                Oooo0OO(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f15992Oooo00O;
            if (i4 > i6 && !this.f15990Oooo0) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
                v.offsetTopAndBottom(i8);
                Oooo0OO(4);
            } else {
                if (!this.f15995Oooo0OO) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, o000OOo0> weakHashMap4 = ViewCompat.f5341OooO00o;
                v.offsetTopAndBottom(-i2);
                Oooo0OO(1);
            }
        }
        OooOo(v.getTop());
        this.f15999Oooo0oo = i2;
        this.f15989Oooo = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOO0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOOO(@NonNull View view, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f15959OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f15964OooO0o0 = savedState.f16026OooO0oO;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f15960OooO0O0 = savedState.f16027OooO0oo;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f15990Oooo0 = savedState.f16024OooO;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f15994Oooo0O0 = savedState.f16028OooOO0;
            }
        }
        int i2 = savedState.f16025OooO0o;
        if (i2 == 1 || i2 == 2) {
            this.f15997Oooo0o0 = 4;
        } else {
            this.f15997Oooo0o0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable OooOOOo(@NonNull View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
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
        if (v.getTop() == OooOoo0()) {
            Oooo0OO(3);
            return;
        }
        WeakReference<View> weakReference = this.f16005OoooOOO;
        if (weakReference != null && view == weakReference.get() && this.f15989Oooo) {
            if (this.f15999Oooo0oo > 0) {
                if (!this.f15960OooO0O0 && v.getTop() > this.f15988OooOooo) {
                    i3 = 6;
                }
            } else if (this.f15990Oooo0) {
                VelocityTracker velocityTracker = this.f16007OoooOo0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f15961OooO0OO);
                    yVelocity = this.f16007OoooOo0.getYVelocity(this.f16008OoooOoO);
                }
                if (Oooo0o0(v, yVelocity)) {
                    i3 = 5;
                } else if (this.f15999Oooo0oo == 0) {
                    top2 = v.getTop();
                    if (this.f15960OooO0O0) {
                        i2 = this.f15988OooOooo;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f15992Oooo00O)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f15992Oooo00O)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f15987OooOooO) >= Math.abs(top2 - this.f15992Oooo00O)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f15960OooO0O0) {
                        top = v.getTop();
                        if (Math.abs(top - this.f15988OooOooo) < Math.abs(top - this.f15992Oooo00O)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f15999Oooo0oo == 0) {
                top2 = v.getTop();
                if (this.f15960OooO0O0) {
                    i2 = this.f15988OooOooo;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f15992Oooo00O)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f15992Oooo00O)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f15987OooOooO) >= Math.abs(top2 - this.f15992Oooo00O)) {
                    i3 = 4;
                }
            } else {
                if (!this.f15960OooO0O0) {
                    top = v.getTop();
                    if (Math.abs(top - this.f15988OooOooo) < Math.abs(top - this.f15992Oooo00O)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            Oooo0o(v, i3, false);
            this.f15989Oooo = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.f15999Oooo0oo = 0;
        this.f15989Oooo = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f15997Oooo0o0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        p056o0000Oo0.OooO0o oooO0o = this.f15996Oooo0o;
        if (oooO0o != null && (this.f15995Oooo0OO || i == 1)) {
            oooO0o.OooOOO(motionEvent);
        }
        if (actionMasked == 0) {
            this.f16008OoooOoO = -1;
            VelocityTracker velocityTracker = this.f16007OoooOo0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16007OoooOo0 = null;
            }
        }
        if (this.f16007OoooOo0 == null) {
            this.f16007OoooOo0 = VelocityTracker.obtain();
        }
        this.f16007OoooOo0.addMovement(motionEvent);
        if (this.f15996Oooo0o != null && (this.f15995Oooo0OO || this.f15997Oooo0o0 == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.f15998Oooo0oO) {
            float fAbs = Math.abs(this.f16009OoooOoo - motionEvent.getY());
            p056o0000Oo0.OooO0o oooO0o2 = this.f15996Oooo0o;
            if (fAbs > oooO0o2.f33648OooO0O0) {
                oooO0o2.OooO0OO(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.f15998Oooo0oO;
    }

    public final void OooOo(int i) {
        V v = this.f16004OoooOO0.get();
        if (v != null) {
            ArrayList<OooO0OO> arrayList = this.f16006OoooOOo;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f15992Oooo00O;
            if (i <= i2 && i2 != OooOoo0()) {
                OooOoo0();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).OooO0O0(v);
            }
        }
    }

    public final void OooOo0() {
        int iOooOo0O = OooOo0O();
        if (this.f15960OooO0O0) {
            this.f15992Oooo00O = Math.max(this.f16000OoooO - iOooOo0O, this.f15987OooOooO);
        } else {
            this.f15992Oooo00O = this.f16000OoooO - iOooOo0O;
        }
    }

    public final void OooOo00(@NonNull OooO0OO oooO0OO) {
        ArrayList<OooO0OO> arrayList = this.f16006OoooOOo;
        if (arrayList.contains(oooO0OO)) {
            return;
        }
        arrayList.add(oooO0OO);
    }

    public final int OooOo0O() {
        int i;
        if (this.f15963OooO0o) {
            return Math.min(Math.max(this.f15965OooO0oO, this.f16000OoooO - ((this.f16003OoooO0O * 9) / 16)), this.f16001OoooO0) + this.f15980OooOo0O;
        }
        return (this.f15970OooOOO || this.f15972OooOOOO || (i = this.f15971OooOOO0) <= 0) ? this.f15964OooO0o0 + this.f15980OooOo0O : Math.max(this.f15964OooO0o0, i + this.f15966OooO0oo);
    }

    public final void OooOo0o(int i, View view) {
        if (view == null) {
            return;
        }
        ViewCompat.OooOO0o(524288, view);
        ViewCompat.OooO(0, view);
        ViewCompat.OooOO0o(262144, view);
        ViewCompat.OooO(0, view);
        ViewCompat.OooOO0o(ZegoConstants.ErrorMask.RoomServerErrorMask, view);
        ViewCompat.OooO(0, view);
        SparseIntArray sparseIntArray = this.f16012OooooO0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            ViewCompat.OooOO0o(i2, view);
            ViewCompat.OooO(0, view);
            sparseIntArray.delete(i);
        }
    }

    public final int OooOoOO(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), Pow2.MAX_POW2);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int OooOoo(int i) {
        if (i == 3) {
            return OooOoo0();
        }
        if (i == 4) {
            return this.f15992Oooo00O;
        }
        if (i == 5) {
            return this.f16000OoooO;
        }
        if (i == 6) {
            return this.f15988OooOooo;
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid state to get top offset: ", i));
    }

    public final int OooOoo0() {
        if (this.f15960OooO0O0) {
            return this.f15987OooOooO;
        }
        return Math.max(this.f15985OooOoo, this.f15974OooOOo ? 0 : this.f15981OooOo0o);
    }

    public final void OooOooO(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f16014o000oOoO) == null) {
            this.f16014o000oOoO = new WeakReference<>(view);
            Oooo0oO(1, view);
        } else {
            OooOo0o(1, weakReference.get());
            this.f16014o000oOoO = null;
        }
    }

    public final void OooOooo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f15985OooOoo = i;
        Oooo(this.f15997Oooo0o0, true);
    }

    public final void Oooo(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f15997Oooo0o0 == 3 && (this.f15977OooOo || OooOoo0() == 0);
        if (this.f15982OooOoO == z2 || this.f15958OooO == null) {
            return;
        }
        this.f15982OooOoO = z2;
        if (!z || (valueAnimator = this.f15986OooOoo0) == null) {
            ValueAnimator valueAnimator2 = this.f15986OooOoo0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15986OooOoo0.cancel();
            }
            this.f15958OooO.OooOOOO(this.f15982OooOoO ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f15986OooOoo0.reverse();
            return;
        }
        float f = z2 ? 0.0f : 1.0f;
        this.f15986OooOoo0.setFloatValues(1.0f - f, f);
        this.f15986OooOoo0.start();
    }

    public final void Oooo0(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f15963OooO0o) {
                this.f15963OooO0o = true;
                z = true;
            }
        } else if (this.f15963OooO0o || this.f15964OooO0o0 != i) {
            this.f15963OooO0o = false;
            this.f15964OooO0o0 = Math.max(0, i);
            z = true;
        }
        if (z) {
            OoooO0();
        }
    }

    public final void Oooo000(boolean z) {
        if (this.f15960OooO0O0 == z) {
            return;
        }
        this.f15960OooO0O0 = z;
        if (this.f16004OoooOO0 != null) {
            OooOo0();
        }
        Oooo0OO((this.f15960OooO0O0 && this.f15997Oooo0o0 == 6) ? 3 : this.f15997Oooo0o0);
        Oooo(this.f15997Oooo0o0, true);
        Oooo0oo();
    }

    public final void Oooo00O(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f15991Oooo000 = f;
        if (this.f16004OoooOO0 != null) {
            this.f15988OooOooo = (int) ((1.0f - f) * this.f16000OoooO);
        }
    }

    public final void Oooo00o(boolean z) {
        if (this.f15990Oooo0 != z) {
            this.f15990Oooo0 = z;
            if (!z && this.f15997Oooo0o0 == 5) {
                Oooo0O0(4);
            }
            Oooo0oo();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    public final void Oooo0O0(int i) {
        boolean z;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(o0oOO.OooO0O0(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f15990Oooo0 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f15960OooO0O0 && OooOoo(i) <= this.f15987OooOooO) ? 3 : i;
        WeakReference<V> weakReference = this.f16004OoooOO0;
        if (weakReference == null || weakReference.get() == null) {
            Oooo0OO(i);
            return;
        }
        V v = this.f16004OoooOO0.get();
        OooO00o oooO00o = new OooO00o(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            z = ViewCompat.OooOO0O.OooO0O0(v);
        }
        if (z) {
            v.post(oooO00o);
        } else {
            oooO00o.run();
        }
    }

    public final void Oooo0OO(int i) {
        V v;
        if (this.f15997Oooo0o0 == i) {
            return;
        }
        this.f15997Oooo0o0 = i;
        WeakReference<V> weakReference = this.f16004OoooOO0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            OoooO00(true);
        } else if (i == 6 || i == 5 || i == 4) {
            OoooO00(false);
        }
        Oooo(i, true);
        while (true) {
            ArrayList<OooO0OO> arrayList = this.f16006OoooOOo;
            if (i2 >= arrayList.size()) {
                Oooo0oo();
                return;
            } else {
                arrayList.get(i2).OooO0OO(i, v);
                i2++;
            }
        }
    }

    public final void Oooo0o(View view, int i, boolean z) {
        int iOooOoo = OooOoo(i);
        p056o0000Oo0.OooO0o oooO0o = this.f15996Oooo0o;
        if (!(oooO0o != null && (!z ? !oooO0o.OooOo0O(view, view.getLeft(), iOooOoo) : !oooO0o.OooOo00(view.getLeft(), iOooOoo)))) {
            Oooo0OO(i);
            return;
        }
        Oooo0OO(2);
        Oooo(i, true);
        this.f15984OooOoOO.OooO00o(i);
    }

    public final boolean Oooo0o0(@NonNull View view, float f) {
        if (this.f15994Oooo0O0) {
            return true;
        }
        if (view.getTop() < this.f15992Oooo00O) {
            return false;
        }
        return Math.abs(((f * this.f16002OoooO00) + ((float) view.getTop())) - ((float) this.f15992Oooo00O)) / ((float) OooOo0O()) > 0.5f;
    }

    public final void Oooo0oO(int i, View view) {
        int iOooO00o;
        if (view == null) {
            return;
        }
        OooOo0o(i, view);
        if (!this.f15960OooO0O0 && this.f15997Oooo0o0 != 6) {
            String string = view.getResources().getString(o0000O0.bottomsheet_action_expand_halfway);
            o0O000Oo.OooO0OO oooO0OO = new o0O000Oo.OooO0OO(this, 6);
            ArrayList arrayListOooO0o = ViewCompat.OooO0o(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListOooO0o.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = ViewCompat.f5344OooO0Oo;
                        if (i3 >= iArr.length || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListOooO0o.size(); i6++) {
                            z &= ((o0O0O00.OooO00o) arrayListOooO0o.get(i6)).OooO00o() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iOooO00o = i4;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o0O0O00.OooO00o) arrayListOooO0o.get(i2)).f33528OooO00o).getLabel())) {
                    iOooO00o = ((o0O0O00.OooO00o) arrayListOooO0o.get(i2)).OooO00o();
                    break;
                }
                i2++;
            }
            if (iOooO00o != -1) {
                o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(null, iOooO00o, string, oooO0OO, null);
                View.AccessibilityDelegate accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                androidx.core.view.OooO00o oooO00o2 = accessibilityDelegateOooO0Oo == null ? null : accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0123OooO00o ? ((androidx.core.view.OooO00o.C0123OooO00o) accessibilityDelegateOooO0Oo).f5335OooO00o : new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                if (oooO00o2 == null) {
                    oooO00o2 = new androidx.core.view.OooO00o();
                }
                ViewCompat.OooOOOO(view, oooO00o2);
                ViewCompat.OooOO0o(oooO00o.OooO00o(), view);
                ViewCompat.OooO0o(view).add(oooO00o);
                ViewCompat.OooO(0, view);
            }
            this.f16012OooooO0.put(i, iOooO00o);
        }
        if (this.f15990Oooo0 && this.f15997Oooo0o0 != 5) {
            ViewCompat.OooOOO0(view, o0O0O00.OooO00o.f33521OooOOO, null, new o0O000Oo.OooO0OO(this, 5));
        }
        int i7 = this.f15997Oooo0o0;
        if (i7 == 3) {
            ViewCompat.OooOOO0(view, o0O0O00.OooO00o.f33522OooOOO0, null, new o0O000Oo.OooO0OO(this, this.f15960OooO0O0 ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            ViewCompat.OooOOO0(view, o0O0O00.OooO00o.f33520OooOO0o, null, new o0O000Oo.OooO0OO(this, this.f15960OooO0O0 ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            ViewCompat.OooOOO0(view, o0O0O00.OooO00o.f33522OooOOO0, null, new o0O000Oo.OooO0OO(this, 4));
            ViewCompat.OooOOO0(view, o0O0O00.OooO00o.f33520OooOO0o, null, new o0O000Oo.OooO0OO(this, 3));
        }
    }

    public final void Oooo0oo() {
        WeakReference<V> weakReference = this.f16004OoooOO0;
        if (weakReference != null) {
            Oooo0oO(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.f16014o000oOoO;
        if (weakReference2 != null) {
            Oooo0oO(1, weakReference2.get());
        }
    }

    public final void OoooO0() {
        V v;
        if (this.f16004OoooOO0 != null) {
            OooOo0();
            if (this.f15997Oooo0o0 != 4 || (v = this.f16004OoooOO0.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public final void OoooO00(boolean z) {
        WeakReference<V> weakReference = this.f16004OoooOO0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f16011Ooooo0o != null) {
                    return;
                } else {
                    this.f16011Ooooo0o = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f16004OoooOO0.get() && z) {
                    this.f16011Ooooo0o.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f16011Ooooo0o = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f16024OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f16025OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f16026OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f16027OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f16028OooOO0;

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
            this.f16025OooO0o = parcel.readInt();
            this.f16026OooO0oO = parcel.readInt();
            this.f16027OooO0oo = parcel.readInt() == 1;
            this.f16024OooO = parcel.readInt() == 1;
            this.f16028OooOO0 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f16025OooO0o);
            parcel.writeInt(this.f16026OooO0oO);
            parcel.writeInt(this.f16027OooO0oo ? 1 : 0);
            parcel.writeInt(this.f16024OooO ? 1 : 0);
            parcel.writeInt(this.f16028OooOO0 ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, @NonNull BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f16025OooO0o = bottomSheetBehavior.f15997Oooo0o0;
            this.f16026OooO0oO = bottomSheetBehavior.f15964OooO0o0;
            this.f16027OooO0oo = bottomSheetBehavior.f15960OooO0O0;
            this.f16024OooO = bottomSheetBehavior.f15990Oooo0;
            this.f16028OooOO0 = bottomSheetBehavior.f15994Oooo0O0;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f15959OooO00o = 0;
        this.f15960OooO0O0 = true;
        this.f15968OooOO0O = -1;
        this.f15969OooOO0o = -1;
        this.f15984OooOoOO = new OooO0o();
        this.f15991Oooo000 = 0.5f;
        this.f15993Oooo00o = -1.0f;
        this.f15995Oooo0OO = true;
        this.f15997Oooo0o0 = 4;
        this.f16002OoooO00 = 0.1f;
        this.f16006OoooOOo = new ArrayList<>();
        this.f16012OooooO0 = new SparseIntArray();
        this.f16013OooooOO = new OooO0O0();
        this.f15966OooO0oo = context.getResources().getDimensionPixelSize(o00000O.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.BottomSheetBehavior_Layout);
        int i2 = o000OO.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            this.f15967OooOO0 = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(o000OO.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f15983OooOoO0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context, attributeSet, o00000.bottomSheetStyle, f15957OooooOo));
        }
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f15983OooOoO0;
        if (oooO0O0 != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO0O0);
            this.f15958OooO = materialShapeDrawable;
            materialShapeDrawable.OooOO0O(context);
            ColorStateList colorStateList = this.f15967OooOO0;
            if (colorStateList != null) {
                this.f15958OooO.OooOOO(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f15958OooO.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15986OooOoo0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f15986OooOoo0.addUpdateListener(new o0O000Oo.OooO00o(this));
        this.f15993Oooo00o = typedArrayObtainStyledAttributes.getDimension(o000OO.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = o000OO.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f15968OooOO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, -1);
        }
        int i4 = o000OO.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f15969OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1);
        }
        int i5 = o000OO.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i5);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            Oooo0(i);
        } else {
            Oooo0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        Oooo00o(typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f15970OooOOO = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        Oooo000(typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f15994Oooo0O0 = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f15995Oooo0OO = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f15959OooO00o = typedArrayObtainStyledAttributes.getInt(o000OO.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        Oooo00O(typedArrayObtainStyledAttributes.getFloat(o000OO.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = o000OO.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i6);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            OooOooo(typedValuePeekValue2.data);
        } else {
            OooOooo(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        this.f15962OooO0Oo = typedArrayObtainStyledAttributes.getInt(o000OO.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f15972OooOOOO = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f15973OooOOOo = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f15975OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f15974OooOOo = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f15976OooOOoo = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f15979OooOo00 = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f15978OooOo0 = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f15977OooOo = typedArrayObtainStyledAttributes.getBoolean(o000OO.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f15961OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
