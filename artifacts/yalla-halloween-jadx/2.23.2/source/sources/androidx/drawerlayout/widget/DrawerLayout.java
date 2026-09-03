package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0000O.o00000;
import o0000O.o0O0O00;
import org.jctools.util.Pow2;
import p028Oooo0oO.o0oOO;
import p052o00000oO.OooOO0O;
import p055o0000Oo.OooOOO;
import p055o0000Oo.OooOOOO;
import p055o0000Oo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final boolean f5546Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final int[] f5547Oooo00O = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f5548Oooo00o = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final boolean f5549Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final boolean f5550Oooo0OO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f5551OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f5552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f5553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f5554OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f5555OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f5556OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p056o0000Oo0.OooO0o f5557OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p056o0000Oo0.OooO0o f5558OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0 f5559OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f5560OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooOO0 f5561OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f5562OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f5563OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f5564OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f5565OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f5566OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f5567OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f5568OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f5569OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public OooO f5570OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f5571OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Drawable f5572OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f5573OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f5574OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ArrayList<View> f5575OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f5576OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Rect f5577OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Matrix f5578OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO00o f5579Oooo000;

    public interface OooO {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();
    }

    public class OooO00o implements o00000 {
        public OooO00o() {
        }

        @Override // o0000O.o00000
        public final boolean perform(@NonNull View view, @Nullable o00000.OooO00o oooO00o) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (!DrawerLayout.OooOO0O(view) || drawerLayout.OooO0oO(view) == 2) {
                return false;
            }
            drawerLayout.OooO0O0(view);
            return true;
        }
    }

    public class OooO0O0 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f5574OooOoOO = windowInsets;
            drawerLayout.f5576OooOoo0 = z;
            drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class OooO0OO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f5585OooO00o = new Rect();

        public OooO0OO() {
        }

        @Override // androidx.core.view.OooO00o
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0o = drawerLayout.OooO0o();
            if (viewOooO0o == null) {
                return true;
            }
            int iOooO0oo = drawerLayout.OooO0oo(viewOooO0o);
            drawerLayout.getClass();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            Gravity.getAbsoluteGravity(iOooO0oo, ViewCompat.OooO.OooO0Oo(drawerLayout));
            return true;
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, o0O0O00 o0o0o00) {
            if (DrawerLayout.f5546Oooo0) {
                super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(o0o0o00.f33510OooO00o);
                super.onInitializeAccessibilityNodeInfo(view, new o0O0O00(accessibilityNodeInfoObtain));
                o0o0o00.f33512OooO0OO = -1;
                AccessibilityNodeInfo accessibilityNodeInfo = o0o0o00.f33510OooO00o;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                Object objOooO0o = ViewCompat.OooO0o.OooO0o(view);
                if (objOooO0o instanceof View) {
                    o0o0o00.f33511OooO0O0 = -1;
                    accessibilityNodeInfo.setParent((View) objOooO0o);
                }
                Rect rect = this.f5585OooO00o;
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                o0o0o00.OooOO0O(accessibilityNodeInfoObtain.getClassName());
                o0o0o00.OooOOO(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                o0o0o00.OooO0oo(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                o0o0o00.OooO00o(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.OooO(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            o0o0o00.OooOO0O("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo2 = o0o0o00.f33510OooO00o;
            accessibilityNodeInfo2.setFocusable(false);
            accessibilityNodeInfo2.setFocused(false);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) o0O0O00.OooO00o.f33515OooO0o0.f33528OooO00o);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) o0O0O00.OooO00o.f33514OooO0o.f33528OooO00o);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f5546Oooo0 || DrawerLayout.OooO(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class OooO0o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, o0O0O00 o0o0o00) {
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            if (DrawerLayout.OooO(view)) {
                return;
            }
            o0o0o00.f33511OooO0O0 = -1;
            o0o0o00.f33510OooO00o.setParent(null);
        }
    }

    public class OooOO0 extends o0000Oo0.OooO0o.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5587OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p056o0000Oo0.OooO0o f5588OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f5589OooO0OO = new OooO00o();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewOooO0Oo;
                int width;
                OooOO0 oooOO1 = OooOO0.this;
                int i = oooOO1.f5588OooO0O0.f33660OooOOOO;
                int i2 = oooOO1.f5587OooO00o;
                boolean z = i2 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z) {
                    viewOooO0Oo = drawerLayout.OooO0Oo(3);
                    width = (viewOooO0Oo != null ? -viewOooO0Oo.getWidth() : 0) + i;
                } else {
                    viewOooO0Oo = drawerLayout.OooO0Oo(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewOooO0Oo != null) {
                    if (((!z || viewOooO0Oo.getLeft() >= width) && (z || viewOooO0Oo.getLeft() <= width)) || drawerLayout.OooO0oO(viewOooO0Oo) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewOooO0Oo.getLayoutParams();
                    oooOO1.f5588OooO0O0.OooOo0O(viewOooO0Oo, width, viewOooO0Oo.getTop());
                    layoutParams.f5582OooO0OO = true;
                    drawerLayout.invalidate();
                    View viewOooO0Oo2 = drawerLayout.OooO0Oo(i2 == 3 ? 5 : 3);
                    if (viewOooO0Oo2 != null) {
                        drawerLayout.OooO0O0(viewOooO0Oo2);
                    }
                    if (drawerLayout.f5568OooOo0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f5568OooOo0 = true;
                }
            }
        }

        public OooOO0(int i) {
            this.f5587OooO00o = i;
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO(View view, int i, int i2) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.OooO00o(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
            drawerLayout.OooOOOO(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO00o(View view, int i) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.OooO00o(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0O0(View view, int i) {
            return view.getTop();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0OO(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.OooOO0o(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0o() {
            DrawerLayout.this.postDelayed(this.f5589OooO0OO, 160L);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0o0(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0Oo = i3 == 1 ? drawerLayout.OooO0Oo(3) : drawerLayout.OooO0Oo(5);
            if (viewOooO0Oo == null || drawerLayout.OooO0oO(viewOooO0Oo) != 0) {
                return;
            }
            this.f5588OooO0O0.OooO0OO(i2, viewOooO0Oo);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oO(int i, View view) {
            ((LayoutParams) view.getLayoutParams()).f5582OooO0OO = false;
            int i2 = this.f5587OooO00o == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewOooO0Oo = drawerLayout.OooO0Oo(i2);
            if (viewOooO0Oo != null) {
                drawerLayout.OooO0O0(viewOooO0Oo);
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oo(int i) {
            int i2;
            View rootView;
            View view = this.f5588OooO0O0.f33666OooOo00;
            DrawerLayout drawerLayout = DrawerLayout.this;
            int i3 = drawerLayout.f5557OooOO0.f33647OooO00o;
            int i4 = drawerLayout.f5558OooOO0O.f33647OooO00o;
            if (i3 == 1 || i4 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (i3 != 2 && i4 != 2) {
                    i2 = 0;
                }
            }
            if (view != null && i == 0) {
                float f = ((LayoutParams) view.getLayoutParams()).f5581OooO0O0;
                if (f == 0.0f) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams.f5583OooO0Oo & 1) == 1) {
                        layoutParams.f5583OooO0Oo = 0;
                        ArrayList arrayList = drawerLayout.f5571OooOo0o;
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                ((OooO) drawerLayout.f5571OooOo0o.get(size)).OooO0OO();
                            }
                        }
                        drawerLayout.OooOOo0(view, false);
                        drawerLayout.OooOOOo(view);
                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                } else if (f == 1.0f) {
                    LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams2.f5583OooO0Oo & 1) == 0) {
                        layoutParams2.f5583OooO0Oo = 1;
                        ArrayList arrayList2 = drawerLayout.f5571OooOo0o;
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ((OooO) drawerLayout.f5571OooOo0o.get(size2)).OooO0Oo();
                            }
                        }
                        drawerLayout.OooOOo0(view, true);
                        drawerLayout.OooOOOo(view);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i2 != drawerLayout.f5560OooOOO) {
                drawerLayout.f5560OooOOO = i2;
                ArrayList arrayList3 = drawerLayout.f5571OooOo0o;
                if (arrayList3 != null) {
                    for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                        ((OooO) drawerLayout.f5571OooOo0o.get(size3)).OooO00o();
                    }
                }
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooOO0(View view, float f, float f2) {
            int i;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f3 = ((LayoutParams) view.getLayoutParams()).f5581OooO0O0;
            int width = view.getWidth();
            if (drawerLayout.OooO00o(3, view)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f5588OooO0O0.OooOo00(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final boolean OooOO0O(int i, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.OooOO0o(view) && drawerLayout.OooO00o(this.f5587OooO00o, view) && drawerLayout.OooO0oO(view) == 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f5546Oooo0 = true;
        f5549Oooo0O0 = true;
        f5550Oooo0OO = i >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean OooO(View view) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return (ViewCompat.OooO0o.OooO0OO(view) == 4 || ViewCompat.OooO0o.OooO0OO(view) == 2) ? false : true;
    }

    public static boolean OooOO0(View view) {
        return ((LayoutParams) view.getLayoutParams()).f5580OooO00o == 0;
    }

    public static boolean OooOO0O(@NonNull View view) {
        if (OooOO0o(view)) {
            return (((LayoutParams) view.getLayoutParams()).f5583OooO0Oo & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean OooOO0o(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f5580OooO00o;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean OooO00o(int i, View view) {
        return (OooO0oo(view) & i) == i;
    }

    public final void OooO0O0(@NonNull View view) {
        if (!OooOO0o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f5563OooOOOo) {
            layoutParams.f5581OooO0O0 = 0.0f;
            layoutParams.f5583OooO0Oo = 0;
        } else {
            layoutParams.f5583OooO0Oo |= 4;
            if (OooO00o(3, view)) {
                this.f5557OooOO0.OooOo0O(view, -view.getWidth(), view.getTop());
            } else {
                this.f5558OooOO0O.OooOo0O(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void OooO0OO(boolean z) {
        int childCount = getChildCount();
        boolean zOooOo0O = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (OooOO0o(childAt) && (!z || layoutParams.f5582OooO0OO)) {
                zOooOo0O |= OooO00o(3, childAt) ? this.f5557OooOO0.OooOo0O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f5558OooOO0O.OooOo0O(childAt, getWidth(), childAt.getTop());
                layoutParams.f5582OooO0OO = false;
            }
        }
        OooOO0 oooOO1 = this.f5559OooOO0o;
        DrawerLayout.this.removeCallbacks(oooOO1.f5589OooO0OO);
        OooOO0 oooOO2 = this.f5561OooOOO0;
        DrawerLayout.this.removeCallbacks(oooOO2.f5589OooO0OO);
        if (zOooOo0O) {
            invalidate();
        }
    }

    public final View OooO0Oo(int i) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((OooO0oo(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View OooO0o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (OooOO0o(childAt)) {
                if (!OooOO0o(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f5581OooO0O0 > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final View OooO0o0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f5583OooO0Oo & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final int OooO0oO(@NonNull View view) {
        if (!OooOO0o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((LayoutParams) view.getLayoutParams()).f5580OooO00o;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        if (i == 3) {
            int i2 = this.f5565OooOOo0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iOooO0Oo == 0 ? this.f5566OooOOoo : this.f5569OooOo00;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f5564OooOOo;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iOooO0Oo == 0 ? this.f5569OooOo00 : this.f5566OooOOoo;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f5566OooOOoo;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iOooO0Oo == 0 ? this.f5565OooOOo0 : this.f5564OooOOo;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f5569OooOo00;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iOooO0Oo == 0 ? this.f5564OooOOo : this.f5565OooOOo0;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int OooO0oo(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f5580OooO00o;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(this));
    }

    public final void OooOOO(int i, int i2) {
        View viewOooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, ViewCompat.OooO.OooO0Oo(this));
        if (i2 == 3) {
            this.f5565OooOOo0 = i;
        } else if (i2 == 5) {
            this.f5564OooOOo = i;
        } else if (i2 == 8388611) {
            this.f5566OooOOoo = i;
        } else if (i2 == 8388613) {
            this.f5569OooOo00 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f5557OooOO0 : this.f5558OooOO0O).OooO0O0();
        }
        if (i != 1) {
            if (i == 2 && (viewOooO0Oo = OooO0Oo(absoluteGravity)) != null) {
                OooOOO0(viewOooO0Oo);
                return;
            }
            return;
        }
        View viewOooO0Oo2 = OooO0Oo(absoluteGravity);
        if (viewOooO0Oo2 != null) {
            OooO0O0(viewOooO0Oo2);
        }
    }

    public final void OooOOO0(@NonNull View view) {
        if (!OooOO0o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f5563OooOOOo) {
            layoutParams.f5581OooO0O0 = 1.0f;
            layoutParams.f5583OooO0Oo = 1;
            OooOOo0(view, true);
            OooOOOo(view);
        } else {
            layoutParams.f5583OooO0Oo |= 2;
            if (OooO00o(3, view)) {
                this.f5557OooOO0.OooOo0O(view, 0, view.getTop());
            } else {
                this.f5558OooOO0O.OooOo0O(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void OooOOOO(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f5581OooO0O0) {
            return;
        }
        layoutParams.f5581OooO0O0 = f;
        ArrayList arrayList = this.f5571OooOo0o;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((OooO) this.f5571OooOo0o.get(size)).OooO0O0();
            }
        }
    }

    public final void OooOOOo(View view) {
        o0O0O00.OooO00o oooO00o = o0O0O00.OooO00o.f33521OooOOO;
        ViewCompat.OooOO0o(oooO00o.OooO00o(), view);
        ViewCompat.OooO(0, view);
        if (!OooOO0O(view) || OooO0oO(view) == 2) {
            return;
        }
        ViewCompat.OooOOO0(view, oooO00o, null, this.f5579Oooo000);
    }

    public final void OooOOo0(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || OooOO0o(childAt)) && !(z && childAt == view)) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOoo(childAt, 4);
            } else {
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOoo(childAt, 1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f5575OooOoo;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!OooOO0o(childAt)) {
                arrayList2.add(childAt);
            } else if (OooOO0O(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (OooO0o0() != null || OooOO0o(view)) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOoo(view, 4);
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOoo(view, 1);
        }
        if (f5546Oooo0) {
            return;
        }
        ViewCompat.OooOOOO(view, this.f5552OooO0Oo);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f5581OooO0O0);
        }
        this.f5556OooO0oo = fMax;
        boolean zOooO0oo = this.f5557OooOO0.OooO0oo();
        boolean zOooO0oo2 = this.f5558OooOO0O.OooO0oo();
        if (zOooO0oo || zOooO0oo2) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f5556OooO0oo <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f5577OooOooO == null) {
                this.f5577OooOooO = new Rect();
            }
            childAt.getHitRect(this.f5577OooOooO);
            if (this.f5577OooOooO.contains((int) x, (int) y) && !OooOO0(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f5578OooOooo == null) {
                            this.f5578OooOooo = new Matrix();
                        }
                        matrix.invert(this.f5578OooOooo);
                        motionEventObtain.transform(this.f5578OooOooo);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zOooOO0 = OooOO0(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zOooOO0) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && OooOO0o(childAt) && childAt.getHeight() >= height) {
                        if (OooO00o(3, childAt)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f5556OooO0oo;
        if (f > 0.0f && zOooOO0) {
            int i4 = this.f5555OooO0oO;
            Paint paint = this.f5551OooO;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f5549Oooo0O0) {
            return this.f5554OooO0o0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f5572OooOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5563OooOOOo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5563OooOOOo = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5576OooOoo0 || this.f5572OooOoO == null) {
            return;
        }
        Object obj = this.f5574OooOoOO;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f5572OooOoO.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f5572OooOoO.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewOooOO0;
        boolean z2;
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        p056o0000Oo0.OooO0o oooO0o = this.f5557OooOO0;
        boolean zOooOo0 = oooO0o.OooOo0(motionEvent) | this.f5558OooOO0O.OooOo0(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                OooO0OO(true);
                this.f5568OooOo0 = false;
            } else if (actionMasked == 2) {
                int length = oooO0o.f33650OooO0Oo.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z3 = false;
                        break;
                    }
                    if ((oooO0o.f33656OooOO0O & (1 << i)) != 0) {
                        float f = oooO0o.f33651OooO0o[i] - oooO0o.f33650OooO0Oo[i];
                        float f2 = oooO0o.f33653OooO0oO[i] - oooO0o.f33652OooO0o0[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = oooO0o.f33648OooO0O0;
                        if (f3 > i2 * i2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
                if (z3) {
                    OooOO0 oooOO1 = this.f5559OooOO0o;
                    DrawerLayout.this.removeCallbacks(oooOO1.f5589OooO0OO);
                    OooOO0 oooOO2 = this.f5561OooOOO0;
                    DrawerLayout.this.removeCallbacks(oooOO2.f5589OooO0OO);
                }
            } else if (actionMasked == 3) {
                OooO0OO(true);
                this.f5568OooOo0 = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5567OooOo = x;
            this.f5573OooOoO0 = y;
            z = this.f5556OooO0oo > 0.0f && (viewOooOO0 = oooO0o.OooOO0((int) x, (int) y)) != null && OooOO0(viewOooOO0);
            this.f5568OooOo0 = false;
        }
        if (zOooOo0 || z) {
            return true;
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                z2 = false;
                break;
            }
            if (((LayoutParams) getChildAt(i3).getLayoutParams()).f5582OooO0OO) {
                z2 = true;
                break;
            }
            i3++;
        }
        return z2 || this.f5568OooOo0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (OooO0o() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewOooO0o = OooO0o();
        if (viewOooO0o != null && OooO0oO(viewOooO0o) == 0) {
            OooO0OO(false);
        }
        return viewOooO0o != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.f5562OooOOOO = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (OooOO0(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (OooO00o(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f5581OooO0O0 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f5581OooO0O0 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z3 = f != layoutParams.f5581OooO0O0 ? z2 : false;
                    int i10 = layoutParams.f5580OooO00o & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        OooOOOO(childAt, f);
                    }
                    int i18 = layoutParams.f5581OooO0O0 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (f5550Oooo0OO && (rootWindowInsets = getRootWindowInsets()) != null) {
            OooOO0O OooOO0O2 = WindowInsetsCompat.OooOO0(null, rootWindowInsets).f5389OooO00o.OooOO0O();
            p056o0000Oo0.OooO0o oooO0o = this.f5557OooOO0;
            oooO0o.f33660OooOOOO = Math.max(oooO0o.f33661OooOOOo, OooOO0O2.f33477OooO00o);
            p056o0000Oo0.OooO0o oooO0o2 = this.f5558OooOO0O;
            oooO0o2.f33660OooOOOO = Math.max(oooO0o2.f33661OooOOOo, OooOO0O2.f33479OooO0OO);
        }
        this.f5562OooOOOO = false;
        this.f5563OooOOOo = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f5574OooOoOO != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f5580OooO00o, iOooO0Oo);
                    if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f5574OooOoOO;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f5574OooOoOO;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (OooOO0(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, Pow2.MAX_POW2));
                } else {
                    if (!OooOO0o(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f5549Oooo0O0) {
                        float fOooO = ViewCompat.OooOOO.OooO(childAt);
                        float f = this.f5554OooO0o0;
                        if (fOooO != f) {
                            ViewCompat.OooOOO.OooOOoo(childAt, f);
                        }
                    }
                    int iOooO0oo = OooO0oo(childAt) & 7;
                    boolean z4 = iOooO0oo == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(o0oOO.OooO0O0(new StringBuilder("Child drawer has absolute gravity "), (iOooO0oo & 3) != 3 ? (iOooO0oo & 5) == 5 ? "RIGHT" : Integer.toHexString(iOooO0oo) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f5553OooO0o + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewOooO0Oo;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        int i = savedState.f5593OooO0o;
        if (i != 0 && (viewOooO0Oo = OooO0Oo(i)) != null) {
            OooOOO0(viewOooO0Oo);
        }
        int i2 = savedState.f5594OooO0oO;
        if (i2 != 3) {
            OooOOO(i2, 3);
        }
        int i3 = savedState.f5595OooO0oo;
        if (i3 != 3) {
            OooOOO(i3, 5);
        }
        int i4 = savedState.f5592OooO;
        if (i4 != 3) {
            OooOOO(i4, 8388611);
        }
        int i5 = savedState.f5596OooOO0;
        if (i5 != 3) {
            OooOOO(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f5549Oooo0O0) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO.OooO0Oo(this);
        ViewCompat.OooO.OooO0Oo(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f5583OooO0Oo;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f5593OooO0o = layoutParams.f5580OooO00o;
                break;
            }
        }
        savedState.f5594OooO0oO = this.f5565OooOOo0;
        savedState.f5595OooO0oo = this.f5564OooOOo;
        savedState.f5592OooO = this.f5566OooOOoo;
        savedState.f5596OooOO0 = this.f5569OooOo00;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewOooO0o0;
        p056o0000Oo0.OooO0o oooO0o = this.f5557OooOO0;
        oooO0o.OooOOO(motionEvent);
        this.f5558OooOO0O.OooOOO(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5567OooOo = x;
            this.f5573OooOoO0 = y;
            this.f5568OooOo0 = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View viewOooOO0 = oooO0o.OooOO0((int) x2, (int) y2);
            if (viewOooOO0 != null && OooOO0(viewOooOO0)) {
                float f = x2 - this.f5567OooOo;
                float f2 = y2 - this.f5573OooOoO0;
                int i = oooO0o.f33648OooO0O0;
                z = (f2 * f2) + (f * f) >= ((float) (i * i)) || (viewOooO0o0 = OooO0o0()) == null || OooO0oO(viewOooO0o0) == 2;
            }
            OooO0OO(z);
        } else if (action == 3) {
            OooO0OO(true);
            this.f5568OooOo0 = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            OooO0OO(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5562OooOOOO) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f5554OooO0o0 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (OooOO0o(childAt)) {
                float f2 = this.f5554OooO0o0;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOOO.OooOOoo(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(OooO oooO) {
        ArrayList arrayList;
        OooO oooO2 = this.f5570OooOo0O;
        if (oooO2 != null && (arrayList = this.f5571OooOo0o) != null) {
            arrayList.remove(oooO2);
        }
        if (oooO != null) {
            if (this.f5571OooOo0o == null) {
                this.f5571OooOo0o = new ArrayList();
            }
            this.f5571OooOo0o.add(oooO);
        }
        this.f5570OooOo0O = oooO;
    }

    public void setDrawerLockMode(int i) {
        OooOOO(i, 3);
        OooOOO(i, 5);
    }

    public void setScrimColor(@ColorInt int i) {
        this.f5555OooO0oO = i;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f5572OooOoO = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f5572OooOoO = new ColorDrawable(i);
        invalidate();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOOO.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5552OooO0Oo = new OooO0o();
        this.f5555OooO0oO = -1728053248;
        this.f5551OooO = new Paint();
        this.f5563OooOOOo = true;
        this.f5565OooOOo0 = 3;
        this.f5564OooOOo = 3;
        this.f5566OooOOoo = 3;
        this.f5569OooOo00 = 3;
        this.f5579Oooo000 = new OooO00o();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f5553OooO0o = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        OooOO0 oooOO1 = new OooOO0(3);
        this.f5559OooOO0o = oooOO1;
        OooOO0 oooOO2 = new OooOO0(5);
        this.f5561OooOOO0 = oooOO2;
        p056o0000Oo0.OooO0o oooO0oOooO = p056o0000Oo0.OooO0o.OooO(this, 1.0f, oooOO1);
        this.f5557OooOO0 = oooO0oOooO;
        oooO0oOooO.f33663OooOOo0 = 1;
        oooO0oOooO.f33658OooOOO = f2;
        oooOO1.f5588OooO0O0 = oooO0oOooO;
        p056o0000Oo0.OooO0o oooO0oOooO2 = p056o0000Oo0.OooO0o.OooO(this, 1.0f, oooOO2);
        this.f5558OooOO0O = oooO0oOooO2;
        oooO0oOooO2.f33663OooOOo0 = 2;
        oooO0oOooO2.f33658OooOOO = f2;
        oooOO2.f5588OooO0O0 = oooO0oOooO2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
        ViewCompat.OooOOOO(this, new OooO0OO());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.OooO0o.OooO0O0(this)) {
            setOnApplyWindowInsetsListener(new OooO0O0());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f5547Oooo00O);
            try {
                this.f5572OooOoO = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OooOo00.DrawerLayout, i, 0);
        try {
            int i2 = OooOo00.DrawerLayout_elevation;
            if (typedArrayObtainStyledAttributes2.hasValue(i2)) {
                this.f5554OooO0o0 = typedArrayObtainStyledAttributes2.getDimension(i2, 0.0f);
            } else {
                this.f5554OooO0o0 = getResources().getDimension(OooOOOO.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f5575OooOoo = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawableOooO0O0;
        if (i != 0) {
            Context context = getContext();
            Object obj = ContextCompat.f5281OooO00o;
            drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, i);
        } else {
            drawableOooO0O0 = null;
        }
        this.f5572OooOoO = drawableOooO0O0;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5580OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f5581OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f5582OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5583OooO0Oo;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5580OooO00o = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f5548Oooo00o);
            this.f5580OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f5580OooO00o = 0;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f5580OooO00o = 0;
            this.f5580OooO00o = layoutParams.f5580OooO00o;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5580OooO00o = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5580OooO00o = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5592OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5593OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f5594OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f5595OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5596OooOO0;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5593OooO0o = 0;
            this.f5593OooO0o = parcel.readInt();
            this.f5594OooO0oO = parcel.readInt();
            this.f5595OooO0oo = parcel.readInt();
            this.f5592OooO = parcel.readInt();
            this.f5596OooOO0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f5593OooO0o);
            parcel.writeInt(this.f5594OooO0oO);
            parcel.writeInt(this.f5595OooO0oo);
            parcel.writeInt(this.f5592OooO);
            parcel.writeInt(this.f5596OooOO0);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f5593OooO0o = 0;
        }
    }
}
