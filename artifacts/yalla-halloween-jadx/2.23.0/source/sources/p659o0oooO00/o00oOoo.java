package p659o0oooO00;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0ooO f60246OooO00o = new o0O0ooO(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f60247OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<o0O0ooO>[] f60248OooO0OO;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f60247OooO0O0 = iHighestOneBit;
        AtomicReference<o0O0ooO>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f60248OooO0OO = atomicReferenceArr;
    }

    @JvmStatic
    public static final void OooO00o(@NotNull o0O0ooO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        boolean z = true;
        if (!(segment.f60253OooO0o == null && segment.f60255OooO0oO == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f60252OooO0Oo) {
            return;
        }
        AtomicReference<o0O0ooO> atomicReference = f60248OooO0OO[(int) (Thread.currentThread().getId() & (((long) f60247OooO0O0) - 1))];
        o0O0ooO o0o0ooo = atomicReference.get();
        if (o0o0ooo == f60246OooO00o) {
            return;
        }
        int i = o0o0ooo != null ? o0o0ooo.f60251OooO0OO : 0;
        if (i >= 65536) {
            return;
        }
        segment.f60253OooO0o = o0o0ooo;
        segment.f60250OooO0O0 = 0;
        segment.f60251OooO0OO = i + 8192;
        while (!atomicReference.compareAndSet(o0o0ooo, segment)) {
            if (atomicReference.get() != o0o0ooo) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        segment.f60253OooO0o = null;
    }

    @JvmStatic
    @NotNull
    public static final o0O0ooO OooO0O0() {
        AtomicReference<o0O0ooO> atomicReference = f60248OooO0OO[(int) (Thread.currentThread().getId() & (((long) f60247OooO0O0) - 1))];
        o0O0ooO o0o0ooo = f60246OooO00o;
        o0O0ooO andSet = atomicReference.getAndSet(o0o0ooo);
        if (andSet == o0o0ooo) {
            return new o0O0ooO();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new o0O0ooO();
        }
        atomicReference.set(andSet.f60253OooO0o);
        andSet.f60253OooO0o = null;
        andSet.f60251OooO0OO = 0;
        return andSet;
    }
}
