package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/room/RoomChatModel;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "Lcom/yalla/yalla/model/chat/ChatModel;", "getData", "()Lcom/yalla/yalla/model/chat/ChatModel;", "setData", "(Lcom/yalla/yalla/model/chat/ChatModel;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomChatModel {
    public static final int $stable = 8;
    private int code;

    @Nullable
    private ChatModel data;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final ChatModel getData() {
        return this.data;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable ChatModel chatModel) {
        this.data = chatModel;
    }
}
