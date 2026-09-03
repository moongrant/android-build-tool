package p332o0OO00oo;

import OooO0OO.OooO00o;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import kotlin.text.Typography;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends o0OO00O {
    public static void OooO0o0(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p332o0OO00oo.o0OO00O, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    @Override // p332o0OO00oo.o0OO00O
    public final boolean[] OooO0OO(String str) {
        int[] iArr;
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == 0) {
                        sb.append("%U");
                    } else if (cCharAt == ' ') {
                        sb.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb.append("%V");
                    } else if (cCharAt == '`') {
                        sb.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb.append(Typography.dollar);
                        sb.append((char) ((cCharAt - 1) + 65));
                    } else if (cCharAt < ' ') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - 27) + 65));
                    } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                        sb.append('/');
                        sb.append((char) ((cCharAt - '!') + 65));
                    } else if (cCharAt <= '9') {
                        sb.append((char) ((cCharAt - '0') + 48));
                    } else if (cCharAt <= '?') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - ';') + 70));
                    } else if (cCharAt <= 'Z') {
                        sb.append((char) ((cCharAt - 'A') + 65));
                    } else if (cCharAt <= '_') {
                        sb.append('%');
                        sb.append((char) ((cCharAt - '[') + 75));
                    } else if (cCharAt <= 'z') {
                        sb.append('+');
                        sb.append((char) ((cCharAt - 'a') + 65));
                    } else {
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                        }
                        sb.append('%');
                        sb.append((char) ((cCharAt - '{') + 80));
                    }
                }
                str = sb.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(OooO00o.OooO00o("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)"));
            }
        }
        int[] iArr2 = new int[9];
        int i3 = length + 25;
        int i4 = 0;
        while (true) {
            iArr = o00O0O.f42342OooO00o;
            if (i4 >= length) {
                break;
            }
            OooO0o0(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr2);
            for (int i5 = 0; i5 < 9; i5++) {
                i3 += iArr2[i5];
            }
            i4++;
        }
        boolean[] zArr = new boolean[i3];
        OooO0o0(148, iArr2);
        int iOooO0O0 = o0OO00O.OooO0O0(zArr, 0, iArr2, true);
        int[] iArr3 = {1};
        int iOooO0O1 = o0OO00O.OooO0O0(zArr, iOooO0O0, iArr3, false) + iOooO0O0;
        for (int i6 = 0; i6 < length; i6++) {
            OooO0o0(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr2);
            int iOooO0O2 = o0OO00O.OooO0O0(zArr, iOooO0O1, iArr2, true) + iOooO0O1;
            iOooO0O1 = o0OO00O.OooO0O0(zArr, iOooO0O2, iArr3, false) + iOooO0O2;
        }
        OooO0o0(148, iArr2);
        o0OO00O.OooO0O0(zArr, iOooO0O1, iArr2, true);
        return zArr;
    }
}
