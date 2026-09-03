package p399o0Oo00oo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import p390o0OOooOO.o0;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000Ooo implements o0 {
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

    @Override // p390o0OOooOO.o0
    public o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iOooO0Oo = OooO0Oo();
        EncodeHintType encodeHintType = EncodeHintType.MARGIN;
        if (map.containsKey(encodeHintType)) {
            iOooO0Oo = Integer.parseInt(map.get(encodeHintType).toString());
        }
        boolean[] zArrOooO0OO = OooO0OO(str);
        int length = zArrOooO0OO.length;
        int i = iOooO0Oo + length;
        int iMax = Math.max(200, i);
        int iMax2 = Math.max(1, 200);
        int i2 = iMax / i;
        int i3 = (iMax - (length * i2)) / 2;
        o00000OO o00000oo2 = new o00000OO(iMax, iMax2);
        int i4 = 0;
        while (i4 < length) {
            if (zArrOooO0OO[i4]) {
                o00000oo2.OooO0o0(i3, 0, i2, iMax2);
            }
            i4++;
            i3 += i2;
        }
        return o00000oo2;
    }

    public abstract boolean[] OooO0OO(String str);

    public int OooO0Oo() {
        return 10;
    }
}
