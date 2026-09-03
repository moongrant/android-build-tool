package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
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
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
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
import o000O0O0.o00000O;
import o000O0O0.o0Oo0oo;
import o000O0O0.o0ooOOo;
import o000O0O0.oo000o;
import o000O0O0.oo0o0Oo;
import p021OooOooo.o00oO0o;
import p069o0000oo0.o000OO0O;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class ViewCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static WeakHashMap<View, o00000O> f7870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Field f7871OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f7872OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static ThreadLocal<Rect> f7873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final oo0o0Oo f7874OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f7875OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f7876OooO0oO;

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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f7877Oooo0o = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @RequiresApi(19)
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f7877Oooo0o.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        ViewCompat.OooOOO(key, z ? 16 : 32);
                        this.f7877Oooo0o.put(key, Boolean.valueOf(z));
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
        public final int f7878OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<T> f7879OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7880OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7881OooO0Oo;

        public OooO0O0(int i, Class<T> cls, int i2, int i3) {
            this.f7878OooO00o = i;
            this.f7879OooO0O0 = cls;
            this.f7881OooO0Oo = i2;
            this.f7880OooO0OO = i3;
        }

        public final boolean OooO00o(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T OooO0O0(View view);

        public abstract void OooO0OO(View view, T t);

        public final T OooO0Oo(View view) {
            if (Build.VERSION.SDK_INT >= this.f7880OooO0OO) {
                return OooO0O0(view);
            }
            T t = (T) view.getTag(this.f7878OooO00o);
            if (this.f7879OooO0O0.isInstance(t)) {
                return t;
            }
            return null;
        }

        public abstract boolean OooO0o(T t, T t2);

        public final void OooO0o0(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f7880OooO0OO) {
                OooO0OO(view, t);
                return;
            }
            if (OooO0o(OooO0Oo(view), t)) {
                androidx.core.view.OooO00o oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                if (oooO00oOooO0oO == null) {
                    oooO00oOooO0oO = new androidx.core.view.OooO00o();
                }
                ViewCompat.OooOo0o(view, oooO00oOooO0oO);
                view.setTag(this.f7878OooO00o, t);
                ViewCompat.OooOOO(view, this.f7881OooO0Oo);
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
            public WindowInsetsCompat f7882OooO00o = null;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ View f7883OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ oo000o f7884OooO0OO;

            public OooO00o(View view, oo000o oo000oVar) {
                this.f7883OooO0O0 = view;
                this.f7884OooO0OO = oo000oVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    OooOOO.OooO00o(windowInsets, this.f7883OooO0O0);
                    if (windowInsetsCompatOooOOOO.equals(this.f7882OooO00o)) {
                        return this.f7884OooO0OO.OooO00o(view, windowInsetsCompatOooOOOO).OooOOO();
                    }
                }
                this.f7882OooO00o = windowInsetsCompatOooOOOO;
                WindowInsetsCompat windowInsetsCompatOooO00o = this.f7884OooO0OO.OooO00o(view, windowInsetsCompatOooOOOO);
                if (i >= 30) {
                    return windowInsetsCompatOooO00o.OooOOO();
                }
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                OooOOO0.OooO0OO(view);
                return windowInsetsCompatOooO00o.OooOOO();
            }
        }

        @DoNotInline
        public static float OooO(View view) {
            return view.getElevation();
        }

        @DoNotInline
        public static void OooO00o(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(o000OO0O.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat OooO0O0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsetsOooOOO = windowInsetsCompat.OooOOO();
            if (windowInsetsOooOOO != null) {
                return WindowInsetsCompat.OooOOOO(view.computeSystemWindowInsets(windowInsetsOooOOO, rect), view);
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
            if (!WindowInsetsCompat.OooO00o.f7924OooO0Oo || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.OooO00o.f7921OooO00o.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.OooO00o.f7922OooO0O0.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.OooO00o.f7923OooO0OO.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    oooO0OO = new WindowInsetsCompat.OooO0o();
                } else {
                    oooO0OO = i >= 29 ? new WindowInsetsCompat.OooO0OO() : new WindowInsetsCompat.OooO0O0();
                }
                oooO0OO.OooO0o0(p071o000O0o.OooO.OooO0OO(rect));
                oooO0OO.OooO0oO(p071o000O0o.OooO.OooO0OO(rect2));
                WindowInsetsCompat windowInsetsCompatOooO0O0 = oooO0OO.OooO0O0();
                windowInsetsCompatOooO0O0.OooOOO0(windowInsetsCompatOooO0O0);
                windowInsetsCompatOooO0O0.OooO0O0(view.getRootView());
                return windowInsetsCompatOooO0O0;
            } catch (IllegalAccessException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to get insets from AttachInfo. ");
                sbOooO0o0.append(e.getMessage());
                Log.w("WindowInsetsCompat", sbOooO0o0.toString(), e);
                return null;
            }
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
        public static void OooOo0(@NonNull View view, @Nullable oo000o oo000oVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(o000OO0O.tag_on_apply_window_listener, oo000oVar);
            }
            if (oo000oVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(o000OO0O.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new OooO00o(view, oo000oVar));
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
            WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(rootWindowInsets, null);
            windowInsetsCompatOooOOOO.OooOOO0(windowInsetsCompatOooOOOO);
            windowInsetsCompatOooOOOO.OooO0O0(view.getRootView());
            return windowInsetsCompatOooOOOO;
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
            int i = o000OO0O.tag_unhandled_key_listeners;
            o00oO0o o00oo0o2 = (o00oO0o) view.getTag(i);
            if (o00oo0o2 == null) {
                o00oo0o2 = new o00oO0o();
                view.setTag(i, o00oo0o2);
            }
            Objects.requireNonNull(o00oo1);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: o000O0O0.o0O0O00
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return o00oo1.OooO00o();
                }
            };
            o00oo0o2.put(o00oo1, onUnhandledKeyEventListener);
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
            o00oO0o o00oo0o2 = (o00oO0o) view.getTag(o000OO0O.tag_unhandled_key_listeners);
            if (o00oo0o2 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) o00oo0o2.getOrDefault(o00oo1, null)) == null) {
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

        @DoNotInline
        public static void OooO0O0(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi(31)
    public static final class o00O0O implements OnReceiveContentListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o000O0O0.o00oO0o f7885OooO00o;

        public o00O0O(@NonNull o000O0O0.o00oO0o o00oo0o2) {
            this.f7885OooO00o = o00oo0o2;
        }

        @Override // android.view.OnReceiveContentListener
        @Nullable
        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.OooO0o(contentInfo));
            ContentInfoCompat contentInfoCompatOooO00o = this.f7885OooO00o.OooO00o(view, contentInfoCompat);
            if (contentInfoCompatOooO00o == null) {
                return null;
            }
            if (contentInfoCompatOooO00o == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo contentInfoOooO0OO = contentInfoCompatOooO00o.f7848OooO00o.OooO0OO();
            Objects.requireNonNull(contentInfoOooO0OO);
            return contentInfoOooO0OO;
        }
    }

    public interface o00Oo0 {
        boolean OooO00o();
    }

    public static class o00Ooo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f7886OooO0Oo = new ArrayList<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public WeakHashMap<View, Boolean> f7887OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f7888OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public WeakReference<KeyEvent> f7889OooO0OO = null;

        @Nullable
        public final View OooO00o(View view, KeyEvent keyEvent) {
            View viewOooO00o;
            WeakHashMap<View, Boolean> weakHashMap = this.f7887OooO00o;
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

        public final boolean OooO0O0(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(o000OO0O.tag_unhandled_key_listeners);
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
            ContentInfo contentInfoOooO0OO = contentInfoCompat.f7848OooO00o.OooO0OO();
            Objects.requireNonNull(contentInfoOooO0OO);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoOooO0OO);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoOooO0OO ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.OooO0o(contentInfoPerformReceiveContent));
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, @Nullable String[] strArr, @Nullable o000O0O0.o00oO0o o00oo0o2) {
            if (o00oo0o2 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o00O0O(o00oo0o2));
            }
        }
    }

    static {
        new AtomicInteger(1);
        f7870OooO00o = null;
        f7872OooO0OO = false;
        f7875OooO0o0 = new int[]{o000OO0O.accessibility_custom_action_0, o000OO0O.accessibility_custom_action_1, o000OO0O.accessibility_custom_action_2, o000OO0O.accessibility_custom_action_3, o000OO0O.accessibility_custom_action_4, o000OO0O.accessibility_custom_action_5, o000OO0O.accessibility_custom_action_6, o000OO0O.accessibility_custom_action_7, o000OO0O.accessibility_custom_action_8, o000OO0O.accessibility_custom_action_9, o000OO0O.accessibility_custom_action_10, o000OO0O.accessibility_custom_action_11, o000OO0O.accessibility_custom_action_12, o000OO0O.accessibility_custom_action_13, o000OO0O.accessibility_custom_action_14, o000OO0O.accessibility_custom_action_15, o000OO0O.accessibility_custom_action_16, o000OO0O.accessibility_custom_action_17, o000OO0O.accessibility_custom_action_18, o000OO0O.accessibility_custom_action_19, o000OO0O.accessibility_custom_action_20, o000OO0O.accessibility_custom_action_21, o000OO0O.accessibility_custom_action_22, o000OO0O.accessibility_custom_action_23, o000OO0O.accessibility_custom_action_24, o000OO0O.accessibility_custom_action_25, o000OO0O.accessibility_custom_action_26, o000OO0O.accessibility_custom_action_27, o000OO0O.accessibility_custom_action_28, o000OO0O.accessibility_custom_action_29, o000OO0O.accessibility_custom_action_30, o000OO0O.accessibility_custom_action_31};
        f7874OooO0o = oo0o0Oo.f28135Oooo0o;
        f7876OooO0oO = new OooO00o();
    }

    @Nullable
    @UiThread
    public static CharSequence OooO(@NonNull View view) {
        Object tag;
        int i = o000OO0O.tag_accessibility_pane_title;
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

    public static void OooO00o(@NonNull View view, @NonNull o0000OO0.OooO00o oooO00o) {
        androidx.core.view.OooO00o oooO00oOooO0oO = OooO0oO(view);
        if (oooO00oOooO0oO == null) {
            oooO00oOooO0oO = new androidx.core.view.OooO00o();
        }
        OooOo0o(view, oooO00oOooO0oO);
        OooOo00(oooO00o.OooO00o(), view);
        OooOO0(view).add(oooO00o);
        OooOOO(view, 0);
    }

    @NonNull
    public static o00000O OooO0O0(@NonNull View view) {
        if (f7870OooO00o == null) {
            f7870OooO00o = new WeakHashMap<>();
        }
        o00000O o00000o = f7870OooO00o.get(view);
        if (o00000o != null) {
            return o00000o;
        }
        o00000O o00000o2 = new o00000O(view);
        f7870OooO00o.put(view, o00000o2);
        return o00000o2;
    }

    public static void OooO0OO(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            OooOoo0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                OooOoo0((View) parent);
            }
        }
    }

    public static void OooO0Oo(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            OooOoo0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                OooOoo0((View) parent);
            }
        }
    }

    @UiThread
    public static boolean OooO0o(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = o00Ooo.f7886OooO0Oo;
        int i = o000OO0O.tag_unhandled_key_event_manager;
        o00Ooo o00ooo2 = (o00Ooo) view.getTag(i);
        if (o00ooo2 == null) {
            o00ooo2 = new o00Ooo();
            view.setTag(i, o00ooo2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = o00ooo2.f7887OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = o00Ooo.f7886OooO0Oo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (o00ooo2.f7887OooO00o == null) {
                        o00ooo2.f7887OooO00o = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = o00Ooo.f7886OooO0Oo;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            o00ooo2.f7887OooO00o.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                o00ooo2.f7887OooO00o.put((View) parent, Boolean.TRUE);
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
                if (o00ooo2.f7888OooO0O0 == null) {
                    o00ooo2.f7888OooO0O0 = new SparseArray<>();
                }
                o00ooo2.f7888OooO0O0.put(keyCode, new WeakReference<>(viewOooO00o));
            }
        }
        return viewOooO00o != null;
    }

    @NonNull
    public static WindowInsetsCompat OooO0o0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsOooOOO = windowInsetsCompat.OooOOO();
        if (windowInsetsOooOOO != null) {
            WindowInsets windowInsetsOooO00o = OooOOO0.OooO00o(view, windowInsetsOooOOO);
            if (!windowInsetsOooO00o.equals(windowInsetsOooOOO)) {
                return WindowInsetsCompat.OooOOOO(windowInsetsOooO00o, view);
            }
        }
        return windowInsetsCompat;
    }

    @Nullable
    public static androidx.core.view.OooO00o OooO0oO(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateOooO0oo = OooO0oo(view);
        if (accessibilityDelegateOooO0oo == null) {
            return null;
        }
        return accessibilityDelegateOooO0oo instanceof androidx.core.view.OooO00o.C0046OooO00o ? ((androidx.core.view.OooO00o.C0046OooO00o) accessibilityDelegateOooO0oo).f7864OooO00o : new androidx.core.view.OooO00o(accessibilityDelegateOooO0oo);
    }

    @Nullable
    public static View.AccessibilityDelegate OooO0oo(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Oooo0.OooO00o(view);
        }
        if (f7872OooO0OO) {
            return null;
        }
        if (f7871OooO0O0 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7871OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7872OooO0OO = true;
                return null;
            }
        }
        try {
            Object obj = f7871OooO0O0.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7872OooO0OO = true;
            return null;
        }
    }

    public static List<o0000OO0.OooO00o> OooOO0(View view) {
        int i = o000OO0O.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    public static Rect OooOO0O() {
        if (f7873OooO0Oo == null) {
            f7873OooO0Oo = new ThreadLocal<>();
        }
        Rect rect = f7873OooO0Oo.get();
        if (rect == null) {
            rect = new Rect();
            f7873OooO0Oo.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @Nullable
    public static String[] OooOO0o(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? o0OoOo0.OooO00o(view) : (String[]) view.getTag(o000OO0O.tag_on_receive_content_mime_types);
    }

    @RequiresApi(19)
    public static void OooOOO(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = OooO(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (OooOO0O.OooO00o(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : RecyclerView.oo0o0Oo.FLAG_MOVED);
                OooOO0O.OooO0oO(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(OooO(view));
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
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                OooOO0O.OooO0oO(accessibilityEventObtain2, i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(OooO(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    OooOO0O.OooO0o0(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    @Nullable
    public static WindowInsetsCompat OooOOO0(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 23 ? OooOOOO.OooO00o(view) : OooOOO.OooOO0(view);
    }

    public static void OooOOOO(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectOooOO0O = OooOO0O();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectOooOO0O.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectOooOO0O.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        OooO0OO(view, i);
        if (z && rectOooOO0O.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectOooOO0O);
        }
    }

    public static void OooOOOo(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectOooOO0O = OooOO0O();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectOooOO0O.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectOooOO0O.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        OooO0Oo(view, i);
        if (z && rectOooOO0O.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectOooOO0O);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ContentInfoCompat OooOOo(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o0OoOo0.OooO0O0(view, contentInfoCompat);
        }
        o000O0O0.o00oO0o o00oo0o2 = (o000O0O0.o00oO0o) view.getTag(o000OO0O.tag_on_receive_content_listener);
        if (o00oo0o2 == null) {
            return (view instanceof o0ooOOo ? (o0ooOOo) view : f7874OooO0o).OooO00o(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatOooO00o = o00oo0o2.OooO00o(view, contentInfoCompat);
        if (contentInfoCompatOooO00o == null) {
            return null;
        }
        return (view instanceof o0ooOOo ? (o0ooOOo) view : f7874OooO0o).OooO00o(contentInfoCompatOooO00o);
    }

    @NonNull
    public static WindowInsetsCompat OooOOo0(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsOooOOO = windowInsetsCompat.OooOOO();
        if (windowInsetsOooOOO != null) {
            WindowInsets windowInsetsOooO0O0 = OooOOO0.OooO0O0(view, windowInsetsOooOOO);
            if (!windowInsetsOooO0O0.equals(windowInsetsOooOOO)) {
                return WindowInsetsCompat.OooOOOO(windowInsetsOooO0O0, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void OooOOoo(@NonNull View view) {
        OooOo00(R.id.accessibilityActionPageLeft, view);
        OooOOO(view, 0);
    }

    @UiThread
    public static void OooOo(@NonNull View view, @Nullable CharSequence charSequence) {
        new androidx.core.view.OooO0OO(o000OO0O.tag_accessibility_pane_title, CharSequence.class).OooO0o0(view, charSequence);
        if (charSequence == null) {
            OooO00o oooO00o = f7876OooO0oO;
            oooO00o.f7877Oooo0o.remove(view);
            view.removeOnAttachStateChangeListener(oooO00o);
            OooO0o.OooOOOO(view.getViewTreeObserver(), oooO00o);
            return;
        }
        OooO00o oooO00o2 = f7876OooO0oO;
        oooO00o2.f7877Oooo0o.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(oooO00o2);
        if (OooOO0O.OooO0O0(view)) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(oooO00o2);
        }
    }

    public static void OooOo0(@NonNull View view, @NonNull o0000OO0.OooO00o oooO00o, @Nullable o000Oo0 o000oo1) {
        if (o000oo1 != null) {
            OooO00o(view, new o0000OO0.OooO00o(null, oooO00o.f28213OooO0O0, null, o000oo1, oooO00o.f28214OooO0OO));
        } else {
            OooOo00(oooO00o.OooO00o(), view);
            OooOOO(view, 0);
        }
    }

    public static void OooOo00(int i, View view) {
        List<o0000OO0.OooO00o> listOooOO0 = OooOO0(view);
        for (int i2 = 0; i2 < listOooOO0.size(); i2++) {
            if (listOooOO0.get(i2).OooO00o() == i) {
                listOooOO0.remove(i2);
                return;
            }
        }
    }

    public static void OooOo0O(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Oooo0.OooO0OO(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void OooOo0o(@NonNull View view, @Nullable androidx.core.view.OooO00o oooO00o) {
        if (oooO00o == null && (OooO0oo(view) instanceof androidx.core.view.OooO00o.C0046OooO00o)) {
            oooO00o = new androidx.core.view.OooO00o();
        }
        view.setAccessibilityDelegate(oooO00o == null ? null : oooO00o.f7863OooO0O0);
    }

    public static void OooOoO(@NonNull View view, @Nullable o0Oo0oo o0oo0oo2) {
        if (Build.VERSION.SDK_INT >= 24) {
            OooOo00.OooO0Oo(view, o0oo0oo2 != null ? o0oo0oo2.f28134OooO00o : null);
        }
    }

    public static void OooOoO0(@NonNull View view, @Nullable ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        OooOOO.OooOOo0(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (OooOOO.OooO0oO(view) == null && OooOOO.OooO0oo(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            OooO0o.OooOOo0(view, background);
        }
    }

    public static void OooOoOO(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsAnimationCompat.OooO0OO.OooO0oo(view, callback);
            return;
        }
        Object tag = view.getTag(o000OO0O.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(o000OO0O.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener oooO00o = new WindowInsetsAnimationCompat.OooO0O0.OooO00o(view, callback);
        view.setTag(o000OO0O.tag_window_insets_animation_callback, oooO00o);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(oooO00o);
        }
    }

    public static void OooOoo0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
