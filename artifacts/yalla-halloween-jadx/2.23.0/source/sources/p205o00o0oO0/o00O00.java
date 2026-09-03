package p205o00o0oO0;

import java.util.Arrays;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final short[] f39355OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39356OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39357OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f39358OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f39359OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39360OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f39361OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f39362OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f39363OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public short[] f39364OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f39365OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public short[] f39366OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public short[] f39367OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f39368OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f39369OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f39370OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f39371OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f39372OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f39373OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f39374OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f39375OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f39376OooOo0O;

    public o00O00(float f, float f2, int i, int i2, int i3) {
        this.f39356OooO00o = i;
        this.f39357OooO0O0 = i2;
        this.f39358OooO0OO = f;
        this.f39359OooO0Oo = f2;
        this.f39361OooO0o0 = i / i3;
        this.f39360OooO0o = i / 400;
        int i4 = i / 65;
        this.f39362OooO0oO = i4;
        int i5 = i4 * 2;
        this.f39363OooO0oo = i5;
        this.f39355OooO = new short[i5];
        this.f39364OooOO0 = new short[i5 * i2];
        this.f39366OooOO0o = new short[i5 * i2];
        this.f39367OooOOO = new short[i5 * i2];
    }

    public static void OooO0Oo(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void OooO00o(short[] sArr, int i, int i2) {
        int i3 = this.f39363OooO0oo / i2;
        int i4 = this.f39357OooO0O0;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f39355OooO[i7] = (short) (i8 / i5);
        }
    }

    public final short[] OooO0O0(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f39357OooO0O0;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int OooO0OO(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f39357OooO0O0;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f39374OooOo0 = i6 / i7;
        this.f39376OooOo0O = i8 / i5;
        return i7;
    }

    public final void OooO0o0() {
        int i;
        int i2;
        float f;
        int iOooO0OO;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.f39368OooOOO0;
        float f2 = this.f39358OooO0OO;
        float f3 = this.f39359OooO0Oo;
        float f4 = f2 / f3;
        float f5 = this.f39361OooO0o0 * f3;
        double d = f4;
        int i11 = this.f39356OooO00o;
        int i12 = this.f39357OooO0O0;
        if (d > 1.00001d || d < 0.99999d) {
            int i13 = this.f39365OooOO0O;
            int i14 = this.f39363OooO0oo;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f39371OooOOo;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        short[] sArr = this.f39364OooOO0;
                        short[] sArrOooO0O0 = OooO0O0(this.f39366OooOO0o, this.f39368OooOOO0, iMin);
                        this.f39366OooOO0o = sArrOooO0O0;
                        i = i10;
                        System.arraycopy(sArr, i15 * i12, sArrOooO0O0, this.f39368OooOOO0 * i12, i12 * iMin);
                        this.f39368OooOOO0 += iMin;
                        this.f39371OooOOo -= iMin;
                        i15 += iMin;
                        f = f5;
                        i2 = i11;
                    } else {
                        i = i10;
                        short[] sArr2 = this.f39364OooOO0;
                        int i17 = i11 > 4000 ? i11 / 4000 : 1;
                        int i18 = this.f39362OooO0oO;
                        int i19 = this.f39360OooO0o;
                        if (i12 == 1 && i17 == 1) {
                            iOooO0OO = OooO0OO(sArr2, i15, i19, i18);
                            f = f5;
                            i2 = i11;
                        } else {
                            OooO00o(sArr2, i15, i17);
                            i2 = i11;
                            short[] sArr3 = this.f39355OooO;
                            f = f5;
                            int iOooO0OO2 = OooO0OO(sArr3, 0, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iOooO0OO2 * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i12 == 1) {
                                    iOooO0OO = OooO0OO(sArr2, i15, i19, i18);
                                } else {
                                    OooO00o(sArr2, i15, 1);
                                    iOooO0OO = OooO0OO(sArr3, 0, i19, i18);
                                }
                            } else {
                                iOooO0OO = iOooO0OO2;
                            }
                        }
                        int i24 = this.f39374OooOo0;
                        int i25 = i24 != 0 && this.f39373OooOOoo != 0 && this.f39376OooOo0O <= i24 * 3 && i24 * 2 > this.f39375OooOo00 * 3 ? this.f39373OooOOoo : iOooO0OO;
                        this.f39375OooOo00 = i24;
                        this.f39373OooOOoo = iOooO0OO;
                        if (d > 1.0d) {
                            short[] sArr4 = this.f39364OooOO0;
                            if (f4 >= 2.0f) {
                                i4 = (int) (i25 / (f4 - 1.0f));
                            } else {
                                this.f39371OooOOo = (int) (((2.0f - f4) * i25) / (f4 - 1.0f));
                                i4 = i25;
                            }
                            short[] sArrOooO0O1 = OooO0O0(this.f39366OooOO0o, this.f39368OooOOO0, i4);
                            this.f39366OooOO0o = sArrOooO0O1;
                            int i26 = i15;
                            OooO0Oo(i4, this.f39357OooO0O0, sArrOooO0O1, this.f39368OooOOO0, sArr4, i26, sArr4, i15 + i25);
                            this.f39368OooOOO0 += i4;
                            i15 = i25 + i4 + i26;
                        } else {
                            int i27 = i15;
                            short[] sArr5 = this.f39364OooOO0;
                            if (f4 < 0.5f) {
                                i3 = (int) ((i25 * f4) / (1.0f - f4));
                            } else {
                                this.f39371OooOOo = (int) ((((2.0f * f4) - 1.0f) * i25) / (1.0f - f4));
                                i3 = i25;
                            }
                            int i28 = i25 + i3;
                            short[] sArrOooO0O2 = OooO0O0(this.f39366OooOO0o, this.f39368OooOOO0, i28);
                            this.f39366OooOO0o = sArrOooO0O2;
                            System.arraycopy(sArr5, i27 * i12, sArrOooO0O2, this.f39368OooOOO0 * i12, i12 * i25);
                            OooO0Oo(i3, this.f39357OooO0O0, this.f39366OooOO0o, this.f39368OooOOO0 + i25, sArr5, i27 + i25, sArr5, i27);
                            this.f39368OooOOO0 += i28;
                            i15 = i27 + i3;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    i10 = i;
                    i11 = i2;
                    f5 = f;
                }
                int i29 = this.f39365OooOO0O - i15;
                short[] sArr6 = this.f39364OooOO0;
                System.arraycopy(sArr6, i15 * i12, sArr6, 0, i12 * i29);
                this.f39365OooOO0O = i29;
            }
            if (f != 1.0f || this.f39368OooOOO0 == (i5 = i)) {
            }
            int i30 = i2;
            int i31 = (int) (i30 / f);
            int i32 = i30;
            while (true) {
                if (i31 <= 16384 && i32 <= 16384) {
                    break;
                }
                i31 /= 2;
                i32 /= 2;
            }
            int i33 = this.f39368OooOOO0 - i5;
            short[] sArrOooO0O3 = OooO0O0(this.f39367OooOOO, this.f39369OooOOOO, i33);
            this.f39367OooOOO = sArrOooO0O3;
            System.arraycopy(this.f39366OooOO0o, i5 * i12, sArrOooO0O3, this.f39369OooOOOO * i12, i12 * i33);
            this.f39368OooOOO0 = i5;
            this.f39369OooOOOO += i33;
            int i34 = 0;
            while (true) {
                i6 = this.f39369OooOOOO;
                i7 = i6 - 1;
                if (i34 >= i7) {
                    break;
                }
                while (true) {
                    i8 = this.f39370OooOOOo + 1;
                    int i35 = i8 * i31;
                    i9 = this.f39372OooOOo0;
                    if (i35 <= i9 * i32) {
                        break;
                    }
                    this.f39366OooOO0o = OooO0O0(this.f39366OooOO0o, this.f39368OooOOO0, 1);
                    for (int i36 = 0; i36 < i12; i36++) {
                        short[] sArr7 = this.f39366OooOO0o;
                        int i37 = (this.f39368OooOOO0 * i12) + i36;
                        short[] sArr8 = this.f39367OooOOO;
                        int i38 = (i34 * i12) + i36;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i12];
                        int i39 = this.f39372OooOOo0 * i32;
                        int i40 = this.f39370OooOOOo;
                        int i41 = i40 * i31;
                        int i42 = (i40 + 1) * i31;
                        int i43 = i42 - i39;
                        int i44 = i42 - i41;
                        sArr7[i37] = (short) ((((i44 - i43) * s2) + (s * i43)) / i44);
                    }
                    this.f39372OooOOo0++;
                    this.f39368OooOOO0++;
                }
                this.f39370OooOOOo = i8;
                if (i8 == i32) {
                    this.f39370OooOOOo = 0;
                    o00O000o.OooO0Oo(i9 == i31);
                    this.f39372OooOOo0 = 0;
                }
                i34++;
            }
            if (i7 == 0) {
                return;
            }
            short[] sArr9 = this.f39367OooOOO;
            System.arraycopy(sArr9, i7 * i12, sArr9, 0, (i6 - i7) * i12);
            this.f39369OooOOOO -= i7;
            return;
        }
        short[] sArr10 = this.f39364OooOO0;
        int i45 = this.f39365OooOO0O;
        short[] sArrOooO0O4 = OooO0O0(this.f39366OooOO0o, i10, i45);
        this.f39366OooOO0o = sArrOooO0O4;
        System.arraycopy(sArr10, 0 * i12, sArrOooO0O4, this.f39368OooOOO0 * i12, i12 * i45);
        this.f39368OooOOO0 += i45;
        this.f39365OooOO0O = 0;
        i = i10;
        f = f5;
        i2 = i11;
        if (f != 1.0f) {
        }
    }
}
