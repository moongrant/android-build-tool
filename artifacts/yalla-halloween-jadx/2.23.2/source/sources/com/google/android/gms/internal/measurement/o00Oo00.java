package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 {
    public static int OooO(byte[] bArr, int i, o00OOOOo o00ooooo2) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OooOO0(b, bArr, i2, o00ooooo2);
        }
        o00ooooo2.f15032OooO00o = b;
        return i2;
    }

    public static int OooO00o(byte[] bArr, int i, o00OOOOo o00ooooo2) throws zzll {
        int iOooO = OooO(bArr, i, o00ooooo2);
        int i2 = o00ooooo2.f15032OooO00o;
        if (i2 < 0) {
            throw zzll.OooO0O0();
        }
        if (i2 > bArr.length - iOooO) {
            throw zzll.OooO0Oo();
        }
        if (i2 == 0) {
            o00ooooo2.f15034OooO0OO = zzka.zzb;
            return iOooO;
        }
        o00ooooo2.f15034OooO0OO = zzka.zzl(bArr, iOooO, i2);
        return iOooO + i2;
    }

    public static int OooO0O0(int i, byte[] bArr) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int OooO0OO(oo0oO0 oo0oo0, byte[] bArr, int i, int i2, int i3, o00OOOOo o00ooooo2) throws IOException {
        Object objZze = oo0oo0.zze();
        int iOooOOO0 = OooOOO0(objZze, oo0oo0, bArr, i, i2, i3, o00ooooo2);
        oo0oo0.OooO00o(objZze);
        o00ooooo2.f15034OooO0OO = objZze;
        return iOooOOO0;
    }

    public static int OooO0Oo(oo0oO0 oo0oo0, int i, byte[] bArr, int i2, int i3, zzli zzliVar, o00OOOOo o00ooooo2) throws IOException {
        Object objZze = oo0oo0.zze();
        int iOooOOO = OooOOO(objZze, oo0oo0, bArr, i2, i3, o00ooooo2);
        oo0oo0.OooO00o(objZze);
        o00ooooo2.f15034OooO0OO = objZze;
        zzliVar.add(objZze);
        while (iOooOOO < i3) {
            int iOooO = OooO(bArr, iOooOOO, o00ooooo2);
            if (i != o00ooooo2.f15032OooO00o) {
                break;
            }
            Object objZze2 = oo0oo0.zze();
            int iOooOOO2 = OooOOO(objZze2, oo0oo0, bArr, iOooO, i3, o00ooooo2);
            oo0oo0.OooO00o(objZze2);
            o00ooooo2.f15034OooO0OO = objZze2;
            zzliVar.add(objZze2);
            iOooOOO = iOooOOO2;
        }
        return iOooOOO;
    }

    public static int OooO0o(byte[] bArr, int i, o00OOOOo o00ooooo2) throws zzll {
        int iOooO = OooO(bArr, i, o00ooooo2);
        int i2 = o00ooooo2.f15032OooO00o;
        if (i2 < 0) {
            throw zzll.OooO0O0();
        }
        if (i2 == 0) {
            o00ooooo2.f15034OooO0OO = "";
            return iOooO;
        }
        o00ooooo2.f15034OooO0OO = new String(bArr, iOooO, i2, zzlj.f15277OooO00o);
        return iOooO + i2;
    }

    public static int OooO0o0(byte[] bArr, int i, zzli zzliVar, o00OOOOo o00ooooo2) throws IOException {
        o0O00OO o0o00oo2 = (o0O00OO) zzliVar;
        int iOooO = OooO(bArr, i, o00ooooo2);
        int i2 = o00ooooo2.f15032OooO00o + iOooO;
        while (iOooO < i2) {
            iOooO = OooO(bArr, iOooO, o00ooooo2);
            o0o00oo2.OooO0O0(o00ooooo2.f15032OooO00o);
        }
        if (iOooO == i2) {
            return iOooO;
        }
        throw zzll.OooO0Oo();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af A[PHI: r12
      0x00af: PHI (r12v20 byte) = (r12v19 byte), (r12v27 byte) binds: [B:55:0x00aa, B:57:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    public static int OooO0oO(byte[] bArr, int i, o00OOOOo o00ooooo2) throws zzll {
        int iOooO = OooO(bArr, i, o00ooooo2);
        int i2 = o00ooooo2.f15032OooO00o;
        if (i2 < 0) {
            throw zzll.OooO0O0();
        }
        if (i2 == 0) {
            o00ooooo2.f15034OooO0OO = "";
            return iOooO;
        }
        o oVar = oO00000o.f15154OooO00o;
        int length = bArr.length;
        if ((((length - iOooO) - i2) | iOooO | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iOooO), Integer.valueOf(i2)));
        }
        int i3 = iOooO + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iOooO < i3) {
            byte b = bArr[iOooO];
            if (!(b >= 0)) {
                break;
            }
            iOooO++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iOooO < i3) {
            int i5 = iOooO + 1;
            byte b2 = bArr[iOooO];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                iOooO = i5;
                while (true) {
                    i4 = i6;
                    if (iOooO < i3) {
                        byte b3 = bArr[iOooO];
                        if (!(b3 >= 0)) {
                            break;
                        }
                        iOooO++;
                        i6 = i4 + 1;
                        cArr[i4] = (char) b3;
                    } else {
                        break;
                    }
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw zzll.OooO00o();
                }
                int i7 = i5 + 1;
                byte b4 = bArr[i5];
                int i8 = i4 + 1;
                if (b2 < -62 || com.android.billingclient.api.o0000O0O.OooO0o(b4)) {
                    throw zzll.OooO00o();
                }
                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                iOooO = i7;
                i4 = i8;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw zzll.OooO00o();
                    }
                    int i9 = i5 + 1;
                    byte b5 = bArr[i5];
                    int i10 = i9 + 1;
                    byte b6 = bArr[i9];
                    int i11 = i4 + 1;
                    if (!com.android.billingclient.api.o0000O0O.OooO0o(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!com.android.billingclient.api.o0000O0O.OooO0o(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooO = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!com.android.billingclient.api.o0000O0O.OooO0o(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooO = i10;
                                    i4 = i11;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!com.android.billingclient.api.o0000O0O.OooO0o(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooO = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!com.android.billingclient.api.o0000O0O.OooO0o(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooO = i10;
                                    i4 = i11;
                                }
                            }
                        }
                    }
                    throw zzll.OooO00o();
                }
                if (i5 >= i3 - 2) {
                    throw zzll.OooO00o();
                }
                int i12 = i5 + 1;
                byte b7 = bArr[i5];
                int i13 = i12 + 1;
                byte b8 = bArr[i12];
                int i14 = i13 + 1;
                byte b9 = bArr[i13];
                if (com.android.billingclient.api.o0000O0O.OooO0o(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || com.android.billingclient.api.o0000O0O.OooO0o(b8) || com.android.billingclient.api.o0000O0O.OooO0o(b9)) {
                    throw zzll.OooO00o();
                }
                int i15 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i15 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i15 & 1023) + 56320);
                i4 += 2;
                iOooO = i14;
            }
        }
        o00ooooo2.f15034OooO0OO = new String(cArr, 0, i4);
        return i3;
    }

    public static int OooO0oo(int i, byte[] bArr, int i2, int i3, zznl zznlVar, o00OOOOo o00ooooo2) throws zzll {
        if ((i >>> 3) == 0) {
            throw new zzll("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iOooOO0o = OooOO0o(bArr, i2, o00ooooo2);
            zznlVar.OooO0O0(i, Long.valueOf(o00ooooo2.f15033OooO0O0));
            return iOooOO0o;
        }
        if (i4 == 1) {
            zznlVar.OooO0O0(i, Long.valueOf(OooOOOO(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooO = OooO(bArr, i2, o00ooooo2);
            int i5 = o00ooooo2.f15032OooO00o;
            if (i5 < 0) {
                throw zzll.OooO0O0();
            }
            if (i5 > bArr.length - iOooO) {
                throw zzll.OooO0Oo();
            }
            if (i5 == 0) {
                zznlVar.OooO0O0(i, zzka.zzb);
            } else {
                zznlVar.OooO0O0(i, zzka.zzl(bArr, iOooO, i5));
            }
            return iOooO + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzll("Protocol message contained an invalid tag (zero).");
            }
            zznlVar.OooO0O0(i, Integer.valueOf(OooO0O0(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zznl zznlVarOooO00o = zznl.OooO00o();
        int i7 = 0;
        while (i2 < i3) {
            int iOooO2 = OooO(bArr, i2, o00ooooo2);
            int i8 = o00ooooo2.f15032OooO00o;
            if (i8 == i6) {
                i7 = i8;
                i2 = iOooO2;
                break;
            }
            i7 = i8;
            i2 = OooO0oo(i8, bArr, iOooO2, i3, zznlVarOooO00o, o00ooooo2);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzll.OooO0OO();
        }
        zznlVar.OooO0O0(i, zznlVarOooO00o);
        return i2;
    }

    public static int OooOO0(int i, byte[] bArr, int i2, o00OOOOo o00ooooo2) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            o00ooooo2.f15032OooO00o = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            o00ooooo2.f15032OooO00o = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            o00ooooo2.f15032OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            o00ooooo2.f15032OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                o00ooooo2.f15032OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int OooOO0O(int i, byte[] bArr, int i2, int i3, zzli zzliVar, o00OOOOo o00ooooo2) {
        o0O00OO o0o00oo2 = (o0O00OO) zzliVar;
        int iOooO = OooO(bArr, i2, o00ooooo2);
        o0o00oo2.OooO0O0(o00ooooo2.f15032OooO00o);
        while (iOooO < i3) {
            int iOooO2 = OooO(bArr, iOooO, o00ooooo2);
            if (i != o00ooooo2.f15032OooO00o) {
                break;
            }
            iOooO = OooO(bArr, iOooO2, o00ooooo2);
            o0o00oo2.OooO0O0(o00ooooo2.f15032OooO00o);
        }
        return iOooO;
    }

    public static int OooOO0o(byte[] bArr, int i, o00OOOOo o00ooooo2) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            o00ooooo2.f15033OooO0O0 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            i3 = i5;
            b = b2;
        }
        o00ooooo2.f15033OooO0O0 = j2;
        return i3;
    }

    public static int OooOOO(Object obj, oo0oO0 oo0oo0, byte[] bArr, int i, int i2, o00OOOOo o00ooooo2) throws IOException {
        int iOooOO0 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooOO0 = OooOO0(i3, bArr, iOooOO0, o00ooooo2);
            i3 = o00ooooo2.f15032OooO00o;
        }
        int i4 = iOooOO0;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzll.OooO0Oo();
        }
        int i5 = i3 + i4;
        oo0oo0.OooO0Oo(obj, bArr, i4, i5, o00ooooo2);
        o00ooooo2.f15034OooO0OO = obj;
        return i5;
    }

    public static int OooOOO0(Object obj, oo0oO0 oo0oo0, byte[] bArr, int i, int i2, int i3, o00OOOOo o00ooooo2) throws IOException {
        int iOooOoO = ((o0O0o000) oo0oo0).OooOoO(obj, bArr, i, i2, i3, o00ooooo2);
        o00ooooo2.f15034OooO0OO = obj;
        return iOooOoO;
    }

    public static long OooOOOO(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
