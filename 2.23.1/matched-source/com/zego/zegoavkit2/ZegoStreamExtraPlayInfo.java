package com.zego.zegoavkit2;

import com.zego.zegoavkit2.entities.ZegoCDNPlayUrlInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class ZegoStreamExtraPlayInfo {
    public ZegoCDNPlayUrlInfo[] advancedFlvUrls;
    public ZegoCDNPlayUrlInfo[] advancedRtmpUrls;
    public byte[] decryptKey;
    public String[] flvUrls;
    public String params;
    public String[] rtmpUrls;
    public boolean shouldSwitchServer;
    public int mode = 0;
    public int videoCodecId = 100;

    public static final class ZegoStreamResourceMode {
        public static final int CdnOnly = 1;
        public static final int Default = 0;
        public static final int L3Only = 2;
        public static final int RtcOnly = 3;
    }
}
