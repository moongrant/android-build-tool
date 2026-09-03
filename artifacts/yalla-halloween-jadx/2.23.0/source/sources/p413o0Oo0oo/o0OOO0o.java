package p413o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements o0OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f45336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double f45337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f45338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f45339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f45340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f45341OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f45342OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f45335OooO00o = 0.5d;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f45334OooO = 0;

    @Override // p413o0Oo0oo.o0OO00O
    public final float OooO00o() {
        return 0.0f;
    }

    @Override // p413o0Oo0oo.o0OO00O
    public final boolean OooO0O0() {
        double d = ((double) this.f45340OooO0o0) - this.f45337OooO0OO;
        double d2 = this.f45336OooO0O0;
        double d3 = this.f45339OooO0o;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f45341OooO0oO))) / d2) <= ((double) this.f45342OooO0oo);
    }

    @Override // p413o0Oo0oo.o0OO00O
    public final float getInterpolation(float f) {
        o0OOO0o o0ooo0o2 = this;
        float f2 = f;
        double d = f2 - o0ooo0o2.f45338OooO0Oo;
        double d2 = o0ooo0o2.f45336OooO0O0;
        double d3 = o0ooo0o2.f45335OooO00o;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) o0ooo0o2.f45341OooO0oO)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            double d5 = o0ooo0o2.f45340OooO0o0;
            double d6 = o0ooo0o2.f45337OooO0OO;
            int i2 = iSqrt;
            int i3 = i;
            double d7 = o0ooo0o2.f45339OooO0o;
            double d8 = o0ooo0o2.f45341OooO0oO;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d10 = ((((-((((d4 * d9) / 2.0d) + d5) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            float f3 = (float) (d7 + d10);
            this.f45339OooO0o = f3;
            float f4 = (float) ((((d10 / 2.0d) + d7) * d4) + d5);
            this.f45340OooO0o0 = f4;
            int i4 = this.f45334OooO;
            if (i4 > 0) {
                if (f4 < 0.0f && (i4 & 1) == 1) {
                    this.f45340OooO0o0 = -f4;
                    this.f45339OooO0o = -f3;
                }
                float f5 = this.f45340OooO0o0;
                if (f5 > 1.0f && (i4 & 2) == 2) {
                    this.f45340OooO0o0 = 2.0f - f5;
                    this.f45339OooO0o = -this.f45339OooO0o;
                }
            }
            f2 = f;
            iSqrt = i2;
            i = i3 + 1;
            o0ooo0o2 = this;
        }
        o0OOO0o o0ooo0o3 = o0ooo0o2;
        o0ooo0o3.f45338OooO0Oo = f2;
        return o0ooo0o3.f45340OooO0o0;
    }
}
