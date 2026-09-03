package p413o0Oo0oo;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Ooo f45343OooO0Oo;

    public o0Oo0oo(String str) {
        this.f45281OooO00o = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < dArrCopyOf.length; i2++) {
            double d2 = dArrCopyOf[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d2;
            double d3 = ((double) i2) * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 1.0d) - d;
            }
        }
        o00Ooo o00ooo2 = new o00Ooo(dArr3, dArr2);
        System.out.println(" 0 " + o00ooo2.OooO0O0(0.0d));
        System.out.println(" 1 " + o00ooo2.OooO0O0(1.0d));
        this.f45343OooO0Oo = o00ooo2;
    }

    @Override // p413o0Oo0oo.Oooo0
    public final double OooO00o(double d) {
        return this.f45343OooO0Oo.OooO0O0(d);
    }

    @Override // p413o0Oo0oo.Oooo0
    public final double OooO0O0(double d) {
        return this.f45343OooO0Oo.OooO0o0(d);
    }
}
