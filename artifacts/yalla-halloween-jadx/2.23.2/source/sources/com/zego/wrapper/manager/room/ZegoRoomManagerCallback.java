package com.zego.wrapper.manager.room;

import com.zego.wrapper.manager.entity.ResultCode;
import com.zego.wrapper.manager.entity.ZegoUser;

/* JADX INFO: loaded from: classes4.dex */
public interface ZegoRoomManagerCallback {
    void onAutoReconnectStop(int i);

    void onLiveUserJoin(ZegoUser zegoUser);

    void onLiveUserLeave(ZegoUser zegoUser);

    void onLoginEventOccur(int i, int i2, ResultCode resultCode);

    void onRecvCustomCommand(ZegoUser zegoUser, String str);
}
