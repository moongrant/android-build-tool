package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f9170Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f9171Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final ThreadLocal<o000oOoO> f9167OoooO00 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static Comparator<OooO0OO> f9166OoooO0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ArrayList<RecyclerView> f9169Oooo0o = new ArrayList<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ArrayList<OooO0OO> f9168Oooo = new ArrayList<>();

    public class OooO00o implements Comparator<OooO0OO> {
        /* JADX WARN: Code duplicated, block: B:17:0x0022  */
        @Override // java.util.Comparator
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            OooO0OO oooO0OO3 = oooO0OO;
            OooO0OO oooO0OO4 = oooO0OO2;
            RecyclerView recyclerView = oooO0OO3.f9179OooO0Oo;
            int i = 1;
            if ((recyclerView == null) == (oooO0OO4.f9179OooO0Oo == null)) {
                boolean z = oooO0OO3.f9176OooO00o;
                if (z == oooO0OO4.f9176OooO00o) {
                    int i2 = oooO0OO4.f9177OooO0O0 - oooO0OO3.f9177OooO0O0;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = oooO0OO3.f9178OooO0OO - oooO0OO4.f9178OooO0OO;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
                if (z) {
                    i = -1;
                }
            } else if (recyclerView != null) {
                i = -1;
            }
            return i;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class OooO0O0 implements RecyclerView.Oooo000.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9172OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9173OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f9174OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9175OooO0Oo;

        public final void OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f9175OooO0Oo * 2;
            int[] iArr = this.f9174OooO0OO;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f9174OooO0OO = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f9174OooO0OO = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f9174OooO0OO;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f9175OooO0Oo++;
        }

        public final void OooO0O0(RecyclerView recyclerView, boolean z) {
            this.f9175OooO0Oo = 0;
            int[] iArr = this.f9174OooO0OO;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.Oooo000 oooo000 = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oooo000 == null || !oooo000.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.OooO0oO()) {
                    oooo000.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oooo000.collectAdjacentPrefetchPositions(this.f9172OooO00o, this.f9173OooO0O0, recyclerView.mState, this);
            }
            int i = this.f9175OooO0Oo;
            if (i > oooo000.mPrefetchMaxCountObserved) {
                oooo000.mPrefetchMaxCountObserved = i;
                oooo000.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.OooOOO();
            }
        }

        public final boolean OooO0OO(int i) {
            if (this.f9174OooO0OO != null) {
                int i2 = this.f9175OooO0Oo * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f9174OooO0OO[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f9176OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9177OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9178OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public RecyclerView f9179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9180OooO0o0;
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f9170Oooo0oO == 0) {
            this.f9170Oooo0oO = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
        oooO0O0.f9172OooO00o = i;
        oooO0O0.f9173OooO0O0 = i2;
    }

    public final void OooO0O0(long j) {
        OooO0OO oooO0OO;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        OooO0OO oooO0OO2;
        int size = this.f9169Oooo0o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f9169Oooo0o.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.OooO0O0(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f9175OooO0Oo;
            }
        }
        this.f9168Oooo.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f9169Oooo0o.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                OooO0O0 oooO0O0 = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(oooO0O0.f9173OooO0O0) + Math.abs(oooO0O0.f9172OooO00o);
                for (int i5 = 0; i5 < oooO0O0.f9175OooO0Oo * 2; i5 += 2) {
                    if (i3 >= this.f9168Oooo.size()) {
                        oooO0OO2 = new OooO0OO();
                        this.f9168Oooo.add(oooO0OO2);
                    } else {
                        oooO0OO2 = this.f9168Oooo.get(i3);
                    }
                    int[] iArr = oooO0O0.f9174OooO0OO;
                    int i6 = iArr[i5 + 1];
                    oooO0OO2.f9176OooO00o = i6 <= iAbs;
                    oooO0OO2.f9177OooO0O0 = iAbs;
                    oooO0OO2.f9178OooO0OO = i6;
                    oooO0OO2.f9179OooO0Oo = recyclerView4;
                    oooO0OO2.f9180OooO0o0 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f9168Oooo, f9166OoooO0);
        for (int i7 = 0; i7 < this.f9168Oooo.size() && (recyclerView = (oooO0OO = this.f9168Oooo.get(i7)).f9179OooO0Oo) != null; i7++) {
            RecyclerView.oo0o0Oo oo0o0ooOooO0OO = OooO0OO(recyclerView, oooO0OO.f9180OooO0o0, oooO0OO.f9176OooO00o ? Long.MAX_VALUE : j);
            if (oo0o0ooOooO0OO != null && oo0o0ooOooO0OO.mNestedRecyclerView != null && oo0o0ooOooO0OO.isBound() && !oo0o0ooOooO0OO.isInvalid() && (recyclerView2 = oo0o0ooOooO0OO.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.OooO0oo() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                OooO0O0 oooO0O1 = recyclerView2.mPrefetchRegistry;
                oooO0O1.OooO0O0(recyclerView2, true);
                if (oooO0O1.f9175OooO0Oo != 0) {
                    try {
                        int i8 = o000O00O.OooOo.f28095OooO00o;
                        o000O00O.OooOo.OooO00o.OooO00o(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.o0OOO0o o0ooo0o2 = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        o0ooo0o2.f9060OooO0Oo = 1;
                        o0ooo0o2.f9062OooO0o0 = adapter.getItemCount();
                        o0ooo0o2.f9063OooO0oO = false;
                        o0ooo0o2.f9064OooO0oo = false;
                        o0ooo0o2.f9056OooO = false;
                        for (int i9 = 0; i9 < oooO0O1.f9175OooO0Oo * 2; i9 += 2) {
                            OooO0OO(recyclerView2, oooO0O1.f9174OooO0OO[i9], j);
                        }
                        o000O00O.OooOo.OooO00o.OooO0O0();
                    } catch (Throwable th) {
                        int i10 = o000O00O.OooOo.f28095OooO00o;
                        o000O00O.OooOo.OooO00o.OooO0O0();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            oooO0OO.f9176OooO00o = false;
            oooO0OO.f9177OooO0O0 = 0;
            oooO0OO.f9178OooO0OO = 0;
            oooO0OO.f9179OooO0Oo = null;
            oooO0OO.f9180OooO0o0 = 0;
        }
    }

    public final RecyclerView.oo0o0Oo OooO0OO(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iOooO0oo = recyclerView.mChildHelper.OooO0oo();
        int i2 = 0;
        while (true) {
            if (i2 >= iOooO0oo) {
                z = false;
                break;
            }
            RecyclerView.oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.o00Ooo o00ooo2 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.oo0o0Oo oo0o0ooOooOO0o = o00ooo2.OooOO0o(i, j);
            if (oo0o0ooOooOO0o != null) {
                if (!oo0o0ooOooOO0o.isBound() || oo0o0ooOooOO0o.isInvalid()) {
                    o00ooo2.OooO00o(oo0o0ooOooOO0o, false);
                } else {
                    o00ooo2.OooO(oo0o0ooOooOO0o.itemView);
                }
            }
            return oo0o0ooOooOO0o;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = o000O00O.OooOo.f28095OooO00o;
            o000O00O.OooOo.OooO00o.OooO00o(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f9169Oooo0o.isEmpty()) {
                this.f9170Oooo0oO = 0L;
                return;
            }
            int size = this.f9169Oooo0o.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f9169Oooo0o.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f9170Oooo0oO = 0L;
            } else {
                OooO0O0(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f9171Oooo0oo);
                this.f9170Oooo0oO = 0L;
            }
        } finally {
            this.f9170Oooo0oO = 0L;
            int i3 = o000O00O.OooOo.f28095OooO00o;
            o000O00O.OooOo.OooO00o.OooO0O0();
        }
    }
}
