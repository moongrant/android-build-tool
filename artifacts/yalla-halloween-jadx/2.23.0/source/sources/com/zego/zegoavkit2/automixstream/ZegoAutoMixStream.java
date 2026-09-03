package com.zego.zegoavkit2.automixstream;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoAutoMixStream {
    public void setCallback(IZegoAutoMixStreamCallback iZegoAutoMixStreamCallback) {
        ZegoAutoMixStreamJNI.setCallback(iZegoAutoMixStreamCallback);
    }

    public void setSoundLevelCallback(IZegoSoundLevelInAutoMixStreamCallback iZegoSoundLevelInAutoMixStreamCallback) {
        ZegoAutoMixStreamJNI.setSoundLevelCallback(iZegoSoundLevelInAutoMixStreamCallback);
    }

    public int startAutoMixStream(String str, String str2, ZegoAutoMixStreamConfig zegoAutoMixStreamConfig) {
        return ZegoAutoMixStreamJNI.startAutoMixStream(str, str2, zegoAutoMixStreamConfig);
    }

    public int stopAutoMixStream(String str, String str2) {
        return ZegoAutoMixStreamJNI.stopAutoMixStream(str, str2);
    }
}
