package com.zego.zegoavkit2.audioaux;

import com.zego.zegoavkit2.entities.AuxDataEx;

/* JADX INFO: loaded from: classes5.dex */
final class ZegoAudioAuxJNI {
    private static volatile IJniZegoAuxCallback sJNIzegoAuxCallback;

    public interface IJniZegoAuxCallback {
        AuxDataEx onAuxCallback(int i);
    }

    public static native boolean enableAux(boolean z);

    public static native boolean muteAux(boolean z);

    public static AuxDataEx onAuxCallback(int i) {
        IJniZegoAuxCallback iJniZegoAuxCallback = sJNIzegoAuxCallback;
        if (iJniZegoAuxCallback != null) {
            return iJniZegoAuxCallback.onAuxCallback(i);
        }
        return null;
    }

    public static native void setAuxPlayVolume(int i);

    public static native void setAuxPublishVolume(int i);

    public static native void setAuxVolume(int i);

    public static void setCallback(IJniZegoAuxCallback iJniZegoAuxCallback) {
        sJNIzegoAuxCallback = iJniZegoAuxCallback;
    }
}
