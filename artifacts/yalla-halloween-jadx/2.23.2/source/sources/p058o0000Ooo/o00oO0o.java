package p058o0000Ooo;

import androidx.compose.animation.o00O0O;
import androidx.compose.ui.graphics.o00OOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o00oO0o f33731OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f33732OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f33733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f33735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f33736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f33737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f33738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float[] f33739OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f33740OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f33741OooOO0;

    static {
        float f;
        float f2;
        float[] fArr = Oooo0.f33715OooO0OO;
        float fOooO0OO = (float) ((((double) Oooo0.OooO0OO()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = Oooo0.f33713OooO00o;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f11 = f + f2;
        float fOooO00o = o00OOOOo.OooO00o((float) Math.exp(((-fOooO0OO) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = fOooO00o;
        if (d > 1.0d) {
            fOooO00o = 1.0f;
        } else if (d < 0.0d) {
            fOooO00o = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * fOooO00o) + 1.0f) - fOooO00o, (((100.0f / f9) * fOooO00o) + 1.0f) - fOooO00o, (((100.0f / f10) * fOooO00o) + 1.0f) - fOooO00o};
        float f12 = 1.0f / ((5.0f * fOooO0OO) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float fCbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) fOooO0OO) * 5.0d))) + (f13 * fOooO0OO);
        float fOooO0OO2 = Oooo0.OooO0OO() / fArr[1];
        double d2 = fOooO0OO2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f10)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f9)) / 100.0d, 0.42d), fPow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        f33731OooOO0O = new o00oO0o(fOooO0OO2, o00O0O.OooO00o((400.0f * fPow2) / (fPow2 + 27.13f), 0.05f, (((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)), fPow), fPow, fPow, f11, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public o00oO0o(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f33737OooO0o = f;
        this.f33733OooO00o = f2;
        this.f33734OooO0O0 = f3;
        this.f33735OooO0OO = f4;
        this.f33736OooO0Oo = f5;
        this.f33738OooO0o0 = f6;
        this.f33739OooO0oO = fArr;
        this.f33740OooO0oo = f7;
        this.f33732OooO = f8;
        this.f33741OooOO0 = f9;
    }
}
