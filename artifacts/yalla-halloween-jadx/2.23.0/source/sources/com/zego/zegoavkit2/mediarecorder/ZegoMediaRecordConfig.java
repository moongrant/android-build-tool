package com.zego.zegoavkit2.mediarecorder;

import android.net.Uri;
import com.youth.banner.config.BannerConfig;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoMediaRecordConfig {
    public ZegoMediaRecordChannelIndex channelIndex = ZegoMediaRecordChannelIndex.MAIN;
    public ZegoMediaRecordType recordType = ZegoMediaRecordType.BOTH;
    public Uri storageUri = null;
    public boolean enableStatusCallback = false;
    public int interval = BannerConfig.LOOP_TIME;
    public ZegoMediaRecordFormat recordFormat = ZegoMediaRecordFormat.FLV;
    public boolean isFragment = false;
    public String config = null;
}
