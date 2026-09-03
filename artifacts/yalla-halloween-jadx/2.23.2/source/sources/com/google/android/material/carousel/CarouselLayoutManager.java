package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oO0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000OO.OooOOO0;
import p018OooOoo0.OooOOO;
import p031OoooO0.o0OoOo0;
import p052o00000oO.OooOO0;
import p272o0O0000o.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16127OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16128OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16129OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.OooO00o f16132OooOO0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f16130OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16133OooOO0O = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public o0O000o0.OooO00o f16131OooO0oo = new com.google.android.material.carousel.OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public com.google.android.material.carousel.OooO0O0 f16126OooO = null;

    public class OooO00o extends o00oO0o {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o00oO0o
        public final int calculateDxToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (carouselLayoutManager.f16127OooO0Oo - carouselLayoutManager.OooOOoo(carouselLayoutManager.f16126OooO.f16170OooO00o, carouselLayoutManager.getPosition(view)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo
        @Nullable
        public final PointF computeScrollVectorForPosition(int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            com.google.android.material.carousel.OooO0O0 oooO0O0 = carouselLayoutManager.f16126OooO;
            if (oooO0O0 == null) {
                return null;
            }
            return new PointF(carouselLayoutManager.OooOOoo(oooO0O0.f16170OooO00o, i) - carouselLayoutManager.f16127OooO0Oo, 0.0f);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f16135OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f16136OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f16137OooO0OO;

        public OooO0O0(View view, float f, OooO0o oooO0o) {
            this.f16135OooO00o = view;
            this.f16136OooO0O0 = f;
            this.f16137OooO0OO = oooO0o;
        }
    }

    public static class OooO0OO extends RecyclerView.OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Paint f16138OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<com.google.android.material.carousel.OooO00o.OooO0O0> f16139OooO0O0;

        public OooO0OO() {
            Paint paint = new Paint();
            this.f16138OooO00o = paint;
            this.f16139OooO0O0 = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
            super.onDrawOver(canvas, recyclerView, o0ooo0o2);
            Paint paint = this.f16138OooO00o;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(o00000O.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 : this.f16139OooO0O0) {
                paint.setColor(OooOO0.OooO0O0(-65281, oooO0O0.f16168OooO0OO, -16776961));
                float f = oooO0O0.f16167OooO0O0;
                float paddingTop = ((CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop();
                float f2 = oooO0O0.f16167OooO0O0;
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                canvas.drawLine(f, paddingTop, f2, carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom(), paint);
            }
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.material.carousel.OooO00o.OooO0O0 f16140OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.material.carousel.OooO00o.OooO0O0 f16141OooO0O0;

        public OooO0o(com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0, com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O1) {
            OooOOO0.OooO00o(oooO0O0.f16166OooO00o <= oooO0O1.f16166OooO00o);
            this.f16140OooO00o = oooO0O0;
            this.f16141OooO0O0 = oooO0O1;
        }
    }

    public CarouselLayoutManager() {
        requestLayout();
    }

    public static float OooOOo(float f, OooO0o oooO0o) {
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = oooO0o.f16140OooO00o;
        float f2 = oooO0O0.f16169OooO0Oo;
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O1 = oooO0o.f16141OooO0O0;
        return o0O000.OooO0O0.OooO00o(f2, oooO0O1.f16169OooO0Oo, oooO0O0.f16167OooO0O0, oooO0O1.f16167OooO0O0, f);
    }

    public static OooO0o OooOo00(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = (com.google.android.material.carousel.OooO00o.OooO0O0) list.get(i5);
            float f6 = z ? oooO0O0.f16167OooO0O0 : oooO0O0.f16166OooO00o;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new OooO0o((com.google.android.material.carousel.OooO00o.OooO0O0) list.get(i), (com.google.android.material.carousel.OooO00o.OooO0O0) list.get(i3));
    }

    public final void OooOO0O(float f, int i, View view) {
        float f2 = this.f16132OooOO0.f16155OooO00o / 2.0f;
        addView(view, i);
        layoutDecoratedWithMargins(view, (int) (f - f2), getPaddingTop(), (int) (f + f2), getHeight() - getPaddingBottom());
    }

    public final int OooOO0o(int i, int i2) {
        return OooOo0() ? i - i2 : i + i2;
    }

    public final void OooOOO(int i, RecyclerView.o00Ooo o00ooo2) {
        int iOooOOOo = OooOOOo(i);
        while (i >= 0) {
            OooO0O0 oooO0O0OooOo = OooOo(o00ooo2, iOooOOOo, i);
            float f = oooO0O0OooOo.f16136OooO0O0;
            OooO0o oooO0o = oooO0O0OooOo.f16137OooO0OO;
            if (OooOo0o(f, oooO0o)) {
                return;
            }
            int i2 = (int) this.f16132OooOO0.f16155OooO00o;
            iOooOOOo = OooOo0() ? iOooOOOo + i2 : iOooOOOo - i2;
            if (!OooOo0O(f, oooO0o)) {
                OooOO0O(f, 0, oooO0O0OooOo.f16135OooO00o);
            }
            i--;
        }
    }

    public final void OooOOO0(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int iOooOOOo = OooOOOo(i);
        while (i < o0ooo0o2.OooO0O0()) {
            OooO0O0 oooO0O0OooOo = OooOo(o00ooo2, iOooOOOo, i);
            float f = oooO0O0OooOo.f16136OooO0O0;
            OooO0o oooO0o = oooO0O0OooOo.f16137OooO0OO;
            if (OooOo0O(f, oooO0o)) {
                return;
            }
            iOooOOOo = OooOO0o(iOooOOOo, (int) this.f16132OooOO0.f16155OooO00o);
            if (!OooOo0o(f, oooO0o)) {
                OooOO0O(f, -1, oooO0O0OooOo.f16135OooO00o);
            }
            i++;
        }
    }

    public final float OooOOOO(View view, float f, OooO0o oooO0o) {
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = oooO0o.f16140OooO00o;
        float f2 = oooO0O0.f16167OooO0O0;
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O1 = oooO0o.f16141OooO0O0;
        float f3 = oooO0O1.f16167OooO0O0;
        float f4 = oooO0O0.f16166OooO00o;
        float f5 = oooO0O1.f16166OooO00o;
        float fOooO00o = o0O000.OooO0O0.OooO00o(f2, f3, f4, f5, f);
        if (oooO0O1 != this.f16132OooOO0.OooO0O0() && oooO0O0 != this.f16132OooOO0.OooO0Oo()) {
            return fOooO00o;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return fOooO00o + (((1.0f - oooO0O1.f16168OooO0OO) + ((((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) / this.f16132OooOO0.f16155OooO00o)) * (f - f5));
    }

    public final int OooOOOo(int i) {
        return OooOO0o((OooOo0() ? getWidth() : 0) - this.f16127OooO0Oo, (int) (this.f16132OooOO0.f16155OooO00o * i));
    }

    public final void OooOOo0(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float fCenterX = rect.centerX();
            if (!OooOo0o(fCenterX, OooOo00(fCenterX, this.f16132OooOO0.f16156OooO0O0, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, o00ooo2);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float fCenterX2 = rect2.centerX();
            if (!OooOo0O(fCenterX2, OooOo00(fCenterX2, this.f16132OooOO0.f16156OooO0O0, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, o00ooo2);
            }
        }
        if (getChildCount() == 0) {
            OooOOO(this.f16133OooOO0O - 1, o00ooo2);
            OooOOO0(this.f16133OooOO0O, o00ooo2, o0ooo0o2);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            OooOOO(position - 1, o00ooo2);
            OooOOO0(position2 + 1, o00ooo2, o0ooo0o2);
        }
    }

    public final int OooOOoo(com.google.android.material.carousel.OooO00o oooO00o, int i) {
        if (!OooOo0()) {
            return (int) ((oooO00o.f16155OooO00o / 2.0f) + ((i * oooO00o.f16155OooO00o) - oooO00o.OooO00o().f16166OooO00o));
        }
        float width = getWidth() - oooO00o.OooO0OO().f16166OooO00o;
        float f = oooO00o.f16155OooO00o;
        return (int) ((width - (i * f)) - (f / 2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0O0 OooOo(RecyclerView.o00Ooo o00ooo2, float f, int i) {
        float f2 = this.f16132OooOO0.f16155OooO00o / 2.0f;
        View viewOooO0Oo = o00ooo2.OooO0Oo(i);
        measureChildWithMargins(viewOooO0Oo, 0, 0);
        float fOooOO0o = OooOO0o((int) f, (int) f2);
        OooO0o oooO0oOooOo00 = OooOo00(fOooOO0o, this.f16132OooOO0.f16156OooO0O0, false);
        float fOooOOOO = OooOOOO(viewOooO0Oo, fOooOO0o, oooO0oOooOo00);
        if (viewOooO0Oo instanceof o0O000o0.OooO0O0) {
            com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = oooO0oOooOo00.f16140OooO00o;
            float f3 = oooO0O0.f16168OooO0OO;
            com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O1 = oooO0oOooOo00.f16141OooO0O0;
            ((o0O000o0.OooO0O0) viewOooO0Oo).setMaskXPercentage(o0O000.OooO0O0.OooO00o(f3, oooO0O1.f16168OooO0OO, oooO0O0.f16166OooO00o, oooO0O1.f16166OooO00o, fOooOO0o));
        }
        return new OooO0O0(viewOooO0Oo, fOooOOOO, oooO0oOooOo00);
    }

    public final boolean OooOo0() {
        return getLayoutDirection() == 1;
    }

    public final boolean OooOo0O(float f, OooO0o oooO0o) {
        float fOooOOo = OooOOo(f, oooO0o);
        int i = (int) f;
        int i2 = (int) (fOooOOo / 2.0f);
        int i3 = OooOo0() ? i + i2 : i - i2;
        return !OooOo0() ? i3 <= getWidth() : i3 >= 0;
    }

    public final boolean OooOo0o(float f, OooO0o oooO0o) {
        int iOooOO0o = OooOO0o((int) f, (int) (OooOOo(f, oooO0o) / 2.0f));
        return !OooOo0() ? iOooOO0o >= 0 : iOooOO0o <= getWidth();
    }

    public final void OooOoO0() {
        com.google.android.material.carousel.OooO00o oooO00oOooO0O0;
        com.google.android.material.carousel.OooO00o oooO00o;
        int i = this.f16128OooO0o;
        int i2 = this.f16129OooO0o0;
        if (i <= i2) {
            if (OooOo0()) {
                List<com.google.android.material.carousel.OooO00o> list = this.f16126OooO.f16172OooO0OO;
                oooO00o = list.get(list.size() - 1);
            } else {
                List<com.google.android.material.carousel.OooO00o> list2 = this.f16126OooO.f16171OooO0O0;
                oooO00o = list2.get(list2.size() - 1);
            }
            this.f16132OooOO0 = oooO00o;
        } else {
            com.google.android.material.carousel.OooO0O0 oooO0O0 = this.f16126OooO;
            float f = this.f16127OooO0Oo;
            float f2 = i2;
            float f3 = i;
            float f4 = oooO0O0.f16174OooO0o + f2;
            float f5 = f3 - oooO0O0.f16176OooO0oO;
            if (f < f4) {
                oooO00oOooO0O0 = com.google.android.material.carousel.OooO0O0.OooO0O0(oooO0O0.f16171OooO0O0, o0O000.OooO0O0.OooO00o(1.0f, 0.0f, f2, f4, f), oooO0O0.f16173OooO0Oo);
            } else if (f > f5) {
                oooO00oOooO0O0 = com.google.android.material.carousel.OooO0O0.OooO0O0(oooO0O0.f16172OooO0OO, o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f5, f3, f), oooO0O0.f16175OooO0o0);
            } else {
                oooO00oOooO0O0 = oooO0O0.f16170OooO00o;
            }
            this.f16132OooOO0 = oooO00oOooO0O0;
        }
        List<com.google.android.material.carousel.OooO00o.OooO0O0> list3 = this.f16132OooOO0.f16156OooO0O0;
        OooO0OO oooO0OO = this.f16130OooO0oO;
        oooO0OO.getClass();
        oooO0OO.f16139OooO0O0 = Collections.unmodifiableList(list3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollExtent(@NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        return (int) this.f16126OooO.f16170OooO00o.f16155OooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollOffset(@NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        return this.f16127OooO0Oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollRange(@NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        return this.f16128OooO0o - this.f16129OooO0o0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterX = rect.centerX();
        float fWidth = (rect.width() - OooOOo(fCenterX, OooOo00(fCenterX, this.f16132OooOO0.f16156OooO0O0, true))) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void measureChildWithMargins(@NonNull View view, int i, int i2) {
        if (!(view instanceof o0O000o0.OooO0O0)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left + rect.right + i;
        int i4 = rect.top + rect.bottom + i2;
        com.google.android.material.carousel.OooO0O0 oooO0O0 = this.f16126OooO;
        view.measure(RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, (int) (oooO0O0 != null ? oooO0O0.f16170OooO00o.f16155OooO00o : ((ViewGroup.MarginLayoutParams) layoutParams).width), canScrollHorizontally()), RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        boolean z;
        float f;
        com.google.android.material.carousel.OooO00o oooO00o;
        com.google.android.material.carousel.OooO00o oooO00o2;
        int i;
        float f2;
        List<com.google.android.material.carousel.OooO00o.OooO0O0> list;
        int i2;
        int i3;
        int i4;
        CarouselLayoutManager carouselLayoutManager = this;
        if (o0ooo0o2.OooO0O0() <= 0) {
            removeAndRecycleAllViews(o00ooo2);
            carouselLayoutManager.f16133OooOO0O = 0;
            return;
        }
        boolean zOooOo0 = OooOo0();
        int i5 = 1;
        boolean z2 = carouselLayoutManager.f16126OooO == null;
        if (z2) {
            View viewOooO0Oo = o00ooo2.OooO0Oo(0);
            carouselLayoutManager.measureChildWithMargins(viewOooO0Oo, 0, 0);
            ((com.google.android.material.carousel.OooO0OO) carouselLayoutManager.f16131OooO0oo).getClass();
            float width = getWidth();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewOooO0Oo.getLayoutParams();
            float f3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            Resources resources = viewOooO0Oo.getContext().getResources();
            int i6 = o00000O.m3_carousel_small_item_size_min;
            float dimension = resources.getDimension(i6) + f3;
            Resources resources2 = viewOooO0Oo.getContext().getResources();
            int i7 = o00000O.m3_carousel_small_item_size_max;
            float dimension2 = resources2.getDimension(i7) + f3;
            float measuredWidth = viewOooO0Oo.getMeasuredWidth();
            float fMin = Math.min(measuredWidth + f3, width);
            float fOooO00o = o0000O00.OooO00o.OooO00o((measuredWidth / 3.0f) + f3, viewOooO0Oo.getContext().getResources().getDimension(i6) + f3, viewOooO0Oo.getContext().getResources().getDimension(i7) + f3);
            float f4 = (fMin + fOooO00o) / 2.0f;
            int[] iArr = com.google.android.material.carousel.OooO0OO.f16177OooO00o;
            int[] iArr2 = com.google.android.material.carousel.OooO0OO.f16178OooO0O0;
            int i8 = 0;
            int i9 = Integer.MIN_VALUE;
            while (true) {
                i = 2;
                if (i8 >= 2) {
                    break;
                }
                int i10 = iArr2[i8];
                if (i10 > i9) {
                    i9 = i10;
                }
                i8++;
            }
            float f5 = width - (i9 * f4);
            int i11 = iArr[0];
            int iMax = (int) Math.max(1.0d, Math.floor(o0OoOo0.OooO00o(i11 > Integer.MIN_VALUE ? i11 : Integer.MIN_VALUE, dimension2, f5, fMin)));
            int iCeil = (int) Math.ceil(width / fMin);
            int i12 = (iCeil - iMax) + 1;
            int[] iArr3 = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr3[i13] = iCeil - i13;
            }
            int i14 = 1;
            int i15 = 1;
            int i16 = 0;
            com.google.android.material.carousel.OooO0OO.OooO00o oooO00o3 = null;
            int i17 = 0;
            loop2: while (true) {
                if (i17 >= i12) {
                    f2 = f3;
                    break;
                }
                int i18 = iArr3[i17];
                while (i16 < i) {
                    int i19 = iArr2[i16];
                    int i20 = i14;
                    int i21 = i15;
                    int i22 = 0;
                    while (i22 < i21) {
                        int[] iArr4 = iArr3;
                        int i23 = i16;
                        int i24 = i;
                        float f6 = fMin;
                        float f7 = dimension2;
                        f2 = f3;
                        com.google.android.material.carousel.OooO0OO.OooO00o oooO00o4 = new com.google.android.material.carousel.OooO0OO.OooO00o(i20, fOooO00o, dimension, dimension2, iArr[i22], f4, i19, f6, i18, width);
                        float f8 = oooO00o4.f16186OooO0oo;
                        if (oooO00o3 == null || f8 < oooO00o3.f16186OooO0oo) {
                            if (f8 == 0.0f) {
                                oooO00o3 = oooO00o4;
                                break loop2;
                            }
                            oooO00o3 = oooO00o4;
                        }
                        i20++;
                        i22++;
                        i21 = 1;
                        iArr3 = iArr4;
                        i16 = i23;
                        i = i24;
                        fMin = f6;
                        dimension2 = f7;
                        f3 = f2;
                    }
                    i16++;
                    i15 = 1;
                    i14 = i20;
                }
                i17++;
                i16 = 0;
                i15 = 1;
            }
            float dimension3 = viewOooO0Oo.getContext().getResources().getDimension(o00000O.m3_carousel_gone_size) + f2;
            float f9 = dimension3 / 2.0f;
            float f10 = 0.0f - f9;
            float f11 = (oooO00o3.f16183OooO0o / 2.0f) + 0.0f;
            int i25 = oooO00o3.f16185OooO0oO;
            float fMax = Math.max(0, i25 - 1);
            float f12 = oooO00o3.f16183OooO0o;
            float f13 = (fMax * f12) + f11;
            float f14 = (f12 / 2.0f) + f13;
            int i26 = oooO00o3.f16182OooO0Oo;
            if (i26 > 0) {
                f13 = (oooO00o3.f16184OooO0o0 / 2.0f) + f14;
            }
            if (i26 > 0) {
                f14 = (oooO00o3.f16184OooO0o0 / 2.0f) + f13;
            }
            int i27 = oooO00o3.f16181OooO0OO;
            float f15 = i27 > 0 ? (oooO00o3.f16180OooO0O0 / 2.0f) + f14 : f13;
            float width2 = f9 + getWidth();
            float f16 = oooO00o3.f16183OooO0o;
            float f17 = 1.0f - ((dimension3 - f2) / (f16 - f2));
            float f18 = 1.0f - ((oooO00o3.f16180OooO0O0 - f2) / (f16 - f2));
            float f19 = 1.0f - ((oooO00o3.f16184OooO0o0 - f2) / (f16 - f2));
            com.google.android.material.carousel.OooO00o.C0216OooO00o c0216OooO00o = new com.google.android.material.carousel.OooO00o.C0216OooO00o(f16);
            c0216OooO00o.OooO00o(f10, f17, dimension3, false);
            float f20 = oooO00o3.f16183OooO0o;
            if (i25 > 0 && f20 > 0.0f) {
                int i28 = 0;
                while (i28 < i25) {
                    c0216OooO00o.OooO00o((i28 * f20) + f11, 0.0f, f20, true);
                    i28++;
                    i25 = i25;
                    f11 = f11;
                    zOooOo0 = zOooOo0;
                }
            }
            z = zOooOo0;
            if (i26 > 0) {
                c0216OooO00o.OooO00o(f13, f19, oooO00o3.f16184OooO0o0, false);
            }
            if (i27 > 0) {
                float f21 = oooO00o3.f16180OooO0O0;
                if (i27 > 0 && f21 > 0.0f) {
                    for (int i29 = 0; i29 < i27; i29++) {
                        c0216OooO00o.OooO00o((i29 * f21) + f15, f18, f21, false);
                    }
                }
            }
            c0216OooO00o.OooO00o(width2, f17, dimension3, false);
            com.google.android.material.carousel.OooO00o oooO00oOooO0O0 = c0216OooO00o.OooO0O0();
            if (z) {
                com.google.android.material.carousel.OooO00o.C0216OooO00o c0216OooO00o2 = new com.google.android.material.carousel.OooO00o.C0216OooO00o(oooO00oOooO0O0.f16155OooO00o);
                float f22 = 2.0f;
                float f23 = oooO00oOooO0O0.OooO0O0().f16167OooO0O0 - (oooO00oOooO0O0.OooO0O0().f16169OooO0Oo / 2.0f);
                List<com.google.android.material.carousel.OooO00o.OooO0O0> list2 = oooO00oOooO0O0.f16156OooO0O0;
                int size = list2.size() - 1;
                while (size >= 0) {
                    com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = list2.get(size);
                    float f24 = oooO0O0.f16169OooO0Oo;
                    c0216OooO00o2.OooO00o((f24 / f22) + f23, oooO0O0.f16168OooO0OO, f24, size >= oooO00oOooO0O0.f16157OooO0OO && size <= oooO00oOooO0O0.f16158OooO0Oo);
                    f23 += oooO0O0.f16169OooO0Oo;
                    size--;
                    f22 = 2.0f;
                }
                oooO00oOooO0O0 = c0216OooO00o2.OooO0O0();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(oooO00oOooO0O0);
            int i30 = 0;
            while (true) {
                list = oooO00oOooO0O0.f16156OooO0O0;
                if (i30 >= list.size()) {
                    i30 = -1;
                    break;
                } else if (list.get(i30).f16167OooO0O0 >= 0.0f) {
                    break;
                } else {
                    i30++;
                }
            }
            boolean z3 = oooO00oOooO0O0.OooO00o().f16167OooO0O0 - (oooO00oOooO0O0.OooO00o().f16169OooO0Oo / 2.0f) <= 0.0f || oooO00oOooO0O0.OooO00o() == oooO00oOooO0O0.OooO0O0();
            int i31 = oooO00oOooO0O0.f16158OooO0Oo;
            int i32 = oooO00oOooO0O0.f16157OooO0OO;
            if (!z3 && i30 != -1) {
                int i33 = (i32 - 1) - i30;
                float f25 = oooO00oOooO0O0.OooO0O0().f16167OooO0O0 - (oooO00oOooO0O0.OooO0O0().f16169OooO0Oo / 2.0f);
                for (int i34 = 0; i34 <= i33; i34++) {
                    com.google.android.material.carousel.OooO00o oooO00o5 = (com.google.android.material.carousel.OooO00o) OooOOO.OooO00o(arrayList, 1);
                    int size2 = list.size() - 1;
                    int i35 = (i30 + i34) - 1;
                    if (i35 >= 0) {
                        float f26 = list.get(i35).f16168OooO0OO;
                        int size3 = oooO00o5.f16158OooO0Oo;
                        while (true) {
                            List<com.google.android.material.carousel.OooO00o.OooO0O0> list3 = oooO00o5.f16156OooO0O0;
                            if (size3 >= list3.size()) {
                                size3 = list3.size() - 1;
                                break;
                            } else if (f26 == list3.get(size3).f16168OooO0OO) {
                                break;
                            } else {
                                size3++;
                            }
                        }
                        i4 = size3 - 1;
                    } else {
                        i4 = size2;
                    }
                    arrayList.add(com.google.android.material.carousel.OooO0O0.OooO0OO(oooO00o5, i30, i4, f25, (i32 - i34) - 1, (i31 - i34) - 1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(oooO00oOooO0O0);
            int size4 = list.size();
            do {
                size4--;
                if (size4 < 0) {
                    size4 = -1;
                    break;
                }
            } while (list.get(size4).f16167OooO0O0 > getWidth());
            if (!((oooO00oOooO0O0.OooO0OO().f16169OooO0Oo / 2.0f) + oooO00oOooO0O0.OooO0OO().f16167OooO0O0 >= ((float) getWidth()) || oooO00oOooO0O0.OooO0OO() == oooO00oOooO0O0.OooO0Oo()) && size4 != -1) {
                int i36 = size4 - i31;
                float f27 = oooO00oOooO0O0.OooO0O0().f16167OooO0O0 - (oooO00oOooO0O0.OooO0O0().f16169OooO0Oo / 2.0f);
                for (int i37 = 0; i37 < i36; i37++) {
                    com.google.android.material.carousel.OooO00o oooO00o6 = (com.google.android.material.carousel.OooO00o) OooOOO.OooO00o(arrayList2, 1);
                    int i38 = (size4 - i37) + 1;
                    if (i38 < list.size()) {
                        float f28 = list.get(i38).f16168OooO0OO;
                        int i39 = oooO00o6.f16157OooO0OO;
                        while (true) {
                            i39--;
                            if (i39 >= 0) {
                                if (f28 == oooO00o6.f16156OooO0O0.get(i39).f16168OooO0OO) {
                                    i3 = 1;
                                    break;
                                }
                            } else {
                                i3 = 1;
                                i39 = 0;
                                break;
                            }
                        }
                        i2 = i39 + i3;
                    } else {
                        i2 = 0;
                    }
                    arrayList2.add(com.google.android.material.carousel.OooO0O0.OooO0OO(oooO00o6, size4, i2, f27, i32 + i37 + 1, i31 + i37 + 1));
                }
            }
            i5 = 1;
            com.google.android.material.carousel.OooO0O0 oooO0O1 = new com.google.android.material.carousel.OooO0O0(oooO00oOooO0O0, arrayList, arrayList2);
            carouselLayoutManager = this;
            carouselLayoutManager.f16126OooO = oooO0O1;
            f = 1.0f;
        } else {
            z = zOooOo0;
            f = 1.0f;
        }
        com.google.android.material.carousel.OooO0O0 oooO0O2 = carouselLayoutManager.f16126OooO;
        boolean zOooOo1 = OooOo0();
        if (zOooOo1) {
            List<com.google.android.material.carousel.OooO00o> list4 = oooO0O2.f16172OooO0OO;
            oooO00o = list4.get(list4.size() - 1);
        } else {
            List<com.google.android.material.carousel.OooO00o> list5 = oooO0O2.f16171OooO0O0;
            oooO00o = list5.get(list5.size() - 1);
        }
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0OooO0OO = zOooOo1 ? oooO00o.OooO0OO() : oooO00o.OooO00o();
        int paddingStart = getPaddingStart();
        if (!zOooOo1) {
            i5 = -1;
        }
        float f29 = paddingStart * i5;
        int i40 = (int) oooO0O0OooO0OO.f16166OooO00o;
        int i41 = (int) (oooO00o.f16155OooO00o / 2.0f);
        int width3 = (int) ((f29 + (OooOo0() ? getWidth() : 0)) - (OooOo0() ? i40 + i41 : i40 - i41));
        com.google.android.material.carousel.OooO0O0 oooO0O3 = carouselLayoutManager.f16126OooO;
        boolean zOooOo2 = OooOo0();
        if (zOooOo2) {
            List<com.google.android.material.carousel.OooO00o> list6 = oooO0O3.f16171OooO0O0;
            oooO00o2 = list6.get(list6.size() - 1);
        } else {
            List<com.google.android.material.carousel.OooO00o> list7 = oooO0O3.f16172OooO0OO;
            oooO00o2 = list7.get(list7.size() - 1);
        }
        com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0OooO00o = zOooOo2 ? oooO00o2.OooO00o() : oooO00o2.OooO0OO();
        float fOooO0O0 = ((o0ooo0o2.OooO0O0() - 1) * oooO00o2.f16155OooO00o) + getPaddingEnd();
        if (zOooOo2) {
            f = -1.0f;
        }
        float f30 = fOooO0O0 * f;
        float width4 = oooO0O0OooO00o.f16166OooO00o - (OooOo0() ? getWidth() : 0);
        int width5 = Math.abs(width4) > Math.abs(f30) ? 0 : (int) ((f30 - width4) + ((OooOo0() ? 0 : getWidth()) - oooO0O0OooO00o.f16166OooO00o));
        int i42 = z ? width5 : width3;
        carouselLayoutManager.f16129OooO0o0 = i42;
        if (z) {
            width5 = width3;
        }
        carouselLayoutManager.f16128OooO0o = width5;
        if (z2) {
            carouselLayoutManager.f16127OooO0Oo = width3;
        } else {
            int i43 = carouselLayoutManager.f16127OooO0Oo;
            int i44 = i43 + 0;
            carouselLayoutManager.f16127OooO0Oo = (i44 < i42 ? i42 - i43 : i44 > width5 ? width5 - i43 : 0) + i43;
        }
        carouselLayoutManager.f16133OooOO0O = o0000O00.OooO00o.OooO0O0(carouselLayoutManager.f16133OooOO0O, 0, o0ooo0o2.OooO0O0());
        OooOoO0();
        detachAndScrapAttachedViews(o00ooo2);
        OooOOo0(o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        if (getChildCount() == 0) {
            this.f16133OooOO0O = 0;
        } else {
            this.f16133OooOO0O = getPosition(getChildAt(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        com.google.android.material.carousel.OooO0O0 oooO0O0 = this.f16126OooO;
        if (oooO0O0 == null) {
            return false;
        }
        int iOooOOoo = OooOOoo(oooO0O0.f16170OooO00o, getPosition(view)) - this.f16127OooO0Oo;
        if (z2 || iOooOOoo == 0) {
            return false;
        }
        recyclerView.scrollBy(iOooOOoo, 0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!canScrollHorizontally() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.f16127OooO0Oo;
        int i3 = this.f16129OooO0o0;
        int i4 = this.f16128OooO0o;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.f16127OooO0Oo = i2 + i;
        OooOoO0();
        float f = this.f16132OooOO0.f16155OooO00o / 2.0f;
        int iOooOOOo = OooOOOo(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            float fOooOO0o = OooOO0o(iOooOOOo, (int) f);
            OooO0o oooO0oOooOo00 = OooOo00(fOooOO0o, this.f16132OooOO0.f16156OooO0O0, false);
            float fOooOOOO = OooOOOO(childAt, fOooOO0o, oooO0oOooOo00);
            if (childAt instanceof o0O000o0.OooO0O0) {
                com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O0 = oooO0oOooOo00.f16140OooO00o;
                float f2 = oooO0O0.f16168OooO0OO;
                com.google.android.material.carousel.OooO00o.OooO0O0 oooO0O1 = oooO0oOooOo00.f16141OooO0O0;
                ((o0O000o0.OooO0O0) childAt).setMaskXPercentage(o0O000.OooO0O0.OooO00o(f2, oooO0O1.f16168OooO0OO, oooO0O0.f16166OooO00o, oooO0O1.f16166OooO00o, fOooOO0o));
            }
            super.getDecoratedBoundsWithMargins(childAt, rect);
            childAt.offsetLeftAndRight((int) (fOooOOOO - (rect.left + f)));
            iOooOOOo = OooOO0o(iOooOOOo, (int) this.f16132OooOO0.f16155OooO00o);
        }
        OooOOo0(o00ooo2, o0ooo0o2);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void scrollToPosition(int i) {
        com.google.android.material.carousel.OooO0O0 oooO0O0 = this.f16126OooO;
        if (oooO0O0 == null) {
            return;
        }
        this.f16127OooO0Oo = OooOOoo(oooO0O0.f16170OooO00o, i);
        this.f16133OooOO0O = o0000O00.OooO00o.OooO0O0(i, 0, Math.max(0, getItemCount() - 1));
        OooOoO0();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        OooO00o oooO00o = new OooO00o(recyclerView.getContext());
        oooO00o.setTargetPosition(i);
        startSmoothScroll(oooO00o);
    }
}
