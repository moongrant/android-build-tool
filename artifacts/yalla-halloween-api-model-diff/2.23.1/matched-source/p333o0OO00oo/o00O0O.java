package p333o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends oo0o0Oo {

    public enum OooO00o {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static OooO00o OooO0o0(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= length) {
            return OooO00o.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return OooO00o.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return OooO00o.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return OooO00o.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i2);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? OooO00o.ONE_DIGIT : OooO00o.TWO_DIGITS;
    }

    @Override // p333o0OO00oo.oo0o0Oo, o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.OooO00o(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    @Override // p333o0OO00oo.oo0o0Oo
    public final boolean[] OooO0OO(String str) {
        int i;
        OooO00o oooO00oOooO0o0;
        char cCharAt;
        int i2;
        int iCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt2 = str.charAt(i3);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[][] iArr = o0OoOo0.f42347OooO00o;
            if (i5 >= length) {
                arrayList.add(iArr[i6 % 103]);
                arrayList.add(iArr[106]);
                int i8 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i9 : iArr2) {
                        i8 += i9;
                    }
                }
                boolean[] zArr = new boolean[i8];
                Iterator it = arrayList.iterator();
                int iOooO0O0 = 0;
                while (it.hasNext()) {
                    iOooO0O0 += oo0o0Oo.OooO0O0(zArr, iOooO0O0, (int[]) it.next(), true);
                }
                return zArr;
            }
            OooO00o oooO00oOooO0o1 = OooO0o0(i5, str);
            OooO00o oooO00o = OooO00o.ONE_DIGIT;
            if (oooO00oOooO0o1 != oooO00o) {
                OooO00o oooO00o2 = OooO00o.UNCODABLE;
                if (oooO00oOooO0o1 != oooO00o2) {
                    i = 99;
                    if (i7 != 99) {
                        if (i7 == 100) {
                            OooO00o oooO00o3 = OooO00o.FNC_1;
                            if (oooO00oOooO0o1 != oooO00o3 && (oooO00oOooO0o0 = OooO0o0(i5 + 2, str)) != oooO00o2 && oooO00oOooO0o0 != oooO00o) {
                                if (oooO00oOooO0o0 != oooO00o3) {
                                    int i10 = i5 + 4;
                                    while (true) {
                                        OooO00o oooO00oOooO0o2 = OooO0o0(i10, str);
                                        if (oooO00oOooO0o2 == OooO00o.TWO_DIGITS) {
                                            i10 += 2;
                                        } else if (oooO00oOooO0o2 != OooO00o.ONE_DIGIT) {
                                            i = 99;
                                        }
                                    }
                                } else if (OooO0o0(i5 + 3, str) == OooO00o.TWO_DIGITS) {
                                    i = 99;
                                }
                            }
                            i = 100;
                        } else {
                            if (oooO00oOooO0o1 == OooO00o.FNC_1) {
                                oooO00oOooO0o1 = OooO0o0(i5 + 1, str);
                            }
                            if (oooO00oOooO0o1 == OooO00o.TWO_DIGITS) {
                                i = 99;
                            } else {
                                i = 100;
                            }
                        }
                    }
                } else if (i5 >= str.length() || ((cCharAt = str.charAt(i5)) >= ' ' && (i7 != 101 || cCharAt >= '`'))) {
                    i = 100;
                } else {
                    i = 101;
                }
            } else {
                i = 100;
            }
            if (i == i7) {
                switch (str.charAt(i5)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        iCharAt = i7 == 101 ? 101 : 100;
                        break;
                    default:
                        if (i7 == 100) {
                            iCharAt = str.charAt(i5) - ' ';
                        } else if (i7 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i5, i5 + 2));
                            i5++;
                        } else {
                            iCharAt = str.charAt(i5) - ' ';
                            if (iCharAt < 0) {
                                iCharAt += 96;
                            }
                        }
                        break;
                }
                i5++;
            } else {
                if (i7 != 0) {
                    i2 = i;
                } else if (i != 100) {
                    i2 = i != 101 ? 105 : 103;
                } else {
                    i2 = 104;
                }
                i7 = i;
                iCharAt = i2;
            }
            arrayList.add(iArr[iCharAt]);
            i6 += iCharAt * i4;
            if (i5 != 0) {
                i4++;
            }
        }
    }
}
