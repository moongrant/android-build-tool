package p397o0Oo00o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import io.agora.rtc.Constants;
import java.util.Map;
import p390o0OOooOO.o0;
import p390o0OOooOO.oo00oO;
import p392o0OOooo.o00000OO;
import p398o0Oo00oO.OooOOOO;
import p398o0Oo00oO.OooOo;
import p398o0Oo00oO.OooOo00;
import p398o0Oo00oO.Oooo0;
import p398o0Oo00oO.o000oOoO;
import p398o0Oo00oO.o00O0O;
import p398o0Oo00oO.o00Oo0;
import p398o0Oo00oO.o00Ooo;
import p398o0Oo00oO.o00oO0o;
import p398o0Oo00oO.o0OoOo0;
import p398o0Oo00oO.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oo0000 implements o0 {
    @Override // p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) {
        int i;
        int i2;
        o00000OO o00000oo2;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
        if (symbolShapeHint2 != null) {
            symbolShapeHint = symbolShapeHint2;
        }
        oo00oO oo00oo = (oo00oO) map.get(EncodeHintType.MIN_SIZE);
        if (oo00oo == null) {
            oo00oo = null;
        }
        oo00oO oo00oo2 = (oo00oO) map.get(EncodeHintType.MAX_SIZE);
        oo00oO oo00oo3 = oo00oo2 != null ? oo00oo2 : null;
        o0OoOo0[] o0oooo0Arr = {new OooOOOO(), new OooOo(), new oo000o(), new o00oO0o(), new o000oOoO(), new OooOo00()};
        o00O0O o00o0o2 = new o00O0O(str);
        o00o0o2.f38963OooO0O0 = symbolShapeHint;
        o00o0o2.f38964OooO0OO = oo00oo;
        o00o0o2.f38965OooO0Oo = oo00oo3;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            o00o0o2.OooO0oO((char) 236);
            o00o0o2.f38961OooO = 2;
            o00o0o2.f38966OooO0o += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            o00o0o2.OooO0oO((char) 237);
            o00o0o2.f38961OooO = 2;
            o00o0o2.f38966OooO0o += 7;
        }
        int i3 = 0;
        while (o00o0o2.OooO0Oo()) {
            o0oooo0Arr[i3].OooO00o(o00o0o2);
            int i4 = o00o0o2.f38968OooO0oO;
            if (i4 >= 0) {
                o00o0o2.f38968OooO0oO = -1;
                i3 = i4;
            }
        }
        int iOooO00o = o00o0o2.OooO00o();
        o00o0o2.OooO0o0();
        int i5 = o00o0o2.f38969OooO0oo.f38976OooO0O0;
        if (iOooO00o < i5 && i3 != 0 && i3 != 5 && i3 != 4) {
            o00o0o2.OooO0oO((char) 254);
        }
        StringBuilder sb = o00o0o2.f38967OooO0o0;
        if (sb.length() < i5) {
            sb.append((char) 129);
        }
        while (sb.length() < i5) {
            int length = (((sb.length() + 1) * 149) % 253) + 1 + Constants.ERR_WATERMARK_READ;
            if (length > 254) {
                length -= 254;
            }
            sb.append((char) length);
        }
        String string = o00o0o2.f38967OooO0o0.toString();
        o00Ooo o00oooOooO = o00Ooo.OooO(string.length(), symbolShapeHint, oo00oo, oo00oo3);
        Oooo0 oooo0 = new Oooo0(o00Oo0.OooO0O0(string, o00oooOooO), o00oooOooO.OooO0o0(), o00oooOooO.OooO0Oo());
        int i6 = 4;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = oooo0.f38958OooO0O0;
            if (i6 == i9 && i7 == 0) {
                oooo0.OooO0O0(i9 - 1, 0, i8, 1);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 1, 1, i8, 2);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 1, 2, i8, 3);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 2, i8, 4);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 1, i8, 5);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 1, i8, 6);
                oooo0.OooO0O0(2, oooo0.f38959OooO0OO - 1, i8, 7);
                oooo0.OooO0O0(3, oooo0.f38959OooO0OO - 1, i8, 8);
                i8++;
            }
            int i10 = oooo0.f38958OooO0O0;
            if (i6 == i10 - 2 && i7 == 0 && oooo0.f38959OooO0OO % 4 != 0) {
                oooo0.OooO0O0(i10 - 3, 0, i8, 1);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 2, 0, i8, 2);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 1, 0, i8, 3);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 4, i8, 4);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 3, i8, 5);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 2, i8, 6);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 1, i8, 7);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 1, i8, 8);
                i8++;
            }
            int i11 = oooo0.f38958OooO0O0;
            if (i6 == i11 - 2 && i7 == 0 && oooo0.f38959OooO0OO % 8 == 4) {
                oooo0.OooO0O0(i11 - 3, 0, i8, 1);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 2, 0, i8, 2);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 1, 0, i8, 3);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 2, i8, 4);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 1, i8, 5);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 1, i8, 6);
                oooo0.OooO0O0(2, oooo0.f38959OooO0OO - 1, i8, 7);
                oooo0.OooO0O0(3, oooo0.f38959OooO0OO - 1, i8, 8);
                i8++;
            }
            int i12 = oooo0.f38958OooO0O0;
            if (i6 == i12 + 4 && i7 == 2 && oooo0.f38959OooO0OO % 8 == 0) {
                oooo0.OooO0O0(i12 - 1, 0, i8, 1);
                oooo0.OooO0O0(oooo0.f38958OooO0O0 - 1, oooo0.f38959OooO0OO - 1, i8, 2);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 3, i8, 3);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 2, i8, 4);
                oooo0.OooO0O0(0, oooo0.f38959OooO0OO - 1, i8, 5);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 3, i8, 6);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 2, i8, 7);
                oooo0.OooO0O0(1, oooo0.f38959OooO0OO - 1, i8, 8);
                i8++;
            }
            do {
                if (i6 < oooo0.f38958OooO0O0 && i7 >= 0 && !oooo0.OooO00o(i7, i6)) {
                    oooo0.OooO0Oo(i6, i7, i8);
                    i8++;
                }
                i6 -= 2;
                i7 += 2;
                if (i6 < 0) {
                    break;
                }
            } while (i7 < oooo0.f38959OooO0OO);
            int i13 = i6 + 1;
            int i14 = i7 + 3;
            do {
                if (i13 >= 0 && i14 < oooo0.f38959OooO0OO && !oooo0.OooO00o(i14, i13)) {
                    oooo0.OooO0Oo(i13, i14, i8);
                    i8++;
                }
                i13 += 2;
                i14 -= 2;
                i = oooo0.f38958OooO0O0;
                if (i13 >= i) {
                    break;
                }
            } while (i14 >= 0);
            i6 = i13 + 3;
            i7 = i14 + 1;
            if (i6 >= i && i7 >= (i2 = oooo0.f38959OooO0OO)) {
                break;
            }
        }
        if (!oooo0.OooO00o(i2 - 1, i - 1)) {
            oooo0.OooO0OO(oooo0.f38959OooO0OO - 1, oooo0.f38958OooO0O0 - 1, true);
            oooo0.OooO0OO(oooo0.f38959OooO0OO - 2, oooo0.f38958OooO0O0 - 2, true);
        }
        int iOooO0o0 = o00oooOooO.OooO0o0();
        int iOooO0Oo = o00oooOooO.OooO0Oo();
        p403o0Oo0O0O.o0OoOo0 o0oooo1 = new p403o0Oo0O0O.o0OoOo0(o00oooOooO.OooO0oO(), o00oooOooO.OooO0o());
        int i15 = 0;
        for (int i16 = 0; i16 < iOooO0Oo; i16++) {
            if (i16 % o00oooOooO.f38980OooO0o0 == 0) {
                int i17 = 0;
                for (int i18 = 0; i18 < o00oooOooO.OooO0oO(); i18++) {
                    o0oooo1.OooO0OO(i17, i15, i18 % 2 == 0);
                    i17++;
                }
                i15++;
            }
            int i19 = 0;
            for (int i20 = 0; i20 < iOooO0o0; i20++) {
                if (i20 % o00oooOooO.f38978OooO0Oo == 0) {
                    o0oooo1.OooO0OO(i19, i15, true);
                    i19++;
                }
                o0oooo1.OooO0OO(i19, i15, oooo0.f38960OooO0Oo[(oooo0.f38959OooO0OO * i16) + i20] == 1);
                i19++;
                int i21 = o00oooOooO.f38978OooO0Oo;
                if (i20 % i21 == i21 - 1) {
                    o0oooo1.OooO0OO(i19, i15, i16 % 2 == 0);
                    i19++;
                }
            }
            i15++;
            int i22 = o00oooOooO.f38980OooO0o0;
            if (i16 % i22 == i22 - 1) {
                int i23 = 0;
                for (int i24 = 0; i24 < o00oooOooO.OooO0oO(); i24++) {
                    o0oooo1.OooO0OO(i23, i15, true);
                    i23++;
                }
                i15++;
            }
        }
        int i25 = o0oooo1.f39020OooO0O0;
        int i26 = o0oooo1.f39021OooO0OO;
        int iMax = Math.max(200, i25);
        int iMax2 = Math.max(200, i26);
        int iMin = Math.min(iMax / i25, iMax2 / i26);
        int i27 = (iMax - (i25 * iMin)) / 2;
        int i28 = (iMax2 - (i26 * iMin)) / 2;
        if (200 < i26 || 200 < i25) {
            o00000oo2 = new o00000OO(i25, i26);
            i27 = 0;
            i28 = 0;
        } else {
            o00000oo2 = new o00000OO(200, 200);
        }
        int length2 = o00000oo2.f38918Oooo.length;
        for (int i29 = 0; i29 < length2; i29++) {
            o00000oo2.f38918Oooo[i29] = 0;
        }
        int i30 = 0;
        while (i30 < i26) {
            int i31 = i27;
            int i32 = 0;
            while (i32 < i25) {
                if (o0oooo1.OooO00o(i32, i30) == 1) {
                    o00000oo2.OooO0o0(i31, i28, iMin, iMin);
                }
                i32++;
                i31 += iMin;
            }
            i30++;
            i28 += iMin;
        }
        return o00000oo2;
    }
}
