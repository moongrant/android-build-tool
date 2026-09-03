package com.zego.zegoavkit2.mediarecorder;

/* JADX INFO: loaded from: classes3.dex */
public enum ZegoMediaRecordChannelIndex {
    MAIN(0),
    AUX(1),
    THIRD(2),
    FOURTH(3);

    private int mType;

    ZegoMediaRecordChannelIndex(int i) {
        this.mType = i;
    }

    public int value() {
        return this.mType;
    }
}
