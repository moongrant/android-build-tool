package com.zego.zegoavkit2.playaudiorecorder;

import com.zego.zegoavkit2.entities.ZegoAudioFrame;

/* JADX INFO: loaded from: classes2.dex */
public class ZegoPlayAudioRecorderJNI {
    private static volatile IZegoPlayAudioRecorderCallback sCallback;

    public static native void enablePlayAudioRecorder(boolean z, int i, int i2);

    public static void onPlayAudioRecorder(String str, ZegoAudioFrame zegoAudioFrame) {
        IZegoPlayAudioRecorderCallback iZegoPlayAudioRecorderCallback = sCallback;
        if (iZegoPlayAudioRecorderCallback != null) {
            iZegoPlayAudioRecorderCallback.onPlayAudioRecorder(str, zegoAudioFrame);
        }
    }

    public static void setPlayAudioRecorderCallback(IZegoPlayAudioRecorderCallback iZegoPlayAudioRecorderCallback) {
        sCallback = iZegoPlayAudioRecorderCallback;
    }
}
