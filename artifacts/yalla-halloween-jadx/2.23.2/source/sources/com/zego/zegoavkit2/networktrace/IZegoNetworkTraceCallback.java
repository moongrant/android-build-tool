package com.zego.zegoavkit2.networktrace;

/* JADX INFO: loaded from: classes4.dex */
public interface IZegoNetworkTraceCallback {
    void onNetworkTrace(long j, ZegoHttpTraceResult zegoHttpTraceResult, ZegoTcpTraceResult zegoTcpTraceResult, ZegoUdpTraceResult zegoUdpTraceResult, ZegoTracerouteResult zegoTracerouteResult);
}
