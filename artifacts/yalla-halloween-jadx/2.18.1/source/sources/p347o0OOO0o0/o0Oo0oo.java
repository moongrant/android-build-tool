package p347o0OOO0o0;

import androidx.annotation.NonNull;
import com.google.android.material.shape.OooO0OO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends o0OOO0o {
    @Override // p347o0OOO0o0.o0OOO0o
    public final void OooO00o(@NonNull OooO0OO oooO0OO, float f, float f2) {
        oooO0OO.OooO0oO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        oooO0OO.OooO0o0((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) * d * d2));
    }
}
