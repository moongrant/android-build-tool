package p081o000OoO;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.DoubleCompanionObject;
import p071o000O0o.OooO0o;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f28323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f28324OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f28325OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f28326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f28327OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f28328OooO0o0;

    public OooOo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28323OooO00o = f;
        this.f28324OooO0O0 = f2;
        this.f28325OooO0OO = f3;
        this.f28326OooO0Oo = f4;
        this.f28328OooO0o0 = f5;
        this.f28327OooO0o = f6;
    }

    @NonNull
    public static OooOo OooO00o(@ColorInt int i) {
        o0ooOOo o0ooooo2 = o0ooOOo.f28347OooOO0O;
        float fOooO0O0 = Oooo000.OooO0O0(Color.red(i));
        float fOooO0O1 = Oooo000.OooO0O0(Color.green(i));
        float fOooO0O2 = Oooo000.OooO0O0(Color.blue(i));
        float[][] fArr = Oooo000.f28333OooO0Oo;
        float[] fArr2 = {(fArr[0][2] * fOooO0O2) + (fArr[0][1] * fOooO0O1) + (fArr[0][0] * fOooO0O0), (fArr[1][2] * fOooO0O2) + (fArr[1][1] * fOooO0O1) + (fArr[1][0] * fOooO0O0), (fOooO0O2 * fArr[2][2]) + (fOooO0O1 * fArr[2][1]) + (fOooO0O0 * fArr[2][0])};
        float[][] fArr3 = Oooo000.f28330OooO00o;
        float f = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f2 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f3 = (fArr2[2] * fArr3[2][2]) + (fArr2[1] * fArr3[2][1]) + (fArr2[0] * fArr3[2][0]);
        float[] fArr4 = o0ooooo2.f28355OooO0oO;
        float f4 = fArr4[0] * f;
        float f5 = fArr4[1] * f2;
        float f6 = fArr4[2] * f3;
        float fPow = (float) Math.pow(((double) (Math.abs(f4) * o0ooooo2.f28356OooO0oo)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f5) * o0ooooo2.f28356OooO0oo)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f6) * o0ooooo2.f28356OooO0oo)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f4) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f5) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f6) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f7 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f8 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f9 = fSignum2 * 20.0f;
        float f10 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f9)) / 20.0f;
        float f11 = (((fSignum * 40.0f) + f9) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f8, f7)) * 180.0f) / 3.1415927f;
        if (fAtan2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f12 = fAtan2;
        float f13 = (3.1415927f * f12) / 180.0f;
        float fPow4 = ((float) Math.pow((f11 * o0ooooo2.f28350OooO0O0) / o0ooooo2.f28349OooO00o, o0ooooo2.f28352OooO0Oo * o0ooooo2.f28357OooOO0)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, o0ooooo2.f28353OooO0o), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f12) < 20.14d ? 360.0f + f12 : f12)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * o0ooooo2.f28354OooO0o0) * o0ooooo2.f28351OooO0OO) * ((float) Math.sqrt((f8 * f8) + (f7 * f7)))) / (f10 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f14 = o0ooooo2.f28348OooO * fSqrt;
        Math.sqrt((fPow5 * o0ooooo2.f28352OooO0Oo) / (o0ooooo2.f28349OooO00o + 4.0f));
        float f15 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f14 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f13;
        return new OooOo(f12, fSqrt, fPow4, f15, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    @NonNull
    public static OooOo OooO0O0(@FloatRange(from = 0.0d, to = 100.0d) float f, @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = 360.0d) float f3) {
        o0ooOOo o0ooooo2 = o0ooOOo.f28347OooOO0O;
        float f4 = o0ooooo2.f28352OooO0Oo;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = o0ooooo2.f28348OooO * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * o0ooooo2.f28352OooO0Oo) / (o0ooooo2.f28349OooO00o + 4.0f));
        float f6 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new OooOo(f3, f2, f, f6, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @ColorInt
    public final int OooO0OO(@NonNull o0ooOOo o0ooooo2) {
        float fSqrt;
        float f = this.f28324OooO0O0;
        if (f != 0.0d) {
            double d = this.f28325OooO0OO;
            if (d == 0.0d) {
                fSqrt = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                fSqrt = f / ((float) Math.sqrt(d / 100.0d));
            }
        } else {
            fSqrt = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, o0ooooo2.f28353OooO0o), 0.73d), 1.1111111111111112d);
        double d2 = (this.f28323OooO00o * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
        float fPow2 = o0ooooo2.f28349OooO00o * ((float) Math.pow(((double) this.f28325OooO0OO) / 100.0d, (1.0d / ((double) o0ooooo2.f28352OooO0Oo)) / ((double) o0ooooo2.f28357OooOO0)));
        float f2 = fCos * 3846.1538f * o0ooooo2.f28354OooO0o0 * o0ooooo2.f28351OooO0OO;
        float f3 = fPow2 / o0ooooo2.f28350OooO0O0;
        float fSin = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        float f4 = (((0.305f + f3) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f2 * 23.0f)));
        float f5 = fCos2 * f4;
        float f6 = f4 * fSin;
        float f7 = f3 * 460.0f;
        float f8 = ((288.0f * f6) + ((451.0f * f5) + f7)) / 1403.0f;
        float fOooO00o = OooOO0.OooO00o(f6, 261.0f, f7 - (891.0f * f5), 1403.0f);
        float fOooO00o2 = OooOO0.OooO00o(f6, 6300.0f, f7 - (f5 * 220.0f), 1403.0f);
        float fSignum = (100.0f / o0ooooo2.f28356OooO0oo) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fSignum2 = (100.0f / o0ooooo2.f28356OooO0oo) * Math.signum(fOooO00o) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fOooO00o)) * 27.13d) / (400.0d - ((double) Math.abs(fOooO00o)))), 2.380952380952381d));
        float fSignum3 = (100.0f / o0ooooo2.f28356OooO0oo) * Math.signum(fOooO00o2) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fOooO00o2)) * 27.13d) / (400.0d - ((double) Math.abs(fOooO00o2)))), 2.380952380952381d));
        float[] fArr = o0ooooo2.f28355OooO0oO;
        float f9 = fSignum / fArr[0];
        float f10 = fSignum2 / fArr[1];
        float f11 = fSignum3 / fArr[2];
        float[][] fArr2 = Oooo000.f28331OooO0O0;
        return OooO0o.OooO00o((fArr2[0][2] * f11) + (fArr2[0][1] * f10) + (fArr2[0][0] * f9), (fArr2[1][2] * f11) + (fArr2[1][1] * f10) + (fArr2[1][0] * f9), (f11 * fArr2[2][2]) + (f10 * fArr2[2][1]) + (f9 * fArr2[2][0]));
    }
}
