package p329o0OO00oo;

import androidx.camera.core.impl.OooOOOO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.EnumMap;
import o0OO000.OooO0O0;
import p326o0O0oooO.o0o0Oo;
import p327o0OO00Oo.o0OO00O;
import p327o0OO00Oo.o0OOO0o;
import p327o0OO00Oo.o0Oo0oo;
import p327o0OO00Oo.o0ooOOo;
import p327o0OO00Oo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o0o0Oo {
    public static OooO0O0 OooO0O0(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        OooO0O0 oooO0O0 = new OooO0O0(length, length2);
        int[] iArr = oooO0O0.f42983OooO0oO;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    oooO0O0.OooO0Oo(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return oooO0O0;
    }

    public static byte[][] OooO0OO(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:217:0x042e A[LOOP:13: B:216:0x042c->B:217:0x042e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x0447  */
    /* JADX WARN: Code duplicated, block: B:221:0x0450  */
    @Override // p326o0O0oooO.o0o0Oo
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        int i;
        int i2;
        int i3;
        int i4;
        CharacterSetECI characterSetECIOooO00o;
        boolean z;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int[][] iArr;
        int i13;
        int[][] iArr2;
        boolean z3;
        int i14;
        String str3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        Compaction compactionValueOf = Compaction.AUTO;
        EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
        boolean zBooleanValue = enumMap.containsKey(encodeHintType) ? Boolean.valueOf(enumMap.get(encodeHintType).toString()).booleanValue() : false;
        EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
        if (enumMap.containsKey(encodeHintType2)) {
            compactionValueOf = Compaction.valueOf(enumMap.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
        if (enumMap.containsKey(encodeHintType3)) {
            ((o0ooOOo) enumMap.get(encodeHintType3)).getClass();
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = 2;
            i2 = 30;
            i3 = 2;
            i4 = 30;
        }
        EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
        int i22 = enumMap.containsKey(encodeHintType4) ? Integer.parseInt(enumMap.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
        int i23 = enumMap.containsKey(encodeHintType5) ? Integer.parseInt(enumMap.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
        Charset charsetForName = enumMap.containsKey(encodeHintType6) ? Charset.forName(enumMap.get(encodeHintType6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i23 < 0 || i23 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        int i24 = 1 << (i23 + 1);
        byte[] bArr = o0OO00O.f43041OooO00o;
        StringBuilder sb = new StringBuilder(str.length());
        Charset charset = o0OO00O.f43045OooO0o0;
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (characterSetECIOooO00o = CharacterSetECI.OooO00o(charsetForName.name())) != null) {
            int iOooO0O0 = characterSetECIOooO00o.OooO0O0();
            if (iOooO0O0 >= 0 && iOooO0O0 < 900) {
                sb.append((char) 927);
                sb.append((char) iOooO0O0);
            } else if (iOooO0O0 < 810900) {
                sb.append((char) 926);
                sb.append((char) ((iOooO0O0 / 900) - 1));
                sb.append((char) (iOooO0O0 % 900));
            } else {
                if (iOooO0O0 >= 811800) {
                    throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(iOooO0O0)));
                }
                sb.append((char) 925);
                sb.append((char) (810900 - iOooO0O0));
            }
        }
        int length = str.length();
        int i25 = o0OO00O.OooO00o.f43046OooO00o[compactionValueOf.ordinal()];
        if (i25 == 1) {
            z = zBooleanValue;
            i5 = i;
            i6 = i22;
            i7 = i23;
            str2 = "Error correction level must be between 0 and 8!";
            o0OO00O.OooO0OO(sb, 0, str, length, 0);
        } else if (i25 == 2) {
            z = zBooleanValue;
            i5 = i;
            i6 = i22;
            i7 = i23;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            o0OO00O.OooO00o(bytes, bytes.length, 1, sb);
        } else if (i25 != 3) {
            int i26 = 0;
            int i27 = 0;
            loop0: while (true) {
                int i28 = 0;
                while (true) {
                    if (i26 >= length) {
                        z = zBooleanValue;
                        i5 = i;
                        i6 = i22;
                        i7 = i23;
                        str2 = str4;
                        break loop0;
                    }
                    int i29 = i28;
                    int length2 = str.length();
                    if (i26 < length2) {
                        i15 = 0;
                        str3 = str4;
                        char c = '0';
                        i14 = i22;
                        char cCharAt = str.charAt(i26);
                        z3 = zBooleanValue;
                        int i30 = i26;
                        while (true) {
                            if (!(cCharAt >= c && cCharAt <= '9') || i30 >= length2) {
                                break;
                            }
                            i15++;
                            i30++;
                            if (i30 < length2) {
                                cCharAt = str.charAt(i30);
                            }
                            c = '0';
                        }
                    } else {
                        z3 = zBooleanValue;
                        i14 = i22;
                        str3 = str4;
                        i15 = 0;
                    }
                    i16 = i15;
                    char c2 = '\r';
                    if (i16 >= 13) {
                        break;
                    }
                    int length3 = str.length();
                    int i31 = i26;
                    while (true) {
                        if (i31 < length3) {
                            i17 = i;
                            int i32 = 0;
                            i18 = i23;
                            char cCharAt2 = str.charAt(i31);
                            while (i32 < c2) {
                                if (!(cCharAt2 >= '0' && cCharAt2 <= '9') || i31 >= length3) {
                                    c2 = '\r';
                                    break;
                                }
                                i32++;
                                i31++;
                                if (i31 < length3) {
                                    cCharAt2 = str.charAt(i31);
                                }
                                c2 = '\r';
                            }
                            if (i32 >= c2) {
                                i19 = (i31 - i26) - i32;
                                break;
                            }
                            if (i32 <= 0) {
                                char cCharAt3 = str.charAt(i31);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == c2 || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i31++;
                                }
                            }
                            c2 = '\r';
                            i23 = i18;
                            i = i17;
                        } else {
                            i17 = i;
                            i18 = i23;
                        }
                        i19 = i31 - i26;
                        break;
                    }
                    if (i19 >= 5 || i16 == length) {
                        if (i27 != 0) {
                            sb.append((char) 900);
                            i20 = 0;
                            i27 = 0;
                        } else {
                            i20 = i29;
                        }
                        int iOooO0OO = o0OO00O.OooO0OO(sb, i26, str, i19, i20);
                        i26 += i19;
                        i28 = iOooO0OO;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i33 = i26;
                        while (i33 < length4) {
                            char cCharAt4 = str.charAt(i33);
                            int i34 = 0;
                            while (i34 < 13) {
                                if (!(cCharAt4 >= '0' && cCharAt4 <= '9') || (i21 = i33 + (i34 = i34 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i21);
                            }
                            if (i34 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i33);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i33++;
                        }
                        int i35 = i33 - i26;
                        if (i35 == 0) {
                            i35 = 1;
                        }
                        int i36 = i35 + i26;
                        byte[] bytes2 = str.substring(i26, i36).getBytes(charsetForName);
                        if (bytes2.length == 1 && i27 == 0) {
                            o0OO00O.OooO00o(bytes2, 1, 0, sb);
                            i28 = i29;
                        } else {
                            o0OO00O.OooO00o(bytes2, bytes2.length, i27, sb);
                            i27 = 1;
                            i28 = 0;
                        }
                        i26 = i36;
                    }
                    str4 = str3;
                    i22 = i14;
                    zBooleanValue = z3;
                    i23 = i18;
                    i = i17;
                }
                sb.append((char) 902);
                o0OO00O.OooO0O0(sb, i26, i16, str);
                i26 += i16;
                i27 = 2;
                str4 = str3;
                i22 = i14;
                zBooleanValue = z3;
            }
        } else {
            z = zBooleanValue;
            i5 = i;
            i6 = i22;
            i7 = i23;
            str2 = "Error correction level must be between 0 and 8!";
            sb.append((char) 902);
            o0OO00O.OooO0O0(sb, 0, length, str);
        }
        String string = sb.toString();
        int length5 = string.length();
        float f = 0.0f;
        int[] iArr3 = null;
        for (int i37 = i5; i37 <= i2; i37++) {
            int i38 = length5 + 1 + i24;
            int i39 = (i38 / i37) + 1;
            if (i37 * i39 >= i38 + i37) {
                i39--;
            }
            if (i39 < i3) {
                break;
            }
            if (i39 <= i4) {
                float f2 = (((i37 * 17) + 69) * 0.357f) / (i39 * 2.0f);
                if (iArr3 == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr3 = new int[]{i37, i39};
                    f = f2;
                }
            }
        }
        if (iArr3 == null) {
            int i40 = length5 + 1 + i24;
            int i41 = (i40 / i5) + 1;
            if (i5 * i41 >= i40 + i5) {
                i41--;
            }
            if (i41 < i3) {
                iArr3 = new int[]{i5, i3};
            }
        }
        if (iArr3 == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i42 = iArr3[0];
        int i43 = iArr3[1];
        int i44 = (i42 * i43) - i24;
        int i45 = i44 > length5 + 1 ? (i44 - length5) - 1 : 0;
        if (i24 + length5 + 1 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i46 = length5 + i45 + 1;
        StringBuilder sb2 = new StringBuilder(i46);
        sb2.append((char) i46);
        sb2.append(string);
        for (int i47 = 0; i47 < i45; i47++) {
            sb2.append((char) 900);
        }
        String string2 = sb2.toString();
        if (i7 < 0 || (i8 = i7) > 8) {
            throw new IllegalArgumentException(str2);
        }
        char[] cArr = new char[i24];
        int length6 = string2.length();
        for (int i48 = 0; i48 < length6; i48++) {
            int i49 = i24 - 1;
            int iCharAt = (string2.charAt(i48) + cArr[i49]) % 929;
            while (true) {
                iArr2 = o0Oo0oo.f43048OooO00o;
                if (i49 > 0) {
                    int i50 = i49 - 1;
                    cArr[i49] = (char) ((cArr[i50] + (929 - ((iArr2[i8][i49] * iCharAt) % 929))) % 929);
                    i49 = i50;
                }
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i8][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(i24);
        while (true) {
            i24--;
            if (i24 < 0) {
                break;
            }
            char c3 = cArr[i24];
            if (c3 != 0) {
                cArr[i24] = (char) (929 - c3);
            }
            sb3.append(cArr[i24]);
        }
        String string3 = sb3.toString();
        oo000o oo000oVar = new oo000o(i43, i42);
        String strOooO00o = OooOOOO.OooO00o(string2, string3);
        int i51 = 0;
        for (int i52 = 0; i52 < i43; i52++) {
            int i53 = i52 % 3;
            oo000oVar.f43050OooO0O0++;
            o0OOO0o.OooO00o(130728, 17, oo000oVar.OooO00o());
            if (i53 == 0) {
                i11 = (i52 / 3) * 30;
                i9 = ((i43 - 1) / 3) + i11;
                i12 = i42 - 1;
            } else {
                if (i53 == 1) {
                    i11 = (i52 / 3) * 30;
                    int i54 = i43 - 1;
                    i9 = (i8 * 3) + i11 + (i54 % 3);
                    i12 = i54 / 3;
                } else {
                    int i55 = (i52 / 3) * 30;
                    i9 = (i42 - 1) + i55;
                    i10 = (i8 * 3) + i55 + ((i43 - 1) % 3);
                }
                iArr = o0OOO0o.f43047OooO00o;
                o0OOO0o.OooO00o(iArr[i53][i9], 17, oo000oVar.OooO00o());
                for (i13 = 0; i13 < i42; i13++) {
                    o0OOO0o.OooO00o(iArr[i53][strOooO00o.charAt(i51)], 17, oo000oVar.OooO00o());
                    i51++;
                }
                if (z) {
                    o0OOO0o.OooO00o(260649, 1, oo000oVar.OooO00o());
                } else {
                    o0OOO0o.OooO00o(iArr[i53][i10], 17, oo000oVar.OooO00o());
                    o0OOO0o.OooO00o(260649, 18, oo000oVar.OooO00o());
                }
            }
            i10 = i12 + i11;
            iArr = o0OOO0o.f43047OooO00o;
            o0OOO0o.OooO00o(iArr[i53][i9], 17, oo000oVar.OooO00o());
            while (i13 < i42) {
                o0OOO0o.OooO00o(iArr[i53][strOooO00o.charAt(i51)], 17, oo000oVar.OooO00o());
                i51++;
            }
            if (z) {
                o0OOO0o.OooO00o(260649, 1, oo000oVar.OooO00o());
            } else {
                o0OOO0o.OooO00o(iArr[i53][i10], 17, oo000oVar.OooO00o());
                o0OOO0o.OooO00o(260649, 18, oo000oVar.OooO00o());
            }
        }
        byte[][] bArrOooO0O0 = oo000oVar.OooO0O0(1, 4);
        if (bArrOooO0O0[0].length < bArrOooO0O0.length) {
            bArrOooO0O0 = OooO0OO(bArrOooO0O0);
            z2 = true;
        } else {
            z2 = false;
        }
        int length7 = 200 / bArrOooO0O0[0].length;
        int length8 = 200 / bArrOooO0O0.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return OooO0O0(bArrOooO0O0, i6);
        }
        byte[][] bArrOooO0O1 = oo000oVar.OooO0O0(length7, length7 << 2);
        if (z2) {
            bArrOooO0O1 = OooO0OO(bArrOooO0O1);
        }
        return OooO0O0(bArrOooO0O1, i6);
    }
}
