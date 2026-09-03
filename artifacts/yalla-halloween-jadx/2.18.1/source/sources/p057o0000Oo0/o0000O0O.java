package p057o0000Oo0;

import OooO00o.OooO00o;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000Ooo f27613OooO0Oo;

    public o0000O0O(String str) {
        this.f27561OooO00o = str;
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
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
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
        o0000Ooo o0000ooo = new o0000Ooo(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(" 0 ");
        sbOooO0o0.append(o0000ooo.OooO0O0(0.0d));
        printStream.println(sbOooO0o0.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0(" 1 ");
        sbOooO0o1.append(o0000ooo.OooO0O0(1.0d));
        printStream2.println(sbOooO0o1.toString());
        this.f27613OooO0Oo = o0000ooo;
    }

    @Override // p057o0000Oo0.o000000O
    public final double OooO00o(double d) {
        return this.f27613OooO0Oo.OooO0O0(d);
    }

    @Override // p057o0000Oo0.o000000O
    public final double OooO0O0(double d) {
        return this.f27613OooO0Oo.OooO0o0(d);
    }
}
