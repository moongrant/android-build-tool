package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class ViewCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static WeakHashMap<View, o000O0Oo> f5334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Field f5335OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f5336OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f5337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f5338OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0000O00 f5339OooO0o0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    @RequiresApi(17)
    public static class OooO {
        @DoNotInline
        public static void OooO(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @DoNotInline
        public static int OooO00o() {
            return View.generateViewId();
        }

        @DoNotInline
        public static Display OooO0O0(@NonNull View view) {
            return view.getDisplay();
        }

        @DoNotInline
        public static int OooO0OO(View view) {
            return view.getLabelFor();
        }

        @DoNotInline
        public static int OooO0Oo(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        public static int OooO0o(View view) {
            return view.getPaddingStart();
        }

        @DoNotInline
        public static int OooO0o0(View view) {
            return view.getPaddingEnd();
        }

        @DoNotInline
        public static boolean OooO0oO(View view) {
            return view.isPaddingRelative();
        }

        @DoNotInline
        public static void OooO0oo(View view, int i) {
            view.setLabelFor(i);
        }

        @DoNotInline
        public static void OooOO0(View view, int i) {
            view.setLayoutDirection(i);
        }

        @DoNotInline
        public static void OooOO0O(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f5340OooO0Oo = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @RequiresApi(19)
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f5340OooO0Oo;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        ViewCompat.OooO(z ? 16 : 32, key);
                        weakHashMap.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @RequiresApi(19)
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5341OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<T> f5342OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5343OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f5344OooO0Oo;

        public OooO0O0(int i, Class<T> cls, int i2, int i3) {
            this.f5341OooO00o = i;
            this.f5342OooO0O0 = cls;
            this.f5344OooO0Oo = i2;
            this.f5343OooO0OO = i3;
        }

        public static boolean OooO00o(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T OooO0O0(View view);

        public abstract void OooO0OO(View view, T t);

        public final T OooO0Oo(View view) {
            if (Build.VERSION.SDK_INT >= this.f5343OooO0OO) {
                return OooO0O0(view);
            }
            T t = (T) view.getTag(this.f5341OooO00o);
            if (this.f5342OooO0O0.isInstance(t)) {
                return t;
            }
            return null;
        }

        public abstract boolean OooO0o(T t, T t2);

        public final void OooO0o0(View view, T t) {
            androidx.core.view.OooO00o oooO00o;
            if (Build.VERSION.SDK_INT >= this.f5343OooO0OO) {
                OooO0OO(view, t);
                return;
            }
            if (OooO0o(OooO0Oo(view), t)) {
                View.AccessibilityDelegate accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                if (accessibilityDelegateOooO0Oo == null) {
                    oooO00o = null;
                } else {
                    oooO00o = accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o ? ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o : new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                }
                if (oooO00o == null) {
                    oooO00o = new androidx.core.view.OooO00o();
                }
                ViewCompat.OooOOOO(view, oooO00o);
                view.setTag(this.f5341OooO00o, t);
                ViewCompat.OooO(this.f5344OooO0Oo, view);
            }
        }
    }

    @RequiresApi(15)
    public static class OooO0OO {
        @DoNotInline
        public static boolean OooO00o(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    @RequiresApi(16)
    public static class OooO0o {
        @DoNotInline
        public static boolean OooO(View view) {
            return view.hasTransientState();
        }

        @DoNotInline
        public static AccessibilityNodeProvider OooO00o(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @DoNotInline
        public static boolean OooO0O0(View view) {
            return view.getFitsSystemWindows();
        }

        @DoNotInline
        public static int OooO0OO(View view) {
            return view.getImportantForAccessibility();
        }

        @DoNotInline
        public static int OooO0Oo(View view) {
            return view.getMinimumHeight();
        }

        @DoNotInline
        public static ViewParent OooO0o(View view) {
            return view.getParentForAccessibility();
        }

        @DoNotInline
        public static int OooO0o0(View view) {
            return view.getMinimumWidth();
        }

        @DoNotInline
        public static int OooO0oO(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @DoNotInline
        public static boolean OooO0oo(View view) {
            return view.hasOverlappingRendering();
        }

        @DoNotInline
        public static boolean OooOO0(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @DoNotInline
        public static void OooOO0O(View view) {
            view.postInvalidateOnAnimation();
        }

        @DoNotInline
        public static void OooOO0o(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @DoNotInline
        public static void OooOOO(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @DoNotInline
        public static void OooOOO0(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @DoNotInline
        public static void OooOOOO(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @DoNotInline
        public static void OooOOOo(View view) {
            view.requestFitSystemWindows();
        }

        @DoNotInline
        public static void OooOOo(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @DoNotInline
        public static void OooOOo0(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @DoNotInline
        public static void OooOOoo(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    @RequiresApi(18)
    public static class OooOO0 {
        @DoNotInline
        public static Rect OooO00o(@NonNull View view) {
            return view.getClipBounds();
        }

        @DoNotInline
        public static boolean OooO0O0(@NonNull View view) {
            return view.isInLayout();
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @RequiresApi(19)
    public static class OooOO0O {
        @DoNotInline
        public static int OooO00o(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @DoNotInline
        public static boolean OooO0O0(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        @DoNotInline
        public static boolean OooO0OO(@NonNull View view) {
            return view.isLaidOut();
        }

        @DoNotInline
        public static boolean OooO0Oo(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        @DoNotInline
        public static void OooO0o(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @DoNotInline
        public static void OooO0o0(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @DoNotInline
        public static void OooO0oO(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @RequiresApi(21)
    public static class OooOOO {

        public class OooO00o implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public WindowInsetsCompat f5345OooO00o = null;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ View f5346OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ o000000O f5347OooO0OO;

            public OooO00o(View view, o000000O o000000o2) {
                this.f5346OooO0O0 = view;
                this.f5347OooO0OO = o000000o2;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                o000000O o000000o2 = this.f5347OooO0OO;
                if (i < 30) {
                    OooOOO.OooO00o(windowInsets, this.f5346OooO0O0);
                    if (windowInsetsCompatOooOO0.equals(this.f5345OooO00o)) {
                        return o000000o2.onApplyWindowInsets(view, windowInsetsCompatOooOO0).OooO();
                    }
                }
                this.f5345OooO00o = windowInsetsCompatOooOO0;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = o000000o2.onApplyWindowInsets(view, windowInsetsCompatOooOO0);
                if (i >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.OooO();
                }
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                OooOOO0.OooO0OO(view);
                return windowInsetsCompatOnApplyWindowInsets.OooO();
            }
        }

        @DoNotInline
        public static float OooO(View view) {
            return view.getElevation();
        }

        @DoNotInline
        public static void OooO00o(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(o00000O0.OooO0OO.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat OooO0O0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsetsOooO = windowInsetsCompat.OooO();
            if (windowInsetsOooO != null) {
                return WindowInsetsCompat.OooOO0(view, view.computeSystemWindowInsets(windowInsetsOooO, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        public static boolean OooO0OO(@NonNull View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @DoNotInline
        public static boolean OooO0Oo(@NonNull View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @DoNotInline
        public static boolean OooO0o(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @DoNotInline
        public static boolean OooO0o0(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @DoNotInline
        public static ColorStateList OooO0oO(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode OooO0oo(View view) {
            return view.getBackgroundTintMode();
        }

        @Nullable
        @DoNotInline
        public static WindowInsetsCompat OooOO0(@NonNull View view) {
            WindowInsetsCompat.OooO oooO0OO;
            if (WindowInsetsCompat.OooO00o.f5388OooO0Oo && view.isAttachedToWindow()) {
                try {
                    Object obj = WindowInsetsCompat.OooO00o.f5385OooO00o.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) WindowInsetsCompat.OooO00o.f5386OooO0O0.get(obj);
                        Rect rect2 = (Rect) WindowInsetsCompat.OooO00o.f5387OooO0OO.get(obj);
                        if (rect != null && rect2 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                oooO0OO = new WindowInsetsCompat.OooO0o();
                            } else {
                                oooO0OO = i >= 29 ? new WindowInsetsCompat.OooO0OO() : new WindowInsetsCompat.OooO0O0();
                            }
                            oooO0OO.OooO0o0(p052o00000oO.OooOO0O.OooO0O0(rect.left, rect.top, rect.right, rect.bottom));
                            oooO0OO.OooO0oO(p052o00000oO.OooOO0O.OooO0O0(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            WindowInsetsCompat windowInsetsCompatOooO0O0 = oooO0OO.OooO0O0();
                            windowInsetsCompatOooO0O0.f5382OooO00o.OooOOo(windowInsetsCompatOooO0O0);
                            windowInsetsCompatOooO0O0.f5382OooO00o.OooO0Oo(view.getRootView());
                            return windowInsetsCompatOooO0O0;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }

        @DoNotInline
        public static String OooOO0O(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        public static float OooOO0o(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        public static boolean OooOOO(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        public static float OooOOO0(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        public static boolean OooOOOO(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        public static boolean OooOOOo(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        public static void OooOOo(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        public static void OooOOo0(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        public static void OooOOoo(View view, float f) {
            view.setElevation(f);
        }

        @DoNotInline
        public static void OooOo(@NonNull View view, float f) {
            view.setZ(f);
        }

        @DoNotInline
        public static void OooOo0(@NonNull View view, @Nullable o000000O o000000o2) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(o00000O0.OooO0OO.tag_on_apply_window_listener, o000000o2);
            }
            if (o000000o2 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(o00000O0.OooO0OO.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new OooO00o(view, o000000o2));
            }
        }

        @DoNotInline
        public static void OooOo00(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @DoNotInline
        public static void OooOo0O(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        public static void OooOo0o(View view, float f) {
            view.setTranslationZ(f);
        }

        @DoNotInline
        public static void OooOoO(View view) {
            view.stopNestedScroll();
        }

        @DoNotInline
        public static boolean OooOoO0(View view, int i) {
            return view.startNestedScroll(i);
        }
    }

    @RequiresApi(20)
    public static class OooOOO0 {
        @DoNotInline
        public static WindowInsets OooO00o(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static WindowInsets OooO0O0(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static void OooO0OO(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi(23)
    public static class OooOOOO {
        @Nullable
        public static WindowInsetsCompat OooO00o(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(null, rootWindowInsets);
            WindowInsetsCompat.OooOo00 oooOo00 = windowInsetsCompatOooOO0.f5382OooO00o;
            oooOo00.OooOOo(windowInsetsCompatOooOO0);
            oooOo00.OooO0Oo(view.getRootView());
            return windowInsetsCompatOooOO0;
        }

        @DoNotInline
        public static int OooO0O0(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, int i) {
            view.setScrollIndicators(i);
        }

        @DoNotInline
        public static void OooO0Oo(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @RequiresApi(26)
    public static class OooOo {
        @DoNotInline
        public static boolean OooO(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        public static void OooO00o(@NonNull View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @DoNotInline
        public static int OooO0O0(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        public static int OooO0OO(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        public static boolean OooO0Oo(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        public static boolean OooO0o(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        public static boolean OooO0o0(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        public static boolean OooO0oO(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        public static View OooO0oo(@NonNull View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @DoNotInline
        public static void OooOO0(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        public static void OooOO0O(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @DoNotInline
        public static void OooOO0o(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @DoNotInline
        public static void OooOOO(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @DoNotInline
        public static void OooOOO0(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @DoNotInline
        public static void OooOOOO(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi(24)
    public static class OooOo00 {
        @DoNotInline
        public static void OooO00o(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        public static void OooO0O0(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        public static void OooO0OO(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        public static void OooO0Oo(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        public static void OooO0o(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        @DoNotInline
        public static boolean OooO0o0(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }
    }

    @RequiresApi(29)
    public static class Oooo0 {
        @DoNotInline
        public static View.AccessibilityDelegate OooO00o(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        public static List<Rect> OooO0O0(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @DoNotInline
        public static void OooO0Oo(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi(28)
    public static class Oooo000 {
        @DoNotInline
        public static void OooO(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        @DoNotInline
        public static void OooO00o(@NonNull View view, @NonNull final o00Oo0 o00oo1) {
            int i = o00000O0.OooO0OO.tag_unhandled_key_listeners;
            p188o00o0O.Oooo000 oooo000 = (p188o00o0O.Oooo000) view.getTag(i);
            if (oooo000 == null) {
                oooo000 = new p188o00o0O.Oooo000();
                view.setTag(i, oooo000);
            }
            Objects.requireNonNull(o00oo1);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.o0000O
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return o00oo1.OooO00o();
                }
            };
            oooo000.put(o00oo1, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static CharSequence OooO0O0(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        public static boolean OooO0OO(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        public static boolean OooO0Oo(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        public static <T> T OooO0o(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @DoNotInline
        public static void OooO0o0(@NonNull View view, @NonNull o00Oo0 o00oo1) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p188o00o0O.Oooo000 oooo000 = (p188o00o0O.Oooo000) view.getTag(o00000O0.OooO0OO.tag_unhandled_key_listeners);
            if (oooo000 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) oooo000.getOrDefault(o00oo1, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static void OooO0oO(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        public static void OooO0oo(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    @RequiresApi(30)
    public static class o000oOoO {
        @DoNotInline
        public static CharSequence OooO00o(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static o0oOOo OooO0O0(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new o0oOOo(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        public static void OooO0OO(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi(31)
    public static final class o00O0O implements OnReceiveContentListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o00000 f5348OooO00o;

        public o00O0O(@NonNull o00000 o00000Var) {
            this.f5348OooO00o = o00000Var;
        }

        @Nullable
        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.OooO0o(contentInfo));
            ContentInfoCompat contentInfoCompatOooO00o = this.f5348OooO00o.OooO00o(view, contentInfoCompat);
            if (contentInfoCompatOooO00o == null) {
                return null;
            }
            if (contentInfoCompatOooO00o == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo contentInfoOooO00o = contentInfoCompatOooO00o.f5315OooO00o.OooO00o();
            Objects.requireNonNull(contentInfoOooO00o);
            return androidx.core.view.OooO0OO.OooO00o(contentInfoOooO00o);
        }
    }

    public interface o00Oo0 {
        boolean OooO00o();
    }

    public static class o00Ooo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f5349OooO0Oo = new ArrayList<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public WeakHashMap<View, Boolean> f5350OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f5351OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public WeakReference<KeyEvent> f5352OooO0OO = null;

        public static boolean OooO0O0(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(o00000O0.OooO0OO.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o00Oo0) arrayList.get(size)).OooO00o()) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final View OooO00o(View view, KeyEvent keyEvent) {
            View viewOooO00o;
            WeakHashMap<View, Boolean> weakHashMap = this.f5350OooO00o;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        viewOooO00o = OooO00o(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (viewOooO00o == null);
                return viewOooO00o;
            }
            if (OooO0O0(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @RequiresApi(31)
    public static final class o0OoOo0 {
        @Nullable
        @DoNotInline
        public static String[] OooO00o(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        public static ContentInfoCompat OooO0O0(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoOooO00o = contentInfoCompat.f5315OooO00o.OooO00o();
            Objects.requireNonNull(contentInfoOooO00o);
            ContentInfo contentInfoOooO00o2 = androidx.core.view.OooO0OO.OooO00o(contentInfoOooO00o);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoOooO00o2);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoOooO00o2 ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.OooO0o(contentInfoPerformReceiveContent));
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, @Nullable String[] strArr, @Nullable o00000 o00000Var) {
            if (o00000Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o00O0O(o00000Var));
            }
        }
    }

    static {
        new AtomicInteger(1);
        f5334OooO00o = null;
        f5336OooO0OO = false;
        f5337OooO0Oo = new int[]{o00000O0.OooO0OO.accessibility_custom_action_0, o00000O0.OooO0OO.accessibility_custom_action_1, o00000O0.OooO0OO.accessibility_custom_action_2, o00000O0.OooO0OO.accessibility_custom_action_3, o00000O0.OooO0OO.accessibility_custom_action_4, o00000O0.OooO0OO.accessibility_custom_action_5, o00000O0.OooO0OO.accessibility_custom_action_6, o00000O0.OooO0OO.accessibility_custom_action_7, o00000O0.OooO0OO.accessibility_custom_action_8, o00000O0.OooO0OO.accessibility_custom_action_9, o00000O0.OooO0OO.accessibility_custom_action_10, o00000O0.OooO0OO.accessibility_custom_action_11, o00000O0.OooO0OO.accessibility_custom_action_12, o00000O0.OooO0OO.accessibility_custom_action_13, o00000O0.OooO0OO.accessibility_custom_action_14, o00000O0.OooO0OO.accessibility_custom_action_15, o00000O0.OooO0OO.accessibility_custom_action_16, o00000O0.OooO0OO.accessibility_custom_action_17, o00000O0.OooO0OO.accessibility_custom_action_18, o00000O0.OooO0OO.accessibility_custom_action_19, o00000O0.OooO0OO.accessibility_custom_action_20, o00000O0.OooO0OO.accessibility_custom_action_21, o00000O0.OooO0OO.accessibility_custom_action_22, o00000O0.OooO0OO.accessibility_custom_action_23, o00000O0.OooO0OO.accessibility_custom_action_24, o00000O0.OooO0OO.accessibility_custom_action_25, o00000O0.OooO0OO.accessibility_custom_action_26, o00000O0.OooO0OO.accessibility_custom_action_27, o00000O0.OooO0OO.accessibility_custom_action_28, o00000O0.OooO0OO.accessibility_custom_action_29, o00000O0.OooO0OO.accessibility_custom_action_30, o00000O0.OooO0OO.accessibility_custom_action_31};
        f5339OooO0o0 = new o0000O00();
        f5338OooO0o = new OooO00o();
    }

    @RequiresApi(19)
    public static void OooO(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = OooO0o0(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (OooOO0O.OooO00o(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                OooOO0O.OooO0oO(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(OooO0o0(view));
                    if (OooO0o.OooO0OO(view) == 0) {
                        OooO0o.OooOOoo(view, 1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (OooO0o.OooO0OO((View) parent) == 4) {
                            OooO0o.OooOOoo(view, 2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        OooOO0O.OooO0o0(view.getParent(), view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            OooOO0O.OooO0oO(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(OooO0o0(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @NonNull
    public static o000O0Oo OooO00o(@NonNull View view) {
        if (f5334OooO00o == null) {
            f5334OooO00o = new WeakHashMap<>();
        }
        o000O0Oo o000o0oo2 = f5334OooO00o.get(view);
        if (o000o0oo2 != null) {
            return o000o0oo2;
        }
        o000O0Oo o000o0oo3 = new o000O0Oo(view);
        f5334OooO00o.put(view, o000o0oo3);
        return o000o0oo3;
    }

    @NonNull
    public static WindowInsetsCompat OooO0O0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsOooO = windowInsetsCompat.OooO();
        if (windowInsetsOooO != null) {
            WindowInsets windowInsetsOooO00o = OooOOO0.OooO00o(view, windowInsetsOooO);
            if (!windowInsetsOooO00o.equals(windowInsetsOooO)) {
                return WindowInsetsCompat.OooOO0(view, windowInsetsOooO00o);
            }
        }
        return windowInsetsCompat;
    }

    @UiThread
    public static boolean OooO0OO(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = o00Ooo.f5349OooO0Oo;
        int i = o00000O0.OooO0OO.tag_unhandled_key_event_manager;
        o00Ooo o00ooo2 = (o00Ooo) view.getTag(i);
        if (o00ooo2 == null) {
            o00ooo2 = new o00Ooo();
            view.setTag(i, o00ooo2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = o00ooo2.f5350OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = o00Ooo.f5349OooO0Oo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (o00ooo2.f5350OooO00o == null) {
                        o00ooo2.f5350OooO00o = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = o00Ooo.f5349OooO0Oo;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            o00ooo2.f5350OooO00o.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                o00ooo2.f5350OooO00o.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewOooO00o = o00ooo2.OooO00o(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewOooO00o != null && !KeyEvent.isModifierKey(keyCode)) {
                if (o00ooo2.f5351OooO0O0 == null) {
                    o00ooo2.f5351OooO0O0 = new SparseArray<>();
                }
                o00ooo2.f5351OooO0O0.put(keyCode, new WeakReference<>(viewOooO00o));
            }
        }
        return viewOooO00o != null;
    }

    @Nullable
    public static View.AccessibilityDelegate OooO0Oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Oooo0.OooO00o(view);
        }
        if (f5336OooO0OO) {
            return null;
        }
        if (f5335OooO0O0 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5335OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5336OooO0OO = true;
                return null;
            }
        }
        try {
            Object obj = f5335OooO0O0.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5336OooO0OO = true;
            return null;
        }
    }

    public static ArrayList OooO0o(View view) {
        int i = o00000O0.OooO0OO.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    @Nullable
    @UiThread
    public static CharSequence OooO0o0(@NonNull View view) {
        Object tag;
        int i = o00000O0.OooO0OO.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Oooo000.OooO0O0(view);
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    @Nullable
    public static String[] OooO0oO(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? o0OoOo0.OooO00o(view) : (String[]) view.getTag(o00000O0.OooO0OO.tag_on_receive_content_mime_types);
    }

    @Nullable
    @Deprecated
    public static o0oOOo OooO0oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o000oOoO.OooO0O0(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new o0oOOo(view, window);
                }
                return null;
            }
        }
        return null;
    }

    @NonNull
    public static WindowInsetsCompat OooOO0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsOooO = windowInsetsCompat.OooO();
        if (windowInsetsOooO != null) {
            WindowInsets windowInsetsOooO0O0 = OooOOO0.OooO0O0(view, windowInsetsOooO);
            if (!windowInsetsOooO0O0.equals(windowInsetsOooO)) {
                return WindowInsetsCompat.OooOO0(view, windowInsetsOooO0O0);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ContentInfoCompat OooOO0O(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o0OoOo0.OooO0O0(view, contentInfoCompat);
        }
        o00000 o00000Var = (o00000) view.getTag(o00000O0.OooO0OO.tag_on_receive_content_listener);
        o00000O0 o00000o1 = f5339OooO0o0;
        if (o00000Var == null) {
            if (view instanceof o00000O0) {
                o00000o1 = (o00000O0) view;
            }
            return o00000o1.OooO00o(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatOooO00o = o00000Var.OooO00o(view, contentInfoCompat);
        if (contentInfoCompatOooO00o == null) {
            return null;
        }
        if (view instanceof o00000O0) {
            o00000o1 = (o00000O0) view;
        }
        return o00000o1.OooO00o(contentInfoCompatOooO00o);
    }

    public static void OooOO0o(int i, View view) {
        ArrayList arrayListOooO0o = OooO0o(view);
        for (int i2 = 0; i2 < arrayListOooO0o.size(); i2++) {
            if (((o0000O.o0Oo0oo.OooO00o) arrayListOooO0o.get(i2)).OooO00o() == i) {
                arrayListOooO0o.remove(i2);
                return;
            }
        }
    }

    public static void OooOOO(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Oooo0.OooO0OO(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void OooOOO0(@NonNull View view, @NonNull o0000O.o0Oo0oo.OooO00o oooO00o, @Nullable String str, @Nullable o0000O.o000OOo o000ooo2) {
        androidx.core.view.OooO00o oooO00o2;
        if (o000ooo2 == null && str == null) {
            OooOO0o(oooO00o.OooO00o(), view);
            OooO(0, view);
            return;
        }
        o0000O.o0Oo0oo.OooO00o oooO00o3 = new o0000O.o0Oo0oo.OooO00o(null, oooO00o.f34041OooO0O0, str, o000ooo2, oooO00o.f34042OooO0OO);
        View.AccessibilityDelegate accessibilityDelegateOooO0Oo = OooO0Oo(view);
        if (accessibilityDelegateOooO0Oo == null) {
            oooO00o2 = null;
        } else {
            oooO00o2 = accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o ? ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o : new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
        }
        if (oooO00o2 == null) {
            oooO00o2 = new androidx.core.view.OooO00o();
        }
        OooOOOO(view, oooO00o2);
        OooOO0o(oooO00o3.OooO00o(), view);
        OooO0o(view).add(oooO00o3);
        OooO(0, view);
    }

    public static void OooOOOO(@NonNull View view, @Nullable androidx.core.view.OooO00o oooO00o) {
        if (oooO00o == null && (OooO0Oo(view) instanceof androidx.core.view.OooO00o.C0122OooO00o)) {
            oooO00o = new androidx.core.view.OooO00o();
        }
        view.setAccessibilityDelegate(oooO00o == null ? null : oooO00o.getBridge());
    }

    @UiThread
    public static void OooOOOo(@NonNull View view, @Nullable CharSequence charSequence) {
        new o0000O0(o00000O0.OooO0OO.tag_accessibility_pane_title).OooO0o0(view, charSequence);
        OooO00o oooO00o = f5338OooO0o;
        if (charSequence == null) {
            oooO00o.f5340OooO0Oo.remove(view);
            view.removeOnAttachStateChangeListener(oooO00o);
            OooO0o.OooOOOO(view.getViewTreeObserver(), oooO00o);
        } else {
            oooO00o.f5340OooO0Oo.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(oooO00o);
            if (OooOO0O.OooO0O0(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(oooO00o);
            }
        }
    }

    public static void OooOOo(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(callback != null ? new WindowInsetsAnimationCompat.OooO0OO.OooO00o(callback) : null);
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.OooO0O0.f5357OooO0o0;
        Object tag = view.getTag(o00000O0.OooO0OO.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(o00000O0.OooO0OO.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener oooO00o = new WindowInsetsAnimationCompat.OooO0O0.OooO00o(view, callback);
        view.setTag(o00000O0.OooO0OO.tag_window_insets_animation_callback, oooO00o);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(oooO00o);
        }
    }

    public static void OooOOo0(@NonNull View view, @Nullable o00000OO o00000oo2) {
        if (Build.VERSION.SDK_INT >= 24) {
            OooOo00.OooO0Oo(view, o0000.OooO00o(o00000oo2 != null ? o00000oo2.f5418OooO00o : null));
        }
    }
}
