package com.zego.zegoavkit2.camera;

/* JADX INFO: loaded from: classes5.dex */
public enum ZegoCameraFocusMode {
    AUTO(0),
    INFINITY(1),
    MACRO(2),
    FIXED(3),
    EDOF(4),
    CONTINUOUS_VIDEO(5);

    private int mCode;

    ZegoCameraFocusMode(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
