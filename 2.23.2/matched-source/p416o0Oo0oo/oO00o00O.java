package p416o0Oo0oo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float[] f46504OooO00o = new float[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double[] f46505OooO0O0 = new double[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double[] f46506OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0OOO00 f46507OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46508OooO0o0;

    public final void OooO00o(double d, float f) {
        int length = this.f46504OooO00o.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f46505OooO0O0, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f46505OooO0O0 = Arrays.copyOf(this.f46505OooO0O0, length);
        this.f46504OooO00o = Arrays.copyOf(this.f46504OooO00o, length);
        this.f46506OooO0OO = new double[length];
        double[] dArr = this.f46505OooO0O0;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f46505OooO0O0[iBinarySearch] = d;
        this.f46504OooO00o[iBinarySearch] = f;
    }

    public final double OooO0O0(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f46505OooO0O0, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = (-iBinarySearch) - 1;
        float[] fArr = this.f46504OooO00o;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.f46505OooO0O0;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (((double) f2) - (d5 * d4))) + this.f46506OooO0OO[i2];
    }

    public final double OooO0OO(double d, double d2) {
        double dAbs;
        double dOooO0O0 = OooO0O0(d) + d2;
        switch (this.f46508OooO0o0) {
            case 1:
                return Math.signum(0.5d - (dOooO0O0 % 1.0d));
            case 2:
                dAbs = Math.abs((((dOooO0O0 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dOooO0O0 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dOooO0O0 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d2 + dOooO0O0) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dOooO0O0 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f46507OooO0Oo.OooO0O0(dOooO0O0 % 1.0d);
            default:
                return Math.sin(dOooO0O0 * 6.283185307179586d);
        }
        return 1.0d - dAbs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f46505OooO0O0) + " period=" + Arrays.toString(this.f46504OooO00o);
    }
}
