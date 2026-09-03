package p081o000OoO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o0ooOOo f28347OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f28348OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f28349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f28350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f28351OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f28352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f28353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f28354OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float[] f28355OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f28356OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f28357OooOO0;

    static {
        float[] fArr = Oooo000.f28332OooO0OO;
        float fOooO0Oo = (float) ((((double) Oooo000.OooO0Oo()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = Oooo000.f28330OooO00o;
        float f = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f2 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f3 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f4 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fOooO0Oo) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float[] fArr3 = {(((100.0f / f) * fExp) + 1.0f) - fExp, (((100.0f / f2) * fExp) + 1.0f) - fExp, (((100.0f / f3) * fExp) + 1.0f) - fExp};
        float f5 = 1.0f / ((5.0f * fOooO0Oo) + 1.0f);
        float f6 = f5 * f5 * f5 * f5;
        float f7 = 1.0f - f6;
        float fCbrt = (0.1f * f7 * f7 * ((float) Math.cbrt(((double) fOooO0Oo) * 5.0d))) + (f6 * fOooO0Oo);
        float fOooO0Oo2 = Oooo000.OooO0Oo() / fArr[1];
        double d2 = fOooO0Oo2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * fCbrt) * f)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * fCbrt) * f2)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * fCbrt) * f3)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f28347OooOO0O = new o0ooOOo(fOooO0Oo2, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * fPow, fPow, fPow, f4, 1.0f, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public o0ooOOo(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f28353OooO0o = f;
        this.f28349OooO00o = f2;
        this.f28350OooO0O0 = f3;
        this.f28351OooO0OO = f4;
        this.f28352OooO0Oo = f5;
        this.f28354OooO0o0 = f6;
        this.f28355OooO0oO = fArr;
        this.f28356OooO0oo = f7;
        this.f28348OooO = f8;
        this.f28357OooOO0 = f9;
    }
}
