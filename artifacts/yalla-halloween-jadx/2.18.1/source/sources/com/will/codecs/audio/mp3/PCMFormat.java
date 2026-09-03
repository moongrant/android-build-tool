package com.will.codecs.audio.mp3;

/* JADX INFO: loaded from: classes2.dex */
public enum PCMFormat {
    PCM_8BIT(1, 3),
    PCM_16BIT(2, 2);

    private int audioFormat;
    private int bytesPerFrame;

    PCMFormat(int i, int i2) {
        this.bytesPerFrame = i;
        this.audioFormat = i2;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PCMFormat[] valuesCustom() {
        PCMFormat[] pCMFormatArrValuesCustom = values();
        int length = pCMFormatArrValuesCustom.length;
        PCMFormat[] pCMFormatArr = new PCMFormat[length];
        System.arraycopy(pCMFormatArrValuesCustom, 0, pCMFormatArr, 0, length);
        return pCMFormatArr;
    }

    public final int OooO00o() {
        return this.audioFormat;
    }

    public final int OooO0O0() {
        return this.bytesPerFrame;
    }
}
