package p057o0000Oo0;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class o000000O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static o000000O f27559OooO0O0 = new o000000O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static String[] f27560OooO0OO = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f27561OooO00o = "identity";

    public static class OooO00o extends o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f27562OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f27563OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f27564OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public double f27565OooO0oO;

        public OooO00o(String str) {
            this.f27561OooO00o = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f27562OooO0Oo = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f27564OooO0o0 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f27563OooO0o = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f27565OooO0oO = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // p057o0000Oo0.o000000O
        public final double OooO00o(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = OooO0Oo(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dOooO0Oo = OooO0Oo(d4);
            double d5 = d3 + d2;
            double dOooO0Oo2 = OooO0Oo(d5);
            double dOooO0o0 = OooO0o0(d4);
            return (((d - dOooO0Oo) * (OooO0o0(d5) - dOooO0o0)) / (dOooO0Oo2 - dOooO0Oo)) + dOooO0o0;
        }

        @Override // p057o0000Oo0.o000000O
        public final double OooO0O0(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = OooO0Oo(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (OooO0o0(d5) - OooO0o0(d4)) / (OooO0Oo(d5) - OooO0Oo(d4));
        }

        public final double OooO0Oo(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f27563OooO0o * d5) + (this.f27562OooO0Oo * d4) + (d * d * d);
        }

        public final double OooO0o0(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f27565OooO0oO * d5) + (this.f27564OooO0o0 * d4) + (d * d * d);
        }
    }

    public static o000000O OooO0OO(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new OooO00o(str);
        }
        if (str.startsWith("spline")) {
            return new o0000O0O(str);
        }
        if (str.startsWith("Schlick")) {
            return new o0000O00(str);
        }
        str.hashCode();
        switch (str) {
            case "accelerate":
                return new OooO00o("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new OooO00o("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new OooO00o("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new OooO00o("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new OooO00o("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new OooO00o("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                sbOooO0o0.append(Arrays.toString(f27560OooO0OO));
                printStream.println(sbOooO0o0.toString());
                return f27559OooO0O0;
        }
    }

    public double OooO00o(double d) {
        return d;
    }

    public double OooO0O0(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.f27561OooO00o;
    }
}
