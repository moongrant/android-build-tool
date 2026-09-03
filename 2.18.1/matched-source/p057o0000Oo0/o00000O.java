package p057o0000Oo0;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f27566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f27567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27568OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f27569OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27571OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<OooO0O0> f27570OooO0o = new ArrayList<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double[] f27572OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0000 f27573OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float[] f27574OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public double[] f27575OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float[] f27576OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float[] f27577OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float[] f27578OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o000000 f27579OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double[] f27580OooO0oo;

        public OooO00o(int i, String str, int i2) {
            long j;
            o0000 o0000Var = new o0000();
            this.f27573OooO00o = o0000Var;
            o0000Var.f27555OooO0o0 = i;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int iIndexOf = str.indexOf(40) + 1;
                int iIndexOf2 = str.indexOf(44, iIndexOf);
                char c = 0;
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
                double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
                double[] dArr3 = new double[length];
                int i4 = 0;
                while (i4 < dArrCopyOf.length) {
                    double d2 = dArrCopyOf[i4];
                    int i5 = i4 + length2;
                    dArr2[i5][c] = d2;
                    double d3 = ((double) i4) * d;
                    dArr3[i5] = d3;
                    if (i4 > 0) {
                        int i6 = (length2 * 2) + i4;
                        j = 4607182418800017408L;
                        dArr2[i6][0] = d2 + 1.0d;
                        dArr3[i6] = d3 + 1.0d;
                        int i7 = i4 - 1;
                        dArr2[i7][0] = (d2 - 1.0d) - d;
                        dArr3[i7] = (d3 - 1.0d) - d;
                    } else {
                        j = 4607182418800017408L;
                    }
                    i4++;
                    c = 0;
                }
                o0000Var.f27554OooO0Oo = new o0000Ooo(dArr3, dArr2);
            }
            this.f27574OooO0O0 = new float[i2];
            this.f27575OooO0OO = new double[i2];
            this.f27576OooO0Oo = new float[i2];
            this.f27578OooO0o0 = new float[i2];
            this.f27577OooO0o = new float[i2];
            float[] fArr = new float[i2];
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f27581OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f27582OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f27583OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f27584OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f27585OooO0o0;

        public OooO0O0(int i, float f, float f2, float f3, float f4) {
            this.f27581OooO00o = i;
            this.f27582OooO0O0 = f4;
            this.f27583OooO0OO = f2;
            this.f27584OooO0Oo = f;
            this.f27585OooO0o0 = f3;
        }
    }

    public final float OooO00o(float f) {
        OooO00o oooO00o = this.f27566OooO00o;
        o000000 o000000Var = oooO00o.f27579OooO0oO;
        if (o000000Var != null) {
            o000000Var.OooO0OO(f, oooO00o.f27580OooO0oo);
        } else {
            double[] dArr = oooO00o.f27580OooO0oo;
            dArr[0] = oooO00o.f27578OooO0o0[0];
            dArr[1] = oooO00o.f27577OooO0o[0];
            dArr[2] = oooO00o.f27574OooO0O0[0];
        }
        double[] dArr2 = oooO00o.f27580OooO0oo;
        return (float) ((oooO00o.f27573OooO00o.OooO0OO(f, dArr2[1]) * oooO00o.f27580OooO0oo[2]) + dArr2[0]);
    }

    public final float OooO0O0(float f) {
        double d;
        double dOooO0o0;
        double d2;
        double dSignum;
        OooO00o oooO00o = this.f27566OooO00o;
        o000000 o000000Var = oooO00o.f27579OooO0oO;
        if (o000000Var != null) {
            double d3 = f;
            o000000Var.OooO0o(d3, oooO00o.f27572OooO);
            oooO00o.f27579OooO0oO.OooO0OO(d3, oooO00o.f27580OooO0oo);
        } else {
            double[] dArr = oooO00o.f27572OooO;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double dOooO0OO = oooO00o.f27573OooO00o.OooO0OO(d4, oooO00o.f27580OooO0oo[1]);
        o0000 o0000Var = oooO00o.f27573OooO00o;
        double d5 = oooO00o.f27580OooO0oo[1];
        double d6 = oooO00o.f27572OooO[1];
        double dOooO0O0 = o0000Var.OooO0O0(d4) + d5;
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(o0000Var.f27552OooO0O0, d4);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i = (-iBinarySearch) - 1;
            float[] fArr = o0000Var.f27551OooO00o;
            int i2 = i - 1;
            double d7 = fArr[i] - fArr[i2];
            double[] dArr2 = o0000Var.f27552OooO0O0;
            double d8 = d7 / (dArr2[i] - dArr2[i2]);
            d = (((double) fArr[i2]) - (d8 * dArr2[i2])) + (d4 * d8);
        } else {
            d = 0.0d;
        }
        double d9 = d + d6;
        switch (o0000Var.f27555OooO0o0) {
            case 1:
                dOooO0o0 = 0.0d;
                break;
            case 2:
                d2 = d9 * 4.0d;
                dSignum = Math.signum((((dOooO0O0 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dOooO0o0 = d2 * dSignum;
                break;
            case 3:
                dOooO0o0 = d9 * 2.0d;
                break;
            case 4:
                dOooO0o0 = (-d9) * 2.0d;
                break;
            case 5:
                d2 = d9 * (-6.283185307179586d);
                dSignum = Math.sin(dOooO0O0 * 6.283185307179586d);
                dOooO0o0 = d2 * dSignum;
                break;
            case 6:
                d2 = d9 * 4.0d;
                dSignum = (((dOooO0O0 * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                dOooO0o0 = d2 * dSignum;
                break;
            case 7:
                dOooO0o0 = o0000Var.f27554OooO0Oo.OooO0o0(dOooO0O0 % 1.0d);
                break;
            default:
                d2 = d9 * 6.283185307179586d;
                dSignum = Math.cos(dOooO0O0 * 6.283185307179586d);
                dOooO0o0 = d2 * dSignum;
                break;
        }
        double[] dArr3 = oooO00o.f27572OooO;
        return (float) ((dOooO0o0 * oooO00o.f27580OooO0oo[2]) + (dOooO0OO * dArr3[2]) + dArr3[0]);
    }

    public void OooO0OO(Object obj) {
    }

    public final void OooO0Oo() {
        int i;
        int size = this.f27570OooO0o.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f27570OooO0o, new o00000O0());
        double[] dArr = new double[size];
        char c = 2;
        char c2 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, 3);
        this.f27566OooO00o = new OooO00o(this.f27568OooO0OO, this.f27569OooO0Oo, size);
        Iterator<OooO0O0> it = this.f27570OooO0o.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            OooO0O0 next = it.next();
            float f = next.f27584OooO0Oo;
            dArr[i2] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = next.f27582OooO0O0;
            dArr3[c2] = f2;
            double[] dArr4 = dArr2[i2];
            float f3 = next.f27583OooO0OO;
            dArr4[1] = f3;
            double[] dArr5 = dArr2[i2];
            float f4 = next.f27585OooO0o0;
            Iterator<OooO0O0> it2 = it;
            dArr5[c] = f4;
            OooO00o oooO00o = this.f27566OooO00o;
            oooO00o.f27575OooO0OO[i2] = ((double) next.f27581OooO00o) / 100.0d;
            oooO00o.f27576OooO0Oo[i2] = f;
            oooO00o.f27578OooO0o0[i2] = f3;
            oooO00o.f27577OooO0o[i2] = f4;
            oooO00o.f27574OooO0O0[i2] = f2;
            i2++;
            dArr = dArr;
            it = it2;
            dArr2 = dArr2;
            c = 2;
            c2 = 0;
        }
        double[] dArr6 = dArr;
        double[][] dArr7 = dArr2;
        OooO00o oooO00o2 = this.f27566OooO00o;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) double.class, oooO00o2.f27575OooO0OO.length, 3);
        float[] fArr = oooO00o2.f27574OooO0O0;
        oooO00o2.f27580OooO0oo = new double[fArr.length + 2];
        oooO00o2.f27572OooO = new double[fArr.length + 2];
        if (oooO00o2.f27575OooO0OO[0] > 0.0d) {
            oooO00o2.f27573OooO00o.OooO00o(0.0d, oooO00o2.f27576OooO0Oo[0]);
        }
        double[] dArr9 = oooO00o2.f27575OooO0OO;
        int length = dArr9.length - 1;
        if (dArr9[length] < 1.0d) {
            oooO00o2.f27573OooO00o.OooO00o(1.0d, oooO00o2.f27576OooO0Oo[length]);
        }
        for (int i3 = 0; i3 < dArr8.length; i3++) {
            dArr8[i3][0] = oooO00o2.f27578OooO0o0[i3];
            dArr8[i3][1] = oooO00o2.f27577OooO0o[i3];
            dArr8[i3][2] = oooO00o2.f27574OooO0O0[i3];
            oooO00o2.f27573OooO00o.OooO00o(oooO00o2.f27575OooO0OO[i3], oooO00o2.f27576OooO0Oo[i3]);
        }
        o0000 o0000Var = oooO00o2.f27573OooO00o;
        double d = 0.0d;
        int i4 = 0;
        while (true) {
            float[] fArr2 = o0000Var.f27551OooO00o;
            if (i4 >= fArr2.length) {
                break;
            }
            d += (double) fArr2[i4];
            i4++;
        }
        double d2 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr3 = o0000Var.f27551OooO00o;
            if (i5 >= fArr3.length) {
                break;
            }
            int i6 = i5 - 1;
            float f5 = (fArr3[i6] + fArr3[i5]) / 2.0f;
            double[] dArr10 = o0000Var.f27552OooO0O0;
            d2 = ((dArr10[i5] - dArr10[i6]) * ((double) f5)) + d2;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr4 = o0000Var.f27551OooO00o;
            if (i7 >= fArr4.length) {
                break;
            }
            fArr4[i7] = (float) (((double) fArr4[i7]) * (d / d2));
            i7++;
        }
        o0000Var.f27553OooO0OO[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr5 = o0000Var.f27551OooO00o;
            if (i8 >= fArr5.length) {
                break;
            }
            int i9 = i8 - 1;
            float f6 = (fArr5[i9] + fArr5[i8]) / 2.0f;
            double[] dArr11 = o0000Var.f27552OooO0O0;
            double d3 = dArr11[i8] - dArr11[i9];
            double[] dArr12 = o0000Var.f27553OooO0OO;
            dArr12[i8] = (d3 * ((double) f6)) + dArr12[i9];
            i8++;
        }
        double[] dArr13 = oooO00o2.f27575OooO0OO;
        if (dArr13.length > 1) {
            i = 0;
            oooO00o2.f27579OooO0oO = o000000.OooO00o(0, dArr13, dArr8);
        } else {
            i = 0;
            oooO00o2.f27579OooO0oO = null;
        }
        o000000.OooO00o(i, dArr6, dArr7);
    }

    public final String toString() {
        String string = this.f27567OooO0O0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (OooO0O0 oooO0O0 : this.f27570OooO0o) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(string, "[");
            sbOooO00o.append(oooO0O0.f27581OooO00o);
            sbOooO00o.append(" , ");
            sbOooO00o.append(decimalFormat.format(oooO0O0.f27582OooO0O0));
            sbOooO00o.append("] ");
            string = sbOooO00o.toString();
        }
        return string;
    }
}
