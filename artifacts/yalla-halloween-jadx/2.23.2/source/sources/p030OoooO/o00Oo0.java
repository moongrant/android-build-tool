package p030OoooO;

import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import o000OO.OooOOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f1350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f1351OooO0o0;

    public o00Oo0(o00Ooo o00ooo2, int i, OooOO0O oooOO0O) {
        this.f1350OooO0o = o00ooo2;
        this.f1349OooO0Oo = i;
        this.f1351OooO0o0 = oooOO0O;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        o000Oo0.OooO00o oooO00o;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i = this.f1349OooO0Oo;
        OooOO0O oooOO0O = this.f1351OooO0o0;
        o00Ooo o00ooo2 = this.f1350OooO0o;
        AtomicInteger atomicInteger = o00ooo2.f1356OooO0oO;
        ArrayList arrayList7 = o00ooo2.f1355OooO0o0;
        boolean zIsDone = o00ooo2.isDone();
        boolean z = o00ooo2.f1354OooO0o;
        if (zIsDone || arrayList7 == null) {
            OooOOO0.OooO0o("Future was done before all dependencies completed", z);
            return;
        }
        try {
            OooOOO0.OooO0o("Tried to set value from future which is not done", oooOO0O.isDone());
            arrayList7.set(i, OooOo.OooO0OO(oooOO0O));
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet >= 0);
            if (iDecrementAndGet == 0) {
                if (arrayList6 != null) {
                    oooO00o = o00ooo2.f1352OooO;
                    arrayList2 = new ArrayList(arrayList6);
                    oooO00o.OooO0O0(arrayList2);
                }
            }
        } catch (ExecutionException e) {
            if (z) {
                o00ooo2.f1352OooO.OooO0OO(e.getCause());
            }
            int iDecrementAndGet2 = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
            if (iDecrementAndGet2 == 0) {
                if (arrayList5 != null) {
                    oooO00o = o00ooo2.f1352OooO;
                    arrayList2 = new ArrayList(arrayList5);
                }
            }
        } catch (Error e2) {
            o00ooo2.f1352OooO.OooO0OO(e2);
            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
            if (iDecrementAndGet3 == 0) {
                if (arrayList4 != null) {
                    oooO00o = o00ooo2.f1352OooO;
                    arrayList2 = new ArrayList(arrayList4);
                }
            }
        } catch (CancellationException unused) {
            if (z) {
                o00ooo2.cancel(false);
            }
            int iDecrementAndGet4 = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
            if (iDecrementAndGet4 == 0) {
                if (arrayList3 != null) {
                    oooO00o = o00ooo2.f1352OooO;
                    arrayList2 = new ArrayList(arrayList3);
                }
            }
        } catch (RuntimeException e3) {
            if (z) {
                o00ooo2.f1352OooO.OooO0OO(e3);
            }
            int iDecrementAndGet5 = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
            if (iDecrementAndGet5 == 0) {
                if (arrayList != null) {
                    oooO00o = o00ooo2.f1352OooO;
                    arrayList2 = new ArrayList(arrayList);
                }
            }
        } finally {
            int iDecrementAndGet6 = atomicInteger.decrementAndGet();
            OooOOO0.OooO0o("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
            if (iDecrementAndGet6 == 0) {
                ArrayList arrayList8 = o00ooo2.f1355OooO0o0;
                if (arrayList8 != null) {
                    o00ooo2.f1352OooO.OooO0O0(new ArrayList(arrayList8));
                } else {
                    OooOOO0.OooO0o(null, o00ooo2.isDone());
                }
            }
        }
    }
}
