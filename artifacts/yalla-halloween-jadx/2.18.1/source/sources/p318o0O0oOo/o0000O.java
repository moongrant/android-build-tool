package p318o0O0oOo;

import java.util.Arrays;
import o00O00O.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f36673OooO00o = {0, 0, 0, 1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float[] f36674OooO0O0 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f36675OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static int[] f36676OooO0Oo = new int[10];

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36677OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36678OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f36679OooO0OO;

        public OooO00o(int i, int i2, boolean z) {
            this.f36677OooO00o = i;
            this.f36678OooO0O0 = i2;
            this.f36679OooO0OO = z;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f36680OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36681OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36682OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36683OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f36684OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f36685OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f36686OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f36687OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f36688OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f36689OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f36690OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final int f36691OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final boolean f36692OooOOO0;

        public OooO0O0(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f36681OooO00o = i;
            this.f36682OooO0O0 = i2;
            this.f36683OooO0OO = i3;
            this.f36684OooO0Oo = i4;
            this.f36686OooO0o0 = i5;
            this.f36685OooO0o = i6;
            this.f36687OooO0oO = f;
            this.f36688OooO0oo = z;
            this.f36680OooO = z2;
            this.f36689OooOO0 = i7;
            this.f36690OooOO0O = i8;
            this.f36691OooOO0o = i9;
            this.f36692OooOOO0 = z3;
        }
    }

    public static void OooO00o(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int OooO0O0(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        o00000O0.OooO0Oo(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            OooO00o(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            OooO00o(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            OooO00o(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            if ((bArr[i5] & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                    OooO00o(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static OooO00o OooO0OO(byte[] bArr, int i) {
        o000O000 o000o001 = new o000O000(bArr, 3, i);
        o000o001.OooOO0O(8);
        int iOooO0oO = o000o001.OooO0oO();
        int iOooO0oO2 = o000o001.OooO0oO();
        o000o001.OooOO0();
        return new OooO00o(iOooO0oO, iOooO0oO2, o000o001.OooO0o0());
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x0175  */
    public static OooO0O0 OooO0Oo(byte[] bArr, int i, int i2) {
        int iOooO0oO;
        boolean z;
        int iOooO0oO2;
        boolean z2;
        int i3;
        boolean zOooO0o0;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        o000O000 o000o001 = new o000O000(bArr, i, i2);
        o000o001.OooOO0O(8);
        int iOooO0o = o000o001.OooO0o(8);
        int iOooO0o2 = o000o001.OooO0o(8);
        int iOooO0o3 = o000o001.OooO0o(8);
        int iOooO0oO3 = o000o001.OooO0oO();
        int i8 = 1;
        if (iOooO0o == 100 || iOooO0o == 110 || iOooO0o == 122 || iOooO0o == 244 || iOooO0o == 44 || iOooO0o == 83 || iOooO0o == 86 || iOooO0o == 118 || iOooO0o == 128 || iOooO0o == 138) {
            iOooO0oO = o000o001.OooO0oO();
            boolean zOooO0o1 = iOooO0oO == 3 ? o000o001.OooO0o0() : false;
            o000o001.OooO0oO();
            o000o001.OooO0oO();
            o000o001.OooOO0();
            if (o000o001.OooO0o0()) {
                int i9 = iOooO0oO != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (o000o001.OooO0o0()) {
                        int i11 = i10 < 6 ? 16 : 64;
                        int iOooO0oo = 8;
                        int i12 = 8;
                        for (int i13 = 0; i13 < i11; i13++) {
                            if (iOooO0oo != 0) {
                                iOooO0oo = ((o000o001.OooO0oo() + i12) + 256) % 256;
                            }
                            if (iOooO0oo != 0) {
                                i12 = iOooO0oo;
                            }
                        }
                    }
                    i10++;
                }
            }
            z = zOooO0o1;
        } else {
            iOooO0oO = 1;
            z = false;
        }
        int iOooO0oO4 = o000o001.OooO0oO() + 4;
        int iOooO0oO5 = o000o001.OooO0oO();
        if (iOooO0oO5 != 0) {
            if (iOooO0oO5 == 1) {
                boolean zOooO0o2 = o000o001.OooO0o0();
                o000o001.OooO0oo();
                o000o001.OooO0oo();
                long jOooO0oO = o000o001.OooO0oO();
                for (int i14 = 0; i14 < jOooO0oO; i14++) {
                    o000o001.OooO0oO();
                }
                z2 = zOooO0o2;
                i3 = 0;
            } else {
                iOooO0oO2 = 0;
            }
            o000o001.OooO0oO();
            o000o001.OooOO0();
            int iOooO0oO6 = o000o001.OooO0oO() + 1;
            int iOooO0oO7 = o000o001.OooO0oO() + 1;
            zOooO0o0 = o000o001.OooO0o0();
            int i15 = (2 - (zOooO0o0 ? 1 : 0)) * iOooO0oO7;
            if (!zOooO0o0) {
                o000o001.OooOO0();
            }
            o000o001.OooOO0();
            i4 = iOooO0oO6 * 16;
            i5 = i15 * 16;
            if (o000o001.OooO0o0()) {
                int iOooO0oO8 = o000o001.OooO0oO();
                int iOooO0oO9 = o000o001.OooO0oO();
                int iOooO0oO10 = o000o001.OooO0oO();
                int iOooO0oO11 = o000o001.OooO0oO();
                if (iOooO0oO == 0) {
                    i7 = 2 - (zOooO0o0 ? 1 : 0);
                } else {
                    if (iOooO0oO == 3) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i7 = (2 - (zOooO0o0 ? 1 : 0)) * (iOooO0oO == 1 ? 2 : 1);
                    i8 = i6;
                }
                i4 -= (iOooO0oO8 + iOooO0oO9) * i8;
                i5 -= (iOooO0oO10 + iOooO0oO11) * i7;
            }
            int i16 = i4;
            int i17 = i5;
            float f2 = 1.0f;
            if (o000o001.OooO0o0() || !o000o001.OooO0o0()) {
                f = 1.0f;
            } else {
                int iOooO0o4 = o000o001.OooO0o(8);
                if (iOooO0o4 == 255) {
                    int iOooO0o5 = o000o001.OooO0o(16);
                    int iOooO0o6 = o000o001.OooO0o(16);
                    if (iOooO0o5 != 0 && iOooO0o6 != 0) {
                        f2 = iOooO0o5 / iOooO0o6;
                    }
                    f = f2;
                } else {
                    float[] fArr = f36674OooO0O0;
                    if (iOooO0o4 < 17) {
                        f = fArr[iOooO0o4];
                    } else {
                        OooO0OO.OooO0O0(46, "Unexpected aspect_ratio_idc value: ", iOooO0o4, "NalUnitUtil");
                        f = 1.0f;
                    }
                }
            }
            return new OooO0O0(iOooO0o, iOooO0o2, iOooO0o3, iOooO0oO3, i16, i17, f, z, zOooO0o0, iOooO0oO4, iOooO0oO5, i3, z2);
        }
        iOooO0oO2 = o000o001.OooO0oO() + 4;
        i3 = iOooO0oO2;
        z2 = false;
        o000o001.OooO0oO();
        o000o001.OooOO0();
        int iOooO0oO12 = o000o001.OooO0oO() + 1;
        int iOooO0oO13 = o000o001.OooO0oO() + 1;
        zOooO0o0 = o000o001.OooO0o0();
        int i18 = (2 - (zOooO0o0 ? 1 : 0)) * iOooO0oO13;
        if (!zOooO0o0) {
            o000o001.OooOO0();
        }
        o000o001.OooOO0();
        i4 = iOooO0oO12 * 16;
        i5 = i18 * 16;
        if (o000o001.OooO0o0()) {
            int iOooO0oO14 = o000o001.OooO0oO();
            int iOooO0oO15 = o000o001.OooO0oO();
            int iOooO0oO16 = o000o001.OooO0oO();
            int iOooO0oO17 = o000o001.OooO0oO();
            if (iOooO0oO == 0) {
                i7 = 2 - (zOooO0o0 ? 1 : 0);
            } else {
                if (iOooO0oO == 3) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i7 = (2 - (zOooO0o0 ? 1 : 0)) * (iOooO0oO == 1 ? 2 : 1);
                i8 = i6;
            }
            i4 -= (iOooO0oO14 + iOooO0oO15) * i8;
            i5 -= (iOooO0oO16 + iOooO0oO17) * i7;
        }
        int i19 = i4;
        int i110 = i5;
        float f3 = 1.0f;
        if (o000o001.OooO0o0()) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        return new OooO0O0(iOooO0o, iOooO0o2, iOooO0o3, iOooO0oO3, i19, i110, f, z, zOooO0o0, iOooO0oO4, iOooO0oO5, i3, z2);
    }

    public static int OooO0o0(byte[] bArr, int i) {
        int i2;
        synchronized (f36675OooO0OO) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArr = f36676OooO0Oo;
                    if (iArr.length <= i4) {
                        f36676OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f36676OooO0Oo[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f36676OooO0Oo[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
