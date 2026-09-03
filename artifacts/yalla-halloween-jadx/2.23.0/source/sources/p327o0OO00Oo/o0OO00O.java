package p327o0OO00Oo;

import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f43043OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f43041OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f43042OooO0O0 = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f43044OooO0Oo = new byte[128];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Charset f43045OooO0o0 = StandardCharsets.ISO_8859_1;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f43046OooO00o;

        static {
            int[] iArr = new int[Compaction.values().length];
            f43046OooO00o = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43046OooO00o[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43046OooO00o[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f43043OooO0OO = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f43041OooO00o;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f43043OooO0OO[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f43044OooO0Oo, (byte) -1);
        while (true) {
            byte[] bArr3 = f43042OooO0O0;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f43044OooO0Oo[b2] = (byte) i;
            }
            i++;
        }
    }

    public static void OooO00o(byte[] bArr, int i, int i2, StringBuilder sb) {
        int i3;
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i >= 6) {
            char[] cArr = new char[5];
            i3 = 0;
            while ((0 + i) - i3 >= 6) {
                long j = 0;
                for (int i4 = 0; i4 < 6; i4++) {
                    j = (j << 8) + ((long) (bArr[i3 + i4] & UByte.MAX_VALUE));
                }
                for (int i5 = 0; i5 < 5; i5++) {
                    cArr[i5] = (char) (j % 900);
                    j /= 900;
                }
                for (int i6 = 4; i6 >= 0; i6--) {
                    sb.append(cArr[i6]);
                }
                i3 += 6;
            }
        } else {
            i3 = 0;
        }
        while (i3 < 0 + i) {
            sb.append((char) (bArr[i3] & UByte.MAX_VALUE));
            i3++;
        }
    }

    public static void OooO0O0(StringBuilder sb, int i, int i2, String str) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb.append(sb2.charAt(length));
                }
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x000e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[EDGE_INSN: B:93:0x0103->B:72:0x0103 BREAK  A[LOOP:0: B:3:0x000e->B:110:0x000e], SYNTHETIC] */
    public static int OooO0OO(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt = charSequence.charAt(i6);
            byte[] bArr = f43044OooO0Oo;
            byte[] bArr2 = f43043OooO0OO;
            if (i4 == 0) {
                if (OooO0o0(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'A'));
                    }
                } else if (OooO0Oo(cCharAt)) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (bArr2[cCharAt] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) bArr[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                    break;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        byte b = bArr[cCharAt];
                        if (b != -1) {
                            sb2.append((char) b);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else {
                        byte b2 = bArr2[cCharAt];
                        if (b2 != -1) {
                            sb2.append((char) b2);
                        } else if (OooO0o0(cCharAt)) {
                            sb2.append((char) 28);
                            i4 = 0;
                        } else if (OooO0Oo(cCharAt)) {
                            sb2.append((char) 27);
                            i4 = 1;
                        } else {
                            int i7 = i6 + 1;
                            if (i7 < i2) {
                                if (bArr[charSequence.charAt(i7)] != -1) {
                                    sb2.append((char) 25);
                                    i4 = 3;
                                }
                            }
                            sb2.append((char) 29);
                            sb2.append((char) bArr[cCharAt]);
                        }
                    }
                } else if (OooO0Oo(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt - 'a'));
                    }
                } else if (OooO0o0(cCharAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt - 'A'));
                } else if (bArr2[cCharAt] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) bArr[cCharAt]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                }
            }
        }
        int length = sb2.length();
        char cCharAt2 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt2 = (char) (sb2.charAt(i8) + (cCharAt2 * 30));
                sb.append(cCharAt2);
            } else {
                cCharAt2 = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((cCharAt2 * 30) + 29));
        }
        return i4;
    }

    public static boolean OooO0Oo(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean OooO0o0(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
