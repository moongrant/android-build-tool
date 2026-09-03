package com.zego.zegoavkit2.audioencryptdecrypt;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class ZegoAudioEncryptDecryptJNI {
    private static volatile IZegoAudioEncryptDecryptCallback sCallback;

    public static native void enableAudioEncryptDecrypt(boolean z);

    public static int onAudioEncryptDecrypt(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback = sCallback;
        if (iZegoAudioEncryptDecryptCallback != null) {
            return iZegoAudioEncryptDecryptCallback.onAudioEncryptDecrypt(str, byteBuffer, i, byteBuffer2, i2);
        }
        return 0;
    }

    public static void setZegoAudioEncryptDecryptCallback(IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback) {
        sCallback = iZegoAudioEncryptDecryptCallback;
    }
}
