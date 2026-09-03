package com.zego.wrapper.manager.room;

import OooO00o.OooO00o;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoUserLiveQuality{mVideoFPS=");
        sbOooO0o0.append(this.mVideoFPS);
        sbOooO0o0.append(", mVideoKbps=");
        sbOooO0o0.append(this.mVideoKbps);
        sbOooO0o0.append(", mAudioKbps=");
        sbOooO0o0.append(this.mAudioKbps);
        sbOooO0o0.append(", mRtt=");
        sbOooO0o0.append(this.mRtt);
        sbOooO0o0.append(", mPacketLoss=");
        sbOooO0o0.append(this.mPacketLoss);
        sbOooO0o0.append(", mNetQuality=");
        sbOooO0o0.append(this.mNetQuality);
        sbOooO0o0.append(", mAudioDelay=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.mAudioDelay, '}');
    }
}
