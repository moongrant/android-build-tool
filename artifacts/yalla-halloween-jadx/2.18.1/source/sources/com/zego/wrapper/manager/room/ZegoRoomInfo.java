package com.zego.wrapper.manager.room;

import androidx.annotation.NonNull;
import com.zego.wrapper.manager.entity.ZegoUser;

/* JADX INFO: loaded from: classes3.dex */
public final class ZegoRoomInfo {
    public ZegoUser mOwner;
    public String mRoomID;
    public String mRoomName;

    public ZegoRoomInfo(@NonNull String str, String str2, ZegoUser zegoUser) {
        this.mRoomID = str;
        this.mRoomName = str2 == null ? "" : str2;
        this.mOwner = zegoUser;
    }
}
