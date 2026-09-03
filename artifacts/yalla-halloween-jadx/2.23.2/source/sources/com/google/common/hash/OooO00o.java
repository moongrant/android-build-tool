package com.google.common.hash;

import com.google.common.base.o0OoOo0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLongArray f19242OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f19243OooO0O0;

    public OooO00o(long[] jArr) {
        o0OoOo0.OooO0o0(jArr.length > 0, "data length is zero!");
        this.f19242OooO00o = new AtomicLongArray(jArr);
        this.f19243OooO0O0 = OooO0OO.f19244OooO00o.get();
        long jBitCount = 0;
        for (long j : jArr) {
            jBitCount += (long) Long.bitCount(j);
        }
        this.f19243OooO0O0.OooO00o(jBitCount);
    }

    public static long[] OooO00o(AtomicLongArray atomicLongArray) {
        int length = atomicLongArray.length();
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = atomicLongArray.get(i);
        }
        return jArr;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof OooO00o) {
            return Arrays.equals(OooO00o(this.f19242OooO00o), OooO00o(((OooO00o) obj).f19242OooO00o));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(OooO00o(this.f19242OooO00o));
    }
}
