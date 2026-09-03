package p413o0Oo0oo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[] f45258OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o[] f45259OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final double[] f45260OooOOoo = new double[91];

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final double f45261OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final double[] f45262OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public double f45263OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double f45264OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final double f45265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final double f45266OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final double f45267OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final double f45268OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final double f45269OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final double f45270OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final double f45271OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final double f45272OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final double f45273OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final double f45274OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public double f45275OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public double f45276OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final boolean f45277OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f45278OooOOo0;

        public OooO00o(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            double[] dArr;
            double d7 = d3;
            this.f45277OooOOo = false;
            boolean z = i == 1;
            this.f45278OooOOo0 = z;
            this.f45264OooO0OO = d;
            this.f45265OooO0Oo = d2;
            double d8 = 1.0d / (d2 - d);
            this.f45261OooO = d8;
            if (3 == i) {
                this.f45277OooOOo = true;
            }
            double d9 = d5 - d7;
            double d10 = d6 - d4;
            if (this.f45277OooOOo || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
                this.f45277OooOOo = true;
                this.f45267OooO0o0 = d7;
                this.f45266OooO0o = d5;
                this.f45268OooO0oO = d4;
                this.f45269OooO0oo = d6;
                double dHypot = Math.hypot(d10, d9);
                this.f45263OooO0O0 = dHypot;
                this.f45273OooOOO = dHypot * d8;
                this.f45272OooOO0o = d9 / (d2 - d);
                this.f45274OooOOO0 = d10 / (d2 - d);
                return;
            }
            this.f45262OooO00o = new double[101];
            this.f45270OooOO0 = ((double) (z ? -1 : 1)) * d9;
            this.f45271OooOO0O = d10 * ((double) (z ? 1 : -1));
            this.f45272OooOO0o = z ? d5 : d7;
            this.f45274OooOOO0 = z ? d4 : d6;
            double d11 = d4 - d6;
            int i2 = 0;
            double dHypot2 = 0.0d;
            double d12 = 0.0d;
            double d13 = 0.0d;
            while (true) {
                dArr = f45260OooOOoo;
                if (i2 >= 91) {
                    break;
                }
                double d14 = d9;
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) 90));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d11;
                if (i2 > 0) {
                    dHypot2 += Math.hypot(dSin - d12, dCos - d13);
                    dArr[i2] = dHypot2;
                }
                i2++;
                d13 = dCos;
                d12 = dSin;
                d9 = d14;
            }
            this.f45263OooO0O0 = dHypot2;
            for (int i3 = 0; i3 < 91; i3++) {
                dArr[i3] = dArr[i3] / dHypot2;
            }
            int i4 = 0;
            while (true) {
                double[] dArr2 = this.f45262OooO00o;
                if (i4 >= dArr2.length) {
                    this.f45273OooOOO = this.f45263OooO0O0 * this.f45261OooO;
                    return;
                }
                double length = ((double) i4) / ((double) (dArr2.length - 1));
                int iBinarySearch = Arrays.binarySearch(dArr, length);
                if (iBinarySearch >= 0) {
                    dArr2[i4] = ((double) iBinarySearch) / ((double) 90);
                } else if (iBinarySearch == -1) {
                    dArr2[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    double d15 = dArr[i6];
                    dArr2[i4] = (((length - d15) / (dArr[i5 - 1] - d15)) + ((double) i6)) / ((double) 90);
                }
                i4++;
            }
        }

        public final double OooO00o() {
            double d = this.f45270OooOO0 * this.f45276OooOOOo;
            double dHypot = this.f45273OooOOO / Math.hypot(d, (-this.f45271OooOO0O) * this.f45275OooOOOO);
            if (this.f45278OooOOo0) {
                d = -d;
            }
            return d * dHypot;
        }

        public final double OooO0O0() {
            double d = this.f45270OooOO0 * this.f45276OooOOOo;
            double d2 = (-this.f45271OooOO0O) * this.f45275OooOOOO;
            double dHypot = this.f45273OooOOO / Math.hypot(d, d2);
            return this.f45278OooOOo0 ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double OooO0OO(double d) {
            double d2 = (d - this.f45264OooO0OO) * this.f45261OooO;
            double d3 = this.f45266OooO0o;
            double d4 = this.f45267OooO0o0;
            return ((d3 - d4) * d2) + d4;
        }

        public final double OooO0Oo(double d) {
            double d2 = (d - this.f45264OooO0OO) * this.f45261OooO;
            double d3 = this.f45269OooO0oo;
            double d4 = this.f45268OooO0oO;
            return ((d3 - d4) * d2) + d4;
        }

        public final double OooO0o() {
            return (this.f45271OooOO0O * this.f45276OooOOOo) + this.f45274OooOOO0;
        }

        public final double OooO0o0() {
            return (this.f45270OooOO0 * this.f45275OooOOOO) + this.f45272OooOO0o;
        }

        public final void OooO0oO(double d) {
            double d2 = (this.f45278OooOOo0 ? this.f45265OooO0Oo - d : d - this.f45264OooO0OO) * this.f45261OooO;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f45262OooO00o;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.f45275OooOOOO = Math.sin(d5);
            this.f45276OooOOOo = Math.cos(d5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public OooOo(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f45258OooO00o = dArr;
        this.f45259OooO0O0 = new OooO00o[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            OooO00o[] oooO00oArr = this.f45259OooO0O0;
            if (i >= oooO00oArr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = i2;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (i2 != 1) {
                            i2 = 1;
                        }
                        i3 = i2;
                    }
                }
                i2 = 2;
                i3 = i2;
            }
            double d = dArr[i];
            int i5 = i + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            oooO00oArr[i] = new OooO00o(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // p413o0Oo0oo.Oooo000
    public final double OooO0O0(double d) {
        OooO00o[] oooO00oArr = this.f45259OooO0O0;
        OooO00o oooO00o = oooO00oArr[0];
        double d2 = oooO00o.f45264OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (oooO00o.f45277OooOOo) {
                return (d3 * oooO00oArr[0].f45272OooOO0o) + oooO00o.OooO0OO(d2);
            }
            oooO00o.OooO0oO(d2);
            return (oooO00oArr[0].OooO00o() * d3) + oooO00oArr[0].OooO0o0();
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo) {
            double d4 = oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo;
            double d5 = d - d4;
            int length = oooO00oArr.length - 1;
            return (d5 * oooO00oArr[length].f45272OooOO0o) + oooO00oArr[length].OooO0OO(d4);
        }
        for (int i = 0; i < oooO00oArr.length; i++) {
            OooO00o oooO00o2 = oooO00oArr[i];
            if (d <= oooO00o2.f45265OooO0Oo) {
                if (oooO00o2.f45277OooOOo) {
                    return oooO00o2.OooO0OO(d);
                }
                oooO00o2.OooO0oO(d);
                return oooO00oArr[i].OooO0o0();
            }
        }
        return Double.NaN;
    }

    @Override // p413o0Oo0oo.Oooo000
    public final void OooO0OO(double d, double[] dArr) {
        OooO00o[] oooO00oArr = this.f45259OooO0O0;
        OooO00o oooO00o = oooO00oArr[0];
        double d2 = oooO00o.f45264OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (oooO00o.f45277OooOOo) {
                double dOooO0OO = oooO00o.OooO0OO(d2);
                OooO00o oooO00o2 = oooO00oArr[0];
                dArr[0] = (oooO00o2.f45272OooOO0o * d3) + dOooO0OO;
                dArr[1] = (d3 * oooO00oArr[0].f45274OooOOO0) + oooO00o2.OooO0Oo(d2);
                return;
            }
            oooO00o.OooO0oO(d2);
            dArr[0] = (oooO00oArr[0].OooO00o() * d3) + oooO00oArr[0].OooO0o0();
            dArr[1] = (oooO00oArr[0].OooO0O0() * d3) + oooO00oArr[0].OooO0o();
            return;
        }
        if (d <= oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo) {
            for (int i = 0; i < oooO00oArr.length; i++) {
                OooO00o oooO00o3 = oooO00oArr[i];
                if (d <= oooO00o3.f45265OooO0Oo) {
                    if (oooO00o3.f45277OooOOo) {
                        dArr[0] = oooO00o3.OooO0OO(d);
                        dArr[1] = oooO00oArr[i].OooO0Oo(d);
                        return;
                    } else {
                        oooO00o3.OooO0oO(d);
                        dArr[0] = oooO00oArr[i].OooO0o0();
                        dArr[1] = oooO00oArr[i].OooO0o();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo;
        double d5 = d - d4;
        int length = oooO00oArr.length - 1;
        OooO00o oooO00o4 = oooO00oArr[length];
        if (oooO00o4.f45277OooOOo) {
            double dOooO0OO2 = oooO00o4.OooO0OO(d4);
            OooO00o oooO00o5 = oooO00oArr[length];
            dArr[0] = (oooO00o5.f45272OooOO0o * d5) + dOooO0OO2;
            dArr[1] = (d5 * oooO00oArr[length].f45274OooOOO0) + oooO00o5.OooO0Oo(d4);
            return;
        }
        oooO00o4.OooO0oO(d);
        dArr[0] = (oooO00oArr[length].OooO00o() * d5) + oooO00oArr[length].OooO0o0();
        dArr[1] = (oooO00oArr[length].OooO0O0() * d5) + oooO00oArr[length].OooO0o();
    }

    @Override // p413o0Oo0oo.Oooo000
    public final void OooO0Oo(double d, float[] fArr) {
        OooO00o[] oooO00oArr = this.f45259OooO0O0;
        OooO00o oooO00o = oooO00oArr[0];
        double d2 = oooO00o.f45264OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (oooO00o.f45277OooOOo) {
                double dOooO0OO = oooO00o.OooO0OO(d2);
                OooO00o oooO00o2 = oooO00oArr[0];
                fArr[0] = (float) ((oooO00o2.f45272OooOO0o * d3) + dOooO0OO);
                fArr[1] = (float) ((d3 * oooO00oArr[0].f45274OooOOO0) + oooO00o2.OooO0Oo(d2));
                return;
            }
            oooO00o.OooO0oO(d2);
            fArr[0] = (float) ((oooO00oArr[0].OooO00o() * d3) + oooO00oArr[0].OooO0o0());
            fArr[1] = (float) ((oooO00oArr[0].OooO0O0() * d3) + oooO00oArr[0].OooO0o());
            return;
        }
        if (d <= oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo) {
            for (int i = 0; i < oooO00oArr.length; i++) {
                OooO00o oooO00o3 = oooO00oArr[i];
                if (d <= oooO00o3.f45265OooO0Oo) {
                    if (oooO00o3.f45277OooOOo) {
                        fArr[0] = (float) oooO00o3.OooO0OO(d);
                        fArr[1] = (float) oooO00oArr[i].OooO0Oo(d);
                        return;
                    } else {
                        oooO00o3.OooO0oO(d);
                        fArr[0] = (float) oooO00oArr[i].OooO0o0();
                        fArr[1] = (float) oooO00oArr[i].OooO0o();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo;
        double d5 = d - d4;
        int length = oooO00oArr.length - 1;
        OooO00o oooO00o4 = oooO00oArr[length];
        if (!oooO00o4.f45277OooOOo) {
            oooO00o4.OooO0oO(d);
            fArr[0] = (float) oooO00oArr[length].OooO0o0();
            fArr[1] = (float) oooO00oArr[length].OooO0o();
        } else {
            double dOooO0OO2 = oooO00o4.OooO0OO(d4);
            OooO00o oooO00o5 = oooO00oArr[length];
            fArr[0] = (float) ((oooO00o5.f45272OooOO0o * d5) + dOooO0OO2);
            fArr[1] = (float) ((d5 * oooO00oArr[length].f45274OooOOO0) + oooO00o5.OooO0Oo(d4));
        }
    }

    @Override // p413o0Oo0oo.Oooo000
    public final void OooO0o(double d, double[] dArr) {
        OooO00o[] oooO00oArr = this.f45259OooO0O0;
        double d2 = oooO00oArr[0].f45264OooO0OO;
        if (d < d2) {
            d = d2;
        } else if (d > oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo) {
            d = oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo;
        }
        for (int i = 0; i < oooO00oArr.length; i++) {
            OooO00o oooO00o = oooO00oArr[i];
            if (d <= oooO00o.f45265OooO0Oo) {
                if (oooO00o.f45277OooOOo) {
                    dArr[0] = oooO00o.f45272OooOO0o;
                    dArr[1] = oooO00o.f45274OooOOO0;
                    return;
                } else {
                    oooO00o.OooO0oO(d);
                    dArr[0] = oooO00oArr[i].OooO00o();
                    dArr[1] = oooO00oArr[i].OooO0O0();
                    return;
                }
            }
        }
    }

    @Override // p413o0Oo0oo.Oooo000
    public final double OooO0o0(double d) {
        OooO00o[] oooO00oArr = this.f45259OooO0O0;
        double d2 = oooO00oArr[0].f45264OooO0OO;
        if (d < d2) {
            d = d2;
        }
        if (d > oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo) {
            d = oooO00oArr[oooO00oArr.length - 1].f45265OooO0Oo;
        }
        for (int i = 0; i < oooO00oArr.length; i++) {
            OooO00o oooO00o = oooO00oArr[i];
            if (d <= oooO00o.f45265OooO0Oo) {
                if (oooO00o.f45277OooOOo) {
                    return oooO00o.f45272OooOO0o;
                }
                oooO00o.OooO0oO(d);
                return oooO00oArr[i].OooO00o();
            }
        }
        return Double.NaN;
    }

    @Override // p413o0Oo0oo.Oooo000
    public final double[] OooO0oO() {
        return this.f45258OooO00o;
    }
}
