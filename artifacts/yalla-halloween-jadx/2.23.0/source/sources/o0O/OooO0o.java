package o0O;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f41554OooO0O0 = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f41555OooO0OO = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[][] f41556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[][] f41557OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f41558OooO00o;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        f41556OooO0Oo = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f41556OooO0Oo[0][i] = (i - 65) + 2;
        }
        f41556OooO0Oo[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f41556OooO0Oo[1][i2] = (i2 - 97) + 2;
        }
        f41556OooO0Oo[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f41556OooO0Oo[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f41556OooO0Oo[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f41556OooO0Oo[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f41556OooO0Oo[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f41557OooO0o0 = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f41557OooO0o0;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public OooO0o(byte[] bArr) {
        this.f41558OooO00o = bArr;
    }

    public static LinkedList OooO00o(LinkedList linkedList) {
        boolean z;
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            OooOO0 oooOO1 = (OooOO0) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                OooOO0 oooOO2 = (OooOO0) it2.next();
                if (oooOO2.OooO0OO(oooOO1)) {
                    z = false;
                    break;
                }
                if (oooOO1.OooO0OO(oooOO2)) {
                    it2.remove();
                }
            }
            if (z) {
                linkedList2.add(oooOO1);
            }
        }
        return linkedList2;
    }
}
