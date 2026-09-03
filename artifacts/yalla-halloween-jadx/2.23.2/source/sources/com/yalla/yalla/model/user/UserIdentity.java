package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/user/UserIdentity;", "", "()V", "ROOM_ADMIN", "", "ROOM_GUEST", "ROOM_HOST", "ROOM_MEMBER", "TOPIC_MANAGER", "TOPIC_MEMBER", "TOPIC_OWNER", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserIdentity {
    public static final int $stable = 0;

    @NotNull
    public static final UserIdentity INSTANCE = new UserIdentity();
    public static final int ROOM_ADMIN = 2;
    public static final int ROOM_GUEST = 0;
    public static final int ROOM_HOST = 1;
    public static final int ROOM_MEMBER = 3;
    public static final int TOPIC_MANAGER = 3;
    public static final int TOPIC_MEMBER = 2;
    public static final int TOPIC_OWNER = 1;

    private UserIdentity() {
    }
}
