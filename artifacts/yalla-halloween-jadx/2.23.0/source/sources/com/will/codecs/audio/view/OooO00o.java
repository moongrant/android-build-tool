package com.will.codecs.audio.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecordButton f22475OooO0Oo;

    public OooO00o(RecordButton recordButton) {
        this.f22475OooO0Oo = recordButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22475OooO0Oo.f22480OooO0oO = 0.0f;
        this.f22475OooO0Oo.f22476OooO = false;
        while (this.f22475OooO0Oo.f22478OooO0o == 1) {
            float f = this.f22475OooO0Oo.f22480OooO0oO;
            RecordButton recordButton = this.f22475OooO0Oo;
            if (f >= recordButton.f22487OooOOOO) {
                recordButton.f22478OooO0o = 0;
                this.f22475OooO0Oo.f22481OooO0oo = 0.0d;
                this.f22475OooO0Oo.f22480OooO0oO = 0.0f;
                if (this.f22475OooO0Oo.f22477OooO0Oo.isShowing()) {
                    this.f22475OooO0Oo.f22489OooOOo0.sendEmptyMessage(3);
                }
                try {
                    this.f22475OooO0Oo.f22479OooO0o0.stop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (this.f22475OooO0Oo.f22476OooO) {
                    this.f22475OooO0Oo.f22479OooO0o0.OooO0O0();
                } else {
                    this.f22475OooO0Oo.getClass();
                }
            } else {
                try {
                    Thread.sleep(100L);
                    RecordButton recordButton2 = this.f22475OooO0Oo;
                    recordButton2.f22480OooO0oO = (float) (((double) recordButton2.f22480OooO0oO) + 0.1d);
                    if (!this.f22475OooO0Oo.f22476OooO) {
                        RecordButton recordButton3 = this.f22475OooO0Oo;
                        recordButton3.f22481OooO0oo = recordButton3.f22479OooO0o0.OooO0OO();
                        this.f22475OooO0Oo.f22489OooOOo0.sendEmptyMessage(1);
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
