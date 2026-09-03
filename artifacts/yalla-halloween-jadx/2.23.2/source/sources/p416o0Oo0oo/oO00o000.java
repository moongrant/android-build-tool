package p416o0Oo0oo;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class oO00o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f46484OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f46485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f46486OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f46487OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46489OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f46488OooO0o = new ArrayList<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double[] f46490OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO00o00O f46491OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f46492OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double[] f46493OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float[] f46494OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float[] f46495OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float[] f46496OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public oO00OOo0 f46497OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double[] f46498OooO0oo;

        public OooO00o(int i, int i2, String str) {
            long j;
            char c;
            oO00o00O oo00o00o = new oO00o00O();
            this.f46491OooO00o = oo00o00o;
            oo00o00o.f46508OooO0o0 = i;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int iIndexOf = str.indexOf(40) + 1;
                int iIndexOf2 = str.indexOf(44, iIndexOf);
                char c2 = 0;
                int i3 = 0;
                while (iIndexOf2 != -1) {
                    dArr[i3] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                    iIndexOf = iIndexOf2 + 1;
                    iIndexOf2 = str.indexOf(44, iIndexOf);
                    i3++;
                }
                dArr[i3] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3 + 1);
                int length = (dArrCopyOf.length * 3) - 2;
                int length2 = dArrCopyOf.length - 1;
                double d = 1.0d / ((double) length2);
                double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i4 = 0;
                while (i4 < dArrCopyOf.length) {
                    double d2 = dArrCopyOf[i4];
                    int i5 = i4 + length2;
                    dArr2[i5][c2] = d2;
                    double d3 = ((double) i4) * d;
                    dArr3[i5] = d3;
                    if (i4 > 0) {
                        int i6 = (length2 * 2) + i4;
                        j = 4607182418800017408L;
                        c = 0;
                        dArr2[i6][0] = d2 + 1.0d;
                        dArr3[i6] = d3 + 1.0d;
                        int i7 = i4 - 1;
                        dArr2[i7][0] = (d2 - 1.0d) - d;
                        dArr3[i7] = (d3 - 1.0d) - d;
                    } else {
                        j = 4607182418800017408L;
                        c = 0;
                    }
                    i4++;
                    c2 = c;
                }
                oo00o00o.f46507OooO0Oo = new oO0OOO00(dArr3, dArr2);
            }
            this.f46492OooO0O0 = new float[i2];
            this.f46493OooO0OO = new double[i2];
            this.f46494OooO0Oo = new float[i2];
            this.f46496OooO0o0 = new float[i2];
            this.f46495OooO0o = new float[i2];
            float[] fArr = new float[i2];
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f46499OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f46500OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f46501OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f46502OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f46503OooO0o0;

        public OooO0O0(int i, float f, float f2, float f3, float f4) {
            this.f46499OooO00o = i;
            this.f46500OooO0O0 = f4;
            this.f46501OooO0OO = f2;
            this.f46502OooO0Oo = f;
            this.f46503OooO0o0 = f3;
        }
    }

    public final float OooO00o(float f) {
        OooO00o oooO00o = this.f46484OooO00o;
        oO00OOo0 oo00ooo0 = oooO00o.f46497OooO0oO;
        if (oo00ooo0 != null) {
            oo00ooo0.OooO0OO(f, oooO00o.f46498OooO0oo);
        } else {
            double[] dArr = oooO00o.f46498OooO0oo;
            dArr[0] = oooO00o.f46496OooO0o0[0];
            dArr[1] = oooO00o.f46495OooO0o[0];
            dArr[2] = oooO00o.f46492OooO0O0[0];
        }
        double[] dArr2 = oooO00o.f46498OooO0oo;
        return (float) ((oooO00o.f46491OooO00o.OooO0OO(f, dArr2[1]) * oooO00o.f46498OooO0oo[2]) + dArr2[0]);
    }

    public final float OooO0O0(float f) {
        double d;
        double dOooO0o0;
        double d2;
        double dSignum;
        OooO00o oooO00o = this.f46484OooO00o;
        oO00OOo0 oo00ooo0 = oooO00o.f46497OooO0oO;
        if (oo00ooo0 != null) {
            double d3 = f;
            oo00ooo0.OooO0o(d3, oooO00o.f46490OooO);
            oooO00o.f46497OooO0oO.OooO0OO(d3, oooO00o.f46498OooO0oo);
        } else {
            double[] dArr = oooO00o.f46490OooO;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double d5 = oooO00o.f46498OooO0oo[1];
        oO00o00O oo00o00o = oooO00o.f46491OooO00o;
        double dOooO0OO = oo00o00o.OooO0OO(d4, d5);
        double d6 = oooO00o.f46498OooO0oo[1];
        double d7 = oooO00o.f46490OooO[1];
        double dOooO0O0 = oo00o00o.OooO0O0(d4) + d6;
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(oo00o00o.f46505OooO0O0, d4);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i = (-iBinarySearch) - 1;
            float[] fArr = oo00o00o.f46504OooO00o;
            float f2 = fArr[i];
            int i2 = i - 1;
            float f3 = fArr[i2];
            double[] dArr2 = oo00o00o.f46505OooO0O0;
            double d8 = dArr2[i];
            double d9 = dArr2[i2];
            double d10 = ((double) (f2 - f3)) / (d8 - d9);
            d = (((double) f3) - (d10 * d9)) + (d4 * d10);
        } else {
            d = 0.0d;
        }
        double d11 = d + d7;
        switch (oo00o00o.f46508OooO0o0) {
            case 1:
                dOooO0o0 = 0.0d;
                break;
            case 2:
                d2 = d11 * 4.0d;
                dSignum = Math.signum((((dOooO0O0 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dOooO0o0 = dSignum * d2;
                break;
            case 3:
                dOooO0o0 = d11 * 2.0d;
                break;
            case 4:
                dOooO0o0 = (-d11) * 2.0d;
                break;
            case 5:
                d2 = d11 * (-6.283185307179586d);
                dSignum = Math.sin(dOooO0O0 * 6.283185307179586d);
                dOooO0o0 = dSignum * d2;
                break;
            case 6:
                dOooO0o0 = ((((dOooO0O0 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d11 * 4.0d;
                break;
            case 7:
                dOooO0o0 = oo00o00o.f46507OooO0Oo.OooO0o0(dOooO0O0 % 1.0d);
                break;
            default:
                d2 = d11 * 6.283185307179586d;
                dSignum = Math.cos(dOooO0O0 * 6.283185307179586d);
                dOooO0o0 = dSignum * d2;
                break;
        }
        double[] dArr3 = oooO00o.f46490OooO;
        return (float) ((dOooO0o0 * oooO00o.f46498OooO0oo[2]) + (dOooO0OO * dArr3[2]) + dArr3[0]);
    }

    public void OooO0OO(ConstraintAttribute constraintAttribute) {
    }

    public final void OooO0Oo() {
        int i;
        ArrayList<OooO0O0> arrayList = this.f46488OooO0o;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new oOOoOOO0());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f46484OooO00o = new OooO00o(this.f46486OooO0OO, size, this.f46487OooO0Oo);
        char c = 0;
        int i2 = 0;
        for (OooO0O0 oooO0O0 : arrayList) {
            float f = oooO0O0.f46502OooO0Oo;
            dArr[i2] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = oooO0O0.f46500OooO0O0;
            dArr3[c] = f2;
            float f3 = oooO0O0.f46501OooO0OO;
            dArr3[1] = f3;
            float f4 = oooO0O0.f46503OooO0o0;
            dArr3[2] = f4;
            OooO00o oooO00o = this.f46484OooO00o;
            oooO00o.f46493OooO0OO[i2] = ((double) oooO0O0.f46499OooO00o) / 100.0d;
            oooO00o.f46494OooO0Oo[i2] = f;
            oooO00o.f46496OooO0o0[i2] = f3;
            oooO00o.f46495OooO0o[i2] = f4;
            oooO00o.f46492OooO0O0[i2] = f2;
            i2++;
            dArr = dArr;
            c = 0;
        }
        double[] dArr4 = dArr;
        OooO00o oooO00o2 = this.f46484OooO00o;
        double[] dArr5 = oooO00o2.f46493OooO0OO;
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr5.length, 3);
        float[] fArr = oooO00o2.f46492OooO0O0;
        oooO00o2.f46498OooO0oo = new double[fArr.length + 2];
        oooO00o2.f46490OooO = new double[fArr.length + 2];
        double d = dArr5[0];
        float[] fArr2 = oooO00o2.f46494OooO0Oo;
        oO00o00O oo00o00o = oooO00o2.f46491OooO00o;
        if (d > 0.0d) {
            oo00o00o.OooO00o(0.0d, fArr2[0]);
        }
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            oo00o00o.OooO00o(1.0d, fArr2[length]);
        }
        for (int i3 = 0; i3 < dArr6.length; i3++) {
            double[] dArr7 = dArr6[i3];
            dArr7[0] = oooO00o2.f46496OooO0o0[i3];
            dArr7[1] = oooO00o2.f46495OooO0o[i3];
            dArr7[2] = fArr[i3];
            oo00o00o.OooO00o(dArr5[i3], fArr2[i3]);
        }
        int i4 = 0;
        double d2 = 0.0d;
        while (true) {
            float[] fArr3 = oo00o00o.f46504OooO00o;
            if (i4 >= fArr3.length) {
                break;
            }
            d2 += (double) fArr3[i4];
            i4++;
        }
        int i5 = 1;
        double d3 = 0.0d;
        while (true) {
            float[] fArr4 = oo00o00o.f46504OooO00o;
            if (i5 >= fArr4.length) {
                break;
            }
            int i6 = i5 - 1;
            float f5 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr8 = oo00o00o.f46505OooO0O0;
            d3 = ((dArr8[i5] - dArr8[i6]) * ((double) f5)) + d3;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr5 = oo00o00o.f46504OooO00o;
            if (i7 >= fArr5.length) {
                break;
            }
            fArr5[i7] = (float) (((double) fArr5[i7]) * (d2 / d3));
            i7++;
        }
        oo00o00o.f46506OooO0OO[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr6 = oo00o00o.f46504OooO00o;
            if (i8 >= fArr6.length) {
                break;
            }
            int i9 = i8 - 1;
            float f6 = (fArr6[i9] + fArr6[i8]) / 2.0f;
            double[] dArr9 = oo00o00o.f46505OooO0O0;
            double d4 = dArr9[i8] - dArr9[i9];
            double[] dArr10 = oo00o00o.f46506OooO0OO;
            dArr10[i8] = (d4 * ((double) f6)) + dArr10[i9];
            i8++;
        }
        if (dArr5.length > 1) {
            i = 0;
            oooO00o2.f46497OooO0oO = oO00OOo0.OooO00o(0, dArr5, dArr6);
        } else {
            i = 0;
            oooO00o2.f46497OooO0oO = null;
        }
        oO00OOo0.OooO00o(i, dArr4, dArr2);
    }

    public final String toString() {
        String string = this.f46485OooO0O0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (OooO0O0 oooO0O0 : this.f46488OooO0o) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(string, "[");
            sbOooO0O0.append(oooO0O0.f46499OooO00o);
            sbOooO0O0.append(" , ");
            sbOooO0O0.append(decimalFormat.format(oooO0O0.f46500OooO0O0));
            sbOooO0O0.append("] ");
            string = sbOooO0O0.toString();
        }
        return string;
    }
}
