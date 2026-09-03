package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.BaseRoomModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/model/room/GetMicModel;", "Lcom/yalla/yalla/model/BaseRoomModel;", "()V", "expire", "", "getExpire", "()I", "setExpire", "(I)V", "micorder", "getMicorder", "setMicorder", "newUser", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewUser", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewUser", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "scene", "getScene", "setScene", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "user", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetMicModel extends BaseRoomModel {
    public static final int $stable = 8;
    private int expire;
    private int micorder;

    @Nullable
    private transient RoomUserInfoModel newUser;
    private int scene;

    @Nullable
    private String url;

    @Nullable
    private RoomUserInfoDTO user;

    public final int getExpire() {
        return this.expire;
    }

    public final int getMicorder() {
        return this.micorder;
    }

    @Nullable
    public final RoomUserInfoModel getNewUser() {
        if (this.newUser == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.user;
            this.newUser = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newUser;
    }

    public final int getScene() {
        return this.scene;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setExpire(int i) {
        this.expire = i;
    }

    public final void setMicorder(int i) {
        this.micorder = i;
    }

    public final void setNewUser(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newUser = roomUserInfoModel;
    }

    public final void setScene(int i) {
        this.scene = i;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
