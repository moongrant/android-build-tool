package p121o00O0Ooo;

import com.airbnb.lottie.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {
    public static final float OooO00o(OooOO0O oooOO0O, o00000 o00000Var, float f) {
        if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || oooOO0O != null) {
            if (oooOO0O == null) {
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return o00000Var == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : o00000Var.OooO0O0();
            }
            if (o00000Var != null) {
                return o00000Var.OooO00o();
            }
        }
        return 1.0f;
    }
}
