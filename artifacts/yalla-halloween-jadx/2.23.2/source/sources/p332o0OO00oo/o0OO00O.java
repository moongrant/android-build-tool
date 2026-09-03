package p332o0OO00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0O.OooO0o;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OO00O implements OooO0o {
    public static int OooO0O0(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    @Override // o0O.OooO0o
    public OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iOooO0Oo = OooO0Oo();
        EncodeHintType encodeHintType = EncodeHintType.MARGIN;
        if (enumMap.containsKey(encodeHintType)) {
            iOooO0Oo = Integer.parseInt(enumMap.get(encodeHintType).toString());
        }
        boolean[] zArrOooO0OO = OooO0OO(str);
        int length = zArrOooO0OO.length;
        int i = iOooO0Oo + length;
        int iMax = Math.max(200, i);
        int iMax2 = Math.max(1, 200);
        int i2 = iMax / i;
        int i3 = (iMax - (length * i2)) / 2;
        OooO0O0 oooO0O0 = new OooO0O0(iMax, iMax2);
        int i4 = 0;
        while (i4 < length) {
            if (zArrOooO0OO[i4]) {
                oooO0O0.OooO0o0(i3, 0, i2, iMax2);
            }
            i4++;
            i3 += i2;
        }
        return oooO0O0;
    }

    public abstract boolean[] OooO0OO(String str);

    public int OooO0Oo() {
        return 10;
    }
}
