package p145o00Oo0;

import OooO00o.OooO00o;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ULong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p167o00Ooo.OooO;
import p167o00Ooo.OooO0o;
import p167o00Ooo.OooOO0O;
import p167o00Ooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @Stable
    public static final long OooO00o(float f, float f2, float f3, float f4, @NotNull OooO colorSpace) {
        boolean z;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (f <= colorSpace.OooO0O0(0) && colorSpace.OooO0OO(0) <= f) {
            if (f2 <= colorSpace.OooO0O0(1) && colorSpace.OooO0OO(1) <= f2) {
                if (f3 <= colorSpace.OooO0O0(2) && colorSpace.OooO0OO(2) <= f3) {
                    if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= f4 && f4 <= 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
        }
        if (colorSpace.OooO0Oo()) {
            long jM674constructorimpl = ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32);
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            return jM674constructorimpl;
        }
        long j = colorSpace.f32557OooO0O0;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
        if (!(((int) (j >> 32)) == 3)) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
        }
        int i = colorSpace.f32558OooO0OO;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
        }
        long jM674constructorimpl2 = ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(o0000Ooo.OooO00o(f2)) & 65535) << 32) | ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(o0000Ooo.OooO00o(f)) & 65535) << 48)) | ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(o0000Ooo.OooO00o(f3)) & 65535) << 16)) | ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl((int) ((Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m674constructorimpl(ULong.m674constructorimpl(i) & 63));
        o00000O0.OooO00o oooO00o3 = o00000O0.f32063OooO0O0;
        return jM674constructorimpl2;
    }

    @Stable
    public static final long OooO0O0(int i) {
        long jM674constructorimpl = ULong.m674constructorimpl(ULong.m674constructorimpl(i) << 32);
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return jM674constructorimpl;
    }

    @Stable
    public static final long OooO0OO(long j) {
        long jM674constructorimpl = ULong.m674constructorimpl(ULong.m674constructorimpl(ULong.m674constructorimpl(j) & 4294967295L) << 32);
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return jM674constructorimpl;
    }

    @Stable
    public static final long OooO0Oo(long j, long j2) {
        float f;
        float f2;
        long jOooO0O0 = o00000O0.OooO0O0(j, o00000O0.OooO0oO(j2));
        float fOooO0o0 = o00000O0.OooO0o0(j2);
        float fOooO0o1 = o00000O0.OooO0o0(jOooO0O0);
        float f3 = 1.0f - fOooO0o1;
        float f4 = (fOooO0o0 * f3) + fOooO0o1;
        float fOooO = o00000O0.OooO(jOooO0O0);
        float fOooO2 = o00000O0.OooO(j2);
        float f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            f = (((fOooO2 * fOooO0o0) * f3) + (fOooO * fOooO0o1)) / f4;
        }
        float fOooO0oo = o00000O0.OooO0oo(jOooO0O0);
        float fOooO0oo2 = o00000O0.OooO0oo(j2);
        if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            f2 = (((fOooO0oo2 * fOooO0o0) * f3) + (fOooO0oo * fOooO0o1)) / f4;
        }
        float fOooO0o = o00000O0.OooO0o(jOooO0O0);
        float fOooO0o2 = o00000O0.OooO0o(j2);
        if (!(f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            f5 = (((fOooO0o2 * fOooO0o0) * f3) + (fOooO0o * fOooO0o1)) / f4;
        }
        return OooO00o(f, f2, f5, f4, o00000O0.OooO0oO(j2));
    }

    @Stable
    public static final float OooO0o(long j) {
        OooO oooOOooO0oO = o00000O0.OooO0oO(j);
        long j2 = oooOOooO0oO.f32557OooO0O0;
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
        if (!OooO0o.OooO00o(j2, OooO0o.f32562OooO0O0)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("The specified color must be encoded in an RGB color space. The supplied color space is ");
            sbOooO0o0.append((Object) OooO0o.OooO0O0(oooOOooO0oO.f32557OooO0O0));
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        Function1<Double, Double> function1 = ((Oooo0) oooOOooO0oO).f32612OooOOO;
        double dDoubleValue = ((Number) function1.invoke(Double.valueOf(o00000O0.OooO(j)))).doubleValue();
        float fDoubleValue = (float) ((((Number) function1.invoke(Double.valueOf(o00000O0.OooO0o(j)))).doubleValue() * 0.0722d) + (((Number) function1.invoke(Double.valueOf(o00000O0.OooO0oo(j)))).doubleValue() * 0.7152d) + (dDoubleValue * 0.2126d));
        if (fDoubleValue <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (fDoubleValue >= 1.0f) {
            return 1.0f;
        }
        return fDoubleValue;
    }

    public static final float[] OooO0o0(long j) {
        return new float[]{o00000O0.OooO(j), o00000O0.OooO0oo(j), o00000O0.OooO0o(j), o00000O0.OooO0o0(j)};
    }

    @Stable
    public static final int OooO0oO(long j) {
        OooO oooOOooO0oO = o00000O0.OooO0oO(j);
        if (oooOOooO0oO.OooO0Oo()) {
            return (int) ULong.m674constructorimpl(j >>> 32);
        }
        float[] fArrOooO0o0 = OooO0o0(j);
        OooOO0O.OooO0Oo(oooOOooO0oO, null, 3).OooO00o(fArrOooO0o0);
        return ((int) ((fArrOooO0o0[2] * 255.0f) + 0.5f)) | (((int) ((fArrOooO0o0[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrOooO0o0[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrOooO0o0[1] * 255.0f) + 0.5f)) << 8);
    }
}
