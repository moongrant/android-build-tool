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
import p628o0ooO0O.o00oO0o;
import p628o0ooO0O.o0OOO0o;
import p628o0ooO0O.o0ooOOo;
import p630o0ooO0OO.o00O0000;
import p631o0ooO0Oo.o00O000;
import p631o0ooO0Oo.o00oOoo;
import p631o0ooO0Oo.o0O0ooO;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class CommonNavigator extends FrameLayout implements o00O0000, o00oO0o.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00oO0o f33642OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HorizontalScrollView f33643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public LinearLayout f33644OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LinearLayout f33645OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O000 f33646OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0O0ooO f33647OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f33648OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33649OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33650OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f33651OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33652OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33653OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33654OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f33655OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f33656OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList f33657OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO00o f33658OooOo00;

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            CommonNavigator commonNavigator = CommonNavigator.this;
            o00oO0o o00oo0o2 = commonNavigator.f33642OooO;
            o00oo0o2.f57118OooO0OO = commonNavigator.f33647OooO0oo.OooO00o();
            o00oo0o2.f57116OooO00o.clear();
            o00oo0o2.f57117OooO0O0.clear();
            commonNavigator.OooO0OO();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.f33650OooOO0o = 0.5f;
        this.f33652OooOOO0 = true;
        this.f33651OooOOO = true;
        this.f33655OooOOo = true;
        this.f33657OooOOoo = new ArrayList();
        this.f33658OooOo00 = new OooO00o();
        o00oO0o o00oo0o2 = new o00oO0o();
        this.f33642OooO = o00oo0o2;
        o00oo0o2.f57115OooO = this;
    }

    @Override // p630o0ooO0OO.o00O0000
    public final void OooO00o() {
        OooO0OO();
    }

    @Override // p630o0ooO0OO.o00O0000
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        LinearLayout.LayoutParams layoutParams;
        removeAllViews();
        View viewInflate = this.f33648OooOO0 ? LayoutInflater.from(getContext()).inflate(o0OOO0o.pager_navigator_layout_no_scroll, this) : LayoutInflater.from(getContext()).inflate(o0OOO0o.pager_navigator_layout, this);
        this.f33643OooO0Oo = (HorizontalScrollView) viewInflate.findViewById(o0ooOOo.scroll_view);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(o0ooOOo.title_container);
        this.f33645OooO0o0 = linearLayout;
        linearLayout.setPadding(this.f33654OooOOOo, 0, this.f33653OooOOOO, 0);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(o0ooOOo.indicator_container);
        this.f33644OooO0o = linearLayout2;
        if (this.f33656OooOOo0) {
            linearLayout2.getParent().bringChildToFront(this.f33644OooO0o);
        }
        int i = this.f33642OooO.f57118OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            CommonPagerTitleView commonPagerTitleViewOooO0OO = this.f33647OooO0oo.OooO0OO(i2, getContext());
            if (commonPagerTitleViewOooO0OO instanceof View) {
                if (this.f33648OooOO0) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    o0O0ooO o0o0ooo = this.f33647OooO0oo;
                    getContext();
                    o0o0ooo.OooO0Oo();
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f33645OooO0o0.addView(commonPagerTitleViewOooO0OO, layoutParams);
            }
        }
        o0O0ooO o0o0ooo2 = this.f33647OooO0oo;
        if (o0o0ooo2 != null) {
            LinePagerIndicator linePagerIndicatorOooO0O0 = o0o0ooo2.OooO0O0(getContext());
            this.f33646OooO0oO = linePagerIndicatorOooO0O0;
            if (linePagerIndicatorOooO0O0 instanceof View) {
                this.f33644OooO0o.addView((View) this.f33646OooO0oO, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public o0O0ooO getAdapter() {
        return this.f33647OooO0oo;
    }

    public int getLeftPadding() {
        return this.f33654OooOOOo;
    }

    public o00O000 getPagerIndicator() {
        return this.f33646OooO0oO;
    }

    public int getRightPadding() {
        return this.f33653OooOOOO;
    }

    public float getScrollPivotX() {
        return this.f33650OooOO0o;
    }

    public LinearLayout getTitleContainer() {
        return this.f33645OooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f33647OooO0oo != null) {
            ArrayList arrayList = this.f33657OooOOoo;
            arrayList.clear();
            o00oO0o o00oo0o2 = this.f33642OooO;
            int i5 = o00oo0o2.f57118OooO0OO;
            for (int i6 = 0; i6 < i5; i6++) {
                o0000O00 o0000o00 = new o0000O00();
                View childAt = this.f33645OooO0o0.getChildAt(i6);
                if (childAt != 0) {
                    o0000o00.f57126OooO00o = childAt.getLeft();
                    o0000o00.f57127OooO0O0 = childAt.getTop();
                    o0000o00.f57128OooO0OO = childAt.getRight();
                    int bottom = childAt.getBottom();
                    o0000o00.f57129OooO0Oo = bottom;
                    if (childAt instanceof o00oOoo) {
                        o00oOoo o00oooo2 = (o00oOoo) childAt;
                        o0000o00.f57131OooO0o0 = o00oooo2.getContentLeft();
                        o0000o00.f57130OooO0o = o00oooo2.getContentTop();
                        o0000o00.f57132OooO0oO = o00oooo2.getContentRight();
                        o0000o00.f57133OooO0oo = o00oooo2.getContentBottom();
                    } else {
                        o0000o00.f57131OooO0o0 = o0000o00.f57126OooO00o;
                        o0000o00.f57130OooO0o = o0000o00.f57127OooO0O0;
                        o0000o00.f57132OooO0oO = o0000o00.f57128OooO0OO;
                        o0000o00.f57133OooO0oo = bottom;
                    }
                }
                arrayList.add(o0000o00);
            }
            o00O000 o00o001 = this.f33646OooO0oO;
            if (o00o001 != null) {
                o00o001.OooO0O0(arrayList);
            }
            if (this.f33655OooOOo && o00oo0o2.f57122OooO0oO == 0) {
                onPageSelected(o00oo0o2.f57119OooO0Oo);
                onPageScrolled(o00oo0o2.f57119OooO0Oo, 0.0f, 0);
            }
        }
    }

    @Override // p630o0ooO0OO.o00O0000
    public final void onPageScrollStateChanged(int i) {
        if (this.f33647OooO0oo != null) {
            this.f33642OooO.f57122OooO0oO = i;
            o00O000 o00o001 = this.f33646OooO0oO;
            if (o00o001 != null) {
                o00o001.OooO00o();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // p630o0ooO0OO.o00O0000
    public final void onPageScrolled(int i, float f, int i2) {
        o00O000 o00o001;
        ArrayList arrayList;
        boolean z;
        if (this.f33647OooO0oo != null) {
            float f2 = i + f;
            o00oO0o o00oo0o2 = this.f33642OooO;
            float f3 = o00oo0o2.f57120OooO0o;
            boolean z2 = f3 <= f2;
            int i3 = o00oo0o2.f57122OooO0oO;
            SparseArray<Float> sparseArray = o00oo0o2.f57117OooO0O0;
            if (i3 != 0) {
                if (f2 != f3) {
                    int i4 = i + 1;
                    if (f == 0.0f && z2) {
                        i4 = i - 1;
                        z = false;
                    } else {
                        z = true;
                    }
                    for (int i5 = 0; i5 < o00oo0o2.f57118OooO0OO; i5++) {
                        if (i5 != i && i5 != i4 && sparseArray.get(i5, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                            o00oo0o2.OooO0OO(i5, 1.0f, z2, true);
                        }
                    }
                    if (!z) {
                        float f4 = 1.0f - f;
                        o00oo0o2.OooO0OO(i4, f4, true, false);
                        o00oo0o2.OooO0O0(i, f4, true, false);
                    } else if (z2) {
                        o00oo0o2.OooO0OO(i, f, true, false);
                        o00oo0o2.OooO0O0(i4, f, true, false);
                    } else {
                        float f5 = 1.0f - f;
                        o00oo0o2.OooO0OO(i4, f5, false, false);
                        o00oo0o2.OooO0O0(i, f5, false, false);
                    }
                }
                o00o001 = this.f33646OooO0oO;
                if (o00o001 != null) {
                    o00o001.OooO0OO(i, f);
                }
                if (this.f33643OooO0Oo != null) {
                    arrayList = this.f33657OooOOoo;
                    if (arrayList.size() > 0 || i < 0 || i >= arrayList.size() || !this.f33651OooOOO) {
                        return;
                    }
                    int iMin = Math.min(arrayList.size() - 1, i);
                    int iMin2 = Math.min(arrayList.size() - 1, i + 1);
                    o0000O00 o0000o00 = (o0000O00) arrayList.get(iMin);
                    o0000O00 o0000o01 = (o0000O00) arrayList.get(iMin2);
                    int i6 = o0000o00.f57126OooO00o;
                    float fOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(o0000o00.f57128OooO0OO, i6, 2, i6) - (this.f33643OooO0Oo.getWidth() * this.f33650OooOO0o);
                    int i7 = o0000o01.f57126OooO00o;
                    this.f33643OooO0Oo.scrollTo((int) OooO0o.OooO00o(androidx.appcompat.widget.OooO00o.OooO00o(o0000o01.f57128OooO0OO, i7, 2, i7) - (this.f33643OooO0Oo.getWidth() * this.f33650OooOO0o), fOooO00o, f, fOooO00o), 0);
                    return;
                }
            }
            for (int i8 = 0; i8 < o00oo0o2.f57118OooO0OO; i8++) {
                if (i8 != o00oo0o2.f57119OooO0Oo) {
                    if (!o00oo0o2.f57116OooO00o.get(i8)) {
                        o00oo0o2.OooO00o(i8);
                    }
                    if (sparseArray.get(i8, Float.valueOf(0.0f)).floatValue() != 1.0f) {
                        o00oo0o2.OooO0OO(i8, 1.0f, false, true);
                    }
                }
            }
            o00oo0o2.OooO0O0(o00oo0o2.f57119OooO0Oo, 1.0f, false, true);
            o00oo0o2.OooO0Oo(o00oo0o2.f57119OooO0Oo);
            o00oo0o2.f57120OooO0o = f2;
            o00o001 = this.f33646OooO0oO;
            if (o00o001 != null) {
                o00o001.OooO0OO(i, f);
            }
            if (this.f33643OooO0Oo != null) {
                arrayList = this.f33657OooOOoo;
                if (arrayList.size() > 0) {
                }
            }
        }
    }

    @Override // p630o0ooO0OO.o00O0000
    public final void onPageSelected(int i) {
        if (this.f33647OooO0oo != null) {
            o00oO0o o00oo0o2 = this.f33642OooO;
            o00oo0o2.f57121OooO0o0 = o00oo0o2.f57119OooO0Oo;
            o00oo0o2.f57119OooO0Oo = i;
            o00oo0o2.OooO0Oo(i);
            for (int i2 = 0; i2 < o00oo0o2.f57118OooO0OO; i2++) {
                if (i2 != o00oo0o2.f57119OooO0Oo && !o00oo0o2.f57116OooO00o.get(i2)) {
                    o00oo0o2.OooO00o(i2);
                }
            }
            o00O000 o00o001 = this.f33646OooO0oO;
            if (o00o001 != null) {
                o00o001.OooO0Oo();
            }
        }
    }

    public void setAdapter(o0O0ooO o0o0ooo) {
        o0O0ooO o0o0ooo2 = this.f33647OooO0oo;
        if (o0o0ooo2 == o0o0ooo) {
            return;
        }
        OooO00o oooO00o = this.f33658OooOo00;
        if (o0o0ooo2 != null) {
            o0o0ooo2.f57125OooO00o.unregisterObserver(oooO00o);
        }
        this.f33647OooO0oo = o0o0ooo;
        o00oO0o o00oo0o2 = this.f33642OooO;
        if (o0o0ooo == null) {
            o00oo0o2.f57118OooO0OO = 0;
            o00oo0o2.f57116OooO00o.clear();
            o00oo0o2.f57117OooO0O0.clear();
            OooO0OO();
            return;
        }
        o0o0ooo.f57125OooO00o.registerObserver(oooO00o);
        o00oo0o2.f57118OooO0OO = this.f33647OooO0oo.OooO00o();
        o00oo0o2.f57116OooO00o.clear();
        o00oo0o2.f57117OooO0O0.clear();
        if (this.f33645OooO0o0 != null) {
            this.f33647OooO0oo.f57125OooO00o.notifyChanged();
        }
    }

    public void setAdjustMode(boolean z) {
        this.f33648OooOO0 = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f33649OooOO0O = z;
    }

    public void setFollowTouch(boolean z) {
        this.f33651OooOOO = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f33656OooOOo0 = z;
    }

    public void setLeftPadding(int i) {
        this.f33654OooOOOo = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f33655OooOOo = z;
    }

    public void setRightPadding(int i) {
        this.f33653OooOOOO = i;
    }

    public void setScrollPivotX(float f) {
        this.f33650OooOO0o = f;
    }

    public void setSkimOver(boolean z) {
        this.f33642OooO.f57123OooO0oo = z;
    }

    public void setSmoothScroll(boolean z) {
        this.f33652OooOOO0 = z;
    }
}
