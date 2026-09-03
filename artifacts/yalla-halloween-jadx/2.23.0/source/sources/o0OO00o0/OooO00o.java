package o0OO00o0;

import androidx.appcompat.widget.o0000O0;
import com.android.billingclient.api.o0000OO0;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import kotlin.UByte;
import o0OO000.OooO0O0;
import o0OO000o.OooO0OO;
import p326o0O0oooO.o0o0Oo;
import p328o0OO00o.OooO;
import p328o0OO00o.OooO0o;
import p328o0OO00o.OooOO0;
import p441o0OoOoO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements o0o0Oo {
    /* JADX WARN: Code duplicated, block: B:326:0x05df  */
    /* JADX WARN: Code duplicated, block: B:360:0x0659  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:415:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[EDGE_INSN: B:55:0x00b2->B:59:0x00bc BREAK  A[LOOP:0: B:40:0x008d->B:52:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7 A[EDGE_INSN: B:57:0x00b7->B:59:0x00bc BREAK  A[LOOP:0: B:40:0x008d->B:52:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[EDGE_INSN: B:58:0x00ba->B:59:0x00bc BREAK  A[LOOP:0: B:40:0x008d->B:52:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0155 A[LOOP:1: B:78:0x0127->B:92:0x0155, LOOP_END] */
    @Override // p326o0O0oooO.o0o0Oo
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        boolean z;
        Mode mode;
        o00OOOO0 o00oooo0OooO0O0;
        int i;
        int i2;
        byte[][] bArr;
        o00OOOO0 o00oooo1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        CharacterSetECI characterSetECIOooO00o;
        int i5;
        boolean z6;
        boolean z7;
        char cCharAt;
        int i6;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
        int i7 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
        boolean zContainsKey = enumMap.containsKey(encodeHintType3);
        String string = zContainsKey ? enumMap.get(encodeHintType3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = OooO.f43053OooO00o;
        if (!zEquals) {
            i5 = 0;
            z6 = false;
            z7 = false;
            while (true) {
                if (i5 < str.length()) {
                    if (z6) {
                        if (z7) {
                            mode = Mode.BYTE;
                            break;
                        }
                        mode = Mode.NUMERIC;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i5);
                if (cCharAt < '0') {
                    if (cCharAt < '`') {
                        i6 = iArr[cCharAt];
                    } else {
                        i6 = -1;
                    }
                    if (i6 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z6 = true;
                } else {
                    if (cCharAt < '`') {
                        i6 = iArr[cCharAt];
                    } else {
                        i6 = -1;
                    }
                    if (i6 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z6 = true;
                }
                i5++;
            }
        } else {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 != 0) {
                    z = false;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        z = true;
                        break;
                    }
                    int i9 = bytes[i8] & UByte.MAX_VALUE;
                    if ((i9 < 129 || i9 > 159) && (i9 < 224 || i9 > 235)) {
                        z = false;
                        break;
                    }
                    i8 += 2;
                }
            } catch (UnsupportedEncodingException unused) {
            }
            if (!z) {
                i5 = 0;
                z6 = false;
                z7 = false;
                while (true) {
                    if (i5 < str.length()) {
                        if (z6) {
                            if (z7) {
                                mode = Mode.BYTE;
                                break;
                            }
                            mode = Mode.NUMERIC;
                            break;
                        }
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i5);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt < '`') {
                            i6 = iArr[cCharAt];
                        } else {
                            i6 = -1;
                        }
                        if (i6 == -1) {
                            mode = Mode.BYTE;
                            break;
                        }
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                    i5++;
                }
            } else {
                mode = Mode.KANJI;
            }
        }
        o0OO000.OooO00o oooO00o = new o0OO000.OooO00o();
        if (mode == Mode.BYTE && zContainsKey && (characterSetECIOooO00o = CharacterSetECI.OooO00o(string)) != null) {
            oooO00o.OooO0Oo(Mode.ECI.OooO00o(), 4);
            oooO00o.OooO0Oo(characterSetECIOooO00o.OooO0O0(), 8);
        }
        EncodeHintType encodeHintType4 = EncodeHintType.GS1_FORMAT;
        if (enumMap.containsKey(encodeHintType4) && Boolean.valueOf(enumMap.get(encodeHintType4).toString()).booleanValue()) {
            oooO00o.OooO0Oo(Mode.FNC1_FIRST_POSITION.OooO00o(), 4);
        }
        oooO00o.OooO0Oo(mode.OooO00o(), 4);
        o0OO000.OooO00o oooO00o2 = new o0OO000.OooO00o();
        int i10 = OooO.OooO00o.f43054OooO00o[mode.ordinal()];
        if (i10 == 1) {
            int length2 = str.length();
            int i11 = 0;
            while (i11 < length2) {
                int iCharAt = str.charAt(i11) - '0';
                int i12 = i11 + 2;
                if (i12 < length2) {
                    oooO00o2.OooO0Oo(((str.charAt(i11 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i12) - '0'), 10);
                    i11 += 3;
                } else {
                    i11++;
                    if (i11 < length2) {
                        oooO00o2.OooO0Oo((iCharAt * 10) + (str.charAt(i11) - '0'), 7);
                        i11 = i12;
                    } else {
                        oooO00o2.OooO0Oo(iCharAt, 4);
                    }
                }
            }
        } else if (i10 == 2) {
            int length3 = str.length();
            int i13 = 0;
            while (i13 < length3) {
                char cCharAt2 = str.charAt(i13);
                int i14 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                if (i14 == -1) {
                    throw new WriterException();
                }
                int i15 = i13 + 1;
                if (i15 < length3) {
                    char cCharAt3 = str.charAt(i15);
                    int i16 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                    if (i16 == -1) {
                        throw new WriterException();
                    }
                    oooO00o2.OooO0Oo((i14 * 45) + i16, 11);
                    i13 += 2;
                } else {
                    oooO00o2.OooO0Oo(i14, 6);
                    i13 = i15;
                }
            }
        } else if (i10 == 3) {
            try {
                for (byte b : str.getBytes(string)) {
                    oooO00o2.OooO0Oo(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new WriterException(e);
            }
        } else {
            if (i10 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i17 = 0; i17 < length4; i17 += 2) {
                    int i18 = ((bytes2[i17] & UByte.MAX_VALUE) << 8) | (bytes2[i17 + 1] & UByte.MAX_VALUE);
                    if (i18 < 33088 || i18 > 40956) {
                        if (i18 < 57408 || i18 > 60351) {
                            i3 = -1;
                        } else {
                            i4 = 49472;
                        }
                        if (i3 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        oooO00o2.OooO0Oo(((i3 >> 8) * 192) + (i3 & 255), 13);
                    } else {
                        i4 = 33088;
                    }
                    i3 = i18 - i4;
                    if (i3 != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    oooO00o2.OooO0Oo(((i3 >> 8) * 192) + (i3 & 255), 13);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new WriterException(e2);
            }
        }
        EncodeHintType encodeHintType5 = EncodeHintType.QR_VERSION;
        if (enumMap.containsKey(encodeHintType5)) {
            o00oooo0OooO0O0 = o00OOOO0.OooO0O0(Integer.parseInt(enumMap.get(encodeHintType5).toString()));
            int iOooO0O0 = mode.OooO0O0(o00oooo0OooO0O0) + oooO00o.f42979OooO0o0 + oooO00o2.f42979OooO0o0;
            o00OOOO0.OooO0O0 oooO0O0 = o00oooo0OooO0O0.f46170OooO0O0[errorCorrectionLevelValueOf.ordinal()];
            int i19 = 0;
            for (o00OOOO0.OooO00o oooO00o3 : oooO0O0.f46175OooO0O0) {
                i19 += oooO00o3.f46172OooO00o;
            }
            if (!(o00oooo0OooO0O0.f46171OooO0OO - (i19 * oooO0O0.f46174OooO00o) >= (iOooO0O0 + 7) / 8)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            int iOooO0O1 = mode.OooO0O0(o00OOOO0.OooO0O0(1)) + oooO00o.f42979OooO0o0 + oooO00o2.f42979OooO0o0;
            int i20 = 1;
            while (true) {
                if (i20 > 40) {
                    throw new WriterException("Data too big");
                }
                o00OOOO0 o00oooo0OooO0O1 = o00OOOO0.OooO0O0(i20);
                int i21 = o00oooo0OooO0O1.f46171OooO0OO;
                o00OOOO0.OooO0O0 oooO0O1 = o00oooo0OooO0O1.f46170OooO0O0[errorCorrectionLevelValueOf.ordinal()];
                int i22 = 0;
                for (o00OOOO0.OooO00o oooO00o4 : oooO0O1.f46175OooO0O0) {
                    i22 += oooO00o4.f46172OooO00o;
                }
                if (i21 - (i22 * oooO0O1.f46174OooO00o) >= (iOooO0O1 + 7) / 8) {
                    int iOooO0O2 = mode.OooO0O0(o00oooo0OooO0O1) + oooO00o.f42979OooO0o0 + oooO00o2.f42979OooO0o0;
                    int i23 = 40;
                    int i24 = 1;
                    while (true) {
                        if (i24 > i23) {
                            throw new WriterException("Data too big");
                        }
                        o00OOOO0 o00oooo0OooO0O2 = o00OOOO0.OooO0O0(i24);
                        int i25 = o00oooo0OooO0O2.f46171OooO0OO;
                        o00OOOO0.OooO0O0 oooO0O2 = o00oooo0OooO0O2.f46170OooO0O0[errorCorrectionLevelValueOf.ordinal()];
                        int i26 = 0;
                        for (o00OOOO0.OooO00o oooO00o5 : oooO0O2.f46175OooO0O0) {
                            i26 += oooO00o5.f46172OooO00o;
                        }
                        if (i25 - (i26 * oooO0O2.f46174OooO00o) >= (iOooO0O2 + 7) / 8) {
                            o00oooo0OooO0O0 = o00oooo0OooO0O2;
                            break;
                        }
                        i24++;
                        i23 = 40;
                    }
                } else {
                    i20++;
                }
            }
        }
        o0OO000.OooO00o oooO00o6 = new o0OO000.OooO00o();
        int i27 = oooO00o.f42979OooO0o0;
        oooO00o6.OooO0o0(oooO00o6.f42979OooO0o0 + i27);
        for (int i28 = 0; i28 < i27; i28++) {
            oooO00o6.OooO0O0(oooO00o.OooO0o(i28));
        }
        int length5 = mode == Mode.BYTE ? (oooO00o2.f42979OooO0o0 + 7) / 8 : str.length();
        int iOooO0O3 = mode.OooO0O0(o00oooo0OooO0O0);
        int i29 = 1 << iOooO0O3;
        if (length5 >= i29) {
            StringBuilder sb = new StringBuilder();
            sb.append(length5);
            sb.append(" is bigger than ");
            sb.append(i29 - 1);
            throw new WriterException(sb.toString());
        }
        oooO00o6.OooO0Oo(length5, iOooO0O3);
        int i30 = oooO00o2.f42979OooO0o0;
        oooO00o6.OooO0o0(oooO00o6.f42979OooO0o0 + i30);
        for (int i31 = 0; i31 < i30; i31++) {
            oooO00o6.OooO0O0(oooO00o2.OooO0o(i31));
        }
        o00OOOO0.OooO0O0 oooO0O3 = o00oooo0OooO0O0.f46170OooO0O0[errorCorrectionLevelValueOf.ordinal()];
        int i32 = 0;
        for (o00OOOO0.OooO00o oooO00o7 : oooO0O3.f46175OooO0O0) {
            i32 += oooO00o7.f46172OooO00o;
        }
        int i33 = i32 * oooO0O3.f46174OooO00o;
        int i34 = o00oooo0OooO0O0.f46171OooO0OO;
        int i35 = i34 - i33;
        int i36 = i35 << 3;
        if (oooO00o6.f42979OooO0o0 > i36) {
            throw new WriterException("data bits cannot fit in the QR Code" + oooO00o6.f42979OooO0o0 + " > " + i36);
        }
        for (int i37 = 0; i37 < 4 && oooO00o6.f42979OooO0o0 < i36; i37++) {
            oooO00o6.OooO0O0(false);
        }
        boolean z8 = false;
        int i38 = oooO00o6.f42979OooO0o0 & 7;
        if (i38 > 0) {
            while (i38 < 8) {
                oooO00o6.OooO0O0(z8);
                i38++;
                z8 = false;
            }
        }
        int i39 = i35 - ((oooO00o6.f42979OooO0o0 + 7) / 8);
        for (int i40 = 0; i40 < i39; i40++) {
            oooO00o6.OooO0Oo((i40 & 1) == 0 ? 236 : 17, 8);
        }
        if (oooO00o6.f42979OooO0o0 != i36) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i41 = 0;
        for (o00OOOO0.OooO00o oooO00o8 : oooO0O3.f46175OooO0O0) {
            i41 += oooO00o8.f46172OooO00o;
        }
        if ((oooO00o6.f42979OooO0o0 + 7) / 8 != i35) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i41);
        int i42 = 0;
        int i43 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i42 < i41) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i42 >= i41) {
                throw new WriterException("Block ID too large");
            }
            int i44 = i34 % i41;
            int i45 = i41 - i44;
            int i46 = i34 / i41;
            int i47 = i46 + 1;
            int i48 = i35 / i41;
            int i49 = i48 + 1;
            int i50 = i7;
            int i51 = i46 - i48;
            ErrorCorrectionLevel errorCorrectionLevel = errorCorrectionLevelValueOf;
            int i52 = i47 - i49;
            if (i51 != i52) {
                throw new WriterException("EC bytes mismatch");
            }
            o00OOOO0 o00oooo2 = o00oooo0OooO0O0;
            if (i41 != i45 + i44) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i34 != ((i49 + i52) * i44) + ((i48 + i51) * i45)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i42 < i45) {
                iArr2[0] = i48;
                iArr3[0] = i51;
            } else {
                iArr2[0] = i49;
                iArr3[0] = i52;
            }
            int i53 = iArr2[0];
            byte[] bArr2 = new byte[i53];
            int i54 = i43 << 3;
            int i55 = 0;
            while (i55 < i53) {
                int i56 = i41;
                int i57 = 0;
                int i58 = i34;
                int i59 = 0;
                for (int i60 = 8; i57 < i60; i60 = 8) {
                    if (oooO00o6.OooO0o(i54)) {
                        i59 |= 1 << (7 - i57);
                    }
                    i54++;
                    i57++;
                }
                bArr2[i55 + 0] = (byte) i59;
                i55++;
                i41 = i56;
                i34 = i58;
            }
            int i61 = i34;
            int i62 = i41;
            int i63 = iArr3[0];
            int[] iArr4 = new int[i53 + i63];
            for (int i64 = 0; i64 < i53; i64++) {
                iArr4[i64] = bArr2[i64] & UByte.MAX_VALUE;
            }
            new OooO0OO(o0OO000o.OooO00o.f42988OooOO0O).OooO00o(i63, iArr4);
            byte[] bArr3 = new byte[i63];
            for (int i65 = 0; i65 < i63; i65++) {
                bArr3[i65] = (byte) iArr4[i53 + i65];
            }
            arrayList.add(new p328o0OO00o.OooO0OO(bArr2, bArr3));
            iMax = Math.max(iMax, i53);
            iMax2 = Math.max(iMax2, i63);
            i43 += iArr2[0];
            i42++;
            i41 = i62;
            i7 = i50;
            errorCorrectionLevelValueOf = errorCorrectionLevel;
            o00oooo0OooO0O0 = o00oooo2;
            i34 = i61;
        }
        o00OOOO0 o00oooo3 = o00oooo0OooO0O0;
        ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevelValueOf;
        int i66 = i7;
        int i67 = i34;
        if (i35 != i43) {
            throw new WriterException("Data bytes does not match offset");
        }
        o0OO000.OooO00o oooO00o9 = new o0OO000.OooO00o();
        for (int i68 = 0; i68 < iMax; i68++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((p328o0OO00o.OooO0OO) it.next()).f43055OooO00o;
                if (i68 < bArr4.length) {
                    oooO00o9.OooO0Oo(bArr4[i68], 8);
                }
            }
        }
        for (int i69 = 0; i69 < iMax2; i69++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((p328o0OO00o.OooO0OO) it2.next()).f43056OooO0O0;
                if (i69 < bArr5.length) {
                    oooO00o9.OooO0Oo(bArr5[i69], 8);
                }
            }
        }
        if (i67 != (oooO00o9.f42979OooO0o0 + 7) / 8) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("Interleaving error: ", i67, " and ");
            sbOooO00o.append((oooO00o9.f42979OooO0o0 + 7) / 8);
            sbOooO00o.append(" differ.");
            throw new WriterException(sbOooO00o.toString());
        }
        o00OOOO0 o00oooo4 = o00oooo3;
        int i70 = (o00oooo4.f46169OooO00o * 4) + 17;
        OooO0o oooO0o = new OooO0o(i70, i70);
        int i71 = Integer.MAX_VALUE;
        int i72 = 0;
        int i73 = -1;
        while (true) {
            i = oooO0o.f43059OooO0OO;
            i2 = oooO0o.f43058OooO0O0;
            if (i72 >= 8) {
                break;
            }
            ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel2;
            OooOO0.OooO00o(oooO00o9, errorCorrectionLevel3, o00oooo4, i72, oooO0o);
            int iOooO00o = o0000OO0.OooO00o(oooO0o, false) + o0000OO0.OooO00o(oooO0o, true);
            int i74 = 0;
            int i75 = 0;
            while (true) {
                int i76 = i - 1;
                bArr = oooO0o.f43057OooO00o;
                if (i74 >= i76) {
                    break;
                }
                byte[] bArr6 = bArr[i74];
                int i77 = 0;
                while (i77 < i2 - 1) {
                    byte b2 = bArr6[i77];
                    int i78 = i77 + 1;
                    o0OO000.OooO00o oooO00o10 = oooO00o9;
                    if (b2 == bArr6[i78]) {
                        byte[] bArr7 = bArr[i74 + 1];
                        if (b2 == bArr7[i77] && b2 == bArr7[i78]) {
                            i75++;
                        }
                    }
                    oooO00o9 = oooO00o10;
                    i77 = i78;
                }
                i74++;
            }
            o0OO000.OooO00o oooO00o11 = oooO00o9;
            int i79 = (i75 * 3) + iOooO00o;
            int i80 = 0;
            for (int i81 = 0; i81 < i; i81++) {
                int i82 = 0;
                while (i82 < i2) {
                    byte[] bArr8 = bArr[i81];
                    int i83 = i82 + 6;
                    if (i83 < i2) {
                        o00oooo1 = o00oooo4;
                        byte b3 = 1;
                        if (bArr8[i82] == 1 && bArr8[i82 + 1] == 0 && bArr8[i82 + 2] == 1 && bArr8[i82 + 3] == 1 && bArr8[i82 + 4] == 1 && bArr8[i82 + 5] == 0 && bArr8[i83] == 1) {
                            int iMax3 = Math.max(i82 - 4, 0);
                            int iMin = Math.min(i82, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z4 = true;
                                    break;
                                }
                                int i84 = iMin;
                                if (bArr8[iMax3] == b3) {
                                    z4 = false;
                                    break;
                                }
                                iMax3++;
                                b3 = 1;
                                iMin = i84;
                            }
                            if (z4) {
                                i80++;
                            } else {
                                int iMax4 = Math.max(i82 + 7, 0);
                                int iMin2 = Math.min(i82 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z5 = true;
                                        break;
                                    }
                                    byte[] bArr9 = bArr8;
                                    if (bArr8[iMax4] == 1) {
                                        z5 = false;
                                        break;
                                    }
                                    iMax4++;
                                    bArr8 = bArr9;
                                }
                                if (z5) {
                                    i80++;
                                }
                            }
                        }
                    } else {
                        o00oooo1 = o00oooo4;
                    }
                    int i85 = i81 + 6;
                    if (i85 < i) {
                        byte b4 = 1;
                        if (bArr[i81][i82] == 1 && bArr[i81 + 1][i82] == 0 && bArr[i81 + 2][i82] == 1 && bArr[i81 + 3][i82] == 1 && bArr[i81 + 4][i82] == 1 && bArr[i81 + 5][i82] == 0 && bArr[i85][i82] == 1) {
                            int iMax5 = Math.max(i81 - 4, 0);
                            int iMin3 = Math.min(i81, bArr.length);
                            while (true) {
                                if (iMax5 >= iMin3) {
                                    z2 = true;
                                    break;
                                }
                                if (bArr[iMax5][i82] == b4) {
                                    z2 = false;
                                    break;
                                }
                                iMax5++;
                                b4 = 1;
                            }
                            if (z2) {
                                i80++;
                            } else {
                                int iMax6 = Math.max(i81 + 7, 0);
                                int iMin4 = Math.min(i81 + 11, bArr.length);
                                while (true) {
                                    if (iMax6 >= iMin4) {
                                        z3 = true;
                                        break;
                                    }
                                    if (bArr[iMax6][i82] == 1) {
                                        z3 = false;
                                        break;
                                    }
                                    iMax6++;
                                }
                                if (z3) {
                                    i80++;
                                }
                            }
                        }
                    }
                    i82++;
                    o00oooo4 = o00oooo1;
                }
            }
            o00OOOO0 o00oooo5 = o00oooo4;
            int i86 = (i80 * 40) + i79;
            int i87 = 0;
            for (int i88 = 0; i88 < i; i88++) {
                byte[] bArr10 = bArr[i88];
                for (int i89 = 0; i89 < i2; i89++) {
                    if (bArr10[i89] == 1) {
                        i87++;
                    }
                }
            }
            int i90 = i * i2;
            int iAbs = (((Math.abs((i87 << 1) - i90) * 10) / i90) * 10) + i86;
            if (iAbs < i71) {
                i71 = iAbs;
                i73 = i72;
            }
            i72++;
            oooO00o9 = oooO00o11;
            errorCorrectionLevel2 = errorCorrectionLevel3;
            o00oooo4 = o00oooo5;
        }
        OooOO0.OooO00o(oooO00o9, errorCorrectionLevel2, o00oooo4, i73, oooO0o);
        int i91 = i66 << 1;
        int i92 = i2 + i91;
        int i93 = i91 + i;
        int iMax7 = Math.max(200, i92);
        int iMax8 = Math.max(200, i93);
        int iMin5 = Math.min(iMax7 / i92, iMax8 / i93);
        int i94 = (iMax7 - (i2 * iMin5)) / 2;
        int i95 = (iMax8 - (i * iMin5)) / 2;
        OooO0O0 oooO0O4 = new OooO0O0(iMax7, iMax8);
        int i96 = 0;
        while (i96 < i) {
            int i97 = 0;
            int i98 = i94;
            while (i97 < i2) {
                if (oooO0o.OooO00o(i97, i96) == 1) {
                    oooO0O4.OooO0o0(i98, i95, iMin5, iMin5);
                }
                i97++;
                i98 += iMin5;
            }
            i96++;
            i95 += iMin5;
        }
        return oooO0O4;
    }
}
