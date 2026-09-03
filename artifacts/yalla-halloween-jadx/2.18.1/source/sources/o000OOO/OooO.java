package o000OOO;

import androidx.annotation.FloatRange;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public double f28239OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f28240OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f28241OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f28242OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f28243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f28244OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f28245OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public double f28246OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public double f28247OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0.OooOO0O f28248OooOO0;

    public OooO() {
        this.f28240OooO00o = Math.sqrt(1500.0d);
        this.f28241OooO0O0 = 0.5d;
        this.f28242OooO0OO = false;
        this.f28239OooO = Double.MAX_VALUE;
        this.f28248OooOO0 = new OooO0O0.OooOO0O();
    }

    public final OooO OooO00o(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f28240OooO00o = Math.sqrt(f);
        this.f28242OooO0OO = false;
        return this;
    }

    public final OooO0O0.OooOO0O OooO0O0(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f28242OooO0OO) {
            if (this.f28239OooO == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f28241OooO0O0;
            if (d3 > 1.0d) {
                double d4 = this.f28240OooO00o;
                this.f28244OooO0o = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f28241OooO0O0;
                double d6 = this.f28240OooO00o;
                this.f28246OooO0oO = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f28247OooO0oo = Math.sqrt(1.0d - (d3 * d3)) * this.f28240OooO00o;
            }
            this.f28242OooO0OO = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f28239OooO;
        double d9 = this.f28241OooO0O0;
        if (d9 > 1.0d) {
            double d10 = this.f28246OooO0oO;
            double d11 = this.f28244OooO0o;
            double d12 = d8 - (((d10 * d8) - d2) / (d10 - d11));
            double d13 = ((d8 * d10) - d2) / (d10 - d11);
            dPow = (Math.pow(2.718281828459045d, this.f28244OooO0o * d7) * d13) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d14 = this.f28246OooO0oO;
            double dPow2 = Math.pow(2.718281828459045d, d14 * d7) * d12 * d14;
            double d15 = this.f28244OooO0o;
            dCos = (Math.pow(2.718281828459045d, d15 * d7) * d13 * d15) + dPow2;
        } else if (d9 == 1.0d) {
            double d16 = this.f28240OooO00o;
            double d17 = (d16 * d8) + d2;
            double d18 = (d17 * d7) + d8;
            double dPow3 = Math.pow(2.718281828459045d, (-d16) * d7) * d18;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f28240OooO00o) * d7) * d18;
            double d19 = this.f28240OooO00o;
            dCos = (Math.pow(2.718281828459045d, (-d19) * d7) * d17) + (dPow4 * (-d19));
            dPow = dPow3;
        } else {
            double d20 = 1.0d / this.f28247OooO0oo;
            double d21 = this.f28240OooO00o;
            double d22 = ((d9 * d21 * d8) + d2) * d20;
            double dSin = ((Math.sin(this.f28247OooO0oo * d7) * d22) + (Math.cos(this.f28247OooO0oo * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d21 * d7);
            double d23 = this.f28240OooO00o;
            double d24 = this.f28241OooO0O0;
            double d25 = (-d23) * dSin * d24;
            double dPow5 = Math.pow(2.718281828459045d, (-d24) * d23 * d7);
            double d26 = this.f28247OooO0oo;
            double dSin2 = Math.sin(d26 * d7) * (-d26) * d8;
            double d27 = this.f28247OooO0oo;
            dCos = (((Math.cos(d27 * d7) * d22 * d27) + dSin2) * dPow5) + d25;
            dPow = dSin;
        }
        OooO0O0.OooOO0O oooOO0O = this.f28248OooOO0;
        oooOO0O.f28278OooO00o = (float) (dPow + this.f28239OooO);
        oooOO0O.f28279OooO0O0 = (float) dCos;
        return oooOO0O;
    }

    public OooO(float f) {
        this.f28240OooO00o = Math.sqrt(1500.0d);
        this.f28241OooO0O0 = 0.5d;
        this.f28242OooO0OO = false;
        this.f28248OooOO0 = new OooO0O0.OooOO0O();
        this.f28239OooO = f;
    }
}
