package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/InOutRoomModel;", "", "()V", "kind", "", "getKind", "()I", "setKind", "(I)V", "newUser", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewUser", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewUser", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "online", "getOnline", "setOnline", "source", "getSource", "setSource", "user", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InOutRoomModel {
    public static final int kind_InRoom = 0;
    public static final int kind_outRoom = 1;
    public static final int source_ConveneInRoom = 1;
    public static final int source_SelfInRoom = 0;
    private int kind;

    @Nullable
    private transient RoomUserInfoModel newUser;
    private int online;
    private int source;

    @Nullable
    private RoomUserInfoDTO user;
    public static final int $stable = 8;

    public final int getKind() {
        return this.kind;
    }

    @Nullable
    public final RoomUserInfoModel getNewUser() {
        if (this.newUser == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.user;
            this.newUser = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newUser;
    }

    public final int getOnline() {
        return this.online;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setKind(int i) {
        this.kind = i;
    }

    public final void setNewUser(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newUser = roomUserInfoModel;
    }

    public final void setOnline(int i) {
        this.online = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }
}
