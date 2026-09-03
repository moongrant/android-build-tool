package com.zego.zegoavkit2.peertopeerlatencyprobe;

/* JADX INFO: loaded from: classes3.dex */
final class ZegoPeerToPeerLatencyProbeJNI {
    private static volatile IZegoPeerToPeerLatencyProbeCallback sCallback;

    public static native void enablePeerToPeerLatencyProbe(boolean z, int i);

    public static void onPeerToPeerLatencyProbeResult(String str, int i) {
        IZegoPeerToPeerLatencyProbeCallback iZegoPeerToPeerLatencyProbeCallback = sCallback;
        if (iZegoPeerToPeerLatencyProbeCallback != null) {
            iZegoPeerToPeerLatencyProbeCallback.onPeerToPeerLatencyProbeResult(str, i);
        }
    }

    public static void setCallback(IZegoPeerToPeerLatencyProbeCallback iZegoPeerToPeerLatencyProbeCallback) {
        sCallback = iZegoPeerToPeerLatencyProbeCallback;
        setPeerToPeerLatencyProbeCallback(iZegoPeerToPeerLatencyProbeCallback != null);
    }

    private static native void setPeerToPeerLatencyProbeCallback(boolean z);

    public static native void setPeerToPeerLatencyProbeInterval(int i, int i2);
}
