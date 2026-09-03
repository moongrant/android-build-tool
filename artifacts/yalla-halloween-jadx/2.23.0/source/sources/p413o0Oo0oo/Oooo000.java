package p413o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000 {

    public static class OooO00o extends Oooo000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final double f45286OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final double[] f45287OooO0O0;

        public OooO00o(double d, double[] dArr) {
            this.f45286OooO00o = d;
            this.f45287OooO0O0 = dArr;
        }

        @Override // p413o0Oo0oo.Oooo000
        public final double OooO0O0(double d) {
            return this.f45287OooO0O0[0];
        }

        @Override // p413o0Oo0oo.Oooo000
        public final void OooO0OO(double d, double[] dArr) {
            double[] dArr2 = this.f45287OooO0O0;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p413o0Oo0oo.Oooo000
        public final void OooO0Oo(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f45287OooO0O0;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // p413o0Oo0oo.Oooo000
        public final void OooO0o(double d, double[] dArr) {
            for (int i = 0; i < this.f45287OooO0O0.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p413o0Oo0oo.Oooo000
        public final double OooO0o0(double d) {
            return 0.0d;
        }

        @Override // p413o0Oo0oo.Oooo000
        public final double[] OooO0oO() {
            return new double[]{this.f45286OooO00o};
        }
    }

    public static Oooo000 OooO00o(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new o00Oo0(dArr, dArr2) : new OooO00o(dArr[0], dArr2[0]);
        }
        return new o00Ooo(dArr, dArr2);
    }

    public abstract double OooO0O0(double d);

    public abstract void OooO0OO(double d, double[] dArr);

    public abstract void OooO0Oo(double d, float[] fArr);

    public abstract void OooO0o(double d, double[] dArr);

    public abstract double OooO0o0(double d);

    public abstract double[] OooO0oO();
}
