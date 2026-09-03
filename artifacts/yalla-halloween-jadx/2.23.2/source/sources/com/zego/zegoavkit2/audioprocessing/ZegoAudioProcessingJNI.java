package com.zego.zegoavkit2.audioprocessing;

/* JADX INFO: loaded from: classes4.dex */
final class ZegoAudioProcessingJNI {
    public static native boolean enableReverb(boolean z, int i);

    public static native boolean enableVirtualStereo(boolean z, int i);

    public static native boolean setAdvancedReverbParam(boolean z, ZegoAudioAdvancedReverbParam zegoAudioAdvancedReverbParam);

    public static native boolean setAudioEqualizerGain(int i, float f);

    public static native boolean setElectronicEffects(boolean z, int i, int i2);

    public static native boolean setReverbEchoParam(ZegoReverbEchoParam zegoReverbEchoParam);

    public static native boolean setReverbParam(float f, float f2);

    public static native boolean setReverbParam2(ZegoAudioReverbParam zegoAudioReverbParam);

    public static native boolean setReverbPreset(int i);

    public static native boolean setVoiceChangerParam(float f);

    public static native boolean setVoicePreset(int i);
}
