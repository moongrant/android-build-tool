package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.Oooo0;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import p021OooOooo.o00O0O;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOOO;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final int f16364OooooOo = Oooo000.Widget_Design_AppBarLayout;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f16365Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f16366Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f16367Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f16368Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public List<OooO0O0> f16369OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f16370OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f16371OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f16372OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f16373OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f16374OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f16375OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @IdRes
    public int f16376OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16377OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ValueAnimator f16378OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final List<OooO> f16379Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int[] f16380Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public Drawable f16381OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Behavior f16382OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f16383o000oOoO;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f16384OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f16385OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ValueAnimator f16386OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public SavedState f16387OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f16388OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public WeakReference<View> f16389OooOOO0;

        public class OooO00o extends androidx.core.view.OooO00o {
            public OooO00o() {
            }

            @Override // androidx.core.view.OooO00o
            public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
                this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
                o0000oo1.OoooOoO(BaseBehavior.this.f16388OooOOO);
                o0000oo1.Oooo000(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static boolean Oooo000(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.OooOo(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.OooO0oo(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f16387OooOO0o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            OooOooo(coordinatorLayout, appBarLayout, i2);
                        } else {
                            OooOoo(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            OooOooo(coordinatorLayout, appBarLayout, 0);
                        } else {
                            OooOoo(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f16392Oooo0oo) {
                OooOoo(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f16391Oooo) {
                OooOoo(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f16394OoooO00);
                int i3 = -childAt.getBottom();
                if (this.f16387OooOO0o.f16395OoooO0O) {
                    iRound = appBarLayout.getTopInset() + ViewCompat.OooO0o.OooO0Oo(childAt) + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f16387OooOO0o.f16393OoooO0) + i3;
                }
                OooOoo(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f16370OoooO0 = 0;
            this.f16387OooOO0o = null;
            OooOo0O(o00O0O.OooO0o0(OooOo00(), -appBarLayout.getTotalScrollRange(), 0));
            Oooo0oO(coordinatorLayout, appBarLayout, OooOo00(), 0, true);
            appBarLayout.OooO0Oo(OooOo00());
            Oooo0o(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooOOO0(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = OooOoo0(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                Oooo0o(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooOOOO(@NonNull View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f16387OooOO0o = (SavedState) parcelable;
            } else {
                this.f16387OooOO0o = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable OooOOOo(@NonNull View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateOooo0OO = Oooo0OO(absSavedState, (AppBarLayout) view);
            return savedStateOooo0OO == null ? absSavedState : savedStateOooo0OO;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOo(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean OooOo0o(View view) {
            View view2;
            WeakReference<View> weakReference = this.f16389OooOOO0;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOoO() {
            return OooOo00() + this.f16384OooO;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOoO0(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void OooOoOO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Oooo0o0(coordinatorLayout, appBarLayout);
            if (appBarLayout.f16375OoooOOo) {
                appBarLayout.OooO0o(appBarLayout.OooO0oO(Oooo00O(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iOooOoO = OooOoO();
            int i4 = 0;
            if (i2 == 0 || iOooOoO < i2 || iOooOoO > i3) {
                this.f16384OooO = 0;
            } else {
                int iOooO0o0 = o00O0O.OooO0o0(i, i2, i3);
                if (iOooOoO != iOooO0o0) {
                    if (!appBarLayout.f16371OoooO00) {
                        top = iOooO0o0;
                        break;
                    }
                    int iAbs = Math.abs(iOooO0o0);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f16398OooO0OO;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = layoutParams.f16396OooO00o;
                                if ((i6 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0;
                                    if ((i6 & 2) != 0) {
                                        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                                        topInset -= ViewCompat.OooO0o.OooO0Oo(childAt);
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                                if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iOooO0o0);
                                    break;
                                }
                            }
                        }
                        top = iOooO0o0;
                        break;
                    }
                    boolean zOooOo0O = OooOo0O(top);
                    int i7 = iOooOoO - iOooO0o0;
                    this.f16384OooO = iOooO0o0 - top;
                    if (zOooOo0O) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i8).getLayoutParams();
                            OooO0OO oooO0OO = layoutParams2.f16397OooO0O0;
                            if (oooO0OO != null && (layoutParams2.f16396OooO00o & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i8);
                                float fOooOo00 = OooOo00();
                                OooO0o oooO0o = (OooO0o) oooO0OO;
                                Rect rect = oooO0o.f16400OooO00o;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float fAbs = oooO0o.f16400OooO00o.top - Math.abs(fOooOo00);
                                if (fAbs <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    float fOooO0Oo = 1.0f - o00O0O.OooO0Oo(Math.abs(fAbs / oooO0o.f16400OooO00o.height()), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
                                    float fHeight = (-fAbs) - ((oooO0o.f16400OooO00o.height() * 0.3f) * (1.0f - (fOooO0Oo * fOooO0Oo)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(oooO0o.f16401OooO0O0);
                                    oooO0o.f16401OooO0O0.offset(0, (int) (-fHeight));
                                    Rect rect2 = oooO0o.f16401OooO0O0;
                                    WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                                    ViewCompat.OooOO0.OooO0OO(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
                                    ViewCompat.OooOO0.OooO0OO(childAt2, null);
                                    childAt2.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                }
                            }
                        }
                    }
                    if (!zOooOo0O && appBarLayout.f16371OoooO00) {
                        coordinatorLayout.OooO0oO(appBarLayout);
                    }
                    appBarLayout.OooO0Oo(OooOo00());
                    Oooo0oO(coordinatorLayout, appBarLayout, iOooO0o0, iOooO0o0 < iOooOoO ? -1 : 1, false);
                    i4 = i7;
                }
            }
            Oooo0o(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final void OooOooo(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(OooOoO() - i);
            float fAbs = Math.abs(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            int iRound = fAbs > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iOooOoO = OooOoO();
            if (iOooOoO == i) {
                ValueAnimator valueAnimator = this.f16386OooOO0O;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f16386OooOO0O.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16386OooOO0O;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16386OooOO0O = valueAnimator3;
                valueAnimator3.setInterpolator(p338o0OO0o0O.OooO0o.f37976OooO0o0);
                this.f16386OooOO0O.addUpdateListener(new com.google.android.material.appbar.OooO0O0(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f16386OooOO0O.setDuration(Math.min(iRound, 600));
            this.f16386OooOO0O.setIntValues(iOooOoO, i);
            this.f16386OooOO0O.start();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0029  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo0, reason: merged with bridge method [inline-methods] */
        public boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0) {
                if (t.f16375OoooOOo) {
                    z = true;
                } else {
                    if ((t.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                        z = true;
                    }
                }
            }
            if (z && (valueAnimator = this.f16386OooOO0O) != null) {
                valueAnimator.cancel();
            }
            this.f16389OooOOO0 = null;
            this.f16385OooOO0 = i2;
            return z;
        }

        @Nullable
        public final View Oooo00O(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof Oooo0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo00o, reason: merged with bridge method [inline-methods] */
        public void OooOO0O(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -t.getTotalScrollRange();
                    i4 = i5;
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = OooOoo0(coordinatorLayout, t, i2, i4, downNestedPreScrollRange);
                }
            }
            if (t.f16375OoooOOo) {
                t.OooO0o(t.OooO0oO(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo0O0, reason: merged with bridge method [inline-methods] */
        public void OooOOo(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.f16385OooOO0 == 0 || i == 1) {
                Oooo0o0(coordinatorLayout, t);
                if (t.f16375OoooOOo) {
                    t.OooO0o(t.OooO0oO(view));
                }
            }
            this.f16389OooOOO0 = new WeakReference<>(view);
        }

        @Nullable
        public final SavedState Oooo0OO(@Nullable Parcelable parcelable, @NonNull T t) {
            int iOooOo00 = OooOo00();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iOooOo00;
                if (childAt.getTop() + iOooOo00 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.AbsSavedState.f8026Oooo0oO;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iOooOo00 == 0;
                    savedState.f16391Oooo = z;
                    savedState.f16392Oooo0oo = !z && (-iOooOo00) >= t.getTotalScrollRange();
                    savedState.f16394OoooO00 = i;
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    savedState.f16395OoooO0O = bottom == t.getTopInset() + ViewCompat.OooO0o.OooO0Oo(childAt);
                    savedState.f16393OoooO0 = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
        public final void Oooo0o(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            View childAt;
            boolean z;
            boolean z2;
            ViewCompat.OooOo00(o0000OO0.OooO00o.f28202OooOO0.OooO00o(), coordinatorLayout);
            boolean z3 = false;
            ViewCompat.OooOOO(coordinatorLayout, 0);
            ViewCompat.OooOo00(o0000OO0.OooO00o.f28203OooOO0O.OooO00o(), coordinatorLayout);
            ViewCompat.OooOOO(coordinatorLayout, 0);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                childAt = null;
                if (i >= childCount) {
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.OooO0o) childAt.getLayoutParams()).f7761OooO00o instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i++;
                }
            }
            View view = childAt;
            if (view == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (((LayoutParams) t.getChildAt(i2).getLayoutParams()).f16396OooO00o != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                if (!(ViewCompat.OooO0oo(coordinatorLayout) != null)) {
                    ViewCompat.OooOo0o(coordinatorLayout, new OooO00o());
                }
                if (OooOoO() != (-t.getTotalScrollRange())) {
                    ViewCompat.OooOo0(coordinatorLayout, o0000OO0.OooO00o.f28202OooOO0, new com.google.android.material.appbar.OooO0o(t, false));
                    z3 = true;
                }
                if (OooOoO() == 0) {
                    z = z3;
                } else if (view.canScrollVertically(-1)) {
                    int i3 = -t.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        ViewCompat.OooOo0(coordinatorLayout, o0000OO0.OooO00o.f28203OooOO0O, new com.google.android.material.appbar.OooO0OO(this, coordinatorLayout, t, view, i3));
                    } else {
                        z = z3;
                    }
                } else {
                    ViewCompat.OooOo0(coordinatorLayout, o0000OO0.OooO00o.f28203OooOO0O, new com.google.android.material.appbar.OooO0o(t, true));
                }
                this.f16388OooOOO = z;
            }
        }

        public final void Oooo0o0(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int iOooOoO = OooOoO() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (Oooo000(layoutParams.f16396OooO00o, 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -iOooOoO;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f16396OooO00o;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int iOooO0Oo = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(t) && ViewCompat.OooO0o.OooO0O0(childAt2)) {
                            topInset -= t.getTopInset();
                        }
                    }
                    if (Oooo000(i3, 2)) {
                        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                        iOooO0Oo += ViewCompat.OooO0o.OooO0Oo(childAt2);
                    } else if (Oooo000(i3, 5)) {
                        WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                        int iOooO0Oo2 = ViewCompat.OooO0o.OooO0Oo(childAt2) + iOooO0Oo;
                        if (iOooOoO < iOooO0Oo2) {
                            topInset = iOooO0Oo2;
                        } else {
                            iOooO0Oo = iOooO0Oo2;
                        }
                    }
                    if (Oooo000(i3, 32)) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        iOooO0Oo -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iOooOoO < (iOooO0Oo + topInset) / 2) {
                        topInset = iOooO0Oo;
                    }
                    OooOooo(coordinatorLayout, t, o00O0O.OooO0o0(topInset + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
        public final void Oooo0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, boolean z) {
            View childAt;
            boolean zOooO0oO;
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = t.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((LayoutParams) childAt.getLayoutParams()).f16396OooO00o;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(childAt);
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - iOooO0Oo) - t.getTopInset() : (-i) < (childAt.getBottom() - iOooO0Oo) - t.getTopInset()) {
                        zOooO0oO = false;
                    } else {
                        zOooO0oO = true;
                    }
                } else {
                    zOooO0oO = false;
                }
            } else {
                zOooO0oO = false;
            }
            if (t.f16375OoooOOo) {
                zOooO0oO = t.OooO0oO(Oooo00O(coordinatorLayout));
            }
            boolean zOooO0o = t.OooO0o(zOooO0oO);
            if (!z) {
                if (!zOooO0o) {
                    return;
                }
                ArrayList arrayList = (ArrayList) coordinatorLayout.OooOOOo(t);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) ((View) arrayList.get(i5)).getLayoutParams()).f7761OooO00o;
                    if (behavior instanceof ScrollingViewBehavior) {
                        if (((ScrollingViewBehavior) behavior).f16447OooO0o == 0) {
                            break;
                        }
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return;
                }
            }
            t.jumpDrawablesToCurrentState();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public boolean f16391Oooo;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public boolean f16392Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public float f16393OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public int f16394OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public boolean f16395OoooO0O;

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

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f16392Oooo0oo = parcel.readByte() != 0;
                this.f16391Oooo = parcel.readByte() != 0;
                this.f16394OoooO00 = parcel.readInt();
                this.f16393OoooO0 = parcel.readFloat();
                this.f16395OoooO0O = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                parcel.writeParcelable(this.f8027Oooo0o, i);
                parcel.writeByte(this.f16392Oooo0oo ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f16391Oooo ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f16394OoooO00);
                parcel.writeFloat(this.f16393OoooO0);
                parcel.writeByte(this.f16395OoooO0O ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void OooOO0O(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            OooOO0O(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OooO {
        void onUpdate();
    }

    public class OooO00o implements oo000o {
        public OooO00o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            Objects.requireNonNull(appBarLayout);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.OooO0o.OooO0O0(appBarLayout) ? windowInsetsCompat : null;
            if (!o000OO0O.OooO0OO.OooO00o(appBarLayout.f16372OoooO0O, windowInsetsCompat2)) {
                appBarLayout.f16372OoooO0O = windowInsetsCompat2;
                appBarLayout.setWillNotDraw(!(appBarLayout.f16381OooooO0 != null && appBarLayout.getTopInset() > 0));
                appBarLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    public interface OooO0O0<T extends AppBarLayout> {
        void OooO00o(T t, int i);
    }

    public static abstract class OooO0OO {
    }

    public static class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f16400OooO00o = new Rect();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f16401OooO0O0 = new Rect();
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0O0(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) view2.getLayoutParams()).f7761OooO00o;
            if (behavior instanceof BaseBehavior) {
                ViewCompat.OooOOOo(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f16384OooO) + this.f16448OooO0o0) - OooOo(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f16375OoooOOo) {
                return false;
            }
            appBarLayout.OooO0o(appBarLayout.OooO0oO(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0o0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.OooOo00(o0000OO0.OooO00o.f28202OooOO0.OooO00o(), coordinatorLayout);
                ViewCompat.OooOOO(coordinatorLayout, 0);
                ViewCompat.OooOo00(o0000OO0.OooO00o.f28203OooOO0O.OooO00o(), coordinatorLayout);
                ViewCompat.OooOOO(coordinatorLayout, 0);
                ViewCompat.OooOo0o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooOOO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayoutOooOo0o = OooOo0o(coordinatorLayout.OooO(view));
            if (appBarLayoutOooOo0o != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f16445OooO0OO;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutOooOo0o.OooO0o0(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int OooOoO(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float OooOoO0(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) appBarLayout.getLayoutParams()).f7761OooO00o;
                int iOooOoO = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).OooOoO() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iOooOoO > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iOooOoO / i) + 1.0f;
                }
            }
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        /* JADX INFO: renamed from: OooOoOO, reason: merged with bridge method [inline-methods] */
        public final AppBarLayout OooOo0o(@NonNull List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p337o0OO0o0.Oooo0.ScrollingViewBehavior_Layout);
            this.f16447OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(p337o0OO0o0.Oooo0.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    public final void OooO00o(@Nullable OooO0O0 oooO0O0) {
        if (this.f16369OoooO == null) {
            this.f16369OoooO = new ArrayList();
        }
        if (oooO0O0 == null || this.f16369OoooO.contains(oooO0O0)) {
            return;
        }
        this.f16369OoooO.add(oooO0O0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void OooO0OO() {
        Behavior behavior = this.f16382OooooOO;
        BaseBehavior.SavedState savedStateOooo0OO = (behavior == null || this.f16367Oooo0oO == -1 || this.f16370OoooO0 != 0) ? null : behavior.Oooo0OO(androidx.customview.view.AbsSavedState.f8026Oooo0oO, this);
        this.f16367Oooo0oO = -1;
        this.f16368Oooo0oo = -1;
        this.f16365Oooo = -1;
        if (savedStateOooo0OO != null) {
            Behavior behavior2 = this.f16382OooooOO;
            if (behavior2.f16387OooOO0o != null) {
                return;
            }
            behavior2.f16387OooOO0o = savedStateOooo0OO;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    public final void OooO0Oo(int i) {
        this.f16366Oooo0o = i;
        if (!willNotDraw()) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        ?? r0 = this.f16369OoooO;
        if (r0 != 0) {
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0 oooO0O0 = (OooO0O0) this.f16369OoooO.get(i2);
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(this, i);
                }
            }
        }
    }

    public final boolean OooO0o(boolean z) {
        if (!(!this.f16373OoooOO0) || this.f16374OoooOOO == z) {
            return false;
        }
        this.f16374OoooOOO = z;
        refreshDrawableState();
        if (!this.f16375OoooOOo || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        float dimension = getResources().getDimension(p337o0OO0o0.OooOO0.design_appbar_elevation);
        float f = z ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : dimension;
        if (!z) {
            dimension = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        ValueAnimator valueAnimator = this.f16378OoooOoo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
        this.f16378OoooOoo = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(OooOOO.app_bar_elevation_anim_duration));
        this.f16378OoooOoo.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
        this.f16378OoooOoo.addUpdateListener(new com.google.android.material.appbar.OooO00o(this, materialShapeDrawable));
        this.f16378OoooOoo.start();
        return true;
    }

    public final void OooO0o0(boolean z, boolean z2, boolean z3) {
        this.f16370OoooO0 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean OooO0oO(@Nullable View view) {
        int i;
        if (this.f16377OoooOoO == null && (i = this.f16376OoooOo0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f16376OoooOo0);
            }
            if (viewFindViewById != null) {
                this.f16377OoooOoO = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f16377OoooOoO;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean OooO0oo() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return !ViewCompat.OooO0o.OooO0O0(childAt);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f16381OooooO0 != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -this.f16366Oooo0o);
            this.f16381OooooO0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16381OooooO0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f16382OooooOO = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int iOooO0Oo;
        int i = this.f16368Oooo0oo;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f16396OooO00o;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(childAt);
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                        iOooO0Oo = measuredHeight - ViewCompat.OooO0o.OooO0Oo(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = iOooO0Oo + i4;
                if (childCount == 0) {
                    WeakHashMap<View, o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.f16368Oooo0oo = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f16365Oooo;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i3 = layoutParams.f16396OooO00o;
            if ((i3 & 1) == 0) {
                break;
            }
            iOooO0Oo += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                iOooO0Oo -= ViewCompat.OooO0o.OooO0Oo(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iOooO0Oo);
        this.f16365Oooo = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f16376OoooOo0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(this);
        if (iOooO0Oo == 0) {
            int childCount = getChildCount();
            iOooO0Oo = childCount >= 1 ? ViewCompat.OooO0o.OooO0Oo(getChildAt(childCount - 1)) : 0;
            if (iOooO0Oo == 0) {
                return getHeight() / 3;
            }
        }
        return (iOooO0Oo * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f16370OoooO0;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f16381OooooO0;
    }

    @Deprecated
    public float getTargetElevation() {
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f16372OoooO0O;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.OooO();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f16367Oooo0oO;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f16396OooO00o;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + iOooO0Oo;
            if (i2 == 0) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                    topInset -= getTopInset();
                }
            }
            iOooO0Oo = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                iOooO0Oo -= ViewCompat.OooO0o.OooO0Oo(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iOooO0Oo);
        this.f16367Oooo0oO = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f16380Ooooo0o == null) {
            this.f16380Ooooo0o = new int[4];
        }
        int[] iArr = this.f16380Ooooo0o;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f16383o000oOoO;
        int i2 = p337o0OO0o0.OooO0o.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f16374OoooOOO) ? p337o0OO0o0.OooO0o.state_lifted : -p337o0OO0o0.OooO0o.state_lifted;
        int i3 = p337o0OO0o0.OooO0o.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f16374OoooOOO) ? p337o0OO0o0.OooO0o.state_collapsed : -p337o0OO0o0.OooO0o.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f16377OoooOoO;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16377OoooOoO = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z3 = true;
        if (ViewCompat.OooO0o.OooO0O0(this) && OooO0oo()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.OooOOOo(getChildAt(childCount), topInset);
            }
        }
        OooO0OO();
        this.f16371OoooO00 = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f16398OooO0OO != null) {
                this.f16371OoooO00 = true;
                break;
            }
        }
        Drawable drawable = this.f16381OooooO0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f16373OoooOO0) {
            return;
        }
        if (!this.f16375OoooOOo) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f16396OooO00o;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f16383o000oOoO != z3) {
            this.f16383o000oOoO = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this) && OooO0oo()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = o00O0O.OooO0o0(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        OooO0OO();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        o0O0O00.OooO0O0(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        OooO0o0(z, ViewCompat.OooOO0O.OooO0OO(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f16375OoooOOo = z;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f16376OoooOo0 = i;
        WeakReference<View> weakReference = this.f16377OoooOoO;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16377OoooOoO = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f16373OoooOO0 = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16381OooooO0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16381OooooO0 = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16381OooooO0.setState(getDrawableState());
                }
                Drawable drawable3 = this.f16381OooooO0;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                o0OOO0o.OooO0OO(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f16381OooooO0.setVisible(getVisibility() == 0, false);
                this.f16381OooooO0.setCallback(this);
            }
            if (this.f16381OooooO0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        OooOO0O.OooO00o(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f16381OooooO0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16381OooooO0;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16364OooooOo;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16367Oooo0oO = -1;
        this.f16368Oooo0oo = -1;
        this.f16365Oooo = -1;
        this.f16370OoooO0 = 0;
        this.f16379Ooooo00 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i3 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context3, attributeSet, OooOO0O.f16474OooO00o, i, i2, new int[0]);
        try {
            if (typedArrayOooO0Oo.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayOooO0Oo.getResourceId(0, 0)));
            }
            typedArrayOooO0Oo.recycle();
            TypedArray typedArrayOooO0Oo2 = o000oOoO.OooO0Oo(context2, attributeSet, p337o0OO0o0.Oooo0.AppBarLayout, i, i2, new int[0]);
            Drawable drawable = typedArrayOooO0Oo2.getDrawable(p337o0OO0o0.Oooo0.AppBarLayout_android_background);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.OooOOOo(ColorStateList.valueOf(colorDrawable.getColor()));
                materialShapeDrawable.OooOOO0(context2);
                ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
            }
            int i4 = p337o0OO0o0.Oooo0.AppBarLayout_expanded;
            if (typedArrayOooO0Oo2.hasValue(i4)) {
                OooO0o0(typedArrayOooO0Oo2.getBoolean(i4, false), false, false);
            }
            int i5 = p337o0OO0o0.Oooo0.AppBarLayout_elevation;
            if (typedArrayOooO0Oo2.hasValue(i5)) {
                OooOO0O.OooO00o(this, typedArrayOooO0Oo2.getDimensionPixelSize(i5, 0));
            }
            if (i3 >= 26) {
                int i6 = p337o0OO0o0.Oooo0.AppBarLayout_android_keyboardNavigationCluster;
                if (typedArrayOooO0Oo2.hasValue(i6)) {
                    setKeyboardNavigationCluster(typedArrayOooO0Oo2.getBoolean(i6, false));
                }
                int i7 = p337o0OO0o0.Oooo0.AppBarLayout_android_touchscreenBlocksFocus;
                if (typedArrayOooO0Oo2.hasValue(i7)) {
                    setTouchscreenBlocksFocus(typedArrayOooO0Oo2.getBoolean(i7, false));
                }
            }
            this.f16375OoooOOo = typedArrayOooO0Oo2.getBoolean(p337o0OO0o0.Oooo0.AppBarLayout_liftOnScroll, false);
            this.f16376OoooOo0 = typedArrayOooO0Oo2.getResourceId(p337o0OO0o0.Oooo0.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayOooO0Oo2.getDrawable(p337o0OO0o0.Oooo0.AppBarLayout_statusBarForeground));
            typedArrayOooO0Oo2.recycle();
            ViewCompat.OooOOO.OooOo0(this, new OooO00o());
        } catch (Throwable th) {
            typedArrayOooO0Oo.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16396OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0OO f16397OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Interpolator f16398OooO0OO;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16396OooO00o = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p337o0OO0o0.Oooo0.AppBarLayout_Layout);
            this.f16396OooO00o = typedArrayObtainStyledAttributes.getInt(p337o0OO0o0.Oooo0.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f16397OooO0O0 = typedArrayObtainStyledAttributes.getInt(p337o0OO0o0.Oooo0.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new OooO0o();
            int i = p337o0OO0o0.Oooo0.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.f16398OooO0OO = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
            this.f16396OooO00o = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16396OooO00o = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16396OooO00o = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16396OooO00o = 1;
        }
    }
}
