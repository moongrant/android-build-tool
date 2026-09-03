package p057o0000Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000000 {

    public static class OooO00o extends o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public double f27557OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public double[] f27558OooO0O0;

        public OooO00o(double d, double[] dArr) {
            this.f27557OooO00o = d;
            this.f27558OooO0O0 = dArr;
        }

        @Override // p057o0000Oo0.o000000
        public final double OooO0O0(double d) {
            return this.f27558OooO0O0[0];
        }

        @Override // p057o0000Oo0.o000000
        public final void OooO0OO(double d, double[] dArr) {
            double[] dArr2 = this.f27558OooO0O0;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p057o0000Oo0.o000000
        public final void OooO0Oo(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f27558OooO0O0;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // p057o0000Oo0.o000000
        public final void OooO0o(double d, double[] dArr) {
            for (int i = 0; i < this.f27558OooO0O0.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p057o0000Oo0.o000000
        public final double OooO0o0(double d) {
            return 0.0d;
        }

        @Override // p057o0000Oo0.o000000
        public final double[] OooO0oO() {
            return new double[]{this.f27557OooO00o};
        }
    }

    public static o000000 OooO00o(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new o00000OO(dArr, dArr2) : new OooO00o(dArr[0], dArr2[0]);
        }
        return new o0000Ooo(dArr, dArr2);
    }

    public abstract double OooO0O0(double d);

    public abstract void OooO0OO(double d, double[] dArr);

    public abstract void OooO0Oo(double d, float[] fArr);

    public abstract void OooO0o(double d, double[] dArr);

    public abstract double OooO0o0(double d);

    public abstract double[] OooO0oO();
}
