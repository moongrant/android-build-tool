package p413o0Oo0oo;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f45295OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f45296OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f45297OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f45298OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f45300OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f45299OooO0o = new ArrayList<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double[] f45301OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo000o f45302OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f45303OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double[] f45304OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float[] f45305OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float[] f45306OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float[] f45307OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Oooo000 f45308OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double[] f45309OooO0oo;

        public OooO00o(int i, int i2, String str) {
            long j;
            char c;
            oo000o oo000oVar = new oo000o();
            this.f45302OooO00o = oo000oVar;
            oo000oVar.f45353OooO0o0 = i;
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
                oo000oVar.f45352OooO0Oo = new o00Ooo(dArr3, dArr2);
            }
            this.f45303OooO0O0 = new float[i2];
            this.f45304OooO0OO = new double[i2];
            this.f45305OooO0Oo = new float[i2];
            this.f45307OooO0o0 = new float[i2];
            this.f45306OooO0o = new float[i2];
            float[] fArr = new float[i2];
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f45310OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f45311OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f45312OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f45313OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f45314OooO0o0;

        public OooO0O0(int i, float f, float f2, float f3, float f4) {
            this.f45310OooO00o = i;
            this.f45311OooO0O0 = f4;
            this.f45312OooO0OO = f2;
            this.f45313OooO0Oo = f;
            this.f45314OooO0o0 = f3;
        }
    }

    public final float OooO00o(float f) {
        OooO00o oooO00o = this.f45295OooO00o;
        Oooo000 oooo000 = oooO00o.f45308OooO0oO;
        if (oooo000 != null) {
            oooo000.OooO0OO(f, oooO00o.f45309OooO0oo);
        } else {
            double[] dArr = oooO00o.f45309OooO0oo;
            dArr[0] = oooO00o.f45307OooO0o0[0];
            dArr[1] = oooO00o.f45306OooO0o[0];
            dArr[2] = oooO00o.f45303OooO0O0[0];
        }
        double[] dArr2 = oooO00o.f45309OooO0oo;
        return (float) ((oooO00o.f45302OooO00o.OooO0OO(f, dArr2[1]) * oooO00o.f45309OooO0oo[2]) + dArr2[0]);
    }

    public final float OooO0O0(float f) {
        double d;
        double dOooO0o0;
        double d2;
        double dSignum;
        OooO00o oooO00o = this.f45295OooO00o;
        Oooo000 oooo000 = oooO00o.f45308OooO0oO;
        if (oooo000 != null) {
            double d3 = f;
            oooo000.OooO0o(d3, oooO00o.f45301OooO);
            oooO00o.f45308OooO0oO.OooO0OO(d3, oooO00o.f45309OooO0oo);
        } else {
            double[] dArr = oooO00o.f45301OooO;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double d5 = oooO00o.f45309OooO0oo[1];
        oo000o oo000oVar = oooO00o.f45302OooO00o;
        double dOooO0OO = oo000oVar.OooO0OO(d4, d5);
        double d6 = oooO00o.f45309OooO0oo[1];
        double d7 = oooO00o.f45301OooO[1];
        double dOooO0O0 = oo000oVar.OooO0O0(d4) + d6;
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(oo000oVar.f45350OooO0O0, d4);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i = (-iBinarySearch) - 1;
            float[] fArr = oo000oVar.f45349OooO00o;
            float f2 = fArr[i];
            int i2 = i - 1;
            float f3 = fArr[i2];
            double[] dArr2 = oo000oVar.f45350OooO0O0;
            double d8 = dArr2[i];
            double d9 = dArr2[i2];
            double d10 = ((double) (f2 - f3)) / (d8 - d9);
            d = (((double) f3) - (d10 * d9)) + (d4 * d10);
        } else {
            d = 0.0d;
        }
        double d11 = d + d7;
        switch (oo000oVar.f45353OooO0o0) {
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
                dOooO0o0 = oo000oVar.f45352OooO0Oo.OooO0o0(dOooO0O0 % 1.0d);
                break;
            default:
                d2 = d11 * 6.283185307179586d;
                dSignum = Math.cos(dOooO0O0 * 6.283185307179586d);
                dOooO0o0 = dSignum * d2;
                break;
        }
        double[] dArr3 = oooO00o.f45301OooO;
        return (float) ((dOooO0o0 * oooO00o.f45309OooO0oo[2]) + (dOooO0OO * dArr3[2]) + dArr3[0]);
    }

    public void OooO0OO(ConstraintAttribute constraintAttribute) {
    }

    public final void OooO0Oo() {
        int i;
        ArrayList<OooO0O0> arrayList = this.f45299OooO0o;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new o0OoOo0());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f45295OooO00o = new OooO00o(this.f45297OooO0OO, size, this.f45298OooO0Oo);
        char c = 0;
        int i2 = 0;
        for (OooO0O0 oooO0O0 : arrayList) {
            float f = oooO0O0.f45313OooO0Oo;
            dArr[i2] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = oooO0O0.f45311OooO0O0;
            dArr3[c] = f2;
            float f3 = oooO0O0.f45312OooO0OO;
            dArr3[1] = f3;
            float f4 = oooO0O0.f45314OooO0o0;
            dArr3[2] = f4;
            OooO00o oooO00o = this.f45295OooO00o;
            oooO00o.f45304OooO0OO[i2] = ((double) oooO0O0.f45310OooO00o) / 100.0d;
            oooO00o.f45305OooO0Oo[i2] = f;
            oooO00o.f45307OooO0o0[i2] = f3;
            oooO00o.f45306OooO0o[i2] = f4;
            oooO00o.f45303OooO0O0[i2] = f2;
            i2++;
            dArr = dArr;
            c = 0;
        }
        double[] dArr4 = dArr;
        OooO00o oooO00o2 = this.f45295OooO00o;
        double[] dArr5 = oooO00o2.f45304OooO0OO;
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr5.length, 3);
        float[] fArr = oooO00o2.f45303OooO0O0;
        oooO00o2.f45309OooO0oo = new double[fArr.length + 2];
        oooO00o2.f45301OooO = new double[fArr.length + 2];
        double d = dArr5[0];
        float[] fArr2 = oooO00o2.f45305OooO0Oo;
        oo000o oo000oVar = oooO00o2.f45302OooO00o;
        if (d > 0.0d) {
            oo000oVar.OooO00o(0.0d, fArr2[0]);
        }
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            oo000oVar.OooO00o(1.0d, fArr2[length]);
        }
        for (int i3 = 0; i3 < dArr6.length; i3++) {
            double[] dArr7 = dArr6[i3];
            dArr7[0] = oooO00o2.f45307OooO0o0[i3];
            dArr7[1] = oooO00o2.f45306OooO0o[i3];
            dArr7[2] = fArr[i3];
            oo000oVar.OooO00o(dArr5[i3], fArr2[i3]);
        }
        int i4 = 0;
        double d2 = 0.0d;
        while (true) {
            float[] fArr3 = oo000oVar.f45349OooO00o;
            if (i4 >= fArr3.length) {
                break;
            }
            d2 += (double) fArr3[i4];
            i4++;
        }
        int i5 = 1;
        double d3 = 0.0d;
        while (true) {
            float[] fArr4 = oo000oVar.f45349OooO00o;
            if (i5 >= fArr4.length) {
                break;
            }
            int i6 = i5 - 1;
            float f5 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr8 = oo000oVar.f45350OooO0O0;
            d3 = ((dArr8[i5] - dArr8[i6]) * ((double) f5)) + d3;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr5 = oo000oVar.f45349OooO00o;
            if (i7 >= fArr5.length) {
                break;
            }
            fArr5[i7] = (float) (((double) fArr5[i7]) * (d2 / d3));
            i7++;
        }
        oo000oVar.f45351OooO0OO[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr6 = oo000oVar.f45349OooO00o;
            if (i8 >= fArr6.length) {
                break;
            }
            int i9 = i8 - 1;
            float f6 = (fArr6[i9] + fArr6[i8]) / 2.0f;
            double[] dArr9 = oo000oVar.f45350OooO0O0;
            double d4 = dArr9[i8] - dArr9[i9];
            double[] dArr10 = oo000oVar.f45351OooO0OO;
            dArr10[i8] = (d4 * ((double) f6)) + dArr10[i9];
            i8++;
        }
        if (dArr5.length > 1) {
            i = 0;
            oooO00o2.f45308OooO0oO = Oooo000.OooO00o(0, dArr5, dArr6);
        } else {
            i = 0;
            oooO00o2.f45308OooO0oO = null;
        }
        Oooo000.OooO00o(i, dArr4, dArr2);
    }

    public final String toString() {
        String string = this.f45296OooO0O0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (OooO0O0 oooO0O0 : this.f45299OooO0o) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(string, "[");
            sbOooO0O0.append(oooO0O0.f45310OooO00o);
            sbOooO0O0.append(" , ");
            sbOooO0O0.append(decimalFormat.format(oooO0O0.f45311OooO0O0));
            sbOooO0O0.append("] ");
            string = sbOooO0O0.toString();
        }
        return string;
    }
}
