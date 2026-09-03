package o0OO00OO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o00O0O {
    @Override // o0OO00OO.Oooo0, p326o0O0oooO.o0o0Oo
    public final o0OO000.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // o0OO00OO.Oooo0
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + o0OoOo0.OooO0O0(o00Oo0.OooO0OO(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!o0OoOo0.OooO00o(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = o00Oo0.f43033OooO0o[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iOooO0O0 = Oooo0.OooO0O0(zArr, 0, o0OoOo0.f43034OooO00o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iOooO0O0 += Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43038OooO0o0[iDigit2], false);
        }
        Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43036OooO0OO, false);
        return zArr;
    }
}
