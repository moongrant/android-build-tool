package com.huawei.multimedia.audiokit.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public enum HwAudioKaraokeFeatureKit$ParameName {
    CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
    CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
    CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");

    private String mParameName;

    HwAudioKaraokeFeatureKit$ParameName(String str) {
        this.mParameName = str;
    }
}
