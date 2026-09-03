package o0000OO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O {

    public static final class OooO00o {
        public static void OooO00o(o00000O o00000o, OooOOO.OooO0O0 oooO0O0, float f, float f2, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0;
            }
            ((OooO0OO) o00000o).OooO00o(oooO0O0, f, (i & 4) != 0 ? 0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }
}
