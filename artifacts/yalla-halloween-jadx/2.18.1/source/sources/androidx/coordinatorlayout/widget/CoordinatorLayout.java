package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.uc.crashsdk.export.LogType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o00O0O;
import o000O0O0.o00Ooo;
import o000O0O0.o0OoOo0;
import o000O0O0.oo000o;
import o000OO0O.OooOO0O;
import p016OooOoO0.OooOo00;
import p066o0000oOO.OooOo;
import p066o0000oOO.Oooo0;
import p066o0000oOO.Oooo000;
import p067o0000oOo.o000oOoO;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o0OoOo0, o00O0O {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final String f7733OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f7734Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Class<?>[] f7735Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final Comparator<View> f7736OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final o000OO0O.OooO<Rect> f7737Ooooooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final List<View> f7738Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<View> f7739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o000oOoO<View> f7740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final List<View> f7741Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f7742OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int[] f7743OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int[] f7744OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f7745OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int[] f7746OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f7747OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO f7748OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f7749OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public WindowInsetsCompat f7750OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f7751OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Drawable f7752Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f7753Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public OooO00o f7754OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o00Ooo f7755OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f7756o000oOoO;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return false;
        }

        public boolean OooO00o(@NonNull View view, @NonNull Rect rect) {
            return false;
        }

        public boolean OooO0O0(@NonNull View view, @NonNull View view2) {
            return false;
        }

        public void OooO0OO(@NonNull OooO0o oooO0o) {
        }

        public boolean OooO0Oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public void OooO0o() {
        }

        public void OooO0o0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        }

        public boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean OooOO0(@NonNull View view) {
            return false;
        }

        public void OooOO0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        }

        @Deprecated
        public void OooOO0o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
        }

        public boolean OooOOO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public void OooOOO0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            OooOO0o(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void OooOOOO(@NonNull View view, @NonNull Parcelable parcelable) {
        }

        @Nullable
        public Parcelable OooOOOo(@NonNull View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public void OooOOo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        }

        public boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            return false;
        }

        public boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    public class OooO implements ViewTreeObserver.OnPreDrawListener {
        public OooO() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.OooOo0O(0);
            return true;
        }
    }

    public class OooO00o implements oo000o {
        public OooO00o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!o000OO0O.OooO0OO.OooO00o(coordinatorLayout.f7750OoooOoO, windowInsetsCompat)) {
                coordinatorLayout.f7750OoooOoO = windowInsetsCompat;
                boolean z = windowInsetsCompat.OooO() > 0;
                coordinatorLayout.f7751OoooOoo = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!windowInsetsCompat.OooOO0O()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(childAt) && ((OooO0o) childAt.getLayoutParams()).f7761OooO00o != null && windowInsetsCompat.OooOO0O()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    public interface OooO0O0 {
        @NonNull
        Behavior getBehavior();
    }

    public class OooO0OO implements ViewGroup.OnHierarchyChangeListener {
        public OooO0OO() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f7753Ooooo0o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.OooOo0O(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f7753Ooooo0o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class OooOO0 implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            float fOooOOO0 = ViewCompat.OooOOO.OooOOO0(view);
            float fOooOOO1 = ViewCompat.OooOOO.OooOOO0(view2);
            if (fOooOOO0 > fOooOOO1) {
                return -1;
            }
            return fOooOOO0 < fOooOOO1 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f7733OooooOo = r0 != null ? r0.getName() : null;
        f7736OoooooO = new OooOO0();
        f7735Oooooo0 = new Class[]{Context.class, AttributeSet.class};
        f7734Oooooo = new ThreadLocal<>();
        f7737Ooooooo = new OooOO0O(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public static Rect OooO0o0() {
        Rect rectOooO0O0 = f7737Ooooooo.OooO0O0();
        return rectOooO0O0 == null ? new Rect() : rectOooO0O0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final List<View> OooO(@NonNull View view) {
        o000oOoO<View> o000oooo2 = this.f7740Oooo0oO;
        int i = o000oooo2.f27941OooO0O0.f421Oooo0oo;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListOooOOO0 = o000oooo2.f27941OooO0O0.OooOOO0(i2);
            if (arrayListOooOOO0 != null && arrayListOooOOO0.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o000oooo2.f27941OooO0O0.OooO(i2));
            }
        }
        this.f7738Oooo.clear();
        if (arrayList != null) {
            this.f7738Oooo.addAll(arrayList);
        }
        return this.f7738Oooo;
    }

    public final void OooO0o(OooO0o oooO0o, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void OooO0oO(@NonNull View view) {
        ArrayList<View> orDefault = this.f7740Oooo0oO.f27941OooO0O0.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i = 0; i < orDefault.size(); i++) {
            View view2 = orDefault.get(i);
            Behavior behavior = ((OooO0o) view2.getLayoutParams()).f7761OooO00o;
            if (behavior != null) {
                behavior.OooO0Oo(this, view2, view);
            }
        }
    }

    public final void OooO0oo(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            OooOOo0(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // o000O0O0.o00O0O
    public final void OooOO0(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i5) && (behavior = oooO0o.f7761OooO00o) != null) {
                    int[] iArr2 = this.f7744OoooO00;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.OooOOO0(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f7744OoooO00;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, this.f7744OoooO00[1]) : Math.min(iMax2, this.f7744OoooO00[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            OooOo0O(1);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOO0O(View view, int i, int i2, int i3, int i4, int i5) {
        OooOO0(view, i, i2, i3, i4, 0, this.f7743OoooO0);
    }

    @Override // o000O0O0.o0OoOo0
    public final boolean OooOO0o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                Behavior behavior = oooO0o.f7761OooO00o;
                if (behavior != null) {
                    boolean zOooOOo0 = behavior.OooOOo0(this, childAt, view, view2, i, i2);
                    z |= zOooOOo0;
                    oooO0o.OooO0OO(i2, zOooOOo0);
                } else {
                    oooO0o.OooO0OO(i2, false);
                }
            }
        }
        return z;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO(View view, int i) {
        this.f7755OooooOO.OooO0O0(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
            if (oooO0o.OooO00o(i)) {
                Behavior behavior = oooO0o.f7761OooO00o;
                if (behavior != null) {
                    behavior.OooOOo(this, childAt, view, i);
                }
                oooO0o.OooO0OO(i, false);
                oooO0o.f7775OooOOOo = false;
            }
        }
        this.f7747OoooOOO = null;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO0(View view, View view2, int i, int i2) {
        this.f7755OooooOO.OooO00o(i, i2);
        this.f7747OoooOOO = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Objects.requireNonNull((OooO0o) getChildAt(i3).getLayoutParams());
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOOO(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i3) && (behavior = oooO0o.f7761OooO00o) != null) {
                    int[] iArr2 = this.f7744OoooO00;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.OooOO0O(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f7744OoooO00;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f7744OoooO00;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            OooOo0O(1);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final List<View> OooOOOo(@NonNull View view) {
        ArrayList<View> orDefault = this.f7740Oooo0oO.f27941OooO0O0.getOrDefault(view, null);
        this.f7738Oooo.clear();
        if (orDefault != null) {
            this.f7738Oooo.addAll(orDefault);
        }
        return this.f7738Oooo;
    }

    public final void OooOOo(int i, Rect rect, Rect rect2, OooO0o oooO0o, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = oooO0o.f7763OooO0OO;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = oooO0o.f7764OooO0Oo;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public final void OooOOo0(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = p067o0000oOo.o0OoOo0.f27944OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = p067o0000oOo.o0OoOo0.f27944OooO00o;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        p067o0000oOo.o0OoOo0.OooO00o(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = p067o0000oOo.o0OoOo0.f27945OooO0O0;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int OooOOoo(int i) {
        int[] iArr = this.f7746OoooOO0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final void OooOo(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean OooOo0(@NonNull View view, int i, int i2) {
        Rect rectOooO0o0 = OooO0o0();
        OooOOo0(view, rectOooO0o0);
        try {
            return rectOooO0o0.contains(i, i2);
        } finally {
            rectOooO0o0.setEmpty();
            f7737Ooooooo.OooO00o(rectOooO0o0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0o OooOo00(View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        if (!oooO0o.f7762OooO0O0) {
            if (view instanceof OooO0O0) {
                Behavior behavior = ((OooO0O0) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                oooO0o.OooO0O0(behavior);
                oooO0o.f7762OooO0O0 = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        oooO0o.OooO0O0(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Default behavior class ");
                        sbOooO0o0.append(defaultBehavior.value().getName());
                        sbOooO0o0.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sbOooO0o0.toString(), e);
                    }
                }
                oooO0o.f7762OooO0O0 = true;
            }
        }
        return oooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public final void OooOo0O(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean zOooO0Oo;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Behavior behavior;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int size = this.f7739Oooo0o.size();
        Rect rectOooO0o0 = OooO0o0();
        Rect rectOooO0o1 = OooO0o0();
        Rect rectOooO0o2 = OooO0o0();
        int i10 = i;
        int i11 = 0;
        while (i11 < size) {
            View view = (View) this.f7739Oooo0o.get(i11);
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            if (i10 == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = rectOooO0o2;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (oooO0o.f7771OooOO0o == ((View) this.f7739Oooo0o.get(i12))) {
                        OooO0o oooO0o2 = (OooO0o) view.getLayoutParams();
                        if (oooO0o2.f7770OooOO0O != null) {
                            Rect rectOooO0o3 = OooO0o0();
                            Rect rectOooO0o4 = OooO0o0();
                            Rect rectOooO0o5 = OooO0o0();
                            OooOOo0(oooO0o2.f7770OooOO0O, rectOooO0o3);
                            OooO0oo(view, false, rectOooO0o4);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            OooOOo(iOooO0Oo, rectOooO0o3, rectOooO0o5, oooO0o2, measuredWidth, measuredHeight);
                            boolean z3 = (rectOooO0o5.left == rectOooO0o4.left && rectOooO0o5.top == rectOooO0o4.top) ? false : true;
                            OooO0o(oooO0o2, rectOooO0o5, measuredWidth, measuredHeight);
                            int i13 = rectOooO0o5.left - rectOooO0o4.left;
                            int i14 = rectOooO0o5.top - rectOooO0o4.top;
                            if (i13 != 0) {
                                ViewCompat.OooOOOO(view, i13);
                            }
                            if (i14 != 0) {
                                ViewCompat.OooOOOo(view, i14);
                            }
                            if (z3 && (behavior = oooO0o2.f7761OooO00o) != null) {
                                behavior.OooO0Oo(this, view, oooO0o2.f7770OooOO0O);
                            }
                            rectOooO0o3.setEmpty();
                            o000OO0O.OooO<Rect> oooO = f7737Ooooooo;
                            oooO.OooO00o(rectOooO0o3);
                            rectOooO0o4.setEmpty();
                            oooO.OooO00o(rectOooO0o4);
                            rectOooO0o5.setEmpty();
                            oooO.OooO00o(rectOooO0o5);
                        }
                    }
                    i12++;
                    oooO0o = oooO0o;
                    size = size;
                    i11 = i11;
                    rectOooO0o2 = rectOooO0o2;
                }
                int i15 = size;
                Rect rect2 = rectOooO0o2;
                i2 = i11;
                OooO0o oooO0o3 = oooO0o;
                OooO0oo(view, true, rectOooO0o1);
                if (oooO0o3.f7767OooO0oO != 0 && !rectOooO0o1.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(oooO0o3.f7767OooO0oO, iOooO0Oo);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectOooO0o0.top = Math.max(rectOooO0o0.top, rectOooO0o1.bottom);
                    } else if (i16 == 80) {
                        rectOooO0o0.bottom = Math.max(rectOooO0o0.bottom, getHeight() - rectOooO0o1.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectOooO0o0.left = Math.max(rectOooO0o0.left, rectOooO0o1.right);
                    } else if (i17 == 5) {
                        rectOooO0o0.right = Math.max(rectOooO0o0.right, getWidth() - rectOooO0o1.left);
                    }
                }
                if (oooO0o3.f7768OooO0oo != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooOO0O.OooO0OO(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        OooO0o oooO0o4 = (OooO0o) view.getLayoutParams();
                        Behavior behavior2 = oooO0o4.f7761OooO00o;
                        Rect rectOooO0o6 = OooO0o0();
                        Rect rectOooO0o7 = OooO0o0();
                        rectOooO0o7.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.OooO00o(view, rectOooO0o6)) {
                            rectOooO0o6.set(rectOooO0o7);
                        } else if (!rectOooO0o7.contains(rectOooO0o6)) {
                            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Rect should be within the child's bounds. Rect:");
                            sbOooO0o0.append(rectOooO0o6.toShortString());
                            sbOooO0o0.append(" | Bounds:");
                            sbOooO0o0.append(rectOooO0o7.toShortString());
                            throw new IllegalArgumentException(sbOooO0o0.toString());
                        }
                        rectOooO0o7.setEmpty();
                        o000OO0O.OooO<Rect> oooO2 = f7737Ooooooo;
                        oooO2.OooO00o(rectOooO0o7);
                        if (rectOooO0o6.isEmpty()) {
                            rectOooO0o6.setEmpty();
                            oooO2.OooO00o(rectOooO0o6);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(oooO0o4.f7768OooO0oo, iOooO0Oo);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectOooO0o6.top - ((ViewGroup.MarginLayoutParams) oooO0o4).topMargin) - oooO0o4.f7769OooOO0) >= (i9 = rectOooO0o0.top)) {
                                z = false;
                            } else {
                                OooOoo(view, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectOooO0o6.bottom) - ((ViewGroup.MarginLayoutParams) oooO0o4).bottomMargin) + oooO0o4.f7769OooOO0) < (i7 = rectOooO0o0.bottom)) {
                                OooOoo(view, height - i7);
                                z = true;
                            }
                            if (!z) {
                                OooOoo(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectOooO0o6.left - ((ViewGroup.MarginLayoutParams) oooO0o4).leftMargin) - oooO0o4.f7760OooO) >= (i6 = rectOooO0o0.left)) {
                                z2 = false;
                            } else {
                                OooOoo0(view, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectOooO0o6.right) - ((ViewGroup.MarginLayoutParams) oooO0o4).rightMargin) + oooO0o4.f7760OooO) < (i4 = rectOooO0o0.right)) {
                                OooOoo0(view, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                OooOoo0(view, 0);
                            }
                            rectOooO0o6.setEmpty();
                            oooO2.OooO00o(rectOooO0o6);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect2;
                    rect.set(((OooO0o) view.getLayoutParams()).f7776OooOOo0);
                    if (rect.equals(rectOooO0o1)) {
                        i3 = i15;
                    } else {
                        ((OooO0o) view.getLayoutParams()).f7776OooOOo0.set(rectOooO0o1);
                    }
                    i10 = i;
                } else {
                    rect = rect2;
                }
                i3 = i15;
                for (int i18 = i2 + 1; i18 < i3; i18++) {
                    View view2 = (View) this.f7739Oooo0o.get(i18);
                    OooO0o oooO0o5 = (OooO0o) view2.getLayoutParams();
                    Behavior behavior3 = oooO0o5.f7761OooO00o;
                    if (behavior3 != null && behavior3.OooO0O0(view2, view)) {
                        if (i == 0 && oooO0o5.f7775OooOOOo) {
                            oooO0o5.f7775OooOOOo = false;
                        } else {
                            if (i != 2) {
                                zOooO0Oo = behavior3.OooO0Oo(this, view2, view);
                            } else {
                                behavior3.OooO0o0(this, view);
                                zOooO0Oo = true;
                            }
                            if (i == 1) {
                                oooO0o5.f7775OooOOOo = zOooO0Oo;
                            }
                        }
                    }
                }
                i10 = i;
            }
            i11 = i2 + 1;
            size = i3;
            rectOooO0o2 = rect;
        }
        Rect rect3 = rectOooO0o2;
        rectOooO0o0.setEmpty();
        o000OO0O.OooO<Rect> oooO3 = f7737Ooooooo;
        oooO3.OooO00o(rectOooO0o0);
        rectOooO0o1.setEmpty();
        oooO3.OooO00o(rectOooO0o1);
        rect3.setEmpty();
        oooO3.OooO00o(rect3);
    }

    public final void OooOo0o(@NonNull View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        View view2 = oooO0o.f7770OooOO0O;
        int i2 = 0;
        if (view2 == null && oooO0o.f7765OooO0o != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectOooO0o0 = OooO0o0();
            Rect rectOooO0o1 = OooO0o0();
            try {
                OooOOo0(view2, rectOooO0o0);
                OooO0o oooO0o2 = (OooO0o) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                OooOOo(i, rectOooO0o0, rectOooO0o1, oooO0o2, measuredWidth, measuredHeight);
                OooO0o(oooO0o2, rectOooO0o1, measuredWidth, measuredHeight);
                view.layout(rectOooO0o1.left, rectOooO0o1.top, rectOooO0o1.right, rectOooO0o1.bottom);
                return;
            } finally {
                rectOooO0o0.setEmpty();
                o000OO0O.OooO<Rect> oooO = f7737Ooooooo;
                oooO.OooO00o(rectOooO0o0);
                rectOooO0o1.setEmpty();
                oooO.OooO00o(rectOooO0o1);
            }
        }
        int i3 = oooO0o.f7766OooO0o0;
        if (i3 < 0) {
            OooO0o oooO0o3 = (OooO0o) view.getLayoutParams();
            Rect rectOooO0o2 = OooO0o0();
            rectOooO0o2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o3).bottomMargin);
            if (this.f7750OoooOoO != null) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO0o.OooO0O0(this) && !ViewCompat.OooO0o.OooO0O0(view)) {
                    rectOooO0o2.left = this.f7750OoooOoO.OooO0oO() + rectOooO0o2.left;
                    rectOooO0o2.top = this.f7750OoooOoO.OooO() + rectOooO0o2.top;
                    rectOooO0o2.right -= this.f7750OoooOoO.OooO0oo();
                    rectOooO0o2.bottom -= this.f7750OoooOoO.OooO0o();
                }
            }
            Rect rectOooO0o3 = OooO0o0();
            int i4 = oooO0o3.f7763OooO0OO;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            o000O0O0.OooO0o.OooO0O0(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectOooO0o2, rectOooO0o3, i);
            view.layout(rectOooO0o3.left, rectOooO0o3.top, rectOooO0o3.right, rectOooO0o3.bottom);
            rectOooO0o2.setEmpty();
            o000OO0O.OooO<Rect> oooO2 = f7737Ooooooo;
            oooO2.OooO00o(rectOooO0o2);
            rectOooO0o3.setEmpty();
            oooO2.OooO00o(rectOooO0o3);
            return;
        }
        OooO0o oooO0o4 = (OooO0o) view.getLayoutParams();
        int i5 = oooO0o4.f7763OooO0OO;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iOooOOoo = OooOOoo(i3) - measuredWidth2;
        if (i6 == 1) {
            iOooOOoo += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iOooOOoo += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o4).leftMargin, Math.min(iOooOOoo, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) oooO0o4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) oooO0o4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v12 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void OooOoO() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOoO():void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List, java.util.List<android.view.View>] */
    public final boolean OooOoO0(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ?? r4 = this.f7741Oooo0oo;
        r4.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            r4.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = f7736OoooooO;
        if (comparator != null) {
            Collections.sort(r4, comparator);
        }
        int size = r4.size();
        MotionEvent motionEventObtain = null;
        boolean zOooO0oO = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) r4.get(i3);
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            Behavior behavior = oooO0o.f7761OooO00o;
            if (!(zOooO0oO || z2) || actionMasked == 0) {
                if (!zOooO0oO && behavior != null) {
                    if (i == 0) {
                        zOooO0oO = behavior.OooO0oO(this, view, motionEvent);
                    } else if (i == 1) {
                        zOooO0oO = behavior.OooOOoo(this, view, motionEvent);
                    }
                    if (zOooO0oO) {
                        this.f7756o000oOoO = view;
                    }
                }
                if (oooO0o.f7761OooO00o == null) {
                    oooO0o.f7773OooOOO0 = false;
                }
                boolean z3 = oooO0o.f7773OooOOO0;
                if (z3) {
                    z = true;
                } else {
                    z = z3 | false;
                    oooO0o.f7773OooOOO0 = z;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                }
                if (i == 0) {
                    behavior.OooO0oO(this, view, motionEventObtain);
                } else if (i == 1) {
                    behavior.OooOOoo(this, view, motionEventObtain);
                }
            }
        }
        r4.clear();
        return zOooO0oO;
    }

    public final void OooOoOO(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((OooO0o) childAt.getLayoutParams()).f7761OooO00o;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                if (z) {
                    behavior.OooO0oO(this, childAt, motionEventObtain);
                } else {
                    behavior.OooOOoo(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((OooO0o) getChildAt(i2).getLayoutParams()).f7773OooOOO0 = false;
        }
        this.f7756o000oOoO = null;
        this.f7745OoooO0O = false;
    }

    public final void OooOoo(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f7769OooOO0;
        if (i2 != i) {
            ViewCompat.OooOOOo(view, i - i2);
            oooO0o.f7769OooOO0 = i;
        }
    }

    public final void OooOoo0(View view, int i) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f7760OooO;
        if (i2 != i) {
            ViewCompat.OooOOOO(view, i - i2);
            oooO0o.f7760OooO = i;
        }
    }

    public final void OooOooO() {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooO0o.OooO0O0(this)) {
            ViewCompat.OooOOO.OooOo0(this, null);
            return;
        }
        if (this.f7754OooooO0 == null) {
            this.f7754OooooO0 = new OooO00o();
        }
        ViewCompat.OooOOO.OooOo0(this, this.f7754OooooO0);
        setSystemUiVisibility(LogType.UNEXP_ANR);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooO0o) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((OooO0o) view.getLayoutParams()).f7761OooO00o;
        if (behavior != null) {
            Objects.requireNonNull(behavior);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7752Ooooo00;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO0o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0o(getContext(), attributeSet);
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        OooOoO();
        return Collections.unmodifiableList(this.f7739Oooo0o);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f7750OoooOoO;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00Ooo o00ooo2 = this.f7755OooooOO;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f7752Ooooo00;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOoOO(false);
        if (this.f7749OoooOo0) {
            if (this.f7748OoooOOo == null) {
                this.f7748OoooOOo = new OooO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f7748OoooOOo);
        }
        if (this.f7750OoooOoO == null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this)) {
                ViewCompat.OooOOO0.OooO0OO(this);
            }
        }
        this.f7742OoooO = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOoOO(false);
        if (this.f7749OoooOo0 && this.f7748OoooOOo != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f7748OoooOOo);
        }
        View view = this.f7747OoooOOO;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f7742OoooO = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f7751OoooOoo || this.f7752Ooooo00 == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f7750OoooOoO;
        int iOooO = windowInsetsCompat != null ? windowInsetsCompat.OooO() : 0;
        if (iOooO > 0) {
            this.f7752Ooooo00.setBounds(0, 0, getWidth(), iOooO);
            this.f7752Ooooo00.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOoOO(true);
        }
        boolean zOooOoO0 = OooOoO0(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            OooOoOO(true);
        }
        return zOooOoO0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int size = this.f7739Oooo0o.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f7739Oooo0o.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((OooO0o) view.getLayoutParams()).f7761OooO00o) == null || !behavior.OooO0oo(this, view, iOooO0Oo))) {
                OooOo0o(view, iOooO0Oo);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        OooOoO();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i13);
            o000oOoO<View> o000oooo2 = this.f7740Oooo0oO;
            int i14 = o000oooo2.f27941OooO0O0.f421Oooo0oo;
            int i15 = 0;
            while (true) {
                if (i15 < i14) {
                    ArrayList<View> arrayListOooOOO0 = o000oooo2.f27941OooO0O0.OooOOO0(i15);
                    if (arrayListOooOOO0 != null && arrayListOooOOO0.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i15++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != this.f7749OoooOo0) {
            if (z) {
                if (this.f7742OoooO) {
                    if (this.f7748OoooOOo == null) {
                        this.f7748OoooOOo = new OooO();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f7748OoooOOo);
                }
                this.f7749OoooOo0 = true;
            } else {
                if (this.f7742OoooO && this.f7748OoooOOo != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f7748OoooOOo);
                }
                this.f7749OoooOo0 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        boolean z3 = iOooO0Oo == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f7750OoooOoO != null && ViewCompat.OooO0o.OooO0O0(this);
        int size3 = this.f7739Oooo0o.size();
        int iMax2 = suggestedMinimumWidth;
        int iMax3 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i18 = 0;
        while (i18 < size3) {
            View view = (View) this.f7739Oooo0o.get(i18);
            if (view.getVisibility() == 8) {
                i12 = i18;
                i5 = size3;
                i10 = paddingLeft;
                i6 = paddingRight;
                i7 = iOooO0Oo;
            } else {
                OooO0o oooO0o = (OooO0o) view.getLayoutParams();
                int i19 = oooO0o.f7766OooO0o0;
                if (i19 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                    i4 = i18;
                } else {
                    int iOooOOoo = OooOOoo(i19);
                    i3 = iCombineMeasuredStates;
                    int i20 = oooO0o.f7763OooO0OO;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, iOooO0Oo) & 7;
                    i4 = i18;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iOooOOoo);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iOooOOoo - paddingLeft);
                    }
                    if (z4 || ViewCompat.OooO0o.OooO0O0(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iOooO0oo = this.f7750OoooOoO.OooO0oo() + this.f7750OoooOoO.OooO0oO();
                        int iOooO0o = this.f7750OoooOoO.OooO0o() + this.f7750OoooOoO.OooO();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iOooO0oo, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iOooO0o, mode2);
                    }
                    behavior = oooO0o.f7761OooO00o;
                    if (behavior != null) {
                        int i21 = i3;
                        i12 = i4;
                        i10 = paddingLeft;
                        i11 = i21;
                        i6 = paddingRight;
                        i8 = iMax3;
                        i7 = iOooO0Oo;
                        i9 = iMax2;
                        i5 = size3;
                        if (!behavior.OooO(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                        }
                        iMax2 = Math.max(i9, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                        iMax3 = Math.max(i8, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                    } else {
                        i5 = size3;
                        i6 = paddingRight;
                        i7 = iOooO0Oo;
                        i8 = iMax3;
                        i9 = iMax2;
                        int i22 = i4;
                        i10 = paddingLeft;
                        i11 = i3;
                        i12 = i22;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    iMax2 = Math.max(i9, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    iMax3 = Math.max(i8, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behavior = oooO0o.f7761OooO00o;
                if (behavior != null) {
                    int i23 = i3;
                    i12 = i4;
                    i10 = paddingLeft;
                    i11 = i23;
                    i6 = paddingRight;
                    i8 = iMax3;
                    i7 = iOooO0Oo;
                    i9 = iMax2;
                    i5 = size3;
                    if (!behavior.OooO(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                    }
                    iMax2 = Math.max(i9, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    iMax3 = Math.max(i8, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
                } else {
                    i5 = size3;
                    i6 = paddingRight;
                    i7 = iOooO0Oo;
                    i8 = iMax3;
                    i9 = iMax2;
                    int i24 = i4;
                    i10 = paddingLeft;
                    i11 = i3;
                    i12 = i24;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                iMax2 = Math.max(i9, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                iMax3 = Math.max(i8, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i11, view.getMeasuredState());
            }
            i18 = i12 + 1;
            paddingLeft = i10;
            paddingRight = i6;
            iOooO0Oo = i7;
            size3 = i5;
        }
        int i25 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(iMax2, i, (-16777216) & i25), View.resolveSizeAndState(iMax3, i2, i25 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ((OooO0o) childAt.getLayoutParams()).OooO00o(0);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOooOO0 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(0) && (behavior = oooO0o.f7761OooO00o) != null) {
                    zOooOO0 |= behavior.OooOO0(view);
                }
            }
        }
        return zOooOO0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooOOOO(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooOO0(view, i, i2, i3, i4, 0, this.f7743OoooO0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooOOO0(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        SparseArray<Parcelable> sparseArray = savedState.f7777Oooo0oo;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = OooOo00(childAt).f7761OooO00o;
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.OooOOOO(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOooOOOo;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((OooO0o) childAt.getLayoutParams()).f7761OooO00o;
            if (id != -1 && behavior != null && (parcelableOooOOOo = behavior.OooOOOo(childAt)) != null) {
                sparseArray.append(id, parcelableOooOOOo);
            }
        }
        savedState.f7777Oooo0oo = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooOO0o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooOOO(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
      0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOooOoO0;
        boolean zOooOOoo;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7756o000oOoO == null) {
            zOooOoO0 = OooOoO0(motionEvent, 1);
            if (!zOooOoO0) {
                zOooOOoo = false;
            }
            motionEventObtain = null;
            if (this.f7756o000oOoO == null) {
                zOooOOoo |= super.onTouchEvent(motionEvent);
            } else if (zOooOoO0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                OooOoOO(false);
            }
            return zOooOOoo;
        }
        zOooOoO0 = false;
        Behavior behavior = ((OooO0o) this.f7756o000oOoO.getLayoutParams()).f7761OooO00o;
        if (behavior != null) {
            zOooOOoo = behavior.OooOOoo(this, this.f7756o000oOoO, motionEvent);
        } else {
            zOooOOoo = false;
        }
        motionEventObtain = null;
        if (this.f7756o000oOoO == null) {
            zOooOOoo |= super.onTouchEvent(motionEvent);
        } else if (zOooOoO0) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            OooOoOO(false);
        } else {
            OooOoOO(false);
        }
        return zOooOOoo;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((OooO0o) view.getLayoutParams()).f7761OooO00o;
        if (behavior == null || !behavior.OooOOO(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f7745OoooO0O) {
            return;
        }
        OooOoOO(false);
        this.f7745OoooO0O = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooOooO();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f7753Ooooo0o = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f7752Ooooo00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f7752Ooooo00 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f7752Ooooo00.setState(getDrawableState());
                }
                Drawable drawable3 = this.f7752Ooooo00;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                o0OOO0o.OooO0OO(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f7752Ooooo00.setVisible(getVisibility() == 0, false);
                this.f7752Ooooo00.setCallback(this);
            }
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        Drawable drawableOooO0O0;
        if (i != 0) {
            Context context = getContext();
            Object obj = o000O000.OooO00o.f28085OooO00o;
            drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
        } else {
            drawableOooO0O0 = null;
        }
        setStatusBarBackground(drawableOooO0O0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f7752Ooooo00;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f7752Ooooo00.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7752Ooooo00;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof OooO0o) {
            return new OooO0o((OooO0o) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO0o((ViewGroup.MarginLayoutParams) layoutParams) : new OooO0o(layoutParams);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f7739Oooo0o = new ArrayList();
        this.f7740Oooo0oO = new o000oOoO<>();
        this.f7741Oooo0oo = new ArrayList();
        this.f7738Oooo = new ArrayList();
        this.f7744OoooO00 = new int[2];
        this.f7743OoooO0 = new int[2];
        this.f7755OooooOO = new o00Ooo();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.CoordinatorLayout, 0, Oooo000.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, Oooo0.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, Oooo000.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, Oooo0.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Oooo0.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f7746OoooOO0 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f7746OoooOO0.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f7746OoooOO0;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f7752Ooooo00 = typedArrayObtainStyledAttributes.getDrawable(Oooo0.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        OooOooO();
        super.setOnHierarchyChangeListener(new OooO0OO());
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public SparseArray<Parcelable> f7777Oooo0oo;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f7777Oooo0oo = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f7777Oooo0oo.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            SparseArray<Parcelable> sparseArray = this.f7777Oooo0oo;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f7777Oooo0oo.keyAt(i2);
                parcelableArr[i2] = this.f7777Oooo0oo.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class OooO0o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7760OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Behavior f7761OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7762OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7763OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7764OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7765OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7766OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7767OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f7768OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7769OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public View f7770OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public View f7771OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f7772OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f7773OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f7774OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f7775OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final Rect f7776OooOOo0;

        public OooO0o() {
            super(-2, -2);
            this.f7762OooO0O0 = false;
            this.f7763OooO0OO = 0;
            this.f7764OooO0Oo = 0;
            this.f7766OooO0o0 = -1;
            this.f7765OooO0o = -1;
            this.f7767OooO0oO = 0;
            this.f7768OooO0oo = 0;
            this.f7776OooOOo0 = new Rect();
        }

        public final boolean OooO00o(int i) {
            if (i == 0) {
                return this.f7772OooOOO;
            }
            if (i != 1) {
                return false;
            }
            return this.f7774OooOOOO;
        }

        public final void OooO0O0(@Nullable Behavior behavior) {
            Behavior behavior2 = this.f7761OooO00o;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.OooO0o();
                }
                this.f7761OooO00o = behavior;
                this.f7762OooO0O0 = true;
                if (behavior != null) {
                    behavior.OooO0OO(this);
                }
            }
        }

        public final void OooO0OO(int i, boolean z) {
            if (i == 0) {
                this.f7772OooOOO = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f7774OooOOOO = z;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            Behavior behaviorNewInstance;
            super(context, attributeSet);
            this.f7762OooO0O0 = false;
            this.f7763OooO0OO = 0;
            this.f7764OooO0Oo = 0;
            this.f7766OooO0o0 = -1;
            this.f7765OooO0o = -1;
            this.f7767OooO0oO = 0;
            this.f7768OooO0oo = 0;
            this.f7776OooOOo0 = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.CoordinatorLayout_Layout);
            this.f7763OooO0OO = typedArrayObtainStyledAttributes.getInteger(Oooo0.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f7765OooO0o = typedArrayObtainStyledAttributes.getResourceId(Oooo0.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f7764OooO0Oo = typedArrayObtainStyledAttributes.getInteger(Oooo0.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f7766OooO0o0 = typedArrayObtainStyledAttributes.getInteger(Oooo0.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f7767OooO0oO = typedArrayObtainStyledAttributes.getInt(Oooo0.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f7768OooO0oo = typedArrayObtainStyledAttributes.getInt(Oooo0.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = Oooo0.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i);
            this.f7762OooO0O0 = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(i);
                String str = CoordinatorLayout.f7733OooooOo;
                if (TextUtils.isEmpty(string)) {
                    behaviorNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f7733OooooOo;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f7734Oooooo;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f7735Oooooo0);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behaviorNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(OooOo00.OooO0Oo("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f7761OooO00o = behaviorNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f7761OooO00o;
            if (behavior != null) {
                behavior.OooO0OO(this);
            }
        }

        public OooO0o(OooO0o oooO0o) {
            super((ViewGroup.MarginLayoutParams) oooO0o);
            this.f7762OooO0O0 = false;
            this.f7763OooO0OO = 0;
            this.f7764OooO0Oo = 0;
            this.f7766OooO0o0 = -1;
            this.f7765OooO0o = -1;
            this.f7767OooO0oO = 0;
            this.f7768OooO0oo = 0;
            this.f7776OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7762OooO0O0 = false;
            this.f7763OooO0OO = 0;
            this.f7764OooO0Oo = 0;
            this.f7766OooO0o0 = -1;
            this.f7765OooO0o = -1;
            this.f7767OooO0oO = 0;
            this.f7768OooO0oo = 0;
            this.f7776OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7762OooO0O0 = false;
            this.f7763OooO0OO = 0;
            this.f7764OooO0Oo = 0;
            this.f7766OooO0o0 = -1;
            this.f7765OooO0o = -1;
            this.f7767OooO0oO = 0;
            this.f7768OooO0oo = 0;
            this.f7776OooOOo0 = new Rect();
        }
    }
}
