package p399o0Oo00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends o0000Ooo {
    public static int OooO0o0(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 1;
        if (i >= length) {
            return 1;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return 4;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i3 = i + 1;
            i2 = 2;
            if (i3 >= length) {
                return 2;
            }
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return 3;
            }
        }
        return i2;
    }

    @Override // p399o0Oo00oo.o0000Ooo, p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.OooO00o(str, barcodeFormat, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    @Override // p399o0Oo00oo.o0000Ooo
    public final boolean[] OooO0OO(String str) {
        int iOooO0o0;
        char cCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
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
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = 103;
            if (i2 >= length) {
                int[][] iArr = o0Oo0oo.f38999OooO00o;
                arrayList.add(iArr[i3 % 103]);
                arrayList.add(iArr[106]);
                int i7 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i8 : iArr2) {
                        i7 += i8;
                    }
                }
                boolean[] zArr = new boolean[i7];
                Iterator it = arrayList.iterator();
                int iOooO0O0 = 0;
                while (it.hasNext()) {
                    iOooO0O0 += o0000Ooo.OooO0O0(zArr, iOooO0O0, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iOooO0o1 = OooO0o0(str, i2);
            int i9 = 99;
            int iCharAt = 101;
            if (iOooO0o1 == 2) {
                i9 = 100;
            } else if (iOooO0o1 == 1) {
                if (i2 >= str.length() || ((cCharAt = str.charAt(i2)) >= ' ' && (i4 != 101 || cCharAt >= '`'))) {
                    i9 = 100;
                } else {
                    i9 = 101;
                }
            } else if (i4 != 99) {
                if (i4 == 100) {
                    if (iOooO0o1 != 4 && (iOooO0o0 = OooO0o0(str, i2 + 2)) != 1 && iOooO0o0 != 2) {
                        if (iOooO0o0 != 4) {
                            int i10 = i2 + 4;
                            while (true) {
                                int iOooO0o2 = OooO0o0(str, i10);
                                if (iOooO0o2 == 3) {
                                    i10 += 2;
                                } else if (iOooO0o2 != 2) {
                                    i9 = 99;
                                }
                            }
                        } else if (OooO0o0(str, i2 + 3) == 3) {
                            i9 = 99;
                        }
                    }
                    i9 = 100;
                } else {
                    if (iOooO0o1 == 4) {
                        iOooO0o1 = OooO0o0(str, i2 + 1);
                    }
                    if (iOooO0o1 == 3) {
                        i9 = 99;
                    } else {
                        i9 = 100;
                    }
                }
            }
            if (i9 == i4) {
                switch (str.charAt(i2)) {
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
                        if (i4 != 101) {
                            iCharAt = 100;
                        }
                        break;
                    default:
                        if (i4 == 100) {
                            iCharAt = str.charAt(i2) - ' ';
                        } else if (i4 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i2, i2 + 2));
                            i2++;
                        } else {
                            iCharAt = str.charAt(i2) - ' ';
                            if (iCharAt < 0) {
                                iCharAt += 96;
                            }
                        }
                        break;
                }
                i2++;
            } else {
                if (i4 != 0) {
                    i6 = i9;
                } else if (i9 == 100) {
                    i6 = 104;
                } else if (i9 != 101) {
                    i6 = 105;
                }
                iCharAt = i6;
                i4 = i9;
            }
            arrayList.add(o0Oo0oo.f38999OooO00o[iCharAt]);
            i3 += iCharAt * i5;
            if (i2 != 0) {
                i5++;
            }
        }
    }
}
