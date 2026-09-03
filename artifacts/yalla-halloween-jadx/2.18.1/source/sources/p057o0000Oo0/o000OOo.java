package p057o0000Oo0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[] f27633OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o[] f27634OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static double[] f27635OooOOoo = new double[91];

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double f27636OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public double[] f27637OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public double f27638OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public double f27639OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f27640OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f27641OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f27642OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public double f27643OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double f27644OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public double f27645OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public double f27646OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public double f27647OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public double f27648OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public double f27649OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public double f27650OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public double f27651OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public boolean f27652OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f27653OooOOo0;

        public OooO00o(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            double d7 = d3;
            this.f27652OooOOo = false;
            this.f27653OooOOo0 = i == 1;
            this.f27639OooO0OO = d;
            this.f27640OooO0Oo = d2;
            this.f27636OooO = 1.0d / (d2 - d);
            if (3 == i) {
                this.f27652OooOOo = true;
            }
            double d8 = d5 - d7;
            double d9 = d6 - d4;
            if (this.f27652OooOOo || Math.abs(d8) < 0.001d || Math.abs(d9) < 0.001d) {
                this.f27652OooOOo = true;
                this.f27642OooO0o0 = d7;
                this.f27641OooO0o = d5;
                this.f27643OooO0oO = d4;
                this.f27644OooO0oo = d6;
                double dHypot = Math.hypot(d9, d8);
                this.f27638OooO0O0 = dHypot;
                this.f27648OooOOO = dHypot * this.f27636OooO;
                double d10 = this.f27640OooO0Oo;
                double d11 = this.f27639OooO0OO;
                this.f27647OooOO0o = d8 / (d10 - d11);
                this.f27649OooOOO0 = d9 / (d10 - d11);
                return;
            }
            this.f27637OooO00o = new double[101];
            boolean z = this.f27653OooOOo0;
            this.f27645OooOO0 = ((double) (z ? -1 : 1)) * d8;
            this.f27646OooOO0O = d9 * ((double) (z ? 1 : -1));
            this.f27647OooOO0o = z ? d5 : d7;
            this.f27649OooOOO0 = z ? d4 : d6;
            double d12 = d4 - d6;
            int i2 = 0;
            double dHypot2 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                double[] dArr = f27635OooOOoo;
                if (i2 >= 91) {
                    break;
                }
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) 90));
                double dSin = Math.sin(radians) * d8;
                double dCos = Math.cos(radians) * d12;
                if (i2 > 0) {
                    dHypot2 += Math.hypot(dSin - d13, dCos - d14);
                    dArr[i2] = dHypot2;
                }
                i2++;
                d14 = dCos;
                d13 = dSin;
            }
            this.f27638OooO0O0 = dHypot2;
            int i3 = 0;
            while (true) {
                double[] dArr2 = f27635OooOOoo;
                if (i3 >= 91) {
                    break;
                }
                dArr2[i3] = dArr2[i3] / dHypot2;
                i3++;
            }
            int i4 = 0;
            while (true) {
                double[] dArr3 = this.f27637OooO00o;
                if (i4 >= dArr3.length) {
                    this.f27648OooOOO = this.f27638OooO0O0 * this.f27636OooO;
                    return;
                }
                double length = ((double) i4) / ((double) (dArr3.length - 1));
                double[] dArr4 = f27635OooOOoo;
                int iBinarySearch = Arrays.binarySearch(dArr4, length);
                if (iBinarySearch >= 0) {
                    this.f27637OooO00o[i4] = ((double) iBinarySearch) / ((double) 90);
                } else if (iBinarySearch == -1) {
                    this.f27637OooO00o[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    this.f27637OooO00o[i4] = (((length - dArr4[i6]) / (dArr4[i5 - 1] - dArr4[i6])) + ((double) i6)) / ((double) 90);
                }
                i4++;
            }
        }

        public final double OooO00o() {
            double d = this.f27645OooOO0 * this.f27651OooOOOo;
            double dHypot = this.f27648OooOOO / Math.hypot(d, (-this.f27646OooOO0O) * this.f27650OooOOOO);
            if (this.f27653OooOOo0) {
                d = -d;
            }
            return d * dHypot;
        }

        public final double OooO0O0() {
            double d = this.f27645OooOO0 * this.f27651OooOOOo;
            double d2 = (-this.f27646OooOO0O) * this.f27650OooOOOO;
            double dHypot = this.f27648OooOOO / Math.hypot(d, d2);
            return this.f27653OooOOo0 ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double OooO0OO(double d) {
            double d2 = (d - this.f27639OooO0OO) * this.f27636OooO;
            double d3 = this.f27642OooO0o0;
            return ((this.f27641OooO0o - d3) * d2) + d3;
        }

        public final double OooO0Oo(double d) {
            double d2 = (d - this.f27639OooO0OO) * this.f27636OooO;
            double d3 = this.f27643OooO0oO;
            return ((this.f27644OooO0oo - d3) * d2) + d3;
        }

        public final double OooO0o() {
            return (this.f27646OooOO0O * this.f27651OooOOOo) + this.f27649OooOOO0;
        }

        public final double OooO0o0() {
            return (this.f27645OooOO0 * this.f27650OooOOOO) + this.f27647OooOO0o;
        }

        public final void OooO0oO(double d) {
            double d2 = (this.f27653OooOOo0 ? this.f27640OooO0Oo - d : d - this.f27639OooO0OO) * this.f27636OooO;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f27637OooO00o;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    d3 = ((dArr[i + 1] - dArr[i]) * (length - ((double) i))) + dArr[i];
                }
            }
            double d4 = d3 * 1.5707963267948966d;
            this.f27650OooOOOO = Math.sin(d4);
            this.f27651OooOOOo = Math.cos(d4);
        }
    }

    public o000OOo(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f27633OooO00o = dArr;
        this.f27634OooO0O0 = new OooO00o[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            OooO00o[] oooO00oArr = this.f27634OooO0O0;
            if (i >= oooO00oArr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i4 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i4 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            }
            int i5 = i + 1;
            oooO00oArr[i] = new OooO00o(i3, dArr[i], dArr[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
            i = i5;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final double OooO0O0(double d) {
        OooO00o[] oooO00oArr = this.f27634OooO0O0;
        int i = 0;
        if (d < oooO00oArr[0].f27639OooO0OO) {
            double d2 = oooO00oArr[0].f27639OooO0OO;
            double d3 = d - oooO00oArr[0].f27639OooO0OO;
            if (oooO00oArr[0].f27652OooOOo) {
                return (d3 * this.f27634OooO0O0[0].f27647OooOO0o) + oooO00oArr[0].OooO0OO(d2);
            }
            oooO00oArr[0].OooO0oO(d2);
            return (this.f27634OooO0O0[0].OooO00o() * d3) + this.f27634OooO0O0[0].OooO0o0();
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo) {
            double d4 = oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo;
            int length = oooO00oArr.length - 1;
            return ((d - d4) * this.f27634OooO0O0[length].f27647OooOO0o) + oooO00oArr[length].OooO0OO(d4);
        }
        while (true) {
            OooO00o[] oooO00oArr2 = this.f27634OooO0O0;
            if (i >= oooO00oArr2.length) {
                return Double.NaN;
            }
            if (d <= oooO00oArr2[i].f27640OooO0Oo) {
                if (oooO00oArr2[i].f27652OooOOo) {
                    return oooO00oArr2[i].OooO0OO(d);
                }
                oooO00oArr2[i].OooO0oO(d);
                return this.f27634OooO0O0[i].OooO0o0();
            }
            i++;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0OO(double d, double[] dArr) {
        OooO00o[] oooO00oArr = this.f27634OooO0O0;
        if (d < oooO00oArr[0].f27639OooO0OO) {
            double d2 = oooO00oArr[0].f27639OooO0OO;
            double d3 = d - oooO00oArr[0].f27639OooO0OO;
            if (oooO00oArr[0].f27652OooOOo) {
                double dOooO0OO = oooO00oArr[0].OooO0OO(d2);
                OooO00o[] oooO00oArr2 = this.f27634OooO0O0;
                dArr[0] = (oooO00oArr2[0].f27647OooOO0o * d3) + dOooO0OO;
                dArr[1] = (d3 * this.f27634OooO0O0[0].f27649OooOOO0) + oooO00oArr2[0].OooO0Oo(d2);
                return;
            }
            oooO00oArr[0].OooO0oO(d2);
            dArr[0] = (this.f27634OooO0O0[0].OooO00o() * d3) + this.f27634OooO0O0[0].OooO0o0();
            dArr[1] = (this.f27634OooO0O0[0].OooO0O0() * d3) + this.f27634OooO0O0[0].OooO0o();
            return;
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo) {
            double d4 = oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo;
            double d5 = d - d4;
            int length = oooO00oArr.length - 1;
            if (oooO00oArr[length].f27652OooOOo) {
                double dOooO0OO2 = oooO00oArr[length].OooO0OO(d4);
                OooO00o[] oooO00oArr3 = this.f27634OooO0O0;
                dArr[0] = (oooO00oArr3[length].f27647OooOO0o * d5) + dOooO0OO2;
                dArr[1] = (d5 * this.f27634OooO0O0[length].f27649OooOOO0) + oooO00oArr3[length].OooO0Oo(d4);
                return;
            }
            oooO00oArr[length].OooO0oO(d);
            dArr[0] = (this.f27634OooO0O0[length].OooO00o() * d5) + this.f27634OooO0O0[length].OooO0o0();
            dArr[1] = (this.f27634OooO0O0[length].OooO0O0() * d5) + this.f27634OooO0O0[length].OooO0o();
            return;
        }
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr4 = this.f27634OooO0O0;
            if (i >= oooO00oArr4.length) {
                return;
            }
            if (d <= oooO00oArr4[i].f27640OooO0Oo) {
                if (oooO00oArr4[i].f27652OooOOo) {
                    dArr[0] = oooO00oArr4[i].OooO0OO(d);
                    dArr[1] = this.f27634OooO0O0[i].OooO0Oo(d);
                    return;
                } else {
                    oooO00oArr4[i].OooO0oO(d);
                    dArr[0] = this.f27634OooO0O0[i].OooO0o0();
                    dArr[1] = this.f27634OooO0O0[i].OooO0o();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0Oo(double d, float[] fArr) {
        OooO00o[] oooO00oArr = this.f27634OooO0O0;
        if (d < oooO00oArr[0].f27639OooO0OO) {
            double d2 = oooO00oArr[0].f27639OooO0OO;
            double d3 = d - oooO00oArr[0].f27639OooO0OO;
            if (oooO00oArr[0].f27652OooOOo) {
                double dOooO0OO = oooO00oArr[0].OooO0OO(d2);
                OooO00o[] oooO00oArr2 = this.f27634OooO0O0;
                fArr[0] = (float) ((oooO00oArr2[0].f27647OooOO0o * d3) + dOooO0OO);
                fArr[1] = (float) ((d3 * this.f27634OooO0O0[0].f27649OooOOO0) + oooO00oArr2[0].OooO0Oo(d2));
                return;
            }
            oooO00oArr[0].OooO0oO(d2);
            fArr[0] = (float) ((this.f27634OooO0O0[0].OooO00o() * d3) + this.f27634OooO0O0[0].OooO0o0());
            fArr[1] = (float) ((this.f27634OooO0O0[0].OooO0O0() * d3) + this.f27634OooO0O0[0].OooO0o());
            return;
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo) {
            double d4 = oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo;
            double d5 = d - d4;
            int length = oooO00oArr.length - 1;
            if (!oooO00oArr[length].f27652OooOOo) {
                oooO00oArr[length].OooO0oO(d);
                fArr[0] = (float) this.f27634OooO0O0[length].OooO0o0();
                fArr[1] = (float) this.f27634OooO0O0[length].OooO0o();
                return;
            } else {
                double dOooO0OO2 = oooO00oArr[length].OooO0OO(d4);
                OooO00o[] oooO00oArr3 = this.f27634OooO0O0;
                fArr[0] = (float) ((oooO00oArr3[length].f27647OooOO0o * d5) + dOooO0OO2);
                fArr[1] = (float) ((d5 * this.f27634OooO0O0[length].f27649OooOOO0) + oooO00oArr3[length].OooO0Oo(d4));
                return;
            }
        }
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr4 = this.f27634OooO0O0;
            if (i >= oooO00oArr4.length) {
                return;
            }
            if (d <= oooO00oArr4[i].f27640OooO0Oo) {
                if (oooO00oArr4[i].f27652OooOOo) {
                    fArr[0] = (float) oooO00oArr4[i].OooO0OO(d);
                    fArr[1] = (float) this.f27634OooO0O0[i].OooO0Oo(d);
                    return;
                } else {
                    oooO00oArr4[i].OooO0oO(d);
                    fArr[0] = (float) this.f27634OooO0O0[i].OooO0o0();
                    fArr[1] = (float) this.f27634OooO0O0[i].OooO0o();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0o(double d, double[] dArr) {
        OooO00o[] oooO00oArr = this.f27634OooO0O0;
        if (d < oooO00oArr[0].f27639OooO0OO) {
            d = oooO00oArr[0].f27639OooO0OO;
        } else if (d > oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo) {
            d = oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo;
        }
        int i = 0;
        while (true) {
            OooO00o[] oooO00oArr2 = this.f27634OooO0O0;
            if (i >= oooO00oArr2.length) {
                return;
            }
            if (d <= oooO00oArr2[i].f27640OooO0Oo) {
                if (oooO00oArr2[i].f27652OooOOo) {
                    dArr[0] = oooO00oArr2[i].f27647OooOO0o;
                    dArr[1] = oooO00oArr2[i].f27649OooOOO0;
                    return;
                } else {
                    oooO00oArr2[i].OooO0oO(d);
                    dArr[0] = this.f27634OooO0O0[i].OooO00o();
                    dArr[1] = this.f27634OooO0O0[i].OooO0O0();
                    return;
                }
            }
            i++;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final double OooO0o0(double d) {
        OooO00o[] oooO00oArr = this.f27634OooO0O0;
        int i = 0;
        if (d < oooO00oArr[0].f27639OooO0OO) {
            d = oooO00oArr[0].f27639OooO0OO;
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo) {
            d = oooO00oArr[oooO00oArr.length - 1].f27640OooO0Oo;
        }
        while (true) {
            OooO00o[] oooO00oArr2 = this.f27634OooO0O0;
            if (i >= oooO00oArr2.length) {
                return Double.NaN;
            }
            if (d <= oooO00oArr2[i].f27640OooO0Oo) {
                if (oooO00oArr2[i].f27652OooOOo) {
                    return oooO00oArr2[i].f27647OooOO0o;
                }
                oooO00oArr2[i].OooO0oO(d);
                return this.f27634OooO0O0[i].OooO00o();
            }
            i++;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final double[] OooO0oO() {
        return this.f27633OooO00o;
    }
}
