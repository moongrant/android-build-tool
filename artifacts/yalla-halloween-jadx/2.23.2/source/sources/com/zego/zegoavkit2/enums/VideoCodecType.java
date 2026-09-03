package com.zego.zegoavkit2.enums;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoCodecType {
    CODEC_TYPE_AVC_AVCC(0),
    CODEC_TYPE_AVC_ANNEXB(1);

    private int mValue;

    VideoCodecType(int i) {
        this.mValue = i;
    }

    public static VideoCodecType valueOf(int i) {
        if (i == 0) {
            return CODEC_TYPE_AVC_AVCC;
        }
        if (i != 1) {
            return null;
        }
        return CODEC_TYPE_AVC_ANNEXB;
    }

    public int value() {
        return this.mValue;
    }
}
