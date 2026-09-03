package o0000OO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public interface o0O0O00 {

    public static final class OooO00o {
        public static void OooO00o(o0O0O00 o0o0o00, OooOOO.OooO00o oooO00o, float f, float f2, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0;
            }
            ((OooO0O0) o0o0o00).OooO00o(oooO00o, f, (i & 4) != 0 ? 0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }
}
