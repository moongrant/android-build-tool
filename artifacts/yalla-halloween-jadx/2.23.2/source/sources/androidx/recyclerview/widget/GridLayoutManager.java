package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseIntArray f10538OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f10539OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f10540OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10541OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View[] f10542OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SparseIntArray f10543OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0O0 f10544OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Rect f10545OooOO0O;

    public static final class OooO00o extends OooO0O0 {
        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
        public final int OooO0O0(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
        public final int OooO0OO(int i) {
            return 1;
        }
    }

    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseIntArray f10548OooO00o = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseIntArray f10549OooO0O0 = new SparseIntArray();

        public final int OooO00o(int i, int i2) {
            int iOooO0OO = OooO0OO(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int iOooO0OO2 = OooO0OO(i5);
                i3 += iOooO0OO2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = iOooO0OO2;
                }
            }
            return i3 + iOooO0OO > i2 ? i4 + 1 : i4;
        }

        public int OooO0O0(int i, int i2) {
            int iOooO0OO = OooO0OO(i);
            if (iOooO0OO == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int iOooO0OO2 = OooO0OO(i4);
                i3 += iOooO0OO2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = iOooO0OO2;
                }
            }
            if (iOooO0OO + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        public abstract int OooO0OO(int i);

        public final void OooO0Oo() {
            this.f10548OooO00o.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f10539OooO0Oo = false;
        this.f10541OooO0o0 = -1;
        this.f10543OooO0oo = new SparseIntArray();
        this.f10538OooO = new SparseIntArray();
        this.f10544OooOO0 = new OooO00o();
        this.f10545OooOO0O = new Rect();
        OooOOo0(RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2).f10706OooO0O0);
    }

    public final void OooOO0O(int i) {
        int i2;
        int[] iArr = this.f10540OooO0o;
        int i3 = this.f10541OooO0o0;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f10540OooO0o = iArr;
    }

    public final int OooOO0o(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f10540OooO0o;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f10540OooO0o;
        int i3 = this.f10541OooO0o0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int OooOOO(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!o0ooo0o2.f10733OooO0oO) {
            return this.f10544OooOO0.OooO0O0(i, this.f10541OooO0o0);
        }
        int i2 = this.f10538OooO.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0O0 = o00ooo2.OooO0O0(i);
        if (iOooO0O0 != -1) {
            return this.f10544OooOO0.OooO0O0(iOooO0O0, this.f10541OooO0o0);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int OooOOO0(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!o0ooo0o2.f10733OooO0oO) {
            return this.f10544OooOO0.OooO00o(i, this.f10541OooO0o0);
        }
        int iOooO0O0 = o00ooo2.OooO0O0(i);
        if (iOooO0O0 != -1) {
            return this.f10544OooOO0.OooO00o(iOooO0O0, this.f10541OooO0o0);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int OooOOOO(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!o0ooo0o2.f10733OooO0oO) {
            return this.f10544OooOO0.OooO0OO(i);
        }
        int i2 = this.f10543OooO0oo.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0O0 = o00ooo2.OooO0O0(i);
        if (iOooO0O0 != -1) {
            return this.f10544OooOO0.OooO0OO(iOooO0O0);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void OooOOOo(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f10694OooO0o0;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iOooOO0o = OooOO0o(layoutParams.f10547OooO0oo, layoutParams.f10546OooO);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOO0o, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.Oooo000.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOO0o, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.Oooo000.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams2) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams2)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void OooOOo() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        OooOO0O(height - paddingTop);
    }

    public final void OooOOo0(int i) {
        if (i == this.f10541OooO0o0) {
            return;
        }
        this.f10539OooO0Oo = true;
        if (i < 1) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Span count should be at least 1. Provided ", i));
        }
        this.f10541OooO0o0 = i;
        this.f10544OooOO0.OooO0Oo();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO0OO oooO0OO, RecyclerView.Oooo000.OooO0OO oooO0OO2) {
        int iOooO0OO = this.f10541OooO0o0;
        for (int i = 0; i < this.f10541OooO0o0; i++) {
            int i2 = oooO0OO.f10563OooO0Oo;
            if (!(i2 >= 0 && i2 < o0ooo0o2.OooO0O0()) || iOooO0OO <= 0) {
                return;
            }
            int i3 = oooO0OO.f10563OooO0Oo;
            ((o0OoOo0.OooO0O0) oooO0OO2).OooO00o(i3, Math.max(0, oooO0OO.f10566OooO0oO));
            iOooO0OO -= this.f10544OooOO0.OooO0OO(i3);
            oooO0OO.f10563OooO0Oo += oooO0OO.f10565OooO0o0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return super.computeHorizontalScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return super.computeHorizontalScrollRange(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return super.computeVerticalScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return super.computeVerticalScrollRange(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        ensureLayoutState();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iOooO0O0 && OooOOO(position, o00ooo2, o0ooo0o2) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO0OO()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.OooO0o0(childAt) < iOooO0oO && this.mOrientationHelper.OooO0O0(childAt) >= iOooOO0O) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int getColumnCountForAccessibility(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.mOrientation == 1) {
            return this.f10541OooO0o0;
        }
        if (o0ooo0o2.OooO0O0() < 1) {
            return 0;
        }
        return OooOOO0(o0ooo0o2.OooO0O0() - 1, o00ooo2, o0ooo0o2) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int getRowCountForAccessibility(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.mOrientation == 0) {
            return this.f10541OooO0o0;
        }
        if (o0ooo0o2.OooO0O0() < 1) {
            return 0;
        }
        return OooOOO0(o0ooo0o2.OooO0O0() - 1, o00ooo2, o0ooo0o2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO0OO oooO0OO, LinearLayoutManager.OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iOooO0Oo;
        int paddingLeft;
        int iOooO0Oo2;
        int i12;
        int i13;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        View viewOooO0O0;
        int iOooOO0 = this.mOrientationHelper.OooOO0();
        boolean z2 = iOooOO0 != 1073741824;
        int i14 = getChildCount() > 0 ? this.f10540OooO0o[this.f10541OooO0o0] : 0;
        if (z2) {
            OooOOo();
        }
        boolean z3 = oooO0OO.f10565OooO0o0 == 1;
        int iOooOOO = this.f10541OooO0o0;
        if (!z3) {
            iOooOOO = OooOOO(oooO0OO.f10563OooO0Oo, o00ooo2, o0ooo0o2) + OooOOOO(oooO0OO.f10563OooO0Oo, o00ooo2, o0ooo0o2);
        }
        int i15 = 0;
        while (i15 < this.f10541OooO0o0) {
            int i16 = oooO0OO.f10563OooO0Oo;
            if (!(i16 >= 0 && i16 < o0ooo0o2.OooO0O0()) || iOooOOO <= 0) {
                break;
            }
            int i17 = oooO0OO.f10563OooO0Oo;
            int iOooOOOO = OooOOOO(i17, o00ooo2, o0ooo0o2);
            if (iOooOOOO > this.f10541OooO0o0) {
                throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO00o(p041Ooooo0o.o00000.OooO00o("Item at position ", i17, " requires ", iOooOOOO, " spans but GridLayoutManager has only "), this.f10541OooO0o0, " spans."));
            }
            iOooOOO -= iOooOOOO;
            if (iOooOOO < 0 || (viewOooO0O0 = oooO0OO.OooO0O0(o00ooo2)) == null) {
                break;
            }
            this.f10542OooO0oO[i15] = viewOooO0O0;
            i15++;
        }
        if (i15 == 0) {
            oooO0O0.f10556OooO0O0 = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i15;
            i = 0;
        } else {
            i = i15 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i18 = 0;
        while (i != i2) {
            View view = this.f10542OooO0oO[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iOooOOOO2 = OooOOOO(getPosition(view), o00ooo2, o0ooo0o2);
            layoutParams.f10546OooO = iOooOOOO2;
            layoutParams.f10547OooO0oo = i18;
            i18 += iOooOOOO2;
            i += i3;
        }
        float f = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i15; i20++) {
            View view2 = this.f10542OooO0oO[i20];
            if (oooO0OO.f10569OooOO0O != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f10545OooOO0O);
            OooOOOo(view2, iOooOO0, z);
            int iOooO0OO = this.mOrientationHelper.OooO0OO(view2);
            if (iOooO0OO > i19) {
                i19 = iOooO0OO;
            }
            float fOooO0Oo = (this.mOrientationHelper.OooO0Oo(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f10546OooO;
            if (fOooO0Oo > f) {
                f = fOooO0Oo;
            }
        }
        if (z2) {
            OooOO0O(Math.max(Math.round(f * this.f10541OooO0o0), i14));
            i19 = 0;
            for (int i21 = 0; i21 < i15; i21++) {
                View view3 = this.f10542OooO0oO[i21];
                OooOOOo(view3, Pow2.MAX_POW2, true);
                int iOooO0OO2 = this.mOrientationHelper.OooO0OO(view3);
                if (iOooO0OO2 > i19) {
                    i19 = iOooO0OO2;
                }
            }
        }
        for (int i22 = 0; i22 < i15; i22++) {
            View view4 = this.f10542OooO0oO[i22];
            if (this.mOrientationHelper.OooO0OO(view4) != i19) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.f10694OooO0o0;
                int i23 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i24 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iOooOO0o = OooOO0o(layoutParams2.f10547OooO0oo, layoutParams2.f10546OooO);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOO0o, Pow2.MAX_POW2, i24, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i23, Pow2.MAX_POW2);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, Pow2.MAX_POW2);
                    childMeasureSpec = RecyclerView.Oooo000.getChildMeasureSpec(iOooOO0o, Pow2.MAX_POW2, i23, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        int i25 = 0;
        oooO0O0.f10555OooO00o = i19;
        if (this.mOrientation == 1) {
            if (oooO0OO.f10564OooO0o == -1) {
                i13 = oooO0OO.f10561OooO0O0;
                i12 = i13 - i19;
            } else {
                int i26 = oooO0OO.f10561OooO0O0;
                i12 = i26;
                i13 = i19 + i26;
            }
            i7 = 0;
            i6 = i12;
            i8 = i13;
            i5 = 0;
        } else {
            if (oooO0OO.f10564OooO0o == -1) {
                i5 = oooO0OO.f10561OooO0O0;
                i4 = i5 - i19;
            } else {
                int i27 = oooO0OO.f10561OooO0O0;
                i4 = i27;
                i5 = i19 + i27;
            }
            i6 = 0;
            i7 = i4;
            i8 = 0;
        }
        while (i25 < i15) {
            View view5 = this.f10542OooO0oO[i25];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iOooO0Oo2 = getPaddingLeft() + this.f10540OooO0o[this.f10541OooO0o0 - layoutParams3.f10547OooO0oo];
                    paddingLeft = iOooO0Oo2 - this.mOrientationHelper.OooO0Oo(view5);
                } else {
                    paddingLeft = this.f10540OooO0o[layoutParams3.f10547OooO0oo] + getPaddingLeft();
                    iOooO0Oo2 = this.mOrientationHelper.OooO0Oo(view5) + paddingLeft;
                }
                i10 = paddingLeft;
                i11 = i6;
                iOooO0Oo = i8;
                i9 = iOooO0Oo2;
            } else {
                int paddingTop = getPaddingTop() + this.f10540OooO0o[layoutParams3.f10547OooO0oo];
                i9 = i5;
                i10 = i7;
                i11 = paddingTop;
                iOooO0Oo = this.mOrientationHelper.OooO0Oo(view5) + paddingTop;
            }
            layoutDecoratedWithMargins(view5, i10, i11, i9, iOooO0Oo);
            if (layoutParams3.OooO0OO() || layoutParams3.OooO0O0()) {
                oooO0O0.f10557OooO0OO = true;
            }
            oooO0O0.f10558OooO0Oo |= view5.hasFocusable();
            i25++;
            i5 = i9;
            i7 = i10;
            i6 = i11;
            i8 = iOooO0Oo;
        }
        Arrays.fill(this.f10542OooO0oO, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO00o oooO00o, int i) {
        super.onAnchorReady(o00ooo2, o0ooo0o2, oooO00o, i);
        OooOOo();
        if (o0ooo0o2.OooO0O0() > 0 && !o0ooo0o2.f10733OooO0oO) {
            boolean z = i == 1;
            int iOooOOO = OooOOO(oooO00o.f10551OooO0O0, o00ooo2, o0ooo0o2);
            if (z) {
                while (iOooOOO > 0) {
                    int i2 = oooO00o.f10551OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    oooO00o.f10551OooO0O0 = i3;
                    iOooOOO = OooOOO(i3, o00ooo2, o0ooo0o2);
                }
            } else {
                int iOooO0O0 = o0ooo0o2.OooO0O0() - 1;
                int i4 = oooO00o.f10551OooO0O0;
                while (i4 < iOooO0O0) {
                    int i5 = i4 + 1;
                    int iOooOOO2 = OooOOO(i5, o00ooo2, o0ooo0o2);
                    if (iOooOOO2 <= iOooOOO) {
                        break;
                    }
                    i4 = i5;
                    iOooOOO = iOooOOO2;
                }
                oooO00o.f10551OooO0O0 = i4;
            }
        }
        View[] viewArr = this.f10542OooO0oO;
        if (viewArr == null || viewArr.length != this.f10541OooO0o0) {
            this.f10542OooO0oO = new View[this.f10541OooO0o0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        RecyclerView.o00Ooo o00ooo3 = o00ooo2;
        RecyclerView.o0OOO0o o0ooo0o3 = o0ooo0o2;
        View viewFindContainingItemView = findContainingItemView(view);
        View view4 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        int i7 = layoutParams.f10547OooO0oo;
        int i8 = layoutParams.f10546OooO + i7;
        if (super.onFocusSearchFailed(view, i, o00ooo2, o0ooo0o2) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z2 = this.mOrientation == 1 && isLayoutRTL();
        int iOooOOO0 = OooOOO0(childCount2, o00ooo3, o0ooo0o3);
        int i9 = -1;
        int i10 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i11 = childCount2;
        View view5 = null;
        while (i11 != childCount) {
            int iOooOOO1 = OooOOO0(i11, o00ooo3, o0ooo0o3);
            View childAt = getChildAt(i11);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iOooOOO1 == iOooOOO0) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams2.f10547OooO0oo;
                view2 = viewFindContainingItemView;
                int i13 = layoutParams2.f10546OooO + i12;
                if (childAt.hasFocusable() && i12 == i7 && i13 == i8) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view4 == null) && (childAt.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                    if (!childAt.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            i4 = childCount;
                            z = true;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i5 = iMin2;
                                if (iMin3 > i5) {
                                    i6 = i10;
                                } else if (iMin3 == i5) {
                                    i6 = i10;
                                    if (z2 == (i12 > i6)) {
                                        z = true;
                                    }
                                } else {
                                    i6 = i10;
                                }
                                if (z) {
                                    if (childAt.hasFocusable()) {
                                        i9 = layoutParams2.f10547OooO0oo;
                                        i10 = i6;
                                        iMin2 = i5;
                                        view5 = view3;
                                        view4 = childAt;
                                        iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                    } else {
                                        int i14 = layoutParams2.f10547OooO0oo;
                                        iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                        i10 = i14;
                                        iMin = i3;
                                        view5 = childAt;
                                    }
                                }
                                i11 += i2;
                                o00ooo3 = o00ooo2;
                                o0ooo0o3 = o0ooo0o2;
                                viewFindContainingItemView = view2;
                                childCount = i4;
                            }
                            z = false;
                            if (z) {
                                if (childAt.hasFocusable()) {
                                    i9 = layoutParams2.f10547OooO0oo;
                                    i10 = i6;
                                    iMin2 = i5;
                                    view5 = view3;
                                    view4 = childAt;
                                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                } else {
                                    int i15 = layoutParams2.f10547OooO0oo;
                                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                    i10 = i15;
                                    iMin = i3;
                                    view5 = childAt;
                                }
                            }
                            i11 += i2;
                            o00ooo3 = o00ooo2;
                            o0ooo0o3 = o0ooo0o2;
                            viewFindContainingItemView = view2;
                            childCount = i4;
                        }
                        i6 = i10;
                        i5 = iMin2;
                        z = false;
                        if (z) {
                            if (childAt.hasFocusable()) {
                                i9 = layoutParams2.f10547OooO0oo;
                                i10 = i6;
                                iMin2 = i5;
                                view5 = view3;
                                view4 = childAt;
                                iMin = Math.min(i13, i8) - Math.max(i12, i7);
                            } else {
                                int i16 = layoutParams2.f10547OooO0oo;
                                iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                i10 = i16;
                                iMin = i3;
                                view5 = childAt;
                            }
                        }
                        i11 += i2;
                        o00ooo3 = o00ooo2;
                        o0ooo0o3 = o0ooo0o2;
                        viewFindContainingItemView = view2;
                        childCount = i4;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                    i3 = iMin;
                    i4 = childCount;
                    i6 = i10;
                    i5 = iMin2;
                    z = false;
                    if (z) {
                        if (childAt.hasFocusable()) {
                            i9 = layoutParams2.f10547OooO0oo;
                            i10 = i6;
                            iMin2 = i5;
                            view5 = view3;
                            view4 = childAt;
                            iMin = Math.min(i13, i8) - Math.max(i12, i7);
                        } else {
                            int i17 = layoutParams2.f10547OooO0oo;
                            iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                            i10 = i17;
                            iMin = i3;
                            view5 = childAt;
                        }
                    }
                    i11 += i2;
                    o00ooo3 = o00ooo2;
                    o0ooo0o3 = o0ooo0o2;
                    viewFindContainingItemView = view2;
                    childCount = i4;
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                i4 = childCount;
                i6 = i10;
                i5 = iMin2;
                z = true;
                if (z) {
                    if (childAt.hasFocusable()) {
                        i9 = layoutParams2.f10547OooO0oo;
                        i10 = i6;
                        iMin2 = i5;
                        view5 = view3;
                        view4 = childAt;
                        iMin = Math.min(i13, i8) - Math.max(i12, i7);
                    } else {
                        int i18 = layoutParams2.f10547OooO0oo;
                        iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                        i10 = i18;
                        iMin = i3;
                        view5 = childAt;
                    }
                }
                i11 += i2;
                o00ooo3 = o00ooo2;
                o0ooo0o3 = o0ooo0o2;
                viewFindContainingItemView = view2;
                childCount = i4;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
                i3 = iMin;
                i4 = childCount;
                i6 = i10;
                i5 = iMin2;
            }
            i10 = i6;
            iMin2 = i5;
            iMin = i3;
            view5 = view3;
            i11 += i2;
            o00ooo3 = o00ooo2;
            o0ooo0o3 = o0ooo0o2;
            viewFindContainingItemView = view2;
            childCount = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.o00Ooo o00ooo2, @NonNull RecyclerView.o0OOO0o o0ooo0o2, @NonNull o0000O.o0O0O00 o0o0o00) {
        super.onInitializeAccessibilityNodeInfo(o00ooo2, o0ooo0o2, o0o0o00);
        o0o0o00.OooOO0O(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, View view, o0000O.o0O0O00 o0o0o00) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, o0o0o00);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iOooOOO0 = OooOOO0(layoutParams2.OooO00o(), o00ooo2, o0ooo0o2);
        if (this.mOrientation == 0) {
            o0o0o00.OooOOO0(o0000O.o0O0O00.OooOO0O.OooO00o(layoutParams2.f10547OooO0oo, layoutParams2.f10546OooO, iOooOOO0, 1, false, false));
        } else {
            o0o0o00.OooOOO0(o0000O.o0O0O00.OooOO0O.OooO00o(iOooOOO0, 1, layoutParams2.f10547OooO0oo, layoutParams2.f10546OooO, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f10544OooOO0.OooO0Oo();
        this.f10544OooOO0.f10549OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f10544OooOO0.OooO0Oo();
        this.f10544OooOO0.f10549OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f10544OooOO0.OooO0Oo();
        this.f10544OooOO0.f10549OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f10544OooOO0.OooO0Oo();
        this.f10544OooOO0.f10549OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f10544OooOO0.OooO0Oo();
        this.f10544OooOO0.f10549OooO0O0.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        boolean z = o0ooo0o2.f10733OooO0oO;
        SparseIntArray sparseIntArray = this.f10538OooO;
        SparseIntArray sparseIntArray2 = this.f10543OooO0oo;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int iOooO00o = layoutParams.OooO00o();
                sparseIntArray2.put(iOooO00o, layoutParams.f10546OooO);
                sparseIntArray.put(iOooO00o, layoutParams.f10547OooO0oo);
            }
        }
        super.onLayoutChildren(o00ooo2, o0ooo0o2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.f10539OooO0Oo = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        OooOOo();
        View[] viewArr = this.f10542OooO0oO;
        if (viewArr == null || viewArr.length != this.f10541OooO0o0) {
            this.f10542OooO0oO = new View[this.f10541OooO0o0];
        }
        return super.scrollHorizontallyBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        OooOOo();
        View[] viewArr = this.f10542OooO0oO;
        if (viewArr == null || viewArr.length != this.f10541OooO0o0) {
            this.f10542OooO0oO = new View[this.f10541OooO0o0];
        }
        return super.scrollVerticallyBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f10540OooO0o == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f10540OooO0o;
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f10540OooO0o;
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f10539OooO0Oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f10546OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f10547OooO0oo;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10547OooO0oo = -1;
            this.f10546OooO = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f10547OooO0oo = -1;
            this.f10546OooO = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10547OooO0oo = -1;
            this.f10546OooO = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10547OooO0oo = -1;
            this.f10546OooO = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f10539OooO0Oo = false;
        this.f10541OooO0o0 = -1;
        this.f10543OooO0oo = new SparseIntArray();
        this.f10538OooO = new SparseIntArray();
        this.f10544OooOO0 = new OooO00o();
        this.f10545OooOO0O = new Rect();
        OooOOo0(i);
    }

    public GridLayoutManager(int i, Context context) {
        super(context, 1, false);
        this.f10539OooO0Oo = false;
        this.f10541OooO0o0 = -1;
        this.f10543OooO0oo = new SparseIntArray();
        this.f10538OooO = new SparseIntArray();
        this.f10544OooOO0 = new OooO00o();
        this.f10545OooOO0O = new Rect();
        OooOOo0(i);
    }
}
