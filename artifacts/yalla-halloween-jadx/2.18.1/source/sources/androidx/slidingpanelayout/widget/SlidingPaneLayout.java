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
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p427o0OoO0o.o00000;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Drawable f9318Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f9319Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f9320Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Drawable f9321Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f9322OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f9323OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f9324OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f9325OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f9326OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f9327OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f9328OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f9329OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f9330OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooO0o f9331OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final o00000 f9332Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f9333Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f9334OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final Rect f9335OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f9336OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f9337o000oOoO;

    public class OooO00o extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Rect f9343OooO0Oo = new Rect();

        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
            super.OooO0OO(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            o0000OO0 o0000oo0OooOo0o = o0000OO0.OooOo0o(o0000oo1);
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo0OooOo0o.f28194OooO00o);
            Rect rect = this.f9343OooO0Oo;
            o0000oo0OooOo0o.OooO0oO(rect);
            o0000oo1.OooOoo0(rect);
            o0000oo0OooOo0o.OooO0oo(rect);
            o0000oo1.OooOoo(rect);
            o0000oo1.OooooOo(o0000oo0OooOo0o.f28194OooO00o.isVisibleToUser());
            o0000oo1.OoooO0O(o0000oo0OooOo0o.OooOOO());
            o0000oo1.Oooo000(o0000oo0OooOo0o.OooO());
            o0000oo1.Oooo0O0(o0000oo0OooOo0o.OooOO0O());
            o0000oo1.Oooo0o0(o0000oo0OooOo0o.OooOOo0());
            o0000oo1.Oooo00O(o0000oo0OooOo0o.f28194OooO00o.isClickable());
            o0000oo1.Oooo0o(o0000oo0OooOo0o.OooOOo());
            o0000oo1.Oooo0oO(o0000oo0OooOo0o.OooOOoo());
            o0000oo1.OooOoO(o0000oo0OooOo0o.f28194OooO00o.isAccessibilityFocused());
            o0000oo1.OoooOoo(o0000oo0OooOo0o.OooOo00());
            o0000oo1.OoooO00(o0000oo0OooOo0o.f28194OooO00o.isLongClickable());
            o0000oo1.OooO00o(o0000oo0OooOo0o.OooO0o());
            o0000oo1.OoooO0(o0000oo0OooOo0o.f28194OooO00o.getMovementGranularities());
            o0000oo0OooOo0o.OooOo();
            o0000oo1.Oooo000(SlidingPaneLayout.class.getName());
            o0000oo1.f28196OooO0OO = -1;
            o0000oo1.f28194OooO00o.setSource(view);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            Object objOooO0o = ViewCompat.OooO0o.OooO0o(view);
            if (objOooO0o instanceof View) {
                o0000oo1.OoooOO0((View) objOooO0o);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!SlidingPaneLayout.this.OooO0O0(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.OooO0o.OooOOoo(childAt, 1);
                    o0000oo1.OooO0OO(childAt);
                }
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.OooO0O0(view)) {
                return false;
            }
            return super.OooO0o(viewGroup, view, accessibilityEvent);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f9345Oooo0o;

        public OooO0O0(View view) {
            this.f9345Oooo0o = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f9345Oooo0o.getParent() == SlidingPaneLayout.this) {
                this.f9345Oooo0o.setLayerType(0, null);
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                View view = this.f9345Oooo0o;
                Objects.requireNonNull(slidingPaneLayout);
                Paint paint = ((LayoutParams) view.getLayoutParams()).f9342OooO0Oo;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO.OooO(view, paint);
            }
            SlidingPaneLayout.this.f9336OooooOo.remove(this);
        }
    }

    public class OooO0OO extends o00000.OooO0OO {
        public OooO0OO() {
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f9325OoooO0O == null) {
                slidingPaneLayout.f9322OoooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                boolean zOooO0OO = slidingPaneLayout.OooO0OO();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f9325OoooO0O.getLayoutParams();
                int width = slidingPaneLayout.f9325OoooO0O.getWidth();
                if (zOooO0OO) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((zOooO0OO ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f9337o000oOoO;
                slidingPaneLayout.f9322OoooO = paddingRight;
                if (slidingPaneLayout.f9328OoooOOo != 0) {
                    slidingPaneLayout.OooO0Oo(paddingRight);
                }
                if (layoutParams.f9341OooO0OO) {
                    slidingPaneLayout.OooO00o(slidingPaneLayout.f9325OoooO0O, slidingPaneLayout.f9322OoooO, slidingPaneLayout.f9319Oooo0o);
                }
                OooO0o oooO0o = slidingPaneLayout.f9331OoooOoo;
                if (oooO0o != null) {
                    oooO0o.OooO0OO();
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO00o(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f9325OoooO0O.getLayoutParams();
            if (!SlidingPaneLayout.this.OooO0OO()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f9337o000oOoO + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f9325OoooO0O.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f9337o000oOoO);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0O0(View view, int i) {
            return view.getTop();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final int OooO0OO(View view) {
            return SlidingPaneLayout.this.f9337o000oOoO;
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0o0(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f9332Ooooo00.OooO0OO(slidingPaneLayout.f9325OoooO0O, i2);
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oO(View view, int i) {
            SlidingPaneLayout.this.OooO0o0();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooO0oo(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f9332Ooooo00.f39849OooO00o == 0) {
                if (slidingPaneLayout.f9322OoooO != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    OooO0o oooO0o = slidingPaneLayout.f9331OoooOoo;
                    if (oooO0o != null) {
                        oooO0o.OooO0O0();
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    SlidingPaneLayout.this.f9333Ooooo0o = true;
                    return;
                }
                slidingPaneLayout.OooO0oO(slidingPaneLayout.f9325OoooO0O);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                View view = slidingPaneLayout2.f9325OoooO0O;
                OooO0o oooO0o2 = slidingPaneLayout2.f9331OoooOoo;
                if (oooO0o2 != null) {
                    oooO0o2.OooO00o();
                }
                slidingPaneLayout2.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.f9333Ooooo0o = false;
            }
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final void OooOO0(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.OooO0OO()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && SlidingPaneLayout.this.f9322OoooO > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f9337o000oOoO;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f9325OoooO0O.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && SlidingPaneLayout.this.f9322OoooO > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f9337o000oOoO;
                }
            }
            SlidingPaneLayout.this.f9332Ooooo00.OooOo0o(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o0OoO0o.o00000.OooO0OO
        public final boolean OooOO0O(View view, int i) {
            if (SlidingPaneLayout.this.f9327OoooOOO) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f9340OooO0O0;
        }
    }

    public interface OooO0o {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f9348Oooo0oo;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f9348Oooo0oo ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f9348Oooo0oo = parcel.readInt() != 0;
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO00o(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || i == 0) {
            if (view.getLayerType() != 0) {
                Paint paint = layoutParams.f9342OooO0Oo;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                OooO0O0 oooO0O0 = new OooO0O0(view);
                this.f9336OooooOo.add(oooO0O0);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(this, oooO0O0);
                return;
            }
            return;
        }
        int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (i & 16777215);
        if (layoutParams.f9342OooO0Oo == null) {
            layoutParams.f9342OooO0Oo = new Paint();
        }
        layoutParams.f9342OooO0Oo.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f9342OooO0Oo);
        }
        Paint paint2 = ((LayoutParams) view.getLayoutParams()).f9342OooO0Oo;
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooO(view, paint2);
    }

    public final boolean OooO0O0(View view) {
        if (view == null) {
            return false;
        }
        return this.f9323OoooO0 && ((LayoutParams) view.getLayoutParams()).f9341OooO0OO && this.f9322OoooO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final boolean OooO0OO() {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void OooO0Oo(float f) {
        boolean z;
        boolean zOooO0OO = OooO0OO();
        LayoutParams layoutParams = (LayoutParams) this.f9325OoooO0O.getLayoutParams();
        if (!layoutParams.f9341OooO0OO) {
            z = false;
        } else if ((zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) <= 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f9325OoooO0O) {
                float f2 = 1.0f - this.f9326OoooOO0;
                int i2 = this.f9328OoooOOo;
                this.f9326OoooOO0 = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zOooO0OO) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
                if (z) {
                    float f3 = this.f9326OoooOO0;
                    OooO00o(childAt, zOooO0OO ? f3 - 1.0f : 1.0f - f3, this.f9320Oooo0oO);
                }
            }
        }
    }

    public final boolean OooO0o(float f) {
        int paddingLeft;
        if (!this.f9323OoooO0) {
            return false;
        }
        boolean zOooO0OO = OooO0OO();
        LayoutParams layoutParams = (LayoutParams) this.f9325OoooO0O.getLayoutParams();
        if (zOooO0OO) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f * this.f9337o000oOoO) + paddingRight) + this.f9325OoooO0O.getWidth()));
        } else {
            paddingLeft = (int) ((f * this.f9337o000oOoO) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        o00000 o00000Var = this.f9332Ooooo00;
        View view = this.f9325OoooO0O;
        if (!o00000Var.OooOoO0(view, paddingLeft, view.getTop())) {
            return false;
        }
        OooO0o0();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
        return true;
    }

    public final void OooO0o0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public final void OooO0oO(View view) {
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f9332Ooooo00.OooO()) {
            if (!this.f9323OoooO0) {
                this.f9332Ooooo00.OooO00o();
            } else {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = OooO0OO() ? this.f9318Oooo : this.f9321Oooo0oo;
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
        if (this.f9323OoooO0 && !layoutParams.f9340OooO0O0 && this.f9325OoooO0O != null) {
            canvas.getClipBounds(this.f9335OooooOO);
            if (OooO0OO()) {
                Rect rect = this.f9335OooooOO;
                rect.left = Math.max(rect.left, this.f9325OoooO0O.getRight());
            } else {
                Rect rect2 = this.f9335OooooOO;
                rect2.right = Math.min(rect2.right, this.f9325OoooO0O.getLeft());
            }
            canvas.clipRect(this.f9335OooooOO);
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
        return this.f9320Oooo0oO;
    }

    @Px
    public int getParallaxDistance() {
        return this.f9328OoooOOo;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f9319Oooo0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9334OooooO0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9334OooooO0 = true;
        int size = this.f9336OooooOo.size();
        for (int i = 0; i < size; i++) {
            this.f9336OooooOo.get(i).run();
        }
        this.f9336OooooOo.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f9323OoooO0 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f9333Ooooo0o = !this.f9332Ooooo00.OooOOOo(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f9323OoooO0 || (this.f9327OoooOOO && actionMasked != 0)) {
            this.f9332Ooooo00.OooO0O0();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f9332Ooooo00.OooO0O0();
            return false;
        }
        if (actionMasked == 0) {
            this.f9327OoooOOO = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f9329OoooOo0 = x;
            this.f9330OoooOoO = y;
            if (this.f9332Ooooo00.OooOOOo(this.f9325OoooO0O, (int) x, (int) y) && OooO0O0(this.f9325OoooO0O)) {
                z = true;
            }
            return this.f9332Ooooo00.OooOo(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.f9329OoooOo0);
            float fAbs2 = Math.abs(y2 - this.f9330OoooOoO);
            o00000 o00000Var = this.f9332Ooooo00;
            if (fAbs > o00000Var.f39850OooO0O0 && fAbs2 > fAbs) {
                o00000Var.OooO0O0();
                this.f9327OoooOOO = true;
                return false;
            }
        }
        z = false;
        if (this.f9332Ooooo00.OooOo(motionEvent)) {
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
        if (zOooO0OO) {
            this.f9332Ooooo00.f39865OooOOo0 = 2;
        } else {
            this.f9332Ooooo00.f39865OooOOo0 = 1;
        }
        int i10 = i3 - i;
        int paddingRight = zOooO0OO ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zOooO0OO ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f9334OooooO0) {
            this.f9322OoooO = (this.f9323OoooO0 && this.f9333Ooooo0o) ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f9340OooO0O0) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13 - this.f9324OoooO00) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f9337o000oOoO = iMin;
                    int i14 = zOooO0OO ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f9341OooO0OO = (measuredWidth / 2) + ((i11 + i14) + iMin) > i13;
                    float f = iMin;
                    int i15 = (int) (this.f9322OoooO * f);
                    i5 = i14 + i15 + i11;
                    this.f9322OoooO = i15 / f;
                    i6 = 0;
                } else if (!this.f9323OoooO0 || (i7 = this.f9328OoooOOo) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f9322OoooO) * i7);
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
        if (this.f9334OooooO0) {
            if (this.f9323OoooO0) {
                if (this.f9328OoooOOo != 0) {
                    OooO0Oo(this.f9322OoooO);
                }
                if (((LayoutParams) this.f9325OoooO0O.getLayoutParams()).f9341OooO0OO) {
                    OooO00o(this.f9325OoooO0O, this.f9322OoooO, this.f9319Oooo0o);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    OooO00o(getChildAt(i16), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f9319Oooo0o);
                }
            }
            OooO0oO(this.f9325OoooO0O);
        }
        this.f9334OooooO0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[PHI: r13
      0x00b1: PHI (r13v2 float) = (r13v1 float), (r13v7 float) binds: [B:35:0x00a8, B:37:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMakeMeasureSpec;
        int i4;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int i7;
        float f;
        int i8;
        int iMakeMeasureSpec3;
        int i9;
        int iMakeMeasureSpec4;
        int iMakeMeasureSpec5;
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
                size = ShopVehicleListModel.VehicleTagType_Vip300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = ShopVehicleListModel.VehicleTagType_Vip300;
            }
        }
        boolean z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f9325OoooO0O = null;
        int i10 = paddingLeft;
        int i11 = 0;
        boolean z3 = false;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (true) {
            i3 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f9341OooO0OO = z2;
            } else {
                float f3 = layoutParams.f9339OooO00o;
                if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i7 == -2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                            f = f2;
                            i8 = Integer.MIN_VALUE;
                        } else {
                            f = f2;
                            i8 = Integer.MIN_VALUE;
                            if (i7 == -1) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                            } else {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                            }
                        }
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                        if (i9 == -2) {
                            iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, i8);
                        } else {
                            if (i9 == -1) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                            }
                            iMakeMeasureSpec5 = iMakeMeasureSpec4;
                        }
                        childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec5);
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == i8 && measuredHeight > iMin) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i10 -= measuredWidth;
                        if (i10 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.f9340OooO0O0 = z;
                        z3 |= z;
                        if (z) {
                            this.f9325OoooO0O = childAt;
                        }
                        f2 = f;
                    }
                } else {
                    i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i7 == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                        f = f2;
                        i8 = Integer.MIN_VALUE;
                    } else {
                        f = f2;
                        i8 = Integer.MIN_VALUE;
                        if (i7 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                    }
                    i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    if (i9 == -2) {
                        iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(paddingTop, i8);
                    } else {
                        if (i9 == -1) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        iMakeMeasureSpec5 = iMakeMeasureSpec4;
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec5);
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (mode2 == i8) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    }
                    i10 -= measuredWidth2;
                    if (i10 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    layoutParams.f9340OooO0O0 = z;
                    z3 |= z;
                    if (z) {
                        this.f9325OoooO0O = childAt;
                    }
                    f2 = f;
                }
            }
            i11++;
            z2 = false;
        }
        if (z3 || f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            int i12 = paddingLeft - this.f9324OoooO00;
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() == i3) {
                    i4 = i12;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        boolean z4 = ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.f9339OooO00o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        int measuredWidth3 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.f9325OoooO0O) {
                            if (layoutParams2.f9339OooO00o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i14 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    } else {
                                        iMakeMeasureSpec = i14 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    }
                                } else {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z3) {
                                    int i15 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    i4 = i12;
                                    int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                    if (measuredWidth3 != i15) {
                                        childAt2.measure(iMakeMeasureSpec6, iMakeMeasureSpec);
                                    }
                                } else {
                                    i4 = i12;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3 + ((int) ((layoutParams2.f9339OooO00o * Math.max(0, i10)) / f2)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth3 > i12 || layoutParams2.f9339OooO00o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                            if (z4) {
                                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i16 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i16 == -1) {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i12, i5), iMakeMeasureSpec2);
                        }
                        i4 = i12;
                    } else {
                        i4 = i12;
                    }
                }
                i13++;
                i12 = i4;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f9323OoooO0 = z3;
        o00000 o00000Var = this.f9332Ooooo00;
        if (o00000Var.f39849OooO00o == 0 || z3) {
            return;
        }
        o00000Var.OooO00o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        if (savedState.f9348Oooo0oo) {
            if (this.f9334OooooO0 || OooO0o(1.0f)) {
                this.f9333Ooooo0o = true;
            }
        } else if (this.f9334OooooO0 || OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            this.f9333Ooooo0o = false;
        }
        this.f9333Ooooo0o = savedState.f9348Oooo0oo;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z2 = this.f9323OoooO0;
        if (z2) {
            z = !z2 || this.f9322OoooO == 1.0f;
        } else {
            z = this.f9333Ooooo0o;
        }
        savedState.f9348Oooo0oo = z;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f9334OooooO0 = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f9323OoooO0) {
            return super.onTouchEvent(motionEvent);
        }
        this.f9332Ooooo00.OooOOo0(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f9329OoooOo0 = x;
            this.f9330OoooOoO = y;
        } else if (actionMasked == 1 && OooO0O0(this.f9325OoooO0O)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f9329OoooOo0;
            float f2 = y2 - this.f9330OoooOoO;
            o00000 o00000Var = this.f9332Ooooo00;
            int i = o00000Var.f39850OooO0O0;
            if ((f2 * f2) + (f * f) < i * i && o00000Var.OooOOOo(this.f9325OoooO0O, (int) x2, (int) y2) && (this.f9334OooooO0 || OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
                this.f9333Ooooo0o = false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f9323OoooO0) {
            return;
        }
        this.f9333Ooooo0o = view == this.f9325OoooO0O;
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.f9320Oooo0oO = i;
    }

    public void setPanelSlideListener(@Nullable OooO0o oooO0o) {
        this.f9331OoooOoo = oooO0o;
    }

    public void setParallaxDistance(@Px int i) {
        this.f9328OoooOOo = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f9321Oooo0oo = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f9318Oooo = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setShadowDrawableLeft(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public void setShadowResourceRight(int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setShadowDrawableRight(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f9319Oooo0o = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final int[] f9338OooO0o0 = {R.attr.layout_weight};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f9339OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f9340OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f9341OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f9342OooO0Oo;

        public LayoutParams() {
            super(-1, -1);
            this.f9339OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9339OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9339OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9339OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9338OooO0o0);
            this.f9339OooO00o = typedArrayObtainStyledAttributes.getFloat(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
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
        this.f9319Oooo0o = -858993460;
        this.f9334OooooO0 = true;
        this.f9335OooooOO = new Rect();
        this.f9336OooooOo = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f9324OoooO00 = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ViewCompat.OooOo0o(this, new OooO00o());
        ViewCompat.OooO0o.OooOOoo(this, 1);
        o00000 o00000VarOooOO0 = o00000.OooOO0(this, 0.5f, new OooO0OO());
        this.f9332Ooooo00 = o00000VarOooOO0;
        o00000VarOooOO0.f39860OooOOO = f * 400.0f;
    }
}
