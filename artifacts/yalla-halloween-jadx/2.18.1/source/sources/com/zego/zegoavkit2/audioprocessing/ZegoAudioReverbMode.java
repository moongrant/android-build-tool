package com.zego.zegoavkit2.audioprocessing;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public enum ZegoAudioReverbMode {
    SOFT_ROOM(0),
    WARM_CLUB(1),
    CONCERT_HALL(2),
    LARGE_AUDITORIUM(3);

    private int mCode;

    ZegoAudioReverbMode(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
