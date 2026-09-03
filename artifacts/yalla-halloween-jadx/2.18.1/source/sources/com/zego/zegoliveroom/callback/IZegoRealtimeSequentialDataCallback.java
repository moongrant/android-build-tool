package com.zego.zegoliveroom.callback;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface IZegoRealtimeSequentialDataCallback {
    void onRecvRealtimeSequentialData(ByteBuffer byteBuffer, String str);

    void onSendRealtimeSequentialData(int i, int i2);
}
