package p244o00oo0O;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements oo0o0Oo {
    @Override // p244o00oo0O.oo0o0Oo
    public final Animator[] OooO00o(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "translationX", view.getRootView().getWidth(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)};
    }
}
