package p674o0oooo0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f52095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference<o0O00OOO>[] f52096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o0oO0Ooo f52097OooO0Oo = new o0oO0Ooo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O00OOO f52094OooO00o = new o0O00OOO(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f52095OooO0O0 = iHighestOneBit;
        AtomicReference<o0O00OOO>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f52096OooO0OO = atomicReferenceArr;
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull o0O00OOO segment) {
        AtomicReference<o0O00OOO> atomicReferenceOooO00o;
        o0O00OOO o0o00ooo2;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!(segment.f52071OooO0o == null && segment.f52073OooO0oO == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f52070OooO0Oo || (o0o00ooo2 = (atomicReferenceOooO00o = f52097OooO0Oo.OooO00o()).get()) == f52094OooO00o) {
            return;
        }
        int i = o0o00ooo2 != null ? o0o00ooo2.f52069OooO0OO : 0;
        if (i >= 65536) {
            return;
        }
        segment.f52071OooO0o = o0o00ooo2;
        segment.f52068OooO0O0 = 0;
        segment.f52069OooO0OO = i + 8192;
        if (atomicReferenceOooO00o.compareAndSet(o0o00ooo2, segment)) {
            return;
        }
        segment.f52071OooO0o = null;
    }

    @JvmStatic
    @NotNull
    public static final o0O00OOO OooO0OO() {
        AtomicReference<o0O00OOO> atomicReferenceOooO00o = f52097OooO0Oo.OooO00o();
        o0O00OOO o0o00ooo2 = f52094OooO00o;
        o0O00OOO andSet = atomicReferenceOooO00o.getAndSet(o0o00ooo2);
        if (andSet == o0o00ooo2) {
            return new o0O00OOO();
        }
        if (andSet == null) {
            atomicReferenceOooO00o.set(null);
            return new o0O00OOO();
        }
        atomicReferenceOooO00o.set(andSet.f52071OooO0o);
        andSet.f52071OooO0o = null;
        andSet.f52069OooO0OO = 0;
        return andSet;
    }

    public final AtomicReference<o0O00OOO> OooO00o() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        return f52096OooO0OO[(int) (threadCurrentThread.getId() & (((long) f52095OooO0O0) - 1))];
    }
}
