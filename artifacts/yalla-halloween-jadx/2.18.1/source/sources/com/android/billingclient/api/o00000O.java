package com.android.billingclient.api;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p166o00OoOoo.o0O00O0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o0O00O0o f11263OooO00o;

    public static float OooO00o(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public static o0O00O0o OooO0O0() {
        if (f11263OooO00o == null) {
            f11263OooO00o = new o0O00O0o();
        }
        return f11263OooO00o;
    }
}
