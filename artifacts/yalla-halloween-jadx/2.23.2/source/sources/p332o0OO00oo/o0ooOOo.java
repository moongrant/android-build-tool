package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends o000OOo {
    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + o0O0O00.OooO0Oo(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!o0O0O00.OooO0OO(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = o00oO0o.f42344OooO0o[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iOooO0O0 = o0OO00O.OooO0O0(zArr, 0, o0O0O00.f42345OooO00o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iOooO0O0 += o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42349OooO0o0[iDigit], false);
        }
        int iOooO0O1 = o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42346OooO0O0, false) + iOooO0O0;
        for (int i3 = 7; i3 <= 12; i3++) {
            iOooO0O1 += o0OO00O.OooO0O0(zArr, iOooO0O1, o0O0O00.f42348OooO0Oo[Character.digit(str.charAt(i3), 10)], true);
        }
        o0OO00O.OooO0O0(zArr, iOooO0O1, o0O0O00.f42345OooO00o, true);
        return zArr;
    }
}
