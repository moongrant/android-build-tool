package p058o0000Ooo;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import kotlin.jvm.internal.DoubleCompanionObject;
import p031OoooO0.o0OoOo0;
import p052o00000oO.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f33717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f33719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f33720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f33721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f33722OooO0o0;

    public Oooo000(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f33717OooO00o = f;
        this.f33718OooO0O0 = f2;
        this.f33719OooO0OO = f3;
        this.f33720OooO0Oo = f4;
        this.f33722OooO0o0 = f5;
        this.f33721OooO0o = f6;
    }

    @NonNull
    public static Oooo000 OooO00o(@ColorInt int i) {
        o00oO0o o00oo0o2 = o00oO0o.f33731OooOO0O;
        float fOooO0O0 = Oooo0.OooO0O0(Color.red(i));
        float fOooO0O1 = Oooo0.OooO0O0(Color.green(i));
        float fOooO0O2 = Oooo0.OooO0O0(Color.blue(i));
        float[][] fArr = Oooo0.f33716OooO0Oo;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fOooO0O2) + (fArr2[1] * fOooO0O1) + (fArr2[0] * fOooO0O0);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fOooO0O2) + (fArr3[1] * fOooO0O1) + (fArr3[0] * fOooO0O0);
        float[] fArr4 = fArr[2];
        float f3 = (fOooO0O2 * fArr4[2]) + (fOooO0O1 * fArr4[1]) + (fOooO0O0 * fArr4[0]);
        float[][] fArr5 = Oooo0.f33713OooO00o;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = o00oo0o2.f33739OooO0oO;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = o00oo0o2.f33740OooO0oo;
        float fPow = (float) Math.pow(((double) (fAbs * f10)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * f10)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * f10)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f11 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * o00oo0o2.f33734OooO0O0;
        float f19 = o00oo0o2.f33733OooO00o;
        double d2 = f18 / f19;
        float f20 = o00oo0o2.f33741OooOO0;
        float f21 = o00oo0o2.f33736OooO0Oo;
        float fPow4 = ((float) Math.pow(d2, f20 * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, o00oo0o2.f33737OooO0o), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f16) < 20.14d ? 360.0f + f16 : f16)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * o00oo0o2.f33738OooO0o0) * o00oo0o2.f33735OooO0OO) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float f23 = o00oo0o2.f33732OooO * fSqrt;
        Math.sqrt((fPow5 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f17;
        return new Oooo000(f16, fSqrt, fPow4, f24, ((float) Math.cos(d3)) * fLog, fLog * ((float) Math.sin(d3)));
    }

    @NonNull
    public static Oooo000 OooO0O0(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f, @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = 360.0d) float f3) {
        o00oO0o o00oo0o2 = o00oO0o.f33731OooOO0O;
        float f4 = o00oo0o2.f33736OooO0Oo;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = o00oo0o2.f33733OooO00o + 4.0f;
        float f6 = o00oo0o2.f33732OooO * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * o00oo0o2.f33736OooO0Oo) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new Oooo000(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @ColorInt
    public final int OooO0OO(@NonNull o00oO0o o00oo0o2) {
        float fSqrt;
        float f = this.f33718OooO0O0;
        double d = f;
        float f2 = this.f33719OooO0OO;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, o00oo0o2.f33737OooO0o), 0.73d), 1.1111111111111112d);
        double d3 = (this.f33717OooO00o * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = o00oo0o2.f33733OooO00o * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) o00oo0o2.f33736OooO0Oo)) / ((double) o00oo0o2.f33741OooOO0)));
        float f3 = fCos * 3846.1538f * o00oo0o2.f33738OooO0o0 * o00oo0o2.f33735OooO0OO;
        float f4 = fPow2 / o00oo0o2.f33734OooO0O0;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f5 = (((0.305f + f4) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f3 * 23.0f)));
        float f6 = fCos2 * f5;
        float f7 = f5 * fSin;
        float f8 = f4 * 460.0f;
        float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
        float fOooO00o = o0OoOo0.OooO00o(f7, 261.0f, f8 - (891.0f * f6), 1403.0f);
        float fOooO00o2 = o0OoOo0.OooO00o(f7, 6300.0f, f8 - (f6 * 220.0f), 1403.0f);
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
        float fSignum = Math.signum(f9);
        float f10 = 100.0f / o00oo0o2.f33740OooO0oo;
        float fPow3 = fSignum * f10 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(fOooO00o) * f10 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fOooO00o)) * 27.13d) / (400.0d - ((double) Math.abs(fOooO00o)))), 2.380952380952381d));
        float fSignum3 = Math.signum(fOooO00o2) * f10 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fOooO00o2)) * 27.13d) / (400.0d - ((double) Math.abs(fOooO00o2)))), 2.380952380952381d));
        float[] fArr = o00oo0o2.f33739OooO0oO;
        float f11 = fPow3 / fArr[0];
        float f12 = fSignum2 / fArr[1];
        float f13 = fSignum3 / fArr[2];
        float[][] fArr2 = Oooo0.f33714OooO0O0;
        float[] fArr3 = fArr2[0];
        float f14 = (fArr3[2] * f13) + (fArr3[1] * f12) + (fArr3[0] * f11);
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f12) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        return OooOO0.OooO00o(f14, f15, (f13 * fArr5[2]) + (f12 * fArr5[1]) + (f11 * fArr5[0]));
    }
}
