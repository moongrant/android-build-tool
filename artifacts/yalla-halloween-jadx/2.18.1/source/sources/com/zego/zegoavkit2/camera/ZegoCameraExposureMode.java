package com.zego.zegoavkit2.camera;

/* JADX INFO: loaded from: classes3.dex */
public enum ZegoCameraExposureMode {
    AUTO(0),
    CUSTOM(1);

    private int mCode;

    ZegoCameraExposureMode(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
