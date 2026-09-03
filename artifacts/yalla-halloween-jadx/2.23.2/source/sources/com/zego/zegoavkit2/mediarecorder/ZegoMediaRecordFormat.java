package com.zego.zegoavkit2.mediarecorder;

/* JADX INFO: loaded from: classes3.dex */
public enum ZegoMediaRecordFormat {
    FLV(1),
    MP4(2),
    AAC(4);

    private int mType;

    ZegoMediaRecordFormat(int i) {
        this.mType = i;
    }

    public int value() {
        return this.mType;
    }
}
