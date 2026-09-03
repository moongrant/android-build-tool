package com.zego.wrapper.manager.room;

import com.zego.wrapper.manager.entity.ResultCode;
import com.zego.wrapper.manager.entity.ZegoUser;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface ZegoRoomManagerLiveStatusCallback {
    void onExtraInfoUpdate(ZegoUser zegoUser, String str);

    void onGetSoundLevels(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr);

    void onLiveQualityUpdate(ZegoUser zegoUser, ZegoUserLiveQuality zegoUserLiveQuality);

    void onLiveStatusChange(ZegoUser zegoUser, int i, ResultCode resultCode);

    void onRemoteCameraMute(boolean z, ZegoUser zegoUser);

    void onRemoteMicMute(boolean z, ZegoUser zegoUser);

    void onRenderRemoteUserVideoFrame(ZegoUser zegoUser);

    void onUserGetFirstAudioFrame(ZegoUser zegoUser);

    void onUserGetFirstFrame(ZegoUser zegoUser, int i, int i2);

    void onUserVideoFrameChange(ZegoUser zegoUser, int i, int i2);
}
