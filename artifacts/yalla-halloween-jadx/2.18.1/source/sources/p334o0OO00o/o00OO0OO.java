package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzmo;
import com.umeng.analytics.pro.bz;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p387o0OOoo0o.o00O0OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO {
    public static int OooO(int i, byte[] bArr, int i2, int i3, zzmo zzmoVar, o00OO0O0 o00oo0o1) throws zzko {
        if ((i >>> 3) == 0) {
            throw new zzko("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iOooOOO0 = OooOOO0(bArr, i2, o00oo0o1);
            zzmoVar.OooO0O0(i, Long.valueOf(o00oo0o1.f37330OooO0O0));
            return iOooOOO0;
        }
        if (i4 == 1) {
            zzmoVar.OooO0O0(i, Long.valueOf(OooOOO(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooOO0 = OooOO0(bArr, i2, o00oo0o1);
            int i5 = o00oo0o1.f37329OooO00o;
            if (i5 < 0) {
                throw zzko.OooO0O0();
            }
            if (i5 > bArr.length - iOooOO0) {
                throw zzko.OooO0Oo();
            }
            if (i5 == 0) {
                zzmoVar.OooO0O0(i, zzjd.zzb);
            } else {
                zzmoVar.OooO0O0(i, zzjd.zzl(bArr, iOooOO0, i5));
            }
            return iOooOO0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzko("Protocol message contained an invalid tag (zero).");
            }
            zzmoVar.OooO0O0(i, Integer.valueOf(OooO0O0(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzmo zzmoVarOooO00o = zzmo.OooO00o();
        int i7 = 0;
        while (i2 < i3) {
            int iOooOO1 = OooOO0(bArr, i2, o00oo0o1);
            int i8 = o00oo0o1.f37329OooO00o;
            if (i8 == i6) {
                i7 = i8;
                i2 = iOooOO1;
                break;
            }
            i7 = i8;
            i2 = OooO(i8, bArr, iOooOO1, i3, zzmoVarOooO00o, o00oo0o1);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzko.OooO0OO();
        }
        zzmoVar.OooO0O0(i, zzmoVarOooO00o);
        return i2;
    }

    public static int OooO00o(byte[] bArr, int i, o00OO0O0 o00oo0o1) throws zzko {
        int iOooOO0 = OooOO0(bArr, i, o00oo0o1);
        int i2 = o00oo0o1.f37329OooO00o;
        if (i2 < 0) {
            throw zzko.OooO0O0();
        }
        if (i2 > bArr.length - iOooOO0) {
            throw zzko.OooO0Oo();
        }
        if (i2 == 0) {
            o00oo0o1.f37331OooO0OO = zzjd.zzb;
            return iOooOO0;
        }
        o00oo0o1.f37331OooO0OO = zzjd.zzl(bArr, iOooOO0, i2);
        return iOooOO0 + i2;
    }

    public static int OooO0O0(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int OooO0OO(o0O0OOOo o0o0oooo, byte[] bArr, int i, int i2, int i3, o00OO0O0 o00oo0o1) throws IOException {
        o0O00oO0 o0o00oo1 = (o0O00oO0) o0o0oooo;
        Object objOooOO0 = ((zzke) o0o00oo1.f37378OooO0o0).OooOO0(4);
        int iOooOoO0 = o0o00oo1.OooOoO0(objOooOO0, bArr, i, i2, i3, o00oo0o1);
        o0o00oo1.OooO00o(objOooOO0);
        o00oo0o1.f37331OooO0OO = objOooOO0;
        return iOooOoO0;
    }

    public static int OooO0Oo(o0O0OOOo o0o0oooo, byte[] bArr, int i, int i2, o00OO0O0 o00oo0o1) throws IOException {
        int iOooOO0O = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooOO0O = OooOO0O(i3, bArr, iOooOO0O, o00oo0o1);
            i3 = o00oo0o1.f37329OooO00o;
        }
        int i4 = iOooOO0O;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzko.OooO0Oo();
        }
        Object objZze = o0o0oooo.zze();
        int i5 = i3 + i4;
        o0o0oooo.OooO0O0(objZze, bArr, i4, i5, o00oo0o1);
        o0o0oooo.OooO00o(objZze);
        o00oo0o1.f37331OooO0OO = objZze;
        return i5;
    }

    public static int OooO0o(byte[] bArr, int i, zzkl zzklVar, o00OO0O0 o00oo0o1) throws IOException {
        o0O000 o0o001 = (o0O000) zzklVar;
        int iOooOO0 = OooOO0(bArr, i, o00oo0o1);
        int i2 = o00oo0o1.f37329OooO00o + iOooOO0;
        while (iOooOO0 < i2) {
            iOooOO0 = OooOO0(bArr, iOooOO0, o00oo0o1);
            o0o001.OooO0OO(o00oo0o1.f37329OooO00o);
        }
        if (iOooOO0 == i2) {
            return iOooOO0;
        }
        throw zzko.OooO0Oo();
    }

    public static int OooO0o0(o0O0OOOo o0o0oooo, int i, byte[] bArr, int i2, int i3, zzkl zzklVar, o00OO0O0 o00oo0o1) throws IOException {
        int iOooO0Oo = OooO0Oo(o0o0oooo, bArr, i2, i3, o00oo0o1);
        zzklVar.add(o00oo0o1.f37331OooO0OO);
        while (iOooO0Oo < i3) {
            int iOooOO0 = OooOO0(bArr, iOooO0Oo, o00oo0o1);
            if (i != o00oo0o1.f37329OooO00o) {
                break;
            }
            iOooO0Oo = OooO0Oo(o0o0oooo, bArr, iOooOO0, i3, o00oo0o1);
            zzklVar.add(o00oo0o1.f37331OooO0OO);
        }
        return iOooO0Oo;
    }

    public static int OooO0oO(byte[] bArr, int i, o00OO0O0 o00oo0o1) throws zzko {
        int iOooOO0 = OooOO0(bArr, i, o00oo0o1);
        int i2 = o00oo0o1.f37329OooO00o;
        if (i2 < 0) {
            throw zzko.OooO0O0();
        }
        if (i2 == 0) {
            o00oo0o1.f37331OooO0OO = "";
            return iOooOO0;
        }
        o00oo0o1.f37331OooO0OO = new String(bArr, iOooOO0, i2, zzkm.f15980OooO00o);
        return iOooOO0 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[PHI: r12
      0x00b3: PHI (r12v20 byte) = (r12v19 byte), (r12v27 byte) binds: [B:57:0x00ad, B:59:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    public static int OooO0oo(byte[] bArr, int i, o00OO0O0 o00oo0o1) throws zzko {
        int iOooOO0 = OooOO0(bArr, i, o00oo0o1);
        int i2 = o00oo0o1.f37329OooO00o;
        if (i2 < 0) {
            throw zzko.OooO0O0();
        }
        if (i2 == 0) {
            o00oo0o1.f37331OooO0OO = "";
            return iOooOO0;
        }
        o0OOO00 o0ooo00 = o0OOO0OO.f37432OooO00o;
        int length = bArr.length;
        if ((iOooOO0 | i2 | ((length - iOooOO0) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iOooOO0), Integer.valueOf(i2)));
        }
        int i3 = iOooOO0 + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (iOooOO0 < i3) {
            byte b = bArr[iOooOO0];
            if (!(b >= 0)) {
                break;
            }
            iOooOO0++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (iOooOO0 < i3) {
            int i5 = iOooOO0 + 1;
            byte b2 = bArr[iOooOO0];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                iOooOO0 = i5;
                while (true) {
                    i4 = i6;
                    if (iOooOO0 >= i3) {
                        break;
                    }
                    byte b3 = bArr[iOooOO0];
                    if (!(b3 >= 0)) {
                        break;
                    }
                    iOooOO0++;
                    i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw zzko.OooO00o();
                }
                int i7 = i5 + 1;
                int i8 = i4 + 1;
                byte b4 = bArr[i5];
                if (b2 < -62 || o00O0OOO.OooO0oO(b4)) {
                    throw zzko.OooO00o();
                }
                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                iOooOO0 = i7;
                i4 = i8;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw zzko.OooO00o();
                    }
                    int i9 = i5 + 1;
                    int i10 = i9 + 1;
                    int i11 = i4 + 1;
                    byte b5 = bArr[i5];
                    byte b6 = bArr[i9];
                    if (!o00O0OOO.OooO0oO(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!o00O0OOO.OooO0oO(b6)) {
                                    cArr[i4] = (char) (((b2 & bz.m) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooOO0 = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!o00O0OOO.OooO0oO(b6)) {
                                    cArr[i4] = (char) (((b2 & bz.m) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooOO0 = i10;
                                    i4 = i11;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!o00O0OOO.OooO0oO(b6)) {
                                    cArr[i4] = (char) (((b2 & bz.m) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooOO0 = i10;
                                    i4 = i11;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!o00O0OOO.OooO0oO(b6)) {
                                    cArr[i4] = (char) (((b2 & bz.m) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    iOooOO0 = i10;
                                    i4 = i11;
                                }
                            }
                        }
                    }
                    throw zzko.OooO00o();
                }
                if (i5 >= i3 - 2) {
                    throw zzko.OooO00o();
                }
                int i12 = i5 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                byte b7 = bArr[i5];
                byte b8 = bArr[i12];
                byte b9 = bArr[i13];
                if (o00O0OOO.OooO0oO(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || o00O0OOO.OooO0oO(b8) || o00O0OOO.OooO0oO(b9)) {
                    throw zzko.OooO00o();
                }
                int i15 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i15 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i15 & 1023) + 56320);
                i4 += 2;
                iOooOO0 = i14;
            }
        }
        o00oo0o1.f37331OooO0OO = new String(cArr, 0, i4);
        return i3;
    }

    public static int OooOO0(byte[] bArr, int i, o00OO0O0 o00oo0o1) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OooOO0O(b, bArr, i2, o00oo0o1);
        }
        o00oo0o1.f37329OooO00o = b;
        return i2;
    }

    public static int OooOO0O(int i, byte[] bArr, int i2, o00OO0O0 o00oo0o1) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            o00oo0o1.f37329OooO00o = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            o00oo0o1.f37329OooO00o = i5 | (b2 << bz.l);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            o00oo0o1.f37329OooO00o = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            o00oo0o1.f37329OooO00o = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                o00oo0o1.f37329OooO00o = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int OooOO0o(int i, byte[] bArr, int i2, int i3, zzkl zzklVar, o00OO0O0 o00oo0o1) {
        o0O000 o0o001 = (o0O000) zzklVar;
        int iOooOO0 = OooOO0(bArr, i2, o00oo0o1);
        o0o001.OooO0OO(o00oo0o1.f37329OooO00o);
        while (iOooOO0 < i3) {
            int iOooOO1 = OooOO0(bArr, iOooOO0, o00oo0o1);
            if (i != o00oo0o1.f37329OooO00o) {
                break;
            }
            iOooOO0 = OooOO0(bArr, iOooOO1, o00oo0o1);
            o0o001.OooO0OO(o00oo0o1.f37329OooO00o);
        }
        return iOooOO0;
    }

    public static long OooOOO(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int OooOOO0(byte[] bArr, int i, o00OO0O0 o00oo0o1) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            o00oo0o1.f37330OooO0O0 = j;
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
            b = b2;
            i3 = i5;
        }
        o00oo0o1.f37330OooO0O0 = j2;
        return i3;
    }
}
