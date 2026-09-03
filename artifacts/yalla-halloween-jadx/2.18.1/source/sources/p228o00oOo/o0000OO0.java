package p228o00oOo;

import android.util.Log;
import o000OOO.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000OO0 f33887OooO00o = new o0000OO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f33888OooO0O0 = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f33889OooO0OO = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f33890OooO0Oo = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void OooO(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        OooO0OO.OooO0oO(iArr, iArr3);
        OooO0oO(iArr3, iArr2);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        if (((int) (j4 >>> 32)) != 0 || (iArr3[3] == -3 && OooO0OO.OooO0OO(iArr3, f33888OooO0O0))) {
            OooO0O0(iArr3);
        }
    }

    public static void OooO0O0(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & ((long) iArr[3])) + 2 + j2);
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (!OooO0OO.OooO0Oo(iArr)) {
            OooO0OO.OooO0oo(f33888OooO0O0, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        OooO0OO.OooO0o0(iArr, iArr2, iArr4);
        OooO0oO(iArr4, iArr3);
    }

    public static void OooO0oO(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j3 + j10;
        long j12 = j6 + (j10 << 1);
        long j13 = j2 + j12;
        long j14 = j5 + (j12 << 1);
        long j15 = j + j14;
        iArr2[0] = (int) j15;
        long j16 = j13 + (j15 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j11 + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = j9 + (j14 << 1) + (j17 >>> 32);
        iArr2[3] = (int) j18;
        OooO0oo((int) (j18 >>> 32), iArr2);
    }

    public static void OooO0oo(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[3])) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void OooOO0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        OooO0OO.OooO0oO(iArr, iArr3);
        while (true) {
            OooO0oO(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                OooO0OO.OooO0oO(iArr2, iArr3);
            }
        }
    }

    public static void OooOO0O(int[] iArr, int[] iArr2, int[] iArr3) {
        if (OooO0OO.OooO0oo(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & ((long) iArr3[3])) - 2) + j2);
        }
    }

    public boolean OooO0OO(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void OooO0Oo(String str) {
        if (OooO0OO(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void OooOO0o(String str) {
        if (OooO0OO(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void OooOOO0(String str, Throwable th) {
        if (OooO0OO(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }
}
