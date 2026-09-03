package com.zego.zegoavkit2.networkprobe;

/* JADX INFO: loaded from: classes4.dex */
public interface IZegoNetWorkProbeCallback {
    void onConnectResult(int i, ZegoNetConnectInfo zegoNetConnectInfo, int i2);

    void onTestStop(int i, int i2);

    void onUpdateSpeed(ZegoNetQualityInfo zegoNetQualityInfo, int i);
}
