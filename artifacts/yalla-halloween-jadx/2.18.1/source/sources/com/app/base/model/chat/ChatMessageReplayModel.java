package com.app.base.model.chat;

import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.model.ChatMessageOld;

/* JADX INFO: loaded from: classes.dex */
public class ChatMessageReplayModel {
    public ChatMessageOld emotionDBModel;
    public StatusEnum$MsgSendStatus messageStatus;
    public String mid;

    public ChatMessageReplayModel(String str) {
        this.mid = str;
    }
}
