package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/RoomBroadcastRoomModel;", "", "()V", "id", "", "getId", "()J", "setId", "(J)V", "roomIp", "", "getRoomIp", "()Ljava/lang/String;", "setRoomIp", "(Ljava/lang/String;)V", "websocketaddr", "getWebsocketaddr", "setWebsocketaddr", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomBroadcastRoomModel {
    public static final int $stable = 8;
    private long id;

    @Nullable
    private String roomIp;

    @Nullable
    private String websocketaddr;

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getRoomIp() {
        return this.roomIp;
    }

    @Nullable
    public final String getWebsocketaddr() {
        return this.websocketaddr;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setRoomIp(@Nullable String str) {
        this.roomIp = str;
    }

    public final void setWebsocketaddr(@Nullable String str) {
        this.websocketaddr = str;
    }
}
