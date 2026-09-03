package com.zego.zegoavkit2.audioprocessing;

/* JADX INFO: loaded from: classes4.dex */
public enum ZegoElectronicEffectsMode {
    MAJOR(0),
    MINOR(1),
    HARMONIC_MINOR(2);

    private int mCode;

    ZegoElectronicEffectsMode(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
