package p057o0000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double[] f27586OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double[][] f27587OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double[] f27588OooO0OO;

    public o00000OO(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f27588OooO0OO = new double[length2];
        this.f27586OooO00o = dArr;
        this.f27587OooO0O0 = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                double d4 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d, d4 - d2);
                }
                i++;
                d = d3;
                d2 = d4;
            }
        }
    }

    @Override // p057o0000Oo0.o000000
    public final double OooO0O0(double d) {
        double[] dArr = this.f27586OooO00o;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return (OooO0o0(dArr[0]) * (d - dArr[0])) + this.f27587OooO0O0[0][0];
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return (OooO0o0(dArr[i]) * (d - dArr[i])) + this.f27587OooO0O0[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.f27586OooO00o;
            if (d == dArr2[i2]) {
                return this.f27587OooO0O0[i2][0];
            }
            int i3 = i2 + 1;
            if (d < dArr2[i3]) {
                double d2 = (d - dArr2[i2]) / (dArr2[i3] - dArr2[i2]);
                double[][] dArr3 = this.f27587OooO0O0;
                return (dArr3[i3][0] * d2) + ((1.0d - d2) * dArr3[i2][0]);
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0OO(double d, double[] dArr) {
        double[] dArr2 = this.f27586OooO00o;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f27587OooO0O0[0].length;
        if (d <= dArr2[0]) {
            OooO0o(dArr2[0], this.f27588OooO0OO);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - this.f27586OooO00o[0]) * this.f27588OooO0OO[i2]) + this.f27587OooO0O0[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            OooO0o(dArr2[i3], this.f27588OooO0OO);
            while (i < length2) {
                dArr[i] = ((d - this.f27586OooO00o[i3]) * this.f27588OooO0OO[i]) + this.f27587OooO0O0[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == this.f27586OooO00o[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f27587OooO0O0[i4][i5];
                }
            }
            double[] dArr3 = this.f27586OooO00o;
            int i6 = i4 + 1;
            if (d < dArr3[i6]) {
                double d2 = (d - dArr3[i4]) / (dArr3[i6] - dArr3[i4]);
                while (i < length2) {
                    double[][] dArr4 = this.f27587OooO0O0;
                    dArr[i] = (dArr4[i6][i] * d2) + ((1.0d - d2) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0Oo(double d, float[] fArr) {
        double[] dArr = this.f27586OooO00o;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f27587OooO0O0[0].length;
        if (d <= dArr[0]) {
            OooO0o(dArr[0], this.f27588OooO0OO);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - this.f27586OooO00o[0]) * this.f27588OooO0OO[i2]) + this.f27587OooO0O0[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            OooO0o(dArr[i3], this.f27588OooO0OO);
            while (i < length2) {
                fArr[i] = (float) (((d - this.f27586OooO00o[i3]) * this.f27588OooO0OO[i]) + this.f27587OooO0O0[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f27586OooO00o[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f27587OooO0O0[i4][i5];
                }
            }
            double[] dArr2 = this.f27586OooO00o;
            int i6 = i4 + 1;
            if (d < dArr2[i6]) {
                double d2 = (d - dArr2[i4]) / (dArr2[i6] - dArr2[i4]);
                while (i < length2) {
                    double[][] dArr3 = this.f27587OooO0O0;
                    fArr[i] = (float) ((dArr3[i6][i] * d2) + ((1.0d - d2) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final void OooO0o(double d, double[] dArr) {
        double[] dArr2 = this.f27586OooO00o;
        int length = dArr2.length;
        int length2 = this.f27587OooO0O0[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i = length - 1;
            if (d >= dArr2[i]) {
                d = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f27586OooO00o;
            int i3 = i2 + 1;
            if (d <= dArr3[i3]) {
                double d2 = dArr3[i3] - dArr3[i2];
                double d3 = dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f27587OooO0O0;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d2;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // p057o0000Oo0.o000000
    public final double OooO0o0(double d) {
        double[] dArr = this.f27586OooO00o;
        int length = dArr.length;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i = length - 1;
            if (d >= dArr[i]) {
                d = dArr[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr2 = this.f27586OooO00o;
            int i3 = i2 + 1;
            if (d <= dArr2[i3]) {
                double d2 = dArr2[i3] - dArr2[i2];
                double d3 = dArr2[i2];
                double[][] dArr3 = this.f27587OooO0O0;
                return (dArr3[i3][0] - dArr3[i2][0]) / d2;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // p057o0000Oo0.o000000
    public final double[] OooO0oO() {
        return this.f27586OooO00o;
    }
}
