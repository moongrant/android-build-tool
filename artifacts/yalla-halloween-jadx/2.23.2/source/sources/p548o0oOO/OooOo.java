package p548o0oOO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.UByte;
import o000OOoO.o0OO00O;
import o0O.OooO0o;
import o0OO000.OooO;
import o0OO000.OooO0OO;
import o0OO000.OooOO0;
import o0OO000o.OooO00o;
import o0OO000o.OooO0O0;
import p257o00ooOOo.o0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooO0o {
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    @Override // o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        byte[] bArr;
        boolean z;
        int i;
        OooO00o oooO00oOooO0Oo;
        int iAbs;
        int i2;
        OooO00o oooO00oOooO0O0;
        int i3;
        int i4;
        int i5;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        if (enumMap.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
        int i6 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
        int i7 = enumMap.containsKey(encodeHintType3) ? Integer.parseInt(enumMap.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        OooO0OO oooO0OO = new OooO0OO(str.getBytes(charsetForName));
        List<OooO> listSingletonList = Collections.singletonList(OooO.f42245OooO0o0);
        int i8 = 0;
        while (true) {
            bArr = oooO0OO.f42256OooO00o;
            int i9 = 4;
            int i10 = 2;
            int i11 = 1;
            if (i8 >= bArr.length) {
                break;
            }
            int i12 = i8 + 1;
            byte b = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b2 = bArr[i8];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i4 = 5;
                        } else {
                            i4 = 0;
                        }
                    } else if (b == 32) {
                        i4 = 3;
                    } else {
                        i4 = 0;
                    }
                } else if (b == 32) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
            } else if (b == 10) {
                i4 = 2;
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                LinkedList linkedList = new LinkedList();
                for (OooO oooO : listSingletonList) {
                    OooO oooOOooO0O0 = oooO.OooO0O0(i8);
                    linkedList.add(oooOOooO0O0.OooO0Oo(4, i4));
                    if (oooO.f42246OooO00o != 4) {
                        linkedList.add(oooOOooO0O0.OooO0o0(4, i4));
                    }
                    if (i4 == 3 || i4 == 4) {
                        linkedList.add(oooOOooO0O0.OooO0Oo(2, 16 - i4).OooO0Oo(2, 1));
                    }
                    if (oooO.f42248OooO0OO > 0) {
                        linkedList.add(oooO.OooO00o(i8).OooO00o(i12));
                    }
                }
                listSingletonList = OooO0OO.OooO00o(linkedList);
                i8 = i12;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (OooO oooO2 : listSingletonList) {
                    char c = (char) (bArr[i8] & UByte.MAX_VALUE);
                    int i13 = oooO2.f42246OooO00o;
                    int[][] iArr = OooO0OO.f42254OooO0Oo;
                    if (iArr[i13][c] <= 0) {
                        i11 = 0;
                    }
                    int i14 = 0;
                    OooO oooOOooO0O1 = null;
                    while (true) {
                        i5 = oooO2.f42246OooO00o;
                        if (i14 > i9) {
                            break;
                        }
                        int i15 = iArr[i14][c];
                        if (i15 > 0) {
                            if (oooOOooO0O1 == null) {
                                oooOOooO0O1 = oooO2.OooO0O0(i8);
                            }
                            if (i11 == 0 || i14 == i5 || i14 == i10) {
                                linkedList2.add(oooOOooO0O1.OooO0Oo(i14, i15));
                            }
                            if (i11 == 0 && OooO0OO.f42255OooO0o0[i5][i14] >= 0) {
                                linkedList2.add(oooOOooO0O1.OooO0o0(i14, i15));
                            }
                        }
                        i14++;
                        i9 = 4;
                        i10 = 2;
                    }
                    if (oooO2.f42248OooO0OO > 0 || iArr[i5][c] == 0) {
                        linkedList2.add(oooO2.OooO00o(i8));
                    }
                    i9 = 4;
                    i10 = 2;
                    i11 = 1;
                }
                listSingletonList = OooO0OO.OooO00o(linkedList2);
                i11 = 1;
            }
            i8 += i11;
        }
        OooO oooO3 = (OooO) Collections.min(listSingletonList, new o0OO000.OooO0O0());
        oooO3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (OooOO0 oooOO1 = oooO3.OooO0O0(bArr.length).f42247OooO0O0; oooOO1 != null; oooOO1 = oooOO1.f42260OooO00o) {
            linkedList3.addFirst(oooOO1);
        }
        OooO00o oooO00o = new OooO00o();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((OooOO0) it.next()).OooO00o(oooO00o, bArr);
        }
        int i16 = oooO00o.f42262OooO0o0;
        int iOooO00o = o0OO00O.OooO00o(i6, i16, 100, 11);
        int i17 = i16 + iOooO00o;
        int[] iArr2 = o0OOO0.f40356OooO00o;
        if (i7 != 0) {
            z = i7 < 0;
            iAbs = Math.abs(i7);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i7)));
            }
            i2 = ((z ? 88 : 112) + (iAbs << 4)) * iAbs;
            i = iArr2[iAbs];
            int i18 = i2 - (i2 % i);
            oooO00oOooO0Oo = o0OOO0.OooO0Oo(i, oooO00o);
            int i19 = oooO00oOooO0Oo.f42262OooO0o0;
            if (iOooO00o + i19 > i18) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && i19 > (i << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i20 = 0;
            OooO00o oooO00oOooO0Oo2 = null;
            int i21 = 3;
            boolean z2 = false;
            int i22 = 0;
            while (true) {
                if (i20 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                if (i20 <= i21) {
                    z2 = true;
                }
                int i23 = z2 ? i20 + 1 : i20;
                int i24 = ((z2 ? 88 : 112) + (i23 << 4)) * i23;
                if (i17 <= i24) {
                    if (oooO00oOooO0Oo2 == null || i22 != iArr2[i23]) {
                        i22 = iArr2[i23];
                        oooO00oOooO0Oo2 = o0OOO0.OooO0Oo(i22, oooO00o);
                    }
                    int i25 = i24 - (i24 % i22);
                    if ((!z2 || oooO00oOooO0Oo2.f42262OooO0o0 <= (i22 << 6)) && oooO00oOooO0Oo2.f42262OooO0o0 + iOooO00o <= i25) {
                        z = z2;
                        i = i22;
                        oooO00oOooO0Oo = oooO00oOooO0Oo2;
                        iAbs = i23;
                        i2 = i24;
                        break;
                    }
                }
                i20++;
                z2 = false;
                i21 = 3;
            }
        }
        OooO00o oooO00oOooO0O1 = o0OOO0.OooO0O0(oooO00oOooO0Oo, i2, i);
        int i26 = oooO00oOooO0Oo.f42262OooO0o0 / i;
        OooO00o oooO00o2 = new OooO00o();
        if (z) {
            oooO00o2.OooO0Oo(iAbs - 1, 2);
            oooO00o2.OooO0Oo(i26 - 1, 6);
            oooO00oOooO0O0 = o0OOO0.OooO0O0(oooO00o2, 28, 4);
        } else {
            oooO00o2.OooO0Oo(iAbs - 1, 5);
            oooO00o2.OooO0Oo(i26 - 1, 11);
            oooO00oOooO0O0 = o0OOO0.OooO0O0(oooO00o2, 40, 4);
        }
        int i27 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr3 = new int[i27];
        if (z) {
            for (int i28 = 0; i28 < i27; i28++) {
                iArr3[i28] = i28;
            }
            i3 = i27;
        } else {
            int i29 = i27 / 2;
            i3 = (((i29 - 1) / 15) * 2) + i27 + 1;
            int i30 = i3 / 2;
            for (int i31 = 0; i31 < i29; i31++) {
                int i32 = (i31 / 15) + i31;
                iArr3[(i29 - i31) - 1] = (i30 - i32) - 1;
                iArr3[i29 + i31] = i32 + i30 + 1;
            }
        }
        OooO0O0 oooO0O0 = new OooO0O0(i3, i3);
        int i33 = 0;
        for (int i34 = 0; i34 < iAbs; i34++) {
            int i35 = ((iAbs - i34) << 2) + (z ? 9 : 12);
            for (int i36 = 0; i36 < i35; i36++) {
                int i37 = i36 << 1;
                for (int i38 = 0; i38 < 2; i38++) {
                    if (oooO00oOooO0O1.OooO0o(i33 + i37 + i38)) {
                        int i39 = i34 << 1;
                        oooO0O0.OooO0Oo(iArr3[i39 + i38], iArr3[i39 + i36]);
                    }
                    if (oooO00oOooO0O1.OooO0o((i35 << 1) + i33 + i37 + i38)) {
                        int i40 = i34 << 1;
                        oooO0O0.OooO0Oo(iArr3[i40 + i36], iArr3[((i27 - 1) - i40) - i38]);
                    }
                    if (oooO00oOooO0O1.OooO0o((i35 << 2) + i33 + i37 + i38)) {
                        int i41 = (i27 - 1) - (i34 << 1);
                        oooO0O0.OooO0Oo(iArr3[i41 - i38], iArr3[i41 - i36]);
                    }
                    if (oooO00oOooO0O1.OooO0o((i35 * 6) + i33 + i37 + i38)) {
                        int i42 = i34 << 1;
                        oooO0O0.OooO0Oo(iArr3[((i27 - 1) - i42) - i36], iArr3[i42 + i38]);
                    }
                }
            }
            i33 += i35 << 3;
        }
        int i43 = i3 / 2;
        if (z) {
            for (int i44 = 0; i44 < 7; i44++) {
                int i45 = (i43 - 3) + i44;
                if (oooO00oOooO0O0.OooO0o(i44)) {
                    oooO0O0.OooO0Oo(i45, i43 - 5);
                }
                if (oooO00oOooO0O0.OooO0o(i44 + 7)) {
                    oooO0O0.OooO0Oo(i43 + 5, i45);
                }
                if (oooO00oOooO0O0.OooO0o(20 - i44)) {
                    oooO0O0.OooO0Oo(i45, i43 + 5);
                }
                if (oooO00oOooO0O0.OooO0o(27 - i44)) {
                    oooO0O0.OooO0Oo(i43 - 5, i45);
                }
            }
        } else {
            for (int i46 = 0; i46 < 10; i46++) {
                int i47 = (i46 / 5) + (i43 - 5) + i46;
                if (oooO00oOooO0O0.OooO0o(i46)) {
                    oooO0O0.OooO0Oo(i47, i43 - 7);
                }
                if (oooO00oOooO0O0.OooO0o(i46 + 10)) {
                    oooO0O0.OooO0Oo(i43 + 7, i47);
                }
                if (oooO00oOooO0O0.OooO0o(29 - i46)) {
                    oooO0O0.OooO0Oo(i47, i43 + 7);
                }
                if (oooO00oOooO0O0.OooO0o(39 - i46)) {
                    oooO0O0.OooO0Oo(i43 - 7, i47);
                }
            }
        }
        if (z) {
            o0OOO0.OooO00o(oooO0O0, i43, 5);
        } else {
            o0OOO0.OooO00o(oooO0O0, i43, 7);
            int i48 = 0;
            int i49 = 0;
            while (i48 < (i27 / 2) - 1) {
                for (int i50 = i43 & 1; i50 < i3; i50 += 2) {
                    int i51 = i43 - i49;
                    oooO0O0.OooO0Oo(i51, i50);
                    int i52 = i43 + i49;
                    oooO0O0.OooO0Oo(i52, i50);
                    oooO0O0.OooO0Oo(i50, i51);
                    oooO0O0.OooO0Oo(i50, i52);
                }
                i48 += 15;
                i49 += 16;
            }
        }
        int i53 = oooO0O0.f42263OooO0Oo;
        int iMax = Math.max(200, i53);
        int i54 = oooO0O0.f42265OooO0o0;
        int iMax2 = Math.max(200, i54);
        int iMin = Math.min(iMax / i53, iMax2 / i54);
        int i55 = (iMax - (i53 * iMin)) / 2;
        int i56 = (iMax2 - (i54 * iMin)) / 2;
        OooO0O0 oooO0O1 = new OooO0O0(iMax, iMax2);
        int i57 = 0;
        while (i57 < i54) {
            int i58 = 0;
            int i59 = i55;
            while (i58 < i53) {
                if (oooO0O0.OooO0O0(i58, i57)) {
                    oooO0O1.OooO0o0(i59, i56, iMin, iMin);
                }
                i58++;
                i59 += iMin;
            }
            i57++;
            i56 += iMin;
        }
        return oooO0O1;
    }
}
