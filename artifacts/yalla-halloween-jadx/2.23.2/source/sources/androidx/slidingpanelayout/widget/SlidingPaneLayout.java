package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11048OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f11049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Drawable f11050OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11051OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Drawable f11052OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f11053OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View f11054OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f11055OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f11056OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11057OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f11058OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f11059OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f11060OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final p056o0000Oo0.OooO0o f11061OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f11062OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f11063OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Rect f11064OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f11065OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final ArrayList<OooO0O0> f11066OooOo0O;

    public class OooO00o extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f11072OooO00o = new Rect();

        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, o0O0O00 o0o0o00) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(o0o0o00.f33510OooO00o);
            o0O0O00 o0o0o01 = new o0O0O00(accessibilityNodeInfoObtain);
            super.onInitializeAccessibilityNodeInfo(view, o0o0o01);
            Rect rect = this.f11072OooO00o;
            o0o0o01.OooO0o(rect);
            o0o0o00.OooOO0(rect);
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            AccessibilityNodeInfo accessibilityNodeInfo = o0o0o00.f33510OooO00o;
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            o0o0o00.OooOO0O(accessibilityNodeInfoObtain.getClassName());
            o0o0o00.OooOOO(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            o0o0o00.OooO0oo(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            o0o0o00.OooO00o(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            o0o0o00.OooOO0O(SlidingPaneLayout.class.getName());
            o0o0o00.f33512OooO0OO = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            Object objOooO0o = ViewCompat.OooO0o.OooO0o(view);
            if (objOooO0o instanceof View) {
                o0o0o00.f33511OooO0O0 = -1;
                accessibilityNodeInfo.setParent((View) objOooO0o);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = slidingPaneLayout.getChildAt(i);
                if (!slidingPaneLayout.OooO0O0(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.OooO0o.OooOOoo(childAt, 1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.OooO0O0(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f11074OooO0Oo;

        public OooO0O0(View view) {
            this.f11074OooO0Oo = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f11074OooO0Oo;
            ViewParent parent = view.getParent();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (parent == slidingPaneLayout) {
                view.setLayerType(0, null);
                slidingPaneLayout.getClass();
                Paint paint = ((LayoutParams) view.getLayoutParams()).f11071OooO0Oo;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO.OooO(view, paint);
            }
            slidingPaneLayout.f11066OooOo0O.remove(this);
        }
    }

    public class OooO0OO extends o0000Oo0.OooO0o.OooO0OO {
        public OooO0OO() {
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f11054OooOO0 == null) {
                slidingPaneLayout.f11055OooOO0O = 0.0f;
            } else {
                boolean zOooO0OO = slidingPaneLayout.OooO0OO();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f11054OooOO0.getLayoutParams();
                int width = slidingPaneLayout.f11054OooOO0.getWidth();
                if (zOooO0OO) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((zOooO0OO ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f11058OooOOO0;
                slidingPaneLayout.f11055OooOO0O = paddingRight;
                if (slidingPaneLayout.f11059OooOOOO != 0) {
                    slidingPaneLayout.OooO0Oo(paddingRight);
                }
                if (layoutParams.f11070OooO0OO) {
                    slidingPaneLayout.OooO00o(slidingPaneLayout.f11055OooOO0O, slidingPaneLayout.f11049OooO0Oo, slidingPaneLayout.f11054OooOO0);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO00o(View view, int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f11054OooOO0.getLayoutParams();
            if (!slidingPaneLayout.OooO0OO()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.f11058OooOOO0 + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f11054OooOO0.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i, width), width - slidingPaneLayout.f11058OooOOO0);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0O0(View view, int i) {
            return view.getTop();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0OO(View view) {
            return SlidingPaneLayout.this.f11058OooOOO0;
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0o0(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f11061OooOOo.OooO0OO(i2, slidingPaneLayout.f11054OooOO0);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oO(int i, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oo(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f11061OooOOo.f33647OooO00o == 0) {
                if (slidingPaneLayout.f11055OooOO0O != 0.0f) {
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f11063OooOOoo = true;
                } else {
                    slidingPaneLayout.OooO0o(slidingPaneLayout.f11054OooOO0);
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f11063OooOOoo = false;
                }
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooOO0(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.OooO0OO()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && slidingPaneLayout.f11055OooOO0O > 0.5f)) {
                    paddingRight += slidingPaneLayout.f11058OooOOO0;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f11054OooOO0.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && slidingPaneLayout.f11055OooOO0O > 0.5f)) {
                    paddingLeft += slidingPaneLayout.f11058OooOOO0;
                }
            }
            slidingPaneLayout.f11061OooOOo.OooOo00(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final boolean OooOO0O(int i, View view) {
            if (SlidingPaneLayout.this.f11057OooOOO) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f11069OooO0O0;
        }
    }

    public interface OooO0o {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f11077OooO0o;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f11077OooO0o = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f11077OooO0o ? 1 : 0);
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO00o(float f, int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                Paint paint = layoutParams.f11071OooO0Oo;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                OooO0O0 oooO0O0 = new OooO0O0(view);
                this.f11066OooOo0O.add(oooO0O0);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO0(this, oooO0O0);
                return;
            }
            return;
        }
        int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
        if (layoutParams.f11071OooO0Oo == null) {
            layoutParams.f11071OooO0Oo = new Paint();
        }
        layoutParams.f11071OooO0Oo.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f11071OooO0Oo);
        }
        Paint paint2 = ((LayoutParams) view.getLayoutParams()).f11071OooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        ViewCompat.OooO.OooO(view, paint2);
    }

    public final boolean OooO0O0(View view) {
        if (view == null) {
            return false;
        }
        return this.f11048OooO && ((LayoutParams) view.getLayoutParams()).f11070OooO0OO && this.f11055OooOO0O > 0.0f;
    }

    public final boolean OooO0OO() {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void OooO0Oo(float f) {
        boolean z;
        boolean zOooO0OO = OooO0OO();
        LayoutParams layoutParams = (LayoutParams) this.f11054OooOO0.getLayoutParams();
        if (!layoutParams.f11070OooO0OO) {
            z = false;
        } else if ((zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) <= 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f11054OooOO0) {
                float f2 = 1.0f - this.f11056OooOO0o;
                int i2 = this.f11059OooOOOO;
                this.f11056OooOO0o = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zOooO0OO) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    float f3 = this.f11056OooOO0o;
                    OooO00o(zOooO0OO ? f3 - 1.0f : 1.0f - f3, this.f11051OooO0o0, childAt);
                }
            }
        }
    }

    public final void OooO0o(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zOooO0OO = OooO0OO();
        int width = zOooO0OO ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zOooO0OO ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zOooO0OO ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zOooO0OO ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zOooO0OO = zOooO0OO;
        }
    }

    public final boolean OooO0o0(float f) {
        int paddingLeft;
        if (!this.f11048OooO) {
            return false;
        }
        boolean zOooO0OO = OooO0OO();
        LayoutParams layoutParams = (LayoutParams) this.f11054OooOO0.getLayoutParams();
        if (zOooO0OO) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f * this.f11058OooOOO0) + paddingRight) + this.f11054OooOO0.getWidth()));
        } else {
            paddingLeft = (int) ((f * this.f11058OooOOO0) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        View view = this.f11054OooOO0;
        if (!this.f11061OooOOo.OooOo0O(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        p056o0000Oo0.OooO0o oooO0o = this.f11061OooOOo;
        if (oooO0o.OooO0oo()) {
            if (!this.f11048OooO) {
                oooO0o.OooO00o();
            } else {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = OooO0OO() ? this.f11052OooO0oO : this.f11050OooO0o;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (OooO0OO()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f11048OooO && !layoutParams.f11069OooO0O0 && this.f11054OooOO0 != null) {
            Rect rect = this.f11064OooOo0;
            canvas.getClipBounds(rect);
            if (OooO0OO()) {
                rect.left = Math.max(rect.left, this.f11054OooOO0.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f11054OooOO0.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.f11051OooO0o0;
    }

    @Px
    public int getParallaxDistance() {
        return this.f11059OooOOOO;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f11049OooO0Oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11065OooOo00 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11065OooOo00 = true;
        ArrayList<OooO0O0> arrayList = this.f11066OooOo0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).run();
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f11048OooO;
        p056o0000Oo0.OooO0o oooO0o = this.f11061OooOOo;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            oooO0o.getClass();
            this.f11063OooOOoo = !p056o0000Oo0.OooO0o.OooOOO0(childAt, x, y);
        }
        if (!this.f11048OooO || (this.f11057OooOOO && actionMasked != 0)) {
            oooO0o.OooO0O0();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            oooO0o.OooO0O0();
            return false;
        }
        if (actionMasked == 0) {
            this.f11057OooOOO = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f11060OooOOOo = x2;
            this.f11062OooOOo0 = y2;
            oooO0o.getClass();
            if (p056o0000Oo0.OooO0o.OooOOO0(this.f11054OooOO0, (int) x2, (int) y2) && OooO0O0(this.f11054OooOO0)) {
                z = true;
            }
            return oooO0o.OooOo0(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f11060OooOOOo);
            float fAbs2 = Math.abs(y3 - this.f11062OooOOo0);
            if (fAbs > oooO0o.f33648OooO0O0 && fAbs2 > fAbs) {
                oooO0o.OooO0O0();
                this.f11057OooOOO = true;
                return false;
            }
        }
        z = false;
        if (oooO0o.OooOo0(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zOooO0OO = OooO0OO();
        p056o0000Oo0.OooO0o oooO0o = this.f11061OooOOo;
        if (zOooO0OO) {
            oooO0o.f33663OooOOo0 = 2;
        } else {
            oooO0o.f33663OooOOo0 = 1;
        }
        int i10 = i3 - i;
        int paddingRight = zOooO0OO ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zOooO0OO ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f11065OooOo00) {
            this.f11055OooOO0O = (this.f11048OooO && this.f11063OooOOoo) ? 1.0f : 0.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f11069OooO0O0) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13 - this.f11053OooO0oo) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f11058OooOOO0 = iMin;
                    int i14 = zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f11070OooO0OO = (measuredWidth / 2) + ((i11 + i14) + iMin) > i13;
                    int i15 = (int) (iMin * this.f11055OooOO0O);
                    i5 = i14 + i15 + i11;
                    this.f11055OooOO0O = i15 / iMin;
                    i6 = 0;
                } else if (!this.f11048OooO || (i7 = this.f11059OooOOOO) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f11055OooOO0O) * i7);
                    i5 = paddingRight;
                }
                if (zOooO0OO) {
                    i9 = (i10 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i11 = i5;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.f11065OooOo00) {
            if (this.f11048OooO) {
                if (this.f11059OooOOOO != 0) {
                    OooO0Oo(this.f11055OooOO0O);
                }
                if (((LayoutParams) this.f11054OooOO0.getLayoutParams()).f11070OooO0OO) {
                    OooO00o(this.f11055OooOO0O, this.f11049OooO0Oo, this.f11054OooOO0);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    OooO00o(0.0f, this.f11049OooO0Oo, getChildAt(i16));
                }
            }
            OooO0o(this.f11054OooOO0);
        }
        this.f11065OooOo00 = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[PHI: r13
      0x00ad: PHI (r13v2 float) = (r13v1 float), (r13v8 float) binds: [B:36:0x00a4, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int i6;
        int iMakeMeasureSpec2;
        int i7;
        int i8;
        float f;
        int i9;
        int iMakeMeasureSpec3;
        int iMakeMeasureSpec4;
        int i10;
        int iMakeMeasureSpec5;
        int iMakeMeasureSpec6;
        int measuredHeight;
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        boolean z2 = false;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f11054OooOO0 = null;
        int i11 = 0;
        boolean z3 = false;
        int i12 = paddingLeft;
        float f2 = 0.0f;
        while (true) {
            i3 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f11070OooO0OO = z2;
            } else {
                float f3 = layoutParams.f11068OooO00o;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i8 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i8 == -2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Integer.MIN_VALUE);
                            f = f2;
                            i9 = Integer.MIN_VALUE;
                        } else {
                            f = f2;
                            i9 = Integer.MIN_VALUE;
                            if (i8 == -1) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Pow2.MAX_POW2);
                            } else {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, Pow2.MAX_POW2);
                            }
                            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                            if (i10 == -2) {
                                iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(paddingTop, i9);
                            } else {
                                if (i10 == -1) {
                                    iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                                } else {
                                    iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i10, Pow2.MAX_POW2);
                                }
                                iMakeMeasureSpec6 = iMakeMeasureSpec5;
                            }
                            childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec6);
                            int measuredWidth = childAt.getMeasuredWidth();
                            measuredHeight = childAt.getMeasuredHeight();
                            if (mode2 == i9 && measuredHeight > iMin) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            }
                            i12 -= measuredWidth;
                            if (i12 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            layoutParams.f11069OooO0O0 = z;
                            z3 |= z;
                            if (z) {
                                this.f11054OooOO0 = childAt;
                            }
                            f2 = f;
                        }
                        iMakeMeasureSpec3 = iMakeMeasureSpec4;
                        i10 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                        if (i10 == -2) {
                            iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(paddingTop, i9);
                        } else {
                            if (i10 == -1) {
                                iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                            } else {
                                iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i10, Pow2.MAX_POW2);
                            }
                            iMakeMeasureSpec6 = iMakeMeasureSpec5;
                        }
                        childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec6);
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == i9) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i12 -= measuredWidth2;
                        if (i12 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.f11069OooO0O0 = z;
                        z3 |= z;
                        if (z) {
                            this.f11054OooOO0 = childAt;
                        }
                        f2 = f;
                    }
                } else {
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    i8 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i8 == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Integer.MIN_VALUE);
                        f = f2;
                        i9 = Integer.MIN_VALUE;
                    } else {
                        f = f2;
                        i9 = Integer.MIN_VALUE;
                        if (i8 == -1) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Pow2.MAX_POW2);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, Pow2.MAX_POW2);
                        }
                        i10 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                        if (i10 == -2) {
                            iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(paddingTop, i9);
                        } else {
                            if (i10 == -1) {
                                iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                            } else {
                                iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i10, Pow2.MAX_POW2);
                            }
                            iMakeMeasureSpec6 = iMakeMeasureSpec5;
                        }
                        childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec6);
                        int measuredWidth3 = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == i9) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i12 -= measuredWidth3;
                        if (i12 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.f11069OooO0O0 = z;
                        z3 |= z;
                        if (z) {
                            this.f11054OooOO0 = childAt;
                        }
                        f2 = f;
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec4;
                    i10 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    if (i10 == -2) {
                        iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(paddingTop, i9);
                    } else {
                        if (i10 == -1) {
                            iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                        } else {
                            iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i10, Pow2.MAX_POW2);
                        }
                        iMakeMeasureSpec6 = iMakeMeasureSpec5;
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec6);
                    int measuredWidth4 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (mode2 == i9) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    }
                    i12 -= measuredWidth4;
                    if (i12 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    layoutParams.f11069OooO0O0 = z;
                    z3 |= z;
                    if (z) {
                        this.f11054OooOO0 = childAt;
                    }
                    f2 = f;
                }
            }
            i11++;
            z2 = false;
        }
        if (z3 || f2 > 0.0f) {
            int i13 = paddingLeft - this.f11053OooO0oo;
            int i14 = 0;
            while (i14 < childCount) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getVisibility() == i3) {
                    i4 = childCount;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == i3) {
                        i4 = childCount;
                    } else {
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                        float f4 = layoutParams2.f11068OooO00o;
                        boolean z4 = i15 == 0 && f4 > 0.0f;
                        int measuredWidth5 = z4 ? 0 : childAt2.getMeasuredWidth();
                        i4 = childCount;
                        if (!z3 || childAt2 == this.f11054OooOO0) {
                            if (f4 > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i16 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i5 = Pow2.MAX_POW2;
                                    } else if (i16 == -1) {
                                        i5 = Pow2.MAX_POW2;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                                    } else {
                                        i5 = Pow2.MAX_POW2;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Pow2.MAX_POW2);
                                    }
                                } else {
                                    i5 = Pow2.MAX_POW2;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), Pow2.MAX_POW2);
                                }
                                if (z3) {
                                    int i17 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    int iMakeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(i17, i5);
                                    if (measuredWidth5 != i17) {
                                        childAt2.measure(iMakeMeasureSpec7, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth5 + ((int) ((f4 * Math.max(0, i12)) / f2)), Pow2.MAX_POW2), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth5 > i13 || f4 > 0.0f)) {
                            if (z4) {
                                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i18 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i6 = Pow2.MAX_POW2;
                                } else if (i18 == -1) {
                                    i6 = Pow2.MAX_POW2;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Pow2.MAX_POW2);
                                } else {
                                    i6 = Pow2.MAX_POW2;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, Pow2.MAX_POW2);
                                }
                            } else {
                                i6 = Pow2.MAX_POW2;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), Pow2.MAX_POW2);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i13, i6), iMakeMeasureSpec2);
                        }
                    }
                }
                i14++;
                childCount = i4;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f11048OooO = z3;
        p056o0000Oo0.OooO0o oooO0o = this.f11061OooOOo;
        if (oooO0o.f33647OooO00o == 0 || z3) {
            return;
        }
        oooO0o.OooO00o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        if (savedState.f11077OooO0o) {
            if (this.f11065OooOo00 || OooO0o0(1.0f)) {
                this.f11063OooOOoo = true;
            }
        } else if (this.f11065OooOo00 || OooO0o0(0.0f)) {
            this.f11063OooOOoo = false;
        }
        this.f11063OooOOoo = savedState.f11077OooO0o;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z2 = this.f11048OooO;
        if (z2) {
            z = !z2 || this.f11055OooOO0O == 1.0f;
        } else {
            z = this.f11063OooOOoo;
        }
        savedState.f11077OooO0o = z;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f11065OooOo00 = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11048OooO) {
            return super.onTouchEvent(motionEvent);
        }
        p056o0000Oo0.OooO0o oooO0o = this.f11061OooOOo;
        oooO0o.OooOOO(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f11060OooOOOo = x;
            this.f11062OooOOo0 = y;
        } else if (actionMasked == 1 && OooO0O0(this.f11054OooOO0)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f11060OooOOOo;
            float f2 = y2 - this.f11062OooOOo0;
            int i = oooO0o.f33648OooO0O0;
            if ((f2 * f2) + (f * f) < i * i && p056o0000Oo0.OooO0o.OooOOO0(this.f11054OooOO0, (int) x2, (int) y2) && (this.f11065OooOo00 || OooO0o0(0.0f))) {
                this.f11063OooOOoo = false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f11048OooO) {
            return;
        }
        this.f11063OooOOoo = view == this.f11054OooOO0;
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.f11051OooO0o0 = i;
    }

    public void setPanelSlideListener(@Nullable OooO0o oooO0o) {
    }

    public void setParallaxDistance(@Px int i) {
        this.f11059OooOOOO = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f11050OooO0o = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f11052OooO0oO = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setShadowDrawableLeft(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public void setShadowResourceRight(int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setShadowDrawableRight(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f11049OooO0Oo = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final int[] f11067OooO0o0 = {R.attr.layout_weight};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f11068OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f11069OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f11070OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f11071OooO0Oo;

        public LayoutParams() {
            super(-1, -1);
            this.f11068OooO00o = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11068OooO00o = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11068OooO00o = 0.0f;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11068OooO00o = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11067OooO0o0);
            this.f11068OooO00o = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11049OooO0Oo = -858993460;
        this.f11065OooOo00 = true;
        this.f11064OooOo0 = new Rect();
        this.f11066OooOo0O = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f11053OooO0oo = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.OooOOOO(this, new OooO00o());
        ViewCompat.OooO0o.OooOOoo(this, 1);
        p056o0000Oo0.OooO0o oooO0oOooO = p056o0000Oo0.OooO0o.OooO(this, 0.5f, new OooO0OO());
        this.f11061OooOOo = oooO0oOooO;
        oooO0oOooO.f33658OooOOO = f * 400.0f;
    }
}
