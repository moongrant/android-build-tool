package p057o0000OoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public double f33700OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f33701OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f33702OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f33704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f33705OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f33706OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public double f33707OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public double f33708OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOOO.OooOO0O f33709OooOO0;

    public OooOo() {
        this.f33701OooO00o = Math.sqrt(1500.0d);
        this.f33702OooO0O0 = 0.5d;
        this.f33703OooO0OO = false;
        this.f33700OooO = Double.MAX_VALUE;
        this.f33709OooOO0 = new OooOOO.OooOO0O();
    }

    public final OooOOO.OooOO0O OooO00o(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f33703OooO0OO) {
            if (this.f33700OooO == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f33702OooO0O0;
            if (d3 > 1.0d) {
                double d4 = this.f33701OooO00o;
                this.f33705OooO0o = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f33702OooO0O0;
                double d6 = this.f33701OooO00o;
                this.f33707OooO0oO = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f33708OooO0oo = Math.sqrt(1.0d - (d3 * d3)) * this.f33701OooO00o;
            }
            this.f33703OooO0OO = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f33700OooO;
        double d9 = this.f33702OooO0O0;
        if (d9 > 1.0d) {
            double d10 = this.f33707OooO0oO;
            double d11 = this.f33705OooO0o;
            double d12 = d8 - (((d10 * d8) - d2) / (d10 - d11));
            double d13 = ((d8 * d10) - d2) / (d10 - d11);
            dPow = (Math.pow(2.718281828459045d, this.f33705OooO0o * d7) * d13) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d14 = this.f33707OooO0oO;
            double dPow2 = Math.pow(2.718281828459045d, d14 * d7) * d12 * d14;
            double d15 = this.f33705OooO0o;
            dCos = (Math.pow(2.718281828459045d, d15 * d7) * d13 * d15) + dPow2;
        } else if (d9 == 1.0d) {
            double d16 = this.f33701OooO00o;
            double d17 = (d16 * d8) + d2;
            double d18 = (d17 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d16) * d7) * d18;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f33701OooO00o) * d7) * d18;
            double d19 = this.f33701OooO00o;
            dCos = (Math.pow(2.718281828459045d, (-d19) * d7) * d17) + (dPow4 * (-d19));
            dPow = dPow3;
        } else {
            double d20 = 1.0d / this.f33708OooO0oo;
            double d21 = this.f33701OooO00o;
            double d22 = ((d9 * d21 * d8) + d2) * d20;
            double dSin = ((Math.sin(this.f33708OooO0oo * d7) * d22) + (Math.cos(this.f33708OooO0oo * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d21 * d7);
            double d23 = this.f33701OooO00o;
            double d24 = this.f33702OooO0O0;
            double d25 = (-d23) * dSin * d24;
            double dPow5 = Math.pow(2.718281828459045d, (-d24) * d23 * d7);
            double d26 = this.f33708OooO0oo;
            double dSin2 = Math.sin(d26 * d7) * (-d26) * d8;
            double d27 = this.f33708OooO0oo;
            dCos = (((Math.cos(d27 * d7) * d22 * d27) + dSin2) * dPow5) + d25;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f33700OooO);
        OooOOO.OooOO0O oooOO0O = this.f33709OooOO0;
        oooOO0O.f33687OooO00o = f;
        oooOO0O.f33688OooO0O0 = (float) dCos;
        return oooOO0O;
    }

    public OooOo(float f) {
        this.f33701OooO00o = Math.sqrt(1500.0d);
        this.f33702OooO0O0 = 0.5d;
        this.f33703OooO0OO = false;
        this.f33709OooOO0 = new OooOOO.OooOO0O();
        this.f33700OooO = f;
    }
}
