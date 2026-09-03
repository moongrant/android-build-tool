package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.ZegoPlayStats;

/* JADX INFO: loaded from: classes5.dex */
public interface IZegoLivePlayerCallback2 extends IZegoLivePlayerCallback {
    void onPlayStatsUpdate(ZegoPlayStats zegoPlayStats);

    void onRecvRemoteAudioFirstFrame(String str);

    void onRecvRemoteVideoFirstFrame(String str);

    void onRemoteCameraStatusUpdate(String str, int i, int i2);

    void onRemoteMicStatusUpdate(String str, int i, int i2);

    void onRemoteSpeakerStatusUpdate(String str, int i, int i2);

    void onRenderRemoteVideoFirstFrame(String str);

    void onVideoDecoderError(int i, int i2, String str);
}
