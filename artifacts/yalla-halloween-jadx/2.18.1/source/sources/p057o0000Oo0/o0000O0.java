package p057o0000Oo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 implements o000OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f27604OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public double f27605OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f27606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f27607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f27608OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f27609OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f27610OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f27603OooO00o = 0.5d;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f27602OooO = 0;

    @Override // p057o0000Oo0.o000OO
    public final boolean OooO00o() {
        double d = ((double) this.f27608OooO0o0) - this.f27605OooO0OO;
        double d2 = this.f27604OooO0O0;
        double d3 = this.f27607OooO0o;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f27609OooO0oO))) / d2) <= ((double) this.f27610OooO0oo);
    }

    @Override // p057o0000Oo0.o000OO
    public final float OooO0O0() {
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p057o0000Oo0.o000OO
    public final float getInterpolation(float f) {
        o0000O0 o0000o1 = this;
        double d = f - o0000o1.f27606OooO0Oo;
        double d2 = o0000o1.f27604OooO0O0;
        double d3 = o0000o1.f27603OooO00o;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) o0000o1.f27609OooO0oO)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            double d5 = o0000o1.f27608OooO0o0;
            double d6 = o0000o1.f27605OooO0OO;
            int i2 = iSqrt;
            int i3 = i;
            double d7 = o0000o1.f27607OooO0o;
            double d8 = o0000o1.f27609OooO0oO;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d10 = ((((-((((d4 * d9) / 2.0d) + d5) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            float f2 = (float) (d7 + d10);
            this.f27607OooO0o = f2;
            float f3 = (float) ((((d10 / 2.0d) + d7) * d4) + d5);
            this.f27608OooO0o0 = f3;
            int i4 = this.f27602OooO;
            if (i4 > 0) {
                if (f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (i4 & 1) == 1) {
                    this.f27608OooO0o0 = -f3;
                    this.f27607OooO0o = -f2;
                }
                float f4 = this.f27608OooO0o0;
                if (f4 > 1.0f && (i4 & 2) == 2) {
                    this.f27608OooO0o0 = 2.0f - f4;
                    this.f27607OooO0o = -this.f27607OooO0o;
                }
            }
            iSqrt = i2;
            i = i3 + 1;
            o0000o1 = this;
        }
        o0000O0 o0000o2 = o0000o1;
        o0000o2.f27606OooO0Oo = f;
        return o0000o2.f27608OooO0o0;
    }
}
