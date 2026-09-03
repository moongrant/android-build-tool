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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import androidx.core.view.o000oOoO;
import androidx.core.view.o0O0O00;
import androidx.core.view.oo0o0Oo;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o000OO.OooOO0O;
import p022Oooo00O.o00O00OO;
import p049o000000o.o0OOO0o;
import p049o000000o.o0Oo0oo;
import p049o000000o.o0ooOOo;
import p053o00000oo.o00Ooo;
import p190o00o0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements oo0o0Oo, o0O0O00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Class<?>[] f5189OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f5190OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooOO0 f5191OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f5192OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooOO0O f5193OooOoOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int[] f5194OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f5195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f5196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000.OooO0OO<View> f5197OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f5198OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f5199OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f5200OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f5201OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int[] f5202OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f5203OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public View f5204OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO f5205OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f5206OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f5207OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public WindowInsetsCompat f5208OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Drawable f5209OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooO00o f5210OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f5211OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o000000 f5212OooOo0O;

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
            CoordinatorLayout.this.OooOOOO(0);
            return true;
        }
    }

    public class OooO00o implements o000000O {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!o000OO.OooO0OO.OooO00o(coordinatorLayout.f5208OooOOo0, windowInsetsCompat)) {
                coordinatorLayout.f5208OooOOo0 = windowInsetsCompat;
                boolean z = windowInsetsCompat.OooO0o() > 0;
                coordinatorLayout.f5207OooOOo = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                WindowInsetsCompat.OooOo00 oooOo00 = windowInsetsCompat.f5389OooO00o;
                if (!oooOo00.OooOOOO()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                        if (ViewCompat.OooO0o.OooO0O0(childAt) && ((OooO0o) childAt.getLayoutParams()).f5217OooO00o != null && oooOo00.OooOOOO()) {
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
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f5211OooOo00;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.OooOOOO(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f5211OooOo00;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class OooOO0 implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            float fOooOOO0 = ViewCompat.OooOOO.OooOOO0(view);
            float fOooOOO1 = ViewCompat.OooOOO.OooOOO0(view2);
            if (fOooOOO0 > fOooOOO1) {
                return -1;
            }
            return fOooOOO0 < fOooOOO1 ? 1 : 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public SparseArray<Parcelable> f5233OooO0o;

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
            this.f5233OooO0o = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f5233OooO0o.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            SparseArray<Parcelable> sparseArray = this.f5233OooO0o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f5233OooO0o.keyAt(i2);
                parcelableArr[i2] = this.f5233OooO0o.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f5190OooOo0o = r0 != null ? r0.getName() : null;
        f5191OooOoO = new OooOO0();
        f5189OooOo = new Class[]{Context.class, AttributeSet.class};
        f5192OooOoO0 = new ThreadLocal<>();
        f5193OooOoOO = new OooOO0O(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public static Rect OooO0o0() {
        Rect rect = (Rect) f5193OooOoOO.OooO0O0();
        return rect == null ? new Rect() : rect;
    }

    public static void OooOO0O(int i, Rect rect, Rect rect2, OooO0o oooO0o, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = oooO0o.f5219OooO0OO;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = oooO0o.f5220OooO0Oo;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO0o OooOOO0(View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        if (!oooO0o.f5218OooO0O0) {
            if (view instanceof OooO0O0) {
                Behavior behavior = ((OooO0O0) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                oooO0o.OooO0O0(behavior);
                oooO0o.f5218OooO0O0 = true;
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
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                oooO0o.f5218OooO0O0 = true;
            }
        }
        return oooO0o;
    }

    public static void OooOo0(int i, View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f5216OooO;
        if (i2 != i) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            view.offsetLeftAndRight(i - i2);
            oooO0o.f5216OooO = i;
        }
    }

    public static void OooOo0O(int i, View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        int i2 = oooO0o.f5225OooOO0;
        if (i2 != i) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            view.offsetTopAndBottom(i - i2);
            oooO0o.f5225OooOO0 = i;
        }
    }

    @NonNull
    public final ArrayList OooO(@NonNull View view) {
        OooOo<View, ArrayList<View>> oooOo = this.f5197OooO0o0.f33215OooO0O0;
        int i = oooOo.f38568OooO0o;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> arrayListOooOO0o = oooOo.OooOO0o(i2);
            if (arrayListOooOO0o != null && arrayListOooOO0o.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(oooOo.OooO0oo(i2));
            }
        }
        ArrayList arrayList2 = this.f5198OooO0oO;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public final void OooO0o(OooO0o oooO0o, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void OooO0oO(@NonNull View view) {
        ArrayList<View> orDefault = this.f5197OooO0o0.f33215OooO0O0.getOrDefault(view, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        for (int i = 0; i < orDefault.size(); i++) {
            View view2 = orDefault.get(i);
            Behavior behavior = ((OooO0o) view2.getLayoutParams()).f5217OooO00o;
            if (behavior != null) {
                behavior.OooO0Oo(this, view2, view);
            }
        }
    }

    public final void OooO0oo(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            OooOO0(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void OooOO0(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = o00000.OooO0o.f33218OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = o00000.OooO0o.f33218OooO00o;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        o00000.OooO0o.OooO00o(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = o00000.OooO0o.f33219OooO0O0;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int OooOO0o(int i) {
        int[] iArr = this.f5202OooOO0o;
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

    public final boolean OooOOO(@NonNull View view, int i, int i2) {
        OooOO0O oooOO0O = f5193OooOoOO;
        Rect rectOooO0o0 = OooO0o0();
        OooOO0(view, rectOooO0o0);
        try {
            return rectOooO0o0.contains(i, i2);
        } finally {
            rectOooO0o0.setEmpty();
            oooOO0O.OooO00o(rectOooO0o0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    public final void OooOOOO(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zOooO0Oo;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        View view;
        OooOO0O oooOO0O;
        Behavior behavior;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        ArrayList arrayList2 = this.f5195OooO0Oo;
        int size = arrayList2.size();
        Rect rectOooO0o0 = OooO0o0();
        Rect rectOooO0o1 = OooO0o0();
        Rect rectOooO0o2 = OooO0o0();
        int i10 = i;
        int i11 = 0;
        while (true) {
            OooOO0O oooOO0O2 = f5193OooOoOO;
            if (i11 >= size) {
                Rect rect2 = rectOooO0o2;
                rectOooO0o0.setEmpty();
                oooOO0O2.OooO00o(rectOooO0o0);
                rectOooO0o1.setEmpty();
                oooOO0O2.OooO00o(rectOooO0o1);
                rect2.setEmpty();
                oooOO0O2.OooO00o(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            OooO0o oooO0o = (OooO0o) view2.getLayoutParams();
            if (i10 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectOooO0o2;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (oooO0o.f5227OooOO0o == ((View) arrayList2.get(i12))) {
                        OooO0o oooO0o2 = (OooO0o) view2.getLayoutParams();
                        if (oooO0o2.f5226OooOO0O != null) {
                            Rect rectOooO0o3 = OooO0o0();
                            Rect rectOooO0o4 = OooO0o0();
                            Rect rectOooO0o5 = OooO0o0();
                            OooOO0(oooO0o2.f5226OooOO0O, rectOooO0o3);
                            OooO0oo(view2, false, rectOooO0o4);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            oooOO0O = oooOO0O2;
                            OooOO0O(iOooO0Oo, rectOooO0o3, rectOooO0o5, oooO0o2, measuredWidth, measuredHeight);
                            boolean z4 = (rectOooO0o5.left == rectOooO0o4.left && rectOooO0o5.top == rectOooO0o4.top) ? false : true;
                            OooO0o(r16, rectOooO0o5, measuredWidth, measuredHeight);
                            int i13 = rectOooO0o5.left - rectOooO0o4.left;
                            int i14 = rectOooO0o5.top - rectOooO0o4.top;
                            if (i13 != 0) {
                                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z4 && (behavior = r16.f5217OooO00o) != null) {
                                behavior.OooO0Oo(this, view, oooO0o2.f5226OooOO0O);
                            }
                            rectOooO0o3.setEmpty();
                            oooOO0O.OooO00o(rectOooO0o3);
                            rectOooO0o4.setEmpty();
                            oooOO0O.OooO00o(rectOooO0o4);
                            rectOooO0o5.setEmpty();
                            oooOO0O.OooO00o(rectOooO0o5);
                        } else {
                            view = view2;
                            oooOO0O = oooOO0O2;
                        }
                    } else {
                        view = view2;
                        oooOO0O = oooOO0O2;
                    }
                    i12++;
                    oooOO0O2 = oooOO0O;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    oooO0o = oooO0o;
                    rectOooO0o2 = rectOooO0o2;
                }
                OooO0o oooO0o3 = oooO0o;
                ArrayList arrayList3 = arrayList2;
                int i15 = size;
                Rect rect3 = rectOooO0o2;
                i2 = i11;
                View view3 = view2;
                OooOO0O oooOO0O3 = oooOO0O2;
                OooO0oo(view3, true, rectOooO0o1);
                if (oooO0o3.f5223OooO0oO != 0 && !rectOooO0o1.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(oooO0o3.f5223OooO0oO, iOooO0Oo);
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
                if (oooO0o3.f5224OooO0oo != 0 && view3.getVisibility() == 0) {
                    WeakHashMap<View, o000OOo0> weakHashMap4 = ViewCompat.f5341OooO00o;
                    if (ViewCompat.OooOO0O.OooO0OO(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        OooO0o oooO0o4 = (OooO0o) view3.getLayoutParams();
                        Behavior behavior2 = oooO0o4.f5217OooO00o;
                        Rect rectOooO0o6 = OooO0o0();
                        Rect rectOooO0o7 = OooO0o0();
                        rectOooO0o7.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (behavior2 == null || !behavior2.OooO00o(view3, rectOooO0o6)) {
                            rectOooO0o6.set(rectOooO0o7);
                        } else if (!rectOooO0o7.contains(rectOooO0o6)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectOooO0o6.toShortString() + " | Bounds:" + rectOooO0o7.toShortString());
                        }
                        rectOooO0o7.setEmpty();
                        oooOO0O3.OooO00o(rectOooO0o7);
                        if (rectOooO0o6.isEmpty()) {
                            rectOooO0o6.setEmpty();
                            oooOO0O3.OooO00o(rectOooO0o6);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(oooO0o4.f5224OooO0oo, iOooO0Oo);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectOooO0o6.top - ((ViewGroup.MarginLayoutParams) oooO0o4).topMargin) - oooO0o4.f5225OooOO0) >= (i9 = rectOooO0o0.top)) {
                                z = false;
                            } else {
                                OooOo0O(i9 - i8, view3);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectOooO0o6.bottom) - ((ViewGroup.MarginLayoutParams) oooO0o4).bottomMargin) + oooO0o4.f5225OooOO0) < (i7 = rectOooO0o0.bottom)) {
                                OooOo0O(height - i7, view3);
                                z = true;
                            }
                            if (!z) {
                                OooOo0O(0, view3);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectOooO0o6.left - ((ViewGroup.MarginLayoutParams) oooO0o4).leftMargin) - oooO0o4.f5216OooO) >= (i6 = rectOooO0o0.left)) {
                                z2 = false;
                            } else {
                                OooOo0(i6 - i5, view3);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - rectOooO0o6.right) - ((ViewGroup.MarginLayoutParams) oooO0o4).rightMargin) + oooO0o4.f5216OooO) >= (i4 = rectOooO0o0.right)) {
                                z3 = z2;
                            } else {
                                OooOo0(width - i4, view3);
                                z3 = true;
                            }
                            if (!z3) {
                                OooOo0(0, view3);
                            }
                            rectOooO0o6.setEmpty();
                            oooOO0O3.OooO00o(rectOooO0o6);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((OooO0o) view3.getLayoutParams()).f5232OooOOo0);
                    if (rect.equals(rectOooO0o1)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((OooO0o) view3.getLayoutParams()).f5232OooOOo0.set(rectOooO0o1);
                    }
                    i10 = i;
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view4 = (View) arrayList.get(i18);
                    OooO0o oooO0o5 = (OooO0o) view4.getLayoutParams();
                    Behavior behavior3 = oooO0o5.f5217OooO00o;
                    if (behavior3 != null && behavior3.OooO0O0(view4, view3)) {
                        if (i == 0 && oooO0o5.f5231OooOOOo) {
                            oooO0o5.f5231OooOOOo = false;
                        } else {
                            if (i != 2) {
                                zOooO0Oo = behavior3.OooO0Oo(this, view4, view3);
                            } else {
                                behavior3.OooO0o0(this, view3);
                                zOooO0Oo = true;
                            }
                            if (i == 1) {
                                oooO0o5.f5231OooOOOo = zOooO0Oo;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
                i10 = i;
            }
            i11 = i2 + 1;
            rectOooO0o2 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void OooOOOo(int i, @NonNull View view) {
        OooO0o oooO0o = (OooO0o) view.getLayoutParams();
        View view2 = oooO0o.f5226OooOO0O;
        int i2 = 0;
        if (view2 == null && oooO0o.f5221OooO0o != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        OooOO0O oooOO0O = f5193OooOoOO;
        if (view2 != null) {
            Rect rectOooO0o0 = OooO0o0();
            Rect rectOooO0o1 = OooO0o0();
            try {
                OooOO0(view2, rectOooO0o0);
                OooO0o oooO0o2 = (OooO0o) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                OooOO0O(i, rectOooO0o0, rectOooO0o1, oooO0o2, measuredWidth, measuredHeight);
                OooO0o(oooO0o2, rectOooO0o1, measuredWidth, measuredHeight);
                view.layout(rectOooO0o1.left, rectOooO0o1.top, rectOooO0o1.right, rectOooO0o1.bottom);
                return;
            } finally {
                rectOooO0o0.setEmpty();
                oooOO0O.OooO00o(rectOooO0o0);
                rectOooO0o1.setEmpty();
                oooOO0O.OooO00o(rectOooO0o1);
            }
        }
        int i3 = oooO0o.f5222OooO0o0;
        if (i3 < 0) {
            OooO0o oooO0o3 = (OooO0o) view.getLayoutParams();
            Rect rectOooO0o2 = OooO0o0();
            rectOooO0o2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o3).bottomMargin);
            if (this.f5208OooOOo0 != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                if (ViewCompat.OooO0o.OooO0O0(this) && !ViewCompat.OooO0o.OooO0O0(view)) {
                    rectOooO0o2.left = this.f5208OooOOo0.OooO0Oo() + rectOooO0o2.left;
                    rectOooO0o2.top = this.f5208OooOOo0.OooO0o() + rectOooO0o2.top;
                    rectOooO0o2.right -= this.f5208OooOOo0.OooO0o0();
                    rectOooO0o2.bottom -= this.f5208OooOOo0.OooO0OO();
                }
            }
            Rect rectOooO0o3 = OooO0o0();
            int i4 = oooO0o3.f5219OooO0OO;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            o000oOoO.OooO0O0(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectOooO0o2, rectOooO0o3, i);
            view.layout(rectOooO0o3.left, rectOooO0o3.top, rectOooO0o3.right, rectOooO0o3.bottom);
            rectOooO0o2.setEmpty();
            oooOO0O.OooO00o(rectOooO0o2);
            rectOooO0o3.setEmpty();
            oooOO0O.OooO00o(rectOooO0o3);
            return;
        }
        OooO0o oooO0o4 = (OooO0o) view.getLayoutParams();
        int i5 = oooO0o4.f5219OooO0OO;
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
        int iOooOO0o = OooOO0o(i3) - measuredWidth2;
        if (i6 == 1) {
            iOooOO0o += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iOooOO0o += measuredWidth2;
        }
        if (i7 == 16) {
            i2 = 0 + (measuredHeight2 / 2);
        } else if (i7 == 80) {
            i2 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o4).leftMargin, Math.min(iOooOO0o, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) oooO0o4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooO0o4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) oooO0o4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean OooOOo(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5196OooO0o;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        OooOO0 oooOO1 = f5191OooOoO;
        if (oooOO1 != null) {
            Collections.sort(arrayList, oooOO1);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zOooO0oO = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            OooO0o oooO0o = (OooO0o) view.getLayoutParams();
            Behavior behavior = oooO0o.f5217OooO00o;
            if (!(zOooO0oO || z2) || actionMasked == 0) {
                if (!zOooO0oO && behavior != null) {
                    if (i == 0) {
                        zOooO0oO = behavior.OooO0oO(this, view, motionEvent);
                    } else if (i == 1) {
                        zOooO0oO = behavior.OooOOoo(this, view, motionEvent);
                    }
                    if (zOooO0oO) {
                        this.f5204OooOOO0 = view;
                    }
                }
                if (oooO0o.f5217OooO00o == null) {
                    oooO0o.f5229OooOOO0 = false;
                }
                boolean z3 = oooO0o.f5229OooOOO0;
                if (z3) {
                    z = true;
                } else {
                    z = z3 | false;
                    oooO0o.f5229OooOOO0 = z;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.OooO0oO(this, view, motionEventObtain);
                } else if (i == 1) {
                    behavior.OooOOoo(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zOooO0oO;
    }

    public final void OooOOo0(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v4 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void OooOOoo() {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOoo():void");
    }

    public final void OooOo00(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((OooO0o) childAt.getLayoutParams()).f5217OooO00o;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.OooO0oO(this, childAt, motionEventObtain);
                } else {
                    behavior.OooOOoo(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((OooO0o) getChildAt(i2).getLayoutParams()).f5229OooOOO0 = false;
        }
        this.f5204OooOOO0 = null;
        this.f5200OooOO0 = false;
    }

    public final void OooOo0o() {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (!ViewCompat.OooO0o.OooO0O0(this)) {
            ViewCompat.OooOOO.OooOo0(this, null);
            return;
        }
        if (this.f5210OooOo0 == null) {
            this.f5210OooOo0 = new OooO00o();
        }
        ViewCompat.OooOOO.OooOo0(this, this.f5210OooOo0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooO0o) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((OooO0o) view.getLayoutParams()).f5217OooO00o;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5209OooOOoo;
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
        OooOOoo();
        return Collections.unmodifiableList(this.f5195OooO0Oo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f5208OooOOo0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o000000 o000000Var = this.f5212OooOo0O;
        return o000000Var.f5428OooO0O0 | o000000Var.f5427OooO00o;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f5209OooOOoo;
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
        OooOo00(false);
        if (this.f5206OooOOOo) {
            if (this.f5205OooOOOO == null) {
                this.f5205OooOOOO = new OooO();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5205OooOOOO);
        }
        if (this.f5208OooOOo0 == null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(this)) {
                ViewCompat.OooOOO0.OooO0OO(this);
            }
        }
        this.f5201OooOO0O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOo00(false);
        if (this.f5206OooOOOo && this.f5205OooOOOO != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5205OooOOOO);
        }
        View view = this.f5203OooOOO;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f5201OooOO0O = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5207OooOOo || this.f5209OooOOoo == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f5208OooOOo0;
        int iOooO0o = windowInsetsCompat != null ? windowInsetsCompat.OooO0o() : 0;
        if (iOooO0o > 0) {
            this.f5209OooOOoo.setBounds(0, 0, getWidth(), iOooO0o);
            this.f5209OooOOoo.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOo00(true);
        }
        boolean zOooOOo = OooOOo(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            OooOo00(true);
        }
        return zOooOOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        ArrayList arrayList = this.f5195OooO0Oo;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((OooO0o) view.getLayoutParams()).f5217OooO00o) == null || !behavior.OooO0oo(this, view, iOooO0Oo))) {
                OooOOOo(iOooO0Oo, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
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
        ArrayList arrayList;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        OooOOoo();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i13);
            OooOo<View, ArrayList<View>> oooOo = this.f5197OooO0o0.f33215OooO0O0;
            int i14 = oooOo.f38568OooO0o;
            int i15 = 0;
            while (true) {
                if (i15 < i14) {
                    ArrayList<View> arrayListOooOO0o = oooOo.OooOO0o(i15);
                    if (arrayListOooOO0o != null && arrayListOooOO0o.contains(childAt)) {
                        z3 = true;
                        break;
                    }
                    i15++;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != this.f5206OooOOOo) {
            if (z) {
                if (this.f5201OooOO0O) {
                    if (this.f5205OooOOOO == null) {
                        this.f5205OooOOOO = new OooO();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f5205OooOOOO);
                }
                this.f5206OooOOOo = true;
            } else {
                if (this.f5201OooOO0O && this.f5205OooOOOO != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f5205OooOOOO);
                }
                this.f5206OooOOOo = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        boolean z4 = iOooO0Oo == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z5 = this.f5208OooOOo0 != null && ViewCompat.OooO0o.OooO0O0(this);
        ArrayList arrayList2 = this.f5195OooO0Oo;
        int size3 = arrayList2.size();
        int i18 = suggestedMinimumWidth;
        int i19 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i20 = 0;
        while (i20 < size3) {
            View view = (View) arrayList2.get(i20);
            int i21 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i5 = size3;
                arrayList = arrayList2;
                i8 = paddingLeft;
                i11 = paddingRight;
                i6 = iOooO0Oo;
                iCombineMeasuredStates = i21;
                z2 = false;
                i10 = i20;
            } else {
                OooO0o oooO0o = (OooO0o) view.getLayoutParams();
                int i22 = oooO0o.f5222OooO0o0;
                if (i22 < 0 || mode == 0) {
                    i3 = i20;
                    i4 = i19;
                } else {
                    int iOooOO0o = OooOO0o(i22);
                    i3 = i20;
                    int i23 = oooO0o.f5219OooO0OO;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, iOooO0Oo) & 7;
                    i4 = i19;
                    if ((absoluteGravity == 3 && !z4) || (absoluteGravity == 5 && z4)) {
                        iMax = Math.max(0, (size - paddingRight) - iOooOO0o);
                    } else if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                        iMax = Math.max(0, iOooOO0o - paddingLeft);
                    }
                    if (z5 || ViewCompat.OooO0o.OooO0O0(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iOooO0o0 = this.f5208OooOOo0.OooO0o0() + this.f5208OooOOo0.OooO0Oo();
                        int iOooO0OO = this.f5208OooOOo0.OooO0OO() + this.f5208OooOOo0.OooO0o();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iOooO0o0, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iOooO0OO, mode2);
                    }
                    behavior = oooO0o.f5217OooO00o;
                    if (behavior != null) {
                        i10 = i3;
                        i8 = paddingLeft;
                        z2 = false;
                        i9 = i21;
                        int i24 = i4;
                        i11 = paddingRight;
                        i12 = i24;
                        i6 = iOooO0Oo;
                        i7 = i18;
                        i5 = size3;
                        arrayList = arrayList2;
                        if (!behavior.OooO(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                        }
                        int iMax2 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                        int iMax3 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                        i18 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                        i19 = iMax3;
                    } else {
                        i5 = size3;
                        arrayList = arrayList2;
                        i6 = iOooO0Oo;
                        z2 = false;
                        i7 = i18;
                        int i25 = i3;
                        i8 = paddingLeft;
                        i9 = i21;
                        i10 = i25;
                        int i26 = i4;
                        i11 = paddingRight;
                        i12 = i26;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    int iMax4 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    int iMax5 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    i18 = iMax4;
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i19 = iMax5;
                }
                iMax = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behavior = oooO0o.f5217OooO00o;
                if (behavior != null) {
                    i10 = i3;
                    i8 = paddingLeft;
                    z2 = false;
                    i9 = i21;
                    int i27 = i4;
                    i11 = paddingRight;
                    i12 = i27;
                    i6 = iOooO0Oo;
                    i7 = i18;
                    i5 = size3;
                    arrayList = arrayList2;
                    if (!behavior.OooO(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                    }
                    int iMax6 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                    int iMax7 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                    i18 = iMax6;
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i19 = iMax7;
                } else {
                    i5 = size3;
                    arrayList = arrayList2;
                    i6 = iOooO0Oo;
                    z2 = false;
                    i7 = i18;
                    int i28 = i3;
                    i8 = paddingLeft;
                    i9 = i21;
                    i10 = i28;
                    int i29 = i4;
                    i11 = paddingRight;
                    i12 = i29;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                int iMax8 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin + ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin);
                int iMax9 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin + ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
                i18 = iMax8;
                iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                i19 = iMax9;
            }
            i20 = i10 + 1;
            paddingLeft = i8;
            paddingRight = i11;
            iOooO0Oo = i6;
            size3 = i5;
            arrayList2 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i18, i, (-16777216) & i30), View.resolveSizeAndState(i19, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(0)) {
                    Behavior behavior = oooO0o.f5217OooO00o;
                }
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
                if (oooO0o.OooO00o(0) && (behavior = oooO0o.f5217OooO00o) != null) {
                    zOooOO0 |= behavior.OooOO0(view);
                }
            }
        }
        return zOooOO0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        SparseArray<Parcelable> sparseArray = savedState.f5233OooO0o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = OooOOO0(childAt).f5217OooO00o;
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
            Behavior behavior = ((OooO0o) childAt.getLayoutParams()).f5217OooO00o;
            if (id != -1 && behavior != null && (parcelableOooOOOo = behavior.OooOOOo(childAt)) != null) {
                sparseArray.append(id, parcelableOooOOOo);
            }
        }
        savedState.f5233OooO0o = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
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
        boolean zOooOOo;
        boolean zOooOOoo;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5204OooOOO0 == null) {
            zOooOOo = OooOOo(motionEvent, 1);
            if (!zOooOOo) {
                zOooOOoo = false;
            }
            motionEventObtain = null;
            if (this.f5204OooOOO0 == null) {
                zOooOOoo |= super.onTouchEvent(motionEvent);
            } else if (zOooOOo) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                OooOo00(false);
            }
            return zOooOOoo;
        }
        zOooOOo = false;
        Behavior behavior = ((OooO0o) this.f5204OooOOO0.getLayoutParams()).f5217OooO00o;
        if (behavior != null) {
            zOooOOoo = behavior.OooOOoo(this, this.f5204OooOOO0, motionEvent);
        } else {
            zOooOOoo = false;
        }
        motionEventObtain = null;
        if (this.f5204OooOOO0 == null) {
            zOooOOoo |= super.onTouchEvent(motionEvent);
        } else if (zOooOOo) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            OooOo00(false);
        } else {
            OooOo00(false);
        }
        return zOooOOoo;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((OooO0o) view.getLayoutParams()).f5217OooO00o;
        if (behavior == null || !behavior.OooOOO(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f5200OooOO0) {
            return;
        }
        OooOo00(false);
        this.f5200OooOO0 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooOo0o();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5211OooOo00 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f5209OooOOoo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5209OooOOoo = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5209OooOOoo.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5209OooOOoo;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                o00Ooo.OooO0OO.OooO0O0(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f5209OooOOoo.setVisible(getVisibility() == 0, false);
                this.f5209OooOOoo.setCallback(this);
            }
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
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
            Object obj = ContextCompat.f5281OooO00o;
            drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, i);
        } else {
            drawableOooO0O0 = null;
        }
        setStatusBarBackground(drawableOooO0O0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5209OooOOoo;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f5209OooOOoo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5209OooOOoo;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o0ooOOo.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof OooO0o) {
            return new OooO0o((OooO0o) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO0o((ViewGroup.MarginLayoutParams) layoutParams) : new OooO0o(layoutParams);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i3) && (behavior = oooO0o.f5217OooO00o) != null) {
                    int[] iArr2 = this.f5199OooO0oo;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.OooOO0O(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f5199OooO0oo;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            OooOOOO(1);
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f5194OooO);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f5212OooOo0O.OooO00o(i, i2);
        this.f5203OooOOO = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((OooO0o) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                Behavior behavior = oooO0o.f5217OooO00o;
                if (behavior != null) {
                    boolean zOooOOo0 = behavior.OooOOo0(this, childAt, view, view2, i, i2);
                    z |= zOooOOo0;
                    if (i2 == 0) {
                        oooO0o.f5228OooOOO = zOooOOo0;
                    } else if (i2 == 1) {
                        oooO0o.f5230OooOOOO = zOooOOo0;
                    }
                } else if (i2 == 0) {
                    oooO0o.f5228OooOOO = false;
                } else if (i2 == 1) {
                    oooO0o.f5230OooOOOO = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onStopNestedScroll(View view, int i) {
        this.f5212OooOo0O.OooO0O0(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
            if (oooO0o.OooO00o(i)) {
                Behavior behavior = oooO0o.f5217OooO00o;
                if (behavior != null) {
                    behavior.OooOOo(this, childAt, view, i);
                }
                if (i == 0) {
                    oooO0o.f5228OooOOO = false;
                } else if (i == 1) {
                    oooO0o.f5230OooOOOO = false;
                }
                oooO0o.f5231OooOOOo = false;
            }
        }
        this.f5203OooOOO = null;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f5195OooO0Oo = new ArrayList();
        this.f5197OooO0o0 = new o00000.OooO0OO<>();
        this.f5196OooO0o = new ArrayList();
        this.f5198OooO0oO = new ArrayList();
        this.f5199OooO0oo = new int[2];
        this.f5194OooO = new int[2];
        this.f5212OooOo0O = new o000000();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.CoordinatorLayout, 0, o0OOO0o.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, o0Oo0oo.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, o0OOO0o.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, o0Oo0oo.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f5202OooOO0o = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f5202OooOO0o;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f5209OooOOoo = typedArrayObtainStyledAttributes.getDrawable(o0Oo0oo.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        OooOo0o();
        super.setOnHierarchyChangeListener(new OooO0OO());
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
    }

    @Override // androidx.core.view.o0O0O00
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        Behavior behavior;
        int iMin;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                OooO0o oooO0o = (OooO0o) childAt.getLayoutParams();
                if (oooO0o.OooO00o(i5) && (behavior = oooO0o.f5217OooO00o) != null) {
                    int[] iArr2 = this.f5199OooO0oo;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.OooOOO0(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f5199OooO0oo;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        iMin = Math.max(i6, iArr3[1]);
                    } else {
                        iMin = Math.min(i6, iArr3[1]);
                    }
                    i6 = iMin;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z) {
            OooOOOO(1);
        }
    }

    public static class OooO0o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5216OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Behavior f5217OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f5218OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5219OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5220OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f5221OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f5222OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f5223OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f5224OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f5225OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public View f5226OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public View f5227OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f5228OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f5229OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f5230OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f5231OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final Rect f5232OooOOo0;

        public OooO0o() {
            super(-2, -2);
            this.f5218OooO0O0 = false;
            this.f5219OooO0OO = 0;
            this.f5220OooO0Oo = 0;
            this.f5222OooO0o0 = -1;
            this.f5221OooO0o = -1;
            this.f5223OooO0oO = 0;
            this.f5224OooO0oo = 0;
            this.f5232OooOOo0 = new Rect();
        }

        public final boolean OooO00o(int i) {
            if (i == 0) {
                return this.f5228OooOOO;
            }
            if (i != 1) {
                return false;
            }
            return this.f5230OooOOOO;
        }

        public final void OooO0O0(@Nullable Behavior behavior) {
            Behavior behavior2 = this.f5217OooO00o;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.OooO0o();
                }
                this.f5217OooO00o = behavior;
                this.f5218OooO0O0 = true;
                if (behavior != null) {
                    behavior.OooO0OO(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            Behavior behaviorNewInstance;
            super(context, attributeSet);
            this.f5218OooO0O0 = false;
            this.f5219OooO0OO = 0;
            this.f5220OooO0Oo = 0;
            this.f5222OooO0o0 = -1;
            this.f5221OooO0o = -1;
            this.f5223OooO0oO = 0;
            this.f5224OooO0oo = 0;
            this.f5232OooOOo0 = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.CoordinatorLayout_Layout);
            this.f5219OooO0OO = typedArrayObtainStyledAttributes.getInteger(o0Oo0oo.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f5221OooO0o = typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f5220OooO0Oo = typedArrayObtainStyledAttributes.getInteger(o0Oo0oo.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f5222OooO0o0 = typedArrayObtainStyledAttributes.getInteger(o0Oo0oo.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f5223OooO0oO = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f5224OooO0oo = typedArrayObtainStyledAttributes.getInt(o0Oo0oo.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = o0Oo0oo.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i);
            this.f5218OooO0O0 = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(i);
                String str = CoordinatorLayout.f5190OooOo0o;
                if (TextUtils.isEmpty(string)) {
                    behaviorNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f5190OooOo0o;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f5192OooOoO0;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5189OooOo);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behaviorNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(o00O00OO.OooO00o("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f5217OooO00o = behaviorNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f5217OooO00o;
            if (behavior != null) {
                behavior.OooO0OO(this);
            }
        }

        public OooO0o(OooO0o oooO0o) {
            super((ViewGroup.MarginLayoutParams) oooO0o);
            this.f5218OooO0O0 = false;
            this.f5219OooO0OO = 0;
            this.f5220OooO0Oo = 0;
            this.f5222OooO0o0 = -1;
            this.f5221OooO0o = -1;
            this.f5223OooO0oO = 0;
            this.f5224OooO0oo = 0;
            this.f5232OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5218OooO0O0 = false;
            this.f5219OooO0OO = 0;
            this.f5220OooO0Oo = 0;
            this.f5222OooO0o0 = -1;
            this.f5221OooO0o = -1;
            this.f5223OooO0oO = 0;
            this.f5224OooO0oo = 0;
            this.f5232OooOOo0 = new Rect();
        }

        public OooO0o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5218OooO0O0 = false;
            this.f5219OooO0OO = 0;
            this.f5220OooO0Oo = 0;
            this.f5222OooO0o0 = -1;
            this.f5221OooO0o = -1;
            this.f5223OooO0oO = 0;
            this.f5224OooO0oo = 0;
            this.f5232OooOOo0 = new Rect();
        }
    }
}
