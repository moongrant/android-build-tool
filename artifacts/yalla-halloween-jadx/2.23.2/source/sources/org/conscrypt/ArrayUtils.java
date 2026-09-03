package org.conscrypt;

import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes5.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sbOooO00o = o00000.OooO00o("length=", i, "; regionStart=", i2, "; regionLength=");
            sbOooO00o.append(i3);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }
    }
}
