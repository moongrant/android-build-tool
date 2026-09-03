package com.zego.zegoavkit2.networktrace;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoNetworktrace {
    private static ZegoNetworktrace sInstance;
    private ZegoNetworktraceJNI mJniInstance = new ZegoNetworktraceJNI();

    private ZegoNetworktrace() {
    }

    public static ZegoNetworktrace getInstance() {
        if (sInstance == null) {
            synchronized (ZegoNetworktrace.class) {
                if (sInstance == null) {
                    sInstance = new ZegoNetworktrace();
                }
            }
        }
        return sInstance;
    }

    public void setNetworkTraceCallback(IZegoNetworkTraceCallback iZegoNetworkTraceCallback) {
        ZegoNetworktraceJNI.setNetworkTraceCallback(iZegoNetworkTraceCallback);
    }

    public void startNetworkTrace(ZegoNetworkTraceConfig zegoNetworkTraceConfig) {
        ZegoNetworktraceJNI.startNetworkTrace(zegoNetworkTraceConfig);
    }

    public void stopNetworkTrace() {
        ZegoNetworktraceJNI.stopNetworkTrace();
    }
}
