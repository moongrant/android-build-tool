package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import javax.annotation.CheckForNull;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o0O0O00 {
    public static Object OooO00o(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(p166o00Ooo00.o0OOO0o.OooO00o(52, "must be power of 2 between 2^1 and 2^30: ", i));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static int OooO0O0(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int i2 = iOooO0OO & i;
        int iOooO0OO2 = OooO0OO(i2, obj3);
        if (iOooO0OO2 == 0) {
            return -1;
        }
        int i3 = ~i;
        int i4 = iOooO0OO & i3;
        int i5 = -1;
        while (true) {
            int i6 = iOooO0OO2 - 1;
            int i7 = iArr[i6];
            if ((i7 & i3) == i4 && com.google.common.base.Oooo000.OooO00o(obj, objArr[i6]) && (objArr2 == null || com.google.common.base.Oooo000.OooO00o(obj2, objArr2[i6]))) {
                int i8 = i7 & i;
                if (i5 == -1) {
                    OooO0Oo(i2, i8, obj3);
                } else {
                    iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                }
                return i6;
            }
            int i9 = i7 & i;
            if (i9 == 0) {
                return -1;
            }
            i5 = i6;
            iOooO0OO2 = i9;
        }
    }

    public static int OooO0OO(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & UShort.MAX_VALUE : ((int[]) obj)[i];
    }

    public static void OooO0Oo(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
