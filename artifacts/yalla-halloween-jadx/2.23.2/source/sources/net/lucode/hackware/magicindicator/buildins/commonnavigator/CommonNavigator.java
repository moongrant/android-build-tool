package net.lucode.hackware.magicindicator.buildins.commonnavigator;

import OooOo.OooO0o;
import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;
import p633o0ooO0Oo.o0O00O;
import p633o0ooO0Oo.o0O00O0o;
import p633o0ooO0Oo.o0OoO00O;
import p635o0ooO0o0.o0000;
import p636o0ooO0oO.o0O00OOO;
import p636o0ooO0oO.o0O00o00;
import p636o0ooO0oO.o0oO0Ooo;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class CommonNavigator extends FrameLayout implements o0000, o0OoO00O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0OoO00O f33109OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HorizontalScrollView f33110OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public LinearLayout f33111OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LinearLayout f33112OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O00o00 f33113OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0O00OOO f33114OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f33115OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33116OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33117OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f33118OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33119OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33120OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33121OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f33122OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f33123OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList f33124OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO00o f33125OooOo00;

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            CommonNavigator commonNavigator = CommonNavigator.this;
            o0OoO00O o0ooo00o2 = commonNavigator.f33109OooO;
            o0ooo00o2.f57693OooO0OO = commonNavigator.f33114OooO0oo.OooO00o();
            o0ooo00o2.f57691OooO00o.clear();
            o0ooo00o2.f57692OooO0O0.clear();
            commonNavigator.OooO0OO();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.f33117OooOO0o = 0.5f;
        this.f33119OooOOO0 = true;
        this.f33118OooOOO = true;
        this.f33122OooOOo = true;
        this.f33124OooOOoo = new ArrayList();
        this.f33125OooOo00 = new OooO00o();
        o0OoO00O o0ooo00o2 = new o0OoO00O();
        this.f33109OooO = o0ooo00o2;
        o0ooo00o2.f57690OooO = this;
    }

    @Override // p635o0ooO0o0.o0000
    public final void OooO00o() {
        OooO0OO();
    }

    @Override // p635o0ooO0o0.o0000
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        LinearLayout.LayoutParams layoutParams;
        removeAllViews();
        View viewInflate = this.f33115OooOO0 ? LayoutInflater.from(getContext()).inflate(o0O00O.pager_navigator_layout_no_scroll, this) : LayoutInflater.from(getContext()).inflate(o0O00O.pager_navigator_layout, this);
        this.f33110OooO0Oo = (HorizontalScrollView) viewInflate.findViewById(o0O00O0o.scroll_view);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(o0O00O0o.title_container);
        this.f33112OooO0o0 = linearLayout;
        linearLayout.setPadding(this.f33121OooOOOo, 0, this.f33120OooOOOO, 0);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(o0O00O0o.indicator_container);
        this.f33111OooO0o = linearLayout2;
        if (this.f33123OooOOo0) {
            linearLayout2.getParent().bringChildToFront(this.f33111OooO0o);
        }
        int i = this.f33109OooO.f57693OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            CommonPagerTitleView commonPagerTitleViewOooO0OO = this.f33114OooO0oo.OooO0OO(i2, getContext());
            if (commonPagerTitleViewOooO0OO instanceof View) {
                if (this.f33115OooOO0) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    o0O00OOO o0o00ooo2 = this.f33114OooO0oo;
                    getContext();
                    o0o00ooo2.OooO0Oo();
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f33112OooO0o0.addView(commonPagerTitleViewOooO0OO, layoutParams);
            }
        }
        o0O00OOO o0o00ooo3 = this.f33114OooO0oo;
        if (o0o00ooo3 != null) {
            LinePagerIndicator linePagerIndicatorOooO0O0 = o0o00ooo3.OooO0O0(getContext());
            this.f33113OooO0oO = linePagerIndicatorOooO0O0;
            if (linePagerIndicatorOooO0O0 instanceof View) {
                this.f33111OooO0o.addView((View) this.f33113OooO0oO, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public o0O00OOO getAdapter() {
        return this.f33114OooO0oo;
    }

    public int getLeftPadding() {
        return this.f33121OooOOOo;
    }

    public o0O00o00 getPagerIndicator() {
        return this.f33113OooO0oO;
    }

    public int getRightPadding() {
        return this.f33120OooOOOO;
    }

    public float getScrollPivotX() {
        return this.f33117OooOO0o;
    }

    public LinearLayout getTitleContainer() {
        return this.f33112OooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f33114OooO0oo != null) {
            ArrayList arrayList = this.f33124OooOOoo;
            arrayList.clear();
            o0OoO00O o0ooo00o2 = this.f33109OooO;
            int i5 = o0ooo00o2.f57693OooO0OO;
            for (int i6 = 0; i6 < i5; i6++) {
                o0O0O0O o0o0o0o = new o0O0O0O();
                View childAt = this.f33112OooO0o0.getChildAt(i6);
                if (childAt != 0) {
                    o0o0o0o.f57700OooO00o = childAt.getLeft();
                    o0o0o0o.f57701OooO0O0 = childAt.getTop();
                    o0o0o0o.f57702OooO0OO = childAt.getRight();
                    int bottom = childAt.getBottom();
                    o0o0o0o.f57703OooO0Oo = bottom;
                    if (childAt instanceof o0oO0Ooo) {
                        o0oO0Ooo o0oo0ooo2 = (o0oO0Ooo) childAt;
                        o0o0o0o.f57705OooO0o0 = o0oo0ooo2.getContentLeft();
                        o0o0o0o.f57704OooO0o = o0oo0ooo2.getContentTop();
                        o0o0o0o.f57706OooO0oO = o0oo0ooo2.getContentRight();
                        o0o0o0o.f57707OooO0oo = o0oo0ooo2.getContentBottom();
                    } else {
                        o0o0o0o.f57705OooO0o0 = o0o0o0o.f57700OooO00o;
                        o0o0o0o.f57704OooO0o = o0o0o0o.f57701OooO0O0;
                        o0o0o0o.f57706OooO0oO = o0o0o0o.f57702OooO0OO;
                        o0o0o0o.f57707OooO0oo = bottom;
                    }
                }
                arrayList.add(o0o0o0o);
            }
            o0O00o00 o0o00o01 = this.f33113OooO0oO;
            if (o0o00o01 != null) {
                o0o00o01.OooO0O0(arrayList);
            }
            if (this.f33122OooOOo && o0ooo00o2.f57697OooO0oO == 0) {
                onPageSelected(o0ooo00o2.f57694OooO0Oo);
                onPageScrolled(o0ooo00o2.f57694OooO0Oo, 0.0f, 0);
            }
        }
    }

    @Override // p635o0ooO0o0.o0000
    public final void onPageScrollStateChanged(int i) {
        if (this.f33114OooO0oo != null) {
            this.f33109OooO.f57697OooO0oO = i;
            o0O00o00 o0o00o01 = this.f33113OooO0oO;
            if (o0o00o01 != null) {
                o0o00o01.OooO00o();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // p635o0ooO0o0.o0000
    public final void onPageScrolled(int i, float f, int i2) {
        o0O00o00 o0o00o01;
        ArrayList arrayList;
        boolean z;
        if (this.f33114OooO0oo != null) {
            float f2 = i + f;
            o0OoO00O o0ooo00o2 = this.f33109OooO;
            float f3 = o0ooo00o2.f57695OooO0o;
            boolean z2 = f3 <= f2;
            int i3 = o0ooo00o2.f57697OooO0oO;
            SparseArray<Float> sparseArray = o0ooo00o2.f57692OooO0O0;
            if (i3 != 0) {
                if (f2 != f3) {
                    int i4 = i + 1;
                    if (f == 0.0f && z2) {
                        i4 = i - 1;
                        z = false;
                    } else {
                        z = true;
                    }
                    for (int i5 = 0; i5 < o0ooo00o2.f57693OooO0OO; i5++) {
                        if (i5 != i && i5 != i4 && sparseArray.get(i5, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                            o0ooo00o2.OooO0OO(i5, 1.0f, z2, true);
                        }
                    }
                    if (!z) {
                        float f4 = 1.0f - f;
                        o0ooo00o2.OooO0OO(i4, f4, true, false);
                        o0ooo00o2.OooO0O0(i, f4, true, false);
                    } else if (z2) {
                        o0ooo00o2.OooO0OO(i, f, true, false);
                        o0ooo00o2.OooO0O0(i4, f, true, false);
                    } else {
                        float f5 = 1.0f - f;
                        o0ooo00o2.OooO0OO(i4, f5, false, false);
                        o0ooo00o2.OooO0O0(i, f5, false, false);
                    }
                }
                o0o00o01 = this.f33113OooO0oO;
                if (o0o00o01 != null) {
                    o0o00o01.OooO0OO(i, f);
                }
                if (this.f33110OooO0Oo != null) {
                    arrayList = this.f33124OooOOoo;
                    if (arrayList.size() > 0 || i < 0 || i >= arrayList.size() || !this.f33118OooOOO) {
                        return;
                    }
                    int iMin = Math.min(arrayList.size() - 1, i);
                    int iMin2 = Math.min(arrayList.size() - 1, i + 1);
                    o0O0O0O o0o0o0o = (o0O0O0O) arrayList.get(iMin);
                    o0O0O0O o0o0o0o2 = (o0O0O0O) arrayList.get(iMin2);
                    int i6 = o0o0o0o.f57700OooO00o;
                    float fOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(o0o0o0o.f57702OooO0OO, i6, 2, i6) - (this.f33110OooO0Oo.getWidth() * this.f33117OooOO0o);
                    int i7 = o0o0o0o2.f57700OooO00o;
                    this.f33110OooO0Oo.scrollTo((int) OooO0o.OooO00o(androidx.appcompat.widget.OooO00o.OooO00o(o0o0o0o2.f57702OooO0OO, i7, 2, i7) - (this.f33110OooO0Oo.getWidth() * this.f33117OooOO0o), fOooO00o, f, fOooO00o), 0);
                    return;
                }
            }
            for (int i8 = 0; i8 < o0ooo00o2.f57693OooO0OO; i8++) {
                if (i8 != o0ooo00o2.f57694OooO0Oo) {
                    if (!o0ooo00o2.f57691OooO00o.get(i8)) {
                        o0ooo00o2.OooO00o(i8);
                    }
                    if (sparseArray.get(i8, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                        o0ooo00o2.OooO0OO(i8, 1.0f, false, true);
                    }
                }
            }
            o0ooo00o2.OooO0O0(o0ooo00o2.f57694OooO0Oo, 1.0f, false, true);
            o0ooo00o2.OooO0Oo(o0ooo00o2.f57694OooO0Oo);
            o0ooo00o2.f57695OooO0o = f2;
            o0o00o01 = this.f33113OooO0oO;
            if (o0o00o01 != null) {
                o0o00o01.OooO0OO(i, f);
            }
            if (this.f33110OooO0Oo != null) {
                arrayList = this.f33124OooOOoo;
                if (arrayList.size() > 0) {
                }
            }
        }
    }

    @Override // p635o0ooO0o0.o0000
    public final void onPageSelected(int i) {
        if (this.f33114OooO0oo != null) {
            o0OoO00O o0ooo00o2 = this.f33109OooO;
            o0ooo00o2.f57696OooO0o0 = o0ooo00o2.f57694OooO0Oo;
            o0ooo00o2.f57694OooO0Oo = i;
            o0ooo00o2.OooO0Oo(i);
            for (int i2 = 0; i2 < o0ooo00o2.f57693OooO0OO; i2++) {
                if (i2 != o0ooo00o2.f57694OooO0Oo && !o0ooo00o2.f57691OooO00o.get(i2)) {
                    o0ooo00o2.OooO00o(i2);
                }
            }
            o0O00o00 o0o00o01 = this.f33113OooO0oO;
            if (o0o00o01 != null) {
                o0o00o01.OooO0Oo();
            }
        }
    }

    public void setAdapter(o0O00OOO o0o00ooo2) {
        o0O00OOO o0o00ooo3 = this.f33114OooO0oo;
        if (o0o00ooo3 == o0o00ooo2) {
            return;
        }
        OooO00o oooO00o = this.f33125OooOo00;
        if (o0o00ooo3 != null) {
            o0o00ooo3.f57699OooO00o.unregisterObserver(oooO00o);
        }
        this.f33114OooO0oo = o0o00ooo2;
        o0OoO00O o0ooo00o2 = this.f33109OooO;
        if (o0o00ooo2 == null) {
            o0ooo00o2.f57693OooO0OO = 0;
            o0ooo00o2.f57691OooO00o.clear();
            o0ooo00o2.f57692OooO0O0.clear();
            OooO0OO();
            return;
        }
        o0o00ooo2.f57699OooO00o.registerObserver(oooO00o);
        o0ooo00o2.f57693OooO0OO = this.f33114OooO0oo.OooO00o();
        o0ooo00o2.f57691OooO00o.clear();
        o0ooo00o2.f57692OooO0O0.clear();
        if (this.f33112OooO0o0 != null) {
            this.f33114OooO0oo.f57699OooO00o.notifyChanged();
        }
    }

    public void setAdjustMode(boolean z) {
        this.f33115OooOO0 = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f33116OooOO0O = z;
    }

    public void setFollowTouch(boolean z) {
        this.f33118OooOOO = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f33123OooOOo0 = z;
    }

    public void setLeftPadding(int i) {
        this.f33121OooOOOo = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f33122OooOOo = z;
    }

    public void setRightPadding(int i) {
        this.f33120OooOOOO = i;
    }

    public void setScrollPivotX(float f) {
        this.f33117OooOO0o = f;
    }

    public void setSkimOver(boolean z) {
        this.f33109OooO.f57698OooO0oo = z;
    }

    public void setSmoothScroll(boolean z) {
        this.f33119OooOOO0 = z;
    }
}
