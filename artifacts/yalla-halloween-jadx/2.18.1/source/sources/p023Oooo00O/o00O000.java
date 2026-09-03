package p023Oooo00O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f1119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f1120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f1121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f1122OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f1117OooO00o = 1.0f;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f1118OooO0O0 = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f1123OooO0oO = 1.0f;

    public final long OooO00o(float f, float f2, long j) {
        double dCos;
        double dExp;
        if (!this.f1119OooO0OO) {
            if (this.f1117OooO00o == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f3 = this.f1123OooO0oO;
            double d = f3;
            double d2 = d * d;
            if (f3 > 1.0f) {
                double d3 = this.f1118OooO0O0;
                double d4 = d2 - ((double) 1);
                this.f1120OooO0Oo = (Math.sqrt(d4) * d3) + (((double) (-f3)) * d3);
                double d5 = -this.f1123OooO0oO;
                double d6 = this.f1118OooO0O0;
                this.f1122OooO0o0 = (d5 * d6) - (Math.sqrt(d4) * d6);
            } else if (f3 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f3 < 1.0f) {
                this.f1121OooO0o = Math.sqrt(((double) 1) - d2) * this.f1118OooO0O0;
            }
            this.f1119OooO0OO = true;
        }
        float f4 = f - this.f1117OooO00o;
        double d7 = j / 1000.0d;
        float f5 = this.f1123OooO0oO;
        if (f5 > 1.0f) {
            double d8 = f4;
            double d9 = this.f1122OooO0o0;
            double d10 = f2;
            double d11 = this.f1120OooO0Oo;
            double d12 = d8 - (((d9 * d8) - d10) / (d9 - d11));
            double d13 = ((d8 * d9) - d10) / (d9 - d11);
            dExp = (Math.exp(this.f1120OooO0Oo * d7) * d13) + (Math.exp(d9 * d7) * d12);
            double d14 = this.f1122OooO0o0;
            double dExp2 = Math.exp(d14 * d7) * d12 * d14;
            double d15 = this.f1120OooO0Oo;
            dCos = (Math.exp(d15 * d7) * d13 * d15) + dExp2;
        } else {
            if (f5 == 1.0f) {
                double d16 = this.f1118OooO0O0;
                double d17 = f4;
                double d18 = (d16 * d17) + ((double) f2);
                double d19 = (d18 * d7) + d17;
                double dExp3 = Math.exp((-d16) * d7) * d19;
                double dExp4 = Math.exp((-this.f1118OooO0O0) * d7) * d19;
                double d20 = this.f1118OooO0O0;
                dCos = (Math.exp((-d20) * d7) * d18) + (dExp4 * (-d20));
                dExp = dExp3;
            } else {
                double d21 = ((double) 1) / this.f1121OooO0o;
                double d22 = this.f1118OooO0O0;
                double d23 = f4;
                double d24 = ((((double) f5) * d22 * d23) + ((double) f2)) * d21;
                double dExp5 = Math.exp(((double) (-f5)) * d22 * d7) * ((Math.sin(this.f1121OooO0o * d7) * d24) + (Math.cos(this.f1121OooO0o * d7) * d23));
                double d25 = this.f1118OooO0O0;
                float f6 = this.f1123OooO0oO;
                double d26 = (-d25) * dExp5 * ((double) f6);
                double dExp6 = Math.exp(((double) (-f6)) * d25 * d7);
                double d27 = this.f1121OooO0o;
                double dSin = Math.sin(d27 * d7) * (-d27) * d23;
                double d28 = this.f1121OooO0o;
                dCos = (((Math.cos(d28 * d7) * d24 * d28) + dSin) * dExp6) + d26;
                dExp = dExp5;
            }
        }
        return (((long) Float.floatToIntBits((float) dCos)) & 4294967295L) | (((long) Float.floatToIntBits((float) (dExp + ((double) this.f1117OooO00o)))) << 32);
    }
}
