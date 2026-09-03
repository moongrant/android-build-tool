package com.zego.wrapper.manager.room;

import androidx.compose.foundation.layout.OooO0O0;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;

/* JADX INFO: loaded from: classes4.dex */
public final class ZegoUserLiveQuality {
    public int mAudioDelay;
    public double mAudioKbps;
    public int mNetQuality;
    public float mPacketLoss;
    public int mPeerToPeerDelay;
    public int mRtt;
    public double mVideoDecFPS;
    public double mVideoFPS;
    public double mVideoHeight;
    public double mVideoKbps;
    public double mVideoRndFPS;
    public double mVideoWidth;

    public static ZegoUserLiveQuality initWithPlayQuality(ZegoPlayStreamQuality zegoPlayStreamQuality) {
        ZegoUserLiveQuality zegoUserLiveQuality = new ZegoUserLiveQuality();
        zegoUserLiveQuality.mVideoWidth = zegoPlayStreamQuality.width;
        zegoUserLiveQuality.mVideoHeight = zegoPlayStreamQuality.height;
        zegoUserLiveQuality.mVideoFPS = zegoPlayStreamQuality.vnetFps;
        zegoUserLiveQuality.mVideoDecFPS = zegoPlayStreamQuality.vdecFps;
        zegoUserLiveQuality.mVideoRndFPS = zegoPlayStreamQuality.vrndFps;
        zegoUserLiveQuality.mVideoKbps = zegoPlayStreamQuality.vkbps;
        zegoUserLiveQuality.mAudioKbps = zegoPlayStreamQuality.akbps;
        zegoUserLiveQuality.mRtt = zegoPlayStreamQuality.rtt;
        zegoUserLiveQuality.mPacketLoss = (zegoPlayStreamQuality.pktLostRate * 100.0f) / 255.0f;
        zegoUserLiveQuality.mNetQuality = zegoPlayStreamQuality.quality;
        zegoUserLiveQuality.mAudioDelay = zegoPlayStreamQuality.delay;
        zegoUserLiveQuality.mPeerToPeerDelay = zegoPlayStreamQuality.peerToPeerDelay;
        return zegoUserLiveQuality;
    }

    public static ZegoUserLiveQuality initWithPublishQuality(ZegoPublishStreamQuality zegoPublishStreamQuality) {
        ZegoUserLiveQuality zegoUserLiveQuality = new ZegoUserLiveQuality();
        zegoUserLiveQuality.mVideoWidth = zegoPublishStreamQuality.width;
        zegoUserLiveQuality.mVideoHeight = zegoPublishStreamQuality.height;
        zegoUserLiveQuality.mVideoFPS = zegoPublishStreamQuality.vnetFps;
        zegoUserLiveQuality.mVideoKbps = zegoPublishStreamQuality.vkbps;
        zegoUserLiveQuality.mAudioKbps = zegoPublishStreamQuality.akbps;
        zegoUserLiveQuality.mRtt = zegoPublishStreamQuality.rtt;
        zegoUserLiveQuality.mPacketLoss = (zegoPublishStreamQuality.pktLostRate * 100.0f) / 255.0f;
        zegoUserLiveQuality.mNetQuality = zegoPublishStreamQuality.quality;
        zegoUserLiveQuality.mAudioDelay = 0;
        return zegoUserLiveQuality;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZegoUserLiveQuality{mVideoFPS=");
        sb.append(this.mVideoFPS);
        sb.append(", mVideoKbps=");
        sb.append(this.mVideoKbps);
        sb.append(", mAudioKbps=");
        sb.append(this.mAudioKbps);
        sb.append(", mRtt=");
        sb.append(this.mRtt);
        sb.append(", mPacketLoss=");
        sb.append(this.mPacketLoss);
        sb.append(", mNetQuality=");
        sb.append(this.mNetQuality);
        sb.append(", mAudioDelay=");
        return OooO0O0.OooO00o(sb, this.mAudioDelay, '}');
    }
}
