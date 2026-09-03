package com.zego.zegoavkit2.audioobserver;

/* JADX INFO: loaded from: classes3.dex */
public interface IZegoAudioObserverCallback {
    void onAudioObserverError(int i);

    void onCapturedAudioData(byte[] bArr, int i, int i2, int i3);

    void onMixAudioData(byte[] bArr, int i, int i2, int i3);

    void onPlaybackAudioData(byte[] bArr, int i, int i2, int i3);
}
