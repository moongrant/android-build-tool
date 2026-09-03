package p145o00Oo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o00O0O.OooO0o;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000O {
    public static float[] OooO00o() {
        float[] values = {1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f};
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    public static final long OooO0O0(float[] fArr, long j) {
        float fOooO0OO = OooO.OooO0OO(j);
        float fOooO0Oo = OooO.OooO0Oo(j);
        float f = 1 / (((fArr[7] * fOooO0Oo) + (fArr[3] * fOooO0OO)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        return OooOO0.OooO00o(((fArr[4] * fOooO0Oo) + (fArr[0] * fOooO0OO) + fArr[12]) * f, ((fArr[5] * fOooO0Oo) + (fArr[1] * fOooO0OO) + fArr[13]) * f);
    }

    public static final void OooO0OO(float[] fArr, @NotNull OooO0o rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jOooO0O0 = OooO0O0(fArr, OooOO0.OooO00o(rect.f30398OooO00o, rect.f30399OooO0O0));
        long jOooO0O1 = OooO0O0(fArr, OooOO0.OooO00o(rect.f30398OooO00o, rect.f30401OooO0Oo));
        long jOooO0O2 = OooO0O0(fArr, OooOO0.OooO00o(rect.f30400OooO0OO, rect.f30399OooO0O0));
        long jOooO0O3 = OooO0O0(fArr, OooOO0.OooO00o(rect.f30400OooO0OO, rect.f30401OooO0Oo));
        rect.f30398OooO00o = Math.min(Math.min(OooO.OooO0OO(jOooO0O0), OooO.OooO0OO(jOooO0O1)), Math.min(OooO.OooO0OO(jOooO0O2), OooO.OooO0OO(jOooO0O3)));
        rect.f30399OooO0O0 = Math.min(Math.min(OooO.OooO0Oo(jOooO0O0), OooO.OooO0Oo(jOooO0O1)), Math.min(OooO.OooO0Oo(jOooO0O2), OooO.OooO0Oo(jOooO0O3)));
        rect.f30400OooO0OO = Math.max(Math.max(OooO.OooO0OO(jOooO0O0), OooO.OooO0OO(jOooO0O1)), Math.max(OooO.OooO0OO(jOooO0O2), OooO.OooO0OO(jOooO0O3)));
        rect.f30401OooO0Oo = Math.max(Math.max(OooO.OooO0Oo(jOooO0O0), OooO.OooO0Oo(jOooO0O1)), Math.max(OooO.OooO0Oo(jOooO0O2), OooO.OooO0Oo(jOooO0O3)));
    }

    public static final void OooO0Oo(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                i2++;
            }
            i++;
        }
    }

    public static void OooO0o0(float[] fArr, float f, float f2) {
        float f3 = (fArr[8] * ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }
}
