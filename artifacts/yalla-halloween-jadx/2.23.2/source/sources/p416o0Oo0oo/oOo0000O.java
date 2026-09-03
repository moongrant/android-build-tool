package p416o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oOo0000O implements oOo000Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f46514OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f46515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f46516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f46517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f46518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f46519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f46520OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f46521OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f46522OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f46523OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f46524OooOO0O = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f46525OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f46526OooOOO0;

    @Override // p416o0Oo0oo.oOo000Oo
    public final float OooO00o() {
        return this.f46524OooOO0O ? -OooO0OO(this.f46526OooOOO0) : OooO0OO(this.f46526OooOOO0);
    }

    @Override // p416o0Oo0oo.oOo000Oo
    public final boolean OooO0O0() {
        return OooO00o() < 1.0E-5f && Math.abs(this.f46514OooO - this.f46526OooOOO0) < 1.0E-5f;
    }

    public final float OooO0OO(float f) {
        float f2;
        float f3;
        float f4 = this.f46518OooO0Oo;
        if (f <= f4) {
            f2 = this.f46515OooO00o;
            f3 = this.f46516OooO0O0;
        } else {
            int i = this.f46523OooOO0;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f46520OooO0o0;
            if (f >= f4) {
                if (i == 2) {
                    return this.f46522OooO0oo;
                }
                float f5 = f - f4;
                float f6 = this.f46519OooO0o;
                if (f5 >= f6) {
                    return this.f46514OooO;
                }
                float f7 = this.f46517OooO0OO;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.f46516OooO0O0;
            f3 = this.f46517OooO0OO;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    public final void OooO0Oo(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f46515OooO00o = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f46523OooOO0 = 2;
                this.f46515OooO00o = f;
                this.f46516OooO0O0 = fSqrt;
                this.f46517OooO0OO = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f46518OooO0Oo = f8;
                this.f46520OooO0o0 = fSqrt / f3;
                this.f46521OooO0oO = ((f + fSqrt) * f8) / 2.0f;
                this.f46522OooO0oo = f2;
                this.f46514OooO = f2;
                return;
            }
            this.f46523OooOO0 = 3;
            this.f46515OooO00o = f;
            this.f46516OooO0O0 = f4;
            this.f46517OooO0OO = f4;
            float f9 = (f4 - f) / f3;
            this.f46518OooO0Oo = f9;
            float f10 = f4 / f3;
            this.f46519OooO0o = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f46520OooO0o0 = ((f2 - f11) - f12) / f4;
            this.f46521OooO0oO = f11;
            this.f46522OooO0oo = f2 - f12;
            this.f46514OooO = f2;
            return;
        }
        if (f7 >= f2) {
            this.f46523OooOO0 = 1;
            this.f46515OooO00o = f;
            this.f46516OooO0O0 = 0.0f;
            this.f46521OooO0oO = f2;
            this.f46518OooO0Oo = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f46523OooOO0 = 2;
            this.f46515OooO00o = f;
            this.f46516OooO0O0 = f;
            this.f46517OooO0OO = 0.0f;
            this.f46521OooO0oO = f13;
            this.f46522OooO0oo = f2;
            this.f46518OooO0Oo = f14;
            this.f46520OooO0o0 = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f46518OooO0Oo = f15;
        float f16 = fSqrt2 / f3;
        this.f46520OooO0o0 = f16;
        if (fSqrt2 < f4) {
            this.f46523OooOO0 = 2;
            this.f46515OooO00o = f;
            this.f46516OooO0O0 = fSqrt2;
            this.f46517OooO0OO = 0.0f;
            this.f46518OooO0Oo = f15;
            this.f46520OooO0o0 = f16;
            this.f46521OooO0oO = ((f + fSqrt2) * f15) / 2.0f;
            this.f46522OooO0oo = f2;
            return;
        }
        this.f46523OooOO0 = 3;
        this.f46515OooO00o = f;
        this.f46516OooO0O0 = f4;
        this.f46517OooO0OO = f4;
        float f17 = (f4 - f) / f3;
        this.f46518OooO0Oo = f17;
        float f18 = f4 / f3;
        this.f46519OooO0o = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f46520OooO0o0 = ((f2 - f19) - f20) / f4;
        this.f46521OooO0oO = f19;
        this.f46522OooO0oo = f2 - f20;
        this.f46514OooO = f2;
    }

    @Override // p416o0Oo0oo.oOo000Oo
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f46518OooO0Oo;
        if (f <= f3) {
            float f4 = this.f46515OooO00o;
            f2 = ((((this.f46516OooO0O0 - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f46523OooOO0;
            if (i == 1) {
                f2 = this.f46521OooO0oO;
            } else {
                float f5 = f - f3;
                float f6 = this.f46520OooO0o0;
                if (f5 < f6) {
                    float f7 = this.f46521OooO0oO;
                    float f8 = this.f46516OooO0O0;
                    f2 = ((((this.f46517OooO0OO - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f46522OooO0oo;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f46519OooO0o;
                    if (f9 <= f10) {
                        float f11 = this.f46522OooO0oo;
                        float f12 = this.f46517OooO0OO * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f46514OooO;
                    }
                }
            }
        }
        this.f46526OooOOO0 = f;
        return this.f46524OooOO0O ? this.f46525OooOO0o - f2 : this.f46525OooOO0o + f2;
    }
}
