package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f42350OooO00o = {1, 1, 1, 1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f42351OooO0O0 = {3, 1, 1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f42352OooO0OO = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iOooO0O0 = o0OO00O.OooO0O0(zArr, 0, f42350OooO00o, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = f42352OooO0OO;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iOooO0O0 += o0OO00O.OooO0O0(zArr, iOooO0O0, iArr, true);
        }
        o0OO00O.OooO0O0(zArr, iOooO0O0, f42351OooO0O0, true);
        return zArr;
    }
}
