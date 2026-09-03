package com.zego.zegoavkit2.networktime;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoNetworkTime {
    public static ZegoNetworkTimeInfo getNetworkTimeInfo() {
        ZegoNetworkTimeInfo zegoNetworkTimeInfo = new ZegoNetworkTimeInfo();
        ZegoNetworkTimeJNI.getNetworkTimeInfo(zegoNetworkTimeInfo);
        return zegoNetworkTimeInfo;
    }

    public static void setNetworkTimeCallback(IZegoNetworkTimeCallback iZegoNetworkTimeCallback) {
        ZegoNetworkTimeJNI.setNetworkTimeCallback(iZegoNetworkTimeCallback);
    }
}
