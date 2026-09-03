package p662o0oooO0O;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0Oo f59806OooO00o = new oO0Oo(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f59807OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<oO0Oo>[] f59808OooO0OO;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f59807OooO0O0 = iHighestOneBit;
        AtomicReference<oO0Oo>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f59808OooO0OO = atomicReferenceArr;
    }

    @JvmStatic
    public static final void OooO00o(@NotNull oO0Oo segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        boolean z = true;
        if (!(segment.f59824OooO0o == null && segment.f59826OooO0oO == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f59823OooO0Oo) {
            return;
        }
        AtomicReference<oO0Oo> atomicReference = f59808OooO0OO[(int) (Thread.currentThread().getId() & (((long) f59807OooO0O0) - 1))];
        oO0Oo oo0oo = atomicReference.get();
        if (oo0oo == f59806OooO00o) {
            return;
        }
        int i = oo0oo != null ? oo0oo.f59822OooO0OO : 0;
        if (i >= 65536) {
            return;
        }
        segment.f59824OooO0o = oo0oo;
        segment.f59821OooO0O0 = 0;
        segment.f59822OooO0OO = i + 8192;
        while (!atomicReference.compareAndSet(oo0oo, segment)) {
            if (atomicReference.get() != oo0oo) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        segment.f59824OooO0o = null;
    }

    @JvmStatic
    @NotNull
    public static final oO0Oo OooO0O0() {
        AtomicReference<oO0Oo> atomicReference = f59808OooO0OO[(int) (Thread.currentThread().getId() & (((long) f59807OooO0O0) - 1))];
        oO0Oo oo0oo = f59806OooO00o;
        oO0Oo andSet = atomicReference.getAndSet(oo0oo);
        if (andSet == oo0oo) {
            return new oO0Oo();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new oO0Oo();
        }
        atomicReference.set(andSet.f59824OooO0o);
        andSet.f59824OooO0o = null;
        andSet.f59822OooO0OO = 0;
        return andSet;
    }
}
