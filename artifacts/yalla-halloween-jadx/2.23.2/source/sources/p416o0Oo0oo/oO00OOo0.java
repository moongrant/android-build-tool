package p416o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class oO00OOo0 {

    public static class OooO00o extends oO00OOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final double f46469OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final double[] f46470OooO0O0;

        public OooO00o(double d, double[] dArr) {
            this.f46469OooO00o = d;
            this.f46470OooO0O0 = dArr;
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final double OooO0O0(double d) {
            return this.f46470OooO0O0[0];
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final void OooO0OO(double d, double[] dArr) {
            double[] dArr2 = this.f46470OooO0O0;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final void OooO0Oo(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f46470OooO0O0;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final void OooO0o(double d, double[] dArr) {
            for (int i = 0; i < this.f46470OooO0O0.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final double OooO0o0(double d) {
            return 0.0d;
        }

        @Override // p416o0Oo0oo.oO00OOo0
        public final double[] OooO0oO() {
            return new double[]{this.f46469OooO00o};
        }
    }

    public static oO00OOo0 OooO00o(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new oO00o00(dArr, dArr2) : new OooO00o(dArr[0], dArr2[0]);
        }
        return new oO0OOO00(dArr, dArr2);
    }

    public abstract double OooO0O0(double d);

    public abstract void OooO0OO(double d, double[] dArr);

    public abstract void OooO0Oo(double d, float[] fArr);

    public abstract void OooO0o(double d, double[] dArr);

    public abstract double OooO0o0(double d);

    public abstract double[] OooO0oO();
}
