package p548o0oO0O00;

import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f44599OooO00o;

        static {
            int[] iArr = new int[ScaleType.values().length];
            f44599OooO00o = iArr;
            try {
                iArr[ScaleType.ScaleAspectFitCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44599OooO00o[ScaleType.ScaleAspectFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44599OooO00o[ScaleType.TopFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44599OooO00o[ScaleType.BottomFill.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44599OooO00o[ScaleType.LeftFill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44599OooO00o[ScaleType.RightFill.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44599OooO00o[ScaleType.TopFit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44599OooO00o[ScaleType.BottomFit.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44599OooO00o[ScaleType.LeftFit.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44599OooO00o[ScaleType.RightFit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static float[] OooO00o(float f, float f2, float f3, float f4) {
        float f5 = (f / 2.0f) + 0.5f;
        float f6 = f4 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f7 = 1.0f - (f3 / 2.0f);
        float f8 = 1.0f - f2;
        return new float[]{-1.0f, -1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, f6, 1.0f, -1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f7, f6, -1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, f8, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f7, f8};
    }

    public static float[] OooO0O0(float f, float f2, float f3, float f4) {
        float f5 = (f * 2.0f) - 1.0f;
        float f6 = (f4 * 2.0f) - 1.0f;
        float f7 = 1.0f - (f3 * 2.0f);
        float f8 = 1.0f - (f2 * 2.0f);
        return new float[]{f5, f6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f7, f6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5, f8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f, f7, f8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f};
    }
}
