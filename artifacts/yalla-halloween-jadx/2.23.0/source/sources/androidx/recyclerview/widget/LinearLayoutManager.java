package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.Oooo000 implements o0OoOo0.OooOO0O, RecyclerView.o0ooOOo.OooO0O0 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final OooO00o mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final OooO0O0 mLayoutChunkResult;
    private OooO0OO mLayoutState;
    int mOrientation;
    o0O0O00 mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0O0O00 f7456OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7457OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7458OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f7460OooO0o0;

        public OooO00o() {
            OooO0Oo();
        }

        public final void OooO00o() {
            this.f7458OooO0OO = this.f7459OooO0Oo ? this.f7456OooO00o.OooO0oO() : this.f7456OooO00o.OooOO0O();
        }

        public final void OooO0O0(int i, View view) {
            if (this.f7459OooO0Oo) {
                this.f7458OooO0OO = this.f7456OooO00o.OooOOO0() + this.f7456OooO00o.OooO0O0(view);
            } else {
                this.f7458OooO0OO = this.f7456OooO00o.OooO0o0(view);
            }
            this.f7457OooO0O0 = i;
        }

        public final void OooO0OO(int i, View view) {
            int iOooOOO0 = this.f7456OooO00o.OooOOO0();
            if (iOooOOO0 >= 0) {
                OooO0O0(i, view);
                return;
            }
            this.f7457OooO0O0 = i;
            if (!this.f7459OooO0Oo) {
                int iOooO0o0 = this.f7456OooO00o.OooO0o0(view);
                int iOooOO0O = iOooO0o0 - this.f7456OooO00o.OooOO0O();
                this.f7458OooO0OO = iOooO0o0;
                if (iOooOO0O > 0) {
                    int iOooO0oO = (this.f7456OooO00o.OooO0oO() - Math.min(0, (this.f7456OooO00o.OooO0oO() - iOooOOO0) - this.f7456OooO00o.OooO0O0(view))) - (this.f7456OooO00o.OooO0OO(view) + iOooO0o0);
                    if (iOooO0oO < 0) {
                        this.f7458OooO0OO -= Math.min(iOooOO0O, -iOooO0oO);
                        return;
                    }
                    return;
                }
                return;
            }
            int iOooO0oO2 = (this.f7456OooO00o.OooO0oO() - iOooOOO0) - this.f7456OooO00o.OooO0O0(view);
            this.f7458OooO0OO = this.f7456OooO00o.OooO0oO() - iOooO0oO2;
            if (iOooO0oO2 > 0) {
                int iOooO0OO = this.f7458OooO0OO - this.f7456OooO00o.OooO0OO(view);
                int iOooOO0O2 = this.f7456OooO00o.OooOO0O();
                int iMin = iOooO0OO - (Math.min(this.f7456OooO00o.OooO0o0(view) - iOooOO0O2, 0) + iOooOO0O2);
                if (iMin < 0) {
                    this.f7458OooO0OO = Math.min(iOooO0oO2, -iMin) + this.f7458OooO0OO;
                }
            }
        }

        public final void OooO0Oo() {
            this.f7457OooO0O0 = -1;
            this.f7458OooO0OO = Integer.MIN_VALUE;
            this.f7459OooO0Oo = false;
            this.f7460OooO0o0 = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f7457OooO0O0);
            sb.append(", mCoordinate=");
            sb.append(this.f7458OooO0OO);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f7459OooO0Oo);
            sb.append(", mValid=");
            return androidx.compose.animation.OooO0o.OooO00o(sb, this.f7460OooO0o0, '}');
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7461OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7462OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f7463OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7464OooO0Oo;
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7467OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7468OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7469OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7470OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7471OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7472OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7474OooOO0;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f7476OooOO0o;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7466OooO00o = true;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f7473OooO0oo = 0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7465OooO = 0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<RecyclerView.o0O0O00> f7475OooOO0O = null;

        public final void OooO00o(View view) {
            int iOooO00o;
            int size = this.f7475OooOO0O.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f7475OooOO0O.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.OooO0OO() && (iOooO00o = (layoutParams.OooO00o() - this.f7469OooO0Oo) * this.f7471OooO0o0) >= 0 && iOooO00o < i) {
                    view2 = view3;
                    if (iOooO00o == 0) {
                        break;
                    } else {
                        i = iOooO00o;
                    }
                }
            }
            if (view2 == null) {
                this.f7469OooO0Oo = -1;
            } else {
                this.f7469OooO0Oo = ((RecyclerView.LayoutParams) view2.getLayoutParams()).OooO00o();
            }
        }

        public final View OooO0O0(RecyclerView.o00Ooo o00ooo2) {
            List<RecyclerView.o0O0O00> list = this.f7475OooOO0O;
            if (list == null) {
                View viewOooO0Oo = o00ooo2.OooO0Oo(this.f7469OooO0Oo);
                this.f7469OooO0Oo += this.f7471OooO0o0;
                return viewOooO0Oo;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.f7475OooOO0O.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.OooO0OO() && this.f7469OooO0Oo == layoutParams.OooO00o()) {
                    OooO00o(view);
                    return view;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7477OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7478OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7479OooO0o0;

        public class OooO00o implements Parcelable.Creator<SavedState> {
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7477OooO0Oo);
            parcel.writeInt(this.f7479OooO0o0);
            parcel.writeInt(this.f7478OooO0o ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f7477OooO0Oo = parcel.readInt();
            this.f7479OooO0o0 = parcel.readInt();
            this.f7478OooO0o = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f7477OooO0Oo = savedState.f7477OooO0Oo;
            this.f7479OooO0o0 = savedState.f7479OooO0o0;
            this.f7478OooO0o = savedState.f7478OooO0o;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o000000O.OooO00o(o0ooo0o2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o000000O.OooO0O0(o0ooo0o2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return o000000O.OooO0OO(o0ooo0o2, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooO0oO;
        int iOooO0oO2 = this.mOrientationHelper.OooO0oO() - i;
        if (iOooO0oO2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iOooO0oO2, o00ooo2, o0ooo0o2);
        int i3 = i + i2;
        if (!z || (iOooO0oO = this.mOrientationHelper.OooO0oO() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.OooOOOo(iOooO0oO);
        return iOooO0oO + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int iOooOO0O;
        int iOooOO0O2 = i - this.mOrientationHelper.OooOO0O();
        if (iOooOO0O2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iOooOO0O2, o00ooo2, o0ooo0o2);
        int i3 = i + i2;
        if (!z || (iOooOO0O = i3 - this.mOrientationHelper.OooOO0O()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.OooOOOo(-iOooOO0O);
        return i2 - iOooOO0O;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, int i, int i2) {
        if (!o0ooo0o2.f7677OooOO0O || getChildCount() == 0 || o0ooo0o2.f7674OooO0oO || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.o0O0O00> list = o00ooo2.f7661OooO0Oo;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int iOooO0OO = 0;
        int iOooO0OO2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.o0O0O00 o0o0o00 = list.get(i3);
            if (!o0o0o00.isRemoved()) {
                if (((o0o0o00.getLayoutPosition() < position) != this.mShouldReverseLayout ? (byte) -1 : (byte) 1) == -1) {
                    iOooO0OO += this.mOrientationHelper.OooO0OO(o0o0o00.itemView);
                } else {
                    iOooO0OO2 += this.mOrientationHelper.OooO0OO(o0o0o00.itemView);
                }
            }
        }
        this.mLayoutState.f7475OooOO0O = list;
        if (iOooO0OO > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            OooO0OO oooO0OO = this.mLayoutState;
            oooO0OO.f7473OooO0oo = iOooO0OO;
            oooO0OO.f7468OooO0OO = 0;
            oooO0OO.OooO00o(null);
            fill(o00ooo2, this.mLayoutState, o0ooo0o2, false);
        }
        if (iOooO0OO2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f7473OooO0oo = iOooO0OO2;
            oooO0OO2.f7468OooO0OO = 0;
            oooO0OO2.OooO00o(null);
            fill(o00ooo2, this.mLayoutState, o0ooo0o2, false);
        }
        this.mLayoutState.f7475OooOO0O = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.OooO0o0(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.o00Ooo o00ooo2, OooO0OO oooO0OO) {
        if (!oooO0OO.f7466OooO00o || oooO0OO.f7476OooOO0o) {
            return;
        }
        int i = oooO0OO.f7472OooO0oO;
        int i2 = oooO0OO.f7465OooO;
        if (oooO0OO.f7470OooO0o == -1) {
            recycleViewsFromEnd(o00ooo2, i, i2);
        } else {
            recycleViewsFromStart(o00ooo2, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.o00Ooo o00ooo2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, o00ooo2);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, o00ooo2);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.o00Ooo o00ooo2, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iOooO0o = (this.mOrientationHelper.OooO0o() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.OooO0o0(childAt) < iOooO0o || this.mOrientationHelper.OooOOOO(childAt) < iOooO0o) {
                    recycleChildren(o00ooo2, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.OooO0o0(childAt2) < iOooO0o || this.mOrientationHelper.OooOOOO(childAt2) < iOooO0o) {
                recycleChildren(o00ooo2, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.o00Ooo o00ooo2, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.OooO0O0(childAt) > i3 || this.mOrientationHelper.OooOOO(childAt) > i3) {
                    recycleChildren(o00ooo2, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.OooO0O0(childAt2) > i3 || this.mOrientationHelper.OooOOO(childAt2) > i3) {
                recycleChildren(o00ooo2, i5, i6);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO00o oooO00o) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            oooO00o.getClass();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
            if (!layoutParams.OooO0OO() && layoutParams.OooO00o() >= 0 && layoutParams.OooO00o() < o0ooo0o2.OooO0O0()) {
                oooO00o.OooO0OO(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (viewFindReferenceChild = findReferenceChild(o00ooo2, o0ooo0o2, oooO00o.f7459OooO0Oo, z3)) == null) {
            return false;
        }
        oooO00o.OooO0O0(getPosition(viewFindReferenceChild), viewFindReferenceChild);
        if (!o0ooo0o2.f7674OooO0oO && supportsPredictiveItemAnimations()) {
            int iOooO0o0 = this.mOrientationHelper.OooO0o0(viewFindReferenceChild);
            int iOooO0O0 = this.mOrientationHelper.OooO0O0(viewFindReferenceChild);
            int iOooOO0O = this.mOrientationHelper.OooOO0O();
            int iOooO0oO = this.mOrientationHelper.OooO0oO();
            boolean z4 = iOooO0O0 <= iOooOO0O && iOooO0o0 < iOooOO0O;
            if (iOooO0o0 >= iOooO0oO && iOooO0O0 > iOooO0oO) {
                z = true;
            }
            if (z4 || z) {
                if (oooO00o.f7459OooO0Oo) {
                    iOooOO0O = iOooO0oO;
                }
                oooO00o.f7458OooO0OO = iOooOO0O;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.o0OOO0o o0ooo0o2, OooO00o oooO00o) {
        int i;
        if (!o0ooo0o2.f7674OooO0oO && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < o0ooo0o2.OooO0O0()) {
                int i2 = this.mPendingScrollPosition;
                oooO00o.f7457OooO0O0 = i2;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null) {
                    if (savedState.f7477OooO0Oo >= 0) {
                        boolean z = savedState.f7478OooO0o;
                        oooO00o.f7459OooO0Oo = z;
                        if (z) {
                            oooO00o.f7458OooO0OO = this.mOrientationHelper.OooO0oO() - this.mPendingSavedState.f7479OooO0o0;
                        } else {
                            oooO00o.f7458OooO0OO = this.mOrientationHelper.OooOO0O() + this.mPendingSavedState.f7479OooO0o0;
                        }
                        return true;
                    }
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    oooO00o.f7459OooO0Oo = z2;
                    if (z2) {
                        oooO00o.f7458OooO0OO = this.mOrientationHelper.OooO0oO() - this.mPendingScrollPositionOffset;
                    } else {
                        oooO00o.f7458OooO0OO = this.mOrientationHelper.OooOO0O() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(i2);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        oooO00o.f7459OooO0Oo = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    oooO00o.OooO00o();
                } else {
                    if (this.mOrientationHelper.OooO0OO(viewFindViewByPosition) > this.mOrientationHelper.OooOO0o()) {
                        oooO00o.OooO00o();
                        return true;
                    }
                    if (this.mOrientationHelper.OooO0o0(viewFindViewByPosition) - this.mOrientationHelper.OooOO0O() < 0) {
                        oooO00o.f7458OooO0OO = this.mOrientationHelper.OooOO0O();
                        oooO00o.f7459OooO0Oo = false;
                        return true;
                    }
                    if (this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(viewFindViewByPosition) < 0) {
                        oooO00o.f7458OooO0OO = this.mOrientationHelper.OooO0oO();
                        oooO00o.f7459OooO0Oo = true;
                        return true;
                    }
                    oooO00o.f7458OooO0OO = oooO00o.f7459OooO0Oo ? this.mOrientationHelper.OooOOO0() + this.mOrientationHelper.OooO0O0(viewFindViewByPosition) : this.mOrientationHelper.OooO0o0(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO00o oooO00o) {
        if (updateAnchorFromPendingData(o0ooo0o2, oooO00o) || updateAnchorFromChildren(o00ooo2, o0ooo0o2, oooO00o)) {
            return;
        }
        oooO00o.OooO00o();
        oooO00o.f7457OooO0O0 = this.mStackFromEnd ? o0ooo0o2.OooO0O0() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.o0OOO0o o0ooo0o2) {
        int iOooOO0O;
        this.mLayoutState.f7476OooOO0o = resolveIsInfinite();
        this.mLayoutState.f7470OooO0o = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(o0ooo0o2, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        OooO0OO oooO0OO = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        oooO0OO.f7473OooO0oo = i3;
        if (!z2) {
            iMax = iMax2;
        }
        oooO0OO.f7465OooO = iMax;
        if (z2) {
            oooO0OO.f7473OooO0oo = this.mOrientationHelper.OooO0oo() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f7471OooO0o0 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            OooO0OO oooO0OO3 = this.mLayoutState;
            oooO0OO2.f7469OooO0Oo = position + oooO0OO3.f7471OooO0o0;
            oooO0OO3.f7467OooO0O0 = this.mOrientationHelper.OooO0O0(childClosestToEnd);
            iOooOO0O = this.mOrientationHelper.OooO0O0(childClosestToEnd) - this.mOrientationHelper.OooO0oO();
        } else {
            View childClosestToStart = getChildClosestToStart();
            OooO0OO oooO0OO4 = this.mLayoutState;
            oooO0OO4.f7473OooO0oo = this.mOrientationHelper.OooOO0O() + oooO0OO4.f7473OooO0oo;
            OooO0OO oooO0OO5 = this.mLayoutState;
            oooO0OO5.f7471OooO0o0 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            OooO0OO oooO0OO6 = this.mLayoutState;
            oooO0OO5.f7469OooO0Oo = position2 + oooO0OO6.f7471OooO0o0;
            oooO0OO6.f7467OooO0O0 = this.mOrientationHelper.OooO0o0(childClosestToStart);
            iOooOO0O = (-this.mOrientationHelper.OooO0o0(childClosestToStart)) + this.mOrientationHelper.OooOO0O();
        }
        OooO0OO oooO0OO7 = this.mLayoutState;
        oooO0OO7.f7468OooO0OO = i2;
        if (z) {
            oooO0OO7.f7468OooO0OO = i2 - iOooOO0O;
        }
        oooO0OO7.f7472OooO0oO = iOooOO0O;
    }

    private void updateLayoutStateToFillEnd(OooO00o oooO00o) {
        updateLayoutStateToFillEnd(oooO00o.f7457OooO0O0, oooO00o.f7458OooO0OO);
    }

    private void updateLayoutStateToFillStart(OooO00o oooO00o) {
        updateLayoutStateToFillStart(oooO00o.f7457OooO0O0, oooO00o.f7458OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.o0OOO0o o0ooo0o2, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(o0ooo0o2);
        if (this.mLayoutState.f7470OooO0o == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.o0OOO0o o0ooo0o2, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, o0ooo0o2);
        collectPrefetchPositionsForLayoutState(o0ooo0o2, this.mLayoutState, oooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            i2 = savedState.f7477OooO0Oo;
            if (i2 >= 0) {
                z = savedState.f7478OooO0o;
            } else {
                resolveShouldLayoutReverse();
                z = this.mShouldReverseLayout;
                i2 = this.mPendingScrollPosition;
                if (i2 == -1) {
                    if (z) {
                        i2 = i - 1;
                    } else {
                        i2 = 0;
                    }
                }
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((o000oOoO.OooO0O0) oooO0OO).OooO00o(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.o0OOO0o o0ooo0o2, OooO0OO oooO0OO, RecyclerView.Oooo000.OooO0OO oooO0OO2) {
        int i = oooO0OO.f7469OooO0Oo;
        if (i < 0 || i >= o0ooo0o2.OooO0O0()) {
            return;
        }
        ((o000oOoO.OooO0O0) oooO0OO2).OooO00o(i, Math.max(0, oooO0OO.f7472OooO0oO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0ooOOo.OooO0O0
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollExtent(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollOffset(o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.o0OOO0o o0ooo0o2) {
        return computeScrollRange(o0ooo0o2);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public OooO0OO createLayoutState() {
        return new OooO0OO();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.o00Ooo o00ooo2, OooO0OO oooO0OO, RecyclerView.o0OOO0o o0ooo0o2, boolean z) {
        int i = oooO0OO.f7468OooO0OO;
        int i2 = oooO0OO.f7472OooO0oO;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                oooO0OO.f7472OooO0oO = i2 + i;
            }
            recycleByLayoutState(o00ooo2, oooO0OO);
        }
        int i3 = oooO0OO.f7468OooO0OO + oooO0OO.f7473OooO0oo;
        OooO0O0 oooO0O0 = this.mLayoutChunkResult;
        while (true) {
            if (!oooO0OO.f7476OooOO0o && i3 <= 0) {
                break;
            }
            int i4 = oooO0OO.f7469OooO0Oo;
            if (!(i4 >= 0 && i4 < o0ooo0o2.OooO0O0())) {
                break;
            }
            oooO0O0.f7461OooO00o = 0;
            oooO0O0.f7462OooO0O0 = false;
            oooO0O0.f7463OooO0OO = false;
            oooO0O0.f7464OooO0Oo = false;
            layoutChunk(o00ooo2, o0ooo0o2, oooO0OO, oooO0O0);
            if (!oooO0O0.f7462OooO0O0) {
                int i5 = oooO0OO.f7467OooO0O0;
                int i6 = oooO0O0.f7461OooO00o;
                oooO0OO.f7467OooO0O0 = (oooO0OO.f7470OooO0o * i6) + i5;
                if (!oooO0O0.f7463OooO0OO || oooO0OO.f7475OooOO0O != null || !o0ooo0o2.f7674OooO0oO) {
                    oooO0OO.f7468OooO0OO -= i6;
                    i3 -= i6;
                }
                int i7 = oooO0OO.f7472OooO0oO;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    oooO0OO.f7472OooO0oO = i8;
                    int i9 = oooO0OO.f7468OooO0OO;
                    if (i9 < 0) {
                        oooO0OO.f7472OooO0oO = i8 + i9;
                    }
                    recycleByLayoutState(o00ooo2, oooO0OO);
                }
                if (z && oooO0O0.f7464OooO0Oo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - oooO0OO.f7468OooO0OO;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        byte b;
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 > i) {
            b = 1;
        } else {
            b = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.OooO0o0(getChildAt(i)) < this.mOrientationHelper.OooOO0O()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.OooO00o(i, i2, i3, i4) : this.mVerticalBoundCheck.OooO00o(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.OooO00o(i, i2, i3, i4) : this.mVerticalBoundCheck.OooO00o(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        int iOooOO0O = this.mOrientationHelper.OooOO0O();
        int iOooO0oO = this.mOrientationHelper.OooO0oO();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iOooO0o0 = this.mOrientationHelper.OooO0o0(childAt);
            int iOooO0O1 = this.mOrientationHelper.OooO0O0(childAt);
            if (position >= 0 && position < iOooO0O0) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO0OO()) {
                    boolean z3 = iOooO0O1 <= iOooOO0O && iOooO0o0 < iOooOO0O;
                    boolean z4 = iOooO0o0 >= iOooO0oO && iOooO0O1 > iOooO0oO;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.o0OOO0o o0ooo0o2) {
        if (o0ooo0o2.f7668OooO00o != -1) {
            return this.mOrientationHelper.OooOO0o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int i;
        int i2;
        int i3;
        int paddingLeft;
        int iOooO0Oo;
        View viewOooO0O0 = oooO0OO.OooO0O0(o00ooo2);
        if (viewOooO0O0 == null) {
            oooO0O0.f7462OooO0O0 = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewOooO0O0.getLayoutParams();
        if (oooO0OO.f7475OooOO0O == null) {
            if (this.mShouldReverseLayout == (oooO0OO.f7470OooO0o == -1)) {
                addView(viewOooO0O0);
            } else {
                addView(viewOooO0O0, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (oooO0OO.f7470OooO0o == -1)) {
                addDisappearingView(viewOooO0O0);
            } else {
                addDisappearingView(viewOooO0O0, 0);
            }
        }
        measureChildWithMargins(viewOooO0O0, 0, 0);
        oooO0O0.f7461OooO00o = this.mOrientationHelper.OooO0OO(viewOooO0O0);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iOooO0Oo = getWidth() - getPaddingRight();
                paddingLeft = iOooO0Oo - this.mOrientationHelper.OooO0Oo(viewOooO0O0);
            } else {
                paddingLeft = getPaddingLeft();
                iOooO0Oo = this.mOrientationHelper.OooO0Oo(viewOooO0O0) + paddingLeft;
            }
            if (oooO0OO.f7470OooO0o == -1) {
                int i4 = oooO0OO.f7467OooO0O0;
                i3 = i4;
                i2 = iOooO0Oo;
                i = i4 - oooO0O0.f7461OooO00o;
            } else {
                int i5 = oooO0OO.f7467OooO0O0;
                i = i5;
                i2 = iOooO0Oo;
                i3 = oooO0O0.f7461OooO00o + i5;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iOooO0Oo2 = this.mOrientationHelper.OooO0Oo(viewOooO0O0) + paddingTop;
            if (oooO0OO.f7470OooO0o == -1) {
                int i6 = oooO0OO.f7467OooO0O0;
                i2 = i6;
                i = paddingTop;
                i3 = iOooO0Oo2;
                paddingLeft = i6 - oooO0O0.f7461OooO00o;
            } else {
                int i7 = oooO0OO.f7467OooO0O0;
                i = paddingTop;
                i2 = oooO0O0.f7461OooO00o + i7;
                i3 = iOooO0Oo2;
                paddingLeft = i7;
            }
        }
        layoutDecoratedWithMargins(viewOooO0O0, paddingLeft, i, i2, i3);
        if (layoutParams.OooO0OO() || layoutParams.OooO0O0()) {
            oooO0O0.f7463OooO0OO = true;
        }
        oooO0O0.f7464OooO0Oo = viewOooO0O0.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2, OooO00o oooO00o, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo2) {
        super.onDetachedFromWindow(recyclerView, o00ooo2);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(o00ooo2);
            o00ooo2.f7658OooO00o.clear();
            o00ooo2.OooO0oo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.OooOO0o() * MAX_SCROLL_FACTOR), false, o0ooo0o2);
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f7472OooO0oO = Integer.MIN_VALUE;
        oooO0OO.f7466OooO00o = false;
        fill(o00ooo2, oooO0OO, o0ooo0o2, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iOooO0o0;
        int iOooO0oO;
        int i6 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && o0ooo0o2.OooO0O0() == 0) {
            removeAndRecycleAllViews(o00ooo2);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            int i7 = savedState.f7477OooO0Oo;
            if (i7 >= 0) {
                this.mPendingScrollPosition = i7;
            }
        }
        ensureLayoutState();
        this.mLayoutState.f7466OooO00o = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        OooO00o oooO00o = this.mAnchorInfo;
        if (!oooO00o.f7460OooO0o0 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            oooO00o.OooO0Oo();
            OooO00o oooO00o2 = this.mAnchorInfo;
            oooO00o2.f7459OooO0Oo = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(o00ooo2, o0ooo0o2, oooO00o2);
            this.mAnchorInfo.f7460OooO0o0 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.OooO0o0(focusedChild) >= this.mOrientationHelper.OooO0oO() || this.mOrientationHelper.OooO0O0(focusedChild) <= this.mOrientationHelper.OooOO0O())) {
            this.mAnchorInfo.OooO0OO(getPosition(focusedChild), focusedChild);
        }
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f7470OooO0o = oooO0OO.f7474OooOO0 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(o0ooo0o2, iArr);
        int iOooOO0O = this.mOrientationHelper.OooOO0O() + Math.max(0, this.mReusableIntPair[0]);
        int iOooO0oo = this.mOrientationHelper.OooO0oo() + Math.max(0, this.mReusableIntPair[1]);
        if (o0ooo0o2.f7674OooO0oO && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iOooO0oO = this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(viewFindViewByPosition);
                iOooO0o0 = this.mPendingScrollPositionOffset;
            } else {
                iOooO0o0 = this.mOrientationHelper.OooO0o0(viewFindViewByPosition) - this.mOrientationHelper.OooOO0O();
                iOooO0oO = this.mPendingScrollPositionOffset;
            }
            int i8 = iOooO0oO - iOooO0o0;
            if (i8 > 0) {
                iOooOO0O += i8;
            } else {
                iOooO0oo -= i8;
            }
        }
        OooO00o oooO00o3 = this.mAnchorInfo;
        if (!oooO00o3.f7459OooO0Oo ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i6 = 1;
        }
        onAnchorReady(o00ooo2, o0ooo0o2, oooO00o3, i6);
        detachAndScrapAttachedViews(o00ooo2);
        this.mLayoutState.f7476OooOO0o = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f7465OooO = 0;
        OooO00o oooO00o4 = this.mAnchorInfo;
        if (oooO00o4.f7459OooO0Oo) {
            updateLayoutStateToFillStart(oooO00o4);
            OooO0OO oooO0OO2 = this.mLayoutState;
            oooO0OO2.f7473OooO0oo = iOooOO0O;
            fill(o00ooo2, oooO0OO2, o0ooo0o2, false);
            OooO0OO oooO0OO3 = this.mLayoutState;
            i2 = oooO0OO3.f7467OooO0O0;
            int i9 = oooO0OO3.f7469OooO0Oo;
            int i10 = oooO0OO3.f7468OooO0OO;
            if (i10 > 0) {
                iOooO0oo += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            OooO0OO oooO0OO4 = this.mLayoutState;
            oooO0OO4.f7473OooO0oo = iOooO0oo;
            oooO0OO4.f7469OooO0Oo += oooO0OO4.f7471OooO0o0;
            fill(o00ooo2, oooO0OO4, o0ooo0o2, false);
            OooO0OO oooO0OO5 = this.mLayoutState;
            i = oooO0OO5.f7467OooO0O0;
            int i11 = oooO0OO5.f7468OooO0OO;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i2);
                OooO0OO oooO0OO6 = this.mLayoutState;
                oooO0OO6.f7473OooO0oo = i11;
                fill(o00ooo2, oooO0OO6, o0ooo0o2, false);
                i2 = this.mLayoutState.f7467OooO0O0;
            }
        } else {
            updateLayoutStateToFillEnd(oooO00o4);
            OooO0OO oooO0OO7 = this.mLayoutState;
            oooO0OO7.f7473OooO0oo = iOooO0oo;
            fill(o00ooo2, oooO0OO7, o0ooo0o2, false);
            OooO0OO oooO0OO8 = this.mLayoutState;
            int i12 = oooO0OO8.f7467OooO0O0;
            int i13 = oooO0OO8.f7469OooO0Oo;
            int i14 = oooO0OO8.f7468OooO0OO;
            if (i14 > 0) {
                iOooOO0O += i14;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            OooO0OO oooO0OO9 = this.mLayoutState;
            oooO0OO9.f7473OooO0oo = iOooOO0O;
            oooO0OO9.f7469OooO0Oo += oooO0OO9.f7471OooO0o0;
            fill(o00ooo2, oooO0OO9, o0ooo0o2, false);
            OooO0OO oooO0OO10 = this.mLayoutState;
            int i15 = oooO0OO10.f7467OooO0O0;
            int i16 = oooO0OO10.f7468OooO0OO;
            if (i16 > 0) {
                updateLayoutStateToFillEnd(i13, i12);
                OooO0OO oooO0OO11 = this.mLayoutState;
                oooO0OO11.f7473OooO0oo = i16;
                fill(o00ooo2, oooO0OO11, o0ooo0o2, false);
                i = this.mLayoutState.f7467OooO0O0;
            } else {
                i = i12;
            }
            i2 = i15;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, o00ooo2, o0ooo0o2, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, o00ooo2, o0ooo0o2, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, o00ooo2, o0ooo0o2, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, o00ooo2, o0ooo0o2, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(o00ooo2, o0ooo0o2, i2, i);
        if (o0ooo0o2.f7674OooO0oO) {
            this.mAnchorInfo.OooO0Oo();
        } else {
            o0O0O00 o0o0o00 = this.mOrientationHelper;
            o0o0o00.f7814OooO0O0 = o0o0o00.OooOO0o();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.o0OOO0o o0ooo0o2) {
        super.onLayoutCompleted(o0ooo0o2);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.OooO0Oo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f7477OooO0Oo = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.f7478OooO0o = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.f7479OooO0o0 = this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(childClosestToEnd);
                savedState2.f7477OooO0Oo = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.f7477OooO0Oo = getPosition(childClosestToStart);
                savedState2.f7479OooO0o0 = this.mOrientationHelper.OooO0o0(childClosestToStart) - this.mOrientationHelper.OooOO0O();
            }
        } else {
            savedState2.f7477OooO0Oo = -1;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooOO0O
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0oO() - (this.mOrientationHelper.OooO0OO(view) + this.mOrientationHelper.OooO0o0(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0oO() - this.mOrientationHelper.OooO0O0(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0o0(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.OooO0O0(view2) - this.mOrientationHelper.OooO0OO(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.OooO() == 0 && this.mOrientationHelper.OooO0o() == 0;
    }

    public int scrollBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f7466OooO00o = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, o0ooo0o2);
        OooO0OO oooO0OO = this.mLayoutState;
        int iFill = fill(o00ooo2, oooO0OO, o0ooo0o2, false) + oooO0OO.f7472OooO0oO;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.OooOOOo(-i);
        this.mLayoutState.f7474OooOO0 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, o00ooo2, o0ooo0o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f7477OooO0Oo = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f7477OooO0Oo = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.o00Ooo o00ooo2, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, o00ooo2, o0ooo0o2);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("invalid orientation:", i));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            o0O0O00 o0o0o00OooO00o = o0O0O00.OooO00o(this, i);
            this.mOrientationHelper = o0o0o00OooO00o;
            this.mAnchorInfo.f7456OooO00o = o0o0o00OooO00o;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        oo000o oo000oVar = new oo000o(recyclerView.getContext());
        oo000oVar.setTargetPosition(i);
        startSmoothScroll(oo000oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iOooO0o0 = this.mOrientationHelper.OooO0o0(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iOooO0o1 = this.mOrientationHelper.OooO0o0(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iOooO0o1 < iOooO0o0);
                    throw new RuntimeException(sb.toString());
                }
                if (iOooO0o1 > iOooO0o0) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iOooO0o2 = this.mOrientationHelper.OooO0o0(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iOooO0o2 < iOooO0o0);
                throw new RuntimeException(sb2.toString());
            }
            if (iOooO0o2 < iOooO0o0) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new OooO00o();
        this.mLayoutChunkResult = new OooO0O0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f7468OooO0OO = this.mOrientationHelper.OooO0oO() - i2;
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f7471OooO0o0 = this.mShouldReverseLayout ? -1 : 1;
        oooO0OO.f7469OooO0Oo = i;
        oooO0OO.f7470OooO0o = 1;
        oooO0OO.f7467OooO0O0 = i2;
        oooO0OO.f7472OooO0oO = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f7468OooO0OO = i2 - this.mOrientationHelper.OooOO0O();
        OooO0OO oooO0OO = this.mLayoutState;
        oooO0OO.f7469OooO0Oo = i;
        oooO0OO.f7471OooO0o0 = this.mShouldReverseLayout ? 1 : -1;
        oooO0OO.f7470OooO0o = -1;
        oooO0OO.f7467OooO0O0 = i2;
        oooO0OO.f7472OooO0oO = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new OooO00o();
        this.mLayoutChunkResult = new OooO0O0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.Oooo000.OooO0o properties = RecyclerView.Oooo000.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f7646OooO00o);
        setReverseLayout(properties.f7648OooO0OO);
        setStackFromEnd(properties.f7649OooO0Oo);
    }
}
