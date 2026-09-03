package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final int[] f11388OoooOoo = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final OooO00o f11389Ooooo00 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final OooO0O0 f11390Ooooo0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f11391OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f11392OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f11393OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<OooO> f11394OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f11395OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public p114o00O00o.OooO0OO f11396OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11397OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Parcelable f11398OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ClassLoader f11399OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11400OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Scroller f11401OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOOO f11402OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f11403OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f11404OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Drawable f11405OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f11406OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f11407OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f11408OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f11409OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f11410OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f11411OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f11412OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f11413OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f11414OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f11415OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f11416OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f11417OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f11418OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public EdgeEffect f11419Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f11420Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f11421Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f11422Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f11423Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f11424Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public VelocityTracker f11425Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11426Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f11427Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11428Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f11429Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f11430OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f11431OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public EdgeEffect f11432OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f11433OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ArrayList f11434OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooOOO0 f11435OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ArrayList f11436OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO0OO f11437OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f11438OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooOOO0 f11439o000oOoO;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f11444OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f11445OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f11446OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f11447OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f11448OooO0o0;
    }

    public static class OooO00o implements Comparator<OooO> {
        @Override // java.util.Comparator
        public final int compare(OooO oooO, OooO oooO2) {
            return oooO.f11445OooO0O0 - oooO2.f11445OooO0O0;
        }
    }

    public static class OooO0O0 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.OooOOo();
        }
    }

    public class OooO0o implements o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f11450OooO0Oo = new Rect();

        public OooO0o() {
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatOooOO0 = ViewCompat.OooOO0(view, windowInsetsCompat);
            if (windowInsetsCompatOooOO0.f5389OooO00o.OooOOOO()) {
                return windowInsetsCompatOooOO0;
            }
            int iOooO0Oo = windowInsetsCompatOooOO0.OooO0Oo();
            Rect rect = this.f11450OooO0Oo;
            rect.left = iOooO0Oo;
            rect.top = windowInsetsCompatOooOO0.OooO0o();
            rect.right = windowInsetsCompatOooOO0.OooO0o0();
            rect.bottom = windowInsetsCompatOooOO0.OooO0OO();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatOooO0O0 = ViewCompat.OooO0O0(viewPager.getChildAt(i), windowInsetsCompatOooOO0);
                rect.left = Math.min(windowInsetsCompatOooO0O0.OooO0Oo(), rect.left);
                rect.top = Math.min(windowInsetsCompatOooO0O0.OooO0o(), rect.top);
                rect.right = Math.min(windowInsetsCompatOooO0O0.OooO0o0(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatOooO0O0.OooO0OO(), rect.bottom);
            }
            return windowInsetsCompatOooOO0.OooO0oo(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public class OooOO0 extends androidx.core.view.OooO00o {
        public OooOO0() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            p114o00O00o.OooO0OO oooO0OO;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            p114o00O00o.OooO0OO oooO0OO2 = viewPager.f11396OooO0oo;
            if (oooO0OO2 != null) {
                z = oooO0OO2.OooO0OO() > 1;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() != 4096 || (oooO0OO = viewPager.f11396OooO0oo) == null) {
                return;
            }
            accessibilityEvent.setItemCount(oooO0OO.OooO0OO());
            accessibilityEvent.setFromIndex(viewPager.f11391OooO);
            accessibilityEvent.setToIndex(viewPager.f11391OooO);
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, o0O0O00 o0o0o00) {
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            o0o0o00.OooOO0O(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            p114o00O00o.OooO0OO oooO0OO = viewPager.f11396OooO0oo;
            o0o0o00.OooOOOo(oooO0OO != null && oooO0OO.OooO0OO() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                o0o0o00.OooO00o(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                o0o0o00.OooO00o(8192);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f11391OooO + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f11391OooO - 1);
            return true;
        }
    }

    public interface OooOO0O {
        void OooO00o(@NonNull ViewPager viewPager, @Nullable p114o00O00o.OooO0OO oooO0OO, @Nullable p114o00O00o.OooO0OO oooO0OO2);
    }

    public class OooOOO extends DataSetObserver {
        public OooOOO() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.OooO0o();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.OooO0o();
        }
    }

    public interface OooOOO0 {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, @Px int i2);

        void onPageSelected(int i);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f11454OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Parcelable f11455OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final ClassLoader f11456OooO0oo;

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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f11454OooO0o = parcel.readInt();
            this.f11455OooO0oO = parcel.readParcelable(classLoader);
            this.f11456OooO0oo = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return p022Oooo00O.OooOO0.OooO00o(sb, this.f11454OooO0o, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f11454OooO0o);
            parcel.writeParcelable(this.f11455OooO0oO, i);
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f11394OooO0o0 = new ArrayList<>();
        this.f11393OooO0o = new OooO();
        this.f11395OooO0oO = new Rect();
        this.f11397OooOO0 = -1;
        this.f11398OooOO0O = null;
        this.f11399OooOO0o = null;
        this.f11409OooOo00 = -3.4028235E38f;
        this.f11408OooOo0 = Float.MAX_VALUE;
        this.f11412OooOoO = 1;
        this.f11424Oooo0O0 = -1;
        this.f11431OoooO0 = true;
        this.f11437OoooOo0 = new OooO0OO();
        this.f11438OoooOoO = 0;
        OooOO0o();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f11407OooOo != z) {
            this.f11407OooOo = z;
        }
    }

    public final OooO OooO(View view) {
        int i = 0;
        while (true) {
            ArrayList<OooO> arrayList = this.f11394OooO0o0;
            if (i >= arrayList.size()) {
                return null;
            }
            OooO oooO = arrayList.get(i);
            if (this.f11396OooO0oo.OooO0oo(view, oooO.f11444OooO00o)) {
                return oooO;
            }
            i++;
        }
    }

    public final OooO OooO00o(int i, int i2) {
        OooO oooO = new OooO();
        oooO.f11445OooO0O0 = i;
        oooO.f11444OooO00o = this.f11396OooO0oo.OooO0oO(this, i);
        oooO.f11447OooO0Oo = this.f11396OooO0oo.OooO0o(i);
        ArrayList<OooO> arrayList = this.f11394OooO0o0;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(oooO);
        } else {
            arrayList.add(i2, oooO);
        }
        return oooO;
    }

    public void OooO0O0(@NonNull OooOOO0 oooOOO0) {
        if (this.f11434OoooOO0 == null) {
            this.f11434OoooOO0 = new ArrayList();
        }
        this.f11434OoooOO0.add(oooOOO0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    public final boolean OooO0OO(int i) {
        boolean zRequestFocus;
        boolean z;
        View viewFindFocus = findFocus();
        boolean z2 = true;
        boolean zOooOOOO = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f11395OooO0oO;
            if (i == 17) {
                int i2 = OooO0oo(viewFindNextFocus, rect).left;
                int i3 = OooO0oo(viewFindFocus, rect).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i4 = this.f11391OooO;
                    if (i4 > 0) {
                        OooOo(i4 - 1, true);
                    } else {
                        z2 = false;
                    }
                    zOooOOOO = z2;
                }
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || OooO0oo(viewFindNextFocus, rect).left > OooO0oo(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : OooOOOO();
            }
            zOooOOOO = zRequestFocus;
        } else if (i == 17 || i == 1) {
            int i5 = this.f11391OooO;
            if (i5 > 0) {
                OooOo(i5 - 1, true);
            } else {
                z2 = false;
            }
            zOooOOOO = z2;
        } else if (i == 66 || i == 2) {
            zOooOOOO = OooOOOO();
        }
        if (zOooOOOO) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zOooOOOO;
    }

    public boolean OooO0Oo(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && OooO0Oo(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public final void OooO0o() {
        int iOooO0OO = this.f11396OooO0oo.OooO0OO();
        this.f11392OooO0Oo = iOooO0OO;
        ArrayList<OooO> arrayList = this.f11394OooO0o0;
        boolean z = arrayList.size() < (this.f11412OooOoO * 2) + 1 && arrayList.size() < iOooO0OO;
        int iMax = this.f11391OooO;
        int i = 0;
        boolean z2 = false;
        while (i < arrayList.size()) {
            OooO oooO = arrayList.get(i);
            int iOooO0Oo = this.f11396OooO0oo.OooO0Oo(oooO.f11444OooO00o);
            if (iOooO0Oo != -1) {
                if (iOooO0Oo == -2) {
                    arrayList.remove(i);
                    i--;
                    if (!z2) {
                        this.f11396OooO0oo.OooOOOO(this);
                        z2 = true;
                    }
                    this.f11396OooO0oo.OooO00o(this, oooO.f11445OooO0O0, oooO.f11444OooO00o);
                    int i2 = this.f11391OooO;
                    if (i2 == oooO.f11445OooO0O0) {
                        iMax = Math.max(0, Math.min(i2, (-1) + iOooO0OO));
                    }
                } else {
                    int i3 = oooO.f11445OooO0O0;
                    if (i3 != iOooO0Oo) {
                        if (i3 == this.f11391OooO) {
                            iMax = iOooO0Oo;
                        }
                        oooO.f11445OooO0O0 = iOooO0Oo;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f11396OooO0oo.OooO0O0(this);
        }
        Collections.sort(arrayList, f11389Ooooo00);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.f11440OooO00o) {
                    layoutParams.f11442OooO0OO = 0.0f;
                }
            }
            OooOoO0(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void OooO0o0(boolean z) {
        boolean z2 = this.f11438OoooOoO == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f11401OooOOO0.isFinished()) {
                this.f11401OooOOO0.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11401OooOOO0.getCurrX();
                int currY = this.f11401OooOOO0.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        OooOOOo(currX);
                    }
                }
            }
        }
        this.f11413OooOoO0 = false;
        int i = 0;
        while (true) {
            ArrayList<OooO> arrayList = this.f11394OooO0o0;
            if (i >= arrayList.size()) {
                break;
            }
            OooO oooO = arrayList.get(i);
            if (oooO.f11446OooO0OO) {
                oooO.f11446OooO0OO = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            OooO0OO oooO0OO = this.f11437OoooOo0;
            if (!z) {
                oooO0OO.run();
            } else {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO0(this, oooO0OO);
            }
        }
    }

    public final void OooO0oO(int i) {
        OooOOO0 oooOOO0 = this.f11439o000oOoO;
        if (oooOOO0 != null) {
            oooOOO0.onPageSelected(i);
        }
        ArrayList arrayList = this.f11434OoooOO0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f11434OoooOO0.get(i2);
                if (oooOOO1 != null) {
                    oooOOO1.onPageSelected(i);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f11435OoooOOO;
        if (oooOOO2 != null) {
            oooOOO2.onPageSelected(i);
        }
    }

    public final Rect OooO0oo(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final OooO OooOO0() {
        OooO oooO;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f11403OooOOOo / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        OooO oooO2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList<OooO> arrayList = this.f11394OooO0o0;
            if (i2 >= arrayList.size()) {
                return oooO2;
            }
            OooO oooO3 = arrayList.get(i2);
            if (z || oooO3.f11445OooO0O0 == (i = i3 + 1)) {
                oooO = oooO3;
            } else {
                float f4 = f + f3 + f2;
                OooO oooO4 = this.f11393OooO0o;
                oooO4.f11448OooO0o0 = f4;
                oooO4.f11445OooO0O0 = i;
                oooO4.f11447OooO0Oo = this.f11396OooO0oo.OooO0o(i);
                i2--;
                oooO = oooO4;
            }
            f = oooO.f11448OooO0o0;
            float f5 = oooO.f11447OooO0Oo + f + f2;
            if (!z && scrollX < f) {
                return oooO2;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                return oooO;
            }
            int i4 = oooO.f11445OooO0O0;
            float f6 = oooO.f11447OooO0Oo;
            i2++;
            z = false;
            OooO oooO5 = oooO;
            i3 = i4;
            f3 = f6;
            oooO2 = oooO5;
        }
    }

    public final OooO OooOO0O(int i) {
        int i2 = 0;
        while (true) {
            ArrayList<OooO> arrayList = this.f11394OooO0o0;
            if (i2 >= arrayList.size()) {
                return null;
            }
            OooO oooO = arrayList.get(i2);
            if (oooO.f11445OooO0O0 == i) {
                return oooO;
            }
            i2++;
        }
    }

    public final void OooOO0o() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f11401OooOOO0 = new Scroller(context, f11390Ooooo0o);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f11418OooOooo = viewConfiguration.getScaledPagingTouchSlop();
        this.f11427Oooo0o0 = (int) (400.0f * f);
        this.f11426Oooo0o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11419Oooo = new EdgeEffect(context);
        this.f11432OoooO00 = new EdgeEffect(context);
        this.f11428Oooo0oO = (int) (25.0f * f);
        this.f11429Oooo0oo = (int) (2.0f * f);
        this.f11415OooOoo = (int) (f * 16.0f);
        ViewCompat.OooOOOO(this, new OooOO0());
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
        ViewCompat.OooOOO.OooOo0(this, new OooO0o());
    }

    public final void OooOOO(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11424Oooo0O0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f11421Oooo000 = motionEvent.getX(i);
            this.f11424Oooo0O0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f11425Oooo0OO;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    @CallSuper
    public final void OooOOO0(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f11430OoooO > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f11440OooO00o) {
                    int i4 = layoutParams.f11441OooO0O0 & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        OooOOO0 oooOOO0 = this.f11439o000oOoO;
        if (oooOOO0 != null) {
            oooOOO0.onPageScrolled(i, f, i2);
        }
        ArrayList arrayList = this.f11434OoooOO0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f11434OoooOO0.get(i6);
                if (oooOOO1 != null) {
                    oooOOO1.onPageScrolled(i, f, i2);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f11435OoooOOO;
        if (oooOOO2 != null) {
            oooOOO2.onPageScrolled(i, f, i2);
        }
        this.f11433OoooO0O = true;
    }

    public final boolean OooOOOO() {
        p114o00O00o.OooO0OO oooO0OO = this.f11396OooO0oo;
        if (oooO0OO == null || this.f11391OooO >= oooO0OO.OooO0OO() - 1) {
            return false;
        }
        OooOo(this.f11391OooO + 1, true);
        return true;
    }

    public final boolean OooOOOo(int i) {
        if (this.f11394OooO0o0.size() == 0) {
            if (this.f11431OoooO0) {
                return false;
            }
            this.f11433OoooO0O = false;
            OooOOO0(0, 0.0f, 0);
            if (this.f11433OoooO0O) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        OooO oooOOooOO0 = OooOO0();
        int clientWidth = getClientWidth();
        int i2 = this.f11403OooOOOo;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = oooOOooOO0.f11445OooO0O0;
        float f2 = ((i / f) - oooOOooOO0.f11448OooO0o0) / (oooOOooOO0.f11447OooO0Oo + (i2 / f));
        this.f11433OoooO0O = false;
        OooOOO0(i4, f2, (int) (i3 * f2));
        if (this.f11433OoooO0O) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final void OooOOo() {
        OooOOoo(this.f11391OooO);
    }

    public final boolean OooOOo0(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f11421Oooo000 - f;
        this.f11421Oooo000 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f11409OooOo00 * clientWidth;
        float f4 = this.f11408OooOo0 * clientWidth;
        ArrayList<OooO> arrayList = this.f11394OooO0o0;
        boolean z3 = false;
        OooO oooO = arrayList.get(0);
        OooO oooO2 = (OooO) p018OooOoo0.OooOOO.OooO00o(arrayList, 1);
        if (oooO.f11445OooO0O0 != 0) {
            f3 = oooO.f11448OooO0o0 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (oooO2.f11445OooO0O0 != this.f11396OooO0oo.OooO0OO() - 1) {
            f4 = oooO2.f11448OooO0o0 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f11419Oooo.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f11432OoooO00.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f11421Oooo000 = (scrollX - i) + this.f11421Oooo000;
        scrollTo(i, getScrollY());
        OooOOOo(i);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00df A[PHI: r2 r6 r12
      0x00df: PHI (r2v20 int) = (r2v19 int), (r2v7 int), (r2v22 int) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v8 int) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:58:0x00d6, B:55:0x00c2, B:49:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0163 A[PHI: r1 r10
      0x0163: PHI (r1v39 float) = (r1v37 float), (r1v38 float), (r1v36 float) binds: [B:92:0x015a, B:89:0x0144, B:83:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r10v14 int) = (r10v12 int), (r10v13 int), (r10v11 int) binds: [B:92:0x015a, B:89:0x0144, B:83:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOOoo(int i) {
        OooO oooOOooOO0O;
        String hexString;
        ArrayList<OooO> arrayList;
        OooO oooOOooO00o;
        OooO OooO2;
        OooO OooO3;
        int i2;
        int i3;
        OooO oooO;
        OooO oooO2;
        int i4 = this.f11391OooO;
        if (i4 != i) {
            oooOOooOO0O = OooOO0O(i4);
            this.f11391OooO = i;
        } else {
            oooOOooOO0O = null;
        }
        if (this.f11396OooO0oo == null || this.f11413OooOoO0 || getWindowToken() == null) {
            return;
        }
        this.f11396OooO0oo.OooOOOO(this);
        int i5 = this.f11412OooOoO;
        int i6 = 0;
        int iMax = Math.max(0, this.f11391OooO - i5);
        int iOooO0OO = this.f11396OooO0oo.OooO0OO();
        int iMin = Math.min(iOooO0OO - 1, this.f11391OooO + i5);
        if (iOooO0OO != this.f11392OooO0Oo) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            o000O0Oo.OooOOO0.OooO00o(sb, this.f11392OooO0Oo, ", found: ", iOooO0OO, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.f11396OooO0oo.getClass());
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            arrayList = this.f11394OooO0o0;
            if (i6 < arrayList.size()) {
                oooOOooO00o = arrayList.get(i6);
                int i7 = oooOOooO00o.f11445OooO0O0;
                int i8 = this.f11391OooO;
                if (i7 >= i8) {
                    if (i7 != i8) {
                        break;
                    } else {
                        break;
                    }
                }
                i6++;
            }
            oooOOooO00o = null;
            break;
        }
        if (oooOOooO00o == null && iOooO0OO > 0) {
            oooOOooO00o = OooO00o(this.f11391OooO, i6);
        }
        if (oooOOooO00o != null) {
            int i9 = i6 - 1;
            OooO oooO3 = i9 >= 0 ? arrayList.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - oooOOooO00o.f11447OooO0Oo) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i10 = this.f11391OooO - 1; i10 >= 0; i10--) {
                if (f >= paddingLeft && i10 < iMax) {
                    if (oooO3 == null) {
                        break;
                    }
                    if (i10 == oooO3.f11445OooO0O0 && !oooO3.f11446OooO0OO) {
                        arrayList.remove(i9);
                        this.f11396OooO0oo.OooO00o(this, i10, oooO3.f11444OooO00o);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            oooO3 = arrayList.get(i9);
                        } else {
                            oooO3 = null;
                        }
                    }
                } else if (oooO3 == null || i10 != oooO3.f11445OooO0O0) {
                    f += OooO00o(i10, i9 + 1).f11447OooO0Oo;
                    i6++;
                    if (i9 >= 0) {
                        oooO3 = arrayList.get(i9);
                    } else {
                        oooO3 = null;
                    }
                } else {
                    f += oooO3.f11447OooO0Oo;
                    i9--;
                    if (i9 >= 0) {
                        oooO3 = arrayList.get(i9);
                    } else {
                        oooO3 = null;
                    }
                }
            }
            float f2 = oooOOooO00o.f11447OooO0Oo;
            int i11 = i6 + 1;
            if (f2 < 2.0f) {
                OooO oooO4 = i11 < arrayList.size() ? arrayList.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f11391OooO + 1; i13 < iOooO0OO; i13++) {
                    if (f2 >= paddingRight && i13 > iMin) {
                        if (oooO4 == null) {
                            break;
                        }
                        if (i13 == oooO4.f11445OooO0O0 && !oooO4.f11446OooO0OO) {
                            arrayList.remove(i12);
                            this.f11396OooO0oo.OooO00o(this, i13, oooO4.f11444OooO00o);
                            if (i12 < arrayList.size()) {
                                oooO4 = arrayList.get(i12);
                            } else {
                                oooO4 = null;
                            }
                        }
                    } else if (oooO4 == null || i13 != oooO4.f11445OooO0O0) {
                        OooO oooOOooO00o2 = OooO00o(i13, i12);
                        i12++;
                        f2 += oooOOooO00o2.f11447OooO0Oo;
                        if (i12 < arrayList.size()) {
                            oooO4 = arrayList.get(i12);
                        } else {
                            oooO4 = null;
                        }
                    } else {
                        f2 += oooO4.f11447OooO0Oo;
                        i12++;
                        if (i12 < arrayList.size()) {
                            oooO4 = arrayList.get(i12);
                        } else {
                            oooO4 = null;
                        }
                    }
                }
            }
            int iOooO0OO2 = this.f11396OooO0oo.OooO0OO();
            int clientWidth2 = getClientWidth();
            float f3 = clientWidth2 > 0 ? this.f11403OooOOOo / clientWidth2 : 0.0f;
            if (oooOOooOO0O != null) {
                int i14 = oooOOooOO0O.f11445OooO0O0;
                int i15 = oooOOooO00o.f11445OooO0O0;
                if (i14 < i15) {
                    float fOooO0o = oooOOooOO0O.f11448OooO0o0 + oooOOooOO0O.f11447OooO0Oo + f3;
                    int i16 = i14 + 1;
                    int i17 = 0;
                    while (i16 <= oooOOooO00o.f11445OooO0O0 && i17 < arrayList.size()) {
                        OooO oooO5 = arrayList.get(i17);
                        while (true) {
                            oooO2 = oooO5;
                            if (i16 <= oooO2.f11445OooO0O0 || i17 >= arrayList.size() - 1) {
                                break;
                            }
                            i17++;
                            oooO5 = arrayList.get(i17);
                        }
                        while (i16 < oooO2.f11445OooO0O0) {
                            fOooO0o += this.f11396OooO0oo.OooO0o(i16) + f3;
                            i16++;
                        }
                        oooO2.f11448OooO0o0 = fOooO0o;
                        fOooO0o += oooO2.f11447OooO0Oo + f3;
                        i16++;
                    }
                } else if (i14 > i15) {
                    int size = arrayList.size() - 1;
                    float fOooO0o2 = oooOOooOO0O.f11448OooO0o0;
                    while (true) {
                        i14--;
                        if (i14 < oooOOooO00o.f11445OooO0O0 || size < 0) {
                            break;
                        }
                        OooO oooO6 = arrayList.get(size);
                        while (true) {
                            oooO = oooO6;
                            if (i14 >= oooO.f11445OooO0O0 || size <= 0) {
                                break;
                            }
                            size--;
                            oooO6 = arrayList.get(size);
                        }
                        while (i14 > oooO.f11445OooO0O0) {
                            fOooO0o2 -= this.f11396OooO0oo.OooO0o(i14) + f3;
                            i14--;
                        }
                        fOooO0o2 -= oooO.f11447OooO0Oo + f3;
                        oooO.f11448OooO0o0 = fOooO0o2;
                    }
                }
            }
            int size2 = arrayList.size();
            float fOooO0o3 = oooOOooO00o.f11448OooO0o0;
            int i18 = oooOOooO00o.f11445OooO0O0;
            int i19 = i18 - 1;
            this.f11409OooOo00 = i18 == 0 ? fOooO0o3 : -3.4028235E38f;
            int i20 = iOooO0OO2 - 1;
            this.f11408OooOo0 = i18 == i20 ? (oooOOooO00o.f11447OooO0Oo + fOooO0o3) - 1.0f : Float.MAX_VALUE;
            int i21 = i6 - 1;
            while (i21 >= 0) {
                OooO oooO7 = arrayList.get(i21);
                while (true) {
                    i3 = oooO7.f11445OooO0O0;
                    if (i19 <= i3) {
                        break;
                    }
                    fOooO0o3 -= this.f11396OooO0oo.OooO0o(i19) + f3;
                    i19--;
                }
                fOooO0o3 -= oooO7.f11447OooO0Oo + f3;
                oooO7.f11448OooO0o0 = fOooO0o3;
                if (i3 == 0) {
                    this.f11409OooOo00 = fOooO0o3;
                }
                i21--;
                i19--;
            }
            float fOooO0o4 = oooOOooO00o.f11448OooO0o0 + oooOOooO00o.f11447OooO0Oo + f3;
            int i22 = oooOOooO00o.f11445OooO0O0;
            while (true) {
                i22++;
                if (i11 >= size2) {
                    break;
                }
                OooO oooO8 = arrayList.get(i11);
                while (true) {
                    i2 = oooO8.f11445OooO0O0;
                    if (i22 >= i2) {
                        break;
                    }
                    fOooO0o4 += this.f11396OooO0oo.OooO0o(i22) + f3;
                    i22++;
                }
                if (i2 == i20) {
                    this.f11408OooOo0 = (oooO8.f11447OooO0Oo + fOooO0o4) - 1.0f;
                }
                oooO8.f11448OooO0o0 = fOooO0o4;
                fOooO0o4 += oooO8.f11447OooO0Oo + f3;
                i11++;
            }
            this.f11396OooO0oo.OooOOO0(this, this.f11391OooO, oooOOooO00o.f11444OooO00o);
        }
        this.f11396OooO0oo.OooO0O0(this);
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.getClass();
            if (!layoutParams.f11440OooO00o && layoutParams.f11442OooO0OO == 0.0f && (OooO3 = OooO(childAt)) != null) {
                layoutParams.f11442OooO0OO = OooO3.f11447OooO0Oo;
                int i24 = OooO3.f11445OooO0O0;
                layoutParams.getClass();
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                OooO2 = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    OooO2 = OooO(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        OooO2 = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (OooO2 == null || OooO2.f11445OooO0O0 != this.f11391OooO) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    OooO OooO4 = OooO(childAt2);
                    if (OooO4 != null && OooO4.f11445OooO0O0 == this.f11391OooO && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void OooOo(int i, boolean z) {
        this.f11413OooOoO0 = false;
        OooOoO0(i, 0, z, false);
    }

    public void OooOo0(@NonNull OooOOO0 oooOOO0) {
        ArrayList arrayList = this.f11434OoooOO0;
        if (arrayList != null) {
            arrayList.remove(oooOOO0);
        }
    }

    public final void OooOo00(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f11394OooO0o0.isEmpty()) {
            if (!this.f11401OooOOO0.isFinished()) {
                this.f11401OooOOO0.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        OooO oooOOooOO0O = OooOO0O(this.f11391OooO);
        int iMin = (int) ((oooOOooOO0O != null ? Math.min(oooOOooOO0O.f11448OooO0o0, this.f11408OooOo0) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            OooO0o0(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean OooOo0O() {
        this.f11424Oooo0O0 = -1;
        this.f11414OooOoOO = false;
        this.f11416OooOoo0 = false;
        VelocityTracker velocityTracker = this.f11425Oooo0OO;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11425Oooo0OO = null;
        }
        this.f11419Oooo.onRelease();
        this.f11432OoooO00.onRelease();
        return this.f11419Oooo.isFinished() || this.f11432OoooO00.isFinished();
    }

    public final void OooOo0o(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        OooO oooOOooOO0O = OooOO0O(i);
        if (oooOOooOO0O != null) {
            iMax = (int) (Math.max(this.f11409OooOo00, Math.min(oooOOooOO0O.f11448OooO0o0, this.f11408OooOo0)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                OooO0oO(i);
            }
            OooO0o0(false);
            scrollTo(iMax, 0);
            OooOOOo(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f11401OooOOO0;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f11400OooOOO ? this.f11401OooOOO0.getCurrX() : this.f11401OooOOO0.getStartX();
                this.f11401OooOOO0.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                OooO0o0(false);
                OooOOo();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    iAbs = (int) (((Math.abs(i4) / ((this.f11396OooO0oo.OooO0o(this.f11391OooO) * f) + this.f11403OooOOOo)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f11400OooOOO = false;
                this.f11401OooOOO0.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
        }
        if (z2) {
            OooO0oO(i);
        }
    }

    public final void OooOoO0(int i, int i2, boolean z, boolean z2) {
        p114o00O00o.OooO0OO oooO0OO = this.f11396OooO0oo;
        if (oooO0OO == null || oooO0OO.OooO0OO() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<OooO> arrayList = this.f11394OooO0o0;
        if (!z2 && this.f11391OooO == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f11396OooO0oo.OooO0OO()) {
            i = this.f11396OooO0oo.OooO0OO() - 1;
        }
        int i3 = this.f11412OooOoO;
        int i4 = this.f11391OooO;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                arrayList.get(i5).f11446OooO0OO = true;
            }
        }
        boolean z3 = this.f11391OooO != i;
        if (!this.f11431OoooO0) {
            OooOOoo(i);
            OooOo0o(i, i2, z, z3);
        } else {
            this.f11391OooO = i;
            if (z3) {
                OooO0oO(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        OooO OooO2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f11445OooO0O0 == this.f11391OooO) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        OooO OooO2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f11445OooO0O0 == this.f11391OooO) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f11440OooO00o | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f11440OooO00o = z;
        if (!this.f11411OooOo0o) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f11443OooO0Oo = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f11396OooO0oo == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f11409OooOo00));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f11408OooOo0));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f11400OooOOO = true;
        if (this.f11401OooOOO0.isFinished() || !this.f11401OooOOO0.computeScrollOffset()) {
            OooO0o0(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11401OooOOO0.getCurrX();
        int currY = this.f11401OooOOO0.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!OooOOOo(currX)) {
                this.f11401OooOOO0.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zOooO0OO;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            zOooO0OO = false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode == 22) {
                    zOooO0OO = keyEvent.hasModifiers(2) ? OooOOOO() : OooO0OO(66);
                } else if (keyCode != 61) {
                    zOooO0OO = false;
                } else if (keyEvent.hasNoModifiers()) {
                    zOooO0OO = OooO0OO(2);
                } else if (keyEvent.hasModifiers(1)) {
                    zOooO0OO = OooO0OO(1);
                } else {
                    zOooO0OO = false;
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i = this.f11391OooO;
                if (i > 0) {
                    OooOo(i - 1, true);
                    zOooO0OO = true;
                } else {
                    zOooO0OO = false;
                }
            } else {
                zOooO0OO = OooO0OO(17);
            }
        }
        return zOooO0OO;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        OooO OooO2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f11445OooO0O0 == this.f11391OooO && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        p114o00O00o.OooO0OO oooO0OO;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (oooO0OO = this.f11396OooO0oo) != null && oooO0OO.OooO0OO() > 1)) {
            if (!this.f11419Oooo.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f11409OooOo00 * width);
                this.f11419Oooo.setSize(height, width);
                zDraw = false | this.f11419Oooo.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f11432OoooO00.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f11408OooOo0 + 1.0f)) * width2);
                this.f11432OoooO00.setSize(height2, width2);
                zDraw |= this.f11432OoooO00.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f11419Oooo.finish();
            this.f11432OoooO00.finish();
        }
        if (zDraw) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11405OooOOo0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public p114o00O00o.OooO0OO getAdapter() {
        return this.f11396OooO0oo;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f11391OooO;
    }

    public int getOffscreenPageLimit() {
        return this.f11412OooOoO;
    }

    public int getPageMargin() {
        return this.f11403OooOOOo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11431OoooO0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f11437OoooOo0);
        Scroller scroller = this.f11401OooOOO0;
        if (scroller != null && !scroller.isFinished()) {
            this.f11401OooOOO0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.f11403OooOOOo <= 0 || this.f11405OooOOo0 == null) {
            return;
        }
        ArrayList<OooO> arrayList = this.f11394OooO0o0;
        if (arrayList.size() <= 0 || this.f11396OooO0oo == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.f11403OooOOOo / f2;
        int i2 = 0;
        OooO oooO = arrayList.get(0);
        float f4 = oooO.f11448OooO0o0;
        int size = arrayList.size();
        int i3 = oooO.f11445OooO0O0;
        int i4 = arrayList.get(size - 1).f11445OooO0O0;
        while (i3 < i4) {
            while (true) {
                i = oooO.f11445OooO0O0;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                oooO = arrayList.get(i2);
            }
            if (i3 == i) {
                float f5 = oooO.f11448OooO0o0;
                float f6 = oooO.f11447OooO0Oo;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fOooO0o = this.f11396OooO0oo.OooO0o(i3);
                f = (f4 + fOooO0o) * f2;
                f4 = fOooO0o + f3 + f4;
            }
            if (this.f11403OooOOOo + f > scrollX) {
                this.f11405OooOOo0.setBounds(Math.round(f), this.f11404OooOOo, Math.round(this.f11403OooOOOo + f), this.f11406OooOOoo);
                this.f11405OooOOo0.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            arrayList = arrayList;
            f3 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            OooOo0O();
            return false;
        }
        if (action != 0) {
            if (this.f11414OooOoOO) {
                return true;
            }
            if (this.f11416OooOoo0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f11423Oooo00o = x;
            this.f11421Oooo000 = x;
            float y = motionEvent.getY();
            this.f11420Oooo0 = y;
            this.f11422Oooo00O = y;
            this.f11424Oooo0O0 = motionEvent.getPointerId(0);
            this.f11416OooOoo0 = false;
            this.f11400OooOOO = true;
            this.f11401OooOOO0.computeScrollOffset();
            if (this.f11438OoooOoO != 2 || Math.abs(this.f11401OooOOO0.getFinalX() - this.f11401OooOOO0.getCurrX()) <= this.f11429Oooo0oo) {
                OooO0o0(false);
                this.f11414OooOoOO = false;
            } else {
                this.f11401OooOOO0.abortAnimation();
                this.f11413OooOoO0 = false;
                OooOOo();
                this.f11414OooOoOO = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f11424Oooo0O0;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f11421Oooo000;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f11420Oooo0);
                if (f != 0.0f) {
                    float f2 = this.f11421Oooo000;
                    if (!((f2 < ((float) this.f11417OooOooO) && f > 0.0f) || (f2 > ((float) (getWidth() - this.f11417OooOooO)) && f < 0.0f)) && OooO0Oo((int) f, (int) x2, (int) y2, this, false)) {
                        this.f11421Oooo000 = x2;
                        this.f11422Oooo00O = y2;
                        this.f11416OooOoo0 = true;
                        return false;
                    }
                }
                float f3 = this.f11418OooOooo;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f11414OooOoOO = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.f11423Oooo00o;
                    float f5 = this.f11418OooOooo;
                    this.f11421Oooo000 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f11422Oooo00O = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.f11416OooOoo0 = true;
                }
                if (this.f11414OooOoOO && OooOOo0(x2)) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
            }
        } else if (action == 6) {
            OooOOO(motionEvent);
        }
        if (this.f11425Oooo0OO == null) {
            this.f11425Oooo0OO = VelocityTracker.obtain();
        }
        this.f11425Oooo0OO.addMovement(motionEvent);
        return this.f11414OooOoOO;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        OooO OooO2;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f11440OooO00o) {
                    int i9 = layoutParams.f11441OooO0O0;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f11440OooO00o && (OooO2 = OooO(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (OooO2.f11448OooO0o0 * f)) + paddingLeft;
                    if (layoutParams2.f11443OooO0Oo) {
                        layoutParams2.f11443OooO0Oo = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f11442OooO0OO), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, Pow2.MAX_POW2));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f11404OooOOo = paddingTop;
        this.f11406OooOOoo = i6 - paddingBottom;
        this.f11430OoooO = i7;
        if (this.f11431OoooO0) {
            z2 = false;
            OooOo0o(this.f11391OooO, 0, false, false);
        } else {
            z2 = false;
        }
        this.f11431OoooO0 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f11417OooOooO = Math.min(measuredWidth / 10, this.f11415OooOoo);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = Pow2.MAX_POW2;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f11440OooO00o) {
                int i6 = layoutParams2.f11441OooO0O0;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, Pow2.MAX_POW2);
        this.f11410OooOo0O = View.MeasureSpec.makeMeasureSpec(measuredHeight, Pow2.MAX_POW2);
        this.f11411OooOo0o = true;
        OooOOo();
        this.f11411OooOo0o = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f11440OooO00o)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f11442OooO0OO), Pow2.MAX_POW2), this.f11410OooOo0O);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        OooO OooO2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f11445OooO0O0 == this.f11391OooO && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        p114o00O00o.OooO0OO oooO0OO = this.f11396OooO0oo;
        ClassLoader classLoader = savedState.f11456OooO0oo;
        if (oooO0OO != null) {
            oooO0OO.OooOO0O(savedState.f11455OooO0oO, classLoader);
            OooOoO0(savedState.f11454OooO0o, 0, false, true);
        } else {
            this.f11397OooOO0 = savedState.f11454OooO0o;
            this.f11398OooOO0O = savedState.f11455OooO0oO;
            this.f11399OooOO0o = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11454OooO0o = this.f11391OooO;
        p114o00O00o.OooO0OO oooO0OO = this.f11396OooO0oo;
        if (oooO0OO != null) {
            savedState.f11455OooO0oO = oooO0OO.OooOO0o();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f11403OooOOOo;
            OooOo00(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p114o00O00o.OooO0OO oooO0OO;
        boolean zOooOo0O = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (oooO0OO = this.f11396OooO0oo) == null || oooO0OO.OooO0OO() == 0) {
            return false;
        }
        if (this.f11425Oooo0OO == null) {
            this.f11425Oooo0OO = VelocityTracker.obtain();
        }
        this.f11425Oooo0OO.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f11401OooOOO0.abortAnimation();
            this.f11413OooOoO0 = false;
            OooOOo();
            float x = motionEvent.getX();
            this.f11423Oooo00o = x;
            this.f11421Oooo000 = x;
            float y = motionEvent.getY();
            this.f11420Oooo0 = y;
            this.f11422Oooo00O = y;
            this.f11424Oooo0O0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f11421Oooo000 = motionEvent.getX(actionIndex);
                        this.f11424Oooo0O0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        OooOOO(motionEvent);
                        this.f11421Oooo000 = motionEvent.getX(motionEvent.findPointerIndex(this.f11424Oooo0O0));
                    }
                } else if (this.f11414OooOoOO) {
                    OooOo0o(this.f11391OooO, 0, true, false);
                    zOooOo0O = OooOo0O();
                }
            } else if (!this.f11414OooOoOO) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11424Oooo0O0);
                if (iFindPointerIndex == -1) {
                    zOooOo0O = OooOo0O();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f11421Oooo000);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f11422Oooo00O);
                    if (fAbs > this.f11418OooOooo && fAbs > fAbs2) {
                        this.f11414OooOoOO = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f11423Oooo00o;
                        this.f11421Oooo000 = x2 - f > 0.0f ? f + this.f11418OooOooo : f - this.f11418OooOooo;
                        this.f11422Oooo00O = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f11414OooOoOO) {
                        zOooOo0O = false | OooOOo0(motionEvent.getX(motionEvent.findPointerIndex(this.f11424Oooo0O0)));
                    }
                }
            } else if (this.f11414OooOoOO) {
                zOooOo0O = false | OooOOo0(motionEvent.getX(motionEvent.findPointerIndex(this.f11424Oooo0O0)));
            }
        } else if (this.f11414OooOoOO) {
            VelocityTracker velocityTracker = this.f11425Oooo0OO;
            velocityTracker.computeCurrentVelocity(1000, this.f11426Oooo0o);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f11424Oooo0O0);
            this.f11413OooOoO0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            OooO oooOOooOO0 = OooOO0();
            float f2 = clientWidth;
            float f3 = this.f11403OooOOOo / f2;
            int iMax = oooOOooOO0.f11445OooO0O0;
            float f4 = ((scrollX / f2) - oooOOooOO0.f11448OooO0o0) / (oooOOooOO0.f11447OooO0Oo + f3);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f11424Oooo0O0)) - this.f11423Oooo00o)) <= this.f11428Oooo0oO || Math.abs(xVelocity) <= this.f11427Oooo0o0) {
                iMax += (int) (f4 + (iMax >= this.f11391OooO ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<OooO> arrayList = this.f11394OooO0o0;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).f11445OooO0O0, Math.min(iMax, arrayList.get(arrayList.size() - 1).f11445OooO0O0));
            }
            OooOoO0(iMax, xVelocity, true, true);
            zOooOo0O = OooOo0O();
        }
        if (zOooOo0O) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f11411OooOo0o) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable p114o00O00o.OooO0OO oooO0OO) {
        ArrayList<OooO> arrayList;
        p114o00O00o.OooO0OO oooO0OO2 = this.f11396OooO0oo;
        if (oooO0OO2 != null) {
            synchronized (oooO0OO2) {
                oooO0OO2.f36129OooO0O0 = null;
            }
            this.f11396OooO0oo.OooOOOO(this);
            int i = 0;
            while (true) {
                arrayList = this.f11394OooO0o0;
                if (i >= arrayList.size()) {
                    break;
                }
                OooO oooO = arrayList.get(i);
                this.f11396OooO0oo.OooO00o(this, oooO.f11445OooO0O0, oooO.f11444OooO00o);
                i++;
            }
            this.f11396OooO0oo.OooO0O0(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f11440OooO00o) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f11391OooO = 0;
            scrollTo(0, 0);
        }
        p114o00O00o.OooO0OO oooO0OO3 = this.f11396OooO0oo;
        this.f11396OooO0oo = oooO0OO;
        this.f11392OooO0Oo = 0;
        if (oooO0OO != null) {
            if (this.f11402OooOOOO == null) {
                this.f11402OooOOOO = new OooOOO();
            }
            this.f11396OooO0oo.OooOOO(this.f11402OooOOOO);
            this.f11413OooOoO0 = false;
            boolean z = this.f11431OoooO0;
            this.f11431OoooO0 = true;
            this.f11392OooO0Oo = this.f11396OooO0oo.OooO0OO();
            if (this.f11397OooOO0 >= 0) {
                this.f11396OooO0oo.OooOO0O(this.f11398OooOO0O, this.f11399OooOO0o);
                OooOoO0(this.f11397OooOO0, 0, false, true);
                this.f11397OooOO0 = -1;
                this.f11398OooOO0O = null;
                this.f11399OooOO0o = null;
            } else if (z) {
                requestLayout();
            } else {
                OooOOo();
            }
        }
        ArrayList arrayList2 = this.f11436OoooOOo;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f11436OoooOOo.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((OooOO0O) this.f11436OoooOOo.get(i3)).OooO00o(this, oooO0OO3, oooO0OO);
        }
    }

    public void setCurrentItem(int i) {
        this.f11413OooOoO0 = false;
        OooOoO0(i, 0, !this.f11431OoooO0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f11412OooOoO) {
            this.f11412OooOoO = i;
            OooOOo();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OooOOO0 oooOOO0) {
        this.f11439o000oOoO = oooOOO0;
    }

    public void setPageMargin(int i) {
        int i2 = this.f11403OooOOOo;
        this.f11403OooOOOo = i;
        int width = getWidth();
        OooOo00(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f11405OooOOo0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f11438OoooOoO == i) {
            return;
        }
        this.f11438OoooOoO = i;
        OooOOO0 oooOOO0 = this.f11439o000oOoO;
        if (oooOOO0 != null) {
            oooOOO0.onPageScrollStateChanged(i);
        }
        ArrayList arrayList = this.f11434OoooOO0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f11434OoooOO0.get(i2);
                if (oooOOO1 != null) {
                    oooOOO1.onPageScrollStateChanged(i);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f11435OoooOOO;
        if (oooOOO2 != null) {
            oooOOO2.onPageScrollStateChanged(i);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11405OooOOo0;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f11440OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11441OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f11442OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f11443OooO0Oo;

        public LayoutParams() {
            super(-1, -1);
            this.f11442OooO0OO = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11442OooO0OO = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f11388OoooOoo);
            this.f11441OooO0O0 = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setPageMarginDrawable(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11394OooO0o0 = new ArrayList<>();
        this.f11393OooO0o = new OooO();
        this.f11395OooO0oO = new Rect();
        this.f11397OooOO0 = -1;
        this.f11398OooOO0O = null;
        this.f11399OooOO0o = null;
        this.f11409OooOo00 = -3.4028235E38f;
        this.f11408OooOo0 = Float.MAX_VALUE;
        this.f11412OooOoO = 1;
        this.f11424Oooo0O0 = -1;
        this.f11431OoooO0 = true;
        this.f11437OoooOo0 = new OooO0OO();
        this.f11438OoooOoO = 0;
        OooOO0o();
    }
}
