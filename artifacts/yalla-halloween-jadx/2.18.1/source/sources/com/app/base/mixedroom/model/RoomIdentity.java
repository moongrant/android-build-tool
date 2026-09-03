package com.app.base.mixedroom.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/app/base/mixedroom/model/RoomIdentity;", "", "()V", "ROOM_ADMIN", "", "ROOM_GUEST", "ROOM_HOST", "ROOM_MEMBER", "isJoinedRoom", "", "identityRole", "isRoomAdmin", "isRoomGuest", "isRoomHost", "isRoomMember", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomIdentity {
    public static final int $stable = 0;

    @NotNull
    public static final RoomIdentity INSTANCE = new RoomIdentity();
    public static final int ROOM_ADMIN = 2;
    public static final int ROOM_GUEST = 0;
    public static final int ROOM_HOST = 1;
    public static final int ROOM_MEMBER = 3;

    private RoomIdentity() {
    }

    public final boolean isJoinedRoom(int identityRole) {
        return identityRole != 0;
    }

    public final boolean isRoomAdmin(int identityRole) {
        return identityRole == 2;
    }

    public final boolean isRoomGuest(int identityRole) {
        return identityRole == 0;
    }

    public final boolean isRoomHost(int identityRole) {
        return identityRole == 1;
    }

    public final boolean isRoomMember(int identityRole) {
        return identityRole == 3;
    }
}
