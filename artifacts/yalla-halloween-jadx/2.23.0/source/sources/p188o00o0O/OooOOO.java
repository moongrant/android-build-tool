package p188o00o0O;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import io.agora.rtc.Constants;
import java.lang.reflect.Array;
import java.util.EnumMap;
import o0OO000.OooO0O0;
import oo0ooO.OooO;
import oo0ooO.OooO00o;
import oo0ooO.OooO0o;
import oo0ooO.OooOO0;
import oo0ooO.OooOO0O;
import oo0ooO.OooOOO0;
import oo0ooO.OooOOOO;
import oo0ooO.OooOo00;
import p255o00ooOOo.oo00oO;
import p326o0O0oooO.o00OOO00;
import p326o0O0oooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f38777OooO00o = new int[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long[] f38778OooO0O0 = new long[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object[] f38779OooO0OO = new Object[0];

    public static int OooO0O0(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int OooO0OO(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    @Override // p326o0O0oooO.o0o0Oo
    public OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        OooO0O0 oooO0O0;
        byte b;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) enumMap.get(EncodeHintType.DATA_MATRIX_SHAPE);
        if (symbolShapeHint2 != null) {
            symbolShapeHint = symbolShapeHint2;
        }
        o00OOO00 o00ooo01 = (o00OOO00) enumMap.get(EncodeHintType.MIN_SIZE);
        if (o00ooo01 == null) {
            o00ooo01 = null;
        }
        o00OOO00 o00ooo02 = (o00OOO00) enumMap.get(EncodeHintType.MAX_SIZE);
        o00OOO00 o00ooo03 = o00ooo02 != null ? o00ooo02 : null;
        int i4 = 0;
        int i5 = 1;
        int i6 = 2;
        int i7 = 3;
        OooOO0[] oooOO0Arr = {new OooO00o(), new oo0ooO.OooO0O0(), new OooOOOO(), new OooOo00(), new OooO(), new oo00oO()};
        OooOO0O oooOO0O = new OooOO0O(str);
        oooOO0O.f60945OooO0O0 = symbolShapeHint;
        oooOO0O.f60946OooO0OO = o00ooo01;
        oooOO0O.f60947OooO0Oo = o00ooo03;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            oooOO0O.OooO0o0((char) 236);
            oooOO0O.f60943OooO = 2;
            oooOO0O.f60948OooO0o += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            oooOO0O.OooO0o0((char) 237);
            oooOO0O.f60943OooO = 2;
            oooOO0O.f60948OooO0o += 7;
        }
        int i8 = 0;
        while (oooOO0O.OooO0OO()) {
            oooOO0Arr[i8].OooO00o(oooOO0O);
            int i9 = oooOO0O.f60950OooO0oO;
            if (i9 >= 0) {
                oooOO0O.f60950OooO0oO = -1;
                i8 = i9;
            }
        }
        int iOooO00o = oooOO0O.OooO00o();
        oooOO0O.OooO0Oo(oooOO0O.OooO00o());
        int i10 = oooOO0O.f60951OooO0oo.f60954OooO0O0;
        if (iOooO00o < i10 && i8 != 0 && i8 != 5 && i8 != 4) {
            oooOO0O.OooO0o0((char) 254);
        }
        StringBuilder sb = oooOO0O.f60949OooO0o0;
        if (sb.length() < i10) {
            sb.append((char) 129);
        }
        while (sb.length() < i10) {
            int length = (((sb.length() + 1) * 149) % 253) + 1 + Constants.ERR_WATERMARK_READ;
            if (length > 254) {
                length -= 254;
            }
            sb.append((char) length);
        }
        String string = sb.toString();
        oo0ooO.OooOOO oooOOOOooO0o = oo0ooO.OooOOO.OooO0o(string.length(), symbolShapeHint, o00ooo01, o00ooo03);
        int[] iArr = OooOOO0.f60961OooO00o;
        int length2 = string.length();
        int i11 = oooOOOOooO0o.f60954OooO0O0;
        if (length2 != i11) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        int i12 = oooOOOOooO0o.f60955OooO0OO;
        StringBuilder sb2 = new StringBuilder(i11 + i12);
        sb2.append(string);
        int iOooO0OO = oooOOOOooO0o.OooO0OO();
        if (iOooO0OO == 1) {
            sb2.append(OooOOO0.OooO00o(i12, string));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iOooO0OO];
            int[] iArr3 = new int[iOooO0OO];
            int[] iArr4 = new int[iOooO0OO];
            int i13 = 0;
            while (i13 < iOooO0OO) {
                int i14 = i13 + 1;
                iArr2[i13] = oooOOOOooO0o.OooO00o(i14);
                iArr3[i13] = oooOOOOooO0o.f60960OooO0oo;
                iArr4[i13] = 0;
                if (i13 > 0) {
                    iArr4[i13] = iArr4[i13 - 1] + iArr2[i13];
                }
                i13 = i14;
            }
            for (int i15 = 0; i15 < iOooO0OO; i15++) {
                StringBuilder sb3 = new StringBuilder(iArr2[i15]);
                for (int i16 = i15; i16 < i11; i16 += iOooO0OO) {
                    sb3.append(string.charAt(i16));
                }
                String strOooO00o = OooOOO0.OooO00o(iArr3[i15], sb3.toString());
                int i17 = i15;
                int i18 = 0;
                while (i17 < iArr3[i15] * iOooO0OO) {
                    sb2.setCharAt(i11 + i17, strOooO00o.charAt(i18));
                    i17 += iOooO0OO;
                    i18++;
                }
            }
        }
        String string2 = sb2.toString();
        int iOooO0O0 = oooOOOOooO0o.OooO0O0();
        int i19 = oooOOOOooO0o.f60956OooO0Oo;
        int iOooO0o0 = oooOOOOooO0o.OooO0o0();
        int i20 = oooOOOOooO0o.f60958OooO0o0;
        OooO0o oooO0o = new OooO0o(string2, iOooO0O0 * i19, iOooO0o0 * i20);
        int i21 = 0;
        int i22 = 0;
        int i23 = 4;
        while (true) {
            i = oooO0o.f60941OooO0OO;
            i2 = oooO0o.f60940OooO0O0;
            if (i23 == i2 && i21 == 0) {
                int i24 = i2 - 1;
                oooO0o.OooO00o(i24, i4, i22, i5);
                oooO0o.OooO00o(i24, i5, i22, i6);
                oooO0o.OooO00o(i24, i6, i22, i7);
                oooO0o.OooO00o(i4, i - 2, i22, 4);
                int i25 = i - 1;
                oooO0o.OooO00o(i4, i25, i22, 5);
                oooO0o.OooO00o(i5, i25, i22, 6);
                oooO0o.OooO00o(i6, i25, i22, 7);
                oooO0o.OooO00o(3, i25, i22, 8);
                i22++;
            }
            int i26 = i2 - 2;
            if (i23 == i26 && i21 == 0 && i % 4 != 0) {
                oooO0o.OooO00o(i2 - 3, i4, i22, i5);
                oooO0o.OooO00o(i26, i4, i22, i6);
                oooO0o.OooO00o(i2 - 1, i4, i22, 3);
                oooO0o.OooO00o(i4, i - 4, i22, 4);
                oooO0o.OooO00o(i4, i - 3, i22, 5);
                oooO0o.OooO00o(i4, i - 2, i22, 6);
                int i27 = i - 1;
                oooO0o.OooO00o(i4, i27, i22, 7);
                oooO0o.OooO00o(i5, i27, i22, 8);
                i22++;
            }
            if (i23 == i26 && i21 == 0 && i % 8 == 4) {
                oooO0o.OooO00o(i2 - 3, i4, i22, i5);
                i3 = 2;
                oooO0o.OooO00o(i26, i4, i22, 2);
                oooO0o.OooO00o(i2 - 1, i4, i22, 3);
                oooO0o.OooO00o(i4, i - 2, i22, 4);
                int i28 = i - 1;
                oooO0o.OooO00o(i4, i28, i22, 5);
                oooO0o.OooO00o(i5, i28, i22, 6);
                oooO0o.OooO00o(2, i28, i22, 7);
                oooO0o.OooO00o(3, i28, i22, 8);
                i22++;
            } else {
                i3 = 2;
            }
            if (i23 == i2 + 4 && i21 == i3 && i % 8 == 0) {
                int i29 = i2 - 1;
                oooO0o.OooO00o(i29, i4, i22, i5);
                int i30 = i - 1;
                oooO0o.OooO00o(i29, i30, i22, i3);
                int i31 = i - 3;
                oooO0o.OooO00o(i4, i31, i22, 3);
                int i32 = i - 2;
                oooO0o.OooO00o(i4, i32, i22, 4);
                oooO0o.OooO00o(i4, i30, i22, 5);
                oooO0o.OooO00o(i5, i31, i22, 6);
                oooO0o.OooO00o(i5, i32, i22, 7);
                oooO0o.OooO00o(i5, i30, i22, 8);
                i22++;
            }
            do {
                bArr = oooO0o.f60942OooO0Oo;
                if (i23 < i2 && i21 >= 0) {
                    if ((bArr[(i23 * i) + i21] >= 0 ? i5 : i4) == 0) {
                        oooO0o.OooO0O0(i23, i21, i22);
                        i22++;
                    }
                }
                i23 -= 2;
                i21 += 2;
                if (i23 < 0) {
                    break;
                }
            } while (i21 < i);
            int i33 = i23 + 1;
            int i34 = i21 + 3;
            do {
                if (i33 >= 0 && i34 < i) {
                    if ((bArr[(i33 * i) + i34] >= 0 ? i5 : i4) == 0) {
                        oooO0o.OooO0O0(i33, i34, i22);
                        i22++;
                    }
                }
                i33 += 2;
                i34 -= 2;
                if (i33 >= i2) {
                    break;
                }
            } while (i34 >= 0);
            i23 = i33 + 3;
            i21 = i34 + 1;
            if (i23 >= i2 && i21 >= i) {
                break;
            }
            i5 = i5;
            i7 = 3;
            i6 = 2;
            i4 = i4;
        }
        int i35 = i - 1;
        int i36 = i2 - 1;
        if ((bArr[(i36 * i) + i35] >= 0 ? i5 : i4) == 0) {
            int i37 = (i36 * i) + i35;
            byte b2 = (byte) i5;
            bArr[i37] = b2;
            bArr[((i2 - 2) * i) + (i - 2)] = b2;
        }
        int iOooO0O1 = oooOOOOooO0o.OooO0O0() * i19;
        int iOooO0o1 = oooOOOOooO0o.OooO0o0() * i20;
        int iOooO0Oo = oooOOOOooO0o.OooO0Oo();
        int iOooO0o2 = (oooOOOOooO0o.OooO0o0() * i20) + (oooOOOOooO0o.OooO0o0() << i5);
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iOooO0o2, iOooO0Oo);
        int i38 = i4;
        int i39 = i38;
        while (i38 < iOooO0o1) {
            int i40 = i38 % i20;
            if (i40 == 0) {
                int i41 = i4;
                int i42 = i41;
                while (i41 < oooOOOOooO0o.OooO0Oo()) {
                    bArr2[i39][i42] = (byte) (i41 % 2 == 0 ? i5 : 0);
                    i42++;
                    i41++;
                }
                i39++;
            }
            int i43 = 0;
            int i44 = 0;
            while (i43 < iOooO0O1) {
                int i45 = i43 % i19;
                if (i45 == 0) {
                    b = 1;
                    bArr2[i39][i44] = (byte) 1;
                    i44++;
                } else {
                    b = 1;
                }
                byte b3 = bArr[(i * i38) + i43] == b ? b : (byte) 0;
                byte[] bArr3 = bArr2[i39];
                bArr3[i44] = b3;
                i44 += b;
                if (i45 == i19 - 1) {
                    bArr3[i44] = (byte) (i38 % 2 == 0 ? 1 : 0);
                    i44++;
                }
                i43++;
                iOooO0O1 = iOooO0O1;
                iOooO0o1 = iOooO0o1;
            }
            int i46 = iOooO0O1;
            int i47 = iOooO0o1;
            i39++;
            if (i40 == i20 - 1) {
                int i48 = 0;
                for (int i49 = 0; i49 < oooOOOOooO0o.OooO0Oo(); i49++) {
                    bArr2[i39][i48] = (byte) 1;
                    i48++;
                }
                i39++;
            }
            i38++;
            iOooO0O1 = i46;
            iOooO0o1 = i47;
            i4 = 0;
            i5 = 1;
        }
        int iMax = Math.max(200, iOooO0Oo);
        int iMax2 = Math.max(200, iOooO0o2);
        int iMin = Math.min(iMax / iOooO0Oo, iMax2 / iOooO0o2);
        int i50 = (iMax - (iOooO0Oo * iMin)) / 2;
        int i51 = (iMax2 - (iOooO0o2 * iMin)) / 2;
        if (200 < iOooO0o2 || 200 < iOooO0Oo) {
            oooO0O0 = new OooO0O0(iOooO0Oo, iOooO0o2);
            i50 = 0;
            i51 = 0;
        } else {
            oooO0O0 = new OooO0O0(200, 200);
        }
        int[] iArr5 = oooO0O0.f42983OooO0oO;
        int length3 = iArr5.length;
        for (int i52 = 0; i52 < length3; i52++) {
            iArr5[i52] = 0;
        }
        int i53 = 0;
        while (i53 < iOooO0o2) {
            int i54 = i50;
            int i55 = 0;
            while (i55 < iOooO0Oo) {
                if (bArr2[i53][i55] == 1) {
                    oooO0O0.OooO0o0(i54, i51, iMin, iMin);
                }
                i55++;
                i54 += iMin;
            }
            i53++;
            i51 += iMin;
        }
        return oooO0O0;
    }
}
