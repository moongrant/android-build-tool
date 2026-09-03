package p399o0Oo00oo;

import android.support.v4.media.OooO00o;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends o0000oo {
    @Override // p399o0Oo00oo.o0000Ooo, p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.OooO00o(str, barcodeFormat, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // p399o0Oo00oo.o0000Ooo
    public final boolean[] OooO0OO(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = OooO00o.OooO00o(str, o0000O00.OooOoo(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!o0000O00.OooOoo0(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = o000000O.f38984OooO0o[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iOooO0O0 = o0000Ooo.OooO0O0(zArr, 0, o0000O00.f38989OooO00o, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iOooO0O0 += o0000Ooo.OooO0O0(zArr, iOooO0O0, o0000O00.f38993OooO0o0[iDigit], false);
        }
        int iOooO0O1 = o0000Ooo.OooO0O0(zArr, iOooO0O0, o0000O00.f38990OooO0O0, false) + iOooO0O0;
        for (int i3 = 7; i3 <= 12; i3++) {
            iOooO0O1 += o0000Ooo.OooO0O0(zArr, iOooO0O1, o0000O00.f38992OooO0Oo[Character.digit(str.charAt(i3), 10)], true);
        }
        o0000Ooo.OooO0O0(zArr, iOooO0O1, o0000O00.f38989OooO00o, true);
        return zArr;
    }
}
