package p293o0O0Oo0O;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.Arrays;
import kotlin.KotlinVersion;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final short[] f35781OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f35784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f35785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f35786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f35787OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f35788OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f35789OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public short[] f35790OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35791OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public short[] f35792OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public short[] f35793OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f35794OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f35795OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f35796OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f35797OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f35798OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f35799OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f35800OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f35801OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f35802OooOo0O;

    public o0OOO0o(int i, int i2, float f, float f2, int i3) {
        this.f35782OooO00o = i;
        this.f35783OooO0O0 = i2;
        this.f35784OooO0OO = f;
        this.f35785OooO0Oo = f2;
        this.f35787OooO0o0 = i / i3;
        this.f35786OooO0o = i / ShopVehicleListModel.VehicleTagType_Vip400;
        int i4 = i / 65;
        this.f35788OooO0oO = i4;
        int i5 = i4 * 2;
        this.f35789OooO0oo = i5;
        this.f35781OooO = new short[i5];
        this.f35790OooOO0 = new short[i5 * i2];
        this.f35792OooOO0o = new short[i5 * i2];
        this.f35793OooOOO = new short[i5 * i2];
    }

    public static void OooO0o0(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
        short[] sArrOooO0OO = OooO0OO(this.f35792OooOO0o, this.f35794OooOOO0, i2);
        this.f35792OooOO0o = sArrOooO0OO;
        int i3 = this.f35783OooO0O0;
        System.arraycopy(sArr, i * i3, sArrOooO0OO, this.f35794OooOOO0 * i3, i3 * i2);
        this.f35794OooOOO0 += i2;
    }

    public final void OooO0O0(short[] sArr, int i, int i2) {
        int i3 = this.f35789OooO0oo / i2;
        int i4 = this.f35783OooO0O0;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f35781OooO[i7] = (short) (i8 / i5);
        }
    }

    public final short[] OooO0OO(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f35783OooO0O0;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int OooO0Oo(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f35783OooO0O0;
        int i5 = 1;
        int i6 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i5 * i2) {
                i7 = i2;
                i5 = iAbs;
            }
            if (iAbs * i6 > i8 * i2) {
                i6 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f35800OooOo0 = i5 / i7;
        this.f35802OooOo0O = i8 / i6;
        return i7;
    }

    public final void OooO0o() {
        int iOooO0Oo;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f35794OooOOO0;
        float f = this.f35784OooO0OO;
        float f2 = this.f35785OooO0Oo;
        float f3 = f / f2;
        float f4 = this.f35787OooO0o0 * f2;
        double d = f3;
        float f5 = 1.0f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.f35791OooOO0O;
            if (i9 >= this.f35789OooO0oo) {
                int i10 = 0;
                while (true) {
                    int i11 = this.f35797OooOOo;
                    if (i11 > 0) {
                        int iMin = Math.min(this.f35789OooO0oo, i11);
                        OooO00o(this.f35790OooOO0, i10, iMin);
                        this.f35797OooOOo -= iMin;
                        i10 += iMin;
                    } else {
                        short[] sArr = this.f35790OooOO0;
                        int i12 = this.f35782OooO00o;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.f35783OooO0O0 == i8 && i13 == i8) {
                            iOooO0Oo = OooO0Oo(sArr, i10, this.f35786OooO0o, this.f35788OooO0oO);
                        } else {
                            OooO0O0(sArr, i10, i13);
                            int iOooO0Oo2 = OooO0Oo(this.f35781OooO, 0, this.f35786OooO0o / i13, this.f35788OooO0oO / i13);
                            if (i13 != i8) {
                                int i14 = iOooO0Oo2 * i13;
                                int i15 = i13 * 4;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.f35786OooO0o;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.f35788OooO0oO;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.f35783OooO0O0 == i8) {
                                    iOooO0Oo = OooO0Oo(sArr, i10, i16, i17);
                                } else {
                                    OooO0O0(sArr, i10, i8);
                                    iOooO0Oo = OooO0Oo(this.f35781OooO, 0, i16, i17);
                                }
                            } else {
                                iOooO0Oo = iOooO0Oo2;
                            }
                        }
                        int i20 = this.f35800OooOo0;
                        int i21 = i20 != 0 && this.f35799OooOOoo != 0 && this.f35802OooOo0O <= i20 * 3 && i20 * 2 > this.f35801OooOo00 * 3 ? this.f35799OooOOoo : iOooO0Oo;
                        this.f35801OooOo00 = i20;
                        this.f35799OooOOoo = iOooO0Oo;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f35790OooOO0;
                            if (f3 >= 2.0f) {
                                i2 = (int) (i21 / (f3 - f5));
                            } else {
                                this.f35797OooOOo = (int) (((2.0f - f3) * i21) / (f3 - f5));
                                i2 = i21;
                            }
                            short[] sArrOooO0OO = OooO0OO(this.f35792OooOO0o, this.f35794OooOOO0, i2);
                            this.f35792OooOO0o = sArrOooO0OO;
                            int i22 = i2;
                            OooO0o0(i2, this.f35783OooO0O0, sArrOooO0OO, this.f35794OooOOO0, sArr2, i10, sArr2, i10 + i21);
                            this.f35794OooOOO0 += i22;
                            i10 = i21 + i22 + i10;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.f35790OooOO0;
                            if (f3 < 0.5f) {
                                i = (int) ((i23 * f3) / (f5 - f3));
                            } else {
                                this.f35797OooOOo = (int) ((((2.0f * f3) - f5) * i23) / (f5 - f3));
                                i = i23;
                            }
                            int i24 = i23 + i;
                            short[] sArrOooO0OO2 = OooO0OO(this.f35792OooOO0o, this.f35794OooOOO0, i24);
                            this.f35792OooOO0o = sArrOooO0OO2;
                            int i25 = this.f35783OooO0O0;
                            System.arraycopy(sArr3, i10 * i25, sArrOooO0OO2, this.f35794OooOOO0 * i25, i25 * i23);
                            OooO0o0(i, this.f35783OooO0O0, this.f35792OooOO0o, this.f35794OooOOO0 + i23, sArr3, i10 + i23, sArr3, i10);
                            this.f35794OooOOO0 += i24;
                            i10 += i;
                        }
                    }
                    if (this.f35789OooO0oo + i10 > i9) {
                        break;
                    }
                    f5 = 1.0f;
                    i8 = 1;
                }
                int i26 = this.f35791OooOO0O - i10;
                short[] sArr4 = this.f35790OooOO0;
                int i27 = this.f35783OooO0O0;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.f35791OooOO0O = i26;
            }
            f5 = 1.0f;
        } else {
            OooO00o(this.f35790OooOO0, 0, this.f35791OooOO0O);
            this.f35791OooOO0O = 0;
        }
        if (f4 == f5 || this.f35794OooOOO0 == i7) {
            return;
        }
        int i28 = this.f35782OooO00o;
        int i29 = (int) (i28 / f4);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.f35794OooOOO0 - i7;
        short[] sArrOooO0OO3 = OooO0OO(this.f35793OooOOO, this.f35795OooOOOO, i30);
        this.f35793OooOOO = sArrOooO0OO3;
        short[] sArr5 = this.f35792OooOO0o;
        int i31 = this.f35783OooO0O0;
        System.arraycopy(sArr5, i7 * i31, sArrOooO0OO3, this.f35795OooOOOO * i31, i31 * i30);
        this.f35794OooOOO0 = i7;
        this.f35795OooOOOO += i30;
        int i32 = 0;
        while (true) {
            i3 = this.f35795OooOOOO;
            i4 = i3 - 1;
            if (i32 >= i4) {
                break;
            }
            while (true) {
                i5 = this.f35796OooOOOo + 1;
                int i33 = i5 * i29;
                i6 = this.f35798OooOOo0;
                if (i33 <= i6 * i28) {
                    break;
                }
                this.f35792OooOO0o = OooO0OO(this.f35792OooOO0o, this.f35794OooOOO0, 1);
                int i34 = 0;
                while (true) {
                    int i35 = this.f35783OooO0O0;
                    if (i34 < i35) {
                        short[] sArr6 = this.f35792OooOO0o;
                        int i36 = (this.f35794OooOOO0 * i35) + i34;
                        short[] sArr7 = this.f35793OooOOO;
                        int i37 = (i32 * i35) + i34;
                        short s = sArr7[i37];
                        short s2 = sArr7[i37 + i35];
                        int i38 = this.f35798OooOOo0 * i28;
                        int i39 = this.f35796OooOOOo;
                        int i40 = i39 * i29;
                        int i41 = (i39 + 1) * i29;
                        int i42 = i41 - i38;
                        int i43 = i41 - i40;
                        sArr6[i36] = (short) ((((i43 - i42) * s2) + (s * i42)) / i43);
                        i34++;
                    }
                }
                this.f35798OooOOo0++;
                this.f35794OooOOO0++;
            }
            this.f35796OooOOOo = i5;
            if (i5 == i28) {
                this.f35796OooOOOo = 0;
                o00000O0.OooO0Oo(i6 == i29);
                this.f35798OooOOo0 = 0;
            }
            i32++;
        }
        if (i4 == 0) {
            return;
        }
        short[] sArr8 = this.f35793OooOOO;
        int i44 = this.f35783OooO0O0;
        System.arraycopy(sArr8, i4 * i44, sArr8, 0, (i3 - i4) * i44);
        this.f35795OooOOOO -= i4;
    }
}
