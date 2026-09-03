package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f7787OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f7788OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ThreadLocal<o000oOoO> f7785OooO0oo = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f7784OooO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<RecyclerView> f7786OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<OooO0OO> f7789OooO0oO = new ArrayList<>();

    public class OooO00o implements Comparator<OooO0OO> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            OooO0OO oooO0OO3 = oooO0OO;
            OooO0OO oooO0OO4 = oooO0OO2;
            RecyclerView recyclerView = oooO0OO3.f7797OooO0Oo;
            if ((recyclerView == null) == (oooO0OO4.f7797OooO0Oo == null)) {
                boolean z = oooO0OO3.f7794OooO00o;
                if (z == oooO0OO4.f7794OooO00o) {
                    int i = oooO0OO4.f7795OooO0O0 - oooO0OO3.f7795OooO0O0;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = oooO0OO3.f7796OooO0OO - oooO0OO4.f7796OooO0OO;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class OooO0O0 implements RecyclerView.Oooo000.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7790OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7791OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f7792OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7793OooO0Oo;

        public final void OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f7793OooO0Oo * 2;
            int[] iArr = this.f7792OooO0OO;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f7792OooO0OO = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f7792OooO0OO = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f7792OooO0OO;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f7793OooO0Oo++;
        }

        public final void OooO0O0(RecyclerView recyclerView, boolean z) {
            this.f7793OooO0Oo = 0;
            int[] iArr = this.f7792OooO0OO;
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
                oooo000.collectAdjacentPrefetchPositions(this.f7790OooO00o, this.f7791OooO0O0, recyclerView.mState, this);
            }
            int i = this.f7793OooO0Oo;
            if (i > oooo000.mPrefetchMaxCountObserved) {
                oooo000.mPrefetchMaxCountObserved = i;
                oooo000.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.OooOOOO();
            }
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f7794OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7795OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7796OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public RecyclerView f7797OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7798OooO0o0;
    }

    public static RecyclerView.o0O0O00 OooO0OO(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iOooO0oo = recyclerView.mChildHelper.OooO0oo();
        int i2 = 0;
        while (true) {
            if (i2 >= iOooO0oo) {
                z = false;
                break;
            }
            RecyclerView.o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.OooO0oO(i2));
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
            RecyclerView.o0O0O00 o0o0o00OooOOO0 = o00ooo2.OooOOO0(j, i);
            if (o0o0o00OooOOO0 != null) {
                if (!o0o0o00OooOOO0.isBound() || o0o0o00OooOOO0.isInvalid()) {
                    o00ooo2.OooO00o(o0o0o00OooOOO0, false);
                } else {
                    o00ooo2.OooOO0(o0o0o00OooOOO0.itemView);
                }
            }
            return o0o0o00OooOOO0;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f7788OooO0o0 == 0) {
            this.f7788OooO0o0 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
        oooO0O0.f7790OooO00o = i;
        oooO0O0.f7791OooO0O0 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    public final void OooO0O0(long j) {
        OooO0OO oooO0OO;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        OooO0OO oooO0OO2;
        ArrayList<RecyclerView> arrayList = this.f7786OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.OooO0O0(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f7793OooO0Oo;
            }
        }
        ArrayList<OooO0OO> arrayList2 = this.f7789OooO0oO;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                OooO0O0 oooO0O0 = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(oooO0O0.f7791OooO0O0) + Math.abs(oooO0O0.f7790OooO00o);
                for (int i5 = 0; i5 < oooO0O0.f7793OooO0Oo * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        oooO0OO2 = new OooO0OO();
                        arrayList2.add(oooO0OO2);
                    } else {
                        oooO0OO2 = arrayList2.get(i3);
                    }
                    int[] iArr = oooO0O0.f7792OooO0OO;
                    int i6 = iArr[i5 + 1];
                    oooO0OO2.f7794OooO00o = i6 <= iAbs;
                    oooO0OO2.f7795OooO0O0 = iAbs;
                    oooO0OO2.f7796OooO0OO = i6;
                    oooO0OO2.f7797OooO0Oo = recyclerView4;
                    oooO0OO2.f7798OooO0o0 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f7784OooO);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (oooO0OO = arrayList2.get(i7)).f7797OooO0Oo) != null; i7++) {
            RecyclerView.o0O0O00 o0o0o00OooO0OO = OooO0OO(recyclerView, oooO0OO.f7798OooO0o0, oooO0OO.f7794OooO00o ? LongCompanionObject.MAX_VALUE : j);
            if (o0o0o00OooO0OO != null && o0o0o00OooO0OO.mNestedRecyclerView != null && o0o0o00OooO0OO.isBound() && !o0o0o00OooO0OO.isInvalid() && (recyclerView2 = o0o0o00OooO0OO.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.OooO0oo() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                OooO0O0 oooO0O1 = recyclerView2.mPrefetchRegistry;
                oooO0O1.OooO0O0(recyclerView2, true);
                if (oooO0O1.f7793OooO0Oo != 0) {
                    try {
                        int i8 = p063o0000oO.o00000O0.f34291OooO00o;
                        o0000oO.o00000O0.OooO00o.OooO00o("RV Nested Prefetch");
                        RecyclerView.o0OOO0o o0ooo0o2 = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        o0ooo0o2.f7671OooO0Oo = 1;
                        o0ooo0o2.f7673OooO0o0 = adapter.getItemCount();
                        o0ooo0o2.f7674OooO0oO = false;
                        o0ooo0o2.f7675OooO0oo = false;
                        o0ooo0o2.f7667OooO = false;
                        for (int i9 = 0; i9 < oooO0O1.f7793OooO0Oo * 2; i9 += 2) {
                            OooO0OO(recyclerView2, oooO0O1.f7792OooO0OO[i9], j);
                        }
                        o0000oO.o00000O0.OooO00o.OooO0O0();
                    } catch (Throwable th) {
                        int i10 = p063o0000oO.o00000O0.f34291OooO00o;
                        o0000oO.o00000O0.OooO00o.OooO0O0();
                        throw th;
                    }
                }
            }
            oooO0OO.f7794OooO00o = false;
            oooO0OO.f7795OooO0O0 = 0;
            oooO0OO.f7796OooO0OO = 0;
            oooO0OO.f7797OooO0Oo = null;
            oooO0OO.f7798OooO0o0 = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = p063o0000oO.o00000O0.f34291OooO00o;
            o0000oO.o00000O0.OooO00o.OooO00o("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f7786OooO0Oo;
            if (arrayList.isEmpty()) {
                this.f7788OooO0o0 = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f7788OooO0o0 = 0L;
            } else {
                OooO0O0(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7787OooO0o);
                this.f7788OooO0o0 = 0L;
            }
        } finally {
            this.f7788OooO0o0 = 0L;
            int i3 = p063o0000oO.o00000O0.f34291OooO00o;
            o0000oO.o00000O0.OooO00o.OooO0O0();
        }
    }
}
