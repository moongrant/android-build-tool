package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o000OOo extends o00000O0 {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @Nullable
    private o0O0O00 mHorizontalHelper;

    @Nullable
    private o0O0O00 mVerticalHelper;

    public class OooO00o extends oo000o {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.oo000o
        public final float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.oo000o
        public final int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.oo000o, androidx.recyclerview.widget.RecyclerView.o0ooOOo
        public final void onTargetFound(@NonNull View view, @NonNull RecyclerView.o0OOO0o o0ooo0o2, @NonNull RecyclerView.o0ooOOo.OooO00o oooO00o) {
            o000OOo o000ooo2 = o000OOo.this;
            int[] iArrCalculateDistanceToFinalSnap = o000ooo2.calculateDistanceToFinalSnap(o000ooo2.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                oooO00o.f7681OooO00o = i;
                oooO00o.f7682OooO0O0 = i2;
                oooO00o.f7683OooO0OO = iCalculateTimeForDeceleration;
                oooO00o.f7686OooO0o0 = decelerateInterpolator;
                oooO00o.f7685OooO0o = true;
            }
        }
    }

    private int distanceToCenter(@NonNull View view, o0O0O00 o0o0o00) {
        return ((o0o0o00.OooO0OO(view) / 2) + o0o0o00.OooO0o0(view)) - ((o0o0o00.OooOO0o() / 2) + o0o0o00.OooOO0O());
    }

    @Nullable
    private View findCenterView(RecyclerView.Oooo000 oooo000, o0O0O00 o0o0o00) {
        int childCount = oooo000.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iOooOO0o = (o0o0o00.OooOO0o() / 2) + o0o0o00.OooOO0O();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oooo000.getChildAt(i2);
            int iAbs = Math.abs(((o0o0o00.OooO0OO(childAt) / 2) + o0o0o00.OooO0o0(childAt)) - iOooOO0o);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @NonNull
    private o0O0O00 getHorizontalHelper(@NonNull RecyclerView.Oooo000 oooo000) {
        o0O0O00 o0o0o00 = this.mHorizontalHelper;
        if (o0o0o00 == null || o0o0o00.f7813OooO00o != oooo000) {
            this.mHorizontalHelper = new o0OO00O(oooo000);
        }
        return this.mHorizontalHelper;
    }

    @Nullable
    private o0O0O00 getOrientationHelper(RecyclerView.Oooo000 oooo000) {
        if (oooo000.canScrollVertically()) {
            return getVerticalHelper(oooo000);
        }
        if (oooo000.canScrollHorizontally()) {
            return getHorizontalHelper(oooo000);
        }
        return null;
    }

    @NonNull
    private o0O0O00 getVerticalHelper(@NonNull RecyclerView.Oooo000 oooo000) {
        o0O0O00 o0o0o00 = this.mVerticalHelper;
        if (o0o0o00 == null || o0o0o00.f7813OooO00o != oooo000) {
            this.mVerticalHelper = new oo0o0Oo(oooo000);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.Oooo000 oooo000, int i, int i2) {
        if (oooo000.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.Oooo000 oooo000) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = oooo000.getItemCount();
        if (!(oooo000 instanceof RecyclerView.o0ooOOo.OooO0O0) || (pointFComputeScrollVectorForPosition = ((RecyclerView.o0ooOOo.OooO0O0) oooo000).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.Oooo000 oooo000, @NonNull View view) {
        int[] iArr = new int[2];
        if (oooo000.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(oooo000));
        } else {
            iArr[0] = 0;
        }
        if (oooo000.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(oooo000));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    @Nullable
    public RecyclerView.o0ooOOo createScroller(@NonNull RecyclerView.Oooo000 oooo000) {
        if (oooo000 instanceof RecyclerView.o0ooOOo.OooO0O0) {
            return new OooO00o(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.Oooo000 oooo000) {
        if (oooo000.canScrollVertically()) {
            return findCenterView(oooo000, getVerticalHelper(oooo000));
        }
        if (oooo000.canScrollHorizontally()) {
            return findCenterView(oooo000, getHorizontalHelper(oooo000));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.Oooo000 oooo000, int i, int i2) {
        o0O0O00 orientationHelper;
        int itemCount = oooo000.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(oooo000)) == null) {
            return -1;
        }
        int childCount = oooo000.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = oooo000.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (iDistanceToCenter <= 0 && iDistanceToCenter > i4) {
                    view2 = childAt;
                    i4 = iDistanceToCenter;
                }
                if (iDistanceToCenter >= 0 && iDistanceToCenter < i3) {
                    view = childAt;
                    i3 = iDistanceToCenter;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(oooo000, i, i2);
        if (zIsForwardFling && view != null) {
            return oooo000.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return oooo000.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oooo000.getPosition(view) + (isReverseLayout(oooo000) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
