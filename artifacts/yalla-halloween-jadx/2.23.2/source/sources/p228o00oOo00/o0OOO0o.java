package p228o00oOo00;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    public static abstract class OooO00o {
    }

    public static class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final int[] f39740OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static byte[] OooO00o(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int[] iArr = OooO0O0.f39740OooO00o;
        int i2 = length + 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i3 < i2) {
                if (i4 == 0) {
                    while (true) {
                        int i7 = i3 + 4;
                        if (i7 > i2 || (i5 = (iArr[bytes[i3] & UByte.MAX_VALUE] << 18) | (iArr[bytes[i3 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bytes[i3 + 2] & UByte.MAX_VALUE] << 6) | iArr[bytes[i3 + 3] & UByte.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr[i6 + 2] = (byte) i5;
                        bArr[i6 + 1] = (byte) (i5 >> 8);
                        bArr[i6] = (byte) (i5 >> 16);
                        i6 += 3;
                        i3 = i7;
                    }
                    if (i3 >= i2) {
                    }
                    i6 = 0;
                    z = false;
                    if (!z) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    if (i6 == i) {
                        return bArr;
                    }
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, 0, bArr2, 0, i6);
                    return bArr2;
                }
                int i8 = i3 + 1;
                int i9 = iArr[bytes[i3] & UByte.MAX_VALUE];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5 && i9 != -1) {
                                        i6 = 0;
                                        z = false;
                                    }
                                } else if (i9 == -2) {
                                    i4++;
                                } else if (i9 != -1) {
                                    i6 = 0;
                                    z = false;
                                }
                            } else if (i9 >= 0) {
                                i9 |= i5 << 6;
                                bArr[i6 + 2] = (byte) i9;
                                bArr[i6 + 1] = (byte) (i9 >> 8);
                                bArr[i6] = (byte) (i9 >> 16);
                                i6 += 3;
                                i4 = 0;
                            } else if (i9 == -2) {
                                bArr[i6 + 1] = (byte) (i5 >> 2);
                                bArr[i6] = (byte) (i5 >> 10);
                                i6 += 2;
                                i4 = 5;
                            } else if (i9 != -1) {
                                i6 = 0;
                                z = false;
                            }
                        } else if (i9 >= 0) {
                            i9 |= i5 << 6;
                            i4++;
                        } else if (i9 == -2) {
                            bArr[i6] = (byte) (i5 >> 4);
                            i4 = 4;
                            i6++;
                        } else if (i9 != -1) {
                            i6 = 0;
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalArgumentException("bad base-64");
                        }
                        if (i6 == i) {
                            return bArr;
                        }
                        byte[] bArr3 = new byte[i6];
                        System.arraycopy(bArr, 0, bArr3, 0, i6);
                        return bArr3;
                    }
                    if (i9 >= 0) {
                        i9 |= i5 << 6;
                        i4++;
                    } else if (i9 != -1) {
                        i6 = 0;
                        z = false;
                        if (!z) {
                            throw new IllegalArgumentException("bad base-64");
                        }
                        if (i6 == i) {
                            return bArr;
                        }
                        byte[] bArr4 = new byte[i6];
                        System.arraycopy(bArr, 0, bArr4, 0, i6);
                        return bArr4;
                    }
                    i5 = i9;
                } else if (i9 >= 0) {
                    i4++;
                    i5 = i9;
                } else if (i9 != -1) {
                    i6 = 0;
                    z = false;
                    if (!z) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    if (i6 == i) {
                        return bArr;
                    }
                    byte[] bArr5 = new byte[i6];
                    System.arraycopy(bArr, 0, bArr5, 0, i6);
                    return bArr5;
                }
                i3 = i8;
            }
            if (i4 == 1) {
                i6 = 0;
                z = false;
            } else if (i4 == 2) {
                bArr[i6] = (byte) (i5 >> 4);
                i6++;
            } else if (i4 == 3) {
                int i10 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 10);
                i6 = i10 + 1;
                bArr[i10] = (byte) (i5 >> 2);
            } else if (i4 == 4) {
                i6 = 0;
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("bad base-64");
            }
            if (i6 == i) {
                return bArr;
            }
            byte[] bArr6 = new byte[i6];
            System.arraycopy(bArr, 0, bArr6, 0, i6);
            return bArr6;
        }
    }
}
