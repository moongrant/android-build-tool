package o0OO00OO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o00O0O {
    @Override // o0OO00OO.Oooo0, p326o0O0oooO.o0o0Oo
    public final o0OO000.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // o0OO00OO.Oooo0
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + o0OoOo0.OooO0O0(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!o0OoOo0.OooO00o(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = OooOOO.f43028OooO0o[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iOooO0O0 = Oooo0.OooO0O0(zArr, 0, o0OoOo0.f43034OooO00o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iOooO0O0 += Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43038OooO0o0[iDigit], false);
        }
        int iOooO0O1 = Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43035OooO0O0, false) + iOooO0O0;
        for (int i3 = 7; i3 <= 12; i3++) {
            iOooO0O1 += Oooo0.OooO0O0(zArr, iOooO0O1, o0OoOo0.f43037OooO0Oo[Character.digit(str.charAt(i3), 10)], true);
        }
        Oooo0.OooO0O0(zArr, iOooO0O1, o0OoOo0.f43034OooO00o, true);
        return zArr;
    }
}
