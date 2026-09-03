package com.zego.zegoavkit2.mediarecorder;

/* JADX INFO: loaded from: classes5.dex */
public enum ZegoMediaRecordType {
    AUDIO(1),
    VIDEO(2),
    BOTH(3);

    private int mType;

    ZegoMediaRecordType(int i) {
        this.mType = i;
    }

    public int value() {
        return this.mType;
    }
}
