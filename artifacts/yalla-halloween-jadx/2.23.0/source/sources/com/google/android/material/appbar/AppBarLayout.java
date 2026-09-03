package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
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
import androidx.core.view.o000000O;
import androidx.core.view.o000O0Oo;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0000O.o0Oo0oo;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o0000;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int f16159OooOoo0 = o0000O0O.Widget_Design_AppBarLayout;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f16160OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16163OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16165OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f16166OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList f16167OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f16168OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16169OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16170OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16171OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @IdRes
    public int f16172OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final ColorStateList f16173OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16174OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public ValueAnimator f16175OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int[] f16176OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList f16177OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ValueAnimator.AnimatorUpdateListener f16178OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final long f16179OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final TimeInterpolator f16180OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f16181OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public Drawable f16182OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Behavior f16183OooOoOO;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f16184OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f16185OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ValueAnimator f16186OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public SavedState f16187OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f16188OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public WeakReference<View> f16189OooOOO0;

        public class OooO00o extends androidx.core.view.OooO00o {
            public OooO00o() {
            }

            @Override // androidx.core.view.OooO00o
            public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0Oo0oo o0oo0oo2) {
                super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
                o0oo0oo2.OooOOOO(BaseBehavior.this.f16188OooOOO);
                o0oo0oo2.OooOO0(ScrollView.class.getName());
            }
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public float f16191OooO;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f16192OooO0o;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public boolean f16193OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public int f16194OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public boolean f16195OooOO0;

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
                this.f16192OooO0o = parcel.readByte() != 0;
                this.f16193OooO0oO = parcel.readByte() != 0;
                this.f16194OooO0oo = parcel.readInt();
                this.f16191OooO = parcel.readFloat();
                this.f16195OooOO0 = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                parcel.writeParcelable(this.f5532OooO0Oo, i);
                parcel.writeByte(this.f16192OooO0o ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f16193OooO0oO ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f16194OooO0oo);
                parcel.writeFloat(this.f16191OooO);
                parcel.writeByte(this.f16195OooOO0 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static void OooOooO(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        @Nullable
        public static View OooOooo(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof androidx.core.view.o0Oo0oo) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005e  */
        public static void Oooo0o0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zOooO0oO;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((LayoutParams) childAt.getLayoutParams()).f16196OooO00o;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(childAt);
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - iOooO0Oo) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - iOooO0Oo) - appBarLayout.getTopInset()) {
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
            if (appBarLayout.f16171OooOOOO) {
                zOooO0oO = appBarLayout.OooO0oO(OooOooo(coordinatorLayout));
            }
            boolean zOooO0o = appBarLayout.OooO0o(zOooO0oO);
            if (!z) {
                if (!zOooO0o) {
                    return;
                }
                ArrayList<View> orDefault = coordinatorLayout.f5191OooO0o0.f33730OooO0O0.getOrDefault(appBarLayout, null);
                ArrayList arrayList = coordinatorLayout.f5192OooO0oO;
                arrayList.clear();
                if (orDefault != null) {
                    arrayList.addAll(orDefault);
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) ((View) arrayList.get(i5)).getLayoutParams()).f5211OooO00o;
                    if (behavior instanceof ScrollingViewBehavior) {
                        if (((ScrollingViewBehavior) behavior).f16249OooO0o == 0) {
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
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooO0o) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.OooOOo0(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* JADX WARN: Type inference failed for: r7v12, types: [com.google.android.material.appbar.OooO] */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            int iRound;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.OooO0oo(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f16187OooOO0o;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            OooOoo(coordinatorLayout, appBarLayout, i2);
                        } else {
                            OooOoo0(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            OooOoo(coordinatorLayout, appBarLayout, 0);
                        } else {
                            OooOoo0(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f16192OooO0o) {
                OooOoo0(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f16193OooO0oO) {
                OooOoo0(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f16194OooO0oo);
                int i3 = -childAt.getBottom();
                if (this.f16187OooOO0o.f16195OooOO0) {
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    iRound = appBarLayout.getTopInset() + ViewCompat.OooO0o.OooO0Oo(childAt) + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f16187OooOO0o.f16191OooO) + i3;
                }
                OooOoo0(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f16160OooO = 0;
            this.f16187OooOO0o = null;
            int iOooO0O0 = o0000O00.OooO00o.OooO0O0(OooOo00(), -appBarLayout.getTotalScrollRange(), 0);
            o000oOoO o000oooo2 = this.f16279OooO00o;
            if (o000oooo2 != null) {
                o000oooo2.OooO0O0(iOooO0O0);
            } else {
                this.f16280OooO0O0 = iOooO0O0;
            }
            Oooo0o0(coordinatorLayout, appBarLayout, OooOo00(), 0, true);
            appBarLayout.OooO0Oo(OooOo00());
            Oooo0OO(coordinatorLayout, appBarLayout);
            final View viewOooOooo = OooOooo(coordinatorLayout);
            if (viewOooOooo != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewOooOooo.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.OooO
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = this.f16258OooO00o;
                            View view3 = viewOooOooo;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.OooOooO(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    viewOooOooo.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.OooOO0
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i4, KeyEvent keyEvent) {
                            this.f16265OooO0Oo.getClass();
                            AppBarLayout.BaseBehavior.OooOooO(keyEvent, viewOooOooo, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooOOO0(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = OooOoOO(coordinatorLayout, appBarLayout, OooOo0() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                Oooo0OO(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooOOOO(@NonNull View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.f16187OooOO0o = null;
            } else {
                SavedState savedState = this.f16187OooOO0o;
                this.f16187OooOO0o = (SavedState) parcelable;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable OooOOOo(@NonNull View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateOooo0 = Oooo0(absSavedState, (AppBarLayout) view);
            return savedStateOooo0 == null ? absSavedState : savedStateOooo0;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOo(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int OooOo0() {
            return OooOo00() + this.f16184OooO;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean OooOo0o(View view) {
            View view2;
            WeakReference<View> weakReference = this.f16189OooOOO0;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void OooOoO(@NonNull View view, @NonNull CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Oooo0O0(coordinatorLayout, appBarLayout);
            if (appBarLayout.f16171OooOOOO) {
                appBarLayout.OooO0o(appBarLayout.OooO0oO(OooOooo(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOoO0(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int OooOoOO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            int top;
            boolean zOooO0O0;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iOooOo0 = OooOo0();
            int i4 = 0;
            if (i2 == 0 || iOooOo0 < i2 || iOooOo0 > i3) {
                this.f16184OooO = 0;
            } else {
                int iOooO0O0 = o0000O00.OooO00o.OooO0O0(i, i2, i3);
                if (iOooOo0 != iOooO0O0) {
                    if (!appBarLayout.f16165OooO0oo) {
                        top = iOooO0O0;
                        break;
                    }
                    int iAbs = Math.abs(iOooO0O0);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f16198OooO0OO;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i6 = layoutParams.f16196OooO00o;
                                    if ((i6 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0;
                                        if ((i6 & 2) != 0) {
                                            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                                            topInset -= ViewCompat.OooO0o.OooO0Oo(childAt);
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                                    if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iOooO0O0);
                                        break;
                                    }
                                }
                            } else {
                                i5++;
                            }
                        }
                        top = iOooO0O0;
                        break;
                    }
                    o000oOoO o000oooo2 = this.f16279OooO00o;
                    if (o000oooo2 != null) {
                        zOooO0O0 = o000oooo2.OooO0O0(top);
                    } else {
                        this.f16280OooO0O0 = top;
                        zOooO0O0 = false;
                    }
                    int i7 = iOooOo0 - iOooO0O0;
                    this.f16184OooO = iOooO0O0 - top;
                    int i8 = 1;
                    if (zOooO0O0) {
                        int i9 = 0;
                        while (i9 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i9).getLayoutParams();
                            OooO0o oooO0o = layoutParams2.f16197OooO0O0;
                            if (oooO0o != null && (layoutParams2.f16196OooO00o & i8) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i9);
                                float fOooOo00 = OooOo00();
                                Rect rect = oooO0o.f16200OooO00o;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect.top - Math.abs(fOooOo00);
                                if (fAbs <= 0.0f) {
                                    float fOooO00o = 1.0f - o0000O00.OooO00o.OooO00o(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fOooO00o * fOooO00o)));
                                    childAt2.setTranslationY(fHeight);
                                    Rect rect2 = oooO0o.f16201OooO0O0;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-fHeight));
                                    WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
                                    ViewCompat.OooOO0.OooO0OO(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, o000O0Oo> weakHashMap4 = ViewCompat.f5334OooO00o;
                                    ViewCompat.OooOO0.OooO0OO(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                            i9++;
                            i8 = 1;
                        }
                    }
                    if (!zOooO0O0 && appBarLayout.f16165OooO0oo) {
                        coordinatorLayout.OooO0oO(appBarLayout);
                    }
                    appBarLayout.OooO0Oo(OooOo00());
                    Oooo0o0(coordinatorLayout, appBarLayout, iOooO0O0, iOooO0O0 < iOooOo0 ? -1 : 1, false);
                    i4 = i7;
                }
            }
            Oooo0OO(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final void OooOoo(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(OooOo0() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iOooOo0 = OooOo0();
            if (iOooOo0 == i) {
                ValueAnimator valueAnimator = this.f16186OooOO0O;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f16186OooOO0O.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16186OooOO0O;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16186OooOO0O = valueAnimator3;
                valueAnimator3.setInterpolator(o0O000.OooO0O0.f41575OooO0o0);
                this.f16186OooOO0O.addUpdateListener(new OooOO0O(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f16186OooOO0O.setDuration(Math.min(iRound, 600));
            this.f16186OooOO0O.setIntValues(iOooOo0, i);
            this.f16186OooOO0O.start();
        }

        @Nullable
        public final SavedState Oooo0(@Nullable Parcelable parcelable, @NonNull T t) {
            int iOooOo00 = OooOo00();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iOooOo00;
                if (childAt.getTop() + iOooOo00 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f5531OooO0o0;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iOooOo00 == 0;
                    savedState.f16193OooO0oO = z;
                    savedState.f16192OooO0o = !z && (-iOooOo00) >= t.getTotalScrollRange();
                    savedState.f16194OooO0oo = i;
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    savedState.f16195OooOO0 = bottom == t.getTopInset() + ViewCompat.OooO0o.OooO0Oo(childAt);
                    savedState.f16191OooO = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo000, reason: merged with bridge method [inline-methods] */
        public void OooOO0O(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = OooOoOO(coordinatorLayout, t, OooOo0() - i2, i5, i6);
                }
            }
            if (t.f16171OooOOOO) {
                t.OooO0o(t.OooO0oO(view));
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0029  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo00O, reason: merged with bridge method [inline-methods] */
        public boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0) {
                if (t.f16171OooOOOO) {
                    z = true;
                } else {
                    if ((t.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                        z = true;
                    }
                }
            }
            if (z && (valueAnimator = this.f16186OooOO0O) != null) {
                valueAnimator.cancel();
            }
            this.f16189OooOOO0 = null;
            this.f16185OooOO0 = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Oooo00o, reason: merged with bridge method [inline-methods] */
        public void OooOOo(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.f16185OooOO0 == 0 || i == 1) {
                Oooo0O0(coordinatorLayout, t);
                if (t.f16171OooOOOO) {
                    t.OooO0o(t.OooO0oO(view));
                }
            }
            this.f16189OooOOO0 = new WeakReference<>(view);
        }

        public final void Oooo0O0(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int iOooOo0 = OooOo0() - paddingTop;
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
                if ((layoutParams.f16196OooO00o & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -iOooOo0;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f16196OooO00o;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int iOooO0Oo = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(t) && ViewCompat.OooO0o.OooO0O0(childAt2)) {
                            topInset -= t.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                        iOooO0Oo += ViewCompat.OooO0o.OooO0Oo(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
                            int iOooO0Oo2 = ViewCompat.OooO0o.OooO0Oo(childAt2) + iOooO0Oo;
                            if (iOooOo0 < iOooO0Oo2) {
                                topInset = iOooO0Oo2;
                            } else {
                                iOooO0Oo = iOooO0Oo2;
                            }
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        iOooO0Oo -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iOooOo0 < (iOooO0Oo + topInset) / 2) {
                        topInset = iOooO0Oo;
                    }
                    OooOoo(coordinatorLayout, t, o0000O00.OooO00o.OooO0O0(topInset + paddingTop, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
        public final void Oooo0OO(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            View view;
            boolean z;
            boolean z2;
            ViewCompat.OooOO0o(o0Oo0oo.OooO00o.f34030OooOO0.OooO00o(), coordinatorLayout);
            boolean z3 = false;
            ViewCompat.OooO(0, coordinatorLayout);
            ViewCompat.OooOO0o(o0Oo0oo.OooO00o.f34031OooOO0O.OooO00o(), coordinatorLayout);
            ViewCompat.OooO(0, coordinatorLayout);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.OooO0o) childAt.getLayoutParams()).f5211OooO00o instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i++;
            }
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
                    if (((LayoutParams) t.getChildAt(i2).getLayoutParams()).f16196OooO00o != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                if (!(ViewCompat.OooO0Oo(coordinatorLayout) != null)) {
                    ViewCompat.OooOOOO(coordinatorLayout, new OooO00o());
                }
                if (OooOo0() != (-t.getTotalScrollRange())) {
                    ViewCompat.OooOOO0(coordinatorLayout, o0Oo0oo.OooO00o.f34030OooOO0, null, new OooOOO(t, false));
                    z3 = true;
                }
                if (OooOo0() == 0) {
                    z = z3;
                } else if (view.canScrollVertically(-1)) {
                    int i3 = -t.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        ViewCompat.OooOOO0(coordinatorLayout, o0Oo0oo.OooO00o.f34031OooOO0O, null, new OooOOO0(this, coordinatorLayout, t, view, i3));
                    } else {
                        z = z3;
                    }
                } else {
                    ViewCompat.OooOOO0(coordinatorLayout, o0Oo0oo.OooO00o.f34031OooOO0O, null, new OooOOO(t, true));
                }
                this.f16188OooOOO = z;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OooO {
        void onUpdate();
    }

    public class OooO00o implements o000000O {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.OooO0o.OooO0O0(appBarLayout) ? windowInsetsCompat : null;
            if (!o000OO.OooO0OO.OooO00o(appBarLayout.f16166OooOO0, windowInsetsCompat2)) {
                appBarLayout.f16166OooOO0 = windowInsetsCompat2;
                appBarLayout.setWillNotDraw(!(appBarLayout.f16182OooOoO0 != null && appBarLayout.getTopInset() > 0));
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
        public final Rect f16200OooO00o = new Rect();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f16201OooO0O0 = new Rect();
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0O0(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean OooO0Oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            int iOooO0O0;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) view2.getLayoutParams()).f5211OooO00o;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f16184OooO + this.f16250OooO0o0;
                if (this.f16249OooO0o == 0) {
                    iOooO0O0 = 0;
                } else {
                    float fOooOo = OooOo(view2);
                    int i = this.f16249OooO0o;
                    iOooO0O0 = o0000O00.OooO00o.OooO0O0((int) (fOooOo * i), 0, i);
                }
                int i2 = bottom - iOooO0O0;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f16171OooOOOO) {
                    appBarLayout.OooO0o(appBarLayout.OooO0oO(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void OooO0o0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.OooOO0o(o0Oo0oo.OooO00o.f34030OooOO0.OooO00o(), coordinatorLayout);
                ViewCompat.OooO(0, coordinatorLayout);
                ViewCompat.OooOO0o(o0Oo0oo.OooO00o.f34031OooOO0O.OooO00o(), coordinatorLayout);
                ViewCompat.OooO(0, coordinatorLayout);
                ViewCompat.OooOOOO(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooOOO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListOooO = coordinatorLayout.OooO(view);
            int size = arrayListOooO.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListOooO.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f16247OooO0OO;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.OooO0o0(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float OooOo(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.OooO0o) appBarLayout.getLayoutParams()).f5211OooO00o;
                int iOooOo0 = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).OooOo0() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iOooOo0 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iOooOo0 / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        public final AppBarLayout OooOo0o(@NonNull ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int OooOoO0(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ScrollingViewBehavior_Layout);
            this.f16249OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static LayoutParams OooO0O0(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void OooO(float f, float f2) {
        ValueAnimator valueAnimator = this.f16175OooOOoo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f16175OooOOoo = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f16179OooOo0O);
        this.f16175OooOOoo.setInterpolator(this.f16180OooOo0o);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f16178OooOo00;
        if (animatorUpdateListener != null) {
            this.f16175OooOOoo.addUpdateListener(animatorUpdateListener);
        }
        this.f16175OooOOoo.start();
    }

    public final void OooO00o(@Nullable OooO0O0 oooO0O0) {
        if (this.f16167OooOO0O == null) {
            this.f16167OooOO0O = new ArrayList();
        }
        if (oooO0O0 == null || this.f16167OooOO0O.contains(oooO0O0)) {
            return;
        }
        this.f16167OooOO0O.add(oooO0O0);
    }

    public final void OooO0OO() {
        Behavior behavior = this.f16183OooOoOO;
        BaseBehavior.SavedState savedStateOooo0 = (behavior == null || this.f16163OooO0o0 == -1 || this.f16160OooO != 0) ? null : behavior.Oooo0(AbsSavedState.f5531OooO0o0, this);
        this.f16163OooO0o0 = -1;
        this.f16162OooO0o = -1;
        this.f16164OooO0oO = -1;
        if (savedStateOooo0 != null) {
            Behavior behavior2 = this.f16183OooOoOO;
            if (behavior2.f16187OooOO0o != null) {
                return;
            }
            behavior2.f16187OooOO0o = savedStateOooo0;
        }
    }

    public final void OooO0Oo(int i) {
        this.f16161OooO0Oo = i;
        if (!willNotDraw()) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        ArrayList arrayList = this.f16167OooOO0O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0 oooO0O0 = (OooO0O0) this.f16167OooOO0O.get(i2);
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(this, i);
                }
            }
        }
    }

    public final boolean OooO0o(boolean z) {
        if (!(!this.f16168OooOO0o) || this.f16169OooOOO == z) {
            return false;
        }
        this.f16169OooOOO = z;
        refreshDrawableState();
        if (!this.f16171OooOOOO || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        if (this.f16173OooOOo != null) {
            OooO(z ? 0.0f : 255.0f, z ? 255.0f : 0.0f);
            return true;
        }
        float f = this.f16181OooOoO;
        OooO(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final void OooO0o0(boolean z, boolean z2, boolean z3) {
        this.f16160OooO = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean OooO0oO(@Nullable View view) {
        int i;
        if (this.f16174OooOOo0 == null && (i = this.f16172OooOOOo) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f16172OooOOOo);
            }
            if (viewFindViewById != null) {
                this.f16174OooOOo0 = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f16174OooOOo0;
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
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        return !ViewCompat.OooO0o.OooO0O0(childAt);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f16182OooOoO0 != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f16161OooO0Oo);
            this.f16182OooOoO0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16182OooOoO0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0O0(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f16183OooOoOO = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int iOooO0Oo;
        int i = this.f16162OooO0o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f16196OooO00o;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                        iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(childAt);
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                            iOooO0Oo = measuredHeight - ViewCompat.OooO0o.OooO0Oo(childAt);
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
                            if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = iOooO0Oo + i4;
                    if (childCount == 0) {
                        WeakHashMap<View, o000O0Oo> weakHashMap4 = ViewCompat.f5334OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f16162OooO0o = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f16164OooO0oO;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i3 = layoutParams.f16196OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                iOooO0Oo += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    iOooO0Oo -= ViewCompat.OooO0o.OooO0Oo(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iOooO0Oo);
        this.f16164OooO0oO = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f16172OooOOOo;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        return this.f16160OooO;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f16182OooOoO0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f16166OooOO0;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.OooO0o();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f16163OooO0o0;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f16196OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + iOooO0Oo;
                if (i2 == 0) {
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                        topInset -= getTopInset();
                    }
                }
                iOooO0Oo = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                    iOooO0Oo -= ViewCompat.OooO0o.OooO0Oo(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iOooO0Oo);
        this.f16163OooO0o0 = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O00o00.OooOOO.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f16176OooOo == null) {
            this.f16176OooOo = new int[4];
        }
        int[] iArr = this.f16176OooOo;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f16170OooOOO0;
        int i2 = o00000.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f16169OooOOO) ? o00000.state_lifted : -o00000.state_lifted;
        int i3 = o00000.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f16169OooOOO) ? o00000.state_collapsed : -o00000.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f16174OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16174OooOOo0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        boolean z3 = true;
        if (ViewCompat.OooO0o.OooO0O0(this) && OooO0oo()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        OooO0OO();
        this.f16165OooO0oo = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).f16198OooO0OO != null) {
                this.f16165OooO0oo = true;
                break;
            }
        }
        Drawable drawable = this.f16182OooOoO0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f16168OooOO0o) {
            return;
        }
        if (!this.f16171OooOOOO) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f16196OooO00o;
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
        if (this.f16170OooOOO0 != z3) {
            this.f16170OooOOO0 = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this) && OooO0oo()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = o0000O00.OooO00o.OooO0O0(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
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
        o0O00o00.OooOOO.OooO0O0(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        OooO0o0(z, ViewCompat.OooOO0O.OooO0OO(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f16171OooOOOO = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f16172OooOOOo = -1;
        if (view != null) {
            this.f16174OooOOo0 = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f16174OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16174OooOOo0 = null;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f16172OooOOOo = i;
        WeakReference<View> weakReference = this.f16174OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16174OooOOo0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f16168OooOO0o = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16182OooOoO0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16182OooOoO0 = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16182OooOoO0.setState(getDrawableState());
                }
                Drawable drawable3 = this.f16182OooOoO0;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                o00Ooo.OooO0OO.OooO0O0(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f16182OooOoO0.setVisible(getVisibility() == 0, false);
                this.f16182OooOoO0.setCallback(this);
            }
            if (this.f16182OooOoO0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(o00Oo0.OooO00o(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        o0OoOo0.OooO00o(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f16182OooOoO0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16182OooOoO0;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0O0(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16159OooOoo0;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16163OooO0o0 = -1;
        this.f16162OooO0o = -1;
        this.f16164OooO0oO = -1;
        this.f16160OooO = 0;
        this.f16177OooOo0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i3 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context3, attributeSet, o0OoOo0.f16285OooO00o, i, i2, new int[0]);
        try {
            if (typedArrayOooO0Oo.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayOooO0Oo.getResourceId(0, 0)));
            }
            typedArrayOooO0Oo.recycle();
            TypedArray typedArrayOooO0Oo2 = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.AppBarLayout, i, i2, new int[0]);
            Drawable drawable = typedArrayOooO0Oo2.getDrawable(o000OO.AppBarLayout_android_background);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, drawable);
            ColorStateList colorStateListOooO00o = c1.OooO00o(context2, typedArrayOooO0Oo2, o000OO.AppBarLayout_liftOnScrollColor);
            this.f16173OooOOo = colorStateListOooO00o;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                final MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.OooOOO(ColorStateList.valueOf(colorDrawable.getColor()));
                if (colorStateListOooO00o != null) {
                    materialShapeDrawable.setAlpha(this.f16169OooOOO ? 255 : 0);
                    materialShapeDrawable.OooOOO(colorStateListOooO00o);
                    this.f16178OooOo00 = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.OooO0O0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i4 = AppBarLayout.f16159OooOoo0;
                            AppBarLayout appBarLayout = this.f16261OooO0Oo;
                            appBarLayout.getClass();
                            int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                            materialShapeDrawable2.setAlpha(iFloatValue);
                            for (AppBarLayout.OooO oooO : appBarLayout.f16177OooOo0) {
                                ColorStateList colorStateList = materialShapeDrawable2.f17582OooO0Oo.f17607OooO0OO;
                                if (colorStateList != null) {
                                    colorStateList.withAlpha(iFloatValue).getDefaultColor();
                                    oooO.onUpdate();
                                }
                            }
                        }
                    };
                } else {
                    materialShapeDrawable.OooOO0O(context2);
                    this.f16178OooOo00 = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.OooO0OO
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i4 = AppBarLayout.f16159OooOoo0;
                            AppBarLayout appBarLayout = this.f16263OooO0Oo;
                            appBarLayout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            materialShapeDrawable.OooOOO0(fFloatValue);
                            Drawable drawable2 = appBarLayout.f16182OooOoO0;
                            if (drawable2 instanceof MaterialShapeDrawable) {
                                ((MaterialShapeDrawable) drawable2).OooOOO0(fFloatValue);
                            }
                            Iterator it = appBarLayout.f16177OooOo0.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.OooO) it.next()).onUpdate();
                            }
                        }
                    };
                }
                ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
            }
            this.f16179OooOo0O = o0O00OO.OooO00o.OooO0OO(o00000.motionDurationMedium2, context2, getResources().getInteger(o0000.app_bar_elevation_anim_duration));
            this.f16180OooOo0o = o0O00OO.OooO00o.OooO0Oo(context2, o00000.motionEasingStandardInterpolator, o0O000.OooO0O0.f41571OooO00o);
            int i4 = o000OO.AppBarLayout_expanded;
            if (typedArrayOooO0Oo2.hasValue(i4)) {
                OooO0o0(typedArrayOooO0Oo2.getBoolean(i4, false), false, false);
            }
            int i5 = o000OO.AppBarLayout_elevation;
            if (typedArrayOooO0Oo2.hasValue(i5)) {
                o0OoOo0.OooO00o(this, typedArrayOooO0Oo2.getDimensionPixelSize(i5, 0));
            }
            if (i3 >= 26) {
                int i6 = o000OO.AppBarLayout_android_keyboardNavigationCluster;
                if (typedArrayOooO0Oo2.hasValue(i6)) {
                    setKeyboardNavigationCluster(typedArrayOooO0Oo2.getBoolean(i6, false));
                }
                int i7 = o000OO.AppBarLayout_android_touchscreenBlocksFocus;
                if (typedArrayOooO0Oo2.hasValue(i7)) {
                    setTouchscreenBlocksFocus(typedArrayOooO0Oo2.getBoolean(i7, false));
                }
            }
            this.f16181OooOoO = getResources().getDimension(o00000O.design_appbar_elevation);
            this.f16171OooOOOO = typedArrayOooO0Oo2.getBoolean(o000OO.AppBarLayout_liftOnScroll, false);
            this.f16172OooOOOo = typedArrayOooO0Oo2.getResourceId(o000OO.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayOooO0Oo2.getDrawable(o000OO.AppBarLayout_statusBarForeground));
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
        public int f16196OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0o f16197OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Interpolator f16198OooO0OO;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16196OooO00o = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.AppBarLayout_Layout);
            this.f16196OooO00o = typedArrayObtainStyledAttributes.getInt(o000OO.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f16197OooO0O0 = typedArrayObtainStyledAttributes.getInt(o000OO.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new OooO0o();
            int i = o000OO.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.f16198OooO0OO = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
            this.f16196OooO00o = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16196OooO00o = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16196OooO00o = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16196OooO00o = 1;
        }
    }
}
