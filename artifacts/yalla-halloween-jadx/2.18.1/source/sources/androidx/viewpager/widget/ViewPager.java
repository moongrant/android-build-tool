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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import o0O0O00.o0ooOOo;
import p072o000O0o0.o0000OO0;
import p105o000oo0o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final int[] f9646o00000OO = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final Comparator<OooO> f9647o00000Oo = new OooO00o();

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public static final OooO0O0 f9648o00000o0 = new OooO0O0();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Rect f9649Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f9650Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList<OooO> f9651Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO f9652Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Parcelable f9653OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f9654OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o00Ooo f9655OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f9656OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ClassLoader f9657OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f9658OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooOOO f9659OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f9660OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Drawable f9661OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f9662OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f9663Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f9664Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f9665OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f9666OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f9667OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f9668Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f9669Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f9670OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f9671Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public List<OooOO0O> f9672o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public List<OooOOO0> f9673o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public OooOOO0 f9674o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public OooOOO0 f9675o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public int f9676o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public final OooO0OO f9677o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f9678o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Scroller f9679o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f9680o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f9681o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public float f9682o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f9683o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public VelocityTracker f9684o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f9685o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f9686o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f9687o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public EdgeEffect f9688o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f9689o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public EdgeEffect f9690o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f9691o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public int f9692o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f9693o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f9694o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public float f9695oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f9696oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f9697ooOO;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f9703OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9704OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f9705OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f9706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f9707OooO0o0;
    }

    public static class OooO00o implements Comparator<OooO> {
        @Override // java.util.Comparator
        public final int compare(OooO oooO, OooO oooO2) {
            return oooO.f9704OooO0O0 - oooO2.f9704OooO0O0;
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
            ViewPager.this.setScrollState(0);
            ViewPager.this.OooOOoo();
        }
    }

    public class OooO0o implements oo000o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Rect f9709Oooo0o = new Rect();

        public OooO0o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatOooOOo0 = ViewCompat.OooOOo0(view, windowInsetsCompat);
            if (windowInsetsCompatOooOOo0.OooOO0O()) {
                return windowInsetsCompatOooOOo0;
            }
            Rect rect = this.f9709Oooo0o;
            rect.left = windowInsetsCompatOooOOo0.OooO0oO();
            rect.top = windowInsetsCompatOooOOo0.OooO();
            rect.right = windowInsetsCompatOooOOo0.OooO0oo();
            rect.bottom = windowInsetsCompatOooOOo0.OooO0o();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat windowInsetsCompatOooO0o0 = ViewCompat.OooO0o0(ViewPager.this.getChildAt(i), windowInsetsCompatOooOOo0);
                rect.left = Math.min(windowInsetsCompatOooO0o0.OooO0oO(), rect.left);
                rect.top = Math.min(windowInsetsCompatOooO0o0.OooO(), rect.top);
                rect.right = Math.min(windowInsetsCompatOooO0o0.OooO0oo(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatOooO0o0.OooO0o(), rect.bottom);
            }
            return windowInsetsCompatOooOOo0.OooOO0o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public class OooOO0 extends androidx.core.view.OooO00o {
        public OooOO0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
            o00Ooo o00ooo2;
            super.OooO0OO(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            o00Ooo o00ooo3 = ViewPager.this.f9655OoooO00;
            accessibilityEvent.setScrollable(o00ooo3 != null && o00ooo3.OooO0OO() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (o00ooo2 = ViewPager.this.f9655OoooO00) == null) {
                return;
            }
            accessibilityEvent.setItemCount(o00ooo2.OooO0OO());
            accessibilityEvent.setFromIndex(ViewPager.this.f9654OoooO0);
            accessibilityEvent.setToIndex(ViewPager.this.f9654OoooO0);
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.Oooo000(ViewPager.class.getName());
            o00Ooo o00ooo2 = ViewPager.this.f9655OoooO00;
            o0000oo1.OoooOoO(o00ooo2 != null && o00ooo2.OooO0OO() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                o0000oo1.OooO00o(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                o0000oo1.OooO00o(8192);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (super.OooO0oO(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f9654OoooO0 + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f9654OoooO0 - 1);
            return true;
        }
    }

    public interface OooOO0O {
        void OooO00o(@NonNull ViewPager viewPager, @Nullable o00Ooo o00ooo2, @Nullable o00Ooo o00ooo3);
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Parcelable f9713Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f9714Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public ClassLoader f9715OoooO00;

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

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FragmentPager.SavedState{");
            sbOooO0o0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0o0.append(" position=");
            return o0ooOOo.OooO00o(sbOooO0o0, this.f9714Oooo0oo, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f9714Oooo0oo);
            parcel.writeParcelable(this.f9713Oooo, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f9714Oooo0oo = parcel.readInt();
            this.f9713Oooo = parcel.readParcelable(classLoader);
            this.f9715OoooO00 = classLoader;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f9651Oooo0oO = new ArrayList<>();
        this.f9652Oooo0oo = new OooO();
        this.f9649Oooo = new Rect();
        this.f9656OoooO0O = -1;
        this.f9653OoooO = null;
        this.f9657OoooOO0 = null;
        this.f9664Ooooo0o = -3.4028235E38f;
        this.f9665OooooO0 = Float.MAX_VALUE;
        this.f9670OoooooO = 1;
        this.f9685o00oO0o = -1;
        this.f9696oo0o0Oo = true;
        this.f9677o00000O0 = new OooO0OO();
        this.f9676o00000O = 0;
        OooOO0o();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f9669Oooooo0 != z) {
            this.f9669Oooooo0 = z;
        }
    }

    public final OooO OooO(View view) {
        for (int i = 0; i < this.f9651Oooo0oO.size(); i++) {
            OooO oooO = this.f9651Oooo0oO.get(i);
            if (this.f9655OoooO00.OooO0oo(view, oooO.f9703OooO00o)) {
                return oooO;
            }
        }
        return null;
    }

    public final OooO OooO00o(int i, int i2) {
        OooO oooO = new OooO();
        oooO.f9704OooO0O0 = i;
        oooO.f9703OooO00o = this.f9655OoooO00.OooO0oO(this, i);
        oooO.f9706OooO0Oo = this.f9655OoooO00.OooO0o(i);
        if (i2 < 0 || i2 >= this.f9651Oooo0oO.size()) {
            this.f9651Oooo0oO.add(oooO);
        } else {
            this.f9651Oooo0oO.add(i2, oooO);
        }
        return oooO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    public void OooO0O0(@NonNull OooOOO0 oooOOO0) {
        if (this.f9673o000000 == null) {
            this.f9673o000000 = new ArrayList();
        }
        this.f9673o000000.add(oooOOO0);
    }

    public final boolean OooO0OO(int i) {
        boolean zRequestFocus;
        boolean z;
        View viewFindFocus = findFocus();
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
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("arrowScroll tried to find focus based on non-child current focused view ");
                sbOooO0o0.append(sb.toString());
                Log.e("ViewPager", sbOooO0o0.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i == 17) {
                zRequestFocus = (viewFindFocus == null || OooO0oo(this.f9649Oooo, viewFindNextFocus).left < OooO0oo(this.f9649Oooo, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : OooOOOO();
            } else if (i == 66) {
                zRequestFocus = (viewFindFocus == null || OooO0oo(this.f9649Oooo, viewFindNextFocus).left > OooO0oo(this.f9649Oooo, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : OooOOOo();
            }
            zOooOOOO = zRequestFocus;
        } else if (i == 17 || i == 1) {
            zOooOOOO = OooOOOO();
        } else if (i == 66 || i == 2) {
            zOooOOOO = OooOOOo();
        }
        if (zOooOOOO) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zOooOOOO;
    }

    public boolean OooO0Oo(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && OooO0Oo(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public final void OooO0o() {
        int iOooO0OO = this.f9655OoooO00.OooO0OO();
        this.f9650Oooo0o = iOooO0OO;
        boolean z = this.f9651Oooo0oO.size() < (this.f9670OoooooO * 2) + 1 && this.f9651Oooo0oO.size() < iOooO0OO;
        int iMax = this.f9654OoooO0;
        int i = 0;
        boolean z2 = false;
        while (i < this.f9651Oooo0oO.size()) {
            OooO oooO = this.f9651Oooo0oO.get(i);
            int iOooO0Oo = this.f9655OoooO00.OooO0Oo(oooO.f9703OooO00o);
            if (iOooO0Oo != -1) {
                if (iOooO0Oo == -2) {
                    this.f9651Oooo0oO.remove(i);
                    i--;
                    if (!z2) {
                        this.f9655OoooO00.OooOOO(this);
                        z2 = true;
                    }
                    this.f9655OoooO00.OooO00o(this, oooO.f9704OooO0O0, oooO.f9703OooO00o);
                    int i2 = this.f9654OoooO0;
                    if (i2 == oooO.f9704OooO0O0) {
                        iMax = Math.max(0, Math.min(i2, (-1) + iOooO0OO));
                    }
                } else {
                    int i3 = oooO.f9704OooO0O0;
                    if (i3 != iOooO0Oo) {
                        if (i3 == this.f9654OoooO0) {
                            iMax = iOooO0Oo;
                        }
                        oooO.f9704OooO0O0 = iOooO0Oo;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.f9655OoooO00.OooO0O0(this);
        }
        Collections.sort(this.f9651Oooo0oO, f9647o00000Oo);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.f9698OooO00o) {
                    layoutParams.f9700OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
            }
            OooOoOO(iMax, false, true, 0);
            requestLayout();
        }
    }

    public final void OooO0o0(boolean z) {
        boolean z2 = this.f9676o00000O == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f9679o000oOoO.isFinished()) {
                this.f9679o000oOoO.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f9679o000oOoO.getCurrX();
                int currY = this.f9679o000oOoO.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        OooOOo0(currX);
                    }
                }
            }
        }
        this.f9668Oooooo = false;
        for (int i = 0; i < this.f9651Oooo0oO.size(); i++) {
            OooO oooO = this.f9651Oooo0oO.get(i);
            if (oooO.f9705OooO0OO) {
                oooO.f9705OooO0OO = false;
                z2 = true;
            }
        }
        if (z2) {
            if (!z) {
                this.f9677o00000O0.run();
                return;
            }
            OooO0OO oooO0OO = this.f9677o00000O0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOO0(this, oooO0OO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    public final void OooO0oO(int i) {
        OooOOO0 oooOOO0 = this.f9674o000000O;
        if (oooOOO0 != null) {
            oooOOO0.onPageSelected(i);
        }
        ?? r0 = this.f9673o000000;
        if (r0 != 0) {
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f9673o000000.get(i2);
                if (oooOOO1 != null) {
                    oooOOO1.onPageSelected(i);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f9675o000000o;
        if (oooOOO2 != null) {
            oooOOO2.onPageSelected(i);
        }
    }

    public final Rect OooO0oo(Rect rect, View view) {
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
        int i;
        int clientWidth = getClientWidth();
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = clientWidth > 0 ? this.f9660OoooOo0 / clientWidth : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        OooO oooO = null;
        float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f9651Oooo0oO.size()) {
            OooO oooO2 = this.f9651Oooo0oO.get(i3);
            if (!z && oooO2.f9704OooO0O0 != (i = i2 + 1)) {
                oooO2 = this.f9652Oooo0oo;
                oooO2.f9707OooO0o0 = f + f3 + f2;
                oooO2.f9704OooO0O0 = i;
                oooO2.f9706OooO0Oo = this.f9655OoooO00.OooO0o(i);
                i3--;
            }
            f = oooO2.f9707OooO0o0;
            float f4 = oooO2.f9706OooO0Oo + f + f2;
            if (!z && scrollX < f) {
                return oooO;
            }
            if (scrollX < f4 || i3 == this.f9651Oooo0oO.size() - 1) {
                return oooO2;
            }
            i2 = oooO2.f9704OooO0O0;
            f3 = oooO2.f9706OooO0Oo;
            i3++;
            oooO = oooO2;
            z = false;
        }
        return oooO;
    }

    public final OooO OooOO0O(int i) {
        for (int i2 = 0; i2 < this.f9651Oooo0oO.size(); i2++) {
            OooO oooO = this.f9651Oooo0oO.get(i2);
            if (oooO.f9704OooO0O0 == i) {
                return oooO;
            }
        }
        return null;
    }

    public final void OooOO0o() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f9679o000oOoO = new Scroller(context, f9648o00000o0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f9681o00Oo0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f9692o0ooOO0 = (int) (400.0f * f);
        this.f9693o0ooOOo = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9690o0Oo0oo = new EdgeEffect(context);
        this.f9688o0OO00O = new EdgeEffect(context);
        this.f9694o0ooOoO = (int) (25.0f * f);
        this.f9689o0OOO0o = (int) (2.0f * f);
        this.f9697ooOO = (int) (f * 16.0f);
        ViewCompat.OooOo0o(this, new OooOO0());
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
        ViewCompat.OooOOO.OooOo0(this, new OooO0o());
    }

    public final void OooOOO(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9685o00oO0o) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f9682o00Ooo = motionEvent.getX(i);
            this.f9685o00oO0o = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f9684o00oO0O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    @CallSuper
    public final void OooOOO0(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f9678o000OOo > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f9698OooO00o) {
                    int i4 = layoutParams.f9699OooO0O0 & 7;
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
        OooOOO0 oooOOO0 = this.f9674o000000O;
        if (oooOOO0 != null) {
            oooOOO0.onPageScrolled(i, f, i2);
        }
        ?? r0 = this.f9673o000000;
        if (r0 != 0) {
            int size = r0.size();
            for (int i6 = 0; i6 < size; i6++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f9673o000000.get(i6);
                if (oooOOO1 != null) {
                    oooOOO1.onPageScrolled(i, f, i2);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f9675o000000o;
        if (oooOOO2 != null) {
            oooOOO2.onPageScrolled(i, f, i2);
        }
        this.f9687o0O0O00 = true;
    }

    public final boolean OooOOOO() {
        int i = this.f9654OoooO0;
        if (i <= 0) {
            return false;
        }
        OooOoO(i - 1, true);
        return true;
    }

    public final boolean OooOOOo() {
        o00Ooo o00ooo2 = this.f9655OoooO00;
        if (o00ooo2 == null || this.f9654OoooO0 >= o00ooo2.OooO0OO() - 1) {
            return false;
        }
        OooOoO(this.f9654OoooO0 + 1, true);
        return true;
    }

    public final boolean OooOOo(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f9682o00Ooo - f;
        this.f9682o00Ooo = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f9664Ooooo0o * clientWidth;
        float f4 = this.f9665OooooO0 * clientWidth;
        boolean z3 = false;
        OooO oooO = this.f9651Oooo0oO.get(0);
        ArrayList<OooO> arrayList = this.f9651Oooo0oO;
        OooO oooO2 = arrayList.get(arrayList.size() - 1);
        if (oooO.f9704OooO0O0 != 0) {
            f3 = oooO.f9707OooO0o0 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (oooO2.f9704OooO0O0 != this.f9655OoooO00.OooO0OO() - 1) {
            f4 = oooO2.f9707OooO0o0 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f9690o0Oo0oo.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f9688o0OO00O.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f9682o00Ooo = (scrollX - i) + this.f9682o00Ooo;
        scrollTo(i, getScrollY());
        OooOOo0(i);
        return z3;
    }

    public final boolean OooOOo0(int i) {
        if (this.f9651Oooo0oO.size() == 0) {
            if (this.f9696oo0o0Oo) {
                return false;
            }
            this.f9687o0O0O00 = false;
            OooOOO0(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
            if (this.f9687o0O0O00) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        OooO oooOOooOO0 = OooOO0();
        int clientWidth = getClientWidth();
        int i2 = this.f9660OoooOo0;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = oooOOooOO0.f9704OooO0O0;
        float f2 = ((i / f) - oooOOooOO0.f9707OooO0o0) / (oooOOooOO0.f9706OooO0Oo + (i2 / f));
        this.f9687o0O0O00 = false;
        OooOOO0(i4, f2, (int) (i3 * f2));
        if (this.f9687o0O0O00) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final void OooOOoo() {
        OooOo00(this.f9654OoooO0);
    }

    public final boolean OooOo() {
        this.f9685o00oO0o = -1;
        this.f9671Ooooooo = false;
        this.f9691o0OoOo0 = false;
        VelocityTracker velocityTracker = this.f9684o00oO0O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9684o00oO0O = null;
        }
        this.f9690o0Oo0oo.onRelease();
        this.f9688o0OO00O.onRelease();
        return this.f9690o0Oo0oo.isFinished() || this.f9688o0OO00O.isFinished();
    }

    public final void OooOo0(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f9651Oooo0oO.isEmpty()) {
            if (!this.f9679o000oOoO.isFinished()) {
                this.f9679o000oOoO.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        OooO oooOOooOO0O = OooOO0O(this.f9654OoooO0);
        int iMin = (int) ((oooOOooOO0O != null ? Math.min(oooOOooOO0O.f9707OooO0o0, this.f9665OooooO0) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            OooO0o0(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ed A[PHI: r3 r6 r12
      0x00ed: PHI (r3v23 int) = (r3v22 int), (r3v10 int), (r3v25 int) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v8 int) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:60:0x00e2, B:57:0x00cc, B:51:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183 A[PHI: r1 r10
      0x0183: PHI (r1v39 float) = (r1v37 float), (r1v38 float), (r1v36 float) binds: [B:94:0x0178, B:91:0x015e, B:85:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r10v14 int) = (r10v12 int), (r10v13 int), (r10v11 int) binds: [B:94:0x0178, B:91:0x015e, B:85:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOo00(int i) {
        OooO oooOOooOO0O;
        String hexString;
        OooO oooOOooO00o;
        OooO OooO2;
        OooO OooO3;
        int i2;
        int i3;
        OooO oooO;
        OooO oooO2;
        int i4 = this.f9654OoooO0;
        if (i4 != i) {
            oooOOooOO0O = OooOO0O(i4);
            this.f9654OoooO0 = i;
        } else {
            oooOOooOO0O = null;
        }
        if (this.f9655OoooO00 == null || this.f9668Oooooo || getWindowToken() == null) {
            return;
        }
        this.f9655OoooO00.OooOOO(this);
        int i5 = this.f9670OoooooO;
        int iMax = Math.max(0, this.f9654OoooO0 - i5);
        int iOooO0OO = this.f9655OoooO00.OooO0OO();
        int iMin = Math.min(iOooO0OO - 1, this.f9654OoooO0 + i5);
        if (iOooO0OO != this.f9650Oooo0o) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sbOooO0o0.append(this.f9650Oooo0o);
            sbOooO0o0.append(", found: ");
            sbOooO0o0.append(iOooO0OO);
            sbOooO0o0.append(" Pager id: ");
            sbOooO0o0.append(hexString);
            sbOooO0o0.append(" Pager class: ");
            sbOooO0o0.append(getClass());
            sbOooO0o0.append(" Problematic adapter: ");
            sbOooO0o0.append(this.f9655OoooO00.getClass());
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        int i6 = 0;
        while (true) {
            if (i6 < this.f9651Oooo0oO.size()) {
                oooOOooO00o = this.f9651Oooo0oO.get(i6);
                int i7 = oooOOooO00o.f9704OooO0O0;
                int i8 = this.f9654OoooO0;
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
            oooOOooO00o = OooO00o(this.f9654OoooO0, i6);
        }
        if (oooOOooO00o != null) {
            int i9 = i6 - 1;
            OooO oooO3 = i9 >= 0 ? this.f9651Oooo0oO.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : (2.0f - oooOOooO00o.f9706OooO0Oo) + (getPaddingLeft() / clientWidth);
            float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            for (int i10 = this.f9654OoooO0 - 1; i10 >= 0; i10--) {
                if (f >= paddingLeft && i10 < iMax) {
                    if (oooO3 == null) {
                        break;
                    }
                    if (i10 == oooO3.f9704OooO0O0 && !oooO3.f9705OooO0OO) {
                        this.f9651Oooo0oO.remove(i9);
                        this.f9655OoooO00.OooO00o(this, i10, oooO3.f9703OooO00o);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            oooO3 = this.f9651Oooo0oO.get(i9);
                        } else {
                            oooO3 = null;
                        }
                    }
                } else if (oooO3 == null || i10 != oooO3.f9704OooO0O0) {
                    f += OooO00o(i10, i9 + 1).f9706OooO0Oo;
                    i6++;
                    if (i9 >= 0) {
                        oooO3 = this.f9651Oooo0oO.get(i9);
                    } else {
                        oooO3 = null;
                    }
                } else {
                    f += oooO3.f9706OooO0Oo;
                    i9--;
                    if (i9 >= 0) {
                        oooO3 = this.f9651Oooo0oO.get(i9);
                    } else {
                        oooO3 = null;
                    }
                }
            }
            float f2 = oooOOooO00o.f9706OooO0Oo;
            int i11 = i6 + 1;
            if (f2 < 2.0f) {
                OooO oooO4 = i11 < this.f9651Oooo0oO.size() ? this.f9651Oooo0oO.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.f9654OoooO0 + 1; i13 < iOooO0OO; i13++) {
                    if (f2 >= paddingRight && i13 > iMin) {
                        if (oooO4 == null) {
                            break;
                        }
                        if (i13 == oooO4.f9704OooO0O0 && !oooO4.f9705OooO0OO) {
                            this.f9651Oooo0oO.remove(i12);
                            this.f9655OoooO00.OooO00o(this, i13, oooO4.f9703OooO00o);
                            if (i12 < this.f9651Oooo0oO.size()) {
                                oooO4 = this.f9651Oooo0oO.get(i12);
                            } else {
                                oooO4 = null;
                            }
                        }
                    } else if (oooO4 == null || i13 != oooO4.f9704OooO0O0) {
                        OooO oooOOooO00o2 = OooO00o(i13, i12);
                        i12++;
                        f2 += oooOOooO00o2.f9706OooO0Oo;
                        if (i12 < this.f9651Oooo0oO.size()) {
                            oooO4 = this.f9651Oooo0oO.get(i12);
                        } else {
                            oooO4 = null;
                        }
                    } else {
                        f2 += oooO4.f9706OooO0Oo;
                        i12++;
                        if (i12 < this.f9651Oooo0oO.size()) {
                            oooO4 = this.f9651Oooo0oO.get(i12);
                        } else {
                            oooO4 = null;
                        }
                    }
                }
            }
            int iOooO0OO2 = this.f9655OoooO00.OooO0OO();
            int clientWidth2 = getClientWidth();
            float f3 = clientWidth2 > 0 ? this.f9660OoooOo0 / clientWidth2 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (oooOOooOO0O != null) {
                int i14 = oooOOooOO0O.f9704OooO0O0;
                int i15 = oooOOooO00o.f9704OooO0O0;
                if (i14 < i15) {
                    float fOooO0o = oooOOooOO0O.f9707OooO0o0 + oooOOooOO0O.f9706OooO0Oo + f3;
                    int i16 = 0;
                    while (true) {
                        i14++;
                        if (i14 > oooOOooO00o.f9704OooO0O0 || i16 >= this.f9651Oooo0oO.size()) {
                            break;
                        }
                        OooO oooO5 = this.f9651Oooo0oO.get(i16);
                        while (true) {
                            oooO2 = oooO5;
                            if (i14 <= oooO2.f9704OooO0O0 || i16 >= this.f9651Oooo0oO.size() - 1) {
                                break;
                            }
                            i16++;
                            oooO5 = this.f9651Oooo0oO.get(i16);
                        }
                        while (i14 < oooO2.f9704OooO0O0) {
                            fOooO0o += this.f9655OoooO00.OooO0o(i14) + f3;
                            i14++;
                        }
                        oooO2.f9707OooO0o0 = fOooO0o;
                        fOooO0o += oooO2.f9706OooO0Oo + f3;
                    }
                } else if (i14 > i15) {
                    int size = this.f9651Oooo0oO.size() - 1;
                    float fOooO0o2 = oooOOooOO0O.f9707OooO0o0;
                    while (true) {
                        i14--;
                        if (i14 < oooOOooO00o.f9704OooO0O0 || size < 0) {
                            break;
                        }
                        OooO oooO6 = this.f9651Oooo0oO.get(size);
                        while (true) {
                            oooO = oooO6;
                            if (i14 >= oooO.f9704OooO0O0 || size <= 0) {
                                break;
                            }
                            size--;
                            oooO6 = this.f9651Oooo0oO.get(size);
                        }
                        while (i14 > oooO.f9704OooO0O0) {
                            fOooO0o2 -= this.f9655OoooO00.OooO0o(i14) + f3;
                            i14--;
                        }
                        fOooO0o2 -= oooO.f9706OooO0Oo + f3;
                        oooO.f9707OooO0o0 = fOooO0o2;
                    }
                }
            }
            int size2 = this.f9651Oooo0oO.size();
            float fOooO0o3 = oooOOooO00o.f9707OooO0o0;
            int i17 = oooOOooO00o.f9704OooO0O0;
            int i18 = i17 - 1;
            this.f9664Ooooo0o = i17 == 0 ? fOooO0o3 : -3.4028235E38f;
            int i19 = iOooO0OO2 - 1;
            this.f9665OooooO0 = i17 == i19 ? (oooOOooO00o.f9706OooO0Oo + fOooO0o3) - 1.0f : Float.MAX_VALUE;
            int i20 = i6 - 1;
            while (i20 >= 0) {
                OooO oooO7 = this.f9651Oooo0oO.get(i20);
                while (true) {
                    i3 = oooO7.f9704OooO0O0;
                    if (i18 <= i3) {
                        break;
                    }
                    fOooO0o3 -= this.f9655OoooO00.OooO0o(i18) + f3;
                    i18--;
                }
                fOooO0o3 -= oooO7.f9706OooO0Oo + f3;
                oooO7.f9707OooO0o0 = fOooO0o3;
                if (i3 == 0) {
                    this.f9664Ooooo0o = fOooO0o3;
                }
                i20--;
                i18--;
            }
            float fOooO0o4 = oooOOooO00o.f9707OooO0o0 + oooOOooO00o.f9706OooO0Oo + f3;
            int i21 = oooOOooO00o.f9704OooO0O0;
            while (true) {
                i21++;
                if (i11 >= size2) {
                    break;
                }
                OooO oooO8 = this.f9651Oooo0oO.get(i11);
                while (true) {
                    i2 = oooO8.f9704OooO0O0;
                    if (i21 >= i2) {
                        break;
                    }
                    fOooO0o4 += this.f9655OoooO00.OooO0o(i21) + f3;
                    i21++;
                }
                if (i2 == i19) {
                    this.f9665OooooO0 = (oooO8.f9706OooO0Oo + fOooO0o4) - 1.0f;
                }
                oooO8.f9707OooO0o0 = fOooO0o4;
                fOooO0o4 += oooO8.f9706OooO0Oo + f3;
                i11++;
            }
            this.f9655OoooO00.OooOOO0(this, this.f9654OoooO0, oooOOooO00o.f9703OooO00o);
        }
        this.f9655OoooO00.OooO0O0(this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams);
            if (!layoutParams.f9698OooO00o && layoutParams.f9700OooO0OO == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (OooO3 = OooO(childAt)) != null) {
                layoutParams.f9700OooO0OO = OooO3.f9706OooO0Oo;
                layoutParams.f9702OooO0o0 = OooO3.f9704OooO0O0;
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
            if (OooO2 == null || OooO2.f9704OooO0O0 != this.f9654OoooO0) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    OooO OooO4 = OooO(childAt2);
                    if (OooO4 != null && OooO4.f9704OooO0O0 == this.f9654OoooO0 && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    public void OooOo0O(@NonNull OooOOO0 oooOOO0) {
        ?? r0 = this.f9673o000000;
        if (r0 != 0) {
            r0.remove(oooOOO0);
        }
    }

    public final void OooOo0o() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void OooOoO(int i, boolean z) {
        this.f9668Oooooo = false;
        OooOoOO(i, z, false, 0);
    }

    public final void OooOoO0(int i, boolean z, int i2, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        OooO oooOOooOO0O = OooOO0O(i);
        if (oooOOooOO0O != null) {
            iMax = (int) (Math.max(this.f9664Ooooo0o, Math.min(oooOOooOO0O.f9707OooO0o0, this.f9665OooooO0)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                OooO0oO(i);
            }
            OooO0o0(false);
            scrollTo(iMax, 0);
            OooOOo0(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f9679o000oOoO;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f9658OoooOOO ? this.f9679o000oOoO.getCurrX() : this.f9679o000oOoO.getStartX();
                this.f9679o000oOoO.abortAnimation();
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
                OooOOoo();
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
                    iAbs = (int) (((Math.abs(i4) / ((this.f9655OoooO00.OooO0o(this.f9654OoooO0) * f) + this.f9660OoooOo0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f9658OoooOOO = false;
                this.f9679o000oOoO.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
        }
        if (z2) {
            OooO0oO(i);
        }
    }

    public final void OooOoOO(int i, boolean z, boolean z2, int i2) {
        o00Ooo o00ooo2 = this.f9655OoooO00;
        if (o00ooo2 == null || o00ooo2.OooO0OO() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f9654OoooO0 == i && this.f9651Oooo0oO.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f9655OoooO00.OooO0OO()) {
            i = this.f9655OoooO00.OooO0OO() - 1;
        }
        int i3 = this.f9670OoooooO;
        int i4 = this.f9654OoooO0;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f9651Oooo0oO.size(); i5++) {
                this.f9651Oooo0oO.get(i5).f9705OooO0OO = true;
            }
        }
        boolean z3 = this.f9654OoooO0 != i;
        if (!this.f9696oo0o0Oo) {
            OooOo00(i);
            OooOoO0(i, z, i2, z3);
        } else {
            this.f9654OoooO0 = i;
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
                if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f9704OooO0O0 == this.f9654OoooO0) {
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
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f9704OooO0O0 == this.f9654OoooO0) {
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
        boolean z = layoutParams2.f9698OooO00o | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f9698OooO00o = z;
        if (!this.f9667OooooOo) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f9701OooO0Oo = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f9655OoooO00 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f9664Ooooo0o));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f9665OooooO0));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f9658OoooOOO = true;
        if (this.f9679o000oOoO.isFinished() || !this.f9679o000oOoO.computeScrollOffset()) {
            OooO0o0(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f9679o000oOoO.getCurrX();
        int currY = this.f9679o000oOoO.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!OooOOo0(currX)) {
                this.f9679o000oOoO.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zOooOOOO;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zOooOOOO = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    zOooOOOO = keyEvent.hasModifiers(2) ? OooOOOO() : OooO0OO(17);
                } else if (keyCode == 22) {
                    zOooOOOO = keyEvent.hasModifiers(2) ? OooOOOo() : OooO0OO(66);
                } else if (keyCode != 61) {
                    zOooOOOO = false;
                } else if (keyEvent.hasNoModifiers()) {
                    zOooOOOO = OooO0OO(2);
                } else if (keyEvent.hasModifiers(1)) {
                    zOooOOOO = OooO0OO(1);
                } else {
                    zOooOOOO = false;
                }
            }
            if (!zOooOOOO) {
                return false;
            }
        }
        return true;
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
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f9704OooO0O0 == this.f9654OoooO0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o00Ooo o00ooo2;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (o00ooo2 = this.f9655OoooO00) != null && o00ooo2.OooO0OO() > 1)) {
            if (!this.f9690o0Oo0oo.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f9664Ooooo0o * width);
                this.f9690o0Oo0oo.setSize(height, width);
                zDraw = false | this.f9690o0Oo0oo.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f9688o0OO00O.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f9665OooooO0 + 1.0f)) * width2);
                this.f9688o0OO00O.setSize(height2, width2);
                zDraw |= this.f9688o0OO00O.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f9690o0Oo0oo.finish();
            this.f9688o0OO00O.finish();
        }
        if (zDraw) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9661OoooOoO;
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
    public o00Ooo getAdapter() {
        return this.f9655OoooO00;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f9654OoooO0;
    }

    public int getOffscreenPageLimit() {
        return this.f9670OoooooO;
    }

    public int getPageMargin() {
        return this.f9660OoooOo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9696oo0o0Oo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f9677o00000O0);
        Scroller scroller = this.f9679o000oOoO;
        if (scroller != null && !scroller.isFinished()) {
            this.f9679o000oOoO.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.f9660OoooOo0 <= 0 || this.f9661OoooOoO == null || this.f9651Oooo0oO.size() <= 0 || this.f9655OoooO00 == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.f9660OoooOo0 / f2;
        int i2 = 0;
        OooO oooO = this.f9651Oooo0oO.get(0);
        float f4 = oooO.f9707OooO0o0;
        int size = this.f9651Oooo0oO.size();
        int i3 = oooO.f9704OooO0O0;
        int i4 = this.f9651Oooo0oO.get(size - 1).f9704OooO0O0;
        while (i3 < i4) {
            while (true) {
                i = oooO.f9704OooO0O0;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                oooO = this.f9651Oooo0oO.get(i2);
            }
            if (i3 == i) {
                float f5 = oooO.f9707OooO0o0;
                float f6 = oooO.f9706OooO0Oo;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fOooO0o = this.f9655OoooO00.OooO0o(i3);
                f = (f4 + fOooO0o) * f2;
                f4 = fOooO0o + f3 + f4;
            }
            if (this.f9660OoooOo0 + f > scrollX) {
                this.f9661OoooOoO.setBounds(Math.round(f), this.f9662OoooOoo, Math.round(this.f9660OoooOo0 + f), this.f9663Ooooo00);
                this.f9661OoooOoO.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            OooOo();
            return false;
        }
        if (action != 0) {
            if (this.f9671Ooooooo) {
                return true;
            }
            if (this.f9691o0OoOo0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f9686o00ooo = x;
            this.f9682o00Ooo = x;
            float y = motionEvent.getY();
            this.f9695oo000o = y;
            this.f9683o00o0O = y;
            this.f9685o00oO0o = motionEvent.getPointerId(0);
            this.f9691o0OoOo0 = false;
            this.f9658OoooOOO = true;
            this.f9679o000oOoO.computeScrollOffset();
            if (this.f9676o00000O != 2 || Math.abs(this.f9679o000oOoO.getFinalX() - this.f9679o000oOoO.getCurrX()) <= this.f9689o0OOO0o) {
                OooO0o0(false);
                this.f9671Ooooooo = false;
            } else {
                this.f9679o000oOoO.abortAnimation();
                this.f9668Oooooo = false;
                OooOOoo();
                this.f9671Ooooooo = true;
                OooOo0o();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f9685o00oO0o;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f9682o00Ooo;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f9695oo000o);
                if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    float f2 = this.f9682o00Ooo;
                    if (!((f2 < ((float) this.f9680o00O0O) && f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || (f2 > ((float) (getWidth() - this.f9680o00O0O)) && f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) && OooO0Oo(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f9682o00Ooo = x2;
                        this.f9683o00o0O = y2;
                        this.f9691o0OoOo0 = true;
                        return false;
                    }
                }
                float f3 = this.f9681o00Oo0;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f9671Ooooooo = true;
                    OooOo0o();
                    setScrollState(1);
                    float f4 = this.f9686o00ooo;
                    float f5 = this.f9681o00Oo0;
                    this.f9682o00Ooo = f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? f4 + f5 : f4 - f5;
                    this.f9683o00o0O = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.f9691o0OoOo0 = true;
                }
                if (this.f9671Ooooooo && OooOOo(x2)) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
            }
        } else if (action == 6) {
            OooOOO(motionEvent);
        }
        if (this.f9684o00oO0O == null) {
            this.f9684o00oO0O = VelocityTracker.obtain();
        }
        this.f9684o00oO0O.addMovement(motionEvent);
        return this.f9671Ooooooo;
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
                if (layoutParams.f9698OooO00o) {
                    int i9 = layoutParams.f9699OooO0O0;
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
                if (!layoutParams2.f9698OooO00o && (OooO2 = OooO(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (OooO2.f9707OooO0o0 * f)) + paddingLeft;
                    if (layoutParams2.f9701OooO0Oo) {
                        layoutParams2.f9701OooO0Oo = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f9700OooO0OO), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f9662OoooOoo = paddingTop;
        this.f9663Ooooo00 = i6 - paddingBottom;
        this.f9678o000OOo = i7;
        if (this.f9696oo0o0Oo) {
            z2 = false;
            OooOoO0(this.f9654OoooO0, false, 0, false);
        } else {
            z2 = false;
        }
        this.f9696oo0o0Oo = z2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f9680o00O0O = Math.min(measuredWidth / 10, this.f9697ooOO);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f9698OooO00o) {
                int i8 = layoutParams2.f9699OooO0O0;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                    i4 = ((ViewGroup.LayoutParams) layoutParams2).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) layoutParams2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f9666OooooOO = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f9667OooooOo = true;
        OooOOoo();
        this.f9667OooooOo = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f9698OooO00o)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f9700OooO0OO), 1073741824), this.f9666OooooOO);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        OooO OooO2;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (OooO2 = OooO(childAt)) != null && OooO2.f9704OooO0O0 == this.f9654OoooO0 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
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
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        o00Ooo o00ooo2 = this.f9655OoooO00;
        if (o00ooo2 != null) {
            o00ooo2.OooOO0O(savedState.f9713Oooo, savedState.f9715OoooO00);
            OooOoOO(savedState.f9714Oooo0oo, false, true, 0);
        } else {
            this.f9656OoooO0O = savedState.f9714Oooo0oo;
            this.f9653OoooO = savedState.f9713Oooo;
            this.f9657OoooOO0 = savedState.f9715OoooO00;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9714Oooo0oo = this.f9654OoooO0;
        o00Ooo o00ooo2 = this.f9655OoooO00;
        if (o00ooo2 != null) {
            savedState.f9713Oooo = o00ooo2.OooOO0o();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f9660OoooOo0;
            OooOo0(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o00Ooo o00ooo2;
        boolean zOooOo = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (o00ooo2 = this.f9655OoooO00) == null || o00ooo2.OooO0OO() == 0) {
            return false;
        }
        if (this.f9684o00oO0O == null) {
            this.f9684o00oO0O = VelocityTracker.obtain();
        }
        this.f9684o00oO0O.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f9679o000oOoO.abortAnimation();
            this.f9668Oooooo = false;
            OooOOoo();
            float x = motionEvent.getX();
            this.f9686o00ooo = x;
            this.f9682o00Ooo = x;
            float y = motionEvent.getY();
            this.f9695oo000o = y;
            this.f9683o00o0O = y;
            this.f9685o00oO0o = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f9682o00Ooo = motionEvent.getX(actionIndex);
                        this.f9685o00oO0o = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        OooOOO(motionEvent);
                        this.f9682o00Ooo = motionEvent.getX(motionEvent.findPointerIndex(this.f9685o00oO0o));
                    }
                } else if (this.f9671Ooooooo) {
                    OooOoO0(this.f9654OoooO0, true, 0, false);
                    zOooOo = OooOo();
                }
            } else if (!this.f9671Ooooooo) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9685o00oO0o);
                if (iFindPointerIndex == -1) {
                    zOooOo = OooOo();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f9682o00Ooo);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f9683o00o0O);
                    if (fAbs > this.f9681o00Oo0 && fAbs > fAbs2) {
                        this.f9671Ooooooo = true;
                        OooOo0o();
                        float f = this.f9686o00ooo;
                        this.f9682o00Ooo = x2 - f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? f + this.f9681o00Oo0 : f - this.f9681o00Oo0;
                        this.f9683o00o0O = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f9671Ooooooo) {
                        zOooOo = false | OooOOo(motionEvent.getX(motionEvent.findPointerIndex(this.f9685o00oO0o)));
                    }
                }
            } else if (this.f9671Ooooooo) {
                zOooOo = false | OooOOo(motionEvent.getX(motionEvent.findPointerIndex(this.f9685o00oO0o)));
            }
        } else if (this.f9671Ooooooo) {
            VelocityTracker velocityTracker = this.f9684o00oO0O;
            velocityTracker.computeCurrentVelocity(1000, this.f9693o0ooOOo);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f9685o00oO0o);
            this.f9668Oooooo = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            OooO oooOOooOO0 = OooOO0();
            float f2 = clientWidth;
            float f3 = this.f9660OoooOo0 / f2;
            int iMax = oooOOooOO0.f9704OooO0O0;
            float f4 = ((scrollX / f2) - oooOOooOO0.f9707OooO0o0) / (oooOOooOO0.f9706OooO0Oo + f3);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f9685o00oO0o)) - this.f9686o00ooo)) <= this.f9694o0ooOoO || Math.abs(xVelocity) <= this.f9692o0ooOO0) {
                iMax += (int) (f4 + (iMax >= this.f9654OoooO0 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            if (this.f9651Oooo0oO.size() > 0) {
                OooO oooO = this.f9651Oooo0oO.get(0);
                ArrayList<OooO> arrayList = this.f9651Oooo0oO;
                iMax = Math.max(oooO.f9704OooO0O0, Math.min(iMax, arrayList.get(arrayList.size() - 1).f9704OooO0O0));
            }
            OooOoOO(iMax, true, true, xVelocity);
            zOooOo = OooOo();
        }
        if (zOooOo) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f9667OooooOo) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOO0O>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOO0O>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOO0O>] */
    public void setAdapter(@Nullable o00Ooo o00ooo2) {
        o00Ooo o00ooo3 = this.f9655OoooO00;
        if (o00ooo3 != null) {
            synchronized (o00ooo3) {
                o00ooo3.f29923OooO0O0 = null;
            }
            this.f9655OoooO00.OooOOO(this);
            for (int i = 0; i < this.f9651Oooo0oO.size(); i++) {
                OooO oooO = this.f9651Oooo0oO.get(i);
                this.f9655OoooO00.OooO00o(this, oooO.f9704OooO0O0, oooO.f9703OooO00o);
            }
            this.f9655OoooO00.OooO0O0(this);
            this.f9651Oooo0oO.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f9698OooO00o) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f9654OoooO0 = 0;
            scrollTo(0, 0);
        }
        o00Ooo o00ooo4 = this.f9655OoooO00;
        this.f9655OoooO00 = o00ooo2;
        this.f9650Oooo0o = 0;
        if (o00ooo2 != null) {
            if (this.f9659OoooOOo == null) {
                this.f9659OoooOOo = new OooOOO();
            }
            o00Ooo o00ooo5 = this.f9655OoooO00;
            OooOOO oooOOO = this.f9659OoooOOo;
            synchronized (o00ooo5) {
                o00ooo5.f29923OooO0O0 = oooOOO;
            }
            this.f9668Oooooo = false;
            boolean z = this.f9696oo0o0Oo;
            this.f9696oo0o0Oo = true;
            this.f9650Oooo0o = this.f9655OoooO00.OooO0OO();
            if (this.f9656OoooO0O >= 0) {
                this.f9655OoooO00.OooOO0O(this.f9653OoooO, this.f9657OoooOO0);
                OooOoOO(this.f9656OoooO0O, false, true, 0);
                this.f9656OoooO0O = -1;
                this.f9653OoooO = null;
                this.f9657OoooOO0 = null;
            } else if (z) {
                requestLayout();
            } else {
                OooOOoo();
            }
        }
        ?? r2 = this.f9672o00000;
        if (r2 == 0 || r2.isEmpty()) {
            return;
        }
        int size = this.f9672o00000.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((OooOO0O) this.f9672o00000.get(i3)).OooO00o(this, o00ooo4, o00ooo2);
        }
    }

    public void setCurrentItem(int i) {
        this.f9668Oooooo = false;
        OooOoOO(i, !this.f9696oo0o0Oo, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f9670OoooooO) {
            this.f9670OoooooO = i;
            OooOOoo();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OooOOO0 oooOOO0) {
        this.f9674o000000O = oooOOO0;
    }

    public void setPageMargin(int i) {
        int i2 = this.f9660OoooOo0;
        this.f9660OoooOo0 = i;
        int width = getWidth();
        OooOo0(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f9661OoooOoO = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOOO0>] */
    public void setScrollState(int i) {
        if (this.f9676o00000O == i) {
            return;
        }
        this.f9676o00000O = i;
        OooOOO0 oooOOO0 = this.f9674o000000O;
        if (oooOOO0 != null) {
            oooOOO0.onPageScrollStateChanged(i);
        }
        ?? r0 = this.f9673o000000;
        if (r0 != 0) {
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOOO0 oooOOO1 = (OooOOO0) this.f9673o000000.get(i2);
                if (oooOOO1 != null) {
                    oooOOO1.onPageScrollStateChanged(i);
                }
            }
        }
        OooOOO0 oooOOO2 = this.f9675o000000o;
        if (oooOOO2 != null) {
            oooOOO2.onPageScrollStateChanged(i);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9661OoooOoO;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f9698OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9699OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f9700OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f9701OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9702OooO0o0;

        public LayoutParams() {
            super(-1, -1);
            this.f9700OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9700OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f9646o00000OO);
            this.f9699OooO0O0 = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setPageMarginDrawable(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9651Oooo0oO = new ArrayList<>();
        this.f9652Oooo0oo = new OooO();
        this.f9649Oooo = new Rect();
        this.f9656OoooO0O = -1;
        this.f9653OoooO = null;
        this.f9657OoooOO0 = null;
        this.f9664Ooooo0o = -3.4028235E38f;
        this.f9665OooooO0 = Float.MAX_VALUE;
        this.f9670OoooooO = 1;
        this.f9685o00oO0o = -1;
        this.f9696oo0o0Oo = true;
        this.f9677o00000O0 = new OooO0OO();
        this.f9676o00000O = 0;
        OooOO0o();
    }
}
