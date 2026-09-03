package p212o00o0oo0;

import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p209o00o0oOO.o00O00o0;
import p210o00o0oOo.oo00o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends o00O00o0 {
    public o000O0() {
        this.f33367OooOOo0 = new oo00o();
    }

    @Override // p209o00o0oOO.o00O00o0
    public final void OooOOOo() {
        super.OooOOOo();
        View contentView = this.f33351OooO00o.getContentView();
        if (contentView != null) {
            contentView.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            contentView.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    @Override // p209o00o0oOO.o00O00o0
    public final void OooOOo0(int i, int i2) {
        View contentView = this.f33351OooO00o.getContentView();
        if (contentView != null) {
            if ((i >= 0 && OooOO0o()) || (i <= 0 && OooOOO())) {
                contentView.setTranslationX(i);
            }
            if ((i2 < 0 || !OooOOOO()) && (i2 > 0 || !OooOO0())) {
                return;
            }
            contentView.setTranslationY(i2);
        }
    }
}
