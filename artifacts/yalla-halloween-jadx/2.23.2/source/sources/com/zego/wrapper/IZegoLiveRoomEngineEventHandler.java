package com.zego.wrapper;

import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IZegoLiveRoomEngineEventHandler {

    public static class ZegoLiveRoomAudioVolumeInfo {
        public int uid;
        public int volume;

        public String toString() {
            StringBuilder sb = new StringBuilder("ZegoLiveRoomAudioVolumeInfo{uid=");
            sb.append(this.uid);
            sb.append(", volume=");
            return OooO0O0.OooO00o(sb, this.volume, '}');
        }
    }

    public static class ZegoLiveRoomLocalVideoStats {
        public int sentBitrate;
        public int sentFrameRate;

        public String toString() {
            StringBuilder sb = new StringBuilder("ZegoLiveRoomLocalVideoStats{sentBitrate=");
            sb.append(this.sentBitrate);
            sb.append(", sentFrameRate=");
            return OooO0O0.OooO00o(sb, this.sentFrameRate, '}');
        }
    }

    public static class ZegoLiveRoomRemoteVideoStats {
        public int decoderOutputFrameRate;
        public int delay;
        public int height;
        public int receivedBitrate;
        public int rendererOutputFrameRate;
        public int uid;
        public int width;

        public String toString() {
            StringBuilder sb = new StringBuilder("ZegoLiveRoomRemoteVideoStats{uid=");
            sb.append(this.uid);
            sb.append(", delay=");
            sb.append(this.delay);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", receivedBitrate=");
            sb.append(this.receivedBitrate);
            sb.append(", decoderOutputFrameRate=");
            sb.append(this.decoderOutputFrameRate);
            sb.append(", rendererOutputFrameRate=");
            return OooO0O0.OooO00o(sb, this.rendererOutputFrameRate, '}');
        }
    }

    public void onApiCallExecuted(int i, String str, String str2) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioMixingStateChanged(int i, int i2) {
    }

    public void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3) {
    }

    public void onAudioVolumeIndication(ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr) {
    }

    public void onClientRoleChanged(int i, int i2) {
    }

    @Deprecated
    public void onConnectionBanned() {
    }

    @Deprecated
    public void onConnectionInterrupted() {
    }

    @Deprecated
    public void onConnectionLost() {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(int i) {
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
    }

    public void onFirstRemoteAudioDecoded(int i, int i2) {
    }

    public void onFirstRemoteAudioFrame(int i, int i2) {
    }

    public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
    }

    public void onFirstRemoteVideoFrame(int i, int i2) {
    }

    public void onJoinChannelSuccess(String str, long j, int i) {
    }

    public void onLeaveChannel() {
    }

    public void onLocalVideoStateChanged(int i, int i2) {
    }

    public void onLocalVideoStats(ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats) {
    }

    public void onNetworkQuality(int i, int i2) {
    }

    public void onReJoinChannel(String str, int i, int i2) {
    }

    public void onRemoteVideoStateChanged(int i, int i2) {
    }

    public void onRemoteVideoStats(ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats) {
    }

    public void onStreamPublished(String str, int i) {
    }

    public void onStreamUnpublished(String str, int i) {
    }

    public void onUserJoined(int i, int i2) {
    }

    public void onUserMuteAudio(int i, boolean z) {
    }

    public void onUserMuteVideo(int i, boolean z) {
    }

    public void onUserOffline(int i) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3) {
    }

    public void onWarning(int i) {
    }
}
