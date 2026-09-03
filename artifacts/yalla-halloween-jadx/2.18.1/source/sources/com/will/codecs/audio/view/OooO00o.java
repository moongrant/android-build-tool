package com.will.codecs.audio.view;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecordButton f20260Oooo0o;

    public OooO00o(RecordButton recordButton) {
        this.f20260Oooo0o = recordButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20260Oooo0o.f20267OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f20260Oooo0o.f20268OoooO0O = false;
        while (this.f20260Oooo0o.f20261Oooo == 1) {
            float f = this.f20260Oooo0o.f20267OoooO00;
            RecordButton recordButton = this.f20260Oooo0o;
            if (f >= recordButton.f20272OoooOo0) {
                recordButton.f20261Oooo = 0;
                this.f20260Oooo0o.f20266OoooO0 = 0.0d;
                this.f20260Oooo0o.f20267OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                if (this.f20260Oooo0o.f20262Oooo0o.isShowing()) {
                    this.f20260Oooo0o.f20274OoooOoo.sendEmptyMessage(3);
                }
                try {
                    this.f20260Oooo0o.f20264Oooo0oo.stop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (this.f20260Oooo0o.f20268OoooO0O) {
                    this.f20260Oooo0o.f20264Oooo0oo.OooO0OO();
                } else {
                    RecordButton recordButton2 = this.f20260Oooo0o;
                    RecordButton.OooO0O0 oooO0O0 = recordButton2.f20263Oooo0oO;
                    if (oooO0O0 != null) {
                        recordButton2.f20264Oooo0oo.OooO0O0();
                        int i = this.f20260Oooo0o.f20272OoooOo0;
                        oooO0O0.OooO00o();
                    }
                }
            } else {
                try {
                    Thread.sleep(100L);
                    RecordButton recordButton3 = this.f20260Oooo0o;
                    recordButton3.f20267OoooO00 = (float) (((double) recordButton3.f20267OoooO00) + 0.1d);
                    if (!this.f20260Oooo0o.f20268OoooO0O) {
                        RecordButton recordButton4 = this.f20260Oooo0o;
                        recordButton4.f20266OoooO0 = recordButton4.f20264Oooo0oo.OooO0Oo();
                        this.f20260Oooo0o.f20274OoooOoo.sendEmptyMessage(1);
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
