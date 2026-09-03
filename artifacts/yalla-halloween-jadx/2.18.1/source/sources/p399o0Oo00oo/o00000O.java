package p399o0Oo00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.Map;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f38985OooO00o = {1, 1, 1, 1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f38986OooO0O0 = {3, 1, 1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f38987OooO0OO = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p399o0Oo00oo.o0000Ooo, p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.OooO00o(str, barcodeFormat, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p399o0Oo00oo.o0000Ooo
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iOooO0O0 = o0000Ooo.OooO0O0(zArr, 0, f38985OooO00o, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = f38987OooO0OO;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iOooO0O0 += o0000Ooo.OooO0O0(zArr, iOooO0O0, iArr, true);
        }
        o0000Ooo.OooO0O0(zArr, iOooO0O0, f38986OooO0O0, true);
        return zArr;
    }
}
