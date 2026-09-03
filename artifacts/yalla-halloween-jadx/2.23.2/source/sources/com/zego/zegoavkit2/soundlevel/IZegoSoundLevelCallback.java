package com.zego.zegoavkit2.soundlevel;

/* JADX INFO: loaded from: classes2.dex */
public interface IZegoSoundLevelCallback {
    void onCaptureSoundLevelUpdate(ZegoSoundLevelInfo zegoSoundLevelInfo);

    void onSoundLevelUpdate(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr);
}
