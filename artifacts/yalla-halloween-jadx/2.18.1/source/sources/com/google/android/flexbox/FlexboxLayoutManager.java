package com.google.android.flexbox;

import Oooo000.Oooo0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O0O00;
import androidx.recyclerview.widget.o0OO00O;
import androidx.recyclerview.widget.oo000o;
import androidx.recyclerview.widget.oo0o0Oo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.Oooo000 implements com.google.android.flexbox.OooO00o, RecyclerView.o0ooOOo.OooO0O0 {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final Rect f14937o0OoOo0 = new Rect();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f14939Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f14940Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f14941Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f14943OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f14944OoooO00;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RecyclerView.o00Ooo f14946OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO0O0 f14947OoooOOO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o0O0O00 f14949OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o0O0O00 f14950OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public SavedState f14951OoooOoo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View f14957Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final Context f14958Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public RecyclerView.o0OOO0o f14961o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f14938Oooo = -1;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public List<com.google.android.flexbox.OooO0O0> f14945OoooO0O = new ArrayList();

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO0OO f14942OoooO = new OooO0OO(this);

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO00o f14948OoooOOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f14952Ooooo00 = -1;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f14953Ooooo0o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f14954OooooO0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f14955OooooOO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public SparseArray<View> f14956OooooOo = new SparseArray<>();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f14959OoooooO = -1;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OooO0OO.OooO00o f14960Ooooooo = new OooO0OO.OooO00o();

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f14971OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14972OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14973OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14974OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f14975OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f14976OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f14977OooO0oO;

        public OooO00o() {
        }

        public static void OooO00o(OooO00o oooO00o) {
            if (!FlexboxLayoutManager.this.OooO()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.f14944OoooO00) {
                    oooO00o.f14973OooO0OO = oooO00o.f14976OooO0o0 ? flexboxLayoutManager.f14949OoooOo0.OooO0oO() : flexboxLayoutManager.getWidth() - FlexboxLayoutManager.this.f14949OoooOo0.OooOO0O();
                    return;
                }
            }
            oooO00o.f14973OooO0OO = oooO00o.f14976OooO0o0 ? FlexboxLayoutManager.this.f14949OoooOo0.OooO0oO() : FlexboxLayoutManager.this.f14949OoooOo0.OooOO0O();
        }

        public static void OooO0O0(OooO00o oooO00o) {
            oooO00o.f14971OooO00o = -1;
            oooO00o.f14972OooO0O0 = -1;
            oooO00o.f14973OooO0OO = Integer.MIN_VALUE;
            oooO00o.f14975OooO0o = false;
            oooO00o.f14977OooO0oO = false;
            if (FlexboxLayoutManager.this.OooO()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                int i = flexboxLayoutManager.f14940Oooo0oO;
                if (i == 0) {
                    oooO00o.f14976OooO0o0 = flexboxLayoutManager.f14939Oooo0o == 1;
                    return;
                } else {
                    oooO00o.f14976OooO0o0 = i == 2;
                    return;
                }
            }
            FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
            int i2 = flexboxLayoutManager2.f14940Oooo0oO;
            if (i2 == 0) {
                oooO00o.f14976OooO0o0 = flexboxLayoutManager2.f14939Oooo0o == 3;
            } else {
                oooO00o.f14976OooO0o0 = i2 == 2;
            }
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AnchorInfo{mPosition=");
            sbOooO0o0.append(this.f14971OooO00o);
            sbOooO0o0.append(", mFlexLinePosition=");
            sbOooO0o0.append(this.f14972OooO0O0);
            sbOooO0o0.append(", mCoordinate=");
            sbOooO0o0.append(this.f14973OooO0OO);
            sbOooO0o0.append(", mPerpendicularCoordinate=");
            sbOooO0o0.append(this.f14974OooO0Oo);
            sbOooO0o0.append(", mLayoutFromEnd=");
            sbOooO0o0.append(this.f14976OooO0o0);
            sbOooO0o0.append(", mValid=");
            sbOooO0o0.append(this.f14975OooO0o);
            sbOooO0o0.append(", mAssignedFromSavedState=");
            return Oooo0.OooO0O0(sbOooO0o0, this.f14977OooO0oO, '}');
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f14980OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f14981OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14982OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f14984OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f14986OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f14988OooOO0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f14987OooO0oo = 1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14979OooO = 1;

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LayoutState{mAvailable=");
            sbOooO0o0.append(this.f14980OooO00o);
            sbOooO0o0.append(", mFlexLinePosition=");
            sbOooO0o0.append(this.f14982OooO0OO);
            sbOooO0o0.append(", mPosition=");
            sbOooO0o0.append(this.f14983OooO0Oo);
            sbOooO0o0.append(", mOffset=");
            sbOooO0o0.append(this.f14985OooO0o0);
            sbOooO0o0.append(", mScrollingOffset=");
            sbOooO0o0.append(this.f14984OooO0o);
            sbOooO0o0.append(", mLastScrollDelta=");
            sbOooO0o0.append(this.f14986OooO0oO);
            sbOooO0o0.append(", mItemDirection=");
            sbOooO0o0.append(this.f14987OooO0oo);
            sbOooO0o0.append(", mLayoutDirection=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f14979OooO, '}');
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f14989Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f14990Oooo0oO;

        public static class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SavedState{mAnchorPosition=");
            sbOooO0o0.append(this.f14989Oooo0o);
            sbOooO0o0.append(", mAnchorOffset=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f14990Oooo0oO, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14989Oooo0o);
            parcel.writeInt(this.f14990Oooo0oO);
        }

        public SavedState(Parcel parcel) {
            this.f14989Oooo0o = parcel.readInt();
            this.f14990Oooo0oO = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f14989Oooo0o = savedState.f14989Oooo0o;
            this.f14990Oooo0oO = savedState.f14990Oooo0oO;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.Oooo000.OooO0o properties = RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f9029OooO00o;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f9031OooO0OO) {
                    OooOo(3);
                } else {
                    OooOo(2);
                }
            }
        } else if (properties.f9031OooO0OO) {
            OooOo(1);
        } else {
            OooOo(0);
        }
        int i4 = this.f14940Oooo0oO;
        if (i4 != 1) {
            if (i4 == 0) {
                removeAllViews();
                OooOO0O();
            }
            this.f14940Oooo0oO = 1;
            this.f14949OoooOo0 = null;
            this.f14950OoooOoO = null;
            requestLayout();
        }
        if (this.f14941Oooo0oo != 4) {
            removeAllViews();
            OooOO0O();
            this.f14941Oooo0oo = 4;
            requestLayout();
        }
        setAutoMeasureEnabled(true);
        this.f14958Oooooo0 = context;
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final boolean OooO() {
        int i = this.f14939Oooo0o;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO00o(View view, int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0) {
        calculateItemDecorationsForChild(view, f14937o0OoOo0);
        if (OooO()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            oooO0O0.f14997OooO0o0 += rightDecorationWidth;
            oooO0O0.f14996OooO0o += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        oooO0O0.f14997OooO0o0 += bottomDecorationHeight;
        oooO0O0.f14996OooO0o += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0O0(com.google.android.flexbox.OooO0O0 oooO0O0) {
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0OO(int i) {
        return OooO0o(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0Oo(int i, int i2, int i3) {
        return RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0o(int i) {
        View view = this.f14956OooooOo.get(i);
        return view != null ? view : this.f14946OoooOO0.OooO0o0(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0o0(int i, View view) {
        this.f14956OooooOo.put(i, view);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0oO(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (OooO()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0oo(int i, int i2, int i3) {
        return RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooOO0(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (OooO()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    public final void OooOO0O() {
        this.f14945OoooO0O.clear();
        OooO00o.OooO0O0(this.f14948OoooOOo);
        this.f14948OoooOOo.f14974OooO0Oo = 0;
    }

    public final void OooOO0o() {
        if (this.f14949OoooOo0 != null) {
            return;
        }
        if (OooO()) {
            if (this.f14940Oooo0oO == 0) {
                this.f14949OoooOo0 = new o0OO00O(this);
                this.f14950OoooOoO = new oo0o0Oo(this);
                return;
            } else {
                this.f14949OoooOo0 = new oo0o0Oo(this);
                this.f14950OoooOoO = new o0OO00O(this);
                return;
            }
        }
        if (this.f14940Oooo0oO == 0) {
            this.f14949OoooOo0 = new oo0o0Oo(this);
            this.f14950OoooOoO = new o0OO00O(this);
        } else {
            this.f14949OoooOo0 = new o0OO00O(this);
            this.f14950OoooOoO = new oo0o0Oo(this);
        }
    }

    public final View OooOOO(int i) {
        View viewOooOOoo = OooOOoo(0, getChildCount(), i);
        if (viewOooOOoo == null) {
            return null;
        }
        int i2 = this.f14942OoooO.f15011OooO0OO[getPosition(viewOooOOoo)];
        if (i2 == -1) {
            return null;
        }
        return OooOOOO(viewOooOOoo, this.f14945OoooO0O.get(i2));
    }

    public final int OooOOO0(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = oooO0O0.f14984OooO0o;
        if (i10 != Integer.MIN_VALUE) {
            int i11 = oooO0O0.f14980OooO00o;
            if (i11 < 0) {
                oooO0O0.f14984OooO0o = i10 + i11;
            }
            OooOo0O(o00ooo2, oooO0O0);
        }
        int i12 = oooO0O0.f14980OooO00o;
        boolean zOooO = OooO();
        int i13 = i12;
        int i14 = 0;
        while (true) {
            if (i13 <= 0 && !this.f14947OoooOOO.f14981OooO0O0) {
                break;
            }
            List<com.google.android.flexbox.OooO0O0> list = this.f14945OoooO0O;
            int i15 = oooO0O0.f14983OooO0Oo;
            if (!(i15 >= 0 && i15 < o0ooo0o2.OooO0O0() && (i9 = oooO0O0.f14982OooO0OO) >= 0 && i9 < list.size())) {
                break;
            }
            com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14945OoooO0O.get(oooO0O0.f14982OooO0OO);
            oooO0O0.f14983OooO0Oo = oooO0O1.f15005OooOOOO;
            if (OooO()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i16 = oooO0O0.f14985OooO0o0;
                if (oooO0O0.f14979OooO == -1) {
                    i16 -= oooO0O1.f14998OooO0oO;
                }
                int i17 = oooO0O0.f14983OooO0Oo;
                float f = width - paddingRight;
                float f2 = this.f14948OoooOOo.f14974OooO0Oo;
                float f3 = paddingLeft - f2;
                float leftDecorationWidth = f - f2;
                float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                int i18 = i17;
                int i19 = 0;
                for (int i20 = oooO0O1.f14999OooO0oo; i18 < i17 + i20; i20 = i20) {
                    View viewOooO0o = OooO0o(i18);
                    if (viewOooO0o == null) {
                        i18 = i18;
                    } else {
                        if (oooO0O0.f14979OooO == 1) {
                            calculateItemDecorationsForChild(viewOooO0o, f14937o0OoOo0);
                            addView(viewOooO0o);
                        } else {
                            calculateItemDecorationsForChild(viewOooO0o, f14937o0OoOo0);
                            addView(viewOooO0o, i19);
                            i19++;
                        }
                        int i21 = i19;
                        long j = this.f14942OoooO.f15012OooO0Oo[i18];
                        int i22 = (int) j;
                        int i23 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewOooO0o.getLayoutParams();
                        if (shouldMeasureChild(viewOooO0o, i22, i23, layoutParams)) {
                            viewOooO0o.measure(i22, i23);
                        }
                        float leftDecorationWidth2 = f3 + getLeftDecorationWidth(viewOooO0o) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(viewOooO0o) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(viewOooO0o) + i16;
                        if (this.f14944OoooO00) {
                            this.f14942OoooO.OooOo00(viewOooO0o, oooO0O1, Math.round(rightDecorationWidth) - viewOooO0o.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), viewOooO0o.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            this.f14942OoooO.OooOo00(viewOooO0o, oooO0O1, Math.round(leftDecorationWidth2), topDecorationHeight, viewOooO0o.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewOooO0o.getMeasuredHeight() + topDecorationHeight);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(viewOooO0o) + viewOooO0o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(viewOooO0o) + (viewOooO0o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                        f3 = rightDecorationWidth2;
                        i19 = i21;
                    }
                    i18++;
                    i17 = i17;
                    i12 = i12;
                }
                i = i12;
                oooO0O0.f14982OooO0OO += this.f14947OoooOOO.f14979OooO;
                i5 = oooO0O1.f14998OooO0oO;
                i3 = i13;
                i4 = i14;
            } else {
                i = i12;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i24 = oooO0O0.f14985OooO0o0;
                if (oooO0O0.f14979OooO == -1) {
                    int i25 = oooO0O1.f14998OooO0oO;
                    int i26 = i24 - i25;
                    i2 = i24 + i25;
                    i24 = i26;
                } else {
                    i2 = i24;
                }
                int i27 = oooO0O0.f14983OooO0Oo;
                float f4 = height - paddingBottom;
                float f5 = this.f14948OoooOOo.f14974OooO0Oo;
                float f6 = paddingTop - f5;
                float topDecorationHeight2 = f4 - f5;
                float fMax2 = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                int i28 = oooO0O1.f14999OooO0oo;
                int i29 = i27;
                int i30 = 0;
                while (i29 < i27 + i28) {
                    View viewOooO0o2 = OooO0o(i29);
                    if (viewOooO0o2 == null) {
                        i6 = i29;
                        i8 = i28;
                        i7 = i27;
                    } else {
                        int i31 = i28;
                        long j2 = this.f14942OoooO.f15012OooO0Oo[i29];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewOooO0o2.getLayoutParams();
                        if (shouldMeasureChild(viewOooO0o2, i32, i33, layoutParams2)) {
                            viewOooO0o2.measure(i32, i33);
                        }
                        float topDecorationHeight3 = f6 + getTopDecorationHeight(viewOooO0o2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float bottomDecorationHeight = topDecorationHeight2 - (getBottomDecorationHeight(viewOooO0o2) + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        if (oooO0O0.f14979OooO == 1) {
                            calculateItemDecorationsForChild(viewOooO0o2, f14937o0OoOo0);
                            addView(viewOooO0o2);
                        } else {
                            calculateItemDecorationsForChild(viewOooO0o2, f14937o0OoOo0);
                            addView(viewOooO0o2, i30);
                            i30++;
                        }
                        int i34 = i30;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewOooO0o2) + i24;
                        int rightDecorationWidth3 = i2 - getRightDecorationWidth(viewOooO0o2);
                        boolean z = this.f14944OoooO00;
                        if (!z) {
                            i6 = i29;
                            i7 = i27;
                            i8 = i31;
                            if (this.f14943OoooO0) {
                                this.f14942OoooO.OooOo0(viewOooO0o2, oooO0O1, z, leftDecorationWidth3, Math.round(bottomDecorationHeight) - viewOooO0o2.getMeasuredHeight(), viewOooO0o2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                this.f14942OoooO.OooOo0(viewOooO0o2, oooO0O1, z, leftDecorationWidth3, Math.round(topDecorationHeight3), viewOooO0o2.getMeasuredWidth() + leftDecorationWidth3, viewOooO0o2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (this.f14943OoooO0) {
                            i6 = i29;
                            i8 = i31;
                            i7 = i27;
                            this.f14942OoooO.OooOo0(viewOooO0o2, oooO0O1, z, rightDecorationWidth3 - viewOooO0o2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewOooO0o2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i6 = i29;
                            i7 = i27;
                            i8 = i31;
                            this.f14942OoooO.OooOo0(viewOooO0o2, oooO0O1, z, rightDecorationWidth3 - viewOooO0o2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewOooO0o2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(viewOooO0o2) + viewOooO0o2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight2 = bottomDecorationHeight - ((getTopDecorationHeight(viewOooO0o2) + (viewOooO0o2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin)) + fMax2);
                        f6 = bottomDecorationHeight2;
                        i30 = i34;
                    }
                    i29 = i6 + 1;
                    i28 = i8;
                    i13 = i13;
                    i14 = i14;
                    i27 = i7;
                }
                i3 = i13;
                i4 = i14;
                oooO0O0.f14982OooO0OO += this.f14947OoooOOO.f14979OooO;
                i5 = oooO0O1.f14998OooO0oO;
            }
            i14 = i4 + i5;
            if (zOooO || !this.f14944OoooO00) {
                oooO0O0.f14985OooO0o0 = (oooO0O1.f14998OooO0oO * oooO0O0.f14979OooO) + oooO0O0.f14985OooO0o0;
            } else {
                oooO0O0.f14985OooO0o0 -= oooO0O1.f14998OooO0oO * oooO0O0.f14979OooO;
            }
            i13 = i3 - oooO0O1.f14998OooO0oO;
            i12 = i;
        }
        int i35 = i12;
        int i36 = i14;
        int i37 = oooO0O0.f14980OooO00o - i36;
        oooO0O0.f14980OooO00o = i37;
        int i38 = oooO0O0.f14984OooO0o;
        if (i38 != Integer.MIN_VALUE) {
            int i39 = i38 + i36;
            oooO0O0.f14984OooO0o = i39;
            if (i37 < 0) {
                oooO0O0.f14984OooO0o = i39 + i37;
            }
            OooOo0O(o00ooo2, oooO0O0);
        }
        return i35 - oooO0O0.f14980OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View OooOOOO(View view, com.google.android.flexbox.OooO0O0 oooO0O0) {
        boolean zOooO = OooO();
        int i = oooO0O0.f14999OooO0oo;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f14944OoooO00 || zOooO) {
                    if (this.f14949OoooOo0.OooO0o0(view) > this.f14949OoooOo0.OooO0o0(childAt)) {
                        view = childAt;
                    }
                } else if (this.f14949OoooOo0.OooO0O0(view) < this.f14949OoooOo0.OooO0O0(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View OooOOOo(int i) {
        View viewOooOOoo = OooOOoo(getChildCount() - 1, -1, i);
        if (viewOooOOoo == null) {
            return null;
        }
        return OooOOo0(viewOooOOoo, this.f14945OoooO0O.get(this.f14942OoooO.f15011OooO0OO[getPosition(viewOooOOoo)]));
    }

    public final View OooOOo(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z = false;
            boolean z2 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z3 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z2 && z3) {
                z = true;
            }
            if (z) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View OooOOo0(View view, com.google.android.flexbox.OooO0O0 oooO0O0) {
        boolean zOooO = OooO();
        int childCount = (getChildCount() - oooO0O0.f14999OooO0oo) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f14944OoooO00 || zOooO) {
                    if (this.f14949OoooOo0.OooO0O0(view) < this.f14949OoooOo0.OooO0O0(childAt)) {
                        view = childAt;
                    }
                } else if (this.f14949OoooOo0.OooO0o0(view) > this.f14949OoooOo0.OooO0o0(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View OooOOoo(int i, int i2, int i3) {
        OooOO0o();
        if (this.f14947OoooOOO == null) {
            this.f14947OoooOOO = new OooO0O0();
        }
        int iOooOO0O = this.f14949OoooOo0.OooOO0O();
        int iOooO0oO = this.f14949OoooOo0.OooO0oO();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO0OO()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f14949OoooOo0.OooO0o0(childAt) >= iOooOO0O && this.f14949OoooOo0.OooO0O0(childAt) <= iOooO0oO) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final void OooOo(int i) {
        if (this.f14939Oooo0o != i) {
            removeAllViews();
            this.f14939Oooo0o = i;
            this.f14949OoooOo0 = null;
            this.f14950OoooOoO = null;
            OooOO0O();
            requestLayout();
        }
    }

    public final int OooOo0(int i) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOO0o();
        boolean zOooO = OooO();
        View view = this.f14957Oooooo;
        int width = zOooO ? view.getWidth() : view.getHeight();
        int width2 = zOooO ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.f14948OoooOOo.f14974OooO0Oo) - width, iAbs);
            }
            i2 = this.f14948OoooOOo.f14974OooO0Oo;
            if (i2 + i <= 0) {
                return i;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.f14948OoooOOo.f14974OooO0Oo) - width, i);
            }
            i2 = this.f14948OoooOOo.f14974OooO0Oo;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    public final int OooOo00(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOO0o();
        this.f14947OoooOOO.f14988OooOO0 = true;
        boolean z = !OooO() && this.f14944OoooO00;
        int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
        int iAbs = Math.abs(i);
        this.f14947OoooOOO.f14979OooO = i3;
        boolean zOooO = OooO();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !zOooO && this.f14944OoooO00;
        if (i3 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f14947OoooOOO.f14985OooO0o0 = this.f14949OoooOo0.OooO0O0(childAt);
            int position = getPosition(childAt);
            View viewOooOOo0 = OooOOo0(childAt, this.f14945OoooO0O.get(this.f14942OoooO.f15011OooO0OO[position]));
            OooO0O0 oooO0O0 = this.f14947OoooOOO;
            oooO0O0.f14987OooO0oo = 1;
            int i4 = position + 1;
            oooO0O0.f14983OooO0Oo = i4;
            int[] iArr = this.f14942OoooO.f15011OooO0OO;
            if (iArr.length <= i4) {
                oooO0O0.f14982OooO0OO = -1;
            } else {
                oooO0O0.f14982OooO0OO = iArr[i4];
            }
            if (z2) {
                oooO0O0.f14985OooO0o0 = this.f14949OoooOo0.OooO0o0(viewOooOOo0);
                this.f14947OoooOOO.f14984OooO0o = this.f14949OoooOo0.OooOO0O() + (-this.f14949OoooOo0.OooO0o0(viewOooOOo0));
                OooO0O0 oooO0O1 = this.f14947OoooOOO;
                int i5 = oooO0O1.f14984OooO0o;
                if (i5 < 0) {
                    i5 = 0;
                }
                oooO0O1.f14984OooO0o = i5;
            } else {
                oooO0O0.f14985OooO0o0 = this.f14949OoooOo0.OooO0O0(viewOooOOo0);
                this.f14947OoooOOO.f14984OooO0o = this.f14949OoooOo0.OooO0O0(viewOooOOo0) - this.f14949OoooOo0.OooO0oO();
            }
            int i6 = this.f14947OoooOOO.f14982OooO0OO;
            if ((i6 == -1 || i6 > this.f14945OoooO0O.size() - 1) && this.f14947OoooOOO.f14983OooO0Oo <= getFlexItemCount()) {
                int i7 = iAbs - this.f14947OoooOOO.f14984OooO0o;
                this.f14960Ooooooo.OooO00o();
                if (i7 > 0) {
                    if (zOooO) {
                        this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec, iMakeMeasureSpec2, i7, this.f14947OoooOOO.f14983OooO0Oo, -1, this.f14945OoooO0O);
                    } else {
                        this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec2, iMakeMeasureSpec, i7, this.f14947OoooOOO.f14983OooO0Oo, -1, this.f14945OoooO0O);
                    }
                    this.f14942OoooO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, this.f14947OoooOOO.f14983OooO0Oo);
                    this.f14942OoooO.OooOoO(this.f14947OoooOOO.f14983OooO0Oo);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f14947OoooOOO.f14985OooO0o0 = this.f14949OoooOo0.OooO0o0(childAt2);
            int position2 = getPosition(childAt2);
            View viewOooOOOO = OooOOOO(childAt2, this.f14945OoooO0O.get(this.f14942OoooO.f15011OooO0OO[position2]));
            OooO0O0 oooO0O2 = this.f14947OoooOOO;
            oooO0O2.f14987OooO0oo = 1;
            int i8 = this.f14942OoooO.f15011OooO0OO[position2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.f14947OoooOOO.f14983OooO0Oo = position2 - this.f14945OoooO0O.get(i8 - 1).f14999OooO0oo;
            } else {
                oooO0O2.f14983OooO0Oo = -1;
            }
            OooO0O0 oooO0O3 = this.f14947OoooOOO;
            oooO0O3.f14982OooO0OO = i8 > 0 ? i8 - 1 : 0;
            if (z2) {
                oooO0O3.f14985OooO0o0 = this.f14949OoooOo0.OooO0O0(viewOooOOOO);
                this.f14947OoooOOO.f14984OooO0o = this.f14949OoooOo0.OooO0O0(viewOooOOOO) - this.f14949OoooOo0.OooO0oO();
                OooO0O0 oooO0O4 = this.f14947OoooOOO;
                int i9 = oooO0O4.f14984OooO0o;
                if (i9 < 0) {
                    i9 = 0;
                }
                oooO0O4.f14984OooO0o = i9;
            } else {
                oooO0O3.f14985OooO0o0 = this.f14949OoooOo0.OooO0o0(viewOooOOOO);
                this.f14947OoooOOO.f14984OooO0o = this.f14949OoooOo0.OooOO0O() + (-this.f14949OoooOo0.OooO0o0(viewOooOOOO));
            }
        }
        OooO0O0 oooO0O5 = this.f14947OoooOOO;
        int i10 = oooO0O5.f14984OooO0o;
        oooO0O5.f14980OooO00o = iAbs - i10;
        int iOooOOO0 = OooOOO0(o00ooo2, o0ooo0o2, oooO0O5) + i10;
        if (iOooOOO0 < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iOooOOO0) {
                i2 = (-i3) * iOooOOO0;
            } else {
                i2 = i;
            }
        } else if (iAbs > iOooOOO0) {
            i2 = i3 * iOooOOO0;
        } else {
            i2 = i;
        }
        this.f14949OoooOo0.OooOOOo(-i2);
        this.f14947OoooOOO.f14986OooO0oO = i2;
        return i2;
    }

    public final void OooOo0O(RecyclerView.o00Ooo o00ooo2, OooO0O0 oooO0O0) {
        int childCount;
        if (oooO0O0.f14988OooOO0) {
            int i = -1;
            if (oooO0O0.f14979OooO != -1) {
                if (oooO0O0.f14984OooO0o >= 0 && (childCount = getChildCount()) != 0) {
                    int i2 = this.f14942OoooO.f15011OooO0OO[getPosition(getChildAt(0))];
                    if (i2 == -1) {
                        return;
                    }
                    com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14945OoooO0O.get(i2);
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        int i4 = oooO0O0.f14984OooO0o;
                        if (!(OooO() || !this.f14944OoooO00 ? this.f14949OoooOo0.OooO0O0(childAt) <= i4 : this.f14949OoooOo0.OooO0o() - this.f14949OoooOo0.OooO0o0(childAt) <= i4)) {
                            break;
                        }
                        if (oooO0O1.f15006OooOOOo == getPosition(childAt)) {
                            if (i2 >= this.f14945OoooO0O.size() - 1) {
                                i = i3;
                                break;
                            } else {
                                i2 += oooO0O0.f14979OooO;
                                oooO0O1 = this.f14945OoooO0O.get(i2);
                                i = i3;
                            }
                        }
                    }
                    while (i >= 0) {
                        removeAndRecycleViewAt(i, o00ooo2);
                        i--;
                    }
                    return;
                }
                return;
            }
            if (oooO0O0.f14984OooO0o < 0) {
                return;
            }
            this.f14949OoooOo0.OooO0o();
            int childCount2 = getChildCount();
            if (childCount2 == 0) {
                return;
            }
            int i5 = childCount2 - 1;
            int i6 = this.f14942OoooO.f15011OooO0OO[getPosition(getChildAt(i5))];
            if (i6 == -1) {
                return;
            }
            com.google.android.flexbox.OooO0O0 oooO0O2 = this.f14945OoooO0O.get(i6);
            for (int i7 = i5; i7 >= 0; i7--) {
                View childAt2 = getChildAt(i7);
                int i8 = oooO0O0.f14984OooO0o;
                if (!(OooO() || !this.f14944OoooO00 ? this.f14949OoooOo0.OooO0o0(childAt2) >= this.f14949OoooOo0.OooO0o() - i8 : this.f14949OoooOo0.OooO0O0(childAt2) <= i8)) {
                    break;
                }
                if (oooO0O2.f15005OooOOOO == getPosition(childAt2)) {
                    if (i6 <= 0) {
                        childCount2 = i7;
                        break;
                    } else {
                        i6 += oooO0O0.f14979OooO;
                        oooO0O2 = this.f14945OoooO0O.get(i6);
                        childCount2 = i7;
                    }
                }
            }
            while (i5 >= childCount2) {
                removeAndRecycleViewAt(i5, o00ooo2);
                i5--;
            }
        }
    }

    public final void OooOo0o() {
        int heightMode = OooO() ? getHeightMode() : getWidthMode();
        this.f14947OoooOOO.f14981OooO0O0 = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void OooOoO(OooO00o oooO00o, boolean z, boolean z2) {
        int i;
        if (z2) {
            OooOo0o();
        } else {
            this.f14947OoooOOO.f14981OooO0O0 = false;
        }
        if (OooO() || !this.f14944OoooO00) {
            this.f14947OoooOOO.f14980OooO00o = this.f14949OoooOo0.OooO0oO() - oooO00o.f14973OooO0OO;
        } else {
            this.f14947OoooOOO.f14980OooO00o = oooO00o.f14973OooO0OO - getPaddingRight();
        }
        OooO0O0 oooO0O0 = this.f14947OoooOOO;
        oooO0O0.f14983OooO0Oo = oooO00o.f14971OooO00o;
        oooO0O0.f14987OooO0oo = 1;
        oooO0O0.f14979OooO = 1;
        oooO0O0.f14985OooO0o0 = oooO00o.f14973OooO0OO;
        oooO0O0.f14984OooO0o = Integer.MIN_VALUE;
        oooO0O0.f14982OooO0OO = oooO00o.f14972OooO0O0;
        if (!z || this.f14945OoooO0O.size() <= 1 || (i = oooO00o.f14972OooO0O0) < 0 || i >= this.f14945OoooO0O.size() - 1) {
            return;
        }
        com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14945OoooO0O.get(oooO00o.f14972OooO0O0);
        OooO0O0 oooO0O2 = this.f14947OoooOOO;
        oooO0O2.f14982OooO0OO++;
        oooO0O2.f14983OooO0Oo += oooO0O1.f14999OooO0oo;
    }

    public final void OooOoO0(int i) {
        View viewOooOOo = OooOOo(getChildCount() - 1, -1);
        if (i >= (viewOooOOo != null ? getPosition(viewOooOOo) : -1)) {
            return;
        }
        int childCount = getChildCount();
        this.f14942OoooO.OooOO0(childCount);
        this.f14942OoooO.OooOO0O(childCount);
        this.f14942OoooO.OooO(childCount);
        if (i >= this.f14942OoooO.f15011OooO0OO.length) {
            return;
        }
        this.f14959OoooooO = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f14952Ooooo00 = getPosition(childAt);
        if (OooO() || !this.f14944OoooO00) {
            this.f14953Ooooo0o = this.f14949OoooOo0.OooO0o0(childAt) - this.f14949OoooOo0.OooOO0O();
        } else {
            this.f14953Ooooo0o = this.f14949OoooOo0.OooO0oo() + this.f14949OoooOo0.OooO0O0(childAt);
        }
    }

    public final void OooOoOO(OooO00o oooO00o, boolean z, boolean z2) {
        if (z2) {
            OooOo0o();
        } else {
            this.f14947OoooOOO.f14981OooO0O0 = false;
        }
        if (OooO() || !this.f14944OoooO00) {
            this.f14947OoooOOO.f14980OooO00o = oooO00o.f14973OooO0OO - this.f14949OoooOo0.OooOO0O();
        } else {
            this.f14947OoooOOO.f14980OooO00o = (this.f14957Oooooo.getWidth() - oooO00o.f14973OooO0OO) - this.f14949OoooOo0.OooOO0O();
        }
        OooO0O0 oooO0O0 = this.f14947OoooOOO;
        oooO0O0.f14983OooO0Oo = oooO00o.f14971OooO00o;
        oooO0O0.f14987OooO0oo = 1;
        oooO0O0.f14979OooO = -1;
        oooO0O0.f14985OooO0o0 = oooO00o.f14973OooO0OO;
        oooO0O0.f14984OooO0o = Integer.MIN_VALUE;
        int i = oooO00o.f14972OooO0O0;
        oooO0O0.f14982OooO0OO = i;
        if (!z || i <= 0) {
            return;
        }
        int size = this.f14945OoooO0O.size();
        int i2 = oooO00o.f14972OooO0O0;
        if (size > i2) {
            com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14945OoooO0O.get(i2);
            OooO0O0 oooO0O2 = this.f14947OoooOOO;
            oooO0O2.f14982OooO0OO--;
            oooO0O2.f14983OooO0Oo -= oooO0O1.f14999OooO0oo;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollHorizontally() {
        if (this.f14940Oooo0oO == 0) {
            return OooO();
        }
        if (OooO()) {
            int width = getWidth();
            View view = this.f14957Oooooo;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollVertically() {
        if (this.f14940Oooo0oO == 0) {
            return !OooO();
        }
        if (OooO()) {
            return true;
        }
        int height = getHeight();
        View view = this.f14957Oooooo;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeHorizontalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    public final int computeScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        OooOO0o();
        View viewOooOOO = OooOOO(iOooO0O0);
        View viewOooOOOo = OooOOOo(iOooO0O0);
        if (o0ooo0o2.OooO0O0() == 0 || viewOooOOO == null || viewOooOOOo == null) {
            return 0;
        }
        return Math.min(this.f14949OoooOo0.OooOO0o(), this.f14949OoooOo0.OooO0O0(viewOooOOOo) - this.f14949OoooOo0.OooO0o0(viewOooOOO));
    }

    public final int computeScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        View viewOooOOO = OooOOO(iOooO0O0);
        View viewOooOOOo = OooOOOo(iOooO0O0);
        if (o0ooo0o2.OooO0O0() != 0 && viewOooOOO != null && viewOooOOOo != null) {
            int position = getPosition(viewOooOOO);
            int position2 = getPosition(viewOooOOOo);
            int iAbs = Math.abs(this.f14949OoooOo0.OooO0O0(viewOooOOOo) - this.f14949OoooOo0.OooO0o0(viewOooOOO));
            int[] iArr = this.f14942OoooO.f15011OooO0OO;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.f14949OoooOo0.OooOO0O() - this.f14949OoooOo0.OooO0o0(viewOooOOO)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        View viewOooOOO = OooOOO(iOooO0O0);
        View viewOooOOOo = OooOOOo(iOooO0O0);
        if (o0ooo0o2.OooO0O0() == 0 || viewOooOOO == null || viewOooOOOo == null) {
            return 0;
        }
        View viewOooOOo = OooOOo(0, getChildCount());
        int position = viewOooOOo == null ? -1 : getPosition(viewOooOOo);
        View viewOooOOo2 = OooOOo(getChildCount() - 1, -1);
        return (int) ((Math.abs(this.f14949OoooOo0.OooO0O0(viewOooOOOo) - this.f14949OoooOo0.OooO0o0(viewOooOOO)) / (((viewOooOOo2 != null ? getPosition(viewOooOOo2) : -1) - position) + 1)) * o0ooo0o2.OooO0O0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo.OooO0O0
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        return OooO() ? new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i2) : new PointF(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int computeVerticalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    public final int fixLayoutEndGap(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooOo00;
        int iOooO0oO;
        if (!OooO() && this.f14944OoooO00) {
            int iOooOO0O = i - this.f14949OoooOo0.OooOO0O();
            if (iOooOO0O <= 0) {
                return 0;
            }
            iOooOo00 = OooOo00(iOooOO0O, o00ooo2, o0ooo0o2);
        } else {
            int iOooO0oO2 = this.f14949OoooOo0.OooO0oO() - i;
            if (iOooO0oO2 <= 0) {
                return 0;
            }
            iOooOo00 = -OooOo00(-iOooO0oO2, o00ooo2, o0ooo0o2);
        }
        int i2 = i + iOooOo00;
        if (!z || (iOooO0oO = this.f14949OoooOo0.OooO0oO() - i2) <= 0) {
            return iOooOo00;
        }
        this.f14949OoooOo0.OooOOOo(iOooO0oO);
        return iOooO0oO + iOooOo00;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooOo00;
        int iOooOO0O;
        if (OooO() || !this.f14944OoooO00) {
            int iOooOO0O2 = i - this.f14949OoooOo0.OooOO0O();
            if (iOooOO0O2 <= 0) {
                return 0;
            }
            iOooOo00 = -OooOo00(iOooOO0O2, o00ooo2, o0ooo0o2);
        } else {
            int iOooO0oO = this.f14949OoooOo0.OooO0oO() - i;
            if (iOooO0oO <= 0) {
                return 0;
            }
            iOooOo00 = OooOo00(-iOooO0oO, o00ooo2, o0ooo0o2);
        }
        int i2 = i + iOooOo00;
        if (!z || (iOooOO0O = i2 - this.f14949OoooOo0.OooOO0O()) <= 0) {
            return iOooOo00;
        }
        this.f14949OoooOo0.OooOOOo(-iOooOO0O);
        return iOooOo00 - iOooOO0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getAlignItems() {
        return this.f14941Oooo0oo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexDirection() {
        return this.f14939Oooo0o;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexItemCount() {
        return this.f14961o000oOoO.OooO0O0();
    }

    @Override // com.google.android.flexbox.OooO00o
    public final List<com.google.android.flexbox.OooO0O0> getFlexLinesInternal() {
        return this.f14945OoooO0O;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexWrap() {
        return this.f14940Oooo0oO;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getLargestMainSize() {
        if (this.f14945OoooO0O.size() == 0) {
            return 0;
        }
        int iMax = Integer.MIN_VALUE;
        int size = this.f14945OoooO0O.size();
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.f14945OoooO0O.get(i).f14997OooO0o0);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getMaxLine() {
        return this.f14938Oooo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getSumOfCrossSize() {
        int size = this.f14945OoooO0O.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f14945OoooO0O.get(i2).f14998OooO0oO;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f14957Oooooo = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo2) {
        super.onDetachedFromWindow(recyclerView, o00ooo2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        OooOoO0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        OooOoO0(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        OooOoO0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        OooOoO0(i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0185  */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0289  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135  */
    /* JADX WARN: Code duplicated, block: B:91:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x014f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0153  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0170  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        boolean z;
        boolean z2;
        int i;
        View viewFindViewByPosition;
        boolean z3;
        int iOooO0o0;
        boolean z4;
        int i2;
        int i3;
        int i4;
        this.f14946OoooOO0 = o00ooo2;
        this.f14961o000oOoO = o0ooo0o2;
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        if (iOooO0O0 == 0 && o0ooo0o2.f9063OooO0oO) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i5 = this.f14939Oooo0o;
        if (i5 == 0) {
            this.f14944OoooO00 = layoutDirection == 1;
            this.f14943OoooO0 = this.f14940Oooo0oO == 2;
        } else if (i5 == 1) {
            this.f14944OoooO00 = layoutDirection != 1;
            this.f14943OoooO0 = this.f14940Oooo0oO == 2;
        } else if (i5 == 2) {
            boolean z5 = layoutDirection == 1;
            this.f14944OoooO00 = z5;
            if (this.f14940Oooo0oO == 2) {
                this.f14944OoooO00 = !z5;
            }
            this.f14943OoooO0 = false;
        } else if (i5 != 3) {
            this.f14944OoooO00 = false;
            this.f14943OoooO0 = false;
        } else {
            boolean z6 = layoutDirection == 1;
            this.f14944OoooO00 = z6;
            if (this.f14940Oooo0oO == 2) {
                this.f14944OoooO00 = !z6;
            }
            this.f14943OoooO0 = true;
        }
        OooOO0o();
        if (this.f14947OoooOOO == null) {
            this.f14947OoooOOO = new OooO0O0();
        }
        this.f14942OoooO.OooOO0(iOooO0O0);
        this.f14942OoooO.OooOO0O(iOooO0O0);
        this.f14942OoooO.OooO(iOooO0O0);
        this.f14947OoooOOO.f14988OooOO0 = false;
        SavedState savedState = this.f14951OoooOoo;
        if (savedState != null) {
            int i6 = savedState.f14989Oooo0o;
            if (i6 >= 0 && i6 < iOooO0O0) {
                this.f14952Ooooo00 = i6;
            }
        }
        OooO00o oooO00o = this.f14948OoooOOo;
        if (!oooO00o.f14975OooO0o || this.f14952Ooooo00 != -1 || savedState != null) {
            OooO00o.OooO0O0(oooO00o);
            OooO00o oooO00o2 = this.f14948OoooOOo;
            SavedState savedState2 = this.f14951OoooOoo;
            if (o0ooo0o2.f9063OooO0oO || (i = this.f14952Ooooo00) == -1) {
                z = false;
            } else if (i < 0 || i >= o0ooo0o2.OooO0O0()) {
                this.f14952Ooooo00 = -1;
                this.f14953Ooooo0o = Integer.MIN_VALUE;
                z = false;
            } else {
                int i7 = this.f14952Ooooo00;
                oooO00o2.f14971OooO00o = i7;
                oooO00o2.f14972OooO0O0 = this.f14942OoooO.f15011OooO0OO[i7];
                SavedState savedState3 = this.f14951OoooOoo;
                if (savedState3 != null) {
                    int iOooO0O1 = o0ooo0o2.OooO0O0();
                    int i8 = savedState3.f14989Oooo0o;
                    if (i8 >= 0 && i8 < iOooO0O1) {
                        oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O() + savedState2.f14990Oooo0oO;
                        oooO00o2.f14977OooO0oO = true;
                        oooO00o2.f14972OooO0O0 = -1;
                    } else if (this.f14953Ooooo0o == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.f14952Ooooo00);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0) {
                                if (this.f14952Ooooo00 < getPosition(getChildAt(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                oooO00o2.f14976OooO0o0 = z3;
                            }
                            OooO00o.OooO00o(oooO00o2);
                        } else if (this.f14949OoooOo0.OooO0OO(viewFindViewByPosition) > this.f14949OoooOo0.OooOO0o()) {
                            OooO00o.OooO00o(oooO00o2);
                        } else if (this.f14949OoooOo0.OooO0o0(viewFindViewByPosition) - this.f14949OoooOo0.OooOO0O() < 0) {
                            oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O();
                            oooO00o2.f14976OooO0o0 = false;
                        } else if (this.f14949OoooOo0.OooO0oO() - this.f14949OoooOo0.OooO0O0(viewFindViewByPosition) < 0) {
                            oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooO0oO();
                            oooO00o2.f14976OooO0o0 = true;
                        } else {
                            if (oooO00o2.f14976OooO0o0) {
                                iOooO0o0 = this.f14949OoooOo0.OooOOO0() + this.f14949OoooOo0.OooO0O0(viewFindViewByPosition);
                            } else {
                                iOooO0o0 = this.f14949OoooOo0.OooO0o0(viewFindViewByPosition);
                            }
                            oooO00o2.f14973OooO0OO = iOooO0o0;
                        }
                    } else if (OooO() && this.f14944OoooO00) {
                        oooO00o2.f14973OooO0OO = this.f14953Ooooo0o - this.f14949OoooOo0.OooO0oo();
                    } else {
                        oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O() + this.f14953Ooooo0o;
                    }
                } else if (this.f14953Ooooo0o == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.f14952Ooooo00);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.f14952Ooooo00 < getPosition(getChildAt(0))) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            oooO00o2.f14976OooO0o0 = z3;
                        }
                        OooO00o.OooO00o(oooO00o2);
                    } else if (this.f14949OoooOo0.OooO0OO(viewFindViewByPosition) > this.f14949OoooOo0.OooOO0o()) {
                        OooO00o.OooO00o(oooO00o2);
                    } else if (this.f14949OoooOo0.OooO0o0(viewFindViewByPosition) - this.f14949OoooOo0.OooOO0O() < 0) {
                        oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O();
                        oooO00o2.f14976OooO0o0 = false;
                    } else if (this.f14949OoooOo0.OooO0oO() - this.f14949OoooOo0.OooO0O0(viewFindViewByPosition) < 0) {
                        oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooO0oO();
                        oooO00o2.f14976OooO0o0 = true;
                    } else {
                        if (oooO00o2.f14976OooO0o0) {
                            iOooO0o0 = this.f14949OoooOo0.OooOOO0() + this.f14949OoooOo0.OooO0O0(viewFindViewByPosition);
                        } else {
                            iOooO0o0 = this.f14949OoooOo0.OooO0o0(viewFindViewByPosition);
                        }
                        oooO00o2.f14973OooO0OO = iOooO0o0;
                    }
                } else if (OooO()) {
                    oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O() + this.f14953Ooooo0o;
                } else {
                    oooO00o2.f14973OooO0OO = this.f14949OoooOo0.OooOO0O() + this.f14953Ooooo0o;
                }
                z = true;
            }
            if (!z) {
                if (getChildCount() != 0) {
                    View viewOooOOOo = oooO00o2.f14976OooO0o0 ? OooOOOo(o0ooo0o2.OooO0O0()) : OooOOO(o0ooo0o2.OooO0O0());
                    if (viewOooOOOo != null) {
                        FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                        o0O0O00 o0o0o00 = flexboxLayoutManager.f14940Oooo0oO == 0 ? flexboxLayoutManager.f14950OoooOoO : flexboxLayoutManager.f14949OoooOo0;
                        if (flexboxLayoutManager.OooO() || !FlexboxLayoutManager.this.f14944OoooO00) {
                            if (oooO00o2.f14976OooO0o0) {
                                oooO00o2.f14973OooO0OO = o0o0o00.OooOOO0() + o0o0o00.OooO0O0(viewOooOOOo);
                            } else {
                                oooO00o2.f14973OooO0OO = o0o0o00.OooO0o0(viewOooOOOo);
                            }
                        } else if (oooO00o2.f14976OooO0o0) {
                            oooO00o2.f14973OooO0OO = o0o0o00.OooOOO0() + o0o0o00.OooO0o0(viewOooOOOo);
                        } else {
                            oooO00o2.f14973OooO0OO = o0o0o00.OooO0O0(viewOooOOOo);
                        }
                        int position = FlexboxLayoutManager.this.getPosition(viewOooOOOo);
                        oooO00o2.f14971OooO00o = position;
                        oooO00o2.f14977OooO0oO = false;
                        FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
                        int[] iArr = flexboxLayoutManager2.f14942OoooO.f15011OooO0OO;
                        if (position == -1) {
                            position = 0;
                        }
                        int i9 = iArr[position];
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        oooO00o2.f14972OooO0O0 = i9;
                        int size = flexboxLayoutManager2.f14945OoooO0O.size();
                        int i10 = oooO00o2.f14972OooO0O0;
                        if (size > i10) {
                            oooO00o2.f14971OooO00o = FlexboxLayoutManager.this.f14945OoooO0O.get(i10).f15005OooOOOO;
                        }
                        if (!o0ooo0o2.f9063OooO0oO && supportsPredictiveItemAnimations()) {
                            if (this.f14949OoooOo0.OooO0o0(viewOooOOOo) >= this.f14949OoooOo0.OooO0oO() || this.f14949OoooOo0.OooO0O0(viewOooOOOo) < this.f14949OoooOo0.OooOO0O()) {
                                oooO00o2.f14973OooO0OO = oooO00o2.f14976OooO0o0 ? this.f14949OoooOo0.OooO0oO() : this.f14949OoooOo0.OooOO0O();
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    OooO00o.OooO00o(oooO00o2);
                    oooO00o2.f14971OooO00o = 0;
                    oooO00o2.f14972OooO0O0 = 0;
                }
            }
            this.f14948OoooOOo.f14975OooO0o = true;
        }
        detachAndScrapAttachedViews(o00ooo2);
        OooO00o oooO00o3 = this.f14948OoooOOo;
        if (oooO00o3.f14976OooO0o0) {
            OooOoOO(oooO00o3, false, true);
        } else {
            OooOoO(oooO00o3, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (OooO()) {
            int i11 = this.f14954OooooO0;
            z4 = (i11 == Integer.MIN_VALUE || i11 == width) ? false : true;
            OooO0O0 oooO0O0 = this.f14947OoooOOO;
            i2 = oooO0O0.f14981OooO0O0 ? this.f14958Oooooo0.getResources().getDisplayMetrics().heightPixels : oooO0O0.f14980OooO00o;
        } else {
            int i12 = this.f14955OooooOO;
            z4 = (i12 == Integer.MIN_VALUE || i12 == height) ? false : true;
            OooO0O0 oooO0O1 = this.f14947OoooOOO;
            i2 = oooO0O1.f14981OooO0O0 ? this.f14958Oooooo0.getResources().getDisplayMetrics().widthPixels : oooO0O1.f14980OooO00o;
        }
        int i13 = i2;
        this.f14954OooooO0 = width;
        this.f14955OooooOO = height;
        int i14 = this.f14959OoooooO;
        if (i14 != -1 || (this.f14952Ooooo00 == -1 && !z4)) {
            int iMin = i14 != -1 ? Math.min(i14, this.f14948OoooOOo.f14971OooO00o) : this.f14948OoooOOo.f14971OooO00o;
            this.f14960Ooooooo.OooO00o();
            if (OooO()) {
                if (this.f14945OoooO0O.size() > 0) {
                    this.f14942OoooO.OooO0Oo(this.f14945OoooO0O, iMin);
                    this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec, iMakeMeasureSpec2, i13, iMin, this.f14948OoooOOo.f14971OooO00o, this.f14945OoooO0O);
                } else {
                    this.f14942OoooO.OooO(iOooO0O0);
                    this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec, iMakeMeasureSpec2, i13, 0, -1, this.f14945OoooO0O);
                }
            } else if (this.f14945OoooO0O.size() > 0) {
                this.f14942OoooO.OooO0Oo(this.f14945OoooO0O, iMin);
                this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec2, iMakeMeasureSpec, i13, iMin, this.f14948OoooOOo.f14971OooO00o, this.f14945OoooO0O);
            } else {
                this.f14942OoooO.OooO(iOooO0O0);
                this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec2, iMakeMeasureSpec, i13, 0, -1, this.f14945OoooO0O);
            }
            this.f14945OoooO0O = this.f14960Ooooooo.f15014OooO00o;
            this.f14942OoooO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            this.f14942OoooO.OooOoO(iMin);
        } else if (!this.f14948OoooOOo.f14976OooO0o0) {
            this.f14945OoooO0O.clear();
            this.f14960Ooooooo.OooO00o();
            if (OooO()) {
                this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec, iMakeMeasureSpec2, i13, 0, this.f14948OoooOOo.f14971OooO00o, this.f14945OoooO0O);
            } else {
                this.f14942OoooO.OooO0O0(this.f14960Ooooooo, iMakeMeasureSpec2, iMakeMeasureSpec, i13, 0, this.f14948OoooOOo.f14971OooO00o, this.f14945OoooO0O);
            }
            this.f14945OoooO0O = this.f14960Ooooooo.f15014OooO00o;
            this.f14942OoooO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            this.f14942OoooO.OooOoO(0);
            OooO00o oooO00o4 = this.f14948OoooOOo;
            int i15 = this.f14942OoooO.f15011OooO0OO[oooO00o4.f14971OooO00o];
            oooO00o4.f14972OooO0O0 = i15;
            this.f14947OoooOOO.f14982OooO0OO = i15;
        }
        if (this.f14948OoooOOo.f14976OooO0o0) {
            OooOOO0(o00ooo2, o0ooo0o2, this.f14947OoooOOO);
            i4 = this.f14947OoooOOO.f14985OooO0o0;
            OooOoO(this.f14948OoooOOo, true, false);
            OooOOO0(o00ooo2, o0ooo0o2, this.f14947OoooOOO);
            i3 = this.f14947OoooOOO.f14985OooO0o0;
        } else {
            OooOOO0(o00ooo2, o0ooo0o2, this.f14947OoooOOO);
            i3 = this.f14947OoooOOO.f14985OooO0o0;
            OooOoOO(this.f14948OoooOOo, true, false);
            OooOOO0(o00ooo2, o0ooo0o2, this.f14947OoooOOO);
            i4 = this.f14947OoooOOO.f14985OooO0o0;
        }
        if (getChildCount() > 0) {
            if (this.f14948OoooOOo.f14976OooO0o0) {
                fixLayoutStartGap(fixLayoutEndGap(i3, o00ooo2, o0ooo0o2, true) + i4, o00ooo2, o0ooo0o2, false);
            } else {
                fixLayoutEndGap(fixLayoutStartGap(i4, o00ooo2, o0ooo0o2, true) + i3, o00ooo2, o0ooo0o2, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.f14951OoooOoo = null;
        this.f14952Ooooo00 = -1;
        this.f14953Ooooo0o = Integer.MIN_VALUE;
        this.f14959OoooooO = -1;
        OooO00o.OooO0O0(this.f14948OoooOOo);
        this.f14956OooooOo.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f14951OoooOoo = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f14951OoooOoo;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f14989Oooo0o = getPosition(childAt);
            savedState2.f14990Oooo0oO = this.f14949OoooOo0.OooO0o0(childAt) - this.f14949OoooOo0.OooOO0O();
        } else {
            savedState2.f14989Oooo0o = -1;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!OooO() || (this.f14940Oooo0oO == 0 && OooO())) {
            int iOooOo00 = OooOo00(i, o00ooo2, o0ooo0o2);
            this.f14956OooooOo.clear();
            return iOooOo00;
        }
        int iOooOo0 = OooOo0(i);
        this.f14948OoooOOo.f14974OooO0Oo += iOooOo0;
        this.f14950OoooOoO.OooOOOo(-iOooOo0);
        return iOooOo0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void scrollToPosition(int i) {
        this.f14952Ooooo00 = i;
        this.f14953Ooooo0o = Integer.MIN_VALUE;
        SavedState savedState = this.f14951OoooOoo;
        if (savedState != null) {
            savedState.f14989Oooo0o = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (OooO() || (this.f14940Oooo0oO == 0 && !OooO())) {
            int iOooOo00 = OooOo00(i, o00ooo2, o0ooo0o2);
            this.f14956OooooOo.clear();
            return iOooOo00;
        }
        int iOooOo0 = OooOo0(i);
        this.f14948OoooOOo.f14974OooO0Oo += iOooOo0;
        this.f14950OoooOoO.OooOOOo(-iOooOo0);
        return iOooOo0;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void setFlexLines(List<com.google.android.flexbox.OooO0O0> list) {
        this.f14945OoooO0O = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        oo000o oo000oVar = new oo000o(recyclerView.getContext());
        oo000oVar.setTargetPosition(i);
        startSmoothScroll(oo000oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        OooOoO0(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public float f14962OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public float f14963OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public float f14964OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f14965OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f14966OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f14967OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f14968OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public boolean f14969OoooOo0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f14970o000oOoO;

        public static class OooO00o implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14964OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14963OoooO0 = 1.0f;
            this.f14965OoooO0O = -1;
            this.f14962OoooO = -1.0f;
            this.f14967OoooOOO = 16777215;
            this.f14968OoooOOo = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOoo() {
            return this.f14965OoooO0O;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Oooo00o() {
            return this.f14963OoooO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Oooo0o() {
            return this.f14966OoooOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void OoooOO0(int i) {
            this.f14966OoooOO0 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OoooOOO() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooooOO() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void OoooooO(int i) {
            this.f14970o000oOoO = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean o00000() {
            return this.f14969OoooOo0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000000o() {
            return this.f14970o000oOoO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o00000O() {
            return this.f14968OoooOOo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O() {
            return this.f14967OoooOOO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000OOo() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o000oOoO() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float o00oO0o() {
            return this.f14962OoooO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float ooOO() {
            return this.f14964OoooO00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f14964OoooO00);
            parcel.writeFloat(this.f14963OoooO0);
            parcel.writeInt(this.f14965OoooO0O);
            parcel.writeFloat(this.f14962OoooO);
            parcel.writeInt(this.f14966OoooOO0);
            parcel.writeInt(this.f14970o000oOoO);
            parcel.writeInt(this.f14967OoooOOO);
            parcel.writeInt(this.f14968OoooOOo);
            parcel.writeByte(this.f14969OoooOo0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams() {
            super(-2, -2);
            this.f14964OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14963OoooO0 = 1.0f;
            this.f14965OoooO0O = -1;
            this.f14962OoooO = -1.0f;
            this.f14967OoooOOO = 16777215;
            this.f14968OoooOOo = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f14964OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f14963OoooO0 = 1.0f;
            this.f14965OoooO0O = -1;
            this.f14962OoooO = -1.0f;
            this.f14967OoooOOO = 16777215;
            this.f14968OoooOOo = 16777215;
            this.f14964OoooO00 = parcel.readFloat();
            this.f14963OoooO0 = parcel.readFloat();
            this.f14965OoooO0O = parcel.readInt();
            this.f14962OoooO = parcel.readFloat();
            this.f14966OoooOO0 = parcel.readInt();
            this.f14970o000oOoO = parcel.readInt();
            this.f14967OoooOOO = parcel.readInt();
            this.f14968OoooOOo = parcel.readInt();
            this.f14969OoooOo0 = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
