package com.zego.zegoavkit2.audiodevice;

import com.zego.zegoavkit2.entities.ZegoAudioFrame;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoExternalAudioDevice {

    public static final class AudioSourceType {
        public static final int ExternalCapture = 1;
        public static final int None = -1;
        public static final int Player = 2;
        public static final int SameAsMainPublishChannel = 0;
    }

    @Deprecated
    public static final class AuxPublishChannelAudioSrcType {
        public static final int ExternalCapture = 1;
        public static final int None = -1;
        public static final int Player = 2;
        public static final int SameAsMainPublishChannel = 0;
    }

    @Deprecated
    public static native void enableExternalAudioDevice(boolean z);

    public static native boolean onPlaybackAudioFrame(ZegoAudioFrame zegoAudioFrame);

    public static native int onRecordAudioFrame(int i, ZegoAudioFrame zegoAudioFrame);

    public static boolean onRecordAudioFrame(ZegoAudioFrame zegoAudioFrame) {
        return onRecordAudioFrame(0, zegoAudioFrame) == 0;
    }

    public static native int setAudioSource(int i, int i2);

    @Deprecated
    public static native int setAudioSrcForAuxiliaryPublishChannel(int i);

    public static native int startCapture(int i);

    public static boolean startCapture() {
        return startCapture(0) == 0;
    }

    public static native boolean startRender();

    public static native int stopCapture(int i);

    public static boolean stopCapture() {
        return stopCapture(0) == 0;
    }

    public static native boolean stopRender();
}
