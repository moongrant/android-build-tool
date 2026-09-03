package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/app/base/model/InOutRoomModel;", "", "()V", "kind", "", "getKind", "()I", "setKind", "(I)V", "online", "getOnline", "setOnline", "source", "getSource", "setSource", "user", "Lcom/yalla/yalla/model/RoomUserInfoModel;", "getUser", "()Lcom/yalla/yalla/model/RoomUserInfoModel;", "setUser", "(Lcom/yalla/yalla/model/RoomUserInfoModel;)V", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InOutRoomModel {
    public static final int kind_InRoom = 0;
    public static final int kind_outRoom = 1;
    public static final int source_ConveneInRoom = 1;
    public static final int source_SelfInRoom = 0;
    private int kind;
    private int online;
    private int source;

    @Nullable
    private RoomUserInfoModel user;
    public static final int $stable = 8;

    public final int getKind() {
        return this.kind;
    }

    public final int getOnline() {
        return this.online;
    }

    public final int getSource() {
        return this.source;
    }

    @Nullable
    public final RoomUserInfoModel getUser() {
        return this.user;
    }

    public final void setKind(int i) {
        this.kind = i;
    }

    public final void setOnline(int i) {
        this.online = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setUser(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.user = roomUserInfoModel;
    }
}
