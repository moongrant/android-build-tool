package com.google.protobuf;

import com.umeng.analytics.pro.bz;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f19389OooO00o;

    public static abstract class OooO00o {
        public abstract int OooO00o(CharSequence charSequence, byte[] bArr, int i, int i2);

        public abstract int OooO0O0(byte[] bArr, int i, int i2);
    }

    public static final class OooO0O0 extends OooO00o {
        @Override // com.google.protobuf.o000000O.OooO00o
        public final int OooO00o(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new OooO0OO(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new OooO0OO(i7 - 1, length);
                        }
                        int i14 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i7++;
                } else {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) cCharAt2;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        @Override // com.google.protobuf.o000000O.OooO00o
        public final int OooO0O0(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                i = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b < -16) {
                            if (i3 >= i2 - 1) {
                                return o000000O.OooO0OO(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                i = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        } else {
                            if (i3 >= i2 - 2) {
                                return o000000O.OooO0OO(bArr, i3, i2);
                            }
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i6 = i5 + 1;
                                    if (bArr[i5] <= -65) {
                                        i3 = i6 + 1;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i = i3;
                }
            }
            return 0;
        }
    }

    public static class OooO0OO extends IllegalArgumentException {
        public OooO0OO(int i, int i2) {
            super(o00O00OO.OooO00o("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    public static final class OooO0o extends OooO00o {
        public static int OooO0OO(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                OooO00o oooO00o = o000000O.f19389OooO00o;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return o000000O.OooO00o(i, o000000.OooO0OO(bArr, j));
            }
            if (i2 == 2) {
                return o000000O.OooO0O0(i, o000000.OooO0OO(bArr, j), o000000.OooO0OO(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.o000000O.OooO00o
        public final int OooO00o(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = o000000.f19388OooO0Oo + ((long) i);
            long j5 = ((long) i2) + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed writing ");
                sbOooO0o0.append(charSequence.charAt(length - 1));
                sbOooO0o0.append(" at index ");
                sbOooO0o0.append(i + i2);
                throw new ArrayIndexOutOfBoundsException(sbOooO0o0.toString());
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                o000000.OooO0o(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                j2 = o000000.f19388OooO0Oo;
            } else {
                while (i4 < length) {
                    char cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 >= c || j4 >= j5) {
                        if (cCharAt2 < 2048 && j4 <= j5 - 2) {
                            long j6 = j4 + j;
                            o000000.OooO0o(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                            o000000.OooO0o(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                            j4 = j6 + j;
                        } else {
                            if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                                if (j4 > j5 - 4) {
                                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                        throw new OooO0OO(i4, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                                }
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char cCharAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        long j7 = j4 + 1;
                                        o000000.OooO0o(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                        long j8 = 1 + j7;
                                        o000000.OooO0o(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j9 = 1 + j8;
                                        o000000.OooO0o(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j = 1;
                                        o000000.OooO0o(bArr, j9, (byte) ((codePoint & 63) | 128));
                                        i4 = i5;
                                        j4 = j9 + 1;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new OooO0OO(i4 - 1, length);
                            }
                            long j10 = j4 + j;
                            o000000.OooO0o(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                            long j11 = j + j10;
                            o000000.OooO0o(bArr, j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                            j3 = j11 + 1;
                            o000000.OooO0o(bArr, j11, (byte) ((cCharAt2 & '?') | 128));
                            j = 1;
                        }
                        i4++;
                        c = 128;
                    } else {
                        j3 = j4 + j;
                        o000000.OooO0o(bArr, j4, (byte) cCharAt2);
                    }
                    j4 = j3;
                    i4++;
                    c = 128;
                }
                j2 = o000000.f19388OooO0Oo;
            }
            return (int) (j4 - j2);
        }

        @Override // com.google.protobuf.o000000O.OooO00o
        public final int OooO0O0(byte[] bArr, int i, int i2) {
            int i3;
            long j;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j2 = o000000.f19388OooO0Oo;
            long j3 = ((long) i) + j2;
            int i4 = (int) ((j2 + ((long) i2)) - j3);
            if (i4 >= 16) {
                int i5 = ((int) j3) & 7;
                int i6 = i5;
                long j4 = j3;
                while (true) {
                    if (i6 <= 0) {
                        int i7 = i4 - i5;
                        while (i7 >= 8 && (o000000.OooO0Oo(bArr, j4) & (-9187201950435737472L)) == 0) {
                            j4 += 8;
                            i7 -= 8;
                        }
                        i3 = i4 - i7;
                        break;
                    }
                    long j5 = j4 + 1;
                    if (o000000.OooO0OO(bArr, j4) < 0) {
                        i3 = i5 - i6;
                        break;
                    }
                    i6--;
                    j4 = j5;
                }
            } else {
                i3 = 0;
            }
            int i8 = i4 - i3;
            long j6 = j3 + ((long) i3);
            while (true) {
                byte b = 0;
                while (i8 > 0) {
                    long j7 = j6 + 1;
                    byte bOooO0OO = o000000.OooO0OO(bArr, j6);
                    if (bOooO0OO < 0) {
                        j6 = j7;
                        b = bOooO0OO;
                        break;
                    }
                    i8--;
                    j6 = j7;
                    b = bOooO0OO;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (b < -32) {
                    if (i9 == 0) {
                        return b;
                    }
                    i8 = i9 - 1;
                    if (b >= -62) {
                        j = j6 + 1;
                        if (o000000.OooO0OO(bArr, j6) > -65) {
                        }
                        j6 = j;
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i9 < 2) {
                        return OooO0OO(bArr, b, j6, i9);
                    }
                    i8 = i9 - 2;
                    long j8 = j6 + 1;
                    byte bOooO0OO2 = o000000.OooO0OO(bArr, j6);
                    if (bOooO0OO2 <= -65 && ((b != -32 || bOooO0OO2 >= -96) && (b != -19 || bOooO0OO2 < -96))) {
                        j6 = j8 + 1;
                        if (o000000.OooO0OO(bArr, j8) > -65) {
                        }
                    }
                } else {
                    if (i9 < 3) {
                        return OooO0OO(bArr, b, j6, i9);
                    }
                    i8 = i9 - 3;
                    long j9 = j6 + 1;
                    byte bOooO0OO3 = o000000.OooO0OO(bArr, j6);
                    if (bOooO0OO3 <= -65 && (((bOooO0OO3 + 112) + (b << 28)) >> 30) == 0) {
                        long j10 = j9 + 1;
                        if (o000000.OooO0OO(bArr, j9) <= -65) {
                            j = j10 + 1;
                            if (o000000.OooO0OO(bArr, j10) > -65) {
                            }
                            j6 = j;
                        }
                    }
                }
                return -1;
            }
        }
    }

    static {
        f19389OooO00o = o000000.f19387OooO0OO && o000000.f19386OooO0O0 ? new OooO0o() : new OooO0O0();
    }

    public static int OooO00o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int OooO0O0(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int OooO0OO(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return b ^ (b2 << 8);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return ((b3 << 8) ^ b) ^ (b4 << bz.n);
    }

    public static int OooO0Oo(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f19389OooO00o.OooO00o(charSequence, bArr, i, i2);
    }

    public static int OooO0o0(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new OooO0OO(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("UTF-8 length does not fit in int: ");
        sbOooO0o0.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }
}
