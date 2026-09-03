package p402o0Oo0O00;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UByte;
import o0Oo00o0.OooO00o;
import o0Oo00o0.OooO0OO;
import p036OoooOOO.o000000;
import p390o0OOooOO.o0;
import p392o0OOooo.o00000O;
import p392o0OOooo.o00000OO;
import p401o0Oo0O0.o000oOoO;
import p403o0Oo0O0O.o00O0O;
import p403o0Oo0O0O.o00Oo0;
import p403o0Oo0O0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements o0 {
    /* JADX WARN: Code duplicated, block: B:348:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2 A[EDGE_INSN: B:56:0x00b2->B:60:0x00bc BREAK  A[LOOP:0: B:43:0x008f->B:53:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7 A[EDGE_INSN: B:58:0x00b7->B:60:0x00bc BREAK  A[LOOP:0: B:43:0x008f->B:53:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[EDGE_INSN: B:59:0x00ba->B:60:0x00bc BREAK  A[LOOP:0: B:43:0x008f->B:53:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:96:0x015b A[LOOP:1: B:82:0x012d->B:96:0x015b, LOOP_END] */
    @Override // p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        boolean z;
        Mode mode;
        o000oOoO o000ooooOooO0O0;
        o000oOoO o000oooo2;
        int i;
        int i2;
        int i3;
        CharacterSetECI characterSetECIOooO00o;
        int i4;
        boolean z2;
        boolean z3;
        char cCharAt;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
        if (map.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
        int i5 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 4;
        EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
        boolean z4 = map.containsKey(encodeHintType3);
        String string = z4 ? map.get(encodeHintType3).toString() : "ISO-8859-1";
        if (!"Shift_JIS".equals(string)) {
            i4 = 0;
            z2 = false;
            z3 = false;
            while (true) {
                if (i4 < str.length()) {
                    if (z2) {
                        if (z3) {
                            mode = Mode.BYTE;
                            break;
                        }
                        mode = Mode.NUMERIC;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i4);
                if (cCharAt >= '0') {
                    if (o00O0O.OooO0OO(cCharAt) == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z2 = true;
                } else {
                    if (o00O0O.OooO0OO(cCharAt) == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z2 = true;
                }
                i4++;
            }
        } else {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 != 0) {
                    z = false;
                    break;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z = true;
                        break;
                    }
                    int i7 = bytes[i6] & UByte.MAX_VALUE;
                    if ((i7 < 129 || i7 > 159) && (i7 < 224 || i7 > 235)) {
                        z = false;
                        break;
                    }
                    i6 += 2;
                }
            } catch (UnsupportedEncodingException unused) {
            }
            if (!z) {
                i4 = 0;
                z2 = false;
                z3 = false;
                while (true) {
                    if (i4 < str.length()) {
                        if (z2) {
                            if (z3) {
                                mode = Mode.BYTE;
                                break;
                            }
                            mode = Mode.NUMERIC;
                            break;
                        }
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i4);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                        z3 = true;
                    } else {
                        if (o00O0O.OooO0OO(cCharAt) == -1) {
                            mode = Mode.BYTE;
                            break;
                        }
                        z2 = true;
                    }
                    i4++;
                }
            } else {
                mode = Mode.KANJI;
            }
        }
        o00000O o00000o = new o00000O();
        if (mode == Mode.BYTE && z4 && (characterSetECIOooO00o = CharacterSetECI.OooO00o(string)) != null) {
            o00000o.OooO0o0(Mode.ECI.OooO00o(), 4);
            o00000o.OooO0o0(characterSetECIOooO00o.OooO0O0(), 8);
        }
        EncodeHintType encodeHintType4 = EncodeHintType.GS1_FORMAT;
        if ((map.containsKey(encodeHintType4)) && Boolean.valueOf(map.get(encodeHintType4).toString()).booleanValue()) {
            o00000o.OooO0o0(Mode.FNC1_FIRST_POSITION.OooO00o(), 4);
        }
        o00000o.OooO0o0(mode.OooO00o(), 4);
        o00000O o00000o2 = new o00000O();
        int i8 = o00O0O.OooO00o.f39014OooO00o[mode.ordinal()];
        if (i8 == 1) {
            int length2 = str.length();
            int i9 = 0;
            while (i9 < length2) {
                int iCharAt = str.charAt(i9) - '0';
                int i10 = i9 + 2;
                if (i10 < length2) {
                    o00000o2.OooO0o0(((str.charAt(i9 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i10) - '0'), 10);
                    i9 += 3;
                } else {
                    i9++;
                    if (i9 < length2) {
                        o00000o2.OooO0o0((iCharAt * 10) + (str.charAt(i9) - '0'), 7);
                        i9 = i10;
                    } else {
                        o00000o2.OooO0o0(iCharAt, 4);
                    }
                }
            }
        } else if (i8 == 2) {
            int length3 = str.length();
            int i11 = 0;
            while (i11 < length3) {
                int iOooO0OO = o00O0O.OooO0OO(str.charAt(i11));
                if (iOooO0OO == -1) {
                    throw new WriterException();
                }
                int i12 = i11 + 1;
                if (i12 < length3) {
                    int iOooO0OO2 = o00O0O.OooO0OO(str.charAt(i12));
                    if (iOooO0OO2 == -1) {
                        throw new WriterException();
                    }
                    o00000o2.OooO0o0((iOooO0OO * 45) + iOooO0OO2, 11);
                    i11 += 2;
                } else {
                    o00000o2.OooO0o0(iOooO0OO, 6);
                    i11 = i12;
                }
            }
        } else if (i8 == 3) {
            try {
                for (byte b : str.getBytes(string)) {
                    o00000o2.OooO0o0(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new WriterException(e);
            }
        } else {
            if (i8 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i13 = 0; i13 < length4; i13 += 2) {
                    int i14 = (bytes2[i13 + 1] & UByte.MAX_VALUE) | ((bytes2[i13] & UByte.MAX_VALUE) << 8);
                    if (i14 < 33088 || i14 > 40956) {
                        if (i14 < 57408 || i14 > 60351) {
                            i2 = -1;
                        } else {
                            i3 = 49472;
                        }
                        if (i2 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        o00000o2.OooO0o0(((i2 >> 8) * 192) + (i2 & KotlinVersion.MAX_COMPONENT_VALUE), 13);
                    } else {
                        i3 = 33088;
                    }
                    i2 = i14 - i3;
                    if (i2 != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    o00000o2.OooO0o0(((i2 >> 8) * 192) + (i2 & KotlinVersion.MAX_COMPONENT_VALUE), 13);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new WriterException(e2);
            }
        }
        EncodeHintType encodeHintType5 = EncodeHintType.QR_VERSION;
        if (map.containsKey(encodeHintType5)) {
            o000ooooOooO0O0 = o000oOoO.OooO0O0(Integer.parseInt(map.get(encodeHintType5).toString()));
            if (!o00O0O.OooO0Oo(o00O0O.OooO00o(mode, o00000o, o00000o2, o000ooooOooO0O0), o000ooooOooO0O0, errorCorrectionLevelValueOf)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            o000ooooOooO0O0 = o00O0O.OooO0O0(o00O0O.OooO00o(mode, o00000o, o00000o2, o00O0O.OooO0O0(o00O0O.OooO00o(mode, o00000o, o00000o2, o000oOoO.OooO0O0(1)), errorCorrectionLevelValueOf)), errorCorrectionLevelValueOf);
        }
        o00000O o00000o3 = new o00000O();
        o00000o3.OooO0Oo(o00000o);
        int iOooO = mode == Mode.BYTE ? o00000o2.OooO() : str.length();
        int iOooO0O0 = mode.OooO0O0(o000ooooOooO0O0);
        int i15 = 1 << iOooO0O0;
        if (iOooO >= i15) {
            throw new WriterException(iOooO + " is bigger than " + (i15 - 1));
        }
        o00000o3.OooO0o0(iOooO, iOooO0O0);
        o00000o3.OooO0Oo(o00000o2);
        o000oOoO.OooO0O0 oooO0O0 = o000ooooOooO0O0.f39005OooO0O0[errorCorrectionLevelValueOf.ordinal()];
        int i16 = o000ooooOooO0O0.f39006OooO0OO;
        int i17 = oooO0O0.f39009OooO00o;
        int i18 = 0;
        for (o000oOoO.OooO00o oooO00o : oooO0O0.f39010OooO0O0) {
            i18 += oooO00o.f39007OooO00o;
        }
        int i19 = i16 - (i17 * i18);
        int i20 = i19 << 3;
        if (o00000o3.f38917Oooo0oO > i20) {
            throw new WriterException("data bits cannot fit in the QR Code" + o00000o3.f38917Oooo0oO + " > " + i20);
        }
        for (int i21 = 0; i21 < 4 && o00000o3.f38917Oooo0oO < i20; i21++) {
            o00000o3.OooO0OO(false);
        }
        boolean z5 = false;
        int i22 = o00000o3.f38917Oooo0oO & 7;
        if (i22 > 0) {
            while (i22 < 8) {
                o00000o3.OooO0OO(z5);
                i22++;
                z5 = false;
            }
        }
        int iOooO2 = i19 - o00000o3.OooO();
        for (int i23 = 0; i23 < iOooO2; i23++) {
            o00000o3.OooO0o0((i23 & 1) == 0 ? 236 : 17, 8);
        }
        if (o00000o3.f38917Oooo0oO != i20) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i24 = o000ooooOooO0O0.f39006OooO0OO;
        int i25 = 0;
        for (o000oOoO.OooO00o oooO00o2 : oooO0O0.f39010OooO0O0) {
            i25 += oooO00o2.f39007OooO00o;
        }
        if (o00000o3.OooO() != i19) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i25);
        int iMax = 0;
        int i26 = 0;
        int i27 = 0;
        int iMax2 = 0;
        while (i27 < i25) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (i27 >= i25) {
                throw new WriterException("Block ID too large");
            }
            int i28 = i24 % i25;
            int i29 = i25 - i28;
            int i30 = i24 / i25;
            int i31 = i30 + 1;
            int i32 = i19 / i25;
            int i33 = i32 + 1;
            int i34 = i5;
            int i35 = i30 - i32;
            ErrorCorrectionLevel errorCorrectionLevel = errorCorrectionLevelValueOf;
            int i36 = i31 - i33;
            if (i35 != i36) {
                throw new WriterException("EC bytes mismatch");
            }
            o000oOoO o000oooo3 = o000ooooOooO0O0;
            if (i25 != i29 + i28) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i24 != ((i33 + i36) * i28) + ((i32 + i35) * i29)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i27 < i29) {
                iArr[0] = i32;
                iArr2[0] = i35;
            } else {
                iArr[0] = i33;
                iArr2[0] = i36;
            }
            int i37 = iArr[0];
            byte[] bArr = new byte[i37];
            int i38 = i26 << 3;
            int i39 = 0;
            while (i39 < i37) {
                int i40 = i24;
                int i41 = i25;
                int i42 = 0;
                int i43 = i38;
                int i44 = 0;
                for (int i45 = 8; i44 < i45; i45 = 8) {
                    if (o00000o3.OooO0oO(i43)) {
                        i42 = (1 << (7 - i44)) | i42;
                    }
                    i43++;
                    i44++;
                }
                bArr[i39 + 0] = (byte) i42;
                i39++;
                i38 = i43;
                i24 = i40;
                i25 = i41;
            }
            int i46 = i24;
            int i47 = i25;
            int i48 = iArr2[0];
            int[] iArr3 = new int[i37 + i48];
            for (int i49 = 0; i49 < i37; i49++) {
                iArr3[i49] = bArr[i49] & UByte.MAX_VALUE;
            }
            new OooO0OO(OooO00o.f38945OooOO0O).OooO00o(iArr3, i48);
            byte[] bArr2 = new byte[i48];
            for (int i50 = 0; i50 < i48; i50++) {
                bArr2[i50] = (byte) iArr3[i37 + i50];
            }
            arrayList.add(new p403o0Oo0O0O.o000oOoO(bArr, bArr2));
            iMax2 = Math.max(iMax2, i37);
            iMax = Math.max(iMax, i48);
            i26 += iArr[0];
            i27++;
            i25 = i47;
            errorCorrectionLevelValueOf = errorCorrectionLevel;
            o000ooooOooO0O0 = o000oooo3;
            i24 = i46;
            i5 = i34;
        }
        o000oOoO o000oooo4 = o000ooooOooO0O0;
        ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevelValueOf;
        int i51 = i5;
        int i52 = i24;
        if (i19 != i26) {
            throw new WriterException("Data bytes does not match offset");
        }
        o00000O o00000o4 = new o00000O();
        for (int i53 = 0; i53 < iMax2; i53++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((p403o0Oo0O0O.o000oOoO) it.next()).f39011OooO00o;
                if (i53 < bArr3.length) {
                    o00000o4.OooO0o0(bArr3[i53], 8);
                }
            }
        }
        for (int i54 = 0; i54 < iMax; i54++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((p403o0Oo0O0O.o000oOoO) it2.next()).f39012OooO0O0;
                if (i54 < bArr4.length) {
                    o00000o4.OooO0o0(bArr4[i54], 8);
                }
            }
        }
        if (i52 != o00000o4.OooO()) {
            throw new WriterException("Interleaving error: " + i52 + " and " + o00000o4.OooO() + " differ.");
        }
        o000oOoO o000oooo5 = o000oooo4;
        int i55 = (o000oooo5.f39004OooO00o * 4) + 17;
        o0OoOo0 o0oooo1 = new o0OoOo0(i55, i55);
        int i56 = Integer.MAX_VALUE;
        int i57 = -1;
        int i58 = 0;
        for (int i59 = 8; i58 < i59; i59 = 8) {
            ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel2;
            o00Oo0.OooO00o(o00000o4, errorCorrectionLevel3, o000oooo5, i58, o0oooo1);
            int iOooO0oO = o000000.OooO0oO(o0oooo1, false) + o000000.OooO0oO(o0oooo1, true);
            byte[][] bArr5 = o0oooo1.f39019OooO00o;
            int i60 = o0oooo1.f39020OooO0O0;
            int i61 = o0oooo1.f39021OooO0OO;
            int i62 = 0;
            int i63 = 0;
            while (i62 < i61 - 1) {
                byte[] bArr6 = bArr5[i62];
                int i64 = i63;
                int i65 = 0;
                while (i65 < i60 - 1) {
                    byte b2 = bArr6[i65];
                    int i66 = i65 + 1;
                    if (b2 == bArr6[i66]) {
                        int i67 = i62 + 1;
                        if (b2 == bArr5[i67][i65] && b2 == bArr5[i67][i66]) {
                            i64++;
                        }
                    }
                    i65 = i66;
                }
                i62++;
                i63 = i64;
            }
            int i68 = (i63 * 3) + iOooO0oO;
            byte[][] bArr7 = o0oooo1.f39019OooO00o;
            int i69 = o0oooo1.f39020OooO0O0;
            int i70 = o0oooo1.f39021OooO0OO;
            int i71 = 0;
            int i72 = 0;
            while (i71 < i70) {
                int i73 = i72;
                int i74 = 0;
                while (i74 < i69) {
                    byte[] bArr8 = bArr7[i71];
                    int i75 = i74 + 6;
                    if (i75 < i69) {
                        i = i69;
                        o000oooo2 = o000oooo5;
                        if (bArr8[i74] == 1 && bArr8[i74 + 1] == 0 && bArr8[i74 + 2] == 1 && bArr8[i74 + 3] == 1 && bArr8[i74 + 4] == 1 && bArr8[i74 + 5] == 0 && bArr8[i75] == 1 && (o000000.OooO(bArr8, i74 - 4, i74) || o000000.OooO(bArr8, i74 + 7, i74 + 11))) {
                            i73++;
                        }
                    } else {
                        o000oooo2 = o000oooo5;
                        i = i69;
                    }
                    int i76 = i71 + 6;
                    if (i76 < i70 && bArr7[i71][i74] == 1 && bArr7[i71 + 1][i74] == 0 && bArr7[i71 + 2][i74] == 1 && bArr7[i71 + 3][i74] == 1 && bArr7[i71 + 4][i74] == 1 && bArr7[i71 + 5][i74] == 0 && bArr7[i76][i74] == 1 && (o000000.OooOO0(bArr7, i74, i71 - 4, i71) || o000000.OooOO0(bArr7, i74, i71 + 7, i71 + 11))) {
                        i73++;
                    }
                    i74++;
                    i69 = i;
                    o000oooo5 = o000oooo2;
                }
                i71++;
                i72 = i73;
            }
            o000oOoO o000oooo6 = o000oooo5;
            int i77 = (i72 * 40) + i68;
            byte[][] bArr9 = o0oooo1.f39019OooO00o;
            int i78 = o0oooo1.f39020OooO0O0;
            int i79 = o0oooo1.f39021OooO0OO;
            int i80 = 0;
            for (int i81 = 0; i81 < i79; i81++) {
                byte[] bArr10 = bArr9[i81];
                for (int i82 = 0; i82 < i78; i82++) {
                    if (bArr10[i82] == 1) {
                        i80++;
                    }
                }
            }
            int i83 = o0oooo1.f39021OooO0OO * o0oooo1.f39020OooO0O0;
            int iAbs = (((Math.abs((i80 << 1) - i83) * 10) / i83) * 10) + i77;
            if (iAbs < i56) {
                i56 = iAbs;
                i57 = i58;
            }
            i58++;
            errorCorrectionLevel2 = errorCorrectionLevel3;
            o000oooo5 = o000oooo6;
        }
        o00Oo0.OooO00o(o00000o4, errorCorrectionLevel2, o000oooo5, i57, o0oooo1);
        int i84 = o0oooo1.f39020OooO0O0;
        int i85 = o0oooo1.f39021OooO0OO;
        int i86 = i51 << 1;
        int i87 = i84 + i86;
        int i88 = i86 + i85;
        int iMax3 = Math.max(200, i87);
        int iMax4 = Math.max(200, i88);
        int iMin = Math.min(iMax3 / i87, iMax4 / i88);
        int i89 = (iMax3 - (i84 * iMin)) / 2;
        int i90 = (iMax4 - (i85 * iMin)) / 2;
        o00000OO o00000oo2 = new o00000OO(iMax3, iMax4);
        int i91 = 0;
        while (i91 < i85) {
            int i92 = i89;
            int i93 = 0;
            while (i93 < i84) {
                if (o0oooo1.OooO00o(i93, i91) == 1) {
                    o00000oo2.OooO0o0(i92, i90, iMin, iMin);
                }
                i93++;
                i92 += iMin;
            }
            i91++;
            i90 += iMin;
        }
        return o00000oo2;
    }
}
