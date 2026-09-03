package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000o.OooO0O0;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends o0OO00O {
    public static int OooO0o(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static void OooO0o0(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static void OooO0oO(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        OooO0oO(o00Ooo.f42343OooO00o[47], iArr);
        boolean[] zArr = new boolean[length2];
        OooO0o0(zArr, 0, iArr);
        int i = 9;
        for (int i2 = 0; i2 < length; i2++) {
            OooO0oO(o00Ooo.f42343OooO00o["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
            OooO0o0(zArr, i, iArr);
            i += 9;
        }
        int iOooO0o = OooO0o(20, str);
        int[] iArr2 = o00Ooo.f42343OooO00o;
        OooO0oO(iArr2[iOooO0o], iArr);
        OooO0o0(zArr, i, iArr);
        int i3 = i + 9;
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(str);
        sbOooO00o.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iOooO0o));
        OooO0oO(iArr2[OooO0o(15, sbOooO00o.toString())], iArr);
        OooO0o0(zArr, i3, iArr);
        int i4 = i3 + 9;
        OooO0oO(iArr2[47], iArr);
        OooO0o0(zArr, i4, iArr);
        zArr[i4 + 9] = true;
        return zArr;
    }
}
