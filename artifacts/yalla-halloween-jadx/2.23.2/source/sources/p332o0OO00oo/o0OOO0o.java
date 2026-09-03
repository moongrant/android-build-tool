package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends o000OOo {
    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + o0O0O00.OooO0Oo(str);
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
        boolean[] zArr = new boolean[67];
        int iOooO0O0 = o0OO00O.OooO0O0(zArr, 0, o0O0O00.f42345OooO00o, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iOooO0O0 += o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42348OooO0Oo[Character.digit(str.charAt(i), 10)], false);
        }
        int iOooO0O1 = o0OO00O.OooO0O0(zArr, iOooO0O0, o0O0O00.f42346OooO0O0, false) + iOooO0O0;
        for (int i2 = 4; i2 <= 7; i2++) {
            iOooO0O1 += o0OO00O.OooO0O0(zArr, iOooO0O1, o0O0O00.f42348OooO0Oo[Character.digit(str.charAt(i2), 10)], true);
        }
        o0OO00O.OooO0O0(zArr, iOooO0O1, o0O0O00.f42345OooO00o, true);
        return zArr;
    }
}
