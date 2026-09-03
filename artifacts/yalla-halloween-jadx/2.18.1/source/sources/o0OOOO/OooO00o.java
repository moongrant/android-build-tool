package o0OOOO;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import o0OOOO0o.OooOOOO;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLongArray f38201OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f38202OooO0O0;

    public OooO00o(long[] jArr) {
        OooOOOO.OooO0Oo(jArr.length > 0, "data length is zero!");
        this.f38201OooO00o = new AtomicLongArray(jArr);
        this.f38202OooO0O0 = OooO0OO.f38203OooO00o.get();
        long jBitCount = 0;
        for (long j : jArr) {
            jBitCount += (long) Long.bitCount(j);
        }
        this.f38202OooO0O0.OooO00o(jBitCount);
    }

    public static long[] OooO00o(AtomicLongArray atomicLongArray) {
        int length = atomicLongArray.length();
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = atomicLongArray.get(i);
        }
        return jArr;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof OooO00o) {
            return Arrays.equals(OooO00o(this.f38201OooO00o), OooO00o(((OooO00o) obj).f38201OooO00o));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(OooO00o(this.f38201OooO00o));
    }
}
