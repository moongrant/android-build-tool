package com.zego.zegoavkit2.mediaside;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ZegoMediaSideInfoJNI {
    private static volatile IZegoMediaSideCallback sCallback;

    public static void onMediaSideCallback(String str, ByteBuffer byteBuffer, int i) {
        IZegoMediaSideCallback iZegoMediaSideCallback = sCallback;
        if (iZegoMediaSideCallback != null) {
            iZegoMediaSideCallback.onRecvMediaSideInfo(str, byteBuffer, i);
        }
    }

    public static native void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z, int i2);

    public static void setCallback(IZegoMediaSideCallback iZegoMediaSideCallback) {
        sCallback = iZegoMediaSideCallback;
        setMediaSideCallback(iZegoMediaSideCallback != null);
    }

    private static native void setMediaSideCallback(boolean z);

    public static native void setMediaSideFlags(boolean z, boolean z2, int i, int i2, int i3);
}
