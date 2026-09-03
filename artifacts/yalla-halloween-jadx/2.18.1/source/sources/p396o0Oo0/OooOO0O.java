package p396o0Oo0;

import androidx.appcompat.widget.OooOOOO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p390o0OOooOO.o0;
import p392o0OOooo.o00000OO;
import p470o0Oooo0.o0O0ooO;
import p635o0ooO0O0.o000O00;
import p635o0ooO0O0.o000O000;
import p635o0ooO0O0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o0 {
    public static o00000OO OooO0O0(byte[][] bArr, int i) {
        int i2 = i * 2;
        o00000OO o00000oo2 = new o00000OO(bArr[0].length + i2, bArr.length + i2);
        int length = o00000oo2.f38918Oooo.length;
        for (int i3 = 0; i3 < length; i3++) {
            o00000oo2.f38918Oooo[i3] = 0;
        }
        int i4 = (o00000oo2.f38920Oooo0oO - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    o00000oo2.OooO0Oo(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return o00000oo2;
    }

    public static byte[][] OooO0OO(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:205:0x042a A[LOOP:13: B:204:0x0428->B:205:0x042a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0445  */
    /* JADX WARN: Code duplicated, block: B:209:0x044e  */
    @Override // p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
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
        char c;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        Compaction compactionValueOf = Compaction.AUTO;
        EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
        boolean zBooleanValue = map.containsKey(encodeHintType) ? Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue() : false;
        EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
        if (map.containsKey(encodeHintType2)) {
            compactionValueOf = Compaction.valueOf(map.get(encodeHintType2).toString());
        }
        EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
        if (map.containsKey(encodeHintType3)) {
            Objects.requireNonNull((o000Oo0) map.get(encodeHintType3));
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
        int i20 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
        EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
        int i21 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
        EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
        Charset charsetForName = map.containsKey(encodeHintType6) ? Charset.forName(map.get(encodeHintType6).toString()) : null;
        String str3 = "Error correction level must be between 0 and 8!";
        if (i21 < 0 || i21 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        int i22 = 1 << (i21 + 1);
        byte[] bArr = o000O00.f48847OooO00o;
        StringBuilder sb = new StringBuilder(str.length());
        if (charsetForName == null) {
            charsetForName = o000O00.f48851OooO0o0;
        } else if (!o000O00.f48851OooO0o0.equals(charsetForName) && (characterSetECIOooO00o = CharacterSetECI.OooO00o(charsetForName.name())) != null) {
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
        int i23 = o000O00.OooO00o.f48852OooO00o[compactionValueOf.ordinal()];
        if (i23 == 1) {
            z = zBooleanValue;
            i5 = i;
            i6 = i20;
            i7 = i21;
            str2 = "Error correction level must be between 0 and 8!";
            o000O00.OooO0OO(str, 0, length, sb, 0);
        } else if (i23 == 2) {
            z = zBooleanValue;
            i5 = i;
            i6 = i20;
            i7 = i21;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            o000O00.OooO00o(bytes, bytes.length, 1, sb);
        } else if (i23 != 3) {
            int i24 = 0;
            int i25 = 0;
            loop0: while (true) {
                int i26 = 0;
                while (true) {
                    if (i24 >= length) {
                        z = zBooleanValue;
                        i5 = i;
                        i6 = i20;
                        i7 = i21;
                        str2 = str3;
                        break loop0;
                    }
                    int i27 = i26;
                    int length2 = str.length();
                    if (i24 < length2) {
                        char cCharAt = str.charAt(i24);
                        int i28 = 0;
                        int i29 = i24;
                        while (o000O00.OooO0o(cCharAt) && i29 < length2) {
                            i28++;
                            i29++;
                            if (i29 < length2) {
                                cCharAt = str.charAt(i29);
                            }
                        }
                        i15 = i28;
                    } else {
                        i15 = 0;
                    }
                    if (i15 >= 13) {
                        break;
                    }
                    int length3 = str.length();
                    int i30 = i20;
                    int i31 = i24;
                    while (true) {
                        if (i31 < length3) {
                            char cCharAt2 = str.charAt(i31);
                            z3 = zBooleanValue;
                            i16 = i21;
                            int i32 = 13;
                            int i33 = 0;
                            while (i33 < i32) {
                                if (!o000O00.OooO0o(cCharAt2) || i31 >= length3) {
                                    i32 = 13;
                                    break;
                                }
                                i33++;
                                i31++;
                                if (i31 < length3) {
                                    cCharAt2 = str.charAt(i31);
                                }
                                i32 = 13;
                            }
                            if (i33 >= i32) {
                                i17 = (i31 - i24) - i33;
                                break;
                            }
                            if (i33 <= 0) {
                                char cCharAt3 = str.charAt(i31);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i31++;
                                }
                            }
                            zBooleanValue = z3;
                            i21 = i16;
                        } else {
                            z3 = zBooleanValue;
                            i16 = i21;
                        }
                        i17 = i31 - i24;
                        break;
                    }
                    if (i17 >= 5 || i15 == length) {
                        i18 = i;
                        if (i25 != 0) {
                            sb.append((char) 900);
                            i19 = 0;
                            i25 = 0;
                        } else {
                            i19 = i27;
                        }
                        int iOooO0OO = o000O00.OooO0OO(str, i24, i17, sb, i19);
                        i24 += i17;
                        i26 = iOooO0OO;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i34 = i24;
                        while (true) {
                            if (i34 >= length4) {
                                i18 = i;
                                break;
                            }
                            char cCharAt4 = str.charAt(i34);
                            i18 = i;
                            int i35 = 0;
                            for (int i36 = 13; i35 < i36 && o000O00.OooO0o(cCharAt4); i36 = 13) {
                                i35++;
                                int i37 = i34 + i35;
                                if (i37 >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i37);
                            }
                            if (i35 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i34);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i34++;
                            i = i18;
                        }
                        int i38 = i34 - i24;
                        if (i38 == 0) {
                            i38 = 1;
                        }
                        int i39 = i38 + i24;
                        byte[] bytes2 = str.substring(i24, i39).getBytes(charsetForName);
                        if (bytes2.length == 1 && i25 == 0) {
                            o000O00.OooO00o(bytes2, 1, 0, sb);
                            i26 = i27;
                        } else {
                            o000O00.OooO00o(bytes2, bytes2.length, i25, sb);
                            i25 = 1;
                            i26 = 0;
                        }
                        i24 = i39;
                    }
                    str3 = str3;
                    i20 = i30;
                    i = i18;
                    zBooleanValue = z3;
                    i21 = i16;
                }
                sb.append((char) 902);
                o000O00.OooO0O0(str, i24, i15, sb);
                i24 += i15;
                i25 = 2;
                str3 = str3;
            }
        } else {
            z = zBooleanValue;
            i5 = i;
            i6 = i20;
            i7 = i21;
            str2 = "Error correction level must be between 0 and 8!";
            sb.append((char) 902);
            o000O00.OooO0O0(str, 0, length, sb);
        }
        String string = sb.toString();
        int length5 = string.length();
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int[] iArr = null;
        for (int i40 = i5; i40 <= i2; i40++) {
            int i41 = length5 + 1 + i22;
            int i42 = (i41 / i40) + 1;
            if (i40 * i42 >= i41 + i40) {
                i42--;
            }
            if (i42 < i3) {
                break;
            }
            if (i42 <= i4) {
                float f2 = (((i40 * 17) + 69) * 0.357f) / (i42 * 2.0f);
                if (iArr == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr = new int[]{i40, i42};
                    f = f2;
                }
            }
        }
        if (iArr == null) {
            int i43 = length5 + 1 + i22;
            i8 = 1;
            int i44 = (i43 / i5) + 1;
            if (i5 * i44 >= i43 + i5) {
                i44--;
            }
            if (i44 < i3) {
                c = 0;
                iArr = new int[]{i5, i3};
            } else {
                c = 0;
            }
        } else {
            c = 0;
            i8 = 1;
        }
        if (iArr == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i45 = iArr[c];
        int i46 = iArr[i8];
        int i47 = (i45 * i46) - i22;
        int i48 = i47 > length5 + 1 ? (i47 - length5) - 1 : 0;
        if (length5 + i22 + i8 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i49 = length5 + i48 + i8;
        StringBuilder sb2 = new StringBuilder(i49);
        sb2.append((char) i49);
        sb2.append(string);
        for (int i50 = 0; i50 < i48; i50++) {
            sb2.append((char) 900);
        }
        String string2 = sb2.toString();
        if (i7 < 0 || (i9 = i7) > 8) {
            throw new IllegalArgumentException(str2);
        }
        char[] cArr = new char[i22];
        int length6 = string2.length();
        for (int i51 = 0; i51 < length6; i51++) {
            int i52 = i22 - 1;
            int iCharAt = (string2.charAt(i51) + cArr[i52]) % 929;
            while (i52 > 0) {
                int i53 = i52 - 1;
                cArr[i52] = (char) ((cArr[i53] + (929 - ((o0O0ooO.f40635OooO0O0[i9][i52] * iCharAt) % 929))) % 929);
                i52 = i53;
            }
            cArr[0] = (char) ((929 - ((iCharAt * o0O0ooO.f40635OooO0O0[i9][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(i22);
        for (int i54 = i22 - 1; i54 >= 0; i54--) {
            if (cArr[i54] != 0) {
                cArr[i54] = (char) (929 - cArr[i54]);
            }
            sb3.append(cArr[i54]);
        }
        String string3 = sb3.toString();
        o000O000 o000o001 = new o000O000(i46, i45);
        String strOooO0Oo = OooOo00.OooO0Oo(string2, string3);
        int i55 = 0;
        for (int i56 = 0; i56 < i46; i56++) {
            int i57 = i56 % 3;
            o000o001.f48854OooO0O0++;
            OooOOOO.OooO00o(130728, 17, o000o001.OooO00o());
            if (i57 == 0) {
                i12 = (i56 / 3) * 30;
                i10 = ((i46 - 1) / 3) + i12;
                i13 = i45 - 1;
            } else {
                if (i57 == 1) {
                    i12 = (i56 / 3) * 30;
                    int i58 = i46 - 1;
                    i10 = (i9 * 3) + i12 + (i58 % 3);
                    i13 = i58 / 3;
                } else {
                    int i59 = (i56 / 3) * 30;
                    i10 = (i45 - 1) + i59;
                    i11 = (i9 * 3) + i59 + ((i46 - 1) % 3);
                }
                OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][i10], 17, o000o001.OooO00o());
                for (i14 = 0; i14 < i45; i14++) {
                    OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][strOooO0Oo.charAt(i55)], 17, o000o001.OooO00o());
                    i55++;
                }
                if (z) {
                    OooOOOO.OooO00o(260649, 1, o000o001.OooO00o());
                } else {
                    OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][i11], 17, o000o001.OooO00o());
                    OooOOOO.OooO00o(260649, 18, o000o001.OooO00o());
                }
            }
            i11 = i13 + i12;
            OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][i10], 17, o000o001.OooO00o());
            while (i14 < i45) {
                OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][strOooO0Oo.charAt(i55)], 17, o000o001.OooO00o());
                i55++;
            }
            if (z) {
                OooOOOO.OooO00o(260649, 1, o000o001.OooO00o());
            } else {
                OooOOOO.OooO00o(OooOOOO.f5099OooO00o[i57][i11], 17, o000o001.OooO00o());
                OooOOOO.OooO00o(260649, 18, o000o001.OooO00o());
            }
        }
        byte[][] bArrOooO0O0 = o000o001.OooO0O0(1, 4);
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
        byte[][] bArrOooO0O1 = o000o001.OooO0O0(length7, length7 << 2);
        if (z2) {
            bArrOooO0O1 = OooO0OO(bArrOooO0O1);
        }
        return OooO0O0(bArrOooO0O1, i6);
    }
}
