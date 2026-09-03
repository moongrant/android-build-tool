package org.conscrypt;

import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes4.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("length=", i, "; regionStart=", i2, "; regionLength=");
            sbOooO0O0.append(i3);
            throw new ArrayIndexOutOfBoundsException(sbOooO0O0.toString());
        }
    }
}
