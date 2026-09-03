package p416o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oOo00ooO implements oOo000Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f46544OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double f46545OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f46546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f46547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f46548OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f46549OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f46550OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f46543OooO00o = 0.5d;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f46542OooO = 0;

    @Override // p416o0Oo0oo.oOo000Oo
    public final float OooO00o() {
        return 0.0f;
    }

    @Override // p416o0Oo0oo.oOo000Oo
    public final boolean OooO0O0() {
        double d = ((double) this.f46548OooO0o0) - this.f46545OooO0OO;
        double d2 = this.f46544OooO0O0;
        double d3 = this.f46547OooO0o;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f46549OooO0oO))) / d2) <= ((double) this.f46550OooO0oo);
    }

    @Override // p416o0Oo0oo.oOo000Oo
    public final float getInterpolation(float f) {
        oOo00ooO ooo00ooo = this;
        float f2 = f;
        double d = f2 - ooo00ooo.f46546OooO0Oo;
        double d2 = ooo00ooo.f46544OooO0O0;
        double d3 = ooo00ooo.f46543OooO00o;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) ooo00ooo.f46549OooO0oO)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            double d5 = ooo00ooo.f46548OooO0o0;
            double d6 = ooo00ooo.f46545OooO0OO;
            int i2 = iSqrt;
            int i3 = i;
            double d7 = ooo00ooo.f46547OooO0o;
            double d8 = ooo00ooo.f46549OooO0oO;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d10 = ((((-((((d4 * d9) / 2.0d) + d5) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            float f3 = (float) (d7 + d10);
            this.f46547OooO0o = f3;
            float f4 = (float) ((((d10 / 2.0d) + d7) * d4) + d5);
            this.f46548OooO0o0 = f4;
            int i4 = this.f46542OooO;
            if (i4 > 0) {
                if (f4 < 0.0f && (i4 & 1) == 1) {
                    this.f46548OooO0o0 = -f4;
                    this.f46547OooO0o = -f3;
                }
                float f5 = this.f46548OooO0o0;
                if (f5 > 1.0f && (i4 & 2) == 2) {
                    this.f46548OooO0o0 = 2.0f - f5;
                    this.f46547OooO0o = -this.f46547OooO0o;
                }
            }
            f2 = f;
            iSqrt = i2;
            i = i3 + 1;
            ooo00ooo = this;
        }
        oOo00ooO ooo00ooo2 = ooo00ooo;
        ooo00ooo2.f46546OooO0Oo = f2;
        return ooo00ooo2.f46548OooO0o0;
    }
}
