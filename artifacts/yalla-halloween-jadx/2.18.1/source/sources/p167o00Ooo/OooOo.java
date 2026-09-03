package p167o00Ooo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends OooO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo() {
        super("Generic L*a*b*", OooO0o.f32564OooO0Oo, 15);
        Intrinsics.checkNotNullParameter("Generic L*a*b*", "name");
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO00o(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float f = v[0];
        float[] fArr = OooOo00.f32600OooO0o0;
        float f2 = f / fArr[0];
        float f3 = v[1] / fArr[1];
        float f4 = v[2] / fArr[2];
        float fPow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float fPow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float fPow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        v[0] = RangesKt.coerceIn((116.0f * fPow2) - 16.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 100.0f);
        v[1] = RangesKt.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v[2] = RangesKt.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0O0(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // p167o00Ooo.OooO
    public final float OooO0OO(int i) {
        if (i == 0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return -128.0f;
    }

    @Override // p167o00Ooo.OooO
    @NotNull
    public final float[] OooO0o0(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = RangesKt.coerceIn(v[0], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 100.0f);
        v[1] = RangesKt.coerceIn(v[1], -128.0f, 128.0f);
        v[2] = RangesKt.coerceIn(v[2], -128.0f, 128.0f);
        float f = (v[0] + 16.0f) / 116.0f;
        float f2 = (v[1] * 0.002f) + f;
        float f3 = f - (v[2] * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr = OooOo00.f32600OooO0o0;
        v[0] = f4 * fArr[0];
        v[1] = f5 * fArr[1];
        v[2] = f6 * fArr[2];
        return v;
    }
}
