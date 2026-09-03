package com.google.android.flexbox;

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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.Oooo000 implements com.google.android.flexbox.OooO00o, RecyclerView.o0ooOOo.OooO0O0 {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Rect f14437OooOoo0 = new Rect();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14438OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14441OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14443OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RecyclerView.o00Ooo f14446OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO0O0 f14447OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RecyclerView.o0OOO0o f14448OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO00o f14449OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public o0O0O00 f14450OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SavedState f14451OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public o0O0O00 f14452OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f14453OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f14454OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f14455OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f14456OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f14457OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SparseArray<View> f14458OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f14459OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f14460OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0OO.OooO00o f14461OooOoOO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f14442OooO0oO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<com.google.android.flexbox.OooO0O0> f14444OooOO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0OO f14445OooOO0O = new OooO0OO(this);

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f14471OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14472OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14473OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14474OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f14475OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f14476OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f14477OooO0oO;

        public OooO00o() {
        }

        public static void OooO00o(OooO00o oooO00o) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.OooOO0() || !flexboxLayoutManager.f14443OooO0oo) {
                oooO00o.f14473OooO0OO = oooO00o.f14476OooO0o0 ? flexboxLayoutManager.f14450OooOOOo.OooO0oO() : flexboxLayoutManager.f14450OooOOOo.OooOO0O();
            } else {
                oooO00o.f14473OooO0OO = oooO00o.f14476OooO0o0 ? flexboxLayoutManager.f14450OooOOOo.OooO0oO() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.f14450OooOOOo.OooOO0O();
            }
        }

        public static void OooO0O0(OooO00o oooO00o) {
            oooO00o.f14471OooO00o = -1;
            oooO00o.f14472OooO0O0 = -1;
            oooO00o.f14473OooO0OO = Integer.MIN_VALUE;
            oooO00o.f14475OooO0o = false;
            oooO00o.f14477OooO0oO = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.OooOO0()) {
                int i = flexboxLayoutManager.f14441OooO0o0;
                if (i == 0) {
                    oooO00o.f14476OooO0o0 = flexboxLayoutManager.f14439OooO0Oo == 1;
                    return;
                } else {
                    oooO00o.f14476OooO0o0 = i == 2;
                    return;
                }
            }
            int i2 = flexboxLayoutManager.f14441OooO0o0;
            if (i2 == 0) {
                oooO00o.f14476OooO0o0 = flexboxLayoutManager.f14439OooO0Oo == 3;
            } else {
                oooO00o.f14476OooO0o0 = i2 == 2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f14471OooO00o);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f14472OooO0O0);
            sb.append(", mCoordinate=");
            sb.append(this.f14473OooO0OO);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.f14474OooO0Oo);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f14476OooO0o0);
            sb.append(", mValid=");
            sb.append(this.f14475OooO0o);
            sb.append(", mAssignedFromSavedState=");
            return androidx.compose.animation.OooO0o.OooO00o(sb, this.f14477OooO0oO, '}');
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f14480OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f14481OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14482OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14483OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f14484OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14485OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f14486OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f14488OooOO0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f14487OooO0oo = 1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14479OooO = 1;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f14480OooO00o);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f14482OooO0OO);
            sb.append(", mPosition=");
            sb.append(this.f14483OooO0Oo);
            sb.append(", mOffset=");
            sb.append(this.f14485OooO0o0);
            sb.append(", mScrollingOffset=");
            sb.append(this.f14484OooO0o);
            sb.append(", mLastScrollDelta=");
            sb.append(this.f14486OooO0oO);
            sb.append(", mItemDirection=");
            sb.append(this.f14487OooO0oo);
            sb.append(", mLayoutDirection=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f14479OooO, '}');
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14489OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14490OooO0o0;

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
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f14489OooO0Oo);
            sb.append(", mAnchorOffset=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f14490OooO0o0, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14489OooO0Oo);
            parcel.writeInt(this.f14490OooO0o0);
        }

        public SavedState(Parcel parcel) {
            this.f14489OooO0Oo = parcel.readInt();
            this.f14490OooO0o0 = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f14489OooO0Oo = savedState.f14489OooO0Oo;
            this.f14490OooO0o0 = savedState.f14490OooO0o0;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        OooO00o oooO00o = new OooO00o();
        this.f14449OooOOOO = oooO00o;
        this.f14453OooOOoo = -1;
        this.f14456OooOo00 = Integer.MIN_VALUE;
        this.f14455OooOo0 = Integer.MIN_VALUE;
        this.f14457OooOo0O = Integer.MIN_VALUE;
        this.f14458OooOo0o = new SparseArray<>();
        this.f14459OooOoO = -1;
        this.f14461OooOoOO = new OooO0OO.OooO00o();
        RecyclerView.Oooo000.OooO0o properties = RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f7646OooO00o;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f7648OooO0OO) {
                    OooOo0o(3);
                } else {
                    OooOo0o(2);
                }
            }
        } else if (properties.f7648OooO0OO) {
            OooOo0o(1);
        } else {
            OooOo0o(0);
        }
        int i4 = this.f14441OooO0o0;
        if (i4 != 1) {
            if (i4 == 0) {
                removeAllViews();
                this.f14444OooOO0.clear();
                OooO00o.OooO0O0(oooO00o);
                oooO00o.f14474OooO0Oo = 0;
            }
            this.f14441OooO0o0 = 1;
            this.f14450OooOOOo = null;
            this.f14452OooOOo0 = null;
            requestLayout();
        }
        if (this.f14440OooO0o != 4) {
            removeAllViews();
            this.f14444OooOO0.clear();
            OooO00o.OooO0O0(oooO00o);
            oooO00o.f14474OooO0Oo = 0;
            this.f14440OooO0o = 4;
            requestLayout();
        }
        setAutoMeasureEnabled(true);
        this.f14454OooOo = context;
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
    public final int OooO(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (OooOO0()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO00o(View view, int i, int i2, com.google.android.flexbox.OooO0O0 oooO0O0) {
        calculateItemDecorationsForChild(view, f14437OooOoo0);
        if (OooOO0()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            oooO0O0.f14497OooO0o0 += rightDecorationWidth;
            oooO0O0.f14496OooO0o += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        oooO0O0.f14497OooO0o0 += bottomDecorationHeight;
        oooO0O0.f14496OooO0o += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0O0(int i, int i2, int i3) {
        return RecyclerView.Oooo000.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0OO(int i) {
        View view = this.f14458OooOo0o.get(i);
        return view != null ? view : this.f14446OooOO0o.OooO0Oo(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0Oo(int i, int i2, int i3) {
        return RecyclerView.Oooo000.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0o(com.google.android.flexbox.OooO0O0 oooO0O0) {
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int OooO0o0(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (OooOO0()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final View OooO0oO(int i) {
        return OooO0OO(i);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void OooO0oo(int i, View view) {
        this.f14458OooOo0o.put(i, view);
    }

    @Override // com.google.android.flexbox.OooO00o
    public final boolean OooOO0() {
        int i = this.f14439OooO0Oo;
        return i == 0 || i == 1;
    }

    public final void OooOO0O() {
        if (this.f14450OooOOOo != null) {
            return;
        }
        if (OooOO0()) {
            if (this.f14441OooO0o0 == 0) {
                this.f14450OooOOOo = new o0OO00O(this);
                this.f14452OooOOo0 = new oo0o0Oo(this);
                return;
            } else {
                this.f14450OooOOOo = new oo0o0Oo(this);
                this.f14452OooOOo0 = new o0OO00O(this);
                return;
            }
        }
        if (this.f14441OooO0o0 == 0) {
            this.f14450OooOOOo = new oo0o0Oo(this);
            this.f14452OooOOo0 = new o0OO00O(this);
        } else {
            this.f14450OooOOOo = new o0OO00O(this);
            this.f14452OooOOo0 = new oo0o0Oo(this);
        }
    }

    public final int OooOO0o(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int i4;
        com.google.android.flexbox.OooO0O0 oooO0O1;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = oooO0O0.f14484OooO0o;
        if (i9 != Integer.MIN_VALUE) {
            int i10 = oooO0O0.f14480OooO00o;
            if (i10 < 0) {
                oooO0O0.f14484OooO0o = i9 + i10;
            }
            OooOo0(o00ooo2, oooO0O0);
        }
        int i11 = oooO0O0.f14480OooO00o;
        boolean zOooOO0 = OooOO0();
        int i12 = i11;
        int i13 = 0;
        while (true) {
            if (i12 <= 0 && !this.f14447OooOOO.f14481OooO0O0) {
                break;
            }
            List<com.google.android.flexbox.OooO0O0> list = this.f14444OooOO0;
            int i14 = oooO0O0.f14483OooO0Oo;
            if (!(i14 >= 0 && i14 < o0ooo0o2.OooO0O0() && (i8 = oooO0O0.f14482OooO0OO) >= 0 && i8 < list.size())) {
                break;
            }
            com.google.android.flexbox.OooO0O0 oooO0O2 = this.f14444OooOO0.get(oooO0O0.f14482OooO0OO);
            oooO0O0.f14483OooO0Oo = oooO0O2.f14505OooOOOO;
            boolean zOooOO1 = OooOO0();
            Rect rect = f14437OooOoo0;
            OooO0OO oooO0OO = this.f14445OooOO0O;
            OooO00o oooO00o = this.f14449OooOOOO;
            if (zOooOO1) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i15 = oooO0O0.f14485OooO0o0;
                if (oooO0O0.f14479OooO == -1) {
                    i15 -= oooO0O2.f14498OooO0oO;
                }
                int i16 = oooO0O0.f14483OooO0Oo;
                float f = oooO00o.f14474OooO0Oo;
                float f2 = paddingLeft - f;
                float leftDecorationWidth = (width - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i17 = oooO0O2.f14499OooO0oo;
                int i18 = i16;
                int i19 = 0;
                while (i18 < i16 + i17) {
                    View viewOooO0OO = OooO0OO(i18);
                    if (viewOooO0OO == null) {
                        i15 = i15;
                        i12 = i12;
                        i18 = i18;
                        rect = rect;
                    } else {
                        if (oooO0O0.f14479OooO == 1) {
                            calculateItemDecorationsForChild(viewOooO0OO, rect);
                            addView(viewOooO0OO);
                        } else {
                            calculateItemDecorationsForChild(viewOooO0OO, rect);
                            addView(viewOooO0OO, i19);
                            i19++;
                        }
                        long j = oooO0OO.f14512OooO0Oo[i18];
                        int i20 = (int) j;
                        int i21 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) viewOooO0OO.getLayoutParams();
                        if (shouldMeasureChild(viewOooO0OO, i20, i21, layoutParams)) {
                            viewOooO0OO.measure(i20, i21);
                        }
                        float leftDecorationWidth2 = f2 + getLeftDecorationWidth(viewOooO0OO) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        float rightDecorationWidth = leftDecorationWidth - (getRightDecorationWidth(viewOooO0OO) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(viewOooO0OO) + i15;
                        if (this.f14443OooO0oo) {
                            this.f14445OooOO0O.OooOOOO(viewOooO0OO, oooO0O2, Math.round(rightDecorationWidth) - viewOooO0OO.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), viewOooO0OO.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            this.f14445OooOO0O.OooOOOO(viewOooO0OO, oooO0O2, Math.round(leftDecorationWidth2), topDecorationHeight, viewOooO0OO.getMeasuredWidth() + Math.round(leftDecorationWidth2), viewOooO0OO.getMeasuredHeight() + topDecorationHeight);
                        }
                        float rightDecorationWidth2 = getRightDecorationWidth(viewOooO0OO) + viewOooO0OO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + fMax + leftDecorationWidth2;
                        leftDecorationWidth = rightDecorationWidth - ((getLeftDecorationWidth(viewOooO0OO) + (viewOooO0OO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + fMax);
                        f2 = rightDecorationWidth2;
                        i19 = i19;
                    }
                    i18++;
                    oooO0OO = oooO0OO;
                    rect = rect;
                    i16 = i16;
                    i17 = i17;
                    i15 = i15;
                    i12 = i12;
                }
                i = i12;
                oooO0O0.f14482OooO0OO += this.f14447OooOOO.f14479OooO;
                i4 = oooO0O2.f14498OooO0oO;
                i3 = i13;
            } else {
                i = i12;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i22 = oooO0O0.f14485OooO0o0;
                if (oooO0O0.f14479OooO == -1) {
                    int i23 = oooO0O2.f14498OooO0oO;
                    int i24 = i22 - i23;
                    i2 = i22 + i23;
                    i22 = i24;
                } else {
                    i2 = i22;
                }
                int i25 = oooO0O0.f14483OooO0Oo;
                float f3 = height - paddingBottom;
                float f4 = oooO00o.f14474OooO0Oo;
                float f5 = paddingTop - f4;
                float topDecorationHeight2 = f3 - f4;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i26 = oooO0O2.f14499OooO0oo;
                int i27 = i25;
                int i28 = 0;
                while (i27 < i25 + i26) {
                    View viewOooO0OO2 = OooO0OO(i27);
                    if (viewOooO0OO2 == null) {
                        oooO0O1 = oooO0O2;
                        i5 = i27;
                        i7 = i26;
                        i6 = i25;
                    } else {
                        int i29 = i26;
                        oooO0O1 = oooO0O2;
                        long j2 = oooO0OO.f14512OooO0Oo[i27];
                        int i30 = (int) j2;
                        int i31 = (int) (j2 >> 32);
                        RecyclerView.LayoutParams layoutParams2 = (LayoutParams) viewOooO0OO2.getLayoutParams();
                        if (shouldMeasureChild(viewOooO0OO2, i30, i31, layoutParams2)) {
                            viewOooO0OO2.measure(i30, i31);
                        }
                        float topDecorationHeight3 = f5 + getTopDecorationHeight(viewOooO0OO2) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float bottomDecorationHeight = topDecorationHeight2 - (getBottomDecorationHeight(viewOooO0OO2) + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        if (oooO0O0.f14479OooO == 1) {
                            calculateItemDecorationsForChild(viewOooO0OO2, rect);
                            addView(viewOooO0OO2);
                        } else {
                            calculateItemDecorationsForChild(viewOooO0OO2, rect);
                            addView(viewOooO0OO2, i28);
                            i28++;
                        }
                        int i32 = i28;
                        int leftDecorationWidth3 = getLeftDecorationWidth(viewOooO0OO2) + i22;
                        int rightDecorationWidth3 = i2 - getRightDecorationWidth(viewOooO0OO2);
                        boolean z = this.f14443OooO0oo;
                        if (!z) {
                            i5 = i27;
                            i6 = i25;
                            i7 = i29;
                            if (this.f14438OooO) {
                                this.f14445OooOO0O.OooOOOo(viewOooO0OO2, oooO0O1, z, leftDecorationWidth3, Math.round(bottomDecorationHeight) - viewOooO0OO2.getMeasuredHeight(), viewOooO0OO2.getMeasuredWidth() + leftDecorationWidth3, Math.round(bottomDecorationHeight));
                            } else {
                                this.f14445OooOO0O.OooOOOo(viewOooO0OO2, oooO0O1, z, leftDecorationWidth3, Math.round(topDecorationHeight3), viewOooO0OO2.getMeasuredWidth() + leftDecorationWidth3, viewOooO0OO2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                        } else if (this.f14438OooO) {
                            i5 = i27;
                            i7 = i29;
                            i6 = i25;
                            this.f14445OooOO0O.OooOOOo(viewOooO0OO2, oooO0O1, z, rightDecorationWidth3 - viewOooO0OO2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewOooO0OO2.getMeasuredHeight(), rightDecorationWidth3, Math.round(bottomDecorationHeight));
                        } else {
                            i5 = i27;
                            i6 = i25;
                            i7 = i29;
                            this.f14445OooOO0O.OooOOOo(viewOooO0OO2, oooO0O1, z, rightDecorationWidth3 - viewOooO0OO2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth3, viewOooO0OO2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                        }
                        float bottomDecorationHeight2 = getBottomDecorationHeight(viewOooO0OO2) + viewOooO0OO2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + fMax2 + topDecorationHeight3;
                        topDecorationHeight2 = bottomDecorationHeight - ((getTopDecorationHeight(viewOooO0OO2) + (viewOooO0OO2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin)) + fMax2);
                        f5 = bottomDecorationHeight2;
                        i28 = i32;
                    }
                    i27 = i5 + 1;
                    i26 = i7;
                    i13 = i13;
                    oooO0O2 = oooO0O1;
                    i25 = i6;
                }
                i3 = i13;
                oooO0O0.f14482OooO0OO += this.f14447OooOOO.f14479OooO;
                i4 = oooO0O2.f14498OooO0oO;
            }
            i13 = i3 + i4;
            if (zOooOO0 == 0 && this.f14443OooO0oo) {
                oooO0O0.f14485OooO0o0 -= oooO0O2.f14498OooO0oO * oooO0O0.f14479OooO;
            } else {
                oooO0O0.f14485OooO0o0 = (oooO0O2.f14498OooO0oO * oooO0O0.f14479OooO) + oooO0O0.f14485OooO0o0;
            }
            i12 = i - oooO0O2.f14498OooO0oO;
            i11 = i11;
            zOooOO0 = zOooOO0;
        }
        int i33 = i11;
        int i34 = i13;
        int i35 = oooO0O0.f14480OooO00o - i34;
        oooO0O0.f14480OooO00o = i35;
        int i36 = oooO0O0.f14484OooO0o;
        if (i36 != Integer.MIN_VALUE) {
            int i37 = i36 + i34;
            oooO0O0.f14484OooO0o = i37;
            if (i35 < 0) {
                oooO0O0.f14484OooO0o = i37 + i35;
            }
            OooOo0(o00ooo2, oooO0O0);
        }
        return i33 - oooO0O0.f14480OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View OooOOO(View view, com.google.android.flexbox.OooO0O0 oooO0O0) {
        boolean zOooOO0 = OooOO0();
        int i = oooO0O0.f14499OooO0oo;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f14443OooO0oo || zOooOO0) {
                    if (this.f14450OooOOOo.OooO0o0(view) > this.f14450OooOOOo.OooO0o0(childAt)) {
                        view = childAt;
                    }
                } else if (this.f14450OooOOOo.OooO0O0(view) < this.f14450OooOOOo.OooO0O0(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View OooOOO0(int i) {
        View viewOooOOo = OooOOo(0, getChildCount(), i);
        if (viewOooOOo == null) {
            return null;
        }
        int i2 = this.f14445OooOO0O.f14511OooO0OO[getPosition(viewOooOOo)];
        if (i2 == -1) {
            return null;
        }
        return OooOOO(viewOooOOo, this.f14444OooOO0.get(i2));
    }

    public final View OooOOOO(int i) {
        View viewOooOOo = OooOOo(getChildCount() - 1, -1, i);
        if (viewOooOOo == null) {
            return null;
        }
        return OooOOOo(viewOooOOo, this.f14444OooOO0.get(this.f14445OooOO0O.f14511OooO0OO[getPosition(viewOooOOo)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public final View OooOOOo(View view, com.google.android.flexbox.OooO0O0 oooO0O0) {
        boolean zOooOO0 = OooOO0();
        int childCount = (getChildCount() - oooO0O0.f14499OooO0oo) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f14443OooO0oo || zOooOO0) {
                    if (this.f14450OooOOOo.OooO0O0(view) < this.f14450OooOOOo.OooO0O0(childAt)) {
                        view = childAt;
                    }
                } else if (this.f14450OooOOOo.OooO0o0(view) > this.f14450OooOOOo.OooO0o0(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View OooOOo(int i, int i2, int i3) {
        OooOO0O();
        if (this.f14447OooOOO == null) {
            this.f14447OooOOO = new OooO0O0();
        }
        int iOooOO0O = this.f14450OooOOOo.OooOO0O();
        int iOooO0oO = this.f14450OooOOOo.OooO0oO();
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
                    if (this.f14450OooOOOo.OooO0o0(childAt) >= iOooOO0O && this.f14450OooOOOo.OooO0O0(childAt) <= iOooO0oO) {
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

    public final View OooOOo0(int i, int i2) {
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

    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    public final int OooOOoo(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOO0O();
        this.f14447OooOOO.f14488OooOO0 = true;
        boolean z = !OooOO0() && this.f14443OooO0oo;
        int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
        int iAbs = Math.abs(i);
        this.f14447OooOOO.f14479OooO = i3;
        boolean zOooOO0 = OooOO0();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !zOooOO0 && this.f14443OooO0oo;
        OooO0OO oooO0OO = this.f14445OooOO0O;
        if (i3 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f14447OooOOO.f14485OooO0o0 = this.f14450OooOOOo.OooO0O0(childAt);
            int position = getPosition(childAt);
            View viewOooOOOo = OooOOOo(childAt, this.f14444OooOO0.get(oooO0OO.f14511OooO0OO[position]));
            OooO0O0 oooO0O0 = this.f14447OooOOO;
            oooO0O0.f14487OooO0oo = 1;
            int i4 = position + 1;
            oooO0O0.f14483OooO0Oo = i4;
            int[] iArr = oooO0OO.f14511OooO0OO;
            if (iArr.length <= i4) {
                oooO0O0.f14482OooO0OO = -1;
            } else {
                oooO0O0.f14482OooO0OO = iArr[i4];
            }
            if (z2) {
                oooO0O0.f14485OooO0o0 = this.f14450OooOOOo.OooO0o0(viewOooOOOo);
                this.f14447OooOOO.f14484OooO0o = this.f14450OooOOOo.OooOO0O() + (-this.f14450OooOOOo.OooO0o0(viewOooOOOo));
                OooO0O0 oooO0O1 = this.f14447OooOOO;
                int i5 = oooO0O1.f14484OooO0o;
                if (i5 < 0) {
                    i5 = 0;
                }
                oooO0O1.f14484OooO0o = i5;
            } else {
                oooO0O0.f14485OooO0o0 = this.f14450OooOOOo.OooO0O0(viewOooOOOo);
                this.f14447OooOOO.f14484OooO0o = this.f14450OooOOOo.OooO0O0(viewOooOOOo) - this.f14450OooOOOo.OooO0oO();
            }
            int i6 = this.f14447OooOOO.f14482OooO0OO;
            if ((i6 == -1 || i6 > this.f14444OooOO0.size() - 1) && this.f14447OooOOO.f14483OooO0Oo <= getFlexItemCount()) {
                OooO0O0 oooO0O2 = this.f14447OooOOO;
                int i7 = iAbs - oooO0O2.f14484OooO0o;
                OooO0OO.OooO00o oooO00o = this.f14461OooOoOO;
                oooO00o.f14514OooO00o = null;
                oooO00o.f14515OooO0O0 = 0;
                if (i7 > 0) {
                    if (zOooOO0) {
                        this.f14445OooOO0O.OooO0O0(oooO00o, iMakeMeasureSpec, iMakeMeasureSpec2, i7, oooO0O2.f14483OooO0Oo, -1, this.f14444OooOO0);
                    } else {
                        this.f14445OooOO0O.OooO0O0(oooO00o, iMakeMeasureSpec2, iMakeMeasureSpec, i7, oooO0O2.f14483OooO0Oo, -1, this.f14444OooOO0);
                    }
                    oooO0OO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, this.f14447OooOOO.f14483OooO0Oo);
                    oooO0OO.OooOo0(this.f14447OooOOO.f14483OooO0Oo);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f14447OooOOO.f14485OooO0o0 = this.f14450OooOOOo.OooO0o0(childAt2);
            int position2 = getPosition(childAt2);
            View viewOooOOO = OooOOO(childAt2, this.f14444OooOO0.get(oooO0OO.f14511OooO0OO[position2]));
            OooO0O0 oooO0O3 = this.f14447OooOOO;
            oooO0O3.f14487OooO0oo = 1;
            int i8 = oooO0OO.f14511OooO0OO[position2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.f14447OooOOO.f14483OooO0Oo = position2 - this.f14444OooOO0.get(i8 - 1).f14499OooO0oo;
            } else {
                oooO0O3.f14483OooO0Oo = -1;
            }
            OooO0O0 oooO0O4 = this.f14447OooOOO;
            oooO0O4.f14482OooO0OO = i8 > 0 ? i8 - 1 : 0;
            if (z2) {
                oooO0O4.f14485OooO0o0 = this.f14450OooOOOo.OooO0O0(viewOooOOO);
                this.f14447OooOOO.f14484OooO0o = this.f14450OooOOOo.OooO0O0(viewOooOOO) - this.f14450OooOOOo.OooO0oO();
                OooO0O0 oooO0O5 = this.f14447OooOOO;
                int i9 = oooO0O5.f14484OooO0o;
                if (i9 < 0) {
                    i9 = 0;
                }
                oooO0O5.f14484OooO0o = i9;
            } else {
                oooO0O4.f14485OooO0o0 = this.f14450OooOOOo.OooO0o0(viewOooOOO);
                this.f14447OooOOO.f14484OooO0o = this.f14450OooOOOo.OooOO0O() + (-this.f14450OooOOOo.OooO0o0(viewOooOOO));
            }
        }
        OooO0O0 oooO0O6 = this.f14447OooOOO;
        int i10 = oooO0O6.f14484OooO0o;
        oooO0O6.f14480OooO00o = iAbs - i10;
        int iOooOO0o = OooOO0o(o00ooo2, o0ooo0o2, oooO0O6) + i10;
        if (iOooOO0o < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iOooOO0o) {
                i2 = (-i3) * iOooOO0o;
            } else {
                i2 = i;
            }
        } else if (iAbs > iOooOO0o) {
            i2 = i3 * iOooOO0o;
        } else {
            i2 = i;
        }
        this.f14450OooOOOo.OooOOOo(-i2);
        this.f14447OooOOO.f14486OooO0oO = i2;
        return i2;
    }

    public final void OooOo(int i) {
        View viewOooOOo0 = OooOOo0(getChildCount() - 1, -1);
        if (i >= (viewOooOOo0 != null ? getPosition(viewOooOOo0) : -1)) {
            return;
        }
        int childCount = getChildCount();
        OooO0OO oooO0OO = this.f14445OooOO0O;
        oooO0OO.OooOO0(childCount);
        oooO0OO.OooOO0O(childCount);
        oooO0OO.OooO(childCount);
        if (i >= oooO0OO.f14511OooO0OO.length) {
            return;
        }
        this.f14459OooOoO = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f14453OooOOoo = getPosition(childAt);
        if (OooOO0() || !this.f14443OooO0oo) {
            this.f14456OooOo00 = this.f14450OooOOOo.OooO0o0(childAt) - this.f14450OooOOOo.OooOO0O();
        } else {
            this.f14456OooOo00 = this.f14450OooOOOo.OooO0oo() + this.f14450OooOOOo.OooO0O0(childAt);
        }
    }

    public final void OooOo0(RecyclerView.o00Ooo o00ooo2, OooO0O0 oooO0O0) {
        int childCount;
        if (oooO0O0.f14488OooOO0) {
            int i = oooO0O0.f14479OooO;
            int i2 = -1;
            OooO0OO oooO0OO = this.f14445OooOO0O;
            if (i != -1) {
                if (oooO0O0.f14484OooO0o >= 0 && (childCount = getChildCount()) != 0) {
                    int i3 = oooO0OO.f14511OooO0OO[getPosition(getChildAt(0))];
                    if (i3 == -1) {
                        return;
                    }
                    com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14444OooOO0.get(i3);
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        int i5 = oooO0O0.f14484OooO0o;
                        if (!(OooOO0() || !this.f14443OooO0oo ? this.f14450OooOOOo.OooO0O0(childAt) <= i5 : this.f14450OooOOOo.OooO0o() - this.f14450OooOOOo.OooO0o0(childAt) <= i5)) {
                            break;
                        }
                        if (oooO0O1.f14506OooOOOo == getPosition(childAt)) {
                            if (i3 >= this.f14444OooOO0.size() - 1) {
                                i2 = i4;
                                break;
                            } else {
                                i3 += oooO0O0.f14479OooO;
                                oooO0O1 = this.f14444OooOO0.get(i3);
                                i2 = i4;
                            }
                        }
                    }
                    while (i2 >= 0) {
                        removeAndRecycleViewAt(i2, o00ooo2);
                        i2--;
                    }
                    return;
                }
                return;
            }
            if (oooO0O0.f14484OooO0o < 0) {
                return;
            }
            this.f14450OooOOOo.OooO0o();
            int childCount2 = getChildCount();
            if (childCount2 == 0) {
                return;
            }
            int i6 = childCount2 - 1;
            int i7 = oooO0OO.f14511OooO0OO[getPosition(getChildAt(i6))];
            if (i7 == -1) {
                return;
            }
            com.google.android.flexbox.OooO0O0 oooO0O2 = this.f14444OooOO0.get(i7);
            for (int i8 = i6; i8 >= 0; i8--) {
                View childAt2 = getChildAt(i8);
                int i9 = oooO0O0.f14484OooO0o;
                if (!(OooOO0() || !this.f14443OooO0oo ? this.f14450OooOOOo.OooO0o0(childAt2) >= this.f14450OooOOOo.OooO0o() - i9 : this.f14450OooOOOo.OooO0O0(childAt2) <= i9)) {
                    break;
                }
                if (oooO0O2.f14505OooOOOO == getPosition(childAt2)) {
                    if (i7 <= 0) {
                        childCount2 = i8;
                        break;
                    } else {
                        i7 += oooO0O0.f14479OooO;
                        oooO0O2 = this.f14444OooOO0.get(i7);
                        childCount2 = i8;
                    }
                }
            }
            while (i6 >= childCount2) {
                removeAndRecycleViewAt(i6, o00ooo2);
                i6--;
            }
        }
    }

    public final int OooOo00(int i) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        OooOO0O();
        boolean zOooOO0 = OooOO0();
        View view = this.f14460OooOoO0;
        int width = zOooOO0 ? view.getWidth() : view.getHeight();
        int width2 = zOooOO0 ? getWidth() : getHeight();
        boolean z = getLayoutDirection() == 1;
        OooO00o oooO00o = this.f14449OooOOOO;
        if (z) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + oooO00o.f14474OooO0Oo) - width, iAbs);
            }
            i2 = oooO00o.f14474OooO0Oo;
            if (i2 + i <= 0) {
                return i;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - oooO00o.f14474OooO0Oo) - width, i);
            }
            i2 = oooO00o.f14474OooO0Oo;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    public final void OooOo0O() {
        int heightMode = OooOO0() ? getHeightMode() : getWidthMode();
        this.f14447OooOOO.f14481OooO0O0 = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void OooOo0o(int i) {
        if (this.f14439OooO0Oo != i) {
            removeAllViews();
            this.f14439OooO0Oo = i;
            this.f14450OooOOOo = null;
            this.f14452OooOOo0 = null;
            this.f14444OooOO0.clear();
            OooO00o oooO00o = this.f14449OooOOOO;
            OooO00o.OooO0O0(oooO00o);
            oooO00o.f14474OooO0Oo = 0;
            requestLayout();
        }
    }

    public final void OooOoO(OooO00o oooO00o, boolean z, boolean z2) {
        if (z2) {
            OooOo0O();
        } else {
            this.f14447OooOOO.f14481OooO0O0 = false;
        }
        if (OooOO0() || !this.f14443OooO0oo) {
            this.f14447OooOOO.f14480OooO00o = oooO00o.f14473OooO0OO - this.f14450OooOOOo.OooOO0O();
        } else {
            this.f14447OooOOO.f14480OooO00o = (this.f14460OooOoO0.getWidth() - oooO00o.f14473OooO0OO) - this.f14450OooOOOo.OooOO0O();
        }
        OooO0O0 oooO0O0 = this.f14447OooOOO;
        oooO0O0.f14483OooO0Oo = oooO00o.f14471OooO00o;
        oooO0O0.f14487OooO0oo = 1;
        oooO0O0.f14479OooO = -1;
        oooO0O0.f14485OooO0o0 = oooO00o.f14473OooO0OO;
        oooO0O0.f14484OooO0o = Integer.MIN_VALUE;
        int i = oooO00o.f14472OooO0O0;
        oooO0O0.f14482OooO0OO = i;
        if (!z || i <= 0) {
            return;
        }
        int size = this.f14444OooOO0.size();
        int i2 = oooO00o.f14472OooO0O0;
        if (size > i2) {
            com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14444OooOO0.get(i2);
            OooO0O0 oooO0O2 = this.f14447OooOOO;
            oooO0O2.f14482OooO0OO--;
            oooO0O2.f14483OooO0Oo -= oooO0O1.f14499OooO0oo;
        }
    }

    public final void OooOoO0(OooO00o oooO00o, boolean z, boolean z2) {
        int i;
        if (z2) {
            OooOo0O();
        } else {
            this.f14447OooOOO.f14481OooO0O0 = false;
        }
        if (OooOO0() || !this.f14443OooO0oo) {
            this.f14447OooOOO.f14480OooO00o = this.f14450OooOOOo.OooO0oO() - oooO00o.f14473OooO0OO;
        } else {
            this.f14447OooOOO.f14480OooO00o = oooO00o.f14473OooO0OO - getPaddingRight();
        }
        OooO0O0 oooO0O0 = this.f14447OooOOO;
        oooO0O0.f14483OooO0Oo = oooO00o.f14471OooO00o;
        oooO0O0.f14487OooO0oo = 1;
        oooO0O0.f14479OooO = 1;
        oooO0O0.f14485OooO0o0 = oooO00o.f14473OooO0OO;
        oooO0O0.f14484OooO0o = Integer.MIN_VALUE;
        oooO0O0.f14482OooO0OO = oooO00o.f14472OooO0O0;
        if (!z || this.f14444OooOO0.size() <= 1 || (i = oooO00o.f14472OooO0O0) < 0 || i >= this.f14444OooOO0.size() - 1) {
            return;
        }
        com.google.android.flexbox.OooO0O0 oooO0O1 = this.f14444OooOO0.get(oooO00o.f14472OooO0O0);
        OooO0O0 oooO0O2 = this.f14447OooOOO;
        oooO0O2.f14482OooO0OO++;
        oooO0O2.f14483OooO0Oo += oooO0O1.f14499OooO0oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollHorizontally() {
        if (this.f14441OooO0o0 == 0) {
            return OooOO0();
        }
        if (OooOO0()) {
            int width = getWidth();
            View view = this.f14460OooOoO0;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final boolean canScrollVertically() {
        if (this.f14441OooO0o0 == 0) {
            return !OooOO0();
        }
        if (OooOO0()) {
            return true;
        }
        int height = getHeight();
        View view = this.f14460OooOoO0;
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
        OooOO0O();
        View viewOooOOO0 = OooOOO0(iOooO0O0);
        View viewOooOOOO = OooOOOO(iOooO0O0);
        if (o0ooo0o2.OooO0O0() == 0 || viewOooOOO0 == null || viewOooOOOO == null) {
            return 0;
        }
        return Math.min(this.f14450OooOOOo.OooOO0o(), this.f14450OooOOOo.OooO0O0(viewOooOOOO) - this.f14450OooOOOo.OooO0o0(viewOooOOO0));
    }

    public final int computeScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        View viewOooOOO0 = OooOOO0(iOooO0O0);
        View viewOooOOOO = OooOOOO(iOooO0O0);
        if (o0ooo0o2.OooO0O0() != 0 && viewOooOOO0 != null && viewOooOOOO != null) {
            int position = getPosition(viewOooOOO0);
            int position2 = getPosition(viewOooOOOO);
            int iAbs = Math.abs(this.f14450OooOOOo.OooO0O0(viewOooOOOO) - this.f14450OooOOOo.OooO0o0(viewOooOOO0));
            int[] iArr = this.f14445OooOO0O.f14511OooO0OO;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.f14450OooOOOo.OooOO0O() - this.f14450OooOOOo.OooO0o0(viewOooOOO0)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        View viewOooOOO0 = OooOOO0(iOooO0O0);
        View viewOooOOOO = OooOOOO(iOooO0O0);
        if (o0ooo0o2.OooO0O0() == 0 || viewOooOOO0 == null || viewOooOOOO == null) {
            return 0;
        }
        View viewOooOOo0 = OooOOo0(0, getChildCount());
        int position = viewOooOOo0 == null ? -1 : getPosition(viewOooOOo0);
        View viewOooOOo1 = OooOOo0(getChildCount() - 1, -1);
        return (int) ((Math.abs(this.f14450OooOOOo.OooO0O0(viewOooOOOO) - this.f14450OooOOOo.OooO0o0(viewOooOOO0)) / (((viewOooOOo1 != null ? getPosition(viewOooOOo1) : -1) - position) + 1)) * o0ooo0o2.OooO0O0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo.OooO0O0
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        return OooOO0() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
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
        int iOooOOoo;
        int iOooO0oO;
        if (!OooOO0() && this.f14443OooO0oo) {
            int iOooOO0O = i - this.f14450OooOOOo.OooOO0O();
            if (iOooOO0O <= 0) {
                return 0;
            }
            iOooOOoo = OooOOoo(iOooOO0O, o00ooo2, o0ooo0o2);
        } else {
            int iOooO0oO2 = this.f14450OooOOOo.OooO0oO() - i;
            if (iOooO0oO2 <= 0) {
                return 0;
            }
            iOooOOoo = -OooOOoo(-iOooO0oO2, o00ooo2, o0ooo0o2);
        }
        int i2 = i + iOooOOoo;
        if (!z || (iOooO0oO = this.f14450OooOOOo.OooO0oO() - i2) <= 0) {
            return iOooOOoo;
        }
        this.f14450OooOOOo.OooOOOo(iOooO0oO);
        return iOooO0oO + iOooOOoo;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooOOoo;
        int iOooOO0O;
        if (OooOO0() || !this.f14443OooO0oo) {
            int iOooOO0O2 = i - this.f14450OooOOOo.OooOO0O();
            if (iOooOO0O2 <= 0) {
                return 0;
            }
            iOooOOoo = -OooOOoo(iOooOO0O2, o00ooo2, o0ooo0o2);
        } else {
            int iOooO0oO = this.f14450OooOOOo.OooO0oO() - i;
            if (iOooO0oO <= 0) {
                return 0;
            }
            iOooOOoo = OooOOoo(-iOooO0oO, o00ooo2, o0ooo0o2);
        }
        int i2 = i + iOooOOoo;
        if (!z || (iOooOO0O = i2 - this.f14450OooOOOo.OooOO0O()) <= 0) {
            return iOooOOoo;
        }
        this.f14450OooOOOo.OooOOOo(-iOooOO0O);
        return iOooOOoo - iOooOO0O;
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
        return this.f14440OooO0o;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexDirection() {
        return this.f14439OooO0Oo;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexItemCount() {
        return this.f14448OooOOO0.OooO0O0();
    }

    @Override // com.google.android.flexbox.OooO00o
    public final List<com.google.android.flexbox.OooO0O0> getFlexLinesInternal() {
        return this.f14444OooOO0;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getFlexWrap() {
        return this.f14441OooO0o0;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getLargestMainSize() {
        if (this.f14444OooOO0.size() == 0) {
            return 0;
        }
        int size = this.f14444OooOO0.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, this.f14444OooOO0.get(i).f14497OooO0o0);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getMaxLine() {
        return this.f14442OooO0oO;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final int getSumOfCrossSize() {
        int size = this.f14444OooOO0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f14444OooOO0.get(i2).f14498OooO0oO;
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
        this.f14460OooOoO0 = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo2) {
        super.onDetachedFromWindow(recyclerView, o00ooo2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        OooOo(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        OooOo(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        OooOo(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        OooOo(i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:102:0x0176  */
    /* JADX WARN: Code duplicated, block: B:105:0x017d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0193  */
    /* JADX WARN: Code duplicated, block: B:169:0x0279  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0159  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Code duplicated, block: B:99:0x0168  */
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
        boolean z5;
        int i3;
        int i4;
        this.f14446OooOO0o = o00ooo2;
        this.f14448OooOOO0 = o0ooo0o2;
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        if (iOooO0O0 == 0 && o0ooo0o2.f7674OooO0oO) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i5 = this.f14439OooO0Oo;
        if (i5 == 0) {
            this.f14443OooO0oo = layoutDirection == 1;
            this.f14438OooO = this.f14441OooO0o0 == 2;
        } else if (i5 == 1) {
            this.f14443OooO0oo = layoutDirection != 1;
            this.f14438OooO = this.f14441OooO0o0 == 2;
        } else if (i5 == 2) {
            boolean z6 = layoutDirection == 1;
            this.f14443OooO0oo = z6;
            if (this.f14441OooO0o0 == 2) {
                this.f14443OooO0oo = !z6;
            }
            this.f14438OooO = false;
        } else if (i5 != 3) {
            this.f14443OooO0oo = false;
            this.f14438OooO = false;
        } else {
            boolean z7 = layoutDirection == 1;
            this.f14443OooO0oo = z7;
            if (this.f14441OooO0o0 == 2) {
                this.f14443OooO0oo = !z7;
            }
            this.f14438OooO = true;
        }
        OooOO0O();
        if (this.f14447OooOOO == null) {
            this.f14447OooOOO = new OooO0O0();
        }
        OooO0OO oooO0OO = this.f14445OooOO0O;
        oooO0OO.OooOO0(iOooO0O0);
        oooO0OO.OooOO0O(iOooO0O0);
        oooO0OO.OooO(iOooO0O0);
        this.f14447OooOOO.f14488OooOO0 = false;
        SavedState savedState = this.f14451OooOOo;
        if (savedState != null) {
            int i6 = savedState.f14489OooO0Oo;
            if (i6 >= 0 && i6 < iOooO0O0) {
                this.f14453OooOOoo = i6;
            }
        }
        OooO00o oooO00o = this.f14449OooOOOO;
        if (!oooO00o.f14475OooO0o || this.f14453OooOOoo != -1 || savedState != null) {
            OooO00o.OooO0O0(oooO00o);
            SavedState savedState2 = this.f14451OooOOo;
            if (o0ooo0o2.f7674OooO0oO || (i = this.f14453OooOOoo) == -1) {
                z = false;
            } else if (i < 0 || i >= o0ooo0o2.OooO0O0()) {
                this.f14453OooOOoo = -1;
                this.f14456OooOo00 = Integer.MIN_VALUE;
                z = false;
            } else {
                int i7 = this.f14453OooOOoo;
                oooO00o.f14471OooO00o = i7;
                oooO00o.f14472OooO0O0 = oooO0OO.f14511OooO0OO[i7];
                SavedState savedState3 = this.f14451OooOOo;
                if (savedState3 != null) {
                    int iOooO0O1 = o0ooo0o2.OooO0O0();
                    int i8 = savedState3.f14489OooO0Oo;
                    if (i8 >= 0 && i8 < iOooO0O1) {
                        oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O() + savedState2.f14490OooO0o0;
                        oooO00o.f14477OooO0oO = true;
                        oooO00o.f14472OooO0O0 = -1;
                    } else if (this.f14456OooOo00 == Integer.MIN_VALUE) {
                        viewFindViewByPosition = findViewByPosition(this.f14453OooOOoo);
                        if (viewFindViewByPosition != null) {
                            if (getChildCount() > 0) {
                                if (this.f14453OooOOoo < getPosition(getChildAt(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                oooO00o.f14476OooO0o0 = z3;
                            }
                            OooO00o.OooO00o(oooO00o);
                        } else if (this.f14450OooOOOo.OooO0OO(viewFindViewByPosition) > this.f14450OooOOOo.OooOO0o()) {
                            OooO00o.OooO00o(oooO00o);
                        } else if (this.f14450OooOOOo.OooO0o0(viewFindViewByPosition) - this.f14450OooOOOo.OooOO0O() < 0) {
                            oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O();
                            oooO00o.f14476OooO0o0 = false;
                        } else if (this.f14450OooOOOo.OooO0oO() - this.f14450OooOOOo.OooO0O0(viewFindViewByPosition) < 0) {
                            oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooO0oO();
                            oooO00o.f14476OooO0o0 = true;
                        } else {
                            if (oooO00o.f14476OooO0o0) {
                                iOooO0o0 = this.f14450OooOOOo.OooOOO0() + this.f14450OooOOOo.OooO0O0(viewFindViewByPosition);
                            } else {
                                iOooO0o0 = this.f14450OooOOOo.OooO0o0(viewFindViewByPosition);
                            }
                            oooO00o.f14473OooO0OO = iOooO0o0;
                        }
                    } else if (OooOO0() && this.f14443OooO0oo) {
                        oooO00o.f14473OooO0OO = this.f14456OooOo00 - this.f14450OooOOOo.OooO0oo();
                    } else {
                        oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O() + this.f14456OooOo00;
                    }
                } else if (this.f14456OooOo00 == Integer.MIN_VALUE) {
                    viewFindViewByPosition = findViewByPosition(this.f14453OooOOoo);
                    if (viewFindViewByPosition != null) {
                        if (getChildCount() > 0) {
                            if (this.f14453OooOOoo < getPosition(getChildAt(0))) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            oooO00o.f14476OooO0o0 = z3;
                        }
                        OooO00o.OooO00o(oooO00o);
                    } else if (this.f14450OooOOOo.OooO0OO(viewFindViewByPosition) > this.f14450OooOOOo.OooOO0o()) {
                        OooO00o.OooO00o(oooO00o);
                    } else if (this.f14450OooOOOo.OooO0o0(viewFindViewByPosition) - this.f14450OooOOOo.OooOO0O() < 0) {
                        oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O();
                        oooO00o.f14476OooO0o0 = false;
                    } else if (this.f14450OooOOOo.OooO0oO() - this.f14450OooOOOo.OooO0O0(viewFindViewByPosition) < 0) {
                        oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooO0oO();
                        oooO00o.f14476OooO0o0 = true;
                    } else {
                        if (oooO00o.f14476OooO0o0) {
                            iOooO0o0 = this.f14450OooOOOo.OooOOO0() + this.f14450OooOOOo.OooO0O0(viewFindViewByPosition);
                        } else {
                            iOooO0o0 = this.f14450OooOOOo.OooO0o0(viewFindViewByPosition);
                        }
                        oooO00o.f14473OooO0OO = iOooO0o0;
                    }
                } else if (OooOO0()) {
                    oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O() + this.f14456OooOo00;
                } else {
                    oooO00o.f14473OooO0OO = this.f14450OooOOOo.OooOO0O() + this.f14456OooOo00;
                }
                z = true;
            }
            if (!z) {
                if (getChildCount() != 0) {
                    View viewOooOOOO = oooO00o.f14476OooO0o0 ? OooOOOO(o0ooo0o2.OooO0O0()) : OooOOO0(o0ooo0o2.OooO0O0());
                    if (viewOooOOOO != null) {
                        FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                        o0O0O00 o0o0o00 = flexboxLayoutManager.f14441OooO0o0 == 0 ? flexboxLayoutManager.f14452OooOOo0 : flexboxLayoutManager.f14450OooOOOo;
                        if (flexboxLayoutManager.OooOO0() || !flexboxLayoutManager.f14443OooO0oo) {
                            if (oooO00o.f14476OooO0o0) {
                                oooO00o.f14473OooO0OO = o0o0o00.OooOOO0() + o0o0o00.OooO0O0(viewOooOOOO);
                            } else {
                                oooO00o.f14473OooO0OO = o0o0o00.OooO0o0(viewOooOOOO);
                            }
                        } else if (oooO00o.f14476OooO0o0) {
                            oooO00o.f14473OooO0OO = o0o0o00.OooOOO0() + o0o0o00.OooO0o0(viewOooOOOO);
                        } else {
                            oooO00o.f14473OooO0OO = o0o0o00.OooO0O0(viewOooOOOO);
                        }
                        int position = flexboxLayoutManager.getPosition(viewOooOOOO);
                        oooO00o.f14471OooO00o = position;
                        oooO00o.f14477OooO0oO = false;
                        int[] iArr = flexboxLayoutManager.f14445OooOO0O.f14511OooO0OO;
                        if (position == -1) {
                            position = 0;
                        }
                        int i9 = iArr[position];
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        oooO00o.f14472OooO0O0 = i9;
                        int size = flexboxLayoutManager.f14444OooOO0.size();
                        int i10 = oooO00o.f14472OooO0O0;
                        if (size > i10) {
                            oooO00o.f14471OooO00o = flexboxLayoutManager.f14444OooOO0.get(i10).f14505OooOOOO;
                        }
                        if (!o0ooo0o2.f7674OooO0oO && supportsPredictiveItemAnimations()) {
                            if (this.f14450OooOOOo.OooO0o0(viewOooOOOO) >= this.f14450OooOOOo.OooO0oO() || this.f14450OooOOOo.OooO0O0(viewOooOOOO) < this.f14450OooOOOo.OooOO0O()) {
                                oooO00o.f14473OooO0OO = oooO00o.f14476OooO0o0 ? this.f14450OooOOOo.OooO0oO() : this.f14450OooOOOo.OooOO0O();
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
                    OooO00o.OooO00o(oooO00o);
                    oooO00o.f14471OooO00o = 0;
                    oooO00o.f14472OooO0O0 = 0;
                }
            }
            oooO00o.f14475OooO0o = true;
        }
        detachAndScrapAttachedViews(o00ooo2);
        if (oooO00o.f14476OooO0o0) {
            OooOoO(oooO00o, false, true);
        } else {
            OooOoO0(oooO00o, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean zOooOO0 = OooOO0();
        Context context = this.f14454OooOo;
        if (zOooOO0) {
            int i11 = this.f14455OooOo0;
            z4 = (i11 == Integer.MIN_VALUE || i11 == width) ? false : true;
            OooO0O0 oooO0O0 = this.f14447OooOOO;
            i2 = oooO0O0.f14481OooO0O0 ? context.getResources().getDisplayMetrics().heightPixels : oooO0O0.f14480OooO00o;
        } else {
            int i12 = this.f14457OooOo0O;
            z4 = (i12 == Integer.MIN_VALUE || i12 == height) ? false : true;
            OooO0O0 oooO0O1 = this.f14447OooOOO;
            i2 = oooO0O1.f14481OooO0O0 ? context.getResources().getDisplayMetrics().widthPixels : oooO0O1.f14480OooO00o;
        }
        int i13 = i2;
        this.f14455OooOo0 = width;
        this.f14457OooOo0O = height;
        int i14 = this.f14459OooOoO;
        OooO0OO.OooO00o oooO00o2 = this.f14461OooOoOO;
        if (i14 != -1 || (this.f14453OooOOoo == -1 && !z4)) {
            int iMin = i14 != -1 ? Math.min(i14, oooO00o.f14471OooO00o) : oooO00o.f14471OooO00o;
            oooO00o2.f14514OooO00o = null;
            oooO00o2.f14515OooO0O0 = 0;
            if (OooOO0()) {
                if (this.f14444OooOO0.size() > 0) {
                    oooO0OO.OooO0Oo(iMin, this.f14444OooOO0);
                    this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec, iMakeMeasureSpec2, i13, iMin, oooO00o.f14471OooO00o, this.f14444OooOO0);
                } else {
                    oooO0OO.OooO(iOooO0O0);
                    this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec, iMakeMeasureSpec2, i13, 0, -1, this.f14444OooOO0);
                }
            } else if (this.f14444OooOO0.size() > 0) {
                oooO0OO.OooO0Oo(iMin, this.f14444OooOO0);
                this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec2, iMakeMeasureSpec, i13, iMin, oooO00o.f14471OooO00o, this.f14444OooOO0);
            } else {
                oooO0OO.OooO(iOooO0O0);
                this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec2, iMakeMeasureSpec, i13, 0, -1, this.f14444OooOO0);
            }
            this.f14444OooOO0 = oooO00o2.f14514OooO00o;
            oooO0OO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            oooO0OO.OooOo0(iMin);
        } else if (!oooO00o.f14476OooO0o0) {
            this.f14444OooOO0.clear();
            oooO00o2.f14514OooO00o = null;
            oooO00o2.f14515OooO0O0 = 0;
            if (OooOO0()) {
                this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec, iMakeMeasureSpec2, i13, 0, oooO00o.f14471OooO00o, this.f14444OooOO0);
            } else {
                this.f14445OooOO0O.OooO0O0(this.f14461OooOoOO, iMakeMeasureSpec2, iMakeMeasureSpec, i13, 0, oooO00o.f14471OooO00o, this.f14444OooOO0);
            }
            this.f14444OooOO0 = oooO00o2.f14514OooO00o;
            oooO0OO.OooO0oo(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            oooO0OO.OooOo0(0);
            int i15 = oooO0OO.f14511OooO0OO[oooO00o.f14471OooO00o];
            oooO00o.f14472OooO0O0 = i15;
            this.f14447OooOOO.f14482OooO0OO = i15;
        }
        if (oooO00o.f14476OooO0o0) {
            OooOO0o(o00ooo2, o0ooo0o2, this.f14447OooOOO);
            i4 = this.f14447OooOOO.f14485OooO0o0;
            z5 = true;
            OooOoO0(oooO00o, true, false);
            OooOO0o(o00ooo2, o0ooo0o2, this.f14447OooOOO);
            i3 = this.f14447OooOOO.f14485OooO0o0;
        } else {
            z5 = true;
            OooOO0o(o00ooo2, o0ooo0o2, this.f14447OooOOO);
            i3 = this.f14447OooOOO.f14485OooO0o0;
            OooOoO(oooO00o, true, false);
            OooOO0o(o00ooo2, o0ooo0o2, this.f14447OooOOO);
            i4 = this.f14447OooOOO.f14485OooO0o0;
        }
        if (getChildCount() > 0) {
            if (oooO00o.f14476OooO0o0) {
                fixLayoutStartGap(fixLayoutEndGap(i3, o00ooo2, o0ooo0o2, z5) + i4, o00ooo2, o0ooo0o2, false);
            } else {
                fixLayoutEndGap(fixLayoutStartGap(i4, o00ooo2, o0ooo0o2, z5) + i3, o00ooo2, o0ooo0o2, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.f14451OooOOo = null;
        this.f14453OooOOoo = -1;
        this.f14456OooOo00 = Integer.MIN_VALUE;
        this.f14459OooOoO = -1;
        OooO00o.OooO0O0(this.f14449OooOOOO);
        this.f14458OooOo0o.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f14451OooOOo = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f14451OooOOo;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f14489OooO0Oo = getPosition(childAt);
            savedState2.f14490OooO0o0 = this.f14450OooOOOo.OooO0o0(childAt) - this.f14450OooOOOo.OooOO0O();
        } else {
            savedState2.f14489OooO0Oo = -1;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (!OooOO0() || (this.f14441OooO0o0 == 0 && OooOO0())) {
            int iOooOOoo = OooOOoo(i, o00ooo2, o0ooo0o2);
            this.f14458OooOo0o.clear();
            return iOooOOoo;
        }
        int iOooOo00 = OooOo00(i);
        this.f14449OooOOOO.f14474OooO0Oo += iOooOo00;
        this.f14452OooOOo0.OooOOOo(-iOooOo00);
        return iOooOo00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void scrollToPosition(int i) {
        this.f14453OooOOoo = i;
        this.f14456OooOo00 = Integer.MIN_VALUE;
        SavedState savedState = this.f14451OooOOo;
        if (savedState != null) {
            savedState.f14489OooO0Oo = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (OooOO0() || (this.f14441OooO0o0 == 0 && !OooOO0())) {
            int iOooOOoo = OooOOoo(i, o00ooo2, o0ooo0o2);
            this.f14458OooOo0o.clear();
            return iOooOOoo;
        }
        int iOooOo00 = OooOo00(i);
        this.f14449OooOOOO.f14474OooO0Oo += iOooOo00;
        this.f14452OooOOo0.OooOOOo(-iOooOo00);
        return iOooOo00;
    }

    @Override // com.google.android.flexbox.OooO00o
    public final void setFlexLines(List<com.google.android.flexbox.OooO0O0> list) {
        this.f14444OooOO0 = list;
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
        OooOo(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f14462OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f14463OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f14464OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final float f14465OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f14466OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f14467OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f14468OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f14469OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final boolean f14470OooOOOo;

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
            this.f14463OooO0oo = 0.0f;
            this.f14462OooO = 1.0f;
            this.f14464OooOO0 = -1;
            this.f14465OooOO0O = -1.0f;
            this.f14467OooOOO = 16777215;
            this.f14469OooOOOO = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOOo() {
            return this.f14464OooOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int OooOo() {
            return this.f14466OooOO0o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float OooOo00() {
            return this.f14462OooO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Oooo0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void Oooo0O0(int i) {
            this.f14468OooOOO0 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Oooo0o0() {
            return this.f14463OooO0oo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float OoooO00() {
            return this.f14465OooOO0O;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean OoooOO0() {
            return this.f14470OooOOOo;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Ooooo0o() {
            return this.f14467OooOOO;
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
        public final int o0000() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000O0O() {
            return this.f14469OooOOOO;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0000oO() {
            return this.f14468OooOOO0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o0OOO0o() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void o0ooOOo(int i) {
            this.f14466OooOO0o = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int oo0o0Oo() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f14463OooO0oo);
            parcel.writeFloat(this.f14462OooO);
            parcel.writeInt(this.f14464OooOO0);
            parcel.writeFloat(this.f14465OooOO0O);
            parcel.writeInt(this.f14466OooOO0o);
            parcel.writeInt(this.f14468OooOOO0);
            parcel.writeInt(this.f14467OooOOO);
            parcel.writeInt(this.f14469OooOOOO);
            parcel.writeByte(this.f14470OooOOOo ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams() {
            super(-2, -2);
            this.f14463OooO0oo = 0.0f;
            this.f14462OooO = 1.0f;
            this.f14464OooOO0 = -1;
            this.f14465OooOO0O = -1.0f;
            this.f14467OooOOO = 16777215;
            this.f14469OooOOOO = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f14463OooO0oo = 0.0f;
            this.f14462OooO = 1.0f;
            this.f14464OooOO0 = -1;
            this.f14465OooOO0O = -1.0f;
            this.f14467OooOOO = 16777215;
            this.f14469OooOOOO = 16777215;
            this.f14463OooO0oo = parcel.readFloat();
            this.f14462OooO = parcel.readFloat();
            this.f14464OooOO0 = parcel.readInt();
            this.f14465OooOO0O = parcel.readFloat();
            this.f14466OooOO0o = parcel.readInt();
            this.f14468OooOOO0 = parcel.readInt();
            this.f14467OooOOO = parcel.readInt();
            this.f14469OooOOOO = parcel.readInt();
            this.f14470OooOOOo = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
