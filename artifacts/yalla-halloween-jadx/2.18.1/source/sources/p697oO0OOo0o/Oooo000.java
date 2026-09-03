package p697oO0OOo0o;

import p399o0Oo00oo.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Oooo000 {
    public static void OooO00o(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            o00000OO.OooO00o(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static int OooO0O0(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (iArr2[0] == 0) {
            int i4 = i;
            int i5 = 0;
            while (true) {
                i4--;
                if (i4 >= 0) {
                    int i6 = iArr2[i4];
                    iArr2[i4] = i5;
                    i5 = i6;
                }
            }
            i3 += 32;
        }
        int i7 = iArr2[0];
        int i8 = 0;
        while ((i7 & 1) == 0) {
            i7 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i8)) | (i10 >>> i8);
                i9 = i10;
            }
            i3 += i8;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            if ((iArr3[0] & 1) != 0) {
                i2 = (i2 < 0 ? o00000OO.OooO0Oo(length, iArr, iArr3) : o00000OO.OooOo(length, iArr, iArr3)) + i2;
            }
            int i12 = i2;
            int i13 = length;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    int i14 = iArr3[i13];
                    iArr3[i13] = (i12 << 31) | (i14 >>> 1);
                    i12 = i14;
                }
            }
        }
        return i2;
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (o00000OO.OooOOo0(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int iOooO0O0 = 0;
        if (o00000OO.OooOOOo(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArr4 = new int[length];
        System.arraycopy(iArr2, 0, iArr4, 0, length);
        int[] iArr5 = new int[length];
        iArr5[0] = 1;
        int iOooO0O1 = (1 & iArr4[0]) == 0 ? OooO0O0(iArr, iArr4, length, iArr5, 0) : 0;
        if (o00000OO.OooOOOo(length, iArr4)) {
            OooO00o(iArr, iOooO0O1, iArr5, iArr3);
            return;
        }
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        int[] iArr7 = new int[length];
        int i = length;
        while (true) {
            int i2 = i - 1;
            if (iArr4[i2] == 0 && iArr6[i2] == 0) {
                i = i2;
            } else if (o00000OO.OooOO0O(i, iArr4, iArr6)) {
                o00000OO.OooOo(i, iArr6, iArr4);
                iOooO0O1 = OooO0O0(iArr, iArr4, i, iArr5, (o00000OO.OooOo(length, iArr7, iArr5) - iOooO0O0) + iOooO0O1);
                if (o00000OO.OooOOOo(i, iArr4)) {
                    OooO00o(iArr, iOooO0O1, iArr5, iArr3);
                    return;
                }
            } else {
                o00000OO.OooOo(i, iArr4, iArr6);
                iOooO0O0 = OooO0O0(iArr, iArr6, i, iArr7, (o00000OO.OooOo(length, iArr5, iArr7) - iOooO0O1) + iOooO0O0);
                if (o00000OO.OooOOOo(i, iArr6)) {
                    OooO00o(iArr, iOooO0O0, iArr7, iArr3);
                    return;
                }
            }
        }
    }
}
