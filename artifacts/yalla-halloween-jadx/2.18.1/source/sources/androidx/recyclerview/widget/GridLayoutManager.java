package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import p042Ooooo0o.o000O0Oo;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View[] f8826Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f8827Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f8828Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int[] f8829Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Rect f8830OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final SparseIntArray f8831OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final SparseIntArray f8832OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooO0O0 f8833OoooO0O;

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
        public final SparseIntArray f8836OooO00o = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseIntArray f8837OooO0O0 = new SparseIntArray();

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
            this.f8837OooO0O0.clear();
        }

        public final void OooO0o0() {
            this.f8836OooO00o.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f8827Oooo0o = false;
        this.f8828Oooo0oO = -1;
        this.f8832OoooO00 = new SparseIntArray();
        this.f8831OoooO0 = new SparseIntArray();
        this.f8833OoooO0O = new OooO00o();
        this.f8830OoooO = new Rect();
        OooOOoo(RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2).f9030OooO0O0);
    }

    public final void OooOO0O(int i) {
        int i2;
        int[] iArr = this.f8829Oooo0oo;
        int i3 = this.f8828Oooo0oO;
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
        this.f8829Oooo0oo = iArr;
    }

    public final void OooOO0o() {
        View[] viewArr = this.f8826Oooo;
        if (viewArr == null || viewArr.length != this.f8828Oooo0oO) {
            this.f8826Oooo = new View[this.f8828Oooo0oO];
        }
    }

    public final int OooOOO(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        if (!o0ooo0o2.f9063OooO0oO) {
            return this.f8833OoooO0O.OooO00o(i, this.f8828Oooo0oO);
        }
        int iOooO0OO = o00ooo2.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f8833OoooO0O.OooO00o(iOooO0OO, this.f8828Oooo0oO);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int OooOOO0(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f8829Oooo0oo;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f8829Oooo0oo;
        int i3 = this.f8828Oooo0oO;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int OooOOOO(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        if (!o0ooo0o2.f9063OooO0oO) {
            return this.f8833OoooO0O.OooO0O0(i, this.f8828Oooo0oO);
        }
        int i2 = this.f8831OoooO0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0OO = o00ooo2.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f8833OoooO0O.OooO0O0(iOooO0OO, this.f8828Oooo0oO);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int OooOOOo(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        if (!o0ooo0o2.f9063OooO0oO) {
            return this.f8833OoooO0O.OooO0OO(i);
        }
        int i2 = this.f8832OoooO00.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iOooO0OO = o00ooo2.OooO0OO(i);
        if (iOooO0OO != -1) {
            return this.f8833OoooO0O.OooO0OO(iOooO0OO);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void OooOOo(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    public final void OooOOo0(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f9018Oooo0oO;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iOooOOO0 = OooOOO0(layoutParams.f8835OoooO00, layoutParams.f8834OoooO0);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOOO0, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.Oooo000.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOOO0, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.Oooo000.getChildMeasureSpec(this.mOrientationHelper.OooOO0o(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        OooOOo(view, childMeasureSpec2, childMeasureSpec, z);
    }

    public final void OooOOoo(int i) {
        if (i == this.f8828Oooo0oO) {
            return;
        }
        this.f8827Oooo0o = true;
        if (i < 1) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Span count should be at least 1. Provided ", i));
        }
        this.f8828Oooo0oO = i;
        this.f8833OoooO0O.OooO0o0();
        requestLayout();
    }

    public final void OooOo00() {
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

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO0OO oooO0OO, RecyclerView.Oooo000.OooO0OO oooO0OO2) {
        int iOooO0OO = this.f8828Oooo0oO;
        for (int i = 0; i < this.f8828Oooo0oO && oooO0OO.OooO0O0(o0ooo0o2) && iOooO0OO > 0; i++) {
            int i2 = oooO0OO.f8851OooO0Oo;
            ((o000oOoO.OooO0O0) oooO0OO2).OooO00o(i2, Math.max(0, oooO0OO.f8854OooO0oO));
            iOooO0OO -= this.f8833OoooO0O.OooO0OO(i2);
            oooO0OO.f8851OooO0Oo += oooO0OO.f8853OooO0o0;
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
        int childCount;
        int childCount2 = getChildCount();
        int i = -1;
        if (z2) {
            childCount = getChildCount() - 1;
            childCount2 = -1;
        } else {
            childCount = 0;
            i = 1;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        ensureLayoutState();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        View view = null;
        View view2 = null;
        while (childCount != childCount2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iOooO0O0 && OooOOOO(o00ooo2, o0ooo0o2, position) == 0) {
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
            childCount += i;
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
            return this.f8828Oooo0oO;
        }
        if (o0ooo0o2.OooO0O0() < 1) {
            return 0;
        }
        return OooOOO(o00ooo2, o0ooo0o2, o0ooo0o2.OooO0O0() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int getRowCountForAccessibility(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.mOrientation == 0) {
            return this.f8828Oooo0oO;
        }
        if (o0ooo0o2.OooO0O0() < 1) {
            return 0;
        }
        return OooOOO(o00ooo2, o0ooo0o2, o0ooo0o2.OooO0O0() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO0OO oooO0OO, LinearLayoutManager.OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iOooO0Oo;
        int i5;
        int i6;
        int i7;
        int iOooO0Oo2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        View viewOooO0OO;
        int iOooOO0 = this.mOrientationHelper.OooOO0();
        boolean z2 = iOooOO0 != 1073741824;
        int i8 = getChildCount() > 0 ? this.f8829Oooo0oo[this.f8828Oooo0oO] : 0;
        if (z2) {
            OooOo00();
        }
        boolean z3 = oooO0OO.f8853OooO0o0 == 1;
        int iOooOOOO = this.f8828Oooo0oO;
        if (!z3) {
            iOooOOOO = OooOOOO(o00ooo2, o0ooo0o2, oooO0OO.f8851OooO0Oo) + OooOOOo(o00ooo2, o0ooo0o2, oooO0OO.f8851OooO0Oo);
        }
        int i9 = 0;
        while (i9 < this.f8828Oooo0oO && oooO0OO.OooO0O0(o0ooo0o2) && iOooOOOO > 0) {
            int i10 = oooO0OO.f8851OooO0Oo;
            int iOooOOOo = OooOOOo(o00ooo2, o0ooo0o2, i10);
            if (iOooOOOo > this.f8828Oooo0oO) {
                throw new IllegalArgumentException(o0O0O00.o0ooOOo.OooO00o(o000O0Oo.OooO0O0("Item at position ", i10, " requires ", iOooOOOo, " spans but GridLayoutManager has only "), this.f8828Oooo0oO, " spans."));
            }
            iOooOOOO -= iOooOOOo;
            if (iOooOOOO < 0 || (viewOooO0OO = oooO0OO.OooO0OO(o00ooo2)) == null) {
                break;
            }
            this.f8826Oooo[i9] = viewOooO0OO;
            i9++;
        }
        if (i9 == 0) {
            oooO0O0.f8844OooO0O0 = true;
            return;
        }
        if (z3) {
            i2 = 0;
            i = 0;
            i3 = i9;
            i4 = 1;
        } else {
            i = i9 - 1;
            i2 = 0;
            i3 = -1;
            i4 = -1;
        }
        while (i != i3) {
            View view = this.f8826Oooo[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iOooOOOo2 = OooOOOo(o00ooo2, o0ooo0o2, getPosition(view));
            layoutParams.f8834OoooO0 = iOooOOOo2;
            layoutParams.f8835OoooO00 = i2;
            i2 += iOooOOOo2;
            i += i4;
        }
        int i11 = 0;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i12 = 0; i12 < i9; i12++) {
            View view2 = this.f8826Oooo[i12];
            if (oooO0OO.f8857OooOO0O != null) {
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
            calculateItemDecorationsForChild(view2, this.f8830OoooO);
            OooOOo0(view2, iOooOO0, z);
            int iOooO0OO = this.mOrientationHelper.OooO0OO(view2);
            if (iOooO0OO > i11) {
                i11 = iOooO0OO;
            }
            float fOooO0Oo = (this.mOrientationHelper.OooO0Oo(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f8834OoooO0;
            if (fOooO0Oo > f) {
                f = fOooO0Oo;
            }
        }
        if (z2) {
            OooOO0O(Math.max(Math.round(f * this.f8828Oooo0oO), i8));
            i11 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                View view3 = this.f8826Oooo[i13];
                OooOOo0(view3, 1073741824, true);
                int iOooO0OO2 = this.mOrientationHelper.OooO0OO(view3);
                if (iOooO0OO2 > i11) {
                    i11 = iOooO0OO2;
                }
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            View view4 = this.f8826Oooo[i14];
            if (this.mOrientationHelper.OooO0OO(view4) != i11) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.f9018Oooo0oO;
                int i15 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i16 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iOooOOO0 = OooOOO0(layoutParams2.f8835OoooO00, layoutParams2.f8834OoooO0);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.Oooo000.getChildMeasureSpec(iOooOOO0, 1073741824, i16, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    childMeasureSpec = RecyclerView.Oooo000.getChildMeasureSpec(iOooOOO0, 1073741824, i15, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                OooOOo(view4, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        oooO0O0.f8843OooO00o = i11;
        if (this.mOrientation == 1) {
            if (oooO0OO.f8852OooO0o == -1) {
                i5 = oooO0OO.f8849OooO0O0;
                i6 = i5 - i11;
            } else {
                int i17 = oooO0OO.f8849OooO0O0;
                int i18 = i11 + i17;
                i6 = i17;
                i5 = i18;
            }
            iOooO0Oo = 0;
            paddingLeft = 0;
        } else if (oooO0OO.f8852OooO0o == -1) {
            iOooO0Oo = oooO0OO.f8849OooO0O0;
            paddingLeft = iOooO0Oo - i11;
            i6 = 0;
            i5 = 0;
        } else {
            paddingLeft = oooO0OO.f8849OooO0O0;
            iOooO0Oo = i11 + paddingLeft;
            i5 = 0;
            i6 = 0;
        }
        int i19 = 0;
        while (i19 < i9) {
            View view5 = this.f8826Oooo[i19];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iOooO0Oo = getPaddingLeft() + this.f8829Oooo0oo[this.f8828Oooo0oO - layoutParams3.f8835OoooO00];
                    paddingLeft = iOooO0Oo - this.mOrientationHelper.OooO0Oo(view5);
                } else {
                    paddingLeft = this.f8829Oooo0oo[layoutParams3.f8835OoooO00] + getPaddingLeft();
                    iOooO0Oo = this.mOrientationHelper.OooO0Oo(view5) + paddingLeft;
                }
                iOooO0Oo2 = i5;
                i7 = i6;
            } else {
                int paddingTop = getPaddingTop() + this.f8829Oooo0oo[layoutParams3.f8835OoooO00];
                i7 = paddingTop;
                iOooO0Oo2 = this.mOrientationHelper.OooO0Oo(view5) + paddingTop;
            }
            int i20 = iOooO0Oo;
            int i21 = paddingLeft;
            layoutDecoratedWithMargins(view5, i21, i7, i20, iOooO0Oo2);
            if (layoutParams3.OooO0OO() || layoutParams3.OooO0O0()) {
                oooO0O0.f8845OooO0OO = true;
            }
            oooO0O0.f8846OooO0Oo |= view5.hasFocusable();
            i19++;
            i5 = iOooO0Oo2;
            i6 = i7;
            iOooO0Oo = i20;
            paddingLeft = i21;
        }
        Arrays.fill(this.f8826Oooo, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, LinearLayoutManager.OooO00o oooO00o, int i) {
        super.onAnchorReady(o00ooo2, o0ooo0o2, oooO00o, i);
        OooOo00();
        if (o0ooo0o2.OooO0O0() > 0 && !o0ooo0o2.f9063OooO0oO) {
            boolean z = i == 1;
            int iOooOOOO = OooOOOO(o00ooo2, o0ooo0o2, oooO00o.f8839OooO0O0);
            if (z) {
                while (iOooOOOO > 0) {
                    int i2 = oooO00o.f8839OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    oooO00o.f8839OooO0O0 = i3;
                    iOooOOOO = OooOOOO(o00ooo2, o0ooo0o2, i3);
                }
            } else {
                int iOooO0O0 = o0ooo0o2.OooO0O0() - 1;
                int i4 = oooO00o.f8839OooO0O0;
                while (i4 < iOooO0O0) {
                    int i5 = i4 + 1;
                    int iOooOOOO2 = OooOOOO(o00ooo2, o0ooo0o2, i5);
                    if (iOooOOOO2 <= iOooOOOO) {
                        break;
                    }
                    i4 = i5;
                    iOooOOOO = iOooOOOO2;
                }
                oooO00o.f8839OooO0O0 = i4;
            }
        }
        OooOO0o();
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
        int childCount2;
        int i2;
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
        int i7 = layoutParams.f8835OoooO00;
        int i8 = layoutParams.f8834OoooO0 + i7;
        if (super.onFocusSearchFailed(view, i, o00ooo2, o0ooo0o2) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            childCount2 = 0;
            i2 = 1;
        }
        boolean z2 = this.mOrientation == 1 && isLayoutRTL();
        int iOooOOO = OooOOO(o00ooo3, o0ooo0o3, childCount2);
        int i9 = childCount2;
        int iMin = 0;
        int i10 = -1;
        int i11 = -1;
        int iMin2 = 0;
        View view5 = null;
        while (i9 != childCount) {
            int iOooOOO2 = OooOOO(o00ooo3, o0ooo0o3, i9);
            View childAt = getChildAt(i9);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iOooOOO2 == iOooOOO) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams2.f8835OoooO00;
                view2 = viewFindContainingItemView;
                int i13 = layoutParams2.f8834OoooO0 + i12;
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
                                    i6 = i11;
                                } else if (iMin3 == i5) {
                                    i6 = i11;
                                    if (z2 == (i12 > i6)) {
                                        z = true;
                                    }
                                } else {
                                    i6 = i11;
                                }
                                if (z) {
                                    if (childAt.hasFocusable()) {
                                        i10 = layoutParams2.f8835OoooO00;
                                        i11 = i6;
                                        iMin2 = i5;
                                        view5 = view3;
                                        view4 = childAt;
                                        iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                    } else {
                                        int i14 = layoutParams2.f8835OoooO00;
                                        iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                        i11 = i14;
                                        iMin = i3;
                                        view5 = childAt;
                                    }
                                }
                                i9 += i2;
                                o00ooo3 = o00ooo2;
                                o0ooo0o3 = o0ooo0o2;
                                viewFindContainingItemView = view2;
                                childCount = i4;
                            }
                            z = false;
                            if (z) {
                                if (childAt.hasFocusable()) {
                                    i10 = layoutParams2.f8835OoooO00;
                                    i11 = i6;
                                    iMin2 = i5;
                                    view5 = view3;
                                    view4 = childAt;
                                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                } else {
                                    int i15 = layoutParams2.f8835OoooO00;
                                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                    i11 = i15;
                                    iMin = i3;
                                    view5 = childAt;
                                }
                            }
                            i9 += i2;
                            o00ooo3 = o00ooo2;
                            o0ooo0o3 = o0ooo0o2;
                            viewFindContainingItemView = view2;
                            childCount = i4;
                        }
                        i6 = i11;
                        i5 = iMin2;
                        z = false;
                        if (z) {
                            if (childAt.hasFocusable()) {
                                i10 = layoutParams2.f8835OoooO00;
                                i11 = i6;
                                iMin2 = i5;
                                view5 = view3;
                                view4 = childAt;
                                iMin = Math.min(i13, i8) - Math.max(i12, i7);
                            } else {
                                int i16 = layoutParams2.f8835OoooO00;
                                iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                i11 = i16;
                                iMin = i3;
                                view5 = childAt;
                            }
                        }
                        i9 += i2;
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
                    i6 = i11;
                    i5 = iMin2;
                    z = false;
                    if (z) {
                        if (childAt.hasFocusable()) {
                            i10 = layoutParams2.f8835OoooO00;
                            i11 = i6;
                            iMin2 = i5;
                            view5 = view3;
                            view4 = childAt;
                            iMin = Math.min(i13, i8) - Math.max(i12, i7);
                        } else {
                            int i17 = layoutParams2.f8835OoooO00;
                            iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                            i11 = i17;
                            iMin = i3;
                            view5 = childAt;
                        }
                    }
                    i9 += i2;
                    o00ooo3 = o00ooo2;
                    o0ooo0o3 = o0ooo0o2;
                    viewFindContainingItemView = view2;
                    childCount = i4;
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                i4 = childCount;
                i6 = i11;
                i5 = iMin2;
                z = true;
                if (z) {
                    if (childAt.hasFocusable()) {
                        i10 = layoutParams2.f8835OoooO00;
                        i11 = i6;
                        iMin2 = i5;
                        view5 = view3;
                        view4 = childAt;
                        iMin = Math.min(i13, i8) - Math.max(i12, i7);
                    } else {
                        int i18 = layoutParams2.f8835OoooO00;
                        iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                        i11 = i18;
                        iMin = i3;
                        view5 = childAt;
                    }
                }
                i9 += i2;
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
                i6 = i11;
                i5 = iMin2;
            }
            i11 = i6;
            iMin2 = i5;
            iMin = i3;
            view5 = view3;
            i9 += i2;
            o00ooo3 = o00ooo2;
            o0ooo0o3 = o0ooo0o2;
            viewFindContainingItemView = view2;
            childCount = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, View view, o0000OO0 o0000oo1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, o0000oo1);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iOooOOO = OooOOO(o00ooo2, o0ooo0o2, layoutParams2.OooO00o());
        if (this.mOrientation == 0) {
            o0000oo1.Oooo0(o0000OO0.OooO0OO.OooO00o(layoutParams2.f8835OoooO00, layoutParams2.f8834OoooO0, iOooOOO, 1, false));
        } else {
            o0000oo1.Oooo0(o0000OO0.OooO0OO.OooO00o(iOooOOO, 1, layoutParams2.f8835OoooO00, layoutParams2.f8834OoooO0, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f8833OoooO0O.OooO0o0();
        this.f8833OoooO0O.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f8833OoooO0O.OooO0o0();
        this.f8833OoooO0O.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f8833OoooO0O.OooO0o0();
        this.f8833OoooO0O.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f8833OoooO0O.OooO0o0();
        this.f8833OoooO0O.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f8833OoooO0O.OooO0o0();
        this.f8833OoooO0O.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (o0ooo0o2.f9063OooO0oO) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int iOooO00o = layoutParams.OooO00o();
                this.f8832OoooO00.put(iOooO00o, layoutParams.f8834OoooO0);
                this.f8831OoooO0.put(iOooO00o, layoutParams.f8835OoooO00);
            }
        }
        super.onLayoutChildren(o00ooo2, o0ooo0o2);
        this.f8832OoooO00.clear();
        this.f8831OoooO0.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.f8827Oooo0o = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        OooOo00();
        OooOO0o();
        return super.scrollHorizontallyBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        OooOo00();
        OooOO0o();
        return super.scrollVerticallyBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f8829Oooo0oo == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.Oooo000.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f8829Oooo0oo;
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.Oooo000.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f8829Oooo0oo;
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
        return this.mPendingSavedState == null && !this.f8827Oooo0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f8834OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f8835OoooO00;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8835OoooO00 = -1;
            this.f8834OoooO0 = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f8835OoooO00 = -1;
            this.f8834OoooO0 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8835OoooO00 = -1;
            this.f8834OoooO0 = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8835OoooO00 = -1;
            this.f8834OoooO0 = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f8827Oooo0o = false;
        this.f8828Oooo0oO = -1;
        this.f8832OoooO00 = new SparseIntArray();
        this.f8831OoooO0 = new SparseIntArray();
        this.f8833OoooO0O = new OooO00o();
        this.f8830OoooO = new Rect();
        OooOOoo(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, 1, false);
        this.f8827Oooo0o = false;
        this.f8828Oooo0oO = -1;
        this.f8832OoooO00 = new SparseIntArray();
        this.f8831OoooO0 = new SparseIntArray();
        this.f8833OoooO0O = new OooO00o();
        this.f8830OoooO = new Rect();
        OooOOoo(i);
    }
}
