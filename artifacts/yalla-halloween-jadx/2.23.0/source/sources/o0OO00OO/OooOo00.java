package o0OO00OO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends o00O0O {
    @Override // o0OO00OO.Oooo0, p326o0O0oooO.o0o0Oo
    public final o0OO000.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // o0OO00OO.Oooo0
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + o0OoOo0.OooO0O0(str);
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
        boolean[] zArr = new boolean[67];
        int iOooO0O0 = Oooo0.OooO0O0(zArr, 0, o0OoOo0.f43034OooO00o, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iOooO0O0 += Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43037OooO0Oo[Character.digit(str.charAt(i), 10)], false);
        }
        int iOooO0O1 = Oooo0.OooO0O0(zArr, iOooO0O0, o0OoOo0.f43035OooO0O0, false) + iOooO0O0;
        for (int i2 = 4; i2 <= 7; i2++) {
            iOooO0O1 += Oooo0.OooO0O0(zArr, iOooO0O1, o0OoOo0.f43037OooO0Oo[Character.digit(str.charAt(i2), 10)], true);
        }
        Oooo0.OooO0O0(zArr, iOooO0O1, o0OoOo0.f43034OooO00o, true);
        return zArr;
    }
}
