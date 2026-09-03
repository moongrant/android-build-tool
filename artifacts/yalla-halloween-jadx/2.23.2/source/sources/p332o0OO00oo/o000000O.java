package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends o000OOo {
    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + o0O0O00.OooO0Oo(o000000.OooO0o0(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!o0O0O00.OooO0OO(str)) {
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
        int i = o000000.f42340OooO0o[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iOooO0O0 = o0OO00O.OooO0O0(zArr, 0, o0O0O00.f42345OooO00o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iOooO0O0 += o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42349OooO0o0[iDigit2], false);
        }
        o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42347OooO0OO, false);
        return zArr;
    }
}
