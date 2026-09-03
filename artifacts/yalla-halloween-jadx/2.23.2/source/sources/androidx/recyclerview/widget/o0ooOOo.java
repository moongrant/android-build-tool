package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo extends o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public o0O0O00 f10957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f10958OooO0O0;

    @Nullable
    public static View OooO0O0(RecyclerView.Oooo000 oooo000, o000OOo o000ooo2) {
        int childCount = oooo000.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iOooOO0o = (o000ooo2.OooOO0o() / 2) + o000ooo2.OooOO0O();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oooo000.getChildAt(i2);
            int iAbs = Math.abs(((o000ooo2.OooO0OO(childAt) / 2) + o000ooo2.OooO0o0(childAt)) - iOooOO0o);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final int OooO00o(RecyclerView.Oooo000 oooo000, o000OOo o000ooo2, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = oooo000.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = oooo000.getChildAt(i5);
                int position = oooo000.getPosition(childAt);
                if (position != -1) {
                    if (position < i4) {
                        view = childAt;
                        i4 = position;
                    }
                    if (position > i3) {
                        view2 = childAt;
                        i3 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(o000ooo2.OooO0O0(view), o000ooo2.OooO0O0(view2)) - Math.min(o000ooo2.OooO0o0(view), o000ooo2.OooO0o0(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f);
    }

    @Override // androidx.recyclerview.widget.o00000O
    public final int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.Oooo000 oooo000, @NonNull View view) {
        int[] iArr = new int[2];
        if (oooo000.canScrollHorizontally()) {
            o000OOo horizontalHelper = getHorizontalHelper(oooo000);
            iArr[0] = ((horizontalHelper.OooO0OO(view) / 2) + horizontalHelper.OooO0o0(view)) - ((horizontalHelper.OooOO0o() / 2) + horizontalHelper.OooOO0O());
        } else {
            iArr[0] = 0;
        }
        if (oooo000.canScrollVertically()) {
            o000OOo verticalHelper = getVerticalHelper(oooo000);
            iArr[1] = ((verticalHelper.OooO0OO(view) / 2) + verticalHelper.OooO0o0(view)) - ((verticalHelper.OooOO0o() / 2) + verticalHelper.OooOO0O());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o00000O
    public final View findSnapView(RecyclerView.Oooo000 oooo000) {
        if (oooo000.canScrollVertically()) {
            return OooO0O0(oooo000, getVerticalHelper(oooo000));
        }
        if (oooo000.canScrollHorizontally()) {
            return OooO0O0(oooo000, getHorizontalHelper(oooo000));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.o00000O
    public final int findTargetSnapPosition(RecyclerView.Oooo000 oooo000, int i, int i2) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iOooO00o;
        int iOooO00o2;
        if (!(oooo000 instanceof RecyclerView.o0ooOOo.OooO0O0) || (itemCount = oooo000.getItemCount()) == 0 || (viewFindSnapView = findSnapView(oooo000)) == null || (position = oooo000.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.o0ooOOo.OooO0O0) oooo000).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (oooo000.canScrollHorizontally()) {
            iOooO00o = OooO00o(oooo000, getHorizontalHelper(oooo000), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iOooO00o = -iOooO00o;
            }
        } else {
            iOooO00o = 0;
        }
        if (oooo000.canScrollVertically()) {
            iOooO00o2 = OooO00o(oooo000, getVerticalHelper(oooo000), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iOooO00o2 = -iOooO00o2;
            }
        } else {
            iOooO00o2 = 0;
        }
        if (oooo000.canScrollVertically()) {
            iOooO00o = iOooO00o2;
        }
        if (iOooO00o == 0) {
            return -1;
        }
        int i4 = position + iOooO00o;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    @NonNull
    public final o000OOo getHorizontalHelper(@NonNull RecyclerView.Oooo000 oooo000) {
        oo0o0Oo oo0o0oo = this.f10958OooO0O0;
        if (oo0o0oo == null || oo0o0oo.f10843OooO00o != oooo000) {
            this.f10958OooO0O0 = new oo0o0Oo(oooo000);
        }
        return this.f10958OooO0O0;
    }

    @NonNull
    public final o000OOo getVerticalHelper(@NonNull RecyclerView.Oooo000 oooo000) {
        o0O0O00 o0o0o00 = this.f10957OooO00o;
        if (o0o0o00 == null || o0o0o00.f10843OooO00o != oooo000) {
            this.f10957OooO00o = new o0O0O00(oooo000);
        }
        return this.f10957OooO00o;
    }
}
