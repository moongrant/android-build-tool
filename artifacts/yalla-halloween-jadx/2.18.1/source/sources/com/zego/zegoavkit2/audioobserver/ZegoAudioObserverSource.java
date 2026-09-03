package com.zego.zegoavkit2.audioobserver;

/* JADX INFO: loaded from: classes3.dex */
public enum ZegoAudioObserverSource {
    CAPTURE(1),
    PLAYBACK(2),
    MIX(4);

    private int mSource;

    ZegoAudioObserverSource(int i) {
        this.mSource = i;
    }

    public int value() {
        return this.mSource;
    }
}
