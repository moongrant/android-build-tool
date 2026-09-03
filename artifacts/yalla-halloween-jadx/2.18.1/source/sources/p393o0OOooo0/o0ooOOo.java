package p393o0OOooo0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f38933OooO0O0 = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f38934OooO0OO = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[][] f38935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[][] f38936OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f38937OooO00o;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        f38935OooO0Oo = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f38935OooO0Oo[0][i] = (i - 65) + 2;
        }
        f38935OooO0Oo[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f38935OooO0Oo[1][i2] = (i2 - 97) + 2;
        }
        f38935OooO0Oo[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f38935OooO0Oo[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f38935OooO0Oo;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f38935OooO0Oo[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f38935OooO0Oo[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        f38936OooO0o0 = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f38936OooO0o0;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public o0ooOOo(byte[] bArr) {
        this.f38937OooO00o = bArr;
    }

    public static Collection<o0Oo0oo> OooO00o(Iterable<o0Oo0oo> iterable) {
        LinkedList linkedList = new LinkedList();
        for (o0Oo0oo o0oo0oo2 : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                o0Oo0oo o0oo0oo3 = (o0Oo0oo) it.next();
                if (o0oo0oo3.OooO0OO(o0oo0oo2)) {
                    z = false;
                    break;
                }
                if (o0oo0oo2.OooO0OO(o0oo0oo3)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(o0oo0oo2);
            }
        }
        return linkedList;
    }
}
