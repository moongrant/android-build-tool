package org.jctools.util;

/* JADX INFO: loaded from: classes5.dex */
public final class Pow2 {
    public static final int MAX_POW2 = 1073741824;

    public static long align(long j, int i) {
        if (!isPowerOfTwo(i)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("alignment must be a power of 2:", i));
        }
        int i2 = i - 1;
        return (j + ((long) i2)) & ((long) (~i2));
    }

    public static boolean isPowerOfTwo(int i) {
        return (i & (i + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i) {
        if (i > 1073741824) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("There is no larger power of 2 int for value:", i, " since it exceeds 2^31."));
        }
        if (i >= 0) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Given value:", i, ". Expecting value >= 0."));
    }
}
