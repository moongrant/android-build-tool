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
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.uc.crashsdk.export.LogType;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000Oo0;
import p075o000OO0o.OooOOO;
import p075o000OO0o.OooOOOO;
import p075o000OO0o.OooOo00;
import p427o0OoO0o.o00000;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static boolean f8029o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final boolean f8030o00oO0o;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final boolean f8032oo000o;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f8033Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f8034Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f8035Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f8036Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o00000 f8037OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Paint f8038OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f8039OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o00000 f8040OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooOO0 f8041OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f8042OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f8043OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f8044OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f8045OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f8046OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f8047Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f8048Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f8049OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public OooO f8050OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public List<OooO> f8051OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f8052Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f8053Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Drawable f8054OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public Object f8055Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooOO0 f8056o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public Rect f8057o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public Matrix f8058o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final OooO00o f8059o00Ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f8060o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final ArrayList<View> f8061ooOO;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final int[] f8028o00o0O = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final int[] f8031o00ooo = {R.attr.layout_gravity};

    public interface OooO {
        void OooO00o();

        void OooO0O0(@NonNull View view);

        void OooO0OO(@NonNull View view);

        void OooO0Oo(@NonNull View view);
    }

    public class OooO00o implements o000Oo0 {
        public OooO00o() {
        }

        @Override // p072o000O0o0.o000Oo0
        public final boolean perform(@NonNull View view, @Nullable o000Oo0.OooO00o oooO00o) {
            if (!DrawerLayout.this.OooOO0o(view) || DrawerLayout.this.OooO0oO(view) == 2) {
                return false;
            }
            DrawerLayout.this.OooO0O0(view);
            return true;
        }
    }

    public class OooO0O0 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f8055Ooooooo = windowInsets;
            drawerLayout.f8060o0OoOo0 = z;
            drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class OooO0OO extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f8067OooO0Oo = new Rect();

        public OooO0OO() {
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.OooO00o(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View viewOooO0o = DrawerLayout.this.OooO0o();
            if (viewOooO0o == null) {
                return true;
            }
            int iOooO0oo = DrawerLayout.this.OooO0oo(viewOooO0o);
            DrawerLayout drawerLayout = DrawerLayout.this;
            Objects.requireNonNull(drawerLayout);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            Gravity.getAbsoluteGravity(iOooO0oo, ViewCompat.OooO.OooO0Oo(drawerLayout));
            return true;
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
            super.OooO0OO(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            if (DrawerLayout.f8032oo000o) {
                this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            } else {
                o0000OO0 o0000oo0OooOo0o = o0000OO0.OooOo0o(o0000oo1);
                this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo0OooOo0o.f28194OooO00o);
                o0000oo1.f28196OooO0OO = -1;
                o0000oo1.f28194OooO00o.setSource(view);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                Object objOooO0o = ViewCompat.OooO0o.OooO0o(view);
                if (objOooO0o instanceof View) {
                    o0000oo1.OoooOO0((View) objOooO0o);
                }
                Rect rect = this.f8067OooO0Oo;
                o0000oo0OooOo0o.OooO0oo(rect);
                o0000oo1.OooOoo(rect);
                o0000oo1.OooooOo(o0000oo0OooOo0o.f28194OooO00o.isVisibleToUser());
                o0000oo1.OoooO0O(o0000oo0OooOo0o.OooOOO());
                o0000oo1.Oooo000(o0000oo0OooOo0o.OooO());
                o0000oo1.Oooo0O0(o0000oo0OooOo0o.OooOO0O());
                o0000oo1.Oooo0o0(o0000oo0OooOo0o.OooOOo0());
                o0000oo1.Oooo0oO(o0000oo0OooOo0o.OooOOoo());
                o0000oo1.OooOoO(o0000oo0OooOo0o.f28194OooO00o.isAccessibilityFocused());
                o0000oo1.OoooOoo(o0000oo0OooOo0o.OooOo00());
                o0000oo1.OooO00o(o0000oo0OooOo0o.OooO0o());
                o0000oo0OooOo0o.OooOo();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.OooOO0(childAt)) {
                        o0000oo1.OooO0OO(childAt);
                    }
                }
            }
            o0000oo1.Oooo000("androidx.drawerlayout.widget.DrawerLayout");
            o0000oo1.Oooo0o(false);
            o0000oo1.Oooo0oO(false);
            o0000oo1.OooOoO0(o0000OO0.OooO00o.f28199OooO0o0);
            o0000oo1.OooOoO0(o0000OO0.OooO00o.f28198OooO0o);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f8032oo000o || DrawerLayout.OooOO0(view)) {
                return super.OooO0o(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class OooO0o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            if (DrawerLayout.OooOO0(view)) {
                return;
            }
            o0000oo1.OoooOO0(null);
        }
    }

    public class OooOO0 extends o00000.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8069OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00000 f8070OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f8071OooO0OO = new OooO00o();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewOooO0Oo;
                int width;
                OooOO0 oooOO1 = OooOO0.this;
                int i = oooOO1.f8070OooO0O0.f39862OooOOOO;
                boolean z = oooOO1.f8069OooO00o == 3;
                if (z) {
                    viewOooO0Oo = DrawerLayout.this.OooO0Oo(3);
                    width = (viewOooO0Oo != null ? -viewOooO0Oo.getWidth() : 0) + i;
                } else {
                    viewOooO0Oo = DrawerLayout.this.OooO0Oo(5);
                    width = DrawerLayout.this.getWidth() - i;
                }
                if (viewOooO0Oo != null) {
                    if (((!z || viewOooO0Oo.getLeft() >= width) && (z || viewOooO0Oo.getLeft() <= width)) || DrawerLayout.this.OooO0oO(viewOooO0Oo) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewOooO0Oo.getLayoutParams();
                    oooOO1.f8070OooO0O0.OooOoO0(viewOooO0Oo, width, viewOooO0Oo.getTop());
                    layoutParams.f8064OooO0OO = true;
                    DrawerLayout.this.invalidate();
                    View viewOooO0Oo2 = DrawerLayout.this.OooO0Oo(oooOO1.f8069OooO00o == 3 ? 5 : 3);
                    if (viewOooO0Oo2 != null) {
                        DrawerLayout.this.OooO0O0(viewOooO0Oo2);
                    }
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (drawerLayout.f8049OooooO0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        drawerLayout.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f8049OooooO0 = true;
                }
            }
        }

        public OooOO0(int i) {
            this.f8069OooO00o = i;
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO(View view, int i, int i2) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.OooO00o(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.OooOOOo(view, width2);
            view.setVisibility(width2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO00o(View view, int i) {
            if (DrawerLayout.this.OooO00o(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0O0(View view, int i) {
            return view.getTop();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0OO(View view) {
            if (DrawerLayout.this.OooOOO0(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0o() {
            DrawerLayout.this.postDelayed(this.f8071OooO0OO, 160L);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0o0(int i, int i2) {
            View viewOooO0Oo = (i & 1) == 1 ? DrawerLayout.this.OooO0Oo(3) : DrawerLayout.this.OooO0Oo(5);
            if (viewOooO0Oo == null || DrawerLayout.this.OooO0oO(viewOooO0Oo) != 0) {
                return;
            }
            this.f8070OooO0O0.OooO0OO(viewOooO0Oo, i2);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oO(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f8064OooO0OO = false;
            View viewOooO0Oo = DrawerLayout.this.OooO0Oo(this.f8069OooO00o == 3 ? 5 : 3);
            if (viewOooO0Oo != null) {
                DrawerLayout.this.OooO0O0(viewOooO0Oo);
            }
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oo(int i) {
            DrawerLayout.this.OooOOoo(i, this.f8070OooO0O0.f39868OooOo00);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooOO0(View view, float f, float f2) {
            int i;
            Objects.requireNonNull(DrawerLayout.this);
            float f3 = ((LayoutParams) view.getLayoutParams()).f8063OooO0O0;
            int width = view.getWidth();
            if (DrawerLayout.this.OooO00o(view, 3)) {
                i = (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f8070OooO0O0.OooOo0o(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final boolean OooOO0O(View view, int i) {
            return DrawerLayout.this.OooOOO0(view) && DrawerLayout.this.OooO00o(view, this.f8069OooO00o) && DrawerLayout.this.OooO0oO(view) == 0;
        }

        public final void OooOO0o() {
            DrawerLayout.this.removeCallbacks(this.f8071OooO0OO);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f8032oo000o = true;
        f8030o00oO0o = true;
        f8029o00oO0O = i >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static String OooO(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean OooOO0(View view) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return (ViewCompat.OooO0o.OooO0OO(view) == 4 || ViewCompat.OooO0o.OooO0OO(view) == 2) ? false : true;
    }

    public final boolean OooO00o(View view, int i) {
        return (OooO0oo(view) & i) == i;
    }

    public final void OooO0O0(@NonNull View view) {
        if (!OooOOO0(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f8044OoooOo0) {
            layoutParams.f8063OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            layoutParams.f8065OooO0Oo = 0;
        } else {
            layoutParams.f8065OooO0Oo |= 4;
            if (OooO00o(view, 3)) {
                this.f8040OoooO0O.OooOoO0(view, -view.getWidth(), view.getTop());
            } else {
                this.f8037OoooO.OooOoO0(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void OooO0OO(boolean z) {
        int childCount = getChildCount();
        boolean zOooOoO0 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (OooOOO0(childAt) && (!z || layoutParams.f8064OooO0OO)) {
                zOooOoO0 |= OooO00o(childAt, 3) ? this.f8040OoooO0O.OooOoO0(childAt, -childAt.getWidth(), childAt.getTop()) : this.f8037OoooO.OooOoO0(childAt, getWidth(), childAt.getTop());
                layoutParams.f8064OooO0OO = false;
            }
        }
        this.f8041OoooOO0.OooOO0o();
        this.f8056o000oOoO.OooOO0o();
        if (zOooOoO0) {
            invalidate();
        }
    }

    public final View OooO0Oo(int i) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
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
            if (OooOOO0(childAt)) {
                if (!OooOOO0(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f8063OooO0O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
            if ((((LayoutParams) childAt.getLayoutParams()).f8065OooO0Oo & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final int OooO0oO(@NonNull View view) {
        if (!OooOOO0(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((LayoutParams) view.getLayoutParams()).f8062OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        if (i == 3) {
            int i2 = this.f8045OoooOoO;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iOooO0Oo == 0 ? this.f8047Ooooo00 : this.f8048Ooooo0o;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f8046OoooOoo;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iOooO0Oo == 0 ? this.f8048Ooooo0o : this.f8047Ooooo00;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f8047Ooooo00;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iOooO0Oo == 0 ? this.f8045OoooOoO : this.f8046OoooOoo;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f8048Ooooo0o;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iOooO0Oo == 0 ? this.f8046OoooOoo : this.f8045OoooOoO;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int OooO0oo(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f8062OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(this));
    }

    public final boolean OooOO0O(View view) {
        return ((LayoutParams) view.getLayoutParams()).f8062OooO00o == 0;
    }

    public final boolean OooOO0o(@NonNull View view) {
        if (OooOOO0(view)) {
            return (((LayoutParams) view.getLayoutParams()).f8065OooO0Oo & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void OooOOO(@NonNull View view) {
        if (!OooOOO0(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f8044OoooOo0) {
            layoutParams.f8063OooO0O0 = 1.0f;
            layoutParams.f8065OooO0Oo = 1;
            OooOOo(view, true);
            OooOOo0(view);
        } else {
            layoutParams.f8065OooO0Oo |= 2;
            if (OooO00o(view, 3)) {
                this.f8040OoooO0O.OooOoO0(view, 0, view.getTop());
            } else {
                this.f8037OoooO.OooOoO0(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final boolean OooOOO0(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f8062OooO00o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final void OooOOOO(int i, int i2) {
        View viewOooO0Oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, ViewCompat.OooO.OooO0Oo(this));
        if (i2 == 3) {
            this.f8045OoooOoO = i;
        } else if (i2 == 5) {
            this.f8046OoooOoo = i;
        } else if (i2 == 8388611) {
            this.f8047Ooooo00 = i;
        } else if (i2 == 8388613) {
            this.f8048Ooooo0o = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f8040OoooO0O : this.f8037OoooO).OooO0O0();
        }
        if (i != 1) {
            if (i == 2 && (viewOooO0Oo = OooO0Oo(absoluteGravity)) != null) {
                OooOOO(viewOooO0Oo);
                return;
            }
            return;
        }
        View viewOooO0Oo2 = OooO0Oo(absoluteGravity);
        if (viewOooO0Oo2 != null) {
            OooO0O0(viewOooO0Oo2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    public final void OooOOOo(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f8063OooO0O0) {
            return;
        }
        layoutParams.f8063OooO0O0 = f;
        ?? r4 = this.f8051OooooOo;
        if (r4 == 0) {
            return;
        }
        int size = r4.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((OooO) this.f8051OooooOo.get(size)).OooO0Oo(view);
            }
        }
    }

    public final void OooOOo(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || OooOOO0(childAt)) && !(z && childAt == view)) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(childAt, 4);
            } else {
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(childAt, 1);
            }
        }
    }

    public final void OooOOo0(View view) {
        o0000OO0.OooO00o oooO00o = o0000OO0.OooO00o.f28205OooOOO;
        ViewCompat.OooOo00(oooO00o.OooO00o(), view);
        ViewCompat.OooOOO(view, 0);
        if (!OooOO0o(view) || OooO0oO(view) == 2) {
            return;
        }
        ViewCompat.OooOo0(view, oooO00o, this.f8059o00Ooo);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    public final void OooOOoo(int i, View view) {
        View rootView;
        int i2 = this.f8040OoooO0O.f39849OooO00o;
        int i3 = this.f8037OoooO.f39849OooO00o;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (i2 != 2 && i3 != 2) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f8063OooO0O0;
            if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f8065OooO0Oo & 1) == 1) {
                    layoutParams.f8065OooO0Oo = 0;
                    ?? r6 = this.f8051OooooOo;
                    if (r6 != 0) {
                        for (int size = r6.size() - 1; size >= 0; size--) {
                            ((OooO) this.f8051OooooOo.get(size)).OooO0OO(view);
                        }
                    }
                    OooOOo(view, false);
                    OooOOo0(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f8065OooO0Oo & 1) == 0) {
                    layoutParams2.f8065OooO0Oo = 1;
                    ?? r7 = this.f8051OooooOo;
                    if (r7 != 0) {
                        for (int size2 = r7.size() - 1; size2 >= 0; size2--) {
                            ((OooO) this.f8051OooooOo.get(size2)).OooO0O0(view);
                        }
                    }
                    OooOOo(view, true);
                    OooOOo0(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != this.f8042OoooOOO) {
            this.f8042OoooOOO = i4;
            ?? r8 = this.f8051OooooOo;
            if (r8 != 0) {
                for (int size3 = r8.size() - 1; size3 >= 0; size3--) {
                    ((OooO) this.f8051OooooOo.get(size3)).OooO00o();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!OooOOO0(childAt)) {
                this.f8061ooOO.add(childAt);
            } else if (OooOO0o(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f8061ooOO.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f8061ooOO.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f8061ooOO.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (OooO0o0() != null || OooOOO0(view)) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOoo(view, 4);
        } else {
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOoo(view, 1);
        }
        if (f8032oo000o) {
            return;
        }
        ViewCompat.OooOo0o(view, this.f8034Oooo0o);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f8063OooO0O0);
        }
        this.f8039OoooO00 = fMax;
        boolean zOooO = this.f8040OoooO0O.OooO();
        boolean zOooO2 = this.f8037OoooO.OooO();
        if (zOooO || zOooO2) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f8039OoooO00 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
            if (this.f8057o00O0O == null) {
                this.f8057o00O0O = new Rect();
            }
            childAt.getHitRect(this.f8057o00O0O);
            if (this.f8057o00O0O.contains((int) x, (int) y) && !OooOO0O(childAt)) {
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
                        if (this.f8058o00Oo0 == null) {
                            this.f8058o00Oo0 = new Matrix();
                        }
                        matrix.invert(this.f8058o00Oo0);
                        motionEventObtain.transform(this.f8058o00Oo0);
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
        boolean zOooOO0O = OooOO0O(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zOooOO0O) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && OooOOO0(childAt) && childAt.getHeight() >= height) {
                        if (OooO00o(childAt, 3)) {
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
        float f = this.f8039OoooO00;
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && zOooOO0O) {
            int i4 = this.f8033Oooo;
            this.f8038OoooO0.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, getHeight(), this.f8038OoooO0);
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
        return f8030o00oO0o ? this.f8035Oooo0oO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f8054OoooooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8044OoooOo0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8044OoooOo0 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f8060o0OoOo0 || this.f8054OoooooO == null) {
            return;
        }
        Object obj = this.f8055Ooooooo;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f8054OoooooO.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f8054OoooooO.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewOooOO0o;
        boolean z2;
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zOooOo = this.f8040OoooO0O.OooOo(motionEvent) | this.f8037OoooO.OooOo(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                OooO0OO(true);
                this.f8049OooooO0 = false;
            } else if (actionMasked == 2) {
                o00000 o00000Var = this.f8040OoooO0O;
                int length = o00000Var.f39852OooO0Oo.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z3 = false;
                        break;
                    }
                    if (o00000Var.OooOOO(i)) {
                        float f = o00000Var.f39853OooO0o[i] - o00000Var.f39852OooO0Oo[i];
                        float f2 = o00000Var.f39855OooO0oO[i] - o00000Var.f39854OooO0o0[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = o00000Var.f39850OooO0O0;
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
                    this.f8041OoooOO0.OooOO0o();
                    this.f8056o000oOoO.OooOO0o();
                }
            } else if (actionMasked == 3) {
                OooO0OO(true);
                this.f8049OooooO0 = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f8053Oooooo0 = x;
            this.f8052Oooooo = y;
            z = this.f8039OoooO00 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (viewOooOO0o = this.f8040OoooO0O.OooOO0o((int) x, (int) y)) != null && OooOO0O(viewOooOO0o);
            this.f8049OooooO0 = false;
        }
        if (zOooOo || z) {
            return true;
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                z2 = false;
                break;
            }
            if (((LayoutParams) getChildAt(i3).getLayoutParams()).f8064OooO0OO) {
                z2 = true;
                break;
            }
            i3++;
        }
        return z2 || this.f8049OooooO0;
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
        this.f8043OoooOOo = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (OooOO0O(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (OooO00o(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f8063OooO0O0 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f8063OooO0O0 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != layoutParams.f8063OooO0O0;
                    int i10 = layoutParams.f8062OooO00o & 112;
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
                    if (z2) {
                        OooOOOo(childAt, f);
                    }
                    int i18 = layoutParams.f8063OooO0O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f8029o00oO0O && (rootWindowInsets = getRootWindowInsets()) != null) {
            p071o000O0o.OooO oooOOooOO0 = WindowInsetsCompat.OooOOOO(rootWindowInsets, null).f7918OooO00o.OooOO0();
            o00000 o00000Var = this.f8040OoooO0O;
            o00000Var.f39862OooOOOO = Math.max(o00000Var.f39863OooOOOo, oooOOooOO0.f28162OooO00o);
            o00000 o00000Var2 = this.f8037OoooO;
            o00000Var2.f39862OooOOOO = Math.max(o00000Var2.f39863OooOOOo, oooOOooOO0.f28164OooO0OO);
        }
        this.f8043OoooOOo = false;
        this.f8044OoooOo0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
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
                size = ShopVehicleListModel.VehicleTagType_Vip300;
            }
            if (mode2 == 0) {
                size2 = ShopVehicleListModel.VehicleTagType_Vip300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.f8055Ooooooo != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f8062OooO00o, iOooO0Oo);
                    if (ViewCompat.OooO0o.OooO0O0(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f8055Ooooooo;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i3, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i3, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f8055Ooooooo;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i3, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i3, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (OooOO0O(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!OooOOO0(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f8030o00oO0o) {
                        float fOooO = ViewCompat.OooOOO.OooO(childAt);
                        float f = this.f8035Oooo0oO;
                        if (fOooO != f) {
                            ViewCompat.OooOOO.OooOOoo(childAt, f);
                        }
                    }
                    int iOooO0oo = OooO0oo(childAt) & 7;
                    boolean z4 = iOooO0oo == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Child drawer has absolute gravity ");
                        sbOooO0o0.append(OooO(iOooO0oo));
                        sbOooO0o0.append(" but this ");
                        sbOooO0o0.append("DrawerLayout");
                        sbOooO0o0.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(sbOooO0o0.toString());
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f8036Oooo0oo + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
            i4++;
            i3 = 0;
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
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        int i = savedState.f8075Oooo0oo;
        if (i != 0 && (viewOooO0Oo = OooO0Oo(i)) != null) {
            OooOOO(viewOooO0Oo);
        }
        int i2 = savedState.f8074Oooo;
        if (i2 != 3) {
            OooOOOO(i2, 3);
        }
        int i3 = savedState.f8077OoooO00;
        if (i3 != 3) {
            OooOOOO(i3, 5);
        }
        int i4 = savedState.f8076OoooO0;
        if (i4 != 3) {
            OooOOOO(i4, 8388611);
        }
        int i5 = savedState.f8078OoooO0O;
        if (i5 != 3) {
            OooOOOO(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f8030o00oO0o) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooO0Oo(this);
        ViewCompat.OooO.OooO0Oo(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f8065OooO0Oo;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f8075Oooo0oo = layoutParams.f8062OooO00o;
                break;
            }
        }
        savedState.f8074Oooo = this.f8045OoooOoO;
        savedState.f8077OoooO00 = this.f8046OoooOoo;
        savedState.f8076OoooO0 = this.f8047Ooooo00;
        savedState.f8078OoooO0O = this.f8048Ooooo0o;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewOooO0o0;
        this.f8040OoooO0O.OooOOo0(motionEvent);
        this.f8037OoooO.OooOOo0(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f8053Oooooo0 = x;
            this.f8052Oooooo = y;
            this.f8049OooooO0 = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View viewOooOO0o = this.f8040OoooO0O.OooOO0o((int) x2, (int) y2);
            if (viewOooOO0o != null && OooOO0O(viewOooOO0o)) {
                float f = x2 - this.f8053Oooooo0;
                float f2 = y2 - this.f8052Oooooo;
                int i = this.f8040OoooO0O.f39850OooO0O0;
                z = (f2 * f2) + (f * f) >= ((float) (i * i)) || (viewOooO0o0 = OooO0o0()) == null || OooO0oO(viewOooO0o0) == 2;
            }
            OooO0OO(z);
        } else if (action == 3) {
            OooO0OO(true);
            this.f8049OooooO0 = false;
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
        if (this.f8043OoooOOo) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f8035Oooo0oO = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (OooOOO0(childAt)) {
                float f2 = this.f8035Oooo0oO;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO.OooOOoo(childAt, f2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.drawerlayout.widget.DrawerLayout$OooO>] */
    @Deprecated
    public void setDrawerListener(OooO oooO) {
        ?? r1;
        OooO oooO2 = this.f8050OooooOO;
        if (oooO2 != null && (r1 = this.f8051OooooOo) != 0) {
            r1.remove(oooO2);
        }
        if (oooO != null) {
            if (this.f8051OooooOo == null) {
                this.f8051OooooOo = new ArrayList();
            }
            this.f8051OooooOo.add(oooO);
        }
        this.f8050OooooOO = oooO;
    }

    public void setDrawerLockMode(int i) {
        OooOOOO(i, 3);
        OooOOOO(i, 5);
    }

    public void setScrimColor(@ColorInt int i) {
        this.f8033Oooo = i;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f8054OoooooO = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f8054OoooooO = new ColorDrawable(i);
        invalidate();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOOO.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8034Oooo0o = new OooO0o();
        this.f8033Oooo = -1728053248;
        this.f8038OoooO0 = new Paint();
        this.f8044OoooOo0 = true;
        this.f8045OoooOoO = 3;
        this.f8046OoooOoo = 3;
        this.f8047Ooooo00 = 3;
        this.f8048Ooooo0o = 3;
        this.f8059o00Ooo = new OooO00o();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f8036Oooo0oo = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        OooOO0 oooOO1 = new OooOO0(3);
        this.f8041OoooOO0 = oooOO1;
        OooOO0 oooOO2 = new OooOO0(5);
        this.f8056o000oOoO = oooOO2;
        o00000 o00000VarOooOO0 = o00000.OooOO0(this, 1.0f, oooOO1);
        this.f8040OoooO0O = o00000VarOooOO0;
        o00000VarOooOO0.f39865OooOOo0 = 1;
        o00000VarOooOO0.f39860OooOOO = f2;
        oooOO1.f8070OooO0O0 = o00000VarOooOO0;
        o00000 o00000VarOooOO1 = o00000.OooOO0(this, 1.0f, oooOO2);
        this.f8037OoooO = o00000VarOooOO1;
        o00000VarOooOO1.f39865OooOOo0 = 2;
        o00000VarOooOO1.f39860OooOOO = f2;
        oooOO2.f8070OooO0O0 = o00000VarOooOO1;
        setFocusableInTouchMode(true);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
        ViewCompat.OooOo0o(this, new OooO0OO());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.OooO0o.OooO0O0(this)) {
            setOnApplyWindowInsetsListener(new OooO0O0());
            setSystemUiVisibility(LogType.UNEXP_ANR);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f8028o00o0O);
            try {
                this.f8054OoooooO = typedArrayObtainStyledAttributes.getDrawable(0);
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
                this.f8035Oooo0oO = typedArrayObtainStyledAttributes2.getDimension(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                this.f8035Oooo0oO = getResources().getDimension(OooOOOO.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f8061ooOO = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawableOooO0O0;
        if (i != 0) {
            Context context = getContext();
            Object obj = o000O000.OooO00o.f28085OooO00o;
            drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
        } else {
            drawableOooO0O0 = null;
        }
        this.f8054OoooooO = drawableOooO0O0;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8062OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f8063OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8064OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8065OooO0Oo;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8062OooO00o = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f8031o00ooo);
            this.f8062OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f8062OooO00o = 0;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f8062OooO00o = 0;
            this.f8062OooO00o = layoutParams.f8062OooO00o;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8062OooO00o = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8062OooO00o = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f8074Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f8075Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f8076OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f8077OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f8078OoooO0O;

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
            this.f8075Oooo0oo = 0;
            this.f8075Oooo0oo = parcel.readInt();
            this.f8074Oooo = parcel.readInt();
            this.f8077OoooO00 = parcel.readInt();
            this.f8076OoooO0 = parcel.readInt();
            this.f8078OoooO0O = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f8075Oooo0oo);
            parcel.writeInt(this.f8074Oooo);
            parcel.writeInt(this.f8077OoooO00);
            parcel.writeInt(this.f8076OoooO0);
            parcel.writeInt(this.f8078OoooO0O);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f8075Oooo0oo = 0;
        }
    }
}
