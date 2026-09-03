package oO0OOooO;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p399o0Oo00oo.o00000OO;
import p697oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52857OooO00o = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52858OooO0O0 = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        o0OoOo0.OooOOOO(iArr, iArr2, iArr4);
        OooO0O0(iArr4, iArr3);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[i3 + 8];
            iArr2[0 + i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = ((long) 19) & 4294967295L;
        long j2 = ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (j * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j8 >>> 32);
        iArr2[7] = (int) j9;
        int i5 = iArr2[7];
        int i6 = ((i5 >>> 31) - (i >>> 31)) + (((int) (j9 >>> 32)) << 1);
        iArr2[7] = o00000OO.OooO0oO(7, i6 * 19, iArr2) + (Integer.MAX_VALUE & i5);
        if (o0OoOo0.OooOO0(iArr2, f52857OooO00o)) {
            OooO0o(iArr2);
        }
    }

    public static void OooO0OO(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = o00000OO.OooO0oO(7, ((i << 1) | (i2 >>> 31)) * 19, iArr) + (i2 & Integer.MAX_VALUE);
        if (o0OoOo0.OooOO0(iArr, f52857OooO00o)) {
            OooO0o(iArr);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        o0OoOo0.OooOOo0(iArr, iArr3);
        OooO0O0(iArr3, iArr2);
    }

    public static int OooO0o(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jOooOOO = j >> 32;
        if (jOooOOO != 0) {
            jOooOOO = o00000OO.OooOOO(7, iArr, 1);
        }
        long j2 = ((4294967295L & ((long) iArr[7])) - 2147483648L) + jOooOOO;
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static void OooO0o0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        o0OoOo0.OooOOo0(iArr, iArr3);
        while (true) {
            OooO0O0(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                o0OoOo0.OooOOo0(iArr2, iArr3);
            }
        }
    }

    public static void OooO0oO(int[] iArr, int[] iArr2, int[] iArr3) {
        if (o0OoOo0.OooOOoo(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long jOooO0oo = j >> 32;
            if (jOooO0oo != 0) {
                jOooO0oo = o00000OO.OooO0oo(7, iArr3, 1);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + jOooO0oo);
        }
    }

    public static void OooO0oo(int[] iArr, int[] iArr2) {
        o00000OO.OooOOo(8, iArr, 0, iArr2);
        if (o0OoOo0.OooOO0(iArr2, f52857OooO00o)) {
            OooO0o(iArr2);
        }
    }
}
